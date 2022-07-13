package com.mobile.goal.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J1\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u000bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\n\u001a\u00020\u000eH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0016J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0012\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\t\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J!\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001c2\u0006\u0010\t\u001a\u00020\u0007H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/mobile/goal/data/repository/ChallengeRepositoryImpl;", "Lcom/mobile/goal/domain/repository/ChallengeRepository;", "api", "Lcom/mobile/goal/data/remote/Api;", "(Lcom/mobile/goal/data/remote/Api;)V", "applyChallenge", "", "", "", "challengeCode", "body", "Lcom/google/gson/JsonObject;", "(Ljava/lang/String;Lcom/google/gson/JsonObject;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createTeam", "Lcom/mobile/goal/data/remote/dto/CreateTeamDto;", "(Lcom/mobile/goal/data/remote/dto/CreateTeamDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeDetail", "Lcom/mobile/goal/domain/model/challenge/challengeDetail/ChallengeDetailResponse;", "code", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeList", "Lcom/mobile/goal/domain/model/challenge/challengelisting/ChallengeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getChallengeParticipants", "Lcom/mobile/goal/domain/model/challenge/participants/ChallengeParticipantsResponse;", "getChallengeQuestion", "Lcom/mobile/goal/domain/model/challenge/challengeQuestions/GetChallengeQuestionsResponse;", "getChallengeTeams", "", "Lcom/mobile/goal/domain/model/challengeTeams/ChallengeTeamModel;", "app_debug"})
public final class ChallengeRepositoryImpl implements com.mobile.goal.domain.repository.ChallengeRepository {
    private final com.mobile.goal.data.remote.Api api = null;
    
    @javax.inject.Inject()
    public ChallengeRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChallengeList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChallengeDetail(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.challengeDetail.ChallengeDetailResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChallengeQuestion(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.challengeQuestions.GetChallengeQuestionsResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChallengeTeams(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.mobile.goal.domain.model.challengeTeams.ChallengeTeamModel>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object applyChallenge(@org.jetbrains.annotations.NotNull()
    java.lang.String challengeCode, @org.jetbrains.annotations.NotNull()
    com.google.gson.JsonObject body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.Map<java.lang.String, ? extends java.lang.Object>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getChallengeParticipants(@org.jetbrains.annotations.NotNull()
    java.lang.String code, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.challenge.participants.ChallengeParticipantsResponse> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object createTeam(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.CreateTeamDto body, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CreateTeamDto> continuation) {
        return null;
    }
}