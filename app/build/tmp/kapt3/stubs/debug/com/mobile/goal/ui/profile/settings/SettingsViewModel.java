package com.mobile.goal.ui.profile.settings;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\u0017\u001a\u00020\u0018H\u0002J\u0011\u0010\u0019\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u0011\u0010\u001b\u001a\u00020\u0018H\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aR\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/SettingsViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "getParticipantUseCase", "Lcom/mobile/goal/domain/use_case/GetParticipantUseCase;", "getAboutMeUseCase", "Lcom/mobile/goal/domain/use_case/GetAboutMeUseCase;", "(Lcom/mobile/goal/data/local/data_store/SessionDataStore;Lcom/mobile/goal/domain/use_case/GetParticipantUseCase;Lcom/mobile/goal/domain/use_case/GetAboutMeUseCase;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent;", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/mobile/goal/ui/profile/settings/GetUserDetailState;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "getAboutMe", "", "getCurrentUserProfile", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logout", "app_debug"})
public final class SettingsViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final com.mobile.goal.domain.use_case.GetParticipantUseCase getParticipantUseCase = null;
    private final com.mobile.goal.domain.use_case.GetAboutMeUseCase getAboutMeUseCase = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.profile.settings.SettingsUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.profile.settings.SettingsUiEvent> eventFlow = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.profile.settings.GetUserDetailState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.profile.settings.GetUserDetailState> state = null;
    
    @javax.inject.Inject()
    public SettingsViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetParticipantUseCase getParticipantUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetAboutMeUseCase getAboutMeUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.profile.settings.SettingsUiEvent> getEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.profile.settings.GetUserDetailState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object logout(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCurrentUserProfile(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final void getAboutMe() {
    }
}