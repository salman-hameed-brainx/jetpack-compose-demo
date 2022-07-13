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
public final class GetParticipantUseCase_Factory implements Factory<GetParticipantUseCase> {
  private final Provider<UserRepository> repositoryProvider;

  public GetParticipantUseCase_Factory(Provider<UserRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetParticipantUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetParticipantUseCase_Factory create(Provider<UserRepository> repositoryProvider) {
    return new GetParticipantUseCase_Factory(repositoryProvider);
  }

  public static GetParticipantUseCase newInstance(UserRepository repository) {
    return new GetParticipantUseCase(repository);
  }
}