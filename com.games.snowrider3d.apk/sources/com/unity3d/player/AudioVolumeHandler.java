package com.unity3d.player;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.provider.Settings;
import com.unity3d.player.a.AbstractC0052h;
import com.unity3d.player.a.C0051g;
import com.unity3d.player.a.C0053i;
/* loaded from: classes2.dex */
public class AudioVolumeHandler implements AbstractC0052h {
    public C0053i a;

    @Override // com.unity3d.player.a.AbstractC0052h
    public final native void onAudioVolumeChanged(int i);

    public AudioVolumeHandler(Context context) {
        C0053i c0053i = new C0053i(context);
        this.a = c0053i;
        c0053i.c = new C0051g(new Handler(Looper.getMainLooper()), c0053i.b, this);
        context.getContentResolver().registerContentObserver(Settings.System.CONTENT_URI, true, c0053i.c);
    }
}
