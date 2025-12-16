package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.Key;
import java.util.Objects;
import javax.crypto.Mac;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzgwz extends ThreadLocal {
    final /* synthetic */ zzgxa zza;

    public zzgwz(zzgxa zzgxaVar) {
        Objects.requireNonNull(zzgxaVar);
        this.zza = zzgxaVar;
    }

    /* renamed from: zza */
    public final Mac initialValue() {
        String str;
        Key key;
        try {
            zzgwm zzgwmVar = zzgwm.zzb;
            zzgxa zzgxaVar = this.zza;
            str = zzgxaVar.zzb;
            Mac mac = (Mac) zzgwmVar.zza(str);
            key = zzgxaVar.zzc;
            mac.init(key);
            return mac;
        } catch (GeneralSecurityException e) {
            throw new IllegalStateException(e);
        }
    }
}
