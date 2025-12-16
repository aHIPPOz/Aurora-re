package com.google.android.gms.internal.ads;

import java.io.File;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzcdq extends zzcdn {
    public static final /* synthetic */ int zzd = 0;
    private static final Set zze = Collections.synchronizedSet(new HashSet());
    private static final DecimalFormat zzf = new DecimalFormat("#,###");
    private File zzg;
    private boolean zzh;

    public zzcdq(zzccb zzccbVar) {
        super(zzccbVar);
        File cacheDir = this.zza.getCacheDir();
        if (cacheDir == null) {
            int i = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Context.getCacheDir() returned null");
            return;
        }
        File file = new File(zzfqt.zza(zzfqs.zza(), cacheDir, "admobVideoStreams"));
        this.zzg = file;
        if (file.isDirectory() || this.zzg.mkdirs()) {
            if (this.zzg.setReadable(true, false) && this.zzg.setExecutable(true, false)) {
                return;
            }
            String valueOf = String.valueOf(this.zzg.getAbsolutePath());
            int i2 = com.google.android.gms.ads.internal.util.zze.zza;
            com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not set cache file permissions at ".concat(valueOf));
            this.zzg = null;
            return;
        }
        String valueOf2 = String.valueOf(this.zzg.getAbsolutePath());
        int i3 = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzj("Could not create preload cache directory at ".concat(valueOf2));
        this.zzg = null;
    }

    private final File zza(File file) {
        return new File(zzfqt.zza(zzfqs.zza(), this.zzg, String.valueOf(file.getName()).concat(".done")));
    }

    @Override // com.google.android.gms.internal.ads.zzcdn
    public final void zzf() {
        this.zzh = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x031d, code lost:
        r22 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x031f, code lost:
        r22.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0327, code lost:
        if (com.google.android.gms.ads.internal.util.zze.zzm(3) == false) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0329, code lost:
        com.google.android.gms.ads.internal.util.client.zzo.zze("Preloaded " + r14.format(r6) + " bytes from " + r27);
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x034a, code lost:
        r9.setReadable(true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x0353, code lost:
        if (r10.isFile() == false) goto L158;
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0355, code lost:
        r10.setLastModified(java.lang.System.currentTimeMillis());
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x035d, code lost:
        r10.createNewFile();
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x03a3  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x03da  */
    @Override // com.google.android.gms.internal.ads.zzcdn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean zzt(final java.lang.String r27) {
        /*
            Method dump skipped, instructions count: 1033
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzcdq.zzt(java.lang.String):boolean");
    }
}
