package com.mobile.goal.domain.repository

import com.mobile.goal.domain.model.WorkoutTypeResponse


interface WorkoutRepository {
    suspend fun getWorkoutList(): WorkoutTypeResponse?
}