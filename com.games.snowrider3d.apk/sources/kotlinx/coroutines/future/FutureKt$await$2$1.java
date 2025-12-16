package kotlinx.coroutines.future;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "invoke"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class FutureKt$await$2$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ ContinuationHandler<T> $consumer;
    final /* synthetic */ CompletableFuture<T> $future;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FutureKt$await$2$1(CompletableFuture<T> completableFuture, ContinuationHandler<T> continuationHandler) {
        super(1);
        this.$future = completableFuture;
        this.$consumer = continuationHandler;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Throwable th) {
        this.$future.cancel(false);
        this.$consumer.cont = null;
    }
}
