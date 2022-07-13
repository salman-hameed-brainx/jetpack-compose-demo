package com.mobile.goal.data.local.data_store

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.preferencesDataStore
import com.mobile.goal.data.local.data_store.SettingsPreferencesKeys.INTRO_COMPLETED
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.first
import javax.inject.Inject

private val Context.dataStore by preferencesDataStore("settings")

private object SettingsPreferencesKeys {
    val INTRO_COMPLETED = booleanPreferencesKey("intro_completed")
}

class SettingsDataStore @Inject constructor(@ApplicationContext appContext: Context) {
    private val sessionDataStore = appContext.dataStore

    suspend fun updateIsIntroCompleted(isCompleted: Boolean) {
        sessionDataStore.edit { session ->
            session[INTRO_COMPLETED] = isCompleted
        }
    }

    suspend fun isIntroCompleted(): Boolean? {
        val preferences = sessionDataStore.data.first()
        return preferences[INTRO_COMPLETED]
    }
}