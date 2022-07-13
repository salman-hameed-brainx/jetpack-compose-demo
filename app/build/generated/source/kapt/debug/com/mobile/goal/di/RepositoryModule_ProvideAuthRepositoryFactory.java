// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.di;

import com.mobile.goal.data.remote.Api;
import com.mobile.goal.domain.repository.AuthRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideAuthRepositoryFactory implements Factory<AuthRepository> {
  private final Provider<Api> apiProvider;

  public RepositoryModule_ProvideAuthRepositoryFactory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public AuthRepository get() {
    return provideAuthRepository(apiProvider.get());
  }

  public static RepositoryModule_ProvideAuthRepositoryFactory create(Provider<Api> apiProvider) {
    return new RepositoryModule_ProvideAuthRepositoryFactory(apiProvider);
  }

  public static AuthRepository provideAuthRepository(Api api) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideAuthRepository(api));
  }
}
