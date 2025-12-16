package com.google.unity.ads.decagon;

import com.google.android.libraries.ads.mobile.sdk.MobileAds;
import com.google.android.libraries.ads.mobile.sdk.common.RequestConfiguration;
/* loaded from: classes2.dex */
class MobileAdsWrapper {
    public RequestConfiguration getRequestConfiguration() {
        return MobileAds.getRequestConfiguration();
    }

    public String getVersionString() {
        return MobileAds.getVersion().toString();
    }
}
