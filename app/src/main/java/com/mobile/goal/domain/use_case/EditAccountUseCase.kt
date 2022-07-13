package com.mobile.goal.domain.use_case

import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.EditAccountDto
import com.mobile.goal.domain.model.Participant
import com.mobile.goal.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class EditAccountUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(id: Int?, editAccountDto: EditAccountDto): Flow<Resource<Participant?>> =
        flow {
            try {
                emit(Resource.Loading())
                val participant = id?.let { repository.editAccount(it, editAccountDto) }
                emit(Resource.Success(participant))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "An unexpected error occurred"))
            } catch (e: IOException) {
                emit(Resource.Error("${e.printStackTrace()} Couldn't reach server. Check your internet connection."))
            }
        }
}