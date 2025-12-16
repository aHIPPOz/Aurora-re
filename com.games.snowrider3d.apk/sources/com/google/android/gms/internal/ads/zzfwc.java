package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
abstract class zzfwc extends zzfuu {
    final CharSequence zzb;
    int zzc = 0;
    int zzd = Integer.MAX_VALUE;

    public zzfwc(zzfwe zzfweVar, CharSequence charSequence) {
        this.zzb = charSequence;
    }

    @Override // com.google.android.gms.internal.ads.zzfuu
    protected final /* bridge */ /* synthetic */ Object zza() {
        int i;
        int i2 = this.zzc;
        while (true) {
            int i3 = this.zzc;
            if (i3 == -1) {
                zzb();
                return null;
            }
            int zzd = zzd(i3);
            if (zzd == -1) {
                zzd = this.zzb.length();
                this.zzc = -1;
                i = -1;
            } else {
                i = zzc(zzd);
                this.zzc = i;
            }
            if (i == i2) {
                int i4 = i + 1;
                this.zzc = i4;
                if (i4 > this.zzb.length()) {
                    this.zzc = -1;
                }
            } else {
                if (i2 < zzd) {
                    this.zzb.charAt(i2);
                }
                if (i2 < zzd) {
                    this.zzb.charAt(zzd - 1);
                }
                int i5 = this.zzd;
                if (i5 == 1) {
                    CharSequence charSequence = this.zzb;
                    int length = charSequence.length();
                    this.zzc = -1;
                    if (length > i2) {
                        charSequence.charAt(length - 1);
                    }
                    zzd = length;
                } else {
                    this.zzd = i5 - 1;
                }
                return this.zzb.subSequence(i2, zzd).toString();
            }
        }
    }

    abstract int zzc(int i);

    abstract int zzd(int i);
}
