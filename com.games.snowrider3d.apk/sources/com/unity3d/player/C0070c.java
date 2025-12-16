package com.unity3d.player;

import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStateUpdateListener;
import java.util.HashSet;
import java.util.Set;
/* renamed from: com.unity3d.player.c */
/* loaded from: classes2.dex */
public final class C0070c implements AssetPackStateUpdateListener {
    public final HashSet a;
    public final UnityPlayer b;
    public final /* synthetic */ C0082i c;

    public final void onStateUpdate(Object obj) {
        AssetPackState assetPackState = (AssetPackState) obj;
        synchronized (this) {
            if (assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                synchronized (C0082i.e) {
                    this.c.c.remove(assetPackState.name());
                    if (this.c.c.isEmpty()) {
                        C0082i c0082i = this.c;
                        C0070c c0070c = c0082i.d;
                        if (c0070c instanceof C0070c) {
                            c0082i.b.unregisterListener(c0070c);
                        }
                        this.c.d = null;
                    }
                }
            }
            if (this.a.size() == 0) {
                return;
            }
            this.b.invokeOnMainThread(new RunnableC0068b((Set) this.a.clone(), assetPackState.name(), assetPackState.status(), assetPackState.totalBytesToDownload(), assetPackState.bytesDownloaded(), assetPackState.transferProgressPercentage(), assetPackState.errorCode()));
        }
    }

    public C0070c(C0082i c0082i, UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.c = c0082i;
        this.b = unityPlayer;
        HashSet hashSet = new HashSet();
        this.a = hashSet;
        hashSet.add(iAssetPackManagerDownloadStatusCallback);
    }

    public final synchronized void a(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        this.a.add(iAssetPackManagerDownloadStatusCallback);
    }
}
