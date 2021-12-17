// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufHolder;

public interface SpdyDataFrame extends ByteBufHolder, SpdyStreamFrame
{
    SpdyDataFrame duplicate();
    
    ByteBuf content();
    
    SpdyDataFrame setLast(final boolean p0);
    
    SpdyDataFrame setStreamId(final int p0);
    
    SpdyDataFrame retain(final int p0);
    
    SpdyDataFrame copy();
    
    SpdyDataFrame retain();
}
