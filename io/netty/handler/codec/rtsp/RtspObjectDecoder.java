// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.handler.codec.http.HttpObjectDecoder;

public abstract class RtspObjectDecoder extends HttpObjectDecoder
{
    private static final /* synthetic */ String[] lIIlllllIIIIIl;
    private static final /* synthetic */ int[] lIIlllllIIIIll;
    
    static {
        llIllllIIllIlII();
        llIllllIIlIlllI();
    }
    
    private static void llIllllIIlIlllI() {
        (lIIlllllIIIIIl = new String[RtspObjectDecoder.lIIlllllIIIIll[4]])[RtspObjectDecoder.lIIlllllIIIIll[3]] = llIllllIIlIllIl("ARcpBxAsDGo/ECwfMxs=", "BxGsu");
    }
    
    @Override
    protected boolean isContentAlwaysEmpty(final HttpMessage lllllllllllllIIlIIlIIlIlIlllllll) {
        final boolean lllllllllllllIIlIIlIIlIllIIIIIIl = super.isContentAlwaysEmpty(lllllllllllllIIlIIlIIlIlIlllllll);
        if (llIllllIIllIlIl(lllllllllllllIIlIIlIIlIllIIIIIIl ? 1 : 0)) {
            return RtspObjectDecoder.lIIlllllIIIIll[4] != 0;
        }
        if (llIllllIIllIllI(lllllllllllllIIlIIlIIlIlIlllllll.headers().contains(RtspObjectDecoder.lIIlllllIIIIIl[RtspObjectDecoder.lIIlllllIIIIll[3]]) ? 1 : 0)) {
            return RtspObjectDecoder.lIIlllllIIIIll[4] != 0;
        }
        return lllllllllllllIIlIIlIIlIllIIIIIIl;
    }
    
    private static boolean llIllllIIllIlll(final int lllllllllllllIIlIIlIIlIlIllIIIll, final int lllllllllllllIIlIIlIIlIlIllIIIlI) {
        return lllllllllllllIIlIIlIIlIlIllIIIll < lllllllllllllIIlIIlIIlIlIllIIIlI;
    }
    
    protected RtspObjectDecoder() {
        this(RtspObjectDecoder.lIIlllllIIIIll[0], RtspObjectDecoder.lIIlllllIIIIll[1], RtspObjectDecoder.lIIlllllIIIIll[1]);
    }
    
    private static void llIllllIIllIlII() {
        (lIIlllllIIIIll = new int[5])[0] = (0xFFFFFD02 & 0x12FD);
        RtspObjectDecoder.lIIlllllIIIIll[1] = (-(0xFFFFFBBF & 0x4F49) & (0xFFFFFF7B & 0x6B8C));
        RtspObjectDecoder.lIIlllllIIIIll[2] = "  ".length();
        RtspObjectDecoder.lIIlllllIIIIll[3] = ((0x4B ^ 0x2) & ~(0x5C ^ 0x15));
        RtspObjectDecoder.lIIlllllIIIIll[4] = " ".length();
    }
    
    private static String llIllllIIlIllIl(String lllllllllllllIIlIIlIIlIlIllIlllI, final String lllllllllllllIIlIIlIIlIlIllIllIl) {
        lllllllllllllIIlIIlIIlIlIllIlllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIIlIlIllIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIIlIlIlllIIIl = new StringBuilder();
        final char[] lllllllllllllIIlIIlIIlIlIlllIIII = lllllllllllllIIlIIlIIlIlIllIllIl.toCharArray();
        int lllllllllllllIIlIIlIIlIlIllIllll = RtspObjectDecoder.lIIlllllIIIIll[3];
        final short lllllllllllllIIlIIlIIlIlIllIlIIl = (Object)((String)lllllllllllllIIlIIlIIlIlIllIlllI).toCharArray();
        final float lllllllllllllIIlIIlIIlIlIllIlIII = lllllllllllllIIlIIlIIlIlIllIlIIl.length;
        int lllllllllllllIIlIIlIIlIlIllIIlll = RtspObjectDecoder.lIIlllllIIIIll[3];
        while (llIllllIIllIlll(lllllllllllllIIlIIlIIlIlIllIIlll, (int)lllllllllllllIIlIIlIIlIlIllIlIII)) {
            final char lllllllllllllIIlIIlIIlIlIlllIlII = lllllllllllllIIlIIlIIlIlIllIlIIl[lllllllllllllIIlIIlIIlIlIllIIlll];
            lllllllllllllIIlIIlIIlIlIlllIIIl.append((char)(lllllllllllllIIlIIlIIlIlIlllIlII ^ lllllllllllllIIlIIlIIlIlIlllIIII[lllllllllllllIIlIIlIIlIlIllIllll % lllllllllllllIIlIIlIIlIlIlllIIII.length]));
            "".length();
            ++lllllllllllllIIlIIlIIlIlIllIllll;
            ++lllllllllllllIIlIIlIIlIlIllIIlll;
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIIlIlIlllIIIl);
    }
    
    private static boolean llIllllIIllIllI(final int lllllllllllllIIlIIlIIlIlIlIllllI) {
        return lllllllllllllIIlIIlIIlIlIlIllllI == 0;
    }
    
    private static boolean llIllllIIllIlIl(final int lllllllllllllIIlIIlIIlIlIllIIIII) {
        return lllllllllllllIIlIIlIIlIlIllIIIII != 0;
    }
    
    protected RtspObjectDecoder(final int lllllllllllllIIlIIlIIlIllIIIllll, final int lllllllllllllIIlIIlIIlIllIIIlIIl, final int lllllllllllllIIlIIlIIlIllIIIllIl, final boolean lllllllllllllIIlIIlIIlIllIIIllII) {
        super(lllllllllllllIIlIIlIIlIllIIIllll, lllllllllllllIIlIIlIIlIllIIIlIIl, lllllllllllllIIlIIlIIlIllIIIllIl * RtspObjectDecoder.lIIlllllIIIIll[2], (boolean)(RtspObjectDecoder.lIIlllllIIIIll[3] != 0), lllllllllllllIIlIIlIIlIllIIIllII);
    }
    
    protected RtspObjectDecoder(final int lllllllllllllIIlIIlIIlIllIIlllII, final int lllllllllllllIIlIIlIIlIllIIllIll, final int lllllllllllllIIlIIlIIlIllIIlIllI) {
        super(lllllllllllllIIlIIlIIlIllIIlllII, lllllllllllllIIlIIlIIlIllIIllIll, lllllllllllllIIlIIlIIlIllIIlIllI * RtspObjectDecoder.lIIlllllIIIIll[2], (boolean)(RtspObjectDecoder.lIIlllllIIIIll[3] != 0));
    }
}
