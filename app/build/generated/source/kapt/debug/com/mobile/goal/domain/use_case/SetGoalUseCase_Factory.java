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
public final class SetGoalUseCase_Factory implements Factory<SetGoalUseCase> {
  private final Provider<UserRepository> repositoryProvider;

  public SetGoalUseCase_Factory(Provider<UserRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public SetGoalUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static SetGoalUseCase_Factory create(Provider<UserRepository> repositoryProvider) {
    return new SetGoalUseCase_Factory(repositoryProvider);
  }

  public static SetGoalUseCase newInstance(UserRepository repository) {
    return new SetGoalUseCase(repository);
  }
}