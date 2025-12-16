package com.unity3d.player;

import android.hardware.camera2.CameraDevice;
import com.unity3d.player.a.AbstractC0061q;
/* renamed from: com.unity3d.player.k */
/* loaded from: classes2.dex */
public final class C0086k extends CameraDevice.StateCallback {
    public final /* synthetic */ C0094o a;

    public C0086k(C0094o c0094o) {
        this.a = c0094o;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        this.a.b = cameraDevice;
        C0094o.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        C0094o.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        AbstractC0061q.Log(5, "Camera2: CameraDevice disconnected.");
        this.a.a(cameraDevice);
        C0094o.D.release();
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i) {
        AbstractC0061q.Log(6, "Camera2: Error opening CameraDevice " + i);
        this.a.a(cameraDevice);
        C0094o.D.release();
    }
}
