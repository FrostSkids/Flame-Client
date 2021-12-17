// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.channel.ChannelConfig;

public interface ServerSocketChannelConfig extends ChannelConfig
{
    ServerSocketChannelConfig setWriteSpinCount(final int p0);
    
    ServerSocketChannelConfig setPerformancePreferences(final int p0, final int p1, final int p2);
    
    ServerSocketChannelConfig setAutoRead(final boolean p0);
    
    ServerSocketChannelConfig setBacklog(final int p0);
    
    int getBacklog();
    
    boolean isReuseAddress();
    
    ServerSocketChannelConfig setConnectTimeoutMillis(final int p0);
    
    ServerSocketChannelConfig setMaxMessagesPerRead(final int p0);
    
    ServerSocketChannelConfig setReceiveBufferSize(final int p0);
    
    ServerSocketChannelConfig setReuseAddress(final boolean p0);
    
    ServerSocketChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
    
    ServerSocketChannelConfig setAllocator(final ByteBufAllocator p0);
    
    int getReceiveBufferSize();
    
    ServerSocketChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
}
