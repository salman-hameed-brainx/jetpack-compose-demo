package com.mobile.goal.data.repository

import com.google.gson.JsonObject
import com.mobile.goal.data.remote.Api
import com.mobile.goal.domain.model.competition.competitionDetail.CompetitionDetailResponse
import com.mobile.goal.domain.model.competition.competitionQuestions.GetCompetitionQuestionsResponse
import com.mobile.goal.domain.model.competition.competitionTeam.CompetitionTeamModel
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse
import com.mobile.goal.domain.model.competition.distance.DistanceModel
import com.mobile.goal.domain.model.competition.participants.CompetitionParticipantsResponse
import com.mobile.goal.domain.repository.CompetitionRepository
import javax.inject.Inject

class CompetitionRepositoryImp @Inject constructor(
    private val api: Api
) : CompetitionRepository {
    override suspend fun getCompetitionList(): CompetitionResponse? {
        return api.getCompetitions()
    }

    override suspend fun getCompetitionDetail(code: String): CompetitionDetailResponse? {
        return api.getCompetitionDetail(code = code)
    }


    override suspend fun getCompetitionQuestion(challengeCode: String): GetCompetitionQuestionsResponse? {
        return api.getCompetitionQuestions(code = challengeCode)
    }

    override suspend fun getCompetitionTeams(competitionCode: String): List<CompetitionTeamModel>? {
        return api.getCompetitionTeams(code = competitionCode)
    }

    override suspend fun applyCompetition(
        challengeCode: String,
        body: JsonObject
    ): Map<String, Any?>? {
        return api.applyCompetition(code = challengeCode, body = body)
    }

    override suspend fun getCompetitionDistances(code: String): List<DistanceModel>? {
        return api.getCompetitionDistances(code = code)
    }

    override suspend fun getCompetitionParticipants(code: String, distanceId: Int): CompetitionParticipantsResponse? {
        return api.getCompetitionParticipants(code = code, distance = distanceId)
    }
}