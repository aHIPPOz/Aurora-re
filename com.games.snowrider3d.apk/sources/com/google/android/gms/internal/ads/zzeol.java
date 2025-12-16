package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import androidx.core.app.NotificationCompat;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeol implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    public zzeol(zzgdy zzgdyVar, Context context) {
        this.zza = zzgdyVar;
        this.zzb = context;
    }

    public static /* synthetic */ zzeom zzc(zzeol zzeolVar) {
        boolean z;
        double d = -1.0d;
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmv)).booleanValue()) {
            BatteryManager batteryManager = (BatteryManager) zzeolVar.zzb.getSystemService("batterymanager");
            if (batteryManager != null) {
                d = batteryManager.getIntProperty(4) / 100.0d;
            }
            if (batteryManager == null) {
                z = zze(zzeolVar.zzd());
            } else {
                z = batteryManager.isCharging();
            }
        } else {
            Intent zzd = zzeolVar.zzd();
            boolean zze = zze(zzd);
            if (zzd != null) {
                d = zzd.getIntExtra("level", -1) / zzd.getIntExtra("scale", -1);
            }
            z = zze;
        }
        return new zzeom(d, z);
    }

    private final Intent zzd() {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.BATTERY_CHANGED");
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlv)).booleanValue() || Build.VERSION.SDK_INT < 33) {
            return this.zzb.registerReceiver(null, intentFilter);
        }
        return this.zzb.registerReceiver(null, intentFilter, 4);
    }

    private static final boolean zze(Intent intent) {
        if (intent != null) {
            int intExtra = intent.getIntExtra(NotificationCompat.CATEGORY_STATUS, -1);
            return intExtra == 2 || intExtra == 5;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 14;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeok
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeol.zzc(zzeol.this);
            }
        });
    }
}
