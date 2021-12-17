// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.Arrays;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCountUtil;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.MessageToMessageDecoder;

public abstract class HttpContentDecoder extends MessageToMessageDecoder<HttpObject>
{
    private /* synthetic */ HttpMessage message;
    private /* synthetic */ boolean continueResponse;
    static final /* synthetic */ boolean $assertionsDisabled;
    private static final /* synthetic */ String[] lllllIlllIllI;
    private static final /* synthetic */ int[] llllllIIlIIIl;
    private /* synthetic */ EmbeddedChannel decoder;
    private /* synthetic */ boolean decodeStarted;
    
    private static void lIlIllllIlIIIlI() {
        (lllllIlllIllI = new String[HttpContentDecoder.llllllIIlIIIl[9]])[HttpContentDecoder.llllllIIlIIIl[2]] = lIlIllllIIllIll("+p0YktWOuSvu+VAFD9Mqvai67pwppO0Y", "oLmvF");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[1]] = lIlIllllIIlllII("PFwabuN3j/oNQ9sC3gz2mg==", "bdfjs");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[3]] = lIlIllllIIllIll("EeSXefIp5z/z0u/IMNcvxQ==", "Wdfvv");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[4]] = lIlIllllIIlllIl("LzgLMjECI0gDOg84AS86Cw==", "lWeFT");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[5]] = lIlIllllIIlllIl("JgMHMAMLGEQBCAYDDS0IAg==", "eliDf");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[6]] = lIlIllllIIllIll("inLCHdC3aWGv2Ml1lQ7bEw==", "axYgo");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[7]] = lIlIllllIIlllII("ZSitZCXWmCj96+Fg6bq/7Q==", "kSHcZ");
        HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[8]] = lIlIllllIIllIll("YAe1tKtU3VggMsDU1znsBA==", "jQQpb");
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIlIlIlIllIIIIlIIlII, final HttpObject lllllllllllllIlIlIlIllIIIIlIIIll, final List<Object> lllllllllllllIlIlIlIllIIIIIlllll) throws Exception {
        if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIIIll instanceof HttpResponse) ? 1 : 0) && lIlIllllllIIllI(((HttpResponse)lllllllllllllIlIlIlIllIIIIlIIIll).getStatus().code(), HttpContentDecoder.llllllIIlIIIl[0])) {
            if (lIlIllllllIIlll((lllllllllllllIlIlIlIllIIIIlIIIll instanceof LastHttpContent) ? 1 : 0)) {
                this.continueResponse = (HttpContentDecoder.llllllIIlIIIl[1] != 0);
            }
            lllllllllllllIlIlIlIllIIIIIlllll.add(ReferenceCountUtil.retain(lllllllllllllIlIlIlIllIIIIlIIIll));
            "".length();
            return;
        }
        if (lIlIllllllIIlIl(this.continueResponse ? 1 : 0)) {
            if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIIIll instanceof LastHttpContent) ? 1 : 0)) {
                this.continueResponse = (HttpContentDecoder.llllllIIlIIIl[2] != 0);
            }
            lllllllllllllIlIlIlIllIIIIIlllll.add(ReferenceCountUtil.retain(lllllllllllllIlIlIlIllIIIIlIIIll));
            "".length();
            return;
        }
        if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIIIll instanceof HttpMessage) ? 1 : 0)) {
            if (lIlIllllllIIlll(HttpContentDecoder.$assertionsDisabled ? 1 : 0) && lIlIllllllIlIII(this.message)) {
                throw new AssertionError();
            }
            this.message = (HttpMessage)lllllllllllllIlIlIlIllIIIIlIIIll;
            this.decodeStarted = (HttpContentDecoder.llllllIIlIIIl[2] != 0);
            this.cleanup();
        }
        if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIIIll instanceof HttpContent) ? 1 : 0)) {
            final HttpContent lllllllllllllIlIlIlIllIIIIlIIllI = (HttpContent)lllllllllllllIlIlIlIllIIIIlIIIll;
            if (lIlIllllllIIlll(this.decodeStarted ? 1 : 0)) {
                this.decodeStarted = (HttpContentDecoder.llllllIIlIIIl[1] != 0);
                final HttpMessage lllllllllllllIlIlIlIllIIIIlIlIIl = this.message;
                final HttpHeaders lllllllllllllIlIlIlIllIIIIlIlIII = lllllllllllllIlIlIlIllIIIIlIlIIl.headers();
                this.message = null;
                String lllllllllllllIlIlIlIllIIIIlIIlll = lllllllllllllIlIlIlIllIIIIlIlIII.get(HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[2]]);
                if (lIlIllllllIlIII(lllllllllllllIlIlIlIllIIIIlIIlll)) {
                    lllllllllllllIlIlIlIllIIIIlIIlll = lllllllllllllIlIlIlIllIIIIlIIlll.trim();
                    "".length();
                    if ("   ".length() < 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIlIlIlIllIIIIlIIlll = HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[1]];
                }
                final EmbeddedChannel contentDecoder = this.newContentDecoder(lllllllllllllIlIlIlIllIIIIlIIlll);
                this.decoder = contentDecoder;
                if (lIlIllllllIlIII(contentDecoder)) {
                    final String lllllllllllllIlIlIlIllIIIIlIlIlI = this.getTargetContentEncoding(lllllllllllllIlIlIlIllIIIIlIIlll);
                    if (lIlIllllllIIlIl(HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[3]].equals(lllllllllllllIlIlIlIllIIIIlIlIlI) ? 1 : 0)) {
                        lllllllllllllIlIlIlIllIIIIlIlIII.remove(HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[4]]);
                        "".length();
                        "".length();
                        if ("   ".length() <= 0) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIlIlIlIllIIIIlIlIII.set(HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[5]], lllllllllllllIlIlIlIllIIIIlIlIlI);
                        "".length();
                    }
                    lllllllllllllIlIlIlIllIIIIIlllll.add(lllllllllllllIlIlIlIllIIIIlIlIIl);
                    "".length();
                    this.decodeContent(lllllllllllllIlIlIlIllIIIIlIIllI, lllllllllllllIlIlIlIllIIIIIlllll);
                    if (lIlIllllllIIlIl(lllllllllllllIlIlIlIllIIIIlIlIII.contains(HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[6]]) ? 1 : 0)) {
                        int lllllllllllllIlIlIlIllIIIIlIllII = HttpContentDecoder.llllllIIlIIIl[2];
                        final int lllllllllllllIlIlIlIllIIIIlIlIll = lllllllllllllIlIlIlIllIIIIIlllll.size();
                        int lllllllllllllIlIlIlIllIIIIlIllIl = HttpContentDecoder.llllllIIlIIIl[2];
                        while (lIlIllllllIlIIl(lllllllllllllIlIlIlIllIIIIlIllIl, lllllllllllllIlIlIlIllIIIIlIlIll)) {
                            final Object lllllllllllllIlIlIlIllIIIIlIlllI = lllllllllllllIlIlIlIllIIIIIlllll.get(lllllllllllllIlIlIlIllIIIIlIllIl);
                            if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIlllI instanceof HttpContent) ? 1 : 0)) {
                                lllllllllllllIlIlIlIllIIIIlIllII += ((HttpContent)lllllllllllllIlIlIlIllIIIIlIlllI).content().readableBytes();
                            }
                            ++lllllllllllllIlIlIlIllIIIIlIllIl;
                            "".length();
                            if ("  ".length() <= -" ".length()) {
                                return;
                            }
                        }
                        lllllllllllllIlIlIlIllIIIIlIlIII.set(HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[7]], Integer.toString(lllllllllllllIlIlIlIllIIIIlIllII));
                        "".length();
                    }
                    return;
                }
                if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIIllI instanceof LastHttpContent) ? 1 : 0)) {
                    this.decodeStarted = (HttpContentDecoder.llllllIIlIIIl[2] != 0);
                }
                lllllllllllllIlIlIlIllIIIIIlllll.add(lllllllllllllIlIlIlIllIIIIlIlIIl);
                "".length();
                lllllllllllllIlIlIlIllIIIIIlllll.add(lllllllllllllIlIlIlIllIIIIlIIllI.retain());
                "".length();
            }
            else if (lIlIllllllIlIII(this.decoder)) {
                this.decodeContent(lllllllllllllIlIlIlIllIIIIlIIllI, lllllllllllllIlIlIlIllIIIIIlllll);
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
            }
            else {
                if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIlIIllI instanceof LastHttpContent) ? 1 : 0)) {
                    this.decodeStarted = (HttpContentDecoder.llllllIIlIIIl[2] != 0);
                }
                lllllllllllllIlIlIlIllIIIIIlllll.add(lllllllllllllIlIlIlIllIIIIlIIllI.retain());
                "".length();
            }
        }
    }
    
    private static boolean lIlIllllllIIlll(final int lllllllllllllIlIlIlIlIlllIIIlIlI) {
        return lllllllllllllIlIlIlIlIlllIIIlIlI == 0;
    }
    
    protected String getTargetContentEncoding(final String lllllllllllllIlIlIlIllIIIIIIIIlI) throws Exception {
        return HttpContentDecoder.lllllIlllIllI[HttpContentDecoder.llllllIIlIIIl[8]];
    }
    
    private static void lIlIllllllIIlII() {
        (llllllIIlIIIl = new int[10])[0] = (0xF ^ 0x6B);
        HttpContentDecoder.llllllIIlIIIl[1] = " ".length();
        HttpContentDecoder.llllllIIlIIIl[2] = ((0x2A ^ 0x53 ^ (0xF9 ^ 0xA7)) & (0x29 ^ 0x7A ^ (0x2C ^ 0x58) ^ -" ".length()));
        HttpContentDecoder.llllllIIlIIIl[3] = "  ".length();
        HttpContentDecoder.llllllIIlIIIl[4] = "   ".length();
        HttpContentDecoder.llllllIIlIIIl[5] = (0x36 ^ 0x66 ^ (0xE3 ^ 0xB7));
        HttpContentDecoder.llllllIIlIIIl[6] = (0x6C ^ 0x69);
        HttpContentDecoder.llllllIIlIIIl[7] = (0xC4 ^ 0x80 ^ (0xEE ^ 0xAC));
        HttpContentDecoder.llllllIIlIIIl[8] = (107 + 110 - 87 + 27 ^ 109 + 4 - 34 + 75);
        HttpContentDecoder.llllllIIlIIIl[9] = (0x4C ^ 0x43 ^ (0x60 ^ 0x67));
    }
    
    static {
        lIlIllllllIIlII();
        lIlIllllIlIIIlI();
        int $assertionsDisabled2;
        if (lIlIllllllIIlll(HttpContentDecoder.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = HttpContentDecoder.llllllIIlIIIl[1];
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = HttpContentDecoder.llllllIIlIIIl[2];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIlIlIlIlIlllllllIII) throws Exception {
        this.cleanup();
        super.channelInactive(lllllllllllllIlIlIlIlIlllllllIII);
    }
    
    private static String lIlIllllIIllIll(final String lllllllllllllIlIlIlIlIlllIlIlIlI, final String lllllllllllllIlIlIlIlIlllIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIlllIlIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIlllIlIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIlIlllIlIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIlIlllIlIlllI.init(HttpContentDecoder.llllllIIlIIIl[3], lllllllllllllIlIlIlIlIlllIlIllll);
            return new String(lllllllllllllIlIlIlIlIlllIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlllIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIlllIlIllIl) {
            lllllllllllllIlIlIlIlIlllIlIllIl.printStackTrace();
            return null;
        }
    }
    
    private void fetchDecoderOutput(final List<Object> lllllllllllllIlIlIlIlIllllIllIll) {
        while (true) {
            final ByteBuf lllllllllllllIlIlIlIlIllllIlllIl = (ByteBuf)this.decoder.readInbound();
            if (lIlIllllllIlIlI(lllllllllllllIlIlIlIlIllllIlllIl)) {
                "".length();
                if ("   ".length() < 0) {
                    return;
                }
            }
            else if (lIlIllllllIIlll(lllllllllllllIlIlIlIlIllllIlllIl.isReadable() ? 1 : 0)) {
                lllllllllllllIlIlIlIlIllllIlllIl.release();
                "".length();
                "".length();
                if ("   ".length() < "   ".length()) {
                    return;
                }
                continue;
            }
            else {
                lllllllllllllIlIlIlIlIllllIllIll.add(new DefaultHttpContent(lllllllllllllIlIlIlIlIllllIlllIl));
                "".length();
                "".length();
                if (-(0x8 ^ 0x4E ^ (0x12 ^ 0x50)) > 0) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static String lIlIllllIIlllII(final String lllllllllllllIlIlIlIlIlllIIlllIl, final String lllllllllllllIlIlIlIlIlllIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIlllIlIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIlllIIlllII.getBytes(StandardCharsets.UTF_8)), HttpContentDecoder.llllllIIlIIIl[9]), "DES");
            final Cipher lllllllllllllIlIlIlIlIlllIlIIIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIlIlllIlIIIIl.init(HttpContentDecoder.llllllIIlIIIl[3], lllllllllllllIlIlIlIlIlllIlIIIlI);
            return new String(lllllllllllllIlIlIlIlIlllIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIlllIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIlllIlIIIII) {
            lllllllllllllIlIlIlIlIlllIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIllllllIlIlI(final Object lllllllllllllIlIlIlIlIlllIIIlllI) {
        return lllllllllllllIlIlIlIlIlllIIIlllI == null;
    }
    
    private void cleanup() {
        if (lIlIllllllIlIII(this.decoder)) {
            Label_0077: {
                if (lIlIllllllIIlIl(this.decoder.finish() ? 1 : 0)) {
                    do {
                        final ByteBuf lllllllllllllIlIlIlIlIllllllIIll = (ByteBuf)this.decoder.readOutbound();
                        if (lIlIllllllIlIlI(lllllllllllllIlIlIlIlIllllllIIll)) {
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break Label_0077;
                        }
                        else {
                            lllllllllllllIlIlIlIlIllllllIIll.release();
                            "".length();
                            "".length();
                        }
                    } while ("   ".length() >= 0);
                    return;
                }
            }
            this.decoder = null;
        }
    }
    
    private static String lIlIllllIIlllIl(String lllllllllllllIlIlIlIlIlllIllllII, final String lllllllllllllIlIlIlIlIlllIlllIll) {
        lllllllllllllIlIlIlIlIlllIllllII = (short)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIlIlIlIlllIllllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIlIlllIllllll = new StringBuilder();
        final char[] lllllllllllllIlIlIlIlIlllIlllllI = lllllllllllllIlIlIlIlIlllIlllIll.toCharArray();
        int lllllllllllllIlIlIlIlIlllIllllIl = HttpContentDecoder.llllllIIlIIIl[2];
        final int lllllllllllllIlIlIlIlIlllIllIlll = (Object)((String)lllllllllllllIlIlIlIlIlllIllllII).toCharArray();
        final char lllllllllllllIlIlIlIlIlllIllIllI = (char)lllllllllllllIlIlIlIlIlllIllIlll.length;
        float lllllllllllllIlIlIlIlIlllIllIlIl = HttpContentDecoder.llllllIIlIIIl[2];
        while (lIlIllllllIlIIl((int)lllllllllllllIlIlIlIlIlllIllIlIl, lllllllllllllIlIlIlIlIlllIllIllI)) {
            final char lllllllllllllIlIlIlIlIllllIIIIlI = lllllllllllllIlIlIlIlIlllIllIlll[lllllllllllllIlIlIlIlIlllIllIlIl];
            lllllllllllllIlIlIlIlIlllIllllll.append((char)(lllllllllllllIlIlIlIlIllllIIIIlI ^ lllllllllllllIlIlIlIlIlllIlllllI[lllllllllllllIlIlIlIlIlllIllllIl % lllllllllllllIlIlIlIlIlllIlllllI.length]));
            "".length();
            ++lllllllllllllIlIlIlIlIlllIllllIl;
            ++lllllllllllllIlIlIlIlIlllIllIlIl;
            "".length();
            if ("  ".length() < ((((0x1C ^ 0x43) & ~(0x52 ^ 0xD)) ^ (0x77 ^ 0x44)) & (0x71 ^ 0x2D ^ (0x31 ^ 0x5E) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIlIlllIllllll);
    }
    
    private void decode(final ByteBuf lllllllllllllIlIlIlIlIlllllIlIII, final List<Object> lllllllllllllIlIlIlIlIlllllIlIlI) {
        final EmbeddedChannel decoder = this.decoder;
        final Object[] lllllllllllllIIllIIIlIIllIlIlIIl = new Object[HttpContentDecoder.llllllIIlIIIl[1]];
        lllllllllllllIIllIIIlIIllIlIlIIl[HttpContentDecoder.llllllIIlIIIl[2]] = lllllllllllllIlIlIlIlIlllllIlIII.retain();
        decoder.writeInbound(lllllllllllllIIllIIIlIIllIlIlIIl);
        "".length();
        this.fetchDecoderOutput(lllllllllllllIlIlIlIlIlllllIlIlI);
    }
    
    private void finishDecode(final List<Object> lllllllllllllIlIlIlIlIlllllIIIll) {
        if (lIlIllllllIIlIl(this.decoder.finish() ? 1 : 0)) {
            this.fetchDecoderOutput(lllllllllllllIlIlIlIlIlllllIIIll);
        }
        this.decodeStarted = (HttpContentDecoder.llllllIIlIIIl[2] != 0);
        this.decoder = null;
    }
    
    protected abstract EmbeddedChannel newContentDecoder(final String p0) throws Exception;
    
    private void decodeContent(final HttpContent lllllllllllllIlIlIlIllIIIIIIllII, final List<Object> lllllllllllllIlIlIlIllIIIIIIIlll) {
        final ByteBuf lllllllllllllIlIlIlIllIIIIIIlIlI = lllllllllllllIlIlIlIllIIIIIIllII.content();
        this.decode(lllllllllllllIlIlIlIllIIIIIIlIlI, lllllllllllllIlIlIlIllIIIIIIIlll);
        if (lIlIllllllIIlIl((lllllllllllllIlIlIlIllIIIIIIllII instanceof LastHttpContent) ? 1 : 0)) {
            this.finishDecode(lllllllllllllIlIlIlIllIIIIIIIlll);
            final LastHttpContent lllllllllllllIlIlIlIllIIIIIIllll = (LastHttpContent)lllllllllllllIlIlIlIllIIIIIIllII;
            final HttpHeaders lllllllllllllIlIlIlIllIIIIIIlllI = lllllllllllllIlIlIlIllIIIIIIllll.trailingHeaders();
            if (lIlIllllllIIlIl(lllllllllllllIlIlIlIllIIIIIIlllI.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIlIlIllIIIIIIIlll.add(LastHttpContent.EMPTY_LAST_CONTENT);
                "".length();
                "".length();
                if (((88 + 4 + 44 + 31 ^ 111 + 57 - 128 + 96) & (115 + 131 - 125 + 18 ^ 147 + 39 - 25 + 3 ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIlIlIllIIIIIIIlll.add(new ComposedLastHttpContent(lllllllllllllIlIlIlIllIIIIIIlllI));
                "".length();
            }
        }
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext lllllllllllllIlIlIlIlIllllllllII) throws Exception {
        this.cleanup();
        super.handlerRemoved(lllllllllllllIlIlIlIlIllllllllII);
    }
    
    private static boolean lIlIllllllIlIII(final Object lllllllllllllIlIlIlIlIlllIIlIIII) {
        return lllllllllllllIlIlIlIlIlllIIlIIII != null;
    }
    
    private static boolean lIlIllllllIlIIl(final int lllllllllllllIlIlIlIlIlllIIlIIll, final int lllllllllllllIlIlIlIlIlllIIlIIlI) {
        return lllllllllllllIlIlIlIlIlllIIlIIll < lllllllllllllIlIlIlIlIlllIIlIIlI;
    }
    
    private static boolean lIlIllllllIIlIl(final int lllllllllllllIlIlIlIlIlllIIIllII) {
        return lllllllllllllIlIlIlIlIlllIIIllII != 0;
    }
    
    private static boolean lIlIllllllIIllI(final int lllllllllllllIlIlIlIlIlllIIlIlll, final int lllllllllllllIlIlIlIlIlllIIlIllI) {
        return lllllllllllllIlIlIlIlIlllIIlIlll == lllllllllllllIlIlIlIlIlllIIlIllI;
    }
}
