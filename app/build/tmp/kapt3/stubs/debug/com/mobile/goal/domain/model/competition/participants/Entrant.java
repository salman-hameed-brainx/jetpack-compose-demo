package com.mobile.goal.domain.model.competition.participants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b6\b\u0086\b\u0018\u00002\u00020\u0001B\u00af\u0001\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\f\u00a2\u0006\u0002\u0010\u0018J\u000b\u00101\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00102\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u00103\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\u0010\u00105\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00106\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u00107\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u00108\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u0010\u00109\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u000b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010<\u001a\u0004\u0018\u00010\u0007H\u00c6\u0003J\u000b\u0010=\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003J\u0010\u0010@\u001a\u0004\u0018\u00010\fH\u00c6\u0003\u00a2\u0006\u0002\u0010$J\u0010\u0010A\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u00da\u0001\u0010B\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\fH\u00c6\u0001\u00a2\u0006\u0002\u0010CJ\u0013\u0010D\u001a\u00020\u000e2\b\u0010E\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010F\u001a\u00020\fH\u00d6\u0001J\t\u0010G\u001a\u00020\u0003H\u00d6\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0018\u0010\n\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010\u001aR\u001a\u0010\u000b\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b#\u0010$R\u001a\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\b\r\u0010&R\u0018\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001aR\u0018\u0010\u0010\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010\u001cR\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001a\u0010\u0013\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b,\u0010$R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001cR\u001a\u0010\u0015\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b.\u0010$R\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001cR\u001a\u0010\u0017\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010%\u001a\u0004\b0\u0010$\u00a8\u0006H"}, d2 = {"Lcom/mobile/goal/domain/model/competition/participants/Entrant;", "", "birthday", "", "calc_value", "competition", "distance", "Lcom/mobile/goal/domain/model/competition/participants/Distance;", "first_name", "gender", "group", "id", "", "is_anonymous", "", "last_name", "number", "params", "Lcom/mobile/goal/domain/model/competition/participants/Params;", "participant", "passage", "status", "team", "team_status", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/mobile/goal/domain/model/competition/participants/Distance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Lcom/mobile/goal/domain/model/competition/participants/Params;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;)V", "getBirthday", "()Ljava/lang/String;", "getCalc_value", "()Ljava/lang/Object;", "getCompetition", "getDistance", "()Lcom/mobile/goal/domain/model/competition/participants/Distance;", "getFirst_name", "getGender", "getGroup", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLast_name", "getNumber", "getParams", "()Lcom/mobile/goal/domain/model/competition/participants/Params;", "getParticipant", "getPassage", "getStatus", "getTeam", "getTeam_status", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Lcom/mobile/goal/domain/model/competition/participants/Distance;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Object;Lcom/mobile/goal/domain/model/competition/participants/Params;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Integer;)Lcom/mobile/goal/domain/model/competition/participants/Entrant;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class Entrant {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.String birthday = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Object calc_value = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.String competition = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final com.mobile.goal.domain.model.competition.participants.Distance distance = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.String first_name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.String gender = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.String group = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Boolean is_anonymous = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.String last_name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Object number = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final com.mobile.goal.domain.model.competition.participants.Params params = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Integer participant = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Object passage = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Integer status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Object team = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Integer team_status = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobile.goal.domain.model.competition.participants.Entrant copy(@org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @org.jetbrains.annotations.Nullable()
    java.lang.Object calc_value, @org.jetbrains.annotations.Nullable()
    java.lang.String competition, @org.jetbrains.annotations.Nullable()
    com.mobile.goal.domain.model.competition.participants.Distance distance, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String group, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_anonymous, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Object number, @org.jetbrains.annotations.Nullable()
    com.mobile.goal.domain.model.competition.participants.Params params, @org.jetbrains.annotations.Nullable()
    java.lang.Integer participant, @org.jetbrains.annotations.Nullable()
    java.lang.Object passage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.Object team, @org.jetbrains.annotations.Nullable()
    java.lang.Integer team_status) {
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
    
    public Entrant(@org.jetbrains.annotations.Nullable()
    java.lang.String birthday, @org.jetbrains.annotations.Nullable()
    java.lang.Object calc_value, @org.jetbrains.annotations.Nullable()
    java.lang.String competition, @org.jetbrains.annotations.Nullable()
    com.mobile.goal.domain.model.competition.participants.Distance distance, @org.jetbrains.annotations.Nullable()
    java.lang.String first_name, @org.jetbrains.annotations.Nullable()
    java.lang.String gender, @org.jetbrains.annotations.Nullable()
    java.lang.String group, @org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_anonymous, @org.jetbrains.annotations.Nullable()
    java.lang.String last_name, @org.jetbrains.annotations.Nullable()
    java.lang.Object number, @org.jetbrains.annotations.Nullable()
    com.mobile.goal.domain.model.competition.participants.Params params, @org.jetbrains.annotations.Nullable()
    java.lang.Integer participant, @org.jetbrains.annotations.Nullable()
    java.lang.Object passage, @org.jetbrains.annotations.Nullable()
    java.lang.Integer status, @org.jetbrains.annotations.Nullable()
    java.lang.Object team, @org.jetbrains.annotations.Nullable()
    java.lang.Integer team_status) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBirthday() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getCalc_value() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompetition() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mobile.goal.domain.model.competition.participants.Distance component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mobile.goal.domain.model.competition.participants.Distance getDistance() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFirst_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGender() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGroup() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component8() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_anonymous() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLast_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component11() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNumber() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mobile.goal.domain.model.competition.participants.Params component12() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mobile.goal.domain.model.competition.participants.Params getParams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component13() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getParticipant() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component14() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPassage() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component15() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component16() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getTeam() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component17() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getTeam_status() {
        return null;
    }
}