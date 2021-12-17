// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCountUtil;
import java.util.List;
import io.netty.channel.ChannelHandlerContext;
import java.util.LinkedList;
import java.util.Queue;
import io.netty.handler.codec.http.HttpMessage;
import io.netty.handler.codec.MessageToMessageCodec;

public class SpdyHttpResponseStreamIdHandler extends MessageToMessageCodec<Object, HttpMessage>
{
    private static final /* synthetic */ String[] lIllIlIlIIllll;
    private final /* synthetic */ Queue<Integer> ids;
    private static final /* synthetic */ int[] lIllIlIlIlIIIl;
    private static final /* synthetic */ Integer NO_ID;
    
    private static boolean llllllIllIIlIll(final Object llllllllllllIllllllllllIIlIIllII) {
        return llllllllllllIllllllllllIIlIIllII != null;
    }
    
    private static boolean llllllIllIIllIl(final int llllllllllllIllllllllllIIlIIllll, final int llllllllllllIllllllllllIIlIIlllI) {
        return llllllllllllIllllllllllIIlIIllll < llllllllllllIllllllllllIIlIIlllI;
    }
    
    private static boolean llllllIllIIlIIl(final int llllllllllllIllllllllllIIlIIlIII) {
        return llllllllllllIllllllllllIIlIIlIII == 0;
    }
    
    public SpdyHttpResponseStreamIdHandler() {
        this.ids = new LinkedList<Integer>();
    }
    
