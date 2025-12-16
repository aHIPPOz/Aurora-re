package com.google.android.gms.ads.nativead;

import android.content.Context;
import android.os.RemoteException;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.google.android.gms.ads.MediaContent;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.internal.util.client.zzo;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.internal.ads.zzbhj;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes.dex */
public class MediaView extends FrameLayout {
    private MediaContent zza;
    private boolean zzb;
    private ImageView.ScaleType zzc;
    private boolean zzd;
    private zzb zze;
    private zzc zzf;

    public MediaView(Context context) {
        super(context);
    }

    public MediaContent getMediaContent() {
        return this.zza;
    }

    public void setImageScaleType(ImageView.ScaleType scaleType) {
        this.zzd = true;
        this.zzc = scaleType;
        zzc zzcVar = this.zzf;
        if (zzcVar != null) {
            NativeAdView.zzb(zzcVar.zza, scaleType);
        }
    }

    public void setMediaContent(MediaContent mediaContent) {
        boolean z;
        this.zzb = true;
        this.zza = mediaContent;
        zzb zzbVar = this.zze;
        if (zzbVar != null) {
            NativeAdView.zzc(zzbVar.zza, mediaContent);
        }
        if (mediaContent == null) {
            return;
        }
        try {
            zzbhj zza = mediaContent.zza();
            if (zza == null) {
                return;
            }
            if (mediaContent.hasVideoContent()) {
                z = zza.zzs(ObjectWrapper.wrap(this));
            } else {
                if (mediaContent.zzb()) {
                    z = zza.zzr(ObjectWrapper.wrap(this));
                }
                removeAllViews();
            }
            if (z) {
                return;
            }
            removeAllViews();
        } catch (RemoteException e) {
            removeAllViews();
            zzo.zzh(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, e);
        }
    }

    public final synchronized void zza(zzb zzbVar) {
        this.zze = zzbVar;
        if (this.zzb) {
            NativeAdView.zzc(zzbVar.zza, this.zza);
        }
    }

    public final synchronized void zzb(zzc zzcVar) {
        this.zzf = zzcVar;
        if (this.zzd) {
            NativeAdView.zzb(zzcVar.zza, this.zzc);
        }
    }

    public MediaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public MediaView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
