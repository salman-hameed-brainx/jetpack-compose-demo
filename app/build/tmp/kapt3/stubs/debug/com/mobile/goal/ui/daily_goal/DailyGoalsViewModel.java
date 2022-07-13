package com.mobile.goal.ui.daily_goal;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0010\u0010+\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bH\u0002J\u0006\u0010-\u001a\u00020.J\u000e\u0010/\u001a\u00020.2\u0006\u00100\u001a\u000201J\b\u00102\u001a\u00020.H\u0002J\u0018\u00103\u001a\u00020.2\u0006\u0010,\u001a\u00020\u000b2\u0006\u00104\u001a\u000205H\u0002J\u0010\u00106\u001a\u00020\u000b2\u0006\u0010,\u001a\u00020\u000bH\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00140\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u000b0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00140\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001aR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\t0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001a\u00a8\u00067"}, d2 = {"Lcom/mobile/goal/ui/daily_goal/DailyGoalsViewModel;", "Landroidx/lifecycle/ViewModel;", "setGoalUseCase", "Lcom/mobile/goal/domain/use_case/SetGoalUseCase;", "getGoalUseCase", "Lcom/mobile/goal/domain/use_case/GetGoalUseCase;", "(Lcom/mobile/goal/domain/use_case/SetGoalUseCase;Lcom/mobile/goal/domain/use_case/GetGoalUseCase;)V", "_caloriesEnabledState", "Landroidx/compose/runtime/MutableState;", "", "_caloriesValueState", "", "_distanceEnabledState", "_distanceValueState", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent;", "_goalsPageValueState", "", "_state", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsState;", "_timeEnabledState", "_timeValueState", "caloriesEnabledState", "Landroidx/compose/runtime/State;", "getCaloriesEnabledState", "()Landroidx/compose/runtime/State;", "caloriesValueState", "getCaloriesValueState", "distanceEnabledState", "getDistanceEnabledState", "distanceValueState", "getDistanceValueState", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "getState", "timeEnabledState", "getTimeEnabledState", "timeValueState", "getTimeValueState", "addValue", "value", "getGoalValues", "", "onEvent", "event", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsEvent;", "removeGoal", "setGoal", "goalType", "Lcom/mobile/goal/domain/enum/DailyGoalType;", "subtractValue", "app_debug"})
public final class DailyGoalsViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.SetGoalUseCase setGoalUseCase = null;
    private final com.mobile.goal.domain.use_case.GetGoalUseCase getGoalUseCase = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.daily_goal.DailyGoalsState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.daily_goal.DailyGoalsState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent> eventFlow = null;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _distanceEnabledState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.Boolean> distanceEnabledState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _distanceValueState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> distanceValueState = null;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _caloriesEnabledState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.Boolean> caloriesEnabledState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _caloriesValueState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> caloriesValueState = null;
    private final androidx.compose.runtime.MutableState<java.lang.Boolean> _timeEnabledState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.Boolean> timeEnabledState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _timeValueState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> timeValueState = null;
    private int _goalsPageValueState = 1;
    
    @javax.inject.Inject()
    public DailyGoalsViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.SetGoalUseCase setGoalUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetGoalUseCase getGoalUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.daily_goal.DailyGoalsState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent> getEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.Boolean> getDistanceEnabledState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getDistanceValueState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.Boolean> getCaloriesEnabledState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getCaloriesValueState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.Boolean> getTimeEnabledState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getTimeValueState() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.daily_goal.DailyGoalsEvent event) {
    }
    
    public final void getGoalValues() {
    }
    
    private final void removeGoal() {
    }
    
    private final java.lang.String addValue(java.lang.String value) {
        return null;
    }
    
    private final java.lang.String subtractValue(java.lang.String value) {
        return null;
    }
}