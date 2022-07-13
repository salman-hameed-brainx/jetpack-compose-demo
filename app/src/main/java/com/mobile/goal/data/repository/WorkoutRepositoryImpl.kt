package com.mobile.goal.data.repository

import com.mobile.goal.data.remote.Api
import com.mobile.goal.domain.model.WorkoutTypeResponse
import com.mobile.goal.domain.repository.WorkoutRepository
import javax.inject.Inject

class WorkoutRepositoryImpl @Inject constructor(
        private val api: Api
) : WorkoutRepository {
    override suspend fun getWorkoutList(): WorkoutTypeResponse? {
        return api.getWorkoutTypes()
    }
}