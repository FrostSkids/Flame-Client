// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.DefaultPromise;

public class DefaultChannelPromise extends DefaultPromise<Void> implements ChannelPromise, ChannelFlushPromiseNotifier.FlushCheckpoint
{
    private final /* synthetic */ Channel channel;
    private /* synthetic */ long checkpoint;
    
    @Override
    public ChannelPromise removeListener(final GenericFutureListener<? extends Future<? super Void>> llllllllllllIlllllIIIlIIlIIIllIl) {
        super.removeListener(llllllllllllIlllllIIIlIIlIIIllIl);
        "".length();
        return this;
    }
    
    @Override
    public ChannelPromise addListener(final GenericFutureListener<? extends Future<? super Void>> llllllllllllIlllllIIIlIIlIIllIIl) {
        super.addListener(llllllllllllIlllllIIIlIIlIIllIIl);
        "".length();
        return this;
    }
    
    @Override
    public ChannelPromise promise() {
        return this;
    }
    
    @Override
    public ChannelPromise setFailure(final Throwable llllllllllllIlllllIIIlIIlIIlllll) {
        super.setFailure(llllllllllllIlllllIIIlIIlIIlllll);
        "".length();
        return this;
    }
    
    @Override
    protected EventExecutor executor() {
        final EventExecutor llllllllllllIlllllIIIlIIlIllIlII = super.executor();
        if (lIIIIIlIlIIIIIll(llllllllllllIlllllIIIlIIlIllIlII)) {
            return this.channel().eventLoop();
        }
        return llllllllllllIlllllIIIlIIlIllIlII;
    }
    
    @Override
    public ChannelPromise setSuccess() {
        return this.setSuccess(null);
    }
    
    @Override
    public Channel channel() {
        return this.channel;
    }
    
    @Override
    protected void checkDeadLock() {
        if (lIIIIIlIlIIIIlII(this.channel().isRegistered() ? 1 : 0)) {
            super.checkDeadLock();
        }
    }
    
    @Override
    public ChannelPromise removeListeners(final GenericFutureListener<? extends Future<? super Void>>... llllllllllllIlllllIIIlIIlIIIIlll) {
        super.removeListeners(llllllllllllIlllllIIIlIIlIIIIlll);
        "".length();
        return this;
    }
    
    @Override
    public long flushCheckpoint() {
        return this.checkpoint;
    }
    
    @Override
    public ChannelPromise await() throws InterruptedException {
        super.await();
        "".length();
        return this;
    }
    
    @Override
    public ChannelPromise sync() throws InterruptedException {
        super.sync();
        "".length();
        return this;
    }
    
    @Override
    public ChannelPromise awaitUninterruptibly() {
        super.awaitUninterruptibly();
        "".length();
        return this;
    }
    
    @Override
    public ChannelPromise syncUninterruptibly() {
        super.syncUninterruptibly();
        "".length();
        return this;
    }
    
    @Override
    public ChannelPromise addListeners(final GenericFutureListener<? extends Future<? super Void>>... llllllllllllIlllllIIIlIIlIIlIIll) {
        super.addListeners(llllllllllllIlllllIIIlIIlIIlIIll);
        "".length();
        return this;
    }
    
    private static boolean lIIIIIlIlIIIIlII(final int llllllllllllIlllllIIIIlllllIlllI) {
        return llllllllllllIlllllIIIIlllllIlllI != 0;
    }
    
    @Override
    public void flushCheckpoint(final long llllllllllllIlllllIIIlIIIlllIIII) {
        this.checkpoint = llllllllllllIlllllIIIlIIIlllIIII;
    }
    
    @Override
    public ChannelPromise setSuccess(final Void llllllllllllIlllllIIIlIIlIlIlIII) {
        super.setSuccess(llllllllllllIlllllIIIlIIlIlIlIII);
        "".length();
        return this;
    }
    
    private static boolean lIIIIIlIlIIIIIll(final Object llllllllllllIlllllIIIIllllllIIII) {
        return llllllllllllIlllllIIIIllllllIIII == null;
    }
    
    @Override
    public boolean trySuccess() {
        return this.trySuccess(null);
    }
    
    public DefaultChannelPromise(final Channel llllllllllllIlllllIIIlIIlIllllII, final EventExecutor llllllllllllIlllllIIIlIIlIlllIII) {
        super(llllllllllllIlllllIIIlIIlIlllIII);
        this.channel = llllllllllllIlllllIIIlIIlIllllII;
    }
    
    public DefaultChannelPromise(final Channel llllllllllllIlllllIIIlIIllIIIIll) {
        this.channel = llllllllllllIlllllIIIlIIllIIIIll;
    }
}
