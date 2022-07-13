package com.mobile.goal.ui.onboarding.complete_profile;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%J\u0006\u0010&\u001a\u00020#R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\f0\u0017\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0015R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\t0\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0015R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00110\u0013\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/mobile/goal/ui/onboarding/complete_profile/CompleteProfilelViewModel;", "Landroidx/lifecycle/ViewModel;", "updateProfileUseCase", "Lcom/mobile/goal/domain/use_case/UpdateProfileUseCase;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "(Lcom/mobile/goal/domain/use_case/UpdateProfileUseCase;Lcom/mobile/goal/data/local/data_store/SessionDataStore;)V", "_dobState", "Landroidx/compose/runtime/MutableState;", "", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/onboarding/complete_profile/CompleteProfileUiEvent;", "_firstNameState", "_genderState", "_lastNameState", "_state", "Lcom/mobile/goal/ui/onboarding/complete_profile/CompleteProfileState;", "dobState", "Landroidx/compose/runtime/State;", "getDobState", "()Landroidx/compose/runtime/State;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "firstNameState", "getFirstNameState", "genderState", "getGenderState", "lastNameState", "getLastNameState", "state", "getState", "onEvent", "", "event", "Lcom/mobile/goal/ui/onboarding/complete_profile/CompleteProfileEvent;", "updateProfile", "app_debug"})
public final class CompleteProfilelViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.UpdateProfileUseCase updateProfileUseCase = null;
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _firstNameState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> firstNameState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _lastNameState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> lastNameState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _genderState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> genderState = null;
    private final androidx.compose.runtime.MutableState<java.lang.String> _dobState = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<java.lang.String> dobState = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public CompleteProfilelViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.UpdateProfileUseCase updateProfileUseCase, @org.jetbrains.annotations.NotNull()
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
    public final androidx.compose.runtime.State<java.lang.String> getGenderState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<java.lang.String> getDobState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileUiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.onboarding.complete_profile.CompleteProfileEvent event) {
    }
    
    public final void updateProfile() {
    }
}