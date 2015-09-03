IsTablet Cordova/Phonegap Plugin
=================================

This Cordova/PhoneGap Plugin indicates whether the current Android or iOS device is a tablet.

The plugin is registered in the [the Cordova Registry](http://plugins.cordova.io/#/package/uk.co.workingedge.phonegap.plugin.istablet)(Cordova CLI 3/4) and on [npm](https://www.npmjs.com/package/uk.co.workingedge.phonegap.plugin.istablet) (Cordova CLI 5+) as `uk.co.workingedge.phonegap.plugin.istablet`

## Contents

* [Installation](#installation)
* [Using the plugin](#using-the-plugin)
* [Example project](#example-project)
* [Credits](#credits)
* [License](#license)
 
# Installation

## Using the Cordova/Phonegap [CLI](http://docs.phonegap.com/en/edge/guide_cli_index.md.html)

    $ cordova plugin add uk.co.workingedge.phonegap.plugin.istablet
    $ phonegap plugin add uk.co.workingedge.phonegap.plugin.istablet

## Using [Cordova Plugman](https://github.com/apache/cordova-plugman)

    $ plugman install --plugin=uk.co.workingedge.phonegap.plugin.istablet --platform=<platform> --project=<project_path> --plugins_dir=plugins

For example, to install for the Android platform

    $ plugman install --plugin=uk.co.workingedge.phonegap.plugin.istablet --platform=android --project=platforms/android --plugins_dir=plugins

## PhoneGap Build
Add the following xml to your config.xml to use the latest version of this plugin from [the Cordova Registry](http://plugins.cordova.io/#/package/uk.co.workingedge.phonegap.plugin.istablet) :

    <gap:plugin name="uk.co.workingedge.phonegap.plugin.istablet" source="plugins.cordova.io" />

or from [npm](https://www.npmjs.com/package/uk.co.workingedge.phonegap.plugin.istablet):

    <gap:plugin name="uk.co.workingedge.phonegap.plugin.istablet" source="npm" />


# Using the plugin
The plugin runs automatically when the app starts and sets an `isTablet` boolean property on the `window` object, so to use the plugin, simple inspect the value of `window.isTablet`.

For example:

    alert("This device is "+(window.isTablet?'':'NOT')+" a tablet");
    
# Example project

https://github.com/dpa99c/phonegap-istablet-example

The above link is to an example Cordova project which demonstrates usage of this plugin.
The example contains Android and iOS projects, and a compiled [Android APK](https://github.com/dpa99c/phonegap-istablet-example/blob/master/build/IsTablet.apk).

# Credits

Android plugin code based on [this answer on stackoverflow](http://stackoverflow.com/a/18740974/777265) by [Pawan M](http://stackoverflow.com/users/648030/pawan-m)

License
================

The MIT License

Copyright (c) 2014 Working Edge Ltd.

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.