// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdySynReplyFrame extends SpdyHeadersFrame
{
    SpdySynReplyFrame setLast(final boolean p0);
    
    SpdySynReplyFrame setStreamId(final int p0);
    
    SpdySynReplyFrame setInvalid();
}
