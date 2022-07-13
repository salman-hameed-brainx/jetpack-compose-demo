package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.GetGoalDto
import com.mobile.goal.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetGoalUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(page: Int): Flow<Resource<GetGoalDto?>> = flow {
        try {
            emit(Resource.Loading())
            val getGoalResponse = repository.getDailyGoalStats(page.toString())
            emit(Resource.Success(getGoalResponse))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}