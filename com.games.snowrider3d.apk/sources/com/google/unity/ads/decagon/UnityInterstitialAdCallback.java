package com.google.unity.ads.decagon;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
/* loaded from: classes2.dex */
public interface UnityInterstitialAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onInterstitialAdFailedToLoad(LoadAdError error);

    void onInterstitialAdLoaded();
}
