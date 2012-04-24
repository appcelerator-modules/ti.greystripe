# Ti.Greystripe Module

## Description

Module which provides access to the greystripe ad delivery system.

## WARNING

On first launch, Greystripe can take 10-30 seconds before it is ready to display ads. Their SDK downloads
ads in the background and updates itself, and this process can take time.
 
## Getting Started

View the [Using Titanium Modules](http://docs.appcelerator.com/titanium/2.0/#!/guide/Using_Titanium_Modules) document for instructions on getting
started with using this module in your application.

Note that there may be two versions of this module available to you, one for use with pre-1.8.0.1 SDKs and one for use with 1.8.0.1 or newer.
In your tiapp.xml file, make sure that you specify the version of the module that corresponds to the version of Titanium Mobile SDK that you are targeting.
For Appcelerator modules, specify the 1.X version of the module if building for versions of Titanium Mobile SDK prior to 1.8.0.1 and specify the 2.X version of the module if
building for versions of Titanium Mobile SDK 1.8.0.1 or newer.

## Accessing the Ti.Greystripe Module

To access this module from JavaScript, you would do the following:

	var Greystripe = require('ti.greystripe');

## Properties

### Ti.Greystripe.isAdReady

Whether or not there is an ad ready to be displayed.

## Methods

### Ti.Greystripe.setup({...})

Sets up and initializes the greystripe ad delivery system.  Takes one argument,
a dictionary with properties:

* applicationId[string]: Your application's ID in the greystripe system

### Ti.Greystripe.createView({...})

Creates and returns a [Ti.Greystripe.View][] object.

## Usage

See example.

## Author

Dawson Toth

## Module History

View the [change log](changelog.html) for this module.

## Feedback and Support

Please direct all questions, feedback, and concerns to [info@appcelerator.com](mailto:info@appcelerator.com?subject=Android%20Greystripe%20Module).

## License

Copyright(c) 2010-2011 by Appcelerator, Inc. All Rights Reserved. Please see the LICENSE file included in the distribution for further details.

[Ti.Greystripe.View]: view.html

