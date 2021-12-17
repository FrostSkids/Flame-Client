// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import io.netty.channel.ChannelPromise;
import io.netty.channel.ChannelFuture;
import java.net.InetSocketAddress;
import io.netty.channel.Channel;

public interface SocketChannel extends Channel
{
    InetSocketAddress remoteAddress();
    
    boolean isOutputShutdown();
    
    SocketChannelConfig config();
    
    InetSocketAddress localAddress();
    
    boolean isInputShutdown();
    
    ChannelFuture shutdownOutput();
    
    ChannelFuture shutdownOutput(final ChannelPromise p0);
    
    ServerSocketChannel parent();
}
