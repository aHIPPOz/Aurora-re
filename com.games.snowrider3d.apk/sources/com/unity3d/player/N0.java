package com.unity3d.player;

import android.content.Context;
import com.unity3d.player.a.AbstractC0054j;
import com.unity3d.player.a.AbstractC0061q;
import java.util.concurrent.Semaphore;
/* loaded from: classes2.dex */
public final class N0 implements Runnable {
    public final /* synthetic */ UnityPlayerForActivityOrService a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ String h;
    public final /* synthetic */ int i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ boolean k;
    public final /* synthetic */ Semaphore l;
    public final /* synthetic */ UnityPlayerForActivityOrService m;

    public N0(UnityPlayerForActivityOrService unityPlayerForActivityOrService, UnityPlayerForActivityOrService unityPlayerForActivityOrService2, String str, int i, boolean z, boolean z2, boolean z3, boolean z4, String str2, int i2, boolean z5, boolean z6, Semaphore semaphore) {
        this.m = unityPlayerForActivityOrService;
        this.a = unityPlayerForActivityOrService2;
        this.b = str;
        this.c = i;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.g = z4;
        this.h = str2;
        this.i = i2;
        this.j = z5;
        this.k = z6;
        this.l = semaphore;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AbstractC0112x abstractC0112x;
        AbstractC0112x abstractC0112x2;
        AbstractC0112x abstractC0112x3;
        AbstractC0112x abstractC0112x4;
        try {
            try {
                UnityPlayerForActivityOrService unityPlayerForActivityOrService = this.m;
                abstractC0112x = unityPlayerForActivityOrService.mSoftInput;
                if (abstractC0112x != null) {
                    unityPlayerForActivityOrService.dismissSoftInput();
                }
                UnityPlayerForActivityOrService unityPlayerForActivityOrService2 = this.m;
                int a = SoftInputProvider.a();
                Context context = this.m.mContext;
                UnityPlayerForActivityOrService unityPlayerForActivityOrService3 = this.a;
                if (AbstractC0054j.a(a) == 2) {
                    abstractC0112x2 = new C(context, unityPlayerForActivityOrService3);
                } else {
                    abstractC0112x2 = new D(context, unityPlayerForActivityOrService3);
                }
                unityPlayerForActivityOrService2.mSoftInput = abstractC0112x2;
                abstractC0112x3 = this.m.mSoftInput;
                abstractC0112x3.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k);
                abstractC0112x4 = this.m.mSoftInput;
                abstractC0112x4.f = new M0(this);
                abstractC0112x4.d();
                this.m.nativeReportKeyboardConfigChanged();
            } catch (Exception e) {
                AbstractC0061q.Log(6, "Exception when opening Softinput " + e);
            }
        } finally {
            this.l.release();
        }
    }
}
