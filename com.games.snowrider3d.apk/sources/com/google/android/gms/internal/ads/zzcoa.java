package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcoa {
    private final zzdsj zza;
    private final zzfcn zzb;

    public zzcoa(zzdsj zzdsjVar, zzfcn zzfcnVar) {
        this.zza = zzdsjVar;
        this.zzb = zzfcnVar;
    }

    public final void zza(long j, int i) {
        String str;
        zzdsi zza = this.zza.zza();
        zza.zzd(this.zzb.zzb.zzb);
        zza.zzb("action", "ad_closed");
        zza.zzb("show_time", String.valueOf(j));
        zza.zzb("ad_format", "app_open_ad");
        int i2 = i - 1;
        if (i2 == 0) {
            str = "h";
        } else if (i2 == 1) {
            str = "bb";
        } else if (i2 == 2) {
            str = "cc";
        } else if (i2 != 3) {
            str = i2 != 4 ? "u" : "ac";
        } else {
            str = "cb";
        }
        zza.zzb("acr", str);
        zza.zzj();
    }
}
