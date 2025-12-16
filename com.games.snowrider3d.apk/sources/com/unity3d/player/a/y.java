package com.unity3d.player.a;

import android.app.Activity;
import android.content.Context;
import android.view.PixelCopy;
import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class y implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ Semaphore a;
    public final /* synthetic */ z b;

    public y(z zVar, Semaphore semaphore) {
        this.b = zVar;
        this.a = semaphore;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        this.a.release();
        if (i == 0) {
            Context context = this.b.b.a;
            if (!(context instanceof Activity)) {
                return;
            }
            ((Activity) context).runOnUiThread(new x(this));
        }
    }
}
