package com.mobile.goal.data.repository

import com.google.gson.JsonObject
import com.mobile.goal.data.remote.Api
import com.mobile.goal.data.remote.dto.CreateTeamDto
import com.mobile.goal.domain.model.challenge.challengeDetail.ChallengeDetailResponse
import com.mobile.goal.domain.model.challenge.challengeQuestions.GetChallengeQuestionsResponse
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse
import com.mobile.goal.domain.model.challenge.participants.ChallengeParticipantsResponse
import com.mobile.goal.domain.model.challengeTeams.ChallengeTeamModel
import com.mobile.goal.domain.repository.ChallengeRepository
import javax.inject.Inject

class ChallengeRepositoryImpl @Inject constructor(
    private val api: Api
) : ChallengeRepository {

    override suspend fun getChallengeList(): ChallengeResponse? {
        return api.getChallenges()
    }

    override suspend fun getChallengeDetail(code: String): ChallengeDetailResponse? {
        return api.getChallengeDetail(code = code)
    }

    override suspend fun getChallengeQuestion(challengeCode: String): GetChallengeQuestionsResponse? {
        return api.getChallengeQuestions(code = challengeCode)
    }

    override suspend fun getChallengeTeams(challengeCode: String): List<ChallengeTeamModel>? {
        return api.getChallengeTeams(code = challengeCode)
    }

    override suspend fun applyChallenge(
        challengeCode: String,
        body: JsonObject
    ): Map<String, Any?>? {
        return api.applyChallenge(code = challengeCode, body = body)
    }

    override suspend fun getChallengeParticipants(code: String): ChallengeParticipantsResponse? {
        return api.getChallengeParticipants(code = code)
    }

    override suspend fun createTeam(body: CreateTeamDto): CreateTeamDto? {
        return  api.createTeam(body)
    }

}