package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.SignInFacebookDto
import com.mobile.goal.data.remote.dto.toCode
import com.mobile.goal.domain.model.Code
import com.mobile.goal.domain.repository.AuthRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class SignInFacebookUseCase @Inject constructor(
    private val repository: AuthRepository
) {
    operator fun invoke(signInFacebookDto: SignInFacebookDto): Flow<Resource<Code>> = flow {
        try {
            emit(Resource.Loading())
            val code = repository.signInFacebook(signInFacebookDto).toCode()
            emit(Resource.Success(code))
        } catch (e: HttpException) {
            val errorMessage = when (e.code()) {
                409 -> "An account already exists with the same email address but different sign-in credentials. Sign in using a provider associated with this email address."
                else -> "An unexpected error occurred"
            }
            emit(Resource.Error(errorMessage))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}