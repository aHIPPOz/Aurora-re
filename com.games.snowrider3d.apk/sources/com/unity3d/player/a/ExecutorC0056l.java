package com.unity3d.player.a;

import android.os.Handler;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
/* renamed from: com.unity3d.player.a.l */
/* loaded from: classes2.dex */
public final class ExecutorC0056l implements Executor {
    public final Handler a;

    public ExecutorC0056l(Handler handler) {
        this.a = handler;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (this.a.post(runnable)) {
            return;
        }
        throw new RejectedExecutionException(this.a + " is shutting down");
    }
}
