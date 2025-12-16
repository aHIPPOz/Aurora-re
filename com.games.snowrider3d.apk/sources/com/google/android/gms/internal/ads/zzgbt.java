package com.google.android.gms.internal.ads;

import com.google.common.base.Ascii;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kotlinx.coroutines.internal.LockFreeTaskQueueCore;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgbt extends zzgbu {
    public static /* bridge */ /* synthetic */ int zza(int[] iArr, int i, int i2, int i3) {
        while (i2 < i3) {
            if (iArr[i2] == i) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    public static int zzb(long j) {
        int i = (int) j;
        zzfvp.zzh(((long) i) == j, "Out of range: %s", j);
        return i;
    }

    public static int zzc(int i, int i2, int i3) {
        zzfvp.zzj(true, "min (%s) must be less than or equal to max (%s)", i2, LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
        return Math.min(Math.max(i, i2), (int) LockFreeTaskQueueCore.MAX_CAPACITY_MASK);
    }

    public static int zzd(byte[] bArr) {
        int length = bArr.length;
        zzfvp.zzj(length >= 4, "array too small: %s < %s", length, 4);
        return zze(bArr[0], bArr[1], bArr[2], bArr[3]);
    }

    public static int zze(byte b, byte b2, byte b3, byte b4) {
        return (b << Ascii.CAN) | ((b2 & 255) << 16) | ((b3 & 255) << 8) | (b4 & 255);
    }

    public static int zzf(long j) {
        if (j > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j >= -2147483648L) {
            return (int) j;
        }
        return Integer.MIN_VALUE;
    }

    public static List zzh(int... iArr) {
        int length = iArr.length;
        if (length == 0) {
            return Collections.emptyList();
        }
        return new zzgbs(iArr, 0, length);
    }

    public static int[] zzi(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            Object obj = array[i];
            obj.getClass();
            iArr[i] = ((Number) obj).intValue();
        }
        return iArr;
    }

    public static Integer zzg(String str, int i) {
        Long l;
        str.getClass();
        if (!str.isEmpty()) {
            int i2 = 0;
            char charAt = str.charAt(0);
            if (charAt == '-') {
                i2 = 1;
            }
            if (i2 != str.length()) {
                int i3 = i2 + 1;
                int zza = zzgbv.zza(str.charAt(i2));
                if (zza >= 0 && zza < 10) {
                    long j = -zza;
                    while (true) {
                        if (i3 < str.length()) {
                            int i4 = i3 + 1;
                            int zza2 = zzgbv.zza(str.charAt(i3));
                            if (zza2 < 0 || zza2 >= 10 || j < -922337203685477580L) {
                                break;
                            }
                            long j2 = j * 10;
                            long j3 = zza2;
                            if (j2 < Long.MIN_VALUE + j3) {
                                break;
                            }
                            j = j2 - j3;
                            i3 = i4;
                        } else if (charAt == '-') {
                            l = Long.valueOf(j);
                        } else if (j != Long.MIN_VALUE) {
                            l = Long.valueOf(-j);
                        }
                    }
                }
            }
        }
        l = null;
        if (l == null || l.longValue() != l.intValue()) {
            return null;
        }
        return Integer.valueOf(l.intValue());
    }
}
