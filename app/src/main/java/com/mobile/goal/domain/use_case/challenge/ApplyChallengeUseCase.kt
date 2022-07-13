package com.mobile.goal.domain.use_case.challenge

import com.google.gson.JsonObject
import com.mobile.goal.common.Resource
import com.mobile.goal.common.utils.getErrorMsg
import com.mobile.goal.domain.repository.ChallengeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ApplyChallengeUseCase @Inject constructor(
    private val repository: ChallengeRepository
) {
    operator fun invoke(code: String, body: JsonObject): Flow<Resource<Map<String, Any?>?>> = flow {
        try {
            emit(Resource.Loading())
            emit(Resource.Success(repository.applyChallenge(code, body)))
        } catch (e: HttpException) {
            val error = e.response()?.errorBody()?.string()?.getErrorMsg()
            emit(Resource.Error(error ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}