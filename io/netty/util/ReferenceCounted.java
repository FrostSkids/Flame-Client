// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

public interface ReferenceCounted
{
    boolean release(final int p0);
    
    boolean release();
    
    int refCnt();
    
    ReferenceCounted retain();
    
    ReferenceCounted retain(final int p0);
}
