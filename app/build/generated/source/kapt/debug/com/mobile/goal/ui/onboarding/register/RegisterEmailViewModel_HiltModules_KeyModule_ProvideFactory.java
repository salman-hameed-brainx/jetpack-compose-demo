// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.ui.onboarding.register;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class RegisterEmailViewModel_HiltModules_KeyModule_ProvideFactory implements Factory<String> {
  @Override
  public String get() {
    return provide();
  }

  public static RegisterEmailViewModel_HiltModules_KeyModule_ProvideFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static String provide() {
    return Preconditions.checkNotNullFromProvides(RegisterEmailViewModel_HiltModules.KeyModule.provide());
  }

  private static final class InstanceHolder {
    private static final RegisterEmailViewModel_HiltModules_KeyModule_ProvideFactory INSTANCE = new RegisterEmailViewModel_HiltModules_KeyModule_ProvideFactory();
  }
}