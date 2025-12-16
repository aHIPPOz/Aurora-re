package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
final class zzfvy extends zzfwc {
    final /* synthetic */ zzfva zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzfvy(zzfwe zzfweVar, CharSequence charSequence, zzfva zzfvaVar) {
        super(zzfweVar, charSequence);
        this.zza = zzfvaVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    final int zzc(int i) {
        return i + 1;
    }

    @Override // com.google.android.gms.internal.ads.zzfwc
    final int zzd(int i) {
        CharSequence charSequence = this.zzb;
        int length = charSequence.length();
        zzfvp.zzb(i, length, "index");
        while (i < length) {
            if (this.zza.zzb(charSequence.charAt(i))) {
                return i;
            }
            i++;
        }
        return -1;
    }
}
