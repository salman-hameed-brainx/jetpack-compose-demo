package com.mobile.goal.domain.use_case.challenge

import com.mobile.goal.common.Resource
import com.mobile.goal.common.utils.getErrorMsg
import com.mobile.goal.data.remote.dto.CreateTeamDto
import com.mobile.goal.domain.repository.ChallengeRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class CreateTeamUseCase @Inject constructor(
    private val repository: ChallengeRepository

) {
    operator fun invoke(createTeam: CreateTeamDto) : Flow<Resource<CreateTeamDto?>> = flow {
        try {
            emit(Resource.Loading())
            val createTeamResponse = repository.createTeam(createTeam)
            emit(Resource.Success(createTeamResponse))
        } catch (e: HttpException) {
//            emit(Resource.Error(e.getErrorMsg() ?: "An unexpected error occured"))
           emit(Resource.Error(e.getErrorMsg() ?: "An unexpected error occured"))



        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}