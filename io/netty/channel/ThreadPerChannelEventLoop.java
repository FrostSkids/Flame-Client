// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import io.netty.util.concurrent.GenericFutureListener;
import io.netty.util.concurrent.Future;

public class ThreadPerChannelEventLoop extends SingleThreadEventLoop
{
    private /* synthetic */ Channel ch;
    private static final /* synthetic */ int[] lIIlIIIIlIlIll;
    private final /* synthetic */ ThreadPerChannelEventLoopGroup parent;
    
    protected void deregister() {
        this.ch = null;
        this.parent.activeChildren.remove(this);
        "".length();
        this.parent.idleChildren.add(this);
        "".length();
    }
    
    private static void llIIlIIllIlIIll() {
        (lIIlIIIIlIlIll = new int[1])[0] = " ".length();
    }
    
    public ThreadPerChannelEventLoop(final ThreadPerChannelEventLoopGroup lllllllllllllIIlllIllIlIlIIlllII) {
        super(lllllllllllllIIlllIllIlIlIIlllII, lllllllllllllIIlllIllIlIlIIlllII.threadFactory, (boolean)(ThreadPerChannelEventLoop.lIIlIIIIlIlIll[0] != 0));
        this.parent = lllllllllllllIIlllIllIlIlIIlllII;
    }
    
    private static boolean llIIlIIllIlIllI(final int lllllllllllllIIlllIllIlIIllllIll) {
        return lllllllllllllIIlllIllIlIIllllIll == 0;
    }
    
    private static boolean llIIlIIllIlIlIl(final int lllllllllllllIIlllIllIlIIlllllIl) {
        return lllllllllllllIIlllIllIlIIlllllIl != 0;
    }
    
    static {
        llIIlIIllIlIIll();
    }
    
    private static boolean llIIlIIllIlIlII(final Object lllllllllllllIIlllIllIlIIlllllll) {
        return lllllllllllllIIlllIllIlIIlllllll != null;
    }
    
    @Override
    protected void run() {
        do {
            final Runnable lllllllllllllIIlllIllIlIlIIIllll = this.takeTask();
            if (llIIlIIllIlIlII(lllllllllllllIIlllIllIlIlIIIllll)) {
                lllllllllllllIIlllIllIlIlIIIllll.run();
                this.updateLastExecutionTime();
            }
            final Channel lllllllllllllIIlllIllIlIlIIIlllI = this.ch;
            if (llIIlIIllIlIlIl(this.isShuttingDown() ? 1 : 0)) {
                if (llIIlIIllIlIlII(lllllllllllllIIlllIllIlIlIIIlllI)) {
                    lllllllllllllIIlllIllIlIlIIIlllI.unsafe().close(lllllllllllllIIlllIllIlIlIIIlllI.unsafe().voidPromise());
                }
                if (llIIlIIllIlIlIl(this.confirmShutdown() ? 1 : 0)) {
                    "".length();
                    if ((0x24 ^ 0x14 ^ (0xBE ^ 0x8A)) == 0x0) {
                        return;
                    }
                    return;
                }
            }
            else if (llIIlIIllIlIlII(lllllllllllllIIlllIllIlIlIIIlllI) && llIIlIIllIlIllI(lllllllllllllIIlllIllIlIlIIIlllI.isRegistered() ? 1 : 0)) {
                this.runAllTasks();
                "".length();
                this.deregister();
            }
            "".length();
        } while ("   ".length() == "   ".length());
    }
    
    @Override
    public ChannelFuture register(final Channel lllllllllllllIIlllIllIlIlIIlIlII, final ChannelPromise lllllllllllllIIlllIllIlIlIIlIllI) {
        return super.register(lllllllllllllIIlllIllIlIlIIlIlII, lllllllllllllIIlllIllIlIlIIlIllI).addListener((GenericFutureListener<? extends Future<? super Void>>)new ChannelFutureListener() {
            private static boolean llIlIIllIlIIIIl(final int lllllllllllllIIllIIIlIIllllIlIlI) {
                return lllllllllllllIIllIIIlIIllllIlIlI != 0;
            }
            
            @Override
            public void operationComplete(final ChannelFuture lllllllllllllIIllIIIlIIlllllIIlI) throws Exception {
                if (llIlIIllIlIIIIl(lllllllllllllIIllIIIlIIlllllIIlI.isSuccess() ? 1 : 0)) {
                    ThreadPerChannelEventLoop.this.ch = lllllllllllllIIllIIIlIIlllllIIlI.channel();
                    "".length();
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    ThreadPerChannelEventLoop.this.deregister();
                }
            }
        });
    }
}
