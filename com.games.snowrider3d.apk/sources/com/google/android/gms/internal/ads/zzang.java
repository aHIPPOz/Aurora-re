package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzang implements zzamz {
    private final zzaod zza;
    private long zzf;
    private String zzh;
    private zzafb zzi;
    private zzanf zzj;
    private boolean zzk;
    private boolean zzm;
    private final String zzb = "video/mp2t";
    private final boolean[] zzg = new boolean[3];
    private final zzanr zzc = new zzanr(7, 128);
    private final zzanr zzd = new zzanr(8, 128);
    private final zzanr zze = new zzanr(6, 128);
    private long zzl = -9223372036854775807L;
    private final zzen zzn = new zzen();

    public zzang(zzaod zzaodVar, boolean z, boolean z2, String str) {
        this.zza = zzaodVar;
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzg(byte[] bArr, int i, int i2) {
        if (!this.zzk) {
            this.zzc.zza(bArr, i, i2);
            this.zzd.zza(bArr, i, i2);
        }
        this.zze.zza(bArr, i, i2);
    }

    @RequiresNonNull({"sampleReader"})
    private final void zzh(long j, int i, long j2) {
        if (!this.zzk) {
            this.zzc.zzc(i);
            this.zzd.zzc(i);
        }
        this.zze.zzc(i);
        this.zzj.zzd(j, i, j2, this.zzm);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r15) {
        /*
            r14 = this;
            com.google.android.gms.internal.ads.zzafb r1 = r14.zzi
            com.google.android.gms.internal.ads.zzdd.zzb(r1)
            java.lang.String r1 = com.google.android.gms.internal.ads.zzex.zza
            int r1 = r15.zzc()
            int r7 = r15.zzd()
            byte[] r8 = r15.zzN()
            long r2 = r14.zzf
            int r4 = r15.zza()
            long r4 = (long) r4
            long r2 = r2 + r4
            r14.zzf = r2
            com.google.android.gms.internal.ads.zzafb r2 = r14.zzi
            int r3 = r15.zza()
            r2.zzr(r15, r3)
        L26:
            boolean[] r2 = r14.zzg
            int r2 = com.google.android.gms.internal.ads.zzfv.zza(r8, r1, r7, r2)
            if (r2 == r7) goto L67
            int r3 = r2 + 3
            r3 = r8[r3]
            r9 = r3 & 31
            r3 = 3
            if (r2 <= 0) goto L41
            int r4 = r2 + (-1)
            r5 = r8[r4]
            if (r5 != 0) goto L41
            r3 = 4
            r11 = r3
            r10 = r4
            goto L43
        L41:
            r10 = r2
            r11 = r3
        L43:
            int r2 = r10 - r1
            if (r2 <= 0) goto L4a
            r14.zzg(r8, r1, r10)
        L4a:
            int r3 = r7 - r10
            long r4 = r14.zzf
            long r12 = (long) r3
            long r4 = r4 - r12
            if (r2 >= 0) goto L54
            int r1 = -r2
            goto L55
        L54:
            r1 = 0
        L55:
            r12 = r4
            long r5 = r14.zzl
            r0 = r14
            r4 = r1
            r1 = r12
            r0.zzf(r1, r3, r4, r5)
            long r4 = r14.zzl
            r3 = r9
            r0.zzh(r1, r3, r4)
            int r1 = r10 + r11
            goto L26
        L67:
            r14.zzg(r8, r1, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzang.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzady zzadyVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzh = zzaonVar.zzb();
        this.zzi = zzadyVar.zzw(zzaonVar.zza(), 2);
        this.zzj = new zzanf(this.zzi, false, false);
        this.zza.zzd(zzadyVar, zzaonVar);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
        zzdd.zzb(this.zzi);
        String str = zzex.zza;
        if (z) {
            this.zza.zze();
            zzf(this.zzf, 0, 0, this.zzl);
            zzh(this.zzf, 9, this.zzl);
            zzf(this.zzf, 0, 0, this.zzl);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j, int i) {
        this.zzl = j;
        int i2 = i & 2;
        this.zzm = (i2 != 0) | this.zzm;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzf = 0L;
        this.zzm = false;
        this.zzl = -9223372036854775807L;
        zzfv.zzi(this.zzg);
        this.zzc.zzb();
        this.zzd.zzb();
        this.zze.zzb();
        this.zza.zzb();
        zzanf zzanfVar = this.zzj;
        if (zzanfVar != null) {
            zzanfVar.zzc();
        }
    }

    @RequiresNonNull({"output", "sampleReader"})
    private final void zzf(long j, int i, int i2, long j2) {
        if (!this.zzk) {
            zzanr zzanrVar = this.zzc;
            zzanrVar.zzd(i2);
            zzanr zzanrVar2 = this.zzd;
            zzanrVar2.zzd(i2);
            if (!this.zzk) {
                if (zzanrVar.zze() && zzanrVar2.zze()) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Arrays.copyOf(zzanrVar.zza, zzanrVar.zzb));
                    arrayList.add(Arrays.copyOf(zzanrVar2.zza, zzanrVar2.zzb));
                    zzfu zzg = zzfv.zzg(zzanrVar.zza, 4, zzanrVar.zzb);
                    zzft zzf = zzfv.zzf(zzanrVar2.zza, 4, zzanrVar2.zzb);
                    String zzc = zzdk.zzc(zzg.zza, zzg.zzb, zzg.zzc);
                    zzafb zzafbVar = this.zzi;
                    zzx zzxVar = new zzx();
                    zzxVar.zzS(this.zzh);
                    zzxVar.zzG(this.zzb);
                    zzxVar.zzah("video/avc");
                    zzxVar.zzE(zzc);
                    zzxVar.zzam(zzg.zze);
                    zzxVar.zzQ(zzg.zzf);
                    zzi zziVar = new zzi();
                    zziVar.zzc(zzg.zzj);
                    zziVar.zzb(zzg.zzk);
                    zziVar.zzd(zzg.zzl);
                    zziVar.zzf(zzg.zzh + 8);
                    zziVar.zza(zzg.zzi + 8);
                    zzxVar.zzF(zziVar.zzg());
                    zzxVar.zzad(zzg.zzg);
                    zzxVar.zzT(arrayList);
                    int i3 = zzg.zzm;
                    zzxVar.zzY(i3);
                    zzafbVar.zzm(zzxVar.zzan());
                    this.zzk = true;
                    this.zza.zzf(i3);
                    this.zzj.zzb(zzg);
                    this.zzj.zza(zzf);
                    zzanrVar.zzb();
                    zzanrVar2.zzb();
                }
            } else if (zzanrVar.zze()) {
                zzfu zzg2 = zzfv.zzg(zzanrVar.zza, 4, zzanrVar.zzb);
                this.zza.zzf(zzg2.zzm);
                this.zzj.zzb(zzg2);
                zzanrVar.zzb();
            } else if (zzanrVar2.zze()) {
                this.zzj.zza(zzfv.zzf(zzanrVar2.zza, 4, zzanrVar2.zzb));
                zzanrVar2.zzb();
            }
        }
        zzanr zzanrVar3 = this.zze;
        if (zzanrVar3.zzd(i2)) {
            int zzc2 = zzfv.zzc(zzanrVar3.zza, zzanrVar3.zzb);
            zzen zzenVar = this.zzn;
            zzenVar.zzJ(zzanrVar3.zza, zzc2);
            zzenVar.zzL(4);
            this.zza.zzc(j2, zzenVar);
        }
        if (this.zzj.zze(j, i, this.zzk)) {
            this.zzm = false;
        }
    }
}
