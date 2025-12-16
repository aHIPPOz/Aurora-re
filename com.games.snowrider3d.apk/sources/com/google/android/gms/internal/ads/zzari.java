package com.google.android.gms.internal.ads;

import com.google.common.net.HttpHeaders;
import java.io.UnsupportedEncodingException;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public class zzari extends zzaqd {
    private final Object zza = new Object();
    private final zzaqi zzb;

    public zzari(int i, String str, zzaqi zzaqiVar, zzaqh zzaqhVar) {
        super(i, str, zzaqhVar);
        this.zzb = zzaqiVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaqd
    public final zzaqj zzh(zzapz zzapzVar) {
        String str;
        String str2;
        try {
            byte[] bArr = zzapzVar.zzb;
            Map map = zzapzVar.zzc;
            String str3 = "ISO-8859-1";
            if (map != null && (str2 = (String) map.get(HttpHeaders.CONTENT_TYPE)) != null) {
                String[] split = str2.split(";", 0);
                int i = 1;
                while (true) {
                    if (i >= split.length) {
                        break;
                    }
                    String[] split2 = split[i].trim().split("=", 0);
                    if (split2.length == 2 && split2[0].equals("charset")) {
                        str3 = split2[1];
                        break;
                    }
                    i++;
                }
            }
            str = new String(bArr, str3);
        } catch (UnsupportedEncodingException unused) {
            str = new String(zzapzVar.zzb);
        }
        return zzaqj.zzb(str, zzara.zzb(zzapzVar));
    }

    /* renamed from: zzz */
    public void zzo(String str) {
        zzaqi zzaqiVar;
        synchronized (this.zza) {
            zzaqiVar = this.zzb;
        }
        zzaqiVar.zza(str);
    }
}
