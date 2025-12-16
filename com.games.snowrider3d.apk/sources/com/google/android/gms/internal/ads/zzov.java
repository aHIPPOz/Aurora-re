package com.google.android.gms.internal.ads;

import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzov {
    final /* synthetic */ zzow zza;
    private final String zzb;
    private int zzc;
    private long zzd;
    private zzvh zze;
    private boolean zzf;
    private boolean zzg;

    public zzov(zzow zzowVar, String str, int i, zzvh zzvhVar) {
        Objects.requireNonNull(zzowVar);
        this.zza = zzowVar;
        this.zzb = str;
        this.zzc = i;
        this.zzd = zzvhVar == null ? -1L : zzvhVar.zzd;
        if (zzvhVar == null || !zzvhVar.zzb()) {
            return;
        }
        this.zze = zzvhVar;
    }

    public final void zzg(int i, zzvh zzvhVar) {
        long zzl;
        if (this.zzd == -1 && i == this.zzc && zzvhVar != null) {
            zzow zzowVar = this.zza;
            long j = zzvhVar.zzd;
            zzl = zzowVar.zzl();
            if (j < zzl) {
                return;
            }
            this.zzd = j;
        }
    }

    public final boolean zzj(int i, zzvh zzvhVar) {
        if (zzvhVar == null) {
            return i == this.zzc;
        }
        zzvh zzvhVar2 = this.zze;
        return zzvhVar2 == null ? !zzvhVar.zzb() && zzvhVar.zzd == this.zzd : zzvhVar.zzd == zzvhVar2.zzd && zzvhVar.zzb == zzvhVar2.zzb && zzvhVar.zzc == zzvhVar2.zzc;
    }

    public final boolean zzk(zzmp zzmpVar) {
        zzvh zzvhVar = zzmpVar.zzd;
        if (zzvhVar == null) {
            return this.zzc != zzmpVar.zzc;
        }
        long j = this.zzd;
        if (j == -1) {
            return false;
        }
        long j2 = zzvhVar.zzd;
        if (j2 > j) {
            return true;
        }
        if (this.zze == null) {
            return false;
        }
        zzbl zzblVar = zzmpVar.zzb;
        int zza = zzblVar.zza(zzvhVar.zza);
        int zza2 = zzblVar.zza(this.zze.zza);
        zzvh zzvhVar2 = this.zze;
        if (j2 < zzvhVar2.zzd || zza < zza2) {
            return false;
        }
        if (zza > zza2) {
            return true;
        }
        if (!zzvhVar.zzb()) {
            int i = zzvhVar.zze;
            return i == -1 || i > zzvhVar2.zzb;
        }
        int i2 = zzvhVar.zzb;
        int i3 = zzvhVar.zzc;
        int i4 = zzvhVar2.zzb;
        if (i2 > i4) {
            return true;
        }
        return i2 == i4 && i3 > zzvhVar2.zzc;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
        if (r0 < r9.zzc()) goto L14;
     */
    /* JADX WARN: Incorrect condition in loop: B:9:0x002a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzl(com.google.android.gms.internal.ads.zzbl r8, com.google.android.gms.internal.ads.zzbl r9) {
        /*
            r7 = this;
            int r0 = r7.zzc
            int r1 = r8.zzc()
            r2 = 0
            r3 = -1
            if (r0 < r1) goto L13
            int r8 = r9.zzc()
            if (r0 >= r8) goto L11
            goto L44
        L11:
            r0 = r3
            goto L44
        L13:
            com.google.android.gms.internal.ads.zzow r1 = r7.zza
            com.google.android.gms.internal.ads.zzbk r4 = com.google.android.gms.internal.ads.zzow.zzc(r1)
            r5 = 0
            r8.zze(r0, r4, r5)
            com.google.android.gms.internal.ads.zzbk r0 = com.google.android.gms.internal.ads.zzow.zzc(r1)
            int r0 = r0.zzn
        L24:
            com.google.android.gms.internal.ads.zzbk r4 = com.google.android.gms.internal.ads.zzow.zzc(r1)
            int r4 = r4.zzo
            if (r0 > r4) goto L11
            java.lang.Object r4 = r8.zzf(r0)
            int r4 = r9.zza(r4)
            if (r4 == r3) goto L41
            com.google.android.gms.internal.ads.zzbj r8 = com.google.android.gms.internal.ads.zzow.zzb(r1)
            com.google.android.gms.internal.ads.zzbj r8 = r9.zzd(r4, r8, r2)
            int r0 = r8.zzc
            goto L44
        L41:
            int r0 = r0 + 1
            goto L24
        L44:
            r7.zzc = r0
            if (r0 != r3) goto L49
            return r2
        L49:
            com.google.android.gms.internal.ads.zzvh r8 = r7.zze
            r0 = 1
            if (r8 != 0) goto L4f
            return r0
        L4f:
            java.lang.Object r8 = r8.zza
            int r8 = r9.zza(r8)
            if (r8 == r3) goto L58
            return r0
        L58:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzov.zzl(com.google.android.gms.internal.ads.zzbl, com.google.android.gms.internal.ads.zzbl):boolean");
    }
}
