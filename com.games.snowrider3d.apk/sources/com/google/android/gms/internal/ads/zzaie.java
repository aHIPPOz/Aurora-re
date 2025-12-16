package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaie implements zzadv {
    private final zzen zza;
    private final zzaen zzb;
    private final zzaej zzc;
    private final zzael zzd;
    private final zzafb zze;
    private zzady zzf;
    private zzafb zzg;
    private zzafb zzh;
    private int zzi;
    private zzav zzj;
    private long zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private zzaig zzp;
    private boolean zzq;

    public zzaie() {
        throw null;
    }

    public zzaie(int i) {
        this.zza = new zzen(10);
        this.zzb = new zzaen();
        this.zzc = new zzaej();
        this.zzk = -9223372036854775807L;
        this.zzd = new zzael();
        zzadr zzadrVar = new zzadr();
        this.zze = zzadrVar;
        this.zzh = zzadrVar;
        this.zzn = -1L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0232  */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v48, types: [com.google.android.gms.internal.ads.zzaij] */
    /* JADX WARN: Type inference failed for: r2v50, types: [com.google.android.gms.internal.ads.zzaih] */
    @org.checkerframework.checker.nullness.qual.RequiresNonNull({"extractorOutput", "realTrackOutput"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final int zzg(com.google.android.gms.internal.ads.zzadw r36) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 762
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzaie.zzg(com.google.android.gms.internal.ads.zzadw):int");
    }

    private final long zzh(long j) {
        return this.zzk + ((j * 1000000) / this.zzb.zzd);
    }

    private final void zzj() {
        zzaig zzaigVar = this.zzp;
        if (!(zzaigVar instanceof zzaib) || !zzaigVar.zzh()) {
            return;
        }
        long j = this.zzn;
        if (j == -1 || j == this.zzp.zzd()) {
            return;
        }
        this.zzp = ((zzaib) this.zzp).zzf(this.zzn);
        zzady zzadyVar = this.zzf;
        zzadyVar.getClass();
        zzadyVar.zzP(this.zzp);
        this.zzg.getClass();
        this.zzp.zza();
    }

    private static boolean zzk(int i, long j) {
        return ((long) (i & (-128000))) == (j & (-128000));
    }

    private final boolean zzl(zzadw zzadwVar) throws IOException {
        zzaig zzaigVar = this.zzp;
        if (zzaigVar != null) {
            long zzd = zzaigVar.zzd();
            if (zzd != -1 && zzadwVar.zze() > zzd - 4) {
                return true;
            }
        }
        try {
            return !zzadwVar.zzm(this.zza.zzN(), 0, 4, true);
        } catch (EOFException unused) {
            return true;
        }
    }

    private final boolean zzm(zzadw zzadwVar, boolean z) throws IOException {
        int i;
        int i2;
        int zzb;
        zzadwVar.zzj();
        if (zzadwVar.zzf() == 0) {
            zzav zza = this.zzd.zza(zzadwVar, null);
            this.zzj = zza;
            if (zza != null) {
                this.zzc.zzb(zza);
            }
            i2 = (int) zzadwVar.zze();
            if (!z) {
                zzadwVar.zzk(i2);
            }
            i = 0;
        } else {
            i2 = 0;
            i = 0;
        }
        int i3 = i;
        int i4 = i3;
        while (true) {
            if (!zzl(zzadwVar)) {
                zzen zzenVar = this.zza;
                zzenVar.zzL(0);
                int zzg = zzenVar.zzg();
                if ((i == 0 || zzk(zzg, i)) && (zzb = zzaeo.zzb(zzg)) != -1) {
                    i3++;
                    if (i3 != 1) {
                        if (i3 == 4) {
                            break;
                        }
                    } else {
                        this.zzb.zza(zzg);
                        i = zzg;
                    }
                    zzadwVar.zzg(zzb - 4);
                } else {
                    int i5 = i4 + 1;
                    if (i4 == (true != z ? 131072 : 32768)) {
                        if (z) {
                            return false;
                        }
                        zzj();
                        throw new EOFException();
                    }
                    if (z) {
                        zzadwVar.zzj();
                        zzadwVar.zzg(i2 + i5);
                    } else {
                        zzadwVar.zzk(1);
                    }
                    i = 0;
                    i4 = i5;
                    i3 = 0;
                }
            } else if (i3 <= 0) {
                zzj();
                throw new EOFException();
            }
        }
        if (z) {
            zzadwVar.zzk(i2 + i4);
        } else {
            zzadwVar.zzj();
        }
        this.zzi = i;
        return true;
    }

    public final void zza() {
        this.zzq = true;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final int zzb(zzadw zzadwVar, zzaer zzaerVar) throws IOException {
        zzdd.zzb(this.zzg);
        String str = zzex.zza;
        int zzg = zzg(zzadwVar);
        if (zzg == -1 && (this.zzp instanceof zzaic)) {
            if (this.zzp.zza() != zzh(this.zzl)) {
                zzaic zzaicVar = (zzaic) this.zzp;
                throw null;
            }
        }
        return zzg;
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
        this.zzf = zzadyVar;
        zzafb zzw = zzadyVar.zzw(0, 1);
        this.zzg = zzw;
        this.zzh = zzw;
        this.zzf.zzG();
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        this.zzi = 0;
        this.zzk = -9223372036854775807L;
        this.zzl = 0L;
        this.zzo = 0;
        zzaig zzaigVar = this.zzp;
        if (!(zzaigVar instanceof zzaic)) {
            return;
        }
        zzaic zzaicVar = (zzaic) zzaigVar;
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        return zzm(zzadwVar, true);
    }
}
