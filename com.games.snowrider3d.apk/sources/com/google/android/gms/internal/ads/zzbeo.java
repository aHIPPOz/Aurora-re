package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public class zzbeo {
    private final String zza;
    private final Object zzb;
    private final int zzc;

    public zzbeo(String str, Object obj, int i) {
        this.zza = str;
        this.zzb = obj;
        this.zzc = i;
    }

    public static zzbeo zza(String str, double d) {
        return new zzbeo(str, Double.valueOf(d), 3);
    }

    public static zzbeo zzb(String str, long j) {
        return new zzbeo(str, Long.valueOf(j), 2);
    }

    public static zzbeo zzc(String str, String str2) {
        return new zzbeo("gad:dynamite_module:experiment_id", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, 4);
    }

    public static zzbeo zzd(String str, boolean z) {
        return new zzbeo(str, Boolean.valueOf(z), 1);
    }

    public final Object zze() {
        zzbft zza = zzbfv.zza();
        if (zza == null) {
            if (zzbfv.zzb() != null) {
                zzbfv.zzb().zza();
            }
            return this.zzb;
        }
        int i = this.zzc - 1;
        if (i == 0) {
            return zza.zza(this.zza, ((Boolean) this.zzb).booleanValue());
        }
        if (i == 1) {
            return zza.zzc(this.zza, ((Long) this.zzb).longValue());
        }
        if (i != 2) {
            return zza.zzd(this.zza, (String) this.zzb);
        }
        return zza.zzb(this.zza, ((Double) this.zzb).doubleValue());
    }
}
