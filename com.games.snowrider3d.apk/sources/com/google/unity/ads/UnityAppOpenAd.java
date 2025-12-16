package com.google.unity.ads;

import android.app.Activity;
import android.util.Log;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdValue;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnPaidEventListener;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.appopen.AppOpenAd;
import com.google.unity.ads.UnityAppOpenAd;
import java.util.Objects;
/* loaded from: classes2.dex */
public class UnityAppOpenAd {
    private final Activity activity;
    AppOpenAd appOpenAd;
    private final UnityAppOpenAdCallback callback;
    private final OnPaidEventListener onPaidEventListener = new AnonymousClass1(this);
    private final FullScreenContentCallback fullScreenContentCallback = new AnonymousClass2(this);

    public void destroy() {
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements OnPaidEventListener {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass1(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.OnPaidEventListener
        public void onPaidEvent(final AdValue adValue) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.m91lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1(adValue);
                }
            });
        }

        /* renamed from: lambda$onPaidEvent$0$com-google-unity-ads-UnityAppOpenAd$1 */
        public /* synthetic */ void m91lambda$onPaidEvent$0$comgoogleunityadsUnityAppOpenAd$1(AdValue adValue) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onPaidEvent(adValue.getPrecisionType(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 extends FullScreenContentCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass2(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdFailedToShowFullScreenContent(final AdError error) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m94xd8053296(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2 */
        public /* synthetic */ void m94xd8053296(AdError adError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdFailedToShowFullScreenContent(adError);
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdShowedFullScreenContent() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m96x52267f8f();
                }
            });
        }

        /* renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2 */
        public /* synthetic */ void m96x52267f8f() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdShowedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdDismissedFullScreenContent() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m93x202ce680();
                }
            });
        }

        /* renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-UnityAppOpenAd$2 */
        public /* synthetic */ void m93x202ce680() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdDismissedFullScreenContent();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdImpression() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m95lambda$onAdImpression$0$comgoogleunityadsUnityAppOpenAd$2();
                }
            });
        }

        /* renamed from: lambda$onAdImpression$0$com-google-unity-ads-UnityAppOpenAd$2 */
        public /* synthetic */ void m95lambda$onAdImpression$0$comgoogleunityadsUnityAppOpenAd$2() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdImpression();
            }
        }

        @Override // com.google.android.gms.ads.FullScreenContentCallback
        public void onAdClicked() {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m92lambda$onAdClicked$0$comgoogleunityadsUnityAppOpenAd$2();
                }
            });
        }

        /* renamed from: lambda$onAdClicked$0$com-google-unity-ads-UnityAppOpenAd$2 */
        public /* synthetic */ void m92lambda$onAdClicked$0$comgoogleunityadsUnityAppOpenAd$2() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAdClicked();
            }
        }
    }

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback) {
        this.activity = activity;
        this.callback = callback;
    }

    public void loadAd(final String adUnitId, final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.m86lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(adUnitId, request);
            }
        });
    }

    /* renamed from: lambda$loadAd$0$com-google-unity-ads-UnityAppOpenAd */
    public /* synthetic */ void m86lambda$loadAd$0$comgoogleunityadsUnityAppOpenAd(String str, AdRequest adRequest) {
        AppOpenAd.load(this.activity, str, adRequest, new AnonymousClass3(this));
    }

    /* renamed from: com.google.unity.ads.UnityAppOpenAd$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 extends AppOpenAd.AppOpenAdLoadCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass3(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdLoaded(AppOpenAd ad) {
            this.this$0.appOpenAd = ad;
            this.this$0.appOpenAd.setOnPaidEventListener(this.this$0.onPaidEventListener);
            this.this$0.appOpenAd.setFullScreenContentCallback(this.this$0.fullScreenContentCallback);
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass3.this.m98lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$3();
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-UnityAppOpenAd$3 */
        public /* synthetic */ void m98lambda$onAdLoaded$0$comgoogleunityadsUnityAppOpenAd$3() {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdLoaded();
            }
        }

        @Override // com.google.android.gms.ads.AdLoadCallback
        public void onAdFailedToLoad(final LoadAdError error) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$3$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass3.this.m97lambda$onAdFailedToLoad$0$comgoogleunityadsUnityAppOpenAd$3(error);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-UnityAppOpenAd$3 */
        public /* synthetic */ void m97lambda$onAdFailedToLoad$0$comgoogleunityadsUnityAppOpenAd$3(LoadAdError loadAdError) {
            if (this.this$0.callback != null) {
                this.this$0.callback.onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    public void setAppOpenAd(AppOpenAd appOpenAd) {
        this.appOpenAd = appOpenAd;
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda2
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.m89lambda$setAppOpenAd$0$comgoogleunityadsUnityAppOpenAd();
            }
        });
    }

    /* renamed from: lambda$setAppOpenAd$0$com-google-unity-ads-UnityAppOpenAd */
    public /* synthetic */ void m89lambda$setAppOpenAd$0$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
        this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    public void pollAd(String adUnitId) {
        AppOpenAd pollAd = AppOpenAd.pollAd(this.activity, adUnitId);
        this.appOpenAd = pollAd;
        if (pollAd == null) {
            Log.e(PluginUtils.LOGTAG, "Failed to obtain an App Open Ad from the preloader.");
            final LoadAdError loadAdError = new LoadAdError(0, "Failed to obtain an App Open Ad from the preloader.", MobileAds.ERROR_DOMAIN, null, null);
            new Thread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.this.m87lambda$pollAd$0$comgoogleunityadsUnityAppOpenAd(loadAdError);
                }
            }).start();
            return;
        }
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda4
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.m88lambda$pollAd$1$comgoogleunityadsUnityAppOpenAd();
            }
        });
        this.appOpenAd.setFullScreenContentCallback(this.fullScreenContentCallback);
    }

    /* renamed from: lambda$pollAd$0$com-google-unity-ads-UnityAppOpenAd */
    public /* synthetic */ void m87lambda$pollAd$0$comgoogleunityadsUnityAppOpenAd(LoadAdError loadAdError) {
        UnityAppOpenAdCallback unityAppOpenAdCallback = this.callback;
        if (unityAppOpenAdCallback != null) {
            unityAppOpenAdCallback.onAppOpenAdFailedToLoad(loadAdError);
        }
    }

    /* renamed from: lambda$pollAd$1$com-google-unity-ads-UnityAppOpenAd */
    public /* synthetic */ void m88lambda$pollAd$1$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setOnPaidEventListener(this.onPaidEventListener);
    }

    public boolean isAdAvailable(String adUnitId) {
        return AppOpenAd.isAdAvailable(this.activity, adUnitId);
    }

    public void show() {
        if (this.appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. This should in theory never happen. If it does, please contact the plugin owners.");
        } else {
            this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.UnityAppOpenAd$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.this.m90lambda$show$0$comgoogleunityadsUnityAppOpenAd();
                }
            });
        }
    }

    /* renamed from: lambda$show$0$com-google-unity-ads-UnityAppOpenAd */
    public /* synthetic */ void m90lambda$show$0$comgoogleunityadsUnityAppOpenAd() {
        this.appOpenAd.setImmersiveMode(true);
        this.appOpenAd.show(this.activity);
    }

    public String getAdUnitId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return null;
        }
        return appOpenAd.getAdUnitId();
    }

    public long getPlacementId() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return 0L;
        }
        return appOpenAd.getPlacementId();
    }

    public void setPlacementId(long placementId) {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            return;
        }
        appOpenAd.setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        AppOpenAd appOpenAd = this.appOpenAd;
        if (appOpenAd == null) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return appOpenAd.getResponseInfo();
    }

    public void runOnNewThread(final Runnable action) {
        new Thread(action).start();
    }
}
