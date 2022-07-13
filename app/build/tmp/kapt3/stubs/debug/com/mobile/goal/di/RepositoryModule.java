package com.mobile.goal.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0011"}, d2 = {"Lcom/mobile/goal/di/RepositoryModule;", "", "()V", "provideAuthRepository", "Lcom/mobile/goal/domain/repository/AuthRepository;", "api", "Lcom/mobile/goal/data/remote/Api;", "provideChallengeRepository", "Lcom/mobile/goal/domain/repository/ChallengeRepository;", "provideCompetitionRepository", "Lcom/mobile/goal/domain/repository/CompetitionRepository;", "provideOrganizationRepository", "Lcom/mobile/goal/domain/repository/OrganizationRepository;", "provideUserRepository", "Lcom/mobile/goal/domain/repository/UserRepository;", "provideWorkoutRepository", "Lcom/mobile/goal/domain/repository/WorkoutRepository;", "app_debug"})
@dagger.Module()
public final class RepositoryModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.mobile.goal.di.RepositoryModule INSTANCE = null;
    
    private RepositoryModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobile.goal.domain.repository.AuthRepository provideAuthRepository(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobile.goal.domain.repository.UserRepository provideUserRepository(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobile.goal.domain.repository.WorkoutRepository provideWorkoutRepository(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobile.goal.domain.repository.ChallengeRepository provideChallengeRepository(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobile.goal.domain.repository.CompetitionRepository provideCompetitionRepository(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Provides()
    public final com.mobile.goal.domain.repository.OrganizationRepository provideOrganizationRepository(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.Api api) {
        return null;
    }
}