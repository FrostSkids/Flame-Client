// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.local;

import io.netty.util.concurrent.EventExecutor;
import java.util.concurrent.ThreadFactory;
import io.netty.channel.MultithreadEventLoopGroup;

public class LocalEventLoopGroup extends MultithreadEventLoopGroup
{
    private static final /* synthetic */ int[] lIllIIllIlIIII;
    
    public LocalEventLoopGroup(final int lllllllllllllIIIIIIllIIllIlIIIII, final ThreadFactory lllllllllllllIIIIIIllIIllIIlllII) {
        super(lllllllllllllIIIIIIllIIllIlIIIII, lllllllllllllIIIIIIllIIllIIlllII, new Object[LocalEventLoopGroup.lIllIIllIlIIII[0]]);
    }
    
    public LocalEventLoopGroup(final int lllllllllllllIIIIIIllIIllIlIIlll) {
        this(lllllllllllllIIIIIIllIIllIlIIlll, null);
    }
    
    static {
        lllllIlIlIlIIlI();
    }
    
    public LocalEventLoopGroup() {
        this(LocalEventLoopGroup.lIllIIllIlIIII[0]);
    }
    
    @Override
    protected EventExecutor newChild(final ThreadFactory lllllllllllllIIIIIIllIIllIIllIII, final Object... lllllllllllllIIIIIIllIIllIIlIlll) throws Exception {
        return new LocalEventLoop(this, lllllllllllllIIIIIIllIIllIIllIII);
    }
    
    private static void lllllIlIlIlIIlI() {
        (lIllIIllIlIIII = new int[1])[0] = ((0xA9 ^ 0x9B) & ~(0x43 ^ 0x71));
    }
}
