package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
final class zzhbq implements Iterator {
    final /* synthetic */ zzhbt zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    public /* synthetic */ zzhbq(zzhbt zzhbtVar, zzhbs zzhbsVar) {
        Objects.requireNonNull(zzhbtVar);
        this.zza = zzhbtVar;
    }

    private final Iterator zza() {
        Map map;
        if (this.zzd == null) {
            map = this.zza.zzc;
            this.zzd = map.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i;
        Map map;
        int i2 = this.zzb + 1;
        zzhbt zzhbtVar = this.zza;
        i = zzhbtVar.zzb;
        if (i2 >= i) {
            map = zzhbtVar.zzc;
            return !map.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        int i;
        Object[] objArr;
        this.zzc = true;
        int i2 = this.zzb + 1;
        this.zzb = i2;
        zzhbt zzhbtVar = this.zza;
        i = zzhbtVar.zzb;
        if (i2 < i) {
            objArr = zzhbtVar.zza;
            return (zzhbp) objArr[i2];
        }
        return (Map.Entry) zza().next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        int i;
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        zzhbt zzhbtVar = this.zza;
        zzhbtVar.zzo();
        int i2 = this.zzb;
        i = zzhbtVar.zzb;
        if (i2 < i) {
            this.zzb = i2 - 1;
            zzhbtVar.zzm(i2);
            return;
        }
        zza().remove();
    }
}
