package com.mobile.goal.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0006\f\r\u000e\u000f\u0010\u0011B\u0017\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0005R\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0007\"\u0004\b\u000b\u0010\t\u0082\u0001\t\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u00a8\u0006\u001b"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute;", "", "title", "", "route", "(Ljava/lang/String;Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "setRoute", "(Ljava/lang/String;)V", "getTitle", "setTitle", "CompetitionDetail", "CompetitionDetailQuestion", "CreateTeam", "Participants", "ParticipantsDetails", "PickATeam", "Lcom/mobile/goal/navigation/ChallengeNavRoute$Participants;", "Lcom/mobile/goal/navigation/ChallengeNavRoute$ParticipantsDetails;", "Lcom/mobile/goal/navigation/ChallengeNavRoute$CreateTeam;", "Lcom/mobile/goal/navigation/CompetitionNavRoute$CompetitionDetail;", "Lcom/mobile/goal/navigation/CompetitionNavRoute$CompetitionDetailQuestion;", "Lcom/mobile/goal/navigation/CompetitionNavRoute$PickATeam;", "Lcom/mobile/goal/navigation/CompetitionNavRoute$Participants;", "Lcom/mobile/goal/navigation/CompetitionNavRoute$ParticipantsDetails;", "Lcom/mobile/goal/navigation/CompetitionNavRoute$CreateTeam;", "app_debug"})
public abstract class CompetitionNavRoute {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String title;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String route;
    
    private CompetitionNavRoute(java.lang.String title, java.lang.String route) {
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
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute$CompetitionDetail;", "Lcom/mobile/goal/navigation/CompetitionNavRoute;", "()V", "app_debug"})
    public static final class CompetitionDetail extends com.mobile.goal.navigation.CompetitionNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.CompetitionNavRoute.CompetitionDetail INSTANCE = null;
        
        private CompetitionDetail() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute$CompetitionDetailQuestion;", "Lcom/mobile/goal/navigation/CompetitionNavRoute;", "()V", "app_debug"})
    public static final class CompetitionDetailQuestion extends com.mobile.goal.navigation.CompetitionNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.CompetitionNavRoute.CompetitionDetailQuestion INSTANCE = null;
        
        private CompetitionDetailQuestion() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute$PickATeam;", "Lcom/mobile/goal/navigation/CompetitionNavRoute;", "()V", "app_debug"})
    public static final class PickATeam extends com.mobile.goal.navigation.CompetitionNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.CompetitionNavRoute.PickATeam INSTANCE = null;
        
        private PickATeam() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute$Participants;", "Lcom/mobile/goal/navigation/CompetitionNavRoute;", "()V", "app_debug"})
    public static final class Participants extends com.mobile.goal.navigation.CompetitionNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.CompetitionNavRoute.Participants INSTANCE = null;
        
        private Participants() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute$ParticipantsDetails;", "Lcom/mobile/goal/navigation/CompetitionNavRoute;", "()V", "app_debug"})
    public static final class ParticipantsDetails extends com.mobile.goal.navigation.CompetitionNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.CompetitionNavRoute.ParticipantsDetails INSTANCE = null;
        
        private ParticipantsDetails() {
            super(null, null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/navigation/CompetitionNavRoute$CreateTeam;", "Lcom/mobile/goal/navigation/CompetitionNavRoute;", "()V", "app_debug"})
    public static final class CreateTeam extends com.mobile.goal.navigation.CompetitionNavRoute {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.navigation.CompetitionNavRoute.CreateTeam INSTANCE = null;
        
        private CreateTeam() {
            super(null, null);
        }
    }
}