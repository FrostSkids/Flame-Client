// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.ReferenceCounted;
import java.net.SocketAddress;

public interface AddressedEnvelope<M, A extends SocketAddress> extends ReferenceCounted
{
    A sender();
    
    M content();
    
    A recipient();
}
