package com.mobile.goal.ui.onboarding.register;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u00a2\u0006\u0002\u0010\nJ\u000e\u0010/\u001a\u0002002\u0006\u00101\u001a\u000202J\u0006\u00103\u001a\u000200J\u0010\u00104\u001a\u0002002\u0006\u00105\u001a\u00020\rH\u0002J\u0006\u00106\u001a\u000200J\b\u00107\u001a\u000200H\u0002R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00180\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001cR\u0017\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\"\u00a2\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0017\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001cR\u0017\u0010\'\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001cR\u0017\u0010)\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u001cR\u0017\u0010+\u001a\b\u0012\u0004\u0012\u00020\r0\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u001cR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00180\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001cR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u00068"}, d2 = {"Lcom/mobile/goal/ui/onboarding/register/RegisterEmailViewModel;", "Landroidx/lifecycle/ViewModel;", "registerEmailUseCase", "Lcom/mobile/goal/domain/use_case/RegisterEmailUseCase;", "updateProfileUseCase", "Lcom/mobile/goal/domain/use_case/UpdateProfileUseCase;", "requestTokenUseCase", "Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "(Lcom/mobile/goal/domain/use_case/RegisterEmailUseCase;Lcom/mobile/goal/domain/use_case/UpdateProfileUseCase;Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;Lcom/mobile/goal/data/local/data_store/SessionDataStore;)V", "_confirmPasswordState", "Landroidx/compose/runtime/MutableState;", "", "_dobState", "_emailState", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/onboarding/register/RegisterEmailUiEvent;", "_firstNameState", "_genderState", "_lastNameState", "_passwordState", "_state", "Lcom/mobile/goal/ui/onboarding/register/RegisterEmailState;", "confirmPasswordState", "Landroidx/compose/runtime/State;", "getConfirmPasswordState", "()Landroidx/compose/runtime/State;", "dobState", "getDobState", "emailState", "getEmailState", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "firstNameState", "getFirstNameState", "genderState", "getGenderState", "lastNameState", "getLastNameState", "passwordState", "getPasswordState", "state", "getState", "onEvent", "", "event", "Lcom/mobile/goal/ui/onboarding/register/RegisterEmailEvent;", "register", "requestToken", "code", "selectGender", "updateProfile", "app_debug"})
public final class RegisterEmailViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.RegisterEmailUseCase registerEmailUseCase = null;
    private final com.mobile.goal.domain.use_case.UpdateProfileUseCase updateProfileUseCase = null;
    private final com.mobile.goal.domain.use_case.RequestTokenUseCase requestTokenUseCase = null;
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _firstNameState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> firstNameState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _lastNameState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> lastNameState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _emailState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> emailState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _passwordState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> passwordState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _confirmPasswordState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> confirmPasswordState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _genderState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> genderState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _dobState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> dobState = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.onboarding.register.RegisterEmailState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.register.RegisterEmailState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.onboarding.register.RegisterEmailUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.register.RegisterEmailUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public RegisterEmailViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.RegisterEmailUseCase registerEmailUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.UpdateProfileUseCase updateProfileUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.RequestTokenUseCase requestTokenUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getFirstNameState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getLastNameState() {
        return null;
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
    public final androidx.compose.runtime.State<java.lang.String> getConfirmPasswordState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getGenderState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getDobState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.register.RegisterEmailState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.register.RegisterEmailUiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.onboarding.register.RegisterEmailEvent event) {
    }
    
    public final void register() {
    }
    
    private final void requestToken(java.lang.String code) {
    }
    
    private final void updateProfile() {
    }
    
    public final void selectGender() {
    }
}