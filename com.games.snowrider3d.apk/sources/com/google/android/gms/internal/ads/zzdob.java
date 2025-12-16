package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdob extends zzdnl implements zzded {
    private zzded zza;

    @Override // com.google.android.gms.internal.ads.zzded
    public final synchronized void zzdH() {
        zzded zzdedVar = this.zza;
        if (zzdedVar != null) {
            zzdedVar.zzdH();
        }
    }

    @Override // com.google.android.gms.internal.ads.zzded
    public final synchronized void zzdf() {
        zzded zzdedVar = this.zza;
        if (zzdedVar != null) {
            zzdedVar.zzdf();
        }
    }

    public final synchronized void zzi(com.google.android.gms.ads.internal.client.zza zzaVar, zzbiv zzbivVar, com.google.android.gms.ads.internal.overlay.zzr zzrVar, zzbix zzbixVar, com.google.android.gms.ads.internal.overlay.zzad zzadVar, zzded zzdedVar) {
        Throwable th;
        try {
            try {
                super.zzh(zzaVar, zzbivVar, zzrVar, zzbixVar, zzadVar);
                this.zza = zzdedVar;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }
}
