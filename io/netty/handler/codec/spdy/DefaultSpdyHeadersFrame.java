// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.Iterator;
import java.util.Map;
import io.netty.util.internal.StringUtil;

public class DefaultSpdyHeadersFrame extends DefaultSpdyStreamFrame implements SpdyHeadersFrame
{
    private /* synthetic */ boolean invalid;
    private final /* synthetic */ SpdyHeaders headers;
    private /* synthetic */ boolean truncated;
    private static final /* synthetic */ String[] lllIIlllIlllll;
    private static final /* synthetic */ int[] lllIIllllIIIII;
    
    public DefaultSpdyHeadersFrame(final int llllllllllllIlIlllIllIlIIIlllllI) {
        super(llllllllllllIlIlllIllIlIIIlllllI);
        this.headers = new DefaultSpdyHeaders();
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlIlllIllIlIIIIlllIl = new StringBuilder();
        llllllllllllIlIlllIllIlIIIIlllIl.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[1]]);
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(this.isLast());
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append((char)DefaultSpdyHeadersFrame.lllIIllllIIIII[2]);
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[0]]);
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(this.streamId());
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[3]]);
        "".length();
        llllllllllllIlIlllIllIlIIIIlllIl.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(llllllllllllIlIlllIllIlIIIIlllIl);
        llllllllllllIlIlllIllIlIIIIlllIl.setLength(llllllllllllIlIlllIllIlIIIIlllIl.length() - StringUtil.NEWLINE.length());
        return String.valueOf(llllllllllllIlIlllIllIlIIIIlllIl);
    }
    
    protected void appendHeaders(final StringBuilder llllllllllllIlIlllIllIlIIIIlIIIl) {
        final Iterator llllllllllllIlIlllIllIlIIIIlIlIl = this.headers().iterator();
        while (lIlIIIIIllIIlIlI(llllllllllllIlIlllIllIlIIIIlIlIl.hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> llllllllllllIlIlllIllIlIIIIlIllI = llllllllllllIlIlllIllIlIIIIlIlIl.next();
            llllllllllllIlIlllIllIlIIIIlIIIl.append(DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[4]]);
            "".length();
            llllllllllllIlIlllIllIlIIIIlIIIl.append(llllllllllllIlIlllIllIlIIIIlIllI.getKey());
            "".length();
            llllllllllllIlIlllIllIlIIIIlIIIl.append(DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[5]]);
            "".length();
            llllllllllllIlIlllIllIlIIIIlIIIl.append(llllllllllllIlIlllIllIlIIIIlIllI.getValue());
            "".length();
            llllllllllllIlIlllIllIlIIIIlIIIl.append(StringUtil.NEWLINE);
            "".length();
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    @Override
    public SpdyHeaders headers() {
        return this.headers;
    }
    
    @Override
    public SpdyHeadersFrame setLast(final boolean llllllllllllIlIlllIllIlIIIllIIlI) {
        super.setLast(llllllllllllIlIlllIllIlIIIllIIlI);
        "".length();
        return this;
    }
    
    @Override
    public boolean isInvalid() {
        return this.invalid;
    }
    
    @Override
    public boolean isTruncated() {
        return this.truncated;
    }
    
    @Override
    public SpdyHeadersFrame setStreamId(final int llllllllllllIlIlllIllIlIIIllIllI) {
        super.setStreamId(llllllllllllIlIlllIllIlIIIllIllI);
        "".length();
        return this;
    }
    
    static {
        lIlIIIIIllIIlIIl();
        lIlIIIIIllIIIlll();
    }
    
    @Override
    public SpdyHeadersFrame setTruncated() {
        this.truncated = (DefaultSpdyHeadersFrame.lllIIllllIIIII[0] != 0);
        return this;
    }
    
    private static String lIlIIIIIllIIIlIl(final String llllllllllllIlIlllIllIIllllIllII, final String llllllllllllIlIlllIllIIllllIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIIlllllIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIllllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIllIIlllllIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIllIIlllllIIII.init(DefaultSpdyHeadersFrame.lllIIllllIIIII[3], llllllllllllIlIlllIllIIlllllIIIl);
            return new String(llllllllllllIlIlllIllIIlllllIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIllllIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIIllllIllll) {
            llllllllllllIlIlllIllIIllllIllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIIIllIIlIlI(final int llllllllllllIlIlllIllIIllllIIlll) {
        return llllllllllllIlIlllIllIIllllIIlll != 0;
    }
    
    private static void lIlIIIIIllIIlIIl() {
        (lllIIllllIIIII = new int[8])[0] = " ".length();
        DefaultSpdyHeadersFrame.lllIIllllIIIII[1] = ((0x5F ^ 0x40) & ~(0x59 ^ 0x46));
        DefaultSpdyHeadersFrame.lllIIllllIIIII[2] = (153 + 25 - 176 + 172 ^ 49 + 5 + 24 + 57);
        DefaultSpdyHeadersFrame.lllIIllllIIIII[3] = "  ".length();
        DefaultSpdyHeadersFrame.lllIIllllIIIII[4] = "   ".length();
        DefaultSpdyHeadersFrame.lllIIllllIIIII[5] = (0x96 ^ 0x92);
        DefaultSpdyHeadersFrame.lllIIllllIIIII[6] = (0x2D ^ 0x28);
        DefaultSpdyHeadersFrame.lllIIllllIIIII[7] = (0x89 ^ 0x81);
    }
    
    private static void lIlIIIIIllIIIlll() {
        (lllIIlllIlllll = new String[DefaultSpdyHeadersFrame.lllIIllllIIIII[6]])[DefaultSpdyHeadersFrame.lllIIllllIIIII[1]] = lIlIIIIIllIIIlIl("z9541PvpdhU=", "sZBTK");
        DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[0]] = lIlIIIIIllIIIlIl("7ebOOXSPSmMsvLCsVAxo24a6RnxHHSKK", "Ibqqo");
        DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[3]] = lIlIIIIIllIIIlIl("oApcGCStQj8Uxe8vLvQ7lA==", "Lihez");
        DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[4]] = lIlIIIIIllIIIllI("mRVQdB7qqyQ=", "NIeOa");
        DefaultSpdyHeadersFrame.lllIIlllIlllll[DefaultSpdyHeadersFrame.lllIIllllIIIII[5]] = lIlIIIIIllIIIllI("+tS8PgbjN9A=", "JLaFj");
    }
    
    @Override
    public SpdyHeadersFrame setInvalid() {
        this.invalid = (DefaultSpdyHeadersFrame.lllIIllllIIIII[0] != 0);
        return this;
    }
    
    private static String lIlIIIIIllIIIllI(final String llllllllllllIlIlllIllIIllllllIll, final String llllllllllllIlIlllIllIIllllllIlI) {
        try {
            final SecretKeySpec llllllllllllIlIlllIllIIllllllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIllIIllllllIlI.getBytes(StandardCharsets.UTF_8)), DefaultSpdyHeadersFrame.lllIIllllIIIII[7]), "DES");
            final Cipher llllllllllllIlIlllIllIIlllllllIl = Cipher.getInstance("DES");
            llllllllllllIlIlllIllIIlllllllIl.init(DefaultSpdyHeadersFrame.lllIIllllIIIII[3], llllllllllllIlIlllIllIIllllllllI);
            return new String(llllllllllllIlIlllIllIIlllllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIllIIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIllIIlllllllII) {
            llllllllllllIlIlllIllIIlllllllII.printStackTrace();
            return null;
        }
    }
}
