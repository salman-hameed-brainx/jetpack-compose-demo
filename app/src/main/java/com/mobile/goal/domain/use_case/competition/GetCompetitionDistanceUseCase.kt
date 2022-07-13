package com.mobile.goal.domain.use_case.competition

import com.mobile.goal.common.Resource
import com.mobile.goal.common.utils.getErrorMsg
import com.mobile.goal.domain.model.competition.distance.DistanceModel
import com.mobile.goal.domain.repository.CompetitionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCompetitionDistanceUseCase @Inject constructor(
    private val repository: CompetitionRepository
) {
    operator fun invoke(competitionCode: String): Flow<Resource<List<DistanceModel>>> =
        flow {
            try {
                emit(Resource.Loading())
                val code = repository.getCompetitionDistances(competitionCode) ?: ArrayList()
                emit(Resource.Success(code))
            } catch (e: HttpException) {
                emit(Resource.Error(e.response()?.errorBody()?.string()?.getErrorMsg() ?: "An unexpected error occured"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Check your internet connection."))
            }
        }
}