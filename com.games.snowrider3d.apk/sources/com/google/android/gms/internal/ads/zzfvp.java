package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfvp {
    public static int zza(int i, int i2, String str) {
        String str2;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                str2 = zzfwg.zzb("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else if (i2 < 0) {
                throw new IllegalArgumentException("negative size: " + i2);
            } else {
                str2 = zzfwg.zzb("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(str2);
        }
        return i;
    }

    public static int zzb(int i, int i2, String str) {
        if (i < 0 || i > i2) {
            throw new IndexOutOfBoundsException(zzn(i, i2, "index"));
        }
        return i;
    }

    public static Object zzc(Object obj, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException((String) obj2);
    }

    public static Object zzd(Object obj, String str, Object obj2) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException(zzfwg.zzb(str, obj2));
    }

    public static void zze(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException();
    }

    public static void zzf(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException((String) obj);
    }

    public static void zzg(boolean z, String str, char c) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfwg.zzb(str, Character.valueOf(c)));
    }

    public static void zzh(boolean z, String str, long j) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfwg.zzb(str, Long.valueOf(j)));
    }

    public static void zzi(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfwg.zzb(str, obj));
    }

    public static void zzj(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        throw new IllegalArgumentException(zzfwg.zzb(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void zzk(int i, int i2, int i3) {
        String str;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                str = zzn(i, i3, "start index");
            } else if (i2 < 0 || i2 > i3) {
                str = zzn(i2, i3, "end index");
            } else {
                str = zzfwg.zzb("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(str);
        }
    }

    public static void zzl(boolean z) {
        if (z) {
            return;
        }
        throw new IllegalStateException();
    }

    public static void zzm(boolean z, Object obj) {
        if (z) {
            return;
        }
        throw new IllegalStateException((String) obj);
    }

    private static String zzn(int i, int i2, String str) {
        if (i < 0) {
            return zzfwg.zzb("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("negative size: " + i2);
        }
        return zzfwg.zzb("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
    }
}