    @Override
    protected void decode(final ChannelHandlerContext llllllllllllIllllllllllIlIIIlIIl, final Object llllllllllllIllllllllllIlIIIIlIl, final List<Object> llllllllllllIllllllllllIlIIIIlII) throws Exception {
        if (llllllIllIIlIlI((llllllllllllIllllllllllIlIIIIlIl instanceof HttpMessage) ? 1 : 0)) {
            final boolean llllllllllllIllllllllllIlIIIlIll = ((HttpMessage)llllllllllllIllllllllllIlIIIIlIl).headers().contains(SpdyHttpResponseStreamIdHandler.lIllIlIlIIllll[SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[0]]);
            if (llllllIllIIlIIl(llllllllllllIllllllllllIlIIIlIll ? 1 : 0)) {
                this.ids.add(SpdyHttpResponseStreamIdHandler.NO_ID);
                "".length();
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
            }
            else {
                this.ids.add(SpdyHttpHeaders.getStreamId((HttpMessage)llllllllllllIllllllllllIlIIIIlIl));
                "".length();
            }
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else if (llllllIllIIlIlI((llllllllllllIllllllllllIlIIIIlIl instanceof SpdyRstStreamFrame) ? 1 : 0)) {
            this.ids.remove(((SpdyRstStreamFrame)llllllllllllIllllllllllIlIIIIlIl).streamId());
            "".length();
        }
        llllllllllllIllllllllllIlIIIIlII.add(ReferenceCountUtil.retain(llllllllllllIllllllllllIlIIIIlIl));
        "".length();
    }
    
    private static void llllllIllIIIIlI() {
        (lIllIlIlIIllll = new String[SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[3]])[SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[1]] = llllllIllIIIIII("HXVpeCH5RiSyNk321KlpRBhSU3KD4UmE", "gaYwS");
        SpdyHttpResponseStreamIdHandler.lIllIlIlIIllll[SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[0]] = llllllIllIIIIIl("FEEGERcVQQY1ISkNOGwaCA==", "LlUAS");
    }
    
    static {
        llllllIllIIlIII();
        llllllIllIIIIlI();
        NO_ID = SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[2];
    }
    
    private static void llllllIllIIlIII() {
        (lIllIlIlIlIIIl = new int[5])[0] = " ".length();
        SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[1] = ((0x1E ^ 0x23) & ~(0x27 ^ 0x1A));
        SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[2] = -" ".length();
        SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[3] = "  ".length();
        SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[4] = (0x86 ^ 0x8E);
    }
    
    private static boolean llllllIllIIllII(final int llllllllllllIllllllllllIIlIIIlIl, final int llllllllllllIllllllllllIIlIIIlII) {
        return llllllllllllIllllllllllIIlIIIlIl != llllllllllllIllllllllllIIlIIIlII;
    }
    
    private static String llllllIllIIIIII(final String llllllllllllIllllllllllIIllIllIl, final String llllllllllllIllllllllllIIllIlllI) {
        try {
            final SecretKeySpec llllllllllllIllllllllllIIlllIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllllllIIllIlllI.getBytes(StandardCharsets.UTF_8)), SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[4]), "DES");
            final Cipher llllllllllllIllllllllllIIlllIIIl = Cipher.getInstance("DES");
            llllllllllllIllllllllllIIlllIIIl.init(SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[3], llllllllllllIllllllllllIIlllIIlI);
            return new String(llllllllllllIllllllllllIIlllIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllllllllllIIllIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllllllIIlllIIII) {
            llllllllllllIllllllllllIIlllIIII.printStackTrace();
            return null;
        }
    }
    
    private static String llllllIllIIIIIl(String llllllllllllIllllllllllIIlIllIlI, final String llllllllllllIllllllllllIIlIllllI) {
        llllllllllllIllllllllllIIlIllIlI = (Exception)new String(Base64.getDecoder().decode(((String)llllllllllllIllllllllllIIlIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllllllIIlIlllIl = new StringBuilder();
        final char[] llllllllllllIllllllllllIIlIlllII = llllllllllllIllllllllllIIlIllllI.toCharArray();
        int llllllllllllIllllllllllIIlIllIll = SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[1];
        final float llllllllllllIllllllllllIIlIlIlIl = (Object)((String)llllllllllllIllllllllllIIlIllIlI).toCharArray();
        final long llllllllllllIllllllllllIIlIlIlII = llllllllllllIllllllllllIIlIlIlIl.length;
        float llllllllllllIllllllllllIIlIlIIll = SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[1];
        while (llllllIllIIllIl((int)llllllllllllIllllllllllIIlIlIIll, (int)llllllllllllIllllllllllIIlIlIlII)) {
            final char llllllllllllIllllllllllIIllIIIII = llllllllllllIllllllllllIIlIlIlIl[llllllllllllIllllllllllIIlIlIIll];
            llllllllllllIllllllllllIIlIlllIl.append((char)(llllllllllllIllllllllllIIllIIIII ^ llllllllllllIllllllllllIIlIlllII[llllllllllllIllllllllllIIlIllIll % llllllllllllIllllllllllIIlIlllII.length]));
            "".length();
            ++llllllllllllIllllllllllIIlIllIll;
            ++llllllllllllIllllllllllIIlIlIIll;
            "".length();
            if (((27 + 109 - 24 + 45 ^ 54 + 34 - 31 + 98) & (0x2D ^ 0x6B ^ (0x7E ^ 0x3E) ^ -" ".length())) < 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllllllIIlIlllIl);
    }
    
    @Override
    public boolean acceptInboundMessage(final Object llllllllllllIllllllllllIlIIlllIl) throws Exception {
        int n;
        if (!llllllIllIIlIIl((llllllllllllIllllllllllIlIIlllIl instanceof HttpMessage) ? 1 : 0) || llllllIllIIlIlI((llllllllllllIllllllllllIlIIlllIl instanceof SpdyRstStreamFrame) ? 1 : 0)) {
            n = SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[0];
            "".length();
            if (" ".length() == "  ".length()) {
                return ((0xF7 ^ 0x95 ^ (0x1A ^ 0x42)) & (0xAB ^ 0x85 ^ (0x82 ^ 0x96) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[1];
        }
        return n != 0;
    }
    
    @Override
    protected void encode(final ChannelHandlerContext llllllllllllIllllllllllIlIIlIlll, final HttpMessage llllllllllllIllllllllllIlIIlIIlI, final List<Object> llllllllllllIllllllllllIlIIlIIIl) throws Exception {
        final Integer llllllllllllIllllllllllIlIIlIlII = this.ids.poll();
        if (llllllIllIIlIll(llllllllllllIllllllllllIlIIlIlII) && llllllIllIIllII(llllllllllllIllllllllllIlIIlIlII, SpdyHttpResponseStreamIdHandler.NO_ID) && llllllIllIIlIIl(llllllllllllIllllllllllIlIIlIIlI.headers().contains(SpdyHttpResponseStreamIdHandler.lIllIlIlIIllll[SpdyHttpResponseStreamIdHandler.lIllIlIlIlIIIl[1]]) ? 1 : 0)) {
            SpdyHttpHeaders.setStreamId(llllllllllllIllllllllllIlIIlIIlI, llllllllllllIllllllllllIlIIlIlII);
        }
        llllllllllllIllllllllllIlIIlIIIl.add(ReferenceCountUtil.retain(llllllllllllIllllllllllIlIIlIIlI));
        "".length();
    }
    
    private static boolean llllllIllIIlIlI(final int llllllllllllIllllllllllIIlIIlIlI) {
        return llllllllllllIllllllllllIIlIIlIlI != 0;
    }
}
