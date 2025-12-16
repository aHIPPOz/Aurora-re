package com.google.android.gms.internal.ads;

import android.util.Base64;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzow implements zzpf {
    public static final zzfwh zza = new zzfwh() { // from class: com.google.android.gms.internal.ads.zzou
        @Override // com.google.android.gms.internal.ads.zzfwh
        public final Object zza() {
            String zzn;
            zzn = zzow.zzn();
            return zzn;
        }
    };
    private static final Random zzb = new Random();
    private final zzbk zzc;
    private final zzbj zzd;
    private final HashMap zze;
    private zzpe zzf;
    private zzbl zzg;
    private String zzh;
    private long zzi;

    public zzow() {
        throw null;
    }

    public zzow(zzfwh zzfwhVar) {
        this.zzc = new zzbk();
        this.zzd = new zzbj();
        this.zze = new HashMap();
        this.zzg = zzbl.zza;
        this.zzi = -1L;
    }

    public final long zzl() {
        long j;
        long j2;
        zzov zzovVar = (zzov) this.zze.get(this.zzh);
        if (zzovVar != null) {
            j = zzovVar.zzd;
            if (j != -1) {
                j2 = zzovVar.zzd;
                return j2;
            }
        }
        return this.zzi + 1;
    }

    private final zzov zzm(int i, zzvh zzvhVar) {
        long j;
        int i2;
        zzvh zzvhVar2;
        zzvh zzvhVar3;
        HashMap hashMap = this.zze;
        long j2 = Long.MAX_VALUE;
        zzov zzovVar = null;
        for (zzov zzovVar2 : hashMap.values()) {
            zzovVar2.zzg(i, zzvhVar);
            if (zzovVar2.zzj(i, zzvhVar)) {
                j = zzovVar2.zzd;
                if (j == -1 || j < j2) {
                    zzovVar = zzovVar2;
                    j2 = j;
                } else if (i2 == 0) {
                    String str = zzex.zza;
                    zzvhVar2 = zzovVar.zze;
                    if (zzvhVar2 != null) {
                        zzvhVar3 = zzovVar2.zze;
                        if (zzvhVar3 != null) {
                            zzovVar = zzovVar2;
                        }
                    }
                }
            }
        }
        if (zzovVar == null) {
            String zzn = zzn();
            zzov zzovVar3 = new zzov(this, zzn, i, zzvhVar);
            hashMap.put(zzn, zzovVar3);
            return zzovVar3;
        }
        return zzovVar;
    }

    public static String zzn() {
        byte[] bArr = new byte[12];
        zzb.nextBytes(bArr);
        return Base64.encodeToString(bArr, 10);
    }

    private final void zzo(zzov zzovVar) {
        long j;
        long j2;
        j = zzovVar.zzd;
        if (j != -1) {
            j2 = zzovVar.zzd;
            this.zzi = j2;
        }
        this.zzh = null;
    }

    @RequiresNonNull({ServiceSpecificExtraArgs.CastExtraArgs.LISTENER})
    private final void zzp(zzmp zzmpVar) {
        String str;
        long j;
        zzvh zzvhVar;
        zzvh zzvhVar2;
        zzvh zzvhVar3;
        String unused;
        String unused2;
        if (zzmpVar.zzb.zzo()) {
            String str2 = this.zzh;
            if (str2 == null) {
                return;
            }
            zzov zzovVar = (zzov) this.zze.get(str2);
            zzovVar.getClass();
            zzo(zzovVar);
            return;
        }
        zzov zzovVar2 = (zzov) this.zze.get(this.zzh);
        int i = zzmpVar.zzc;
        zzvh zzvhVar4 = zzmpVar.zzd;
        zzov zzm = zzm(i, zzvhVar4);
        str = zzm.zzb;
        this.zzh = str;
        zzi(zzmpVar);
        if (zzvhVar4 == null || !zzvhVar4.zzb()) {
            return;
        }
        if (zzovVar2 != null) {
            long j2 = zzvhVar4.zzd;
            j = zzovVar2.zzd;
            if (j == j2) {
                zzvhVar = zzovVar2.zze;
                if (zzvhVar != null) {
                    zzvhVar2 = zzovVar2.zze;
                    if (zzvhVar2.zzb == zzvhVar4.zzb) {
                        zzvhVar3 = zzovVar2.zze;
                        if (zzvhVar3.zzc == zzvhVar4.zzc) {
                            return;
                        }
                    }
                }
            }
        }
        unused = zzm(i, new zzvh(zzvhVar4.zza, zzvhVar4.zzd)).zzb;
        unused2 = zzm.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized String zze() {
        return this.zzh;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized String zzf(zzbl zzblVar, zzvh zzvhVar) {
        String str;
        str = zzm(zzblVar.zzn(zzvhVar.zza, this.zzd).zzc, zzvhVar).zzb;
        return str;
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized void zzg(zzmp zzmpVar) {
        boolean z;
        zzpe zzpeVar;
        String str;
        String str2 = this.zzh;
        if (str2 != null) {
            zzov zzovVar = (zzov) this.zze.get(str2);
            if (zzovVar == null) {
                throw null;
            }
            zzov zzovVar2 = zzovVar;
            zzo(zzovVar);
        }
        Iterator it = this.zze.values().iterator();
        while (it.hasNext()) {
            zzov zzovVar3 = (zzov) it.next();
            it.remove();
            z = zzovVar3.zzf;
            if (z && (zzpeVar = this.zzf) != null) {
                str = zzovVar3.zzb;
                zzpeVar.zzv(zzmpVar, str, false);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final void zzh(zzpe zzpeVar) {
        this.zzf = zzpeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0039, code lost:
        if (r2 == r10.zzc) goto L18;
     */
    @Override // com.google.android.gms.internal.ads.zzpf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void zzi(com.google.android.gms.internal.ads.zzmp r10) {
        /*
            r9 = this;
            monitor-enter(r9)
            com.google.android.gms.internal.ads.zzpe r0 = r9.zzf     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb3
            com.google.android.gms.internal.ads.zzbl r0 = r10.zzb     // Catch: java.lang.Throwable -> Lb5
            boolean r1 = r0.zzo()     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto Lf
            goto Lb1
        Lf:
            com.google.android.gms.internal.ads.zzvh r1 = r10.zzd     // Catch: java.lang.Throwable -> Lb5
            if (r1 == 0) goto L3b
            long r2 = r9.zzl()     // Catch: java.lang.Throwable -> Lb5
            long r4 = r1.zzd     // Catch: java.lang.Throwable -> Lb5
            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r2 < 0) goto Lb1
            java.util.HashMap r2 = r9.zze     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r3 = r9.zzh     // Catch: java.lang.Throwable -> Lb5
            java.lang.Object r2 = r2.get(r3)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzov r2 = (com.google.android.gms.internal.ads.zzov) r2     // Catch: java.lang.Throwable -> Lb5
            if (r2 == 0) goto L3b
            long r3 = com.google.android.gms.internal.ads.zzov.zzb(r2)     // Catch: java.lang.Throwable -> Lb5
            r5 = -1
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 != 0) goto L3b
            int r2 = com.google.android.gms.internal.ads.zzov.zza(r2)     // Catch: java.lang.Throwable -> Lb5
            int r3 = r10.zzc     // Catch: java.lang.Throwable -> Lb5
            if (r2 != r3) goto Lb1
        L3b:
            int r2 = r10.zzc     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzov r3 = r9.zzm(r2, r1)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r4 = r9.zzh     // Catch: java.lang.Throwable -> Lb5
            if (r4 != 0) goto L4b
            java.lang.String r4 = com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> Lb5
            r9.zzh = r4     // Catch: java.lang.Throwable -> Lb5
        L4b:
            r4 = 1
            if (r1 == 0) goto L85
            boolean r5 = r1.zzb()     // Catch: java.lang.Throwable -> Lb5
            if (r5 == 0) goto L85
            java.lang.Object r5 = r1.zza     // Catch: java.lang.Throwable -> Lb5
            long r6 = r1.zzd     // Catch: java.lang.Throwable -> Lb5
            int r1 = r1.zzb     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzvh r8 = new com.google.android.gms.internal.ads.zzvh     // Catch: java.lang.Throwable -> Lb5
            r8.<init>(r5, r6, r1)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzov r2 = r9.zzm(r2, r8)     // Catch: java.lang.Throwable -> Lb5
            boolean r6 = com.google.android.gms.internal.ads.zzov.zzi(r2)     // Catch: java.lang.Throwable -> Lb5
            if (r6 != 0) goto L85
            com.google.android.gms.internal.ads.zzov.zzf(r2, r4)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzbj r6 = r9.zzd     // Catch: java.lang.Throwable -> Lb5
            r0.zzn(r5, r6)     // Catch: java.lang.Throwable -> Lb5
            r6.zzg(r1)     // Catch: java.lang.Throwable -> Lb5
            r0 = 0
            long r5 = com.google.android.gms.internal.ads.zzex.zzv(r0)     // Catch: java.lang.Throwable -> Lb5
            long r7 = com.google.android.gms.internal.ads.zzex.zzv(r0)     // Catch: java.lang.Throwable -> Lb5
            long r5 = r5 + r7
            java.lang.Math.max(r0, r5)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzov.zzd(r2)     // Catch: java.lang.Throwable -> Lb5
        L85:
            boolean r0 = com.google.android.gms.internal.ads.zzov.zzi(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto L91
            com.google.android.gms.internal.ads.zzov.zzf(r3, r4)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> Lb5
        L91:
            java.lang.String r0 = com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = r9.zzh     // Catch: java.lang.Throwable -> Lb5
            boolean r0 = r0.equals(r1)     // Catch: java.lang.Throwable -> Lb5
            if (r0 == 0) goto Lb1
            boolean r0 = com.google.android.gms.internal.ads.zzov.zzh(r3)     // Catch: java.lang.Throwable -> Lb5
            if (r0 != 0) goto Lb1
            com.google.android.gms.internal.ads.zzov.zze(r3, r4)     // Catch: java.lang.Throwable -> Lb5
            com.google.android.gms.internal.ads.zzpe r0 = r9.zzf     // Catch: java.lang.Throwable -> Lb5
            java.lang.String r1 = com.google.android.gms.internal.ads.zzov.zzd(r3)     // Catch: java.lang.Throwable -> Lb5
            r0.zzu(r10, r1)     // Catch: java.lang.Throwable -> Lb5
            monitor-exit(r9)
            return
        Lb1:
            monitor-exit(r9)
            return
        Lb3:
            r10 = 0
            throw r10     // Catch: java.lang.Throwable -> Lb5
        Lb5:
            r10 = move-exception
            monitor-exit(r9)     // Catch: java.lang.Throwable -> Lb5
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzow.zzi(com.google.android.gms.internal.ads.zzmp):void");
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized void zzj(zzmp zzmpVar, int i) {
        boolean z;
        String str;
        String str2;
        boolean z2;
        if (this.zzf != null) {
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzovVar = (zzov) it.next();
                if (zzovVar.zzk(zzmpVar)) {
                    it.remove();
                    z = zzovVar.zzf;
                    if (z) {
                        str = zzovVar.zzb;
                        boolean equals = str.equals(this.zzh);
                        boolean z3 = false;
                        if (i == 0 && equals) {
                            z2 = zzovVar.zzg;
                            if (z2) {
                                z3 = true;
                            }
                        }
                        if (equals) {
                            zzo(zzovVar);
                        }
                        zzpe zzpeVar = this.zzf;
                        str2 = zzovVar.zzb;
                        zzpeVar.zzv(zzmpVar, str2, z3);
                    }
                }
            }
            zzp(zzmpVar);
        } else {
            throw null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzpf
    public final synchronized void zzk(zzmp zzmpVar) {
        boolean z;
        String str;
        String str2;
        if (this.zzf != null) {
            zzbl zzblVar = this.zzg;
            this.zzg = zzmpVar.zzb;
            Iterator it = this.zze.values().iterator();
            while (it.hasNext()) {
                zzov zzovVar = (zzov) it.next();
                if (!zzovVar.zzl(zzblVar, this.zzg) || zzovVar.zzk(zzmpVar)) {
                    it.remove();
                    z = zzovVar.zzf;
                    if (z) {
                        str = zzovVar.zzb;
                        if (str.equals(this.zzh)) {
                            zzo(zzovVar);
                        }
                        zzpe zzpeVar = this.zzf;
                        str2 = zzovVar.zzb;
                        zzpeVar.zzv(zzmpVar, str2, false);
                    }
                }
            }
            zzp(zzmpVar);
        } else {
            throw null;
        }
    }
}
