package com.google.android.gms.internal.consent_sdk;

import com.google.android.ump.ConsentInformation;
/* compiled from: com.google.android.ump:user-messaging-platform@@3.2.0 */
/* loaded from: classes2.dex */
public final class zzy {
    private final zzz zza;
    private final zzcl zzb;
    private int zzc = 0;
    private ConsentInformation.PrivacyOptionsRequirementStatus zzd = ConsentInformation.PrivacyOptionsRequirementStatus.UNKNOWN;

    public zzy(zzz zzzVar, zzcl zzclVar) {
        this.zza = zzzVar;
        this.zzb = zzclVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.android.gms.internal.consent_sdk.zzab zza() throws com.google.android.gms.internal.consent_sdk.zzg {
        /*
            r12 = this;
            com.google.android.gms.internal.consent_sdk.zzcl r0 = r12.zzb
            int r1 = r0.zzf
            r2 = 8
            r3 = 0
            r4 = 1
            if (r1 != r2) goto Lc
            r2 = r4
            goto Ld
        Lc:
            r2 = r3
        Ld:
            com.google.android.gms.internal.consent_sdk.zzz r5 = r12.zza
            com.google.android.gms.internal.consent_sdk.zzaq r6 = com.google.android.gms.internal.consent_sdk.zzz.zzc(r5)
            r6.zzh(r2)
            int r2 = r1 + (-1)
            r6 = 0
            if (r1 == 0) goto Lce
            java.lang.String r1 = "Invalid response from server."
            r7 = 3
            r8 = 2
            switch(r2) {
                case 1: goto L52;
                case 2: goto L52;
                case 3: goto L52;
                case 4: goto L4f;
                case 5: goto L4c;
                case 6: goto L3a;
                case 7: goto L28;
                default: goto L22;
            }
        L22:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r0.<init>(r4, r1)
            throw r0
        L28:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Publisher misconfiguration: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r7, r0)
            throw r1
        L3a:
            com.google.android.gms.internal.consent_sdk.zzg r1 = new com.google.android.gms.internal.consent_sdk.zzg
            java.lang.String r0 = r0.zzc
            java.lang.String r0 = java.lang.String.valueOf(r0)
            java.lang.String r2 = "Invalid response from server: "
            java.lang.String r0 = r2.concat(r0)
            r1.<init>(r4, r0)
            throw r1
        L4c:
            r12.zzc = r4
            goto L54
        L4f:
            r12.zzc = r8
            goto L54
        L52:
            r12.zzc = r7
        L54:
            int r2 = r0.zzg
            int r7 = r2 + (-1)
            if (r2 == 0) goto Lcd
            if (r7 == r4) goto L69
            if (r7 != r8) goto L63
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.NOT_REQUIRED
            r12.zzd = r1
            goto L6d
        L63:
            com.google.android.gms.internal.consent_sdk.zzg r0 = new com.google.android.gms.internal.consent_sdk.zzg
            r0.<init>(r4, r1)
            throw r0
        L69:
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r1 = com.google.android.ump.ConsentInformation.PrivacyOptionsRequirementStatus.REQUIRED
            r12.zzd = r1
        L6d:
            java.lang.String r1 = r0.zza
            if (r1 != 0) goto L73
            r2 = r6
            goto L7a
        L73:
            com.google.android.gms.internal.consent_sdk.zzbq r2 = new com.google.android.gms.internal.consent_sdk.zzbq
            java.lang.String r7 = r0.zzb
            r2.<init>(r7, r1)
        L7a:
            com.google.android.gms.internal.consent_sdk.zzaq r1 = com.google.android.gms.internal.consent_sdk.zzz.zzc(r5)
            java.util.HashSet r7 = new java.util.HashSet
            java.util.List r9 = r0.zzd
            r7.<init>(r9)
            r1.zzj(r7)
            java.util.List r0 = r0.zze
            java.util.Iterator r0 = r0.iterator()
        L8e:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto Lc3
            java.lang.Object r1 = r0.next()
            com.google.android.gms.internal.consent_sdk.zzck r1 = (com.google.android.gms.internal.consent_sdk.zzck) r1
            int r7 = r1.zzb
            int r9 = r7 + (-1)
            if (r7 == 0) goto Lc2
            if (r9 == 0) goto Lad
            if (r9 == r4) goto Laa
            if (r9 == r8) goto La7
            goto Lad
        La7:
            java.lang.String r7 = "clear"
            goto Lae
        Laa:
            java.lang.String r7 = "write"
            goto Lae
        Lad:
            r7 = r6
        Lae:
            if (r7 == 0) goto L8e
            com.google.android.gms.internal.consent_sdk.zze r9 = com.google.android.gms.internal.consent_sdk.zzz.zza(r5)
            java.lang.String r1 = r1.zza
            com.google.android.gms.internal.consent_sdk.zzd[] r10 = new com.google.android.gms.internal.consent_sdk.zzd[r4]
            com.google.android.gms.internal.consent_sdk.zzao r11 = com.google.android.gms.internal.consent_sdk.zzz.zzb(r5)
            r10[r3] = r11
            r9.zzb(r7, r1, r10)
            goto L8e
        Lc2:
            throw r6
        Lc3:
            com.google.android.gms.internal.consent_sdk.zzab r0 = new com.google.android.gms.internal.consent_sdk.zzab
            int r1 = r12.zzc
            com.google.android.ump.ConsentInformation$PrivacyOptionsRequirementStatus r3 = r12.zzd
            r0.<init>(r1, r3, r2, r6)
            return r0
        Lcd:
            throw r6
        Lce:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.consent_sdk.zzy.zza():com.google.android.gms.internal.consent_sdk.zzab");
    }
}
