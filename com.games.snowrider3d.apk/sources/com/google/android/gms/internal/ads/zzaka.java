package com.google.android.gms.internal.ads;

import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzaka {
    private final zzakb zza = new zzakb();
    private final zzen zzb = new zzen(new byte[65025], 0);
    private int zzc = -1;
    private int zzd;
    private boolean zze;

    private final int zzf(int i) {
        int i2;
        int i3 = 0;
        this.zzd = 0;
        do {
            int i4 = this.zzd;
            int i5 = i + i4;
            zzakb zzakbVar = this.zza;
            if (i5 >= zzakbVar.zzc) {
                break;
            }
            this.zzd = i4 + 1;
            i2 = zzakbVar.zzf[i5];
            i3 += i2;
        } while (i2 == 255);
        return i3;
    }

    public final zzen zza() {
        return this.zzb;
    }

    public final zzakb zzb() {
        return this.zza;
    }

    public final void zzc() {
        this.zza.zza();
        this.zzb.zzI(0);
        this.zzc = -1;
        this.zze = false;
    }

    public final void zzd() {
        zzen zzenVar = this.zzb;
        if (zzenVar.zzN().length == 65025) {
            return;
        }
        zzenVar.zzJ(Arrays.copyOf(zzenVar.zzN(), Math.max(65025, zzenVar.zzd())), zzenVar.zzd());
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0049, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zze(com.google.android.gms.internal.ads.zzadw r8) throws java.io.IOException {
        /*
            r7 = this;
            boolean r0 = r7.zze
            r1 = 0
            if (r0 != 0) goto L6
            goto Ld
        L6:
            r7.zze = r1
            com.google.android.gms.internal.ads.zzen r0 = r7.zzb
            r0.zzI(r1)
        Ld:
            boolean r0 = r7.zze
            r2 = 1
            if (r0 != 0) goto L91
            int r0 = r7.zzc
            if (r0 >= 0) goto L4a
            com.google.android.gms.internal.ads.zzakb r0 = r7.zza
            r3 = -1
            boolean r3 = r0.zzc(r8, r3)
            if (r3 == 0) goto L49
            boolean r3 = r0.zzb(r8, r2)
            if (r3 != 0) goto L27
            goto L49
        L27:
            int r3 = r0.zzd
            int r0 = r0.zza
            r0 = r0 & r2
            if (r0 != r2) goto L3e
            com.google.android.gms.internal.ads.zzen r0 = r7.zzb
            int r0 = r0.zzd()
            if (r0 != 0) goto L3e
            int r0 = r7.zzf(r1)
            int r3 = r3 + r0
            int r0 = r7.zzd
            goto L3f
        L3e:
            r0 = r1
        L3f:
            boolean r3 = com.google.android.gms.internal.ads.zzadz.zzf(r8, r3)
            if (r3 != 0) goto L46
            return r1
        L46:
            r7.zzc = r0
            goto L4a
        L49:
            return r1
        L4a:
            int r0 = r7.zzf(r0)
            int r3 = r7.zzc
            int r4 = r7.zzd
            int r3 = r3 + r4
            if (r0 <= 0) goto L86
            com.google.android.gms.internal.ads.zzen r4 = r7.zzb
            int r5 = r4.zzd()
            int r5 = r5 + r0
            r4.zzF(r5)
            byte[] r5 = r4.zzN()
            int r6 = r4.zzd()
            boolean r5 = com.google.android.gms.internal.ads.zzadz.zze(r8, r5, r6, r0)
            if (r5 != 0) goto L6e
            return r1
        L6e:
            int r5 = r4.zzd()
            int r5 = r5 + r0
            r4.zzK(r5)
            com.google.android.gms.internal.ads.zzakb r0 = r7.zza
            int r4 = r3 + (-1)
            int[] r0 = r0.zzf
            r0 = r0[r4]
            r4 = 255(0xff, float:3.57E-43)
            if (r0 == r4) goto L83
            goto L84
        L83:
            r2 = r1
        L84:
            r7.zze = r2
        L86:
            com.google.android.gms.internal.ads.zzakb r0 = r7.zza
            int r0 = r0.zzc
            if (r3 != r0) goto L8d
            r3 = -1
        L8d:
            r7.zzc = r3
            goto Ld
        L91:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaka.zze(com.google.android.gms.internal.ads.zzadw):boolean");
    }
}
