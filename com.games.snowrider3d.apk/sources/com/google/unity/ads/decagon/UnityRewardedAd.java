package com.google.unity.ads.decagon;

import android.app.Activity;
import android.util.Log;
import com.google.android.libraries.ads.mobile.sdk.common.AdLoadCallback;
import com.google.android.libraries.ads.mobile.sdk.common.AdRequest;
import com.google.android.libraries.ads.mobile.sdk.common.AdValue;
import com.google.android.libraries.ads.mobile.sdk.common.FullScreenContentError;
import com.google.android.libraries.ads.mobile.sdk.common.LoadAdError;
import com.google.android.libraries.ads.mobile.sdk.common.ResponseInfo;
import com.google.android.libraries.ads.mobile.sdk.rewarded.OnUserEarnedRewardListener;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardItem;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAd;
import com.google.android.libraries.ads.mobile.sdk.rewarded.RewardedAdEventCallback;
import com.google.unity.ads.PluginUtils;
import com.google.unity.ads.decagon.UnityRewardedAd;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes2.dex */
public class UnityRewardedAd extends UnityAdBase<RewardedAd, UnityRewardedAdCallback> {
    private final AdWrapper<RewardedAd> adWrapper;

    public UnityRewardedAd(Activity activity, UnityRewardedAdCallback callback) {
        this(activity, callback, AdWrapper.forRewarded(), Executors.newSingleThreadExecutor());
    }

    UnityRewardedAd(Activity activity, UnityRewardedAdCallback callback, AdWrapper<RewardedAd> adWrapper, Executor executor) {
        super(activity, callback, executor);
        this.adWrapper = adWrapper;
    }

