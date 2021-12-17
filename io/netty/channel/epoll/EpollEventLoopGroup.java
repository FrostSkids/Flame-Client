// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.epoll;

import io.netty.channel.EventLoopGroup;
import java.util.Iterator;
import io.netty.util.concurrent.EventExecutor;
import java.util.concurrent.ThreadFactory;
import io.netty.channel.MultithreadEventLoopGroup;

public final class EpollEventLoopGroup extends MultithreadEventLoopGroup
{
    private static final /* synthetic */ int[] llIlIIIIIlIIlI;
    
    private static boolean lIIlIIIlIIlIIlIl(final int llllllllllllIllIllIlllIlIIIIIIII) {
        return llllllllllllIllIllIlllIlIIIIIIII != 0;
    }
    
    public EpollEventLoopGroup(final int llllllllllllIllIllIlllIlIIIlllIl, final ThreadFactory llllllllllllIllIllIlllIlIIIllIII, final int llllllllllllIllIllIlllIlIIIlIlll) {
        final Object[] lllllllllllllIlIlIllIllllIIIIlII = new Object[EpollEventLoopGroup.llIlIIIIIlIIlI[2]];
        lllllllllllllIlIlIllIllllIIIIlII[EpollEventLoopGroup.llIlIIIIIlIIlI[0]] = llllllllllllIllIllIlllIlIIIlIlll;
        super(llllllllllllIllIllIlllIlIIIlllIl, llllllllllllIllIllIlllIlIIIllIII, lllllllllllllIlIlIllIllllIIIIlII);
    }
    
    static {
        lIIlIIIlIIlIIlII();
    }
    
    public EpollEventLoopGroup(final int llllllllllllIllIllIlllIlIIlIIlII, final ThreadFactory llllllllllllIllIllIlllIlIIlIIllI) {
        this(llllllllllllIllIllIlllIlIIlIIlII, llllllllllllIllIllIlllIlIIlIIllI, EpollEventLoopGroup.llIlIIIIIlIIlI[1]);
    }
    
    public EpollEventLoopGroup() {
        this(EpollEventLoopGroup.llIlIIIIIlIIlI[0]);
    }
    
    private static void lIIlIIIlIIlIIlII() {
        (llIlIIIIIlIIlI = new int[3])[0] = ((130 + 10 + 21 + 28 ^ 130 + 127 - 152 + 52) & (0x54 ^ 0x28 ^ (0xD5 ^ 0x89) ^ -" ".length()));
        EpollEventLoopGroup.llIlIIIIIlIIlI[1] = (0x4 ^ 0x58) + (0x7C ^ 0x1A) - (0x51 ^ 0x30) + (0x49 ^ 0x56);
        EpollEventLoopGroup.llIlIIIIIlIIlI[2] = " ".length();
    }
    
    public void setIoRatio(final int llllllllllllIllIllIlllIlIIIIllll) {
        final Iterator llllllllllllIllIllIlllIlIIIlIIIl = this.children().iterator();
        while (lIIlIIIlIIlIIlIl(llllllllllllIllIllIlllIlIIIlIIIl.hasNext() ? 1 : 0)) {
            final EventExecutor llllllllllllIllIllIlllIlIIIlIIlI = llllllllllllIllIllIlllIlIIIlIIIl.next();
            ((EpollEventLoop)llllllllllllIllIllIlllIlIIIlIIlI).setIoRatio(llllllllllllIllIllIlllIlIIIIllll);
            "".length();
            if (" ".length() >= (0xC5 ^ 0xC1)) {
                return;
            }
        }
    }
    
    @Override
    protected EventExecutor newChild(final ThreadFactory llllllllllllIllIllIlllIlIIIIIllI, final Object... llllllllllllIllIllIlllIlIIIIIlIl) throws Exception {
        return new EpollEventLoop(this, llllllllllllIllIllIlllIlIIIIIllI, (int)llllllllllllIllIllIlllIlIIIIIlIl[EpollEventLoopGroup.llIlIIIIIlIIlI[0]]);
    }
    
    public EpollEventLoopGroup(final int llllllllllllIllIllIlllIlIIlIlllI) {
        this(llllllllllllIllIllIlllIlIIlIlllI, null);
    }
}
