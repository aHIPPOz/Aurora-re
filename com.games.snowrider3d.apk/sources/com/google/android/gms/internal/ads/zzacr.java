package com.google.android.gms.internal.ads;

import com.google.android.gms.nearby.connection.ConnectionsStatusCodes;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzacr {
    public static final /* synthetic */ int zza = 0;
    private static final int[] zzb = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, ConnectionsStatusCodes.STATUS_NETWORK_NOT_CONNECTED, 7350};
    private static final int[] zzc = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static zzacp zza(byte[] bArr) throws zzaz {
        return zzb(new zzem(bArr, bArr.length), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ae, code lost:
        if (r11 != 3) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00a8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzacp zzb(com.google.android.gms.internal.ads.zzem r11, boolean r12) throws com.google.android.gms.internal.ads.zzaz {
        /*
            int r0 = zzc(r11)
            int r1 = zzd(r11)
            r2 = 4
            int r3 = r11.zzd(r2)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "mp4a.40."
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r4 = r4.toString()
            r5 = 5
            r6 = 22
            if (r0 == r5) goto L24
            r5 = 29
            if (r0 != r5) goto L32
        L24:
            int r1 = zzd(r11)
            int r0 = zzc(r11)
            if (r0 != r6) goto L32
            int r3 = r11.zzd(r2)
        L32:
            if (r12 == 0) goto Lcb
            r12 = 17
            r5 = 6
            r7 = 1
            r8 = 2
            r9 = 3
            if (r0 == r7) goto L5f
            if (r0 == r8) goto L5f
            if (r0 == r9) goto L5f
            if (r0 == r2) goto L5f
            if (r0 == r5) goto L5f
            r2 = 7
            if (r0 == r2) goto L5f
            if (r0 == r12) goto L5f
            switch(r0) {
                case 19: goto L5f;
                case 20: goto L5f;
                case 21: goto L5f;
                case 22: goto L5f;
                case 23: goto L5f;
                default: goto L4c;
            }
        L4c:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported audio object type: "
            r11.<init>(r12)
            r11.append(r0)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzaz r11 = com.google.android.gms.internal.ads.zzaz.zzc(r11)
            throw r11
        L5f:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L6c
            java.lang.String r2 = "AacUtil"
            java.lang.String r10 = "Unexpected frameLengthFlag = 1"
            com.google.android.gms.internal.ads.zzea.zzf(r2, r10)
        L6c:
            boolean r2 = r11.zzp()
            if (r2 == 0) goto L77
            r2 = 14
            r11.zzn(r2)
        L77:
            boolean r2 = r11.zzp()
            if (r3 == 0) goto Lc5
            r10 = 20
            if (r0 == r5) goto L84
            if (r0 != r10) goto L87
            r0 = r10
        L84:
            r11.zzn(r9)
        L87:
            if (r2 == 0) goto La4
            if (r0 != r6) goto L91
            r2 = 16
            r11.zzn(r2)
            goto L92
        L91:
            r6 = r0
        L92:
            if (r6 == r12) goto L9e
            r12 = 19
            if (r6 == r12) goto L9e
            if (r6 == r10) goto L9e
            r12 = 23
            if (r6 != r12) goto La1
        L9e:
            r11.zzn(r9)
        La1:
            r11.zzn(r7)
        La4:
            switch(r0) {
                case 17: goto La8;
                case 18: goto La7;
                case 19: goto La8;
                case 20: goto La8;
                case 21: goto La8;
                case 22: goto La8;
                case 23: goto La8;
                default: goto La7;
            }
        La7:
            goto Lcb
        La8:
            int r11 = r11.zzd(r8)
            if (r11 == r8) goto Lb1
            if (r11 == r9) goto Lb2
            goto Lcb
        Lb1:
            r9 = r11
        Lb2:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            java.lang.String r12 = "Unsupported epConfig: "
            r11.<init>(r12)
            r11.append(r9)
            java.lang.String r11 = r11.toString()
            com.google.android.gms.internal.ads.zzaz r11 = com.google.android.gms.internal.ads.zzaz.zzc(r11)
            throw r11
        Lc5:
            java.lang.UnsupportedOperationException r11 = new java.lang.UnsupportedOperationException
            r11.<init>()
            throw r11
        Lcb:
            int[] r11 = com.google.android.gms.internal.ads.zzacr.zzc
            r11 = r11[r3]
            r12 = -1
            r0 = 0
            if (r11 == r12) goto Ld9
            com.google.android.gms.internal.ads.zzacp r12 = new com.google.android.gms.internal.ads.zzacp
            r12.<init>(r1, r11, r4, r0)
            return r12
        Ld9:
            com.google.android.gms.internal.ads.zzaz r11 = com.google.android.gms.internal.ads.zzaz.zza(r0, r0)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzacr.zzb(com.google.android.gms.internal.ads.zzem, boolean):com.google.android.gms.internal.ads.zzacp");
    }

    private static int zzc(zzem zzemVar) {
        int zzd = zzemVar.zzd(5);
        return zzd == 31 ? zzemVar.zzd(6) + 32 : zzd;
    }

    private static int zzd(zzem zzemVar) throws zzaz {
        int zzd = zzemVar.zzd(4);
        if (zzd == 15) {
            if (zzemVar.zza() < 24) {
                throw zzaz.zza("AAC header insufficient data", null);
            }
            return zzemVar.zzd(24);
        } else if (zzd < 13) {
            return zzb[zzd];
        } else {
            throw zzaz.zza("AAC header wrong Sampling Frequency Index", null);
        }
    }
}
