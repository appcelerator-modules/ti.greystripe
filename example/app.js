// This is a test harness for your module
// You should do something interesting in this harness 
// to test out the module and to provide instructions 
// to users on how to use it by example.


// open a single window
var window = Ti.UI.createWindow({
  backgroundColor:'white'
});
window.open();


var button = Ti.UI.createButton({
	title:"Scan QR Code",
	width:150,
	height:40,
	top:20
});

window.add(button);

button.addEventListener('click',function()
{
	Titanium.Barcode.capture({
		success: function(event)
		{
			alert("success = "+event.result);
		},
		cancel: function(event)
		{
			alert("cancel");
		},
		error: function(event)
		{
			alert("Error. "+event.message);
		},
		soundURL:"beep-beep.caf"
	});
});
