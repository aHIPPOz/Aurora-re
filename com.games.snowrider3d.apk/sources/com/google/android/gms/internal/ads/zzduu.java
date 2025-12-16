package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorManager;
import javax.annotation.Nullable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzduu extends zzfrz {
    @Nullable
    private final SensorManager zza;
    @Nullable
    private final Sensor zzb;
    private float zzc = 0.0f;
    private Float zzd = Float.valueOf(0.0f);
    private long zze = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
    private int zzf = 0;
    private boolean zzg = false;
    private boolean zzh = false;
    @Nullable
    private zzdut zzi = null;
    private boolean zzj = false;

    public zzduu(Context context) {
        super("FlickDetector", "ads");
        SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
        this.zza = sensorManager;
        if (sensorManager != null) {
            this.zzb = sensorManager.getDefaultSensor(4);
        } else {
            this.zzb = null;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfrz
    public final void zza(SensorEvent sensorEvent) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjy)).booleanValue()) {
            return;
        }
        long currentTimeMillis = com.google.android.gms.ads.internal.zzv.zzD().currentTimeMillis();
        if (this.zze + ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjA)).intValue() < currentTimeMillis) {
            this.zzf = 0;
            this.zze = currentTimeMillis;
            this.zzg = false;
            this.zzh = false;
            this.zzc = this.zzd.floatValue();
        }
        Float valueOf = Float.valueOf(this.zzd.floatValue() + (sensorEvent.values[1] * 4.0f));
        this.zzd = valueOf;
        float floatValue = valueOf.floatValue();
        float f = this.zzc;
        zzbcv zzbcvVar = zzbde.zzjz;
        if (floatValue > f + ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbcvVar)).floatValue()) {
            this.zzc = this.zzd.floatValue();
            this.zzh = true;
        } else if (this.zzd.floatValue() < this.zzc - ((Float) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbcvVar)).floatValue()) {
            this.zzc = this.zzd.floatValue();
            this.zzg = true;
        }
        if (this.zzd.isInfinite()) {
            this.zzd = Float.valueOf(0.0f);
            this.zzc = 0.0f;
        }
        if (!this.zzg || !this.zzh) {
            return;
        }
        com.google.android.gms.ads.internal.util.zze.zza("Flick detected.");
        this.zze = currentTimeMillis;
        int i = this.zzf + 1;
        this.zzf = i;
        this.zzg = false;
        this.zzh = false;
        zzdut zzdutVar = this.zzi;
        if (zzdutVar == null) {
            return;
        }
        if (i != ((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjB)).intValue()) {
            return;
        }
        zzdvi zzdviVar = (zzdvi) zzdutVar;
        zzdviVar.zzh(new zzdvg(zzdviVar), zzdvh.GESTURE);
    }

    public final void zzb() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.unregisterListener(this, sensor);
                this.zzj = false;
                com.google.android.gms.ads.internal.util.zze.zza("Stopped listening for flick gestures.");
            }
        }
    }

    public final void zzc() {
        SensorManager sensorManager;
        Sensor sensor;
        synchronized (this) {
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzjy)).booleanValue()) {
                return;
            }
            if (!this.zzj && (sensorManager = this.zza) != null && (sensor = this.zzb) != null) {
                sensorManager.registerListener(this, sensor, 2);
                this.zzj = true;
                com.google.android.gms.ads.internal.util.zze.zza("Listening for flick gestures.");
            }
            if (this.zza != null && this.zzb != null) {
                return;
            }
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Flick detection failed to initialize. Failed to obtain gyroscope.");
        }
    }

    public final void zzd(zzdut zzdutVar) {
        this.zzi = zzdutVar;
    }
}
