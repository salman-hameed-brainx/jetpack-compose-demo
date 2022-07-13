package com.mobile.goal.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J1\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\bJ\u001b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0006\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u001b\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u000e\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ!\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00182\u0006\u0010\u0005\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001a"}, d2 = {"Lcom/mobile/goal/domain/repository/ChallengeRepository;", "", "applyChallenge", "", "", "challengeCode", "body", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTeam", "Lcom/mobile/goal/data/remote/dto/CreateTeamDto;", "(Lcom/mobile/goal/data/remote/dto/CreateTeamDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeDetail", "Lcom/mobile/goal/domain/model/challenge/challengeDetail/ChallengeDetailResponse;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeList", "Lcom/mobile/goal/domain/model/challenge/challengelisting/ChallengeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeParticipants", "Lcom/mobile/goal/domain/model/challenge/participants/ChallengeParticipantsResponse;", "getChallengeQuestion", "Lcom/mobile/goal/domain/model/challenge/challengeQuestions/GetChallengeQuestionsResponse;", "getChallengeTeams", "", "Lcom/mobile/goal/domain/model/challengeTeams/ChallengeTeamModel;", "app_debug"})
public abstract interface ChallengeRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChallengeList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChallengeDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.challengeDetail.ChallengeDetailResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChallengeQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.challengeQuestions.GetChallengeQuestionsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChallengeTeams(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mobile.goal.domain.model.challengeTeams.ChallengeTeamModel>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object applyChallenge(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getChallengeParticipants(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.participants.ChallengeParticipantsResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object createTeam(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.CreateTeamDto body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CreateTeamDto> continuation);
}