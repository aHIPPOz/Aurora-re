package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdxg implements zzhgr {
    private final zzhha zza;

    private zzdxg(zzhha zzhhaVar) {
        this.zza = zzhhaVar;
    }

    public static zzdxg zza(zzhha zzhhaVar) {
        return new zzdxg(zzhhaVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
        if (android.text.TextUtils.isEmpty(r1) != false) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0036, code lost:
        if (android.text.TextUtils.isEmpty(r1) == false) goto L13;
     */
    @Override // com.google.android.gms.internal.ads.zzhhg, com.google.android.gms.internal.ads.zzhhf
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ java.lang.Object zzb() {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.zzhha r0 = r4.zza
            com.google.android.gms.internal.ads.zzcvp r0 = (com.google.android.gms.internal.ads.zzcvp) r0
            com.google.android.gms.internal.ads.zzfcw r0 = r0.zzc()
            r1 = r0
            com.google.android.gms.internal.ads.zzfcw r1 = (com.google.android.gms.internal.ads.zzfcw) r1
            com.google.android.gms.internal.ads.zzbcv r1 = com.google.android.gms.internal.ads.zzbde.zzhy
            com.google.android.gms.internal.ads.zzbdc r2 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r1 = r2.zzb(r1)
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L50
            com.google.android.gms.ads.internal.client.zzm r1 = r0.zzd
            java.lang.String r1 = r1.zzx
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "request_id"
            if (r2 != 0) goto L39
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: org.json.JSONException -> L39
            r2.<init>(r1)     // Catch: org.json.JSONException -> L39
            java.lang.String r1 = r2.getString(r3)     // Catch: org.json.JSONException -> L39
            boolean r2 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L39
            if (r2 != 0) goto L39
            goto L60
        L39:
            com.google.android.gms.ads.internal.client.zzm r0 = r0.zzd
            com.google.android.gms.ads.internal.client.zzc r0 = r0.zzs
            if (r0 == 0) goto L50
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch: org.json.JSONException -> L50
            java.lang.String r0 = r0.zza     // Catch: org.json.JSONException -> L50
            r1.<init>(r0)     // Catch: org.json.JSONException -> L50
            java.lang.String r1 = r1.getString(r3)     // Catch: org.json.JSONException -> L50
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: org.json.JSONException -> L50
            if (r0 == 0) goto L60
        L50:
            java.util.Random r0 = com.google.android.gms.ads.internal.client.zzbb.zze()
            int r0 = r0.nextInt()
            r1 = 2147483647(0x7fffffff, float:NaN)
            r0 = r0 & r1
            java.lang.String r1 = java.lang.String.valueOf(r0)
        L60:
            com.google.android.gms.internal.ads.zzhgz.zzb(r1)
            r0 = r1
            java.lang.String r0 = (java.lang.String) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdxg.zzb():java.lang.Object");
    }
}
