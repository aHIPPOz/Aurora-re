package com.unity3d.player;

import com.unity3d.player.a.AbstractC0061q;
import java.lang.invoke.MethodHandles;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/* renamed from: com.unity3d.player.s */
/* loaded from: classes2.dex */
public final class C0102s implements InvocationHandler {
    public final RunnableC0108v a;
    public final UnityPlayer b;
    public final long c;
    public final /* synthetic */ long d;

    public C0102s(long j, UnityPlayer unityPlayer) {
        long j2;
        this.d = j;
        j2 = ReflectionHelper.b;
        this.a = new RunnableC0108v(j2, j);
        this.b = unityPlayer;
        this.c = j2;
    }

    public static Object a(Object obj, Method method, Object[] objArr, C0106u c0106u) {
        try {
            if (objArr == null) {
                try {
                    objArr = new Object[0];
                } catch (NoClassDefFoundError unused) {
                    AbstractC0061q.Log(6, "Java interface default methods are only supported since Android Oreo");
                    ReflectionHelper.nativeProxyLogJNIInvokeException(c0106u.a);
                    c0106u.a = 0L;
                    return null;
                }
            }
            Class<?> declaringClass = method.getDeclaringClass();
            Constructor declaredConstructor = MethodHandles.Lookup.class.getDeclaredConstructor(Class.class, Integer.TYPE);
            declaredConstructor.setAccessible(true);
            return ((MethodHandles.Lookup) declaredConstructor.newInstance(declaringClass, 2)).in(declaringClass).unreflectSpecial(method, declaringClass).bindTo(obj).invokeWithArguments(objArr);
        } finally {
            long j = c0106u.a;
            if (j != 0) {
                ReflectionHelper.nativeProxyJNIFreeGCHandle(j);
            }
        }
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        Object nativeProxyInvoke;
        if (!ReflectionHelper.beginProxyCall(this.c)) {
            AbstractC0061q.Log(6, "Scripting proxy object was destroyed, because Unity player was unloaded.");
            return null;
        }
        try {
            nativeProxyInvoke = ReflectionHelper.nativeProxyInvoke(this.d, method.getName(), objArr);
            if (!(nativeProxyInvoke instanceof C0106u)) {
                return nativeProxyInvoke;
            }
            C0106u c0106u = (C0106u) nativeProxyInvoke;
            if (c0106u.b && (method.getModifiers() & 1024) == 0) {
                return a(obj, method, objArr, c0106u);
            }
            ReflectionHelper.nativeProxyLogJNIInvokeException(c0106u.a);
            return null;
        } finally {
            ReflectionHelper.endProxyCall();
        }
    }

    public void finalize() {
        this.b.invokeOnMainThread(this.a);
        super.finalize();
    }
}
