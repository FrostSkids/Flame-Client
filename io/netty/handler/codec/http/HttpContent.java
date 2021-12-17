// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.ByteBufHolder;

public interface HttpContent extends ByteBufHolder, HttpObject
{
    HttpContent retain();
    
    HttpContent duplicate();
    
    HttpContent copy();
    
    HttpContent retain(final int p0);
}
