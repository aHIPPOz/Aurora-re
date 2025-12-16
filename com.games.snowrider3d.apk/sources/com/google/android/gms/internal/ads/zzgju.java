package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgju extends zzgfz {
    private final zzgka zza;
    private final zzgxf zzb;
    private final zzgxe zzc;
    @Nullable
    private final Integer zzd;

    private zzgju(zzgka zzgkaVar, zzgxf zzgxfVar, zzgxe zzgxeVar, @Nullable Integer num) {
        this.zza = zzgkaVar;
        this.zzb = zzgxfVar;
        this.zzc = zzgxeVar;
        this.zzd = num;
    }

    public static zzgju zzc(zzgjz zzgjzVar, zzgxf zzgxfVar, @Nullable Integer num) throws GeneralSecurityException {
        zzgxe zzgxeVar;
        zzgjz zzgjzVar2 = zzgjz.zzc;
        if (zzgjzVar != zzgjzVar2 && num == null) {
            String obj = zzgjzVar.toString();
            throw new GeneralSecurityException("For given Variant " + obj + " the value of idRequirement must be non-null");
        } else if (zzgjzVar != zzgjzVar2 || num == null) {
            if (zzgxfVar.zza() == 32) {
                zzgka zzc = zzgka.zzc(zzgjzVar);
                if (zzc.zzb() == zzgjzVar2) {
                    zzgxeVar = zzgnz.zza;
                } else if (zzc.zzb() == zzgjz.zzb) {
                    zzgxeVar = zzgnz.zza(num.intValue());
                } else if (zzc.zzb() == zzgjz.zza) {
                    zzgxeVar = zzgnz.zzb(num.intValue());
                } else {
                    throw new IllegalStateException("Unknown Variant: ".concat(zzc.zzb().toString()));
                }
                return new zzgju(zzc, zzgxfVar, zzgxeVar, num);
            }
            int zza = zzgxfVar.zza();
            throw new GeneralSecurityException("XChaCha20Poly1305 key must be constructed with key of length 32 bytes, not " + zza);
        } else {
            throw new GeneralSecurityException("For given Variant NO_PREFIX the value of idRequirement must be null");
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

    public final zzgka zzd() {
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
