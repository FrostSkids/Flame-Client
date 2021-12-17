// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util;

public interface Timeout
{
    TimerTask task();
    
    boolean isCancelled();
    
    boolean isExpired();
    
    Timer timer();
    
    boolean cancel();
}
