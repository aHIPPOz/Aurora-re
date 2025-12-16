package com.google.android.gms.internal.nearby;

import androidx.webkit.ProxyConfig;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class zzsq<E> extends zzsn<E> implements List<E>, RandomAccess {
    private static final zzsz zza = new zzso(zzsv.zza, 0);

    public static zzsq zzi(Object[] objArr) {
        return zzj(objArr, objArr.length);
    }

    public static zzsq zzj(Object[] objArr, int i) {
        if (i == 0) {
            return zzsv.zza;
        }
        return new zzsv(objArr, i);
    }

    public static zzsq zzk(Collection collection) {
        if (collection instanceof zzsn) {
            zzsq zzd = ((zzsn) collection).zzd();
            if (!zzd.zzf()) {
                return zzd;
            }
            Object[] array = zzd.toArray();
            return zzj(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzsu.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzsq zzl() {
        return zzsv.zza;
    }

    public static zzsq zzm(Object obj) {
        Object[] objArr = {obj};
        zzsu.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzsq zzn(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzsu.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzsq zzo(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzsu.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzsq zzp(Object obj, Object obj2, Object obj3, Object obj4) {
        Object[] objArr = {"..", ".", "\\", "/"};
        zzsu.zzb(objArr, 4);
        return zzj(objArr, 4);
    }

    public static zzsq zzq(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10) {
        Object[] objArr = {"?", ProxyConfig.MATCH_ALL_SCHEMES, "\"", "|", ":", "\u0000", "\n", "\r", "\t", "\f"};
        zzsu.zzb(objArr, 10);
        return zzj(objArr, 10);
    }

    @SafeVarargs
    public static zzsq zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        Object[] objArr2 = new Object[15];
        objArr2[0] = "../";
        objArr2[1] = "/";
        objArr2[2] = "\\";
        objArr2[3] = "?";
        objArr2[4] = ProxyConfig.MATCH_ALL_SCHEMES;
        objArr2[5] = "\"";
        objArr2[6] = "<";
        objArr2[7] = ">";
        objArr2[8] = "|";
        objArr2[9] = ":";
        objArr2[10] = "\u0000";
        objArr2[11] = "\n";
        System.arraycopy(objArr, 0, objArr2, 12, 3);
        zzsu.zzb(objArr2, 15);
        return zzj(objArr2, 15);
    }

    @Override // java.util.List
    @Deprecated
    public final void add(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final boolean addAll(int i, Collection collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean contains(@CheckForNull Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
        /*
            r6 = this;
            r0 = 1
            if (r7 != r6) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof java.util.List
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            java.util.List r7 = (java.util.List) r7
            int r1 = r6.size()
            int r3 = r7.size()
            if (r1 == r3) goto L17
            return r2
        L17:
            boolean r3 = r7 instanceof java.util.RandomAccess
            if (r3 == 0) goto L31
            r3 = r2
        L1c:
            if (r3 >= r1) goto L30
            java.lang.Object r4 = r6.get(r3)
            java.lang.Object r5 = r7.get(r3)
            boolean r4 = com.google.android.gms.internal.nearby.zzsb.zza(r4, r5)
            if (r4 != 0) goto L2d
            return r2
        L2d:
            int r3 = r3 + 1
            goto L1c
        L30:
            return r0
        L31:
            java.util.Iterator r1 = r6.iterator()
            java.util.Iterator r7 = r7.iterator()
        L39:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L55
            boolean r3 = r7.hasNext()
            if (r3 != 0) goto L46
            return r2
        L46:
            java.lang.Object r3 = r1.next()
            java.lang.Object r4 = r7.next()
            boolean r3 = com.google.android.gms.internal.nearby.zzsb.zza(r3, r4)
            if (r3 != 0) goto L39
            return r2
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L5c
            return r0
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzsq.equals(java.lang.Object):boolean");
    }

    @Override // java.util.Collection, java.util.List
    public final int hashCode() {
        int size = size();
        int i = 1;
        for (int i2 = 0; i2 < size; i2++) {
            i = (i * 31) + get(i2).hashCode();
        }
        return i;
    }

    @Override // java.util.List
    public final int indexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i = 0; i < size; i++) {
            if (obj.equals(get(i))) {
                return i;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(@CheckForNull Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List
    public final /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    @Deprecated
    public final Object remove(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List
    @Deprecated
    public final Object set(int i, Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i2] = get(i2);
        }
        return size;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    @Deprecated
    public final zzsq zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.nearby.zzsn
    public final zzsy zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzsq subList(int i, int i2) {
        zzsg.zzg(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new zzsp(this, i, i3);
        }
        return zzsv.zza;
    }

    /* renamed from: zzs */
    public final zzsz listIterator(int i) {
        zzsg.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzso(this, i);
    }
}
