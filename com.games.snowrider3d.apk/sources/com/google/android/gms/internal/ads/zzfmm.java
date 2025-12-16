package com.google.android.gms.internal.ads;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfmm {
    private static final Pattern zza = Pattern.compile("^[a-zA-Z0-9 ]+$");
    private final List zzb = new ArrayList();

    public final List zza() {
        return this.zzb;
    }

    public final void zzb(View view, zzfls zzflsVar, String str) {
        zzfml zzfmlVar;
        if (view != null) {
            if (zza.matcher("Ad overlay").matches()) {
                List list = this.zzb;
                Iterator it = list.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        zzfmlVar = null;
                        break;
                    }
                    zzfmlVar = (zzfml) it.next();
                    if (zzfmlVar.zzb().get() == view) {
                        break;
                    }
                }
                if (zzfmlVar != null) {
                    return;
                }
                list.add(new zzfml(view, zzflsVar, "Ad overlay"));
                return;
            }
            throw new IllegalArgumentException("FriendlyObstruction has detailed reason that contains characters not in [a-z][A-Z][0-9] or space");
        }
        throw new IllegalArgumentException("FriendlyObstruction is null");
    }

    public final void zzc() {
        this.zzb.clear();
    }
}
