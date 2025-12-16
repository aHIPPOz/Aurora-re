package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.PlatformVersion;
import java.util.EnumMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfkp {
    private final ConcurrentMap zza = new ConcurrentHashMap();
    private final ConcurrentMap zzb = new ConcurrentHashMap();
    private final zzfle zzc;
    private final zzfkl zzd;
    private final Context zze;
    private volatile ConnectivityManager zzf;
    private final Clock zzg;
    private AtomicInteger zzh;

    public zzfkp(zzfle zzfleVar, zzfkl zzfklVar, Context context, Clock clock) {
        this.zzc = zzfleVar;
        this.zzd = zzfklVar;
        this.zze = context;
        this.zzg = clock;
    }

    static String zzd(String str, AdFormat adFormat) {
        String name = adFormat == null ? "NULL" : adFormat.name();
        return str + "#" + name;
    }

    private final synchronized zzfld zzm(String str, AdFormat adFormat) {
        return (zzfld) this.zza.get(zzd(str, adFormat));
    }

    private final synchronized Object zzn(Class cls, String str, AdFormat adFormat) {
        zzfkt zzfktVar = new zzfkt(new zzfkr(str, adFormat), null);
        zzfkl zzfklVar = this.zzd;
        Clock clock = this.zzg;
        zzfklVar.zzl(clock.currentTimeMillis(), zzfktVar, -1, -1, "1");
        zzfld zzm = zzm(str, adFormat);
        if (zzm == null) {
            return null;
        }
        try {
            String zzo = zzm.zzo();
            Object zzk = zzm.zzk();
            Object cast = zzk == null ? null : cls.cast(zzk);
            if (cast != null) {
                zzfklVar.zzm(clock.currentTimeMillis(), zzm.zze.zzd, zzm.zzd(), zzo, zzfktVar, "1");
            }
            return cast;
        } catch (ClassCastException e) {
            com.google.android.gms.ads.internal.zzv.zzp().zzw(e, "PreloadAdManager.pollAd");
            com.google.android.gms.ads.internal.util.zze.zzb("Unable to cast ad to the requested type:".concat(String.valueOf(cls.getName())), e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00f3, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzz)).booleanValue() != false) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized java.util.List zzo(java.util.List r9) {
        /*
            r8 = this;
            monitor-enter(r8)
            java.util.HashSet r0 = new java.util.HashSet     // Catch: java.lang.Throwable -> L104
            r0.<init>()     // Catch: java.lang.Throwable -> L104
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L104
            r1.<init>()     // Catch: java.lang.Throwable -> L104
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L104
        Lf:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L104
            if (r2 == 0) goto L7b
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.ads.internal.client.zzfv r2 = (com.google.android.gms.ads.internal.client.zzfv) r2     // Catch: java.lang.Throwable -> L104
            java.lang.String r3 = r2.zza     // Catch: java.lang.Throwable -> L104
            int r4 = r2.zzb     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.ads.AdFormat r4 = com.google.android.gms.ads.AdFormat.getAdFormat(r4)     // Catch: java.lang.Throwable -> L104
            java.lang.String r3 = zzd(r3, r4)     // Catch: java.lang.Throwable -> L104
            r0.add(r3)     // Catch: java.lang.Throwable -> L104
            java.util.concurrent.ConcurrentMap r4 = r8.zza     // Catch: java.lang.Throwable -> L104
            java.lang.Object r5 = r4.get(r3)     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzfld r5 = (com.google.android.gms.internal.ads.zzfld) r5     // Catch: java.lang.Throwable -> L104
            if (r5 == 0) goto L4e
            com.google.android.gms.ads.internal.client.zzfv r6 = r5.zze     // Catch: java.lang.Throwable -> L104
            boolean r6 = r6.equals(r2)     // Catch: java.lang.Throwable -> L104
            if (r6 != 0) goto L48
            java.util.concurrent.ConcurrentMap r6 = r8.zzb     // Catch: java.lang.Throwable -> L104
            r6.put(r3, r5)     // Catch: java.lang.Throwable -> L104
            r4.remove(r3)     // Catch: java.lang.Throwable -> L104
            r1.add(r2)     // Catch: java.lang.Throwable -> L104
            goto Lf
        L48:
            int r2 = r2.zzd     // Catch: java.lang.Throwable -> L104
            r5.zzB(r2)     // Catch: java.lang.Throwable -> L104
            goto Lf
        L4e:
            java.util.concurrent.ConcurrentMap r5 = r8.zzb     // Catch: java.lang.Throwable -> L104
            boolean r6 = r5.containsKey(r3)     // Catch: java.lang.Throwable -> L104
            if (r6 == 0) goto L77
            java.lang.Object r6 = r5.get(r3)     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzfld r6 = (com.google.android.gms.internal.ads.zzfld) r6     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.ads.internal.client.zzfv r7 = r6.zze     // Catch: java.lang.Throwable -> L104
            boolean r7 = r7.equals(r2)     // Catch: java.lang.Throwable -> L104
            if (r7 == 0) goto L73
            int r2 = r2.zzd     // Catch: java.lang.Throwable -> L104
            r6.zzB(r2)     // Catch: java.lang.Throwable -> L104
            r6.zzy()     // Catch: java.lang.Throwable -> L104
            r4.put(r3, r6)     // Catch: java.lang.Throwable -> L104
            r5.remove(r3)     // Catch: java.lang.Throwable -> L104
            goto Lf
        L73:
            r1.add(r2)     // Catch: java.lang.Throwable -> L104
            goto Lf
        L77:
            r1.add(r2)     // Catch: java.lang.Throwable -> L104
            goto Lf
        L7b:
            java.util.concurrent.ConcurrentMap r9 = r8.zza     // Catch: java.lang.Throwable -> L104
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L104
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L104
        L85:
            boolean r2 = r9.hasNext()     // Catch: java.lang.Throwable -> L104
            if (r2 == 0) goto Lb2
            java.lang.Object r2 = r9.next()     // Catch: java.lang.Throwable -> L104
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2     // Catch: java.lang.Throwable -> L104
            java.lang.Object r3 = r2.getKey()     // Catch: java.lang.Throwable -> L104
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Throwable -> L104
            boolean r3 = r0.contains(r3)     // Catch: java.lang.Throwable -> L104
            if (r3 != 0) goto L85
            java.util.concurrent.ConcurrentMap r3 = r8.zzb     // Catch: java.lang.Throwable -> L104
            java.lang.Object r4 = r2.getKey()     // Catch: java.lang.Throwable -> L104
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> L104
            java.lang.Object r2 = r2.getValue()     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzfld r2 = (com.google.android.gms.internal.ads.zzfld) r2     // Catch: java.lang.Throwable -> L104
            r3.put(r4, r2)     // Catch: java.lang.Throwable -> L104
            r9.remove()     // Catch: java.lang.Throwable -> L104
            goto L85
        Lb2:
            java.util.concurrent.ConcurrentMap r9 = r8.zzb     // Catch: java.lang.Throwable -> L104
            java.util.Set r9 = r9.entrySet()     // Catch: java.lang.Throwable -> L104
            java.util.Iterator r9 = r9.iterator()     // Catch: java.lang.Throwable -> L104
        Lbc:
            boolean r0 = r9.hasNext()     // Catch: java.lang.Throwable -> L104
            if (r0 == 0) goto L102
            java.lang.Object r0 = r9.next()     // Catch: java.lang.Throwable -> L104
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L104
            java.lang.Object r0 = r0.getValue()     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzfld r0 = (com.google.android.gms.internal.ads.zzfld) r0     // Catch: java.lang.Throwable -> L104
            r0.zzA()     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzy     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L104
            java.lang.Object r2 = r3.zzb(r2)     // Catch: java.lang.Throwable -> L104
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L104
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L104
            if (r2 != 0) goto Lf5
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzz     // Catch: java.lang.Throwable -> L104
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()     // Catch: java.lang.Throwable -> L104
            java.lang.Object r2 = r3.zzb(r2)     // Catch: java.lang.Throwable -> L104
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L104
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L104
            if (r2 == 0) goto Lf8
        Lf5:
            r0.zzv()     // Catch: java.lang.Throwable -> L104
        Lf8:
            boolean r0 = r0.zzC()     // Catch: java.lang.Throwable -> L104
            if (r0 != 0) goto Lbc
            r9.remove()     // Catch: java.lang.Throwable -> L104
            goto Lbc
        L102:
            monitor-exit(r8)
            return r1
        L104:
            r9 = move-exception
            monitor-exit(r8)     // Catch: java.lang.Throwable -> L104
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzfkp.zzo(java.util.List):java.util.List");
    }

    private final synchronized void zzp(String str, zzfld zzfldVar) {
        zzfldVar.zzh();
        this.zza.put(str, zzfldVar);
    }

    public final synchronized void zzq(boolean z) {
        if (z) {
            for (zzfld zzfldVar : this.zza.values()) {
                zzfldVar.zzy();
            }
        } else {
            for (zzfld zzfldVar2 : this.zza.values()) {
                zzfldVar2.zzf.set(false);
            }
        }
    }

    public final synchronized void zzr(boolean z) {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzw)).booleanValue()) {
            zzq(z);
        }
    }

    private final synchronized boolean zzs(String str, AdFormat adFormat) {
        boolean z;
        Clock clock = this.zzg;
        long currentTimeMillis = clock.currentTimeMillis();
        zzfld zzm = zzm(str, adFormat);
        int i = 0;
        z = zzm != null && zzm.zzC();
        String str2 = null;
        Long valueOf = z ? Long.valueOf(clock.currentTimeMillis()) : null;
        zzfkt zzfktVar = new zzfkt(new zzfkr(str, adFormat), null);
        zzfkl zzfklVar = this.zzd;
        int i2 = zzm == null ? 0 : zzm.zze.zzd;
        if (zzm != null) {
            i = zzm.zzd();
        }
        if (zzm != null) {
            str2 = zzm.zzo();
        }
        zzfklVar.zzh(i2, i, currentTimeMillis, valueOf, str2, zzfktVar, "1");
        return z;
    }

    public final synchronized zzbaw zza(String str) {
        return (zzbaw) zzn(zzbaw.class, str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized com.google.android.gms.ads.internal.client.zzbx zzb(String str) {
        return (com.google.android.gms.ads.internal.client.zzbx) zzn(com.google.android.gms.ads.internal.client.zzbx.class, str, AdFormat.INTERSTITIAL);
    }

    public final synchronized zzbwv zzc(String str) {
        return (zzbwv) zzn(zzbwv.class, str, AdFormat.REWARDED);
    }

    public final void zzg(zzbpq zzbpqVar) {
        this.zzc.zzc(zzbpqVar);
    }

    public final synchronized void zzh(List list, com.google.android.gms.ads.internal.client.zzce zzceVar) {
        List<com.google.android.gms.ads.internal.client.zzfv> zzo = zzo(list);
        EnumMap enumMap = new EnumMap(AdFormat.class);
        for (com.google.android.gms.ads.internal.client.zzfv zzfvVar : zzo) {
            String str = zzfvVar.zza;
            AdFormat adFormat = AdFormat.getAdFormat(zzfvVar.zzb);
            zzfld zza = this.zzc.zza(zzfvVar, zzceVar);
            if (adFormat != null && zza != null) {
                AtomicInteger atomicInteger = this.zzh;
                if (atomicInteger != null) {
                    zza.zzx(atomicInteger.get());
                }
                zzfkl zzfklVar = this.zzd;
                zza.zzz(zzfklVar);
                zzp(zzd(str, adFormat), zza);
                enumMap.put((EnumMap) adFormat, (AdFormat) Integer.valueOf(((Integer) com.google.android.gms.ads.internal.util.client.zzf.zzi(enumMap, adFormat, 0)).intValue() + 1));
                zzfklVar.zzp(zzfvVar.zzd, this.zzg.currentTimeMillis(), new zzfkt(new zzfkr(str, adFormat), null), "1");
            }
        }
        this.zzd.zzo(enumMap, this.zzg.currentTimeMillis(), "1");
    }

    public final void zzi() {
        if (this.zzf == null) {
            synchronized (this) {
                if (this.zzf == null) {
                    try {
                        this.zzf = (ConnectivityManager) this.zze.getSystemService("connectivity");
                    } catch (ClassCastException e) {
                        int i = com.google.android.gms.ads.internal.util.zze.zza;
                        com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to get connectivity manager", e);
                    }
                }
            }
        }
        if (!PlatformVersion.isAtLeastO() || this.zzf == null) {
            this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzD)).intValue());
        } else {
            try {
                this.zzf.registerDefaultNetworkCallback(new zzfko(this));
            } catch (RuntimeException e2) {
                int i2 = com.google.android.gms.ads.internal.util.zze.zza;
                com.google.android.gms.ads.internal.util.client.zzo.zzk("Failed to register network callback", e2);
                this.zzh = new AtomicInteger(((Integer) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzD)).intValue());
            }
        }
        com.google.android.gms.ads.internal.zzv.zzb().zzc(new zzfkn(this));
    }

    public final synchronized boolean zzj(String str) {
        return zzs(str, AdFormat.APP_OPEN_AD);
    }

    public final synchronized boolean zzk(String str) {
        return zzs(str, AdFormat.INTERSTITIAL);
    }

    public final synchronized boolean zzl(String str) {
        return zzs(str, AdFormat.REWARDED);
    }
}
