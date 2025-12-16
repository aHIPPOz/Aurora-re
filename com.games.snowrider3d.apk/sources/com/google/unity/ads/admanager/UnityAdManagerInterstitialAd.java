package com.google.unity.ads.admanager;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAd;
import com.google.android.gms.ads.admanager.AdManagerInterstitialAdLoadCallback;
import com.google.android.gms.ads.admanager.AppEventListener;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.admanager.UnityAdManagerInterstitialAd;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
/* loaded from: classes2.dex */
public class UnityAdManagerInterstitialAd {
    private final Activity activity;
    private AdManagerInterstitialAd adManagerInterstitialAd;
    private final UnityAdManagerInterstitialAdCallback callback;
    private final ExecutorService service = Executors.newSingleThreadExecutor();
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass1(this);
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass2(this);
    private final AppEventListener appEventListener = new AnonymousClass3(this);

    public void destroy() {
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends FullScreenContentCallback {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass1(final UnityAdManagerInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError error) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.m164x45742723(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1 */
        public /* synthetic */ void m164x45742723(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.m166x966c591c();
                }
            });
        }

        /* renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1 */
        public /* synthetic */ void m166x966c591c() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.m163xe2993d0d();
                }
            });
        }

        /* renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1 */
        public /* synthetic */ void m163xe2993d0d() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.m165xf41562a1();
                }
            });
        }

        /* renamed from: lambda$onAdImpression$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1 */
        public /* synthetic */ void m165xf41562a1() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$1$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass1.this.m162x65fd5421();
                }
            });
        }

        /* renamed from: lambda$onAdClicked$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$1 */
        public /* synthetic */ void m162x65fd5421() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements OnPaidEventListener {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass2(final UnityAdManagerInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass2.this.m167x981544cc(adValue);
                }
            });
        }

        /* renamed from: lambda$onPaidEvent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$2 */
        public /* synthetic */ void m167x981544cc(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements AppEventListener {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass3(final UnityAdManagerInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.admanager.AppEventListener
        public void onAppEvent(final String name, final String data) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass3.this.m168xe2ea2310(name, data);
                }
            });
        }

        /* renamed from: lambda$onAppEvent$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$3 */
        public /* synthetic */ void m168xe2ea2310(String str, String str2) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppEvent(str, str2);
            }
        }
    }

    public UnityAdManagerInterstitialAd(Activity activity, UnityAdManagerInterstitialAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final String adUnitId, final AdManagerAdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityAdManagerInterstitialAd.this.m159x872d7532(adUnitId, request);
            }
        });
    }

    /* renamed from: lambda$loadAd$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd */
    public /* synthetic */ void m159x872d7532(String str, AdManagerAdRequest adManagerAdRequest) {
        AdManagerInterstitialAd.load(this.activity, str, adManagerAdRequest, new AnonymousClass4(this));
    }

    /* renamed from: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4 */
    /* loaded from: classes2.dex */
    public class AnonymousClass4 extends AdManagerInterstitialAdLoadCallback {
        final /* synthetic */ UnityAdManagerInterstitialAd this$0;

        AnonymousClass4(final UnityAdManagerInterstitialAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdLoaded(AdManagerInterstitialAd ad) {
            this.this$0.adManagerInterstitialAd = ad;
            this.this$0.adManagerInterstitialAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.adManagerInterstitialAd.setAppEventListener(this.this$0.appEventListener);
            this.this$0.adManagerInterstitialAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass4.this.m170x8c473820();
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$4 */
        public /* synthetic */ void m170x8c473820() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError error) {
            this.this$0.service.execute(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$4$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.AnonymousClass4.this.m169x93f23579(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd$4 */
        public /* synthetic */ void m169x93f23579(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onInterstitialAdFailedToLoad(loadAdError);
            }
        }
    }

    public boolean isAdAvailable(String adUnitId) {
        return AdManagerInterstitialAd.isAdAvailable(this.activity, adUnitId);
    }

    public void pollAd(String adUnitId) {
        AdManagerInterstitialAd adManagerInterstitialAd = (AdManagerInterstitialAd) AdManagerInterstitialAd.pollAd(this.activity, adUnitId);
        this.adManagerInterstitialAd = adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an Ad Manager Interstitial Ad from the preloader.");
            return;
        }
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                UnityAdManagerInterstitialAd.this.m160xf6ec000b();
            }
        });
        this.adManagerInterstitialAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    /* renamed from: lambda$pollAd$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd */
    public /* synthetic */ void m160xf6ec000b() {
        this.adManagerInterstitialAd.setOnPaidEventListener(this.onPaidEventListener);
        this.adManagerInterstitialAd.setAppEventListener(this.appEventListener);
    }

    public String getAdUnitId() {
        AdManagerInterstitialAd adManagerInterstitialAd = this.adManagerInterstitialAd;
        if (adManagerInterstitialAd == null) {
            return null;
        }
        return adManagerInterstitialAd.getAdUnitId();
    }

    public ResponseInfo getResponseInfo() {
        FutureTask futureTask = new FutureTask(new Callable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda2
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return UnityAdManagerInterstitialAd.this.m158x5c69eb4();
            }
        });
        this.activity.runOnUiThread(futureTask);
        try {
            return (ResponseInfo) futureTask.get();
        } catch (InterruptedException | ExecutionException e) {
            Log.e(PluginUtils.LOGTAG, String.format("Unable to check Ad Manager interstitial response info: %s", e.getLocalizedMessage()));
            return null;
        }
    }

    /* renamed from: lambda$getResponseInfo$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd */
    public /* synthetic */ ResponseInfo m158x5c69eb4() throws Exception {
        return this.adManagerInterstitialAd.getResponseInfo();
    }

    public void show() {
        if (this.adManagerInterstitialAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show Ad Manager interstitial ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.admanager.UnityAdManagerInterstitialAd$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAdManagerInterstitialAd.this.m161x525dd4c6();
                }
            });
        }
    }

    /* renamed from: lambda$show$0$com-google-unity-ads-admanager-UnityAdManagerInterstitialAd */
    public /* synthetic */ void m161x525dd4c6() {
        this.adManagerInterstitialAd.show(this.activity);
    }
}
