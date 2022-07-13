package com.mobile.goal.ui.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.domain.events.AppEvents
import com.mobile.goal.domain.events.AppUiEventClass
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse
import com.mobile.goal.domain.use_case.challenge.GetChallengeUseCase
import com.mobile.goal.domain.use_case.competition.GetCompetitionUseCase
import com.mobile.goal.ui.challenge.ChallengesUiEvent
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject

sealed class HomeUiEvent {
    data class ShowSnackBar(val message: String) : HomeUiEvent()
}

data class HomeViewState(
    val challengeResponse: ChallengeResponse? = null,
    val competitionResponse: CompetitionResponse? = null,
)

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val challengeUseCase: GetChallengeUseCase,
    private val competitionUseCase: GetCompetitionUseCase,
) : ViewModel() {

    private var isChallengesLoaded = false
    private var isCompetitionsLoaded = false

    private val _state = MutableStateFlow(HomeViewState())
    val state: StateFlow<HomeViewState> = _state

    private val _eventFlow = MutableSharedFlow<ChallengesUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    init {
        getChallenge()
        getCompetitions()
    }

    private fun getChallenge() {
        challengeUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    _state.value = _state.value.copy(challengeResponse = result.data)
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                }
                is Resource.Error -> {
                    _state.value = HomeViewState(challengeResponse = null)
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

    private fun getCompetitions() {
        competitionUseCase().onEach { result ->
            when (result) {
                is Resource.Success -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                    _state.value = _state.value.copy(competitionResponse = result.data)
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                    _state.value = _state.value.copy()
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