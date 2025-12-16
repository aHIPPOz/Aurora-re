package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhby {
    private static final zzhby zza = new zzhby(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhby() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhby(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzhby zzc() {
        return zza;
    }

    public static zzhby zze(zzhby zzhbyVar, zzhby zzhbyVar2) {
        int i = zzhbyVar.zzb + zzhbyVar2.zzb;
        int[] copyOf = Arrays.copyOf(zzhbyVar.zzc, i);
        System.arraycopy(zzhbyVar2.zzc, 0, copyOf, zzhbyVar.zzb, zzhbyVar2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhbyVar.zzd, i);
        System.arraycopy(zzhbyVar2.zzd, 0, copyOf2, zzhbyVar.zzb, zzhbyVar2.zzb);
        return new zzhby(i, copyOf, copyOf2, true);
    }

    public static zzhby zzf() {
        return new zzhby();
    }

    private final void zzn(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhby)) {
            return false;
        }
        zzhby zzhbyVar = (zzhby) obj;
        int i = this.zzb;
        if (i == zzhbyVar.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhbyVar.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhbyVar.zzd;
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
        int i2 = i + 527;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = ((i2 * 31) + i4) * 31;
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
                        i = zzgym.zzD(i8 << 3) + 8;
                    } else if (i9 == 2) {
                        int zzD = zzgym.zzD(i8 << 3);
                        int zzd = ((zzgxz) this.zzd[i6]).zzd();
                        i = zzD + zzgym.zzD(zzd) + zzd;
                    } else if (i9 == 3) {
                        int zzD2 = zzgym.zzD(i8 << 3);
                        i3 = zzD2 + zzD2;
                        i2 = ((zzhby) this.zzd[i6]).zza();
                    } else if (i9 == 5) {
                        ((Integer) this.zzd[i6]).intValue();
                        i = zzgym.zzD(i8 << 3) + 4;
                    } else {
                        throw new IllegalStateException(new zzgzv("Protocol message tag had invalid wire type."));
                    }
                    i5 += i;
                } else {
                    int i10 = i8 << 3;
                    long longValue = ((Long) this.zzd[i6]).longValue();
                    i3 = zzgym.zzD(i10);
                    i2 = zzgym.zzE(longValue);
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
                int zzD = zzgym.zzD(8);
                int zzD2 = zzgym.zzD(16) + zzgym.zzD(this.zzc[i3] >>> 3);
                int zzD3 = zzgym.zzD(24);
                int zzd = ((zzgxz) this.zzd[i3]).zzd();
                i2 += zzD + zzD + zzD2 + zzD3 + zzgym.zzD(zzd) + zzd;
            }
            this.zze = i2;
            return i2;
        }
        return i;
    }

    public final zzhby zzd(zzhby zzhbyVar) {
        if (zzhbyVar.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhbyVar.zzb;
        zzn(i);
        System.arraycopy(zzhbyVar.zzc, 0, this.zzc, this.zzb, zzhbyVar.zzb);
        System.arraycopy(zzhbyVar.zzd, 0, this.zzd, this.zzb, zzhbyVar.zzb);
        this.zzb = i;
        return this;
    }

    public final void zzg() {
        if (this.zzf) {
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzh() {
        if (this.zzf) {
            this.zzf = false;
        }
    }

    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzhau.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzj(int i, Object obj) {
        zzg();
        zzn(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzhcm zzhcmVar) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzhcmVar.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzl(zzhcm zzhcmVar) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 & 7;
                int i4 = i2 >>> 3;
                if (i3 == 0) {
                    zzhcmVar.zzt(i4, ((Long) obj).longValue());
                } else if (i3 == 1) {
                    zzhcmVar.zzm(i4, ((Long) obj).longValue());
                } else if (i3 == 2) {
                    zzhcmVar.zzd(i4, (zzgxz) obj);
                } else if (i3 == 3) {
                    zzhcmVar.zzF(i4);
                    ((zzhby) obj).zzl(zzhcmVar);
                    zzhcmVar.zzh(i4);
                } else if (i3 == 5) {
                    zzhcmVar.zzk(i4, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(new zzgzv("Protocol message tag had invalid wire type."));
                }
            }
        }
    }

    public final boolean zzm(int i, zzgyf zzgyfVar) throws IOException {
        int zzl;
        zzg();
        int i2 = i & 7;
        if (i2 == 0) {
            zzj(i, Long.valueOf(zzgyfVar.zzo()));
            return true;
        } else if (i2 == 1) {
            zzj(i, Long.valueOf(zzgyfVar.zzn()));
            return true;
        } else if (i2 == 2) {
            zzj(i, zzgyfVar.zzv());
            return true;
        } else if (i2 != 3) {
            if (i2 == 4) {
                zzgyfVar.zzy(0);
                return false;
            } else if (i2 != 5) {
                throw new zzgzv("Protocol message tag had invalid wire type.");
            } else {
                zzj(i, Integer.valueOf(zzgyfVar.zzf()));
                return true;
            }
        } else {
            zzhby zzhbyVar = new zzhby();
            do {
                zzl = zzgyfVar.zzl();
                if (zzl == 0) {
                    break;
                }
            } while (zzhbyVar.zzm(zzl, zzgyfVar));
            zzgyfVar.zzy(4 | ((i >>> 3) << 3));
            zzj(i, zzhbyVar);
            return true;
        }
    }
}
