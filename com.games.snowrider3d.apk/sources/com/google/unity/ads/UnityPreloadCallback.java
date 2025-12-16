package com.google.unity.ads;

import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
/* loaded from: classes2.dex */
public interface UnityPreloadCallback {
    void onAdFailedToPreload(String preloadId, AdError adError);

    void onAdPreloaded(String preloadId, ResponseInfo responseInfo);

    void onAdsExhausted(String preloadId);
}
