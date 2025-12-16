package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Iterator;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfdi {
    private final zzfca zza;
    private final zzfcd zzb;
    private final zzfjy zzc;
    private final zzfjq zzd;
    private final zzfhu zze;
    private final zzcmq zzf;

    public zzfdi(zzfjy zzfjyVar, zzfjq zzfjqVar, zzfca zzfcaVar, zzfcd zzfcdVar, zzcmq zzcmqVar, zzfhu zzfhuVar) {
        this.zza = zzfcaVar;
        this.zzb = zzfcdVar;
        this.zzc = zzfjyVar;
        this.zzd = zzfjqVar;
        this.zzf = zzcmqVar;
        this.zze = zzfhuVar;
    }

    public final void zza(List list, zzcyi zzcyiVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            zzb((String) it.next(), 2, zzcyiVar);
        }
    }

    public final void zzb(String str, int i, zzcyi zzcyiVar) {
        zzfca zzfcaVar = this.zza;
        if (zzfcaVar.zzai) {
            this.zzd.zza(str, this.zzb.zzb, i);
            return;
        }
        this.zzc.zzd(str, zzfcaVar.zzax, this.zze, zzcyiVar);
    }

    public final void zzc(List list, int i) {
        ListenableFuture listenableFuture;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzkx)).booleanValue() || !zzcmq.zzj(str)) {
                listenableFuture = zzgdn.zzh(str);
            } else {
                listenableFuture = this.zzf.zze(str, com.google.android.gms.ads.internal.client.zzbb.zze());
            }
            zzgdn.zzr(listenableFuture, new zzfdh(this, i), zzcaf.zza);
        }
    }
}
