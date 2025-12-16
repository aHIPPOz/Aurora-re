package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import java.util.LinkedHashMap;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzegz implements zzgdj {
    final /* synthetic */ long zza;
    final /* synthetic */ zzfcd zzb;
    final /* synthetic */ zzfca zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzfju zze;
    final /* synthetic */ zzfcn zzf;
    final /* synthetic */ zzehb zzg;

    public zzegz(zzehb zzehbVar, long j, zzfcd zzfcdVar, zzfca zzfcaVar, String str, zzfju zzfjuVar, zzfcn zzfcnVar) {
        this.zza = j;
        this.zzb = zzfcdVar;
        this.zzc = zzfcaVar;
        this.zzd = str;
        this.zze = zzfjuVar;
        this.zzf = zzfcnVar;
        Objects.requireNonNull(zzehbVar);
        this.zzg = zzehbVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:59:0x0064 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzgdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(java.lang.Throwable r14) {
        /*
            Method dump skipped, instructions count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzegz.zza(java.lang.Throwable):void");
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zzb(Object obj) {
        Clock clock;
        boolean z;
        long j;
        boolean z2;
        boolean zzq;
        zzedr zzedrVar;
        LinkedHashMap linkedHashMap;
        LinkedHashMap linkedHashMap2;
        zzehd zzehdVar;
        zzehb zzehbVar = this.zzg;
        clock = zzehbVar.zza;
        long elapsedRealtime = clock.elapsedRealtime() - this.zza;
        synchronized (zzehbVar) {
            z = zzehbVar.zze;
            if (z) {
                zzehdVar = zzehbVar.zzb;
                j = elapsedRealtime;
                zzehdVar.zza(this.zzb, this.zzc, 0, null, j);
            } else {
                j = elapsedRealtime;
            }
            z2 = zzehbVar.zzg;
            if (z2) {
                return;
            }
            zzfca zzfcaVar = this.zzc;
            zzq = zzehbVar.zzq(zzfcaVar);
            if (zzq) {
                linkedHashMap2 = zzehbVar.zzd;
                ((zzeha) linkedHashMap2.get(zzfcaVar)).zzd = j;
            } else {
                linkedHashMap = zzehbVar.zzd;
                long j2 = j;
                j = j2;
                linkedHashMap.put(zzfcaVar, new zzeha(this.zzd, zzfcaVar.zzaf, 0, j2, null));
            }
            zzedrVar = zzehbVar.zzf;
            zzedrVar.zzg(zzfcaVar, j, null);
        }
    }
}
