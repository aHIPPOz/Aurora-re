package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzhcz extends zzgzh implements zzhat {
    private static final zzhcz zza;
    private static volatile zzhba zzb;
    private zzgzt zzc = zzbK();

    static {
        zzhcz zzhczVar = new zzhcz();
        zza = zzhczVar;
        zzgzh.zzbZ(zzhcz.class, zzhczVar);
    }

    private zzhcz() {
    }

    public static zzhcy zzc() {
        return (zzhcy) zza.zzaZ();
    }

    public static /* synthetic */ void zzf(zzhcz zzhczVar, zzhcx zzhcxVar) {
        zzhcxVar.getClass();
        zzgzt zzgztVar = zzhczVar.zzc;
        if (!zzgztVar.zzc()) {
            zzhczVar.zzc = zzgzh.zzbL(zzgztVar);
        }
        zzhczVar.zzc.add(zzhcxVar);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"zzc", zzhcx.class});
            } else if (ordinal == 3) {
                return new zzhcz();
            } else {
                if (ordinal == 4) {
                    return new zzhcy(null);
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
                synchronized (zzhcz.class) {
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
