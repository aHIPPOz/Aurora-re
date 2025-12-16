package com.google.android.gms.internal.ads;

import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
final class zzagp {
    private static final String[] zza = {"Camera:MotionPhoto", "GCamera:MotionPhoto", "Camera:MicroVideo", "GCamera:MicroVideo"};
    private static final String[] zzb = {"Camera:MotionPhotoPresentationTimestampUs", "GCamera:MotionPhotoPresentationTimestampUs", "Camera:MicroVideoPresentationTimestampUs", "GCamera:MicroVideoPresentationTimestampUs"};
    private static final String[] zzc = {"Camera:MicroVideoOffset", "GCamera:MicroVideoOffset"};

    /* JADX WARN: Code restructure failed: missing block: B:29:0x0088, code lost:
        r7 = -9223372036854775807L;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.google.android.gms.internal.ads.zzagl zza(java.lang.String r22) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 231
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzagp.zza(java.lang.String):com.google.android.gms.internal.ads.zzagl");
    }

    private static zzfyq zzb(XmlPullParser xmlPullParser, String str, String str2) throws XmlPullParserException, IOException {
        int i = zzfyq.zzd;
        zzfyn zzfynVar = new zzfyn();
        do {
            String concat = str.concat(":Item");
            xmlPullParser.next();
            if (zzey.zzc(xmlPullParser, concat)) {
                String concat2 = str2.concat(":Mime");
                String concat3 = str2.concat(":Semantic");
                String concat4 = str2.concat(":Length");
                String concat5 = str2.concat(":Padding");
                String zza2 = zzey.zza(xmlPullParser, concat2);
                String zza3 = zzey.zza(xmlPullParser, concat3);
                String zza4 = zzey.zza(xmlPullParser, concat4);
                String zza5 = zzey.zza(xmlPullParser, concat5);
                if (zza2 != null && zza3 != null) {
                    long j = 0;
                    long parseLong = zza4 != null ? Long.parseLong(zza4) : 0L;
                    if (zza5 != null) {
                        j = Long.parseLong(zza5);
                    }
                    zzfynVar.zzf(new zzagk(zza2, zza3, parseLong, j));
                } else {
                    return zzfyq.zzn();
                }
            }
        } while (!zzey.zzb(xmlPullParser, str.concat(":Directory")));
        return zzfynVar.zzi();
    }
}
