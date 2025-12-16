package com.google.android.gms.ads.nonagon.signalgeneration;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbde;
import com.google.android.gms.internal.ads.zzbze;
import com.google.android.gms.internal.ads.zzdrr;
import java.util.concurrent.ScheduledExecutorService;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes.dex */
public final class zzb {
    private final Context zza;
    private final zzd zzb;
    private final long zzc;
    private final ScheduledExecutorService zzd;
    private final PackageInfo zze;

    public zzb(Context context, long j, PackageInfo packageInfo, zzd zzdVar, ScheduledExecutorService scheduledExecutorService) {
        this.zza = context;
        this.zzc = j;
        this.zze = packageInfo;
        this.zzb = zzdVar;
        this.zzd = scheduledExecutorService;
    }

    public static String zzb(String str) {
        if (str == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            charArray[i] = (char) (charArray[i] ^ "f8L7o2HxjA4p9Z1nQw3E5r6T8yU2iCv0B9kM4sD1f7G3hJ5lK2z0X9cW8vQ6b5N3m1Rg8F2o0Lp7A1e9I4u3Y2t0H8x6W5v4Z1n9Q2w7E3r5T8y6U1i0C9vB8k7M4s3D1f2G0h9J5l8K4z7X3cW2v1Q0b9N8m6A5r4F3o2Lp1E0u9I8y7Y6t5H4x3W2v1Z0n9Q8w7E6r5T4y3U2i1C0v9B8k7M6s5D4f3G2h1J0l9K8z7X6cW5v4Q3b2N1m0Rg9F8o7Lp6A5e4I3u2Y1t0H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2v1Z0n0Q9w8E7r6T5y4U3i2C1v0B9k8M7s6D5f4G3h2J1l0K9z8X7cW6v5Q4b3N2m1R0g9F8o7L6p5A4e3I2u1Y0t9H8x7W6v5Z4n3Q2w1E0r9T8y7U6i5C4v3B2k1M0s9D8f7G6h5J4l3K2z1X0cW9v8Q7b6N5m4A3r2F1o0Lp9E8u7I6y5T4h3W2".charAt(i % 555));
        }
        return new String(charArray);
    }

    public static /* synthetic */ void zzc(zzb zzbVar, String str, zzau zzauVar, zzbze zzbzeVar) {
        if (zzbVar.zzb.zzj(str) || zzbVar.zze()) {
            return;
        }
        zzauVar.zzf(ObjectWrapper.wrap(zzbVar.zza), zzbzeVar, null);
    }

    private final boolean zze() {
        return this.zzb.zzf().size() >= ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhS)).intValue();
    }

    private static final void zzf(Bundle bundle, zzdrr zzdrrVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhT)).booleanValue()) {
            return;
        }
        bundle.putLong(zzdrrVar.zza(), com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis());
    }

    private static final void zzg(Bundle bundle, int i) {
        bundle.putBoolean("sod_h", false);
        bundle.putInt("cmr", i - 1);
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x010a, code lost:
        if (r12.zza() > r10) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.ads.nonagon.signalgeneration.zzbk zza(com.google.android.gms.internal.ads.zzbze r19, final com.google.android.gms.ads.nonagon.signalgeneration.zzau r20, android.os.Bundle r21) {
        /*
            Method dump skipped, instructions count: 642
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zza(com.google.android.gms.internal.ads.zzbze, com.google.android.gms.ads.nonagon.signalgeneration.zzau, android.os.Bundle):com.google.android.gms.ads.nonagon.signalgeneration.zzbk");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(java.lang.String r6, com.google.android.gms.ads.nonagon.signalgeneration.zzbk r7) {
        /*
            r5 = this;
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 != 0) goto L79
            boolean r0 = r5.zze()
            if (r0 == 0) goto Ld
            goto L79
        Ld:
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L60
            r1.<init>()     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "params"
            java.lang.String r3 = r7.zza     // Catch: org.json.JSONException -> L60
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "signal_dictionary"
            com.google.android.gms.ads.internal.util.client.zzf r3 = com.google.android.gms.ads.internal.client.zzbb.zzb()     // Catch: org.json.JSONException -> L60
            android.os.Bundle r4 = r7.zzf     // Catch: org.json.JSONException -> L60
            org.json.JSONObject r3 = r3.zzn(r4)     // Catch: org.json.JSONException -> L60
            r1.put(r2, r3)     // Catch: org.json.JSONException -> L60
            java.lang.String r2 = "sr"
            r0.put(r2, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r7 = r7.zzc     // Catch: org.json.JSONException -> L60
            boolean r1 = android.text.TextUtils.isEmpty(r7)     // Catch: org.json.JSONException -> L60
            if (r1 == 0) goto L3d
            java.lang.String r7 = ""
            goto L6e
        L3d:
            java.lang.String r7 = zzb(r7)     // Catch: org.json.JSONException -> L60
            java.nio.charset.Charset r1 = java.nio.charset.StandardCharsets.UTF_8     // Catch: org.json.JSONException -> L60
            byte[] r7 = r7.getBytes(r1)     // Catch: org.json.JSONException -> L60
            r1 = 10
            java.lang.String r7 = android.util.Base64.encodeToString(r7, r1)     // Catch: org.json.JSONException -> L60
            java.lang.String r1 = "rs"
            r0.put(r1, r7)     // Catch: org.json.JSONException -> L60
            java.lang.String r7 = "ts_ms"
            com.google.android.gms.common.util.Clock r1 = com.google.android.gms.ads.internal.zzv.zzD()     // Catch: org.json.JSONException -> L60
            long r1 = r1.currentTimeMillis()     // Catch: org.json.JSONException -> L60
            r0.put(r7, r1)     // Catch: org.json.JSONException -> L60
            goto L6a
        L60:
            r7 = move-exception
            java.lang.String r1 = "DiskCachingManager.createStringToWrite"
            com.google.android.gms.internal.ads.zzbzs r2 = com.google.android.gms.ads.internal.zzv.zzp()
            r2.zzw(r7, r1)
        L6a:
            java.lang.String r7 = r0.toString()
        L6e:
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 != 0) goto L79
            com.google.android.gms.ads.nonagon.signalgeneration.zzd r0 = r5.zzb
            r0.zzh(r6, r7)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.nonagon.signalgeneration.zzb.zzd(java.lang.String, com.google.android.gms.ads.nonagon.signalgeneration.zzbk):void");
    }
}
