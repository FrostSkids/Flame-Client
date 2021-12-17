// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.buffer.Unpooled;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.ReferenceCounted;
import io.netty.buffer.ByteBufHolder;
import io.netty.buffer.ByteBuf;

public class DefaultFullHttpRequest extends DefaultHttpRequest implements FullHttpRequest
{
    private final /* synthetic */ ByteBuf content;
    private final /* synthetic */ HttpHeaders trailingHeader;
    private static final /* synthetic */ String[] lIlIIIIlIlIIll;
    private static final /* synthetic */ int[] lIlIIIIlIlIlII;
    private final /* synthetic */ boolean validateHeaders;
    
    @Override
    public FullHttpRequest setMethod(final HttpMethod lllllllllllllIIlIIIIlIIlIIlIlIlI) {
        super.setMethod(lllllllllllllIIlIIIIlIIlIIlIlIlI);
        "".length();
        return this;
    }
    
    @Override
    public int refCnt() {
        return this.content.refCnt();
    }
    
    @Override
    public boolean release(final int lllllllllllllIIlIIIIlIIlIIllIllI) {
        return this.content.release(lllllllllllllIIlIIIIlIIlIIllIllI);
    }
    
    private static void lllIIIIlIllIlIl() {
        (lIlIIIIlIlIIll = new String[DefaultFullHttpRequest.lIlIIIIlIlIlII[1]])[DefaultFullHttpRequest.lIlIIIIlIlIlII[0]] = lllIIIIlIllIlII("85G/qtv+Fos=", "kGImb");
    }
    
    @Override
    public HttpHeaders trailingHeaders() {
        return this.trailingHeader;
    }
    
