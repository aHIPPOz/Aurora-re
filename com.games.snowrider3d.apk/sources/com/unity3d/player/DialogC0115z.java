package com.unity3d.player;

import android.app.Dialog;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.unity3d.player.a.C0064u;
import com.unity3d.player.a.C0065v;
import kotlin.time.DurationKt;
/* renamed from: com.unity3d.player.z */
/* loaded from: classes2.dex */
public final class DialogC0115z extends Dialog implements View.OnClickListener {
    public final Context a;
    public final UnityPlayerForActivityOrService b;
    public com.unity3d.player.a.B c = null;
    public D d = null;
    public C0065v e = null;

    public DialogC0115z(Context context, UnityPlayerForActivityOrService unityPlayerForActivityOrService) {
        super(context);
        this.a = context;
        this.b = unityPlayerForActivityOrService;
    }

    public final void a(D d, boolean z, boolean z2) {
        this.d = d;
        Window window = getWindow();
        window.requestFeature(1);
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.gravity = 80;
        attributes.x = 0;
        attributes.y = 0;
        window.setAttributes(attributes);
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        this.c = createSoftInputView(this.d.c);
        window.setLayout(-1, -2);
        window.clearFlags(2);
        if (!z2) {
            window.addFlags(32);
            window.addFlags(262144);
        }
        a(z);
        getWindow().setSoftInputMode(5);
        this.e = C0100r.a(this, DurationKt.NANOS_IN_MILLIS, new RunnableC0114y(this));
    }

    public final Rect a() {
        Rect rect = new Rect();
        FrameLayout frameLayout = this.b.getFrameLayout();
        frameLayout.getWindowVisibleDisplayFrame(rect);
        int[] iArr = new int[2];
        frameLayout.getLocationOnScreen(iArr);
        Point point = new Point(rect.left - iArr[0], rect.height() - this.c.getHeight());
        Point point2 = new Point();
        getWindow().getWindowManager().getDefaultDisplay().getSize(point2);
        int height = frameLayout.getHeight();
        int i = height - point2.y;
        int i2 = height - point.y;
        if (i2 != this.c.getHeight() + i) {
            this.b.reportSoftInputIsVisible(true);
        } else {
            this.b.reportSoftInputIsVisible(false);
        }
        return new Rect(point.x, point.y, this.c.getWidth(), i2);
    }

    public final void a(boolean z) {
        com.unity3d.player.a.B b = this.c;
        if (z) {
            RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) b.b.getLayoutParams();
            layoutParams.height = 1;
            b.b.setLayoutParams(layoutParams);
            RelativeLayout.LayoutParams layoutParams2 = (RelativeLayout.LayoutParams) b.a.getLayoutParams();
            layoutParams2.height = 1;
            b.a.setLayoutParams(layoutParams2);
            Rect rect = b.e;
            b.setPadding(rect.left, rect.top, rect.right, rect.bottom);
            b.b.setBackgroundColor(0);
            b.setBackgroundColor(0);
        } else {
            b.setVisibility(0);
            Rect rect2 = b.d;
            b.setPadding(rect2.left, rect2.top, rect2.right, rect2.bottom);
            RelativeLayout.LayoutParams layoutParams3 = (RelativeLayout.LayoutParams) b.b.getLayoutParams();
            layoutParams3.height = -2;
            b.b.setLayoutParams(layoutParams3);
            RelativeLayout.LayoutParams layoutParams4 = (RelativeLayout.LayoutParams) b.a.getLayoutParams();
            layoutParams4.height = -2;
            b.a.setLayoutParams(layoutParams4);
        }
        b.invalidate();
        b.requestLayout();
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        D d = this.d;
        d.a(d.a(), false);
    }

    @Override // android.app.Dialog
    public final void onBackPressed() {
        C0064u c0064u;
        Runnable runnable;
        C0065v c0065v = this.e;
        if (c0065v == null || (c0064u = c0065v.a) == null || (runnable = c0064u.a) == null) {
            return;
        }
        runnable.run();
    }

    @Override // android.app.Dialog
    public final void onStop() {
        C0065v c0065v = this.e;
        if (c0065v != null) {
            c0065v.unregisterOnBackPressedCallback();
            this.e = null;
        }
        super.onStop();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.d.e || (motionEvent.getAction() != 4 && !this.d.d)) {
            return super.dispatchTouchEvent(motionEvent);
        }
        return true;
    }

    public com.unity3d.player.a.B createSoftInputView(EditText editText) {
        com.unity3d.player.a.B b = new com.unity3d.player.a.B(this.a, editText);
        b.a.setOnClickListener(this);
        setContentView(b);
        return b;
    }
}
