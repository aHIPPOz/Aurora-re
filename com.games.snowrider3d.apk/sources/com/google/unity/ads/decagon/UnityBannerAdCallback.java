package com.google.unity.ads.decagon;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
/* loaded from: classes2.dex */
public interface UnityBannerAdCallback extends UnityPaidEventListener {
    void onAdClicked();

    void onAdClosed();

    void onAdFailedToLoad(LoadAdError error);

    void onAdImpression();

    void onAdLoaded();

    void onAdOpened();
}
