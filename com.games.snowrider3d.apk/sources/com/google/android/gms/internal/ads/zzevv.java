package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.common.util.concurrent.ListenableFuture;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzevv implements zzeuc {
    private final JSONObject zza;

    public zzevv(Context context) {
        this.zza = zzbvm.zzc(context, VersionInfoParcel.forPackage());
    }

    public static /* synthetic */ void zzc(zzevv zzevvVar, JSONObject jSONObject) {
        try {
            jSONObject.put("gms_sdk_env", zzevvVar.zza);
        } catch (JSONException unused) {
            com.google.android.gms.ads.internal.util.zze.zza("Failed putting version constants.");
        }
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final int zza() {
        return 46;
    }

    @Override // com.google.android.gms.internal.ads.zzeuc
    public final ListenableFuture zzb() {
        if (((Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(zzbde.zzms)).booleanValue()) {
            return zzgdn.zzh(new zzeub() { // from class: com.google.android.gms.internal.ads.zzevt
                @Override // com.google.android.gms.internal.ads.zzeub
                public final /* synthetic */ void zza(Object obj) {
                }

                @Override // com.google.android.gms.internal.ads.zzeub
                public final void zzb(Object obj) {
                    JSONObject jSONObject = (JSONObject) obj;
                }
            });
        }
        return zzgdn.zzh(new zzeub() { // from class: com.google.android.gms.internal.ads.zzevu
            @Override // com.google.android.gms.internal.ads.zzeub
            public final /* synthetic */ void zza(Object obj) {
            }

            @Override // com.google.android.gms.internal.ads.zzeub
            public final void zzb(Object obj) {
                zzevv.zzc(zzevv.this, (JSONObject) obj);
            }
        });
    }
}
