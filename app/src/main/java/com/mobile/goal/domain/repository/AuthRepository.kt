package com.mobile.goal.domain.repository

import com.mobile.goal.data.remote.dto.*

interface AuthRepository {

    suspend fun requestToken(requestTokenDto: RequestTokenDto): AccessTokenDto

    suspend fun registerEmail(loginEmailDto: LoginEmailDto): CodeDto

    suspend fun signInEmail(loginEmailDto: LoginEmailDto): CodeDto

    suspend fun signInGoogle(signInGoogleDto: SignInGoogleDto): CodeDto

    suspend fun signInFacebook(signInFacebookDto: SignInFacebookDto): CodeDto

    suspend fun getFBSessionToken(fbSessionTokenDto: FBSessionTokenDto): AccessTokenDto
}