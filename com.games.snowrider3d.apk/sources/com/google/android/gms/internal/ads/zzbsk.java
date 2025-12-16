package com.google.android.gms.internal.ads;

import android.content.DialogInterface;
import java.util.Objects;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbsk implements DialogInterface.OnClickListener {
    final /* synthetic */ zzbsl zza;

    public zzbsk(zzbsl zzbslVar) {
        Objects.requireNonNull(zzbslVar);
        this.zza = zzbslVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        this.zza.zzh("Operation denied by user.");
    }
}
