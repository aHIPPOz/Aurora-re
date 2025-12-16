package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgjo extends zzgfz {
    private final zzgjt zza;
    private final zzgxf zzb;
    private final zzgxe zzc;
    @Nullable
    private final Integer zzd;

    private zzgjo(zzgjt zzgjtVar, zzgxf zzgxfVar, zzgxe zzgxeVar, @Nullable Integer num) {
        this.zza = zzgjtVar;
        this.zzb = zzgxfVar;
        this.zzc = zzgxeVar;
        this.zzd = num;
    }

    public static zzgjo zzc(zzgjt zzgjtVar, zzgxf zzgxfVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxeVar;
        zzgjs zzc = zzgjtVar.zzc();
        zzgjs zzgjsVar = zzgjs.zzb;
        if (zzc != zzgjsVar && num == null) {
            String obj = zzgjtVar.zzc().toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjtVar.zzc() == zzgjsVar && num != null) {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
        } else {
            if (zzgxfVar.zza() != 32) {
                int zza = zzgxfVar.zza();
                throw new GeneralSecurityException("XAesGcmKey key must be constructed with key of length 32 bytes, not " + zza);
            }
            if (zzgjtVar.zzc() == zzgjsVar) {
                zzgxeVar = zzgnz.zza;
            } else if (zzgjtVar.zzc() != zzgjs.zza) {
                throw new IllegalStateException("Unknown Variant: ".concat(zzgjtVar.zzc().toString()));
            } else {
                zzgxeVar = zzgnz.zzb(num.intValue());
            }
            return new zzgjo(zzgjtVar, zzgxfVar, zzgxeVar, num);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzgfz, com.google.android.gms.internal.ads.zzgez
    public final /* synthetic */ zzgfm zza() {
        return this.zza;
    }

    @Override // com.google.android.gms.internal.ads.zzgfz
    public final zzgxe zzb() {
        return this.zzc;
    }

    public final zzgjt zzd() {
        return this.zza;
    }

    public final zzgxf zze() {
        return this.zzb;
    }

    @Nullable
    public final Integer zzf() {
        return this.zzd;
    }
}
