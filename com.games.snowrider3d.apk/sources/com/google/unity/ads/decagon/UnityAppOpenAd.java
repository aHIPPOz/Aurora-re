package com.google.unity.ads.decagon;

import android.app.Activity;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAd;
import com.google.android.libraries.ads.mobile.sdk.appopen.AppOpenAdEventCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.decagon.UnityAppOpenAd;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public class UnityAppOpenAd extends UnityAdBase<AppOpenAd, UnityAppOpenAdCallback> {
    private final AdWrapper<AppOpenAd> adWrapper;

    public UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback) {
        this(activity, callback, AdWrapper.forAppOpen(), Executors.newSingleThreadExecutor());
    }

    UnityAppOpenAd(Activity activity, UnityAppOpenAdCallback callback, AdWrapper<AppOpenAd> adWrapper, Executor executor) {
        super(activity, callback, executor);
        this.adWrapper = adWrapper;
    }

    public void load(final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.m171lambda$load$0$comgoogleunityadsdecagonUnityAppOpenAd(request);
            }
        });
    }

    /* renamed from: lambda$load$0$com-google-unity-ads-decagon-UnityAppOpenAd */
    public /* synthetic */ void m171lambda$load$0$comgoogleunityadsdecagonUnityAppOpenAd(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.decagon.UnityAppOpenAd$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements AdLoadCallback<AppOpenAd> {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass1(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(AppOpenAd ad) {
            this.this$0.ad = ad;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.m174x637c215();
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-decagon-UnityAppOpenAd$1 */
        public /* synthetic */ void m174x637c215() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAppOpenAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass1.this.m173x1c52916e(adError);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-decagon-UnityAppOpenAd$1 */
        public /* synthetic */ void m173x1c52916e(LoadAdError loadAdError) {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAppOpenAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        if (this.ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show app open ad before it was ready. Please call loadAd first and wait for a successful onAdLoaded callback.");
            return;
        }
        ((AppOpenAd) this.ad).setAdEventCallback(new AnonymousClass2(this));
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityAppOpenAd.this.m172lambda$show$0$comgoogleunityadsdecagonUnityAppOpenAd();
            }
        });
    }

    /* renamed from: com.google.unity.ads.decagon.UnityAppOpenAd$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements AppOpenAdEventCallback {
        final /* synthetic */ UnityAppOpenAd this$0;

        AnonymousClass2(final UnityAppOpenAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m180x4e4c115();
                }
            });
        }

        /* renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-decagon-UnityAppOpenAd$2 */
        public /* synthetic */ void m180x4e4c115() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m176x4591a706();
                }
            });
            this.this$0.ad = null;
        }

        /* renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-decagon-UnityAppOpenAd$2 */
        public /* synthetic */ void m176x4591a706() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m177xb43f7d1c(fullScreenContentError);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-decagon-UnityAppOpenAd$2 */
        public /* synthetic */ void m177xb43f7d1c(FullScreenContentError fullScreenContentError) {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m178xd013749a();
                }
            });
        }

        /* renamed from: lambda$onAdImpression$0$com-google-unity-ads-decagon-UnityAppOpenAd$2 */
        public /* synthetic */ void m178xd013749a() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m175x370e661a();
                }
            });
        }

        /* renamed from: lambda$onAdClicked$0$com-google-unity-ads-decagon-UnityAppOpenAd$2 */
        public /* synthetic */ void m175x370e661a() {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onAdClicked();
            }
        }

        public void onAdPaid(final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityAppOpenAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityAppOpenAd.AnonymousClass2.this.m179lambda$onAdPaid$0$comgoogleunityadsdecagonUnityAppOpenAd$2(adValue);
                }
            });
        }

        /* renamed from: lambda$onAdPaid$0$com-google-unity-ads-decagon-UnityAppOpenAd$2 */
        public /* synthetic */ void m179lambda$onAdPaid$0$comgoogleunityadsdecagonUnityAppOpenAd$2(AdValue adValue) {
            if (this.this$0.callback != 0) {
                ((UnityAppOpenAdCallback) this.this$0.callback).onPaidEvent(adValue.getPrecisionType().ordinal(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: lambda$show$0$com-google-unity-ads-decagon-UnityAppOpenAd */
    public /* synthetic */ void m172lambda$show$0$comgoogleunityadsdecagonUnityAppOpenAd() {
        ((AppOpenAd) this.ad).setImmersiveMode(true);
        ((AppOpenAd) this.ad).show(this.activity);
    }

    public long getPlacementId() {
        if (this.ad == 0) {
            return 0L;
        }
        return ((AppOpenAd) this.ad).getPlacementId();
    }

    public void setPlacementId(long placementId) {
        if (this.ad == 0) {
            return;
        }
        ((AppOpenAd) this.ad).setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        if (this.ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((AppOpenAd) this.ad).getResponseInfo();
    }
}
