package com.mobile.goal.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\b"}, d2 = {"Lcom/mobile/goal/data/repository/WorkoutRepositoryImpl;", "Lcom/mobile/goal/domain/repository/WorkoutRepository;", "api", "Lcom/mobile/goal/data/remote/Api;", "(Lcom/mobile/goal/data/remote/Api;)V", "getWorkoutList", "Lcom/mobile/goal/domain/model/WorkoutTypeResponse;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
public final class WorkoutRepositoryImpl implements com.mobile.goal.domain.repository.WorkoutRepository {
    private final com.mobile.goal.data.remote.Api api = null;
    
    @javax.inject.Inject()
    public WorkoutRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getWorkoutList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.mobile.goal.domain.model.WorkoutTypeResponse> continuation) {
        return null;
    }
}