package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.play.core.assetpacks.AssetPackLocation;
import com.unity3d.player.a.AbstractC0061q;
import java.util.Arrays;
import java.util.List;
/* loaded from: classes2.dex */
class PlayAssetDeliveryUnityWrapper {
    private static PlayAssetDeliveryUnityWrapper b;
    private final C0082i a;

    private PlayAssetDeliveryUnityWrapper(UnityPlayer unityPlayer, Context context) {
        this.a = null;
        if (b != null) {
            throw new RuntimeException("PlayAssetDeliveryUnityWrapper should be created only once. Use getInstance() instead.");
        }
        try {
            if (!getClass().getClassLoader().loadClass("com.google.android.play.core.assetpacks.AssetPackManager").getMethod("getPackStates", List.class).getReturnType().getName().equals("com.google.android.gms.tasks.Task")) {
                return;
            }
            this.a = a(unityPlayer, context);
        } catch (ClassNotFoundException | NoSuchMethodException | SecurityException unused) {
        }
    }

    public static synchronized PlayAssetDeliveryUnityWrapper getInstance() {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            while (true) {
                playAssetDeliveryUnityWrapper = b;
                if (playAssetDeliveryUnityWrapper != null) {
                    break;
                }
                try {
                    PlayAssetDeliveryUnityWrapper.class.wait(3000L);
                } catch (InterruptedException e) {
                    AbstractC0061q.Log(6, e.getMessage());
                }
            }
            if (playAssetDeliveryUnityWrapper == null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper is not yet initialised.");
            }
        }
        return playAssetDeliveryUnityWrapper;
    }

    private static C0082i a(UnityPlayer unityPlayer, Context context) {
        if (C0082i.e == null) {
            C0082i.e = new C0082i(unityPlayer, context);
        }
        return C0082i.e;
    }

    public static synchronized PlayAssetDeliveryUnityWrapper init(UnityPlayer unityPlayer, Context context) {
        PlayAssetDeliveryUnityWrapper playAssetDeliveryUnityWrapper;
        synchronized (PlayAssetDeliveryUnityWrapper.class) {
            if (b != null) {
                throw new RuntimeException("PlayAssetDeliveryUnityWrapper.init() should be called only once. Use getInstance() instead.");
            }
            b = new PlayAssetDeliveryUnityWrapper(unityPlayer, context);
            PlayAssetDeliveryUnityWrapper.class.notifyAll();
            playAssetDeliveryUnityWrapper = b;
        }
        return playAssetDeliveryUnityWrapper;
    }

    public void getAssetPackState(String str, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        getAssetPackStates(new String[]{str}, iAssetPackManagerStatusQueryCallback);
    }

    public void getAssetPackStates(String[] strArr, IAssetPackManagerStatusQueryCallback iAssetPackManagerStatusQueryCallback) {
        a();
        C0082i c0082i = this.a;
        c0082i.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0080h(c0082i.a, iAssetPackManagerStatusQueryCallback, strArr));
    }

    public void downloadAssetPack(String str, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        downloadAssetPacks(new String[]{str}, iAssetPackManagerDownloadStatusCallback);
    }

    public void downloadAssetPacks(String[] strArr, IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C0082i c0082i = this.a;
        c0082i.getClass();
        if (strArr == null || strArr.length == 0) {
            return;
        }
        c0082i.b.getPackStates(Arrays.asList(strArr)).addOnCompleteListener(new C0076f(c0082i.a, iAssetPackManagerDownloadStatusCallback, strArr));
    }

    public Object registerDownloadStatusListener(IAssetPackManagerDownloadStatusCallback iAssetPackManagerDownloadStatusCallback) {
        a();
        C0082i c0082i = this.a;
        C0070c c0070c = new C0070c(c0082i, c0082i.a, iAssetPackManagerDownloadStatusCallback);
        c0082i.b.registerListener(c0070c);
        return c0070c;
    }

    public void unregisterDownloadStatusListener(Object obj) {
        a();
        C0082i c0082i = this.a;
        c0082i.getClass();
        if (!(obj instanceof C0070c)) {
            return;
        }
        c0082i.b.unregisterListener((C0070c) obj);
    }

    public void requestToUseMobileData(Activity activity, IAssetPackManagerMobileDataConfirmationCallback iAssetPackManagerMobileDataConfirmationCallback) {
        a();
        C0082i c0082i = this.a;
        c0082i.b.showCellularDataConfirmation(activity).addOnSuccessListener(new C0074e(c0082i.a, iAssetPackManagerMobileDataConfirmationCallback));
    }

    public String getAssetPackPath(String str) {
        a();
        AssetPackLocation packLocation = this.a.b.getPackLocation(str);
        if (packLocation == null) {
            return RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED;
        }
        return packLocation.assetsPath();
    }

    public void cancelAssetPackDownload(String str) {
        cancelAssetPackDownloads(new String[]{str});
    }

    public void cancelAssetPackDownloads(String[] strArr) {
        a();
        this.a.b.cancel(Arrays.asList(strArr));
    }

    public void removeAssetPack(String str) {
        a();
        this.a.b.removePack(str);
    }

    public boolean playCoreApiMissing() {
        return this.a == null;
    }

    private void a() {
        if (!playCoreApiMissing()) {
            return;
        }
        throw new RuntimeException("AssetPackManager API is not available! Make sure your gradle project includes 'com.google.android.play:asset-delivery' dependency.");
    }
}
