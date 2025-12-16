package com.unity3d.player;

import android.telephony.PhoneStateListener;
/* renamed from: com.unity3d.player.o0 */
/* loaded from: classes2.dex */
public final class C0095o0 extends PhoneStateListener {
    public final /* synthetic */ UnityPlayer a;

    public C0095o0(UnityPlayer unityPlayer) {
        this.a = unityPlayer;
    }

    @Override // android.telephony.PhoneStateListener
    public final void onCallStateChanged(int i, String str) {
        UnityPlayer unityPlayer = this.a;
        boolean z = true;
        if (i != 1) {
            z = false;
        }
        unityPlayer.nativeMuteMasterAudio(z);
    }
}
