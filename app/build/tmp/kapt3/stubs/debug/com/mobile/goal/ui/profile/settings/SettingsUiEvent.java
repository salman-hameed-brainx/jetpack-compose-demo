package com.mobile.goal.ui.profile.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0003\u0004\u0005\u0006B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0004\u0007\b\t\n\u00a8\u0006\u000b"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent;", "", "()V", "GetUserDetail", "NavigateToSettings", "NavigateToWelcome", "ShowSnackBar", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$NavigateToWelcome;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$NavigateToSettings;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$ShowSnackBar;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$GetUserDetail;", "app_debug"})
public abstract class SettingsUiEvent {
    
    private SettingsUiEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$NavigateToWelcome;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent;", "()V", "app_debug"})
    public static final class NavigateToWelcome extends com.mobile.goal.ui.profile.settings.SettingsUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.profile.settings.SettingsUiEvent.NavigateToWelcome INSTANCE = null;
        
        private NavigateToWelcome() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$NavigateToSettings;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent;", "()V", "app_debug"})
    public static final class NavigateToSettings extends com.mobile.goal.ui.profile.settings.SettingsUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.profile.settings.SettingsUiEvent.NavigateToSettings INSTANCE = null;
        
        private NavigateToSettings() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$ShowSnackBar;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ShowSnackBar extends com.mobile.goal.ui.profile.settings.SettingsUiEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mobile.goal.ui.profile.settings.SettingsUiEvent.ShowSnackBar copy(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
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
        
        public ShowSnackBar(@org.jetbrains.annotations.NotNull()
        java.lang.String message) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String component1() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getMessage() {
            return null;
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u000b\u0010\u0007\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0015\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u00d6\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0011"}, d2 = {"Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent$GetUserDetail;", "Lcom/mobile/goal/ui/profile/settings/SettingsUiEvent;", "participant", "Lcom/mobile/goal/domain/model/Participant;", "(Lcom/mobile/goal/domain/model/Participant;)V", "getParticipant", "()Lcom/mobile/goal/domain/model/Participant;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "app_debug"})
    public static final class GetUserDetail extends com.mobile.goal.ui.profile.settings.SettingsUiEvent {
        @org.jetbrains.annotations.Nullable()
        private final com.mobile.goal.domain.model.Participant participant = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mobile.goal.ui.profile.settings.SettingsUiEvent.GetUserDetail copy(@org.jetbrains.annotations.Nullable()
        com.mobile.goal.domain.model.Participant participant) {
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
        
        public GetUserDetail(@org.jetbrains.annotations.Nullable()
        com.mobile.goal.domain.model.Participant participant) {
            super();
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mobile.goal.domain.model.Participant component1() {
            return null;
        }
        
        @org.jetbrains.annotations.Nullable()
        public final com.mobile.goal.domain.model.Participant getParticipant() {
            return null;
        }
    }
}