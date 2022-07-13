package com.mobile.goal.ui.workout

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.mobile.goal.common.Resource
import com.mobile.goal.domain.model.WorkoutType
import com.mobile.goal.domain.use_case.GetWorkoutTypeListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import javax.inject.Inject


sealed class WorkoutScreeUiEvent {
    data class ShowSnackBar(val message: String) : WorkoutScreeUiEvent()
}

data class WorkoutScreenState(
    val workoutList: List<WorkoutType> = emptyList(),
    val loading: Boolean = false,
)

@HiltViewModel
class WorkoutViewModel @Inject constructor(
    private val getWorkoutTypeListUseCase: GetWorkoutTypeListUseCase
) : ViewModel() {
    private val _state = MutableStateFlow(WorkoutScreenState())
    val state: StateFlow<WorkoutScreenState>
        get() = _state

    private val _dataState = MutableStateFlow(emptyList<WorkoutType>())
    val dataState: StateFlow<List<WorkoutType>>
        get() = _dataState

    private val _eventFlow = MutableSharedFlow<WorkoutScreeUiEvent>()
    val eventFlow = _eventFlow.asSharedFlow()

    init {
        getWorkoutList()
    }

    private fun getWorkoutList() {
        getWorkoutTypeListUseCase().onEach { resource ->
            when (resource) {
                is Resource.Success -> {
                    _state.emit(WorkoutScreenState(loading = false))
                    _dataState.emit(resource.data ?: emptyList())
                }
                is Resource.Error -> {
                    _state.emit(WorkoutScreenState(loading = false))
                    _eventFlow.emit(
                        WorkoutScreeUiEvent.ShowSnackBar(
                            message = resource.message
                                ?: "An unexpected error occurred"
                        )
                    )
                }
                is Resource.Loading -> {
                    _state.emit(WorkoutScreenState(loading = true))
                }
            }
        }.launchIn(viewModelScope)
    }
}