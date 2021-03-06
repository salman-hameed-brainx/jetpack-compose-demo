// Generated by Dagger (https://dagger.dev).
package com.mobile.goal.data.local.data_store;

import android.content.Context;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import javax.inject.Provider;

@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes"
})
public final class SettingsDataStore_Factory implements Factory<SettingsDataStore> {
  private final Provider<Context> appContextProvider;

  public SettingsDataStore_Factory(Provider<Context> appContextProvider) {
    this.appContextProvider = appContextProvider;
  }

  @Override
  public SettingsDataStore get() {
    return newInstance(appContextProvider.get());
  }

  public static SettingsDataStore_Factory create(Provider<Context> appContextProvider) {
    return new SettingsDataStore_Factory(appContextProvider);
  }

  public static SettingsDataStore newInstance(Context appContext) {
    return new SettingsDataStore(appContext);
  }
}
