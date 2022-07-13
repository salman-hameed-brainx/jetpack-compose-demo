package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.LoginEmailDto
import com.mobile.goal.data.remote.dto.toCode
import com.mobile.goal.domain.model.Code
import com.mobile.goal.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class RegisterEmailUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(loginEmailDto: LoginEmailDto): Flow<Resource<Code>> = flow {
        try {
            emit(Resource.Loading())
            val code = repository.registerEmail(loginEmailDto).toCode()
            emit(Resource.Success(code))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}