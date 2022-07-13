package com.mobile.goal.data.repository

import com.mobile.goal.data.remote.Api
import com.mobile.goal.data.remote.dto.*
import com.mobile.goal.domain.repository.AuthRepository
import javax.inject.Inject

class AuthRepositoryImpl @Inject constructor(
    private val api: Api
) : AuthRepository {

    override suspend fun requestToken(requestTokenDto: RequestTokenDto): AccessTokenDto {
        return api.requestToken(requestTokenDto.toMap())
    }

    override suspend fun registerEmail(loginEmailDto: LoginEmailDto): CodeDto {
        return api.registerEmail(loginEmailDto.toMap())
    }

    override suspend fun signInEmail(loginEmailDto: LoginEmailDto): CodeDto {
        return api.signInEmail(loginEmailDto.toMap())
    }

    override suspend fun signInGoogle(signInGoogleDto: SignInGoogleDto): CodeDto {
        return api.signInGoogle(signInGoogleDto.toMap())
    }

    override suspend fun signInFacebook(signInFacebookDto: SignInFacebookDto): CodeDto {
        return api.signInFacebook(signInFacebookDto.toMap())
    }

    override suspend fun getFBSessionToken(fbSessionTokenDto: FBSessionTokenDto): AccessTokenDto {
        return api.getFBSessionToken(
            grant_type = fbSessionTokenDto.grant_type,
            client_id = fbSessionTokenDto.client_id,
            fb_exchange_token = fbSessionTokenDto.fb_exchange_token
        )
    }
}