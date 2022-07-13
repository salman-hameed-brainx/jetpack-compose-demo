package com.mobile.goal.ui.profile.settings

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.dto.toParticipant
import com.mobile.goal.domain.events.AppEvents
import com.mobile.goal.domain.events.AppUiEventClass
import com.mobile.goal.domain.model.Participant
import com.mobile.goal.domain.use_case.GetAboutMeUseCase
import com.mobile.goal.domain.use_case.GetParticipantUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

sealed class SettingsUiEvent {
    object NavigateToWelcome : SettingsUiEvent()
    object NavigateToSettings : SettingsUiEvent()
    data class ShowSnackBar(val message: String) : SettingsUiEvent()
    data class GetUserDetail(val participant: Participant?) : SettingsUiEvent()
}

data class GetUserDetailState(
    val isLoading: Boolean = false,
)

@HiltViewModel
class SettingsViewModel @Inject constructor(
    private val sessionDataStore: SessionDataStore,
    private val getParticipantUseCase: GetParticipantUseCase,
    private val getAboutMeUseCase: GetAboutMeUseCase,
) : ViewModel() {

    private val _eventFlow = MutableSharedFlow<SettingsUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    private val _state = mutableStateOf(GetUserDetailState())
    val state: State<GetUserDetailState> = _state

    suspend fun logout() {
        sessionDataStore.clearSession()
        _eventFlow.emit(SettingsUiEvent.NavigateToWelcome)
    }

    suspend fun getCurrentUserProfile() {
        val participant = sessionDataStore.getUpdatedProfile()
        participant?.id?.let {
            getParticipantUseCase(it).onEach { result ->

                when (result) {
                    is Resource.Loading -> AppEvents.updateEvent(
                        AppUiEventClass.ShowProcessLoading(
                            true
                        )
                    )

                    is Resource.Error -> {
                        AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                        _eventFlow.emit(
                            SettingsUiEvent.ShowSnackBar(
                                message = result.message ?: "An unexpected error occurred"
                            )
                        )
                    }
                    is Resource.Success -> {
                        AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                        result.data?.results?.get(0)?.let { participantDto ->
                            participantDto.email = participant?.email
                            _eventFlow.emit(
                                SettingsUiEvent.GetUserDetail(participantDto.toParticipant())
                            )
                        }
                    }
                }
            }.launchIn(viewModelScope)
        } ?: getAboutMe()
    }

    private fun getAboutMe() {
        getAboutMeUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))


                    if (result.data?.participant != null) {
                        sessionDataStore.updateProfile(result.data.participant)
                        result.data.participant.apply {
                            _eventFlow.emit(
                                SettingsUiEvent.GetUserDetail(this)
                            )
                        }
                    }
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                    _eventFlow.emit(
                        SettingsUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(true))
                }
            }
        }.launchIn(viewModelScope)
    }
}