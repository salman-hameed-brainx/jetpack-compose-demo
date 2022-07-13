package com.mobile.goal.ui.home;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u0015\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u00a8\u0006\u001b"}, d2 = {"Lcom/mobile/goal/ui/home/HomeViewModel;", "Landroidx/lifecycle/ViewModel;", "challengeUseCase", "Lcom/mobile/goal/domain/use_case/challenge/GetChallengeUseCase;", "competitionUseCase", "Lcom/mobile/goal/domain/use_case/competition/GetCompetitionUseCase;", "(Lcom/mobile/goal/domain/use_case/challenge/GetChallengeUseCase;Lcom/mobile/goal/domain/use_case/competition/GetCompetitionUseCase;)V", "_eventFlow", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "Lcom/mobile/goal/ui/challenge/ChallengesUiEvent;", "_state", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/mobile/goal/ui/home/HomeViewState;", "eventFlow", "Lkotlinx/coroutines/flow/SharedFlow;", "getEventFlow", "()Lkotlinx/coroutines/flow/SharedFlow;", "isChallengesLoaded", "", "isCompetitionsLoaded", "state", "Lkotlinx/coroutines/flow/StateFlow;", "getState", "()Lkotlinx/coroutines/flow/StateFlow;", "getChallenge", "", "getCompetitions", "app_debug"})
public final class HomeViewModel extends androidx.lifecycle.ViewModel {
    private final com.mobile.goal.domain.use_case.challenge.GetChallengeUseCase challengeUseCase = null;
    private final com.mobile.goal.domain.use_case.competition.GetCompetitionUseCase competitionUseCase = null;
    private boolean isChallengesLoaded = false;
    private boolean isCompetitionsLoaded = false;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.mobile.goal.ui.home.HomeViewState> _state = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.mobile.goal.ui.home.HomeViewState> state = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<com.mobile.goal.ui.challenge.ChallengesUiEvent> _eventFlow = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.challenge.ChallengesUiEvent> eventFlow = null;
    
    @javax.inject.Inject()
    public HomeViewModel(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.challenge.GetChallengeUseCase challengeUseCase, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.use_case.competition.GetCompetitionUseCase competitionUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.mobile.goal.ui.home.HomeViewState> getState() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.SharedFlow<com.mobile.goal.ui.challenge.ChallengesUiEvent> getEventFlow() {
        return null;
    }
    
    private final void getChallenge() {
    }
    
    private final void getCompetitions() {
    }
}