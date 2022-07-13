package com.mobile.goal.ui.challenge

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.domain.events.AppEvents
import com.mobile.goal.domain.events.AppUiEventClass
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse
import com.mobile.goal.domain.use_case.challenge.GetChallengeUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

data class ChallengesState(
    val challengeResponse: ChallengeResponse? = null,
    val competitionResponse: CompetitionResponse? = null
)

sealed class ChallengesUiEvent {
    data class ShowSnackBar(val message: String) : ChallengesUiEvent()
}

@HiltViewModel
class EventsViewModel @Inject constructor(
    private val challengeUseCase: GetChallengeUseCase,
) : ViewModel() {

    private val _state = mutableStateOf(ChallengesState())
    val state: State<ChallengesState> = _state

    private val _eventFlow = MutableSharedFlow<ChallengesUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    init {
        getCompetitions()
    }

    private fun getCompetitions() {
        challengeUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                    _state.value = _state.value.copy(challengeResponse = result.data)
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                    _state.value = _state.value.copy(challengeResponse = null)
                    _eventFlow.emit(
                        ChallengesUiEvent.ShowSnackBar(
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