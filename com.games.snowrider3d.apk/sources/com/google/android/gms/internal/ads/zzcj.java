package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
import android.os.Build;
import android.os.Looper;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcj {
    private static AudioManager zza;

    public static int zza(AudioManager audioManager, zzch zzchVar) {
        return Build.VERSION.SDK_INT >= 26 ? audioManager.abandonAudioFocusRequest(zzchVar.zza()) : audioManager.abandonAudioFocus(zzchVar.zzb());
    }

    public static int zzb(AudioManager audioManager, zzch zzchVar) {
        if (Build.VERSION.SDK_INT >= 26) {
            return audioManager.requestAudioFocus(zzchVar.zza());
        }
        AudioManager.OnAudioFocusChangeListener zzb = zzchVar.zzb();
        zzchVar.zzc();
        return audioManager.requestAudioFocus(zzb, 3, 1);
    }

    public static synchronized AudioManager zzc(Context context) {
        synchronized (zzcj.class) {
            final Context applicationContext = context.getApplicationContext();
            if (applicationContext != null) {
                zza = null;
            }
            AudioManager audioManager = zza;
            if (audioManager != null) {
                return audioManager;
            }
            Looper myLooper = Looper.myLooper();
            if (myLooper != null && myLooper != Looper.getMainLooper()) {
                final zzdm zzdmVar = new zzdm(zzdj.zza);
                zzde.zza().execute(new Runnable() { // from class: com.google.android.gms.internal.ads.zzci
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzcj.zzd(applicationContext, zzdmVar);
                    }
                });
                zzdmVar.zzb();
                AudioManager audioManager2 = zza;
                if (audioManager2 != null) {
                    AudioManager audioManager3 = audioManager2;
                    return audioManager2;
                }
                throw null;
            }
            AudioManager audioManager4 = (AudioManager) applicationContext.getSystemService("audio");
            zza = audioManager4;
            if (audioManager4 != null) {
                AudioManager audioManager5 = audioManager4;
                return audioManager4;
            }
            throw null;
        }
    }

    public static /* synthetic */ void zzd(Context context, zzdm zzdmVar) {
        zza = (AudioManager) context.getSystemService("audio");
        zzdmVar.zzf();
    }
}
