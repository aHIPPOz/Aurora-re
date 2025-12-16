package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.AbstractList;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.Spliterators;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgbs extends AbstractList implements RandomAccess, Serializable {
    final int[] zza;
    final int zzb;
    final int zzc;

    public zzgbs(int[] iArr, int i, int i2) {
        this.zza = iArr;
        this.zzb = i;
        this.zzc = i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        return (obj instanceof Integer) && zzgbt.zza(this.zza, ((Integer) obj).intValue(), this.zzb, this.zzc) != -1;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zzgbs)) {
            return super.equals(obj);
        }
        zzgbs zzgbsVar = (zzgbs) obj;
        int i = this.zzc;
        int i2 = this.zzb;
        int i3 = zzgbsVar.zzc;
        int i4 = zzgbsVar.zzb;
        int i5 = i - i2;
        if (i3 - i4 != i5) {
            return false;
        }
        for (int i6 = 0; i6 < i5; i6++) {
            if (this.zza[i2 + i6] != zzgbsVar.zza[i4 + i6]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        zzfvp.zza(i, i2 - i3, "index");
        return Integer.valueOf(this.zza[i3 + i]);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public final int hashCode() {
        int i = 1;
        for (int i2 = this.zzb; i2 < this.zzc; i2++) {
            i = (i * 31) + this.zza[i2];
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int indexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int zza = zzgbt.zza(iArr, intValue, i, this.zzc);
            if (zza < 0) {
                return -1;
            }
            return zza - i;
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public final int lastIndexOf(Object obj) {
        if (obj instanceof Integer) {
            int[] iArr = this.zza;
            int intValue = ((Integer) obj).intValue();
            int i = this.zzb;
            int i2 = this.zzc - 1;
            while (true) {
                if (i2 < i) {
                    i2 = -1;
                    break;
                } else if (iArr[i2] == intValue) {
                    break;
                } else {
                    i2--;
                }
            }
            if (i2 >= 0) {
                return i2 - i;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        int i2 = this.zzc;
        int i3 = this.zzb;
        Integer num = (Integer) obj;
        zzfvp.zza(i, i2 - i3, "index");
        int[] iArr = this.zza;
        int i4 = i3 + i;
        int i5 = iArr[i4];
        num.getClass();
        iArr[i4] = num.intValue();
        return Integer.valueOf(i5);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc - this.zzb;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public final /* bridge */ /* synthetic */ Spliterator spliterator() {
        return Spliterators.spliterator(this.zza, this.zzb, this.zzc, 0);
    }

    @Override // java.util.AbstractList, java.util.List
    public final List subList(int i, int i2) {
        int i3 = this.zzc;
        int i4 = this.zzb;
        zzfvp.zzk(i, i2, i3 - i4);
        if (i == i2) {
            return Collections.emptyList();
        }
        return new zzgbs(this.zza, i + i4, i4 + i2);
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        int i = this.zzc;
        int i2 = this.zzb;
        StringBuilder sb = new StringBuilder((i - i2) * 5);
        sb.append('[');
        int[] iArr = this.zza;
        sb.append(iArr[i2]);
        while (true) {
            i2++;
            if (i2 < i) {
                sb.append(", ");
                sb.append(iArr[i2]);
            } else {
                sb.append(']');
                return sb.toString();
            }
        }
    }
}
