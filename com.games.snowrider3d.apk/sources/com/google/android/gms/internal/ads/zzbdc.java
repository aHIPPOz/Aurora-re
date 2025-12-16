package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.ConditionVariable;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbdc implements SharedPreferences.OnSharedPreferenceChangeListener {
    private Context zzg;
    private final Object zzb = new Object();
    private final ConditionVariable zzc = new ConditionVariable();
    private volatile boolean zzd = false;
    volatile boolean zza = false;
    private SharedPreferences zze = null;
    private Bundle zzf = new Bundle();
    private JSONObject zzh = new JSONObject();
    private boolean zzi = false;
    private boolean zzj = false;

    private final void zzg(final SharedPreferences sharedPreferences) {
        if (sharedPreferences != null) {
            try {
                this.zzh = new JSONObject((String) zzbdg.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbcz
                    @Override // com.google.android.gms.internal.ads.zzfwh
                    public final Object zza() {
                        return sharedPreferences.getString("flag_configuration", "{}");
                    }
                }));
            } catch (JSONException unused) {
            }
        }
    }

    @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
    public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
        if ("flag_configuration".equals(str)) {
            zzg(sharedPreferences);
        }
    }

    public final Object zzb(final zzbcv zzbcvVar) {
        if (!this.zzc.block(5000L)) {
            synchronized (this.zzb) {
                if (!this.zza) {
                    throw new IllegalStateException("Flags.initialize() was not called!");
                }
            }
        }
        if (!this.zzd || this.zze == null || this.zzj) {
            synchronized (this.zzb) {
                if (this.zzd && this.zze != null && !this.zzj) {
                }
                return zzbcvVar.zzl();
            }
        }
        if (zzbcvVar.zze() == 2) {
            Bundle bundle = this.zzf;
            if (bundle == null) {
                return zzbcvVar.zzl();
            }
            return zzbcvVar.zzb(bundle);
        } else if (zzbcvVar.zze() != 1 || !this.zzh.has(zzbcvVar.zzm())) {
            return zzbdg.zza(new zzfwh() { // from class: com.google.android.gms.internal.ads.zzbda
                @Override // com.google.android.gms.internal.ads.zzfwh
                public final Object zza() {
                    Object zzc;
                    zzc = zzbcvVar.zzc(zzbdc.this.zze);
                    return zzc;
                }
            });
        } else {
            return zzbcvVar.zza(this.zzh);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:56:0x0114, code lost:
        if (new org.json.JSONObject((java.lang.String) com.google.android.gms.internal.ads.zzbdg.zza(new com.google.android.gms.internal.ads.zzbcy())).optBoolean("local_flags_enabled") != false) goto L57;
     */
    /* JADX WARN: Removed duplicated region for block: B:59:0x011a A[Catch: all -> 0x015a, TRY_ENTER, TRY_LEAVE, TryCatch #3 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x000f, B:12:0x0014, B:13:0x0016, B:15:0x0028, B:16:0x002c, B:17:0x002e, B:37:0x0098, B:38:0x009f, B:46:0x00cf, B:59:0x011a, B:66:0x0148, B:67:0x014f, B:19:0x0043, B:22:0x004d, B:26:0x0056, B:29:0x0061, B:30:0x0069, B:32:0x006f, B:34:0x007f, B:36:0x0094, B:39:0x00a2, B:41:0x00a6, B:43:0x00b6, B:45:0x00cb, B:47:0x00d7, B:50:0x00e8, B:52:0x00f6, B:54:0x00fe, B:55:0x0109, B:57:0x0116, B:60:0x0123, B:62:0x013a, B:64:0x013e, B:65:0x0141), top: B:78:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0123 A[Catch: all -> 0x0151, TRY_ENTER, TryCatch #3 {, blocks: (B:6:0x0009, B:8:0x000d, B:10:0x000f, B:12:0x0014, B:13:0x0016, B:15:0x0028, B:16:0x002c, B:17:0x002e, B:37:0x0098, B:38:0x009f, B:46:0x00cf, B:59:0x011a, B:66:0x0148, B:67:0x014f, B:19:0x0043, B:22:0x004d, B:26:0x0056, B:29:0x0061, B:30:0x0069, B:32:0x006f, B:34:0x007f, B:36:0x0094, B:39:0x00a2, B:41:0x00a6, B:43:0x00b6, B:45:0x00cb, B:47:0x00d7, B:50:0x00e8, B:52:0x00f6, B:54:0x00fe, B:55:0x0109, B:57:0x0116, B:60:0x0123, B:62:0x013a, B:64:0x013e, B:65:0x0141), top: B:78:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(android.content.Context r11) {
        /*
            Method dump skipped, instructions count: 349
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdc.zzd(android.content.Context):void");
    }

    public final boolean zze() {
        return this.zzj;
    }

    public final boolean zzf() {
        return this.zzi;
    }

    public final Object zzc(zzbcv zzbcvVar) {
        return (this.zzd || this.zza) ? zzb(zzbcvVar) : zzbcvVar.zzl();
    }
}
