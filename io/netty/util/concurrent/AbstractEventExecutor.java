// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.NoSuchElementException;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.Collections;
import java.util.List;
import java.util.Iterator;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.AbstractExecutorService;

public abstract class AbstractEventExecutor extends AbstractExecutorService implements EventExecutor
{
    @Override
    public <T> Future<T> submit(final Callable<T> lllllllllllllIlIlIlIlllIlIIllIll) {
        return (Future<T>)(Future)super.submit(lllllllllllllIlIlIlIlllIlIIllIll);
    }
    
    @Override
    public <V> Future<V> newFailedFuture(final Throwable lllllllllllllIlIlIlIlllIlIllIIlI) {
        return new FailedFuture<V>(this, lllllllllllllIlIlIlIlllIlIllIIlI);
    }
    
    @Override
    protected final <T> RunnableFuture<T> newTaskFor(final Runnable lllllllllllllIlIlIlIlllIlIIlIIll, final T lllllllllllllIlIlIlIlllIlIIlIIlI) {
        return new PromiseTask<T>(this, lllllllllllllIlIlIlIlllIlIIlIIll, lllllllllllllIlIlIlIlllIlIIlIIlI);
    }
    
    @Override
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleWithFixedDelay(final Runnable lllllllllllllIlIlIlIlllIIlllllIl, final long lllllllllllllIlIlIlIlllIIlllllII, final long lllllllllllllIlIlIlIlllIIllllIll, final TimeUnit lllllllllllllIlIlIlIlllIIllllIlI) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Future<?> submit(final Runnable lllllllllllllIlIlIlIlllIlIlIllII) {
        return (Future<?>)(Future)super.submit(lllllllllllllIlIlIlIlllIlIlIllII);
    }
    
    @Override
    public io.netty.util.concurrent.ScheduledFuture<?> scheduleAtFixedRate(final Runnable lllllllllllllIlIlIlIlllIlIIIIIlI, final long lllllllllllllIlIlIlIlllIlIIIIIIl, final long lllllllllllllIlIlIlIlllIlIIIIIII, final TimeUnit lllllllllllllIlIlIlIlllIIlllllll) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public Future<?> shutdownGracefully() {
        return this.shutdownGracefully(2L, 15L, TimeUnit.SECONDS);
    }
    
    @Override
    public Iterator<EventExecutor> iterator() {
        return new EventExecutorIterator();
    }
    
    @Override
    public <T> Future<T> submit(final Runnable lllllllllllllIlIlIlIlllIlIlIIlIl, final T lllllllllllllIlIlIlIlllIlIlIIlII) {
        return (Future<T>)(Future)super.submit(lllllllllllllIlIlIlIlllIlIlIIlIl, lllllllllllllIlIlIlIlllIlIlIIlII);
    }
    
    @Override
    public <V> ProgressivePromise<V> newProgressivePromise() {
        return new DefaultProgressivePromise<V>(this);
    }
    
    @Override
    public <V> io.netty.util.concurrent.ScheduledFuture<V> schedule(final Callable<V> lllllllllllllIlIlIlIlllIlIIIIllI, final long lllllllllllllIlIlIlIlllIlIIIIlIl, final TimeUnit lllllllllllllIlIlIlIlllIlIIIIlII) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public boolean inEventLoop() {
        return this.inEventLoop(Thread.currentThread());
    }
    
    @Override
    protected final <T> RunnableFuture<T> newTaskFor(final Callable<T> lllllllllllllIlIlIlIlllIlIIIllII) {
        return new PromiseTask<T>(this, lllllllllllllIlIlIlIlllIlIIIllII);
    }
    
    @Override
    public <V> Promise<V> newPromise() {
        return new DefaultPromise<V>(this);
    }
    
    @Override
    public EventExecutor next() {
        return this;
    }
    
