package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzcda extends zzarm {
    static final zzcda zzb = new zzcda();

    zzcda() {
    }

    @Override // com.google.android.gms.internal.ads.zzarm
    public final zzarq zza(String str, byte[] bArr, String str2) {
        if ("moov".equals(str)) {
            return new zzars();
        }
        if ("mvhd".equals(str)) {
            return new zzart();
        }
        return new zzaru(str);
    }
}
