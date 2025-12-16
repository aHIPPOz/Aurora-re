package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Map;
import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzwg implements zzzv, zzuw {
    final /* synthetic */ zzwl zza;
    private final Uri zzc;
    private final zzhi zzd;
    private final zzwa zze;
    private final zzady zzf;
    private final zzdm zzg;
    private volatile boolean zzi;
    private long zzk;
    private zzafb zzm;
    private boolean zzn;
    private final zzaer zzh = new zzaer();
    private boolean zzj = true;
    private final long zzb = zzuy.zza();
    private zzgo zzl = zzi(0);

    public zzwg(zzwl zzwlVar, Uri uri, zzgj zzgjVar, zzwa zzwaVar, zzady zzadyVar, zzdm zzdmVar) {
        Objects.requireNonNull(zzwlVar);
        this.zza = zzwlVar;
        this.zzc = uri;
        this.zzd = new zzhi(zzgjVar);
        this.zze = zzwaVar;
        this.zzf = zzadyVar;
        this.zzg = zzdmVar;
    }

    public static /* bridge */ /* synthetic */ void zzf(zzwg zzwgVar, long j, long j2) {
        zzwgVar.zzh.zza = j;
        zzwgVar.zzk = j2;
        zzwgVar.zzj = true;
        zzwgVar.zzn = false;
    }

    private final zzgo zzi(long j) {
        Map map;
        zzgm zzgmVar = new zzgm();
        zzgmVar.zzd(this.zzc);
        zzgmVar.zzc(j);
        zzgmVar.zza(6);
        map = zzwl.zzb;
        zzgmVar.zzb(map);
        return zzgmVar.zze();
    }

    @Override // com.google.android.gms.internal.ads.zzzv
    public final void zzg() {
        this.zzi = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:111:0x0190 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0200 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01c7 A[EDGE_INSN: B:124:0x01c7->B:86:0x01c7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e5 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0101 A[Catch: all -> 0x01e1, TRY_LEAVE, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0135 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0149 A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x017f A[Catch: all -> 0x01e1, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0186 A[Catch: all -> 0x01e1, TRY_LEAVE, TryCatch #1 {all -> 0x01e1, blocks: (B:27:0x006c, B:29:0x0084, B:32:0x0098, B:34:0x00a3, B:36:0x00af, B:38:0x00b9, B:40:0x00c5, B:42:0x00cf, B:44:0x00db, B:46:0x00e5, B:48:0x00f7, B:50:0x0101, B:51:0x0107, B:55:0x0111, B:57:0x0125, B:60:0x0135, B:61:0x013c, B:63:0x0149, B:65:0x0151, B:67:0x016c, B:69:0x017f, B:70:0x0182, B:72:0x0186), top: B:107:0x006c }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01e8  */
    @Override // com.google.android.gms.internal.ads.zzzv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void zzh() throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 513
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzwg.zzh():void");
    }

    @Override // com.google.android.gms.internal.ads.zzuw
    public final void zza(zzen zzenVar) {
        long j;
        long zzS;
        if (!this.zzn) {
            j = this.zzk;
        } else {
            zzS = this.zza.zzS(true);
            j = Math.max(zzS, this.zzk);
        }
        int zza = zzenVar.zza();
        zzafb zzafbVar = this.zzm;
        zzafbVar.getClass();
        zzafbVar.zzr(zzenVar, zza);
        zzafbVar.zzt(j, 1, zza, 0, null);
        this.zzn = true;
    }
}
