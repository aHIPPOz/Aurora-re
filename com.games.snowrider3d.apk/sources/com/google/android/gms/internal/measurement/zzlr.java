package com.google.android.gms.internal.measurement;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public final class zzlr {
    private static final zzlr zza = new zzlr();
    private final ConcurrentMap zzc = new ConcurrentHashMap();
    private final zzlv zzb = new zzlb();

    private zzlr() {
    }

    public static zzlr zza() {
        return zza;
    }

    public final zzlu zzb(Class cls) {
        zzkk.zzf(cls, "messageType");
        zzlu zzluVar = (zzlu) this.zzc.get(cls);
        if (zzluVar == null) {
            zzlu zza2 = this.zzb.zza(cls);
            zzkk.zzf(cls, "messageType");
            zzkk.zzf(zza2, "schema");
            zzlu zzluVar2 = (zzlu) this.zzc.putIfAbsent(cls, zza2);
            return zzluVar2 == null ? zza2 : zzluVar2;
        }
        return zzluVar;
    }
}
