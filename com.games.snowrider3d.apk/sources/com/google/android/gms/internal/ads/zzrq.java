package com.google.android.gms.internal.ads;

import java.math.RoundingMode;
import kotlin.time.DurationKt;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzrq implements zzra {
    public zzrq(zzrp zzrpVar) {
    }

    protected static int zza(int i, int i2, int i3) {
        return zzgbt.zzb(((i * i2) * i3) / 1000000);
    }

    private static int zzc(int i) {
        int zza = zzadz.zza(i);
        zzdd.zzf(zza != -2147483647);
        return zza;
    }

    public static final int zzb(int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8 = 250000;
        if (i3 == 0) {
            int zza = zza(250000, i5, i4);
            int zza2 = zza(750000, i5, i4);
            String str = zzex.zza;
            return Math.max(zza, Math.min(i * 4, zza2));
        } else if (i3 == 1) {
            return zzgbt.zzb((zzc(i2) * 50000000) / 1000000);
        } else {
            if (i2 == 5) {
                i8 = 500000;
            } else if (i2 == 8) {
                i8 = DurationKt.NANOS_IN_MILLIS;
                i2 = 8;
            }
            if (i6 != -1) {
                i7 = zzgbm.zzb(i6, 8, RoundingMode.CEILING);
            } else {
                i7 = zzc(i2);
            }
            return zzgbt.zzb((i8 * i7) / 1000000);
        }
    }
}
