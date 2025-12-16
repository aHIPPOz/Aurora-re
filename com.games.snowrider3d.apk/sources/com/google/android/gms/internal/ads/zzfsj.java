package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.CancellationTokenSource;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public final class zzfsj {
    public static ListenableFuture zza(Task task, CancellationTokenSource cancellationTokenSource) {
        final zzfsi zzfsiVar = new zzfsi(task, null);
        task.addOnCompleteListener(zzgef.zzc(), new OnCompleteListener() { // from class: com.google.android.gms.internal.ads.zzfsh
            @Override // com.google.android.gms.tasks.OnCompleteListener
            public final void onComplete(Task task2) {
                zzfsi zzfsiVar2 = zzfsi.this;
                if (task2.isCanceled()) {
                    zzfsiVar2.cancel(false);
                } else if (task2.isSuccessful()) {
                    zzfsiVar2.zzc(task2.getResult());
                } else {
                    Exception exception = task2.getException();
                    if (exception != null) {
                        zzfsiVar2.zzd(exception);
                        return;
                    }
                    throw new IllegalStateException();
                }
            }
        });
        return zzfsiVar;
    }
}
