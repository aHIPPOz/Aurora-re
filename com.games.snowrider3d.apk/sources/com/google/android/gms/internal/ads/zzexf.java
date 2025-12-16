package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzexf implements zzgdj {
    final /* synthetic */ zzeln zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhj zzc;
    final /* synthetic */ zzexg zzd;
    final /* synthetic */ zzexi zze;

    public zzexf(zzexi zzexiVar, zzeln zzelnVar, zzfhu zzfhuVar, zzfhj zzfhjVar, zzexg zzexgVar) {
        this.zza = zzelnVar;
        this.zzb = zzfhuVar;
        this.zzc = zzfhjVar;
        this.zzd = zzexgVar;
        Objects.requireNonNull(zzexiVar);
        this.zze = zzexiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        zzezr zzezrVar;
        final com.google.android.gms.ads.internal.client.zze zzeVar;
        zzfhx zzfhxVar;
        zzfhu zzfhuVar;
        zzexy zzexyVar;
        zzcvd zzm;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("App open ad failed to load", th);
        }
        zzexi zzexiVar = this.zze;
        zzezrVar = zzexiVar.zze;
        zzcoc zzcocVar = (zzcoc) zzezrVar.zzd();
        if (zzcocVar == null) {
            zzeVar = zzfdx.zzb(th, null);
        } else {
            zzeVar = zzcocVar.zzb().zza(th);
        }
        synchronized (zzexiVar) {
            zzexiVar.zzj = null;
            if (zzcocVar != null) {
                zzcocVar.zzc().zzdD(zzeVar);
                if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zziB)).booleanValue()) {
                    executor = zzexiVar.zzc;
                    executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzexe
                        @Override // java.lang.Runnable
                        public final void run() {
                            zzexy zzexyVar2;
                            zzexyVar2 = zzexf.this.zze.zzd;
                            zzexyVar2.zzdD(zzeVar);
                        }
                    });
                }
            } else {
                zzexyVar = zzexiVar.zzd;
                zzexyVar.zzdD(zzeVar);
                zzm = zzexiVar.zzm(this.zzd);
                ((zzcoc) zzm.zzh()).zzb().zzc().zzh();
            }
            zzfdt.zzb(zzeVar.zza, th, "AppOpenAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzfhuVar = this.zzb) != null) {
                zzfhuVar.zzc(zzeVar);
                zzfhj zzfhjVar = this.zzc;
                zzfhjVar.zzh(th);
                zzfhjVar.zzg(false);
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            } else {
                zzfhxVar = zzexiVar.zzh;
                zzfhj zzfhjVar2 = this.zzc;
                zzfhjVar2.zza(zzeVar);
                zzfhjVar2.zzh(th);
                zzfhjVar2.zzg(false);
                zzfhxVar.zzc(zzfhjVar2.zzm());
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfhx zzfhxVar;
        zzfhu zzfhuVar;
        zzexy zzexyVar;
        zzcra zzcraVar = (zzcra) obj;
        zzexi zzexiVar = this.zze;
        synchronized (zzexiVar) {
            zzexiVar.zzj = null;
            if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zziB)).booleanValue()) {
                zzdaj zzo = zzcraVar.zzo();
                zzexyVar = zzexiVar.zzd;
                zzo.zzb(zzexyVar);
            }
            this.zza.zzb(zzcraVar);
            if (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzfhuVar = this.zzb) != null) {
                zzfhuVar.zzg(zzcraVar.zzq().zzb);
                zzfhuVar.zze(zzcraVar.zzm().zzg());
                zzfhj zzfhjVar = this.zzc;
                zzfhjVar.zzg(true);
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            } else {
                zzfhxVar = zzexiVar.zzh;
                zzfhj zzfhjVar2 = this.zzc;
                zzfhjVar2.zzb(zzcraVar.zzq().zzb);
                zzfhjVar2.zzd(zzcraVar.zzm().zzg());
                zzfhjVar2.zzg(true);
                zzfhxVar.zzc(zzfhjVar2.zzm());
            }
        }
    }
}
