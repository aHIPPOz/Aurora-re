package com.google.android.gms.internal.nearby;

import android.content.ContentResolver;
import android.net.Uri;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzry {
    static HashMap zze;
    private static Object zzl;
    private static boolean zzm;
    public static final Uri zza = Uri.parse("content://com.google.android.gsf.gservices");
    public static final Uri zzb = Uri.parse("content://com.google.android.gsf.gservices/prefix");
    public static final Pattern zzc = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
    public static final Pattern zzd = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    private static final AtomicBoolean zzk = new AtomicBoolean();
    static final HashMap zzf = new HashMap();
    static final HashMap zzg = new HashMap();
    static final HashMap zzh = new HashMap();
    static final HashMap zzi = new HashMap();
    static final String[] zzj = new String[0];

    /* JADX WARN: Removed duplicated region for block: B:79:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzb(android.content.ContentResolver r17, java.lang.String r18, boolean r19) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.nearby.zzry.zzb(android.content.ContentResolver, java.lang.String, boolean):boolean");
    }

    private static void zzc(ContentResolver contentResolver) {
        if (zze == null) {
            zzk.set(false);
            zze = new HashMap();
            zzl = new Object();
            zzm = false;
            contentResolver.registerContentObserver(zza, true, new zzrx(null));
        } else if (!zzk.getAndSet(false)) {
        } else {
            zze.clear();
            zzf.clear();
            zzg.clear();
            zzh.clear();
            zzi.clear();
            zzl = new Object();
            zzm = false;
        }
    }

    private static void zzd(Object obj, String str, String str2) {
        synchronized (zzry.class) {
            if (obj == zzl) {
                zze.put("gms:nearby:requires_gms_check", str2);
            }
        }
    }
}
