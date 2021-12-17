// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdyGoAwayFrame extends SpdyFrame
{
    SpdySessionStatus status();
    
    SpdyGoAwayFrame setLastGoodStreamId(final int p0);
    
    SpdyGoAwayFrame setStatus(final SpdySessionStatus p0);
    
    int lastGoodStreamId();
}
