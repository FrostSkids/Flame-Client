// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.socket;

import java.net.InetSocketAddress;
import io.netty.channel.ServerChannel;

public interface ServerSocketChannel extends ServerChannel
{
    InetSocketAddress localAddress();
    
    InetSocketAddress remoteAddress();
    
    ServerSocketChannelConfig config();
}
