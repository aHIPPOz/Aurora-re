package com.google.android.gms.internal.ads;

import android.os.RemoteException;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbxm extends zzbwr {
    private final String zza;
    private final int zzb;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbxm(com.google.android.gms.ads.rewarded.RewardItem r2) {
        /*
            r1 = this;
            if (r2 == 0) goto L7
            java.lang.String r0 = r2.getType()
            goto L9
        L7:
            java.lang.String r0 = ""
        L9:
            if (r2 == 0) goto L10
            int r2 = r2.getAmount()
            goto L11
        L10:
            r2 = 1
        L11:
            r1.<init>(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbxm.<init>(com.google.android.gms.ads.rewarded.RewardItem):void");
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final int zze() throws RemoteException {
        return this.zzb;
    }

    @Override // com.google.android.gms.internal.ads.zzbws
    public final String zzf() throws RemoteException {
        return this.zza;
    }

    public zzbxm(String str, int i) {
        this.zza = str;
        this.zzb = i;
    }
}
