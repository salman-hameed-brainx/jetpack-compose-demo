package com.mobile.goal.ui.onboarding.welcome;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent;", "", "()V", "GoogleSignInFailed", "GoogleSignInSuccess", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent$GoogleSignInSuccess;", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent$GoogleSignInFailed;", "app_debug"})
public abstract class WelcomeEvent {
    
    private WelcomeEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent$GoogleSignInSuccess;", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent;", "googleSignInAccount", "Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "(Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;)V", "getGoogleSignInAccount", "()Lcom/google/android/gms/auth/api/signin/GoogleSignInAccount;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class GoogleSignInSuccess extends com.mobile.goal.ui.onboarding.welcome.WelcomeEvent {
        @org.jetbrains.annotations.NotNull()
        private final com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mobile.goal.ui.onboarding.welcome.WelcomeEvent.GoogleSignInSuccess copy(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GoogleSignInSuccess(@org.jetbrains.annotations.NotNull()
        com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.google.android.gms.auth.api.signin.GoogleSignInAccount getGoogleSignInAccount() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0011\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent$GoogleSignInFailed;", "Lcom/mobile/goal/ui/onboarding/welcome/WelcomeEvent;", "errorMessage", "", "(Ljava/lang/String;)V", "getErrorMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class GoogleSignInFailed extends com.mobile.goal.ui.onboarding.welcome.WelcomeEvent {
        @org.jetbrains.annotations.Nullable()
        private final java.lang.String errorMessage = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mobile.goal.ui.onboarding.welcome.WelcomeEvent.GoogleSignInFailed copy(@org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            return null;
        }
        
        @java.lang.Override()
        public boolean equals(@org.jetbrains.annotations.Nullable()
        java.lang.Object other) {
            return false;
        }
        
        @java.lang.Override()
        public int hashCode() {
            return 0;
        }
        
        @org.jetbrains.annotations.NotNull()
        @java.lang.Override()
        public java.lang.String toString() {
            return null;
        }
        
        public GoogleSignInFailed() {
            super();
        }
        
        public GoogleSignInFailed(@org.jetbrains.annotations.Nullable()
        java.lang.String errorMessage) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final java.lang.String getErrorMessage() {
            return null;
        }
    }
}