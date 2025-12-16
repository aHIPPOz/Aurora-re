package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.HashMap;
import java.util.Map;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgpg {
    private final Map zza;
    private final Map zzb;
    private final Map zzc;
    private final Map zzd;

    public /* synthetic */ zzgpg(zzgpc zzgpcVar, zzgpf zzgpfVar) {
        Map map;
        Map map2;
        Map map3;
        Map map4;
        map = zzgpcVar.zza;
        this.zza = new HashMap(map);
        map2 = zzgpcVar.zzb;
        this.zzb = new HashMap(map2);
        map3 = zzgpcVar.zzc;
        this.zzc = new HashMap(map3);
        map4 = zzgpcVar.zzd;
        this.zzd = new HashMap(map4);
    }

    public final zzgez zza(zzgpb zzgpbVar, @Nullable zzgfn zzgfnVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null);
        Map map = this.zzb;
        if (!map.containsKey(zzgpdVar)) {
            String obj = zzgpdVar.toString();
            throw new GeneralSecurityException("No Key Parser for requested key type " + obj + " available");
        }
        return ((zzgmt) map.get(zzgpdVar)).zza(zzgpbVar, zzgfnVar);
    }

    public final zzgfm zzb(zzgpb zzgpbVar) throws GeneralSecurityException {
        zzgpd zzgpdVar = new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null);
        Map map = this.zzd;
        if (!map.containsKey(zzgpdVar)) {
            String obj = zzgpdVar.toString();
            throw new GeneralSecurityException("No Parameters Parser for requested key type " + obj + " available");
        }
        return ((zzgod) map.get(zzgpdVar)).zza(zzgpbVar);
    }

    public final zzgpb zzc(zzgez zzgezVar, Class cls, @Nullable zzgfn zzgfnVar) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgezVar.getClass(), cls, null);
        Map map = this.zza;
        if (!map.containsKey(zzgpeVar)) {
            String obj = zzgpeVar.toString();
            throw new GeneralSecurityException("No Key serializer for " + obj + " available");
        }
        return ((zzgmx) map.get(zzgpeVar)).zza(zzgezVar, zzgfnVar);
    }

    public final zzgpb zzd(zzgfm zzgfmVar, Class cls) throws GeneralSecurityException {
        zzgpe zzgpeVar = new zzgpe(zzgfmVar.getClass(), cls, null);
        Map map = this.zzc;
        if (!map.containsKey(zzgpeVar)) {
            String obj = zzgpeVar.toString();
            throw new GeneralSecurityException("No Key Format serializer for " + obj + " available");
        }
        return ((zzgoh) map.get(zzgpeVar)).zza(zzgfmVar);
    }

    public final boolean zzi(zzgpb zzgpbVar) {
        return this.zzb.containsKey(new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null));
    }

    public final boolean zzj(zzgpb zzgpbVar) {
        return this.zzd.containsKey(new zzgpd(zzgpbVar.getClass(), zzgpbVar.zzd(), null));
    }
}
