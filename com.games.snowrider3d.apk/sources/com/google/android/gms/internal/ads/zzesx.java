package com.google.android.gms.internal.ads;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzesx implements zzeub {
    private zzfsa zza;
    private zzfsa zzb;
    private boolean zzc;
    private boolean zzd;
    private final boolean zze = false;
    private final boolean zzf;

    public zzesx(zzfsa zzfsaVar, zzfsa zzfsaVar2, boolean z, boolean z2, boolean z3) {
        this.zza = zzfsaVar;
        this.zzb = zzfsaVar2;
        this.zzc = z;
        this.zzd = z2;
        this.zzf = z3;
    }

    public zzesx(boolean z) {
        this.zzf = z;
    }

    @Override // com.google.android.gms.internal.ads.zzeub
    public final /* synthetic */ void zza(Object obj) {
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0038, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzdq)).booleanValue() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0040, code lost:
        if (r6.zza.zzc() == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        r1.putString("paidv1_id_android", r6.zza.zzb());
        r1.putLong("paidv1_creation_time_android", r6.zza.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzdp)).booleanValue() == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x007e, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzdr)).booleanValue() != false) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0086, code lost:
        if (r6.zzb.zzc() == false) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0088, code lost:
        r1.putString("paidv2_id_android", r6.zzb.zzb());
        r1.putLong("paidv2_creation_time_android", r6.zzb.zza());
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009e, code lost:
        r1.putBoolean("paidv2_pub_option_android", r6.zzc);
        r1.putBoolean("paidv2_user_option_android", r6.zzd);
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0024, code lost:
        if (((java.lang.Boolean) com.google.android.gms.ads.internal.client.zzbd.zzc().zzb(com.google.android.gms.internal.ads.zzbde.zzdo)).booleanValue() == false) goto L8;
     */
    @Override // com.google.android.gms.internal.ads.zzeub
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r7) {
        /*
            r6 = this;
            com.google.android.gms.internal.ads.zzcva r7 = (com.google.android.gms.internal.ads.zzcva) r7
            android.os.Bundle r7 = r7.zza
            boolean r0 = r6.zze
            if (r0 == 0) goto La
            goto Lb5
        La:
            java.lang.String r0 = "pii"
            android.os.Bundle r1 = com.google.android.gms.internal.ads.zzfdk.zza(r7, r0)
            boolean r2 = r6.zzf
            if (r2 != 0) goto L26
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzdo
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L3a
        L26:
            if (r2 == 0) goto L58
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzdq
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 == 0) goto L58
        L3a:
            com.google.android.gms.internal.ads.zzfsa r3 = r6.zza
            boolean r3 = r3.zzc()
            if (r3 == 0) goto L58
            com.google.android.gms.internal.ads.zzfsa r3 = r6.zza
            java.lang.String r3 = r3.zzb()
            java.lang.String r4 = "paidv1_id_android"
            r1.putString(r4, r3)
            com.google.android.gms.internal.ads.zzfsa r3 = r6.zza
            long r3 = r3.zza()
            java.lang.String r5 = "paidv1_creation_time_android"
            r1.putLong(r5, r3)
        L58:
            if (r2 != 0) goto L6c
            com.google.android.gms.internal.ads.zzbcv r3 = com.google.android.gms.internal.ads.zzbde.zzdp
            com.google.android.gms.internal.ads.zzbdc r4 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r3 = r4.zzb(r3)
            java.lang.Boolean r3 = (java.lang.Boolean) r3
            boolean r3 = r3.booleanValue()
            if (r3 != 0) goto L80
        L6c:
            if (r2 == 0) goto Lac
            com.google.android.gms.internal.ads.zzbcv r2 = com.google.android.gms.internal.ads.zzbde.zzdr
            com.google.android.gms.internal.ads.zzbdc r3 = com.google.android.gms.ads.internal.client.zzbd.zzc()
            java.lang.Object r2 = r3.zzb(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto Lac
        L80:
            com.google.android.gms.internal.ads.zzfsa r2 = r6.zzb
            boolean r2 = r2.zzc()
            if (r2 == 0) goto L9e
            com.google.android.gms.internal.ads.zzfsa r2 = r6.zzb
            java.lang.String r2 = r2.zzb()
            java.lang.String r3 = "paidv2_id_android"
            r1.putString(r3, r2)
            com.google.android.gms.internal.ads.zzfsa r2 = r6.zzb
            long r2 = r2.zza()
            java.lang.String r4 = "paidv2_creation_time_android"
            r1.putLong(r4, r2)
        L9e:
            boolean r2 = r6.zzc
            java.lang.String r3 = "paidv2_pub_option_android"
            r1.putBoolean(r3, r2)
            boolean r2 = r6.zzd
            java.lang.String r3 = "paidv2_user_option_android"
            r1.putBoolean(r3, r2)
        Lac:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto Lb5
            r7.putBundle(r0, r1)
        Lb5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzesx.zzb(java.lang.Object):void");
    }
}
