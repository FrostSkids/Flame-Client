// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

public interface SpdySynStreamFrame extends SpdyHeadersFrame
{
    SpdySynStreamFrame setInvalid();
    
    SpdySynStreamFrame setAssociatedStreamId(final int p0);
    
    byte priority();
    
    int associatedStreamId();
    
    boolean isUnidirectional();
    
    SpdySynStreamFrame setUnidirectional(final boolean p0);
    
    SpdySynStreamFrame setPriority(final byte p0);
    
    SpdySynStreamFrame setLast(final boolean p0);
    
    SpdySynStreamFrame setStreamId(final int p0);
}
