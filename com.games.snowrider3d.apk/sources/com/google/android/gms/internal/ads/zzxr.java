package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzxr extends zzxt {
    public zzxr(zzbm zzbmVar, int[] iArr, int i, zzzl zzzlVar, long j, long j2, long j3, int i2, int i3, float f, float f2, List list, zzdj zzdjVar) {
        super(zzbmVar, iArr, 0);
        zzfyq.zzl(list);
    }

    public static /* bridge */ /* synthetic */ zzfyq zzd(zzyv[] zzyvVarArr) {
        int i;
        int i2;
        long[][] jArr;
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            i = 1;
            if (i4 >= 2) {
                break;
            }
            zzyv zzyvVar = zzyvVarArr[i4];
            if (zzyvVar == null || zzyvVar.zzb.length <= 1) {
                arrayList.add(null);
            } else {
                int i5 = zzfyq.zzd;
                zzfyn zzfynVar = new zzfyn();
                zzfynVar.zzf(new zzxp(0L, 0L));
                arrayList.add(zzfynVar);
            }
            i4++;
        }
        long[][] jArr2 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            zzyv zzyvVar2 = zzyvVarArr[i6];
            if (zzyvVar2 == null) {
                jArr2[i6] = new long[0];
            } else {
                int[] iArr = zzyvVar2.zzb;
                jArr2[i6] = new long[iArr.length];
                for (int i7 = 0; i7 < iArr.length; i7++) {
                    long j = zzyvVar2.zza.zzb(iArr[i7]).zzj;
                    long[] jArr3 = jArr2[i6];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr3[i7] = j;
                }
                Arrays.sort(jArr2[i6]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr4 = new long[2];
        for (int i8 = 0; i8 < 2; i8++) {
            long[] jArr5 = jArr2[i8];
            jArr4[i8] = jArr5.length == 0 ? 0L : jArr5[0];
        }
        zzi(arrayList, jArr4);
        zzfzb zza = zzfzw.zzc(zzgab.zzc()).zzb(2).zza();
        int i9 = 0;
        while (i9 < 2) {
            int length = jArr2[i9].length;
            if (length <= i) {
                i2 = i3;
                jArr = jArr2;
            } else {
                double[] dArr = new double[length];
                int i10 = i3;
                while (true) {
                    long[] jArr6 = jArr2[i9];
                    double d = 0.0d;
                    if (i10 >= jArr6.length) {
                        break;
                    }
                    int i11 = i3;
                    long[][] jArr7 = jArr2;
                    long j2 = jArr6[i10];
                    if (j2 != -1) {
                        d = Math.log(j2);
                    }
                    dArr[i10] = d;
                    i10++;
                    i3 = i11;
                    jArr2 = jArr7;
                }
                i2 = i3;
                jArr = jArr2;
                int i12 = length - 1;
                double d2 = dArr[i12] - dArr[i2];
                int i13 = i2;
                while (i13 < i12) {
                    double d3 = dArr[i13];
                    i13++;
                    zza.zzq(Double.valueOf(d2 == 0.0d ? 1.0d : (((d3 + dArr[i13]) * 0.5d) - dArr[i2]) / d2), Integer.valueOf(i9));
                    i = i;
                }
            }
            i9++;
            i3 = i2;
            jArr2 = jArr;
            i = i;
        }
        int i14 = i3;
        long[][] jArr8 = jArr2;
        zzfyq zzl = zzfyq.zzl(zza.zzr());
        for (int i15 = i14; i15 < zzl.size(); i15++) {
            int intValue = ((Integer) zzl.get(i15)).intValue();
            int i16 = iArr2[intValue] + 1;
            iArr2[intValue] = i16;
            jArr4[intValue] = jArr8[intValue][i16];
            zzi(arrayList, jArr4);
        }
        for (int i17 = i14; i17 < 2; i17++) {
            if (arrayList.get(i17) != null) {
                long j3 = jArr4[i17];
                jArr4[i17] = j3 + j3;
            }
        }
        zzi(arrayList, jArr4);
        zzfyn zzfynVar2 = new zzfyn();
        while (i14 < arrayList.size()) {
            zzfyn zzfynVar3 = (zzfyn) arrayList.get(i14);
            zzfynVar2.zzf(zzfynVar3 == null ? zzfyq.zzn() : zzfynVar3.zzi());
            i14++;
        }
        return zzfynVar2.zzi();
    }

    private static void zzi(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzfyn zzfynVar = (zzfyn) list.get(i2);
            if (zzfynVar != null) {
                zzfynVar.zzf(new zzxp(j, jArr[i2]));
            }
        }
    }
}
