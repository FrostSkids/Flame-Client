// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdyWindowUpdateFrame extends SpdyFrame
{
    int streamId();
    
    int deltaWindowSize();
    
    SpdyWindowUpdateFrame setStreamId(final int p0);
    
    SpdyWindowUpdateFrame setDeltaWindowSize(final int p0);
}
