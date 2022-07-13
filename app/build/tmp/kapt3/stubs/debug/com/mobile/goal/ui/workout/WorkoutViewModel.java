package com.mobile.goal.ui.workout;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\u000f8F\u00a2\u0006\u0006\u001a\u0004\b\u0017\u0010\u0011\u00a8\u0006\u001a"}, d2 = {"Lcom/mobile/goal/ui/workout/WorkoutViewModel;", "Landroidx/lifecycle/ViewModel;", "getWorkoutTypeListUseCase", "Lcom/mobile/goal/domain/use_case/GetWorkoutTypeListUseCase;", "(Lcom/mobile/goal/domain/use_case/GetWorkoutTypeListUseCase;)V", "_dataState", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/mobile/goal/domain/model/WorkoutType;", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/workout/WorkoutScreeUiEvent;", "_state", "Lcom/mobile/goal/ui/workout/WorkoutScreenState;", "dataState", "Lkotlinx/coroutines/flow/StateFlow;", "getDataState", "()Lkotlinx/coroutines/flow/StateFlow;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "getState", "getWorkoutList", "", "app_debug"})
public final class WorkoutViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.GetWorkoutTypeListUseCase getWorkoutTypeListUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mobile.goal.ui.workout.WorkoutScreenState> _state = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.mobile.goal.domain.model.WorkoutType>> _dataState = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.workout.WorkoutScreeUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.workout.WorkoutScreeUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public WorkoutViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetWorkoutTypeListUseCase getWorkoutTypeListUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.mobile.goal.ui.workout.WorkoutScreenState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<java.util.List<com.mobile.goal.domain.model.WorkoutType>> getDataState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.workout.WorkoutScreeUiEvent> getEventFlow() {
        return null;
    }
    
    private final void getWorkoutList() {
    }
}