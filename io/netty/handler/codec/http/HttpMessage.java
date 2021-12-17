// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

public interface HttpMessage extends HttpObject
{
    HttpMessage setProtocolVersion(final HttpVersion p0);
    
    HttpVersion getProtocolVersion();
    
    HttpHeaders headers();
}
