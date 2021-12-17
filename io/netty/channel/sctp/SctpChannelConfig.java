// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import io.netty.channel.MessageSizeEstimator;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import io.netty.channel.RecvByteBufAllocator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;

public interface SctpChannelConfig extends ChannelConfig
{
    SctpChannelConfig setSctpNoDelay(final boolean p0);
    
    SctpChannelConfig setWriteBufferLowWaterMark(final int p0);
    
    SctpChannelConfig setAllocator(final ByteBufAllocator p0);
    
    SctpChannelConfig setAutoClose(final boolean p0);
    
    SctpChannelConfig setWriteSpinCount(final int p0);
    
    SctpChannelConfig setSendBufferSize(final int p0);
    
    SctpChannelConfig setWriteBufferHighWaterMark(final int p0);
    
    int getReceiveBufferSize();
    
    SctpChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
    
    SctpChannelConfig setConnectTimeoutMillis(final int p0);
    
    SctpChannelConfig setInitMaxStreams(final SctpStandardSocketOptions.InitMaxStreams p0);
    
    SctpChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
    
    boolean isSctpNoDelay();
    
    SctpChannelConfig setReceiveBufferSize(final int p0);
    
    SctpChannelConfig setMaxMessagesPerRead(final int p0);
    
    int getSendBufferSize();
    
    SctpChannelConfig setAutoRead(final boolean p0);
    
    SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams();
}
