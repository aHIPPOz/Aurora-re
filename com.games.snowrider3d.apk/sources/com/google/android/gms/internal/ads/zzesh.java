package com.google.android.gms.internal.ads;

import android.content.pm.PackageInfo;
import android.os.Bundle;
import java.util.ArrayList;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzesh implements zzeub {
    private final zzfcw zza;
    private final PackageInfo zzb;
    private final com.google.android.gms.ads.internal.util.zzg zzc;

    public zzesh(zzfcw zzfcwVar, PackageInfo packageInfo, com.google.android.gms.ads.internal.util.zzg zzgVar) {
        this.zza = zzfcwVar;
        this.zzb = packageInfo;
        this.zzc = zzgVar;
    }

    private final void zzc(Bundle bundle) {
        int i;
        zzbge zzbgeVar = this.zza.zzi;
        if (zzbgeVar == null || (i = zzbgeVar.zzi) == 0) {
            return;
        }
        bundle.putBoolean("sccg_tap", zzbgeVar.zzj);
        bundle.putInt("sccg_dir", i);
    }

    @Override // com.google.android.gms.internal.ads.zzeub
    public final /* bridge */ /* synthetic */ void zza(Object obj) {
        ArrayList arrayList = this.zza.zzg;
        zzcva zzcvaVar = (zzcva) obj;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        zzc(zzcvaVar.zzb);
    }

    /* JADX WARN: Code restructure failed: missing block: B:62:0x00df, code lost:
        if (r0 == 3) goto L68;
     */
    @Override // com.google.android.gms.internal.ads.zzeub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r13) {
        /*
            Method dump skipped, instructions count: 341
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesh.zzb(java.lang.Object):void");
    }
}
