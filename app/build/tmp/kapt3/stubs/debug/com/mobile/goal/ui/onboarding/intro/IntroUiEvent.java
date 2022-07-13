package com.mobile.goal.ui.onboarding.intro;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0001\u0003B\u0007\b\u0004\u00a2\u0006\u0002\u0010\u0002\u0082\u0001\u0001\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/mobile/goal/ui/onboarding/intro/IntroUiEvent;", "", "()V", "CompleteIntro", "Lcom/mobile/goal/ui/onboarding/intro/IntroUiEvent$CompleteIntro;", "app_debug"})
public abstract class IntroUiEvent {
    
    private IntroUiEvent() {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/mobile/goal/ui/onboarding/intro/IntroUiEvent$CompleteIntro;", "Lcom/mobile/goal/ui/onboarding/intro/IntroUiEvent;", "()V", "app_debug"})
    public static final class CompleteIntro extends com.mobile.goal.ui.onboarding.intro.IntroUiEvent {
        @org.jetbrains.annotations.NotNull()
        public static final com.mobile.goal.ui.onboarding.intro.IntroUiEvent.CompleteIntro INSTANCE = null;
        
        private CompleteIntro() {
            super();
        }
    }
}