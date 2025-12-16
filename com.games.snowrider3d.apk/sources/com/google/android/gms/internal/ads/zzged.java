package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzgcb;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzged extends zzgcb.zzf implements Runnable {
    private final Runnable zza;

    @Override // com.google.android.gms.internal.ads.zzgcb
    public final String zza() {
        String obj = this.zza.toString();
        return "task=[" + obj + "]";
    }

    public zzged(Runnable runnable) {
        runnable.getClass();
        this.zza = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.zza.run();
        } catch (Throwable th) {
            zzd(th);
            throw th;
        }
    }
}
