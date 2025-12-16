package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
final class zzhbi implements Iterator {
    private final ArrayDeque zza;
    private zzgxv zzb;

    public /* synthetic */ zzhbi(zzgxz zzgxzVar, zzhbj zzhbjVar) {
        zzgxz zzgxzVar2;
        if (zzgxzVar instanceof zzhbk) {
            zzhbk zzhbkVar = (zzhbk) zzgxzVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzhbkVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzhbkVar);
            zzgxzVar2 = zzhbkVar.zzd;
            this.zzb = zzb(zzgxzVar2);
            return;
        }
        this.zza = null;
        this.zzb = (zzgxv) zzgxzVar;
    }

    private final zzgxv zzb(zzgxz zzgxzVar) {
        while (zzgxzVar instanceof zzhbk) {
            zzhbk zzhbkVar = (zzhbk) zzgxzVar;
            this.zza.push(zzhbkVar);
            zzgxzVar = zzhbkVar.zzd;
        }
        return (zzgxv) zzgxzVar;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgxv next() {
        zzgxv zzgxvVar;
        zzgxz zzgxzVar;
        zzgxv zzgxvVar2 = this.zzb;
        if (zzgxvVar2 == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzgxvVar = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzgxzVar = ((zzhbk) arrayDeque.pop()).zze;
            zzgxvVar = zzb(zzgxzVar);
        } while (zzgxvVar.zzd() == 0);
        this.zzb = zzgxvVar;
        return zzgxvVar2;
    }
}
