package com.mobile.goal.domain.model.competition.competitionQuestions;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b/\b\u0086\b\u0018\u00002\u00020\u0001B\u0089\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0013J\u0010\u0010,\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u001bJ\t\u0010-\u001a\u00020\u0005H\u00c6\u0003J\t\u0010.\u001a\u00020\u0005H\u00c6\u0003J\u000b\u0010/\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u00100\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0010\u00101\u001a\u0004\u0018\u00010\bH\u00c6\u0003\u00a2\u0006\u0002\u0010\u001fJ\u000b\u00102\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0011\u00103\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u00c6\u0003J\u000b\u00104\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\t\u00105\u001a\u00020\bH\u00c6\u0003J\u000b\u00106\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u0092\u0001\u00107\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\b2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u0005H\u00c6\u0001\u00a2\u0006\u0002\u00108J\u0013\u00109\u001a\u00020\b2\b\u0010:\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010;\u001a\u00020\u0003H\u00d6\u0001J\t\u0010<\u001a\u00020\u0005H\u00d6\u0001R\u001a\u0010\u000f\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u001c\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b\u00a2\u0006\n\n\u0002\u0010 \u001a\u0004\b\u0007\u0010\u001fR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001eR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u001e\"\u0004\b&\u0010\'R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u001e\"\u0004\b)\u0010\'R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\u001e\"\u0004\b+\u0010\'\u00a8\u0006="}, d2 = {"Lcom/mobile/goal/domain/model/competition/competitionQuestions/CompetitionQuestion;", "", "id", "", "input_field", "", "question", "is_required", "", "name", "choices", "", "Lcom/mobile/goal/domain/model/challenge/challengeQuestions/Choice;", "params", "Lcom/mobile/goal/domain/model/competition/competitionQuestions/Params;", "checkBoxValue", "selectionDropdown", "textEntered", "textError", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/mobile/goal/domain/model/competition/competitionQuestions/Params;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getCheckBoxValue", "()Z", "setCheckBoxValue", "(Z)V", "getChoices", "()Ljava/util/List;", "getId", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getInput_field", "()Ljava/lang/String;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getName", "getParams", "()Lcom/mobile/goal/domain/model/competition/competitionQuestions/Params;", "getQuestion", "getSelectionDropdown", "setSelectionDropdown", "(Ljava/lang/String;)V", "getTextEntered", "setTextEntered", "getTextError", "setTextError", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/util/List;Lcom/mobile/goal/domain/model/competition/competitionQuestions/Params;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/mobile/goal/domain/model/competition/competitionQuestions/CompetitionQuestion;", "equals", "other", "hashCode", "toString", "app_debug"})
public final class CompetitionQuestion {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String input_field = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String question = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean is_required = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.util.List<com.mobile.goal.domain.model.challenge.challengeQuestions.Choice> choices = null;
    @org.jetbrains.annotations.Nullable()
    private final com.mobile.goal.domain.model.competition.competitionQuestions.Params params = null;
    private boolean checkBoxValue;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String selectionDropdown;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String textEntered;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String textError;
    
    @org.jetbrains.annotations.NotNull()
    public final com.mobile.goal.domain.model.competition.competitionQuestions.CompetitionQuestion copy(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String input_field, @org.jetbrains.annotations.Nullable()
    java.lang.String question, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_required, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<com.mobile.goal.domain.model.challenge.challengeQuestions.Choice> choices, @org.jetbrains.annotations.Nullable()
    com.mobile.goal.domain.model.competition.competitionQuestions.Params params, boolean checkBoxValue, @org.jetbrains.annotations.Nullable()
    java.lang.String selectionDropdown, @org.jetbrains.annotations.NotNull()
    java.lang.String textEntered, @org.jetbrains.annotations.NotNull()
    java.lang.String textError) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public CompetitionQuestion() {
        super();
    }
    
    public CompetitionQuestion(@org.jetbrains.annotations.Nullable()
    java.lang.Integer id, @org.jetbrains.annotations.Nullable()
    java.lang.String input_field, @org.jetbrains.annotations.Nullable()
    java.lang.String question, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean is_required, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.util.List<com.mobile.goal.domain.model.challenge.challengeQuestions.Choice> choices, @org.jetbrains.annotations.Nullable()
    com.mobile.goal.domain.model.competition.competitionQuestions.Params params, boolean checkBoxValue, @org.jetbrains.annotations.Nullable()
    java.lang.String selectionDropdown, @org.jetbrains.annotations.NotNull()
    java.lang.String textEntered, @org.jetbrains.annotations.NotNull()
    java.lang.String textError) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer component1() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getInput_field() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getQuestion() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean component4() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean is_required() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.mobile.goal.domain.model.challenge.challengeQuestions.Choice> component6() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.util.List<com.mobile.goal.domain.model.challenge.challengeQuestions.Choice> getChoices() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mobile.goal.domain.model.competition.competitionQuestions.Params component7() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.mobile.goal.domain.model.competition.competitionQuestions.Params getParams() {
        return null;
    }
    
    public final boolean component8() {
        return false;
    }
    
    public final boolean getCheckBoxValue() {
        return false;
    }
    
    public final void setCheckBoxValue(boolean p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSelectionDropdown() {
        return null;
    }
    
    public final void setSelectionDropdown(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component10() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextEntered() {
        return null;
    }
    
    public final void setTextEntered(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTextError() {
        return null;
    }
    
    public final void setTextError(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
}