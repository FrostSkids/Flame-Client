// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ExecutionException;

public abstract class AbstractFuture<V> implements Future<V>
{
    private static boolean lIlllllIIlIIllI(final int lllllllllllllIlIIIllIIlIlIllIlll) {
        return lllllllllllllIlIIIllIIlIlIllIlll != 0;
    }
    
    @Override
    public V get() throws InterruptedException, ExecutionException {
        this.await();
        "".length();
        final Throwable lllllllllllllIlIIIllIIlIllIIlIIl = this.cause();
        if (lIlllllIIlIIlIl(lllllllllllllIlIIIllIIlIllIIlIIl)) {
            return this.getNow();
        }
        throw new ExecutionException(lllllllllllllIlIIIllIIlIllIIlIIl);
    }
    
    @Override
    public V get(final long lllllllllllllIlIIIllIIlIllIIIIII, final TimeUnit lllllllllllllIlIIIllIIlIlIllllII) throws ExecutionException, InterruptedException, TimeoutException {
        if (!lIlllllIIlIIllI(this.await(lllllllllllllIlIIIllIIlIllIIIIII, lllllllllllllIlIIIllIIlIlIllllII) ? 1 : 0)) {
            throw new TimeoutException();
        }
        final Throwable lllllllllllllIlIIIllIIlIllIIIIlI = this.cause();
        if (lIlllllIIlIIlIl(lllllllllllllIlIIIllIIlIllIIIIlI)) {
            return this.getNow();
        }
        throw new ExecutionException(lllllllllllllIlIIIllIIlIllIIIIlI);
    }
    
    private static boolean lIlllllIIlIIlIl(final Object lllllllllllllIlIIIllIIlIlIlllIIl) {
        return lllllllllllllIlIIIllIIlIlIlllIIl == null;
    }
}
