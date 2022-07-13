package com.mobile.goal.ui.onboarding.intro;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0011\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/mobile/goal/ui/onboarding/intro/IntroViewModel;", "Landroidx/lifecycle/ViewModel;", "settingsDataStore", "Lcom/mobile/goal/data/local/data_store/SettingsDataStore;", "(Lcom/mobile/goal/data/local/data_store/SettingsDataStore;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/onboarding/intro/IntroUiEvent;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "completeIntro", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class IntroViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.data.local.data_store.SettingsDataStore settingsDataStore = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.onboarding.intro.IntroUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.intro.IntroUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public IntroViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SettingsDataStore settingsDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.onboarding.intro.IntroUiEvent> getEventFlow() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object completeIntro(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}