    @Override
    public <V> Future<V> newSucceededFuture(final V lllllllllllllIlIlIlIlllIlIllIllI) {
        return new SucceededFuture<V>(this, lllllllllllllIlIlIlIlllIlIllIllI);
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
    public io.netty.util.concurrent.ScheduledFuture<?> schedule(final Runnable lllllllllllllIlIlIlIlllIlIIIlIlI, final long lllllllllllllIlIlIlIlllIlIIIlIIl, final TimeUnit lllllllllllllIlIlIlIlllIlIIIlIII) {
        throw new UnsupportedOperationException();
    }
    
    private final class EventExecutorIterator implements Iterator<EventExecutor>
    {
        private static final /* synthetic */ String[] llIIlllllIIllI;
        private /* synthetic */ boolean nextCalled;
        private static final /* synthetic */ int[] llIIlllllIIlll;
        
        @Override
        public void remove() {
            throw new UnsupportedOperationException(EventExecutorIterator.llIIlllllIIllI[EventExecutorIterator.llIIlllllIIlll[1]]);
        }
        
        private static String lIIlIIIIlIIllIII(String llllllllllllIllIlllIIlIlIlIIIIll, final String llllllllllllIllIlllIIlIlIlIIIIlI) {
            llllllllllllIllIlllIIlIlIlIIIIll = new String(Base64.getDecoder().decode(llllllllllllIllIlllIIlIlIlIIIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder llllllllllllIllIlllIIlIlIlIIIIIl = new StringBuilder();
            final char[] llllllllllllIllIlllIIlIlIlIIIIII = llllllllllllIllIlllIIlIlIlIIIIlI.toCharArray();
            int llllllllllllIllIlllIIlIlIIllllll = EventExecutorIterator.llIIlllllIIlll[1];
            final char llllllllllllIllIlllIIlIlIIlllIIl = (Object)llllllllllllIllIlllIIlIlIlIIIIll.toCharArray();
            final boolean llllllllllllIllIlllIIlIlIIlllIII = llllllllllllIllIlllIIlIlIIlllIIl.length != 0;
            float llllllllllllIllIlllIIlIlIIllIlll = EventExecutorIterator.llIIlllllIIlll[1];
            while (lIIlIIIIlIIlllII((int)llllllllllllIllIlllIIlIlIIllIlll, llllllllllllIllIlllIIlIlIIlllIII ? 1 : 0)) {
                final char llllllllllllIllIlllIIlIlIlIIIlII = llllllllllllIllIlllIIlIlIIlllIIl[llllllllllllIllIlllIIlIlIIllIlll];
                llllllllllllIllIlllIIlIlIlIIIIIl.append((char)(llllllllllllIllIlllIIlIlIlIIIlII ^ llllllllllllIllIlllIIlIlIlIIIIII[llllllllllllIllIlllIIlIlIIllllll % llllllllllllIllIlllIIlIlIlIIIIII.length]));
                "".length();
                ++llllllllllllIllIlllIIlIlIIllllll;
                ++llllllllllllIllIlllIIlIlIIllIlll;
                "".length();
                if (" ".length() == 0) {
                    return null;
                }
            }
            return String.valueOf(llllllllllllIllIlllIIlIlIlIIIIIl);
        }
        
        @Override
        public EventExecutor next() {
            if (lIIlIIIIlIIllIll(this.hasNext() ? 1 : 0)) {
                throw new NoSuchElementException();
            }
            this.nextCalled = (EventExecutorIterator.llIIlllllIIlll[0] != 0);
            return AbstractEventExecutor.this;
        }
        
        static {
            lIIlIIIIlIIllIlI();
            lIIlIIIIlIIllIIl();
        }
        
        private static void lIIlIIIIlIIllIlI() {
            (llIIlllllIIlll = new int[2])[0] = " ".length();
            EventExecutorIterator.llIIlllllIIlll[1] = ((0x90 ^ 0x8E) & ~(0x72 ^ 0x6C));
        }
        
        private static void lIIlIIIIlIIllIIl() {
            (llIIlllllIIllI = new String[EventExecutorIterator.llIIlllllIIlll[0]])[EventExecutorIterator.llIIlllllIIlll[1]] = lIIlIIIIlIIllIII("BRYpN3cYHSQq", "wsHSZ");
        }
        
        private static boolean lIIlIIIIlIIllIll(final int llllllllllllIllIlllIIlIlIIllIIII) {
            return llllllllllllIllIlllIIlIlIIllIIII == 0;
        }
        
        @Override
        public boolean hasNext() {
            int n;
            if (lIIlIIIIlIIllIll(this.nextCalled ? 1 : 0)) {
                n = EventExecutorIterator.llIIlllllIIlll[0];
                "".length();
                if ((0x52 ^ 0x56) < 0) {
                    return ((0x5C ^ 0x78) & ~(0x6C ^ 0x48)) != 0x0;
                }
            }
            else {
                n = EventExecutorIterator.llIIlllllIIlll[1];
            }
            return n != 0;
        }
        
        private static boolean lIIlIIIIlIIlllII(final int llllllllllllIllIlllIIlIlIIllIIll, final int llllllllllllIllIlllIIlIlIIllIIlI) {
            return llllllllllllIllIlllIIlIlIIllIIll < llllllllllllIllIlllIIlIlIIllIIlI;
        }
    }
}
