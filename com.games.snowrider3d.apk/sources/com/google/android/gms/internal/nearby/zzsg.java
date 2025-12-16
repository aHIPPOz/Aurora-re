package com.google.android.gms.internal.nearby;

import javax.annotation.CheckForNull;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzsg {
    public static int zza(int i, int i2, String str) {
        String str2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str2 = zzsi.zza("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                str2 = zzsi.zza("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str2);
        }
        return i;
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzh(i, i2, "index"));
        }
        return i;
    }

    public static Object zzc(@CheckForNull Object obj, @CheckForNull Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static void zzd(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zze(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzsi.zza(str, Character.valueOf(c)));
    }

    public static void zzf(boolean z, String str, @CheckForNull Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzsi.zza(str, obj));
    }

    public static void zzg(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = zzh(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = zzh(i2, i3, "end index");
            } else {
                str = zzsi.zza("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    private static String zzh(int i, int i2, String str) {
        if (i < 0) {
            return zzsi.zza("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        }
        return zzsi.zza("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
