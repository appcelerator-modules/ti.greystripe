# greystripe Module

## Description

Module which provides access to the greystripe ad delivery system.

## Accessing the greystripe Module

To access this module from JavaScript, you would do the following:

	var greystripe = require("ti.greystripe");

The greystripe variable is a reference to the Module object.	

## Reference

## Functions

### ti.greystripe.setup({...})

Sets up and initializes the greystripe ad delivery system.  Takes one argument,
a dictionary with properties:

applicationId[string]: Your application's ID in the greystripe system
adSlots[array]: An array of available slots, composed of {size:...,name:...} dictionaries.

### ti.greystripe.createView({...})

Creates and returns a [ti.greystripe.View][] object.

## Properties

### ti.greystripe.BANNER

A size constant for a banner-sized ad.

### ti.greystripe.IPHONE_FULLSCREEN

A size constant for a fullscreen ad on iPhone/iPod.

### ti.greystripe.IPAD_MEDIUM_RECTANGLE

A size constant for a rectangular ad on iPad.

### ti.greystripe.IPAD_LEADERBOARD

A size constant for a leaderboard-sized ad on iPad.

### ti.greystripe.IPAD_WIDE_SKYSCRAPER

A size constant for a large ad on iPad.

## Usage

See example

## Author

Jeff Haynie <jhaynie@appcelerator.com>, Appcelerator Inc.

## License

TODO: Enter your license/legal information here.

[ti.greystripe.View]: view.html

