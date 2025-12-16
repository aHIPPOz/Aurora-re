package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzamc {
    private static final Pattern zza = Pattern.compile("\\[voice=\"([^\"]*)\"\\]");
    private static final Pattern zzb = Pattern.compile("^((?:[0-9]*\\.)?[0-9]+)(px|em|%)$");
    private final zzen zzc = new zzen();
    private final StringBuilder zzd = new StringBuilder();

    static String zza(zzen zzenVar, StringBuilder sb) {
        zzc(zzenVar);
        if (zzenVar.zza() == 0) {
            return null;
        }
        String zzd = zzd(zzenVar, sb);
        if (!RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED.equals(zzd)) {
            return zzd;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append((char) zzenVar.zzm());
        return sb2.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x004a, code lost:
        r4 = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x004c, code lost:
        if (r4 >= r2) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0051, code lost:
        if (((char) r3[r1]) != '*') goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0056, code lost:
        if (((char) r3[r4]) != '/') goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0058, code lost:
        r2 = r1 + 2;
        r1 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
        r1 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x005e, code lost:
        r8.zzM(r2 - r8.zzc());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void zzc(com.google.android.gms.internal.ads.zzen r8) {
        /*
            r0 = 1
        L1:
            r1 = r0
        L2:
            int r2 = r8.zza()
            if (r2 <= 0) goto L6d
            if (r1 == 0) goto L6d
            int r1 = r8.zzc()
            byte[] r2 = r8.zzN()
            r1 = r2[r1]
            char r1 = (char) r1
            r2 = 9
            if (r1 == r2) goto L69
            r2 = 10
            if (r1 == r2) goto L69
            r2 = 12
            if (r1 == r2) goto L69
            r2 = 13
            if (r1 == r2) goto L69
            r2 = 32
            if (r1 == r2) goto L69
            int r1 = r8.zzc()
            int r2 = r8.zzd()
            byte[] r3 = r8.zzN()
            int r4 = r1 + 2
            r5 = 0
            if (r4 > r2) goto L67
            int r4 = r1 + 1
            r6 = r3[r1]
            r7 = 47
            if (r6 != r7) goto L67
            int r1 = r1 + 2
            r4 = r3[r4]
            r6 = 42
            if (r4 != r6) goto L67
        L4a:
            int r4 = r1 + 1
            if (r4 >= r2) goto L5e
            r5 = r3[r1]
            char r5 = (char) r5
            if (r5 != r6) goto L5c
            r5 = r3[r4]
            char r5 = (char) r5
            if (r5 != r7) goto L5c
            int r2 = r1 + 2
            r1 = r2
            goto L4a
        L5c:
            r1 = r4
            goto L4a
        L5e:
            int r1 = r8.zzc()
            int r2 = r2 - r1
            r8.zzM(r2)
            goto L1
        L67:
            r1 = r5
            goto L2
        L69:
            r8.zzM(r0)
            goto L1
        L6d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamc.zzc(com.google.android.gms.internal.ads.zzen):void");
    }

    private static String zzd(zzen zzenVar, StringBuilder sb) {
        sb.setLength(0);
        int zzc = zzenVar.zzc();
        int zzd = zzenVar.zzd();
        loop0: while (true) {
            for (boolean z = false; zzc < zzd && !z; z = true) {
                char c = (char) zzenVar.zzN()[zzc];
                if ((c >= 'A' && c <= 'Z') || ((c >= 'a' && c <= 'z') || ((c >= '0' && c <= '9') || c == '#' || c == '-' || c == '.' || c == '_'))) {
                    sb.append(c);
                    zzc++;
                }
            }
        }
        zzenVar.zzM(zzc - zzenVar.zzc());
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:160:0x030d, code lost:
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00aa, code lost:
        if (")".equals(zza(r4, r1)) == false) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02e8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List zzb(com.google.android.gms.internal.ads.zzen r18) {
        /*
            Method dump skipped, instructions count: 782
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamc.zzb(com.google.android.gms.internal.ads.zzen):java.util.List");
    }
}
