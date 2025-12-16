package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;
import java.util.Set;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgal extends zzfwq {
    final Iterator zza;
    final /* synthetic */ Set zzb;
    final /* synthetic */ Set zzc;

    public zzgal(zzgam zzgamVar, Set set, Set set2) {
        this.zzb = set;
        this.zzc = set2;
        Objects.requireNonNull(zzgamVar);
        this.zza = set.iterator();
    }

    @Override // com.google.android.gms.internal.ads.zzfwq
    protected final Object zza() {
        Set set;
        Object next;
        do {
            Iterator it = this.zza;
            if (it.hasNext()) {
                set = this.zzc;
                next = it.next();
            } else {
                zzb();
                return null;
            }
        } while (!set.contains(next));
        return next;
    }
}
