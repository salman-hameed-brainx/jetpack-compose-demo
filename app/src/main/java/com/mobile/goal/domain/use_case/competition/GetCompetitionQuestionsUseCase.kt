package com.mobile.goal.domain.use_case.competition


import com.mobile.goal.common.Resource
import com.mobile.goal.domain.model.competition.competitionQuestions.CompetitionQuestion
import com.mobile.goal.domain.repository.CompetitionRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetCompetitionQuestionsUseCase @Inject constructor(
    private val repository: CompetitionRepository
) {
    operator fun invoke(competitionCode: String): Flow<Resource<ArrayList<CompetitionQuestion>>> =
        flow {
            try {
                emit(Resource.Loading())
                val code = repository.getCompetitionQuestion(competitionCode) ?: ArrayList()
                emit(Resource.Success(code))
            } catch (e: HttpException) {
                emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
            } catch (e: IOException) {
                emit(Resource.Error("Couldn't reach server. Check your internet connection."))
            }
        }
}