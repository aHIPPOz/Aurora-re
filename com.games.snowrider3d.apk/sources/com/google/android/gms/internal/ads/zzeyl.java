package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeyl implements zzgdj {
    final /* synthetic */ zzfhu zza;
    final /* synthetic */ zzfhj zzb;
    final /* synthetic */ zzcpx zzc;
    final /* synthetic */ zzeym zzd;

    public zzeyl(zzeym zzeymVar, zzfhu zzfhuVar, zzfhj zzfhjVar, zzcpx zzcpxVar) {
        this.zza = zzfhuVar;
        this.zzb = zzfhjVar;
        this.zzc = zzcpxVar;
        Objects.requireNonNull(zzeymVar);
        this.zzd = zzeymVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        boolean z;
        zzfhx zzfhxVar;
        zzfhu zzfhuVar;
        zzcyv zzcyvVar;
        zzdbb zzdbbVar;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Banner ad failed to load", th);
        }
        zzeym zzeymVar = this.zzd;
        synchronized (zzeymVar) {
            zzcpx zzcpxVar = this.zzc;
            com.google.android.gms.ads.internal.client.zze zza = zzcpxVar.zzc().zza(th);
            zzeymVar.zzn = zza;
            zzcpxVar.zze().zzdD(zza);
            zzfdt.zzb(zza.zza, th, "BannerAdLoader.onFailure");
            z = zzeymVar.zzm;
            if (z) {
                zzeymVar.zzt();
                zzcyvVar = zzeymVar.zzh;
                zzdbbVar = zzeymVar.zzj;
                zzcyvVar.zzd(zzdbbVar.zzc());
            }
            if (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzfhuVar = this.zza) != null) {
                zzfhuVar.zzc(zza);
                zzfhj zzfhjVar = this.zzb;
                zzfhjVar.zzh(th);
                zzfhjVar.zzg(false);
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            } else {
                zzfhxVar = zzeymVar.zzi;
                zzfhj zzfhjVar2 = this.zzb;
                zzfhjVar2.zza(zza);
                zzfhjVar2.zzh(th);
                zzfhjVar2.zzg(false);
                zzfhxVar.zzc(zzfhjVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        boolean z;
        zzfhx zzfhxVar;
        zzfhu zzfhuVar;
        zzeym zzeymVar = this.zzd;
        zzcos zzcosVar = (zzcos) obj;
        synchronized (zzeymVar) {
            z = zzeymVar.zzm;
            if (z) {
                zzeymVar.zzq();
            }
            if (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzfhuVar = this.zza) != null) {
                zzfhuVar.zzg(zzcosVar.zzq().zzb);
                zzfhuVar.zze(zzcosVar.zzm().zzg());
                zzfhj zzfhjVar = this.zzb;
                zzfhjVar.zzg(true);
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            } else {
                zzfhxVar = zzeymVar.zzi;
                zzfhj zzfhjVar2 = this.zzb;
                zzfhjVar2.zzb(zzcosVar.zzq().zzb);
                zzfhjVar2.zzd(zzcosVar.zzm().zzg());
                zzfhjVar2.zzg(true);
                zzfhxVar.zzc(zzfhjVar2.zzm());
            }
        }
    }
}
