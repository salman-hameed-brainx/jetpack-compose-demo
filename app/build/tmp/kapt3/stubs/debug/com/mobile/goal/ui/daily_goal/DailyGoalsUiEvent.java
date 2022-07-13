package com.mobile.goal.ui.daily_goal;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent;", "", "()V", "ShowGoalData", "ShowSnackBar", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent$ShowSnackBar;", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent$ShowGoalData;", "app_debug"})
public abstract class DailyGoalsUiEvent {
    
    private DailyGoalsUiEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003H\u00c6\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u00d6\u0003J\t\u0010\r\u001a\u00020\u000eH\u00d6\u0001J\t\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u00a8\u0006\u0010"}, d2 = {"Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent$ShowSnackBar;", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent;", "message", "", "(Ljava/lang/String;)V", "getMessage", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "app_debug"})
    public static final class ShowSnackBar extends com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String message = null;
        
        @org.jetbrains.annotations.NotNull()
        public final com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent.ShowSnackBar copy(@org.jetbrains.annotations.NotNull()
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b\u00a8\u0006\u000b"}, d2 = {"Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent$ShowGoalData;", "Lcom/mobile/goal/ui/daily_goal/DailyGoalsUiEvent;", "calories", "", "distance", "time", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCalories", "()Ljava/lang/String;", "getDistance", "getTime", "app_debug"})
    public static final class ShowGoalData extends com.mobile.goal.ui.daily_goal.DailyGoalsUiEvent {
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String calories = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String distance = null;
        @org.jetbrains.annotations.NotNull()
        private final java.lang.String time = null;
        
        public ShowGoalData(@org.jetbrains.annotations.NotNull()
        java.lang.String calories, @org.jetbrains.annotations.NotNull()
        java.lang.String distance, @org.jetbrains.annotations.NotNull()
        java.lang.String time) {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getCalories() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getDistance() {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.String getTime() {
            return null;
        }
    }
}