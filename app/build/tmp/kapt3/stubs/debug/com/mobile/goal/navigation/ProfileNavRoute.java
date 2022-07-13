package com.mobile.goal.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u0082\u0001\u0006\u0012\u0013\u0014\u0015\u0016\u0017\u00a8\u0006\u0018"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute;", "", "title", "", "route", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "getTitle", "setTitle", "ChangePassword", "DailyGoals", "EditAccount", "PreviousActivities", "Settings", "Teams", "Lcom/mobile/goal/navigation/ProfileNavRoute$ChangePassword;", "Lcom/mobile/goal/navigation/ProfileNavRoute$EditAccount;", "Lcom/mobile/goal/navigation/ProfileNavRoute$DailyGoals;", "Lcom/mobile/goal/navigation/ProfileNavRoute$PreviousActivities;", "Lcom/mobile/goal/navigation/ProfileNavRoute$Settings;", "Lcom/mobile/goal/navigation/ProfileNavRoute$Teams;", "app_debug"})
public abstract class ProfileNavRoute {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String route;
    
    private ProfileNavRoute(java.lang.String title, java.lang.String route) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute$ChangePassword;", "Lcom/mobile/goal/navigation/ProfileNavRoute;", "()V", "app_debug"})
    public static final class ChangePassword extends com.mobile.goal.navigation.ProfileNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.ProfileNavRoute.ChangePassword INSTANCE = null;
        
        private ChangePassword() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute$EditAccount;", "Lcom/mobile/goal/navigation/ProfileNavRoute;", "()V", "app_debug"})
    public static final class EditAccount extends com.mobile.goal.navigation.ProfileNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.ProfileNavRoute.EditAccount INSTANCE = null;
        
        private EditAccount() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute$DailyGoals;", "Lcom/mobile/goal/navigation/ProfileNavRoute;", "()V", "app_debug"})
    public static final class DailyGoals extends com.mobile.goal.navigation.ProfileNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.ProfileNavRoute.DailyGoals INSTANCE = null;
        
        private DailyGoals() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute$PreviousActivities;", "Lcom/mobile/goal/navigation/ProfileNavRoute;", "()V", "app_debug"})
    public static final class PreviousActivities extends com.mobile.goal.navigation.ProfileNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.ProfileNavRoute.PreviousActivities INSTANCE = null;
        
        private PreviousActivities() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute$Settings;", "Lcom/mobile/goal/navigation/ProfileNavRoute;", "()V", "app_debug"})
    public static final class Settings extends com.mobile.goal.navigation.ProfileNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.ProfileNavRoute.Settings INSTANCE = null;
        
        private Settings() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/ProfileNavRoute$Teams;", "Lcom/mobile/goal/navigation/ProfileNavRoute;", "()V", "app_debug"})
    public static final class Teams extends com.mobile.goal.navigation.ProfileNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.ProfileNavRoute.Teams INSTANCE = null;
        
        private Teams() {
            super(null, null);
        }
    }
}