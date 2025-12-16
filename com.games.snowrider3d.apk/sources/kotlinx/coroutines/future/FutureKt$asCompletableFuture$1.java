package kotlinx.coroutines.future;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import java.util.concurrent.CompletableFuture;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.Deferred;
/* compiled from: Future.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, RequestConfiguration.MAX_AD_CONTENT_RATING_T, "it", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "invoke"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
final class FutureKt$asCompletableFuture$1 extends Lambda implements Function1<Throwable, Unit> {
    final /* synthetic */ CompletableFuture<T> $future;
    final /* synthetic */ Deferred<T> $this_asCompletableFuture;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public FutureKt$asCompletableFuture$1(CompletableFuture<T> completableFuture, Deferred<? extends T> deferred) {
        super(1);
        this.$future = completableFuture;
        this.$this_asCompletableFuture = deferred;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
        invoke2(th);
        return Unit.INSTANCE;
    }

    /* renamed from: invoke */
    public final void invoke2(Throwable th) {
        try {
            this.$future.complete(this.$this_asCompletableFuture.getCompleted());
        } catch (Throwable th2) {
            this.$future.completeExceptionally(th2);
        }
    }
}
