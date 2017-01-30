/*
   Copyright 2015 Dave Alden - http://www.workingedge.co.uk/dave/

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
*/

/**
 * Cordova/Phonegap plugin for Android to determine if current device is a tablet
 * @author Dave Alden <dave@workingedge.co.uk>
 */
package uk.co.workingedge.phonegap.plugin;

import org.json.JSONArray;
import org.json.JSONException;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.util.DisplayMetrics;
import android.util.Log;

import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.PluginResult;


public class IsTablet extends CordovaPlugin {
	private static final String LOG_TAG = "IsTabletPlugin";


	@Override
	public boolean execute(String action, JSONArray args,
			CallbackContext callbackContext) throws JSONException {

		Log.d(LOG_TAG, "Plugin execute called - " + this.toString() );
		Context context=this.cordova.getActivity().getApplicationContext(); 
		boolean result = isTabletDevice(context);
		callbackContext.sendPluginResult(new PluginResult(PluginResult.Status.OK, result));
		return true;
	}

	private boolean isTabletDevice(Context applicationContext) {
	        boolean device_large = ((applicationContext.getResources().getConfiguration().screenLayout &
	                Configuration.SCREENLAYOUT_SIZE_MASK) >=
	                Configuration.SCREENLAYOUT_SIZE_LARGE);

	        if (device_large) {
	            DisplayMetrics metrics = new DisplayMetrics();
	            Activity activity = this.cordova.getActivity();
	            activity.getWindowManager().getDefaultDisplay().getMetrics(metrics);

	            if (metrics.densityDpi == DisplayMetrics.DENSITY_DEFAULT
	                    || metrics.densityDpi == DisplayMetrics.DENSITY_HIGH
	                    || metrics.densityDpi == DisplayMetrics.DENSITY_MEDIUM
	                    || metrics.densityDpi == DisplayMetrics.DENSITY_TV
			    || metrics.densityDpi == DisplayMetrics.DENSITY_XHIGH
	                    || metrics.densityDpi == DisplayMetrics.DENSITY_XXHIGH) {
	                Log.d(LOG_TAG, "Is Tablet Device");
	                return true;
	            }
	        }
	        Log.d(LOG_TAG, "Is NOT Tablet Device");
	        return false;
    }

}
