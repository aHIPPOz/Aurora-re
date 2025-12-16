package com.google.unity.ads.decagon;

import android.app.Activity;
import java.util.concurrent.Executor;
/* loaded from: classes2.dex */
public abstract class UnityAdBase<AdT, CallbackT> {
    protected final Activity activity;
    protected AdT ad;
    protected final CallbackT callback;
    protected final Executor executor;

    public UnityAdBase(Activity activity, CallbackT callback, Executor executor) {
        this.activity = activity;
        this.callback = callback;
        this.executor = executor;
    }
}
