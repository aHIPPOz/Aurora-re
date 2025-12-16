package com.google.unity.ads.decagon;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
/* loaded from: classes2.dex */
public interface UnityAppOpenAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onAppOpenAdFailedToLoad(LoadAdError error);

    void onAppOpenAdLoaded();
}
