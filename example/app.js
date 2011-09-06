var window = Ti.UI.createWindow({ backgroundColor: '#fff' });

Titanium.Greystripe = Ti.Greystripe = require('ti.greystripe');

Ti.Greystripe.setup({
    applicationId: '<<< YOUR APP ID HERE >>>', // Sign up at https://developer.greystripe.com/user/new
    adSlots: [
        { size: Ti.Greystripe.BANNER, name: 'ad1'}
    ]
});
var view = Ti.Greystripe.createView({
    name: 'ad1',
    height: 48,
    top: 0, left: 0, right: 0
});
window.add(view);

// You can add your device ID (including the simulators!) to Greystripe to serve up test or production ads
Ti.API.info(Ti.Platform.macaddress);

window.open();