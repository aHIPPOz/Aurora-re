package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.Arrays;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfvj {
    private final String zza;
    private final zzfvi zzb;
    private zzfvi zzc;

    public final String toString() {
        StringBuilder sb = new StringBuilder(32);
        sb.append(this.zza);
        sb.append('{');
        zzfvi zzfviVar = this.zzb.zzb;
        String str = RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        while (zzfviVar != null) {
            Object obj = zzfviVar.zza;
            sb.append(str);
            if (obj == null || !obj.getClass().isArray()) {
                sb.append(obj);
            } else {
                String deepToString = Arrays.deepToString(new Object[]{obj});
                sb.append((CharSequence) deepToString, 1, deepToString.length() - 1);
            }
            zzfviVar = zzfviVar.zzb;
            str = ", ";
        }
        sb.append('}');
        return sb.toString();
    }

    public final zzfvj zza(Object obj) {
        zzfvi zzfviVar = new zzfvi();
        this.zzc.zzb = zzfviVar;
        this.zzc = zzfviVar;
        zzfviVar.zza = obj;
        return this;
    }

    public /* synthetic */ zzfvj(String str, zzfvk zzfvkVar) {
        zzfvi zzfviVar = new zzfvi();
        this.zzb = zzfviVar;
        this.zzc = zzfviVar;
        str.getClass();
        this.zza = str;
    }
}
