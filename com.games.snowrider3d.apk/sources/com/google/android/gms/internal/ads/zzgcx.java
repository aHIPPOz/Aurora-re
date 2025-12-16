package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
abstract class zzgcx extends zzgcn {
    private List zza;

    public zzgcx(zzfyl zzfylVar, boolean z) {
        super(zzfylVar, z, true);
        List list;
        if (zzfylVar.isEmpty()) {
            list = Collections.emptyList();
        } else {
            list = zzfzg.zzb(zzfylVar.size());
        }
        for (int i = 0; i < zzfylVar.size(); i++) {
            list.add(null);
        }
        this.zza = list;
    }

    @Override // com.google.android.gms.internal.ads.zzgcn
    public final void zzA(int i) {
        super.zzA(i);
        this.zza = null;
    }

    abstract Object zzD(List list);

    @Override // com.google.android.gms.internal.ads.zzgcn
    final void zzx(int i, Object obj) {
        List list = this.zza;
        if (list != null) {
            list.set(i, new zzgcw(obj));
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgcn
    final void zzy() {
        List list = this.zza;
        if (list != null) {
            zzc(zzD(list));
        }
    }
}
