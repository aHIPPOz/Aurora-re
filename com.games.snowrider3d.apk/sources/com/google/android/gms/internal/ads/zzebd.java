package com.google.android.gms.internal.ads;

import java.util.Objects;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzebd implements zzgdj {
    final /* synthetic */ boolean zza;
    final /* synthetic */ zzebe zzb;

    public zzebd(zzebe zzebeVar, boolean z) {
        this.zza = z;
        Objects.requireNonNull(zzebeVar);
        this.zzb = zzebeVar;
    }

    @Override // com.google.android.gms.internal.ads.zzgdj
    public final void zza(Throwable th) {
        int i = com.google.android.gms.ads.internal.util.zze.zza;
        com.google.android.gms.ads.internal.util.client.zzo.zzg("Failed to get signals bundle");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:22:0x005d  */
    @Override // com.google.android.gms.internal.ads.zzgdj
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* bridge */ /* synthetic */ void zzb(java.lang.Object r9) {
        /*
            r8 = this;
            com.google.android.gms.internal.ads.zzebe r0 = r8.zzb
            com.google.android.gms.internal.ads.zzcva r9 = (com.google.android.gms.internal.ads.zzcva) r9
            boolean r1 = r0.zzf()
            if (r1 == 0) goto Lb
            return
        Lb:
            android.os.Bundle r9 = r9.zza
            java.lang.String r1 = "ad_types"
            java.lang.Object r1 = r9.get(r1)
            boolean r2 = r1 instanceof java.util.List
            if (r2 == 0) goto L1a
            java.util.List r1 = (java.util.List) r1
            goto L24
        L1a:
            boolean r2 = r1 instanceof java.lang.String[]
            if (r2 == 0) goto L4a
            java.lang.String[] r1 = (java.lang.String[]) r1
            java.util.List r1 = java.util.Arrays.asList(r1)
        L24:
            java.util.ArrayList r2 = new java.util.ArrayList
            int r3 = r1.size()
            r2.<init>(r3)
            java.util.Iterator r1 = r1.iterator()
        L31:
            boolean r3 = r1.hasNext()
            if (r3 == 0) goto L45
            java.lang.Object r3 = r1.next()
            boolean r4 = r3 instanceof java.lang.String
            if (r4 == 0) goto L31
            java.lang.String r3 = (java.lang.String) r3
            r2.add(r3)
            goto L31
        L45:
            java.util.List r1 = java.util.Collections.unmodifiableList(r2)
            goto L4e
        L4a:
            java.util.List r1 = java.util.Collections.emptyList()
        L4e:
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            java.util.Iterator r1 = r1.iterator()
        L57:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            int r3 = r2.hashCode()
            r4 = 3
            r6 = 2
            r7 = 1
            switch(r3) {
                case -1396342996: goto L8c;
                case -1052618729: goto L82;
                case -239580146: goto L78;
                case 604727084: goto L6e;
                default: goto L6d;
            }
        L6d:
            goto L96
        L6e:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = r7
            goto L97
        L78:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = r4
            goto L97
        L82:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = r6
            goto L97
        L8c:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L96
            r2 = 0
            goto L97
        L96:
            r2 = -1
        L97:
            if (r2 == 0) goto Lab
            if (r2 == r7) goto La8
            if (r2 == r6) goto La5
            if (r2 == r4) goto La2
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.AD_FORMAT_TYPE_UNSPECIFIED
            goto Lad
        La2:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.REWARD_BASED_VIDEO_AD
            goto Lad
        La5:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.NATIVE_APP_INSTALL
            goto Lad
        La8:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.INTERSTITIAL
            goto Lad
        Lab:
            com.google.android.gms.internal.ads.zzbcj$zzd$zza r2 = com.google.android.gms.internal.ads.zzbcj.zzd.zza.BANNER
        Lad:
            r5.add(r2)
            goto L57
        Lb1:
            com.google.android.gms.internal.ads.zzbcj$zzaf$zzd r7 = com.google.android.gms.internal.ads.zzebe.zzb(r0, r9)
            com.google.android.gms.internal.ads.zzbcj$zzab r6 = com.google.android.gms.internal.ads.zzebe.zza(r0, r9)
            boolean r4 = r8.zza
            com.google.android.gms.internal.ads.zzebc r2 = new com.google.android.gms.internal.ads.zzebc
            r3 = r8
            r2.<init>()
            com.google.android.gms.internal.ads.zzeas r9 = r0.zza
            r9.zza(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzebd.zzb(java.lang.Object):void");
    }
}
