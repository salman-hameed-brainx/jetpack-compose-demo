// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.domain.use_case;

import com.mobile.goal.domain.repository.UserRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class UpdateProfileUseCase_Factory implements Factory<UpdateProfileUseCase> {
  private final Provider<UserRepository> repositoryProvider;

  public UpdateProfileUseCase_Factory(Provider<UserRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public UpdateProfileUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static UpdateProfileUseCase_Factory create(Provider<UserRepository> repositoryProvider) {
    return new UpdateProfileUseCase_Factory(repositoryProvider);
  }

  public static UpdateProfileUseCase newInstance(UserRepository repository) {
    return new UpdateProfileUseCase(repository);
  }
}