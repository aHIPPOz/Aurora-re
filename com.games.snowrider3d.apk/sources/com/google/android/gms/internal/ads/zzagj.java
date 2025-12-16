package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzagj implements zzadv {
    private zzady zzb;
    private int zzc;
    private int zzd;
    private int zze;
    private zzahm zzg;
    private zzadw zzh;
    private zzagm zzi;
    private zzajj zzj;
    private final zzen zza = new zzen(6);
    private long zzf = -1;

    private final int zza(zzadw zzadwVar) throws IOException {
        zzen zzenVar = this.zza;
        zzenVar.zzI(2);
        ((zzadl) zzadwVar).zzm(zzenVar.zzN(), 0, 2, false);
        return zzenVar.zzq();
    }

    /* JADX WARN: Removed duplicated region for block: B:82:0x0193  */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r26, com.google.android.gms.internal.ads.zzaer r27) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 501
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagj.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
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
        this.zzb = zzadyVar;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        if (zza(zzadwVar) != 65496) {
            return false;
        }
        int zza = zza(zzadwVar);
        this.zzd = zza;
        if (zza == 65504) {
            zzen zzenVar = this.zza;
            zzenVar.zzI(2);
            zzadl zzadlVar = (zzadl) zzadwVar;
            zzadlVar.zzm(zzenVar.zzN(), 0, 2, false);
            zzadlVar.zzl(zzenVar.zzq() - 2, false);
            zza = zza(zzadwVar);
            this.zzd = zza;
        }
        if (zza == 65505) {
            zzadl zzadlVar2 = (zzadl) zzadwVar;
            zzadlVar2.zzl(2, false);
            zzen zzenVar2 = this.zza;
            zzenVar2.zzI(6);
            zzadlVar2.zzm(zzenVar2.zzN(), 0, 6, false);
            if (zzenVar2.zzu() == 1165519206 && zzenVar2.zzq() == 0) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        if (j == 0) {
            this.zzc = 0;
            this.zzj = null;
        } else if (this.zzc != 5) {
        } else {
            zzajj zzajjVar = this.zzj;
            zzajjVar.getClass();
            zzajjVar.zzf(j, j2);
        }
    }

    private final void zzg() {
        zzady zzadyVar = this.zzb;
        zzadyVar.getClass();
        zzadyVar.zzG();
        this.zzb.zzP(new zzaet(-9223372036854775807L, 0L));
        this.zzc = 6;
    }
}
