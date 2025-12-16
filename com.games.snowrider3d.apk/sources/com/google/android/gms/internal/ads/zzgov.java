package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgov {
    private final Map zza;
    private final Map zzb;

    public /* synthetic */ zzgov(zzgos zzgosVar, zzgou zzgouVar) {
        Map map;
        Map map2;
        map = zzgosVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgosVar.zzb;
        this.zzb = new HashMap(map2);
    }

    public static zzgos zza() {
        return new zzgos(null);
    }

    public final Object zzb(zzgez zzgezVar, Class cls) throws GeneralSecurityException {
        zzgot zzgotVar = new zzgot(zzgezVar.getClass(), cls, null);
        Map map = this.zza;
        if (!map.containsKey(zzgotVar)) {
            String obj = zzgotVar.toString();
            throw new GeneralSecurityException("No PrimitiveConstructor for " + obj + " available, see https://developers.google.com/tink/faq/registration_errors");
        }
        return ((zzgoq) map.get(zzgotVar)).zza(zzgezVar);
    }

    public final Object zzc(zzgmy zzgmyVar, zzgnh zzgnhVar, Class cls) throws GeneralSecurityException {
        Map map = this.zzb;
        if (!map.containsKey(cls)) {
            throw new GeneralSecurityException("No wrapper found for ".concat(cls.toString()));
        }
        zzgow zzgowVar = (zzgow) map.get(cls);
        return zzgowVar.zze(zzgmyVar, zzgnhVar, new zzgor(this, zzgowVar));
    }
}
