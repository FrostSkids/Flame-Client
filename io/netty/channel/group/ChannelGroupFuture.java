// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.group;

import io.netty.channel.Channel;
import java.util.Iterator;
import io.netty.util.concurrent.GenericFutureListener;
import io.netty.channel.ChannelFuture;
import io.netty.util.concurrent.Future;

public interface ChannelGroupFuture extends Future<Void>, Iterable<ChannelFuture>
{
    ChannelGroupException cause();
    
    ChannelGroupFuture removeListeners(final GenericFutureListener<? extends Future<? super Void>>... p0);
    
    ChannelGroupFuture syncUninterruptibly();
    
    boolean isSuccess();
    
    Iterator<ChannelFuture> iterator();
    
    ChannelGroupFuture await() throws InterruptedException;
    
    ChannelFuture find(final Channel p0);
    
    ChannelGroupFuture awaitUninterruptibly();
    
    ChannelGroup group();
    
    boolean isPartialSuccess();
    
    boolean isPartialFailure();
    
    ChannelGroupFuture removeListener(final GenericFutureListener<? extends Future<? super Void>> p0);
    
    ChannelGroupFuture sync() throws InterruptedException;
    
    ChannelGroupFuture addListener(final GenericFutureListener<? extends Future<? super Void>> p0);
    
    ChannelGroupFuture addListeners(final GenericFutureListener<? extends Future<? super Void>>... p0);
}
