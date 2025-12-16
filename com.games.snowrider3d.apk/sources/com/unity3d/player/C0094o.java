package com.unity3d.player;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.media.Image;
import android.media.ImageReader;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Range;
import android.util.Size;
import android.util.SizeF;
import android.view.Surface;
import androidx.room.RoomDatabase;
import com.unity3d.player.a.AbstractC0060p;
import com.unity3d.player.a.AbstractC0061q;
import com.unity3d.player.a.C0057m;
import java.util.Arrays;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* renamed from: com.unity3d.player.o */
/* loaded from: classes2.dex */
public class C0094o {
    public static CameraManager B;
    public static String[] C;
    public static final Semaphore D = new Semaphore(1);
    public final AbstractC0060p a;
    public CameraDevice b;
    public HandlerThread c;
    public Handler d;
    public Rect e;
    public Rect f;
    public int g;
    public int h;
    public int k;
    public int l;
    public Range n;
    public Image p;
    public CaptureRequest.Builder q;
    public int u;
    public SurfaceTexture v;
    public float i = -1.0f;
    public float j = -1.0f;
    public boolean m = false;
    public ImageReader o = null;
    public CameraCaptureSession r = null;
    public C0092n s = null;
    public final Object t = new Object();
    public Surface w = null;
    public int A = 3;
    public final C0086k x = new C0086k(this);
    public final C0088l y = new C0088l(this);
    public final C0090m z = new C0090m(this);

    public C0094o(AbstractC0060p abstractC0060p) {
        this.a = null;
        this.a = abstractC0060p;
        HandlerThread handlerThread = new HandlerThread("CameraBackground");
        this.c = handlerThread;
        handlerThread.start();
        this.d = new Handler(this.c.getLooper());
    }

    public static CameraManager getCameraManager(Context context) {
        if (B == null) {
            B = (CameraManager) context.getSystemService("camera");
        }
        return B;
    }

    public static String[] getCameraIds(Context context) {
        if (C == null) {
            try {
                if (PlatformSupport.QUINCE_TART_SUPPORT) {
                    C = C0057m.a(context);
                } else {
                    C = getCameraManager(context).getCameraIdList();
                }
            } catch (CameraAccessException e) {
                AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
                C = new String[0];
            }
        }
        return C;
    }

