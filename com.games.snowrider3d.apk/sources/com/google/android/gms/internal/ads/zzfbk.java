package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfbk implements zzgdj {
    final /* synthetic */ zzeln zza;
    final /* synthetic */ zzfhu zzb;
    final /* synthetic */ zzfhj zzc;
    final /* synthetic */ zzfbl zzd;
    final /* synthetic */ zzfbn zze;

    public zzfbk(zzfbn zzfbnVar, zzeln zzelnVar, zzfhu zzfhuVar, zzfhj zzfhjVar, zzfbl zzfblVar) {
        this.zza = zzelnVar;
        this.zzb = zzfhuVar;
        this.zzc = zzfhjVar;
        this.zzd = zzfblVar;
        Objects.requireNonNull(zzfbnVar);
        this.zze = zzfbnVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        zzezr zzezrVar;
        final com.google.android.gms.ads.internal.client.zze zzeVar;
        zzfhx zzfhxVar;
        zzfhu zzfhuVar;
        zzfbd zzfbdVar;
        zzdor zzk;
        Executor executor;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzga)).booleanValue()) {
            com.google.android.gms.ads.internal.util.zze.zzb("Rewarded ad failed to load", th);
        }
        zzfbn zzfbnVar = this.zze;
        zzezrVar = zzfbnVar.zze;
        zzdos zzdosVar = (zzdos) zzezrVar.zzd();
        if (zzdosVar == null) {
            zzeVar = zzfdx.zzb(th, null);
        } else {
            zzeVar = zzdosVar.zzb().zza(th);
        }
        synchronized (zzfbnVar) {
            if (zzdosVar != null) {
                zzdosVar.zza().zzdD(zzeVar);
                executor = zzfbnVar.zzb;
                executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbi
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzfbd zzfbdVar2;
                        zzfbdVar2 = zzfbk.this.zze.zzd;
                        zzfbdVar2.zzdD(zzeVar);
                    }
                });
            } else {
                zzfbdVar = zzfbnVar.zzd;
                zzfbdVar.zzdD(zzeVar);
                zzk = zzfbnVar.zzk(this.zzd);
                zzk.zze().zzb().zzc().zzh();
            }
            zzfdt.zzb(zzeVar.zza, th, "RewardedAdLoader.onFailure");
            this.zza.zza();
            if (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzfhuVar = this.zzb) != null) {
                zzfhuVar.zzc(zzeVar);
                zzfhj zzfhjVar = this.zzc;
                zzfhjVar.zzh(th);
                zzfhjVar.zzg(false);
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            } else {
                zzfhxVar = zzfbnVar.zzg;
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
        zzfbd zzfbdVar;
        Executor executor;
        final zzfbd zzfbdVar2;
        zzfbd zzfbdVar3;
        zzfhx zzfhxVar;
        zzfhu zzfhuVar;
        zzfbn zzfbnVar = this.zze;
        zzdon zzdonVar = (zzdon) obj;
        synchronized (zzfbnVar) {
            zzdaj zzo = zzdonVar.zzo();
            zzfbdVar = zzfbnVar.zzd;
            zzo.zzd(zzfbdVar);
            this.zza.zzb(zzdonVar);
            executor = zzfbnVar.zzb;
            zzfbdVar2 = zzfbnVar.zzd;
            Objects.requireNonNull(zzfbdVar2);
            executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfbj
                @Override // java.lang.Runnable
                public final void run() {
                    zzfbd.this.zzu();
                }
            });
            zzfbdVar3 = zzfbnVar.zzd;
            zzfbdVar3.onAdMetadataChanged();
            if (((Boolean) zzbex.zzc.zze()).booleanValue() && (zzfhuVar = this.zzb) != null) {
                zzfhuVar.zzg(zzdonVar.zzq().zzb);
                zzfhuVar.zze(zzdonVar.zzm().zzg());
                zzfhj zzfhjVar = this.zzc;
                zzfhjVar.zzg(true);
                zzfhuVar.zza(zzfhjVar);
                zzfhuVar.zzh();
            } else {
                zzfhxVar = zzfbnVar.zzg;
                zzfhj zzfhjVar2 = this.zzc;
                zzfhjVar2.zzb(zzdonVar.zzq().zzb);
                zzfhjVar2.zzd(zzdonVar.zzm().zzg());
                zzfhjVar2.zzg(true);
                zzfhxVar.zzc(zzfhjVar2.zzm());
            }
        }
    }
}
