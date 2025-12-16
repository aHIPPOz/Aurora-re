package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.util.Log;
import java.io.IOException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzfsc {
    private static zzfsc zza;
    private final String zzb;
    private final SharedPreferences zzc;

    private zzfsc(Context context) {
        this.zzb = context.getPackageName();
        this.zzc = context.getSharedPreferences("paid_storage_sp", 0);
    }

    public static zzfsc zzb(Context context) {
        if (zza == null) {
            zza = new zzfsc(context);
        }
        return zza;
    }

    public final long zza(String str, long j) {
        return this.zzc.getLong(str, -1L);
    }

    @Nullable
    public final String zzc(String str, String str2) {
        return this.zzc.getString(str, null);
    }

    public final void zzd(String str, Object obj) throws IOException {
        boolean z;
        if (obj instanceof String) {
            z = this.zzc.edit().putString(str, (String) obj).commit();
        } else if (obj instanceof Long) {
            z = this.zzc.edit().putLong(str, ((Long) obj).longValue()).commit();
        } else if (obj instanceof Boolean) {
            z = this.zzc.edit().putBoolean(str, ((Boolean) obj).booleanValue()).commit();
        } else if (obj instanceof Integer) {
            z = this.zzc.edit().putInt(str, ((Integer) obj).intValue()).commit();
        } else {
            String valueOf = String.valueOf(obj.getClass());
            String str2 = this.zzb;
            Log.e("GpidLifecycleSPHandler", "Unexpected object class " + valueOf + " for app " + str2);
            String str3 = this.zzb;
            throw new IOException("Failed to store " + str + " for app " + str3);
        }
        if (z) {
            return;
        }
        String str32 = this.zzb;
        throw new IOException("Failed to store " + str + " for app " + str32);
    }

    public final void zze(String str) throws IOException {
        if (this.zzc.edit().remove(str).commit()) {
            return;
        }
        String str2 = this.zzb;
        throw new IOException("Failed to remove " + str + " for app " + str2);
    }

    public final boolean zzf(String str, boolean z) {
        return this.zzc.getBoolean(str, true);
    }

    public final boolean zzg(String str) {
        return this.zzc.contains(str);
    }
}
