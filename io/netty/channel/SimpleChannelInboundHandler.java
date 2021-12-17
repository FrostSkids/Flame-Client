// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.channel;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.util.ReferenceCountUtil;
import io.netty.util.internal.TypeParameterMatcher;

public abstract class SimpleChannelInboundHandler<I> extends ChannelInboundHandlerAdapter
{
    private final /* synthetic */ TypeParameterMatcher matcher;
    private final /* synthetic */ boolean autoRelease;
    private static final /* synthetic */ int[] lIIllllIllIIIl;
    private static final /* synthetic */ String[] lIIllllIllIIII;
    
    protected SimpleChannelInboundHandler(final boolean lllllllllllllIIlIIlIIllIllIIlIll) {
        this.matcher = TypeParameterMatcher.find(this, SimpleChannelInboundHandler.class, SimpleChannelInboundHandler.lIIllllIllIIII[SimpleChannelInboundHandler.lIIllllIllIIIl[1]]);
        this.autoRelease = lllllllllllllIIlIIlIIllIllIIlIll;
    }
    
    @Override
    public void channelRead(final ChannelHandlerContext lllllllllllllIIlIIlIIllIlIlIllIl, final Object lllllllllllllIIlIIlIIllIlIlIlIII) throws Exception {
        boolean lllllllllllllIIlIIlIIllIlIlIlIll = SimpleChannelInboundHandler.lIIllllIllIIIl[0] != 0;
        try {
            if (llIllllIIIlllII(this.acceptInboundMessage(lllllllllllllIIlIIlIIllIlIlIlIII) ? 1 : 0)) {
                final I lllllllllllllIIlIIlIIllIlIlIllll = (I)lllllllllllllIIlIIlIIllIlIlIlIII;
                this.channelRead0(lllllllllllllIIlIIlIIllIlIlIllIl, lllllllllllllIIlIIlIIllIlIlIllll);
                "".length();
                if (" ".length() < ((0x43 ^ 0x50) & ~(0x85 ^ 0x96))) {
                    return;
                }
            }
            else {
                lllllllllllllIIlIIlIIllIlIlIlIll = (SimpleChannelInboundHandler.lIIllllIllIIIl[1] != 0);
                lllllllllllllIIlIIlIIllIlIlIllIl.fireChannelRead(lllllllllllllIIlIIlIIllIlIlIlIII);
                "".length();
            }
            if (llIllllIIIlllII(this.autoRelease ? 1 : 0) && llIllllIIIlllII(lllllllllllllIIlIIlIIllIlIlIlIll ? 1 : 0)) {
                ReferenceCountUtil.release(lllllllllllllIIlIIlIIllIlIlIlIII);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
        }
        finally {
            if (llIllllIIIlllII(this.autoRelease ? 1 : 0) && llIllllIIIlllII(lllllllllllllIIlIIlIIllIlIlIlIll ? 1 : 0)) {
                ReferenceCountUtil.release(lllllllllllllIIlIIlIIllIlIlIlIII);
                "".length();
            }
        }
    }
    
    protected abstract void channelRead0(final ChannelHandlerContext p0, final I p1) throws Exception;
    
    private static void llIllllIIIllIll() {
        (lIIllllIllIIIl = new int[2])[0] = " ".length();
        SimpleChannelInboundHandler.lIIllllIllIIIl[1] = ((0x57 ^ 0x72) & ~(0xBE ^ 0x9B));
    }
    
    private static boolean llIllllIIIlllIl(final int lllllllllllllIIlIIlIIllIlIIIlIlI, final int lllllllllllllIIlIIlIIllIlIIIlIIl) {
        return lllllllllllllIIlIIlIIllIlIIIlIlI < lllllllllllllIIlIIlIIllIlIIIlIIl;
    }
    
    protected SimpleChannelInboundHandler(final Class<? extends I> lllllllllllllIIlIIlIIllIllIIIlll) {
        this(lllllllllllllIIlIIlIIllIllIIIlll, (boolean)(SimpleChannelInboundHandler.lIIllllIllIIIl[0] != 0));
    }
    
    static {
        llIllllIIIllIll();
        llIllllIIIllIlI();
    }
    
    protected SimpleChannelInboundHandler(final Class<? extends I> lllllllllllllIIlIIlIIllIlIllllIl, final boolean lllllllllllllIIlIIlIIllIlIllllII) {
        this.matcher = TypeParameterMatcher.get(lllllllllllllIIlIIlIIllIlIllllIl);
        this.autoRelease = lllllllllllllIIlIIlIIllIlIllllII;
    }
    
    private static void llIllllIIIllIlI() {
        (lIIllllIllIIII = new String[SimpleChannelInboundHandler.lIIllllIllIIIl[0]])[SimpleChannelInboundHandler.lIIllllIllIIIl[1]] = llIllllIIIllIIl("Aw==", "JroiM");
    }
    
    protected SimpleChannelInboundHandler() {
        this((boolean)(SimpleChannelInboundHandler.lIIllllIllIIIl[0] != 0));
    }
    
    private static String llIllllIIIllIIl(String lllllllllllllIIlIIlIIllIlIIlIlIl, final String lllllllllllllIIlIIlIIllIlIIlIlII) {
        lllllllllllllIIlIIlIIllIlIIlIlIl = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIIllIlIIlIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIIllIlIIllIII = new StringBuilder();
        final char[] lllllllllllllIIlIIlIIllIlIIlIlll = lllllllllllllIIlIIlIIllIlIIlIlII.toCharArray();
        int lllllllllllllIIlIIlIIllIlIIlIllI = SimpleChannelInboundHandler.lIIllllIllIIIl[1];
        final String lllllllllllllIIlIIlIIllIlIIlIIII = (Object)((String)lllllllllllllIIlIIlIIllIlIIlIlIl).toCharArray();
        final String lllllllllllllIIlIIlIIllIlIIIllll = (String)lllllllllllllIIlIIlIIllIlIIlIIII.length;
        short lllllllllllllIIlIIlIIllIlIIIlllI = (short)SimpleChannelInboundHandler.lIIllllIllIIIl[1];
        while (llIllllIIIlllIl(lllllllllllllIIlIIlIIllIlIIIlllI, (int)lllllllllllllIIlIIlIIllIlIIIllll)) {
            final char lllllllllllllIIlIIlIIllIlIIllIll = lllllllllllllIIlIIlIIllIlIIlIIII[lllllllllllllIIlIIlIIllIlIIIlllI];
            lllllllllllllIIlIIlIIllIlIIllIII.append((char)(lllllllllllllIIlIIlIIllIlIIllIll ^ lllllllllllllIIlIIlIIllIlIIlIlll[lllllllllllllIIlIIlIIllIlIIlIllI % lllllllllllllIIlIIlIIllIlIIlIlll.length]));
            "".length();
            ++lllllllllllllIIlIIlIIllIlIIlIllI;
            ++lllllllllllllIIlIIlIIllIlIIIlllI;
            "".length();
            if ("  ".length() < ((0x6C ^ 0x2E) & ~(0x23 ^ 0x61))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIIllIlIIllIII);
    }
    
    public boolean acceptInboundMessage(final Object lllllllllllllIIlIIlIIllIlIllIllI) throws Exception {
        return this.matcher.match(lllllllllllllIIlIIlIIllIlIllIllI);
    }
    
    private static boolean llIllllIIIlllII(final int lllllllllllllIIlIIlIIllIlIIIIlll) {
        return lllllllllllllIIlIIlIIllIlIIIIlll != 0;
    }
}
