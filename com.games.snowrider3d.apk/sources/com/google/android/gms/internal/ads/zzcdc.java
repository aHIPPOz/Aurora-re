package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcdc implements zzbkf {
    @Override // com.google.android.gms.internal.ads.zzbkf
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        Throwable e;
        zzccb zzccbVar = (zzccb) obj;
        zzcgi zzq = zzccbVar.zzq();
        if (zzq == null) {
            try {
                zzcgi zzcgiVar = new zzcgi(zzccbVar, Float.parseFloat((String) map.get(TypedValues.TransitionType.S_DURATION)), "1".equals(map.get("customControlsAllowed")), "1".equals(map.get("clickToExpandAllowed")));
                zzccbVar.zzC(zzcgiVar);
                zzq = zzcgiVar;
            } catch (NullPointerException e2) {
                e = e2;
                Throwable th = e;
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to parse videoMeta message.", th);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "VideoMetaGmsgHandler.onGmsg");
                return;
            } catch (NumberFormatException e3) {
                e = e3;
                Throwable th2 = e;
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzh("Unable to parse videoMeta message.", th2);
                com.google.android.gms.ads.internal.zzv.zzp().zzw(th2, "VideoMetaGmsgHandler.onGmsg");
                return;
            }
        }
        float parseFloat = Float.parseFloat((String) map.get(TypedValues.TransitionType.S_DURATION));
        boolean equals = "1".equals(map.get("muted"));
        float parseFloat2 = Float.parseFloat((String) map.get("currentTime"));
        int parseInt = Integer.parseInt((String) map.get("playbackState"));
        if (parseInt < 0 || parseInt > 3) {
            parseInt = 0;
        }
        String str = (String) map.get("aspectRatio");
        float parseFloat3 = TextUtils.isEmpty(str) ? 0.0f : Float.parseFloat(str);
        if (com.google.android.gms.ads.internal.util.zze.zzm(3)) {
            com.google.android.gms.ads.internal.util.client.zzo.zze("Video Meta GMSG: currentTime : " + parseFloat2 + " , duration : " + parseFloat + " , isMuted : " + equals + " , playbackState : " + parseInt + " , aspectRatio : " + str);
        }
        zzq.zzr(parseFloat2, parseFloat, parseInt, equals, parseFloat3);
    }
}
