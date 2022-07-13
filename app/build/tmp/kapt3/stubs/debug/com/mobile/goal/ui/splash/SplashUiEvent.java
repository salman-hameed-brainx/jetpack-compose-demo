package com.mobile.goal.ui.splash;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/mobile/goal/ui/splash/SplashUiEvent;", "", "()V", "NavigateToCompleteProfile", "NavigateToHome", "NavigateToOnboarding", "NavigateToWelcome", "Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToHome;", "Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToWelcome;", "Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToOnboarding;", "Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToCompleteProfile;", "app_debug"})
public abstract class SplashUiEvent {
    
    private SplashUiEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToHome;", "Lcom/mobile/goal/ui/splash/SplashUiEvent;", "()V", "app_debug"})
    public static final class NavigateToHome extends com.mobile.goal.ui.splash.SplashUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.splash.SplashUiEvent.NavigateToHome INSTANCE = null;
        
        private NavigateToHome() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToWelcome;", "Lcom/mobile/goal/ui/splash/SplashUiEvent;", "()V", "app_debug"})
    public static final class NavigateToWelcome extends com.mobile.goal.ui.splash.SplashUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.splash.SplashUiEvent.NavigateToWelcome INSTANCE = null;
        
        private NavigateToWelcome() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToOnboarding;", "Lcom/mobile/goal/ui/splash/SplashUiEvent;", "()V", "app_debug"})
    public static final class NavigateToOnboarding extends com.mobile.goal.ui.splash.SplashUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.splash.SplashUiEvent.NavigateToOnboarding INSTANCE = null;
        
        private NavigateToOnboarding() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/splash/SplashUiEvent$NavigateToCompleteProfile;", "Lcom/mobile/goal/ui/splash/SplashUiEvent;", "()V", "app_debug"})
    public static final class NavigateToCompleteProfile extends com.mobile.goal.ui.splash.SplashUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.splash.SplashUiEvent.NavigateToCompleteProfile INSTANCE = null;
        
        private NavigateToCompleteProfile() {
            super();
        }
    }
}