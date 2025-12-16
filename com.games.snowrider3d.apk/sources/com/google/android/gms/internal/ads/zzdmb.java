package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdmb implements zzgdj {
    final /* synthetic */ zzcak zza;

    public zzdmb(zzdmc zzdmcVar, zzcak zzcakVar) {
        this.zza = zzcakVar;
        Objects.requireNonNull(zzdmcVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to load media data due to video view load failure.");
        this.zza.zzd(th);
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcfg zzcfgVar = (zzcfg) obj;
        if (zzcfgVar != null) {
            zzcfgVar.zzag("/video", new zzccz(new zzdma(this.zza)));
            zzcfgVar.zzaa();
            return;
        }
        this.zza.zzd(new zzehf(1, "Missing webview from video view future."));
    }
}
