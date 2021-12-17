// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.List;
import io.netty.util.concurrent.EventExecutorGroup;
import java.net.SocketAddress;
import java.util.Map;

public interface ChannelPipeline extends Iterable<Map.Entry<String, ChannelHandler>>
{
    ChannelFuture connect(final SocketAddress p0, final ChannelPromise p1);
    
    ChannelFuture deregister(final ChannelPromise p0);
    
    ChannelPipeline fireChannelUnregistered();
    
    ChannelPipeline addLast(final EventExecutorGroup p0, final ChannelHandler... p1);
    
    ChannelHandler removeFirst();
    
    Map<String, ChannelHandler> toMap();
    
    ChannelPipeline replace(final ChannelHandler p0, final String p1, final ChannelHandler p2);
    
    ChannelFuture bind(final SocketAddress p0);
    
    ChannelPipeline addFirst(final EventExecutorGroup p0, final String p1, final ChannelHandler p2);
    
    ChannelPipeline fireUserEventTriggered(final Object p0);
    
    ChannelHandlerContext context(final Class<? extends ChannelHandler> p0);
    
    ChannelPipeline fireExceptionCaught(final Throwable p0);
    
    ChannelFuture connect(final SocketAddress p0);
    
    ChannelFuture writeAndFlush(final Object p0);
    
    ChannelFuture connect(final SocketAddress p0, final SocketAddress p1, final ChannelPromise p2);
    
    ChannelFuture close();
    
    ChannelPipeline flush();
    
    Channel channel();
    
    ChannelPipeline read();
    
    ChannelPipeline fireChannelWritabilityChanged();
    
    ChannelFuture close(final ChannelPromise p0);
    
    ChannelHandler get(final String p0);
    
    ChannelHandler removeLast();
    
    ChannelHandlerContext lastContext();
    
    ChannelHandler last();
    
    ChannelFuture bind(final SocketAddress p0, final ChannelPromise p1);
    
    ChannelPipeline addFirst(final EventExecutorGroup p0, final ChannelHandler... p1);
    
    ChannelFuture deregister();
    
    ChannelPipeline addFirst(final String p0, final ChannelHandler p1);
    
    ChannelPipeline addLast(final EventExecutorGroup p0, final String p1, final ChannelHandler p2);
    
    ChannelPipeline fireChannelRead(final Object p0);
    
    ChannelPipeline addFirst(final ChannelHandler... p0);
    
    ChannelPipeline addLast(final ChannelHandler... p0);
    
    ChannelPipeline remove(final ChannelHandler p0);
    
    ChannelPipeline fireChannelReadComplete();
    
    ChannelPipeline addBefore(final EventExecutorGroup p0, final String p1, final String p2, final ChannelHandler p3);
    
    ChannelPipeline fireChannelRegistered();
    
    ChannelHandlerContext firstContext();
    
    ChannelHandler remove(final String p0);
    
    ChannelHandlerContext context(final String p0);
    
    ChannelHandlerContext context(final ChannelHandler p0);
    
     <T extends ChannelHandler> T replace(final Class<T> p0, final String p1, final ChannelHandler p2);
    
    ChannelPipeline addLast(final String p0, final ChannelHandler p1);
    
    ChannelPipeline addBefore(final String p0, final String p1, final ChannelHandler p2);
    
    ChannelPipeline addAfter(final String p0, final String p1, final ChannelHandler p2);
    
    ChannelFuture writeAndFlush(final Object p0, final ChannelPromise p1);
    
    ChannelPipeline fireChannelInactive();
    
    ChannelFuture disconnect();
    
    ChannelFuture connect(final SocketAddress p0, final SocketAddress p1);
    
    ChannelPipeline addAfter(final EventExecutorGroup p0, final String p1, final String p2, final ChannelHandler p3);
    
    List<String> names();
    
     <T extends ChannelHandler> T get(final Class<T> p0);
    
    ChannelFuture write(final Object p0, final ChannelPromise p1);
    
    ChannelHandler first();
    
    ChannelFuture write(final Object p0);
    
    ChannelHandler replace(final String p0, final String p1, final ChannelHandler p2);
    
     <T extends ChannelHandler> T remove(final Class<T> p0);
    
    ChannelFuture disconnect(final ChannelPromise p0);
    
    ChannelPipeline fireChannelActive();
}
