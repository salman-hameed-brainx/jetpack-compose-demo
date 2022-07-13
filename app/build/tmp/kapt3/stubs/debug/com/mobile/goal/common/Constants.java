package com.mobile.goal.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\b\u00c6\u0002\u0018\u00002\u00020\u0001:\u0002\u0012\u0013B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lcom/mobile/goal/common/Constants;", "", "()V", "BASE_URL", "", "CHALLENGE_CODE", "CLIENT_ID", "CLIENT_SECRET", "CLIENT_TOKEN", "CODE_CHALLENGE_METHOD", "CODE_VERIFIER", "FACEBOOK_GRAPH_BASE_URL", "FB_SESSION_GRANT_TYPE", "GRANT_TYPE", "PASSWORD_PATTERN", "REQUEST_TOKEN_SCOPE", "SERVER_CLIENT_ID", "TOKEN_TYPE", "KeyConstants", "NetworkConstant", "app_debug"})
public final class Constants {
    @org.jetbrains.annotations.NotNull()
    public static final com.mobile.goal.common.Constants INSTANCE = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String BASE_URL = "https://inttest.distantrace.com/";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FACEBOOK_GRAPH_BASE_URL = "https://graph.facebook.com/v12.0/oauth/access_token?";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String GRANT_TYPE = "authorization_code";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String FB_SESSION_GRANT_TYPE = "fb_attenuate_token";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_ID = "e9qs4PMopzlcCXOGPv2v8UJOEEMKQ0HJTAK1l8nl";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_SECRET = "YRx3Q0yTdjWMvUHxtZRMkfR3JehB4FgMtD7ag2SYvQFtDQjz8IiZ9A59qfvhvnHydrV1apdCPhWOPpShmuwDlXH6YrTENqf8w4xaWwgGXmjHrVvUX3GrTvxHZ5j7aA0o";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CLIENT_TOKEN = "ZTlxczRQTW9wemxjQ1hPR1B2MnY4VUpPRUVNS1EwSEpUQUsxbDhubDpZUngzUTB5VGRqV012VUh4dFpSTWtmUjNKZWhCNEZnTXREN2FnMlNZdlFGdERRano4SWlaOUE1OXFmdmh2bkh5ZHJWMWFwZENQaFdPUHBTaG11d0RsWEg2WXJURU5xZjh3NHhhV3dnR1htakhyVnZVWDNHclR2eEhaNWo3YUEwbw==";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODE_VERIFIER = "GHqyYbN-SzdtpCuWWpYqPEUQLWKCQXCP9PpPOfrx-mg";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CHALLENGE_CODE = "DmJu_0Inyxdrzp202M1G0IePZ3QcjEBKTmoKMNGl78Y";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String CODE_CHALLENGE_METHOD = "S256";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String REQUEST_TOKEN_SCOPE = "read write groups";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TOKEN_TYPE = "Bearer";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String SERVER_CLIENT_ID = "1019132623713-7gdtu8v9qshgemn59tkdtlijl67a0721.apps.googleusercontent.com";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()\u2013[{}]:;\',?/*~$^+=<>]).{8,20}$";
    
    private Constants() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0006"}, d2 = {"Lcom/mobile/goal/common/Constants$NetworkConstant;", "", "()V", "LANGUAGE_ENGLISH_CODE", "", "LANGUAGE_LATVIAN_CODE", "app_debug"})
    public static final class NetworkConstant {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.common.Constants.NetworkConstant INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANGUAGE_ENGLISH_CODE = "en";
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String LANGUAGE_LATVIAN_CODE = "lv";
        
        private NetworkConstant() {
            super();
        }
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/mobile/goal/common/Constants$KeyConstants;", "", "()V", "EMPTY_DISTANCE", "", "SELECTED_TEAM_KEY", "", "app_debug"})
    public static final class KeyConstants {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.common.Constants.KeyConstants INSTANCE = null;
        @org.jetbrains.annotations.NotNull()
        public static final java.lang.String SELECTED_TEAM_KEY = "selected_team";
        public static final int EMPTY_DISTANCE = -1;
        
        private KeyConstants() {
            super();
        }
    }
}