// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.di;

import com.mobile.goal.data.remote.Api;
import com.mobile.goal.domain.repository.WorkoutRepository;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RepositoryModule_ProvideWorkoutRepositoryFactory implements Factory<WorkoutRepository> {
  private final Provider<Api> apiProvider;

  public RepositoryModule_ProvideWorkoutRepositoryFactory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public WorkoutRepository get() {
    return provideWorkoutRepository(apiProvider.get());
  }

  public static RepositoryModule_ProvideWorkoutRepositoryFactory create(Provider<Api> apiProvider) {
    return new RepositoryModule_ProvideWorkoutRepositoryFactory(apiProvider);
  }

  public static WorkoutRepository provideWorkoutRepository(Api api) {
    return Preconditions.checkNotNullFromProvides(RepositoryModule.INSTANCE.provideWorkoutRepository(api));
  }
}
