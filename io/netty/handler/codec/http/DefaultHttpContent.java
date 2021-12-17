// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.http;

import io.netty.util.ReferenceCounted;
import io.netty.util.internal.StringUtil;
import io.netty.buffer.ByteBufHolder;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;

public class DefaultHttpContent extends DefaultHttpObject implements HttpContent
{
    private static final /* synthetic */ String[] llIllIIllIIIll;
    private final /* synthetic */ ByteBuf content;
    private static final /* synthetic */ int[] llIllIIllllIIl;
    
    private static String lIIlIlllIIlIIIII(final String llllllllllllIllIIlllIllIIlIIIlIl, final String llllllllllllIllIIlllIllIIlIIIIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIllIIlIIlIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIllIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), DefaultHttpContent.llIllIIllllIIl[5]), "DES");
            final Cipher llllllllllllIllIIlllIllIIlIIIlll = Cipher.getInstance("DES");
            llllllllllllIllIIlllIllIIlIIIlll.init(DefaultHttpContent.llIllIIllllIIl[2], llllllllllllIllIIlllIllIIlIIlIII);
            return new String(llllllllllllIllIIlllIllIIlIIIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIllIIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIllIIlIIIllI) {
            llllllllllllIllIIlllIllIIlIIIllI.printStackTrace();
            return null;
        }
    }
    
    public DefaultHttpContent(final ByteBuf llllllllllllIllIIlllIllIlIIlIlIl) {
        if (lIIlIlllIlIIlIIl(llllllllllllIllIIlllIllIlIIlIlIl)) {
            throw new NullPointerException(DefaultHttpContent.llIllIIllIIIll[DefaultHttpContent.llIllIIllllIIl[0]]);
        }
        this.content = llllllllllllIllIIlllIllIlIIlIlIl;
    }
    
    @Override
    public HttpContent copy() {
        return new DefaultHttpContent(this.content.copy());
    }
    
    @Override
    public boolean release(final int llllllllllllIllIIlllIllIIlllIlIl) {
        return this.content.release(llllllllllllIllIIlllIllIIlllIlIl);
    }
    
    @Override
    public int refCnt() {
        return this.content.refCnt();
    }
    
    static {
        lIIlIlllIlIIlIII();
        lIIlIlllIIlIIIIl();
    }
    
    private static void lIIlIlllIIlIIIIl() {
        (llIllIIllIIIll = new String[DefaultHttpContent.llIllIIllllIIl[4]])[DefaultHttpContent.llIllIIllllIIl[0]] = lIIlIlllIIIlllll("THGWFPkeQUY=", "krZLB");
        DefaultHttpContent.llIllIIllIIIll[DefaultHttpContent.llIllIIllllIIl[1]] = lIIlIlllIIlIIIII("8bYqBksbFJ8=", "oyTVb");
        DefaultHttpContent.llIllIIllIIIll[DefaultHttpContent.llIllIIllllIIl[2]] = lIIlIlllIIIlllll("XPdBiLQtXmHAW3MA3DPVT0MB5hLwHLzR", "PWYVd");
    }
    
    @Override
    public ByteBuf content() {
        return this.content;
    }
    
    @Override
    public boolean release() {
        return this.content.release();
    }
    
    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append(StringUtil.simpleClassName(this)).append(DefaultHttpContent.llIllIIllIIIll[DefaultHttpContent.llIllIIllllIIl[1]]).append(this.content()).append(DefaultHttpContent.llIllIIllIIIll[DefaultHttpContent.llIllIIllllIIl[2]]).append(this.getDecoderResult()).append((char)DefaultHttpContent.llIllIIllllIIl[3]));
    }
    
    @Override
    public HttpContent duplicate() {
        return new DefaultHttpContent(this.content.duplicate());
    }
    
    private static void lIIlIlllIlIIlIII() {
        (llIllIIllllIIl = new int[6])[0] = ((0x3A ^ 0x73) & ~(0x1 ^ 0x48));
        DefaultHttpContent.llIllIIllllIIl[1] = " ".length();
        DefaultHttpContent.llIllIIllllIIl[2] = "  ".length();
        DefaultHttpContent.llIllIIllllIIl[3] = (0x12 ^ 0x8 ^ (0x26 ^ 0x15));
        DefaultHttpContent.llIllIIllllIIl[4] = "   ".length();
        DefaultHttpContent.llIllIIllllIIl[5] = (0x3B ^ 0x70 ^ (0xDE ^ 0x9D));
    }
    
    private static String lIIlIlllIIIlllll(final String llllllllllllIllIIlllIllIIlIlIIlI, final String llllllllllllIllIIlllIllIIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIllIIlIlIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIllIIlIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIlllIllIIlIlIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIlllIllIIlIlIlII.init(DefaultHttpContent.llIllIIllllIIl[2], llllllllllllIllIIlllIllIIlIlIlIl);
            return new String(llllllllllllIllIIlllIllIIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIllIIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIllIIlIlIIll) {
            llllllllllllIllIIlllIllIIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public HttpContent retain() {
        this.content.retain();
        "".length();
        return this;
    }
    
    private static boolean lIIlIlllIlIIlIIl(final Object llllllllllllIllIIlllIllIIIlllllI) {
        return llllllllllllIllIIlllIllIIIlllllI == null;
    }
    
    @Override
    public HttpContent retain(final int llllllllllllIllIIlllIllIlIIIIIII) {
        this.content.retain(llllllllllllIllIIlllIllIlIIIIIII);
        "".length();
        return this;
    }
}
