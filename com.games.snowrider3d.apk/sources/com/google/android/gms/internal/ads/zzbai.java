package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.MurmurHash3;
import java.io.UnsupportedEncodingException;
import javax.annotation.ParametersAreNonnullByDefault;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes2.dex */
public final class zzbai {
    public static int zza(String str) {
        byte[] bArr;
        try {
            bArr = str.getBytes("UTF-8");
        } catch (UnsupportedEncodingException unused) {
            bArr = str.getBytes();
        }
        return MurmurHash3.murmurhash3_x86_32(bArr, 0, bArr.length, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ee, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00fe, code lost:
        if (true != r4) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0100, code lost:
        r5 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0101, code lost:
        r4 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String[] zzb(java.lang.String r11, boolean r12) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbai.zzb(java.lang.String, boolean):java.lang.String[]");
    }
}
