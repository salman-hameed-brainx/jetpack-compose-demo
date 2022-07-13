package com.mobile.goal.domain.use_case;

import java.lang.System;

@kotlin.Metadata(mv = {1, 5, 1}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/mobile/goal/domain/use_case/RequestTokenUseCase;", "", "repository", "Lcom/mobile/goal/domain/repository/AuthRepository;", "sessionDataStore", "Lcom/mobile/goal/data/local/data_store/SessionDataStore;", "(Lcom/mobile/goal/domain/repository/AuthRepository;Lcom/mobile/goal/data/local/data_store/SessionDataStore;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "Lcom/mobile/goal/common/Resource;", "Lcom/mobile/goal/domain/model/AccessToken;", "requestTokenDto", "Lcom/mobile/goal/data/remote/dto/RequestTokenDto;", "app_debug"})
public final class RequestTokenUseCase {
    private final com.mobile.goal.domain.repository.AuthRepository repository = null;
    private final com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore = null;
    
    @javax.inject.Inject()
    public RequestTokenUseCase(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.domain.repository.AuthRepository repository, @org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.local.data_store.SessionDataStore sessionDataStore) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.mobile.goal.common.Resource<com.mobile.goal.domain.model.AccessToken>> invoke(@org.jetbrains.annotations.NotNull()
    com.mobile.goal.data.remote.dto.RequestTokenDto requestTokenDto) {
        return null;
    }
}