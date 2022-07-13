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
public final class EditAccountUseCase_Factory implements Factory<EditAccountUseCase> {
  private final Provider<UserRepository> repositoryProvider;

  public EditAccountUseCase_Factory(Provider<UserRepository> repositoryProvider) {
    this.repositoryProvider = repositoryProvider;
  }

  @Override
  public EditAccountUseCase get() {
    return newInstance(repositoryProvider.get());
  }

  public static EditAccountUseCase_Factory create(Provider<UserRepository> repositoryProvider) {
    return new EditAccountUseCase_Factory(repositoryProvider);
  }

  public static EditAccountUseCase newInstance(UserRepository repository) {
    return new EditAccountUseCase(repository);
  }
}
