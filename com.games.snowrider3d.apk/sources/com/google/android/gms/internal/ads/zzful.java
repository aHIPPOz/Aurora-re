package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzful implements ServiceConnection {
    final /* synthetic */ zzfun zza;

    public /* synthetic */ zzful(zzfun zzfunVar, zzfum zzfumVar) {
        Objects.requireNonNull(zzfunVar);
        this.zza = zzfunVar;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, final IBinder iBinder) {
        zzfuo zzfuoVar;
        zzfun zzfunVar = this.zza;
        zzfuoVar = zzfunVar.zzc;
        zzfuoVar.zzc("LmdServiceConnectionManager.onServiceConnected(%s)", componentName);
        zzfunVar.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuj
            @Override // java.lang.Runnable
            public final void run() {
                IInterface zzb;
                zzful zzfulVar = zzful.this;
                zzfun zzfunVar2 = zzfulVar.zza;
                zzfun.zzk(zzfunVar2, zzfsm.zzb(iBinder));
                zzfun.zzd(zzfunVar2).zzc("linkToDeath", new Object[0]);
                try {
                    zzb = zzfun.zzb(zzfunVar2);
                } catch (RemoteException e) {
                    zzfun.zzd(zzfulVar.zza).zzb(e, "linkToDeath failed", new Object[0]);
                }
                if (zzb != null) {
                    IInterface iInterface = zzb;
                    zzb.asBinder().linkToDeath(zzfun.zza(zzfunVar2), 0);
                    zzfun zzfunVar3 = zzfulVar.zza;
                    zzfun.zzj(zzfunVar3, false);
                    synchronized (zzfun.zze(zzfunVar3)) {
                        for (Runnable runnable : zzfun.zze(zzfunVar3)) {
                            runnable.run();
                        }
                        zzfun.zze(zzfunVar3).clear();
                    }
                    return;
                }
                throw null;
            }
        });
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        zzfuo zzfuoVar;
        zzfun zzfunVar = this.zza;
        zzfuoVar = zzfunVar.zzc;
        zzfuoVar.zzc("LmdServiceConnectionManager.onServiceDisconnected(%s)", componentName);
        zzfunVar.zzo(new Runnable() { // from class: com.google.android.gms.internal.ads.zzfuk
            @Override // java.lang.Runnable
            public final void run() {
                zzfun zzfunVar2 = zzful.this.zza;
                zzfun.zzd(zzfunVar2).zzc("unlinkToDeath", new Object[0]);
                IInterface zzb = zzfun.zzb(zzfunVar2);
                zzb.getClass();
                zzb.asBinder().unlinkToDeath(zzfun.zza(zzfunVar2), 0);
                zzfun.zzk(zzfunVar2, null);
                zzfun.zzj(zzfunVar2, false);
            }
        });
    }
}
