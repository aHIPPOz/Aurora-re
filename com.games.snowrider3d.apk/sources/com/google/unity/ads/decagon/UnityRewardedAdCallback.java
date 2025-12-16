package com.google.unity.ads.decagon;

import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
/* loaded from: classes2.dex */
public interface UnityRewardedAdCallback extends UnityFullScreenContentCallback, UnityPaidEventListener {
    void onRewardedAdFailedToLoad(LoadAdError error);

    void onRewardedAdLoaded();

    void onUserEarnedReward(String type, float amount);
}
