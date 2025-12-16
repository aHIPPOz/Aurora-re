package com.google.android.gms.internal.games_v2;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzfu {
    public static void zza(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfv.zza(str, obj, obj2));
    }

    public static int zzb(int i, int i2, String str) {
        String str2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str2 = zzfv.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
                sb.append("negative size: ");
                sb.append(i2);
                throw new IllegalArgumentException(sb.toString());
            } else {
                str2 = zzfv.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str2);
        }
        return i;
    }

    public static int zzc(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zze(i, i2, "index"));
        }
        return i;
    }

    public static void zzd(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = zze(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = zze(i2, i3, "end index");
            } else {
                str = zzfv.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String zze(int i, int i2, String str) {
        if (i < 0) {
            return zzfv.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(i2).length() + 15);
            sb.append("negative size: ");
            sb.append(i2);
            throw new IllegalArgumentException(sb.toString());
        }
        return zzfv.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
