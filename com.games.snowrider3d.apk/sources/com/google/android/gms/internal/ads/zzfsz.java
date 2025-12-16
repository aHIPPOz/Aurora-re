package com.google.android.gms.internal.ads;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfsz extends zzfuc {
    private String zza;
    private String zzb;

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final zzfuc zza(String str) {
        this.zzb = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final zzfuc zzb(String str) {
        this.zza = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.zzfuc
    public final zzfud zzc() {
        return new zzftb(this.zza, this.zzb, null);
    }
}
