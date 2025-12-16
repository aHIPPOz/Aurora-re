package com.unity3d.player;

import android.text.TextUtils;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* renamed from: com.unity3d.player.a */
/* loaded from: classes2.dex */
public final class C0044a implements InvocationHandler {
    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object obj2;
        if (objArr != null) {
            try {
                if (objArr.length > 0 && (obj2 = objArr[0]) != null) {
                    String obj3 = obj2.getClass().getMethod("getId", null).invoke(objArr[0], null).toString();
                    if (!TextUtils.isEmpty(obj3)) {
                        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(obj3);
                        return null;
                    }
                }
            } catch (Exception unused) {
            }
        }
        AndroidAppSetIdHelper.nativeOnAndroidAppSetIdResult(null);
        return null;
    }
}
