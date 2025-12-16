package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzly extends zzht {
    public static final /* synthetic */ int zzb = 0;
    private final int zzc;
    private final int zzd;
    private final int[] zze;
    private final int[] zzf;
    private final zzbl[] zzg;
    private final Object[] zzh;
    private final HashMap zzi;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzly(java.util.Collection r7, com.google.android.gms.internal.ads.zzxc r8) {
        /*
            r6 = this;
            int r0 = r7.size()
            com.google.android.gms.internal.ads.zzbl[] r0 = new com.google.android.gms.internal.ads.zzbl[r0]
            java.util.Iterator r1 = r7.iterator()
            r2 = 0
            r3 = r2
        Lc:
            boolean r4 = r1.hasNext()
            if (r4 == 0) goto L22
            java.lang.Object r4 = r1.next()
            com.google.android.gms.internal.ads.zzlg r4 = (com.google.android.gms.internal.ads.zzlg) r4
            int r5 = r3 + 1
            com.google.android.gms.internal.ads.zzbl r4 = r4.zza()
            r0[r3] = r4
            r3 = r5
            goto Lc
        L22:
            int r1 = r7.size()
            java.lang.Object[] r1 = new java.lang.Object[r1]
            java.util.Iterator r7 = r7.iterator()
        L2c:
            boolean r3 = r7.hasNext()
            if (r3 == 0) goto L42
            java.lang.Object r3 = r7.next()
            com.google.android.gms.internal.ads.zzlg r3 = (com.google.android.gms.internal.ads.zzlg) r3
            int r4 = r2 + 1
            java.lang.Object r3 = r3.zzb()
            r1[r2] = r3
            r2 = r4
            goto L2c
        L42:
            r6.<init>(r0, r1, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzly.<init>(java.util.Collection, com.google.android.gms.internal.ads.zzxc):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzb() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.ads.zzbl
    public final int zzc() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzp(Object obj) {
        Integer num = (Integer) this.zzi.get(obj);
        if (num == null) {
            return -1;
        }
        return num.intValue();
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzq(int i) {
        return zzex.zzc(this.zze, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzr(int i) {
        return zzex.zzc(this.zzf, i + 1, false, false);
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzs(int i) {
        return this.zze[i];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final int zzt(int i) {
        return this.zzf[i];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final zzbl zzu(int i) {
        return this.zzg[i];
    }

    @Override // com.google.android.gms.internal.ads.zzht
    protected final Object zzv(int i) {
        return this.zzh[i];
    }

    public final List zzw() {
        return Arrays.asList(this.zzg);
    }

    public final zzly zzx(zzxc zzxcVar) {
        zzbl[] zzblVarArr = this.zzg;
        zzbl[] zzblVarArr2 = new zzbl[zzblVarArr.length];
        for (int i = 0; i < zzblVarArr.length; i++) {
            zzblVarArr2[i] = new zzlx(this, zzblVarArr[i]);
        }
        return new zzly(zzblVarArr2, this.zzh, zzxcVar);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private zzly(zzbl[] zzblVarArr, Object[] objArr, zzxc zzxcVar) {
        super(false, zzxcVar);
        int i = 0;
        this.zzg = zzblVarArr;
        int length = zzblVarArr.length;
        this.zze = new int[length];
        this.zzf = new int[length];
        this.zzh = objArr;
        this.zzi = new HashMap();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i < zzblVarArr.length) {
            zzbl zzblVar = zzblVarArr[i];
            this.zzg[i4] = zzblVar;
            this.zzf[i4] = i2;
            this.zze[i4] = i3;
            i2 += zzblVar.zzc();
            i3 += this.zzg[i4].zzb();
            this.zzi.put(objArr[i4], Integer.valueOf(i4));
            i++;
            i4++;
        }
        this.zzc = i2;
        this.zzd = i3;
    }
}
