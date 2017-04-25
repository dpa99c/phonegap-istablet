IsTablet Cordova/Phonegap Plugin [![Latest Stable Version](https://img.shields.io/npm/v/uk.co.workingedge.phonegap.plugin.istablet.svg)](https://www.npmjs.com/package/uk.co.workingedge.phonegap.plugin.istablet) [![Total Downloads](https://img.shields.io/npm/dt/uk.co.workingedge.phonegap.plugin.istablet.svg)](https://npm-stat.com/charts.html?package=uk.co.workingedge.phonegap.plugin.istablet)
=================================

This Cordova/PhoneGap Plugin indicates whether the current device is a tablet.

Supported platforms: Android, iOS, Windows 10 Mobile

The plugin is registered on [npm](https://www.npmjs.com/package/uk.co.workingedge.phonegap.plugin.istablet) as `uk.co.workingedge.phonegap.plugin.istablet`

<!-- DONATE -->
[![donate](https://www.paypalobjects.com/en_US/i/btn/btn_donateCC_LG_global.gif)](https://www.paypal.com/cgi-bin/webscr?cmd=_s-xclick&hosted_button_id=ZRD3W47HQ3EMJ)

I dedicate a considerable amount of my free time to developing and maintaining this Cordova plugin, along with my other Open Source software.
To help ensure this plugin is kept updated, new features are added and bugfixes are implemented quickly, please donate a couple of dollars (or a little more if you can stretch) as this will help me to afford to dedicate time to its maintenance. Please consider donating if you're using this plugin in an app that makes you money, if you're being paid to make the app, if you're asking for new features or priority bug fixes.
<!-- END DONATE -->

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

For example, to install for the Android platform

    $ plugman install --plugin=uk.co.workingedge.phonegap.plugin.istablet --platform=android --project=platforms/android --plugins_dir=plugins

## PhoneGap Build
Add the following xml to your config.xml to use the latest version of this plugin from [npm](https://www.npmjs.com/package/uk.co.workingedge.phonegap.plugin.istablet):

    <gap:plugin name="uk.co.workingedge.phonegap.plugin.istablet" source="npm" />


# Using the plugin
The plugin runs automatically when the app starts and sets an `isTablet` boolean property on the `window` object, so to use the plugin, simple inspect the value of `window.isTablet`.

For example:

    alert("This device is "+(window.isTablet?'':'NOT')+" a tablet");
    
# Example project

The [example Cordova project](https://github.com/dpa99c/phonegap-istablet-example) demonstrates usage of this plugin.

# Credits

Android plugin code based on [this answer on stackoverflow](http://stackoverflow.com/a/18740974/777265) by [Pawan M](http://stackoverflow.com/users/648030/pawan-m)

[Timon Orawski](https://github.com/timonorawski) for Windows implementation.

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