package com.bebound.template.request.sendtext.listeners;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import com.bebound.sdk.engine.listener.request.OnFailedListener;
import com.bebound.sdk.model.request.Request;
import com.bebound.sdk.model.request.Response;
import com.bebound.template.R;

public class MyOnFailListener {

    /**
     * OnFailedListener implementation
     */
    public static OnFailedListener getListener() {
        return new OnFailedListener() {

            /**
             * @param context the app context
             * @param request request sent
             * @param requestStatusCode see more about requestStatusCode at https://doc.be-bound.com/docs/list-of-errors
             * @param requestStatusMessage see more about requestStatusMessage at https://doc.be-bound.com/docs/list-of-errors
             */
            @Override
            public void onRequestFailed(Context context, Request request, int requestStatusCode, String requestStatusMessage) {
                Log.e(MyOnFailListener.class.getSimpleName(), "onRequestFailed");
                Toast.makeText(context, context.getString(R.string.toast_fail), Toast.LENGTH_LONG).show();
            }

            /**
             * @param context the app context
             * @param request request sent
             * @param response response received
             * @param responseStatusCode see more about requestStatusCode at https://doc.be-bound.com/docs/list-of-errors
             * @param responseStatusMessage see more about requestStatusMessage at https://doc.be-bound.com/docs/list-of-errors
             */
            @Override
            public void onResponseError(Context context, Request request, Response response, int responseStatusCode, String responseStatusMessage) {
                Log.e(MyOnFailListener.class.getSimpleName(), "onResponseError");
                Toast.makeText(context, context.getString(R.string.toast_fail), Toast.LENGTH_LONG).show();
            }

            /**
             * @param context the app context
             * @param request request sent
             */
            @Override
            public void onTimeout(Context context, Request request) {
                Log.e(MyOnFailListener.class.getSimpleName(), "onTimeout");
                Toast.makeText(context, context.getString(R.string.toast_fail), Toast.LENGTH_LONG).show();
            }
        };
    }
}
