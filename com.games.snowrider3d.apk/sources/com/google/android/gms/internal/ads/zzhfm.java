package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhfm extends zzgzh implements zzhat {
    private static final zzhfm zza;
    private static volatile zzhba zzb;
    private zzhfi zzC;
    private zzhdq zzE;
    private zzhdi zzG;
    private zzhej zzI;
    private int zzJ;
    private long zzM;
    private zzhfl zzN;
    private zzheo zzO;
    private zzhff zzQ;
    private int zzc;
    private int zzd;
    private int zze;
    private zzhdm zzi;
    private zzheu zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private zzhfb zzx;
    private boolean zzy;
    private byte zzR = 2;
    private String zzf = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzg = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private String zzh = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzt zzj = zzbK();
    private zzgzt zzk = zzbK();
    private String zzl = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzt zzo = zzgzh.zzbK();
    private String zzp = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgxz zzw = zzgxz.zzb;
    private String zzz = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzt zzA = zzgzh.zzbK();
    private zzgzt zzB = zzgzh.zzbK();
    private zzgzt zzD = zzbK();
    private String zzF = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
    private zzgzt zzH = zzbK();
    private zzgzt zzK = zzbK();
    private zzgzt zzL = zzbK();
    private String zzP = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;

    static {
        zzhfm zzhfmVar = new zzhfm();
        zza = zzhfmVar;
        zzgzh.zzbZ(zzhfm.class, zzhfmVar);
    }

    private zzhfm() {
    }

    public static zzhdk zzc() {
        return (zzhdk) zza.zzaZ();
    }

    public static /* synthetic */ void zzi(zzhfm zzhfmVar, Iterable iterable) {
        zzgzt zzgztVar = zzhfmVar.zzA;
        if (!zzgztVar.zzc()) {
            zzhfmVar.zzA = zzgzh.zzbL(zzgztVar);
        }
        zzgxi.zzaQ(iterable, zzhfmVar.zzA);
    }

    public static /* synthetic */ void zzj(zzhfm zzhfmVar, Iterable iterable) {
        zzgzt zzgztVar = zzhfmVar.zzB;
        if (!zzgztVar.zzc()) {
            zzhfmVar.zzB = zzgzh.zzbL(zzgztVar);
        }
        zzgxi.zzaQ(iterable, zzhfmVar.zzB);
    }

    public static /* synthetic */ void zzk(zzhfm zzhfmVar, zzhez zzhezVar) {
        zzhezVar.getClass();
        zzgzt zzgztVar = zzhfmVar.zzj;
        if (!zzgztVar.zzc()) {
            zzhfmVar.zzj = zzgzh.zzbL(zzgztVar);
        }
        zzhfmVar.zzj.add(zzhezVar);
    }

    public static /* synthetic */ void zzl(zzhfm zzhfmVar) {
        zzhfmVar.zzc &= -65;
        zzhfmVar.zzl = zza.zzl;
    }

    public static /* synthetic */ void zzm(zzhfm zzhfmVar, String str) {
        zzhfmVar.zzc |= 64;
        zzhfmVar.zzl = str;
    }

    public static /* synthetic */ void zzn(zzhfm zzhfmVar, zzhfb zzhfbVar) {
        zzhfbVar.getClass();
        zzhfmVar.zzx = zzhfbVar;
        zzhfmVar.zzc |= 8192;
    }

    public static /* synthetic */ void zzo(zzhfm zzhfmVar, zzhdm zzhdmVar) {
        zzhdmVar.getClass();
        zzhfmVar.zzi = zzhdmVar;
        zzhfmVar.zzc |= 32;
    }

    public static /* synthetic */ void zzp(zzhfm zzhfmVar, String str) {
        zzhfmVar.zzc |= 8;
        zzhfmVar.zzg = str;
    }

    public static /* synthetic */ void zzq(zzhfm zzhfmVar, zzheu zzheuVar) {
        zzheuVar.getClass();
        zzhfmVar.zzm = zzheuVar;
        zzhfmVar.zzc |= 128;
    }

    public static /* synthetic */ void zzr(zzhfm zzhfmVar, String str) {
        zzhfmVar.zzc |= 4;
        zzhfmVar.zzf = str;
    }

    public static /* synthetic */ void zzs(zzhfm zzhfmVar, int i) {
        zzhfmVar.zzd = i - 1;
        zzhfmVar.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        switch (zzgzgVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzR);
            case 1:
                this.zzR = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001$\u0000\u0001\u0001$$\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019$ဉ\u001a", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", zzhez.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", zzhev.zza, "zze", zzhdj.zza, "zzi", "zzl", "zzm", "zzw", "zzk", zzhfq.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", zzhfw.class, "zzE", "zzF", "zzG", "zzH", zzhdu.class, "zzI", "zzJ", zzhfg.zza, "zzK", zzhem.class, "zzL", zzher.class, "zzM", "zzN", "zzO", "zzP", "zzQ"});
            case 3:
                return new zzhfm();
            case 4:
                return new zzhdk(null);
            case 5:
                return zza;
            case 6:
                zzhba zzhbaVar2 = zzb;
                if (zzhbaVar2 != null) {
                    return zzhbaVar2;
                }
                synchronized (zzhfm.class) {
                    zzhbaVar = zzb;
                    if (zzhbaVar == null) {
                        zzhbaVar = new zzgzc(zza);
                        zzb = zzhbaVar;
                    }
                }
                return zzhbaVar;
            default:
                throw null;
        }
    }

    public final String zzf() {
        return this.zzl;
    }

    public final String zzg() {
        return this.zzf;
    }

    public final List zzh() {
        return this.zzj;
    }
}
