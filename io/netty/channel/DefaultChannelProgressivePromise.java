// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.EventExecutor;
import io.netty.util.concurrent.ProgressiveFuture;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.Promise;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.ProgressivePromise;
import io.netty.util.concurrent.DefaultProgressivePromise;

public class DefaultChannelProgressivePromise extends DefaultProgressivePromise<Void> implements ChannelProgressivePromise, ChannelFlushPromiseNotifier.FlushCheckpoint
{
    private /* synthetic */ long checkpoint;
    private final /* synthetic */ Channel channel;
    
    @Override
    protected void checkDeadLock() {
        if (lllIIIIlIlIlllI(this.channel().isRegistered() ? 1 : 0)) {
            super.checkDeadLock();
        }
    }
    
    @Override
    public ChannelProgressivePromise setFailure(final Throwable lllllllllllllIIlIIIIlIllIIllIllI) {
        super.setFailure(lllllllllllllIIlIIIIlIllIIllIllI);
        "".length();
        return this;
    }
    
    @Override
    public long flushCheckpoint() {
        return this.checkpoint;
    }
    
    @Override
    public boolean trySuccess() {
        return this.trySuccess(null);
    }
    
    @Override
    protected EventExecutor executor() {
        final EventExecutor lllllllllllllIIlIIIIlIllIlIIllIl = super.executor();
        if (lllIIIIlIlIllIl(lllllllllllllIIlIIIIlIllIlIIllIl)) {
            return this.channel().eventLoop();
        }
        return lllllllllllllIIlIIIIlIllIlIIllIl;
    }
    
    @Override
    public ChannelProgressivePromise addListeners(final GenericFutureListener<? extends Future<? super Void>>... lllllllllllllIIlIIIIlIllIIlIIIll) {
        super.addListeners(lllllllllllllIIlIIIIlIllIIlIIIll);
        "".length();
        return this;
    }
    
    private static boolean lllIIIIlIlIlllI(final int lllllllllllllIIlIIIIlIIlllIIIlll) {
        return lllllllllllllIIlIIIIlIIlllIIIlll != 0;
    }
    
    @Override
    public ChannelProgressivePromise await() throws InterruptedException {
        super.await();
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise awaitUninterruptibly() {
        super.awaitUninterruptibly();
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise removeListeners(final GenericFutureListener<? extends Future<? super Void>>... lllllllllllllIIlIIIIlIllIIIlIlIl) {
        super.removeListeners(lllllllllllllIIlIIIIlIllIIIlIlIl);
        "".length();
        return this;
    }
    
    private static boolean lllIIIIlIlIllIl(final Object lllllllllllllIIlIIIIlIIlllIIlIIl) {
        return lllllllllllllIIlIIIIlIIlllIIlIIl == null;
    }
    
    @Override
    public ChannelProgressivePromise setSuccess(final Void lllllllllllllIIlIIIIlIllIIllllll) {
        super.setSuccess(lllllllllllllIIlIIIIlIllIIllllll);
        "".length();
        return this;
    }
    
    @Override
    public void flushCheckpoint(final long lllllllllllllIIlIIIIlIllIIIIIIII) {
        this.checkpoint = lllllllllllllIIlIIIIlIllIIIIIIII;
    }
    
    public DefaultChannelProgressivePromise(final Channel lllllllllllllIIlIIIIlIllIlIlllII) {
        this.channel = lllllllllllllIIlIIIIlIllIlIlllII;
    }
    
    @Override
    public Channel channel() {
        return this.channel;
    }
    
    public DefaultChannelProgressivePromise(final Channel lllllllllllllIIlIIIIlIllIlIlIIlI, final EventExecutor lllllllllllllIIlIIIIlIllIlIlIIIl) {
        super(lllllllllllllIIlIIIIlIllIlIlIIIl);
        this.channel = lllllllllllllIIlIIIIlIllIlIlIIlI;
    }
    
    @Override
    public ChannelProgressivePromise removeListener(final GenericFutureListener<? extends Future<? super Void>> lllllllllllllIIlIIIIlIllIIIllIll) {
        super.removeListener(lllllllllllllIIlIIIIlIllIIIllIll);
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise setSuccess() {
        return this.setSuccess(null);
    }
    
    @Override
    public ChannelProgressivePromise setProgress(final long lllllllllllllIIlIIIIlIllIIllIIIl, final long lllllllllllllIIlIIIIlIllIIllIIII) {
        super.setProgress(lllllllllllllIIlIIIIlIllIIllIIIl, lllllllllllllIIlIIIIlIllIIllIIII);
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise syncUninterruptibly() {
        super.syncUninterruptibly();
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise addListener(final GenericFutureListener<? extends Future<? super Void>> lllllllllllllIIlIIIIlIllIIlIlIIl) {
        super.addListener(lllllllllllllIIlIIIIlIllIIlIlIIl);
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise sync() throws InterruptedException {
        super.sync();
        "".length();
        return this;
    }
    
    @Override
    public ChannelProgressivePromise promise() {
        return this;
    }
}
