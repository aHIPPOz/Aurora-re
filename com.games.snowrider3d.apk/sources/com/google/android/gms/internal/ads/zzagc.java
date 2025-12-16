package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzagc implements zzadv {
    private zzady zzf;
    private boolean zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private int zzl;
    private long zzm;
    private boolean zzn;
    private zzagb zzo;
    private zzagg zzp;
    private final zzen zza = new zzen(4);
    private final zzen zzb = new zzen(9);
    private final zzen zzc = new zzen(11);
    private final zzen zzd = new zzen();
    private final zzagd zze = new zzagd();
    private int zzg = 1;

    private final zzen zza(zzadw zzadwVar) throws IOException {
        zzen zzenVar = this.zzd;
        if (this.zzl > zzenVar.zzb()) {
            int zzb = zzenVar.zzb();
            zzenVar.zzJ(new byte[Math.max(zzb + zzb, this.zzl)], 0);
        } else {
            zzenVar.zzL(0);
        }
        zzenVar.zzK(this.zzl);
        zzadwVar.zzi(zzenVar.zzN(), 0, this.zzl);
        return zzenVar;
    }

    @RequiresNonNull({"extractorOutput"})
    private final void zzg() {
        if (!this.zzn) {
            this.zzf.zzP(new zzaet(-9223372036854775807L, 0L));
            this.zzn = true;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0009 A[SYNTHETIC] */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r17, com.google.android.gms.internal.ads.zzaer r18) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 348
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagc.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
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
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzg = 1;
            this.zzh = false;
        } else {
            this.zzg = 3;
        }
        this.zzj = 0;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        zzen zzenVar = this.zza;
        zzadl zzadlVar = (zzadl) zzadwVar;
        zzadlVar.zzm(zzenVar.zzN(), 0, 3, false);
        zzenVar.zzL(0);
        if (zzenVar.zzo() != 4607062) {
            return false;
        }
        zzadlVar.zzm(zzenVar.zzN(), 0, 2, false);
        zzenVar.zzL(0);
        if ((zzenVar.zzq() & 250) != 0) {
            return false;
        }
        zzadlVar.zzm(zzenVar.zzN(), 0, 4, false);
        zzenVar.zzL(0);
        int zzg = zzenVar.zzg();
        zzadwVar.zzj();
        zzadlVar.zzl(zzg, false);
        zzadlVar.zzm(zzenVar.zzN(), 0, 4, false);
        zzenVar.zzL(0);
        return zzenVar.zzg() == 0;
    }
}
