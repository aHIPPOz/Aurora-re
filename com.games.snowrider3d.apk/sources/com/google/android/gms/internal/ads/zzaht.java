package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayDeque;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaht {
    private final byte[] zza = new byte[8];
    private final ArrayDeque zzb = new ArrayDeque();
    private final zzaia zzc = new zzaia();
    private zzahu zzd;
    private int zze;
    private int zzf;
    private long zzg;

    private final long zzd(zzadw zzadwVar, int i) throws IOException {
        byte[] bArr = this.zza;
        zzadwVar.zzi(bArr, 0, i);
        long j = 0;
        for (int i2 = 0; i2 < i; i2++) {
            j = (j << 8) | (bArr[i2] & 255);
        }
        return j;
    }

    public final void zza(zzahu zzahuVar) {
        this.zzd = zzahuVar;
    }

    public final void zzb() {
        this.zze = 0;
        this.zzb.clear();
        this.zzc.zze();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x008c, code lost:
        if (r1 == 1) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzc(com.google.android.gms.internal.ads.zzadw r14) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 748
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaht.zzc(com.google.android.gms.internal.ads.zzadw):boolean");
    }
}
