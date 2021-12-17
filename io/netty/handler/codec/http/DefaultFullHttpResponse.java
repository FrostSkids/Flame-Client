// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.ReferenceCounted;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;

public class DefaultFullHttpResponse extends DefaultHttpResponse implements FullHttpResponse
{
    private static final /* synthetic */ String[] lIIIIIlIlIlIII;
    private final /* synthetic */ boolean validateHeaders;
    private final /* synthetic */ HttpHeaders trailingHeaders;
    private static final /* synthetic */ int[] lIIIIIlIlIlIIl;
    private final /* synthetic */ ByteBuf content;
    
    private static void lIllIllIIlIIIll() {
        (lIIIIIlIlIlIIl = new int[4])[0] = ((0x9F ^ 0xC2 ^ (0xD2 ^ 0x87)) & (56 + 62 + 60 + 10 ^ 119 + 132 - 105 + 34 ^ -" ".length()));
        DefaultFullHttpResponse.lIIIIIlIlIlIIl[1] = " ".length();
        DefaultFullHttpResponse.lIIIIIlIlIlIIl[2] = (29 + 194 - 182 + 160 ^ 134 + 9 - 85 + 135);
        DefaultFullHttpResponse.lIIIIIlIlIlIIl[3] = "  ".length();
    }
    
    public DefaultFullHttpResponse(final HttpVersion lllllllllllllIlIIlllIlllIllllIll, final HttpResponseStatus lllllllllllllIlIIlllIlllIllllIlI, final ByteBuf lllllllllllllIlIIlllIlllIllllIIl) {
        this(lllllllllllllIlIIlllIlllIllllIll, lllllllllllllIlIIlllIlllIllllIlI, lllllllllllllIlIIlllIlllIllllIIl, (boolean)(DefaultFullHttpResponse.lIIIIIlIlIlIIl[1] != 0));
    }
    
    @Override
    public boolean release(final int lllllllllllllIlIIlllIlllIlIIllIl) {
        return this.content.release(lllllllllllllIlIIlllIlllIlIIllIl);
    }
    
    public DefaultFullHttpResponse(final HttpVersion lllllllllllllIlIIlllIllllIIIIlIl, final HttpResponseStatus lllllllllllllIlIIlllIllllIIIIIIl) {
        this(lllllllllllllIlIIlllIllllIIIIlIl, lllllllllllllIlIIlllIllllIIIIIIl, Unpooled.buffer(DefaultFullHttpResponse.lIIIIIlIlIlIIl[0]));
    }
    
    @Override
    public FullHttpResponse copy() {
        final DefaultFullHttpResponse lllllllllllllIlIIlllIlllIIlllIll = new DefaultFullHttpResponse(this.getProtocolVersion(), this.getStatus(), this.content().copy(), this.validateHeaders);
        lllllllllllllIlIIlllIlllIIlllIll.headers().set(this.headers());
        "".length();
        lllllllllllllIlIIlllIlllIIlllIll.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIlIIlllIlllIIlllIll;
    }
    
    private static String lIllIllIIIIlIll(final String lllllllllllllIlIIlllIllIllIIllll, final String lllllllllllllIlIIlllIllIllIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlllIllIllIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlllIllIllIIlllI.getBytes(StandardCharsets.UTF_8)), DefaultFullHttpResponse.lIIIIIlIlIlIIl[2]), "DES");
            final Cipher lllllllllllllIlIIlllIllIllIlIIll = Cipher.getInstance("DES");
            lllllllllllllIlIIlllIllIllIlIIll.init(DefaultFullHttpResponse.lIIIIIlIlIlIIl[3], lllllllllllllIlIIlllIllIllIlIlII);
            return new String(lllllllllllllIlIIlllIllIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlllIllIllIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlllIllIllIlIIlI) {
            lllllllllllllIlIIlllIllIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public FullHttpResponse retain() {
        this.content.retain();
        "".length();
        return this;
    }
    
    static {
        lIllIllIIlIIIll();
        lIllIllIIIIllIl();
    }
    
    @Override
    public int refCnt() {
        return this.content.refCnt();
    }
    
    @Override
    public HttpHeaders trailingHeaders() {
        return this.trailingHeaders;
    }
    
    @Override
    public ByteBuf content() {
        return this.content;
    }
    
    @Override
    public FullHttpResponse retain(final int lllllllllllllIlIIlllIlllIlIlIllI) {
        this.content.retain(lllllllllllllIlIIlllIlllIlIlIllI);
        "".length();
        return this;
    }
    
    @Override
    public FullHttpResponse setStatus(final HttpResponseStatus lllllllllllllIlIIlllIlllIlIIIIIl) {
        super.setStatus(lllllllllllllIlIIlllIlllIlIIIIIl);
        "".length();
        return this;
    }
    
    @Override
    public boolean release() {
        return this.content.release();
    }
    
    public DefaultFullHttpResponse(final HttpVersion lllllllllllllIlIIlllIlllIllIlIIl, final HttpResponseStatus lllllllllllllIlIIlllIlllIllIlIII, final ByteBuf lllllllllllllIlIIlllIlllIllIllII, final boolean lllllllllllllIlIIlllIlllIllIlIll) {
        super(lllllllllllllIlIIlllIlllIllIlIIl, lllllllllllllIlIIlllIlllIllIlIII, lllllllllllllIlIIlllIlllIllIlIll);
        if (lIllIllIIlIIlIl(lllllllllllllIlIIlllIlllIllIllII)) {
            throw new NullPointerException(DefaultFullHttpResponse.lIIIIIlIlIlIII[DefaultFullHttpResponse.lIIIIIlIlIlIIl[0]]);
        }
        this.content = lllllllllllllIlIIlllIlllIllIllII;
        this.trailingHeaders = new DefaultHttpHeaders(lllllllllllllIlIIlllIlllIllIlIll);
        this.validateHeaders = lllllllllllllIlIIlllIlllIllIlIll;
    }
    
    private static void lIllIllIIIIllIl() {
        (lIIIIIlIlIlIII = new String[DefaultFullHttpResponse.lIIIIIlIlIlIIl[1]])[DefaultFullHttpResponse.lIIIIIlIlIlIIl[0]] = lIllIllIIIIlIll("+87EPQcMzKw=", "Uajqb");
    }
    
    private static boolean lIllIllIIlIIlIl(final Object lllllllllllllIlIIlllIllIllIIIlII) {
        return lllllllllllllIlIIlllIllIllIIIlII == null;
    }
    
    @Override
    public FullHttpResponse duplicate() {
        final DefaultFullHttpResponse lllllllllllllIlIIlllIlllIIllIlIl = new DefaultFullHttpResponse(this.getProtocolVersion(), this.getStatus(), this.content().duplicate(), this.validateHeaders);
        lllllllllllllIlIIlllIlllIIllIlIl.headers().set(this.headers());
        "".length();
        lllllllllllllIlIIlllIlllIIllIlIl.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIlIIlllIlllIIllIlIl;
    }
    
    @Override
    public FullHttpResponse setProtocolVersion(final HttpVersion lllllllllllllIlIIlllIlllIlIIIlIl) {
        super.setProtocolVersion(lllllllllllllIlIIlllIlllIlIIIlIl);
        "".length();
        return this;
    }
}
