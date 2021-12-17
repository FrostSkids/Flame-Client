// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import io.netty.handler.codec.http.HttpObjectEncoder;
import io.netty.util.CharsetUtil;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.FullHttpRequest;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpRequest;

public class RtspRequestEncoder extends RtspObjectEncoder<HttpRequest>
{
    private static final /* synthetic */ int[] lIllIIlllIIIll;
    private static final /* synthetic */ byte[] CRLF;
    
    @Override
    public boolean acceptOutboundMessage(final Object lllllllllllllIIIIIIlIIllIlllllII) throws Exception {
        return lllllllllllllIIIIIIlIIllIlllllII instanceof FullHttpRequest;
    }
    
    @Override
    protected void encodeInitialLine(final ByteBuf lllllllllllllIIIIIIlIIllIlllIllI, final HttpRequest lllllllllllllIIIIIIlIIllIlllIlll) throws Exception {
        HttpHeaders.encodeAscii(lllllllllllllIIIIIIlIIllIlllIlll.getMethod().toString(), lllllllllllllIIIIIIlIIllIlllIllI);
        "".length();
        lllllllllllllIIIIIIlIIllIlllIllI.writeByte(RtspRequestEncoder.lIllIIlllIIIll[0]);
        "".length();
        lllllllllllllIIIIIIlIIllIlllIllI.writeBytes(lllllllllllllIIIIIIlIIllIlllIlll.getUri().getBytes(CharsetUtil.UTF_8));
        "".length();
        lllllllllllllIIIIIIlIIllIlllIllI.writeByte(RtspRequestEncoder.lIllIIlllIIIll[0]);
        "".length();
        HttpObjectEncoder.encodeAscii(lllllllllllllIIIIIIlIIllIlllIlll.getProtocolVersion().toString(), lllllllllllllIIIIIIlIIllIlllIllI);
        lllllllllllllIIIIIIlIIllIlllIllI.writeBytes(RtspRequestEncoder.CRLF);
        "".length();
    }
    
    static {
        lllllIllIIIIIII();
        final byte[] crlf = new byte[RtspRequestEncoder.lIllIIlllIIIll[1]];
        crlf[RtspRequestEncoder.lIllIIlllIIIll[2]] = (byte)RtspRequestEncoder.lIllIIlllIIIll[3];
        crlf[RtspRequestEncoder.lIllIIlllIIIll[4]] = (byte)RtspRequestEncoder.lIllIIlllIIIll[5];
        CRLF = crlf;
    }
    
    private static void lllllIllIIIIIII() {
        (lIllIIlllIIIll = new int[6])[0] = (90 + 39 - 67 + 122 ^ 1 + 36 - 19 + 134);
        RtspRequestEncoder.lIllIIlllIIIll[1] = "  ".length();
        RtspRequestEncoder.lIllIIlllIIIll[2] = ((0x24 ^ 0x4) & ~(0xB9 ^ 0x99));
        RtspRequestEncoder.lIllIIlllIIIll[3] = (0x54 ^ 0x51 ^ (0x6A ^ 0x62));
        RtspRequestEncoder.lIllIIlllIIIll[4] = " ".length();
        RtspRequestEncoder.lIllIIlllIIIll[5] = (0x4C ^ 0x46);
    }
}
