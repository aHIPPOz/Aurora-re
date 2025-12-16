package androidx.constraintlayout.core.widgets;

import androidx.constraintlayout.core.LinearSystem;
import java.util.ArrayList;
/* loaded from: classes.dex */
public class Chain {
    private static final boolean DEBUG = false;
    public static final boolean USE_CHAIN_OPTIMIZATION = false;

    public static void applyChainConstraints(ConstraintWidgetContainer constraintWidgetContainer, LinearSystem linearSystem, ArrayList<ConstraintWidget> arrayList, int i) {
        int i2;
        ChainHead[] chainHeadArr;
        int i3;
        if (i == 0) {
            i3 = constraintWidgetContainer.mHorizontalChainsSize;
            chainHeadArr = constraintWidgetContainer.mHorizontalChainsArray;
            i2 = 0;
        } else {
            i3 = constraintWidgetContainer.mVerticalChainsSize;
            chainHeadArr = constraintWidgetContainer.mVerticalChainsArray;
            i2 = 2;
        }
        for (int i4 = 0; i4 < i3; i4++) {
            ChainHead chainHead = chainHeadArr[i4];
            chainHead.define();
            if (arrayList == null || (arrayList != null && arrayList.contains(chainHead.mFirst))) {
                applyChainConstraints(constraintWidgetContainer, linearSystem, i, i2, chainHead);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0037, code lost:
        if (r3.mHorizontalChainStyle == 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x004a, code lost:
        if (r3.mVerticalChainStyle == 2) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x004c, code lost:
        r6 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004e, code lost:
        r6 = false;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:195:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x03c2  */
    /* JADX WARN: Removed duplicated region for block: B:285:0x04f7  */
    /* JADX WARN: Removed duplicated region for block: B:288:0x0502  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0507  */
    /* JADX WARN: Removed duplicated region for block: B:292:0x050d  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:295:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0528  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static void applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer r36, androidx.constraintlayout.core.LinearSystem r37, int r38, int r39, androidx.constraintlayout.core.widgets.ChainHead r40) {
        /*
            Method dump skipped, instructions count: 1357
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.core.widgets.Chain.applyChainConstraints(androidx.constraintlayout.core.widgets.ConstraintWidgetContainer, androidx.constraintlayout.core.LinearSystem, int, int, androidx.constraintlayout.core.widgets.ChainHead):void");
    }
}
