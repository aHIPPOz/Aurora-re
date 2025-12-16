package com.google.android.gms.ads.rewarded;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes.dex */
final class zza implements RewardItem {
    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final int getAmount() {
        return 1;
    }

    @Override // com.google.android.gms.ads.rewarded.RewardItem
    public final String getType() {
        return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    }
}
