package kotlinx.coroutines.scheduling;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.ads.RequestConfiguration;
import kotlin.Metadata;
/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0006\u001a\u00020\u0007H&R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/TaskContext;", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "taskMode", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "getTaskMode", "()I", "afterTask", RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, "kotlinx-coroutines-core"}, k = 1, mv = {1, 8, 0}, xi = ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_VERTICAL_CHAINSTYLE)
/* loaded from: classes.dex */
public interface TaskContext {
    void afterTask();

    int getTaskMode();
}
