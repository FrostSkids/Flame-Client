// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

public interface FullHttpResponse extends HttpResponse, FullHttpMessage
{
    FullHttpResponse retain(final int p0);
    
    FullHttpResponse setStatus(final HttpResponseStatus p0);
    
    FullHttpResponse setProtocolVersion(final HttpVersion p0);
    
    FullHttpResponse copy();
    
    FullHttpResponse retain();
}
