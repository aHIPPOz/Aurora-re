package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfph extends zzgzh implements zzhat {
    private static final zzfph zza;
    private static volatile zzhba zzb;
    private int zzc;
    private int zzd;
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzfpd zzg;

    static {
        zzfph zzfphVar = new zzfph();
        zza = zzfphVar;
        zzgzh.zzbZ(zzfph.class, zzfphVar);
    }

    private zzfph() {
    }

    public static zzfpe zza() {
        return (zzfpe) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzfph zzb() {
        return zza;
    }

    public static /* synthetic */ void zzc(zzfph zzfphVar, String str) {
        str.getClass();
        zzfphVar.zzc |= 2;
        zzfphVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfph zzfphVar, zzfpd zzfpdVar) {
        zzfpdVar.getClass();
        zzfphVar.zzg = zzfpdVar;
        zzfphVar.zzc |= 8;
    }

    public static /* synthetic */ void zzf(zzfph zzfphVar, int i) {
        zzfphVar.zzd = 1;
        zzfphVar.zzc = 1 | zzfphVar.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001᠌\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဉ\u0003", new Object[]{"zzc", "zzd", zzfpf.zza, "zze", "zzf", "zzg"});
            } else if (ordinal == 3) {
                return new zzfph();
            } else {
                if (ordinal == 4) {
                    return new zzfpe(null);
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
                synchronized (zzfph.class) {
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
}
