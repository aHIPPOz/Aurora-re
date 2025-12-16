package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfyo extends zzfwp {
    private final zzfyq zza;

    public zzfyo(zzfyq zzfyqVar, int i) {
        super(zzfyqVar.size(), i);
        this.zza = zzfyqVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfwp
    protected final Object zza(int i) {
        return this.zza.get(i);
    }
}
