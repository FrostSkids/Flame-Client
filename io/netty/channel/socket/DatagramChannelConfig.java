// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import io.netty.buffer.ByteBufAllocator;
import io.netty.channel.RecvByteBufAllocator;
import java.net.InetAddress;
import io.netty.channel.MessageSizeEstimator;
import java.net.NetworkInterface;
import io.netty.channel.ChannelConfig;

public interface DatagramChannelConfig extends ChannelConfig
{
    DatagramChannelConfig setBroadcast(final boolean p0);
    
    NetworkInterface getNetworkInterface();
    
    DatagramChannelConfig setMessageSizeEstimator(final MessageSizeEstimator p0);
    
    DatagramChannelConfig setConnectTimeoutMillis(final int p0);
    
    int getReceiveBufferSize();
    
    DatagramChannelConfig setNetworkInterface(final NetworkInterface p0);
    
    boolean isBroadcast();
    
    boolean isReuseAddress();
    
    InetAddress getInterface();
    
    DatagramChannelConfig setWriteSpinCount(final int p0);
    
    int getTimeToLive();
    
    DatagramChannelConfig setReceiveBufferSize(final int p0);
    
    DatagramChannelConfig setAutoClose(final boolean p0);
    
    int getSendBufferSize();
    
    boolean isLoopbackModeDisabled();
    
    DatagramChannelConfig setSendBufferSize(final int p0);
    
    DatagramChannelConfig setInterface(final InetAddress p0);
    
    int getTrafficClass();
    
    DatagramChannelConfig setTrafficClass(final int p0);
    
    DatagramChannelConfig setRecvByteBufAllocator(final RecvByteBufAllocator p0);
    
    DatagramChannelConfig setReuseAddress(final boolean p0);
    
    DatagramChannelConfig setLoopbackModeDisabled(final boolean p0);
    
    DatagramChannelConfig setAutoRead(final boolean p0);
    
    DatagramChannelConfig setAllocator(final ByteBufAllocator p0);
    
    DatagramChannelConfig setTimeToLive(final int p0);
    
    DatagramChannelConfig setMaxMessagesPerRead(final int p0);
}
