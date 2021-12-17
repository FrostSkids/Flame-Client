// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.internal;

import io.netty.util.ReferenceCountUtil;
import io.netty.util.Recycler;
import io.netty.util.concurrent.Promise;

public final class PendingWrite
{
    private /* synthetic */ Promise<Void> promise;
    private /* synthetic */ Object msg;
    private static final /* synthetic */ Recycler<PendingWrite> RECYCLER;
    private final /* synthetic */ Recycler.Handle handle;
    
    public boolean failAndRecycle(final Throwable llllllllllllIlllIIlIIlIlIllllIII) {
        ReferenceCountUtil.release(this.msg);
        "".length();
        if (lIIIllIIlIIllIIl(this.promise)) {
            this.promise.setFailure(llllllllllllIlllIIlIIlIlIllllIII);
            "".length();
        }
        return this.recycle();
    }
    
    private static boolean lIIIllIIlIIllIIl(final Object llllllllllllIlllIIlIIlIlIllIIIII) {
        return llllllllllllIlllIIlIIlIlIllIIIII != null;
    }
    
    static {
        RECYCLER = new Recycler<PendingWrite>() {
            @Override
            protected PendingWrite newObject(final Handle llllllllllllIlllllllIllIIlIlIIIl) {
                return new PendingWrite(llllllllllllIlllllllIllIIlIlIIIl, null);
            }
        };
    }
    
    public Promise<Void> promise() {
        return this.promise;
    }
    
    public static PendingWrite newInstance(final Object llllllllllllIlllIIlIIlIllIIIllII, final Promise<Void> llllllllllllIlllIIlIIlIllIIIlIll) {
        final PendingWrite llllllllllllIlllIIlIIlIllIIIlIlI = PendingWrite.RECYCLER.get();
        llllllllllllIlllIIlIIlIllIIIlIlI.msg = llllllllllllIlllIIlIIlIllIIIllII;
        llllllllllllIlllIIlIIlIllIIIlIlI.promise = llllllllllllIlllIIlIIlIllIIIlIll;
        return llllllllllllIlllIIlIIlIllIIIlIlI;
    }
    
    public Object msg() {
        return this.msg;
    }
    
    public Promise<Void> recycleAndGet() {
        final Promise<Void> llllllllllllIlllIIlIIlIlIllIlIll = this.promise;
        this.recycle();
        "".length();
        return llllllllllllIlllIIlIIlIlIllIlIll;
    }
    
    public boolean recycle() {
        this.msg = null;
        this.promise = null;
        return PendingWrite.RECYCLER.recycle(this, this.handle);
    }
    
    public boolean successAndRecycle() {
        if (lIIIllIIlIIllIIl(this.promise)) {
            this.promise.setSuccess(null);
            "".length();
        }
        return this.recycle();
    }
    
    private PendingWrite(final Recycler.Handle llllllllllllIlllIIlIIlIllIIIIIll) {
        this.handle = llllllllllllIlllIIlIIlIllIIIIIll;
    }
}
