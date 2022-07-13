package com.mobile.goal.domain.use_case

import com.mobile.goal.common.Resource
import com.mobile.goal.common.utils.getErrorMsg
import com.mobile.goal.domain.model.organization.OrganizationResponse
import com.mobile.goal.domain.repository.OrganizationRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetOrganizationUseCase @Inject constructor(
    private val repository: OrganizationRepository
) {
    operator fun invoke(): Flow<Resource<OrganizationResponse>> =
        flow {
            try {
                emit(Resource.Loading())
                val code = repository.getOrganization() ?: OrganizationResponse()
                emit(Resource.Success(code))
            } catch (e: HttpException) {
                emit(Resource.Error(e.response()?.errorBody()?.string()?.getErrorMsg() ?: "An unexpected error occured"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Check your internet connection."))
            }
        }
}