package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzglm implements zzget {
    private final zzget zza;
    private final byte[] zzb;

    private zzglm(zzget zzgetVar, byte[] bArr) {
        this.zza = zzgetVar;
        int length = bArr.length;
        if (length == 0 || length == 5) {
            this.zzb = bArr;
            return;
        }
        throw new IllegalArgumentException("identifier has an invalid length");
    }

    public static zzget zzb(zzgnd zzgndVar) throws GeneralSecurityException {
        byte[] bArr;
        zzgox zzb = zzgndVar.zzb(zzgey.zza());
        zzget zzgetVar = (zzget) zzgmp.zzc().zza(zzb.zzg(), zzget.class).zzc(zzb.zze());
        zzgvf zzc = zzb.zzc();
        int ordinal = zzc.ordinal();
        if (ordinal == 1) {
            bArr = zzgnz.zzb(zzgndVar.zzd().intValue()).zzd();
        } else {
            if (ordinal != 2) {
                if (ordinal == 3) {
                    bArr = zzgnz.zza.zzd();
                } else if (ordinal != 4) {
                    throw new GeneralSecurityException("unknown output prefix type ".concat(String.valueOf(String.valueOf(zzc))));
                }
            }
            bArr = zzgnz.zza(zzgndVar.zzd().intValue()).zzd();
        }
        return new zzglm(zzgetVar, bArr);
    }

    public static zzget zzc(zzget zzgetVar, zzgxe zzgxeVar) {
        return new zzglm(zzgetVar, zzgxeVar.zzd());
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        if (bArr3.length == 0) {
            return this.zza.zza(bArr, bArr2);
        }
        if (!zzgpj.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("wrong prefix");
        }
        return this.zza.zza(Arrays.copyOfRange(bArr, 5, bArr.length), bArr2);
    }
}
