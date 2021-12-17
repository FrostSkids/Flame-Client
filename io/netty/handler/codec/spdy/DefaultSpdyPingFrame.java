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

public class DefaultSpdyPingFrame implements SpdyPingFrame
{
    private static final /* synthetic */ int[] lllIllllIIIlll;
    private static final /* synthetic */ String[] lllIllllIIIIII;
    private /* synthetic */ int id;
    
    @Override
    public int id() {
        return this.id;
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlIllIIIIIIlIIlllllI = new StringBuilder();
        llllllllllllIlIllIIIIIIlIIlllllI.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlIllIIIIIIlIIlllllI.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlIllIIIIIIlIIlllllI.append(DefaultSpdyPingFrame.lllIllllIIIIII[DefaultSpdyPingFrame.lllIllllIIIlll[0]]);
        "".length();
        llllllllllllIlIllIIIIIIlIIlllllI.append(this.id());
        "".length();
        return String.valueOf(llllllllllllIlIllIIIIIIlIIlllllI);
    }
    
    private static void lIlIIlIllllIlIlI() {
        (lllIllllIIIlll = new int[3])[0] = ((0x67 ^ 0x5F) & ~(0xAD ^ 0x95));
        DefaultSpdyPingFrame.lllIllllIIIlll[1] = " ".length();
        DefaultSpdyPingFrame.lllIllllIIIlll[2] = "  ".length();
    }
    
    @Override
    public SpdyPingFrame setId(final int llllllllllllIlIllIIIIIIlIlIIIIlI) {
        this.id = llllllllllllIlIllIIIIIIlIlIIIIlI;
        return this;
    }
    
    public DefaultSpdyPingFrame(final int llllllllllllIlIllIIIIIIlIlIIllIl) {
        this.setId(llllllllllllIlIllIIIIIIlIlIIllIl);
        "".length();
    }
    
    private static String lIlIIlIllllIIlIl(final String llllllllllllIlIllIIIIIIlIIlIllll, final String llllllllllllIlIllIIIIIIlIIlIlllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIIIlIIllIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIIIlIIlIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIIIIIIlIIllIIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIIIIIIlIIllIIll.init(DefaultSpdyPingFrame.lllIllllIIIlll[2], llllllllllllIlIllIIIIIIlIIllIlII);
            return new String(llllllllllllIlIllIIIIIIlIIllIIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIIIlIIlIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIIIlIIllIIlI) {
            llllllllllllIlIllIIIIIIlIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIlIllllIlIlI();
        lIlIIlIllllIIlll();
    }
    
    private static void lIlIIlIllllIIlll() {
        (lllIllllIIIIII = new String[DefaultSpdyPingFrame.lllIllllIIIlll[1]])[DefaultSpdyPingFrame.lllIllllIIIlll[0]] = lIlIIlIllllIIlIl("PLRjPDwWgg3PKeAgHlXQcQ==", "TTcRC");
    }
}
