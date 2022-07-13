// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.ui.onboarding.login_email;

import com.mobile.goal.data.local.data_store.SessionDataStore;
import com.mobile.goal.domain.use_case.GetAboutMeUseCase;
import com.mobile.goal.domain.use_case.LoginEmailUseCase;
import com.mobile.goal.domain.use_case.RequestTokenUseCase;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginEmailViewModel_Factory implements Factory<LoginEmailViewModel> {
  private final Provider<LoginEmailUseCase> loginEmailUseCaseProvider;

  private final Provider<RequestTokenUseCase> requestTokenUseCaseProvider;

  private final Provider<GetAboutMeUseCase> getAboutMeUseCaseProvider;

  private final Provider<SessionDataStore> sessionDataStoreProvider;

  public LoginEmailViewModel_Factory(Provider<LoginEmailUseCase> loginEmailUseCaseProvider,
      Provider<RequestTokenUseCase> requestTokenUseCaseProvider,
      Provider<GetAboutMeUseCase> getAboutMeUseCaseProvider,
      Provider<SessionDataStore> sessionDataStoreProvider) {
    this.loginEmailUseCaseProvider = loginEmailUseCaseProvider;
    this.requestTokenUseCaseProvider = requestTokenUseCaseProvider;
    this.getAboutMeUseCaseProvider = getAboutMeUseCaseProvider;
    this.sessionDataStoreProvider = sessionDataStoreProvider;
  }

  @Override
  public LoginEmailViewModel get() {
    return newInstance(loginEmailUseCaseProvider.get(), requestTokenUseCaseProvider.get(), getAboutMeUseCaseProvider.get(), sessionDataStoreProvider.get());
  }

  public static LoginEmailViewModel_Factory create(
      Provider<LoginEmailUseCase> loginEmailUseCaseProvider,
      Provider<RequestTokenUseCase> requestTokenUseCaseProvider,
      Provider<GetAboutMeUseCase> getAboutMeUseCaseProvider,
      Provider<SessionDataStore> sessionDataStoreProvider) {
    return new LoginEmailViewModel_Factory(loginEmailUseCaseProvider, requestTokenUseCaseProvider, getAboutMeUseCaseProvider, sessionDataStoreProvider);
  }

  public static LoginEmailViewModel newInstance(LoginEmailUseCase loginEmailUseCase,
      RequestTokenUseCase requestTokenUseCase, GetAboutMeUseCase getAboutMeUseCase,
      SessionDataStore sessionDataStore) {
    return new LoginEmailViewModel(loginEmailUseCase, requestTokenUseCase, getAboutMeUseCase, sessionDataStore);
  }
}