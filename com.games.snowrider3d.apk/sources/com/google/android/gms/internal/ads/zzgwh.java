package com.google.android.gms.internal.ads;

import com.google.android.gms.security.ProviderInstaller;
import java.security.GeneralSecurityException;
import java.security.Provider;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzgwh implements zzgwk {
    private final zzgwu zza;

    @Override // com.google.android.gms.internal.ads.zzgwk
    public final Object zza(String str) throws GeneralSecurityException {
        for (Provider provider : zzgwm.zzb(ProviderInstaller.PROVIDER_NAME, "AndroidOpenSSL")) {
            try {
                return this.zza.zza(str, provider);
            } catch (Exception unused) {
            }
        }
        return this.zza.zza(str, null);
    }
}
