// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

public interface EventExecutor extends EventExecutorGroup
{
    EventExecutorGroup parent();
    
    boolean inEventLoop();
    
    boolean inEventLoop(final Thread p0);
    
     <V> Future<V> newFailedFuture(final Throwable p0);
    
     <V> ProgressivePromise<V> newProgressivePromise();
    
    EventExecutor next();
    
     <V> Promise<V> newPromise();
    
     <V> Future<V> newSucceededFuture(final V p0);
}
