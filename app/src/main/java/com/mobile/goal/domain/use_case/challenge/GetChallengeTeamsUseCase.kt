package com.mobile.goal.domain.use_case.challenge

import com.mobile.goal.common.Resource
import com.mobile.goal.domain.model.challengeTeams.ChallengeTeamModel
import com.mobile.goal.domain.repository.ChallengeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetChallengeTeamsUseCase @Inject constructor(
    private val repository: ChallengeRepository
) {
    operator fun invoke(challengeCode: String): Flow<Resource<List<ChallengeTeamModel>>> =
        flow {
            try {
                emit(Resource.Loading())
                val code = repository.getChallengeTeams(challengeCode) ?: ArrayList()
                emit(Resource.Success(code))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Check your internet connection."))
            }
        }
}