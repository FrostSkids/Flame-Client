// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel.oio;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import io.netty.channel.ThreadPerChannelEventLoopGroup;

public class OioEventLoopGroup extends ThreadPerChannelEventLoopGroup
{
    private static final /* synthetic */ int[] lIlIIIllIIIlII;
    
    public OioEventLoopGroup() {
        this(OioEventLoopGroup.lIlIIIllIIIlII[0]);
    }
    
    private static void lllIIIllIlllIIl() {
        (lIlIIIllIIIlII = new int[1])[0] = ((0x10 ^ 0x4D ^ (0x58 ^ 0x47)) & (182 + 34 - 37 + 16 ^ 113 + 67 - 94 + 43 ^ -" ".length()));
    }
    
    public OioEventLoopGroup(final int lllllllllllllIIIllllIIlllIIllIII) {
        this(lllllllllllllIIIllllIIlllIIllIII, Executors.defaultThreadFactory());
    }
    
    static {
        lllIIIllIlllIIl();
    }
    
    public OioEventLoopGroup(final int lllllllllllllIIIllllIIlllIIIlllI, final ThreadFactory lllllllllllllIIIllllIIlllIIIllIl) {
        super(lllllllllllllIIIllllIIlllIIIlllI, lllllllllllllIIIllllIIlllIIIllIl, new Object[OioEventLoopGroup.lIlIIIllIIIlII[0]]);
    }
}
