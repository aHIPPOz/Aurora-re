package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdyo extends zzdyi {
    private String zzg;
    private int zzh = 1;

    public zzdyo(Context context) {
        this.zzf = new zzbuv(context, com.google.android.gms.ads.internal.zzv.zzv().zzb(), this, this);
    }

    @Override // com.google.android.gms.internal.ads.zzdyi, com.google.android.gms.common.internal.BaseGmsClient.BaseOnConnectionFailedListener
    public final void onConnectionFailed(ConnectionResult connectionResult) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zze("Cannot connect to remote service, fallback to local instance.");
        this.zza.zzd(new zzdyx(1));
    }

    public final ListenableFuture zza(zzbvq zzbvqVar) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 2) {
                return zzgdn.zzg(new zzdyx(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 2;
                this.zzc = true;
                this.zze = zzbvqVar;
                this.zzf.checkAvailabilityAndConnect();
                zzcak zzcakVar = this.zza;
                zzcakVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdym
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyo.this.zzb();
                    }
                }, zzcaf.zzg);
                return zzcakVar;
            }
        }
    }

    public final ListenableFuture zzd(String str) {
        synchronized (this.zzb) {
            int i = this.zzh;
            if (i != 1 && i != 3) {
                return zzgdn.zzg(new zzdyx(2));
            } else if (this.zzc) {
                return this.zza;
            } else {
                this.zzh = 3;
                this.zzc = true;
                this.zzg = str;
                this.zzf.checkAvailabilityAndConnect();
                zzcak zzcakVar = this.zza;
                zzcakVar.addListener(new Runnable() { // from class: com.google.android.gms.internal.ads.zzdyn
                    @Override // java.lang.Runnable
                    public final void run() {
                        zzdyo.this.zzb();
                    }
                }, zzcaf.zzg);
                return zzcakVar;
            }
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient.BaseConnectionCallbacks
    public final void onConnected(Bundle bundle) {
        zzbvi zzbviVar;
        zzbvi zzbviVar2;
        synchronized (this.zzb) {
            if (!this.zzd) {
                this.zzd = true;
                try {
                    int i = this.zzh;
                    if (i == 2) {
                        zzbve zzp = this.zzf.zzp();
                        zzbvq zzbvqVar = this.zze;
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznp)).booleanValue()) {
                            zzbviVar2 = new zzdyg(this);
                        } else {
                            zzbviVar2 = new zzdyh(this.zza, this.zze);
                        }
                        zzp.zze(zzbvqVar, zzbviVar2);
                    } else if (i == 3) {
                        zzbve zzp2 = this.zzf.zzp();
                        String str = this.zzg;
                        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zznp)).booleanValue()) {
                            zzbviVar = new zzdyg(this);
                        } else {
                            zzbviVar = new zzdyh(this.zza, this.zze);
                        }
                        zzp2.zzh(str, zzbviVar);
                    } else {
                        this.zza.zzd(new zzdyx(1));
                    }
                } catch (RemoteException | IllegalArgumentException unused) {
                    this.zza.zzd(new zzdyx(1));
                } catch (Throwable th) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "RemoteUrlAndCacheKeyClientTask.onConnected");
                    this.zza.zzd(new zzdyx(1));
                }
            }
        }
    }
}
