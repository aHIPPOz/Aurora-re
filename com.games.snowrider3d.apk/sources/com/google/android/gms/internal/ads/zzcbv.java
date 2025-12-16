package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcbv {
    private long zzb;
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzV)).longValue());
    private boolean zzc = true;

    public final void zza(SurfaceTexture surfaceTexture, final zzcbg zzcbgVar) {
        if (zzcbgVar == null) {
            return;
        }
        long timestamp = surfaceTexture.getTimestamp();
        if (!this.zzc) {
            if (Math.abs(timestamp - this.zzb) < this.zza) {
                return;
            }
        }
        this.zzc = false;
        this.zzb = timestamp;
        zzfrw zzfrwVar = com.google.android.gms.ads.internal.util.zzs.zza;
        Objects.requireNonNull(zzcbgVar);
        zzfrwVar.post(new Runnable() { // from class: com.google.android.gms.internal.ads.zzcbu
            @Override // java.lang.Runnable
            public final void run() {
                zzcbg.this.zzk();
            }
        });
    }

    public final void zzb() {
        this.zzc = true;
    }
}
