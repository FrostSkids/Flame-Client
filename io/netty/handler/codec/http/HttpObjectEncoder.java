// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;
import io.netty.channel.FileRegion;
import io.netty.buffer.Unpooled;
import io.netty.util.CharsetUtil;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.buffer.ByteBuf;
import io.netty.handler.codec.MessageToMessageEncoder;

public abstract class HttpObjectEncoder<H extends HttpMessage> extends MessageToMessageEncoder<Object>
{
    private static final /* synthetic */ String[] llllIllIlllII;
    private static final /* synthetic */ byte[] ZERO_CRLF;
    private static final /* synthetic */ byte[] ZERO_CRLF_CRLF;
    private static final /* synthetic */ ByteBuf ZERO_CRLF_CRLF_BUF;
    private /* synthetic */ int state;
    private static final /* synthetic */ ByteBuf CRLF_BUF;
    private static final /* synthetic */ int[] llllIlllllIIl;
    private static final /* synthetic */ byte[] CRLF;
    
    private void encodeChunkedContent(final ChannelHandlerContext lllllllllllllIlIllIIIllIIIlIIlII, final Object lllllllllllllIlIllIIIllIIIlIIIll, final long lllllllllllllIlIllIIIllIIIlIIIlI, final List<Object> lllllllllllllIlIllIIIllIIIlIIllI) {
        if (lIlIllIIlIIlIII(lIlIllIIlIIlIll(lllllllllllllIlIllIIIllIIIlIIIlI, 0L))) {
            final byte[] lllllllllllllIlIllIIIllIIIlIlllI = Long.toHexString(lllllllllllllIlIllIIIllIIIlIIIlI).getBytes(CharsetUtil.US_ASCII);
            final ByteBuf lllllllllllllIlIllIIIllIIIlIllIl = lllllllllllllIlIllIIIllIIIlIIlII.alloc().buffer(lllllllllllllIlIllIIIllIIIlIlllI.length + HttpObjectEncoder.llllIlllllIIl[1]);
            lllllllllllllIlIllIIIllIIIlIllIl.writeBytes(lllllllllllllIlIllIIIllIIIlIlllI);
            "".length();
            lllllllllllllIlIllIIIllIIIlIllIl.writeBytes(HttpObjectEncoder.CRLF);
            "".length();
            lllllllllllllIlIllIIIllIIIlIIllI.add(lllllllllllllIlIllIIIllIIIlIllIl);
            "".length();
            lllllllllllllIlIllIIIllIIIlIIllI.add(encodeAndRetain(lllllllllllllIlIllIIIllIIIlIIIll));
            "".length();
            lllllllllllllIlIllIIIllIIIlIIllI.add(HttpObjectEncoder.CRLF_BUF.duplicate());
            "".length();
        }
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIlIIIll instanceof LastHttpContent) ? 1 : 0)) {
            final HttpHeaders lllllllllllllIlIllIIIllIIIlIlIll = ((LastHttpContent)lllllllllllllIlIllIIIllIIIlIIIll).trailingHeaders();
            if (lIlIllIIlIIIlIl(lllllllllllllIlIllIIIllIIIlIlIll.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIllIIIllIIIlIIllI.add(HttpObjectEncoder.ZERO_CRLF_CRLF_BUF.duplicate());
                "".length();
                "".length();
                if (((106 + 94 - 95 + 37 ^ 19 + 44 + 31 + 65) & (0x57 ^ 0x13 ^ (0x7C ^ 0x29) ^ -" ".length())) > 0) {
                    return;
                }
            }
            else {
                final ByteBuf lllllllllllllIlIllIIIllIIIlIllII = lllllllllllllIlIllIIIllIIIlIIlII.alloc().buffer();
                lllllllllllllIlIllIIIllIIIlIllII.writeBytes(HttpObjectEncoder.ZERO_CRLF);
                "".length();
                HttpHeaders.encode(lllllllllllllIlIllIIIllIIIlIlIll, lllllllllllllIlIllIIIllIIIlIllII);
                lllllllllllllIlIllIIIllIIIlIllII.writeBytes(HttpObjectEncoder.CRLF);
                "".length();
                lllllllllllllIlIllIIIllIIIlIIllI.add(lllllllllllllIlIllIIIllIIIlIllII);
                "".length();
            }
            this.state = HttpObjectEncoder.llllIlllllIIl[0];
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        else if (lIlIllIIlIIIllI(lIlIllIIlIIlIll(lllllllllllllIlIllIIIllIIIlIIIlI, 0L))) {
            lllllllllllllIlIllIIIllIIIlIIllI.add(Unpooled.EMPTY_BUFFER);
            "".length();
        }
    }
    
    private static boolean lIlIllIIlIIlIII(final int lllllllllllllIlIllIIIlIlllIIlIll) {
        return lllllllllllllIlIllIIIlIlllIIlIll > 0;
    }
    
    private static void lIlIlIlllIIlIII() {
        (llllIllIlllII = new String[HttpObjectEncoder.llllIlllllIIl[8]])[HttpObjectEncoder.llllIlllllIIl[0]] = lIlIlIlllIIIIll("BRgQFjEVFQELJVAbEB0yEREQTjUJBhBUYQ==", "pvunA");
        HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[2]] = lIlIlIlllIIIlII("kB3MGQSjAEHEWRbYYNdQ0eoVAmZDMtCIxc4i6UEd6gs=", "JhWDz");
        HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[1]] = lIlIlIlllIIIlIl("S/0qrOWkhoouE4bYJhDbS/DxZ7PAR3VnVsVjbp84HWE=", "ztYDp");
        HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[3]] = lIlIlIlllIIIlIl("ag2T3hcSS6UpwD5sxsHqUF4GbXueUf/yHqxAxwUdv0A=", "MIEtg");
    }
    
    private static Object encodeAndRetain(final Object lllllllllllllIlIllIIIllIIIIllIII) {
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIllIII instanceof ByteBuf) ? 1 : 0)) {
            return ((ByteBuf)lllllllllllllIlIllIIIllIIIIllIII).retain();
        }
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIllIII instanceof HttpContent) ? 1 : 0)) {
            return ((HttpContent)lllllllllllllIlIllIIIllIIIIllIII).content().retain();
        }
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIllIII instanceof FileRegion) ? 1 : 0)) {
            return ((FileRegion)lllllllllllllIlIllIIIllIIIIllIII).retain();
        }
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[1]]).append(StringUtil.simpleClassName(lllllllllllllIlIllIIIllIIIIllIII))));
    }
    
    private static int lIlIllIIlIIIlII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    protected abstract void encodeInitialLine(final ByteBuf p0, final H p1) throws Exception;
    
    private static long contentLength(final Object lllllllllllllIlIllIIIllIIIIlIllI) {
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIlIllI instanceof HttpContent) ? 1 : 0)) {
            return ((HttpContent)lllllllllllllIlIllIIIllIIIIlIllI).content().readableBytes();
        }
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIlIllI instanceof ByteBuf) ? 1 : 0)) {
            return ((ByteBuf)lllllllllllllIlIllIIIllIIIIlIllI).readableBytes();
        }
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIlIllI instanceof FileRegion) ? 1 : 0)) {
            return ((FileRegion)lllllllllllllIlIllIIIllIIIIlIllI).count();
        }
        throw new IllegalStateException(String.valueOf(new StringBuilder().append(HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[3]]).append(StringUtil.simpleClassName(lllllllllllllIlIllIIIllIIIIlIllI))));
    }
    
    private static int lIlIllIIlIIlIll(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    private static boolean lIlIllIIlIIllII(final int lllllllllllllIlIllIIIlIlllIlIllI, final int lllllllllllllIlIllIIIlIlllIlIlIl) {
        return lllllllllllllIlIllIIIlIlllIlIllI < lllllllllllllIlIllIIIlIlllIlIlIl;
    }
    
    static {
        lIlIllIIlIIIIll();
        lIlIlIlllIIlIII();
        ST_CONTENT_NON_CHUNK = HttpObjectEncoder.llllIlllllIIl[2];
        ST_INIT = HttpObjectEncoder.llllIlllllIIl[0];
        ST_CONTENT_CHUNK = HttpObjectEncoder.llllIlllllIIl[1];
        final byte[] crlf = new byte[HttpObjectEncoder.llllIlllllIIl[1]];
        crlf[HttpObjectEncoder.llllIlllllIIl[0]] = (byte)HttpObjectEncoder.llllIlllllIIl[4];
        crlf[HttpObjectEncoder.llllIlllllIIl[2]] = (byte)HttpObjectEncoder.llllIlllllIIl[5];
        CRLF = crlf;
        final byte[] zero_CRLF = new byte[HttpObjectEncoder.llllIlllllIIl[3]];
        zero_CRLF[HttpObjectEncoder.llllIlllllIIl[0]] = (byte)HttpObjectEncoder.llllIlllllIIl[6];
        zero_CRLF[HttpObjectEncoder.llllIlllllIIl[2]] = (byte)HttpObjectEncoder.llllIlllllIIl[4];
        zero_CRLF[HttpObjectEncoder.llllIlllllIIl[1]] = (byte)HttpObjectEncoder.llllIlllllIIl[5];
        ZERO_CRLF = zero_CRLF;
        final byte[] zero_CRLF_CRLF = new byte[HttpObjectEncoder.llllIlllllIIl[7]];
        zero_CRLF_CRLF[HttpObjectEncoder.llllIlllllIIl[0]] = (byte)HttpObjectEncoder.llllIlllllIIl[6];
        zero_CRLF_CRLF[HttpObjectEncoder.llllIlllllIIl[2]] = (byte)HttpObjectEncoder.llllIlllllIIl[4];
        zero_CRLF_CRLF[HttpObjectEncoder.llllIlllllIIl[1]] = (byte)HttpObjectEncoder.llllIlllllIIl[5];
        zero_CRLF_CRLF[HttpObjectEncoder.llllIlllllIIl[3]] = (byte)HttpObjectEncoder.llllIlllllIIl[4];
        zero_CRLF_CRLF[HttpObjectEncoder.llllIlllllIIl[8]] = (byte)HttpObjectEncoder.llllIlllllIIl[5];
        ZERO_CRLF_CRLF = zero_CRLF_CRLF;
        CRLF_BUF = Unpooled.unreleasableBuffer(Unpooled.directBuffer(HttpObjectEncoder.CRLF.length).writeBytes(HttpObjectEncoder.CRLF));
        ZERO_CRLF_CRLF_BUF = Unpooled.unreleasableBuffer(Unpooled.directBuffer(HttpObjectEncoder.ZERO_CRLF_CRLF.length).writeBytes(HttpObjectEncoder.ZERO_CRLF_CRLF));
    }
    
    private static boolean lIlIllIIlIIIlll(final int lllllllllllllIlIllIIIlIlllIllIlI, final int lllllllllllllIlIllIIIlIlllIllIIl) {
        return lllllllllllllIlIllIIIlIlllIllIlI == lllllllllllllIlIllIIIlIlllIllIIl;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIlIllIIIllIIIlllIlI, final Object lllllllllllllIlIllIIIllIIIlllllI, final List<Object> lllllllllllllIlIllIIIllIIIlllIII) throws Exception {
        ByteBuf lllllllllllllIlIllIIIllIIIllllII = null;
        if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIlllllI instanceof HttpMessage) ? 1 : 0)) {
            if (lIlIllIIlIIIlIl(this.state)) {
                throw new IllegalStateException(String.valueOf(new StringBuilder().append(HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[0]]).append(StringUtil.simpleClassName(lllllllllllllIlIllIIIllIIIlllllI))));
            }
            final H lllllllllllllIlIllIIIllIIlIIIIlI = (H)lllllllllllllIlIllIIIllIIIlllllI;
            lllllllllllllIlIllIIIllIIIllllII = lllllllllllllIlIllIIIllIIIlllIlI.alloc().buffer();
            this.encodeInitialLine(lllllllllllllIlIllIIIllIIIllllII, lllllllllllllIlIllIIIllIIlIIIIlI);
            HttpHeaders.encode(lllllllllllllIlIllIIIllIIlIIIIlI.headers(), lllllllllllllIlIllIIIllIIIllllII);
            lllllllllllllIlIllIIIllIIIllllII.writeBytes(HttpObjectEncoder.CRLF);
            "".length();
            int state;
            if (lIlIllIIlIIIlIl(HttpHeaders.isTransferEncodingChunked(lllllllllllllIlIllIIIllIIlIIIIlI) ? 1 : 0)) {
                state = HttpObjectEncoder.llllIlllllIIl[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                state = HttpObjectEncoder.llllIlllllIIl[2];
            }
            this.state = state;
        }
        if (!lIlIllIIlIIIllI((lllllllllllllIlIllIIIllIIIlllllI instanceof HttpContent) ? 1 : 0) || !lIlIllIIlIIIllI((lllllllllllllIlIllIIIllIIIlllllI instanceof ByteBuf) ? 1 : 0) || lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIlllllI instanceof FileRegion) ? 1 : 0)) {
            if (lIlIllIIlIIIllI(this.state)) {
                throw new IllegalStateException(String.valueOf(new StringBuilder().append(HttpObjectEncoder.llllIllIlllII[HttpObjectEncoder.llllIlllllIIl[2]]).append(StringUtil.simpleClassName(lllllllllllllIlIllIIIllIIIlllllI))));
            }
            final long lllllllllllllIlIllIIIllIIlIIIIIl = contentLength(lllllllllllllIlIllIIIllIIIlllllI);
            if (lIlIllIIlIIIlll(this.state, HttpObjectEncoder.llllIlllllIIl[2])) {
                if (lIlIllIIlIIlIII(lIlIllIIlIIIlII(lllllllllllllIlIllIIIllIIlIIIIIl, 0L))) {
                    if (lIlIllIIlIIlIIl(lllllllllllllIlIllIIIllIIIllllII) && lIlIllIIlIIlIlI(lIlIllIIlIIIlII(lllllllllllllIlIllIIIllIIIllllII.writableBytes(), lllllllllllllIlIllIIIllIIlIIIIIl)) && lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIlllllI instanceof HttpContent) ? 1 : 0)) {
                        lllllllllllllIlIllIIIllIIIllllII.writeBytes(((HttpContent)lllllllllllllIlIllIIIllIIIlllllI).content());
                        "".length();
                        lllllllllllllIlIllIIIllIIIlllIII.add(lllllllllllllIlIllIIIllIIIllllII);
                        "".length();
                        "".length();
                        if (" ".length() <= -" ".length()) {
                            return;
                        }
                    }
                    else {
                        if (lIlIllIIlIIlIIl(lllllllllllllIlIllIIIllIIIllllII)) {
                            lllllllllllllIlIllIIIllIIIlllIII.add(lllllllllllllIlIllIIIllIIIllllII);
                            "".length();
                        }
                        lllllllllllllIlIllIIIllIIIlllIII.add(encodeAndRetain(lllllllllllllIlIllIIIllIIIlllllI));
                        "".length();
                        "".length();
                        if ("  ".length() < 0) {
                            return;
                        }
                    }
                }
                else if (lIlIllIIlIIlIIl(lllllllllllllIlIllIIIllIIIllllII)) {
                    lllllllllllllIlIllIIIllIIIlllIII.add(lllllllllllllIlIllIIIllIIIllllII);
                    "".length();
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIllIIIllIIIlllIII.add(Unpooled.EMPTY_BUFFER);
                    "".length();
                }
                if (lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIlllllI instanceof LastHttpContent) ? 1 : 0)) {
                    this.state = HttpObjectEncoder.llllIlllllIIl[0];
                    "".length();
                    if ((0x2F ^ 0x2B) <= -" ".length()) {
                        return;
                    }
                }
            }
            else {
                if (!lIlIllIIlIIIlll(this.state, HttpObjectEncoder.llllIlllllIIl[1])) {
                    throw new Error();
                }
                if (lIlIllIIlIIlIIl(lllllllllllllIlIllIIIllIIIllllII)) {
                    lllllllllllllIlIllIIIllIIIlllIII.add(lllllllllllllIlIllIIIllIIIllllII);
                    "".length();
                }
                this.encodeChunkedContent(lllllllllllllIlIllIIIllIIIlllIlI, lllllllllllllIlIllIIIllIIIlllllI, lllllllllllllIlIllIIIllIIlIIIIIl, lllllllllllllIlIllIIIllIIIlllIII);
                "".length();
                if ("   ".length() <= " ".length()) {
                    return;
                }
            }
            "".length();
            if (((0xCA ^ 0xC7) & ~(0x55 ^ 0x58)) != 0x0) {
                return;
            }
        }
        else if (lIlIllIIlIIlIIl(lllllllllllllIlIllIIIllIIIllllII)) {
            lllllllllllllIlIllIIIllIIIlllIII.add(lllllllllllllIlIllIIIllIIIllllII);
            "".length();
        }
    }
    
    private static void lIlIllIIlIIIIll() {
        (llllIlllllIIl = new int[10])[0] = ((0x21 ^ 0x48 ^ (0x78 ^ 0x4C)) & (0x55 ^ 0x10 ^ (0x34 ^ 0x2C) ^ -" ".length()));
        HttpObjectEncoder.llllIlllllIIl[1] = "  ".length();
        HttpObjectEncoder.llllIlllllIIl[2] = " ".length();
        HttpObjectEncoder.llllIlllllIIl[3] = "   ".length();
        HttpObjectEncoder.llllIlllllIIl[4] = (0x72 ^ 0x7F);
        HttpObjectEncoder.llllIlllllIIl[5] = (0xCA ^ 0xC0);
        HttpObjectEncoder.llllIlllllIIl[6] = (0x6E ^ 0x5E);
        HttpObjectEncoder.llllIlllllIIl[7] = (0x8 ^ 0x7B ^ (0xF0 ^ 0x86));
        HttpObjectEncoder.llllIlllllIIl[8] = (0x85 ^ 0x81);
        HttpObjectEncoder.llllIlllllIIl[9] = (42 + 81 - 60 + 113 ^ 120 + 153 - 268 + 179);
    }
    
    private static boolean lIlIllIIlIIIlIl(final int lllllllllllllIlIllIIIlIlllIlIIIl) {
        return lllllllllllllIlIllIIIlIlllIlIIIl != 0;
    }
    
    @Deprecated
    protected static void encodeAscii(final String lllllllllllllIlIllIIIllIIIIlIIII, final ByteBuf lllllllllllllIlIllIIIllIIIIIllll) {
        HttpHeaders.encodeAscii0(lllllllllllllIlIllIIIllIIIIlIIII, lllllllllllllIlIllIIIllIIIIIllll);
    }
    
    @Override
    public boolean acceptOutboundMessage(final Object lllllllllllllIlIllIIIllIIIIlllII) throws Exception {
        int n;
        if (!lIlIllIIlIIIllI((lllllllllllllIlIllIIIllIIIIlllII instanceof HttpObject) ? 1 : 0) || !lIlIllIIlIIIllI((lllllllllllllIlIllIIIllIIIIlllII instanceof ByteBuf) ? 1 : 0) || lIlIllIIlIIIlIl((lllllllllllllIlIllIIIllIIIIlllII instanceof FileRegion) ? 1 : 0)) {
            n = HttpObjectEncoder.llllIlllllIIl[2];
            "".length();
            if (null != null) {
                return ((0xA3 ^ 0xAF ^ "   ".length()) & (0x59 ^ 0x42 ^ (0x6C ^ 0x78) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = HttpObjectEncoder.llllIlllllIIl[0];
        }
        return n != 0;
    }
    
    private static boolean lIlIllIIlIIIllI(final int lllllllllllllIlIllIIIlIlllIIllll) {
        return lllllllllllllIlIllIIIlIlllIIllll == 0;
    }
    
    private static String lIlIlIlllIIIlII(final String lllllllllllllIlIllIIIlIllllIIIlI, final String lllllllllllllIlIllIIIlIlllIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIlIllllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIlIlllIlllll.getBytes(StandardCharsets.UTF_8)), HttpObjectEncoder.llllIlllllIIl[9]), "DES");
            final Cipher lllllllllllllIlIllIIIlIllllIIlII = Cipher.getInstance("DES");
            lllllllllllllIlIllIIIlIllllIIlII.init(HttpObjectEncoder.llllIlllllIIl[1], lllllllllllllIlIllIIIlIllllIIlIl);
            return new String(lllllllllllllIlIllIIIlIllllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIlIllllIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIlIllllIIIll) {
            lllllllllllllIlIllIIIlIllllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIllIIlIIlIlI(final int lllllllllllllIlIllIIIlIlllIIllIl) {
        return lllllllllllllIlIllIIIlIlllIIllIl >= 0;
    }
    
    private static String lIlIlIlllIIIlIl(final String lllllllllllllIlIllIIIlIllllIllll, final String lllllllllllllIlIllIIIlIllllIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIIlIlllllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIIlIllllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIIlIlllllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIIlIlllllIIIl.init(HttpObjectEncoder.llllIlllllIIl[1], lllllllllllllIlIllIIIlIlllllIIlI);
            return new String(lllllllllllllIlIllIIIlIlllllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIIlIllllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIIlIlllllIIII) {
            lllllllllllllIlIllIIIlIlllllIIII.printStackTrace();
            return null;
        }
    }
    
    public HttpObjectEncoder() {
        this.state = HttpObjectEncoder.llllIlllllIIl[0];
    }
    
    private static String lIlIlIlllIIIIll(String lllllllllllllIlIllIIIlIlllllllll, final String lllllllllllllIlIllIIIllIIIIIIIll) {
        lllllllllllllIlIllIIIlIlllllllll = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIllIIIlIlllllllll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIIllIIIIIIIlI = new StringBuilder();
        final char[] lllllllllllllIlIllIIIllIIIIIIIIl = lllllllllllllIlIllIIIllIIIIIIIll.toCharArray();
        int lllllllllllllIlIllIIIllIIIIIIIII = HttpObjectEncoder.llllIlllllIIl[0];
        final int lllllllllllllIlIllIIIlIllllllIlI = (Object)((String)lllllllllllllIlIllIIIlIlllllllll).toCharArray();
        final double lllllllllllllIlIllIIIlIllllllIIl = lllllllllllllIlIllIIIlIllllllIlI.length;
        boolean lllllllllllllIlIllIIIlIllllllIII = HttpObjectEncoder.llllIlllllIIl[0] != 0;
        while (lIlIllIIlIIllII(lllllllllllllIlIllIIIlIllllllIII ? 1 : 0, (int)lllllllllllllIlIllIIIlIllllllIIl)) {
            final char lllllllllllllIlIllIIIllIIIIIIlIl = lllllllllllllIlIllIIIlIllllllIlI[lllllllllllllIlIllIIIlIllllllIII];
            lllllllllllllIlIllIIIllIIIIIIIlI.append((char)(lllllllllllllIlIllIIIllIIIIIIlIl ^ lllllllllllllIlIllIIIllIIIIIIIIl[lllllllllllllIlIllIIIllIIIIIIIII % lllllllllllllIlIllIIIllIIIIIIIIl.length]));
            "".length();
            ++lllllllllllllIlIllIIIllIIIIIIIII;
            ++lllllllllllllIlIllIIIlIllllllIII;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIIllIIIIIIIlI);
    }
    
    private static boolean lIlIllIIlIIlIIl(final Object lllllllllllllIlIllIIIlIlllIlIIll) {
        return lllllllllllllIlIllIIIlIlllIlIIll != null;
    }
}
