package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzapz {
    public final int zza;
    public final byte[] zzb;
    public final Map zzc;
    public final List zzd;
    public final boolean zze;

    private zzapz(int i, byte[] bArr, Map map, List list, boolean z, long j) {
        this.zza = i;
        this.zzb = bArr;
        this.zzc = map;
        this.zzd = list == null ? null : Collections.unmodifiableList(list);
        this.zze = z;
    }

    private static List zza(Map map) {
        if (map == null) {
            return null;
        }
        if (map.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : map.entrySet()) {
            arrayList.add(new zzapv((String) entry.getKey(), (String) entry.getValue()));
        }
        return arrayList;
    }

    @Deprecated
    public zzapz(int i, byte[] bArr, Map map, boolean z, long j) {
        this(i, bArr, map, zza(map), z, j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzapz(int r13, byte[] r14, boolean r15, long r16, java.util.List r18) {
        /*
            r12 = this;
            if (r18 != 0) goto Ld
            r0 = 0
        L3:
            r4 = r12
            r5 = r13
            r6 = r14
            r9 = r15
            r10 = r16
            r8 = r18
            r7 = r0
            goto L3b
        Ld:
            boolean r0 = r18.isEmpty()
            if (r0 == 0) goto L18
            java.util.Map r0 = java.util.Collections.emptyMap()
            goto L3
        L18:
            java.util.TreeMap r0 = new java.util.TreeMap
            java.util.Comparator r1 = java.lang.String.CASE_INSENSITIVE_ORDER
            r0.<init>(r1)
            java.util.Iterator r1 = r18.iterator()
        L23:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L3
            java.lang.Object r2 = r1.next()
            com.google.android.gms.internal.ads.zzapv r2 = (com.google.android.gms.internal.ads.zzapv) r2
            java.lang.String r3 = r2.zza()
            java.lang.String r2 = r2.zzb()
            r0.put(r3, r2)
            goto L23
        L3b:
            r4.<init>(r5, r6, r7, r8, r9, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzapz.<init>(int, byte[], boolean, long, java.util.List):void");
    }

    @Deprecated
    public zzapz(byte[] bArr, Map map) {
        this(200, bArr, map, zza(map), false, 0L);
    }
}
