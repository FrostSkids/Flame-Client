// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.rtsp;

import io.netty.handler.codec.http.HttpObjectEncoder;
import io.netty.util.CharsetUtil;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.FullHttpResponse;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.http.HttpResponse;

public class RtspResponseEncoder extends RtspObjectEncoder<HttpResponse>
{
    private static final /* synthetic */ byte[] CRLF;
    private static final /* synthetic */ int[] lIlIllIlIIIlll;
    
    static {
        llllIIIllIIIllI();
        final byte[] crlf = new byte[RtspResponseEncoder.lIlIllIlIIIlll[1]];
        crlf[RtspResponseEncoder.lIlIllIlIIIlll[2]] = (byte)RtspResponseEncoder.lIlIllIlIIIlll[3];
        crlf[RtspResponseEncoder.lIlIllIlIIIlll[4]] = (byte)RtspResponseEncoder.lIlIllIlIIIlll[5];
        CRLF = crlf;
    }
    
    private static void llllIIIllIIIllI() {
        (lIlIllIlIIIlll = new int[6])[0] = (0x99 ^ 0x91 ^ (0xA2 ^ 0x8A));
        RtspResponseEncoder.lIlIllIlIIIlll[1] = "  ".length();
        RtspResponseEncoder.lIlIllIlIIIlll[2] = ((0xCD ^ 0x8A) & ~(0xFA ^ 0xBD));
        RtspResponseEncoder.lIlIllIlIIIlll[3] = (124 + 102 - 199 + 139 ^ 131 + 62 - 35 + 13);
        RtspResponseEncoder.lIlIllIlIIIlll[4] = " ".length();
        RtspResponseEncoder.lIlIllIlIIIlll[5] = (110 + 107 - 121 + 33 ^ 56 + 78 - 124 + 129);
    }
    
    @Override
    public boolean acceptOutboundMessage(final Object lllllllllllllIIIIllIllIIllIIIlIl) throws Exception {
        return lllllllllllllIIIIllIllIIllIIIlIl instanceof FullHttpResponse;
    }
    
    @Override
    protected void encodeInitialLine(final ByteBuf lllllllllllllIIIIllIllIIlIlllllI, final HttpResponse lllllllllllllIIIIllIllIIlIllllIl) throws Exception {
        HttpHeaders.encodeAscii(lllllllllllllIIIIllIllIIlIllllIl.getProtocolVersion().toString(), lllllllllllllIIIIllIllIIlIlllllI);
        "".length();
        lllllllllllllIIIIllIllIIlIlllllI.writeByte(RtspResponseEncoder.lIlIllIlIIIlll[0]);
        "".length();
        lllllllllllllIIIIllIllIIlIlllllI.writeBytes(String.valueOf(lllllllllllllIIIIllIllIIlIllllIl.getStatus().code()).getBytes(CharsetUtil.US_ASCII));
        "".length();
        lllllllllllllIIIIllIllIIlIlllllI.writeByte(RtspResponseEncoder.lIlIllIlIIIlll[0]);
        "".length();
        HttpObjectEncoder.encodeAscii(String.valueOf(lllllllllllllIIIIllIllIIlIllllIl.getStatus().reasonPhrase()), lllllllllllllIIIIllIllIIlIlllllI);
        lllllllllllllIIIIllIllIIlIlllllI.writeBytes(RtspResponseEncoder.CRLF);
        "".length();
    }
}
