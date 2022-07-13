package com.mobile.goal.domain.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\u00032\u0006\u0010\r\u001a\u00020\u000eH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000fJ\u0019\u0010\u0010\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0014J\u0019\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\u0017H\u00a6@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0019"}, d2 = {"Lcom/mobile/goal/domain/repository/AuthRepository;", "", "getFBSessionToken", "Lcom/mobile/goal/data/remote/dto/AccessTokenDto;", "fbSessionTokenDto", "Lcom/mobile/goal/data/remote/dto/FBSessionTokenDto;", "(Lcom/mobile/goal/data/remote/dto/FBSessionTokenDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerEmail", "Lcom/mobile/goal/data/remote/dto/CodeDto;", "loginEmailDto", "Lcom/mobile/goal/data/remote/dto/LoginEmailDto;", "(Lcom/mobile/goal/data/remote/dto/LoginEmailDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestToken", "requestTokenDto", "Lcom/mobile/goal/data/remote/dto/RequestTokenDto;", "(Lcom/mobile/goal/data/remote/dto/RequestTokenDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInEmail", "signInFacebook", "signInFacebookDto", "Lcom/mobile/goal/data/remote/dto/SignInFacebookDto;", "(Lcom/mobile/goal/data/remote/dto/SignInFacebookDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInGoogle", "signInGoogleDto", "Lcom/mobile/goal/data/remote/dto/SignInGoogleDto;", "(Lcom/mobile/goal/data/remote/dto/SignInGoogleDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public abstract interface AuthRepository {
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object requestToken(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.RequestTokenDto requestTokenDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AccessTokenDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object registerEmail(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.LoginEmailDto loginEmailDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signInEmail(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.LoginEmailDto loginEmailDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signInGoogle(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.SignInGoogleDto signInGoogleDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object signInFacebook(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.SignInFacebookDto signInFacebookDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation);
    
    @org.jetbrains.annotations.Nullable()
    public abstract java.lang.Object getFBSessionToken(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.FBSessionTokenDto fbSessionTokenDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AccessTokenDto> continuation);
}