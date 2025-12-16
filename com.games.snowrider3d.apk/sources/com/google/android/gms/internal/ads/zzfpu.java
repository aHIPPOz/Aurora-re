package com.google.android.gms.internal.ads;

import java.io.File;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfpu {
    private final zzays zza;
    private final File zzb;
    private final File zzc;
    private final File zzd;
    private byte[] zze;

    public zzfpu(zzays zzaysVar, File file, File file2, File file3) {
        this.zza = zzaysVar;
        this.zzb = file;
        this.zzc = file3;
        this.zzd = file2;
    }

    public final zzays zza() {
        return this.zza;
    }

    public final File zzb() {
        return this.zzc;
    }

    public final File zzc() {
        return this.zzb;
    }

    public final boolean zzd(long j) {
        return this.zza.zzb() - (System.currentTimeMillis() / 1000) < 3600;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final byte[] zze() {
        /*
            r9 = this;
            byte[] r0 = r9.zze
            r1 = 0
            if (r0 != 0) goto L57
            java.io.File r0 = r9.zzd
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L4b java.io.IOException -> L50
            com.google.android.gms.internal.ads.zzgxz r0 = com.google.android.gms.internal.ads.zzgxz.zzb     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            r0.<init>()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            r3 = 256(0x100, float:3.59E-43)
        L15:
            byte[] r4 = new byte[r3]     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            r5 = 0
            r6 = r5
        L19:
            if (r6 >= r3) goto L27
            int r7 = r3 - r6
            int r7 = r2.read(r4, r6, r7)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            r8 = -1
            if (r7 != r8) goto L25
            goto L27
        L25:
            int r6 = r6 + r7
            goto L19
        L27:
            if (r6 != 0) goto L2b
            r4 = r1
            goto L2f
        L2b:
            com.google.android.gms.internal.ads.zzgxz r4 = com.google.android.gms.internal.ads.zzgxz.zzv(r4, r5, r6)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
        L2f:
            if (r4 != 0) goto L3d
            com.google.android.gms.internal.ads.zzgxz r0 = com.google.android.gms.internal.ads.zzgxz.zzu(r0)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            byte[] r0 = r0.zzA()     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            goto L55
        L3d:
            r0.add(r4)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            int r3 = r3 + r3
            r4 = 8192(0x2000, float:1.148E-41)
            int r3 = java.lang.Math.min(r3, r4)     // Catch: java.lang.Throwable -> L48 java.io.IOException -> L51
            goto L15
        L48:
            r0 = move-exception
            r1 = r2
            goto L4c
        L4b:
            r0 = move-exception
        L4c:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r1)
            throw r0
        L50:
            r2 = r1
        L51:
            com.google.android.gms.common.util.IOUtils.closeQuietly(r2)
            r0 = r1
        L55:
            r9.zze = r0
        L57:
            byte[] r0 = r9.zze
            if (r0 != 0) goto L5c
            return r1
        L5c:
            int r1 = r0.length
            byte[] r0 = java.util.Arrays.copyOf(r0, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfpu.zze():byte[]");
    }
}
