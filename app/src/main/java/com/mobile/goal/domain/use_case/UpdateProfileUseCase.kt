package com.mobile.goal.domain.use_case


import com.mobile.goal.common.Resource
import com.mobile.goal.data.remote.dto.UpdateProfileDto
import com.mobile.goal.data.remote.dto.toAboutMe
import com.mobile.goal.domain.model.AboutMe
import com.mobile.goal.domain.repository.UserRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class UpdateProfileUseCase @Inject constructor(
    private val repository: UserRepository
) {
    operator fun invoke(updateProfileDto: UpdateProfileDto): Flow<Resource<AboutMe?>> = flow {
        try {
            emit(Resource.Loading())
            val aboutMe = repository.updateAboutMe(updateProfileDto)?.toAboutMe()
            emit(Resource.Success(aboutMe))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }
}