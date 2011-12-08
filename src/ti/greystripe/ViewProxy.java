/**
 * Ti.Greystripe Module
 * Copyright (c) 2010-2011 by Appcelerator, Inc. All Rights Reserved.
 * Please see the LICENSE included with this distribution for details.
 */
package ti.greystripe;

import org.appcelerator.kroll.annotations.Kroll;

import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

@Kroll.proxy(creatableInModule = GreystripeModule.class)
public class ViewProxy extends TiViewProxy {

	private View _view;

	public ViewProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		_view = new View(this);
		_view.getLayoutParams().autoFillsHeight = true;
		_view.getLayoutParams().autoFillsWidth = true;
		return _view;
	}

	@Kroll.method(runOnUiThread = true)
	public void refresh() {
		if (_view != null)
			_view.refresh();
	}
}