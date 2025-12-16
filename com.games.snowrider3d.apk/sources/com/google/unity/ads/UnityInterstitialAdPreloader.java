package com.google.unity.ads;

import android.app.Activity;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.ResponseInfo;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdPreloader;
import com.google.android.gms.ads.preload.PreloadCallbackV2;
import com.google.android.gms.ads.preload.PreloadConfiguration;
import com.google.unity.ads.UnityInterstitialAdPreloader;
import java.util.Map;
import java.util.Objects;
/* loaded from: classes2.dex */
public class UnityInterstitialAdPreloader {
    private final Activity activity;
    private final UnityPreloadCallback preloadCallback;

    public UnityInterstitialAdPreloader(Activity activity, UnityPreloadCallback preloadCallback) {
        this.activity = activity;
        this.preloadCallback = preloadCallback;
    }

    public boolean start(String preloadId, PreloadConfiguration preloadConfiguration) {
        return InterstitialAdPreloader.start(preloadId, preloadConfiguration, new AnonymousClass1(this));
    }

    /* renamed from: com.google.unity.ads.UnityInterstitialAdPreloader$1 */
    /* loaded from: classes2.dex */
    public class AnonymousClass1 extends PreloadCallbackV2 {
        final /* synthetic */ UnityInterstitialAdPreloader this$0;

        AnonymousClass1(final UnityInterstitialAdPreloader this$0) {
            Objects.requireNonNull(this$0);
            this.this$0 = this$0;
        }

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdPreloaded(final String preloadId, final ResponseInfo responseInfo) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda0
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.m107xfd2291cd(preloadId, responseInfo);
                }
            });
        }

        /* renamed from: lambda$onAdPreloaded$0$com-google-unity-ads-UnityInterstitialAdPreloader$1 */
        public /* synthetic */ void m107xfd2291cd(String str, ResponseInfo responseInfo) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdPreloaded(str, responseInfo);
            }
        }

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdsExhausted(final String preloadId) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda1
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.m108xeb0d4139(preloadId);
                }
            });
        }

        /* renamed from: lambda$onAdsExhausted$0$com-google-unity-ads-UnityInterstitialAdPreloader$1 */
        public /* synthetic */ void m108xeb0d4139(String str) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdsExhausted(str);
            }
        }

        @Override // com.google.android.gms.ads.preload.PreloadCallbackV2
        public void onAdFailedToPreload(final String preloadId, final AdError adError) {
            this.this$0.runOnNewThread(new Runnable() { // from class: com.google.unity.ads.UnityInterstitialAdPreloader$1$$ExternalSyntheticLambda2
                @Override // java.lang.Runnable
                public final void run() {
                    UnityInterstitialAdPreloader.AnonymousClass1.this.m106xdace736(preloadId, adError);
                }
            });
        }

        /* renamed from: lambda$onAdFailedToPreload$0$com-google-unity-ads-UnityInterstitialAdPreloader$1 */
        public /* synthetic */ void m106xdace736(String str, AdError adError) {
            if (this.this$0.preloadCallback != null) {
                this.this$0.preloadCallback.onAdFailedToPreload(str, adError);
            }
        }
    }

    public boolean isAdAvailable(String preloadId) {
        return InterstitialAdPreloader.isAdAvailable(preloadId);
    }

    public int getNumAdsAvailable(String preloadId) {
        return InterstitialAdPreloader.getNumAdsAvailable(preloadId);
    }

    public void destroy(String preloadId) {
        InterstitialAdPreloader.destroy(preloadId);
    }

    public Interstitial pollAd(String preloadId, UnityInterstitialAdCallback callback) {
        InterstitialAd pollAd = InterstitialAdPreloader.pollAd(preloadId);
        if (pollAd == null) {
            return null;
        }
        Interstitial interstitial = new Interstitial(this.activity, callback);
        interstitial.setInterstitialAd(pollAd);
        return interstitial;
    }

    public PreloadConfiguration getConfiguration(String preloadId) {
        return InterstitialAdPreloader.getConfiguration(preloadId);
    }

    public Map<String, PreloadConfiguration> getConfigurations() {
        return InterstitialAdPreloader.getConfigurations();
    }

    public void destroyAll() {
        InterstitialAdPreloader.destroyAll();
    }

    public void runOnNewThread(final Runnable action) {
        new Thread(action).start();
    }
}
