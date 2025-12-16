package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbfr {
    public static final zzbeo zza = zzbeo.zzb("gads:rendering:timeout_ms", 60000);

    static {
        zzbeo.zzb("gads:ad_loader:timeout_ms", 60000L);
        zzbeo.zzb("gads:resolve_future:default_timeout_ms", WorkRequest.DEFAULT_BACKOFF_DELAY_MILLIS);
    }
}
