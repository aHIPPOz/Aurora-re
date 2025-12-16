package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgrn implements zzgfl {
    private zzgrn(zzgfl zzgflVar, zzgvf zzgvfVar, byte[] bArr) {
    }

    public static zzgfl zza(zzgnd zzgndVar) throws GeneralSecurityException {
        byte[] bArr;
        zzgox zzb = zzgndVar.zzb(zzgey.zza());
        zzgfl zzgflVar = (zzgfl) zzgmp.zzc().zza(zzb.zzg(), zzgfl.class).zzc(zzb.zze());
        zzgvf zzc = zzb.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal == 1) {
            bArr = zzgnz.zzb(zzgndVar.zzd().intValue()).zzd();
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = zzgnz.zza.zzd();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type");
                }
            }
            bArr = zzgnz.zza(zzgndVar.zzd().intValue()).zzd();
        }
        return new zzgrn(zzgflVar, zzc, bArr);
    }
}
