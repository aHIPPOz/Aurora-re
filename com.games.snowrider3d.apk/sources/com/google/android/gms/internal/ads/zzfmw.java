package com.google.android.gms.internal.ads;

import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.IdentityHashMap;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfmw implements zzfmu {
    private final zzfmu zza;

    public zzfmw(zzfmu zzfmuVar) {
        this.zza = zzfmuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final JSONObject zza(View view) {
        boolean z = false;
        JSONObject zza = zzfne.zza(0, 0, 0, 0);
        int zzb = zzfnh.zzb();
        int i = zzb - 1;
        if (zzb == 0) {
            throw null;
        }
        if (i == 0) {
            z = true;
        }
        try {
            zza.put("noOutputDevice", z);
            return zza;
        } catch (JSONException e) {
            zzfnf.zza("Error with setting output device status", e);
            return zza;
        }
    }

    @Override // com.google.android.gms.internal.ads.zzfmu
    public final void zzb(View view, JSONObject jSONObject, zzfmt zzfmtVar, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        zzfmi zza = zzfmi.zza();
        if (zza != null) {
            Collection<zzflp> zzb = zza.zzb();
            int size = zzb.size();
            IdentityHashMap identityHashMap = new IdentityHashMap(size + size + 3);
            for (zzflp zzflpVar : zzb) {
                View zzf = zzflpVar.zzf();
                if (zzf != null && zzf.isAttachedToWindow() && zzf.isShown()) {
                    View view2 = zzf;
                    while (true) {
                        if (view2 != null) {
                            if (view2.getAlpha() != 0.0f) {
                                ViewParent parent = view2.getParent();
                                view2 = parent instanceof View ? (View) parent : null;
                            }
                        } else {
                            View rootView = zzf.getRootView();
                            if (rootView != null && !identityHashMap.containsKey(rootView)) {
                                identityHashMap.put(rootView, rootView);
                                float z3 = rootView.getZ();
                                int size2 = arrayList.size();
                                while (size2 > 0) {
                                    int i = size2 - 1;
                                    if (((View) arrayList.get(i)).getZ() <= z3) {
                                        break;
                                    }
                                    size2 = i;
                                }
                                arrayList.add(size2, rootView);
                            }
                        }
                    }
                }
            }
        }
        int size3 = arrayList.size();
        for (int i2 = 0; i2 < size3; i2++) {
            zzfmtVar.zza((View) arrayList.get(i2), this.zza, jSONObject, z2);
        }
    }
}
