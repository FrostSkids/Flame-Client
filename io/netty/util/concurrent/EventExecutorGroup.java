// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;

public interface EventExecutorGroup extends ScheduledExecutorService, Iterable<EventExecutor>
{
    @Deprecated
    List<Runnable> shutdownNow();
    
    Iterator<EventExecutor> iterator();
    
     <T> Future<T> submit(final Runnable p0, final T p1);
    
    Future<?> shutdownGracefully(final long p0, final long p1, final TimeUnit p2);
    
    Future<?> shutdownGracefully();
    
    Future<?> terminationFuture();
    
    Future<?> submit(final Runnable p0);
    
    ScheduledFuture<?> scheduleAtFixedRate(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
    
    boolean isShuttingDown();
    
     <T> Future<T> submit(final Callable<T> p0);
    
     <V> ScheduledFuture<V> schedule(final Callable<V> p0, final long p1, final TimeUnit p2);
    
    ScheduledFuture<?> scheduleWithFixedDelay(final Runnable p0, final long p1, final long p2, final TimeUnit p3);
    
    @Deprecated
    void shutdown();
    
    ScheduledFuture<?> schedule(final Runnable p0, final long p1, final TimeUnit p2);
    
    EventExecutor next();
}
