package com.google.android.gms.internal.ads;

import java.util.HashSet;
import org.json.JSONObject;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfnx extends zzfnt {
    public zzfnx(zzfnm zzfnmVar, HashSet hashSet, JSONObject jSONObject, long j) {
        super(zzfnmVar, hashSet, jSONObject, j);
    }

    private final void zzc(String str) {
        zzfmi zza = zzfmi.zza();
        if (zza != null) {
            for (zzflp zzflpVar : zza.zzc()) {
                if (this.zza.contains(zzflpVar.zzh())) {
                    zzflpVar.zzg().zzd(str, this.zzc);
                }
            }
        }
    }

    @Override // android.os.AsyncTask
    protected final /* synthetic */ Object doInBackground(Object[] objArr) {
        return this.zzb.toString();
    }

    @Override // com.google.android.gms.internal.ads.zzfnu, android.os.AsyncTask
    protected final /* synthetic */ void onPostExecute(Object obj) {
        String str = (String) obj;
        zzc(str);
        super.onPostExecute(str);
    }

    @Override // com.google.android.gms.internal.ads.zzfnu
    public final void zza(String str) {
        zzc(str);
        super.onPostExecute(str);
    }
}
