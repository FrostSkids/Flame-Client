// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import io.netty.channel.MessageSizeEstimator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.RecvByteBufAllocator;
import com.sun.nio.sctp.SctpStandardSocketOptions;
import io.netty.channel.ChannelConfig;

public interface SctpServerChannelConfig extends ChannelConfig
{
    SctpServerChannelConfig setMaxMessagesPerRead(final int p0);
    
    SctpStandardSocketOptions.InitMaxStreams getInitMaxStreams();
    
    SctpServerChannelConfig setWriteSpinCount(final int p0);
    
    SctpServerChannelConfig setAutoClose(final boolean p0);
    
    SctpServerChannelConfig setConnectTimeoutMillis(final int p0);
    
    SctpServerChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
    
    SctpServerChannelConfig setInitMaxStreams(final SctpStandardSocketOptions.InitMaxStreams p0);
    
    SctpServerChannelConfig setWriteBufferHighWaterMark(final int p0);
    
    SctpServerChannelConfig setReceiveBufferSize(final int p0);
    
    SctpServerChannelConfig setAutoRead(final boolean p0);
    
    int getBacklog();
    
    int getReceiveBufferSize();
    
    int getSendBufferSize();
    
    SctpServerChannelConfig setAllocator(final ByteBufAllocator p0);
    
    SctpServerChannelConfig setBacklog(final int p0);
    
    SctpServerChannelConfig setSendBufferSize(final int p0);
    
    SctpServerChannelConfig setWriteBufferLowWaterMark(final int p0);
    
    SctpServerChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
}
