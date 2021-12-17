// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public enum SpdyVersion
{
    SPDY_3_1(SpdyVersion.lIIIlIlIIIllIl[1], SpdyVersion.lIIIlIlIIIllIl[2]);
    
    private static final /* synthetic */ int[] lIIIlIlIIIllIl;
    private final /* synthetic */ int minorVersion;
    private final /* synthetic */ int version;
    
    private static void llIIIIIIlIIlIII() {
        (lIIIlIlIIIllIl = new int[3])[0] = ((0x5A ^ 0x74) & ~(0xA6 ^ 0x88));
        SpdyVersion.lIIIlIlIIIllIl[1] = "   ".length();
        SpdyVersion.lIIIlIlIIIllIl[2] = " ".length();
    }
    
    private static String llIIIIIIlIIIllI(String lllllllllllllIlIIIIlllllIlIlIlII, final String lllllllllllllIlIIIIlllllIlIllIII) {
        lllllllllllllIlIIIIlllllIlIlIlII = (int)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIIIlllllIlIlIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIlllllIlIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIIIIlllllIlIlIllI = lllllllllllllIlIIIIlllllIlIllIII.toCharArray();
        int lllllllllllllIlIIIIlllllIlIlIlIl = SpdyVersion.lIIIlIlIIIllIl[0];
        final byte lllllllllllllIlIIIIlllllIlIIllll = (Object)((String)lllllllllllllIlIIIIlllllIlIlIlII).toCharArray();
        final char lllllllllllllIlIIIIlllllIlIIlllI = (char)lllllllllllllIlIIIIlllllIlIIllll.length;
        Exception lllllllllllllIlIIIIlllllIlIIllIl = (Exception)SpdyVersion.lIIIlIlIIIllIl[0];
        while (llIIIIIIlIIlIIl((int)lllllllllllllIlIIIIlllllIlIIllIl, lllllllllllllIlIIIIlllllIlIIlllI)) {
            final char lllllllllllllIlIIIIlllllIlIllIlI = lllllllllllllIlIIIIlllllIlIIllll[lllllllllllllIlIIIIlllllIlIIllIl];
            lllllllllllllIlIIIIlllllIlIlIlll.append((char)(lllllllllllllIlIIIIlllllIlIllIlI ^ lllllllllllllIlIIIIlllllIlIlIllI[lllllllllllllIlIIIIlllllIlIlIlIl % lllllllllllllIlIIIIlllllIlIlIllI.length]));
            "".length();
            ++lllllllllllllIlIIIIlllllIlIlIlIl;
            ++lllllllllllllIlIIIIlllllIlIIllIl;
            "".length();
            if ("   ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIlllllIlIlIlll);
    }
    
    static {
        llIIIIIIlIIlIII();
        llIIIIIIlIIIlll();
        final SpdyVersion[] $values = new SpdyVersion[SpdyVersion.lIIIlIlIIIllIl[2]];
        $values[SpdyVersion.lIIIlIlIIIllIl[0]] = SpdyVersion.SPDY_3_1;
        $VALUES = $values;
    }
    
    int getVersion() {
        return this.version;
    }
    
    int getMinorVersion() {
        return this.minorVersion;
    }
    
    private static boolean llIIIIIIlIIlIIl(final int lllllllllllllIlIIIIlllllIlIIlIIl, final int lllllllllllllIlIIIIlllllIlIIlIII) {
        return lllllllllllllIlIIIIlllllIlIIlIIl < lllllllllllllIlIIIIlllllIlIIlIII;
    }
    
    private static void llIIIIIIlIIIlll() {
        (lIIIlIlIIIllII = new String[SpdyVersion.lIIIlIlIIIllIl[2]])[SpdyVersion.lIIIlIlIIIllIl[0]] = llIIIIIIlIIIllI("ARwOACZhE3s=", "RLJYy");
    }
    
    private SpdyVersion(final int lllllllllllllIlIIIIlllllIlllIIII, final int lllllllllllllIlIIIIlllllIllIllll) {
        this.version = lllllllllllllIlIIIIlllllIlllIIII;
        this.minorVersion = lllllllllllllIlIIIIlllllIllIllll;
    }
}
