//
//  GSAdView.h
//  GreystripeSDK
//
//  Copyright 2010 Greystripe, Inc. All rights reserved.
//

#import <Foundation/Foundation.h>

#import "GreystripeDelegate.h"

@class GSAdSlotDescription;
@class GSAdViewInternal;

/**
 * Core view class encapsulating a single ad view.
 *
 * GSAdViews are lazily instantiated and managed within the GSAdEngine.
 */
@interface GSAdView : UIView {
	GSAdViewInternal * m_adViewInternal;
}

/**
 * Return the GSAdView corresponding to the already-registered slot of the 
 * given name. If a GSAdView instance for the given slot name has not yet been
 * created, one will be created at this time and cached within the GSAdEngine
 * so that all future calls to this method will return the same GSAdView 
 * instance. If no slot with the given name has yet been registered with the
 * GSAdManager, an exception will be thrown.
 *
 * @param a_name		the name of the ad slot
 * @param a_delegate	the delegate object which will be informed of ad-related
 *						events
 */
+ (id)adViewForSlotNamed:(NSString *)a_name delegate:(id<GreystripeDelegate>)a_delegate;

@end
