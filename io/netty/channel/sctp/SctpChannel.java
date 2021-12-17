// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.sctp;

import com.sun.nio.sctp.Association;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelPromise;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.util.Set;
import io.netty.channel.Channel;

public interface SctpChannel extends Channel
{
    Set<InetSocketAddress> allRemoteAddresses();
    
    ChannelFuture unbindAddress(final InetAddress p0, final ChannelPromise p1);
    
    SctpServerChannel parent();
    
    ChannelFuture unbindAddress(final InetAddress p0);
    
    Set<InetSocketAddress> allLocalAddresses();
    
    ChannelFuture bindAddress(final InetAddress p0);
    
    ChannelFuture bindAddress(final InetAddress p0, final ChannelPromise p1);
    
    InetSocketAddress remoteAddress();
    
    Association association();
    
    InetSocketAddress localAddress();
    
    SctpChannelConfig config();
}
