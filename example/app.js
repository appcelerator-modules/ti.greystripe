/**
 * We'll demonstrate how to display a banner ad with the Greystripe module.
 * WARNING: On first launch, Greystripe can take 10-30 seconds before it is ready to display ads. Their SDK downloads
 * ads in the background and updates itself, and this process can take time.
 */
var win = Ti.UI.createWindow({ backgroundColor: '#fff' });

/**
 * First, let's set up the module. We need to tell it our applicationId, which is available
 * at the following URL: https://developer.greystripe.com/user/new
 */
var Greystripe = require('ti.greystripe');
Greystripe.setup({
    applicationId: '<<< YOUR APP ID HERE >>>'
});

var adNotReady = Ti.UI.createLabel({
	text: 'Ad Not Ready Yet', textAlign: 'center',
	color: '#000'
});
win.add(adNotReady);

var intervalID = setInterval(checkAd, 1000);

function checkAd() {
    if (!Greystripe.isAdReady) {
        return;
    }
    clearInterval(intervalID);
    win.remove(adNotReady);

    /**
     * Now let's add a banner ad at the top of our app.
     */
    var view = Greystripe.createView({
        height: '48dp',
        top: 0, left: 0, right: 0
    });
    win.add(view);

    /**
     * We can listen for certain events on the ad -- "success" and "fail".
     */
    view.addEventListener('success', function () {
        alert('Displayed the ad!');
    });
    view.addEventListener('fail', function () {
        alert('The ad could not be displayed!');
    });
}

/**
 * Finally, we'll open the window and log the current device's MAC Address. Note that you
 * can use use this MAC Address to set your device to receive test or production ads from
 * Greystripe! Look for the "Devices" tab on Greystripe's website to find out more.
 */
Ti.API.info(Ti.Platform.macaddress);
win.open();