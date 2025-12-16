package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfpd extends zzgzh implements zzhat {
    private static final zzfpd zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgzp zzd = zzbG();
    private String zze = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfpd zzfpdVar = new zzfpd();
        zza = zzfpdVar;
        zzgzh.zzbZ(zzfpd.class, zzfpdVar);
    }

    private zzfpd() {
    }

    public static zzfpb zza() {
        return (zzfpb) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfpd zzfpdVar, String str) {
        str.getClass();
        zzfpdVar.zzc |= 1;
        zzfpdVar.zze = str;
    }

    public static /* synthetic */ void zzd(zzfpd zzfpdVar, int i) {
        zzgzp zzgzpVar = zzfpdVar.zzd;
        if (!zzgzpVar.zzc()) {
            zzfpdVar.zzd = zzgzh.zzbH(zzgzpVar);
        }
        zzfpdVar.zzd.zzi(2);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ࠞ\u0002ဈ\u0000\u0003ဈ\u0001\u0004ဈ\u0002", new Object[]{"zzc", "zzd", zzfpa.zza, "zze", "zzf", "zzg"});
            } else if (ordinal == 3) {
                return new zzfpd();
            } else {
                if (ordinal == 4) {
                    return new zzfpb(null);
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
                synchronized (zzfpd.class) {
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
