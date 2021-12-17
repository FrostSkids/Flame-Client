// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import java.util.Iterator;
import java.util.Set;
import io.netty.buffer.Unpooled;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import io.netty.buffer.ByteBuf;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class SpdyHeaderBlockRawEncoder extends SpdyHeaderBlockEncoder
{
    private static final /* synthetic */ int[] lIIllIIlIlllII;
    private final /* synthetic */ int version;
    private static final /* synthetic */ String[] lIIllIIlIllIlI;
    
    private static String llIlIlllIlIllll(String lllllllllllllIIlIllIIIIIIlIlIlIl, final String lllllllllllllIIlIllIIIIIIlIlIlII) {
        lllllllllllllIIlIllIIIIIIlIlIlIl = new String(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIIlIlIlIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIllIIIIIIlIllIII = new StringBuilder();
        final char[] lllllllllllllIIlIllIIIIIIlIlIlll = lllllllllllllIIlIllIIIIIIlIlIlII.toCharArray();
        int lllllllllllllIIlIllIIIIIIlIlIllI = SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[0];
        final boolean lllllllllllllIIlIllIIIIIIlIlIIII = (Object)lllllllllllllIIlIllIIIIIIlIlIlIl.toCharArray();
        final byte lllllllllllllIIlIllIIIIIIlIIllll = (byte)lllllllllllllIIlIllIIIIIIlIlIIII.length;
        char lllllllllllllIIlIllIIIIIIlIIlllI = (char)SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[0];
        while (llIlIlllIllllII(lllllllllllllIIlIllIIIIIIlIIlllI, lllllllllllllIIlIllIIIIIIlIIllll)) {
            final char lllllllllllllIIlIllIIIIIIlIllIll = lllllllllllllIIlIllIIIIIIlIlIIII[lllllllllllllIIlIllIIIIIIlIIlllI];
            lllllllllllllIIlIllIIIIIIlIllIII.append((char)(lllllllllllllIIlIllIIIIIIlIllIll ^ lllllllllllllIIlIllIIIIIIlIlIlll[lllllllllllllIIlIllIIIIIIlIlIllI % lllllllllllllIIlIllIIIIIIlIlIlll.length]));
            "".length();
            ++lllllllllllllIIlIllIIIIIIlIlIllI;
            ++lllllllllllllIIlIllIIIIIIlIIlllI;
            "".length();
            if (-" ".length() >= ((0x1D ^ 0x4D) & ~(0x3A ^ 0x6A))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIllIIIIIIlIllIII);
    }
    
    @Override
    void end() {
    }
    
    private static void writeLengthField(final ByteBuf lllllllllllllIIlIllIIIIIlIIllIIl, final int lllllllllllllIIlIllIIIIIlIIllIlI) {
        lllllllllllllIIlIllIIIIIlIIllIIl.writeInt(lllllllllllllIIlIllIIIIIlIIllIlI);
        "".length();
    }
    
    private static String llIlIlllIllIIII(final String lllllllllllllIIlIllIIIIIIllIlIII, final String lllllllllllllIIlIllIIIIIIllIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIIIllIIlll.getBytes(StandardCharsets.UTF_8)), SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[7]), "DES");
            final Cipher lllllllllllllIIlIllIIIIIIllIllII = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIIIIllIllII.init(SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[3], lllllllllllllIIlIllIIIIIIllIllIl);
            return new String(lllllllllllllIIlIllIIIIIIllIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIIIIllIlIll) {
            lllllllllllllIIlIllIIIIIIllIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIlllIlllIll(final int lllllllllllllIIlIllIIIIIIIllllIl) {
        return lllllllllllllIIlIllIIIIIIIllllIl > 0;
    }
    
    private static boolean llIlIlllIlllIlI(final int lllllllllllllIIlIllIIIIIIlIIIIIl) {
        return lllllllllllllIIlIllIIIIIIlIIIIIl != 0;
    }
    
    static {
        llIlIlllIllIllI();
        llIlIlllIllIIIl();
    }
    
    private static void llIlIlllIllIllI() {
        (lIIllIIlIlllII = new int[8])[0] = ((0x4F ^ 0x77) & ~(0x89 ^ 0xB1) & ~((0x1 ^ 0x16) & ~(0x48 ^ 0x5F)));
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[1] = (-" ".length() & (-1 & 0xFFFF));
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[2] = " ".length();
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[3] = "  ".length();
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[4] = "   ".length();
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[5] = (0x87 ^ 0xB6 ^ (0x61 ^ 0x54));
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[6] = (0x9C ^ 0x99);
        SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[7] = (0x61 ^ 0x1D ^ (0xCE ^ 0xBA));
    }
    
    private static boolean llIlIlllIllllII(final int lllllllllllllIIlIllIIIIIIlIIlIlI, final int lllllllllllllIIlIllIIIIIIlIIlIIl) {
        return lllllllllllllIIlIllIIIIIIlIIlIlI < lllllllllllllIIlIllIIIIIIlIIlIIl;
    }
    
    private static void setLengthField(final ByteBuf lllllllllllllIIlIllIIIIIlIlIIIII, final int lllllllllllllIIlIllIIIIIlIIlllll, final int lllllllllllllIIlIllIIIIIlIlIIIIl) {
        lllllllllllllIIlIllIIIIIlIlIIIII.setInt(lllllllllllllIIlIllIIIIIlIIlllll, lllllllllllllIIlIllIIIIIlIlIIIIl);
        "".length();
    }
    
    private static boolean llIlIlllIlllIIl(final int lllllllllllllIIlIllIIIIIIlIIIllI, final int lllllllllllllIIlIllIIIIIIlIIIlIl) {
        return lllllllllllllIIlIllIIIIIIlIIIllI > lllllllllllllIIlIllIIIIIIlIIIlIl;
    }
    
    public ByteBuf encode(final SpdyHeadersFrame lllllllllllllIIlIllIIIIIlIIIIIlI) throws Exception {
        final Set<String> lllllllllllllIIlIllIIIIIlIIIIIIl = lllllllllllllIIlIllIIIIIlIIIIIlI.headers().names();
        final int lllllllllllllIIlIllIIIIIlIIIIIII = lllllllllllllIIlIllIIIIIlIIIIIIl.size();
        if (llIlIlllIlllIII(lllllllllllllIIlIllIIIIIlIIIIIII)) {
            return Unpooled.EMPTY_BUFFER;
        }
        if (llIlIlllIlllIIl(lllllllllllllIIlIllIIIIIlIIIIIII, SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[1])) {
            throw new IllegalArgumentException(SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[2]]);
        }
        final ByteBuf lllllllllllllIIlIllIIIIIIlllllll = Unpooled.buffer();
        writeLengthField(lllllllllllllIIlIllIIIIIIlllllll, lllllllllllllIIlIllIIIIIlIIIIIII);
        final Iterator lllllllllllllIIlIllIIIIIlIIIIlII = lllllllllllllIIlIllIIIIIlIIIIIIl.iterator();
        while (llIlIlllIlllIlI(lllllllllllllIIlIllIIIIIlIIIIlII.hasNext() ? 1 : 0)) {
            final String lllllllllllllIIlIllIIIIIlIIIIlIl = lllllllllllllIIlIllIIIIIlIIIIlII.next();
            final byte[] lllllllllllllIIlIllIIIIIlIIIlIII = lllllllllllllIIlIllIIIIIlIIIIlIl.getBytes(SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[3]]);
            writeLengthField(lllllllllllllIIlIllIIIIIIlllllll, lllllllllllllIIlIllIIIIIlIIIlIII.length);
            lllllllllllllIIlIllIIIIIIlllllll.writeBytes(lllllllllllllIIlIllIIIIIlIIIlIII);
            "".length();
            final int lllllllllllllIIlIllIIIIIlIIIIlll = lllllllllllllIIlIllIIIIIIlllllll.writerIndex();
            int lllllllllllllIIlIllIIIIIlIIIIllI = SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[0];
            writeLengthField(lllllllllllllIIlIllIIIIIIlllllll, lllllllllllllIIlIllIIIIIlIIIIllI);
            final Iterator lllllllllllllIIlIllIIIIIlIIIlIIl = lllllllllllllIIlIllIIIIIlIIIIIlI.headers().getAll(lllllllllllllIIlIllIIIIIlIIIIlIl).iterator();
            while (llIlIlllIlllIlI(lllllllllllllIIlIllIIIIIlIIIlIIl.hasNext() ? 1 : 0)) {
                final String lllllllllllllIIlIllIIIIIlIIIlIlI = lllllllllllllIIlIllIIIIIlIIIlIIl.next();
                final byte[] lllllllllllllIIlIllIIIIIlIIIlIll = lllllllllllllIIlIllIIIIIlIIIlIlI.getBytes(SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[4]]);
                if (llIlIlllIlllIll(lllllllllllllIIlIllIIIIIlIIIlIll.length)) {
                    lllllllllllllIIlIllIIIIIIlllllll.writeBytes(lllllllllllllIIlIllIIIIIlIIIlIll);
                    "".length();
                    lllllllllllllIIlIllIIIIIIlllllll.writeByte(SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[0]);
                    "".length();
                    lllllllllllllIIlIllIIIIIlIIIIllI += lllllllllllllIIlIllIIIIIlIIIlIll.length + SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[2];
                }
                "".length();
                if (null != null) {
                    return null;
                }
            }
            if (llIlIlllIlllIlI(lllllllllllllIIlIllIIIIIlIIIIllI)) {
                --lllllllllllllIIlIllIIIIIlIIIIllI;
            }
            if (llIlIlllIlllIIl(lllllllllllllIIlIllIIIIIlIIIIllI, SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[1])) {
                throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[5]]).append(lllllllllllllIIlIllIIIIIlIIIIlIl)));
            }
            if (llIlIlllIlllIll(lllllllllllllIIlIllIIIIIlIIIIllI)) {
                setLengthField(lllllllllllllIIlIllIIIIIIlllllll, lllllllllllllIIlIllIIIIIlIIIIlll, lllllllllllllIIlIllIIIIIlIIIIllI);
                lllllllllllllIIlIllIIIIIIlllllll.writerIndex(lllllllllllllIIlIllIIIIIIlllllll.writerIndex() - SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[2]);
                "".length();
            }
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        return lllllllllllllIIlIllIIIIIIlllllll;
    }
    
    private static boolean llIlIlllIlllIII(final int lllllllllllllIIlIllIIIIIIIllllll) {
        return lllllllllllllIIlIllIIIIIIIllllll == 0;
    }
    
    private static void llIlIlllIllIIIl() {
        (lIIllIIlIllIlI = new String[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[6]])[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[0]] = llIlIlllIlIllll("GSY3GgEALQ==", "oCEih");
        SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[2]] = llIlIlllIllIIII("26xnLaOiHUWi/jRVCtDqNMoYSZYwQAjt4orH7Ofz3TTXLAlJpcdKuw==", "wYfgn");
        SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[3]] = llIlIlllIllIIII("NdauyeyMQXM=", "NsGcg");
        SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[4]] = llIlIlllIllIIII("5uu80fqRhPI=", "fEBqs");
        SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[5]] = llIlIlllIllIIII("Eeehk0GSjbh6cYr67970OaZ8cmd3Zu3RgLko/V0zQkGkd6uBeGq6Tg==", "TJiFB");
    }
    
    private static boolean llIlIlllIllIlll(final Object lllllllllllllIIlIllIIIIIIlIIIIll) {
        return lllllllllllllIIlIllIIIIIIlIIIIll == null;
    }
    
    public SpdyHeaderBlockRawEncoder(final SpdyVersion lllllllllllllIIlIllIIIIIlIlIlIIl) {
        if (llIlIlllIllIlll(lllllllllllllIIlIllIIIIIlIlIlIIl)) {
            throw new NullPointerException(SpdyHeaderBlockRawEncoder.lIIllIIlIllIlI[SpdyHeaderBlockRawEncoder.lIIllIIlIlllII[0]]);
        }
        this.version = lllllllllllllIIlIllIIIIIlIlIlIIl.getVersion();
    }
}
