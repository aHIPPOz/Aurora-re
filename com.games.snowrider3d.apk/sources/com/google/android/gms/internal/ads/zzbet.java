package com.google.android.gms.internal.ads;

import androidx.work.PeriodicWorkRequest;
import androidx.work.WorkRequest;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbet {
    public static final zzbeo zza = zzbeo.zzb("gads:app_permissions_caching_expiry_ms:expiry", 60000);
    public static final zzbeo zzb = zzbeo.zzb("gads:audio_caching_expiry_ms:expiry", 5000);
    public static final zzbeo zzc = zzbeo.zzb("gads:battery_caching_expiry_ms:expiry", WorkRequest.MIN_BACKOFF_MILLIS);
    public static final zzbeo zzd = zzbeo.zzb("gads:device_info_caching_expiry_ms:expiry", PeriodicWorkRequest.MIN_PERIODIC_FLEX_MILLIS);
    public static final zzbeo zze = zzbeo.zzb("gads:hsdp_caching_expiry_ms:expiry", 600000);
    public static final zzbeo zzf = zzbeo.zzb("gads:memory_caching_expiry_ms:expiry", 5000);
    public static final zzbeo zzg = zzbeo.zzb("gads:sdk_environment_caching_expiry_ms:expiry", 600000);
    public static final zzbeo zzh = zzbeo.zzb("gads:telephony_caching_expiry_ms:expiry", 5000);
}
