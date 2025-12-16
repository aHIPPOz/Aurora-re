package com.google.android.play.core.review.internal;

import android.os.IBinder;
import java.util.List;
/* compiled from: com.google.android.play:review@@2.0.2 */
/* loaded from: classes2.dex */
final class zzp extends zzj {
    final /* synthetic */ IBinder zza;
    final /* synthetic */ zzr zzb;

    public zzp(zzr zzrVar, IBinder iBinder) {
        this.zza = iBinder;
        this.zzb = zzrVar;
    }

    @Override // com.google.android.play.core.review.internal.zzj
    public final void zza() {
        List<Runnable> list;
        List list2;
        this.zzb.zza.zzn = zze.zzb(this.zza);
        zzt.zzq(this.zzb.zza);
        this.zzb.zza.zzh = false;
        list = this.zzb.zza.zze;
        for (Runnable runnable : list) {
            runnable.run();
        }
        list2 = this.zzb.zza.zze;
        list2.clear();
    }
}
