package com.mobile.goal.di

import android.util.Log
import com.mobile.goal.common.Constants
import com.mobile.goal.data.local.data_store.SessionDataStore
import com.mobile.goal.data.remote.AuthorizationType
import com.mobile.goal.domain.model.AccessToken
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.runBlocking
import okhttp3.*
import okhttp3.logging.HttpLoggingInterceptor
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object OkHttpClientModule {
    @Provides
    @Singleton
    fun provideOkHttpClient(sessionDataStore: SessionDataStore): OkHttpClient {
        return OkHttpClient.Builder()
            .addInterceptor(AuthorizationInterceptor(sessionDataStore))
            .addInterceptor(HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
//            .authenticator(TokenRefreshAuthenticator())
            .build()
    }
}

class AuthorizationInterceptor(private val sessionDataStore: SessionDataStore) : Interceptor {
    override fun intercept(chain: Interceptor.Chain): Response {
        val accessToken = runBlocking {
            AccessToken(
                access_token = sessionDataStore.getAccessToken() ?: "",
                expiration_date = sessionDataStore.getTokenExpirationDate() ?: 0,
                refresh_token = sessionDataStore.getRefreshToken() ?: "",
                scope = Constants.REQUEST_TOKEN_SCOPE,
                token_type = Constants.TOKEN_TYPE
            )
        }
        val newRequest = chain.request().signedRequest(accessToken)
        return chain.proceed(newRequest)
    }

    private fun Request.signedRequest(accessToken: AccessToken?) =
        when (AuthorizationType.fromRequest(this)) {
            AuthorizationType.ACCESS_TOKEN -> {
                // Get Access Token from local storage
                when (accessToken?.expiration_date ?: 0 > System.currentTimeMillis()) {
                    true -> signWithBearer(accessToken?.access_token ?: "")
                    false -> signWithBearer("")
                }
            }
            AuthorizationType.CLIENT_CREDENTIALS -> {
                // Generate Access Token from client credentials
                signWithBasic(Constants.CLIENT_TOKEN)
            }
            AuthorizationType.NONE -> this
        }
}

class TokenRefreshAuthenticator : Authenticator {
    override fun authenticate(route: Route?, response: Response): Request? = when {
        response.retryCount > 2 -> null
        else -> response.createSignedRequest()
    }

    private fun Response.createSignedRequest(): Request? = try {
        request.signWithBasic("")
    } catch (error: Throwable) {
        Log.e("OkHttpClientModule", "Failed to re-sign request: ")
        null
    }

    private val Response.retryCount: Int
        get() {
            var currentResponse = priorResponse
            var result = 0
            while (currentResponse != null) {
                result++
                currentResponse = currentResponse.priorResponse
            }
            return result
        }
}

private fun Request.signWithBasic(accessToken: String) =
    newBuilder()
        .header("Authorization", "Basic $accessToken")
        .build()

private fun Request.signWithBearer(accessToken: String) =
    newBuilder()
        .header("Authorization", "Bearer $accessToken")
        .build()