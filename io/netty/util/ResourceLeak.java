// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

public interface ResourceLeak
{
    boolean close();
    
    void record();
}
