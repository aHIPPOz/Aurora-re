package com.google.android.gms.internal.ads;

import android.net.Uri;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.Collections;
import java.util.List;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzad {
    private String zza;
    private Uri zzb;
    private final zzae zzc = new zzae();
    private final List zzd = Collections.emptyList();
    private final zzfyq zze = zzfyq.zzn();
    private final zzai zzf = new zzai();
    private final zzam zzg = zzam.zza;

    public zzad() {
        zzfyq.zzn();
    }

    public final zzad zza(String str) {
        this.zza = str;
        return this;
    }

    public final zzad zzb(Uri uri) {
        this.zzb = uri;
        return this;
    }

    public final zzap zzc() {
        Uri uri = this.zzb;
        zzak zzakVar = uri != null ? new zzak(uri, null, null, null, this.zzd, null, this.zze, null, -9223372036854775807L, null) : null;
        String str = this.zza;
        if (str == null) {
            str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return new zzap(str, new zzag(this.zzc, null), zzakVar, new zzaj(this.zzf, null), zzat.zza, this.zzg, null);
    }
}
