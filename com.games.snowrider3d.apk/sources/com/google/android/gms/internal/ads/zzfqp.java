package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzfqp extends zzfqx {
    private String zza;
    private byte zzb;
    private int zzc;
    private int zzd;

    public final zzfqx zza(String str) {
        this.zza = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqx
    public final zzfqx zzb(boolean z) {
        this.zzb = (byte) 1;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqx
    public final zzfqy zzc() {
        if (this.zzb != 1 || this.zza == null || this.zzc == 0 || this.zzd == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.zza == null) {
                sb.append(" fileOwner");
            }
            if (this.zzb == 0) {
                sb.append(" hasDifferentDmaOwner");
            }
            if (this.zzc == 0) {
                sb.append(" fileChecks");
            }
            if (this.zzd == 0) {
                sb.append(" filePurpose");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new zzfqr(this.zza, false, this.zzc, null, null, this.zzd, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // com.google.android.gms.internal.ads.zzfqx
    public final zzfqx zzd(int i) {
        this.zzc = i;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfqx
    public final zzfqx zze(int i) {
        this.zzd = 1;
        return this;
    }
}
