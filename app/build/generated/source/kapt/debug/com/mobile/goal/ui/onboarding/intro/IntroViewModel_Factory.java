// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.ui.onboarding.intro;

import com.mobile.goal.data.local.data_store.SettingsDataStore;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class IntroViewModel_Factory implements Factory<IntroViewModel> {
  private final Provider<SettingsDataStore> settingsDataStoreProvider;

  public IntroViewModel_Factory(Provider<SettingsDataStore> settingsDataStoreProvider) {
    this.settingsDataStoreProvider = settingsDataStoreProvider;
  }

  @Override
  public IntroViewModel get() {
    return newInstance(settingsDataStoreProvider.get());
  }

  public static IntroViewModel_Factory create(
      Provider<SettingsDataStore> settingsDataStoreProvider) {
    return new IntroViewModel_Factory(settingsDataStoreProvider);
  }

  public static IntroViewModel newInstance(SettingsDataStore settingsDataStore) {
    return new IntroViewModel(settingsDataStore);
  }
}