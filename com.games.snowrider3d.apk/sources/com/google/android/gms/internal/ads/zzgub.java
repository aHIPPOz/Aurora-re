package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgub extends zzgzh implements zzhat {
    private static final zzgub zza;
    private static volatile zzhba zzb;
    private String zzc = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgxz zzd = zzgxz.zzb;
    private int zze;

    static {
        zzgub zzgubVar = new zzgub();
        zza = zzgubVar;
        zzgzh.zzbZ(zzgub.class, zzgubVar);
    }

    private zzgub() {
    }

    public static zzgty zza() {
        return (zzgty) zza.zzaZ();
    }

    public static zzgub zzd() {
        return zza;
    }

    public static /* synthetic */ void zzi(zzgub zzgubVar, String str) {
        str.getClass();
        zzgubVar.zzc = str;
    }

    public static /* synthetic */ void zzj(zzgub zzgubVar, zzgxz zzgxzVar) {
        zzgxzVar.getClass();
        zzgubVar.zzd = zzgxzVar;
    }

    public final zzgtz zzb() {
        int i = this.zze;
        zzgtz zzgtzVar = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? null : zzgtz.REMOTE : zzgtz.ASYMMETRIC_PUBLIC : zzgtz.ASYMMETRIC_PRIVATE : zzgtz.SYMMETRIC : zzgtz.UNKNOWN_KEYMATERIAL;
        return zzgtzVar == null ? zzgtz.UNRECOGNIZED : zzgtzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", new Object[]{"zzc", "zzd", "zze"});
            } else if (ordinal == 3) {
                return new zzgub();
            } else {
                if (ordinal == 4) {
                    return new zzgty(null);
                }
                if (ordinal == 5) {
                    return zza;
                }
                if (ordinal != 6) {
                    throw null;
                }
                zzhba zzhbaVar2 = zzb;
                if (zzhbaVar2 != null) {
                    return zzhbaVar2;
                }
                synchronized (zzgub.class) {
                    zzhbaVar = zzb;
                    if (zzhbaVar == null) {
                        zzhbaVar = new zzgzc(zza);
                        zzb = zzhbaVar;
                    }
                }
                return zzhbaVar;
            }
        }
        return (byte) 1;
    }

    public final zzgxz zzf() {
        return this.zzd;
    }

    public final String zzg() {
        return this.zzc;
    }
}
