package com.google.android.gms.internal.ads;

import android.content.Context;
import android.database.ContentObserver;
import android.media.AudioManager;
import android.os.Handler;
import android.provider.Settings;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfme extends ContentObserver {
    private final Handler zza;
    private final Context zzb;
    private final AudioManager zzc;
    private final AtomicReference zzd = new AtomicReference(Float.valueOf(-1.0f));
    private final AtomicBoolean zze = new AtomicBoolean(false);
    private final ExecutorService zzf = Executors.newSingleThreadExecutor();
    private final zzfmq zzg;

    public zzfme(Handler handler, Context context, zzfma zzfmaVar, zzfmq zzfmqVar) {
        super(handler);
        this.zza = handler;
        this.zzb = context;
        this.zzc = (AudioManager) context.getSystemService("audio");
        this.zzg = zzfmqVar;
    }

    public static /* bridge */ /* synthetic */ float zza(zzfme zzfmeVar) {
        AudioManager audioManager = zzfmeVar.zzc;
        int streamVolume = audioManager.getStreamVolume(3);
        int streamMaxVolume = audioManager.getStreamMaxVolume(3);
        float f = 0.0f;
        if (streamMaxVolume > 0) {
            if (streamVolume <= 0) {
                return 0.0f;
            }
            f = streamVolume / streamMaxVolume;
            if (f > 1.0f) {
                return 1.0f;
            }
        }
        return f;
    }

    private final void zzh() {
        this.zzf.submit(new zzfmd(this));
    }

    @Override // android.database.ContentObserver
    public final void onChange(boolean z) {
        if (this.zze.getAndSet(true)) {
            return;
        }
        zzh();
    }

    public final void zze() {
        zzh();
        this.zzb.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, this);
    }

    public final void zzf() {
        this.zzb.getContentResolver().unregisterContentObserver(this);
    }
}
