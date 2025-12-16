package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzabi implements zzaco {
    final /* synthetic */ zzabo zza;
    private zzz zzc;
    private long zzd;
    private zzfyq zzb = zzfyq.zzn();
    private long zze = -9223372036854775807L;

    public zzabi(zzabo zzaboVar, Context context, int i) {
        Objects.requireNonNull(zzaboVar);
        this.zza = zzaboVar;
        zzex.zzL(context);
    }

    private final void zza(zzz zzzVar) {
        zzk zzA;
        zzabo zzaboVar = this.zza;
        zzx zzb = zzzVar.zzb();
        zzA = zzabo.zzA(zzzVar.zzE);
        zzb.zzF(zzA);
        zzb.zzan();
        throw null;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzA(zzz zzzVar) throws zzacn {
        return zzabo.zzy(this.zza, zzzVar, 0);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzB() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzC() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzD(boolean z) {
        boolean zzD;
        zzD = this.zza.zze.zzD(false);
        return zzD;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final Surface zzb() {
        zzdd.zzf(false);
        throw null;
    }

    /* JADX WARN: Incorrect condition in loop: B:8:0x0021 */
    @Override // com.google.android.gms.internal.ads.zzaco
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() {
        /*
            r11 = this;
            com.google.android.gms.internal.ads.zzabo r0 = r11.zza
            com.google.android.gms.internal.ads.zzet r1 = com.google.android.gms.internal.ads.zzabo.zzd(r0)
            int r1 = r1.zza()
            if (r1 != 0) goto L10
            com.google.android.gms.internal.ads.zzabo.zzi(r0)
            return
        L10:
            com.google.android.gms.internal.ads.zzet r1 = new com.google.android.gms.internal.ads.zzet
            r2 = 10
            r1.<init>(r2)
            r2 = 1
            r3 = r2
        L19:
            com.google.android.gms.internal.ads.zzet r4 = com.google.android.gms.internal.ads.zzabo.zzd(r0)
            int r4 = r4.zza()
            if (r4 <= 0) goto L52
            com.google.android.gms.internal.ads.zzet r4 = com.google.android.gms.internal.ads.zzabo.zzd(r0)
            java.lang.Object r4 = r4.zzb()
            com.google.android.gms.internal.ads.zzabm r4 = (com.google.android.gms.internal.ads.zzabm) r4
            r4.getClass()
            r5 = r4
            com.google.android.gms.internal.ads.zzabm r5 = (com.google.android.gms.internal.ads.zzabm) r5
            if (r3 == 0) goto L4b
            int r3 = r4.zzb
            if (r3 == 0) goto L40
            if (r3 != r2) goto L3c
            goto L40
        L3c:
            com.google.android.gms.internal.ads.zzabo.zzi(r0)
            goto L4b
        L40:
            long r6 = r4.zza
            long r9 = r4.zzc
            com.google.android.gms.internal.ads.zzabm r5 = new com.google.android.gms.internal.ads.zzabm
            r8 = 0
            r5.<init>(r6, r8, r9)
            r4 = r5
        L4b:
            long r5 = r4.zzc
            r1.zzd(r5, r4)
            r3 = 0
            goto L19
        L52:
            com.google.android.gms.internal.ads.zzabo.zzh(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzabi.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzi() {
        this.zza.zzq();
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzj(boolean z) {
        this.zze = -9223372036854775807L;
        zzabo.zzj(this.zza, z);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzk(boolean z) {
        boolean z2;
        zzabo zzaboVar = this.zza;
        z2 = zzaboVar.zzd;
        if (z2) {
            zzaboVar.zze.zzk(z);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzl(int i, zzz zzzVar, long j, int i2, List list) {
        boolean z;
        zzet zzetVar;
        zzdd.zzf(false);
        this.zzb = zzfyq.zzl(list);
        this.zzc = zzzVar;
        zzabo zzaboVar = this.zza;
        zzaboVar.zzq = -9223372036854775807L;
        zza(zzzVar);
        long j2 = this.zze;
        z = zzaboVar.zzd;
        long j3 = -4611686018427387904L;
        if (!z) {
            if (j2 != -9223372036854775807L) {
                return;
            }
        } else if (j2 != -9223372036854775807L) {
            j3 = j2 + 1;
        }
        long j4 = j3;
        zzetVar = zzaboVar.zzh;
        zzetVar.zzd(j4, new zzabm(j + this.zzd, i2, j4));
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzm() {
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzn() {
        this.zza.zzr();
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzo(long j, long j2) throws zzacn {
        this.zza.zze.zzo(j + this.zzd, j2);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzp(long j) {
        this.zzd = j;
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzq(int i) {
        this.zza.zze.zzq(i);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzr(zzacl zzaclVar, Executor executor) {
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzs(Surface surface, zzeo zzeoVar) {
        this.zza.zzs(surface, zzeoVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzt(float f) {
        this.zza.zze.zzt(f);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzu(List list) {
        if (this.zzb.equals(list)) {
            return;
        }
        this.zzb = zzfyq.zzl(list);
        zzz zzzVar = this.zzc;
        if (zzzVar == null) {
            return;
        }
        zza(zzzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzv(zzabp zzabpVar) {
        this.zza.zze.zzv(zzabpVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzw() {
        long j;
        long j2;
        zzabo zzaboVar = this.zza;
        zzaboVar.zzq = this.zze;
        j = zzaboVar.zzp;
        j2 = zzaboVar.zzq;
        if (j >= j2) {
            zzaboVar.zze.zzw();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzx() {
        boolean z;
        zzabo zzaboVar = this.zza;
        z = zzaboVar.zzd;
        if (z) {
            zzaboVar.zzu();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final void zzy() {
        boolean z;
        zzabo zzaboVar = this.zza;
        z = zzaboVar.zzd;
        if (z) {
            zzaboVar.zzv();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzaco
    public final boolean zzz(long j, zzacm zzacmVar) {
        zzdd.zzf(false);
        if (!zzabo.zzz(this.zza)) {
            return false;
        }
        throw null;
    }
}
