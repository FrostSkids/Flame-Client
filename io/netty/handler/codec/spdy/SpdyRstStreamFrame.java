// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdyRstStreamFrame extends SpdyStreamFrame
{
    SpdyRstStreamFrame setStatus(final SpdyStreamStatus p0);
    
    SpdyRstStreamFrame setStreamId(final int p0);
    
    SpdyStreamStatus status();
    
    SpdyRstStreamFrame setLast(final boolean p0);
}
