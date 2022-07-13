package com.mobile.goal.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005\u00a8\u0006\u0007"}, d2 = {"Lcom/mobile/goal/data/remote/AuthorizationType;", "", "(Ljava/lang/String;I)V", "ACCESS_TOKEN", "CLIENT_CREDENTIALS", "NONE", "Companion", "app_debug"})
public enum AuthorizationType {
    /*public static final*/ ACCESS_TOKEN /* = new ACCESS_TOKEN() */,
    /*public static final*/ CLIENT_CREDENTIALS /* = new CLIENT_CREDENTIALS() */,
    /*public static final*/ NONE /* = new NONE() */;
    @org.jetbrains.annotations.NotNull()
    public static final com.mobile.goal.data.remote.AuthorizationType.Companion Companion = null;
    
    AuthorizationType() {
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/mobile/goal/data/remote/AuthorizationType$Companion;", "", "()V", "fromRequest", "Lcom/mobile/goal/data/remote/AuthorizationType;", "request", "Lokhttp3/Request;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.mobile.goal.data.remote.AuthorizationType fromRequest(@org.jetbrains.annotations.NotNull()
        okhttp3.Request request) {
            return null;
        }
    }
}