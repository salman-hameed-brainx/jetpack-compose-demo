package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.FBSessionTokenDto
import com.mobile.goal.data.remote.dto.toAccessToken
import com.mobile.goal.domain.model.AccessToken
import com.mobile.goal.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetFBSessionTokenUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(fbSessionTokenDto: FBSessionTokenDto): Flow<Resource<AccessToken>> = flow {
        try {
            emit(Resource.Loading())
            val accessToken = repository.getFBSessionToken(fbSessionTokenDto).toAccessToken()
            emit(Resource.Success(accessToken))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}