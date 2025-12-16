package com.google.android.gms.nearby.messages.internal;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.util.Log;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: com.google.android.gms:play-services-nearby@@18.5.0 */
/* loaded from: classes2.dex */
public final class zzbb implements Application.ActivityLifecycleCallbacks {
    private final Activity zza;
    private final zzbh zzb;

    public /* synthetic */ zzbb(Activity activity, zzbh zzbhVar, zzba zzbaVar) {
        this.zza = activity;
        this.zzb = zzbhVar;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        if (activity == this.zza) {
            Log.v("NearbyMessages", String.format("Unregistering ClientLifecycleSafetyNet's ActivityLifecycleCallbacks for %s", activity.getPackageName()));
            activity.getApplication().unregisterActivityLifecycleCallbacks(this);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        if (activity == this.zza) {
            this.zzb.zzl(
            /*  JADX ERROR: Method code generation error
                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0007: INVOKE  
                  (wrap: com.google.android.gms.nearby.messages.internal.zzbh : 0x0004: IGET  (r2v1 com.google.android.gms.nearby.messages.internal.zzbh A[REMOVE]) = (r1v0 'this' com.google.android.gms.nearby.messages.internal.zzbb A[IMMUTABLE_TYPE, THIS]) com.google.android.gms.nearby.messages.internal.zzbb.zzb com.google.android.gms.nearby.messages.internal.zzbh)
                  (wrap: com.google.android.gms.nearby.messages.internal.zzbc : 0x0003: CONSTRUCTOR  (1 int) call: com.google.android.gms.nearby.messages.internal.zzap.<init>(int):void type: CONSTRUCTOR)
                  (0 int)
                 type: DIRECT call: com.google.android.gms.nearby.messages.internal.zzbh.zzl(com.google.android.gms.nearby.messages.internal.zzbc, int):com.google.android.gms.tasks.Task in method: com.google.android.gms.nearby.messages.internal.zzbb.onActivityStopped(android.app.Activity):void, file: classes2.dex
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:287)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:250)
                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:91)
                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:80)
                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:123)
                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:63)
                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:286)
                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:265)
                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:369)
                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:304)
                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$2(ClassGen.java:270)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:266)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:256)
                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:240)
                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:131)
                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:94)
                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                	at jadx.core.ProcessClass.process(ProcessClass.java:77)
                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:115)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:381)
                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:307)
                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.google.android.gms.nearby.messages.internal.zzap, state: NOT_LOADED
                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:302)
                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:696)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:395)
                	at jadx.core.codegen.InsnGen.addWrappedArg(InsnGen.java:141)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:117)
                	at jadx.core.codegen.InsnGen.addArg(InsnGen.java:104)
                	at jadx.core.codegen.InsnGen.generateMethodArguments(InsnGen.java:1029)
                	at jadx.core.codegen.InsnGen.makeInvoke(InsnGen.java:830)
                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:399)
                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:280)
                	... 42 more
                */
            /*
                this = this;
                android.app.Activity r0 = r1.zza
                if (r2 != r0) goto La
                com.google.android.gms.nearby.messages.internal.zzbh r2 = r1.zzb
                r0 = 1
                com.google.android.gms.nearby.messages.internal.zzbh.zza(r2, r0)
            La:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.nearby.messages.internal.zzbb.onActivityStopped(android.app.Activity):void");
        }
    }
