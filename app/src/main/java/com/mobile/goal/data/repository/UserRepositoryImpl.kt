package com.mobile.goal.data.repository

import com.mobile.goal.data.remote.Api
import com.mobile.goal.data.remote.dto.*
import com.mobile.goal.domain.model.Participant
import com.mobile.goal.domain.repository.UserRepository
import javax.inject.Inject

class UserRepositoryImpl @Inject constructor(
    private val api: Api
) : UserRepository {

    override suspend fun getAboutMe(): AboutMeDto? {
        return api.getAboutMe()
    }

    override suspend fun updateAboutMe(updateProfileDto: UpdateProfileDto): AboutMeDto? {
        return api.updateAboutMe(updateProfileDto.toRequestBody())
    }

    override suspend fun setGoal(setGoalDto: SetGoalDto): SetGoalDto? {
        return api.setGoal(setGoalDto)
    }

    override suspend fun getDailyGoalStats(page: String): GetGoalDto? {
        return api.getGoal(page)
    }

    override suspend fun editAccount(
        id: Int,
        editAccountDto: EditAccountDto
    ): Participant? {
        return api.editAccount(id, editAccountDto.toMap(), editAccountDto.toMultipartBody())
    }

    override suspend fun changePassword(changePasswordDto: ChangePasswordDto) {
        api.changePassword(changePasswordDto.toRequestBody())
    }

    override suspend fun getUserDetail(id: Int): GetParticipantDto? {
        return api.getUserDetail(id)
    }

}