package com.unity3d.player;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.RuntimeExecutionException;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.AssetPackException;
import com.google.android.play.core.assetpacks.AssetPackState;
import com.google.android.play.core.assetpacks.AssetPackStates;
import java.util.Collections;
import java.util.Map;
import java.util.Vector;
/* renamed from: com.unity3d.player.f */
/* loaded from: classes2.dex */
public final class C0076f implements OnCompleteListener {
    public final IAssetPackManagerDownloadStatusCallback a;
    public final UnityPlayer b;
    public final String[] c;

    public C0076f(UnityPlayer unityPlayer, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback, String[] strArr) {
        this.b = unityPlayer;
        this.a = iAssetPackManagerDownloadStatusCallback;
        this.c = strArr;
    }

    @Override // com.google.android.gms.tasks.OnCompleteListener
    public final void onComplete(Task task) {
        int errorCode;
        try {
            AssetPackStates assetPackStates = (AssetPackStates) task.getResult();
            Map packStates = assetPackStates.packStates();
            if (packStates.size() == 0) {
                return;
            }
            Vector vector = new Vector();
            for (AssetPackState assetPackState : packStates.values()) {
                if (assetPackState.errorCode() != 0 || assetPackState.status() == 4 || assetPackState.status() == 5 || assetPackState.status() == 0) {
                    String name = assetPackState.name();
                    int status = assetPackState.status();
                    int errorCode2 = assetPackState.errorCode();
                    long j = assetPackStates.totalBytes();
                    this.b.invokeOnMainThread(new RunnableC0068b(Collections.singleton(this.a), name, status, j, status == 4 ? j : 0L, 0, errorCode2));
                } else {
                    vector.add(assetPackState.name());
                }
            }
            if (vector.size() <= 0) {
                return;
            }
            C0082i c0082i = C0082i.e;
            UnityPlayer unityPlayer = this.b;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback = this.a;
            c0082i.getClass();
            synchronized (C0082i.e) {
                C0070c c0070c = c0082i.d;
                if (c0070c == null) {
                    C0070c c0070c2 = new C0070c(c0082i, unityPlayer, iAssetPackManagerDownloadStatusCallback);
                    c0082i.b.registerListener(c0070c2);
                    c0082i.d = c0070c2;
                } else {
                    c0070c.a(iAssetPackManagerDownloadStatusCallback);
                }
                c0082i.c.addAll(vector);
                c0082i.b.fetch(vector);
            }
        } catch (RuntimeExecutionException e) {
            Throwable th = e;
            String[] strArr = this.c;
            if (strArr.length == 1) {
                String str = strArr[0];
                while (true) {
                    if (th instanceof AssetPackException) {
                        errorCode = ((AssetPackException) th).getErrorCode();
                        break;
                    }
                    th = th.getCause();
                    if (th == null) {
                        errorCode = -100;
                        break;
                    }
                }
                this.b.invokeOnMainThread(new RunnableC0068b(Collections.singleton(this.a), str, 0, 0L, 0L, 0, errorCode));
                return;
            }
            C0082i c0082i2 = C0082i.e;
            IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback2 = this.a;
            c0082i2.getClass();
            for (String str2 : strArr) {
                c0082i2.b.getPackStates(Collections.singletonList(str2)).addOnCompleteListener(new C0076f(c0082i2.a, iAssetPackManagerDownloadStatusCallback2, new String[]{str2}));
            }
        }
    }
}
