// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdyPingFrame extends SpdyFrame
{
    SpdyPingFrame setId(final int p0);
    
    int id();
}
