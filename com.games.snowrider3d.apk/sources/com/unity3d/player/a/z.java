package com.unity3d.player.a;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.PixelCopy;
import android.view.SurfaceView;
import android.view.View;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
/* loaded from: classes2.dex */
public final class z extends View {
    public Bitmap a;
    public final /* synthetic */ A b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(A a, Context context) {
        super(context);
        this.b = a;
    }

    public final void a(SurfaceView surfaceView) {
        this.a = Bitmap.createBitmap(surfaceView.getWidth(), surfaceView.getHeight(), Bitmap.Config.ARGB_8888);
        HandlerThread handlerThread = new HandlerThread("PlaceHolderView");
        handlerThread.start();
        Semaphore semaphore = new Semaphore(0);
        PixelCopy.request(surfaceView, this.a, new y(this, semaphore), new Handler(handlerThread.getLooper()));
        try {
            if (!semaphore.tryAcquire(2000L, TimeUnit.MILLISECONDS)) {
                AbstractC0061q.Log(5, "Timeout while copying surface view.");
            }
        } catch (InterruptedException e) {
            AbstractC0061q.Log(6, e.getMessage());
        }
        handlerThread.quitSafely();
    }
}
