package com.mobile.goal.ui.splash;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0011\u0010\u000e\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0011\u0010\u0011\u001a\u00020\u000fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0012"}, d2 = {"Lcom/mobile/goal/ui/splash/SplashViewModel;", "Landroidx/lifecycle/ViewModel;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "settingsDataStore", "Lcom/mobile/goal/data/local/data_store/SettingsDataStore;", "(Lcom/mobile/goal/data/local/data_store/SessionDataStore;Lcom/mobile/goal/data/local/data_store/SettingsDataStore;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/splash/SplashUiEvent;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "navigateHome", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "navigateToOnboarding", "app_debug"})
public final class SplashViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    private final com.mobile.goal.data.local.data_store.SettingsDataStore settingsDataStore = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.splash.SplashUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.splash.SplashUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public SplashViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SettingsDataStore settingsDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.splash.SplashUiEvent> getEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object navigateHome(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    private final java.lang.Object navigateToOnboarding(kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}