package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.RequestConfiguration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
/* compiled from: com.google.android.gms:play-services-ads-api@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfwe {
    private final zzfwd zza;

    private zzfwe(zzfwd zzfwdVar) {
        int i = zzfuz.zzb;
        this.zza = zzfwdVar;
    }

    public static zzfwe zza(int i) {
        return new zzfwe(new zzfwd(4000) { // from class: com.google.android.gms.internal.ads.zzfvv
            @Override // com.google.android.gms.internal.ads.zzfwd
            public final Iterator zza(zzfwe zzfweVar, CharSequence charSequence) {
                return new zzfwa(zzfweVar, charSequence, 4000);
            }
        });
    }

    public static zzfwe zzb(final zzfva zzfvaVar) {
        return new zzfwe(new zzfwd() { // from class: com.google.android.gms.internal.ads.zzfvw
            @Override // com.google.android.gms.internal.ads.zzfwd
            public final Iterator zza(zzfwe zzfweVar, CharSequence charSequence) {
                return new zzfvy(zzfweVar, charSequence, zzfva.this);
            }
        });
    }

    public static zzfwe zzc(Pattern pattern) {
        final zzfvg zzfvgVar = new zzfvg(pattern);
        zzfvp.zzi(!((zzfvf) zzfvgVar.zza(RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED)).zza.matches(), "The pattern may not match the empty string: %s", zzfvgVar);
        return new zzfwe(new zzfwd() { // from class: com.google.android.gms.internal.ads.zzfvx
            @Override // com.google.android.gms.internal.ads.zzfwd
            public final Iterator zza(zzfwe zzfweVar, CharSequence charSequence) {
                return new zzfvz(zzfweVar, charSequence, zzfvc.this.zza(charSequence));
            }
        });
    }

    public final Iterator zzg(CharSequence charSequence) {
        return this.zza.zza(this, charSequence);
    }

    public final Iterable zzd(CharSequence charSequence) {
        charSequence.getClass();
        return new zzfwb(this, charSequence);
    }

    public final List zzf(CharSequence charSequence) {
        charSequence.getClass();
        Iterator zzg = zzg(charSequence);
        ArrayList arrayList = new ArrayList();
        while (zzg.hasNext()) {
            arrayList.add((String) zzg.next());
        }
        return Collections.unmodifiableList(arrayList);
    }
}
