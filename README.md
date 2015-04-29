IsTablet Cordova/Phonegap Plugin
=================================

This Cordova/PhoneGap Plugin indicates whether the current Android or iOS device is a tablet.

This is for Cordova/Phonegap 3+

## Contents

* [Installing](#installing)
* [Using the plugin](#using-the-plugin)
* [Example project](#example-project)
* [Credits](#credits)
* [License](#license)
 
# Installing

## Automatically with CLI / Plugman

The plugin can be installed with [Cordova Plugman](https://github.com/apache/cordova-plugman) and the [PhoneGap CLI](http://docs.phonegap.com/en/edge/guide_cli_index.md.html).

Here's how to install it with the CLI:


    $ cordova plugin add uk.co.workingedge.phonegap.plugin.istablet

OR

    $ phonegap plugin add uk.co.workingedge.phonegap.plugin.istablet


# Using the plugin
The plugin runs automatically when the app starts and sets an `isTablet` boolean property on the `window` object, so to use the plugin, simple inspect the value of `window.isTablet`.

For example:

    alert("This device is "+(window.isTablet?'':'NOT')+" a tablet");
    
# Example project

https://github.com/dpa99c/phonegap-istablet-example

The above link is to an example Cordova 3 project which demonstrates usage of this plugin.
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