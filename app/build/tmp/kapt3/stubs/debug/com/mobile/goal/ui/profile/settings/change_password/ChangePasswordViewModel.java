package com.mobile.goal.ui.profile.settings.change_password;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u001d\u001a\u00020\u001eJ\u000e\u0010\u001f\u001a\u00020\u001e2\u0006\u0010 \u001a\u00020!R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\n0\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0012R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00070\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0012R\u0017\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/mobile/goal/ui/profile/settings/change_password/ChangePasswordViewModel;", "Landroidx/lifecycle/ViewModel;", "changePasswordUseCase", "Lcom/mobile/goal/domain/use_case/ChangePasswordUseCase;", "(Lcom/mobile/goal/domain/use_case/ChangePasswordUseCase;)V", "_confirmNewPasswordState", "Landroidx/compose/runtime/MutableState;", "", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/profile/settings/change_password/ChangePasswordUiEvent;", "_newPasswordState", "_oldPasswordState", "_state", "Lcom/mobile/goal/ui/profile/settings/change_password/ChangePasswordState;", "confirmNewPasswordState", "Landroidx/compose/runtime/State;", "getConfirmNewPasswordState", "()Landroidx/compose/runtime/State;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "newPasswordState", "getNewPasswordState", "oldPasswordState", "getOldPasswordState", "state", "getState", "changePassword", "", "onEvent", "event", "Lcom/mobile/goal/ui/profile/settings/change_password/ChangePasswordEvent;", "app_debug"})
public final class ChangePasswordViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.ChangePasswordUseCase changePasswordUseCase = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _oldPasswordState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> oldPasswordState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _newPasswordState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> newPasswordState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _confirmNewPasswordState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> confirmNewPasswordState = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.profile.settings.change_password.ChangePasswordState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.profile.settings.change_password.ChangePasswordState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.profile.settings.change_password.ChangePasswordUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.profile.settings.change_password.ChangePasswordUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public ChangePasswordViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.ChangePasswordUseCase changePasswordUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getOldPasswordState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getNewPasswordState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getConfirmNewPasswordState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.profile.settings.change_password.ChangePasswordState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.profile.settings.change_password.ChangePasswordUiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.profile.settings.change_password.ChangePasswordEvent event) {
    }
    
    public final void changePassword() {
    }
}