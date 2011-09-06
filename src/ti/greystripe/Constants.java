/**
 * Ti.Greystripe Module
 * Copyright (c) 2010-2011 by Appcelerator, Inc. All Rights Reserved.
 * Please see the LICENSE included with this distribution for details.
 */
package ti.greystripe;

import org.appcelerator.titanium.util.TiConfig;

import com.greystripe.android.sdk.GSSDK;

public class Constants {
	public static final String LCAT = "GreystripeModule";
	public static final boolean DBG = TiConfig.LOGD;

	private static String _applicationId;

	public static void setApplicationId(String value) {
		_applicationId = value;

	}

	public static String getApplicationId() {
		return _applicationId;
	}

	private static GSSDK _sdk;

	public static void setSDK(GSSDK value) {
		_sdk = value;
	}

	public static GSSDK getSDK() {
		return _sdk;
	}

}