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

public class DefaultSpdyRstStreamFrame extends DefaultSpdyStreamFrame implements SpdyRstStreamFrame
{
    private static final /* synthetic */ String[] llIIIlIlIlIIlI;
    private static final /* synthetic */ int[] llIIIlIlIlIlII;
    private /* synthetic */ SpdyStreamStatus status;
    
    private static String lIIIlIIlIlIIllll(String llllllllllllIlllIlIllIlIIllIIlIl, final String llllllllllllIlllIlIllIlIIllIlIIl) {
        llllllllllllIlllIlIllIlIIllIIlIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIllIlIIllIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIllIlIIllIlIII = new StringBuilder();
        final char[] llllllllllllIlllIlIllIlIIllIIlll = llllllllllllIlllIlIllIlIIllIlIIl.toCharArray();
        int llllllllllllIlllIlIllIlIIllIIllI = DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[0];
        final Exception llllllllllllIlllIlIllIlIIllIIIII = (Object)((String)llllllllllllIlllIlIllIlIIllIIlIl).toCharArray();
        final char llllllllllllIlllIlIllIlIIlIlllll = (char)llllllllllllIlllIlIllIlIIllIIIII.length;
        double llllllllllllIlllIlIllIlIIlIllllI = DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[0];
        while (lIIIlIIlIlIlllIl((int)llllllllllllIlllIlIllIlIIlIllllI, llllllllllllIlllIlIllIlIIlIlllll)) {
            final char llllllllllllIlllIlIllIlIIllIlIll = llllllllllllIlllIlIllIlIIllIIIII[llllllllllllIlllIlIllIlIIlIllllI];
            llllllllllllIlllIlIllIlIIllIlIII.append((char)(llllllllllllIlllIlIllIlIIllIlIll ^ llllllllllllIlllIlIllIlIIllIIlll[llllllllllllIlllIlIllIlIIllIIllI % llllllllllllIlllIlIllIlIIllIIlll.length]));
            "".length();
            ++llllllllllllIlllIlIllIlIIllIIllI;
            ++llllllllllllIlllIlIllIlIIlIllllI;
            "".length();
            if ((0x26 ^ 0x22) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIllIlIIllIlIII);
    }
    
    @Override
    public SpdyStreamStatus status() {
        return this.status;
    }
    
    public DefaultSpdyRstStreamFrame(final int llllllllllllIlllIlIllIlIlIlIIIII, final SpdyStreamStatus llllllllllllIlllIlIllIlIlIIlllll) {
        super(llllllllllllIlllIlIllIlIlIlIIIII);
        this.setStatus(llllllllllllIlllIlIllIlIlIIlllll);
        "".length();
    }
    
    private static void lIIIlIIlIlIlllII() {
        (llIIIlIlIlIlII = new int[4])[0] = ((0x2 ^ 0x5A ^ (0x36 ^ 0x57)) & (" ".length() ^ (0x4D ^ 0x75) ^ -" ".length()));
        DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[1] = " ".length();
        DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[2] = "  ".length();
        DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[3] = (0xD3 ^ 0x9A ^ (0xC6 ^ 0x87));
    }
    
    @Override
    public SpdyRstStreamFrame setStreamId(final int llllllllllllIlllIlIllIlIlIIllIII) {
        super.setStreamId(llllllllllllIlllIlIllIlIlIIllIII);
        "".length();
        return this;
    }
    
    @Override
    public SpdyRstStreamFrame setStatus(final SpdyStreamStatus llllllllllllIlllIlIllIlIlIIIlIIl) {
        this.status = llllllllllllIlllIlIllIlIlIIIlIIl;
        return this;
    }
    
    private static void lIIIlIIlIlIlIIIl() {
        (llIIIlIlIlIIlI = new String[DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[2]])[DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[0]] = lIIIlIIlIlIIllll("XkZKSx8HGREKIV4iMEtxUw==", "sktkL");
        DefaultSpdyRstStreamFrame.llIIIlIlIlIIlI[DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[1]] = lIIIlIIlIlIlIIII("Un74tVrwM5B4IoAiWcia0Q==", "uuAWN");
    }
    
    public DefaultSpdyRstStreamFrame(final int llllllllllllIlllIlIllIlIlIlIlIIl, final int llllllllllllIlllIlIllIlIlIlIIlIl) {
        this(llllllllllllIlllIlIllIlIlIlIlIIl, SpdyStreamStatus.valueOf(llllllllllllIlllIlIllIlIlIlIIlIl));
    }
    
    static {
        lIIIlIIlIlIlllII();
        lIIIlIIlIlIlIIIl();
    }
    
    private static String lIIIlIIlIlIlIIII(final String llllllllllllIlllIlIllIlIIlIlIlIl, final String llllllllllllIlllIlIllIlIIlIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIllIlIIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIllIlIIlIlIIlI.getBytes(StandardCharsets.UTF_8)), DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[3]), "DES");
            final Cipher llllllllllllIlllIlIllIlIIlIlIlll = Cipher.getInstance("DES");
            llllllllllllIlllIlIllIlIIlIlIlll.init(DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[2], llllllllllllIlllIlIllIlIIlIllIII);
            return new String(llllllllllllIlllIlIllIlIIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIllIlIIlIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIllIlIIlIlIllI) {
            llllllllllllIlllIlIllIlIIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public SpdyRstStreamFrame setLast(final boolean llllllllllllIlllIlIllIlIlIIlIIII) {
        super.setLast(llllllllllllIlllIlIllIlIlIIlIIII);
        "".length();
        return this;
    }
    
    @Override
    public String toString() {
        final StringBuilder llllllllllllIlllIlIllIlIlIIIIIll = new StringBuilder();
        llllllllllllIlllIlIllIlIlIIIIIll.append(StringUtil.simpleClassName(this));
        "".length();
        llllllllllllIlllIlIllIlIlIIIIIll.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlllIlIllIlIlIIIIIll.append(DefaultSpdyRstStreamFrame.llIIIlIlIlIIlI[DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[0]]);
        "".length();
        llllllllllllIlllIlIllIlIlIIIIIll.append(this.streamId());
        "".length();
        llllllllllllIlllIlIllIlIlIIIIIll.append(StringUtil.NEWLINE);
        "".length();
        llllllllllllIlllIlIllIlIlIIIIIll.append(DefaultSpdyRstStreamFrame.llIIIlIlIlIIlI[DefaultSpdyRstStreamFrame.llIIIlIlIlIlII[1]]);
        "".length();
        llllllllllllIlllIlIllIlIlIIIIIll.append(this.status());
        "".length();
        return String.valueOf(llllllllllllIlllIlIllIlIlIIIIIll);
    }
    
    private static boolean lIIIlIIlIlIlllIl(final int llllllllllllIlllIlIllIlIIlIIllIl, final int llllllllllllIlllIlIllIlIIlIIllII) {
        return llllllllllllIlllIlIllIlIIlIIllIl < llllllllllllIlllIlIllIlIIlIIllII;
    }
}
