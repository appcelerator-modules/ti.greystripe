var window = Ti.UI.createWindow({ backgroundColor: '#fff' });

var Greystripe = require('ti.greystripe');

Greystripe.setup({
    applicationId: '<<< YOUR APP ID HERE >>>', // Sign up at https://developer.greystripe.com/user/new
    adSlots: [
        { size: Greystripe.BANNER, name: 'ad1'}
    ]
});
var view = Greystripe.createView({
    name: 'ad1',
    height: 48,
    top: 0, left: 0, right: 0
});
window.add(view);

window.open();