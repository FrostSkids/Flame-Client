// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.udt;

import io.netty.channel.RecvByteBufAllocator;
import io.netty.channel.MessageSizeEstimator;
import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.ChannelConfig;

public interface UdtChannelConfig extends ChannelConfig
{
    int getSendBufferSize();
    
    UdtChannelConfig setAutoClose(final boolean p0);
    
    int getProtocolReceiveBufferSize();
    
    UdtChannelConfig setConnectTimeoutMillis(final int p0);
    
    boolean isReuseAddress();
    
    int getProtocolSendBufferSize();
    
    UdtChannelConfig setReceiveBufferSize(final int p0);
    
    UdtChannelConfig setWriteBufferHighWaterMark(final int p0);
    
    int getSoLinger();
    
    UdtChannelConfig setAllocator(final ByteBufAllocator p0);
    
    UdtChannelConfig setReuseAddress(final boolean p0);
    
    UdtChannelConfig setSystemSendBufferSize(final int p0);
    
    int getReceiveBufferSize();
    
    int getSystemSendBufferSize();
    
    UdtChannelConfig setProtocolSendBufferSize(final int p0);
    
    UdtChannelConfig setProtocolReceiveBufferSize(final int p0);
    
    UdtChannelConfig setMaxMessagesPerRead(final int p0);
    
    UdtChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
    
    UdtChannelConfig setWriteSpinCount(final int p0);
    
    UdtChannelConfig setSendBufferSize(final int p0);
    
    UdtChannelConfig setAutoRead(final boolean p0);
    
    UdtChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
    
    UdtChannelConfig setWriteBufferLowWaterMark(final int p0);
    
    UdtChannelConfig setSystemReceiveBufferSize(final int p0);
    
    UdtChannelConfig setSoLinger(final int p0);
    
    int getSystemReceiveBufferSize();
}
