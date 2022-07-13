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
public final class GetChallengeUseCase_Factory implements Factory<GetChallengeUseCase> {
  private final Provider<ChallengeRepository> repositoryProvider;

  public GetChallengeUseCase_Factory(Provider<ChallengeRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetChallengeUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetChallengeUseCase_Factory create(
      Provider<ChallengeRepository> repositoryProvider) {
    return new GetChallengeUseCase_Factory(repositoryProvider);
  }

  public static GetChallengeUseCase newInstance(ChallengeRepository repository) {
    return new GetChallengeUseCase(repository);
  }
}
