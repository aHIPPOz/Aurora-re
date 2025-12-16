package com.google.common.io;

import java.nio.Buffer;
@ElementTypesAreNonnullByDefault
/* loaded from: classes2.dex */
final class Java8Compatibility {
    public static void clear(Buffer buffer) {
        buffer.clear();
    }

    public static void flip(Buffer buffer) {
        buffer.flip();
    }

    public static void limit(Buffer buffer, int i) {
        buffer.limit(i);
    }

    static void mark(Buffer buffer) {
        buffer.mark();
    }

    public static void position(Buffer buffer, int i) {
        buffer.position(i);
    }

    static void reset(Buffer buffer) {
        buffer.reset();
    }

    private Java8Compatibility() {
    }
}
