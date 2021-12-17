// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.local;

import io.netty.channel.EventLoopGroup;
import java.util.concurrent.ThreadFactory;
import io.netty.channel.SingleThreadEventLoop;

final class LocalEventLoop extends SingleThreadEventLoop
{
    private static final /* synthetic */ int[] lllIlIllIllllI;
    
    private static boolean lIlIIIllIllIIlII(final int llllllllllllIlIllIlIIllllIIlIIlI) {
        return llllllllllllIlIllIlIIllllIIlIIlI != 0;
    }
    
    private static boolean lIlIIIllIllIIIll(final Object llllllllllllIlIllIlIIllllIIlIlII) {
        return llllllllllllIlIllIlIIllllIIlIlII != null;
    }
    
    LocalEventLoop(final LocalEventLoopGroup llllllllllllIlIllIlIIllllIIlllIl, final ThreadFactory llllllllllllIlIllIlIIllllIIlllll) {
        super(llllllllllllIlIllIlIIllllIIlllIl, llllllllllllIlIllIlIIllllIIlllll, (boolean)(LocalEventLoop.lllIlIllIllllI[0] != 0));
    }
    
    private static void lIlIIIllIllIIIlI() {
        (lllIlIllIllllI = new int[1])[0] = " ".length();
    }
    
    static {
        lIlIIIllIllIIIlI();
    }
    
    @Override
    protected void run() {
        do {
            final Runnable llllllllllllIlIllIlIIllllIIllIIl = this.takeTask();
            if (lIlIIIllIllIIIll(llllllllllllIlIllIlIIllllIIllIIl)) {
                llllllllllllIlIllIlIIllllIIllIIl.run();
                this.updateLastExecutionTime();
            }
            if (lIlIIIllIllIIlII(this.confirmShutdown() ? 1 : 0)) {
                "".length();
                if ("   ".length() >= (0x53 ^ 0x57)) {
                    return;
                }
            }
            else {
                "".length();
            }
        } while (-" ".length() <= (0x2A ^ 0x6C ^ (0xFC ^ 0xBE)));
    }
}
