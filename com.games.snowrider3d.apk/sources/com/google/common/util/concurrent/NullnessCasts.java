package com.google.common.util.concurrent;

import javax.annotation.CheckForNull;
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class NullnessCasts {
    @ParametricNullness
    public static <T> T uncheckedCastNullableTToT(@CheckForNull T t) {
        return t;
    }

    @ParametricNullness
    public static <T> T uncheckedNull() {
        return null;
    }

    private NullnessCasts() {
    }
}
