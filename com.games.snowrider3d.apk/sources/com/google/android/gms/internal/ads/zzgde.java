package com.google.android.gms.internal.ads;

import com.google.common.util.concurrent.ListenableFuture;
/* compiled from: com.google.android.gms:play-services-ads@@24.5.0 */
/* loaded from: classes2.dex */
public class zzgde extends zzgdo {
    public static zzgde zzw(ListenableFuture listenableFuture) {
        return listenableFuture instanceof zzgde ? (zzgde) listenableFuture : new zzgdf(listenableFuture);
    }
}
