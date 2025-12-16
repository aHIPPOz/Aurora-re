package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzafk implements zzaeu {
    final /* synthetic */ zzafn zza;
    private final long zzb;

    public zzafk(zzafn zzafnVar, long j) {
        Objects.requireNonNull(zzafnVar);
        this.zza = zzafnVar;
        this.zzb = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final long zza() {
        return this.zzb;
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0013 */
    @Override // com.google.android.gms.internal.ads.zzaeu
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.ads.zzaes zzg(long r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzafn r0 = r8.zza
            com.google.android.gms.internal.ads.zzafq[] r1 = com.google.android.gms.internal.ads.zzafn.zza(r0)
            r2 = 0
            r1 = r1[r2]
            com.google.android.gms.internal.ads.zzaes r1 = r1.zza(r9)
            r2 = 1
        Le:
            com.google.android.gms.internal.ads.zzafq[] r3 = com.google.android.gms.internal.ads.zzafn.zza(r0)
            int r3 = r3.length
            if (r2 >= r3) goto L2f
            com.google.android.gms.internal.ads.zzafq[] r3 = com.google.android.gms.internal.ads.zzafn.zza(r0)
            r3 = r3[r2]
            com.google.android.gms.internal.ads.zzaes r3 = r3.zza(r9)
            com.google.android.gms.internal.ads.zzaev r4 = r3.zza
            com.google.android.gms.internal.ads.zzaev r5 = r1.zza
            long r6 = r4.zzc
            long r4 = r5.zzc
            int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r4 >= 0) goto L2c
            r1 = r3
        L2c:
            int r2 = r2 + 1
            goto Le
        L2f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafk.zzg(long):com.google.android.gms.internal.ads.zzaes");
    }

    @Override // com.google.android.gms.internal.ads.zzaeu
    public final boolean zzh() {
        return true;
    }
}
