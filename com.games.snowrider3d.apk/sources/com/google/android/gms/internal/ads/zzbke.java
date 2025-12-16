package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.HashMap;
import java.util.Map;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzbke {
    public static final zzbkf zza = new zzbkf() { // from class: com.google.android.gms.internal.ads.zzbjc
        @Override // com.google.android.gms.internal.ads.zzbkf
        public final void zza(Object obj, Map map) {
            zzcgn zzcgnVar = (zzcgn) obj;
            zzbkf zzbkfVar = zzbke.zza;
            String str = (String) map.get("urls");
            if (TextUtils.isEmpty(str)) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URLs missing in canOpenURLs GMSG.");
                return;
            }
            String[] split = str.split(",");
            HashMap hashMap = new HashMap();
            PackageManager packageManager = zzcgnVar.getContext().getPackageManager();
            for (String str2 : split) {
                String[] split2 = str2.split(";", 2);
                boolean z = true;
                if (packageManager.resolveActivity(new Intent(split2.length > 1 ? split2[1].trim() : "android.intent.action.VIEW", Uri.parse(split2[0].trim())), 65536) == null) {
                    z = false;
                }
                Boolean valueOf = Boolean.valueOf(z);
                hashMap.put(str2, valueOf);
                com.google.android.gms.ads.internal.util.zze.zza("/canOpenURLs;" + str2 + ";" + valueOf);
            }
            ((zzbna) zzcgnVar).zzd("openableURLs", hashMap);
        }
    };
    public static final zzbkf zzb = new zzbkf() { // from class: com.google.android.gms.internal.ads.zzbje
        @Override // com.google.android.gms.internal.ads.zzbkf
        public final void zza(Object obj, Map map) {
            zzcgn zzcgnVar = (zzcgn) obj;
            zzbkf zzbkfVar = zzbke.zza;
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zziE)).booleanValue()) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("canOpenAppGmsgHandler disabled.");
                return;
            }
            String str = (String) map.get("package_name");
            if (TextUtils.isEmpty(str)) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Package name missing in canOpenApp GMSG.");
                return;
            }
            HashMap hashMap = new HashMap();
            Boolean valueOf = Boolean.valueOf(zzcgnVar.getContext().getPackageManager().getLaunchIntentForPackage(str) != null);
            hashMap.put(str, valueOf);
            com.google.android.gms.ads.internal.util.zze.zza("/canOpenApp;" + str + ";" + valueOf);
            ((zzbna) zzcgnVar).zzd("openableApp", hashMap);
        }
    };
    public static final zzbkf zzc = new zzbkf() { // from class: com.google.android.gms.internal.ads.zzbjh
        @Override // com.google.android.gms.internal.ads.zzbkf
        public final void zza(Object obj, Map map) {
            zzbke.zzb((zzcgn) obj, map);
        }
    };
    public static final zzbkf zzd = new zzbjw();
    public static final zzbkf zze = new zzbjx();
    public static final zzbkf zzf = new zzbkf() { // from class: com.google.android.gms.internal.ads.zzbji
        @Override // com.google.android.gms.internal.ads.zzbkf
        public final void zza(Object obj, Map map) {
            zzcgn zzcgnVar = (zzcgn) obj;
            zzbkf zzbkfVar = zzbke.zza;
            String str = (String) map.get("u");
            if (str == null) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("URL missing from httpTrack GMSG.");
                return;
            }
            zzcex zzcexVar = (zzcex) zzcgnVar;
            new com.google.android.gms.ads.internal.util.zzbw(zzcgnVar.getContext(), ((zzcgu) zzcgnVar).zzm().afmaVersion, str, null, zzcexVar.zzD() != null ? zzcexVar.zzD().zzax : null).zzb();
        }
    };
    public static final zzbkf zzg = new zzbjy();
    public static final zzbkf zzh = new zzbjz();
    public static final zzbkf zzi = new zzbkf() { // from class: com.google.android.gms.internal.ads.zzbjf
        @Override // com.google.android.gms.internal.ads.zzbkf
        public final void zza(Object obj, Map map) {
            zzcgt zzcgtVar = (zzcgt) obj;
            zzbkf zzbkfVar = zzbke.zza;
            String str = (String) map.get("tx");
            String str2 = (String) map.get("ty");
            String str3 = (String) map.get("td");
            try {
                int parseInt = Integer.parseInt(str);
                int parseInt2 = Integer.parseInt(str2);
                int parseInt3 = Integer.parseInt(str3);
                zzavu zzI = zzcgtVar.zzI();
                if (zzI == null) {
                    return;
                }
                zzI.zzc().zzl(parseInt, parseInt2, parseInt3);
            } catch (NumberFormatException unused) {
                int i = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not parse touch parameters from gmsg.");
            }
        }
    };
    public static final zzbkf zzj = new zzbka();
    public static final zzbkf zzk = new zzbkb();
    public static final zzbkf zzl = new zzcdb();
    public static final zzbkf zzm = new zzcdc();
    public static final zzbkf zzn = new zzbiy();
    public static final zzbkv zzo = new zzbkv();
    public static final zzbkf zzp = new zzbkc();
    public static final zzbkf zzq = new zzbkd();
    public static final zzbkf zzr = new zzbjj();
    public static final zzbkf zzs = new zzbjk();
    public static final zzbkf zzt = new zzbjl();
    public static final zzbkf zzu = new zzbjm();
    public static final zzbkf zzv = new zzbjn();
    public static final zzbkf zzw = new zzbjo();
    public static final zzbkf zzx = new zzbjp();
    public static final zzbkf zzy = new zzbjq();
    public static final zzbkf zzz = new zzbjr();
    public static final zzbkf zzA = new zzbjs();
    public static final zzbkf zzB = new zzbju();
    public static final zzbkf zzC = new zzbjv();

    public static ListenableFuture zza(zzcfg zzcfgVar, String str) {
        Uri parse = Uri.parse(str);
        try {
            zzavu zzI = zzcfgVar.zzI();
            zzfda zzS = zzcfgVar.zzS();
            if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzmu)).booleanValue() || zzS == null) {
                if (zzI != null && zzI.zzf(parse)) {
                    parse = zzI.zza(parse, zzcfgVar.getContext(), zzcfgVar.zzF(), zzcfgVar.zzi());
                }
            } else if (zzI != null && zzI.zzf(parse)) {
                parse = zzS.zza(parse, zzcfgVar.getContext(), zzcfgVar.zzF(), zzcfgVar.zzi());
            }
        } catch (zzavv unused) {
            String concat = "Unable to append parameter to URL: ".concat(str);
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj(concat);
        }
        Map hashMap = new HashMap();
        if (zzcfgVar.zzD() != null) {
            hashMap = zzcfgVar.zzD().zzaw;
        }
        final String zzb2 = zzbyq.zzb(parse, zzcfgVar.getContext(), hashMap);
        long longValue = ((Long) zzbfd.zze.zze()).longValue();
        if (longValue <= 0 || longValue > 252530000) {
            return zzgdn.zzh(zzb2);
        }
        zzgde zzw2 = zzgde.zzw(zzcfgVar.zzT());
        zzfve zzfveVar = new zzfve() { // from class: com.google.android.gms.internal.ads.zzbiz
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbkf zzbkfVar = zzbke.zza;
                if (((Boolean) zzbfd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation1");
                    return "failure_click_attok";
                }
                return "failure_click_attok";
            }
        };
        zzgdy zzgdyVar = zzcaf.zzg;
        return (zzgde) zzgdn.zze((zzgde) zzgdn.zzm((zzgde) zzgdn.zze(zzw2, Throwable.class, zzfveVar, zzgdyVar), new zzfve() { // from class: com.google.android.gms.internal.ads.zzbja
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                String str2 = (String) obj;
                zzbkf zzbkfVar = zzbke.zza;
                String str3 = zzb2;
                if (str2 != null) {
                    if (((Boolean) zzbfd.zzf.zze()).booleanValue()) {
                        String[] strArr = {".doubleclick.net", ".googleadservices.com", ".googlesyndication.com"};
                        String host = Uri.parse(str3).getHost();
                        for (int i2 = 0; i2 < 3; i2++) {
                            if (!host.endsWith(strArr[i2])) {
                            }
                        }
                    }
                    String str4 = (String) zzbfd.zza.zze();
                    String str5 = (String) zzbfd.zzb.zze();
                    if (!TextUtils.isEmpty(str4)) {
                        str3 = str3.replace(str4, str2);
                    }
                    if (!TextUtils.isEmpty(str5)) {
                        Uri parse2 = Uri.parse(str3);
                        if (TextUtils.isEmpty(parse2.getQueryParameter(str5))) {
                            return parse2.buildUpon().appendQueryParameter(str5, str2).toString();
                        }
                    }
                }
                return str3;
            }
        }, zzgdyVar), Throwable.class, new zzfve() { // from class: com.google.android.gms.internal.ads.zzbjb
            @Override // com.google.android.gms.internal.ads.zzfve
            public final Object apply(Object obj) {
                Throwable th = (Throwable) obj;
                zzbkf zzbkfVar = zzbke.zza;
                if (((Boolean) zzbfd.zzi.zze()).booleanValue()) {
                    com.google.android.gms.ads.internal.zzv.zzp().zzw(th, "prepareClickUrl.attestation2");
                }
                return zzb2;
            }
        }, zzgdyVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:(3:54|8|9)|(12:62|11|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|52|35|(1:39)|60|40|67|45)|14|15|(0)|34|52|35|(0)|60|40|67|45|6) */
    /* JADX WARN: Can't wrap try/catch for region: R(16:54|8|9|(12:62|11|15|(10:17|(1:19)|20|(1:22)|23|(1:25)|26|(1:28)|29|(2:31|(1:33)))|34|52|35|(1:39)|60|40|67|45)|14|15|(0)|34|52|35|(0)|60|40|67|45|6) */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00cb, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00cc, code lost:
        com.google.android.gms.ads.internal.zzv.zzp().zzw(r0, r8.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00df, code lost:
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e0, code lost:
        r7 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzh("Error constructing openable urls response.", r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ void zzb(com.google.android.gms.internal.ads.zzcgn r16, java.util.Map r17) {
        /*
            Method dump skipped, instructions count: 278
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbke.zzb(com.google.android.gms.internal.ads.zzcgn, java.util.Map):void");
    }

    public static void zzc(Map map, zzded zzdedVar) {
        if (!((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzlh)).booleanValue() || !map.containsKey("sc") || !((String) map.get("sc")).equals("1") || zzdedVar == null) {
            return;
        }
        zzdedVar.zzdf();
    }
}
