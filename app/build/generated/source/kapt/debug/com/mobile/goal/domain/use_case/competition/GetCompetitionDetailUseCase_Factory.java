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
public final class GetCompetitionDetailUseCase_Factory implements Factory<GetCompetitionDetailUseCase> {
  private final Provider<CompetitionRepository> repositoryProvider;

  public GetCompetitionDetailUseCase_Factory(Provider<CompetitionRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public GetCompetitionDetailUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static GetCompetitionDetailUseCase_Factory create(
      Provider<CompetitionRepository> repositoryProvider) {
    return new GetCompetitionDetailUseCase_Factory(repositoryProvider);
  }

  public static GetCompetitionDetailUseCase newInstance(CompetitionRepository repository) {
    return new GetCompetitionDetailUseCase(repository);
  }
}
