package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzemv implements zzeuc {
    private final Set zza;

    public zzemv(Set set) {
        this.zza = set;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 8;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        ArrayList arrayList = new ArrayList();
        for (String str : this.zza) {
            arrayList.add(str);
        }
        return zzgdn.zzh(new zzemt(arrayList, null));
    }
}
