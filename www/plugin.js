var exec = require('cordova/exec');

var PLUGIN_NAME = 'cdvRootBeer';

var cdvRootBeer = {
  isRooted: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'isRooted', []);
  },
  isRootedWithoutBusyBoxCheck: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'isRootedWithoutBusyBoxCheck', []);
  },
  isSelinuxFlagInEnabled: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'isSelinuxFlagInEnabled', []);
  },
  detectRootManagementApps: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'detectRootManagementApps', []);
  },
  detectPotentiallyDangerousApps: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'detectPotentiallyDangerousApps', []);
  },
  detectTestKeys: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'detectTestKeys', []);
  },
  detectRootCloakingApps: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'detectRootCloakingApps', []);
  },
  checkForBusyBoxBinary: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'checkForBusyBoxBinary', []);
  },
  checkForSuBinary: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'checkForSuBinary', []);
  },
  checkSuExists: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'checkSuExists', []);
  },
  checkForRWPaths: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'checkForRWPaths', []);
  },
  checkForDangerousProps: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'checkForDangerousProps', []);
  },
  checkForRootNative: function (cb, err) {
    exec(cb, err, PLUGIN_NAME, 'checkForRootNative', []);
  },
  detectTestKeys: function (cb,err) {
    exec(cb, err, PLUGIN_NAME, 'detectTestKeys', []);
  }
};

module.exports = cdvRootBeer;