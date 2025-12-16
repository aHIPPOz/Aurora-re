package com.google.android.gms.internal.ads;

import android.os.AsyncTask;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public abstract class zzfnu extends AsyncTask {
    private zzfnv zza;
    protected final zzfnm zzd;

    public zzfnu(zzfnm zzfnmVar) {
        this.zzd = zzfnmVar;
    }

    /* renamed from: zza */
    public void onPostExecute(String str) {
        zzfnv zzfnvVar = this.zza;
        if (zzfnvVar != null) {
            zzfnvVar.zza(this);
        }
    }

    public final void zzb(zzfnv zzfnvVar) {
        this.zza = zzfnvVar;
    }
}
