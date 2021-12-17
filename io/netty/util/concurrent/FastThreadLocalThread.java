// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import io.netty.util.internal.InternalThreadLocalMap;

public class FastThreadLocalThread extends Thread
{
    private /* synthetic */ InternalThreadLocalMap threadLocalMap;
    
    public FastThreadLocalThread(final ThreadGroup llllllllllllIllIIlIlllIlIllIIIIl, final String llllllllllllIllIIlIlllIlIllIIIII) {
        super(llllllllllllIllIIlIlllIlIllIIIIl, llllllllllllIllIIlIlllIlIllIIIII);
    }
    
    public FastThreadLocalThread(final Runnable llllllllllllIllIIlIlllIlIlIllIll, final String llllllllllllIllIIlIlllIlIlIllIlI) {
        super(llllllllllllIllIIlIlllIlIlIllIll, llllllllllllIllIIlIlllIlIlIllIlI);
    }
    
    public FastThreadLocalThread() {
    }
    
    public final InternalThreadLocalMap threadLocalMap() {
        return this.threadLocalMap;
    }
    
    public FastThreadLocalThread(final String llllllllllllIllIIlIlllIlIllIlIll) {
        super(llllllllllllIllIIlIlllIlIllIlIll);
    }
    
    public final void setThreadLocalMap(final InternalThreadLocalMap llllllllllllIllIIlIlllIlIIllIIll) {
        this.threadLocalMap = llllllllllllIllIIlIlllIlIIllIIll;
    }
    
    public FastThreadLocalThread(final ThreadGroup llllllllllllIllIIlIlllIlIlIlIIIl, final Runnable llllllllllllIllIIlIlllIlIlIIllII, final String llllllllllllIllIIlIlllIlIlIIlIll) {
        super(llllllllllllIllIIlIlllIlIlIlIIIl, llllllllllllIllIIlIlllIlIlIIllII, llllllllllllIllIIlIlllIlIlIIlIll);
    }
    
    public FastThreadLocalThread(final ThreadGroup llllllllllllIllIIlIlllIlIIllllll, final Runnable llllllllllllIllIIlIlllIlIlIIIIll, final String llllllllllllIllIIlIlllIlIIllllIl, final long llllllllllllIllIIlIlllIlIlIIIIIl) {
        super(llllllllllllIllIIlIlllIlIIllllll, llllllllllllIllIIlIlllIlIlIIIIll, llllllllllllIllIIlIlllIlIIllllIl, llllllllllllIllIIlIlllIlIlIIIIIl);
    }
    
    public FastThreadLocalThread(final ThreadGroup llllllllllllIllIIlIlllIlIlllIIII, final Runnable llllllllllllIllIIlIlllIlIlllIIlI) {
        super(llllllllllllIllIIlIlllIlIlllIIII, llllllllllllIllIIlIlllIlIlllIIlI);
    }
    
    public FastThreadLocalThread(final Runnable llllllllllllIllIIlIlllIlIllllIlI) {
        super(llllllllllllIllIIlIlllIlIllllIlI);
    }
}
