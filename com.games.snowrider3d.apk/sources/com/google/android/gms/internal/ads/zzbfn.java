package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbfn {
    public static final zzbeo zza = zzbeo.zzb("gads:dynamite_load:fail:sample_rate", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbeo zzb = zzbeo.zzd("gads:report_dynamite_crash_in_background_thread", false);
    public static final zzbeo zzc = new zzbeo("gads:public_beta:traffic_multiplier", "1.0", 4);
    public static final zzbeo zzd = new zzbeo("gads:sdk_crash_report_class_prefix", "com.google.", 4);
    public static final zzbeo zze = zzbeo.zzd("gads:sdk_crash_report_full_stacktrace", false);
    public static final zzbeo zzf = zzbeo.zza("gads:trapped_exception_sample_rate", 0.01d);

    static {
        zzbeo.zzd("gads:sdk_crash_report_enabled", false);
    }
}
