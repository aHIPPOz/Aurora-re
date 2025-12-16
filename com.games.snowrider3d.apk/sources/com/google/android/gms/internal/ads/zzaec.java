package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaec {
    public static int zza(zzen zzenVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return zzenVar.zzm() + 1;
            case 7:
                return zzenVar.zzq() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long zzb(zzadw zzadwVar, zzaeg zzaegVar) throws IOException {
        zzadwVar.zzj();
        zzadwVar.zzg(1);
        byte[] bArr = new byte[1];
        zzadwVar.zzh(bArr, 0, 1);
        int i = bArr[0] & 1;
        boolean z = 1 == i;
        zzadwVar.zzg(2);
        int i2 = 1 != i ? 6 : 7;
        zzen zzenVar = new zzen(i2);
        zzenVar.zzK(zzadz.zzb(zzadwVar, zzenVar.zzN(), 0, i2));
        zzadwVar.zzj();
        zzaeb zzaebVar = new zzaeb();
        if (zzd(zzenVar, zzaegVar, z, zzaebVar)) {
            return zzaebVar.zza;
        }
        throw zzaz.zza(null, null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x007f, code lost:
        if (r3 != r24.zzf) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x008a, code lost:
        if ((r23.zzm() * 1000) == r5) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0099, code lost:
        if (r4 == r5) goto L44;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean zzc(com.google.android.gms.internal.ads.zzen r23, com.google.android.gms.internal.ads.zzaeg r24, int r25, com.google.android.gms.internal.ads.zzaeb r26) {
        /*
            r0 = r23
            r1 = r24
            int r2 = r0.zzc()
            long r3 = r0.zzu()
            r5 = 16
            long r5 = r3 >>> r5
            r7 = r25
            long r7 = (long) r7
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r8 = 0
            if (r7 == 0) goto L19
            return r8
        L19:
            r9 = 1
            long r5 = r5 & r9
            int r5 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            r6 = 1
            if (r5 != 0) goto L23
            r5 = r6
            goto L24
        L23:
            r5 = r8
        L24:
            r7 = 12
            long r11 = r3 >> r7
            r13 = 8
            long r13 = r3 >> r13
            r15 = 4
            long r15 = r3 >> r15
            long r17 = r3 >> r6
            long r3 = r3 & r9
            r19 = 15
            r21 = r9
            long r9 = r15 & r19
            int r9 = (int) r9
            r10 = 7
            r15 = -1
            if (r9 > r10) goto L43
            int r10 = r1.zzg
            int r10 = r10 + r15
            if (r9 != r10) goto Laf
            goto L4c
        L43:
            r10 = 10
            if (r9 > r10) goto Laf
            int r9 = r1.zzg
            r10 = 2
            if (r9 != r10) goto Laf
        L4c:
            r9 = 7
            long r9 = r17 & r9
            int r9 = (int) r9
            if (r9 != 0) goto L54
            goto L58
        L54:
            int r10 = r1.zzi
            if (r9 != r10) goto Laf
        L58:
            int r3 = (r3 > r21 ? 1 : (r3 == r21 ? 0 : -1))
            if (r3 == 0) goto Laf
            r3 = r26
            boolean r3 = zzd(r0, r1, r5, r3)
            if (r3 == 0) goto Laf
            long r3 = r11 & r19
            int r3 = (int) r3
            int r3 = zza(r0, r3)
            if (r3 == r15) goto Laf
            int r4 = r1.zzb
            if (r3 > r4) goto Laf
            long r3 = r13 & r19
            int r5 = r1.zze
            int r3 = (int) r3
            if (r3 != 0) goto L79
            goto L9b
        L79:
            r4 = 11
            if (r3 > r4) goto L82
            int r1 = r1.zzf
            if (r3 == r1) goto L9b
            goto Laf
        L82:
            if (r3 != r7) goto L8d
            int r1 = r0.zzm()
            int r1 = r1 * 1000
            if (r1 != r5) goto Laf
            goto L9b
        L8d:
            r1 = 14
            if (r3 > r1) goto Laf
            int r4 = r0.zzq()
            if (r3 != r1) goto L99
            int r4 = r4 * 10
        L99:
            if (r4 != r5) goto Laf
        L9b:
            int r1 = r0.zzm()
            int r3 = r0.zzc()
            byte[] r0 = r0.zzN()
            int r3 = r3 + r15
            int r0 = com.google.android.gms.internal.ads.zzex.zzg(r0, r2, r3, r8)
            if (r1 != r0) goto Laf
            return r6
        Laf:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaec.zzc(com.google.android.gms.internal.ads.zzen, com.google.android.gms.internal.ads.zzaeg, int, com.google.android.gms.internal.ads.zzaeb):boolean");
    }

    private static boolean zzd(zzen zzenVar, zzaeg zzaegVar, boolean z, zzaeb zzaebVar) {
        try {
            long zzx = zzenVar.zzx();
            if (!z) {
                zzx *= zzaegVar.zzb;
            }
            zzaebVar.zza = zzx;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }
}
