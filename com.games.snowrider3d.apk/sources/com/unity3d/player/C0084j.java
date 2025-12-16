package com.unity3d.player;

import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureRequest;
import com.unity3d.player.a.AbstractC0061q;
/* renamed from: com.unity3d.player.j */
/* loaded from: classes2.dex */
public final class C0084j extends CameraCaptureSession.StateCallback {
    public final /* synthetic */ C0094o a;

    public C0084j(C0094o c0094o) {
        this.a = c0094o;
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public void onConfigured(CameraCaptureSession cameraCaptureSession) {
        C0094o c0094o = this.a;
        if (c0094o.b == null) {
            return;
        }
        synchronized (c0094o.t) {
            C0094o c0094o2 = this.a;
            c0094o2.r = cameraCaptureSession;
            try {
                c0094o2.q = c0094o2.b.createCaptureRequest(1);
                C0094o c0094o3 = this.a;
                c0094o3.q.addTarget(c0094o3.w);
                C0094o c0094o4 = this.a;
                c0094o4.q.set(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, c0094o4.n);
                this.a.e();
            } catch (CameraAccessException e) {
                AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
            } catch (IllegalStateException e2) {
                AbstractC0061q.Log(6, "Camera2: IllegalStateException " + e2);
            }
        }
    }

    @Override // android.hardware.camera2.CameraCaptureSession.StateCallback
    public final void onConfigureFailed(CameraCaptureSession cameraCaptureSession) {
        this.a.A = 3;
        AbstractC0061q.Log(6, "Camera2: CaptureSession configuration failed.");
    }
}
