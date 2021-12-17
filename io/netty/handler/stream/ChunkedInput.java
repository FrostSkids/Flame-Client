// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.stream;

import io.netty.channel.ChannelHandlerContext;

public interface ChunkedInput<B>
{
    void close() throws Exception;
    
    B readChunk(final ChannelHandlerContext p0) throws Exception;
    
    boolean isEndOfInput() throws Exception;
}
