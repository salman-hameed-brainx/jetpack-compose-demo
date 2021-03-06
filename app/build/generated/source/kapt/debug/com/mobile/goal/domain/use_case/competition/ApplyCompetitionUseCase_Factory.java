// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.domain.use_case.competition;

import com.mobile.goal.domain.repository.CompetitionRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class ApplyCompetitionUseCase_Factory implements Factory<ApplyCompetitionUseCase> {
  private final Provider<CompetitionRepository> repositoryProvider;

  public ApplyCompetitionUseCase_Factory(Provider<CompetitionRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public ApplyCompetitionUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static ApplyCompetitionUseCase_Factory create(
      Provider<CompetitionRepository> repositoryProvider) {
    return new ApplyCompetitionUseCase_Factory(repositoryProvider);
  }

  public static ApplyCompetitionUseCase newInstance(CompetitionRepository repository) {
    return new ApplyCompetitionUseCase(repository);
  }
}
