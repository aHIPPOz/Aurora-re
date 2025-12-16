package com.google.android.gms.internal.ads;

import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcym extends zzdbt {
    private boolean zzb = false;

    public zzcym(Set set) {
        super(set);
    }

    public final synchronized void zza() {
        if (!this.zzb) {
            zzq(new zzdbs() { // from class: com.google.android.gms.internal.ads.zzcyl
                @Override // com.google.android.gms.internal.ads.zzdbs
                public final void zza(Object obj) {
                    ((zzcyo) obj).zzv();
                }
            });
            this.zzb = true;
        }
    }
}
