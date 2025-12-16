package com.google.android.gms.internal.ads;

import androidx.work.WorkRequest;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzalj implements zzakt {
    private static final Pattern zza = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");
    private final boolean zzb;
    private final zzali zzc;
    private final zzen zzd;
    private Map zze;
    private float zzf;
    private float zzg;

    public zzalj() {
        this(null);
    }

    private static float zzb(int i) {
        if (i != 0) {
            if (i == 1) {
                return 0.5f;
            }
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.05f;
    }

    private static int zzc(long j, List list, List list2) {
        int i;
        ArrayList arrayList;
        int size = list.size();
        while (true) {
            size--;
            if (size < 0) {
                i = 0;
                break;
            } else if (((Long) list.get(size)).longValue() != j) {
                if (((Long) list.get(size)).longValue() < j) {
                    i = size + 1;
                    break;
                }
            } else {
                return size;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i == 0) {
            arrayList = new ArrayList();
        } else {
            arrayList = new ArrayList((Collection) list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static long zzd(String str) {
        Matcher matcher = zza.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        String group = matcher.group(1);
        String str2 = zzex.zza;
        return (Long.parseLong(group) * 3600000000L) + (Long.parseLong(matcher.group(2)) * 60000000) + (Long.parseLong(matcher.group(3)) * 1000000) + (Long.parseLong(matcher.group(4)) * WorkRequest.MIN_BACKOFF_MILLIS);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r3.equals("playresx") != false) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x002c A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0010 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void zze(com.google.android.gms.internal.ads.zzen r7, java.nio.charset.Charset r8) {
        /*
            r6 = this;
        L0:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto Ldd
            java.lang.String r1 = "[Script Info]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            r2 = 91
            if (r1 == 0) goto L73
        L10:
            java.lang.String r0 = r7.zzz(r8)
            if (r0 == 0) goto L0
            int r1 = r7.zza()
            if (r1 == 0) goto L22
            int r1 = r7.zze(r8)
            if (r1 == r2) goto L0
        L22:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r3 = 2
            if (r1 != r3) goto L10
            r1 = 0
            r3 = r0[r1]
            java.lang.String r3 = r3.trim()
            java.lang.String r3 = com.google.android.gms.internal.ads.zzfuv.zza(r3)
            int r4 = r3.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L4a;
                case 1879649549: goto L40;
                default: goto L3f;
            }
        L3f:
            goto L53
        L40:
            java.lang.String r1 = "playresy"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L53
            r1 = r5
            goto L54
        L4a:
            java.lang.String r4 = "playresx"
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L53
            goto L54
        L53:
            r1 = -1
        L54:
            if (r1 == 0) goto L66
            if (r1 == r5) goto L59
            goto L10
        L59:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.zzg = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L66:
            r0 = r0[r5]     // Catch: java.lang.NumberFormatException -> L10
            java.lang.String r0 = r0.trim()     // Catch: java.lang.NumberFormatException -> L10
            float r0 = java.lang.Float.parseFloat(r0)     // Catch: java.lang.NumberFormatException -> L10
            r6.zzf = r0     // Catch: java.lang.NumberFormatException -> L10
            goto L10
        L73:
            java.lang.String r1 = "[V4+ Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            java.lang.String r3 = "SsaParser"
            if (r1 == 0) goto Lc6
            java.util.LinkedHashMap r0 = new java.util.LinkedHashMap
            r0.<init>()
            r1 = 0
        L83:
            java.lang.String r4 = r7.zzz(r8)
            if (r4 == 0) goto Lc2
            int r5 = r7.zza()
            if (r5 == 0) goto L95
            int r5 = r7.zze(r8)
            if (r5 == r2) goto Lc2
        L95:
            java.lang.String r5 = "Format:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto La2
            com.google.android.gms.internal.ads.zzalk r1 = com.google.android.gms.internal.ads.zzalk.zza(r4)
            goto L83
        La2:
            java.lang.String r5 = "Style:"
            boolean r5 = r4.startsWith(r5)
            if (r5 == 0) goto L83
            if (r1 != 0) goto Lb6
            java.lang.String r5 = "Skipping 'Style:' line before 'Format:' line: "
            java.lang.String r4 = r5.concat(r4)
            com.google.android.gms.internal.ads.zzea.zzf(r3, r4)
            goto L83
        Lb6:
            com.google.android.gms.internal.ads.zzalm r4 = com.google.android.gms.internal.ads.zzalm.zzb(r4, r1)
            if (r4 == 0) goto L83
            java.lang.String r5 = r4.zza
            r0.put(r5, r4)
            goto L83
        Lc2:
            r6.zze = r0
            goto L0
        Lc6:
            java.lang.String r1 = "[V4 Styles]"
            boolean r1 = r1.equalsIgnoreCase(r0)
            if (r1 == 0) goto Ld5
            java.lang.String r0 = "[V4 Styles] are not supported"
            com.google.android.gms.internal.ads.zzea.zze(r3, r0)
            goto L0
        Ld5:
            java.lang.String r1 = "[Events]"
            boolean r0 = r1.equalsIgnoreCase(r0)
            if (r0 == 0) goto L0
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.zze(com.google.android.gms.internal.ads.zzen, java.nio.charset.Charset):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00b8  */
    @Override // com.google.android.gms.internal.ads.zzakt
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(byte[] r23, int r24, int r25, com.google.android.gms.internal.ads.zzaks r26, com.google.android.gms.internal.ads.zzdn r27) {
        /*
            Method dump skipped, instructions count: 834
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzalj.zza(byte[], int, int, com.google.android.gms.internal.ads.zzaks, com.google.android.gms.internal.ads.zzdn):void");
    }

    public zzalj(List list) {
        this.zzf = -3.4028235E38f;
        this.zzg = -3.4028235E38f;
        this.zzd = new zzen();
        if (list == null || list.isEmpty()) {
            this.zzb = false;
            this.zzc = null;
            return;
        }
        this.zzb = true;
        String zzB = zzex.zzB((byte[]) list.get(0));
        zzdd.zzd(zzB.startsWith("Format:"));
        zzali zza2 = zzali.zza(zzB);
        zza2.getClass();
        this.zzc = zza2;
        zze(new zzen((byte[]) list.get(1)), StandardCharsets.UTF_8);
    }
}
