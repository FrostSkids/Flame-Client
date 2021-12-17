// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Promise;

public interface ChannelPromise extends ChannelFuture, Promise<Void>
{
    ChannelPromise removeListener(final GenericFutureListener<? extends Future<? super Void>> p0);
    
    ChannelPromise removeListeners(final GenericFutureListener<? extends Future<? super Void>>... p0);
    
    ChannelPromise await() throws InterruptedException;
    
    ChannelPromise awaitUninterruptibly();
    
    ChannelPromise setSuccess();
    
    ChannelPromise sync() throws InterruptedException;
    
    Channel channel();
    
    ChannelPromise addListeners(final GenericFutureListener<? extends Future<? super Void>>... p0);
    
    ChannelPromise syncUninterruptibly();
    
    ChannelPromise addListener(final GenericFutureListener<? extends Future<? super Void>> p0);
    
    ChannelPromise setFailure(final Throwable p0);
    
    boolean trySuccess();
    
    ChannelPromise setSuccess(final Void p0);
}