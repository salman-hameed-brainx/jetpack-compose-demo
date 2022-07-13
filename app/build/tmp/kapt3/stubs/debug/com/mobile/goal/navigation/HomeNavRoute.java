package com.mobile.goal.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\b\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019B!\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0007R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000f\u0082\u0001\b\u001a\u001b\u001c\u001d\u001e\u001f !\u00a8\u0006\""}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute;", "", "title", "", "icon", "", "route", "(Ljava/lang/String;ILjava/lang/String;)V", "getIcon", "()I", "setIcon", "(I)V", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "getTitle", "setTitle", "CompetitionEvents", "DailyGoals", "Events", "Home", "Notifications", "Profile", "Search", "Workout", "Lcom/mobile/goal/navigation/HomeNavRoute$Home;", "Lcom/mobile/goal/navigation/HomeNavRoute$Search;", "Lcom/mobile/goal/navigation/HomeNavRoute$Workout;", "Lcom/mobile/goal/navigation/HomeNavRoute$Notifications;", "Lcom/mobile/goal/navigation/HomeNavRoute$Profile;", "Lcom/mobile/goal/navigation/HomeNavRoute$DailyGoals;", "Lcom/mobile/goal/navigation/HomeNavRoute$Events;", "Lcom/mobile/goal/navigation/HomeNavRoute$CompetitionEvents;", "app_debug"})
public abstract class HomeNavRoute {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    private int icon;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String route;
    
    private HomeNavRoute(java.lang.String title, int icon, java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitle() {
        return null;
    }
    
    public final void setTitle(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getIcon() {
        return 0;
    }
    
    public final void setIcon(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRoute() {
        return null;
    }
    
    public final void setRoute(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$Home;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class Home extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.Home INSTANCE = null;
        
        private Home() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$Search;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class Search extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.Search INSTANCE = null;
        
        private Search() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$Workout;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class Workout extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.Workout INSTANCE = null;
        
        private Workout() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$Notifications;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class Notifications extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.Notifications INSTANCE = null;
        
        private Notifications() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$Profile;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class Profile extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.Profile INSTANCE = null;
        
        private Profile() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$DailyGoals;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class DailyGoals extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.DailyGoals INSTANCE = null;
        
        private DailyGoals() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$Events;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class Events extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.Events INSTANCE = null;
        
        private Events() {
            super(null, 0, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/HomeNavRoute$CompetitionEvents;", "Lcom/mobile/goal/navigation/HomeNavRoute;", "()V", "app_debug"})
    public static final class CompetitionEvents extends com.mobile.goal.navigation.HomeNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.HomeNavRoute.CompetitionEvents INSTANCE = null;
        
        private CompetitionEvents() {
            super(null, 0, null);
        }
    }
}