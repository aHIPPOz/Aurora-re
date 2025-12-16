package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.Arrays;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzewt implements zzeuc {
    private final zzbzs zza;
    private final boolean zzb;
    private final ScheduledExecutorService zzc;
    private final zzgdy zzd;
    private final int zze;
    private final int zzf;

    public zzewt(zzbzs zzbzsVar, boolean z, zzbzh zzbzhVar, zzgdy zzgdyVar, String str, ScheduledExecutorService scheduledExecutorService, int i, int i2) {
        this.zza = zzbzsVar;
        this.zzb = z;
        this.zzd = zzgdyVar;
        this.zzc = scheduledExecutorService;
        this.zze = i;
        this.zzf = i2;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 50;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhk)).booleanValue() || !this.zzb) {
            if (this.zzf != 2) {
                if (Arrays.asList(((String) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzhm)).split(",")).contains(String.valueOf(this.zze))) {
                    ListenableFuture zzh = zzgdn.zzh(null);
                    zzfve zzfveVar = new zzfve() { // from class: com.google.android.gms.internal.ads.zzewr
                        @Override // com.google.android.gms.internal.ads.zzfve
                        public final Object apply(Object obj) {
                            return new zzewu((String) obj);
                        }
                    };
                    zzgdy zzgdyVar = this.zzd;
                    return zzgdn.zze(zzgdn.zzo(zzgdn.zzm(zzh, zzfveVar, zzgdyVar), ((Long) zzbfs.zzb.zze()).longValue(), TimeUnit.MILLISECONDS, this.zzc), Exception.class, new zzfve() { // from class: com.google.android.gms.internal.ads.zzews
                        @Override // com.google.android.gms.internal.ads.zzfve
                        public final Object apply(Object obj) {
                            return zzewt.this.zza.zzw((Exception) obj, "TrustlessTokenSignal");
                        }
                    }, zzgdyVar);
                }
                return zzgdn.zzh(new zzewu(null));
            }
            return zzgdn.zzh(new zzewu(null));
        }
        return zzgdn.zzh(new zzewu(null));
    }
}
