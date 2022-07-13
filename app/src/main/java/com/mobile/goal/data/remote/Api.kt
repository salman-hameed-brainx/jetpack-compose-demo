package com.mobile.goal.data.remote

import com.google.gson.JsonObject
import com.mobile.goal.common.Constants
import com.mobile.goal.data.remote.dto.*
import com.mobile.goal.domain.model.Participant
import com.mobile.goal.domain.model.WorkoutTypeResponse
import com.mobile.goal.domain.model.challenge.challengeDetail.ChallengeDetailResponse
import com.mobile.goal.domain.model.challenge.challengeQuestions.GetChallengeQuestionsResponse
import com.mobile.goal.domain.model.challenge.challengelisting.ChallengeResponse
import com.mobile.goal.domain.model.challenge.participants.ChallengeParticipantsResponse
import com.mobile.goal.domain.model.challengeTeams.ChallengeTeamModel
import com.mobile.goal.domain.model.competition.competitionDetail.CompetitionDetailResponse
import com.mobile.goal.domain.model.competition.competitionQuestions.GetCompetitionQuestionsResponse
import com.mobile.goal.domain.model.competition.competitionTeam.CompetitionTeamModel
import com.mobile.goal.domain.model.competition.competitionlisting.CompetitionResponse
import com.mobile.goal.domain.model.competition.distance.DistanceModel
import com.mobile.goal.domain.model.competition.participants.CompetitionParticipantsResponse
import com.mobile.goal.domain.model.organization.OrganizationResponse
import okhttp3.MultipartBody
import okhttp3.RequestBody
import retrofit2.http.*

interface Api {

    @POST("/oauth/token/")
    @FormUrlEncoded
    suspend fun requestToken(
        @FieldMap params: Map<String, String>,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): AccessTokenDto

    @POST("/api/v1/account/signup/")
    @FormUrlEncoded
    suspend fun registerEmail(
        @FieldMap params: Map<String, String>,
        @Tag authorization: AuthorizationType = AuthorizationType.NONE
    ): CodeDto

    @POST("/api/v1/account/login/")
    @FormUrlEncoded
    suspend fun signInEmail(
        @FieldMap params: Map<String, String>,
        @Tag authorization: AuthorizationType = AuthorizationType.NONE
    ): CodeDto

    @POST("/api/v1/account/login/google/")
    @FormUrlEncoded
    suspend fun signInGoogle(
        @FieldMap params: Map<String, String>,
        @Tag authorization: AuthorizationType = AuthorizationType.NONE
    ): CodeDto

    @GET
    suspend fun getFBSessionToken(
        @Url url: String = Constants.FACEBOOK_GRAPH_BASE_URL,
        @Query("grant_type") grant_type: String,
        @Query("client_id") client_id: String,
        @Query("fb_exchange_token") fb_exchange_token: String,
        @Tag authorization: AuthorizationType = AuthorizationType.NONE
    ): AccessTokenDto

    @POST("/api/v1/account/login/facebook/")
    @FormUrlEncoded
    suspend fun signInFacebook(
        @FieldMap params: Map<String, String>,
        @Tag authorization: AuthorizationType = AuthorizationType.NONE
    ): CodeDto

    @GET("/api/v1/account/me/")
    suspend fun getAboutMe(@Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN): AboutMeDto?

    @PUT("/api/v1/account/me/")
    suspend fun updateAboutMe(
        @Body requestBody: RequestBody,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): AboutMeDto?

    @POST("/api/v1/gamification/goal/")
    suspend fun setGoal(
        @Body setGoalDto: SetGoalDto,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): SetGoalDto?


    @GET("/api/v1/gamification/goal/")
    suspend fun getGoal(
        @Query("page") page: String,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): GetGoalDto?

    @GET("/api/v1/users/participant/")
    suspend fun getUserDetail(
        @Query("id") id: Int,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): GetParticipantDto?

    @Multipart
    @PATCH("api/v1/users/participant/{id}/")
    suspend fun editAccount(
        @Path("id") id: Int,
        @PartMap params: Map<String, @JvmSuppressWildcards RequestBody?>,
        @Part profileImage: MultipartBody.Part?,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): Participant?

    @PUT("api/v1/account/change_password/")
    suspend fun changePassword(
        @Body requestBody: RequestBody,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    )

    @GET("/api/v1/workouts/kind/")
    suspend fun getWorkoutTypes(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Header("Accept-Language") language: String = Constants.NetworkConstant.LANGUAGE_ENGLISH_CODE
    ): WorkoutTypeResponse?

    @GET("/api/v1/gamification/challenge/")
    suspend fun getChallenges(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Query("available") available: Boolean = true,
    ): ChallengeResponse?

    @GET("/api/v1/gamification/challenge/{code}")
    suspend fun getChallengeDetail(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): ChallengeDetailResponse?

    @GET("/api/v1/gamification/challenge/{code}/questions/")
    suspend fun getChallengeQuestions(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): GetChallengeQuestionsResponse?

    @GET("/api/v1/gamification/challenge/{code}/teams/")
    suspend fun getChallengeTeams(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): List<ChallengeTeamModel>?

    @POST("/api/v1/gamification/challenge/{code}/apply/")
    suspend fun applyChallenge(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String,
        @Body body: JsonObject
    ): Map<String, Any?>?


    @GET("/api/v1/races/competition/")
    suspend fun getCompetitions(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Query("available") available: Boolean = true,
    ): CompetitionResponse?

    @GET("/api/v1/races/competition/{code}")
    suspend fun getCompetitionDetail(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): CompetitionDetailResponse?

    @GET("/api/v1/races/competition/{code}/questions/")
    suspend fun getCompetitionQuestions(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): GetCompetitionQuestionsResponse?

    @GET("/api/v1/races/competition/{code}/teams/")
    suspend fun getCompetitionTeams(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): List<CompetitionTeamModel>?

    @POST("/api/v1/races/competition/{code}/apply/")
    suspend fun applyCompetition(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String,
        @Body body: JsonObject
    ): Map<String, Any?>?

    @GET("/api/v1/races/competition/{code}/distances/")
    suspend fun getCompetitionDistances(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Path("code") code: String
    ): List<DistanceModel>?

    @GET("/api/v1/races/result/")
    suspend fun getCompetitionParticipants(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Query("competition__code") code: String,
        @Query("distance") distance: Int,
    ): CompetitionParticipantsResponse?

    @GET("/api/v1/gamification/challenger/")
    suspend fun getChallengeParticipants(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
        @Query("challenge_code") code: String,
    ): ChallengeParticipantsResponse?

    @GET("/api/v1/orgs/organization/")
    suspend fun getOrganization(
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN,
    ): OrganizationResponse?

    @POST("/api/v1/team/team/")
    suspend fun createTeam(
        @Body createTeam: CreateTeamDto,
        @Tag authorization: AuthorizationType = AuthorizationType.ACCESS_TOKEN
    ): CreateTeamDto?


}