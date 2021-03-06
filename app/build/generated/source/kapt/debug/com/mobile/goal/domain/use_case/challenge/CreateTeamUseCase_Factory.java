// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.domain.use_case.challenge;

import com.mobile.goal.domain.repository.ChallengeRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CreateTeamUseCase_Factory implements Factory<CreateTeamUseCase> {
  private final Provider<ChallengeRepository> repositoryProvider;

  public CreateTeamUseCase_Factory(Provider<ChallengeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public CreateTeamUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static CreateTeamUseCase_Factory create(Provider<ChallengeRepository> repositoryProvider) {
    return new CreateTeamUseCase_Factory(repositoryProvider);
  }

  public static CreateTeamUseCase newInstance(ChallengeRepository repository) {
    return new CreateTeamUseCase(repository);
  }
}
