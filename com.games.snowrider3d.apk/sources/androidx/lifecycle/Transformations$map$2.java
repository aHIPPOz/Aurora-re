package androidx.lifecycle;

import androidx.arch.core.util.Function;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
/* compiled from: Transformations.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u000e\u0010\u0004\u001a\n \u0005*\u0004\u0018\u0001H\u0002H\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "X", "Y", "x", "kotlin.jvm.PlatformType", "invoke", "(Ljava/lang/Object;)V"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class Transformations$map$2 extends Lambda implements Function1<X, Unit> {
    final /* synthetic */ Function<X, Y> $mapFunction;
    final /* synthetic */ MediatorLiveData<Y> $result;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Transformations$map$2(MediatorLiveData<Y> mediatorLiveData, Function<X, Y> function) {
        super(1);
        this.$result = mediatorLiveData;
        this.$mapFunction = function;
    }

    @Override // kotlin.jvm.functions.Function1
    /* renamed from: invoke */
    public final void invoke2(X x) {
        this.$result.setValue(this.$mapFunction.apply(x));
    }
}
