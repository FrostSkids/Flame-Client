// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.nio;

import java.nio.channels.spi.SelectorProvider;
import java.util.concurrent.ThreadFactory;
import java.util.Iterator;
import io.netty.util.concurrent.EventExecutor;
import io.netty.channel.MultithreadEventLoopGroup;

public class NioEventLoopGroup extends MultithreadEventLoopGroup
{
    private static final /* synthetic */ int[] lIllIllIlIIlII;
    
    private static void llllllllIIllIII() {
        (lIllIllIlIIlII = new int[2])[0] = ((0x92 ^ 0xAA) & ~(0x8E ^ 0xB6));
        NioEventLoopGroup.lIllIllIlIIlII[1] = " ".length();
    }
    
    public void rebuildSelectors() {
        final Iterator llllllllllllIlllllllIIIIIllIllll = this.children().iterator();
        while (llllllllIIllIIl(llllllllllllIlllllllIIIIIllIllll.hasNext() ? 1 : 0)) {
            final EventExecutor llllllllllllIlllllllIIIIIlllIIII = llllllllllllIlllllllIIIIIllIllll.next();
            ((NioEventLoop)llllllllllllIlllllllIIIIIlllIIII).rebuildSelector();
            "".length();
            if (" ".length() >= "  ".length()) {
                return;
            }
        }
    }
    
    private static boolean llllllllIIllIIl(final int llllllllllllIlllllllIIIIIllIIIII) {
        return llllllllllllIlllllllIIIIIllIIIII != 0;
    }
    
    public NioEventLoopGroup(final int llllllllllllIlllllllIIIIlIIlIIII, final ThreadFactory llllllllllllIlllllllIIIIlIIIllll) {
        this(llllllllllllIlllllllIIIIlIIlIIII, llllllllllllIlllllllIIIIlIIIllll, SelectorProvider.provider());
    }
    
    public NioEventLoopGroup() {
        this(NioEventLoopGroup.lIllIllIlIIlII[0]);
    }
    
    public NioEventLoopGroup(final int llllllllllllIlllllllIIIIlIIIIIlI, final ThreadFactory llllllllllllIlllllllIIIIlIIIIIIl, final SelectorProvider llllllllllllIlllllllIIIIlIIIIIII) {
        final Object[] lllllllllllllIlIlIllIllllIIIIlII = new Object[NioEventLoopGroup.lIllIllIlIIlII[1]];
        lllllllllllllIlIlIllIllllIIIIlII[NioEventLoopGroup.lIllIllIlIIlII[0]] = llllllllllllIlllllllIIIIlIIIIIII;
        super(llllllllllllIlllllllIIIIlIIIIIlI, llllllllllllIlllllllIIIIlIIIIIIl, lllllllllllllIlIlIllIllllIIIIlII);
    }
    
    static {
        llllllllIIllIII();
    }
    
    public NioEventLoopGroup(final int llllllllllllIlllllllIIIIlIIlIlIl) {
        this(llllllllllllIlllllllIIIIlIIlIlIl, null);
    }
    
    public void setIoRatio(final int llllllllllllIlllllllIIIIIllllIII) {
        final Iterator llllllllllllIlllllllIIIIIllllIlI = this.children().iterator();
        while (llllllllIIllIIl(llllllllllllIlllllllIIIIIllllIlI.hasNext() ? 1 : 0)) {
            final EventExecutor llllllllllllIlllllllIIIIIllllIll = llllllllllllIlllllllIIIIIllllIlI.next();
            ((NioEventLoop)llllllllllllIlllllllIIIIIllllIll).setIoRatio(llllllllllllIlllllllIIIIIllllIII);
            "".length();
            if ("  ".length() >= "   ".length()) {
                return;
            }
        }
    }
    
    @Override
    protected EventExecutor newChild(final ThreadFactory llllllllllllIlllllllIIIIIllIIllI, final Object... llllllllllllIlllllllIIIIIllIIIlI) throws Exception {
        return new NioEventLoop(this, llllllllllllIlllllllIIIIIllIIllI, (SelectorProvider)llllllllllllIlllllllIIIIIllIIIlI[NioEventLoopGroup.lIllIllIlIIlII[0]]);
    }
}
