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
public final class UserRepositoryImpl_Factory implements Factory<UserRepositoryImpl> {
  private final Provider<Api> apiProvider;

  public UserRepositoryImpl_Factory(Provider<Api> apiProvider) {
    this.apiProvider = apiProvider;
  }

  @Override
  public UserRepositoryImpl get() {
    return newInstance(apiProvider.get());
  }

  public static UserRepositoryImpl_Factory create(Provider<Api> apiProvider) {
    return new UserRepositoryImpl_Factory(apiProvider);
  }

  public static UserRepositoryImpl newInstance(Api api) {
    return new UserRepositoryImpl(api);
  }
}