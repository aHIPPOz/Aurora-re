package com.google.android.gms.internal.ads;

import android.content.Context;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzrc {
    private final Context zza;
    private final zzpj zzb;
    private boolean zzc;
    private final zzra zzd;
    private final zzrb zze;
    private zzre zzf;
    private zzqu zzg;

    @Deprecated
    public zzrc() {
        this.zza = null;
        this.zzb = zzpj.zza;
        this.zzd = zzra.zza;
        this.zze = zzrb.zza;
    }

    public static /* bridge */ /* synthetic */ Context zza(zzrc zzrcVar) {
        return zzrcVar.zza;
    }

    public static /* bridge */ /* synthetic */ zzpj zzb(zzrc zzrcVar) {
        return zzrcVar.zzb;
    }

    public static /* bridge */ /* synthetic */ zzre zzd(zzrc zzrcVar) {
        return zzrcVar.zzf;
    }

    public static /* bridge */ /* synthetic */ zzqu zze(zzrc zzrcVar) {
        return zzrcVar.zzg;
    }

    public final zzro zzc() {
        zzdd.zzf(!this.zzc);
        this.zzc = true;
        if (this.zzf == null) {
            this.zzf = new zzre(new zzcn[0]);
        }
        if (this.zzg == null) {
            this.zzg = new zzqu(this.zza);
        }
        return new zzro(this, null);
    }

    public zzrc(Context context) {
        this.zza = context;
        this.zzb = zzpj.zza;
        this.zzd = zzra.zza;
        this.zze = zzrb.zza;
    }
}
