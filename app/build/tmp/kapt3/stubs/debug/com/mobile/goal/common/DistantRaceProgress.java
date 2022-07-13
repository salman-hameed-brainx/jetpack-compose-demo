package com.mobile.goal.common;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fJ\b\u0010\r\u001a\u00020\u000eH\u0002J5\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00112\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u00a2\u0006\u0002\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0015H\u0002\u00a2\u0006\u0002\u0010\u001aR\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001b"}, d2 = {"Lcom/mobile/goal/common/DistantRaceProgress;", "Lkotlinx/coroutines/CoroutineScope;", "()V", "autoDismissJob", "Lkotlinx/coroutines/Job;", "coroutineContext", "Lkotlin/coroutines/CoroutineContext;", "getCoroutineContext", "()Lkotlin/coroutines/CoroutineContext;", "mProgressDialogLib", "Lcom/kaopiz/kprogresshud/KProgressHUD;", "dismissProgress", "", "isShowing", "", "showProgress", "activity", "Landroid/app/Activity;", "title", "", "timeOut", "", "isCancellable", "(Landroid/app/Activity;Ljava/lang/String;Ljava/lang/Long;Z)V", "starAutoDismissJob", "waitInMs", "(Ljava/lang/Long;)V", "app_debug"})
public final class DistantRaceProgress implements kotlinx.coroutines.CoroutineScope {
    @org.jetbrains.annotations.NotNull()
    public static final com.mobile.goal.common.DistantRaceProgress INSTANCE = null;
    private static com.kaopiz.kprogresshud.KProgressHUD mProgressDialogLib;
    private static kotlinx.coroutines.Job autoDismissJob;
    
    private DistantRaceProgress() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public kotlin.coroutines.CoroutineContext getCoroutineContext() {
        return null;
    }
    
    public final void showProgress(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity, @org.jetbrains.annotations.Nullable()
    java.lang.String title, @org.jetbrains.annotations.Nullable()
    java.lang.Long timeOut, boolean isCancellable) {
    }
    
    private final boolean isShowing() {
        return false;
    }
    
    public final void dismissProgress() {
    }
    
    private final void starAutoDismissJob(java.lang.Long waitInMs) {
    }
}