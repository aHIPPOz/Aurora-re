package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.MuteThisAdListener;
import com.google.android.gms.ads.MuteThisAdReason;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.nativead.NativeAd;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbsz extends NativeAd {
    private final zzbij zza;
    private final zzbsy zzc;
    private final NativeAd.AdChoicesInfo zzd;
    private final List zzb = new ArrayList();
    private final List zze = new ArrayList();
    private final AtomicLong zzf = new AtomicLong();

    /* JADX WARN: Can't wrap try/catch for region: R(15:2|(3:50|3|(2:5|(5:8|(1:10)(1:11)|(3:52|13|55)(1:54)|53|6)))|44|16|(2:18|(5:21|(1:23)(1:24)|(3:56|26|59)(1:58)|57|19))|46|29|(7:31|35|48|36|(2:38|39)|42|43)|34|35|48|36|(0)|42|43) */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00ab, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zzh(com.google.android.gms.ads.RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009e A[Catch: RemoteException -> 0x00ab, TRY_LEAVE, TryCatch #2 {RemoteException -> 0x00ab, blocks: (B:36:0x0096, B:38:0x009e), top: B:48:0x0096 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zzbsz(com.google.android.gms.internal.ads.zzbij r6) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            r5.<init>()
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zzb = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r5.zze = r1
            java.util.concurrent.atomic.AtomicLong r1 = new java.util.concurrent.atomic.AtomicLong
            r1.<init>()
            r5.zzf = r1
            r5.zza = r6
            r1 = 0
            java.util.List r6 = r6.zzv()     // Catch: android.os.RemoteException -> L4a
            if (r6 == 0) goto L4e
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L4a
        L27:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L4a
            if (r2 == 0) goto L4e
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L4a
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L4a
            if (r3 == 0) goto L3c
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L4a
            com.google.android.gms.internal.ads.zzbgp r2 = com.google.android.gms.internal.ads.zzbgo.zzh(r2)     // Catch: android.os.RemoteException -> L4a
            goto L3d
        L3c:
            r2 = r1
        L3d:
            if (r2 == 0) goto L27
            java.util.List r3 = r5.zzb     // Catch: android.os.RemoteException -> L4a
            com.google.android.gms.internal.ads.zzbsy r4 = new com.google.android.gms.internal.ads.zzbsy     // Catch: android.os.RemoteException -> L4a
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L4a
            r3.add(r4)     // Catch: android.os.RemoteException -> L4a
            goto L27
        L4a:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L4e:
            com.google.android.gms.internal.ads.zzbij r6 = r5.zza     // Catch: android.os.RemoteException -> L7d
            java.util.List r6 = r6.zzw()     // Catch: android.os.RemoteException -> L7d
            if (r6 == 0) goto L81
            java.util.Iterator r6 = r6.iterator()     // Catch: android.os.RemoteException -> L7d
        L5a:
            boolean r2 = r6.hasNext()     // Catch: android.os.RemoteException -> L7d
            if (r2 == 0) goto L81
            java.lang.Object r2 = r6.next()     // Catch: android.os.RemoteException -> L7d
            boolean r3 = r2 instanceof android.os.IBinder     // Catch: android.os.RemoteException -> L7d
            if (r3 == 0) goto L6f
            android.os.IBinder r2 = (android.os.IBinder) r2     // Catch: android.os.RemoteException -> L7d
            com.google.android.gms.ads.internal.client.zzdj r2 = com.google.android.gms.ads.internal.client.zzdi.zzb(r2)     // Catch: android.os.RemoteException -> L7d
            goto L70
        L6f:
            r2 = r1
        L70:
            if (r2 == 0) goto L5a
            java.util.List r3 = r5.zze     // Catch: android.os.RemoteException -> L7d
            com.google.android.gms.ads.internal.client.zzdk r4 = new com.google.android.gms.ads.internal.client.zzdk     // Catch: android.os.RemoteException -> L7d
            r4.<init>(r2)     // Catch: android.os.RemoteException -> L7d
            r3.add(r4)     // Catch: android.os.RemoteException -> L7d
            goto L5a
        L7d:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L81:
            com.google.android.gms.internal.ads.zzbij r6 = r5.zza     // Catch: android.os.RemoteException -> L8f
            com.google.android.gms.internal.ads.zzbgp r6 = r6.zzl()     // Catch: android.os.RemoteException -> L8f
            if (r6 == 0) goto L93
            com.google.android.gms.internal.ads.zzbsy r2 = new com.google.android.gms.internal.ads.zzbsy     // Catch: android.os.RemoteException -> L8f
            r2.<init>(r6)     // Catch: android.os.RemoteException -> L8f
            goto L94
        L8f:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        L93:
            r2 = r1
        L94:
            r5.zzc = r2
            com.google.android.gms.internal.ads.zzbij r6 = r5.zza     // Catch: android.os.RemoteException -> Lab
            com.google.android.gms.internal.ads.zzbgi r6 = r6.zzj()     // Catch: android.os.RemoteException -> Lab
            if (r6 == 0) goto Laf
            com.google.android.gms.internal.ads.zzbsw r6 = new com.google.android.gms.internal.ads.zzbsw     // Catch: android.os.RemoteException -> Lab
            com.google.android.gms.internal.ads.zzbij r2 = r5.zza     // Catch: android.os.RemoteException -> Lab
            com.google.android.gms.internal.ads.zzbgi r2 = r2.zzj()     // Catch: android.os.RemoteException -> Lab
            r6.<init>(r2)     // Catch: android.os.RemoteException -> Lab
            r1 = r6
            goto Laf
        Lab:
            r6 = move-exception
            com.google.android.gms.ads.internal.util.client.zzo.zzh(r0, r6)
        Laf:
            r5.zzd = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbsz.<init>(com.google.android.gms.internal.ads.zzbij):void");
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void cancelUnconfirmedClick() {
        try {
            this.zza.zzx();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to cancelUnconfirmedClick", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void destroy() {
        try {
            this.zza.zzy();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void enableCustomClickGesture() {
        try {
            this.zza.zzE();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.AdChoicesInfo getAdChoicesInfo() {
        return this.zzd;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getAdvertiser() {
        try {
            return this.zza.zzo();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getBody() {
        try {
            return this.zza.zzp();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getCallToAction() {
        try {
            return this.zza.zzq();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Bundle getExtras() {
        try {
            Bundle zzg = this.zza.zzg();
            if (zzg != null) {
                return zzg;
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
        return new Bundle();
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getHeadline() {
        try {
            return this.zza.zzr();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final NativeAd.Image getIcon() {
        return this.zzc;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<NativeAd.Image> getImages() {
        return this.zzb;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final MediaContent getMediaContent() {
        try {
            zzbij zzbijVar = this.zza;
            if (zzbijVar.zzk() != null) {
                return new com.google.android.gms.ads.internal.client.zzff(zzbijVar.zzk(), null);
            }
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
        return null;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final List<MuteThisAdReason> getMuteThisAdReasons() {
        return this.zze;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final long getPlacementId() {
        long j;
        AtomicLong atomicLong = this.zzf;
        if (atomicLong.get() != 0) {
            return atomicLong.get();
        }
        synchronized (this) {
            try {
                try {
                    long zzf = this.zza.zzf();
                    AtomicLong atomicLong2 = this.zzf;
                    atomicLong2.set(zzf);
                    j = atomicLong2.get();
                } catch (RemoteException e) {
                    com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to getPlacementId", e);
                    return 0L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return j;
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getPrice() {
        try {
            return this.zza.zzt();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final ResponseInfo getResponseInfo() {
        com.google.android.gms.ads.internal.client.zzea zzeaVar;
        try {
            zzeaVar = this.zza.zzh();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            zzeaVar = null;
        }
        return ResponseInfo.zza(zzeaVar);
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final Double getStarRating() {
        try {
            double zze = this.zza.zze();
            if (zze != -1.0d) {
                return Double.valueOf(zze);
            }
            return null;
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final String getStore() {
        try {
            return this.zza.zzu();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomClickGestureEnabled() {
        try {
            return this.zza.zzJ();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean isCustomMuteThisAdEnabled() {
        try {
            return this.zza.zzK();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void muteThisAd(MuteThisAdReason muteThisAdReason) {
        try {
            try {
                if (this.zza.zzK()) {
                    if (muteThisAdReason == null) {
                        this.zza.zzz(null);
                        return;
                    } else if (muteThisAdReason instanceof com.google.android.gms.ads.internal.client.zzdk) {
                        this.zza.zzz(((com.google.android.gms.ads.internal.client.zzdk) muteThisAdReason).zza());
                        return;
                    } else {
                        com.google.android.gms.ads.internal.util.client.zzo.zzg("Use mute reason from UnifiedNativeAd.getMuteThisAdReasons() or null");
                        return;
                    }
                }
            } catch (RemoteException e) {
                com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            }
            com.google.android.gms.ads.internal.util.client.zzo.zzg("Ad is not custom mute enabled");
        } catch (RemoteException e2) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e2);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void performClick(Bundle bundle) {
        try {
            this.zza.zzA(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void recordCustomClickGesture() {
        try {
            this.zza.zzB();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    protected final void recordEvent(Bundle bundle) {
        try {
            this.zza.zzC(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to record native event", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final boolean recordImpression(Bundle bundle) {
        try {
            return this.zza.zzL(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return false;
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void reportTouchEvent(Bundle bundle) {
        try {
            this.zza.zzD(bundle);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setMuteThisAdListener(MuteThisAdListener muteThisAdListener) {
        try {
            this.zza.zzF(new com.google.android.gms.ads.internal.client.zzdg(muteThisAdListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setOnPaidEventListener(OnPaidEventListener onPaidEventListener) {
        try {
            this.zza.zzG(new com.google.android.gms.ads.internal.client.zzfu(onPaidEventListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to setOnPaidEventListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setPlacementId(long j) {
        try {
            this.zza.zzH(j);
            this.zzf.set(j);
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to setPlacementId", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final void setUnconfirmedClickListener(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        try {
            this.zza.zzI(new zzbtg(unconfirmedClickListener));
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh("Failed to setUnconfirmedClickListener", e);
        }
    }

    @Override // com.google.android.gms.ads.nativead.NativeAd
    public final /* bridge */ /* synthetic */ Object zza() {
        try {
            return this.zza.zzn();
        } catch (RemoteException e) {
            com.google.android.gms.ads.internal.util.client.zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
            return null;
        }
    }
}
