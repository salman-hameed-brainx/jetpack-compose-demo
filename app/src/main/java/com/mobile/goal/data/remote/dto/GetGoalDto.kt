package com.mobile.goal.data.remote.dto

data class GetGoalDto(
    val count: Int?,
    val next: String?,
    val previous: String?,
    val page: Int?,
    val results: ArrayList<GoalDto>
)
