// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Arrays;
import io.netty.util.internal.StringUtil;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class DefaultSpdyWindowUpdateFrame implements SpdyWindowUpdateFrame
{
    private static final /* synthetic */ String[] llIIllIIlllIIl;
    private static final /* synthetic */ int[] llIIllIIlllIlI;
    private /* synthetic */ int deltaWindowSize;
    private /* synthetic */ int streamId;
    
    private static boolean lIIIlllIllIIIIll(final int llllllllllllIlllIIIIIIllllllIllI, final int llllllllllllIlllIIIIIIllllllIlIl) {
        return llllllllllllIlllIIIIIIllllllIllI < llllllllllllIlllIIIIIIllllllIlIl;
    }
    
    @Override
    public SpdyWindowUpdateFrame setDeltaWindowSize(final int llllllllllllIlllIIIIIlIIIIllIIIl) {
        if (lIIIlllIllIIIIlI(llllllllllllIlllIIIIIlIIIIllIIIl)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[1]]).append(llllllllllllIlllIIIIIlIIIIllIIIl)));
        }
        this.deltaWindowSize = llllllllllllIlllIIIIIlIIIIllIIIl;
        return this;
    }
    
    private static String lIIIlllIlIllllII(String llllllllllllIlllIIIIIlIIIIIIlllI, final String llllllllllllIlllIIIIIlIIIIIIllIl) {
        llllllllllllIlllIIIIIlIIIIIIlllI = new String(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIIIlIIIIIlIIIl = new StringBuilder();
        final char[] llllllllllllIlllIIIIIlIIIIIlIIII = llllllllllllIlllIIIIIlIIIIIIllIl.toCharArray();
        int llllllllllllIlllIIIIIlIIIIIIllll = DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[0];
        final boolean llllllllllllIlllIIIIIlIIIIIIlIIl = (Object)llllllllllllIlllIIIIIlIIIIIIlllI.toCharArray();
        final long llllllllllllIlllIIIIIlIIIIIIlIII = llllllllllllIlllIIIIIlIIIIIIlIIl.length;
        boolean llllllllllllIlllIIIIIlIIIIIIIlll = DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[0] != 0;
        while (lIIIlllIllIIIIll(llllllllllllIlllIIIIIlIIIIIIIlll ? 1 : 0, (int)llllllllllllIlllIIIIIlIIIIIIlIII)) {
            final char llllllllllllIlllIIIIIlIIIIIlIlII = llllllllllllIlllIIIIIlIIIIIIlIIl[llllllllllllIlllIIIIIlIIIIIIIlll];
            llllllllllllIlllIIIIIlIIIIIlIIIl.append((char)(llllllllllllIlllIIIIIlIIIIIlIlII ^ llllllllllllIlllIIIIIlIIIIIlIIII[llllllllllllIlllIIIIIlIIIIIIllll % llllllllllllIlllIIIIIlIIIIIlIIII.length]));
            "".length();
            ++llllllllllllIlllIIIIIlIIIIIIllll;
            ++llllllllllllIlllIIIIIlIIIIIIIlll;
            "".length();
            if (-" ".length() > ("   ".length() & ~"   ".length())) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIIIlIIIIIlIIIl);
    }
    
    static {
        lIIIlllIllIIIIII();
        lIIIlllIlIllllll();
    }
    
    @Override
    public SpdyWindowUpdateFrame setStreamId(final int llllllllllllIlllIIIIIlIIIIlllIlI) {
        if (lIIIlllIllIIIIIl(llllllllllllIlllIIIIIlIIIIlllIlI)) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[0]]).append(llllllllllllIlllIIIIIlIIIIlllIlI)));
        }
        this.streamId = llllllllllllIlllIIIIIlIIIIlllIlI;
        return this;
    }
    
    public DefaultSpdyWindowUpdateFrame(final int llllllllllllIlllIIIIIlIIIlIIIlII, final int llllllllllllIlllIIIIIlIIIlIIIIll) {
        this.setStreamId(llllllllllllIlllIIIIIlIIIlIIIlII);
        "".length();
        this.setDeltaWindowSize(llllllllllllIlllIIIIIlIIIlIIIIll);
        "".length();
    }
    
    private static boolean lIIIlllIllIIIIIl(final int llllllllllllIlllIIIIIIllllllIIll) {
        return llllllllllllIlllIIIIIIllllllIIll < 0;
    }
    
    private static String lIIIlllIlIllllIl(final String llllllllllllIlllIIIIIlIIIIlIIIIl, final String llllllllllllIlllIIIIIlIIIIlIIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIlIIIIlIIllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIlIIIIlIIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIIIIlIIIIlIIlIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIIIIlIIIIlIIlIl.init(DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[2], llllllllllllIlllIIIIIlIIIIlIIllI);
            return new String(llllllllllllIlllIIIIIlIIIIlIIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIlIIIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIlIIIIlIIlII) {
            llllllllllllIlllIIIIIlIIIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllIIIIIlIIIIlIllIl = new StringBuilder();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[2]]);
        "".length();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(this.streamId());
        "".length();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[3]]);
        "".length();
        llllllllllllIlllIIIIIlIIIIlIllIl.append(this.deltaWindowSize());
        "".length();
        return String.valueOf(llllllllllllIlllIIIIIlIIIIlIllIl);
    }
    
    @Override
    public int streamId() {
        return this.streamId;
    }
    
    private static String lIIIlllIlIlllllI(final String llllllllllllIlllIIIIIIlllllllllI, final String llllllllllllIlllIIIIIIlllllllIll) {
        try {
            final SecretKeySpec llllllllllllIlllIIIIIlIIIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIIIIlllllllIll.getBytes(StandardCharsets.UTF_8)), DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[5]), "DES");
            final Cipher llllllllllllIlllIIIIIlIIIIIIIIII = Cipher.getInstance("DES");
            llllllllllllIlllIIIIIlIIIIIIIIII.init(DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[2], llllllllllllIlllIIIIIlIIIIIIIIIl);
            return new String(llllllllllllIlllIIIIIlIIIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIIIIlllllllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIIIIIllllllllll) {
            llllllllllllIlllIIIIIIllllllllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlllIllIIIIII() {
        (llIIllIIlllIlI = new int[6])[0] = ((0x26 ^ 0x20) & ~(0x99 ^ 0x9F));
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[1] = " ".length();
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[2] = "  ".length();
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[3] = "   ".length();
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[4] = (0x0 ^ 0x4);
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[5] = (106 + 13 - 40 + 84 ^ 97 + 155 - 228 + 147);
    }
    
    private static boolean lIIIlllIllIIIIlI(final int llllllllllllIlllIIIIIIllllllIIIl) {
        return llllllllllllIlllIIIIIIllllllIIIl <= 0;
    }
    
    private static void lIIIlllIlIllllll() {
        (llIIllIIlllIIl = new String[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[4]])[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[0]] = lIIIlllIlIllllII("HAMWCwQiWi0qRSwWCgAKO1cGC0UhEgMPESYBAVRF", "Owdne");
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[1]] = lIIIlllIlIllllIl("WX9jtRCrI4Nq0qmeWXaymykUc0nM3Mtfcvs6z4hmokHvC+QHwuW/+A==", "zKsmU");
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[2]] = lIIIlllIlIlllllI("Z3tWdw4/u/W0jr599yem7qflcCKWXtNk", "vafAq");
        DefaultSpdyWindowUpdateFrame.llIIllIIlllIIl[DefaultSpdyWindowUpdateFrame.llIIllIIlllIlI[3]] = lIIIlllIlIlllllI("tWdjL9fmEu+33nosaXnzVk8N/aqqWVQDR7xQAqPX7WE=", "OiziP");
    }
    
    @Override
    public int deltaWindowSize() {
        return this.deltaWindowSize;
    }
}