    public static int c(Context context, int i) {
        try {
            return ((Integer) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i]).get(CameraCharacteristics.SENSOR_ORIENTATION)).intValue();
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
            return 0;
        }
    }

    public static boolean e(Context context, int i) {
        try {
            return ((Integer) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i]).get(CameraCharacteristics.LENS_FACING)).intValue() == 0;
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    public static boolean d(Context context, int i) {
        try {
            return ((Integer) getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i]).get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue() > 0;
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
            return false;
        }
    }

    public static int a(Context context, int i) {
        try {
            CameraCharacteristics cameraCharacteristics = getCameraManager(context).getCameraCharacteristics(getCameraIds(context)[i]);
            float[] fArr = (float[]) cameraCharacteristics.get(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
            SizeF sizeF = (SizeF) cameraCharacteristics.get(CameraCharacteristics.SENSOR_INFO_PHYSICAL_SIZE);
            if (fArr.length > 0) {
                return (int) ((fArr[0] * 36.0f) / sizeF.getWidth());
            }
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
        }
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
        if (r3.length != 0) goto L12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int[] b(android.content.Context r3, int r4) {
        /*
            r0 = 6
            r1 = 0
            android.hardware.camera2.CameraManager r2 = getCameraManager(r3)     // Catch: android.hardware.camera2.CameraAccessException -> L51
            java.lang.String[] r3 = getCameraIds(r3)     // Catch: android.hardware.camera2.CameraAccessException -> L51
            r3 = r3[r4]     // Catch: android.hardware.camera2.CameraAccessException -> L51
            android.hardware.camera2.CameraCharacteristics r3 = r2.getCameraCharacteristics(r3)     // Catch: android.hardware.camera2.CameraAccessException -> L51
            android.hardware.camera2.CameraCharacteristics$Key r4 = android.hardware.camera2.CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP
            java.lang.Object r3 = r3.get(r4)
            android.hardware.camera2.params.StreamConfigurationMap r3 = (android.hardware.camera2.params.StreamConfigurationMap) r3
            if (r3 != 0) goto L21
            java.lang.String r3 = "Camera2: configuration map is not available."
            com.unity3d.player.a.AbstractC0061q.Log(r0, r3)
        L1f:
            r3 = r1
            goto L2d
        L21:
            r4 = 35
            android.util.Size[] r3 = r3.getOutputSizes(r4)
            if (r3 == 0) goto L1f
            int r4 = r3.length
            if (r4 != 0) goto L2d
            goto L1f
        L2d:
            if (r3 == 0) goto L50
            int r4 = r3.length
            int r4 = r4 * 2
            int[] r4 = new int[r4]
            r0 = 0
        L35:
            int r1 = r3.length
            if (r0 >= r1) goto L4f
            int r1 = r0 * 2
            r2 = r3[r0]
            int r2 = r2.getWidth()
            r4[r1] = r2
            int r1 = r1 + 1
            r2 = r3[r0]
            int r2 = r2.getHeight()
            r4[r1] = r2
            int r0 = r0 + 1
            goto L35
        L4f:
            return r4
        L50:
            return r1
        L51:
            r3 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r2 = "Camera2: CameraAccessException "
            r4.<init>(r2)
            java.lang.StringBuilder r3 = r4.append(r3)
            java.lang.String r3 = r3.toString()
            com.unity3d.player.a.AbstractC0061q.Log(r0, r3)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.player.C0094o.b(android.content.Context, int):int[]");
    }

    public String getCameraIdToOpen(Context context, int i) {
        return getCameraIds(context)[i];
    }

    public final boolean a(Context context, int i, int i2, int i3, int i4, int i5, Surface surface) {
        Rect rect;
        Semaphore semaphore;
        int i6 = i4;
        try {
            CameraCharacteristics cameraCharacteristics = B.getCameraCharacteristics(getCameraIds(context)[i]);
            if (((Integer) cameraCharacteristics.get(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL)).intValue() == 2) {
                AbstractC0061q.Log(5, "Camera2: only LEGACY hardware level is supported.");
            }
            StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) cameraCharacteristics.get(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
            Size[] sizeArr = null;
            if (streamConfigurationMap == null) {
                AbstractC0061q.Log(6, "Camera2: configuration map is not available.");
            } else {
                Size[] outputSizes = streamConfigurationMap.getOutputSizes(35);
                if (outputSizes != null && outputSizes.length != 0) {
                    sizeArr = outputSizes;
                }
            }
            if (sizeArr == null || sizeArr.length == 0) {
                return false;
            }
            double d = i2;
            double d2 = i3;
            int i7 = 0;
            int i8 = 0;
            int i9 = 0;
            double d3 = Double.MAX_VALUE;
            while (i7 < sizeArr.length) {
                int width = sizeArr[i7].getWidth();
                int height = sizeArr[i7].getHeight();
                double d4 = d;
                CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
                double abs = Math.abs(Math.log(d2 / height)) + Math.abs(Math.log(d4 / width));
                if (abs < d3) {
                    i8 = height;
                    d3 = abs;
                    i9 = width;
                }
                i7++;
                d = d4;
                cameraCharacteristics = cameraCharacteristics2;
            }
            CameraCharacteristics cameraCharacteristics3 = cameraCharacteristics;
            this.e = new Rect(0, 0, i9, i8);
            Range[] rangeArr = (Range[]) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_AE_AVAILABLE_TARGET_FPS_RANGES);
            if (rangeArr == null || rangeArr.length == 0) {
                AbstractC0061q.Log(6, "Camera2: target FPS ranges are not avialable.");
                return false;
            }
            int i10 = -1;
            int i11 = 0;
            double d5 = Double.MAX_VALUE;
            while (true) {
                if (i11 < rangeArr.length) {
                    int intValue = ((Integer) rangeArr[i11].getLower()).intValue();
                    int intValue2 = ((Integer) rangeArr[i11].getUpper()).intValue();
                    float f = i6;
                    if (f + 0.1f > intValue && f - 0.1f < intValue2) {
                        break;
                    }
                    if (r7 < d5) {
                        i10 = i11;
                        d5 = r7;
                    }
                    i11++;
                } else {
                    i6 = ((Integer) (i6 > ((Integer) rangeArr[i10].getUpper()).intValue() ? rangeArr[i10].getUpper() : rangeArr[i10].getLower())).intValue();
                }
            }
            this.n = new Range(Integer.valueOf(i6), Integer.valueOf(i6));
            try {
                if (!D.tryAcquire(4L, TimeUnit.SECONDS)) {
                    AbstractC0061q.Log(5, "Camera2: Timeout waiting to lock camera for opening.");
                    return false;
                }
                try {
                    B.openCamera(getCameraIdToOpen(context, i), this.x, this.d);
                } catch (CameraAccessException e) {
                    AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
                    D.release();
                    return false;
                } catch (IllegalArgumentException e2) {
                    AbstractC0061q.Log(6, "Camera2: IllegalArgumentException " + e2);
                } catch (SecurityException e3) {
                    AbstractC0061q.Log(6, "Camera2: SecurityException " + e3);
                }
                try {
                    semaphore = D;
                } catch (InterruptedException e4) {
                    AbstractC0061q.Log(6, "Camera2: Interrupted while waiting to open camera " + e4);
                }
                if (!semaphore.tryAcquire(4L, TimeUnit.SECONDS)) {
                    AbstractC0061q.Log(5, "Camera2: Timeout waiting to open camera.");
                    return false;
                }
                semaphore.release();
                this.u = i5;
                this.w = surface;
                int intValue3 = ((Integer) cameraCharacteristics3.get(CameraCharacteristics.CONTROL_MAX_REGIONS_AF)).intValue();
                this.h = intValue3;
                if (intValue3 > 0) {
                    this.f = (Rect) cameraCharacteristics3.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
                    float width2 = this.e.width() / this.e.height();
                    if (width2 > rect.width() / this.f.height()) {
                        this.k = 0;
                        this.l = (int) ((this.f.height() - (this.f.width() / width2)) / 2.0f);
                    } else {
                        this.l = 0;
                        this.k = (int) ((this.f.width() - (this.f.height() * width2)) / 2.0f);
                    }
                    this.g = Math.min(this.f.width(), this.f.height()) / 20;
                }
                return this.b != null;
            } catch (InterruptedException e5) {
                AbstractC0061q.Log(6, "Camera2: Interrupted while trying to lock camera for opening " + e5);
                return false;
            }
        } catch (CameraAccessException e6) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e6);
            return false;
        }
    }

    public final void a() {
        if (this.b != null) {
            g();
            b();
            this.s = null;
            this.w = null;
            this.v = null;
            Image image = this.p;
            if (image != null) {
                image.close();
                this.p = null;
            }
            ImageReader imageReader = this.o;
            if (imageReader != null) {
                imageReader.close();
                this.o = null;
            }
        }
        this.c.quit();
        try {
            this.c.join(4000L);
            this.c = null;
            this.d = null;
        } catch (InterruptedException e) {
            this.c.interrupt();
            AbstractC0061q.Log(6, "Camera2: Interrupted while waiting for the background thread to finish " + e);
        }
    }

    public final void b() {
        try {
            Semaphore semaphore = D;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            if (!semaphore.tryAcquire(4L, timeUnit)) {
                AbstractC0061q.Log(5, "Camera2: Timeout waiting to lock camera for closing.");
                return;
            }
            this.b.close();
            try {
                if (!semaphore.tryAcquire(4L, timeUnit)) {
                    AbstractC0061q.Log(5, "Camera2: Timeout waiting to close camera.");
                }
            } catch (InterruptedException e) {
                AbstractC0061q.Log(6, "Camera2: Interrupted while waiting to close camera " + e);
            }
            this.b = null;
            D.release();
        } catch (InterruptedException e2) {
            AbstractC0061q.Log(6, "Camera2: Interrupted while trying to lock camera for closing " + e2);
        }
    }

    public final void a(Object obj) {
        if (obj == "Focus") {
            this.m = false;
            synchronized (this.t) {
                if (this.r != null) {
                    try {
                        this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 0);
                        this.q.setTag("Regular");
                        this.r.setRepeatingRequest(this.q.build(), getCaptureCallback(), this.d);
                    } catch (CameraAccessException e) {
                        AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
                    }
                }
            }
        } else if (obj != "Cancel focus") {
        } else {
            synchronized (this.t) {
                if (this.r != null) {
                    e();
                }
            }
        }
    }

    public CameraCaptureSession.CaptureCallback getCaptureCallback() {
        if (this.s == null) {
            this.s = new C0092n(this);
        }
        return this.s;
    }

    public final void e() {
        try {
            if (this.h != 0) {
                float f = this.i;
                if (f >= 0.0f && f <= 1.0f) {
                    float f2 = this.j;
                    if (f2 >= 0.0f && f2 <= 1.0f) {
                        this.m = true;
                        int width = this.f.width();
                        int i = this.k;
                        int height = this.f.height();
                        int i2 = this.l;
                        int max = Math.max(this.g + 1, Math.min((int) (((width - (i * 2)) * this.i) + i), (this.f.width() - this.g) - 1));
                        int max2 = Math.max(this.g + 1, Math.min((int) (((1.0d - this.j) * (height - (i2 * 2))) + i2), (this.f.height() - this.g) - 1));
                        CaptureRequest.Builder builder = this.q;
                        CaptureRequest.Key key = CaptureRequest.CONTROL_AF_REGIONS;
                        int i3 = this.g;
                        int i4 = i3 * 2;
                        builder.set(key, new MeteringRectangle[]{new MeteringRectangle(max - i3, max2 - i3, i4, i4, RoomDatabase.MAX_BIND_PARAMETER_CNT)});
                        this.q.set(CaptureRequest.CONTROL_AF_MODE, 1);
                        this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 1);
                        this.q.setTag("Focus");
                        this.r.capture(this.q.build(), getCaptureCallback(), this.d);
                        return;
                    }
                }
            }
            this.q.set(CaptureRequest.CONTROL_AF_MODE, 4);
            this.q.setTag("Regular");
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession == null) {
                return;
            }
            cameraCaptureSession.setRepeatingRequest(this.q.build(), getCaptureCallback(), this.d);
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    public final void d() {
        try {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession == null) {
                return;
            }
            cameraCaptureSession.stopRepeating();
            this.q.set(CaptureRequest.CONTROL_AF_TRIGGER, 2);
            this.q.set(CaptureRequest.CONTROL_AF_MODE, 0);
            this.q.setTag("Cancel focus");
            this.r.capture(this.q.build(), getCaptureCallback(), this.d);
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    public void createCaptureSession(CameraCaptureSession.StateCallback stateCallback) {
        this.b.createCaptureSession(Arrays.asList(this.w), stateCallback, this.d);
    }

    public final void f() {
        if (this.u != 0) {
            if (this.w == null) {
                SurfaceTexture surfaceTexture = new SurfaceTexture(this.u);
                this.v = surfaceTexture;
                surfaceTexture.setDefaultBufferSize(this.e.width(), this.e.height());
                this.v.setOnFrameAvailableListener(this.z, this.d);
                this.w = new Surface(this.v);
            }
        } else if (this.w == null && this.o == null) {
            ImageReader newInstance = ImageReader.newInstance(this.e.width(), this.e.height(), 35, 2);
            this.o = newInstance;
            newInstance.setOnImageAvailableListener(this.y, this.d);
            this.p = null;
            this.w = this.o.getSurface();
        }
        try {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession != null) {
                if (this.A == 2) {
                    cameraCaptureSession.setRepeatingRequest(this.q.build(), getCaptureCallback(), this.d);
                }
            } else {
                createCaptureSession(new C0084j(this));
            }
            this.A = 1;
        } catch (CameraAccessException e) {
            AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
        }
    }

    public final void c() {
        synchronized (this.t) {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.stopRepeating();
                    this.A = 2;
                } catch (CameraAccessException e) {
                    AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
                }
            }
        }
    }

    public final void g() {
        synchronized (this.t) {
            CameraCaptureSession cameraCaptureSession = this.r;
            if (cameraCaptureSession != null) {
                try {
                    cameraCaptureSession.abortCaptures();
                } catch (CameraAccessException e) {
                    AbstractC0061q.Log(6, "Camera2: CameraAccessException " + e);
                }
                this.r.close();
                this.r = null;
                this.A = 3;
            }
        }
    }

    public final void a(CameraDevice cameraDevice) {
        synchronized (this.t) {
            this.r = null;
        }
        cameraDevice.close();
        this.b = null;
    }
}
