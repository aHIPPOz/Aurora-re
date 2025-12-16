package com.google.android.gms.internal.ads;

import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import org.checkerframework.checker.nullness.qual.RequiresNonNull;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzuc {
    public static final /* synthetic */ int zza = 0;
    private static final HashMap zzb = new HashMap();

    public static zzti zza() throws zztw {
        List zzd = zzd("audio/raw", false, false);
        if (zzd.isEmpty()) {
            return null;
        }
        return (zzti) zzd.get(0);
    }

    public static String zzb(zzz zzzVar) {
        Pair zza2;
        String str = zzzVar.zzo;
        if ("audio/eac3-joc".equals(str)) {
            return "audio/eac3";
        }
        if ("video/dolby-vision".equals(str) && (zza2 = zzdk.zza(zzzVar)) != null) {
            int intValue = ((Integer) zza2.first).intValue();
            if (intValue == 16 || intValue == 256) {
                return "video/hevc";
            }
            if (intValue == 512) {
                return "video/avc";
            }
            if (intValue == 1024) {
                return "video/av01";
            }
        }
        if ("video/mv-hevc".equals(str)) {
            return "video/hevc";
        }
        return null;
    }

    public static List zzc(zztr zztrVar, zzz zzzVar, boolean z, boolean z2) throws zztw {
        String zzb2 = zzb(zzzVar);
        if (zzb2 == null) {
            return zzfyq.zzn();
        }
        return zztrVar.zza(zzb2, z, z2);
    }

    public static synchronized List zzd(String str, boolean z, boolean z2) throws zztw {
        synchronized (zzuc.class) {
            zztv zztvVar = new zztv(str, z, z2);
            HashMap hashMap = zzb;
            List list = (List) hashMap.get(zztvVar);
            if (list != null) {
                return list;
            }
            ArrayList zzg = zzg(zztvVar, new zztz(z, z2, str.equals("video/mv-hevc")));
            if (z) {
                zzg.isEmpty();
            }
            if ("audio/raw".equals(str)) {
                if (Build.VERSION.SDK_INT < 26 && Build.DEVICE.equals("R9") && zzg.size() == 1 && ((zzti) zzg.get(0)).zza.equals("OMX.MTK.AUDIO.DECODER.RAW")) {
                    zzg.add(zzti.zzd("OMX.google.raw.decoder", "audio/raw", "audio/raw", null, false, true, false, false, false));
                }
                zzh(zzg, new zzua() { // from class: com.google.android.gms.internal.ads.zztt
                    @Override // com.google.android.gms.internal.ads.zzua
                    public final int zza(Object obj) {
                        int i = zzuc.zza;
                        String str2 = ((zzti) obj).zza;
                        if (str2.startsWith("OMX.google") || str2.startsWith("c2.android")) {
                            return 1;
                        }
                        return (Build.VERSION.SDK_INT >= 26 || !str2.equals("OMX.MTK.AUDIO.DECODER.RAW")) ? 0 : -1;
                    }
                });
            }
            if (Build.VERSION.SDK_INT < 32 && zzg.size() > 1 && "OMX.qti.audio.decoder.flac".equals(((zzti) zzg.get(0)).zza)) {
                zzg.add((zzti) zzg.remove(0));
            }
            zzfyq zzl = zzfyq.zzl(zzg);
            hashMap.put(zztvVar, zzl);
            return zzl;
        }
    }

    @RequiresNonNull({"#2.sampleMimeType"})
    public static List zze(zztr zztrVar, zzz zzzVar, boolean z, boolean z2) throws zztw {
        List zza2 = zztrVar.zza(zzzVar.zzo, z, z2);
        List zzc = zzc(zztrVar, zzzVar, z, z2);
        int i = zzfyq.zzd;
        zzfyn zzfynVar = new zzfyn();
        zzfynVar.zzh(zza2);
        zzfynVar.zzh(zzc);
        return zzfynVar.zzi();
    }

    public static List zzf(List list, final zzz zzzVar) {
        ArrayList arrayList = new ArrayList(list);
        zzh(arrayList, new zzua() { // from class: com.google.android.gms.internal.ads.zztu
            @Override // com.google.android.gms.internal.ads.zzua
            public final int zza(Object obj) {
                int i = zzuc.zza;
                return ((zzti) obj).zze(zzz.this) ? 1 : 0;
            }
        });
        return arrayList;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:(1:(1:70))|71|(1:73)(2:74|(1:76)(1:77))|78|(1:80)(2:81|(1:88)(1:87))|(4:(8:(1:91)|95|123|96|97|125|98|132)(1:92)|125|98|132)|(2:103|(3:128|106|107))|95|123|96|97) */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0173, code lost:
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x019b, code lost:
        r4 = r6;
     */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x010d A[Catch: Exception -> 0x0199, TryCatch #1 {Exception -> 0x0199, blocks: (B:58:0x00db, B:65:0x00f4, B:71:0x0107, B:73:0x010d, B:74:0x0113, B:78:0x011e, B:80:0x012a, B:81:0x012f, B:83:0x013f, B:85:0x0147), top: B:121:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0113 A[Catch: Exception -> 0x0199, TryCatch #1 {Exception -> 0x0199, blocks: (B:58:0x00db, B:65:0x00f4, B:71:0x0107, B:73:0x010d, B:74:0x0113, B:78:0x011e, B:80:0x012a, B:81:0x012f, B:83:0x013f, B:85:0x0147), top: B:121:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x012a A[Catch: Exception -> 0x0199, TryCatch #1 {Exception -> 0x0199, blocks: (B:58:0x00db, B:65:0x00f4, B:71:0x0107, B:73:0x010d, B:74:0x0113, B:78:0x011e, B:80:0x012a, B:81:0x012f, B:83:0x013f, B:85:0x0147), top: B:121:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012f A[Catch: Exception -> 0x0199, TryCatch #1 {Exception -> 0x0199, blocks: (B:58:0x00db, B:65:0x00f4, B:71:0x0107, B:73:0x010d, B:74:0x0113, B:78:0x011e, B:80:0x012a, B:81:0x012f, B:83:0x013f, B:85:0x0147), top: B:121:0x00db }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x015a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList zzg(com.google.android.gms.internal.ads.zztv r21, com.google.android.gms.internal.ads.zztx r22) throws com.google.android.gms.internal.ads.zztw {
        /*
            Method dump skipped, instructions count: 466
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzuc.zzg(com.google.android.gms.internal.ads.zztv, com.google.android.gms.internal.ads.zztx):java.util.ArrayList");
    }

    private static void zzh(List list, final zzua zzuaVar) {
        Collections.sort(list, new Comparator() { // from class: com.google.android.gms.internal.ads.zzts
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                int i = zzuc.zza;
                zzua zzuaVar2 = zzua.this;
                return zzuaVar2.zza(obj2) - zzuaVar2.zza(obj);
            }
        });
    }

    private static boolean zzi(MediaCodecInfo mediaCodecInfo, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            return mediaCodecInfo.isSoftwareOnly();
        }
        if (zzay.zzh(str)) {
            return true;
        }
        String zza2 = zzfuv.zza(mediaCodecInfo.getName());
        if (zza2.startsWith("arc.")) {
            return false;
        }
        if (zza2.startsWith("omx.google.") || zza2.startsWith("omx.ffmpeg.") || ((zza2.startsWith("omx.sec.") && zza2.contains(".sw.")) || zza2.equals("omx.qcom.video.decoder.hevcswvdec") || zza2.startsWith("c2.android.") || zza2.startsWith("c2.google."))) {
            return true;
        }
        return !zza2.startsWith("omx.") && !zza2.startsWith("c2.");
    }
}
