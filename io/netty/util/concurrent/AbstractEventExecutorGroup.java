// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Callable;
import java.util.Collection;

public abstract class AbstractEventExecutorGroup implements EventExecutorGroup
{
    @Override
    public <T> Future<T> submit(final Runnable lllllllllllllIIIIlIIIlIlIlllllII, final T lllllllllllllIIIIlIIIlIlIllllIll) {
        return this.next().submit(lllllllllllllIIIIlIIIlIlIlllllII, lllllllllllllIIIIlIIIlIlIllllIll);
    }
    
    @Override
    public <T> T invokeAny(final Collection<? extends Callable<T>> lllllllllllllIIIIlIIIlIlIIIllllI) throws ExecutionException, InterruptedException {
        return this.next().invokeAny(lllllllllllllIIIIlIIIlIlIIIllllI);
    }
    
    @Override
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(final Runnable lllllllllllllIIIIlIIIlIlIlIIlllI, final long lllllllllllllIIIIlIIIlIlIlIIllIl, final long lllllllllllllIIIIlIIIlIlIlIlIIIl, final TimeUnit lllllllllllllIIIIlIIIlIlIlIlIIII) {
        return this.next().scheduleAtFixedRate(lllllllllllllIIIIlIIIlIlIlIIlllI, lllllllllllllIIIIlIIIlIlIlIIllIl, lllllllllllllIIIIlIIIlIlIlIlIIIl, lllllllllllllIIIIlIIIlIlIlIlIIII);
    }
    
    @Override
    public <T> T invokeAny(final Collection<? extends Callable<T>> lllllllllllllIIIIlIIIlIlIIIlIlII, final long lllllllllllllIIIIlIIIlIlIIIlIIll, final TimeUnit lllllllllllllIIIIlIIIlIlIIIlIllI) throws InterruptedException, TimeoutException, ExecutionException {
        return this.next().invokeAny(lllllllllllllIIIIlIIIlIlIIIlIlII, lllllllllllllIIIIlIIIlIlIIIlIIll, lllllllllllllIIIIlIIIlIlIIIlIllI);
    }
    
    @Deprecated
    @Override
    public abstract void shutdown();
    
    @Deprecated
    @Override
    public List<Runnable> shutdownNow() {
        this.shutdown();
        return Collections.emptyList();
    }
    
    @Override
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(final Callable<V> lllllllllllllIIIIlIIIlIlIllIIIII, final long lllllllllllllIIIIlIIIlIlIlIllIll, final TimeUnit lllllllllllllIIIIlIIIlIlIlIllIlI) {
        return this.next().schedule(lllllllllllllIIIIlIIIlIlIllIIIII, lllllllllllllIIIIlIIIlIlIlIllIll, lllllllllllllIIIIlIIIlIlIlIllIlI);
    }
    
    @Override
    public void execute(final Runnable lllllllllllllIIIIlIIIlIlIIIIlllI) {
        this.next().execute(lllllllllllllIIIIlIIIlIlIIIIlllI);
    }
    
    @Override
    public <T> List<java.util.concurrent.Future<T>> invokeAll(final Collection<? extends Callable<T>> lllllllllllllIIIIlIIIlIlIIlIIllI, final long lllllllllllllIIIIlIIIlIlIIlIIlIl, final TimeUnit lllllllllllllIIIIlIIIlIlIIlIlIII) throws InterruptedException {
        return this.next().invokeAll(lllllllllllllIIIIlIIIlIlIIlIIllI, lllllllllllllIIIIlIIIlIlIIlIIlIl, lllllllllllllIIIIlIIIlIlIIlIlIII);
    }
    
    @Override
    public Future<?> submit(final Runnable lllllllllllllIIIIlIIIlIllIIIIIll) {
        return this.next().submit(lllllllllllllIIIIlIIIlIllIIIIIll);
    }
    
    @Override
    public <T> List<java.util.concurrent.Future<T>> invokeAll(final Collection<? extends Callable<T>> lllllllllllllIIIIlIIIlIlIIllIIlI) throws InterruptedException {
        return this.next().invokeAll(lllllllllllllIIIIlIIIlIlIIllIIlI);
    }
    
    @Override
    public Future<?> shutdownGracefully() {
        return this.shutdownGracefully(2L, 15L, TimeUnit.SECONDS);
    }
    
    @Override
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(final Runnable lllllllllllllIIIIlIIIlIlIlIIIlII, final long lllllllllllllIIIIlIIIlIlIlIIIIll, final long lllllllllllllIIIIlIIIlIlIlIIIIlI, final TimeUnit lllllllllllllIIIIlIIIlIlIIllllII) {
        return this.next().scheduleWithFixedDelay(lllllllllllllIIIIlIIIlIlIlIIIlII, lllllllllllllIIIIlIIIlIlIlIIIIll, lllllllllllllIIIIlIIIlIlIlIIIIlI, lllllllllllllIIIIlIIIlIlIIllllII);
    }
    
    @Override
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(final Runnable lllllllllllllIIIIlIIIlIlIllIlIII, final long lllllllllllllIIIIlIIIlIlIllIlIll, final TimeUnit lllllllllllllIIIIlIIIlIlIllIlIlI) {
        return this.next().schedule(lllllllllllllIIIIlIIIlIlIllIlIII, lllllllllllllIIIIlIIIlIlIllIlIll, lllllllllllllIIIIlIIIlIlIllIlIlI);
    }
    
    @Override
    public <T> Future<T> submit(final Callable<T> lllllllllllllIIIIlIIIlIlIlllIIlI) {
        return this.next().submit(lllllllllllllIIIIlIIIlIlIlllIIlI);
    }
}
