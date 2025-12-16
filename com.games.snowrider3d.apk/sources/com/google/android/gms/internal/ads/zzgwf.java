package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgwf implements zzget {
    private final zzgli zza;
    private final byte[] zzb;

    private zzgwf(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        this.zza = new zzgli(bArr);
        this.zzb = bArr2;
    }

    public static zzget zzb(zzghy zzghyVar) throws GeneralSecurityException {
        return new zzgwf(zzghyVar.zze().zzd(zzgey.zza()), zzghyVar.zzb().zzd());
    }

    private final byte[] zzc(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length < 28) {
            throw new GeneralSecurityException("ciphertext too short");
        }
        byte[] copyOf = Arrays.copyOf(bArr, 12);
        return this.zza.zzb(ByteBuffer.wrap(bArr, 12, length - 12), copyOf, bArr2);
    }

    @Override // com.google.android.gms.internal.ads.zzget
    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3 = this.zzb;
        int length = bArr3.length;
        if (length == 0) {
            return zzc(bArr, bArr2);
        }
        if (!zzgpj.zzc(bArr3, bArr)) {
            throw new GeneralSecurityException("Decryption failed (OutputPrefix mismatch).");
        }
        return zzc(Arrays.copyOfRange(bArr, length, bArr.length), bArr2);
    }
}
