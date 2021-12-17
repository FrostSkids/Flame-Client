// 
// Decompiled by Procyon v0.5.36
// 

package io.netty.handler.codec.spdy;

import io.netty.buffer.Unpooled;
import io.netty.buffer.ByteBuf;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.zip.Deflater;

class SpdyHeaderBlockZlibEncoder extends SpdyHeaderBlockRawEncoder
{
    private static final /* synthetic */ String[] lIIIlllIllIIII;
    private static final /* synthetic */ int[] lIIIlllIllIIIl;
    private final /* synthetic */ Deflater compressor;
    private /* synthetic */ boolean finished;
    
    private static boolean llIIIlllIIIIIlI(final int lllllllllllllIIllllIllIlllIIlIII) {
        return lllllllllllllIIllllIllIlllIIlIII == 0;
    }
    
    private static boolean llIIIllIlllllIl(final int lllllllllllllIIllllIllIlllIIIllI) {
        return lllllllllllllIIllllIllIlllIIIllI >= 0;
    }
    
    private static String llIIIllIllllIlI(final String lllllllllllllIIllllIllIlllllIlIl, final String lllllllllllllIIllllIllIlllllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIllIllllllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIllIlllllIllI.getBytes(StandardCharsets.UTF_8)), SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[5]), "DES");
            final Cipher lllllllllllllIIllllIllIllllllIIl = Cipher.getInstance("DES");
            lllllllllllllIIllllIllIllllllIIl.init(SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[3], lllllllllllllIIllllIllIllllllIlI);
            return new String(lllllllllllllIIllllIllIllllllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIllIlllllIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIllIllllllIII) {
            lllllllllllllIIllllIllIllllllIII.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIllIlllllII();
        llIIIllIllllIll();
    }
    
    private static String llIIIllIllllIII(String lllllllllllllIIllllIllIllllIIIlI, final String lllllllllllllIIllllIllIllllIIllI) {
        lllllllllllllIIllllIllIllllIIIlI = (boolean)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIllIllllIIIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIllIllllIIlIl = new StringBuilder();
        final char[] lllllllllllllIIllllIllIllllIIlII = lllllllllllllIIllllIllIllllIIllI.toCharArray();
        int lllllllllllllIIllllIllIllllIIIll = SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1];
        final String lllllllllllllIIllllIllIlllIlllIl = (Object)((String)lllllllllllllIIllllIllIllllIIIlI).toCharArray();
        final double lllllllllllllIIllllIllIlllIlllII = lllllllllllllIIllllIllIlllIlllIl.length;
        double lllllllllllllIIllllIllIlllIllIll = SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1];
        while (llIIIlllIIIIIll((int)lllllllllllllIIllllIllIlllIllIll, (int)lllllllllllllIIllllIllIlllIlllII)) {
            final char lllllllllllllIIllllIllIllllIlIII = lllllllllllllIIllllIllIlllIlllIl[lllllllllllllIIllllIllIlllIllIll];
            lllllllllllllIIllllIllIllllIIlIl.append((char)(lllllllllllllIIllllIllIllllIlIII ^ lllllllllllllIIllllIllIllllIIlII[lllllllllllllIIllllIllIllllIIIll % lllllllllllllIIllllIllIllllIIlII.length]));
            "".length();
            ++lllllllllllllIIllllIllIllllIIIll;
            ++lllllllllllllIIllllIllIlllIllIll;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIllIllllIIlIl);
    }
    
    @Override
    public ByteBuf encode(final SpdyHeadersFrame lllllllllllllIIllllIlllIIIIlIlll) throws Exception {
        if (llIIIlllIIIIIIl(lllllllllllllIIllllIlllIIIIlIlll)) {
            throw new IllegalArgumentException(SpdyHeaderBlockZlibEncoder.lIIIlllIllIIII[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[3]]);
        }
        if (llIIIllIlllllll(this.finished ? 1 : 0)) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIIllllIlllIIIIlIllI = super.encode(lllllllllllllIIllllIlllIIIIlIlll);
        if (llIIIlllIIIIIlI(lllllllllllllIIllllIlllIIIIlIllI.readableBytes())) {
            return Unpooled.EMPTY_BUFFER;
        }
        final ByteBuf lllllllllllllIIllllIlllIIIIlIlIl = lllllllllllllIIllllIlllIIIIlIllI.alloc().heapBuffer(lllllllllllllIIllllIlllIIIIlIllI.readableBytes());
        final int lllllllllllllIIllllIlllIIIIlIlII = this.setInput(lllllllllllllIIllllIlllIIIIlIllI);
        this.encode(lllllllllllllIIllllIlllIIIIlIlIl);
        lllllllllllllIIllllIlllIIIIlIllI.skipBytes(lllllllllllllIIllllIlllIIIIlIlII);
        "".length();
        return lllllllllllllIIllllIlllIIIIlIlIl;
    }
    
    private void encode(final ByteBuf lllllllllllllIIllllIlllIIIllIIII) {
        while (llIIIllIlllllll(this.compressInto(lllllllllllllIIllllIlllIIIllIIII) ? 1 : 0)) {
            lllllllllllllIIllllIlllIIIllIIII.ensureWritable(lllllllllllllIIllllIlllIIIllIIII.capacity() << SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[2]);
            "".length();
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
        }
    }
    
    private static boolean llIIIlllIIIIIII(final int lllllllllllllIIllllIllIlllIlIlll, final int lllllllllllllIIllllIllIlllIlIllI) {
        return lllllllllllllIIllllIllIlllIlIlll == lllllllllllllIIllllIllIlllIlIllI;
    }
    
    private int setInput(final ByteBuf lllllllllllllIIllllIlllIIIlllIll) {
        final int lllllllllllllIIllllIlllIIIlllIlI = lllllllllllllIIllllIlllIIIlllIll.readableBytes();
        if (llIIIllIlllllll(lllllllllllllIIllllIlllIIIlllIll.hasArray() ? 1 : 0)) {
            this.compressor.setInput(lllllllllllllIIllllIlllIIIlllIll.array(), lllllllllllllIIllllIlllIIIlllIll.arrayOffset() + lllllllllllllIIllllIlllIIIlllIll.readerIndex(), lllllllllllllIIllllIlllIIIlllIlI);
            "".length();
            if ((0x80 ^ 0x84) == "  ".length()) {
                return (0xA6 ^ 0xBF) & ~(0x85 ^ 0x9C);
            }
        }
        else {
            final byte[] lllllllllllllIIllllIlllIIIllllIl = new byte[lllllllllllllIIllllIlllIIIlllIlI];
            lllllllllllllIIllllIlllIIIlllIll.getBytes(lllllllllllllIIllllIlllIIIlllIll.readerIndex(), lllllllllllllIIllllIlllIIIllllIl);
            "".length();
            this.compressor.setInput(lllllllllllllIIllllIlllIIIllllIl, SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1], lllllllllllllIIllllIlllIIIllllIl.length);
        }
        return lllllllllllllIIllllIlllIIIlllIlI;
    }
    
    private static String llIIIllIllllIIl(final String lllllllllllllIIllllIlllIIIIIIIlI, final String lllllllllllllIIllllIlllIIIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIlllIIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIlllIIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIlllIIIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIlllIIIIIIllI.init(SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[3], lllllllllllllIIllllIlllIIIIIIlll);
            return new String(lllllllllllllIIllllIlllIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIlllIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIlllIIIIIIlIl) {
            lllllllllllllIIllllIlllIIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    public void end() {
        if (llIIIllIlllllll(this.finished ? 1 : 0)) {
            return;
        }
        this.finished = (SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[2] != 0);
        this.compressor.end();
        super.end();
    }
    
    private static boolean llIIIllIlllllll(final int lllllllllllllIIllllIllIlllIIlIlI) {
        return lllllllllllllIIllllIllIlllIIlIlI != 0;
    }
    
    private static void llIIIllIlllllII() {
        (lIIIlllIllIIIl = new int[6])[0] = (0x3C ^ 0x35);
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1] = ((128 + 18 - 76 + 63 ^ 46 + 81 - 84 + 86) & (0x7F ^ 0x20 ^ (0x9D ^ 0xC6) ^ -" ".length()));
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[2] = " ".length();
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[3] = "  ".length();
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[4] = "   ".length();
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[5] = (0x63 ^ 0x6B);
    }
    
    private static boolean llIIIlllIIIIIIl(final Object lllllllllllllIIllllIllIlllIIllII) {
        return lllllllllllllIIllllIllIlllIIllII == null;
    }
    
    private static boolean llIIIlllIIIIIll(final int lllllllllllllIIllllIllIlllIlIIll, final int lllllllllllllIIllllIllIlllIlIIlI) {
        return lllllllllllllIIllllIllIlllIlIIll < lllllllllllllIIllllIllIlllIlIIlI;
    }
    
    private static boolean llIIIllIllllllI(final int lllllllllllllIIllllIllIlllIIllll, final int lllllllllllllIIllllIllIlllIIlllI) {
        return lllllllllllllIIllllIllIlllIIllll > lllllllllllllIIllllIllIlllIIlllI;
    }
    
    SpdyHeaderBlockZlibEncoder(final SpdyVersion lllllllllllllIIllllIlllIIlIIIIll, final int lllllllllllllIIllllIlllIIlIIIIlI) {
        super(lllllllllllllIIllllIlllIIlIIIIll);
        if (!llIIIllIlllllIl(lllllllllllllIIllllIlllIIlIIIIlI) || llIIIllIllllllI(lllllllllllllIIllllIlllIIlIIIIlI, SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[0])) {
            throw new IllegalArgumentException(String.valueOf(new StringBuilder().append(SpdyHeaderBlockZlibEncoder.lIIIlllIllIIII[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1]]).append(lllllllllllllIIllllIlllIIlIIIIlI).append(SpdyHeaderBlockZlibEncoder.lIIIlllIllIIII[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[2]])));
        }
        this.compressor = new Deflater(lllllllllllllIIllllIlllIIlIIIIlI);
        this.compressor.setDictionary(SpdyCodecUtil.SPDY_DICT);
    }
    
    private boolean compressInto(final ByteBuf lllllllllllllIIllllIlllIIIlIlIII) {
        final byte[] lllllllllllllIIllllIlllIIIlIIlll = lllllllllllllIIllllIlllIIIlIlIII.array();
        final int lllllllllllllIIllllIlllIIIlIIllI = lllllllllllllIIllllIlllIIIlIlIII.arrayOffset() + lllllllllllllIIllllIlllIIIlIlIII.writerIndex();
        final int lllllllllllllIIllllIlllIIIlIIlIl = lllllllllllllIIllllIlllIIIlIlIII.writableBytes();
        final int lllllllllllllIIllllIlllIIIlIIlII = this.compressor.deflate(lllllllllllllIIllllIlllIIIlIIlll, lllllllllllllIIllllIlllIIIlIIllI, lllllllllllllIIllllIlllIIIlIIlIl, SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[3]);
        lllllllllllllIIllllIlllIIIlIlIII.writerIndex(lllllllllllllIIllllIlllIIIlIlIII.writerIndex() + lllllllllllllIIllllIlllIIIlIIlII);
        "".length();
        int n;
        if (llIIIlllIIIIIII(lllllllllllllIIllllIlllIIIlIIlII, lllllllllllllIIllllIlllIIIlIIlIl)) {
            n = SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[2];
            "".length();
            if (null != null) {
                return ((0x37 ^ 0x68) & ~(0x21 ^ 0x7E)) != 0x0;
            }
        }
        else {
            n = SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1];
        }
        return n != 0;
    }
    
    private static void llIIIllIllllIll() {
        (lIIIlllIllIIII = new String[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[4]])[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[1]] = llIIIllIllllIII("JDk7JiUiJSU/OCkaMyAyK2x2", "GVVVW");
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIII[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[2]] = llIIIllIllllIIl("GLavXtPp12r1nb8BrLcRpH0NRGFMJ7oF", "lAlrQ");
        SpdyHeaderBlockZlibEncoder.lIIIlllIllIIII[SpdyHeaderBlockZlibEncoder.lIIIlllIllIIIl[3]] = llIIIllIllllIlI("RIk3jTqbAk4=", "bdPwI");
    }
}
