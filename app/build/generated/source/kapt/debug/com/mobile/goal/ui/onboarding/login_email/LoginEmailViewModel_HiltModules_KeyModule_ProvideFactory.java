// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.ui.onboarding.login_email;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class LoginEmailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static LoginEmailViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(LoginEmailViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final LoginEmailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new LoginEmailViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}