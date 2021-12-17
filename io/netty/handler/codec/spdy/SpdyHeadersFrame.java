// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdyHeadersFrame extends SpdyStreamFrame
{
    SpdyHeadersFrame setLast(final boolean p0);
    
    SpdyHeadersFrame setTruncated();
    
    SpdyHeadersFrame setStreamId(final int p0);
    
    SpdyHeaders headers();
    
    SpdyHeadersFrame setInvalid();
    
    boolean isTruncated();
    
    boolean isInvalid();
}
