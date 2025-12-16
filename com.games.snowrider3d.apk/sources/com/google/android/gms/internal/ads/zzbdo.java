package com.google.android.gms.internal.ads;

import android.text.TextUtils;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzbdo extends zzbdp {
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0034, code lost:
        if (r0 != r6.length()) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static final java.lang.String zzb(java.lang.String r6) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r6)
            if (r0 == 0) goto L7
            goto L37
        L7:
            int r0 = r6.length()
            r1 = 0
            r2 = r1
        Ld:
            int r3 = r6.length()
            r4 = 44
            if (r2 >= r3) goto L1e
            char r3 = r6.charAt(r2)
            if (r3 != r4) goto L1e
            int r2 = r2 + 1
            goto Ld
        L1e:
            if (r0 <= 0) goto L2a
            int r3 = r0 + (-1)
            char r5 = r6.charAt(r3)
            if (r5 != r4) goto L2a
            r0 = r3
            goto L1e
        L2a:
            if (r0 >= r2) goto L2e
            r6 = 0
            return r6
        L2e:
            if (r2 != 0) goto L38
            int r2 = r6.length()
            if (r0 == r2) goto L37
            goto L39
        L37:
            return r6
        L38:
            r1 = r2
        L39:
            java.lang.String r6 = r6.substring(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdo.zzb(java.lang.String):java.lang.String");
    }

    @Override // com.google.android.gms.internal.ads.zzbdp
    public final String zza(String str, String str2) {
        String zzb = zzb(str);
        String zzb2 = zzb(str2);
        if (TextUtils.isEmpty(zzb)) {
            return zzb2;
        }
        if (TextUtils.isEmpty(zzb2)) {
            return zzb;
        }
        return zzb + "," + zzb2;
    }
}
