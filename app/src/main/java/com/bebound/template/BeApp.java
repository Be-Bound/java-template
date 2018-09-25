package com.bebound.template;

import android.app.Application;

import com.bebound.sdk.BeBound;
import com.bebound.sdk.config.BeAppConfig;


/**
 * Instance of Application() in order to create a BeAppConfig.
 * The name of this class has no importance.
 * Update of the Android Manifest is necessary:
 *      <application
 *          android:name=".BeApp"
 *          (...)
 *      </application>
 */
public class BeApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        /*
          Initiate the SDK.
          @param context       application context.
          @param BeAppConfig   implementation.
         */
        BeBound.init(this, new BeAppConfig() {
            @Override
            public long getBeAppId() {
                return 113;
            }

            @Override
            public int getBeAppManifestResId() {
                return R.xml.beappmanifest;
            }
        });
    }
}
