package com.mobile.goal.data.local.data_store

import android.content.Context
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.longPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import com.mobile.goal.common.AppUtils
import com.mobile.goal.data.local.data_store.SessionPreferencesKeys.ACCESS_TOKEN
import com.mobile.goal.data.local.data_store.SessionPreferencesKeys.IS_PROFILE_COMPLETED
import com.mobile.goal.data.local.data_store.SessionPreferencesKeys.PROFILE
import com.mobile.goal.data.local.data_store.SessionPreferencesKeys.REFRESH_TOKEN
import com.mobile.goal.data.local.data_store.SessionPreferencesKeys.TOKEN_EXPIRATION_DATE
import com.mobile.goal.domain.model.AccessToken
import com.mobile.goal.domain.model.Participant
import com.mobile.goal.domain.model.getToJsonObject
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.first
import javax.inject.Inject

private val Context.dataStore by preferencesDataStore("session")

private object SessionPreferencesKeys {
    val ACCESS_TOKEN = stringPreferencesKey("access_token")
    val TOKEN_EXPIRATION_DATE = longPreferencesKey("token_expiration_date")
    val REFRESH_TOKEN = stringPreferencesKey("refresh_token")
    val IS_PROFILE_COMPLETED = booleanPreferencesKey("is_profile_completed")
    val PROFILE = stringPreferencesKey("current_user_profile")
}

class SessionDataStore @Inject constructor(@ApplicationContext appContext: Context) {
    private val sessionDataStore = appContext.dataStore

    suspend fun updateAccessToken(token: AccessToken) {
        sessionDataStore.edit { session ->
            session[ACCESS_TOKEN] = token.access_token.toString()
            session[TOKEN_EXPIRATION_DATE] = token.expiration_date ?: 0
            session[REFRESH_TOKEN] = token.refresh_token.toString()
        }
    }

    suspend fun updateIsProfileCompleted(isCompleted: Boolean) {
        sessionDataStore.edit { session ->
            session[IS_PROFILE_COMPLETED] = isCompleted
        }
    }

    suspend fun getAccessToken(): String? {
        val preferences = sessionDataStore.data.first()
        return preferences[ACCESS_TOKEN]
    }

    suspend fun getTokenExpirationDate(): Long? {
        val preferences = sessionDataStore.data.first()
        return preferences[TOKEN_EXPIRATION_DATE]
    }

    suspend fun getRefreshToken(): String? {
        val preferences = sessionDataStore.data.first()
        return preferences[REFRESH_TOKEN]
    }

    suspend fun isProfileCompleted(): Boolean? {
        val preferences = sessionDataStore.data.first()
        return preferences[IS_PROFILE_COMPLETED]
    }


    suspend fun updateProfile(participant: Participant) {
        sessionDataStore.edit { session ->
            session[PROFILE] = participant.getToJsonObject()
        }
    }

    suspend fun getUpdatedProfile(): Participant? {
        val preferences = sessionDataStore.data.first()
        val jsonObject = preferences[PROFILE]
        return AppUtils.getObjectFromJson(jsonObject, Participant::class.java) as? Participant?
    }

    suspend fun clearSession() {
        sessionDataStore.edit { session ->
            session[ACCESS_TOKEN] = ""
            session[TOKEN_EXPIRATION_DATE] = 0
            session[REFRESH_TOKEN] = ""
            session[PROFILE] = ""
        }
    }
}