package com.mobile.goal.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ#\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u001b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u001e\u001a\u00020\u001dH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001fJ\u001b\u0010 \u001a\u0004\u0018\u00010\u00122\u0006\u0010!\u001a\u00020\"H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010#R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006$"}, d2 = {"Lcom/mobile/goal/data/repository/UserRepositoryImpl;", "Lcom/mobile/goal/domain/repository/UserRepository;", "api", "Lcom/mobile/goal/data/remote/Api;", "(Lcom/mobile/goal/data/remote/Api;)V", "changePassword", "", "changePasswordDto", "Lcom/mobile/goal/data/remote/dto/ChangePasswordDto;", "(Lcom/mobile/goal/data/remote/dto/ChangePasswordDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editAccount", "Lcom/mobile/goal/domain/model/Participant;", "id", "", "editAccountDto", "Lcom/mobile/goal/data/remote/dto/EditAccountDto;", "(ILcom/mobile/goal/data/remote/dto/EditAccountDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAboutMe", "Lcom/mobile/goal/data/remote/dto/AboutMeDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDailyGoalStats", "Lcom/mobile/goal/data/remote/dto/GetGoalDto;", "page", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDetail", "Lcom/mobile/goal/data/remote/dto/GetParticipantDto;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGoal", "Lcom/mobile/goal/data/remote/dto/SetGoalDto;", "setGoalDto", "(Lcom/mobile/goal/data/remote/dto/SetGoalDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAboutMe", "updateProfileDto", "Lcom/mobile/goal/data/remote/dto/UpdateProfileDto;", "(Lcom/mobile/goal/data/remote/dto/UpdateProfileDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class UserRepositoryImpl implements com.mobile.goal.domain.repository.UserRepository {
    private final com.mobile.goal.data.remote.Api api = null;
    
    @javax.inject.Inject()
    public UserRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAboutMe(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AboutMeDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object updateAboutMe(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.UpdateProfileDto updateProfileDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AboutMeDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object setGoal(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.SetGoalDto setGoalDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.SetGoalDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDailyGoalStats(@org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.GetGoalDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object editAccount(int id, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.EditAccountDto editAccountDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.Participant> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object changePassword(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.ChangePasswordDto changePasswordDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getUserDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.GetParticipantDto> continuation) {
        return null;
    }
}