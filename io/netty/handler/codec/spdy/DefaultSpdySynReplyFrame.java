// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;

public class DefaultSpdySynReplyFrame extends DefaultSpdyHeadersFrame implements SpdySynReplyFrame
{
    private static final /* synthetic */ int[] lIIlllIlIIlIll;
    private static final /* synthetic */ String[] lIIlllIlIIlIIl;
    
    @Override
    public SpdySynReplyFrame setLast(final boolean lllllllllllllIIlIIlllllIIllIllll) {
        super.setLast(lllllllllllllIIlIIlllllIIllIllll);
        "".length();
        return this;
    }
    
    static {
        llIllIlllIlIlII();
        llIllIlllIlIIll();
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIIlIIlllllIIllIIllI = new StringBuilder();
        lllllllllllllIIlIIlllllIIllIIllI.append(StringUtil.simpleClassName(this));
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(DefaultSpdySynReplyFrame.lIIlllIlIIlIIl[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[0]]);
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(this.isLast());
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append((char)DefaultSpdySynReplyFrame.lIIlllIlIIlIll[1]);
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(DefaultSpdySynReplyFrame.lIIlllIlIIlIIl[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[2]]);
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(this.streamId());
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(DefaultSpdySynReplyFrame.lIIlllIlIIlIIl[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[3]]);
        "".length();
        lllllllllllllIIlIIlllllIIllIIllI.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(lllllllllllllIIlIIlllllIIllIIllI);
        lllllllllllllIIlIIlllllIIllIIllI.setLength(lllllllllllllIIlIIlllllIIllIIllI.length() - StringUtil.NEWLINE.length());
        return String.valueOf(lllllllllllllIIlIIlllllIIllIIllI);
    }
    
    private static void llIllIlllIlIIll() {
        (lIIlllIlIIlIIl = new String[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[4]])[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[0]] = llIllIlllIIlllI("T+LSIhro3P0=", "RWmIM");
        DefaultSpdySynReplyFrame.lIIlllIlIIlIIl[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[2]] = llIllIlllIIlllI("Ax7ChViM8Q8Yb0SSQ0wHMp/yuypcRmhE", "fjvZQ");
        DefaultSpdySynReplyFrame.lIIlllIlIIlIIl[DefaultSpdySynReplyFrame.lIIlllIlIIlIll[3]] = llIllIlllIIlllI("E+6vIL7pFUuJNX3JkEae0Q==", "LNxwY");
    }
    
    public DefaultSpdySynReplyFrame(final int lllllllllllllIIlIIlllllIIllllIll) {
        super(lllllllllllllIIlIIlllllIIllllIll);
    }
    
    private static void llIllIlllIlIlII() {
        (lIIlllIlIIlIll = new int[5])[0] = ((0x44 ^ 0x15) & ~(0x1D ^ 0x4C));
        DefaultSpdySynReplyFrame.lIIlllIlIIlIll[1] = (0x14 ^ 0x3D);
        DefaultSpdySynReplyFrame.lIIlllIlIIlIll[2] = " ".length();
        DefaultSpdySynReplyFrame.lIIlllIlIIlIll[3] = "  ".length();
        DefaultSpdySynReplyFrame.lIIlllIlIIlIll[4] = "   ".length();
    }
    
    @Override
    public SpdySynReplyFrame setInvalid() {
        super.setInvalid();
        "".length();
        return this;
    }
    
    private static String llIllIlllIIlllI(final String lllllllllllllIIlIIlllllIIIllllll, final String lllllllllllllIIlIIlllllIIlIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlllllIIlIIIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlllllIIlIIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlllllIIlIIIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlllllIIlIIIIll.init(DefaultSpdySynReplyFrame.lIIlllIlIIlIll[3], lllllllllllllIIlIIlllllIIlIIIlII);
            return new String(lllllllllllllIIlIIlllllIIlIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlllllIIIllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlllllIIlIIIIlI) {
            lllllllllllllIIlIIlllllIIlIIIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public SpdySynReplyFrame setStreamId(final int lllllllllllllIIlIIlllllIIlllIlIl) {
        super.setStreamId(lllllllllllllIIlIIlllllIIlllIlIl);
        "".length();
        return this;
    }
}
