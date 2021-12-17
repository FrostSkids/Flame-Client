// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.handler.codec.UnsupportedMessageTypeException;
import io.netty.handler.codec.http.LastHttpContent;
import io.netty.handler.codec.http.HttpContent;
import java.util.Iterator;
import java.util.Map;
import io.netty.handler.codec.http.HttpHeaders;
import io.netty.handler.codec.http.HttpResponse;
import io.netty.handler.codec.http.HttpRequest;
import io.netty.handler.codec.http.FullHttpRequest;
import java.util.Arrays;
import io.netty.handler.codec.http.FullHttpMessage;
import io.netty.handler.codec.http.HttpMessage;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.http.HttpObject;
import io.netty.handler.codec.MessageToMessageEncoder;

public class SpdyHttpEncoder extends MessageToMessageEncoder<HttpObject>
{
    private static final /* synthetic */ int[] lIlllIlIIIIlIl;
    private static final /* synthetic */ String[] lIlllIlIIIIIlI;
    private final /* synthetic */ int spdyVersion;
    private /* synthetic */ int currentStreamId;
    
    private static void lIIIIIlIIllllIlI() {
        (lIlllIlIIIIlIl = new int[13])[0] = ((116 + 160 - 267 + 205 ^ 158 + 132 - 269 + 171) & (0xDB ^ 0x99 ^ (0xFD ^ 0xA9) ^ -" ".length()));
        SpdyHttpEncoder.lIlllIlIIIIlIl[1] = " ".length();
        SpdyHttpEncoder.lIlllIlIIIIlIl[2] = "  ".length();
        SpdyHttpEncoder.lIlllIlIIIIlIl[3] = "   ".length();
        SpdyHttpEncoder.lIlllIlIIIIlIl[4] = (0x97 ^ 0x93);
        SpdyHttpEncoder.lIlllIlIIIIlIl[5] = (0x75 ^ 0x70);
        SpdyHttpEncoder.lIlllIlIIIIlIl[6] = (0xC9 ^ 0xA0 ^ (0x57 ^ 0x38));
        SpdyHttpEncoder.lIlllIlIIIIlIl[7] = (0xC1 ^ 0x94 ^ (0x38 ^ 0x6A));
        SpdyHttpEncoder.lIlllIlIIIIlIl[8] = (60 + 132 - 174 + 131 ^ 31 + 117 - 10 + 19);
        SpdyHttpEncoder.lIlllIlIIIIlIl[9] = (130 + 133 - 100 + 13 ^ 7 + 152 - 4 + 30);
        SpdyHttpEncoder.lIlllIlIIIIlIl[10] = (0x49 ^ 0x65 ^ (0xE5 ^ 0xC3));
        SpdyHttpEncoder.lIlllIlIIIIlIl[11] = (0x31 ^ 0x3A);
        SpdyHttpEncoder.lIlllIlIIIIlIl[12] = (0x6E ^ 0x1D ^ 32 + 78 - 54 + 71);
    }
    
    private static boolean lIIIIIlIIllllIll(final Object llllllllllllIlllllIIIlIlIIIlIIIl) {
        return llllllllllllIlllllIIIlIlIIIlIIIl == null;
    }
    
    static {
        lIIIIIlIIllllIlI();
        lIIIIIlIIlllIlIl();
    }
    
