
package com.reactlibrary;

import android.content.pm.PackageManager;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;

public class RNInstalledAppCheckerModule extends ReactContextBaseJavaModule {

  private final ReactApplicationContext reactContext;

  public RNInstalledAppCheckerModule(ReactApplicationContext reactContext) {
    super(reactContext);
    this.reactContext = reactContext;
  }

  @Override
  public String getName() {
    return "RNInstalledAppChecker";
  }
    @ReactMethod
    public void isAppInstalled(String packageName, Callback callback) {
        PackageManager packageManager = getReactApplicationContext().getPackageManager();
        boolean isInstalled;
        try {
            packageManager.getPackageInfo(packageName, PackageManager.GET_ACTIVITIES);
            isInstalled = true;
        } catch (PackageManager.NameNotFoundException e) {
            isInstalled = false;
        }
        callback.invoke(isInstalled);
    }
}