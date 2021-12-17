// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.util.concurrent;

import java.util.concurrent.ThreadFactory;

public class DefaultEventExecutorGroup extends MultithreadEventExecutorGroup
{
    private static final /* synthetic */ int[] lIIlIlIIlIllll;
    
    static {
        llIIlllllllIIII();
    }
    
    private static void llIIlllllllIIII() {
        (lIIlIlIIlIllll = new int[1])[0] = ((0x75 ^ 0x15) & ~(0xDA ^ 0xBA));
    }
    
    public DefaultEventExecutorGroup(final int lllllllllllllIIllIlIIlIIllIlIIII) {
        this(lllllllllllllIIllIlIIlIIllIlIIII, null);
    }
    
    @Override
    protected EventExecutor newChild(final ThreadFactory lllllllllllllIIllIlIIlIIlIlllIIl, final Object... lllllllllllllIIllIlIIlIIlIllIlll) throws Exception {
        return new DefaultEventExecutor(this, lllllllllllllIIllIlIIlIIlIlllIIl);
    }
    
    public DefaultEventExecutorGroup(final int lllllllllllllIIllIlIIlIIllIIIIll, final ThreadFactory lllllllllllllIIllIlIIlIIllIIIlIl) {
        super(lllllllllllllIIllIlIIlIIllIIIIll, lllllllllllllIIllIlIIlIIllIIIlIl, new Object[DefaultEventExecutorGroup.lIIlIlIIlIllll[0]]);
    }
}
