package com.mobile.goal.domain.use_case.challenge

import com.mobile.goal.common.Resource
import com.mobile.goal.domain.model.challenge.challengeDetail.ChallengeDetailResponse
import com.mobile.goal.domain.repository.ChallengeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetChallengeDetailUseCase @Inject constructor(
    private val repository: ChallengeRepository
) {
    operator fun invoke(code: String): Flow<Resource<ChallengeDetailResponse?>> = flow {
        try {
            emit(Resource.Loading())
            emit(Resource.Success(repository.getChallengeDetail(code)))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}