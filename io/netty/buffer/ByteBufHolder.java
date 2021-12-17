// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.buffer;

import io.netty.util.ReferenceCounted;

public interface ByteBufHolder extends ReferenceCounted
{
    ByteBuf content();
    
    ByteBufHolder retain();
    
    ByteBufHolder duplicate();
    
    ByteBufHolder copy();
    
    ByteBufHolder retain(final int p0);
}
