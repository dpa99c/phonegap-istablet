cordova.commandProxy.add("IsTablet", {
  isTabletDevice: function(successCallback, errorCallback, input) {
    try {
      var iAmTablet = false;
      var family = Windows.System.Profile.AnalyticsInfo.versionInfo.deviceFamily;
      if (family == "Windows.Desktop" || family == "Windows.Team") {
        // for the purposes of this plugin, anything that is not phone is really a tablet ...
        iAmTablet = true;
        // if you really just care about mouse input instead:
        // iAmTablet = (Windows.UI.ViewManagement.UIViewSettings.getForCurrentView().userInteractionMode != Windows.UI.ViewManagement.UserInteractionMode.mouse);
      }
      successCallback(iAmTablet);
    } catch(e) {
      errorCallback(e);
    }
  }
});
