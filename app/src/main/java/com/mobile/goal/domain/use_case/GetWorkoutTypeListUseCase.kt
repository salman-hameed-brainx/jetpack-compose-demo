package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.domain.model.WorkoutType
import com.mobile.goal.domain.repository.WorkoutRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetWorkoutTypeListUseCase @Inject constructor(
    private val repository: WorkoutRepository
) {
    operator fun invoke(): Flow<Resource<out ArrayList<WorkoutType>?>> = flow {
        try {
            emit(Resource.Loading())
            val workoutListResponse = repository.getWorkoutList()
            emit(Resource.Success(workoutListResponse))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}