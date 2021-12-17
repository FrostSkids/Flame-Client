// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.ByteBuf;

public class HttpResponseEncoder extends HttpObjectEncoder<HttpResponse>
{
    private static final /* synthetic */ byte[] CRLF;
    private static final /* synthetic */ int[] lIIIIIIIlIIIII;
    
    private static boolean lIllIIlIlllllII(final int lllllllllllllIlIlIIlIIIllIlIllll) {
        return lllllllllllllIlIlIIlIIIllIlIllll == 0;
    }
    
    @Override
    public boolean acceptOutboundMessage(final Object lllllllllllllIlIlIIlIIIlllIIIIll) throws Exception {
        int n;
        if (lIllIIlIllllIll(super.acceptOutboundMessage(lllllllllllllIlIlIIlIIIlllIIIIll) ? 1 : 0) && lIllIIlIlllllII((lllllllllllllIlIlIIlIIIlllIIIIll instanceof HttpRequest) ? 1 : 0)) {
            n = HttpResponseEncoder.lIIIIIIIlIIIII[0];
            "".length();
            if ((0x55 ^ 0x10 ^ (0xF7 ^ 0xB6)) == -" ".length()) {
                return ((0x2F ^ 0x56 ^ (0x3A ^ 0x18)) & (163 + 78 - 75 + 78 ^ 51 + 89 + 1 + 34 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = HttpResponseEncoder.lIIIIIIIlIIIII[1];
        }
        return n != 0;
    }
    
    private static void lIllIIlIllllIlI() {
        (lIIIIIIIlIIIII = new int[6])[0] = " ".length();
        HttpResponseEncoder.lIIIIIIIlIIIII[1] = ((0xE0 ^ 0xC1 ^ (0x4E ^ 0xC)) & (98 + 43 - 84 + 140 ^ 56 + 76 - 4 + 38 ^ -" ".length()));
        HttpResponseEncoder.lIIIIIIIlIIIII[2] = (0x6E ^ 0x4E);
        HttpResponseEncoder.lIIIIIIIlIIIII[3] = "  ".length();
        HttpResponseEncoder.lIIIIIIIlIIIII[4] = (0x3C ^ 0x31);
        HttpResponseEncoder.lIIIIIIIlIIIII[5] = (180 + 69 - 187 + 138 ^ 111 + 51 - 42 + 74);
    }
    
    @Override
    protected void encodeInitialLine(final ByteBuf lllllllllllllIlIlIIlIIIllIllllIl, final HttpResponse lllllllllllllIlIlIIlIIIllIllllII) throws Exception {
        lllllllllllllIlIlIIlIIIllIllllII.getProtocolVersion().encode(lllllllllllllIlIlIIlIIIllIllllIl);
        lllllllllllllIlIlIIlIIIllIllllIl.writeByte(HttpResponseEncoder.lIIIIIIIlIIIII[2]);
        "".length();
        lllllllllllllIlIlIIlIIIllIllllII.getStatus().encode(lllllllllllllIlIlIIlIIIllIllllIl);
        lllllllllllllIlIlIIlIIIllIllllIl.writeBytes(HttpResponseEncoder.CRLF);
        "".length();
    }
    
    static {
        lIllIIlIllllIlI();
        final byte[] crlf = new byte[HttpResponseEncoder.lIIIIIIIlIIIII[3]];
        crlf[HttpResponseEncoder.lIIIIIIIlIIIII[1]] = (byte)HttpResponseEncoder.lIIIIIIIlIIIII[4];
        crlf[HttpResponseEncoder.lIIIIIIIlIIIII[0]] = (byte)HttpResponseEncoder.lIIIIIIIlIIIII[5];
        CRLF = crlf;
    }
    
    private static boolean lIllIIlIllllIll(final int lllllllllllllIlIlIIlIIIllIllIIIl) {
        return lllllllllllllIlIlIIlIIIllIllIIIl != 0;
    }
}
