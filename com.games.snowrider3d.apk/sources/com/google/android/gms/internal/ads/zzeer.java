package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeer implements zzeds {
    private final Context zza;
    private final zzcpx zzb;
    private final Executor zzc;

    public zzeer(Context context, zzcpx zzcpxVar, Executor executor) {
        this.zza = context;
        this.zzb = zzcpxVar;
        this.zzc = executor;
    }

    @Override // com.google.android.gms.internal.ads.zzeds
    public final /* bridge */ /* synthetic */ Object zza(zzfcn zzfcnVar, final zzfca zzfcaVar, zzedp zzedpVar) throws zzfdd, zzehf {
        final View view;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfcaVar.zzag) {
            view = ((zzfdu) zzedpVar.zzb).zza();
        } else {
            zzbpz zzc = ((zzfdu) zzedpVar.zzb).zzc();
            if (zzc == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzg("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad.");
                throw new zzfdd(new Exception("getInterscrollerAd should not be null after loadInterscrollerAd loaded ad."));
            }
            try {
                view = (View) ObjectWrapper.unwrap(zzc.zze());
                boolean zzf = zzc.zzf();
                if (view == null) {
                    throw new zzfdd(new Exception("BannerAdapterWrapper interscrollerView should not be null"));
                }
                if (zzf) {
                    try {
                        view = (View) zzgdn.zzn(zzgdn.zzh(null), new zzgcu() { // from class: com.google.android.gms.internal.ads.zzeep
                            @Override // com.google.android.gms.internal.ads.zzgcu
                            public final ListenableFuture zza(Object obj) {
                                ListenableFuture zzh;
                                zzh = zzgdn.zzh(zzcqm.zza(zzeer.this.zza, view, zzfcaVar));
                                return zzh;
                            }
                        }, zzcaf.zzf).get();
                    } catch (InterruptedException | ExecutionException e) {
                        throw new zzfdd(e);
                    }
                }
            } catch (RemoteException e2) {
                throw new zzfdd(e2);
            }
        }
        zzcpx zzcpxVar = this.zzb;
        zzcrq zzcrqVar = new zzcrq(zzfcnVar, zzfcaVar, zzedpVar.zza);
        final zzfdu zzfduVar = (zzfdu) zzedpVar.zzb;
        Objects.requireNonNull(zzfduVar);
        zzcot zza = zzcpxVar.zza(zzcrqVar, new zzcoz(view, null, new zzcqy() { // from class: com.google.android.gms.internal.ads.zzeeq
            @Override // com.google.android.gms.internal.ads.zzcqy
            public final com.google.android.gms.ads.internal.client.zzed zza() {
                return zzfdu.this.zzb();
            }
        }, (zzfcb) zzfcaVar.zzu.get(0)));
        zza.zzh().zza(view);
        zza.zzd().zzo(new zzcmg(zzfduVar), this.zzc);
        ((zzefd) zzedpVar.zzc).zzc(zza.zzk());
        return zza.zza();
    }

    @Override // com.google.android.gms.internal.ads.zzeds
    public final void zzb(zzfcn zzfcnVar, zzfca zzfcaVar, zzedp zzedpVar) throws zzfdd {
        com.google.android.gms.ads.internal.client.zzr zza;
        zzfcw zzfcwVar = zzfcnVar.zza.zza;
        com.google.android.gms.ads.internal.client.zzr zzrVar = zzfcwVar.zze;
        if (zzrVar.zzn) {
            zza = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zzd(zzrVar.zze, zzrVar.zzb));
        } else {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfcaVar.zzag) {
                zza = zzfdc.zza(this.zza, zzfcaVar.zzu);
            } else {
                zza = new com.google.android.gms.ads.internal.client.zzr(this.zza, com.google.android.gms.ads.zzc.zze(zzrVar.zze, zzrVar.zzb));
            }
        }
        com.google.android.gms.ads.internal.client.zzr zzrVar2 = zza;
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzij)).booleanValue() || !zzfcaVar.zzag) {
            ((zzfdu) zzedpVar.zzb).zzm(this.zza, zzrVar2, zzfcwVar.zzd, zzfcaVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfcaVar.zzs), (zzbpw) zzedpVar.zzc);
            return;
        }
        ((zzfdu) zzedpVar.zzb).zzn(this.zza, zzrVar2, zzfcwVar.zzd, zzfcaVar.zzv.toString(), com.google.android.gms.ads.internal.util.zzbs.zzm(zzfcaVar.zzs), (zzbpw) zzedpVar.zzc);
    }
}
