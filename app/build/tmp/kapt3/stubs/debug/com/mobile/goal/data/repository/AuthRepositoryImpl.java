package com.mobile.goal.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0019\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0016H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0017J\u0019\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001c"}, d2 = {"Lcom/mobile/goal/data/repository/AuthRepositoryImpl;", "Lcom/mobile/goal/domain/repository/AuthRepository;", "api", "Lcom/mobile/goal/data/remote/Api;", "(Lcom/mobile/goal/data/remote/Api;)V", "getFBSessionToken", "Lcom/mobile/goal/data/remote/dto/AccessTokenDto;", "fbSessionTokenDto", "Lcom/mobile/goal/data/remote/dto/FBSessionTokenDto;", "(Lcom/mobile/goal/data/remote/dto/FBSessionTokenDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "registerEmail", "Lcom/mobile/goal/data/remote/dto/CodeDto;", "loginEmailDto", "Lcom/mobile/goal/data/remote/dto/LoginEmailDto;", "(Lcom/mobile/goal/data/remote/dto/LoginEmailDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestToken", "requestTokenDto", "Lcom/mobile/goal/data/remote/dto/RequestTokenDto;", "(Lcom/mobile/goal/data/remote/dto/RequestTokenDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInEmail", "signInFacebook", "signInFacebookDto", "Lcom/mobile/goal/data/remote/dto/SignInFacebookDto;", "(Lcom/mobile/goal/data/remote/dto/SignInFacebookDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "signInGoogle", "signInGoogleDto", "Lcom/mobile/goal/data/remote/dto/SignInGoogleDto;", "(Lcom/mobile/goal/data/remote/dto/SignInGoogleDto;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class AuthRepositoryImpl implements com.mobile.goal.domain.repository.AuthRepository {
    private final com.mobile.goal.data.remote.Api api = null;
    
    @javax.inject.Inject()
    public AuthRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestToken(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.RequestTokenDto requestTokenDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AccessTokenDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object registerEmail(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.LoginEmailDto loginEmailDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signInEmail(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.LoginEmailDto loginEmailDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signInGoogle(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.SignInGoogleDto signInGoogleDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object signInFacebook(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.SignInFacebookDto signInFacebookDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.CodeDto> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFBSessionToken(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.FBSessionTokenDto fbSessionTokenDto, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.data.remote.dto.AccessTokenDto> continuation) {
        return null;
    }
}