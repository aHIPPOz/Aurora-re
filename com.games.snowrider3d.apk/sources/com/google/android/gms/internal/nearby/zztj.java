package com.google.android.gms.internal.nearby;

import java.math.RoundingMode;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zztj {
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int zzb(int i, RoundingMode roundingMode) {
        if (i > 0) {
            switch (zzti.zza[roundingMode.ordinal()]) {
                case 1:
                    zztk.zza(((i + (-1)) & i) == 0);
                    break;
                case 2:
                case 3:
                    break;
                case 4:
                case 5:
                    return 32 - Integer.numberOfLeadingZeros(i - 1);
                case 6:
                case 7:
                case 8:
                    int numberOfLeadingZeros = Integer.numberOfLeadingZeros(i);
                    return (31 - numberOfLeadingZeros) + ((((-1257966797) >>> numberOfLeadingZeros) - i) >>> 31);
                default:
                    throw new AssertionError();
            }
            return 31 - Integer.numberOfLeadingZeros(i);
        }
        throw new IllegalArgumentException("x (0) must be > 0");
    }

    public static int zza(int i, int i2, RoundingMode roundingMode) {
        roundingMode.getClass();
        if (i2 == 0) {
            throw new ArithmeticException("/ by zero");
        }
        int i3 = i / i2;
        int i4 = i - (i2 * i3);
        if (i4 == 0) {
            return i3;
        }
        int i5 = 1;
        int i6 = ((i ^ i2) >> 31) | 1;
        switch (zzti.zza[roundingMode.ordinal()]) {
            case 1:
                zztk.zza(false);
                return i3;
            case 2:
                return i3;
            case 3:
                if (i6 >= 0) {
                    return i3;
                }
                break;
            case 4:
                break;
            case 5:
                if (i6 <= 0) {
                    return i3;
                }
                break;
            case 6:
            case 7:
            case 8:
                int abs = Math.abs(i4);
                int abs2 = abs - (Math.abs(i2) - abs);
                if (abs2 == 0) {
                    if (roundingMode != RoundingMode.HALF_UP) {
                        if (roundingMode != RoundingMode.HALF_EVEN) {
                            i5 = 0;
                        }
                        if ((i3 & 1 & i5) == 0) {
                            return i3;
                        }
                    }
                } else if (abs2 <= 0) {
                    return i3;
                }
                break;
            default:
                throw new AssertionError();
        }
        return i3 + i6;
    }
}
