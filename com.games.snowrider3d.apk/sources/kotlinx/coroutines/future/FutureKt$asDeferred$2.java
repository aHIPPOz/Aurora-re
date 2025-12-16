package kotlinx.coroutines.future;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.concurrent.CompletionException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.CompletableDeferred;
import kotlinx.coroutines.CoroutineExceptionHandlerKt;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001\"\u0004\b\u0000\u0010\u00032\u000e\u0010\u0004\u001a\n \u0002*\u0004\u0018\u0001H\u0003H\u00032\u000e\u0010\u0005\u001a\n \u0002*\u0004\u0018\u00010\u00060\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "kotlin.jvm.PlatformType", RequestConfiguration.MAX_AD_CONTENT_RATING_T, AppMeasurementSdk.ConditionalUserProperty.VALUE, "exception", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "invoke", "(Ljava/lang/Object;Ljava/lang/Throwable;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class FutureKt$asDeferred$2 extends Lambda implements Function2<T, Throwable, Object> {
    final /* synthetic */ CompletableDeferred<T> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$asDeferred$2(CompletableDeferred<T> completableDeferred) {
        super(2);
        this.$result = completableDeferred;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Throwable th) {
        return invoke2((FutureKt$asDeferred$2) obj, th);
    }

    /* renamed from: invoke */
    public final Object invoke2(T t, Throwable th) {
        boolean z;
        Throwable cause;
        try {
            if (th == null) {
                z = this.$result.complete(t);
            } else {
                CompletableDeferred<T> completableDeferred = this.$result;
                CompletionException completionException = th instanceof CompletionException ? (CompletionException) th : null;
                if (completionException != null && (cause = completionException.getCause()) != null) {
                    th = cause;
                }
                z = completableDeferred.completeExceptionally(th);
            }
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            CoroutineExceptionHandlerKt.handleCoroutineException(EmptyCoroutineContext.INSTANCE, th2);
            return Unit.INSTANCE;
        }
    }
}
