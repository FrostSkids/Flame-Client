// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.ProgressivePromise;

public interface ChannelProgressivePromise extends ProgressivePromise<Void>, ChannelProgressiveFuture, ChannelPromise
{
    ChannelProgressivePromise setSuccess();
    
    ChannelProgressivePromise syncUninterruptibly();
    
    ChannelProgressivePromise setSuccess(final Void p0);
    
    ChannelProgressivePromise awaitUninterruptibly();
    
    ChannelProgressivePromise setFailure(final Throwable p0);
    
    ChannelProgressivePromise removeListeners(final GenericFutureListener<? extends Future<? super Void>>... p0);
    
    ChannelProgressivePromise removeListener(final GenericFutureListener<? extends Future<? super Void>> p0);
    
    ChannelProgressivePromise addListener(final GenericFutureListener<? extends Future<? super Void>> p0);
    
    ChannelProgressivePromise addListeners(final GenericFutureListener<? extends Future<? super Void>>... p0);
    
    ChannelProgressivePromise sync() throws InterruptedException;
    
    ChannelProgressivePromise await() throws InterruptedException;
    
    ChannelProgressivePromise setProgress(final long p0, final long p1);
}
