package com.google.android.gms.internal.measurement;

import com.google.android.gms.ads.RequestConfiguration;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
public enum zznc {
    INT(0),
    LONG(0L),
    FLOAT(Float.valueOf(0.0f)),
    DOUBLE(Double.valueOf(0.0d)),
    BOOLEAN(false),
    STRING(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED),
    BYTE_STRING(zzjb.zzb),
    ENUM(null),
    MESSAGE(null);
    
    private final Object zzk;

    zznc(Object obj) {
        this.zzk = obj;
    }
}
