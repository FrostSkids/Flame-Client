// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdyStreamFrame extends SpdyFrame
{
    boolean isLast();
    
    SpdyStreamFrame setLast(final boolean p0);
    
    SpdyStreamFrame setStreamId(final int p0);
    
    int streamId();
}
