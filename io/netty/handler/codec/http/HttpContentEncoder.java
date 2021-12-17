// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import java.util.ArrayDeque;
import io.netty.buffer.ByteBufHolder;
import io.netty.util.ReferenceCountUtil;
import io.netty.buffer.ByteBuf;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Queue;
import io.netty.channel.embedded.EmbeddedChannel;
import io.netty.handler.codec.MessageToMessageCodec;

public abstract class HttpContentEncoder extends MessageToMessageCodec<HttpRequest, HttpObject>
{
    private static final /* synthetic */ String[] lIIIIIlIIlIlIl;
    private static final /* synthetic */ int[] lIIIIIlIIlIllI;
    private /* synthetic */ EmbeddedChannel encoder;
    private final /* synthetic */ Queue<String> acceptEncodingQueue;
    private /* synthetic */ String acceptEncoding;
    static final /* synthetic */ boolean $assertionsDisabled;
    private /* synthetic */ State state;
    
    private static String lIllIlIlllIlllI(final String lllllllllllllIlIIllllIIlIIlllIlI, final String lllllllllllllIlIIllllIIlIIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllIIlIIllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllIIlIIlllIIl.getBytes(StandardCharsets.UTF_8)), HttpContentEncoder.lIIIIIlIIlIllI[9]), "DES");
            final Cipher lllllllllllllIlIIllllIIlIIlllllI = Cipher.getInstance("DES");
            lllllllllllllIlIIllllIIlIIlllllI.init(HttpContentEncoder.lIIIIIlIIlIllI[3], lllllllllllllIlIIllllIIlIIllllll);
            return new String(lllllllllllllIlIIllllIIlIIlllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllIIlIIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllIIlIIllllIl) {
            lllllllllllllIlIIllllIIlIIllllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void handlerRemoved(final ChannelHandlerContext lllllllllllllIlIIllllIIllIIIIIlI) throws Exception {
        this.cleanup();
        super.handlerRemoved(lllllllllllllIlIIllllIIllIIIIIlI);
    }
    
    private static void lIllIlIllllIIII() {
        (lIIIIIlIIlIllI = new int[14])[0] = " ".length();
        HttpContentEncoder.lIIIIIlIIlIllI[1] = ((0x4F ^ 0x6A) & ~(0x17 ^ 0x32));
        HttpContentEncoder.lIIIIIlIIlIllI[2] = (0x50 ^ 0x3 ^ (0x77 ^ 0x40));
        HttpContentEncoder.lIIIIIlIIlIllI[3] = "  ".length();
        HttpContentEncoder.lIIIIIlIIlIllI[4] = "   ".length();
        HttpContentEncoder.lIIIIIlIIlIllI[5] = (174 + 148 - 143 + 11 ^ 42 + 26 + 9 + 109);
        HttpContentEncoder.lIIIIIlIIlIllI[6] = (0x4A ^ 0x6 ^ (0xE7 ^ 0xAE));
        HttpContentEncoder.lIIIIIlIIlIllI[7] = (0x4D ^ 0x2F ^ (0x71 ^ 0x15));
        HttpContentEncoder.lIIIIIlIIlIllI[8] = (0xBE ^ 0xB9);
        HttpContentEncoder.lIIIIIlIIlIllI[9] = (0xBC ^ 0xB4);
        HttpContentEncoder.lIIIIIlIIlIllI[10] = (7 + 36 + 34 + 76 ^ 74 + 87 - 23 + 38);
        HttpContentEncoder.lIIIIIlIIlIllI[11] = (0x60 ^ 0x69);
        HttpContentEncoder.lIIIIIlIIlIllI[12] = (0x31 ^ 0x3B);
        HttpContentEncoder.lIIIIIlIIlIllI[13] = (83 + 83 - 54 + 57 ^ 124 + 155 - 227 + 110);
    }
    
    static {
        lIllIlIllllIIII();
        lIllIlIlllIllll();
        int $assertionsDisabled2;
        if (lIllIlIllllIIIl(HttpContentEncoder.class.desiredAssertionStatus() ? 1 : 0)) {
            $assertionsDisabled2 = HttpContentEncoder.lIIIIIlIIlIllI[0];
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else {
            $assertionsDisabled2 = HttpContentEncoder.lIIIIIlIIlIllI[1];
        }
        $assertionsDisabled = ($assertionsDisabled2 != 0);
    }
    
    private static void lIllIlIlllIllll() {
        (lIIIIIlIIlIlIl = new String[HttpContentEncoder.lIIIIIlIIlIllI[13]])[HttpContentEncoder.lIIIIIlIIlIllI[1]] = lIllIlIlllIllII("57qPdyJshE5FTWFF4FWf/g==", "nUjBJ");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[0]] = lIllIlIlllIllIl("BwgoNg4HGDQ=", "nlMXz");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[3]] = lIllIlIlllIllII("sh6uhJAK/mqthId2/mr5Q0n5FTF2BoN3AWn2UgYEBDxg0M/KT2iMqC6s4Xhoo36V", "dxvaq");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[4]] = lIllIlIlllIlllI("ccYJl0OlyCeLthNRfHN8T6PfCaGi5rtI", "VDyXU");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[5]] = lIllIlIlllIllIl("EyIjExQ+OWArFD4qOQ8=", "PMMgq");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[6]] = lIllIlIlllIlllI("JRtqhEJgmExkp5voei82ycX1XraXQTTk", "PkwOL");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[7]] = lIllIlIlllIllIl("KgIyFB8sDg==", "IjGzt");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[8]] = lIllIlIlllIllII("gn2j6V87HPcpW2dNHYIRT2GRKmM1W6wFVEw5t4O0HXQ=", "roaDi");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[9]] = lIllIlIlllIlllI("oQpjOqDrnzIzXXN8mRStSA==", "AGRUs");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[11]] = lIllIlIlllIllII("suZGH5Xa1donsdGK7U+zKwGFdeqFivNzV39cUxim8QU=", "NiVId");
        HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[12]] = lIllIlIlllIlllI("+LQ6sAU70HVxKBeBdHhXOQ==", "LKFjV");
    }
    
    private boolean encodeContent(final HttpContent lllllllllllllIlIIllllIIllIIIlIlI, final List<Object> lllllllllllllIlIIllllIIllIIIlIIl) {
        final ByteBuf lllllllllllllIlIIllllIIllIIIllII = lllllllllllllIlIIllllIIllIIIlIlI.content();
        this.encode(lllllllllllllIlIIllllIIllIIIllII, lllllllllllllIlIIllllIIllIIIlIIl);
        if (lIllIlIllllIIlI((lllllllllllllIlIIllllIIllIIIlIlI instanceof LastHttpContent) ? 1 : 0)) {
            this.finishEncode(lllllllllllllIlIIllllIIllIIIlIIl);
            final LastHttpContent lllllllllllllIlIIllllIIllIIlIIIl = (LastHttpContent)lllllllllllllIlIIllllIIllIIIlIlI;
            final HttpHeaders lllllllllllllIlIIllllIIllIIlIIII = lllllllllllllIlIIllllIIllIIlIIIl.trailingHeaders();
            if (lIllIlIllllIIlI(lllllllllllllIlIIllllIIllIIlIIII.isEmpty() ? 1 : 0)) {
                lllllllllllllIlIIllllIIllIIIlIIl.add(LastHttpContent.EMPTY_LAST_CONTENT);
                "".length();
                "".length();
                if ((0x66 ^ 0x62) > (0xC0 ^ 0xC4)) {
                    return ((0x19 ^ 0x44) & ~(0x72 ^ 0x2F)) != 0x0;
                }
            }
            else {
                lllllllllllllIlIIllllIIllIIIlIIl.add(new ComposedLastHttpContent(lllllllllllllIlIIllllIIllIIlIIII));
                "".length();
            }
            return HttpContentEncoder.lIIIIIlIIlIllI[0] != 0;
        }
        return HttpContentEncoder.lIIIIIlIIlIllI[1] != 0;
    }
    
    private static boolean lIllIlIllllIlIl(final int lllllllllllllIlIIllllIIlIIIIllll, final int lllllllllllllIlIIllllIIlIIIIlllI) {
        return lllllllllllllIlIIllllIIlIIIIllll == lllllllllllllIlIIllllIIlIIIIlllI;
    }
    
    @Override
    public void channelInactive(final ChannelHandlerContext lllllllllllllIlIIllllIIlIlllllII) throws Exception {
        this.cleanup();
        super.channelInactive(lllllllllllllIlIIllllIIlIlllllII);
    }
    
    private void encode(final ByteBuf lllllllllllllIlIIllllIIlIllIllll, final List<Object> lllllllllllllIlIIllllIIlIllIlllI) {
        final EmbeddedChannel encoder = this.encoder;
        final Object[] lllllllllllllIIllIIIlIIllIIlIIII = new Object[HttpContentEncoder.lIIIIIlIIlIllI[0]];
        lllllllllllllIIllIIIlIIllIIlIIII[HttpContentEncoder.lIIIIIlIIlIllI[1]] = lllllllllllllIlIIllllIIlIllIllll.retain();
        encoder.writeOutbound(lllllllllllllIIllIIIlIIllIIlIIII);
        "".length();
        this.fetchEncoderOutput(lllllllllllllIlIIllllIIlIllIlllI);
    }
    
    @Override
    protected void decode(final ChannelHandlerContext lllllllllllllIlIIllllIIllIlllIll, final HttpRequest lllllllllllllIlIIllllIIllIlllIlI, final List<Object> lllllllllllllIlIIllllIIllIlllIIl) throws Exception {
        String lllllllllllllIlIIllllIIllIlllIII = lllllllllllllIlIIllllIIllIlllIlI.headers().get(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[1]]);
        if (lIllIlIllllIIll(lllllllllllllIlIIllllIIllIlllIII)) {
            lllllllllllllIlIIllllIIllIlllIII = HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[0]];
        }
        this.acceptEncodingQueue.add(lllllllllllllIlIIllllIIllIlllIII);
        "".length();
        lllllllllllllIlIIllllIIllIlllIIl.add(ReferenceCountUtil.retain(lllllllllllllIlIIllllIIllIlllIlI));
        "".length();
    }
    
    @Override
    protected void encode(final ChannelHandlerContext lllllllllllllIlIIllllIIllIlIlIII, final HttpObject lllllllllllllIlIIllllIIllIlIIIll, final List<Object> lllllllllllllIlIIllllIIllIlIIllI) throws Exception {
        int n;
        if (lIllIlIllllIIlI((lllllllllllllIlIIllllIIllIlIIIll instanceof HttpResponse) ? 1 : 0) && lIllIlIllllIIlI((lllllllllllllIlIIllllIIllIlIIIll instanceof LastHttpContent) ? 1 : 0)) {
            n = HttpContentEncoder.lIIIIIlIIlIllI[0];
            "".length();
            if (((123 + 19 - 71 + 125 ^ 161 + 164 - 294 + 134) & (0x2C ^ 0x54 ^ (0x2E ^ 0x37) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = HttpContentEncoder.lIIIIIlIIlIllI[1];
        }
        final boolean lllllllllllllIlIIllllIIllIlIIlIl = n != 0;
        Label_0763: {
            switch (HttpContentEncoder$1.$SwitchMap$io$netty$handler$codec$http$HttpContentEncoder$State[this.state.ordinal()]) {
                case 1: {
                    ensureHeaders(lllllllllllllIlIIllllIIllIlIIIll);
                    if (lIllIlIllllIIIl(HttpContentEncoder.$assertionsDisabled ? 1 : 0) && lIllIlIllllIlII(this.encoder)) {
                        throw new AssertionError();
                    }
                    final HttpResponse lllllllllllllIlIIllllIIllIlIlIll = (HttpResponse)lllllllllllllIlIIllllIIllIlIIIll;
                    if (lIllIlIllllIlIl(lllllllllllllIlIIllllIIllIlIlIll.getStatus().code(), HttpContentEncoder.lIIIIIlIIlIllI[2])) {
                        if (lIllIlIllllIIlI(lllllllllllllIlIIllllIIllIlIIlIl ? 1 : 0)) {
                            lllllllllllllIlIIllllIIllIlIIllI.add(ReferenceCountUtil.retain(lllllllllllllIlIIllllIIllIlIlIll));
                            "".length();
                            "".length();
                            if (-" ".length() > (0xC0 ^ 0xC4)) {
                                return;
                            }
                            break;
                        }
                        else {
                            lllllllllllllIlIIllllIIllIlIIllI.add(lllllllllllllIlIIllllIIllIlIlIll);
                            "".length();
                            this.state = State.PASS_THROUGH;
                            "".length();
                            if (((15 + 3 + 37 + 82 ^ 65 + 59 + 12 + 29) & (0x2 ^ 0x47 ^ (0x57 ^ 0x3E) ^ -" ".length())) > 0) {
                                return;
                            }
                            break;
                        }
                    }
                    else {
                        this.acceptEncoding = this.acceptEncodingQueue.poll();
                        if (lIllIlIllllIIll(this.acceptEncoding)) {
                            throw new IllegalStateException(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[3]]);
                        }
                        if (lIllIlIllllIIlI(lllllllllllllIlIIllllIIllIlIIlIl ? 1 : 0) && lIllIlIllllIIIl(((ByteBufHolder)lllllllllllllIlIIllllIIllIlIlIll).content().isReadable() ? 1 : 0)) {
                            lllllllllllllIlIIllllIIllIlIIllI.add(ReferenceCountUtil.retain(lllllllllllllIlIIllllIIllIlIlIll));
                            "".length();
                            "".length();
                            if (" ".length() <= 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            final Result lllllllllllllIlIIllllIIllIlIlIlI = this.beginEncode(lllllllllllllIlIIllllIIllIlIlIll, this.acceptEncoding);
                            if (lIllIlIllllIIll(lllllllllllllIlIIllllIIllIlIlIlI)) {
                                if (lIllIlIllllIIlI(lllllllllllllIlIIllllIIllIlIIlIl ? 1 : 0)) {
                                    lllllllllllllIlIIllllIIllIlIIllI.add(ReferenceCountUtil.retain(lllllllllllllIlIIllllIIllIlIlIll));
                                    "".length();
                                    "".length();
                                    if (-" ".length() >= 0) {
                                        return;
                                    }
                                    break;
                                }
                                else {
                                    lllllllllllllIlIIllllIIllIlIIllI.add(lllllllllllllIlIIllllIIllIlIlIll);
                                    "".length();
                                    this.state = State.PASS_THROUGH;
                                    "".length();
                                    if ("  ".length() <= " ".length()) {
                                        return;
                                    }
                                    break;
                                }
                            }
                            else {
                                this.encoder = lllllllllllllIlIIllllIIllIlIlIlI.contentEncoder();
                                lllllllllllllIlIIllllIIllIlIlIll.headers().set(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[4]], lllllllllllllIlIIllllIIllIlIlIlI.targetContentEncoding());
                                "".length();
                                lllllllllllllIlIIllllIIllIlIlIll.headers().remove(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[5]]);
                                "".length();
                                lllllllllllllIlIIllllIIllIlIlIll.headers().set(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[6]], HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[7]]);
                                "".length();
                                if (lIllIlIllllIIlI(lllllllllllllIlIIllllIIllIlIIlIl ? 1 : 0)) {
                                    final HttpResponse lllllllllllllIlIIllllIIllIlIllII = new DefaultHttpResponse(lllllllllllllIlIIllllIIllIlIlIll.getProtocolVersion(), lllllllllllllIlIIllllIIllIlIlIll.getStatus());
                                    lllllllllllllIlIIllllIIllIlIllII.headers().set(lllllllllllllIlIIllllIIllIlIlIll.headers());
                                    "".length();
                                    lllllllllllllIlIIllllIIllIlIIllI.add(lllllllllllllIlIIllllIIllIlIllII);
                                    "".length();
                                    "".length();
                                    if (((0x91 ^ 0x9B ^ (0xDF ^ 0xC5)) & (0xAD ^ 0x94 ^ (0xB4 ^ 0x9D) ^ -" ".length())) > 0) {
                                        return;
                                    }
                                    break Label_0763;
                                }
                                else {
                                    lllllllllllllIlIIllllIIllIlIIllI.add(lllllllllllllIlIIllllIIllIlIlIll);
                                    "".length();
                                    this.state = State.AWAIT_CONTENT;
                                    if (!lIllIlIllllIIIl((lllllllllllllIlIIllllIIllIlIIIll instanceof HttpContent) ? 1 : 0)) {
                                        break Label_0763;
                                    }
                                    "".length();
                                    if (null != null) {
                                        return;
                                    }
                                    break;
                                }
                            }
                        }
                    }
                    break;
                }
                case 2: {
                    ensureContent(lllllllllllllIlIIllllIIllIlIIIll);
                    if (!lIllIlIllllIIlI(this.encodeContent((HttpContent)lllllllllllllIlIIllllIIllIlIIIll, lllllllllllllIlIIllllIIllIlIIllI) ? 1 : 0)) {
                        break;
                    }
                    this.state = State.AWAIT_HEADERS;
                    "".length();
                    if (-" ".length() >= ((0x40 ^ 0x12) & ~(0xF0 ^ 0xA2))) {
                        return;
                    }
                    break;
                }
                case 3: {
                    ensureContent(lllllllllllllIlIIllllIIllIlIIIll);
                    lllllllllllllIlIIllllIIllIlIIllI.add(ReferenceCountUtil.retain(lllllllllllllIlIIllllIIllIlIIIll));
                    "".length();
                    if (lIllIlIllllIIlI((lllllllllllllIlIIllllIIllIlIIIll instanceof LastHttpContent) ? 1 : 0)) {
                        this.state = State.AWAIT_HEADERS;
                        break;
                    }
                    break;
                }
            }
        }
    }
    
    public HttpContentEncoder() {
        this.acceptEncodingQueue = new ArrayDeque<String>();
        this.state = State.AWAIT_HEADERS;
    }
    
    private static boolean lIllIlIllllIIll(final Object lllllllllllllIlIIllllIIlIIIIIllI) {
        return lllllllllllllIlIIllllIIlIIIIIllI == null;
    }
    
    private static void ensureContent(final HttpObject lllllllllllllIlIIllllIIllIIllIII) {
        if (lIllIlIllllIIIl((lllllllllllllIlIIllllIIllIIllIII instanceof HttpContent) ? 1 : 0)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[11]]).append(lllllllllllllIlIIllllIIllIIllIII.getClass().getName()).append(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[12]]).append(HttpContent.class.getSimpleName()).append((char)HttpContentEncoder.lIIIIIlIIlIllI[10])));
        }
    }
    
    private static String lIllIlIlllIllII(final String lllllllllllllIlIIllllIIlIIIlIlIl, final String lllllllllllllIlIIllllIIlIIIlIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIllllIIlIIIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIllllIIlIIIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIllllIIlIIIllIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIllllIIlIIIllIIl.init(HttpContentEncoder.lIIIIIlIIlIllI[3], lllllllllllllIlIIllllIIlIIIllIlI);
            return new String(lllllllllllllIlIIllllIIlIIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIllllIIlIIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIllllIIlIIIllIII) {
            lllllllllllllIlIIllllIIlIIIllIII.printStackTrace();
            return null;
        }
    }
    
    private static void ensureHeaders(final HttpObject lllllllllllllIlIIllllIIllIIllIll) {
        if (lIllIlIllllIIIl((lllllllllllllIlIIllllIIllIIllIll instanceof HttpResponse) ? 1 : 0)) {
            throw new IllegalStateException(String.valueOf(new StringBuilder().append(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[8]]).append(lllllllllllllIlIIllllIIllIIllIll.getClass().getName()).append(HttpContentEncoder.lIIIIIlIIlIlIl[HttpContentEncoder.lIIIIIlIIlIllI[9]]).append(HttpResponse.class.getSimpleName()).append((char)HttpContentEncoder.lIIIIIlIIlIllI[10])));
        }
    }
    
    private static boolean lIllIlIllllIlII(final Object lllllllllllllIlIIllllIIlIIIIlIII) {
        return lllllllllllllIlIIllllIIlIIIIlIII != null;
    }
    
    private void finishEncode(final List<Object> lllllllllllllIlIIllllIIlIllIIlIl) {
        if (lIllIlIllllIIlI(this.encoder.finish() ? 1 : 0)) {
            this.fetchEncoderOutput(lllllllllllllIlIIllllIIlIllIIlIl);
        }
        this.encoder = null;
    }
    
    private void fetchEncoderOutput(final List<Object> lllllllllllllIlIIllllIIlIlIlllll) {
        while (true) {
            final ByteBuf lllllllllllllIlIIllllIIlIllIIIIl = (ByteBuf)this.encoder.readOutbound();
            if (lIllIlIllllIIll(lllllllllllllIlIIllllIIlIllIIIIl)) {
                "".length();
                if ("  ".length() < 0) {
                    return;
                }
            }
            else if (lIllIlIllllIIIl(lllllllllllllIlIIllllIIlIllIIIIl.isReadable() ? 1 : 0)) {
                lllllllllllllIlIIllllIIlIllIIIIl.release();
                "".length();
                "".length();
                if ((0x33 ^ 0x37) != (0x19 ^ 0x1D)) {
                    return;
                }
                continue;
            }
            else {
                lllllllllllllIlIIllllIIlIlIlllll.add(new DefaultHttpContent(lllllllllllllIlIIllllIIlIllIIIIl));
                "".length();
                "".length();
                if ((0x4A ^ 0x4E) < (0x1D ^ 0x19)) {
                    return;
                }
                continue;
            }
        }
    }
    
    private static String lIllIlIlllIllIl(String lllllllllllllIlIIllllIIlIIlIIlll, final String lllllllllllllIlIIllllIIlIIlIlIll) {
        lllllllllllllIlIIllllIIlIIlIIlll = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIllllIIlIIlIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIllllIIlIIlIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIllllIIlIIlIlIIl = lllllllllllllIlIIllllIIlIIlIlIll.toCharArray();
        int lllllllllllllIlIIllllIIlIIlIlIII = HttpContentEncoder.lIIIIIlIIlIllI[1];
        final char lllllllllllllIlIIllllIIlIIlIIIlI = (Object)((String)lllllllllllllIlIIllllIIlIIlIIlll).toCharArray();
        final short lllllllllllllIlIIllllIIlIIlIIIIl = (short)lllllllllllllIlIIllllIIlIIlIIIlI.length;
        boolean lllllllllllllIlIIllllIIlIIlIIIII = HttpContentEncoder.lIIIIIlIIlIllI[1] != 0;
        while (lIllIlIllllIllI(lllllllllllllIlIIllllIIlIIlIIIII ? 1 : 0, lllllllllllllIlIIllllIIlIIlIIIIl)) {
            final char lllllllllllllIlIIllllIIlIIlIllIl = lllllllllllllIlIIllllIIlIIlIIIlI[lllllllllllllIlIIllllIIlIIlIIIII];
            lllllllllllllIlIIllllIIlIIlIlIlI.append((char)(lllllllllllllIlIIllllIIlIIlIllIl ^ lllllllllllllIlIIllllIIlIIlIlIIl[lllllllllllllIlIIllllIIlIIlIlIII % lllllllllllllIlIIllllIIlIIlIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIllllIIlIIlIlIII;
            ++lllllllllllllIlIIllllIIlIIlIIIII;
            "".length();
            if (" ".length() >= "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIllllIIlIIlIlIlI);
    }
    
    private static boolean lIllIlIllllIllI(final int lllllllllllllIlIIllllIIlIIIIlIll, final int lllllllllllllIlIIllllIIlIIIIlIlI) {
        return lllllllllllllIlIIllllIIlIIIIlIll < lllllllllllllIlIIllllIIlIIIIlIlI;
    }
    
    private static boolean lIllIlIllllIIIl(final int lllllllllllllIlIIllllIIlIIIIIIlI) {
        return lllllllllllllIlIIllllIIlIIIIIIlI == 0;
    }
    
    private static boolean lIllIlIllllIIlI(final int lllllllllllllIlIIllllIIlIIIIIlII) {
        return lllllllllllllIlIIllllIIlIIIIIlII != 0;
    }
    
    private void cleanup() {
        if (lIllIlIllllIlII(this.encoder)) {
            Label_0109: {
                if (lIllIlIllllIIlI(this.encoder.finish() ? 1 : 0)) {
                    do {
                        final ByteBuf lllllllllllllIlIIllllIIlIlllIlll = (ByteBuf)this.encoder.readOutbound();
                        if (lIllIlIllllIIll(lllllllllllllIlIIllllIIlIlllIlll)) {
                            "".length();
                            if ((0x21 ^ 0x25) != (0x34 ^ 0x30)) {
                                return;
                            }
                            break Label_0109;
                        }
                        else {
                            lllllllllllllIlIIllllIIlIlllIlll.release();
                            "".length();
                            "".length();
                        }
                    } while (((0x2A ^ 0x62) & ~(0xD2 ^ 0x9A)) >= ((0xC ^ 0x4A) & ~(0x41 ^ 0x7)));
                    return;
                }
            }
            this.encoder = null;
        }
    }
    
    @Override
    public boolean acceptOutboundMessage(final Object lllllllllllllIlIIllllIIlllIIIIIl) throws Exception {
        int n;
        if (!lIllIlIllllIIIl((lllllllllllllIlIIllllIIlllIIIIIl instanceof HttpContent) ? 1 : 0) || lIllIlIllllIIlI((lllllllllllllIlIIllllIIlllIIIIIl instanceof HttpResponse) ? 1 : 0)) {
            n = HttpContentEncoder.lIIIIIlIIlIllI[0];
            "".length();
            if ((0x2 ^ 0x4E ^ (0x9 ^ 0x41)) == 0x0) {
                return ((96 + 186 - 166 + 105 ^ 55 + 123 - 70 + 47) & (163 + 91 - 57 + 16 ^ 27 + 20 + 46 + 54 ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = HttpContentEncoder.lIIIIIlIIlIllI[1];
        }
        return n != 0;
    }
    
    protected abstract Result beginEncode(final HttpResponse p0, final String p1) throws Exception;
    
    private enum State
    {
        AWAIT_CONTENT, 
        PASS_THROUGH;
        
        private static final /* synthetic */ int[] llllIIIIllllI;
        
        AWAIT_HEADERS;
        
        private static final /* synthetic */ String[] llllIIIIllIll;
        
        private static String lIlIIlllIlIIlll(final String lllllllllllllIlIllllIIllIIlIIlII, final String lllllllllllllIlIllllIIllIIlIIIll) {
            try {
                final SecretKeySpec lllllllllllllIlIllllIIllIIlIIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllllIIllIIlIIIll.getBytes(StandardCharsets.UTF_8)), State.llllIIIIllllI[4]), "DES");
                final Cipher lllllllllllllIlIllllIIllIIlIIllI = Cipher.getInstance("DES");
                lllllllllllllIlIllllIIllIIlIIllI.init(State.llllIIIIllllI[2], lllllllllllllIlIllllIIllIIlIIlll);
                return new String(lllllllllllllIlIllllIIllIIlIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllllIIllIIlIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIllllIIllIIlIIlIl) {
                lllllllllllllIlIllllIIllIIlIIlIl.printStackTrace();
                return null;
            }
        }
        
        static {
            lIlIIlllIlIlIlI();
            lIlIIlllIlIlIII();
            final State[] $values = new State[State.llllIIIIllllI[3]];
            $values[State.llllIIIIllllI[0]] = State.PASS_THROUGH;
            $values[State.llllIIIIllllI[1]] = State.AWAIT_HEADERS;
            $values[State.llllIIIIllllI[2]] = State.AWAIT_CONTENT;
            $VALUES = $values;
        }
        
        private static void lIlIIlllIlIlIlI() {
            (llllIIIIllllI = new int[5])[0] = (("  ".length() ^ (0xF0 ^ 0x92)) & (0xA5 ^ 0xC0 ^ (0x7 ^ 0x2) ^ -" ".length()));
            State.llllIIIIllllI[1] = " ".length();
            State.llllIIIIllllI[2] = "  ".length();
            State.llllIIIIllllI[3] = "   ".length();
            State.llllIIIIllllI[4] = (0xB8 ^ 0xB0);
        }
        
        private static void lIlIIlllIlIlIII() {
            (llllIIIIllIll = new String[State.llllIIIIllllI[3]])[State.llllIIIIllllI[0]] = lIlIIlllIlIIlll("I/OOvHrHqIlqiLr3MnYn6g==", "CupiO");
            State.llllIIIIllIll[State.llllIIIIllllI[1]] = lIlIIlllIlIIlll("PyQuEPHt6RTlPErU4S5Ziw==", "xWxuC");
            State.llllIIIIllIll[State.llllIIIIllllI[2]] = lIlIIlllIlIIlll("2u/BvFBzOZSsePxbQiZteA==", "dZPCA");
        }
    }
    
    public static final class Result
    {
        private static final /* synthetic */ String[] llIIIlIIIIIllI;
        private final /* synthetic */ String targetContentEncoding;
        private static final /* synthetic */ int[] llIIIlIIIIlIlI;
        private final /* synthetic */ EmbeddedChannel contentEncoder;
        
        static {
            lIIIlIIIlIlIllll();
            lIIIlIIIlIlIllII();
        }
        
        private static boolean lIIIlIIIlIllIIII(final Object llllllllllllIlllIllIIlIIIIlIlIlI) {
            return llllllllllllIlllIllIIlIIIIlIlIlI == null;
        }
        
        public EmbeddedChannel contentEncoder() {
            return this.contentEncoder;
        }
        
        public Result(final String llllllllllllIlllIllIIlIIIlIIllIl, final EmbeddedChannel llllllllllllIlllIllIIlIIIlIIllII) {
            if (lIIIlIIIlIllIIII(llllllllllllIlllIllIIlIIIlIIllIl)) {
                throw new NullPointerException(Result.llIIIlIIIIIllI[Result.llIIIlIIIIlIlI[0]]);
            }
            if (lIIIlIIIlIllIIII(llllllllllllIlllIllIIlIIIlIIllII)) {
                throw new NullPointerException(Result.llIIIlIIIIIllI[Result.llIIIlIIIIlIlI[1]]);
            }
            this.targetContentEncoding = llllllllllllIlllIllIIlIIIlIIllIl;
            this.contentEncoder = llllllllllllIlllIllIIlIIIlIIllII;
        }
        
        private static String lIIIlIIIlIlIlIIl(final String llllllllllllIlllIllIIlIIIIllllII, final String llllllllllllIlllIllIIlIIIIllllIl) {
            try {
                final SecretKeySpec llllllllllllIlllIllIIlIIIlIIIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIIIIllllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher llllllllllllIlllIllIIlIIIlIIIIII = Cipher.getInstance("Blowfish");
                llllllllllllIlllIllIIlIIIlIIIIII.init(Result.llIIIlIIIIlIlI[2], llllllllllllIlllIllIIlIIIlIIIIIl);
                return new String(llllllllllllIlllIllIIlIIIlIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIIIIllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIIlIIIIllllll) {
                llllllllllllIlllIllIIlIIIIllllll.printStackTrace();
                return null;
            }
        }
        
        private static String lIIIlIIIlIlIlIll(final String llllllllllllIlllIllIIlIIIIllIIIl, final String llllllllllllIlllIllIIlIIIIlIlllI) {
            try {
                final SecretKeySpec llllllllllllIlllIllIIlIIIIllIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIIIIlIlllI.getBytes(StandardCharsets.UTF_8)), Result.llIIIlIIIIlIlI[3]), "DES");
                final Cipher llllllllllllIlllIllIIlIIIIllIIll = Cipher.getInstance("DES");
                llllllllllllIlllIllIIlIIIIllIIll.init(Result.llIIIlIIIIlIlI[2], llllllllllllIlllIllIIlIIIIllIlII);
                return new String(llllllllllllIlllIllIIlIIIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIIIIllIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception llllllllllllIlllIllIIlIIIIllIIlI) {
                llllllllllllIlllIllIIlIIIIllIIlI.printStackTrace();
                return null;
            }
        }
        
        private static void lIIIlIIIlIlIllII() {
            (llIIIlIIIIIllI = new String[Result.llIIIlIIIIlIlI[2]])[Result.llIIIlIIIIlIlI[0]] = lIIIlIIIlIlIlIIl("yiQlSl1/U80Og4i4bfAyv8xdrupXDClK", "UBNkW");
            Result.llIIIlIIIIIllI[Result.llIIIlIIIIlIlI[1]] = lIIIlIIIlIlIlIll("v67S99YOQLvXP3tO78qByA==", "WRZom");
        }
        
        public String targetContentEncoding() {
            return this.targetContentEncoding;
        }
        
        private static void lIIIlIIIlIlIllll() {
            (llIIIlIIIIlIlI = new int[4])[0] = ((0xCF ^ 0x90) & ~(0x7C ^ 0x23));
            Result.llIIIlIIIIlIlI[1] = " ".length();
            Result.llIIIlIIIIlIlI[2] = "  ".length();
            Result.llIIIlIIIIlIlI[3] = (0x6B ^ 0x63);
        }
    }
}
