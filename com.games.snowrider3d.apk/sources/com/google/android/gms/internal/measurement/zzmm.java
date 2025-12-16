package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzmm {
    private static final zzmm zza = new zzmm(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzmm() {
        this(0, new int[8], new Object[8], true);
    }

    private zzmm(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzmm zzc() {
        return zza;
    }

    public static zzmm zzd(zzmm zzmmVar, zzmm zzmmVar2) {
        int i = zzmmVar.zzb + zzmmVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzmmVar.zzc, i);
        System.arraycopy(zzmmVar2.zzc, 0, copyOf, zzmmVar.zzb, zzmmVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzmmVar.zzd, i);
        System.arraycopy(zzmmVar2.zzd, 0, copyOf2, zzmmVar.zzb, zzmmVar2.zzb);
        return new zzmm(i, copyOf, copyOf2, true);
    }

    public static zzmm zze() {
        return new zzmm(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzmm)) {
            return false;
        }
        zzmm zzmmVar = (zzmm) obj;
        int i = this.zzb;
        if (i == zzmmVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzmmVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzmmVar.zzd;
                    int i3 = this.zzb;
                    for (int i4 = 0; i4 < i3; i4++) {
                        if (objArr[i4].equals(objArr2[i4])) {
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int i;
        int i2;
        int i3;
        int i4 = this.zze;
        if (i4 == -1) {
            int i5 = 0;
            for (int i6 = 0; i6 < this.zzb; i6++) {
                int i7 = this.zzc[i6];
                int i8 = i7 >>> 3;
                int i9 = i7 & 7;
                if (i9 != 0) {
                    if (i9 == 1) {
                        ((Long) this.zzd[i6]).longValue();
                        i = zzjj.zzA(i8 << 3) + 8;
                    } else if (i9 == 2) {
                        int zzA = zzjj.zzA(i8 << 3);
                        int zzd = ((zzjb) this.zzd[i6]).zzd();
                        i5 += zzA + zzjj.zzA(zzd) + zzd;
                    } else if (i9 == 3) {
                        int zzz = zzjj.zzz(i8);
                        i3 = zzz + zzz;
                        i2 = ((zzmm) this.zzd[i6]).zza();
                    } else if (i9 == 5) {
                        ((Integer) this.zzd[i6]).intValue();
                        i = zzjj.zzA(i8 << 3) + 4;
                    } else {
                        throw new IllegalStateException(zzkm.zza());
                    }
                    i5 += i;
                } else {
                    long longValue = ((Long) this.zzd[i6]).longValue();
                    i3 = zzjj.zzA(i8 << 3);
                    i2 = zzjj.zzB(longValue);
                }
                i = i3 + i2;
                i5 += i;
            }
            this.zze = i5;
            return i5;
        }
        return i4;
    }

    public final int zzb() {
        int i = this.zze;
        if (i == -1) {
            int i2 = 0;
            for (int i3 = 0; i3 < this.zzb; i3++) {
                int i4 = this.zzc[i3];
                int zzA = zzjj.zzA(8);
                int zzd = ((zzjb) this.zzd[i3]).zzd();
                i2 += zzA + zzA + zzjj.zzA(16) + zzjj.zzA(i4 >>> 3) + zzjj.zzA(24) + zzjj.zzA(zzd) + zzd;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzll.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzh(int i, Object obj) {
        if (this.zzf) {
            int i2 = this.zzb;
            int[] iArr = this.zzc;
            if (i2 == iArr.length) {
                int i3 = i2 + (i2 < 4 ? 8 : i2 >> 1);
                this.zzc = Arrays.copyOf(iArr, i3);
                this.zzd = Arrays.copyOf(this.zzd, i3);
            }
            int[] iArr2 = this.zzc;
            int i4 = this.zzb;
            iArr2[i4] = i;
            this.zzd[i4] = obj;
            this.zzb = i4 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zznd zzndVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzndVar.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzndVar.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzndVar.zzd(i3, (zzjb) obj);
                } else if (i4 == 3) {
                    zzndVar.zzE(i3);
                    ((zzmm) obj).zzi(zzndVar);
                    zzndVar.zzh(i3);
                } else if (i4 == 5) {
                    zzndVar.zzk(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzkm.zza());
                }
            }
        }
    }
}
