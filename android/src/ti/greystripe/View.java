/**
 * Ti.Greystripe Module
 * Copyright (c) 2010-2011 by Appcelerator, Inc. All Rights Reserved.
 * Please see the LICENSE included with this distribution for details.
 */
package ti.greystripe;

import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;
import org.appcelerator.titanium.TiApplication;

import com.greystripe.android.sdk.BannerListener;
import com.greystripe.android.sdk.BannerView;

import android.view.Gravity;

public class View extends TiUIView {

	private BannerView _adview;

	public View(TiViewProxy proxy) {
		super(proxy);
		_adview = createPlayer();
		setNativeView(_adview);
		_adview.refresh();
	}

	private BannerView createPlayer() {
		BannerView adview = new BannerView(TiApplication.getAppCurrentActivity());
		adview.setGravity(Gravity.CENTER);
		adview.addListener(new BannerListener() {
			@Override
			public void onReceivedAd(BannerView arg) {
				proxy.fireEvent("success", null);
			}

			@Override
			public void onFailedToReceiveAd(BannerView arg) {
				proxy.fireEvent("fail", null);
			}
		});
		return adview;
	}

	public BannerView getPlayer() {
		return _adview;
	}

	public void refresh() {
		_adview.refresh();
	}

}