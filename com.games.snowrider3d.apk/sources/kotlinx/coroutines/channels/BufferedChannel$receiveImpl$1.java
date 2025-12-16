package kotlinx.coroutines.channels;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Lambda;
/* compiled from: BufferedChannel.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00030\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "R", "E", "<anonymous parameter 0>", "Lkotlinx/coroutines/channels/ChannelSegment;", "<anonymous parameter 1>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "<anonymous parameter 2>", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "invoke"}, k = 3, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public final class BufferedChannel$receiveImpl$1 extends Lambda implements Function3 {
    public static final BufferedChannel$receiveImpl$1 INSTANCE = new BufferedChannel$receiveImpl$1();

    public BufferedChannel$receiveImpl$1() {
        super(3);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
        return invoke((ChannelSegment) obj, ((Number) obj2).intValue(), ((Number) obj3).longValue());
    }

    public final Void invoke(ChannelSegment<E> channelSegment, int i, long j) {
        throw new IllegalStateException("unexpected".toString());
    }
}
