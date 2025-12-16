package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.hardware.camera2.CameraManager;
import android.view.Surface;
import com.unity3d.player.a.AbstractC0060p;
import com.unity3d.player.a.AbstractC0061q;
import com.unity3d.player.a.C0057m;
import java.nio.ByteBuffer;
/* loaded from: classes2.dex */
public class Camera2Wrapper implements AbstractC0060p {
    public final Context a;
    public C0094o b = null;

    private final native void initCamera2Jni();

    private final native void nativeFrameReady(Object obj, Object obj2, Object obj3, int i, int i2, int i3);

    private final native void nativeSurfaceTextureReady(Object obj);

    public Camera2Wrapper(Context context) {
        this.a = context;
        initCamera2Jni();
    }

    public int getCamera2Count() {
        return C0094o.getCameraIds(this.a).length;
    }

    public int getCamera2SensorOrientation(int i) {
        return C0094o.c(this.a, i);
    }

    public boolean isCamera2FrontFacing(int i) {
        return C0094o.e(this.a, i);
    }

    public int getCamera2FocalLengthEquivalent(int i) {
        return C0094o.a(this.a, i);
    }

    public int[] getCamera2Resolutions(int i) {
        return C0094o.b(this.a, i);
    }

    public boolean initializeCamera2(int i, int i2, int i3, int i4, int i5, Surface surface) {
        C0094o c0094o;
        if (this.b != null || UnityPlayer.currentActivity == null) {
            return false;
        }
        CameraManager cameraManager = C0094o.B;
        if (PlatformSupport.QUINCE_TART_SUPPORT) {
            c0094o = new C0057m(this);
        } else {
            c0094o = new C0094o(this);
        }
        C0094o c0094o2 = c0094o;
        this.b = c0094o2;
        return c0094o2.a(this.a, i, i2, i3, i4, i5, surface);
    }

    public boolean isCamera2AutoFocusPointSupported(int i) {
        return C0094o.d(this.a, i);
    }

    public boolean setAutoFocusPoint(float f, float f2) {
        C0094o c0094o = this.b;
        if (c0094o != null && c0094o.h > 0) {
            if (!c0094o.m) {
                c0094o.i = f;
                c0094o.j = f2;
                synchronized (c0094o.t) {
                    if (c0094o.r != null && c0094o.A != 2) {
                        c0094o.d();
                    }
                }
                return true;
            }
            AbstractC0061q.Log(5, "Camera2: Setting manual focus point already started.");
        }
        return false;
    }

    public Rect getFrameSizeCamera2() {
        C0094o c0094o = this.b;
        if (c0094o == null) {
            return new Rect();
        }
        return c0094o.e;
    }

    public void closeCamera2() {
        C0094o c0094o = this.b;
        if (c0094o != null) {
            c0094o.a();
        }
        this.b = null;
    }

    public void startCamera2() {
        C0094o c0094o = this.b;
        if (c0094o != null) {
            c0094o.f();
        }
    }

    public void pauseCamera2() {
        C0094o c0094o = this.b;
        if (c0094o != null) {
            c0094o.c();
        }
    }

    public void stopCamera2() {
        C0094o c0094o = this.b;
        if (c0094o != null) {
            c0094o.g();
        }
    }

    public final void a(ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i, int i2, int i3) {
        nativeFrameReady(byteBuffer, byteBuffer2, byteBuffer3, i, i2, i3);
    }

    public final void a(Object obj) {
        nativeSurfaceTextureReady(obj);
    }
}
