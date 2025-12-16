package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfyq extends zzfyl implements List, RandomAccess {
    private static final zzgax zza = new zzfyo(zzgac.zza, 0);
    public static final /* synthetic */ int zzd = 0;

    public static zzfyn zzi(int i) {
        zzfxn.zza(i, "expectedSize");
        return new zzfyn(i);
    }

    public static zzfyq zzj(Object[] objArr, int i) {
        if (i == 0) {
            return zzgac.zza;
        }
        return new zzgac(objArr, i);
    }

    public static zzfyq zzl(Collection collection) {
        if (collection instanceof zzfyl) {
            zzfyq zzd2 = ((zzfyl) collection).zzd();
            if (!zzd2.zzf()) {
                return zzd2;
            }
            Object[] array = zzd2.toArray();
            return zzj(array, array.length);
        }
        Object[] array2 = collection.toArray();
        int length = array2.length;
        zzgaa.zzb(array2, length);
        return zzj(array2, length);
    }

    public static zzfyq zzm(Object[] objArr) {
        if (objArr.length == 0) {
            return zzgac.zza;
        }
        Object[] objArr2 = (Object[]) objArr.clone();
        int length = objArr2.length;
        zzgaa.zzb(objArr2, length);
        return zzj(objArr2, length);
    }

    public static zzfyq zzn() {
        return zzgac.zza;
    }

    public static zzfyq zzo(Object obj) {
        Object[] objArr = {obj};
        zzgaa.zzb(objArr, 1);
        return zzj(objArr, 1);
    }

    public static zzfyq zzp(Object obj, Object obj2) {
        Object[] objArr = {obj, obj2};
        zzgaa.zzb(objArr, 2);
        return zzj(objArr, 2);
    }

    public static zzfyq zzq(Object obj, Object obj2, Object obj3) {
        Object[] objArr = {obj, obj2, obj3};
        zzgaa.zzb(objArr, 3);
        return zzj(objArr, 3);
    }

    public static zzfyq zzr(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        Object[] objArr = {obj, obj2, obj3, obj4, obj5};
        zzgaa.zzb(objArr, 5);
        return zzj(objArr, 5);
    }

    public static zzfyq zzs(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Object[] objArr = {"3010", "3008", "1005", "1009", "2011", "2007"};
        zzgaa.zzb(objArr, 6);
        return zzj(objArr, 6);
    }

    @SafeVarargs
    public static zzfyq zzt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, Object obj10, Object obj11, Object obj12, Object... objArr) {
        int length = objArr.length;
        int i = length + 12;
        Object[] objArr2 = new Object[i];
        objArr2[0] = obj;
        objArr2[1] = obj2;
        objArr2[2] = obj3;
        objArr2[3] = obj4;
        objArr2[4] = obj5;
        objArr2[5] = obj6;
        objArr2[6] = obj7;
        objArr2[7] = obj8;
        objArr2[8] = obj9;
        objArr2[9] = obj10;
        objArr2[10] = obj11;
        objArr2[11] = obj12;
        System.arraycopy(objArr, 0, objArr2, 12, length);
        zzgaa.zzb(objArr2, i);
        return zzj(objArr2, i);
    }

    public static zzfyq zzu(Comparator comparator, Iterable iterable) {
        Collection collection;
        if (!(iterable instanceof Collection)) {
            collection = zzfzg.zza(((zzfyq) iterable).listIterator(0));
        } else {
            collection = (Collection) iterable;
        }
        Object[] array = collection.toArray();
        int length = array.length;
        zzgaa.zzb(array, length);
        Arrays.sort(array, comparator);
        return zzj(array, length);
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

    @Override // com.google.android.gms.internal.ads.zzfyl, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x003f  */
    @Override // java.util.Collection, java.util.List
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r7) {
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
            boolean r4 = com.google.android.gms.internal.ads.zzfvm.zza(r4, r5)
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
            boolean r3 = com.google.android.gms.internal.ads.zzfvm.zza(r3, r4)
            if (r3 != 0) goto L39
            return r2
        L55:
            boolean r7 = r7.hasNext()
            if (r7 != 0) goto L5c
            return r0
        L5c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfyq.equals(java.lang.Object):boolean");
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
    public final int indexOf(Object obj) {
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

    @Override // com.google.android.gms.internal.ads.zzfyl, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // java.util.List
    public final int lastIndexOf(Object obj) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfyl
    public int zza(Object[] objArr, int i) {
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            objArr[i + i2] = get(i2);
        }
        return i + size;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    @Deprecated
    public final zzfyq zzd() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfyl
    public final zzgaw zze() {
        return listIterator(0);
    }

    /* renamed from: zzh */
    public zzfyq subList(int i, int i2) {
        zzfvp.zzk(i, i2, size());
        int i3 = i2 - i;
        if (i3 == size()) {
            return this;
        }
        if (i3 != 0) {
            return new zzfyp(this, i, i3);
        }
        return zzgac.zza;
    }

    /* renamed from: zzv */
    public final zzgax listIterator(int i) {
        zzfvp.zzb(i, size(), "index");
        return isEmpty() ? zza : new zzfyo(this, i);
    }

    public static zzfyq zzk(Iterable iterable) {
        iterable.getClass();
        return zzl((Collection) iterable);
    }
}
