package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfib extends zzgzh implements zzhat {
    private static final zzfib zza;
    private static volatile zzhba zzb;
    private int zzB;
    private int zzF;
    private int zzG;
    private int zzH;
    private long zzI;
    private boolean zzJ;
    private boolean zzK;
    private boolean zzL;
    private int zzM;
    private int zzT;
    private int zzU;
    private int zzW;
    private long zzag;
    private int zzai;
    private int zzaj;
    private int zzak;
    private zzfji zzal;
    private int zzam;
    private zzfjc zzan;
    private zzfij zzao;
    private zzfip zzap;
    private zzfim zzaq;
    private zzfjf zzar;
    private zzfiw zzas;
    private zzfit zzat;
    private zzhcs zzau;
    private zzfjl zzaw;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzp zzj = zzbG();
    private String zzu = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzv = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzw = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzx = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzy = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzA = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzC = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzD = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzs zzE = zzbI();
    private String zzN = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzO = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzP = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzQ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzR = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzS = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzV = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzX = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzY = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzZ = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzaa = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzab = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzac = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzad = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzae = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzaf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzah = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzav = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzfib zzfibVar = new zzfib();
        zza = zzfibVar;
        zzgzh.zzbZ(zzfib.class, zzfibVar);
    }

    private zzfib() {
    }

    public static /* synthetic */ void zzA(zzfib zzfibVar, int i) {
        if (i != 1) {
            zzfibVar.zzF = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    public static zzfhy zza() {
        return (zzfhy) zza.zzaZ();
    }

    public static /* synthetic */ void zzc(zzfib zzfibVar, Iterable iterable) {
        zzgzs zzgzsVar = zzfibVar.zzE;
        if (!zzgzsVar.zzc()) {
            zzfibVar.zzE = zzgzh.zzbJ(zzgzsVar);
        }
        zzgxi.zzaQ(iterable, zzfibVar.zzE);
    }

    public static /* synthetic */ void zzd(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzy = str;
    }

    public static /* synthetic */ void zzf(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzN = str;
    }

    public static /* synthetic */ void zzg(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzaf = str;
    }

    public static /* synthetic */ void zzh(zzfib zzfibVar, zzhcs zzhcsVar) {
        zzfibVar.zzau = zzhcsVar;
        zzfibVar.zzc |= 256;
    }

    public static /* synthetic */ void zzj(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzO = str;
    }

    public static /* synthetic */ void zzl(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzaa = str;
    }

    public static /* synthetic */ void zzo(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzA = str;
    }

    public static /* synthetic */ void zzp(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzac = str;
    }

    public static /* synthetic */ void zzs(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzu = str;
    }

    public static /* synthetic */ void zzt(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzae = str;
    }

    public static /* synthetic */ void zzx(zzfib zzfibVar, String str) {
        str.getClass();
        zzfibVar.zzad = str;
    }

    public static /* synthetic */ void zzy(zzfib zzfibVar, int i) {
        if (i != 1) {
            zzfibVar.zzM = i - 2;
            return;
        }
        throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0004D\u0000\u0001\u0001DD\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000:ဉ\u0005;ဉ\u0006<Ȉ=ဉ\u0007>ဉ\b?Ȉ@ȈAဉ\tB\u0007C\u0007D\u0007", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzy", "zzA", "zzB", "zzF", "zzH", "zzI", "zzM", "zzN", "zzO", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzv", "zzw", "zzC", "zzD", "zzE", "zzP", "zzQ", "zzY", "zzag", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzaj", "zzak", "zze", "zzan", "zzao", "zzT", "zzV", "zzS", "zzR", "zzam", "zzU", "zzW", "zzX", "zzz", "zzap", "zzG", "zzaq", "zzah", "zzai", "zzal", "zzar", "zzas", "zzZ", "zzat", "zzau", "zzav", "zzx", "zzaw", "zzJ", "zzK", "zzL"});
            } else if (ordinal == 3) {
                return new zzfib();
            } else {
                if (ordinal == 4) {
                    return new zzfhy(null);
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
                synchronized (zzfib.class) {
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
