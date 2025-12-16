package com.google.android.gms.internal.ads;

import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Handler;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzch {
    private final AudioManager.OnAudioFocusChangeListener zzb;
    private final Handler zzc;
    private final zze zzd;
    private final Object zzf;
    private final int zza = 1;
    private final boolean zze = false;

    public zzch(int i, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Handler handler, zze zzeVar, boolean z) {
        this.zzc = handler;
        this.zzd = zzeVar;
        if (Build.VERSION.SDK_INT < 26) {
            this.zzb = new zzcg(onAudioFocusChangeListener, handler);
        } else {
            this.zzb = onAudioFocusChangeListener;
        }
        this.zzf = Build.VERSION.SDK_INT >= 26 ? new AudioFocusRequest.Builder(1).setAudioAttributes(zzeVar.zza().zza).setWillPauseWhenDucked(false).setOnAudioFocusChangeListener(onAudioFocusChangeListener, handler).build() : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzch)) {
            return false;
        }
        zzch zzchVar = (zzch) obj;
        int i = zzchVar.zza;
        boolean z = zzchVar.zze;
        return Objects.equals(this.zzb, zzchVar.zzb) && Objects.equals(this.zzc, zzchVar.zzc) && Objects.equals(this.zzd, zzchVar.zzd);
    }

    public final int hashCode() {
        return Objects.hash(1, this.zzb, this.zzc, this.zzd, false);
    }

    public final AudioManager.OnAudioFocusChangeListener zzb() {
        return this.zzb;
    }

    public final zze zzc() {
        return this.zzd;
    }

    public final AudioFocusRequest zza() {
        Object obj = this.zzf;
        obj.getClass();
        return (AudioFocusRequest) obj;
    }
}
