package com.unity3d.player;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.ads.RequestConfiguration;
import com.unity3d.player.a.AbstractC0061q;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
/* loaded from: classes2.dex */
final class ReflectionHelper {
    protected static boolean LOG = false;
    protected static final boolean LOGV = false;
    private static final C0104t[] a = new C0104t[4096];
    private static long b = 0;
    private static long c = 0;
    private static boolean d = false;

    public static native void nativeProxyFinalize(long j);

    public static native Object nativeProxyInvoke(long j, String str, Object[] objArr);

    public static native void nativeProxyJNIFreeGCHandle(long j);

    public static native void nativeProxyLogJNIInvokeException(long j);

    private static synchronized boolean a(C0104t c0104t) {
        synchronized (ReflectionHelper.class) {
            C0104t c0104t2 = a[c0104t.d & 4095];
            if (!c0104t.equals(c0104t2)) {
                return false;
            }
            c0104t.e = c0104t2.e;
            return true;
        }
    }

    protected static Constructor getConstructorID(Class cls, String str) {
        Constructor<?> constructor;
        C0104t c0104t = new C0104t(cls, RequestConfiguration.MAX_AD_CONTENT_RATING_UNSPECIFIED, str);
        if (a(c0104t)) {
            constructor = (Constructor) c0104t.e;
        } else {
            Class[] a2 = a(str);
            Constructor<?>[] constructors = cls.getConstructors();
            int length = constructors.length;
            Constructor<?> constructor2 = null;
            float f = 0.0f;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Constructor<?> constructor3 = constructors[i];
                float a3 = a(Void.TYPE, constructor3.getParameterTypes(), a2);
                if (a3 > f) {
                    if (a3 == 1.0f) {
                        constructor2 = constructor3;
                        break;
                    }
                    constructor2 = constructor3;
                    f = a3;
                }
                i++;
            }
            synchronized (ReflectionHelper.class) {
                c0104t.e = constructor2;
                a[c0104t.d & 4095] = c0104t;
            }
            constructor = constructor2;
        }
        if (constructor != null) {
            return constructor;
        }
        throw new NoSuchMethodError("<init>" + str + " in class " + cls.getName());
    }

    protected static Method getMethodID(Class cls, String str, String str2, boolean z) {
        Method method;
        C0104t c0104t = new C0104t(cls, str, str2);
        if (a(c0104t)) {
            method = (Method) c0104t.e;
        } else {
            Class[] a2 = a(str2);
            Method method2 = null;
            float f = 0.0f;
            while (cls != null) {
                Method[] declaredMethods = cls.getDeclaredMethods();
                int length = declaredMethods.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Method method3 = declaredMethods[i];
                    if (z == Modifier.isStatic(method3.getModifiers()) && method3.getName().compareTo(str) == 0) {
                        float a3 = a(method3.getReturnType(), method3.getParameterTypes(), a2);
                        if (a3 <= f) {
                            continue;
                        } else if (a3 == 1.0f) {
                            method2 = method3;
                            f = a3;
                            break;
                        } else {
                            method2 = method3;
                            f = a3;
                        }
                    }
                    i++;
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                c0104t.e = method2;
                a[c0104t.d & 4095] = c0104t;
            }
            method = method2;
        }
        if (method == null) {
            String str3 = z ? "static" : "non-static";
            String name = cls.getName();
            throw new NoSuchMethodError("no " + str3 + " method with name='" + str + "' signature='" + str2 + "' in class L" + name + ";");
        }
        return method;
    }

    protected static Field getFieldID(Class cls, String str, String str2, boolean z) {
        Field field;
        C0104t c0104t = new C0104t(cls, str, str2);
        if (a(c0104t)) {
            field = (Field) c0104t.e;
        } else {
            Class[] a2 = a(str2);
            float f = 0.0f;
            Field field2 = null;
            while (cls != null) {
                Field[] declaredFields = cls.getDeclaredFields();
                int length = declaredFields.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    Field field3 = declaredFields[i];
                    if (z == Modifier.isStatic(field3.getModifiers()) && field3.getName().compareTo(str) == 0) {
                        float a3 = a(field3.getType(), null, a2);
                        if (a3 > f) {
                            field2 = field3;
                            if (a3 == 1.0f) {
                                f = a3;
                                break;
                            }
                            f = a3;
                        } else {
                            continue;
                        }
                    }
                    i++;
                }
                if (f == 1.0f || cls.isPrimitive() || cls.isInterface() || cls.equals(Object.class) || cls.equals(Void.TYPE)) {
                    break;
                }
                cls = cls.getSuperclass();
            }
            synchronized (ReflectionHelper.class) {
                c0104t.e = field2;
                a[c0104t.d & 4095] = c0104t;
            }
            field = field2;
        }
        if (field == null) {
            throw new NoSuchFieldError("no " + (z ? "static" : "non-static") + " field with name='" + str + "' signature='" + str2 + "' in class L" + cls.getName() + ";");
        }
        return field;
    }

    protected static String getFieldSignature(Field field) {
        Class<?> type = field.getType();
        if (type.isPrimitive()) {
            String name = type.getName();
            if (TypedValues.Custom.S_BOOLEAN.equals(name)) {
                return "Z";
            }
            if ("byte".equals(name)) {
                return "B";
            }
            if ("char".equals(name)) {
                return "C";
            }
            if ("double".equals(name)) {
                return "D";
            }
            if (TypedValues.Custom.S_FLOAT.equals(name)) {
                return "F";
            }
            if ("int".equals(name)) {
                return "I";
            }
            if ("long".equals(name)) {
                return "J";
            }
            return "short".equals(name) ? "S" : name;
        } else if (type.isArray()) {
            return type.getName().replace('.', '/');
        } else {
            return "L" + type.getName().replace('.', '/') + ";";
        }
    }

    private static float a(Class cls, Class cls2) {
        if (cls.equals(cls2)) {
            return 1.0f;
        }
        if (cls.isPrimitive() || cls2.isPrimitive()) {
            return 0.0f;
        }
        try {
            if (cls.asSubclass(cls2) != null) {
                return 0.5f;
            }
        } catch (ClassCastException unused) {
        }
        try {
            return cls2.asSubclass(cls) != null ? 0.1f : 0.0f;
        } catch (ClassCastException unused2) {
            return 0.0f;
        }
    }

    private static float a(Class cls, Class[] clsArr, Class[] clsArr2) {
        if (clsArr2.length == 0) {
            return 0.1f;
        }
        int i = 0;
        if ((clsArr == null ? 0 : clsArr.length) + 1 != clsArr2.length) {
            return 0.0f;
        }
        float f = 1.0f;
        if (clsArr != null) {
            int length = clsArr.length;
            float f2 = 1.0f;
            int i2 = 0;
            while (i < length) {
                f2 *= a(clsArr[i], clsArr2[i2]);
                i++;
                i2++;
            }
            f = f2;
        }
        return f * a(cls, clsArr2[clsArr2.length - 1]);
    }

    private static Class[] a(String str) {
        Class a2;
        int i = 0;
        int[] iArr = {0};
        ArrayList arrayList = new ArrayList();
        while (iArr[0] < str.length() && (a2 = a(str, iArr)) != null) {
            arrayList.add(a2);
        }
        Class[] clsArr = new Class[arrayList.size()];
        int size = arrayList.size();
        int i2 = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            clsArr[i2] = (Class) obj;
            i2++;
        }
        return clsArr;
    }

    private static Class a(String str, int[] iArr) {
        while (iArr[0] < str.length()) {
            int i = iArr[0];
            iArr[0] = i + 1;
            char charAt = str.charAt(i);
            if (charAt != '(' && charAt != ')') {
                if (charAt == 'L') {
                    int indexOf = str.indexOf(59, iArr[0]);
                    if (indexOf == -1) {
                        return null;
                    }
                    String substring = str.substring(iArr[0], indexOf);
                    iArr[0] = indexOf + 1;
                    try {
                        return Class.forName(substring.replace('/', '.'));
                    } catch (ClassNotFoundException unused) {
                        return null;
                    }
                } else if (charAt == 'Z') {
                    return Boolean.TYPE;
                } else {
                    if (charAt == 'I') {
                        return Integer.TYPE;
                    }
                    if (charAt == 'F') {
                        return Float.TYPE;
                    }
                    if (charAt == 'V') {
                        return Void.TYPE;
                    }
                    if (charAt == 'B') {
                        return Byte.TYPE;
                    }
                    if (charAt == 'C') {
                        return Character.TYPE;
                    }
                    if (charAt == 'S') {
                        return Short.TYPE;
                    }
                    if (charAt == 'J') {
                        return Long.TYPE;
                    }
                    if (charAt == 'D') {
                        return Double.TYPE;
                    }
                    if (charAt == '[') {
                        return Array.newInstance(a(str, iArr), 0).getClass();
                    }
                    AbstractC0061q.Log(5, "! parseType; " + charAt + " is not known!");
                    return null;
                }
            }
        }
        return null;
    }

    public static synchronized boolean beginProxyCall(long j) {
        synchronized (ReflectionHelper.class) {
            if (j == b) {
                c++;
                return true;
            }
            return false;
        }
    }

    public static synchronized void endProxyCall() {
        synchronized (ReflectionHelper.class) {
            long j = c - 1;
            c = j;
            if (0 != j || !d) {
                return;
            }
            ReflectionHelper.class.notifyAll();
        }
    }

    protected static synchronized void endUnityLaunch() {
        synchronized (ReflectionHelper.class) {
            try {
                b++;
                d = true;
                while (c > 0) {
                    ReflectionHelper.class.wait();
                }
            } catch (InterruptedException unused) {
                AbstractC0061q.Log(6, "Interrupted while waiting for all proxies to exit.");
            }
            d = false;
        }
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class cls) {
        return newProxyInstance(unityPlayer, j, new Class[]{cls});
    }

    protected static Object newProxyInstance(UnityPlayer unityPlayer, long j, Class[] clsArr) {
        return Proxy.newProxyInstance(ReflectionHelper.class.getClassLoader(), clsArr, new C0102s(j, unityPlayer));
    }

    protected static Object createInvocationError(long j, boolean z) {
        return new C0106u(j, z);
    }
}
