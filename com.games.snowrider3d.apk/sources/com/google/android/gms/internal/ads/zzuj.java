package com.google.android.gms.internal.ads;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzuj implements zzwa {
    private final zzaea zza;
    private zzadv zzb;
    private zzadw zzc;

    public zzuj(zzaea zzaeaVar) {
        this.zza = zzaeaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final int zza(zzaer zzaerVar) throws IOException {
        zzadv zzadvVar = this.zzb;
        zzadvVar.getClass();
        zzadw zzadwVar = this.zzc;
        zzadwVar.getClass();
        return zzadvVar.zzb(zzadwVar, zzaerVar);
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final long zzb() {
        zzadw zzadwVar = this.zzc;
        if (zzadwVar != null) {
            return zzadwVar.zzf();
        }
        return -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzc() {
        zzadv zzadvVar = this.zzb;
        if (zzadvVar != null && (zzadvVar instanceof zzaie)) {
            ((zzaie) zzadvVar).zza();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0054, code lost:
        if (r1.zzf() != r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0077, code lost:
        if (r1.zzf() != r11) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x007a, code lost:
        r0 = false;
     */
    @Override // com.google.android.gms.internal.ads.zzwa
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzd(com.google.android.gms.internal.ads.zzl r8, android.net.Uri r9, java.util.Map r10, long r11, long r13, com.google.android.gms.internal.ads.zzady r15) throws java.io.IOException {
        /*
            r7 = this;
            com.google.android.gms.internal.ads.zzadl r1 = new com.google.android.gms.internal.ads.zzadl
            r2 = r8
            r3 = r11
            r5 = r13
            r1.<init>(r2, r3, r5)
            r7.zzc = r1
            com.google.android.gms.internal.ads.zzadv r8 = r7.zzb
            if (r8 == 0) goto Lf
            return
        Lf:
            com.google.android.gms.internal.ads.zzaea r8 = r7.zza
            com.google.android.gms.internal.ads.zzadv[] r8 = r8.zza(r9, r10)
            int r10 = r8.length
            com.google.android.gms.internal.ads.zzfyn r11 = com.google.android.gms.internal.ads.zzfyq.zzi(r10)
            r12 = 0
            r13 = 1
            if (r10 != r13) goto L24
            r8 = r8[r12]
            r7.zzb = r8
            goto L8a
        L24:
            r14 = r12
        L25:
            if (r14 >= r10) goto L86
            r0 = r8[r14]
            boolean r2 = r0.zzi(r1)     // Catch: java.lang.Throwable -> L57 java.io.EOFException -> L6d
            if (r2 == 0) goto L43
            r7.zzb = r0     // Catch: java.lang.Throwable -> L57 java.io.EOFException -> L6d
            if (r0 != 0) goto L3b
            long r5 = r1.zzf()
            int r10 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r10 != 0) goto L3c
        L3b:
            r12 = r13
        L3c:
            com.google.android.gms.internal.ads.zzdd.zzf(r12)
            r1.zzj()
            goto L86
        L43:
            java.util.List r0 = r0.zzd()     // Catch: java.lang.Throwable -> L57 java.io.EOFException -> L6d
            r11.zzh(r0)     // Catch: java.lang.Throwable -> L57 java.io.EOFException -> L6d
            com.google.android.gms.internal.ads.zzadv r0 = r7.zzb
            if (r0 != 0) goto L7c
            long r5 = r1.zzf()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L7a
            goto L7c
        L57:
            r0 = move-exception
            r8 = r0
            com.google.android.gms.internal.ads.zzadv r9 = r7.zzb
            if (r9 != 0) goto L65
            long r9 = r1.zzf()
            int r9 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r9 != 0) goto L66
        L65:
            r12 = r13
        L66:
            com.google.android.gms.internal.ads.zzdd.zzf(r12)
            r1.zzj()
            throw r8
        L6d:
            com.google.android.gms.internal.ads.zzadv r0 = r7.zzb
            if (r0 != 0) goto L7c
            long r5 = r1.zzf()
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 != 0) goto L7a
            goto L7c
        L7a:
            r0 = r12
            goto L7d
        L7c:
            r0 = r13
        L7d:
            com.google.android.gms.internal.ads.zzdd.zzf(r0)
            r1.zzj()
            int r14 = r14 + 1
            goto L25
        L86:
            com.google.android.gms.internal.ads.zzadv r10 = r7.zzb
            if (r10 == 0) goto L90
        L8a:
            com.google.android.gms.internal.ads.zzadv r8 = r7.zzb
            r8.zze(r15)
            return
        L90:
            com.google.android.gms.internal.ads.zzxl r10 = new com.google.android.gms.internal.ads.zzxl
            java.lang.String r12 = ", "
            r13 = r12
            java.lang.String r13 = (java.lang.String) r13
            com.google.android.gms.internal.ads.zzfyq r8 = com.google.android.gms.internal.ads.zzfyq.zzm(r8)
            com.google.android.gms.internal.ads.zzui r13 = new com.google.android.gms.internal.ads.zzui
            r13.<init>()
            java.util.List r8 = com.google.android.gms.internal.ads.zzfzg.zzc(r8, r13)
            java.util.Iterator r8 = r8.iterator()
            java.lang.StringBuilder r13 = new java.lang.StringBuilder
            r13.<init>()
            com.google.android.gms.internal.ads.zzfvh.zzc(r13, r8, r12)
            java.lang.String r8 = r13.toString()
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "None of the available extractors ("
            r12.<init>(r13)
            r12.append(r8)
            java.lang.String r8 = ") could read the stream."
            r12.append(r8)
            java.lang.String r8 = r12.toString()
            r12 = r9
            android.net.Uri r12 = (android.net.Uri) r12
            com.google.android.gms.internal.ads.zzfyq r11 = r11.zzi()
            r10.<init>(r8, r9, r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuj.zzd(com.google.android.gms.internal.ads.zzl, android.net.Uri, java.util.Map, long, long, com.google.android.gms.internal.ads.zzady):void");
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zze() {
        if (this.zzb != null) {
            this.zzb = null;
        }
        this.zzc = null;
    }

    @Override // com.google.android.gms.internal.ads.zzwa
    public final void zzf(long j, long j2) {
        zzadv zzadvVar = this.zzb;
        zzadvVar.getClass();
        zzadvVar.zzf(j, j2);
    }
}