    public void load(final AdRequest request) {
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$$ExternalSyntheticLambda0
            @Override // java.lang.Runnable
            public final void run() {
                UnityRewardedAd.this.m205lambda$load$0$comgoogleunityadsdecagonUnityRewardedAd(request);
            }
        });
    }

    /* renamed from: lambda$load$0$com-google-unity-ads-decagon-UnityRewardedAd */
    public /* synthetic */ void m205lambda$load$0$comgoogleunityadsdecagonUnityRewardedAd(AdRequest adRequest) {
        this.adWrapper.load(adRequest, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.decagon.UnityRewardedAd$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 implements AdLoadCallback<RewardedAd> {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass1(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public void onAdLoaded(RewardedAd rewardedAd) {
            this.this$0.ad = rewardedAd;
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass1.this.m208x85e970e4();
                }
            });
        }

        /* renamed from: lambda$onAdLoaded$0$com-google-unity-ads-decagon-UnityRewardedAd$1 */
        public /* synthetic */ void m208x85e970e4() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onRewardedAdLoaded();
            }
        }

        public void onAdFailedToLoad(final LoadAdError adError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass1.this.m207x33288cab(adError);
                }
            });
            this.this$0.ad = null;
        }

        /* renamed from: lambda$onAdFailedToLoad$0$com-google-unity-ads-decagon-UnityRewardedAd$1 */
        public /* synthetic */ void m207x33288cab(LoadAdError loadAdError) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onRewardedAdFailedToLoad(loadAdError);
            }
        }
    }

    public void show() {
        if (this.ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to show rewarded ad before it was ready. Please call load first and wait for a successful onAdLoaded callback.");
            return;
        }
        ((RewardedAd) this.ad).setAdEventCallback(new AnonymousClass2(this));
        this.activity.runOnUiThread(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$$ExternalSyntheticLambda1
            @Override // java.lang.Runnable
            public final void run() {
                UnityRewardedAd.this.m206lambda$show$0$comgoogleunityadsdecagonUnityRewardedAd();
            }
        });
    }

    /* renamed from: com.google.unity.ads.decagon.UnityRewardedAd$2 */
    /* loaded from: classes2.dex */
    public class AnonymousClass2 implements RewardedAdEventCallback {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass2(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onAdShowedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$2$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.m214x5cdc51c6();
                }
            });
        }

        /* renamed from: lambda$onAdShowedFullScreenContent$0$com-google-unity-ads-decagon-UnityRewardedAd$2 */
        public /* synthetic */ void m214x5cdc51c6() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdShowedFullScreenContent();
            }
        }

        public void onAdDismissedFullScreenContent() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$2$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.m210x31cc29f5();
                }
            });
            this.this$0.ad = null;
        }

        /* renamed from: lambda$onAdDismissedFullScreenContent$0$com-google-unity-ads-decagon-UnityRewardedAd$2 */
        public /* synthetic */ void m210x31cc29f5() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdDismissedFullScreenContent();
            }
        }

        public void onAdFailedToShowFullScreenContent(final FullScreenContentError fullScreenContentError) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$2$$ExternalSyntheticLambda5
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.m211x98d9169f(fullScreenContentError);
                }
            });
            this.this$0.ad = null;
        }

        /* renamed from: lambda$onAdFailedToShowFullScreenContent$0$com-google-unity-ads-decagon-UnityRewardedAd$2 */
        public /* synthetic */ void m211x98d9169f(FullScreenContentError fullScreenContentError) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdFailedToShowFullScreenContent(fullScreenContentError);
            }
        }

        public void onAdImpression() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$2$$ExternalSyntheticLambda4
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.m212xf7840ee1();
                }
            });
        }

        /* renamed from: lambda$onAdImpression$0$com-google-unity-ads-decagon-UnityRewardedAd$2 */
        public /* synthetic */ void m212xf7840ee1() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdImpression();
            }
        }

        public void onAdClicked() {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$2$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.m209x6fe74d61();
                }
            });
        }

        /* renamed from: lambda$onAdClicked$0$com-google-unity-ads-decagon-UnityRewardedAd$2 */
        public /* synthetic */ void m209x6fe74d61() {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onAdClicked();
            }
        }

        public void onAdPaid(final AdValue adValue) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$2$$ExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass2.this.m213lambda$onAdPaid$0$comgoogleunityadsdecagonUnityRewardedAd$2(adValue);
                }
            });
        }

        /* renamed from: lambda$onAdPaid$0$com-google-unity-ads-decagon-UnityRewardedAd$2 */
        public /* synthetic */ void m213lambda$onAdPaid$0$comgoogleunityadsdecagonUnityRewardedAd$2(AdValue adValue) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onPaidEvent(adValue.getPrecisionType().ordinal(), adValue.getValueMicros(), adValue.getCurrencyCode());
            }
        }
    }

    /* renamed from: lambda$show$0$com-google-unity-ads-decagon-UnityRewardedAd */
    public /* synthetic */ void m206lambda$show$0$comgoogleunityadsdecagonUnityRewardedAd() {
        ((RewardedAd) this.ad).setImmersiveMode(true);
        ((RewardedAd) this.ad).show(this.activity, new AnonymousClass3(this));
    }

    /* renamed from: com.google.unity.ads.decagon.UnityRewardedAd$3 */
    /* loaded from: classes2.dex */
    public class AnonymousClass3 implements OnUserEarnedRewardListener {
        final /* synthetic */ UnityRewardedAd this$0;

        AnonymousClass3(final UnityRewardedAd this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        public void onUserEarnedReward(final RewardItem rewardItem) {
            this.this$0.executor.execute(new Runnable() { // from class: com.google.unity.ads.decagon.UnityRewardedAd$3$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityRewardedAd.AnonymousClass3.this.m215x14c1ba1d(rewardItem);
                }
            });
        }

        /* renamed from: lambda$onUserEarnedReward$0$com-google-unity-ads-decagon-UnityRewardedAd$3 */
        public /* synthetic */ void m215x14c1ba1d(RewardItem rewardItem) {
            if (this.this$0.callback != 0) {
                ((UnityRewardedAdCallback) this.this$0.callback).onUserEarnedReward(rewardItem.getType(), rewardItem.getAmount());
            }
        }
    }

    public long getPlacementId() {
        if (this.ad == 0) {
            return 0L;
        }
        return ((RewardedAd) this.ad).getPlacementId();
    }

    public void setPlacementId(long placementId) {
        if (this.ad == 0) {
            return;
        }
        ((RewardedAd) this.ad).setPlacementId(placementId);
    }

    public ResponseInfo getResponseInfo() {
        if (this.ad == 0) {
            Log.e(PluginUtils.LOGTAG, "Tried to get response info before it was ready. Returning null.");
            return null;
        }
        return ((RewardedAd) this.ad).getResponseInfo();
    }
}
