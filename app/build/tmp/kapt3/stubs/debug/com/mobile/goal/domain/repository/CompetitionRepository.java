package com.mobile.goal.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J#\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00020\u0016H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ!\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u000e2\u0006\u0010\u001c\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001d"}, d2 = {"Lcom/mobile/goal/domain/repository/CompetitionRepository;", "", "applyCompetition", "", "", "challengeCode", "body", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompetitionDetail", "Lcom/mobile/goal/domain/model/competition/competitionDetail/CompetitionDetailResponse;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompetitionDistances", "", "Lcom/mobile/goal/domain/model/competition/distance/DistanceModel;", "getCompetitionList", "Lcom/mobile/goal/domain/model/competition/competitionlisting/CompetitionResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompetitionParticipants", "Lcom/mobile/goal/domain/model/competition/participants/CompetitionParticipantsResponse;", "distanceId", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getCompetitionQuestion", "Lcom/mobile/goal/domain/model/competition/competitionQuestions/GetCompetitionQuestionsResponse;", "getCompetitionTeams", "Lcom/mobile/goal/domain/model/competition/competitionTeam/CompetitionTeamModel;", "competitionTeams", "app_debug"})
public abstract interface CompetitionRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompetitionList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompetitionDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.competition.competitionDetail.CompetitionDetailResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompetitionQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.competition.competitionQuestions.GetCompetitionQuestionsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompetitionTeams(@org.jetbrains.annotations.NotNull()
    java.lang.String competitionTeams, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mobile.goal.domain.model.competition.competitionTeam.CompetitionTeamModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object applyCompetition(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompetitionDistances(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mobile.goal.domain.model.competition.distance.DistanceModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getCompetitionParticipants(@org.jetbrains.annotations.NotNull()
    java.lang.String code, int distanceId, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.competition.participants.CompetitionParticipantsResponse> continuation);
}