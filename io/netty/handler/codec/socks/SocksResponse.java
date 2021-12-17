// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.socks;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public abstract class SocksResponse extends SocksMessage
{
    private static final /* synthetic */ int[] lIIIIlIIllIIII;
    private final /* synthetic */ SocksResponseType responseType;
    private static final /* synthetic */ String[] lIIIIlIIlIllll;
    
    private static void lIlllIIIlllIIIl() {
        (lIIIIlIIllIIII = new int[2])[0] = ((0x9B ^ 0xA7) & ~(0x87 ^ 0xBB));
        SocksResponse.lIIIIlIIllIIII[1] = " ".length();
    }
    
    private static String lIlllIIIllIllll(String lllllllllllllIlIIlIllllllIIlIIIl, final String lllllllllllllIlIIlIllllllIIlIIII) {
        lllllllllllllIlIIlIllllllIIlIIIl = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIllllllIIlIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIllllllIIlIlII = new StringBuilder();
        final char[] lllllllllllllIlIIlIllllllIIlIIll = lllllllllllllIlIIlIllllllIIlIIII.toCharArray();
        int lllllllllllllIlIIlIllllllIIlIIlI = SocksResponse.lIIIIlIIllIIII[0];
        final short lllllllllllllIlIIlIllllllIIIllII = (Object)lllllllllllllIlIIlIllllllIIlIIIl.toCharArray();
        final int lllllllllllllIlIIlIllllllIIIlIll = lllllllllllllIlIIlIllllllIIIllII.length;
        int lllllllllllllIlIIlIllllllIIIlIlI = SocksResponse.lIIIIlIIllIIII[0];
        while (lIlllIIIlllIIll(lllllllllllllIlIIlIllllllIIIlIlI, lllllllllllllIlIIlIllllllIIIlIll)) {
            final char lllllllllllllIlIIlIllllllIIlIlll = lllllllllllllIlIIlIllllllIIIllII[lllllllllllllIlIIlIllllllIIIlIlI];
            lllllllllllllIlIIlIllllllIIlIlII.append((char)(lllllllllllllIlIIlIllllllIIlIlll ^ lllllllllllllIlIIlIllllllIIlIIll[lllllllllllllIlIIlIllllllIIlIIlI % lllllllllllllIlIIlIllllllIIlIIll.length]));
            "".length();
            ++lllllllllllllIlIIlIllllllIIlIIlI;
            ++lllllllllllllIlIIlIllllllIIIlIlI;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIllllllIIlIlII);
    }
    
    private static void lIlllIIIlllIIII() {
        (lIIIIlIIlIllll = new String[SocksResponse.lIIIIlIIllIIII[1]])[SocksResponse.lIIIIlIIllIIII[0]] = lIlllIIIllIllll("BSQFMSYZMhMVMAck", "wAvAI");
    }
    
    public SocksResponseType responseType() {
        return this.responseType;
    }
    
    private static boolean lIlllIIIlllIIll(final int lllllllllllllIlIIlIllllllIIIIllI, final int lllllllllllllIlIIlIllllllIIIIlIl) {
        return lllllllllllllIlIIlIllllllIIIIllI < lllllllllllllIlIIlIllllllIIIIlIl;
    }
    
    static {
        lIlllIIIlllIIIl();
        lIlllIIIlllIIII();
    }
    
    private static boolean lIlllIIIlllIIlI(final Object lllllllllllllIlIIlIllllllIIIIIll) {
        return lllllllllllllIlIIlIllllllIIIIIll == null;
    }
    
    protected SocksResponse(final SocksResponseType lllllllllllllIlIIlIllllllIlIIlII) {
        super(SocksMessageType.RESPONSE);
        if (lIlllIIIlllIIlI(lllllllllllllIlIIlIllllllIlIIlII)) {
            throw new NullPointerException(SocksResponse.lIIIIlIIlIllll[SocksResponse.lIIIIlIIllIIII[0]]);
        }
        this.responseType = lllllllllllllIlIIlIllllllIlIIlII;
    }
}
