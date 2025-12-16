package com.google.android.gms.internal.ads;

import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdsj {
    private final zzdso zza;
    private final Executor zzb;
    private final Map zzc;

    public zzdsj(zzdso zzdsoVar, Executor executor) {
        this.zza = zzdsoVar;
        this.zzc = zzdsoVar.zza();
        this.zzb = executor;
    }

    public static /* bridge */ /* synthetic */ zzdso zzb(zzdsj zzdsjVar) {
        return zzdsjVar.zza;
    }

    static /* bridge */ /* synthetic */ Map zzc(zzdsj zzdsjVar) {
        return zzdsjVar.zzc;
    }

    public static /* bridge */ /* synthetic */ Executor zzd(zzdsj zzdsjVar) {
        return zzdsjVar.zzb;
    }

    public final zzdsi zza() {
        zzdsi zzdsiVar = new zzdsi(this);
        zzdsiVar.zzb.putAll(zzc(zzdsiVar.zza));
        return zzdsiVar;
    }

    public final void zze() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzma)).booleanValue()) {
            return;
        }
        zzdsi zza = zza();
        zza.zzb("action", "pecr");
        zza.zzj();
    }
}
