package com.unity3d.player;
/* loaded from: classes2.dex */
public final class V extends Enum {
    public static final V a = new V(0, "PAUSE");
    public static final V b = new V(1, "RESUME");
    public static final V c = new V(2, "QUIT");
    public static final V d = new V(3, "SURFACE_LOST");
    public static final V e = new V(4, "SURFACE_ACQUIRED");
    public static final V f = new V(5, "FOCUS_LOST");
    public static final V g = new V(6, "FOCUS_GAINED");
    public static final V h = new V(7, "NEXT_FRAME");
    public static final V i = new V(8, "ORIENTATION_ANGLE_CHANGE");

    public V(int i2, String str) {
        super(str, i2);
    }
}
