package com.mobile.goal.domain.use_case

import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.ChangePasswordDto
import com.mobile.goal.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class ChangePasswordUseCase @Inject constructor(
    private val repository: UserRepository
) {

    operator fun invoke(changePasswordDto: ChangePasswordDto): Flow<Resource<out Any>> =
        flow {
            try {
                emit(Resource.Loading())
                val response = repository.changePassword(changePasswordDto)
                emit(Resource.Success(response))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Check your internet connection."))
            }
        }
}