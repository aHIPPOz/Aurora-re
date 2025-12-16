package com.google.android.gms.internal.nearby;

import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public abstract class zzth {
    private static final zzth zza = new zztd("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');
    private static final zzth zzb = new zztd("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');
    private static final zzth zzc = new zztg("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');
    private static final zzth zzd = new zztg("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    private static final zzth zze = new zztc("base16()", "0123456789ABCDEF");

    public static zzth zzh() {
        return zze;
    }

    public abstract int zza(byte[] bArr, CharSequence charSequence) throws zzte;

    public abstract void zzb(Appendable appendable, byte[] bArr, int i, int i2) throws IOException;

    public abstract int zzc(int i);

    public abstract int zzd(int i);

    public abstract zzth zze(String str, int i);

    public CharSequence zzf(CharSequence charSequence) {
        throw null;
    }

    public final String zzi(byte[] bArr, int i, int i2) {
        zzsg.zzg(0, i2, bArr.length);
        StringBuilder sb = new StringBuilder(zzd(i2));
        try {
            zzb(sb, bArr, 0, i2);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    public final byte[] zzj(CharSequence charSequence) {
        try {
            CharSequence zzf = zzf(charSequence);
            int zzc2 = zzc(zzf.length());
            byte[] bArr = new byte[zzc2];
            int zza2 = zza(bArr, zzf);
            if (zza2 == zzc2) {
                return bArr;
            }
            byte[] bArr2 = new byte[zza2];
            System.arraycopy(bArr, 0, bArr2, 0, zza2);
            return bArr2;
        } catch (zzte e) {
            throw new IllegalArgumentException(e);
        }
    }
}
