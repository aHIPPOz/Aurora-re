package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzamx implements zzamz {
    private final zzen zza;
    private final String zzc;
    private final int zzd;
    private String zzf;
    private zzafb zzg;
    private int zzi;
    private int zzj;
    private long zzk;
    private zzz zzl;
    private int zzm;
    private int zzn;
    private int zzh = 0;
    private long zzq = -9223372036854775807L;
    private final AtomicInteger zzb = new AtomicInteger();
    private int zzo = -1;
    private int zzp = -1;
    private final String zze = "video/mp2t";

    public zzamx(String str, int i, int i2, String str2) {
        this.zza = new zzen(new byte[i2]);
        this.zzc = str;
        this.zzd = i;
    }

    @RequiresNonNull({"output"})
    private final void zzf(zzads zzadsVar) {
        int i;
        zzx zzxVar;
        int i2 = zzadsVar.zzb;
        if (i2 == -2147483647 || (i = zzadsVar.zzc) == -1) {
            return;
        }
        zzz zzzVar = this.zzl;
        if (zzzVar != null && i == zzzVar.zzG && i2 == zzzVar.zzH && Objects.equals(zzadsVar.zza, zzzVar.zzo)) {
            return;
        }
        zzz zzzVar2 = this.zzl;
        if (zzzVar2 == null) {
            zzxVar = new zzx();
        } else {
            zzxVar = zzzVar2.zzb();
        }
        zzxVar.zzS(this.zzf);
        zzxVar.zzG(this.zze);
        zzxVar.zzah(zzadsVar.zza);
        zzxVar.zzD(i);
        zzxVar.zzai(i2);
        zzxVar.zzW(this.zzc);
        zzxVar.zzaf(this.zzd);
        zzz zzan = zzxVar.zzan();
        this.zzl = zzan;
        this.zzg.zzm(zzan);
    }

    private final boolean zzg(zzen zzenVar, byte[] bArr, int i) {
        int min = Math.min(zzenVar.zza(), i - this.zzi);
        zzenVar.zzH(bArr, this.zzi, min);
        int i2 = this.zzi + min;
        this.zzi = i2;
        return i2 == i;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ed  */
    @Override // com.google.android.gms.internal.ads.zzamz
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zza(com.google.android.gms.internal.ads.zzen r23) throws com.google.android.gms.internal.ads.zzaz {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzamx.zza(com.google.android.gms.internal.ads.zzen):void");
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzb(zzady zzadyVar, zzaon zzaonVar) {
        zzaonVar.zzc();
        this.zzf = zzaonVar.zzb();
        this.zzg = zzadyVar.zzw(zzaonVar.zza(), 1);
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzc(boolean z) {
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zzd(long j, int i) {
        this.zzq = j;
    }

    @Override // com.google.android.gms.internal.ads.zzamz
    public final void zze() {
        this.zzh = 0;
        this.zzi = 0;
        this.zzj = 0;
        this.zzq = -9223372036854775807L;
        this.zzb.set(0);
    }
}
