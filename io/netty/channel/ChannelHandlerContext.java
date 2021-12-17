// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.buffer.ByteBufAllocator;
import io.netty.util.concurrent.EventExecutor;
import java.net.SocketAddress;
import io.netty.util.AttributeMap;

public interface ChannelHandlerContext extends AttributeMap
{
    ChannelFuture disconnect();
    
    ChannelFuture write(final Object p0, final ChannelPromise p1);
    
    ChannelProgressivePromise newProgressivePromise();
    
    ChannelHandlerContext fireChannelRead(final Object p0);
    
    ChannelFuture connect(final SocketAddress p0, final SocketAddress p1);
    
    EventExecutor executor();
    
    ChannelPromise newPromise();
    
    Channel channel();
    
    ChannelFuture newFailedFuture(final Throwable p0);
    
    ChannelFuture disconnect(final ChannelPromise p0);
    
    ChannelHandlerContext fireChannelReadComplete();
    
    ByteBufAllocator alloc();
    
    ChannelFuture writeAndFlush(final Object p0, final ChannelPromise p1);
    
    ChannelFuture close(final ChannelPromise p0);
    
    ChannelFuture connect(final SocketAddress p0, final SocketAddress p1, final ChannelPromise p2);
    
    ChannelFuture deregister(final ChannelPromise p0);
    
    ChannelHandlerContext flush();
    
    ChannelHandlerContext fireChannelInactive();
    
    ChannelFuture bind(final SocketAddress p0, final ChannelPromise p1);
    
    ChannelHandlerContext read();
    
    ChannelFuture connect(final SocketAddress p0);
    
    ChannelHandlerContext fireChannelUnregistered();
    
    ChannelHandlerContext fireUserEventTriggered(final Object p0);
    
    ChannelFuture writeAndFlush(final Object p0);
    
    String name();
    
    ChannelFuture bind(final SocketAddress p0);
    
    ChannelHandlerContext fireChannelWritabilityChanged();
    
    ChannelHandlerContext fireChannelActive();
    
    ChannelFuture close();
    
    ChannelFuture connect(final SocketAddress p0, final ChannelPromise p1);
    
    boolean isRemoved();
    
    ChannelFuture newSucceededFuture();
    
    ChannelHandlerContext fireChannelRegistered();
    
    ChannelPipeline pipeline();
    
    ChannelFuture write(final Object p0);
    
    ChannelHandler handler();
    
    ChannelHandlerContext fireExceptionCaught(final Throwable p0);
    
    ChannelPromise voidPromise();
    
    ChannelFuture deregister();
}
