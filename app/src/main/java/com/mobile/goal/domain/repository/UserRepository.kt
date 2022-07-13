package com.mobile.goal.domain.repository

import com.mobile.goal.data.remote.dto.*
import com.mobile.goal.domain.model.Participant


interface UserRepository {

    suspend fun getAboutMe(): AboutMeDto?

    suspend fun getUserDetail(id: Int): GetParticipantDto?

    suspend fun updateAboutMe(updateProfileDto: UpdateProfileDto): AboutMeDto?

    suspend fun setGoal(setGoalDto: SetGoalDto): SetGoalDto?

    suspend fun getDailyGoalStats(page: String): GetGoalDto?

    suspend fun editAccount(id: Int, editAccountDto: EditAccountDto): Participant?

    suspend fun changePassword(changePasswordDto: ChangePasswordDto): Any

}