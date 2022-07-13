package com.mobile.goal.di

import com.mobile.goal.data.remote.Api
import com.mobile.goal.data.repository.*
import com.mobile.goal.domain.repository.*
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    @Singleton
    fun provideAuthRepository(api: Api): AuthRepository {
        return AuthRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideUserRepository(api: Api): UserRepository {
        return UserRepositoryImpl(api)
    }
    
    @Provides
    @Singleton
    fun provideWorkoutRepository(api: Api): WorkoutRepository {
        return WorkoutRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideChallengeRepository(api: Api): ChallengeRepository {
        return ChallengeRepositoryImpl(api)
    }

    @Provides
    @Singleton
    fun provideCompetitionRepository(api: Api): CompetitionRepository {
        return CompetitionRepositoryImp(api)
    }

    @Provides
    @Singleton
    fun provideOrganizationRepository(api: Api): OrganizationRepository {
        return OrganizationRepositoryImp(api)
    }
}