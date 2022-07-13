package com.mobile.goal.domain.repository

import com.google.gson.JsonObject
import com.mobile.goal.data.remote.dto.CreateTeamDto
import com.mobile.goal.domain.model.challenge.challengeDetail.ChallengeDetailResponse
import com.mobile.goal.domain.model.challenge.challengeQuestions.GetChallengeQuestionsResponse
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse
import com.mobile.goal.domain.model.challenge.participants.ChallengeParticipantsResponse
import com.mobile.goal.domain.model.challengeTeams.ChallengeTeamModel


interface ChallengeRepository {
    suspend fun getChallengeList(): ChallengeResponse?
    suspend fun getChallengeDetail(code: String): ChallengeDetailResponse?
    suspend fun getChallengeQuestion(challengeCode: String): GetChallengeQuestionsResponse?
    suspend fun getChallengeTeams(challengeCode: String): List<ChallengeTeamModel>?
    suspend fun applyChallenge(challengeCode: String, body: JsonObject): Map<String, Any?>?
    suspend fun getChallengeParticipants(code: String): ChallengeParticipantsResponse?
    suspend fun createTeam(body: CreateTeamDto): CreateTeamDto?
}