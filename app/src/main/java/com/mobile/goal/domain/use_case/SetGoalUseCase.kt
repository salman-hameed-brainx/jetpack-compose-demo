package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.SetGoalDto
import com.mobile.goal.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SetGoalUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(setGoalDto: SetGoalDto): Flow<Resource<SetGoalDto?>> = flow {
        try {
            emit(Resource.Loading())
            val setGoalResponse = repository.setGoal(setGoalDto)
            emit(Resource.Success(setGoalResponse))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}