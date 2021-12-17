// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.Arrays;

final class DefaultFutureListeners
{
    private /* synthetic */ int size;
    private /* synthetic */ GenericFutureListener<? extends Future<?>>[] listeners;
    private /* synthetic */ int progressiveSize;
    private static final /* synthetic */ int[] lIllIllIllIIll;
    
    private static boolean lllllllllIIlllI(final int llllllllllllIllllllIllIIIlIlllll, final int llllllllllllIllllllIllIIIlIllllI) {
        return llllllllllllIllllllIllIIIlIlllll == llllllllllllIllllllIllIIIlIllllI;
    }
    
    public int progressiveSize() {
        return this.progressiveSize;
    }
    
    public void add(final GenericFutureListener<? extends Future<?>> llllllllllllIllllllIllIIlIIIIIll) {
        GenericFutureListener<? extends Future<?>>[] llllllllllllIllllllIllIIlIIIIIlI = this.listeners;
        final int llllllllllllIllllllIllIIlIIIIIIl = this.size;
        if (lllllllllIIlllI(llllllllllllIllllllIllIIlIIIIIIl, llllllllllllIllllllIllIIlIIIIIlI.length)) {
            llllllllllllIllllllIllIIlIIIIIlI = (this.listeners = Arrays.copyOf(llllllllllllIllllllIllIIlIIIIIlI, llllllllllllIllllllIllIIlIIIIIIl << DefaultFutureListeners.lIllIllIllIIll[2]));
        }
        llllllllllllIllllllIllIIlIIIIIlI[llllllllllllIllllllIllIIlIIIIIIl] = llllllllllllIllllllIllIIlIIIIIll;
        this.size = llllllllllllIllllllIllIIlIIIIIIl + DefaultFutureListeners.lIllIllIllIIll[2];
        if (lllllllllIIllIl((llllllllllllIllllllIllIIlIIIIIll instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
            this.progressiveSize += DefaultFutureListeners.lIllIllIllIIll[2];
        }
    }
    
    private static void lllllllllIIllII() {
        (lIllIllIllIIll = new int[3])[0] = "  ".length();
        DefaultFutureListeners.lIllIllIllIIll[1] = ((0x1F ^ 0x61 ^ (0xF6 ^ 0x94)) & (143 + 4 - 125 + 151 ^ 115 + 153 - 107 + 16 ^ -" ".length()));
        DefaultFutureListeners.lIllIllIllIIll[2] = " ".length();
    }
    
    static {
        lllllllllIIllII();
    }
    
    DefaultFutureListeners(final GenericFutureListener<? extends Future<?>> llllllllllllIllllllIllIIlIIIllIl, final GenericFutureListener<? extends Future<?>> llllllllllllIllllllIllIIlIIIllII) {
        this.listeners = (GenericFutureListener<? extends Future<?>>[])new GenericFutureListener[DefaultFutureListeners.lIllIllIllIIll[0]];
        this.listeners[DefaultFutureListeners.lIllIllIllIIll[1]] = llllllllllllIllllllIllIIlIIIllIl;
        this.listeners[DefaultFutureListeners.lIllIllIllIIll[2]] = llllllllllllIllllllIllIIlIIIllII;
        this.size = DefaultFutureListeners.lIllIllIllIIll[0];
        if (lllllllllIIllIl((llllllllllllIllllllIllIIlIIIllIl instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
            this.progressiveSize += DefaultFutureListeners.lIllIllIllIIll[2];
        }
        if (lllllllllIIllIl((llllllllllllIllllllIllIIlIIIllII instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
            this.progressiveSize += DefaultFutureListeners.lIllIllIllIIll[2];
        }
    }
    
    private static boolean lllllllllIlIIIl(final int llllllllllllIllllllIllIIIlIlIIlI) {
        return llllllllllllIllllllIllIIIlIlIIlI > 0;
    }
    
    public GenericFutureListener<? extends Future<?>>[] listeners() {
        return this.listeners;
    }
    
    private static boolean lllllllllIIllIl(final int llllllllllllIllllllIllIIIlIlIlII) {
        return llllllllllllIllllllIllIIIlIlIlII != 0;
    }
    
    public int size() {
        return this.size;
    }
    
    private static boolean lllllllllIlIIII(final Object llllllllllllIllllllIllIIIlIlIlll, final Object llllllllllllIllllllIllIIIlIlIllI) {
        return llllllllllllIllllllIllIIIlIlIlll == llllllllllllIllllllIllIIIlIlIllI;
    }
    
    private static boolean lllllllllIIllll(final int llllllllllllIllllllIllIIIlIllIll, final int llllllllllllIllllllIllIIIlIllIlI) {
        return llllllllllllIllllllIllIIIlIllIll < llllllllllllIllllllIllIIIlIllIlI;
    }
    
    public void remove(final GenericFutureListener<? extends Future<?>> llllllllllllIllllllIllIIIllIllll) {
        final GenericFutureListener<? extends Future<?>>[] llllllllllllIllllllIllIIIlllIIlI = this.listeners;
        int llllllllllllIllllllIllIIIlllIIIl = this.size;
        int llllllllllllIllllllIllIIIlllIlIl = DefaultFutureListeners.lIllIllIllIIll[1];
        while (lllllllllIIllll(llllllllllllIllllllIllIIIlllIlIl, llllllllllllIllllllIllIIIlllIIIl)) {
            if (lllllllllIlIIII(llllllllllllIllllllIllIIIlllIIlI[llllllllllllIllllllIllIIIlllIlIl], llllllllllllIllllllIllIIIllIllll)) {
                final int llllllllllllIllllllIllIIIlllIllI = llllllllllllIllllllIllIIIlllIIIl - llllllllllllIllllllIllIIIlllIlIl - DefaultFutureListeners.lIllIllIllIIll[2];
                if (lllllllllIlIIIl(llllllllllllIllllllIllIIIlllIllI)) {
                    System.arraycopy(llllllllllllIllllllIllIIIlllIIlI, llllllllllllIllllllIllIIIlllIlIl + DefaultFutureListeners.lIllIllIllIIll[2], llllllllllllIllllllIllIIIlllIIlI, llllllllllllIllllllIllIIIlllIlIl, llllllllllllIllllllIllIIIlllIllI);
                }
                llllllllllllIllllllIllIIIlllIIlI[--llllllllllllIllllllIllIIIlllIIIl] = null;
                this.size = llllllllllllIllllllIllIIIlllIIIl;
                if (lllllllllIIllIl((llllllllllllIllllllIllIIIllIllll instanceof GenericProgressiveFutureListener) ? 1 : 0)) {
                    this.progressiveSize -= DefaultFutureListeners.lIllIllIllIIll[2];
                }
                return;
            }
            ++llllllllllllIllllllIllIIIlllIlIl;
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
    }
}
