package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public class zzaz extends IOException {
    public final boolean zza;
    public final int zzb;

    public zzaz(String str, Throwable th, boolean z, int i) {
        super(str, th);
        this.zza = z;
        this.zzb = i;
    }

    public static zzaz zza(String str, Throwable th) {
        return new zzaz(str, th, true, 1);
    }

    public static zzaz zzb(String str, Throwable th) {
        return new zzaz(str, th, true, 0);
    }

    public static zzaz zzc(String str) {
        return new zzaz(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String message = super.getMessage();
        String concat = message != null ? message.concat(" ") : RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        boolean z = this.zza;
        int i = this.zzb;
        return concat + "{contentIsMalformed=" + z + ", dataType=" + i + "}";
    }
}
