package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzafn implements zzadv {
    private final zzen zza;
    private final zzafl zzb;
    private final boolean zzc;
    private final zzakr zzd;
    private int zze;
    private zzady zzf;
    private zzafo zzg;
    private long zzh;
    private zzafq[] zzi;
    private long zzj;
    private zzafq zzk;
    private int zzl;
    private long zzm;
    private long zzn;
    private int zzo;
    private boolean zzp;

    @Deprecated
    public zzafn() {
        this(1, zzakr.zza);
    }

    private final zzafq zzg(int i) {
        zzafq[] zzafqVarArr;
        for (zzafq zzafqVar : this.zzi) {
            if (zzafqVar.zzf(i)) {
                return zzafqVar;
            }
        }
        return null;
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
        this.zze = 0;
        if (this.zzc) {
            zzadyVar = new zzaku(zzadyVar, this.zzd);
        }
        this.zzf = zzadyVar;
        this.zzj = -1L;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final void zzf(long j, long j2) {
        this.zzj = -1L;
        this.zzk = null;
        int i = 0;
        for (zzafq zzafqVar : this.zzi) {
            zzafqVar.zze(j);
        }
        if (j != 0) {
            this.zze = 6;
            return;
        }
        if (this.zzi.length != 0) {
            i = 3;
        }
        this.zze = i;
    }

    @Override // com.google.android.gms.internal.ads.zzadv
    public final boolean zzi(zzadw zzadwVar) throws IOException {
        zzen zzenVar = this.zza;
        zzadwVar.zzh(zzenVar.zzN(), 0, 12);
        zzenVar.zzL(0);
        if (zzenVar.zzi() != 1179011410) {
            return false;
        }
        zzenVar.zzM(4);
        return zzenVar.zzi() == 541677121;
    }

    public zzafn(int i, zzakr zzakrVar) {
        this.zzd = zzakrVar;
        this.zzc = 1 != (i ^ 1) ? false : true;
        this.zza = new zzen(12);
        this.zzb = new zzafl(null);
        this.zzf = new zzaep();
        this.zzi = new zzafq[0];
        this.zzm = -1L;
        this.zzn = -1L;
        this.zzl = -1;
        this.zzh = -9223372036854775807L;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0030 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    @Override // com.google.android.gms.internal.ads.zzadv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int zzb(com.google.android.gms.internal.ads.zzadw r22, com.google.android.gms.internal.ads.zzaer r23) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 898
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzafn.zzb(com.google.android.gms.internal.ads.zzadw, com.google.android.gms.internal.ads.zzaer):int");
    }
}
