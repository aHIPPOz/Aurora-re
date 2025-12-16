package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgsv extends zzgzh implements zzhat {
    private static final zzgsv zza;
    private static volatile zzhba zzb;
    private int zzc;

    static {
        zzgsv zzgsvVar = new zzgsv();
        zza = zzgsvVar;
        zzgzh.zzbZ(zzgsv.class, zzgsvVar);
    }

    private zzgsv() {
    }

    public static zzgst zzb() {
        return (zzgst) zza.zzaZ();
    }

    public static zzgsv zzd() {
        return zza;
    }

    public final int zza() {
        return this.zzc;
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", new Object[]{"zzc"});
            } else if (ordinal == 3) {
                return new zzgsv();
            } else {
                if (ordinal == 4) {
                    return new zzgst(null);
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
                synchronized (zzgsv.class) {
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
