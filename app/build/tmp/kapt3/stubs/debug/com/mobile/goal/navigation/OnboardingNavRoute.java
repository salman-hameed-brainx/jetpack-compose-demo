package com.mobile.goal.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0007\f\r\u000e\u000f\u0010\u0011\u0012B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u0082\u0001\u0007\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute;", "", "title", "", "route", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "getTitle", "setTitle", "CompleteProfile", "ForgotPassword", "Intro", "LoginEmail", "Register", "WelcomeEmail", "WelcomeSocial", "Lcom/mobile/goal/navigation/OnboardingNavRoute$Intro;", "Lcom/mobile/goal/navigation/OnboardingNavRoute$WelcomeSocial;", "Lcom/mobile/goal/navigation/OnboardingNavRoute$WelcomeEmail;", "Lcom/mobile/goal/navigation/OnboardingNavRoute$LoginEmail;", "Lcom/mobile/goal/navigation/OnboardingNavRoute$Register;", "Lcom/mobile/goal/navigation/OnboardingNavRoute$CompleteProfile;", "Lcom/mobile/goal/navigation/OnboardingNavRoute$ForgotPassword;", "app_debug"})
public abstract class OnboardingNavRoute {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String route;
    
    private OnboardingNavRoute(java.lang.String title, java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$Intro;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class Intro extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.Intro INSTANCE = null;
        
        private Intro() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$WelcomeSocial;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class WelcomeSocial extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.WelcomeSocial INSTANCE = null;
        
        private WelcomeSocial() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$WelcomeEmail;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class WelcomeEmail extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.WelcomeEmail INSTANCE = null;
        
        private WelcomeEmail() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$LoginEmail;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class LoginEmail extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.LoginEmail INSTANCE = null;
        
        private LoginEmail() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$Register;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class Register extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.Register INSTANCE = null;
        
        private Register() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$CompleteProfile;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class CompleteProfile extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.CompleteProfile INSTANCE = null;
        
        private CompleteProfile() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/OnboardingNavRoute$ForgotPassword;", "Lcom/mobile/goal/navigation/OnboardingNavRoute;", "()V", "app_debug"})
    public static final class ForgotPassword extends com.mobile.goal.navigation.OnboardingNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.OnboardingNavRoute.ForgotPassword INSTANCE = null;
        
        private ForgotPassword() {
            super(null, null);
        }
    }
}