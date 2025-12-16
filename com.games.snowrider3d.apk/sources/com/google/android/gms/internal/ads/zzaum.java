package com.google.android.gms.internal.ads;

import java.util.HashMap;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzaum extends zzauk {
    public String zza;
    public long zzb;
    public String zzc;
    public String zzd;
    public String zze;

    public zzaum() {
        this.zza = "E";
        this.zzb = -1L;
        this.zzc = "E";
        this.zzd = "E";
        this.zze = "E";
    }

    public zzaum(String str) {
        String str2 = "E";
        this.zza = str2;
        long j = -1;
        this.zzb = -1L;
        this.zzc = str2;
        this.zzd = str2;
        this.zze = str2;
        HashMap zza = zza(str);
        if (zza != null) {
            this.zza = zza.get(0) == null ? str2 : (String) zza.get(0);
            this.zzb = zza.get(1) != null ? ((Long) zza.get(1)).longValue() : j;
            this.zzc = zza.get(2) == null ? str2 : (String) zza.get(2);
            this.zzd = zza.get(3) == null ? str2 : (String) zza.get(3);
            this.zze = zza.get(4) != null ? (String) zza.get(4) : str2;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzauk
    protected final HashMap zzb() {
        HashMap hashMap = new HashMap();
        hashMap.put(0, this.zza);
        hashMap.put(4, this.zze);
        hashMap.put(3, this.zzd);
        hashMap.put(2, this.zzc);
        hashMap.put(1, Long.valueOf(this.zzb));
        return hashMap;
    }
}
