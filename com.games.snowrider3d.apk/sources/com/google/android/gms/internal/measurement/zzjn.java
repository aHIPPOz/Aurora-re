package com.google.android.gms.internal.measurement;

import androidx.core.internal.view.SupportMenu;
/* compiled from: com.google.android.gms:play-services-measurement-base@@20.1.2 */
/* loaded from: classes2.dex */
final class zzjn {
    private final Object zza;
    private final int zzb;

    public zzjn(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjn)) {
            return false;
        }
        zzjn zzjnVar = (zzjn) obj;
        return this.zza == zzjnVar.zza && this.zzb == zzjnVar.zzb;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * SupportMenu.USER_MASK) + this.zzb;
    }
}
