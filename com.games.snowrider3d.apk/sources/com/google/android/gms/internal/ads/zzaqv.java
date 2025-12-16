package com.google.android.gms.internal.ads;

import java.io.File;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaqv implements zzaqy {
    final /* synthetic */ File zza;

    public zzaqv(zzaqz zzaqzVar, File file) {
        this.zza = file;
        Objects.requireNonNull(zzaqzVar);
    }

    @Override // com.google.android.gms.internal.ads.zzaqy
    public final File zza() {
        return this.zza;
    }
}
