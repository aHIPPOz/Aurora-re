package com.google.android.gms.internal.consent_sdk;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public final class zzdm implements zzdo {
    private zzdr zza;

    public static void zzb(zzdr zzdrVar, zzdr zzdrVar2) {
        zzdm zzdmVar = (zzdm) zzdrVar;
        if (zzdmVar.zza == null) {
            zzdmVar.zza = zzdrVar2;
            return;
        }
        throw new IllegalStateException();
    }

    @Override // com.google.android.gms.internal.consent_sdk.zzdt, com.google.android.gms.internal.consent_sdk.zzds
    public final Object zza() {
        zzdr zzdrVar = this.zza;
        if (zzdrVar == null) {
            throw new IllegalStateException();
        }
        return zzdrVar.zza();
    }
}
