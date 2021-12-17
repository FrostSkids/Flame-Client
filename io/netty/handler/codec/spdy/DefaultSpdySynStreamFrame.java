// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.util.internal.StringUtil;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DefaultSpdySynStreamFrame extends DefaultSpdyHeadersFrame implements SpdySynStreamFrame
{
    private static final /* synthetic */ int[] lIIlIIIllIIlll;
    private static final /* synthetic */ String[] lIIlIIIllIIlII;
    private /* synthetic */ boolean unidirectional;
    private /* synthetic */ byte priority;
    private /* synthetic */ int associatedStreamId;
    
    private static boolean llIIlIllIlllIIl(final int lllllllllllllIIlllIIlIIlIIIIIIlI, final int lllllllllllllIIlllIIlIIlIIIIIIIl) {
        return lllllllllllllIIlllIIlIIlIIIIIIlI < lllllllllllllIIlllIIlIIlIIIIIIIl;
    }
    
    @Override
    public byte priority() {
        return this.priority;
    }
    
    @Override
    public SpdySynStreamFrame setLast(final boolean lllllllllllllIIlllIIlIIlIllIlIll) {
        super.setLast(lllllllllllllIIlllIIlIIlIllIlIll);
        "".length();
        return this;
    }
    
    @Override
    public SpdySynStreamFrame setUnidirectional(final boolean lllllllllllllIIlllIIlIIlIlIIllIl) {
        this.unidirectional = lllllllllllllIIlllIIlIIlIlIIllIl;
        return this;
    }
    
    private static boolean llIIlIllIllIlll(final int lllllllllllllIIlllIIlIIIlllllIll) {
        return lllllllllllllIIlllIIlIIIlllllIll != 0;
    }
    
    private static String llIIlIllIlIllII(String lllllllllllllIIlllIIlIIlIIIllIlI, final String lllllllllllllIIlllIIlIIlIIIllIIl) {
        lllllllllllllIIlllIIlIIlIIIllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIlIIIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIlIIlIIIlllIl = new StringBuilder();
        final char[] lllllllllllllIIlllIIlIIlIIIlllII = lllllllllllllIIlllIIlIIlIIIllIIl.toCharArray();
        int lllllllllllllIIlllIIlIIlIIIllIll = DefaultSpdySynStreamFrame.lIIlIIIllIIlll[0];
        final float lllllllllllllIIlllIIlIIlIIIlIlIl = (Object)lllllllllllllIIlllIIlIIlIIIllIlI.toCharArray();
        final long lllllllllllllIIlllIIlIIlIIIlIlII = lllllllllllllIIlllIIlIIlIIIlIlIl.length;
        String lllllllllllllIIlllIIlIIlIIIlIIll = (String)DefaultSpdySynStreamFrame.lIIlIIIllIIlll[0];
        while (llIIlIllIlllIIl((int)lllllllllllllIIlllIIlIIlIIIlIIll, (int)lllllllllllllIIlllIIlIIlIIIlIlII)) {
            final char lllllllllllllIIlllIIlIIlIIlIIIII = lllllllllllllIIlllIIlIIlIIIlIlIl[lllllllllllllIIlllIIlIIlIIIlIIll];
            lllllllllllllIIlllIIlIIlIIIlllIl.append((char)(lllllllllllllIIlllIIlIIlIIlIIIII ^ lllllllllllllIIlllIIlIIlIIIlllII[lllllllllllllIIlllIIlIIlIIIllIll % lllllllllllllIIlllIIlIIlIIIlllII.length]));
            "".length();
            ++lllllllllllllIIlllIIlIIlIIIllIll;
            ++lllllllllllllIIlllIIlIIlIIIlIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIlIIlIIIlllIl);
    }
    
    @Override
    public int associatedStreamId() {
        return this.associatedStreamId;
    }
    
    @Override
    public SpdySynStreamFrame setPriority(final byte lllllllllllllIIlllIIlIIlIlIlIllI) {
        if (!llIIlIllIllIlII(lllllllllllllIIlllIIlIIlIlIlIllI) || llIIlIllIllIlIl(lllllllllllllIIlllIIlIIlIlIlIllI, DefaultSpdySynStreamFrame.lIIlIIIllIIlll[1])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[2]]).append(lllllllllllllIIlllIIlIIlIlIlIllI)));
        }
        this.priority = lllllllllllllIIlllIIlIIlIlIlIllI;
        return this;
    }
    
    private static void llIIlIllIllIIlI() {
        (lIIlIIIllIIlll = new int[10])[0] = ((0x6B ^ 0x52) & ~(0x82 ^ 0xBB));
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[1] = (0x84 ^ 0x83);
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[2] = " ".length();
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[3] = "  ".length();
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[4] = "   ".length();
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[5] = (0x43 ^ 0x7F ^ (0x29 ^ 0x3C));
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[6] = (0x41 ^ 0x45);
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[7] = (0x5A ^ 0x5F);
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[8] = (0x87 ^ 0x81);
        DefaultSpdySynStreamFrame.lIIlIIIllIIlll[9] = (0xE2 ^ 0xAA ^ (0x6C ^ 0x2C));
    }
    
    @Override
    public SpdySynStreamFrame setInvalid() {
        super.setInvalid();
        "".length();
        return this;
    }
    
    private static String llIIlIllIlIIlII(final String lllllllllllllIIlllIIlIIlIIIIlIII, final String lllllllllllllIIlllIIlIIlIIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIIlIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), DefaultSpdySynStreamFrame.lIIlIIIllIIlll[9]), "DES");
            final Cipher lllllllllllllIIlllIIlIIlIIIIllII = Cipher.getInstance("DES");
            lllllllllllllIIlllIIlIIlIIIIllII.init(DefaultSpdySynStreamFrame.lIIlIIIllIIlll[3], lllllllllllllIIlllIIlIIlIIIIllIl);
            return new String(lllllllllllllIIlllIIlIIlIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIlIIIIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIIlIIIIlIll) {
            lllllllllllllIIlllIIlIIlIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIllIllIlII(final int lllllllllllllIIlllIIlIIIlllllIIl) {
        return lllllllllllllIIlllIIlIIIlllllIIl >= 0;
    }
    
    @Override
    public SpdySynStreamFrame setStreamId(final int lllllllllllllIIlllIIlIIlIlllIIIl) {
        super.setStreamId(lllllllllllllIIlllIIlIIlIlllIIIl);
        "".length();
        return this;
    }
    
    @Override
    public SpdySynStreamFrame setAssociatedStreamId(final int lllllllllllllIIlllIIlIIlIlIlllll) {
        if (llIIlIllIllIIll(lllllllllllllIIlllIIlIIlIlIlllll)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[0]]).append(lllllllllllllIIlllIIlIIlIlIlllll)));
        }
        this.associatedStreamId = lllllllllllllIIlllIIlIIlIlIlllll;
        return this;
    }
    
    private static void llIIlIllIllIIII() {
        (lIIlIIIllIIlII = new String[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[9]])[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[0]] = llIIlIllIlIIlII("g9R/2YJlelALzeJxsfLNPF86WTpGhW4rpgAFeedAKoFzyjQuJIlFSiCVHKAbvylD", "Jjitb");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[2]] = llIIlIllIlIIlII("0q/Ol3AKrDcQXOECDQC7vV0rCIVCt9xJHlFwJknCTkOuom6zWBsdNPUNbbl1GvTV", "ZnCsD");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[3]] = llIIlIllIlIllII("fTgSARhvdA==", "UTsrl");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[4]] = llIIlIllIlIIlII("1jRphHGgj5igyvF5bUeC/lm/PWbgQgkU", "LDydh");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[6]] = llIIlIllIlIIlII("7ooLW6LNb4jhLKCKVpukgUluMJ9CQvXj", "MnCnC");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[7]] = llIIlIllIlIIlII("U6HIsFmvV7nSN6aLQRlKFLBeeDIqJFOAHubTwN3cqME=", "qODmQ");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[8]] = llIIlIllIlIllII("b3dnURowMzYDIzYjeUxq", "BZYqJ");
        DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[1]] = llIIlIllIlIllII("Q2VKWg0LKRAfNx1y", "nHtzE");
    }
    
    static {
        llIIlIllIllIIlI();
        llIIlIllIllIIII();
    }
    
    @Override
    public boolean isUnidirectional() {
        return this.unidirectional;
    }
    
    public DefaultSpdySynStreamFrame(final int lllllllllllllIIlllIIlIIlIlllIlll, final int lllllllllllllIIlllIIlIIlIllllIlI, final byte lllllllllllllIIlllIIlIIlIlllIlIl) {
        super(lllllllllllllIIlllIIlIIlIlllIlll);
        this.setAssociatedStreamId(lllllllllllllIIlllIIlIIlIllllIlI);
        "".length();
        this.setPriority(lllllllllllllIIlllIIlIIlIlllIlIl);
        "".length();
    }
    
    private static boolean llIIlIllIllIIll(final int lllllllllllllIIlllIIlIIIllllIlll) {
        return lllllllllllllIIlllIIlIIIllllIlll < 0;
    }
    
    private static boolean llIIlIllIllIlIl(final int lllllllllllllIIlllIIlIIIlllllllI, final int lllllllllllllIIlllIIlIIIllllllIl) {
        return lllllllllllllIIlllIIlIIIlllllllI > lllllllllllllIIlllIIlIIIllllllIl;
    }
    
    @Override
    public String toString() {
        final StringBuilder lllllllllllllIIlllIIlIIlIlIIIlll = new StringBuilder();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(StringUtil.simpleClassName(this));
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[3]]);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(this.isLast());
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[4]]);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(this.isUnidirectional());
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append((char)DefaultSpdySynStreamFrame.lIIlIIIllIIlll[5]);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[6]]);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(this.streamId());
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(StringUtil.NEWLINE);
        "".length();
        if (llIIlIllIllIlll(this.associatedStreamId)) {
            lllllllllllllIIlllIIlIIlIlIIIlll.append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[7]]);
            "".length();
            lllllllllllllIIlllIIlIIlIlIIIlll.append(this.associatedStreamId());
            "".length();
            lllllllllllllIIlllIIlIIlIlIIIlll.append(StringUtil.NEWLINE);
            "".length();
        }
        lllllllllllllIIlllIIlIIlIlIIIlll.append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[8]]);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(this.priority());
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(StringUtil.NEWLINE);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(DefaultSpdySynStreamFrame.lIIlIIIllIIlII[DefaultSpdySynStreamFrame.lIIlIIIllIIlll[1]]);
        "".length();
        lllllllllllllIIlllIIlIIlIlIIIlll.append(StringUtil.NEWLINE);
        "".length();
        this.appendHeaders(lllllllllllllIIlllIIlIIlIlIIIlll);
        lllllllllllllIIlllIIlIIlIlIIIlll.setLength(lllllllllllllIIlllIIlIIlIlIIIlll.length() - StringUtil.NEWLINE.length());
        return String.valueOf(lllllllllllllIIlllIIlIIlIlIIIlll);
    }
}
