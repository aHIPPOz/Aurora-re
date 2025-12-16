package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaoj implements zzadv {
    private final int zza;
    private final List zzb;
    private final zzen zzc;
    private final SparseIntArray zzd;
    private final zzaom zze;
    private final zzakr zzf;
    private final SparseArray zzg;
    private final SparseBooleanArray zzh;
    private final SparseBooleanArray zzi;
    private final zzaog zzj;
    private zzaof zzk;
    private zzady zzl;
    private int zzm;
    private boolean zzn;
    private boolean zzo;
    private boolean zzp;
    private int zzq;
    private int zzr;

    @Deprecated
    public zzaoj() {
        this(1, 1, zzakr.zza, new zzeu(0L), new zzamw(0), 112800);
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x019a, code lost:
        if (r3 == false) goto L92;
     */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r20, com.google.android.gms.internal.ads.zzaer r21) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 426
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ zzadv zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final /* synthetic */ List zzd() {
        return zzfyq.zzn();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zze(zzady zzadyVar) {
        if (this.zza == 0) {
            zzadyVar = new zzaku(zzadyVar, this.zzf);
        }
        this.zzl = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        zzaof zzaofVar;
        List list = this.zzb;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zzeu zzeuVar = (zzeu) list.get(i);
            if (zzeuVar.zzf() != -9223372036854775807L) {
                long zzd = zzeuVar.zzd();
                if (zzd != -9223372036854775807L) {
                    if (zzd != 0) {
                        if (zzd == j2) {
                        }
                    }
                }
            }
            zzeuVar.zzi(j2);
        }
        if (j2 != 0 && (zzaofVar = this.zzk) != null) {
            zzaofVar.zzd(j2);
        }
        this.zzc.zzI(0);
        this.zzd.clear();
        int i2 = 0;
        while (true) {
            SparseArray sparseArray = this.zzg;
            if (i2 >= sparseArray.size()) {
                this.zzq = 0;
                return;
            } else {
                ((zzaoo) sparseArray.valueAt(i2)).zzc();
                i2++;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0020, code lost:
        r1 = r1 + 1;
     */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzi(com.google.android.gms.internal.ads.zzadw r7) throws java.io.IOException {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzen r0 = r6.zzc
            byte[] r0 = r0.zzN()
            com.google.android.gms.internal.ads.zzadl r7 = (com.google.android.gms.internal.ads.zzadl) r7
            r1 = 940(0x3ac, float:1.317E-42)
            r2 = 0
            r7.zzm(r0, r2, r1, r2)
            r1 = r2
        Lf:
            r3 = 188(0xbc, float:2.63E-43)
            if (r1 >= r3) goto L2b
            r3 = r2
        L14:
            r4 = 5
            if (r3 >= r4) goto L26
            int r4 = r3 * 188
            int r4 = r4 + r1
            r4 = r0[r4]
            r5 = 71
            if (r4 == r5) goto L23
            int r1 = r1 + 1
            goto Lf
        L23:
            int r3 = r3 + 1
            goto L14
        L26:
            r7.zzo(r1, r2)
            r7 = 1
            return r7
        L2b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaoj.zzi(com.google.android.gms.internal.ads.zzadw):boolean");
    }

    public zzaoj(int i, int i2, zzakr zzakrVar, zzeu zzeuVar, zzaom zzaomVar, int i3) {
        this.zze = zzaomVar;
        this.zza = i2;
        this.zzf = zzakrVar;
        this.zzb = Collections.singletonList(zzeuVar);
        this.zzc = new zzen(new byte[9400], 0);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.zzh = sparseBooleanArray;
        this.zzi = new SparseBooleanArray();
        SparseArray sparseArray = new SparseArray();
        this.zzg = sparseArray;
        this.zzd = new SparseIntArray();
        this.zzj = new zzaog(112800);
        this.zzl = zzady.zza;
        this.zzr = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray zza = zzaomVar.zza();
        int size = zza.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.zzg.put(zza.keyAt(i4), (zzaoo) zza.valueAt(i4));
        }
        this.zzg.put(0, new zzaob(new zzaoh(this)));
    }
}
