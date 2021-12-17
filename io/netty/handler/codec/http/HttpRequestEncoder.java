// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.CharsetUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import io.netty.buffer.ByteBuf;

public class HttpRequestEncoder extends HttpObjectEncoder<HttpRequest>
{
    private static final /* synthetic */ int[] llIIIIlIIlIIII;
    private static final /* synthetic */ String[] llIIIIlIIIllll;
    private static final /* synthetic */ byte[] CRLF;
    
    @Override
    public boolean acceptOutboundMessage(final Object llllllllllllIlllIlllIIIlllllIIlI) throws Exception {
        int n;
        if (lIIIIllllIlIlllI(super.acceptOutboundMessage(llllllllllllIlllIlllIIIlllllIIlI) ? 1 : 0) && lIIIIllllIlIllll((llllllllllllIlllIlllIIIlllllIIlI instanceof HttpResponse) ? 1 : 0)) {
            n = HttpRequestEncoder.llIIIIlIIlIIII[0];
            "".length();
            if (null != null) {
                return ((74 + 107 - 87 + 84 ^ 64 + 80 - 68 + 83) & (0xD0 ^ 0xC2 ^ (0x6B ^ 0x54) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = HttpRequestEncoder.llIIIIlIIlIIII[1];
        }
        return n != 0;
    }
    
    private static boolean lIIIIllllIllIIIl(final int llllllllllllIlllIlllIIIllIllIlIl, final int llllllllllllIlllIlllIIIllIllIlII) {
        return llllllllllllIlllIlllIIIllIllIlIl == llllllllllllIlllIlllIIIllIllIlII;
    }
    
    private static String lIIIIllllIlIlIll(String llllllllllllIlllIlllIIIlllIIIIII, final String llllllllllllIlllIlllIIIllIllllll) {
        llllllllllllIlllIlllIIIlllIIIIII = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlllIIIlllIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlllIIIlllIIIIll = new StringBuilder();
        final char[] llllllllllllIlllIlllIIIlllIIIIlI = llllllllllllIlllIlllIIIllIllllll.toCharArray();
        int llllllllllllIlllIlllIIIlllIIIIIl = HttpRequestEncoder.llIIIIlIIlIIII[1];
        final double llllllllllllIlllIlllIIIllIlllIll = (Object)((String)llllllllllllIlllIlllIIIlllIIIIII).toCharArray();
        final char llllllllllllIlllIlllIIIllIlllIlI = (char)llllllllllllIlllIlllIIIllIlllIll.length;
        char llllllllllllIlllIlllIIIllIlllIIl = (char)HttpRequestEncoder.llIIIIlIIlIIII[1];
        while (lIIIIllllIllIIll(llllllllllllIlllIlllIIIllIlllIIl, llllllllllllIlllIlllIIIllIlllIlI)) {
            final char llllllllllllIlllIlllIIIlllIIIllI = llllllllllllIlllIlllIIIllIlllIll[llllllllllllIlllIlllIIIllIlllIIl];
            llllllllllllIlllIlllIIIlllIIIIll.append((char)(llllllllllllIlllIlllIIIlllIIIllI ^ llllllllllllIlllIlllIIIlllIIIIlI[llllllllllllIlllIlllIIIlllIIIIIl % llllllllllllIlllIlllIIIlllIIIIlI.length]));
            "".length();
            ++llllllllllllIlllIlllIIIlllIIIIIl;
            ++llllllllllllIlllIlllIIIllIlllIIl;
            "".length();
            if (((0x4F ^ 0x60) & ~(0x75 ^ 0x5A)) != ((0x15 ^ 0x18) & ~(0x80 ^ 0x8D))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlllIIIlllIIIIll);
    }
    
    private static boolean lIIIIllllIlIllll(final int llllllllllllIlllIlllIIIllIlIlIII) {
        return llllllllllllIlllIlllIIIllIlIlIII == 0;
    }
    
    private static void lIIIIllllIlIllIl() {
        (llIIIIlIIlIIII = new int[10])[0] = " ".length();
        HttpRequestEncoder.llIIIIlIIlIIII[1] = ((0x29 ^ 0x23) & ~(0x41 ^ 0x4B));
        HttpRequestEncoder.llIIIIlIIlIIII[2] = (122 + 46 - 81 + 61 ^ 149 + 166 - 188 + 53);
        HttpRequestEncoder.llIIIIlIIlIIII[3] = (0x52 ^ 0x7D);
        HttpRequestEncoder.llIIIIlIIlIIII[4] = -" ".length();
        HttpRequestEncoder.llIIIIlIIlIIII[5] = "   ".length();
        HttpRequestEncoder.llIIIIlIIlIIII[6] = (0xFF ^ 0x88 ^ (0x5B ^ 0x13));
        HttpRequestEncoder.llIIIIlIIlIIII[7] = "  ".length();
        HttpRequestEncoder.llIIIIlIIlIIII[8] = (0xF ^ 0x2);
        HttpRequestEncoder.llIIIIlIIlIIII[9] = (0x49 ^ 0x43);
    }
    
    private static boolean lIIIIllllIllIIlI(final int llllllllllllIlllIlllIIIllIlIllIl, final int llllllllllllIlllIlllIIIllIlIllII) {
        return llllllllllllIlllIlllIIIllIlIllIl <= llllllllllllIlllIlllIIIllIlIllII;
    }
    
    private static boolean lIIIIllllIlIlllI(final int llllllllllllIlllIlllIIIllIlIlIlI) {
        return llllllllllllIlllIlllIIIllIlIlIlI != 0;
    }
    
    private static boolean lIIIIllllIllIIII(final int llllllllllllIlllIlllIIIllIlIIlIl, final int llllllllllllIlllIlllIIIllIlIIlII) {
        return llllllllllllIlllIlllIIIllIlIIlIl != llllllllllllIlllIlllIIIllIlIIlII;
    }
    
    private static boolean lIIIIllllIllIIll(final int llllllllllllIlllIlllIIIllIllIIIl, final int llllllllllllIlllIlllIIIllIllIIII) {
        return llllllllllllIlllIlllIIIllIllIIIl < llllllllllllIlllIlllIIIllIllIIII;
    }
    
    @Override
    protected void encodeInitialLine(final ByteBuf llllllllllllIlllIlllIIIllllIIIII, final HttpRequest llllllllllllIlllIlllIIIlllIlllll) throws Exception {
        llllllllllllIlllIlllIIIlllIlllll.getMethod().encode(llllllllllllIlllIlllIIIllllIIIII);
        llllllllllllIlllIlllIIIllllIIIII.writeByte(HttpRequestEncoder.llIIIIlIIlIIII[2]);
        "".length();
        String llllllllllllIlllIlllIIIllllIIIIl = llllllllllllIlllIlllIIIlllIlllll.getUri();
        if (lIIIIllllIlIllll(llllllllllllIlllIlllIIIllllIIIIl.length())) {
            llllllllllllIlllIlllIIIllllIIIIl = String.valueOf(new StringBuilder().append(llllllllllllIlllIlllIIIllllIIIIl).append((char)HttpRequestEncoder.llIIIIlIIlIIII[3]));
            "".length();
            if (" ".length() <= 0) {
                return;
            }
        }
        else {
            final int llllllllllllIlllIlllIIIllllIIlIl = llllllllllllIlllIlllIIIllllIIIIl.indexOf(HttpRequestEncoder.llIIIIlIIIllll[HttpRequestEncoder.llIIIIlIIlIIII[1]]);
            if (lIIIIllllIllIIII(llllllllllllIlllIlllIIIllllIIlIl, HttpRequestEncoder.llIIIIlIIlIIII[4]) && lIIIIllllIllIIII(llllllllllllIlllIlllIIIllllIIIIl.charAt(HttpRequestEncoder.llIIIIlIIlIIII[1]), HttpRequestEncoder.llIIIIlIIlIIII[3])) {
                final int llllllllllllIlllIlllIIIllllIIlll = llllllllllllIlllIlllIIIllllIIlIl + HttpRequestEncoder.llIIIIlIIlIIII[5];
                final int llllllllllllIlllIlllIIIllllIIllI = llllllllllllIlllIlllIIIllllIIIIl.indexOf(HttpRequestEncoder.llIIIIlIIlIIII[6], llllllllllllIlllIlllIIIllllIIlll);
                if (lIIIIllllIllIIIl(llllllllllllIlllIlllIIIllllIIllI, HttpRequestEncoder.llIIIIlIIlIIII[4])) {
                    if (lIIIIllllIllIIlI(llllllllllllIlllIlllIIIllllIIIIl.lastIndexOf(HttpRequestEncoder.llIIIIlIIlIIII[3]), llllllllllllIlllIlllIIIllllIIlll)) {
                        llllllllllllIlllIlllIIIllllIIIIl = String.valueOf(new StringBuilder().append(llllllllllllIlllIlllIIIllllIIIIl).append((char)HttpRequestEncoder.llIIIIlIIlIIII[3]));
                        "".length();
                        if (-"  ".length() >= 0) {
                            return;
                        }
                    }
                }
                else if (lIIIIllllIllIIlI(llllllllllllIlllIlllIIIllllIIIIl.lastIndexOf(HttpRequestEncoder.llIIIIlIIlIIII[3], llllllllllllIlllIlllIIIllllIIllI), llllllllllllIlllIlllIIIllllIIlll)) {
                    final int llllllllllllIlllIlllIIIllllIlIIl = llllllllllllIlllIlllIIIllllIIIIl.length();
                    final StringBuilder llllllllllllIlllIlllIIIllllIlIII = new StringBuilder(llllllllllllIlllIlllIIIllllIlIIl + HttpRequestEncoder.llIIIIlIIlIIII[0]);
                    llllllllllllIlllIlllIIIllllIlIII.append(llllllllllllIlllIlllIIIllllIIIIl, HttpRequestEncoder.llIIIIlIIlIIII[1], llllllllllllIlllIlllIIIllllIIllI);
                    "".length();
                    llllllllllllIlllIlllIIIllllIlIII.append((char)HttpRequestEncoder.llIIIIlIIlIIII[3]);
                    "".length();
                    llllllllllllIlllIlllIIIllllIlIII.append(llllllllllllIlllIlllIIIllllIIIIl, llllllllllllIlllIlllIIIllllIIllI, llllllllllllIlllIlllIIIllllIlIIl);
                    "".length();
                    llllllllllllIlllIlllIIIllllIIIIl = String.valueOf(llllllllllllIlllIlllIIIllllIlIII);
                }
            }
        }
        llllllllllllIlllIlllIIIllllIIIII.writeBytes(llllllllllllIlllIlllIIIllllIIIIl.getBytes(CharsetUtil.UTF_8));
        "".length();
        llllllllllllIlllIlllIIIllllIIIII.writeByte(HttpRequestEncoder.llIIIIlIIlIIII[2]);
        "".length();
        llllllllllllIlllIlllIIIlllIlllll.getProtocolVersion().encode(llllllllllllIlllIlllIIIllllIIIII);
        llllllllllllIlllIlllIIIllllIIIII.writeBytes(HttpRequestEncoder.CRLF);
        "".length();
    }
    
    static {
        lIIIIllllIlIllIl();
        lIIIIllllIlIllII();
        QUESTION_MARK = (char)HttpRequestEncoder.llIIIIlIIlIIII[6];
        SLASH = (char)HttpRequestEncoder.llIIIIlIIlIIII[3];
        final byte[] crlf = new byte[HttpRequestEncoder.llIIIIlIIlIIII[7]];
        crlf[HttpRequestEncoder.llIIIIlIIlIIII[1]] = (byte)HttpRequestEncoder.llIIIIlIIlIIII[8];
        crlf[HttpRequestEncoder.llIIIIlIIlIIII[0]] = (byte)HttpRequestEncoder.llIIIIlIIlIIII[9];
        CRLF = crlf;
    }
    
    private static void lIIIIllllIlIllII() {
        (llIIIIlIIIllll = new String[HttpRequestEncoder.llIIIIlIIlIIII[0]])[HttpRequestEncoder.llIIIIlIIlIIII[1]] = lIIIIllllIlIlIll("c0tY", "Idwgw");
    }
}
