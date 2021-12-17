// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.util.Map;
import io.netty.buffer.ByteBufAllocator;

public interface ChannelConfig
{
    int getWriteSpinCount();
    
    int getMaxMessagesPerRead();
    
    ByteBufAllocator getAllocator();
    
    ChannelConfig setWriteSpinCount(final int p0);
    
    @Deprecated
    ChannelConfig setAutoClose(final boolean p0);
    
    int getWriteBufferHighWaterMark();
    
    ChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
    
    boolean setOptions(final Map<ChannelOption<?>, ?> p0);
    
    RecvByteBufAllocator getRecvByteBufAllocator();
    
    Map<ChannelOption<?>, Object> getOptions();
    
     <T> boolean setOption(final ChannelOption<T> p0, final T p1);
    
    int getWriteBufferLowWaterMark();
    
    ChannelConfig setMaxMessagesPerRead(final int p0);
    
    int getConnectTimeoutMillis();
    
    ChannelConfig setAutoRead(final boolean p0);
    
    ChannelConfig setAllocator(final ByteBufAllocator p0);
    
    ChannelConfig setConnectTimeoutMillis(final int p0);
    
    ChannelConfig setWriteBufferHighWaterMark(final int p0);
    
     <T> T getOption(final ChannelOption<T> p0);
    
    @Deprecated
    boolean isAutoClose();
    
    MessageSizeEstimator getMessageSizeEstimator();
    
    boolean isAutoRead();
    
    ChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
    
    ChannelConfig setWriteBufferLowWaterMark(final int p0);
}