    private static String lllIIIIlIllIlII(final String lllllllllllllIIlIIIIlIIIlIllIlll, final String lllllllllllllIIlIIIIlIIIlIllIlII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIIIlIIIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIIIlIIIlIllIlII.getBytes(StandardCharsets.UTF_8)), DefaultFullHttpRequest.lIlIIIIlIlIlII[2]), "DES");
            final Cipher lllllllllllllIIlIIIIlIIIlIlllIIl = Cipher.getInstance("DES");
            lllllllllllllIIlIIIIlIIIlIlllIIl.init(DefaultFullHttpRequest.lIlIIIIlIlIlII[3], lllllllllllllIIlIIIIlIIIlIlllIlI);
            return new String(lllllllllllllIIlIIIIlIIIlIlllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIIIlIIIlIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIIIlIIIlIlllIII) {
            lllllllllllllIIlIIIIlIIIlIlllIII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIIIIlIllIllI() {
        (lIlIIIIlIlIlII = new int[4])[0] = ((0x64 ^ 0x5E) & ~(0x22 ^ 0x18));
        DefaultFullHttpRequest.lIlIIIIlIlIlII[1] = " ".length();
        DefaultFullHttpRequest.lIlIIIIlIlIlII[2] = (0xB1 ^ 0xB9);
        DefaultFullHttpRequest.lIlIIIIlIlIlII[3] = "  ".length();
    }
    
    @Override
    public FullHttpRequest retain() {
        this.content.retain();
        "".length();
        return this;
    }
    
    public DefaultFullHttpRequest(final HttpVersion lllllllllllllIIlIIIIlIIlIlllIIlI, final HttpMethod lllllllllllllIIlIIIIlIIlIlllIlIl, final String lllllllllllllIIlIIIIlIIlIlllIIII) {
        this(lllllllllllllIIlIIIIlIIlIlllIIlI, lllllllllllllIIlIIIIlIIlIlllIlIl, lllllllllllllIIlIIIIlIIlIlllIIII, Unpooled.buffer(DefaultFullHttpRequest.lIlIIIIlIlIlII[0]));
    }
    
    @Override
    public boolean release() {
        return this.content.release();
    }
    
    private static boolean lllIIIIlIllIlll(final Object lllllllllllllIIlIIIIlIIIlIllIIII) {
        return lllllllllllllIIlIIIIlIIIlIllIIII == null;
    }
    
    @Override
    public FullHttpRequest setUri(final String lllllllllllllIIlIIIIlIIlIIlIIIlI) {
        super.setUri(lllllllllllllIIlIIIIlIIlIIlIIIlI);
        "".length();
        return this;
    }
    
    public DefaultFullHttpRequest(final HttpVersion lllllllllllllIIlIIIIlIIlIllIIlII, final HttpMethod lllllllllllllIIlIIIIlIIlIllIIIll, final String lllllllllllllIIlIIIIlIIlIllIIIlI, final ByteBuf lllllllllllllIIlIIIIlIIlIllIIllI) {
        this(lllllllllllllIIlIIIIlIIlIllIIlII, lllllllllllllIIlIIIIlIIlIllIIIll, lllllllllllllIIlIIIIlIIlIllIIIlI, lllllllllllllIIlIIIIlIIlIllIIllI, (boolean)(DefaultFullHttpRequest.lIlIIIIlIlIlII[1] != 0));
    }
    
    @Override
    public FullHttpRequest setProtocolVersion(final HttpVersion lllllllllllllIIlIIIIlIIlIIllIIII) {
        super.setProtocolVersion(lllllllllllllIIlIIIIlIIlIIllIIII);
        "".length();
        return this;
    }
    
    public DefaultFullHttpRequest(final HttpVersion lllllllllllllIIlIIIIlIIlIlIllIIl, final HttpMethod lllllllllllllIIlIIIIlIIlIlIlIIlI, final String lllllllllllllIIlIIIIlIIlIlIlIlll, final ByteBuf lllllllllllllIIlIIIIlIIlIlIlIIII, final boolean lllllllllllllIIlIIIIlIIlIlIlIlIl) {
        super(lllllllllllllIIlIIIIlIIlIlIllIIl, lllllllllllllIIlIIIIlIIlIlIlIIlI, lllllllllllllIIlIIIIlIIlIlIlIlll, lllllllllllllIIlIIIIlIIlIlIlIlIl);
        if (lllIIIIlIllIlll(lllllllllllllIIlIIIIlIIlIlIlIIII)) {
            throw new NullPointerException(DefaultFullHttpRequest.lIlIIIIlIlIIll[DefaultFullHttpRequest.lIlIIIIlIlIlII[0]]);
        }
        this.content = lllllllllllllIIlIIIIlIIlIlIlIIII;
        this.trailingHeader = new DefaultHttpHeaders(lllllllllllllIIlIIIIlIIlIlIlIlIl);
        this.validateHeaders = lllllllllllllIIlIIIIlIIlIlIlIlIl;
    }
    
    @Override
    public FullHttpRequest copy() {
        final DefaultFullHttpRequest lllllllllllllIIlIIIIlIIlIIIllllI = new DefaultFullHttpRequest(this.getProtocolVersion(), this.getMethod(), this.getUri(), this.content().copy(), this.validateHeaders);
        lllllllllllllIIlIIIIlIIlIIIllllI.headers().set(this.headers());
        "".length();
        lllllllllllllIIlIIIIlIIlIIIllllI.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIIlIIIIlIIlIIIllllI;
    }
    
    @Override
    public FullHttpRequest duplicate() {
        final DefaultFullHttpRequest lllllllllllllIIlIIIIlIIlIIIllIII = new DefaultFullHttpRequest(this.getProtocolVersion(), this.getMethod(), this.getUri(), this.content().duplicate(), this.validateHeaders);
        lllllllllllllIIlIIIIlIIlIIIllIII.headers().set(this.headers());
        "".length();
        lllllllllllllIIlIIIIlIIlIIIllIII.trailingHeaders().set(this.trailingHeaders());
        "".length();
        return lllllllllllllIIlIIIIlIIlIIIllIII;
    }
    
    @Override
    public ByteBuf content() {
        return this.content;
    }
    
    static {
        lllIIIIlIllIllI();
        lllIIIIlIllIlIl();
    }
    
    @Override
    public FullHttpRequest retain(final int lllllllllllllIIlIIIIlIIlIIllllll) {
        this.content.retain(lllllllllllllIIlIIIIlIIlIIllllll);
        "".length();
        return this;
    }
}
