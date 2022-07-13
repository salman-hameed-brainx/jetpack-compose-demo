package com.mobile.goal.domain.repository

import com.google.gson.JsonObject
import com.mobile.goal.domain.model.competition.competitionDetail.CompetitionDetailResponse
import com.mobile.goal.domain.model.competition.competitionQuestions.GetCompetitionQuestionsResponse
import com.mobile.goal.domain.model.competition.competitionTeam.CompetitionTeamModel
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse
import com.mobile.goal.domain.model.competition.distance.DistanceModel
import com.mobile.goal.domain.model.competition.participants.CompetitionParticipantsResponse

interface CompetitionRepository {
    suspend fun getCompetitionList(): CompetitionResponse?
    suspend fun getCompetitionDetail(code: String): CompetitionDetailResponse?
    suspend fun getCompetitionQuestion(challengeCode: String): GetCompetitionQuestionsResponse?
    suspend fun getCompetitionTeams(competitionTeams: String): List<CompetitionTeamModel>?
    suspend fun applyCompetition(challengeCode: String, body: JsonObject): Map<String, Any?>?
    suspend fun getCompetitionDistances(code: String): List<DistanceModel>?
    suspend fun getCompetitionParticipants(code: String, distanceId:Int): CompetitionParticipantsResponse?
}