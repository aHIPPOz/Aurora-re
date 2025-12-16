package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.google.android.gms.common.util.Hex;
import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfpv {
    final File zza;
    private final File zzb;
    private final SharedPreferences zzc;
    private final int zzd;

    public zzfpv(Context context, int i) {
        this.zzc = context.getSharedPreferences("pcvmspf", 0);
        File dir = context.getDir("pccache", 0);
        zzfpw.zza(dir, false);
        this.zzb = dir;
        File dir2 = context.getDir("tmppccache", 0);
        zzfpw.zza(dir2, true);
        this.zza = dir2;
        this.zzd = i;
    }

    private final File zzd() {
        File file = new File(this.zzb, Integer.toString(this.zzd - 1));
        if (!file.exists()) {
            file.mkdir();
        }
        return file;
    }

    private final String zze() {
        StringBuilder sb = new StringBuilder("FBAMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    private final String zzf() {
        StringBuilder sb = new StringBuilder("LATMTD");
        sb.append(this.zzd - 1);
        return sb.toString();
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x015c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zza(com.google.android.gms.internal.ads.zzayp r9, com.google.android.gms.internal.ads.zzfqb r10) {
        /*
            Method dump skipped, instructions count: 376
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpv.zza(com.google.android.gms.internal.ads.zzayp, com.google.android.gms.internal.ads.zzfqb):boolean");
    }

    final zzays zzb(int i) {
        String str;
        if (i == 1) {
            str = this.zzc.getString(zzf(), null);
        } else {
            str = this.zzc.getString(zze(), null);
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            byte[] stringToBytes = Hex.stringToBytes(str);
            zzgxz zzgxzVar = zzgxz.zzb;
            zzays zzh = zzays.zzh(zzgxz.zzv(stringToBytes, 0, stringToBytes.length));
            String zzk = zzh.zzk();
            File zzb = zzfpw.zzb(zzk, "pcam.jar", zzd());
            if (!zzb.exists()) {
                zzb = zzfpw.zzb(zzk, "pcam", zzd());
            }
            File zzb2 = zzfpw.zzb(zzk, "pcbc", zzd());
            if (zzb.exists()) {
                if (zzb2.exists()) {
                    return zzh;
                }
            }
        } catch (zzgzw unused) {
        }
        return null;
    }

    public final zzfpu zzc(int i) {
        zzays zzb = zzb(1);
        if (zzb == null) {
            return null;
        }
        String zzk = zzb.zzk();
        File zzb2 = zzfpw.zzb(zzk, "pcam.jar", zzd());
        if (!zzb2.exists()) {
            zzb2 = zzfpw.zzb(zzk, "pcam", zzd());
        }
        return new zzfpu(zzb, zzb2, zzfpw.zzb(zzk, "pcbc", zzd()), zzfpw.zzb(zzk, "pcopt", zzd()));
    }
}
