// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.TimeUnit;

public interface Future<V> extends java.util.concurrent.Future<V>
{
    Future<V> addListeners(final GenericFutureListener<? extends Future<? super V>>... p0);
    
    Future<V> addListener(final GenericFutureListener<? extends Future<? super V>> p0);
    
    Future<V> removeListeners(final GenericFutureListener<? extends Future<? super V>>... p0);
    
    boolean await(final long p0) throws InterruptedException;
    
    Throwable cause();
    
    V getNow();
    
    boolean awaitUninterruptibly(final long p0);
    
    Future<V> awaitUninterruptibly();
    
    boolean cancel(final boolean p0);
    
    Future<V> await() throws InterruptedException;
    
    boolean awaitUninterruptibly(final long p0, final TimeUnit p1);
    
    boolean await(final long p0, final TimeUnit p1) throws InterruptedException;
    
    boolean isSuccess();
    
    Future<V> removeListener(final GenericFutureListener<? extends Future<? super V>> p0);
    
    Future<V> sync() throws InterruptedException;
    
    Future<V> syncUninterruptibly();
    
    boolean isCancellable();
}
