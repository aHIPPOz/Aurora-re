package com.unity3d.player;

import java.lang.reflect.AccessibleObject;
/* renamed from: com.unity3d.player.t */
/* loaded from: classes2.dex */
public final class C0104t {
    public final Class a;
    public final String b;
    public final String c;
    public final int d;
    public volatile AccessibleObject e;

    public C0104t(Class cls, String str, String str2) {
        this.a = cls;
        this.b = str;
        this.c = str2;
        int hashCode = str.hashCode();
        this.d = str2.hashCode() + ((hashCode + ((cls.hashCode() + 527) * 31)) * 31);
    }

    public final int hashCode() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0104t) {
            C0104t c0104t = (C0104t) obj;
            if (this.d == c0104t.d && this.c.equals(c0104t.c) && this.b.equals(c0104t.b) && this.a.equals(c0104t.a)) {
                return true;
            }
        }
        return false;
    }
}
