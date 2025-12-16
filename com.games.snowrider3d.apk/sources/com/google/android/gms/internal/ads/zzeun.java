package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Callable;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzeun implements zzeuc {
    private final zzgdy zza;
    private final Context zzb;

    public zzeun(zzgdy zzgdyVar, Context context) {
        this.zza = zzgdyVar;
        this.zzb = context;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:2|(2:5|3)|75|6|(3:73|11|(5:13|14|69|15|(18:17|20|21|(2:23|(2:25|(1:27))(1:28))|29|(2:32|(3:35|(3:38|(2:77|40)(1:41)|36)|76))|31|42|(2:44|(9:46|48|(9:71|50|(1:54)|55|58|(1:60)(1:61)|(1:63)(1:64)|65|66)(1:56)|57|58|(0)(0)|(0)(0)|65|66))|47|48|(0)(0)|57|58|(0)(0)|(0)(0)|65|66)(17:18|21|(0)|29|(0)|31|42|(0)|47|48|(0)(0)|57|58|(0)(0)|(0)(0)|65|66)))|8|14|69|15|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00b0, code lost:
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096 A[Catch: Exception -> 0x00b0, TRY_LEAVE, TryCatch #0 {Exception -> 0x00b0, blocks: (B:15:0x008a, B:17:0x0096), top: B:69:0x008a }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static /* synthetic */ com.google.android.gms.internal.ads.zzeul zzc(com.google.android.gms.internal.ads.zzeun r27) {
        /*
            Method dump skipped, instructions count: 484
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzeun.zzc(com.google.android.gms.internal.ads.zzeun):com.google.android.gms.internal.ads.zzeul");
    }

    private static ResolveInfo zzd(PackageManager packageManager, String str) {
        return packageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)), 65536);
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 38;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        return this.zza.zzb(new Callable() { // from class: com.google.android.gms.internal.ads.zzeum
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return zzeun.zzc(zzeun.this);
            }
        });
    }
}
