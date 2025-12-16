package com.google.android.gms.internal.nearby;

import java.util.logging.Logger;
import javax.annotation.CheckForNull;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzsf {
    private static final Logger zza = Logger.getLogger(zzsf.class.getName());
    private static final zzse zzb = new zzse(null);

    private zzsf() {
    }

    public static boolean zza(@CheckForNull String str) {
        return str == null || str.isEmpty();
    }
}
