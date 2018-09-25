package com.bebound.template;

import android.app.Activity;
import android.content.pm.PackageManager;
import android.support.v4.app.ActivityCompat;
import android.support.v4.content.ContextCompat;

public class PermissionsDelegate {

    private static final int REQUEST_CODE = 1983;
    private final Activity activity;

    private String[] permissions = {
            android.Manifest.permission.SEND_SMS,
            android.Manifest.permission.READ_SMS,
            android.Manifest.permission.RECEIVE_SMS,
            android.Manifest.permission.READ_PHONE_STATE
    };

    PermissionsDelegate(Activity activity) {
        this.activity = activity;
    }

    public boolean hasPermissions() {
        boolean shouldAsk = false;

        for (String permission : permissions) {
            if (ContextCompat.checkSelfPermission(activity, permission) != PackageManager.PERMISSION_GRANTED) {
                shouldAsk = true;
                break;
            }
        }

        return !shouldAsk;
    }

    public void requestPermissions() {
        ActivityCompat.requestPermissions(
                activity,
                permissions,
                REQUEST_CODE
        );
    }

    public boolean resultGranted(int requestCode,
                                 int[] grantResults) {
        return requestCode == REQUEST_CODE
                && grantResults.length >= 1;
    }
}
