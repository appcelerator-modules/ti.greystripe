# Ti.Greystripe Module

## Description

Module which provides access to the greystripe ad delivery system.

## Getting Started

View the [Configuring Apps to Use Modules](https://wiki.appcelerator.org/display/guides/Configuring+Apps+to+Use+Modules) page for instructions on getting
started with using this module in your application.

## Accessing the Ti.Greystripe Module

To access this module from JavaScript, you would do the following:

	var Greystripe = require('ti.greystripe');

## Functions

### Ti.Greystripe.setup({...})

Sets up and initializes the greystripe ad delivery system.  Takes one argument,
a dictionary with properties:

* applicationId[string]: Your application's ID in the greystripe system
* adSlots[array]: An array of available slots, composed of {size:...,name:...} dictionaries.

### Ti.Greystripe.createView({...})

Creates and returns a [Ti.Greystripe.View][] object.

## Properties

### Ti.Greystripe.BANNER

A size constant for a banner-sized (320x48) ad.

### Ti.Greystripe.IPHONE_FULLSCREEN

A size constant for a fullscreen ad on iPhone/iPod.

### Ti.Greystripe.IPAD_MEDIUM_RECTANGLE

A size constant for a rectangular (300x250) ad on iPad.

### Ti.Greystripe.IPAD_LEADERBOARD

A size constant for a wide (728x90) ad on iPad

### Ti.Greystripe.IPAD_WIDE_SKYSCRAPER

A size constant for a tall (160x600) ad on iPad.

## Usage

See example.

## Author

Jeff Haynie

## Module History

View the [change log](changelog.html) for this module.

## Feedback and Support

Please direct all questions, feedback, and concerns to [info@appcelerator.com](mailto:info@appcelerator.com?subject=iOS%20Greystripe%20Module).

## License

Copyright(c) 2010-2011 by Appcelerator, Inc. All Rights Reserved. Please see the LICENSE file included in the distribution for further details.

[Ti.Greystripe.View]: view.html

