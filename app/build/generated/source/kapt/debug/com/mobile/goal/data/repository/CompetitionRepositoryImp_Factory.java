// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.data.repository;

import com.mobile.goal.data.remote.Api;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class CompetitionRepositoryImp_Factory implements Factory<CompetitionRepositoryImp> {
  private final Provider<Api> apiProvider;

  public CompetitionRepositoryImp_Factory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public CompetitionRepositoryImp get() {
    return newInstance(apiProvider.get());
  }

  public static CompetitionRepositoryImp_Factory create(Provider<Api> apiProvider) {
    return new CompetitionRepositoryImp_Factory(apiProvider);
  }

  public static CompetitionRepositoryImp newInstance(Api api) {
    return new CompetitionRepositoryImp(api);
  }
}
