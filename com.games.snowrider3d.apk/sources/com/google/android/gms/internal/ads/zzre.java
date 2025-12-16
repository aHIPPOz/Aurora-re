package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzre {
    private final zzcn[] zza;
    private final zzrw zzb;
    private final zzcq zzc;

    public zzre(zzcn... zzcnVarArr) {
        zzrw zzrwVar = new zzrw();
        zzcq zzcqVar = new zzcq();
        this.zza = r2;
        System.arraycopy(zzcnVarArr, 0, r2, 0, 0);
        this.zzb = zzrwVar;
        this.zzc = zzcqVar;
        zzcn[] zzcnVarArr2 = {zzrwVar, zzcqVar};
    }

    public final long zza(long j) {
        zzcq zzcqVar = this.zzc;
        return zzcqVar.zzg() ? zzcqVar.zzi(j) : j;
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzbb zzc(zzbb zzbbVar) {
        zzcq zzcqVar = this.zzc;
        zzcqVar.zzk(zzbbVar.zzb);
        zzcqVar.zzj(zzbbVar.zzc);
        return zzbbVar;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzcn[] zze() {
        return this.zza;
    }
}
