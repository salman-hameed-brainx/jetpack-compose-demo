package com.mobile.goal.ui.onboarding.welcome;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0082\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B7\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u00a2\u0006\u0002\u0010\u000eJ \u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 H\u0002J\b\u0010#\u001a\u00020\u001eH\u0002J\u0018\u0010$\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020 2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u001e2\u0006\u0010)\u001a\u00020*H\u0002J\u0016\u0010+\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020 2\u0006\u0010,\u001a\u00020-J\u000e\u0010.\u001a\u00020\u001e2\u0006\u0010/\u001a\u000200J\u0010\u00101\u001a\u00020\u001e2\u0006\u00102\u001a\u00020 H\u0002J\u0012\u00103\u001a\u00020\u001e2\b\u00104\u001a\u0004\u0018\u00010 H\u0002R\u0014\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00110\u0016\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00140\u001a\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c\u00a8\u00065"}, d2 = {"Lcom/mobile/goal/ui/onboarding/welcome/WelcomeViewModel;", "Landroidx/lifecycle/ViewModel;", "signInGoogleUseCase", "Lcom/mobile/goal/domain/use_case/SignInGoogleUseCase;", "getFBSessionTokenUseCase", "Lcom/mobile/goal/domain/use_case/GetFBSessionTokenUseCase;", "signInFacebookUseCase", "Lcom/mobile/goal/domain/use_case/SignInFacebookUseCase;", "requestTokenUseCase", "Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;", "getAboutMeUseCase", "Lcom/mobile/goal/domain/use_case/GetAboutMeUseCase;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "(Lcom/mobile/goal/domain/use_case/SignInGoogleUseCase;Lcom/mobile/goal/domain/use_case/GetFBSessionTokenUseCase;Lcom/mobile/goal/domain/use_case/SignInFacebookUseCase;Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;Lcom/mobile/goal/domain/use_case/GetAboutMeUseCase;Lcom/mobile/goal/data/local/data_store/SessionDataStore;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeUiEvent;", "_state", "Landroidx/compose/runtime/MutableState;", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeState;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "state", "Landroidx/compose/runtime/State;", "getState", "()Landroidx/compose/runtime/State;", "facebookSignIn", "", "fbSessionToken", "", "email", "fullName", "getAboutMe", "getFBSessionInfo", "facebookAppId", "accessToken", "Lcom/facebook/AccessToken;", "googleSignIn", "googleSignInAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "initFBSignIn", "activityResultRegistryOwner", "Landroidx/activity/result/ActivityResultRegistryOwner;", "onEvent", "event", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent;", "requestToken", "code", "showErrorSnack", "errorMessage", "app_debug"})
public final class WelcomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.SignInGoogleUseCase signInGoogleUseCase = null;
    private final com.mobile.goal.domain.use_case.GetFBSessionTokenUseCase getFBSessionTokenUseCase = null;
    private final com.mobile.goal.domain.use_case.SignInFacebookUseCase signInFacebookUseCase = null;
    private final com.mobile.goal.domain.use_case.RequestTokenUseCase requestTokenUseCase = null;
    private final com.mobile.goal.domain.use_case.GetAboutMeUseCase getAboutMeUseCase = null;
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final androidx.compose.runtime.MutableState<com.mobile.goal.ui.onboarding.welcome.WelcomeState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.welcome.WelcomeState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.onboarding.welcome.WelcomeUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.welcome.WelcomeUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public WelcomeViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.SignInGoogleUseCase signInGoogleUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetFBSessionTokenUseCase getFBSessionTokenUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.SignInFacebookUseCase signInFacebookUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.RequestTokenUseCase requestTokenUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.GetAboutMeUseCase getAboutMeUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.compose.runtime.State<com.mobile.goal.ui.onboarding.welcome.WelcomeState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.welcome.WelcomeUiEvent> getEventFlow() {
        return null;
    }
    
    public final void onEvent(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.ui.onboarding.welcome.WelcomeEvent event) {
    }
    
    public final void initFBSignIn(@org.jetbrains.annotations.NotNull()
    java.lang.String facebookAppId, @org.jetbrains.annotations.NotNull()
    androidx.activity.result.ActivityResultRegistryOwner activityResultRegistryOwner) {
    }
    
    private final void googleSignIn(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
    }
    
    private final void getFBSessionInfo(java.lang.String facebookAppId, com.facebook.AccessToken accessToken) {
    }
    
    private final void facebookSignIn(java.lang.String fbSessionToken, java.lang.String email, java.lang.String fullName) {
    }
    
    private final void requestToken(java.lang.String code) {
    }
    
    private final void getAboutMe() {
    }
    
    private final void showErrorSnack(java.lang.String errorMessage) {
    }
}