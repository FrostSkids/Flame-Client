// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.openal;

import java.nio.ByteBuffer;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class OggDecoder
{
    private static final /* synthetic */ int[] lIIlIllllIIlII;
    private /* synthetic */ byte[] convbuffer;
    private /* synthetic */ int convsize;
    private static final /* synthetic */ String[] lIIlIllllIIIll;
    
    private static boolean llIlIlIIIlIIIIl(final Object lllllllllllllIIllIIIIIIIlIlIlllI) {
        return lllllllllllllIIllIIIIIIIlIlIlllI == null;
    }
    
    private static void llIlIlIIIIlllll() {
        (lIIlIllllIIIll = new String[OggDecoder.lIIlIllllIIlII[2]])[OggDecoder.lIIlIllllIIlII[1]] = llIlIlIIIIllllI("KCQ+Bz8KZSMEehwgNg96IQIQR3odKiIZOQtlMwQ/HWU5BC5OIC8CKRp6", "nEWkZ");
    }
    
    private static void llIlIlIIIlIIIII() {
        (lIIlIllllIIlII = new int[3])[0] = (0xFFFFD528 & 0x6AD7);
        OggDecoder.lIIlIllllIIlII[1] = ((0xFF ^ 0x8E ^ (0x29 ^ 0x78)) & (0x1B ^ 0x20 ^ (0x72 ^ 0x69) ^ -" ".length()));
        OggDecoder.lIIlIllllIIlII[2] = " ".length();
    }
    
    private static String llIlIlIIIIllllI(String lllllllllllllIIllIIIIIIIlIllllII, final String lllllllllllllIIllIIIIIIIlIlllIll) {
        lllllllllllllIIllIIIIIIIlIllllII = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllIIIIIIIlIllllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIIIIIIIlIllllll = new StringBuilder();
        final char[] lllllllllllllIIllIIIIIIIlIlllllI = lllllllllllllIIllIIIIIIIlIlllIll.toCharArray();
        int lllllllllllllIIllIIIIIIIlIllllIl = OggDecoder.lIIlIllllIIlII[1];
        final boolean lllllllllllllIIllIIIIIIIlIllIlll = (Object)((String)lllllllllllllIIllIIIIIIIlIllllII).toCharArray();
        final short lllllllllllllIIllIIIIIIIlIllIllI = (short)lllllllllllllIIllIIIIIIIlIllIlll.length;
        char lllllllllllllIIllIIIIIIIlIllIlIl = (char)OggDecoder.lIIlIllllIIlII[1];
        while (llIlIlIIIlIIIll(lllllllllllllIIllIIIIIIIlIllIlIl, lllllllllllllIIllIIIIIIIlIllIllI)) {
            final char lllllllllllllIIllIIIIIIIllIIIIlI = lllllllllllllIIllIIIIIIIlIllIlll[lllllllllllllIIllIIIIIIIlIllIlIl];
            lllllllllllllIIllIIIIIIIlIllllll.append((char)(lllllllllllllIIllIIIIIIIllIIIIlI ^ lllllllllllllIIllIIIIIIIlIlllllI[lllllllllllllIIllIIIIIIIlIllllIl % lllllllllllllIIllIIIIIIIlIlllllI.length]));
            "".length();
            ++lllllllllllllIIllIIIIIIIlIllllIl;
            ++lllllllllllllIIllIIIIIIIlIllIlIl;
            "".length();
            if (((0x6 ^ 0x56) & ~(0x3D ^ 0x6D)) == "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIIIIIIIlIllllll);
    }
    
    static {
        llIlIlIIIlIIIII();
        llIlIlIIIIlllll();
    }
    
    public OggData getData(final InputStream lllllllllllllIIllIIIIIIIllIlIlll) throws IOException {
        if (llIlIlIIIlIIIIl(lllllllllllllIIllIIIIIIIllIlIlll)) {
            throw new IOException(OggDecoder.lIIlIllllIIIll[OggDecoder.lIIlIllllIIlII[1]]);
        }
        final ByteArrayOutputStream lllllllllllllIIllIIIIIIIllIlIllI = new ByteArrayOutputStream();
        final OggInputStream lllllllllllllIIllIIIIIIIllIlIlIl = new OggInputStream(lllllllllllllIIllIIIIIIIllIlIlll);
        final boolean lllllllllllllIIllIIIIIIIllIlIlII = OggDecoder.lIIlIllllIIlII[1] != 0;
        while (llIlIlIIIlIIIlI(lllllllllllllIIllIIIIIIIllIlIlIl.atEnd() ? 1 : 0)) {
            lllllllllllllIIllIIIIIIIllIlIllI.write(lllllllllllllIIllIIIIIIIllIlIlIl.read());
            "".length();
            if (-(0x7B ^ 0x7F) >= 0) {
                return null;
            }
        }
        final OggData lllllllllllllIIllIIIIIIIllIlIIll = new OggData();
        lllllllllllllIIllIIIIIIIllIlIIll.channels = lllllllllllllIIllIIIIIIIllIlIlIl.getChannels();
        lllllllllllllIIllIIIIIIIllIlIIll.rate = lllllllllllllIIllIIIIIIIllIlIlIl.getRate();
        final byte[] lllllllllllllIIllIIIIIIIllIlIIlI = lllllllllllllIIllIIIIIIIllIlIllI.toByteArray();
        lllllllllllllIIllIIIIIIIllIlIIll.data = ByteBuffer.allocateDirect(lllllllllllllIIllIIIIIIIllIlIIlI.length);
        lllllllllllllIIllIIIIIIIllIlIIll.data.put(lllllllllllllIIllIIIIIIIllIlIIlI);
        "".length();
        lllllllllllllIIllIIIIIIIllIlIIll.data.rewind();
        "".length();
        return lllllllllllllIIllIIIIIIIllIlIIll;
    }
    
    private static boolean llIlIlIIIlIIIlI(final int lllllllllllllIIllIIIIIIIlIlIllII) {
        return lllllllllllllIIllIIIIIIIlIlIllII == 0;
    }
    
    private static boolean llIlIlIIIlIIIll(final int lllllllllllllIIllIIIIIIIlIllIIIl, final int lllllllllllllIIllIIIIIIIlIllIIII) {
        return lllllllllllllIIllIIIIIIIlIllIIIl < lllllllllllllIIllIIIIIIIlIllIIII;
    }
    
    public OggDecoder() {
        this.convsize = OggDecoder.lIIlIllllIIlII[0];
        this.convbuffer = new byte[this.convsize];
    }
}
