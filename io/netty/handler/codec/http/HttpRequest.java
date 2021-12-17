// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

public interface HttpRequest extends HttpMessage
{
    HttpRequest setUri(final String p0);
    
    HttpRequest setMethod(final HttpMethod p0);
    
    String getUri();
    
    HttpRequest setProtocolVersion(final HttpVersion p0);
    
    HttpMethod getMethod();
}
