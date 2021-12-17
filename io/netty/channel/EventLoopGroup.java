// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.EventExecutorGroup;

public interface EventLoopGroup extends EventExecutorGroup
{
    ChannelFuture register(final Channel p0, final ChannelPromise p1);
    
    ChannelFuture register(final Channel p0);
    
    EventLoop next();
}
