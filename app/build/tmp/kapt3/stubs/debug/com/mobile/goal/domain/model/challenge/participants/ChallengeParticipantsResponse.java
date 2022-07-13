package com.mobile.goal.domain.model.challenge.participants;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0001\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u000bJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00c6\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003JB\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001\u00a2\u0006\u0002\u0010\u0017J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u001b\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u001c\u001a\u00020\u001dH\u00d6\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e\u00a8\u0006\u001e"}, d2 = {"Lcom/mobile/goal/domain/model/challenge/participants/ChallengeParticipantsResponse;", "", "count", "", "next", "previous", "participants", "", "Lcom/mobile/goal/domain/model/challenge/participants/EntrantsModel;", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)V", "getCount", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getNext", "()Ljava/lang/Object;", "getParticipants", "()Ljava/util/List;", "getPrevious", "component1", "component2", "component3", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Object;Ljava/lang/Object;Ljava/util/List;)Lcom/mobile/goal/domain/model/challenge/participants/ChallengeParticipantsResponse;", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class ChallengeParticipantsResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Integer count = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Object next = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.Expose()
    private final java.lang.Object previous = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.Expose()
    @com.google.gson.annotations.SerializedName(value = "results")
    private final java.util.List<com.mobile.goal.domain.model.challenge.participants.EntrantsModel> participants = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobile.goal.domain.model.challenge.participants.ChallengeParticipantsResponse copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer count, @org.jetbrains.annotations.Nullable()
    java.lang.Object next, @org.jetbrains.annotations.Nullable()
    java.lang.Object previous, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mobile.goal.domain.model.challenge.participants.EntrantsModel> participants) {
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
    
    public ChallengeParticipantsResponse() {
        super();
    }
    
    public ChallengeParticipantsResponse(@org.jetbrains.annotations.Nullable()
    java.lang.Integer count, @org.jetbrains.annotations.Nullable()
    java.lang.Object next, @org.jetbrains.annotations.Nullable()
    java.lang.Object previous, @org.jetbrains.annotations.NotNull()
    java.util.List<com.mobile.goal.domain.model.challenge.participants.EntrantsModel> participants) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getCount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getNext() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPrevious() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mobile.goal.domain.model.challenge.participants.EntrantsModel> component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.mobile.goal.domain.model.challenge.participants.EntrantsModel> getParticipants() {
        return null;
    }
}