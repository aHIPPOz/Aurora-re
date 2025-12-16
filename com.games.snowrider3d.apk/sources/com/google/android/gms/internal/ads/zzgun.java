package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgun extends zzgzh implements zzhat {
    private static final zzgun zza;
    private static volatile zzhba zzb;
    private int zzc;
    private zzgzt zzd = zzbK();

    static {
        zzgun zzgunVar = new zzgun();
        zza = zzgunVar;
        zzgzh.zzbZ(zzgun.class, zzgunVar);
    }

    private zzgun() {
    }

    public static zzguj zzc() {
        return (zzguj) zza.zzaZ();
    }

    public static zzgun zzg(InputStream inputStream, zzgyr zzgyrVar) throws IOException {
        return (zzgun) zzgzh.zzbu(zza, inputStream, zzgyrVar);
    }

    public static /* synthetic */ void zzi(zzgun zzgunVar, zzgul zzgulVar) {
        zzgulVar.getClass();
        zzgzt zzgztVar = zzgunVar.zzd;
        if (!zzgztVar.zzc()) {
            zzgunVar.zzd = zzgzh.zzbL(zzgztVar);
        }
        zzgunVar.zzd.add(zzgulVar);
    }

    public final int zza() {
        return this.zzd.size();
    }

    public final int zzb() {
        return this.zzc;
    }

    public final zzgul zzd(int i) {
        return (zzgul) this.zzd.get(i);
    }

    @Override // com.google.android.gms.internal.ads.zzgzh
    protected final Object zzdd(zzgzg zzgzgVar, Object obj, Object obj2) {
        zzhba zzhbaVar;
        int ordinal = zzgzgVar.ordinal();
        if (ordinal != 0) {
            if (ordinal == 2) {
                return zzbQ(zza, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", new Object[]{"zzc", "zzd", zzgul.class});
            } else if (ordinal == 3) {
                return new zzgun();
            } else {
                if (ordinal == 4) {
                    return new zzguj(null);
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
                synchronized (zzgun.class) {
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

    public final List zzh() {
        return this.zzd;
    }
}
