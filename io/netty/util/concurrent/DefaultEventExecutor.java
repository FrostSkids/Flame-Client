// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.ThreadFactory;

final class DefaultEventExecutor extends SingleThreadEventExecutor
{
    private static final /* synthetic */ int[] lIlIIllIIlIlll;
    
    static {
        lllIIllllIllIlI();
    }
    
    @Override
    protected void run() {
        do {
            final Runnable lllllllllllllIIIllIIlllIlIIlllll = this.takeTask();
            if (lllIIllllIllIll(lllllllllllllIIIllIIlllIlIIlllll)) {
                lllllllllllllIIIllIIlllIlIIlllll.run();
                this.updateLastExecutionTime();
            }
            if (lllIIllllIlllII(this.confirmShutdown() ? 1 : 0)) {
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                "".length();
            }
        } while ((0x84 ^ 0x80) >= "   ".length());
    }
    
    private static boolean lllIIllllIllIll(final Object lllllllllllllIIIllIIlllIlIIllIlI) {
        return lllllllllllllIIIllIIlllIlIIllIlI != null;
    }
    
    DefaultEventExecutor(final DefaultEventExecutorGroup lllllllllllllIIIllIIlllIlIlIIIll, final ThreadFactory lllllllllllllIIIllIIlllIlIlIIIlI) {
        super(lllllllllllllIIIllIIlllIlIlIIIll, lllllllllllllIIIllIIlllIlIlIIIlI, (boolean)(DefaultEventExecutor.lIlIIllIIlIlll[0] != 0));
    }
    
    private static void lllIIllllIllIlI() {
        (lIlIIllIIlIlll = new int[1])[0] = " ".length();
    }
    
    private static boolean lllIIllllIlllII(final int lllllllllllllIIIllIIlllIlIIllIII) {
        return lllllllllllllIIIllIIlllIlIIllIII != 0;
    }
}
