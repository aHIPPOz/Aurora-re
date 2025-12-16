package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzkq {
    public zzls zza;
    public int zzb;
    public boolean zzc;
    public int zzd;
    private boolean zze;

    public zzkq(zzls zzlsVar) {
        this.zza = zzlsVar;
    }

    public final void zza(int i) {
        boolean z = true;
        if (1 != ((this.zze ? 1 : 0) | i)) {
            z = false;
        }
        this.zze = z;
        this.zzb += i;
    }

    public final void zzb(zzls zzlsVar) {
        this.zze |= this.zza != zzlsVar;
        this.zza = zzlsVar;
    }

    public final void zzc(int i) {
        boolean z = true;
        if (!this.zzc || this.zzd == 5) {
            this.zze = true;
            this.zzc = true;
            this.zzd = i;
            return;
        }
        if (i != 5) {
            z = false;
        }
        zzdd.zzd(z);
    }
}
