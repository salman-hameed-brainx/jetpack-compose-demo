package com.mobile.goal.domain.model.challenge.challengeDetail;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b1\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u0018\u0010\u0003\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0012\u0010\u000fR\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0006R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0006R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0006R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0006R\u0018\u0010\u001b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0006R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0006R\u0018\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u0006R\u001a\u0010!\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\"\u0010\u000fR\u001a\u0010#\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b$\u0010\nR\u0018\u0010%\u001a\u0004\u0018\u00010\u00048\u0006X\u0087D\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0006R\u001a\u0010\'\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b(\u0010\u000fR\u0018\u0010)\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010\u0006R\u0018\u0010+\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0006R\u001a\u0010-\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b.\u0010\u000fR\u001a\u0010/\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b0\u0010\u000fR\u0018\u00101\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010\u0006R\u0018\u00103\u001a\u0004\u0018\u00010\u00018\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0018\u00106\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010\u0006R\u001a\u00108\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b9\u0010\nR\u0018\u0010:\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b;\u0010\u0006R\u0018\u0010<\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b=\u0010\u0006R\u001e\u0010>\u001a\n\u0012\u0004\u0012\u00020@\u0018\u00010?8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0018\u0010C\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\bD\u0010\u0006R\u001a\u0010E\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\u000b\u001a\u0004\bF\u0010\n\u00a8\u0006G"}, d2 = {"Lcom/mobile/goal/domain/model/challenge/challengeDetail/ChallengeDetailResponse;", "", "()V", "absolute_url", "", "getAbsolute_url", "()Ljava/lang/String;", "access", "", "getAccess", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "can_apply", "", "getCan_apply", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "can_apply_for_fee", "getCan_apply_for_fee", "code", "getCode", "description", "getDescription", "end", "getEnd", "entrant_edit_till", "getEntrant_edit_till", "front_image", "getFront_image", "front_image_thumb", "getFront_image_thumb", "goal", "getGoal", "have_teams", "getHave_teams", "kind", "getKind", "location", "getLocation", "login_to_apply", "getLogin_to_apply", "logo", "getLogo", "name", "getName", "only_private_teams", "getOnly_private_teams", "only_teams", "getOnly_teams", "org", "getOrg", "place_coordinate", "getPlace_coordinate", "()Ljava/lang/Object;", "place_name", "getPlace_name", "requiredAmount", "getRequiredAmount", "resultUnit", "getResultUnit", "slug", "getSlug", "sports", "", "Lcom/mobile/goal/domain/model/competition/competitionDetail/Sport;", "getSports", "()Ljava/util/List;", "start", "getStart", "status", "getStatus", "app_debug"})
public final class ChallengeDetailResponse {
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "absolute_url")
    private final java.lang.String absolute_url = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "access")
    private final java.lang.Integer access = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "can_apply")
    private final java.lang.Boolean can_apply = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "can_apply_for_fee")
    private final java.lang.Boolean can_apply_for_fee = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "code")
    private final java.lang.String code = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "description")
    private final java.lang.String description = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "end")
    private final java.lang.String end = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "entrant_edit_till")
    private final java.lang.String entrant_edit_till = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "front_image")
    private final java.lang.String front_image = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "front_image_thumb")
    private final java.lang.String front_image_thumb = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "have_teams")
    private final java.lang.Boolean have_teams = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "kind")
    private final java.lang.Integer kind = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "login_to_apply")
    private final java.lang.Boolean login_to_apply = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "logo")
    private final java.lang.String logo = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "name")
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "only_private_teams")
    private final java.lang.Boolean only_private_teams = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "only_teams")
    private final java.lang.Boolean only_teams = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "org")
    private final java.lang.String org = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "place_coordinate")
    private final java.lang.Object place_coordinate = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "place_name")
    private final java.lang.String place_name = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "slug")
    private final java.lang.String slug = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "sports")
    private final java.util.List<com.mobile.goal.domain.model.competition.competitionDetail.Sport> sports = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "start")
    private final java.lang.String start = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "goal")
    private final java.lang.String goal = "250";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "location")
    private final java.lang.String location = "Pakistan";
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "status")
    private final java.lang.Integer status = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "required_amount")
    private final java.lang.Integer requiredAmount = null;
    @org.jetbrains.annotations.Nullable()
    @com.google.gson.annotations.SerializedName(value = "result_unit")
    private final java.lang.String resultUnit = null;
    
    public ChallengeDetailResponse() {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAbsolute_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getAccess() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCan_apply() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getCan_apply_for_fee() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCode() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getDescription() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEnd() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEntrant_edit_till() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFront_image() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFront_image_thumb() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getHave_teams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getKind() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getLogin_to_apply() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogo() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOnly_private_teams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getOnly_teams() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrg() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getPlace_coordinate() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getPlace_name() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSlug() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.mobile.goal.domain.model.competition.competitionDetail.Sport> getSports() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStart() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGoal() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getStatus() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getRequiredAmount() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getResultUnit() {
        return null;
    }
}