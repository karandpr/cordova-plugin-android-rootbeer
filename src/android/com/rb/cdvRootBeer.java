/**
 */
package com.rb;

import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaInterface;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaWebView;
import org.apache.cordova.PluginResult;
import org.apache.cordova.PluginResult.Status;
import org.json.JSONObject;
import org.json.JSONArray;
import org.json.JSONException;

import android.util.Log;
import com.scottyab.rootbeer.RootBeer;
import com.scottyab.rootbeer.util.Utils;
import java.util.Date;

public class cdvRootBeer extends CordovaPlugin {
  private static final String TAG = "cdvRootBeer";

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
    super.initialize(cordova, webView);
    Log.d(TAG, "Initializing cdvRootBeer");    
  }

  public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
    RootBeer rootBeer = new RootBeer(this.cordova.getActivity().getApplicationContext());
    switch (action) {
      case "isRooted":
        try {
          callbackContext.success(rootBeer.isRooted() ? "true" : "false");
          Log.i(TAG, "isRooted  " + (rootBeer.isRooted()));
        } catch (Exception e) {
          Log.e(TAG, "Error in isRooted" + e);
          callbackContext.error("false");
        }
        break;
        case "isRootedWithoutBusyBoxCheck":
        try {
          callbackContext.success(rootBeer.isRootedWithoutBusyBoxCheck() ? "true" : "false");
          Log.i(TAG, "Rooted without Busybox " + (rootBeer.isRootedWithoutBusyBoxCheck() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "isSelinuxFlagInEnabled":
        try {
          callbackContext.success(Utils.isSelinuxFlagInEnabled() ? "true" : "false");
          Log.i(TAG, "SELinux Flag " + (Utils.isSelinuxFlagInEnabled() ? "Disabled" : "Enabled"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "detectRootManagementApps":
        try {
          callbackContext.success(rootBeer.detectRootManagementApps() ? "true" : "false");
          Log.i(TAG, "RootManagement Apps " + (rootBeer.detectRootManagementApps() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "detectPotentiallyDangerousApps":
        try {
          callbackContext.success(rootBeer.detectPotentiallyDangerousApps() ? "true" : "false");
          Log.i(TAG, "Potentially Dangerous Apps " + (rootBeer.detectPotentiallyDangerousApps() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "detectRootCloakingApps":
        try {
          callbackContext.success(rootBeer.detectRootCloakingApps() ? "true" : "false");
          Log.i(TAG, "Root cloaking apps " + (rootBeer.detectRootCloakingApps() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "checkForBusyBoxBinary":
        try {
          callbackContext.success(rootBeer.checkForBusyBoxBinary() ? "true" : "false");
          Log.i(TAG, "Busybox Check " + (rootBeer.checkForBusyBoxBinary() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "checkForSuBinary":
        try {
          callbackContext.success(rootBeer.checkForSuBinary() ? "true" : "false");
          Log.i(TAG, "SU Binary Check " + (rootBeer.checkForSuBinary() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "checkSuExists":
        try {
          callbackContext.success(rootBeer.checkSuExists() ? "true" : "false");
          Log.i(TAG, "SU Binary Exists " + (rootBeer.checkSuExists() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "checkForRWPaths":
        try {
          callbackContext.success(rootBeer.checkForRWPaths() ? "true" : "false");
          Log.i(TAG, "RW Paths " + (rootBeer.checkSuExists() ? "detected" : "not detected"));          
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "checkForDangerousProps":
        try {
          callbackContext.success(rootBeer.checkForDangerousProps() ? "true" : "false");
          Log.i(TAG, "Potentially Dangerous Props " + (rootBeer.checkForDangerousProps() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "checkForRootNative":
        try {
          callbackContext.success(rootBeer.checkForRootNative() ? "true" : "false");
          Log.i(TAG, "Native Root " + (rootBeer.checkForRootNative() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        case "detectTestKeys":
        try {
          callbackContext.success(rootBeer.detectTestKeys() ? "true" : "false");
          Log.i(TAG, "Detect Test Keys " + (rootBeer.detectTestKeys() ? "detected" : "not detected"));
        } catch (Exception e) {
          Log.e(TAG, "Error" + e);
          callbackContext.error("false");
        }
        break;
        default:
        callbackContext.error("false"); 

    }
    return true;
  }

}