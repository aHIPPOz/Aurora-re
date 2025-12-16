package com.google.android.gms.internal.ads;

import android.content.Context;
import android.media.AudioManager;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzccf implements AudioManager.OnAudioFocusChangeListener {
    private final AudioManager zza;
    private final zzcce zzb;
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private float zzf = 1.0f;

    public zzccf(Context context, zzcce zzcceVar) {
        this.zza = (AudioManager) context.getSystemService("audio");
        this.zzb = zzcceVar;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i) {
        this.zzc = i > 0;
        this.zzb.zzn();
    }

    public final float zza() {
        float f = this.zze ? 0.0f : this.zzf;
        if (this.zzc) {
            return f;
        }
        return 0.0f;
    }

    public final void zzb() {
        this.zzd = true;
        zzf();
    }

    public final void zzc() {
        this.zzd = false;
        zzf();
    }

    public final void zzd(boolean z) {
        this.zze = z;
        zzf();
    }

    public final void zze(float f) {
        this.zzf = f;
        zzf();
    }

    private final void zzf() {
        boolean z = false;
        if (!this.zzd || this.zze || this.zzf <= 0.0f) {
            if (!this.zzc) {
                return;
            }
            AudioManager audioManager = this.zza;
            if (audioManager != null) {
                if (audioManager.abandonAudioFocus(this) == 0) {
                    z = true;
                }
                this.zzc = z;
            }
            this.zzb.zzn();
        } else if (this.zzc) {
        } else {
            AudioManager audioManager2 = this.zza;
            if (audioManager2 != null) {
                if (audioManager2.requestAudioFocus(this, 3, 2) == 1) {
                    z = true;
                }
                this.zzc = z;
            }
            this.zzb.zzn();
        }
    }
}
