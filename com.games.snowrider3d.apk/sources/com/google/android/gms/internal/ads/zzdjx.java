package com.google.android.gms.internal.ads;

import android.view.GestureDetector;
import android.view.MotionEvent;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzdjx implements GestureDetector.OnGestureListener {
    private final zzdio zza;
    private final zzdjp zzb;

    public zzdjx(zzdio zzdioVar, zzdjp zzdjpVar) {
        this.zza = zzdioVar;
        this.zzb = zzdjpVar;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(MotionEvent motionEvent) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0067 A[Catch: all -> 0x0074, TRY_LEAVE, TryCatch #0 {, blocks: (B:3:0x0001, B:6:0x0007, B:10:0x001b, B:13:0x002d, B:16:0x003f, B:19:0x0052, B:21:0x0061, B:23:0x0067), top: B:31:0x0001 }] */
    @Override // android.view.GestureDetector.OnGestureListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized boolean onFling(android.view.MotionEvent r7, android.view.MotionEvent r8, float r9, float r10) {
        /*
            r6 = this;
            monitor-enter(r6)
            com.google.android.gms.internal.ads.zzdio r0 = r6.zza     // Catch: java.lang.Throwable -> L74
            r1 = 0
            if (r0 != 0) goto L7
            goto L72
        L7:
            float r2 = java.lang.Math.abs(r9)     // Catch: java.lang.Throwable -> L74
            float r3 = java.lang.Math.abs(r10)     // Catch: java.lang.Throwable -> L74
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            r3 = -1
            r4 = 1148846080(0x447a0000, float:1000.0)
            r5 = 0
            if (r2 <= 0) goto L3b
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 <= 0) goto L29
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L74
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L74
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L74
            r3 = 1
            goto L61
        L29:
            int r10 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r10 >= 0) goto L60
            float r8 = r8.getX()     // Catch: java.lang.Throwable -> L74
            float r7 = r7.getX()     // Catch: java.lang.Throwable -> L74
            float r8 = r8 - r7
            float r8 = r8 / r9
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L74
            r3 = 2
            goto L61
        L3b:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 <= 0) goto L4e
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L74
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L74
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L74
            r3 = 8
            goto L61
        L4e:
            int r9 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r9 >= 0) goto L60
            float r8 = r8.getY()     // Catch: java.lang.Throwable -> L74
            float r7 = r7.getY()     // Catch: java.lang.Throwable -> L74
            float r8 = r8 - r7
            float r8 = r8 / r10
            float r8 = r8 * r4
            int r7 = (int) r8     // Catch: java.lang.Throwable -> L74
            r3 = 4
            goto L61
        L60:
            r7 = r1
        L61:
            int r8 = r0.zza()     // Catch: java.lang.Throwable -> L74
            if (r3 != r8) goto L72
            com.google.android.gms.internal.ads.zzdjp r8 = r6.zzb     // Catch: java.lang.Throwable -> L74
            android.widget.FrameLayout r8 = r8.zzr()     // Catch: java.lang.Throwable -> L74
            r0.zzF(r8, r7)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r6)
            return r1
        L72:
            monitor-exit(r6)
            return r1
        L74:
            r7 = move-exception
            monitor-exit(r6)     // Catch: java.lang.Throwable -> L74
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzdjx.onFling(android.view.MotionEvent, android.view.MotionEvent, float, float):boolean");
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        return false;
    }
}
