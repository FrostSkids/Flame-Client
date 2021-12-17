// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.buffer.ByteBufAllocator;
import java.net.SocketAddress;
import io.netty.util.AttributeMap;

public interface Channel extends AttributeMap, Comparable<Channel>
{
    Unsafe unsafe();
    
    ChannelPromise newPromise();
    
    ChannelFuture connect(final SocketAddress p0);
    
    Channel parent();
    
    ChannelFuture deregister(final ChannelPromise p0);
    
    ChannelFuture disconnect(final ChannelPromise p0);
    
    SocketAddress remoteAddress();
    
    ChannelFuture newFailedFuture(final Throwable p0);
    
    ChannelFuture write(final Object p0);
    
    ChannelPipeline pipeline();
    
    Channel flush();
    
    ChannelFuture writeAndFlush(final Object p0);
    
    ChannelFuture deregister();
    
    ChannelPromise voidPromise();
    
    ChannelFuture close();
    
    ByteBufAllocator alloc();
    
    ChannelFuture connect(final SocketAddress p0, final SocketAddress p1, final ChannelPromise p2);
    
    ChannelFuture newSucceededFuture();
    
    boolean isWritable();
    
    Channel read();
    
    boolean isRegistered();
    
    ChannelMetadata metadata();
    
    ChannelFuture close(final ChannelPromise p0);
    
    boolean isOpen();
    
    ChannelFuture write(final Object p0, final ChannelPromise p1);
    
    ChannelFuture bind(final SocketAddress p0);
    
    ChannelProgressivePromise newProgressivePromise();
    
    EventLoop eventLoop();
    
    ChannelFuture connect(final SocketAddress p0, final ChannelPromise p1);
    
    boolean isActive();
    
    SocketAddress localAddress();
    
    ChannelFuture connect(final SocketAddress p0, final SocketAddress p1);
    
    ChannelConfig config();
    
    ChannelFuture disconnect();
    
    ChannelFuture bind(final SocketAddress p0, final ChannelPromise p1);
    
    ChannelFuture closeFuture();
    
    ChannelFuture writeAndFlush(final Object p0, final ChannelPromise p1);
    
    public interface Unsafe
    {
        void close(final ChannelPromise p0);
        
        void bind(final SocketAddress p0, final ChannelPromise p1);
        
        void closeForcibly();
        
        ChannelOutboundBuffer outboundBuffer();
        
        void beginRead();
        
        SocketAddress localAddress();
        
        void disconnect(final ChannelPromise p0);
        
        ChannelPromise voidPromise();
        
        void register(final EventLoop p0, final ChannelPromise p1);
        
        void deregister(final ChannelPromise p0);
        
        void connect(final SocketAddress p0, final SocketAddress p1, final ChannelPromise p2);
        
        void write(final Object p0, final ChannelPromise p1);
        
        SocketAddress remoteAddress();
        
        void flush();
    }
}
