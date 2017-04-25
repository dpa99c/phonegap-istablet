cordova.commandProxy.add("IsTablet", {
  isTabletDevice: function(successCallback, errorCallback, input) {
    /** with input from:
     * http://j4ni.com/blog/?p=260
     * and
     * https://gist.github.com/wagonli/40d8a31bd0d6f0dd7a5d
     **/
    try {
      var iAmTablet = true;
      var family = Windows.System.Profile.AnalyticsInfo.versionInfo.deviceFamily;
      // for the purposes of this plugin, anything that is not phone is really a tablet ...
      if (family == "Windows.Mobile") {
        if (Windows.Foundation.Metadata.ApiInformation.isApiContractPresent("Windows.Phone.PhoneContract", 1)) {
          // could be a phone
          var keyboardCapabilities = new Windows.Devices.Input.KeyboardCapabilities();
          if (keyboardCapabilities.keyboardPresent) {
            // could be running in continuum or phone with keyboard, really need to detect the screen size at this point
            // - but i don't have a continuum phone to test, so calling it a tablet - someone else can improve
            iAmTablet = true;
          } else {
            iAmTablet = false;
          }
        }
      }
      successCallback(iAmTablet);
    } catch(e) {
      errorCallback(e);
    }
  }
});
