package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhdw extends zzgzh implements zzhat {
    private static final zzhdw zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgxz zzd;
    private zzgxz zze;
    private byte zzf = 2;

    static {
        zzhdw zzhdwVar = new zzhdw();
        zza = zzhdwVar;
        zzgzh.zzbZ(zzhdw.class, zzhdwVar);
    }

    private zzhdw() {
        zzgxz zzgxzVar = zzgxz.zzb;
        this.zzd = zzgxzVar;
        this.zze = zzgxzVar;
    }

    public static zzhdv zzc() {
        return (zzhdv) zza.zzaZ();
    }

    public static /* bridge */ /* synthetic */ zzhdw zzd() {
        return zza;
    }

    public static /* synthetic */ void zzf(zzhdw zzhdwVar, zzgxz zzgxzVar) {
        zzhdwVar.zzc |= 1;
        zzhdwVar.zzd = zzgxzVar;
    }

    public static /* synthetic */ void zzg(zzhdw zzhdwVar, zzgxz zzgxzVar) {
        zzhdwVar.zzc |= 2;
        zzhdwVar.zze = zzgxzVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        switch (zzgzgVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.zzf);
            case 1:
                this.zzf = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case 2:
                return zzbQ(zza, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001ᔊ\u0000\u0002ည\u0001", new Object[]{"zzc", "zzd", "zze"});
            case 3:
                return new zzhdw();
            case 4:
                return new zzhdv(null);
            case 5:
                return zza;
            case 6:
                zzhba zzhbaVar2 = zzb;
                if (zzhbaVar2 != null) {
                    return zzhbaVar2;
                }
                synchronized (zzhdw.class) {
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
}
