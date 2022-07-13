package com.mobile.goal.di

import android.content.Context
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.local.data_store.SettingsDataStore
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DataStoreModule {

    @Provides
    @Singleton
    fun provideSessionDataStore(@ApplicationContext appContext: Context): SessionDataStore {
        return SessionDataStore(appContext)
    }

    @Provides
    @Singleton
    fun provideSettingsDataStore(@ApplicationContext appContext: Context): SettingsDataStore {
        return SettingsDataStore(appContext)
    }
}