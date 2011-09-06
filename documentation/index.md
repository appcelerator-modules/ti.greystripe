# Ti.Greystripe Module

## Description

Module which provides access to the greystripe ad delivery system.

## WARNING

On first launch, Greystripe can take 10-30 seconds before it is ready to display ads. Their SDK downloads
ads in the background and updates itself, and this process can take time.
 
## Accessing the Ti.Greystripe Module

To access this module from JavaScript, you would do the following:

	Titanium.Greystripe = Ti.Greystripe = require("ti.greystripe");

## Functions

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

## Feedback and Support

Please direct all questions, feedback, and concerns to [info@appcelerator.com](mailto:info@appcelerator.com?subject=Android%20Greystripe%20Module).

## License

Copyright(c) 2010-2011 by Appcelerator, Inc. All Rights Reserved. Please see the LICENSE file included in the distribution for further details.

[Ti.Greystripe.View]: view.html

