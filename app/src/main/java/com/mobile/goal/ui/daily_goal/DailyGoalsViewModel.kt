package com.mobile.goal.ui.daily_goal

import androidx.compose.runtime.State
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.SetGoalDto
import com.mobile.goal.domain.enum.DailyGoalType
import com.mobile.goal.domain.events.AppEvents
import com.mobile.goal.domain.events.AppUiEventClass
import com.mobile.goal.domain.use_case.GetGoalUseCase
import com.mobile.goal.domain.use_case.SetGoalUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.flow.launchIn
import kotlinx.coroutines.flow.onEach
import javax.inject.Inject

data class DailyGoalsState(
    val isLoading: Boolean = false,
)

sealed class DailyGoalsUiEvent {
    data class ShowSnackBar(val message: String) : DailyGoalsUiEvent()
    class ShowGoalData(val calories: String, val distance: String, val time: String) :
        DailyGoalsUiEvent()
}


@HiltViewModel
class DailyGoalsViewModel @Inject constructor(
    private val setGoalUseCase: SetGoalUseCase,
    private val getGoalUseCase: GetGoalUseCase
) : ViewModel() {

    private val _state = mutableStateOf(DailyGoalsState())
    val state: State<DailyGoalsState> = _state

    private val _eventFlow = MutableSharedFlow<DailyGoalsUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    private val _distanceEnabledState = mutableStateOf(false)
    val distanceEnabledState: State<Boolean> = _distanceEnabledState

    private val _distanceValueState = mutableStateOf("")
    val distanceValueState: State<String> = _distanceValueState

    private val _caloriesEnabledState = mutableStateOf(false)
    val caloriesEnabledState: State<Boolean> = _caloriesEnabledState

    private val _caloriesValueState = mutableStateOf("")
    val caloriesValueState: State<String> = _caloriesValueState

    private val _timeEnabledState = mutableStateOf(false)
    val timeEnabledState: State<Boolean> = _timeEnabledState

    private val _timeValueState = mutableStateOf("")
    val timeValueState: State<String> = _timeValueState


    private var _goalsPageValueState = 1

    fun onEvent(event: DailyGoalsEvent) {
        when (event) {
            is DailyGoalsEvent.EnableDistance -> {
                if (distanceValueState.value.isEmpty()) {
                    return
                }
                _distanceEnabledState.value = event.value
                if (event.value) {
                    setGoal(distanceValueState.value, DailyGoalType.DISTANCE)
                } else {
                    removeGoal()
                }
            }
            is DailyGoalsEvent.EnteredDistance -> _distanceValueState.value = event.value
            is DailyGoalsEvent.AddDistance -> _distanceValueState.value = addValue(event.value)
            is DailyGoalsEvent.SubtractDistance -> _distanceValueState.value =
                subtractValue(event.value)

            is DailyGoalsEvent.EnableCalories -> {
                if (caloriesValueState.value.isEmpty()) {
                    return
                }

                _caloriesEnabledState.value = event.value
                if (event.value) {
                    setGoal(caloriesValueState.value, DailyGoalType.CALORIES)
                } else {
                    removeGoal()
                }
            }
            is DailyGoalsEvent.EnteredCalories -> _caloriesValueState.value = event.value
            is DailyGoalsEvent.AddCalories -> _caloriesValueState.value = addValue(event.value)
            is DailyGoalsEvent.SubtractCalories -> _caloriesValueState.value =
                subtractValue(event.value)

            is DailyGoalsEvent.EnableTime -> {
                if (timeValueState.value.isEmpty()) {
                    return
                }

                _timeEnabledState.value = event.value
                if (event.value) {
                    setGoal(timeValueState.value, DailyGoalType.TIME)
                } else {
                    removeGoal()
                }
            }
            is DailyGoalsEvent.EnteredTime -> _timeValueState.value = event.value
            is DailyGoalsEvent.AddTime -> _timeValueState.value = addValue(event.value)
            is DailyGoalsEvent.SubtractTime -> _timeValueState.value = subtractValue(event.value)
        }
    }

    fun getGoalValues() {
        getGoalUseCase(_goalsPageValueState).onEach { result ->
            when (result) {
                is Resource.Loading -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(true))
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                    _eventFlow.emit(
                        DailyGoalsUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Success -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                    _eventFlow.emit(
                        DailyGoalsUiEvent.ShowGoalData(
                            calories = "0.50",
                            distance = "0.60",
                            time = "0.70"
                        )
                    )
                    /*     result?.data?.results?.forEach {
                             when (it.kind) {
                                 DailyGoalType.CALORIES.kind -> {
                                     _caloriesValueState.value = it.id.toString()
                                 }
                                 DailyGoalType.DISTANCE.kind -> {
                                     _distanceValueState.value = it.id.toString()
                                 }
                                 DailyGoalType.TIME.kind -> {
                                     _timeValueState.value = it.id.toString()
                                 }
                             }
                         }*/
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun setGoal(value: String, goalType: DailyGoalType) {
        setGoalUseCase(
            SetGoalDto(
                kind = goalType.kind,
                amount = value.toInt()
            )
        ).onEach { result ->
            when (result) {
                is Resource.Success -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                }
                is Resource.Error -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))

                    _eventFlow.emit(
                        DailyGoalsUiEvent.ShowSnackBar(
                            message = result.message ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    AppEvents.updateEvent(AppUiEventClass.ShowProcessLoading(false))
                }
            }
        }.launchIn(viewModelScope)
    }

    private fun removeGoal() {

    }

    private fun addValue(value: String): String {
        if (value.isEmpty()) {
            return ""
        }

        return (value.toInt() + 1).toString()
    }

    private fun subtractValue(value: String): String {
        if (value.isEmpty()) {
            return ""
        }

        if (value.toInt() == 0) {
            return "0"
        }

        return (value.toInt() - 1).toString()
    }
}