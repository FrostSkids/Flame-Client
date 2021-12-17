// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.util.internal.StringUtil;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DefaultSpdyGoAwayFrame implements SpdyGoAwayFrame
{
    private static final /* synthetic */ String[] lllIIIllIlIIlI;
    private /* synthetic */ int lastGoodStreamId;
    private /* synthetic */ SpdySessionStatus status;
    private static final /* synthetic */ int[] lllIIIlllllIlI;
    
    private static String lIIllllIIIIIIIll(String llllllllllllIlIllllllIIIlIlIlIIl, final String llllllllllllIlIllllllIIIlIlIllIl) {
        llllllllllllIlIllllllIIIlIlIlIIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllllllIIIlIlIlIIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllllllIIIlIlIllII = new StringBuilder();
        final char[] llllllllllllIlIllllllIIIlIlIlIll = llllllllllllIlIllllllIIIlIlIllIl.toCharArray();
        int llllllllllllIlIllllllIIIlIlIlIlI = DefaultSpdyGoAwayFrame.lllIIIlllllIlI[0];
        final boolean llllllllllllIlIllllllIIIlIlIIlII = (Object)((String)llllllllllllIlIllllllIIIlIlIlIIl).toCharArray();
        final boolean llllllllllllIlIllllllIIIlIlIIIll = llllllllllllIlIllllllIIIlIlIIlII.length != 0;
        short llllllllllllIlIllllllIIIlIlIIIlI = (short)DefaultSpdyGoAwayFrame.lllIIIlllllIlI[0];
        while (lIIllllIIlllIlII(llllllllllllIlIllllllIIIlIlIIIlI, llllllllllllIlIllllllIIIlIlIIIll ? 1 : 0)) {
            final char llllllllllllIlIllllllIIIlIlIllll = llllllllllllIlIllllllIIIlIlIIlII[llllllllllllIlIllllllIIIlIlIIIlI];
            llllllllllllIlIllllllIIIlIlIllII.append((char)(llllllllllllIlIllllllIIIlIlIllll ^ llllllllllllIlIllllllIIIlIlIlIll[llllllllllllIlIllllllIIIlIlIlIlI % llllllllllllIlIllllllIIIlIlIlIll.length]));
            "".length();
            ++llllllllllllIlIllllllIIIlIlIlIlI;
            ++llllllllllllIlIllllllIIIlIlIIIlI;
            "".length();
            if (-" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllllllIIIlIlIllII);
    }
    
    @Override
    public int lastGoodStreamId() {
        return this.lastGoodStreamId;
    }
    
    @Override
    public SpdyGoAwayFrame setLastGoodStreamId(final int llllllllllllIlIllllllIIIllIIlIlI) {
        if (lIIllllIIlllIIll(llllllllllllIlIllllllIIIllIIlIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdyGoAwayFrame.lllIIIllIlIIlI[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[0]]).append(llllllllllllIlIllllllIIIllIIlIlI)));
        }
        this.lastGoodStreamId = llllllllllllIlIllllllIIIllIIlIlI;
        return this;
    }
    
    public DefaultSpdyGoAwayFrame(final int llllllllllllIlIllllllIIIlllIIIll) {
        this(llllllllllllIlIllllllIIIlllIIIll, DefaultSpdyGoAwayFrame.lllIIIlllllIlI[0]);
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlIllllllIIIlIlllIll = new StringBuilder();
        llllllllllllIlIllllllIIIlIlllIll.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlIllllllIIIlIlllIll.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlIllllllIIIlIlllIll.append(DefaultSpdyGoAwayFrame.lllIIIllIlIIlI[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[1]]);
        "".length();
        llllllllllllIlIllllllIIIlIlllIll.append(this.lastGoodStreamId());
        "".length();
        llllllllllllIlIllllllIIIlIlllIll.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlIllllllIIIlIlllIll.append(DefaultSpdyGoAwayFrame.lllIIIllIlIIlI[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[2]]);
        "".length();
        llllllllllllIlIllllllIIIlIlllIll.append(this.status());
        "".length();
        return String.valueOf(llllllllllllIlIllllllIIIlIlllIll);
    }
    
    private static void lIIllllIIIIIIlIl() {
        (lllIIIllIlIIlI = new String[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[3]])[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[0]] = lIIllllIIIIIIIll("PjAGJn8VPho2fwElBzczH3w8FnIRMBs8PQZxFzdyHDQSMyYbJxBocg==", "rQuRR");
        DefaultSpdyGoAwayFrame.lllIIIllIlIIlI[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[1]] = lIIllllIIIIIIIll("R290TQILMT5AKQUtLkA9HjAvDCNHCw5Nc0o=", "jBJmN");
        DefaultSpdyGoAwayFrame.lllIIIllIlIIlI[DefaultSpdyGoAwayFrame.lllIIIlllllIlI[2]] = lIIllllIIIIIIlII("TIK/O0UczZInzI4+JF9EaQ==", "wqoSD");
    }
    
    public DefaultSpdyGoAwayFrame(final int llllllllllllIlIllllllIIIllIllIll, final int llllllllllllIlIllllllIIIllIllIlI) {
        this(llllllllllllIlIllllllIIIllIllIll, SpdySessionStatus.valueOf(llllllllllllIlIllllllIIIllIllIlI));
    }
    
    @Override
    public SpdySessionStatus status() {
        return this.status;
    }
    
    @Override
    public SpdyGoAwayFrame setStatus(final SpdySessionStatus llllllllllllIlIllllllIIIlIllllll) {
        this.status = llllllllllllIlIllllllIIIlIllllll;
        return this;
    }
    
    static {
        lIIllllIIlllIIlI();
        lIIllllIIIIIIlIl();
    }
    
    private static String lIIllllIIIIIIlII(final String llllllllllllIlIllllllIIIlIIlIlll, final String llllllllllllIlIllllllIIIlIIllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllllllIIIlIIlllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllllIIIlIIllIII.getBytes(StandardCharsets.UTF_8)), DefaultSpdyGoAwayFrame.lllIIIlllllIlI[4]), "DES");
            final Cipher llllllllllllIlIllllllIIIlIIllIll = Cipher.getInstance("DES");
            llllllllllllIlIllllllIIIlIIllIll.init(DefaultSpdyGoAwayFrame.lllIIIlllllIlI[2], llllllllllllIlIllllllIIIlIIlllII);
            return new String(llllllllllllIlIllllllIIIlIIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllllIIIlIIlIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllllIIIlIIllIlI) {
            llllllllllllIlIllllllIIIlIIllIlI.printStackTrace();
            return null;
        }
    }
    
    public DefaultSpdyGoAwayFrame(final int llllllllllllIlIllllllIIIllIlIIlI, final SpdySessionStatus llllllllllllIlIllllllIIIllIlIIIl) {
        this.setLastGoodStreamId(llllllllllllIlIllllllIIIllIlIIlI);
        "".length();
        this.setStatus(llllllllllllIlIllllllIIIllIlIIIl);
        "".length();
    }
    
    private static void lIIllllIIlllIIlI() {
        (lllIIIlllllIlI = new int[5])[0] = ((0xB0 ^ 0xA1) & ~(0x13 ^ 0x2));
        DefaultSpdyGoAwayFrame.lllIIIlllllIlI[1] = " ".length();
        DefaultSpdyGoAwayFrame.lllIIIlllllIlI[2] = "  ".length();
        DefaultSpdyGoAwayFrame.lllIIIlllllIlI[3] = "   ".length();
        DefaultSpdyGoAwayFrame.lllIIIlllllIlI[4] = (0x26 ^ 0x2E);
    }
    
    private static boolean lIIllllIIlllIIll(final int llllllllllllIlIllllllIIIlIIIlllI) {
        return llllllllllllIlIllllllIIIlIIIlllI < 0;
    }
    
    private static boolean lIIllllIIlllIlII(final int llllllllllllIlIllllllIIIlIIlIIIl, final int llllllllllllIlIllllllIIIlIIlIIII) {
        return llllllllllllIlIllllllIIIlIIlIIIl < llllllllllllIlIllllllIIIlIIlIIII;
    }
}
