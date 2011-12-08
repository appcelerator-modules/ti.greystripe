/**
 * Ti.Greystripe Module
 * Copyright (c) 2010-2011 by Appcelerator, Inc. All Rights Reserved.
 * Please see the LICENSE included with this distribution for details.
 */
package ti.greystripe;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollModule;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.titanium.TiApplication;

import com.greystripe.android.sdk.GSSDK;

@Kroll.module(name = "Greystripe", id = "ti.greystripe")
public class GreystripeModule extends KrollModule {
	public GreystripeModule() {
		super();
	}

	@Kroll.method
	public void setup(KrollDict args) {
		Constants.setApplicationId(args.containsKey("applicationId") ? args
				.getString("applicationId") : args.getString("applicationID"));

		Constants.setSDK(GSSDK.initialize(TiApplication.getInstance(),
				Constants.getApplicationId()));
	}
}
