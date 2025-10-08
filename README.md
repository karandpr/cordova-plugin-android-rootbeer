# Cordova RootBeer

This is a simple wrapper plugin for RootBeer library by @scottyab for android. You can access 13 functions of the library. 

Link to Scott's <a href="https://github.com/scottyab/rootbeer">library </a>.

## Installation

Cordova: 
```
cordova plugin add cordova-plugin-android-rootbeer
```

Ionic:
```
ionic cordova plugin add cordova-plugin-android-rootbeer
```
## Functions


### Syntax

```
window.cdvRootBeer.isRooted(successCallback, errorCallback);
```

### Success Callbacks
The responses on successCallbacks are either true or false. NB, these are string values not boolean values. e.g.
```
window.cdvRootBeer.isRooted(function(res){
// res will be true for rooted device.
// res will be false for non-rooted device.
}, errorCallback)
```

| Methods                        | True  | False |
| ------------------------------ | :---: | ----: |
| checkForBusyBoxBinary          | true  | false |
| checkForSuBinary               | true  | false |
| checkSuExists                  | true  | false |
| checkForRWPaths                | true  | false |
| checkForDangerousProps         | true  | false |
| checkForRootNative             | true  | false |
| detectRootCloakingApps         | true  | false |
| detectRootManagementApps       | true  | false |
| detectPotentiallyDangerousApps | true  | false |
| detectTestKeys                 | true  | false |
| isRooted                       | true  | false |
| isRootedWithoutBusyBoxCheck    | true  | false |

### Deprecated method post version 1.1.0

| isSelinuxFlagInEnabled         | true  | false |

## Method Description

***
<strong>checkForBusyBoxBinary:</strong> This essentially checks for busybox binary in known locations like /bin , /xbin & /sbin. 
***

<strong>checkForSuBinary :</strong> Checks for su binary in known locations.
***

<strong>checkSuExists :</strong> Checks for native root in a different manner. 
***

<strong>checkForRWPaths :</strong> Checks if paths are writable . Especially important if you have /system is rw.
***

<strong>checkForDangerousProps:</strong> Checks for dangerous props in build. Custom ROMs include some props which enable ease of rooting. Especially ro.debuggable.
***

<strong>checkForRootNative : </strong> Yet another root check. Checks for root natively, which is harder against root cloaks.
***

<strong>detectRootCloakingApps : </strong>Detects Root cloaking apps like rootcloak, & hide my root .Also Xposed and Substrate which are frameworks which help in cloaking. 
***

<strong>detectRootManagementApps: </strong> Detects Root management Apps like SuperSU, Superuser (noshufou),Superuser (koush)
***

<strong>detectPotentiallyDangerousApps : </strong>Detect apps like Lucky Patcher ,ROM Manager & App Quarantine. The list is quite limited though.
***

<strong>detectTestKeys :</strong> Detects if ROM build has test-keys 
***

<strong>isSelinuxFlagInEnabled : </strong>Checks if SE Linux is Enforcing. Thats it.
***

<strong>isRooted: </strong>IsRooted is amalgamation of the methods above.
* detectRootManagementApps 
* detectPotentiallyDangerousApps
* checkForSuBinary
* checkForBusyBoxBinary
* checkForDangerousProps
* checkForDangerousProps
* detectTestKeys 
* checkSuExists
* checkForRootNative
***

<strong>isRootedWithoutBusyBoxCheck : </strong>Same as above , just without busybox check. Some phone manufacturers bundle busybox with their firmware.

### Issues
Post the issues related to this library <a href="https://github.com/karandpr/cordova-plugin-android-rootbeer/issues"> here </a>. Do provide the device details as below. 
* Device name & manufacturer
* Android version 
* Custom OS version (Lineage , MIUI , Exodus, DU)
