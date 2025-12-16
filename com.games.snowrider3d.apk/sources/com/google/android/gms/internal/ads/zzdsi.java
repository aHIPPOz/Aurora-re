package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdsi {
    final /* synthetic */ zzdsj zza;
    private final Map zzb = new ConcurrentHashMap();

    public zzdsi(zzdsj zzdsjVar) {
        Objects.requireNonNull(zzdsjVar);
        this.zza = zzdsjVar;
    }

    public final zzdsi zzb(String str, String str2) {
        if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            this.zzb.put(str, str2);
        }
        return this;
    }

    public final zzdsi zzc(zzfca zzfcaVar) {
        zzb("aai", zzfcaVar.zzw);
        zzb("request_id", zzfcaVar.zzan);
        zzb("ad_format", zzfca.zza(zzfcaVar.zzb));
        return this;
    }

    public final zzdsi zzd(zzfcd zzfcdVar) {
        zzb("gqi", zzfcdVar.zzb);
        return this;
    }

    public final String zze() {
        zzdso zzdsoVar;
        zzdsoVar = this.zza.zza;
        return zzdsoVar.zzb(this.zzb);
    }

    public final void zzi() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsh
            @Override // java.lang.Runnable
            public final void run() {
                zzdsj.zzb(r0.zza).zze(zzdsi.this.zzb);
            }
        });
    }

    public final void zzj() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsf
            @Override // java.lang.Runnable
            public final void run() {
                zzdsj.zzb(r0.zza).zzg(zzdsi.this.zzb);
            }
        });
    }

    public final void zzk() {
        Executor executor;
        executor = this.zza.zzb;
        executor.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdsg
            @Override // java.lang.Runnable
            public final void run() {
                zzdsj.zzb(r0.zza).zzf(zzdsi.this.zzb);
            }
        });
    }
}
