package com.google.android.gms.internal.games_v2;

import java.io.Serializable;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
public final class zzhi extends zzfz implements Serializable {
    public static final /* synthetic */ int zza = 0;
    private static final zzhi zzb = new zzhi(zzhz.zza);
    private static final zzhi zzc = new zzhi(zzhd.zzj(zzhw.zza()));
    private final transient zzhd zzd;

    static {
        int i = zzhd.zzd;
    }

    public zzhi(zzhd zzhdVar) {
        this.zzd = zzhdVar;
    }

    public static zzhi zza() {
        return zzb;
    }

    public static zzhi zzb() {
        return zzc;
    }

    @Override // com.google.android.gms.internal.games_v2.zzhy
    public final /* bridge */ /* synthetic */ Set zzc() {
        zzhd zzhdVar = this.zzd;
        if (zzhdVar.isEmpty()) {
            return zzif.zza;
        }
        int i = zzhw.zzc;
        return new zzig(zzhdVar, zzhv.zza);
    }
}
