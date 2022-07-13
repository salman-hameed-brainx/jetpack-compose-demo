package com.mobile.goal.ui.onboarding.login_email;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\b\u0010 \u001a\u00020!H\u0002J\u0006\u0010\"\u001a\u00020!J\u000e\u0010#\u001a\u00020!2\u0006\u0010$\u001a\u00020%J\u0010\u0010&\u001a\u00020!2\u0006\u0010\'\u001a\u00020\rH\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00100\u0019\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00130\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0017\u00a8\u0006("}, d2 = {"Lcom/mobile/goal/ui/onboarding/login_email/LoginEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "loginEmailUseCase", "Lcom/mobile/goal/domain/use_case/LoginEmailUseCase;", "requestTokenUseCase", "Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;", "getAboutMeUseCase", "Lcom/mobile/goal/domain/use_case/GetAboutMeUseCase;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "(Lcom/mobile/goal/domain/use_case/LoginEmailUseCase;Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;Lcom/mobile/goal/domain/use_case/GetAboutMeUseCase;Lcom/mobile/goal/data/local/data_store/SessionDataStore;)V", "_emailState", "Landroidx/compose/runtime/MutableState;", "", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/onboarding/login_email/LoginEmailUiEvent;", "_passwordState", "_state", "Lcom/mobile/goal/ui/onboarding/login_email/LoginEmailState;", "emailState", "Landroidx/compose/runtime/State;", "getEmailState", "()Landroidx/compose/runtime/State;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "passwordState", "getPasswordState", "state", "getState", "getAboutMe", "", "login", "onEvent", "event", "Lcom/mobile/goal/ui/onboarding/login_email/LoginEmailEvent;", "requestToken", "code", "app_debug"})
public final class LoginEmailViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.LoginEmailUseCase loginEmailUseCase = null;
    private final com.mobile.goal.domain.use_case.RequestTokenUseCase requestTokenUseCase = null;
    private final com.mobile.goal.domain.use_case.GetAboutMeUseCase getAboutMeUseCase = null;
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _emailState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> emailState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _passwordState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> passwordState = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.onboarding.login_email.LoginEmailState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.login_email.LoginEmailState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.onboarding.login_email.LoginEmailUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.login_email.LoginEmailUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public LoginEmailViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.LoginEmailUseCase loginEmailUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.RequestTokenUseCase requestTokenUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetAboutMeUseCase getAboutMeUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getEmailState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getPasswordState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.login_email.LoginEmailState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.login_email.LoginEmailUiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.onboarding.login_email.LoginEmailEvent event) {
    }
    
    public final void login() {
    }
    
    private final void requestToken(java.lang.String code) {
    }
    
    private final void getAboutMe() {
    }
}