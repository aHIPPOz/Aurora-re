package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbtw {
    public final boolean zza;
    public final String zzb;
    public final boolean zzc;

    public zzbtw(boolean z, String str, boolean z2) {
        this.zza = z;
        this.zzb = str;
        this.zzc = z2;
    }

    public static zzbtw zza(JSONObject jSONObject) {
        return new zzbtw(jSONObject.optBoolean("enable_prewarming", false), jSONObject.optString("prefetch_url", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED), jSONObject.optBoolean("skip_offline_notification_flow", false));
    }
}
