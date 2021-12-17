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

public abstract class DefaultSpdyStreamFrame implements SpdyStreamFrame
{
    private /* synthetic */ int streamId;
    private /* synthetic */ boolean last;
    private static final /* synthetic */ String[] lIlIlIlIlllIll;
    private static final /* synthetic */ int[] lIlIlIlIlllllI;
    
    @Override
    public SpdyStreamFrame setStreamId(final int lllllllllllllIIIlIIIIIIlIlllIllI) {
        if (lllIlllIllIlIlI(lllllllllllllIIIlIIIIIIlIlllIllI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdyStreamFrame.lIlIlIlIlllIll[DefaultSpdyStreamFrame.lIlIlIlIlllllI[0]]).append(lllllllllllllIIIlIIIIIIlIlllIllI)));
        }
        this.streamId = lllllllllllllIIIlIIIIIIlIlllIllI;
        return this;
    }
    
    private static String lllIlllIllIIIll(final String lllllllllllllIIIlIIIIIIlIllIIIIl, final String lllllllllllllIIIlIIIIIIlIllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIIIIIIlIllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIIIIIIlIllIIIlI.getBytes(StandardCharsets.UTF_8)), DefaultSpdyStreamFrame.lIlIlIlIlllllI[2]), "DES");
            final Cipher lllllllllllllIIIlIIIIIIlIllIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIIIIIIlIllIIlIl.init(DefaultSpdyStreamFrame.lIlIlIlIlllllI[3], lllllllllllllIIIlIIIIIIlIllIIllI);
            return new String(lllllllllllllIIIlIIIIIIlIllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIIIIIIlIllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIIIIIIlIllIIlII) {
            lllllllllllllIIIlIIIIIIlIllIIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lllIlllIllIlIIl() {
        (lIlIlIlIlllllI = new int[4])[0] = ((0x34 ^ 0x2B) & ~(0x7 ^ 0x18));
        DefaultSpdyStreamFrame.lIlIlIlIlllllI[1] = " ".length();
        DefaultSpdyStreamFrame.lIlIlIlIlllllI[2] = (0xCE ^ 0xC6);
        DefaultSpdyStreamFrame.lIlIlIlIlllllI[3] = "  ".length();
    }
    
    @Override
    public boolean isLast() {
        return this.last;
    }
    
    @Override
    public int streamId() {
        return this.streamId;
    }
    
    protected DefaultSpdyStreamFrame(final int lllllllllllllIIIlIIIIIIlIlllllIl) {
        this.setStreamId(lllllllllllllIIIlIIIIIIlIlllllIl);
        "".length();
    }
    
    private static void lllIlllIllIIlII() {
        (lIlIlIlIlllIll = new String[DefaultSpdyStreamFrame.lIlIlIlIlllllI[1]])[DefaultSpdyStreamFrame.lIlIlIlIlllllI[0]] = lllIlllIllIIIll("KqB/mFa/TWHYDiypVSsM+G856W4ryKSN3DfGd1rXI9w=", "fUvDO");
    }
    
    static {
        lllIlllIllIlIIl();
        lllIlllIllIIlII();
    }
    
    @Override
    public SpdyStreamFrame setLast(final boolean lllllllllllllIIIlIIIIIIlIllIlIll) {
        this.last = lllllllllllllIIIlIIIIIIlIllIlIll;
        return this;
    }
    
    private static boolean lllIlllIllIlIlI(final int lllllllllllllIIIlIIIIIIlIlIlllII) {
        return lllllllllllllIIIlIIIIIIlIlIlllII <= 0;
    }
}
