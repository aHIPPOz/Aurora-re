package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeui implements zzeuc {
    private final Context zza;
    private final zzgdy zzb;

    public zzeui(Context context, zzgdy zzgdyVar) {
        this.zza = context;
        this.zzb = zzgdyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 59;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        if (((Boolean) zzbew.zzb.zze()).booleanValue()) {
            return this.zzb.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeuh
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return zzeui.this.zza;
                }
            });
        }
        return zzgdn.zzh(new zzeuj(-1, -1));
    }
}
