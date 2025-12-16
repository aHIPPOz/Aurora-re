package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzhgj {
    public static zzhgj zzb(Class cls) {
        if (System.getProperty("java.vm.name").equalsIgnoreCase("Dalvik")) {
            return new zzhge(cls.getSimpleName());
        }
        return new zzhgg(cls.getSimpleName());
    }

    public abstract void zza(String str);
}
