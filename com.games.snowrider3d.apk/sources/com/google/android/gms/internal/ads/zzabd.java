package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.Surface;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzabd extends Surface {
    private static int zzb;
    private static boolean zzc;
    public final boolean zza;
    private final zzabb zzd;
    private boolean zze;

    public /* synthetic */ zzabd(zzabb zzabbVar, SurfaceTexture surfaceTexture, boolean z, zzabc zzabcVar) {
        super(surfaceTexture);
        this.zzd = zzabbVar;
        this.zza = z;
    }

    public static zzabd zza(Context context, boolean z) {
        int i = 0;
        boolean z2 = true;
        if (z && !zzb(context)) {
            z2 = false;
        }
        zzdd.zzf(z2);
        zzabb zzabbVar = new zzabb();
        if (z) {
            i = zzb;
        }
        return zzabbVar.zza(i);
    }

    public static synchronized boolean zzb(Context context) {
        int i;
        int i2;
        synchronized (zzabd.class) {
            if (!zzc) {
                if (zzdr.zzd(context)) {
                    i2 = zzdr.zze() ? 1 : 2;
                } else {
                    i2 = 0;
                }
                zzb = i2;
                zzc = true;
            }
            i = zzb;
        }
        return i != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        zzabb zzabbVar = this.zzd;
        synchronized (zzabbVar) {
            if (!this.zze) {
                zzabbVar.zzb();
                this.zze = true;
            }
        }
    }
}
