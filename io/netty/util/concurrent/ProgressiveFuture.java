// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

public interface ProgressiveFuture<V> extends Future<V>
{
    ProgressiveFuture<V> removeListener(final GenericFutureListener<? extends Future<? super V>> p0);
    
    ProgressiveFuture<V> awaitUninterruptibly();
    
    ProgressiveFuture<V> sync() throws InterruptedException;
    
    ProgressiveFuture<V> await() throws InterruptedException;
    
    ProgressiveFuture<V> addListener(final GenericFutureListener<? extends Future<? super V>> p0);
    
    ProgressiveFuture<V> removeListeners(final GenericFutureListener<? extends Future<? super V>>... p0);
    
    ProgressiveFuture<V> syncUninterruptibly();
    
    ProgressiveFuture<V> addListeners(final GenericFutureListener<? extends Future<? super V>>... p0);
}
