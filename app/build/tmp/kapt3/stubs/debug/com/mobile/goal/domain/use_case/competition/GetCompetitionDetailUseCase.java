package com.mobile.goal.domain.use_case.competition;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\nH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"Lcom/mobile/goal/domain/use_case/competition/GetCompetitionDetailUseCase;", "", "repository", "Lcom/mobile/goal/domain/repository/CompetitionRepository;", "(Lcom/mobile/goal/domain/repository/CompetitionRepository;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mobile/goal/common/Resource;", "Lcom/mobile/goal/domain/model/competition/competitionDetail/CompetitionDetailResponse;", "code", "", "app_debug"})
public final class GetCompetitionDetailUseCase {
    private final com.mobile.goal.domain.repository.CompetitionRepository repository = null;
    
    @javax.inject.Inject()
    public GetCompetitionDetailUseCase(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.repository.CompetitionRepository repository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mobile.goal.common.Resource<com.mobile.goal.domain.model.competition.competitionDetail.CompetitionDetailResponse>> invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String code) {
        return null;
    }
}