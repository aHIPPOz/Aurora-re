package com.google.android.gms.internal.games_v2;

import androidx.lifecycle.LifecycleKt$$ExternalSyntheticBackportWithForwarding0;
import java.util.concurrent.atomic.AtomicReference;
/* compiled from: com.google.android.gms:play-services-games-v2@@21.0.0 */
/* loaded from: classes2.dex */
public abstract class zzac {
    private final AtomicReference zza = new AtomicReference();

    protected abstract zzab zza();

    public final void zzb() {
        zzab zzabVar = (zzab) this.zza.get();
        if (zzabVar != null) {
            zzabVar.zzc();
        }
    }

    public final void zzc(String str, int i) {
        AtomicReference atomicReference = this.zza;
        zzab zzabVar = (zzab) atomicReference.get();
        if (zzabVar == null) {
            zzabVar = zza();
            if (!LifecycleKt$$ExternalSyntheticBackportWithForwarding0.m(atomicReference, null, zzabVar)) {
                zzabVar = (zzab) atomicReference.get();
            }
        }
        zzabVar.zzb(str, i);
    }
}
