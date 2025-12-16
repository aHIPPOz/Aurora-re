package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgxr extends zzgxs {
    final /* synthetic */ zzgxz zza;
    private int zzb = 0;
    private final int zzc;

    public zzgxr(zzgxz zzgxzVar) {
        Objects.requireNonNull(zzgxzVar);
        this.zza = zzgxzVar;
        this.zzc = zzgxzVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgxu
    public final byte zza() {
        int i = this.zzb;
        if (i >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i + 1;
        return this.zza.zzb(i);
    }
}
