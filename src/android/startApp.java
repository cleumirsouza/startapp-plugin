package com.android.startapp;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;

import android.content.Intent;
import android.net.Uri;

/**
 * This class provides access to vibration on the device.
 */
public class startApp extends CordovaPlugin {

    /**
     * Constructor.
     */
    public startApp() { }

    /**
     * Executes the request and returns PluginResult.
     *
     * @param action            The action to execute.
     * @param args              JSONArray of arguments for the plugin.
     * @param callbackContext   The callback context used when calling back into JavaScript.
     * @return                  True when the action was valid, false otherwise.
     */
    public boolean execute(String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
        if (action.equals("start")) {
            this.start(args, callbackContext);
        }

        return true;
    }

    // Method to start native app
    public void start(JSONArray args, CallbackContext callback) {

        String intentAppName = null;
        Intent intent;

        try {
                intentAppName = args.getString(0);

                if(intentAppName.toString().equalsIgnoreCase("android.intent.category.APP_GALLERY")) {
                    intent = new Intent();
                    intent.setAction(android.content.Intent.ACTION_VIEW);
                    intent.setType("image/*");
                    intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                } else {
                    intent = new Intent(intentAppName);
                }

                this.cordova.getActivity().startActivity(intent);
                callback.success();

        } catch (Exception e) {
            callback.error("intent: " + e.toString());
        }
    }

}
