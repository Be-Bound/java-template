package com.bebound.template.request.sendtext.listeners;

import android.util.Log;
import android.widget.Toast;

import com.bebound.sdk.engine.listener.request.OnSuccessListener;
import com.bebound.template.R;

public class MyOnSuccessListener {

    /**
     * OnSuccessListener implementation
     */
    public static OnSuccessListener getListener() {
        return (context, request, response) -> {

            Log.d(MyOnSuccessListener.class.getSimpleName(), "The request was a success");

            /* NOTE: Get the response value by using the type and key associated to the response
            in the Be-App Manifest. */
            int length = response.getParameters().getInt("length", 0);

            // NOTE: length would be 0 if the response doesn't contains data.
            if (length == 0) {
                 Log.d(MyOnSuccessListener.class.getSimpleName(), "But the request had some issue. It doesn't contains --length--");
                 Toast.makeText(context, context.getString(R.string.toast_success, length), Toast.LENGTH_LONG).show();
            } else {
                 Toast.makeText(context, context.getString(R.string.toast_success, length), Toast.LENGTH_LONG).show();
            }
        };
    }
}
