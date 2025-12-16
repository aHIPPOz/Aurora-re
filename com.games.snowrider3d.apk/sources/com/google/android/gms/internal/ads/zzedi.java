package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.InputEvent;
import androidx.privacysandbox.ads.adservices.java.measurement.MeasurementManagerFutures;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzedi {
    private MeasurementManagerFutures zza;
    private final Context zzb;

    public zzedi(Context context) {
        this.zzb = context;
    }

    public final ListenableFuture zza() {
        try {
            MeasurementManagerFutures from = MeasurementManagerFutures.from(this.zzb);
            this.zza = from;
            if (from != null) {
                return from.getMeasurementApiStatusAsync();
            }
            return zzgdn.zzg(new IllegalStateException("MeasurementManagerFutures is null"));
        } catch (Exception e) {
            return zzgdn.zzg(e);
        }
    }

    public final ListenableFuture zzb(Uri uri, InputEvent inputEvent) {
        try {
            return ((MeasurementManagerFutures) Objects.requireNonNull(this.zza)).registerSourceAsync(uri, inputEvent);
        } catch (Exception e) {
            return zzgdn.zzg(e);
        }
    }
}
