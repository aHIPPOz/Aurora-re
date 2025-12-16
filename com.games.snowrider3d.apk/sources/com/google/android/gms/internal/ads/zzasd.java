package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzasd extends zzgzh implements zzhat {
    private static final zzasd zza;
    private static volatile zzhba zzb;
    private int zzc;
    private long zze;
    private long zzi;
    private long zzj;
    private long zzl;
    private int zzp;
    private String zzd = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzk = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzm = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzn = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzt zzo = zzbK();

    static {
        zzasd zzasdVar = new zzasd();
        zza = zzasdVar;
        zzgzh.zzbZ(zzasd.class, zzasdVar);
    }

    private zzasd() {
    }

    public static zzarz zza() {
        return (zzarz) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzasd zzasdVar, String str) {
        str.getClass();
        zzasdVar.zzc |= 1;
        zzasdVar.zzd = str;
    }

    public static /* synthetic */ void zzd(zzasd zzasdVar, String str) {
        zzasdVar.zzc |= 16;
        zzasdVar.zzh = str;
    }

    public static /* synthetic */ void zzf(zzasd zzasdVar, String str) {
        zzasdVar.zzc |= 1024;
        zzasdVar.zzn = str;
    }

    public static /* synthetic */ void zzg(zzasd zzasdVar, String str) {
        str.getClass();
        zzasdVar.zzc |= 8;
        zzasdVar.zzg = str;
    }

    public static /* synthetic */ void zzh(zzasd zzasdVar, long j) {
        zzasdVar.zzc |= 2;
        zzasdVar.zze = j;
    }

    public static /* synthetic */ void zzi(zzasd zzasdVar, String str) {
        str.getClass();
        zzasdVar.zzc |= 4;
        zzasdVar.zzf = str;
    }

    public static /* synthetic */ void zzj(zzasd zzasdVar, int i) {
        zzasdVar.zzp = i - 1;
        zzasdVar.zzc |= 2048;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0004\r\u0000\u0001\u0001\r\r\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဂ\u0001\u0003ဈ\u0002\u0004ဈ\u0003\u0005ဈ\u0004\u0006ဂ\u0005\u0007ဂ\u0006\bဈ\u0007\tဂ\b\nဈ\t\u000bဈ\n\f\u001b\r᠌\u000b", new Object[]{"zzc", "zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", "zzn", "zzo", zzasb.class, "zzp", zzasc.zza});
            } else if (ordinal == 3) {
                return new zzasd();
            } else {
                if (ordinal == 4) {
                    return new zzarz(null);
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
                synchronized (zzasd.class) {
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
