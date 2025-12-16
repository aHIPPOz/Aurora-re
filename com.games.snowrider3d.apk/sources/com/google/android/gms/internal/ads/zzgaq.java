package com.google.android.gms.internal.ads;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzgaq extends AbstractSet {
    private zzgaq() {
        throw null;
    }

    public /* synthetic */ zzgaq(zzgar zzgarVar) {
    }

    public static int zzd(Set set) {
        return set instanceof zzgaq ? ((zzgaq) set).zza() : set.size();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean add(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean addAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        Set set;
        int zzd;
        int i;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set) || (zzd = zzd((set = (Set) obj))) < 0) {
            return false;
        }
        if (set instanceof zzgaq) {
            ((zzgaq) set).zzb();
            i = 0;
        } else {
            i = set.size();
        }
        if (zza() < i) {
            return false;
        }
        zzgaw it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (!set.contains(it.next())) {
                return false;
            }
            i2++;
        }
        if (i2 == zzd) {
            return true;
        }
        if (i2 < i) {
            return false;
        }
        Iterator it2 = set.iterator();
        int i3 = 0;
        while (it2.hasNext()) {
            it2.next();
            i3++;
            if (i3 > i2) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    @Deprecated
    public final boolean retainAll(Collection collection) {
        throw new UnsupportedOperationException();
    }

    abstract int zza();

    abstract int zzb();

    /* renamed from: zzc */
    public abstract zzgaw iterator();
}
