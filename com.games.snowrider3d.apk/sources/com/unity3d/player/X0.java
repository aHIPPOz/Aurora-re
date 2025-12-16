package com.unity3d.player;

import android.app.Activity;
import android.content.Context;
import android.graphics.Insets;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import android.view.WindowManager;
import android.view.WindowMetrics;
import android.widget.FrameLayout;
/* loaded from: classes2.dex */
public abstract class X0 {
    public static int a;

    public static Point a(Context context) {
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            WindowMetrics currentWindowMetrics = windowManager.getCurrentWindowMetrics();
            currentWindowMetrics.getWindowInsets().getInsetsIgnoringVisibility(WindowInsets.Type.systemBars());
            return new Point(currentWindowMetrics.getBounds().width(), currentWindowMetrics.getBounds().height());
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
    }

    public static void a(Activity activity, FrameLayout frameLayout) {
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            Insets insets = activity.getWindow().getDecorView().getRootWindowInsets().getInsets(a);
            frameLayout.setPadding(insets.left, insets.top, insets.right, insets.bottom);
        }
    }

    public static void a(Activity activity, FrameLayout frameLayout, boolean z, boolean z2) {
        int i;
        boolean z3;
        int i2;
        int i3;
        if (PlatformSupport.RED_VELVET_CAKE_SUPPORT) {
            WindowInsetsController windowInsetsController = activity.getWindow().getDecorView().getWindowInsetsController();
            if (windowInsetsController != null) {
                int i4 = 1;
                if (z) {
                    i2 = WindowInsets.Type.navigationBars();
                    i = 0;
                    z3 = true;
                } else {
                    i = WindowInsets.Type.navigationBars();
                    i2 = 0;
                    z3 = false;
                }
                if (z2) {
                    i2 |= WindowInsets.Type.statusBars();
                    z3 = true;
                } else {
                    i |= WindowInsets.Type.statusBars();
                }
                if (i2 != 0) {
                    windowInsetsController.hide(i2);
                }
                if (i != 0) {
                    windowInsetsController.show(i);
                }
                a = i;
                if (z3) {
                    i4 = 2;
                }
                windowInsetsController.setSystemBarsBehavior(i4);
            }
            activity.getWindow().setDecorFitsSystemWindows(false);
            return;
        }
        View decorView = activity.getWindow().getDecorView();
        if (z) {
            i3 = decorView.getSystemUiVisibility() | 5894;
        } else {
            i3 = decorView.getSystemUiVisibility() & (-5895);
        }
        if (z2) {
            i3 |= 1024;
        }
        decorView.setSystemUiVisibility(i3);
    }
}
