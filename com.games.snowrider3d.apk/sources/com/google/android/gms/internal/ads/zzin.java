package com.google.android.gms.internal.ads;

import android.os.Bundle;
import java.io.IOException;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzin extends zzba {
    public final int zzc;
    public final String zzd;
    public final int zze;
    public final zzz zzf;
    public final int zzg;
    public final zzvh zzh;
    final boolean zzi;

    private zzin(int i, Throwable th, int i2) {
        this(i, th, null, i2, null, -1, null, 4, null, false);
    }

    public static zzin zzb(Throwable th, String str, int i, zzz zzzVar, int i2, zzvh zzvhVar, boolean z, int i3) {
        if (zzzVar == null) {
            i2 = 4;
        }
        return new zzin(1, th, null, i3, str, i, zzzVar, i2, zzvhVar, z);
    }

    public static zzin zzc(IOException iOException, int i) {
        return new zzin(0, iOException, i);
    }

    public static zzin zzd(RuntimeException runtimeException, int i) {
        return new zzin(2, runtimeException, i);
    }

    public final zzin zza(zzvh zzvhVar) {
        String message = getMessage();
        String str = zzex.zza;
        return new zzin(message, getCause(), this.zza, this.zzc, this.zzd, this.zze, this.zzf, this.zzg, zzvhVar, this.zzb, this.zzi);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private zzin(int r14, java.lang.Throwable r15, java.lang.String r16, int r17, java.lang.String r18, int r19, com.google.android.gms.internal.ads.zzz r20, int r21, com.google.android.gms.internal.ads.zzvh r22, boolean r23) {
        /*
            r13 = this;
            r8 = r21
            if (r14 == 0) goto L5e
            r0 = 1
            if (r14 == r0) goto Le
            java.lang.String r0 = "Unexpected runtime error"
            r5 = r18
            r6 = r19
            goto L64
        Le:
            java.lang.String r1 = java.lang.String.valueOf(r20)
            java.lang.String r2 = com.google.android.gms.internal.ads.zzex.zza
            if (r8 == 0) goto L33
            if (r8 == r0) goto L30
            r0 = 2
            if (r8 == r0) goto L2d
            r0 = 3
            if (r8 == r0) goto L2a
            r0 = 4
            if (r8 != r0) goto L24
            java.lang.String r0 = "YES"
            goto L35
        L24:
            java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
            r14.<init>()
            throw r14
        L2a:
            java.lang.String r0 = "NO_EXCEEDS_CAPABILITIES"
            goto L35
        L2d:
            java.lang.String r0 = "NO_UNSUPPORTED_DRM"
            goto L35
        L30:
            java.lang.String r0 = "NO_UNSUPPORTED_TYPE"
            goto L35
        L33:
            java.lang.String r0 = "NO"
        L35:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            r5 = r18
            r2.append(r5)
            java.lang.String r3 = " error, index="
            r2.append(r3)
            r6 = r19
            r2.append(r6)
            java.lang.String r3 = ", format="
            r2.append(r3)
            r2.append(r1)
            java.lang.String r1 = ", format_supported="
            r2.append(r1)
            r2.append(r0)
            java.lang.String r0 = r2.toString()
            goto L64
        L5e:
            r5 = r18
            r6 = r19
            java.lang.String r0 = "Source error"
        L64:
            r1 = 0
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L71
            java.lang.String r1 = ": null"
            java.lang.String r0 = r0.concat(r1)
        L71:
            r1 = r0
            long r10 = android.os.SystemClock.elapsedRealtime()
            r0 = r13
            r4 = r14
            r2 = r15
            r3 = r17
            r7 = r20
            r9 = r22
            r12 = r23
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzin.<init>(int, java.lang.Throwable, java.lang.String, int, java.lang.String, int, com.google.android.gms.internal.ads.zzz, int, com.google.android.gms.internal.ads.zzvh, boolean):void");
    }

    private zzin(String str, Throwable th, int i, int i2, String str2, int i3, zzz zzzVar, int i4, zzvh zzvhVar, long j, boolean z) {
        super(str, th, i, Bundle.EMPTY, j);
        boolean z2;
        boolean z3 = false;
        if (!z) {
            z2 = true;
        } else if (i2 == 1) {
            i2 = 1;
            z2 = true;
        } else {
            z2 = false;
        }
        zzdd.zzd(z2);
        zzdd.zzd(th != null ? true : z3);
        this.zzc = i2;
        this.zzd = str2;
        this.zze = i3;
        this.zzf = zzzVar;
        this.zzg = i4;
        this.zzh = zzvhVar;
        this.zzi = z;
    }
}