    public SpdyHttpEncoder(final SpdyVersion llllllllllllIlllllIIIlIllIlllllI) {
        if (lIIIIIlIIllllIll(llllllllllllIlllllIIIlIllIlllllI)) {
            throw new NullPointerException(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[0]]);
        }
        this.spdyVersion = llllllllllllIlllllIIIlIllIlllllI.getVersion();
    }
    
    private static String lIIIIIlIIlllIIIl(final String llllllllllllIlllllIIIlIlIlIIIlIl, final String llllllllllllIlllllIIIlIlIlIIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIlIlIlIIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlIlIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllllIIIlIlIlIIIlll = Cipher.getInstance("Blowfish");
            llllllllllllIlllllIIIlIlIlIIIlll.init(SpdyHttpEncoder.lIlllIlIIIIlIl[2], llllllllllllIlllllIIIlIlIlIIlIII);
            return new String(llllllllllllIlllllIIIlIlIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlIlIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIlIlIlIIIllI) {
            llllllllllllIlllllIIIlIlIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIlIIlllIlIl() {
        (lIlllIlIIIIIlI = new String[SpdyHttpEncoder.lIlllIlIIIIlIl[12]])[SpdyHttpEncoder.lIlllIlIIIIlIl[0]] = lIIIIIlIIllIlIlI("nDTC9nO1kMI=", "JdKgB");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[1]] = lIIIIIlIIllIlIll("MXowAhUweiIhIgY0CjMlDDNOBj5EBBcgNAg6ThsV", "iWcRQ");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[2]] = lIIIIIlIIllIlIlI("52uA9dm4nNGAI7vhq4aLhQ==", "kOQjk");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[3]] = lIIIIIlIIllIlIll("HQYzPX4XDz87Ng==", "VcVMS");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[4]] = lIIIIIlIIlllIIIl("o+yJ/GnF8hUCFTaInpl1Nrd1P5aYrDFP", "XRZhn");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[5]] = lIIIIIlIIllIlIll("DCI7Lzw+NShsCjYzNSUmNjc=", "XPZAO");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[6]] = lIIIIIlIIllIlIll("ETYqHw==", "YYYkv");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[7]] = lIIIIIlIIllIlIlI("YcVz0k29fJ0=", "LdhdA");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[8]] = lIIIIIlIIllIlIll("Gwc4Dwk7HD8OAg==", "XhVal");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[9]] = lIIIIIlIIllIlIlI("M6ol7qWEI63Rw/mIqHCh3g==", "YcGSR");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[10]] = lIIIIIlIIllIlIlI("b+XNqUHnhJrA8CaV8Z6Es0e5U7HleUZk", "EwpaC");
        SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[11]] = lIIIIIlIIlllIIIl("NeVhQMi0zglod7FpYvAKcomoQEXtVz1H", "UKcwj");
    }
    
    private static boolean lIIIIIlIIllllllI(final int llllllllllllIlllllIIIlIlIIIllIII, final int llllllllllllIlllllIIIlIlIIIlIlll) {
        return llllllllllllIlllllIIIlIlIIIllIII >= llllllllllllIlllllIIIlIlIIIlIlll;
    }
    
    private static boolean isLast(final HttpMessage llllllllllllIlllllIIIlIlIlIllIll) {
        if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIlIlIllIll instanceof FullHttpMessage) ? 1 : 0)) {
            final FullHttpMessage llllllllllllIlllllIIIlIlIlIlllII = (FullHttpMessage)llllllllllllIlllllIIIlIlIlIllIll;
            if (lIIIIIlIIlllllII(llllllllllllIlllllIIIlIlIlIlllII.trailingHeaders().isEmpty() ? 1 : 0) && lIIIIIlIIlllllIl(llllllllllllIlllllIIIlIlIlIlllII.content().isReadable() ? 1 : 0)) {
                return SpdyHttpEncoder.lIlllIlIIIIlIl[1] != 0;
            }
        }
        return SpdyHttpEncoder.lIlllIlIIIIlIl[0] != 0;
    }
    
    private static String lIIIIIlIIllIlIlI(final String llllllllllllIlllllIIIlIlIIIllllI, final String llllllllllllIlllllIIIlIlIIIlllIl) {
        try {
            final SecretKeySpec llllllllllllIlllllIIIlIlIIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllllIIIlIlIIIlllIl.getBytes(StandardCharsets.UTF_8)), SpdyHttpEncoder.lIlllIlIIIIlIl[8]), "DES");
            final Cipher llllllllllllIlllllIIIlIlIIlIIIlI = Cipher.getInstance("DES");
            llllllllllllIlllllIIIlIlIIlIIIlI.init(SpdyHttpEncoder.lIlllIlIIIIlIl[2], llllllllllllIlllllIIIlIlIIlIIIll);
            return new String(llllllllllllIlllllIIIlIlIIlIIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllllIIIlIlIIIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllllIIIlIlIIlIIIIl) {
            llllllllllllIlllllIIIlIlIIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    private SpdySynStreamFrame createSynStreamFrame(final HttpMessage llllllllllllIlllllIIIlIllIIIIIIl) throws Exception {
        final int llllllllllllIlllllIIIlIllIIIIIII = SpdyHttpHeaders.getStreamId(llllllllllllIlllllIIIlIllIIIIIIl);
        final int llllllllllllIlllllIIIlIlIlllllll = SpdyHttpHeaders.getAssociatedToStreamId(llllllllllllIlllllIIIlIllIIIIIIl);
        final byte llllllllllllIlllllIIIlIlIllllllI = SpdyHttpHeaders.getPriority(llllllllllllIlllllIIIlIllIIIIIIl);
        final String llllllllllllIlllllIIIlIlIlllllIl = SpdyHttpHeaders.getUrl(llllllllllllIlllllIIIlIllIIIIIIl);
        String llllllllllllIlllllIIIlIlIlllllII = SpdyHttpHeaders.getScheme(llllllllllllIlllllIIIlIllIIIIIIl);
        SpdyHttpHeaders.removeStreamId(llllllllllllIlllllIIIlIllIIIIIIl);
        SpdyHttpHeaders.removeAssociatedToStreamId(llllllllllllIlllllIIIlIllIIIIIIl);
        SpdyHttpHeaders.removePriority(llllllllllllIlllllIIIlIllIIIIIIl);
        SpdyHttpHeaders.removeUrl(llllllllllllIlllllIIIlIllIIIIIIl);
        SpdyHttpHeaders.removeScheme(llllllllllllIlllllIIIlIllIIIIIIl);
        llllllllllllIlllllIIIlIllIIIIIIl.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[2]]);
        "".length();
        llllllllllllIlllllIIIlIllIIIIIIl.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[3]]);
        "".length();
        llllllllllllIlllllIIIlIllIIIIIIl.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[4]]);
        "".length();
        llllllllllllIlllllIIIlIllIIIIIIl.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[5]]);
        "".length();
        final SpdySynStreamFrame llllllllllllIlllllIIIlIlIllllIll = new DefaultSpdySynStreamFrame(llllllllllllIlllllIIIlIllIIIIIII, llllllllllllIlllllIIIlIlIlllllll, llllllllllllIlllllIIIlIlIllllllI);
        if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIllIIIIIIl instanceof FullHttpRequest) ? 1 : 0)) {
            final HttpRequest llllllllllllIlllllIIIlIllIIIIlll = (HttpRequest)llllllllllllIlllllIIIlIllIIIIIIl;
            SpdyHeaders.setMethod(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIllIIIIlll.getMethod());
            SpdyHeaders.setUrl(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIllIIIIlll.getUri());
            SpdyHeaders.setVersion(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIllIIIIIIl.getProtocolVersion());
        }
        if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIllIIIIIIl instanceof HttpResponse) ? 1 : 0)) {
            final HttpResponse llllllllllllIlllllIIIlIllIIIIllI = (HttpResponse)llllllllllllIlllllIIIlIllIIIIIIl;
            SpdyHeaders.setStatus(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIllIIIIllI.getStatus());
            SpdyHeaders.setUrl(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIlIlllllIl);
            SpdyHeaders.setVersion(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIllIIIIIIl.getProtocolVersion());
            llllllllllllIlllllIIIlIlIllllIll.setUnidirectional((boolean)(SpdyHttpEncoder.lIlllIlIIIIlIl[1] != 0));
            "".length();
        }
        if (lIIIIIlIIllllllI(this.spdyVersion, SpdyHttpEncoder.lIlllIlIIIIlIl[3])) {
            final String llllllllllllIlllllIIIlIllIIIIlIl = HttpHeaders.getHost(llllllllllllIlllllIIIlIllIIIIIIl);
            llllllllllllIlllllIIIlIllIIIIIIl.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[6]]);
            "".length();
            SpdyHeaders.setHost(llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIllIIIIlIl);
        }
        if (lIIIIIlIIllllIll(llllllllllllIlllllIIIlIlIlllllII)) {
            llllllllllllIlllllIIIlIlIlllllII = SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[7]];
        }
        SpdyHeaders.setScheme(this.spdyVersion, llllllllllllIlllllIIIlIlIllllIll, llllllllllllIlllllIIIlIlIlllllII);
        final Iterator llllllllllllIlllllIIIlIllIIIIIll = llllllllllllIlllllIIIlIllIIIIIIl.headers().iterator();
        while (lIIIIIlIIlllllII(llllllllllllIlllllIIIlIllIIIIIll.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIlllllIIIlIllIIIIlII = llllllllllllIlllllIIIlIllIIIIIll.next();
            llllllllllllIlllllIIIlIlIllllIll.headers().add(llllllllllllIlllllIIIlIllIIIIlII.getKey(), llllllllllllIlllllIIIlIllIIIIlII.getValue());
            "".length();
            "".length();
            if ((0x2D ^ 0x29) != (0x7B ^ 0x7F)) {
                return null;
            }
        }
        this.currentStreamId = llllllllllllIlllllIIIlIlIllllIll.streamId();
        llllllllllllIlllllIIIlIlIllllIll.setLast(isLast(llllllllllllIlllllIIIlIllIIIIIIl));
        "".length();
        return llllllllllllIlllllIIIlIlIllllIll;
    }
    
    private static boolean lIIIIIlIIlllllII(final int llllllllllllIlllllIIIlIlIIIIllll) {
        return llllllllllllIlllllIIIlIlIIIIllll != 0;
    }
    
    private SpdySynReplyFrame createSynReplyFrame(final HttpResponse llllllllllllIlllllIIIlIlIllIIIll) throws Exception {
        final int llllllllllllIlllllIIIlIlIllIIllI = SpdyHttpHeaders.getStreamId(llllllllllllIlllllIIIlIlIllIIIll);
        SpdyHttpHeaders.removeStreamId(llllllllllllIlllllIIIlIlIllIIIll);
        llllllllllllIlllllIIIlIlIllIIIll.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[8]]);
        "".length();
        llllllllllllIlllllIIIlIlIllIIIll.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[9]]);
        "".length();
        llllllllllllIlllllIIIlIlIllIIIll.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[10]]);
        "".length();
        llllllllllllIlllllIIIlIlIllIIIll.headers().remove(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[11]]);
        "".length();
        final SpdySynReplyFrame llllllllllllIlllllIIIlIlIllIIlIl = new DefaultSpdySynReplyFrame(llllllllllllIlllllIIIlIlIllIIllI);
        SpdyHeaders.setStatus(this.spdyVersion, llllllllllllIlllllIIIlIlIllIIlIl, llllllllllllIlllllIIIlIlIllIIIll.getStatus());
        SpdyHeaders.setVersion(this.spdyVersion, llllllllllllIlllllIIIlIlIllIIlIl, llllllllllllIlllllIIIlIlIllIIIll.getProtocolVersion());
        final Iterator llllllllllllIlllllIIIlIlIllIlIIl = llllllllllllIlllllIIIlIlIllIIIll.headers().iterator();
        while (lIIIIIlIIlllllII(llllllllllllIlllllIIIlIlIllIlIIl.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIlllllIIIlIlIllIlIlI = llllllllllllIlllllIIIlIlIllIlIIl.next();
            llllllllllllIlllllIIIlIlIllIIlIl.headers().add(llllllllllllIlllllIIIlIlIllIlIlI.getKey(), llllllllllllIlllllIIIlIlIllIlIlI.getValue());
            "".length();
            "".length();
            if (((0x3A ^ 0x7B ^ (0x14 ^ 0x62)) & (93 + 105 - 124 + 91 ^ 52 + 33 - 63 + 124 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        this.currentStreamId = llllllllllllIlllllIIIlIlIllIIllI;
        llllllllllllIlllllIIIlIlIllIIlIl.setLast(isLast(llllllllllllIlllllIIIlIlIllIIIll));
        "".length();
        return llllllllllllIlllllIIIlIlIllIIlIl;
    }
    
    private static boolean lIIIIIlIIlllllIl(final int llllllllllllIlllllIIIlIlIIIIllIl) {
        return llllllllllllIlllllIIIlIlIIIIllIl == 0;
    }
    
    private static String lIIIIIlIIllIlIll(String llllllllllllIlllllIIIlIlIIllIIII, final String llllllllllllIlllllIIIlIlIIlIllll) {
        llllllllllllIlllllIIIlIlIIllIIII = new String(Base64.getDecoder().decode(llllllllllllIlllllIIIlIlIIllIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllllIIIlIlIIllIIll = new StringBuilder();
        final char[] llllllllllllIlllllIIIlIlIIllIIlI = llllllllllllIlllllIIIlIlIIlIllll.toCharArray();
        int llllllllllllIlllllIIIlIlIIllIIIl = SpdyHttpEncoder.lIlllIlIIIIlIl[0];
        final char llllllllllllIlllllIIIlIlIIlIlIll = (Object)llllllllllllIlllllIIIlIlIIllIIII.toCharArray();
        final long llllllllllllIlllllIIIlIlIIlIlIlI = llllllllllllIlllllIIIlIlIIlIlIll.length;
        short llllllllllllIlllllIIIlIlIIlIlIIl = (short)SpdyHttpEncoder.lIlllIlIIIIlIl[0];
        while (lIIIIIlIIlllllll(llllllllllllIlllllIIIlIlIIlIlIIl, (int)llllllllllllIlllllIIIlIlIIlIlIlI)) {
            final char llllllllllllIlllllIIIlIlIIllIllI = llllllllllllIlllllIIIlIlIIlIlIll[llllllllllllIlllllIIIlIlIIlIlIIl];
            llllllllllllIlllllIIIlIlIIllIIll.append((char)(llllllllllllIlllllIIIlIlIIllIllI ^ llllllllllllIlllllIIIlIlIIllIIlI[llllllllllllIlllllIIIlIlIIllIIIl % llllllllllllIlllllIIIlIlIIllIIlI.length]));
            "".length();
            ++llllllllllllIlllllIIIlIlIIllIIIl;
            ++llllllllllllIlllllIIIlIlIIlIlIIl;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllllIIIlIlIIllIIll);
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIlllllIIIlIllIlIIIlI, final HttpObject llllllllllllIlllllIIIlIllIlIIIIl, final List<Object> llllllllllllIlllllIIIlIllIlIIIII) throws Exception {
        boolean llllllllllllIlllllIIIlIllIIlllll = SpdyHttpEncoder.lIlllIlIIIIlIl[0] != 0;
        boolean llllllllllllIlllllIIIlIllIIllllI = SpdyHttpEncoder.lIlllIlIIIIlIl[0] != 0;
        if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIllIlIIIIl instanceof HttpRequest) ? 1 : 0)) {
            final HttpRequest llllllllllllIlllllIIIlIllIlIllll = (HttpRequest)llllllllllllIlllllIIIlIllIlIIIIl;
            final SpdySynStreamFrame llllllllllllIlllllIIIlIllIlIlllI = this.createSynStreamFrame(llllllllllllIlllllIIIlIllIlIllll);
            llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIlllI);
            "".length();
            llllllllllllIlllllIIIlIllIIllllI = llllllllllllIlllllIIIlIllIlIlllI.isLast();
            llllllllllllIlllllIIIlIllIIlllll = (SpdyHttpEncoder.lIlllIlIIIIlIl[1] != 0);
        }
        if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIllIlIIIIl instanceof HttpResponse) ? 1 : 0)) {
            final HttpResponse llllllllllllIlllllIIIlIllIlIlIll = (HttpResponse)llllllllllllIlllllIIIlIllIlIIIIl;
            if (lIIIIIlIIlllllII(llllllllllllIlllllIIIlIllIlIlIll.headers().contains(SpdyHttpEncoder.lIlllIlIIIIIlI[SpdyHttpEncoder.lIlllIlIIIIlIl[1]]) ? 1 : 0)) {
                final SpdySynStreamFrame llllllllllllIlllllIIIlIllIlIllIl = this.createSynStreamFrame(llllllllllllIlllllIIIlIllIlIlIll);
                llllllllllllIlllllIIIlIllIIllllI = llllllllllllIlllllIIIlIllIlIllIl.isLast();
                llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIllIl);
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                final SpdySynReplyFrame llllllllllllIlllllIIIlIllIlIllII = this.createSynReplyFrame(llllllllllllIlllllIIIlIllIlIlIll);
                llllllllllllIlllllIIIlIllIIllllI = llllllllllllIlllllIIIlIllIlIllII.isLast();
                llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIllII);
                "".length();
            }
            llllllllllllIlllllIIIlIllIIlllll = (SpdyHttpEncoder.lIlllIlIIIIlIl[1] != 0);
        }
        if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIllIlIIIIl instanceof HttpContent) ? 1 : 0) && lIIIIIlIIlllllIl(llllllllllllIlllllIIIlIllIIllllI ? 1 : 0)) {
            final HttpContent llllllllllllIlllllIIIlIllIlIIlIl = (HttpContent)llllllllllllIlllllIIIlIllIlIIIIl;
            llllllllllllIlllllIIIlIllIlIIlIl.content().retain();
            "".length();
            final SpdyDataFrame llllllllllllIlllllIIIlIllIlIIlII = new DefaultSpdyDataFrame(this.currentStreamId, llllllllllllIlllllIIIlIllIlIIlIl.content());
            llllllllllllIlllllIIIlIllIlIIlII.setLast(llllllllllllIlllllIIIlIllIlIIlIl instanceof LastHttpContent);
            "".length();
            if (lIIIIIlIIlllllII((llllllllllllIlllllIIIlIllIlIIlIl instanceof LastHttpContent) ? 1 : 0)) {
                final LastHttpContent llllllllllllIlllllIIIlIllIlIIlll = (LastHttpContent)llllllllllllIlllllIIIlIllIlIIlIl;
                final HttpHeaders llllllllllllIlllllIIIlIllIlIIllI = llllllllllllIlllllIIIlIllIlIIlll.trailingHeaders();
                if (lIIIIIlIIlllllII(llllllllllllIlllllIIIlIllIlIIllI.isEmpty() ? 1 : 0)) {
                    llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIIlII);
                    "".length();
                    "".length();
                    if ((0x9A ^ 0x9E) == 0x0) {
                        return;
                    }
                }
                else {
                    final SpdyHeadersFrame llllllllllllIlllllIIIlIllIlIlIII = new DefaultSpdyHeadersFrame(this.currentStreamId);
                    final Iterator llllllllllllIlllllIIIlIllIlIlIIl = llllllllllllIlllllIIIlIllIlIIllI.iterator();
                    while (lIIIIIlIIlllllII(llllllllllllIlllllIIIlIllIlIlIIl.hasNext() ? 1 : 0)) {
                        final Map.Entry<String, String> llllllllllllIlllllIIIlIllIlIlIlI = llllllllllllIlllllIIIlIllIlIlIIl.next();
                        llllllllllllIlllllIIIlIllIlIlIII.headers().add(llllllllllllIlllllIIIlIllIlIlIlI.getKey(), llllllllllllIlllllIIIlIllIlIlIlI.getValue());
                        "".length();
                        "".length();
                        if ("   ".length() < " ".length()) {
                            return;
                        }
                    }
                    llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIlIII);
                    "".length();
                    llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIIlII);
                    "".length();
                }
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                llllllllllllIlllllIIIlIllIlIIIII.add(llllllllllllIlllllIIIlIllIlIIlII);
                "".length();
            }
            llllllllllllIlllllIIIlIllIIlllll = (SpdyHttpEncoder.lIlllIlIIIIlIl[1] != 0);
        }
        if (lIIIIIlIIlllllIl(llllllllllllIlllllIIIlIllIIlllll ? 1 : 0)) {
            throw new UnsupportedMessageTypeException(llllllllllllIlllllIIIlIllIlIIIIl, (Class<?>[])new Class[SpdyHttpEncoder.lIlllIlIIIIlIl[0]]);
        }
    }
    
    private static boolean lIIIIIlIIlllllll(final int llllllllllllIlllllIIIlIlIIIlIlII, final int llllllllllllIlllllIIIlIlIIIlIIll) {
        return llllllllllllIlllllIIIlIlIIIlIlII < llllllllllllIlllllIIIlIlIIIlIIll;
    }
}
