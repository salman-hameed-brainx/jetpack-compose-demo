package com.mobile.goal.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0005J#\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u0004\u0018\u00010\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u001b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00162\u0006\u0010\b\u001a\u00020\tH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u001d\u001a\u00020\u001eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006 "}, d2 = {"Lcom/mobile/goal/domain/repository/UserRepository;", "", "changePassword", "changePasswordDto", "Lcom/mobile/goal/data/remote/dto/ChangePasswordDto;", "(Lcom/mobile/goal/data/remote/dto/ChangePasswordDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "editAccount", "Lcom/mobile/goal/domain/model/Participant;", "id", "", "editAccountDto", "Lcom/mobile/goal/data/remote/dto/EditAccountDto;", "(ILcom/mobile/goal/data/remote/dto/EditAccountDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAboutMe", "Lcom/mobile/goal/data/remote/dto/AboutMeDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getDailyGoalStats", "Lcom/mobile/goal/data/remote/dto/GetGoalDto;", "page", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getUserDetail", "Lcom/mobile/goal/data/remote/dto/GetParticipantDto;", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "setGoal", "Lcom/mobile/goal/data/remote/dto/SetGoalDto;", "setGoalDto", "(Lcom/mobile/goal/data/remote/dto/SetGoalDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateAboutMe", "updateProfileDto", "Lcom/mobile/goal/data/remote/dto/UpdateProfileDto;", "(Lcom/mobile/goal/data/remote/dto/UpdateProfileDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface UserRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getAboutMe(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AboutMeDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getUserDetail(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.GetParticipantDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object updateAboutMe(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.UpdateProfileDto updateProfileDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AboutMeDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object setGoal(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.SetGoalDto setGoalDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.SetGoalDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getDailyGoalStats(@org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.GetGoalDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object editAccount(int id, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.EditAccountDto editAccountDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.Participant> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object changePassword(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.ChangePasswordDto changePasswordDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<java.lang.Object> continuation);
}