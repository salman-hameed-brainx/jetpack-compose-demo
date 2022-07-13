// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.ui.onboarding.register;

import com.mobile.goal.data.local.data_store.SessionDataStore;
import com.mobile.goal.domain.use_case.RegisterEmailUseCase;
import com.mobile.goal.domain.use_case.RequestTokenUseCase;
import com.mobile.goal.domain.use_case.UpdateProfileUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterEmailViewModel_Factory implements Factory<RegisterEmailViewModel> {
  private final Provider<RegisterEmailUseCase> registerEmailUseCaseProvider;

  private final Provider<UpdateProfileUseCase> updateProfileUseCaseProvider;

  private final Provider<RequestTokenUseCase> requestTokenUseCaseProvider;

  private final Provider<SessionDataStore> sessionDataStoreProvider;

  public RegisterEmailViewModel_Factory(Provider<RegisterEmailUseCase> registerEmailUseCaseProvider,
      Provider<UpdateProfileUseCase> updateProfileUseCaseProvider,
      Provider<RequestTokenUseCase> requestTokenUseCaseProvider,
      Provider<SessionDataStore> sessionDataStoreProvider) {
    this.registerEmailUseCaseProvider = registerEmailUseCaseProvider;
    this.updateProfileUseCaseProvider = updateProfileUseCaseProvider;
    this.requestTokenUseCaseProvider = requestTokenUseCaseProvider;
    this.sessionDataStoreProvider = sessionDataStoreProvider;
  }

  @Override
  public RegisterEmailViewModel get() {
    return newInstance(registerEmailUseCaseProvider.get(), updateProfileUseCaseProvider.get(), requestTokenUseCaseProvider.get(), sessionDataStoreProvider.get());
  }

  public static RegisterEmailViewModel_Factory create(
      Provider<RegisterEmailUseCase> registerEmailUseCaseProvider,
      Provider<UpdateProfileUseCase> updateProfileUseCaseProvider,
      Provider<RequestTokenUseCase> requestTokenUseCaseProvider,
      Provider<SessionDataStore> sessionDataStoreProvider) {
    return new RegisterEmailViewModel_Factory(registerEmailUseCaseProvider, updateProfileUseCaseProvider, requestTokenUseCaseProvider, sessionDataStoreProvider);
  }

  public static RegisterEmailViewModel newInstance(RegisterEmailUseCase registerEmailUseCase,
      UpdateProfileUseCase updateProfileUseCase, RequestTokenUseCase requestTokenUseCase,
      SessionDataStore sessionDataStore) {
    return new RegisterEmailViewModel(registerEmailUseCase, updateProfileUseCase, requestTokenUseCase, sessionDataStore);
  }
}