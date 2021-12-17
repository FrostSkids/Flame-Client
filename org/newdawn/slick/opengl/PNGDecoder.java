// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.util.zip.DataFormatException;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.zip.Inflater;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.io.IOException;
import java.util.zip.CRC32;
import java.io.InputStream;

public class PNGDecoder
{
    private /* synthetic */ int colorType;
    private /* synthetic */ int width;
    public static /* synthetic */ Format ABGR;
    private /* synthetic */ int bitdepth;
    public static /* synthetic */ Format RGBA;
    private /* synthetic */ int chunkRemaining;
    private final /* synthetic */ InputStream input;
    public static /* synthetic */ Format BGRA;
    public static /* synthetic */ Format RGB;
    public static /* synthetic */ Format ALPHA;
    public static /* synthetic */ Format LUMINANCE;
    private final /* synthetic */ byte[] buffer;
    private /* synthetic */ byte[] palette;
    private static final /* synthetic */ byte[] SIGNATURE;
    private /* synthetic */ int bytesPerPixel;
    private /* synthetic */ int chunkLength;
    private final /* synthetic */ CRC32 crc;
    private /* synthetic */ int height;
    private /* synthetic */ byte[] transPixel;
    private static final /* synthetic */ String[] llIlllllllIIll;
    private /* synthetic */ byte[] paletteA;
    public static /* synthetic */ Format LUMINANCE_ALPHA;
    private /* synthetic */ int chunkType;
    private static final /* synthetic */ int[] lllIIIIIIIIIIl;
    
    private void openChunk(final int llllllllllllIllIIIlIIllIIllIIlIl) throws IOException {
        this.openChunk();
        if (lIIllIllllIIIIII(this.chunkType, llllllllllllIllIIIlIIllIIllIIlIl)) {
            throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[28]]).append(Integer.toHexString(llllllllllllIllIIIlIIllIIllIIlIl))));
        }
    }
    
    private void copyRGBtoBGRA(final ByteBuffer llllllllllllIllIIIlIIllllIllIllI, final byte[] llllllllllllIllIIIlIIllllIlllIII) {
        if (lIIllIllllIIIIIl(this.transPixel)) {
            final byte llllllllllllIllIIIlIIllllIllllll = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[4]];
            final byte llllllllllllIllIIIlIIllllIlllllI = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[3]];
            final byte llllllllllllIllIIIlIIllllIllllIl = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[10]];
            int llllllllllllIllIIIlIIlllllIIIIIl = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllllIIIIII = llllllllllllIllIIIlIIllllIlllIII.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllllIIIIIl, llllllllllllIllIIIlIIlllllIIIIII)) {
                final byte llllllllllllIllIIIlIIlllllIIIlIl = llllllllllllIllIIIlIIllllIlllIII[llllllllllllIllIIIlIIlllllIIIIIl];
                final byte llllllllllllIllIIIlIIlllllIIIlII = llllllllllllIllIIIlIIllllIlllIII[llllllllllllIllIIIlIIlllllIIIIIl + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllllIIIIll = llllllllllllIllIIIlIIllllIlllIII[llllllllllllIllIIIlIIlllllIIIIIl + PNGDecoder.lllIIIIIIIIIIl[6]];
                byte llllllllllllIllIIIlIIlllllIIIIlI = (byte)PNGDecoder.lllIIIIIIIIIIl[12];
                if (lIIllIlllIlllllI(llllllllllllIllIIIlIIlllllIIIlIl, llllllllllllIllIIIlIIllllIllllll) && lIIllIlllIlllllI(llllllllllllIllIIIlIIlllllIIIlII, llllllllllllIllIIIlIIllllIlllllI) && lIIllIlllIlllllI(llllllllllllIllIIIlIIlllllIIIIll, llllllllllllIllIIIlIIllllIllllIl)) {
                    llllllllllllIllIIIlIIlllllIIIIlI = (byte)PNGDecoder.lllIIIIIIIIIIl[1];
                }
                llllllllllllIllIIIlIIllllIllIllI.put(llllllllllllIllIIIlIIlllllIIIIll).put(llllllllllllIllIIIlIIlllllIIIlII).put(llllllllllllIllIIIlIIlllllIIIlIl).put(llllllllllllIllIIIlIIlllllIIIIlI);
                "".length();
                llllllllllllIllIIIlIIlllllIIIIIl += 3;
                "".length();
                if ((0x73 ^ 0x77) <= " ".length()) {
                    return;
                }
            }
            "".length();
            if ("   ".length() < -" ".length()) {
                return;
            }
        }
        else {
            int llllllllllllIllIIIlIIllllIllllII = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIllllIlllIll = llllllllllllIllIIIlIIllllIlllIII.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllllIllllII, llllllllllllIllIIIlIIllllIlllIll)) {
                llllllllllllIllIIIlIIllllIllIllI.put(llllllllllllIllIIIlIIllllIlllIII[llllllllllllIllIIIlIIllllIllllII + PNGDecoder.lllIIIIIIIIIIl[6]]).put(llllllllllllIllIIIlIIllllIlllIII[llllllllllllIllIIIlIIllllIllllII + PNGDecoder.lllIIIIIIIIIIl[4]]).put(llllllllllllIllIIIlIIllllIlllIII[llllllllllllIllIIIlIIllllIllllII]).put((byte)PNGDecoder.lllIIIIIIIIIIl[12]);
                "".length();
                llllllllllllIllIIIlIIllllIllllII += 3;
                "".length();
                if (-" ".length() >= (0xCA ^ 0xC7 ^ (0x8B ^ 0x82))) {
                    return;
                }
            }
        }
    }
    
    private void openChunk() throws IOException {
        this.readFully(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1], PNGDecoder.lllIIIIIIIIIIl[8]);
        this.chunkLength = this.readInt(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1]);
        this.chunkType = this.readInt(this.buffer, PNGDecoder.lllIIIIIIIIIIl[9]);
        this.chunkRemaining = this.chunkLength;
        this.crc.reset();
        this.crc.update(this.buffer, PNGDecoder.lllIIIIIIIIIIl[9], PNGDecoder.lllIIIIIIIIIIl[9]);
    }
    
    private static boolean lIIllIlllIlllllI(final int llllllllllllIllIIIlIIlIlllIlllIl, final int llllllllllllIllIIIlIIlIlllIlllII) {
        return llllllllllllIllIIIlIIlIlllIlllIl == llllllllllllIllIIIlIIlIlllIlllII;
    }
    
    private void copyRGBtoRGBA(final ByteBuffer llllllllllllIllIIIlIIlllllIlllII, final byte[] llllllllllllIllIIIlIIlllllIllllI) {
        if (lIIllIllllIIIIIl(this.transPixel)) {
            final byte llllllllllllIllIIIlIIllllllIIlIl = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[4]];
            final byte llllllllllllIllIIIlIIllllllIIlII = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[3]];
            final byte llllllllllllIllIIIlIIllllllIIIll = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[10]];
            int llllllllllllIllIIIlIIllllllIIlll = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIllllllIIllI = llllllllllllIllIIIlIIlllllIllllI.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllllllIIlll, llllllllllllIllIIIlIIllllllIIllI)) {
                final byte llllllllllllIllIIIlIIllllllIlIll = llllllllllllIllIIIlIIlllllIllllI[llllllllllllIllIIIlIIllllllIIlll];
                final byte llllllllllllIllIIIlIIllllllIlIlI = llllllllllllIllIIIlIIlllllIllllI[llllllllllllIllIIIlIIllllllIIlll + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIllllllIlIIl = llllllllllllIllIIIlIIlllllIllllI[llllllllllllIllIIIlIIllllllIIlll + PNGDecoder.lllIIIIIIIIIIl[6]];
                byte llllllllllllIllIIIlIIllllllIlIII = (byte)PNGDecoder.lllIIIIIIIIIIl[12];
                if (lIIllIlllIlllllI(llllllllllllIllIIIlIIllllllIlIll, llllllllllllIllIIIlIIllllllIIlIl) && lIIllIlllIlllllI(llllllllllllIllIIIlIIllllllIlIlI, llllllllllllIllIIIlIIllllllIIlII) && lIIllIlllIlllllI(llllllllllllIllIIIlIIllllllIlIIl, llllllllllllIllIIIlIIllllllIIIll)) {
                    llllllllllllIllIIIlIIllllllIlIII = (byte)PNGDecoder.lllIIIIIIIIIIl[1];
                }
                llllllllllllIllIIIlIIlllllIlllII.put(llllllllllllIllIIIlIIllllllIlIll).put(llllllllllllIllIIIlIIllllllIlIlI).put(llllllllllllIllIIIlIIllllllIlIIl).put(llllllllllllIllIIIlIIllllllIlIII);
                "".length();
                llllllllllllIllIIIlIIllllllIIlll += 3;
                "".length();
                if (" ".length() < ((0x9 ^ 0x41) & ~(0x7D ^ 0x35))) {
                    return;
                }
            }
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        else {
            int llllllllllllIllIIIlIIllllllIIIlI = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIllllllIIIIl = llllllllllllIllIIIlIIlllllIllllI.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllllllIIIlI, llllllllllllIllIIIlIIllllllIIIIl)) {
                llllllllllllIllIIIlIIlllllIlllII.put(llllllllllllIllIIIlIIlllllIllllI[llllllllllllIllIIIlIIllllllIIIlI]).put(llllllllllllIllIIIlIIlllllIllllI[llllllllllllIllIIIlIIllllllIIIlI + PNGDecoder.lllIIIIIIIIIIl[4]]).put(llllllllllllIllIIIlIIlllllIllllI[llllllllllllIllIIIlIIllllllIIIlI + PNGDecoder.lllIIIIIIIIIIl[6]]).put((byte)PNGDecoder.lllIIIIIIIIIIl[12]);
                "".length();
                llllllllllllIllIIIlIIllllllIIIlI += 3;
                "".length();
                if ((0x7 ^ 0x48 ^ (0xD6 ^ 0x9D)) != (12 + 8 + 59 + 51 ^ 58 + 60 - 98 + 114)) {
                    return;
                }
            }
        }
    }
    
    public int getWidth() {
        return this.width;
    }
    
    private void copyRGBAtoRGB(final ByteBuffer llllllllllllIllIIIlIIllllIIIlIII, final byte[] llllllllllllIllIIIlIIllllIIIIlll) {
        int llllllllllllIllIIIlIIllllIIIllIl = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllllIIIllII = llllllllllllIllIIIlIIllllIIIIlll.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllllIIIllIl, llllllllllllIllIIIlIIllllIIIllII)) {
            llllllllllllIllIIIlIIllllIIIlIII.put(llllllllllllIllIIIlIIllllIIIIlll[llllllllllllIllIIIlIIllllIIIllIl]).put(llllllllllllIllIIIlIIllllIIIIlll[llllllllllllIllIIIlIIllllIIIllIl + PNGDecoder.lllIIIIIIIIIIl[4]]).put(llllllllllllIllIIIlIIllllIIIIlll[llllllllllllIllIIIlIIllllIIIllIl + PNGDecoder.lllIIIIIIIIIIl[6]]);
            "".length();
            llllllllllllIllIIIlIIllllIIIllIl += 4;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private void expand2(final byte[] llllllllllllIllIIIlIIllIllllllII, final byte[] llllllllllllIllIIIlIIllIlllllIll) {
        int llllllllllllIllIIIlIIllIllllllll = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllIlllllllI = llllllllllllIllIIIlIIllIlllllIll.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIllllllll, llllllllllllIllIIIlIIllIlllllllI)) {
            final int llllllllllllIllIIIlIIlllIIIIIIII = llllllllllllIllIIIlIIllIllllllII[PNGDecoder.lllIIIIIIIIIIl[4] + (llllllllllllIllIIIlIIllIllllllll >> PNGDecoder.lllIIIIIIIIIIl[6])] & PNGDecoder.lllIIIIIIIIIIl[13];
            switch (llllllllllllIllIIIlIIllIlllllllI - llllllllllllIllIIIlIIllIllllllll) {
                default: {
                    llllllllllllIllIIIlIIllIlllllIll[llllllllllllIllIIIlIIllIllllllll + PNGDecoder.lllIIIIIIIIIIl[3]] = (byte)(llllllllllllIllIIIlIIlllIIIIIIII & PNGDecoder.lllIIIIIIIIIIl[3]);
                }
                case 3: {
                    llllllllllllIllIIIlIIllIlllllIll[llllllllllllIllIIIlIIllIllllllll + PNGDecoder.lllIIIIIIIIIIl[6]] = (byte)(llllllllllllIllIIIlIIlllIIIIIIII >> PNGDecoder.lllIIIIIIIIIIl[6] & PNGDecoder.lllIIIIIIIIIIl[3]);
                }
                case 2: {
                    llllllllllllIllIIIlIIllIlllllIll[llllllllllllIllIIIlIIllIllllllll + PNGDecoder.lllIIIIIIIIIIl[4]] = (byte)(llllllllllllIllIIIlIIlllIIIIIIII >> PNGDecoder.lllIIIIIIIIIIl[9] & PNGDecoder.lllIIIIIIIIIIl[3]);
                }
                case 1: {
                    llllllllllllIllIIIlIIllIlllllIll[llllllllllllIllIIIlIIllIllllllll] = (byte)(llllllllllllIllIIIlIIlllIIIIIIII >> PNGDecoder.lllIIIIIIIIIIl[5]);
                    llllllllllllIllIIIlIIllIllllllll += 4;
                    "".length();
                    if ((123 + 64 - 173 + 123 ^ 8 + 57 + 70 + 6) <= ((5 + 123 + 30 + 28 ^ 47 + 16 + 45 + 41) & (80 + 99 - 68 + 69 ^ 72 + 3 + 44 + 36 ^ -" ".length()))) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    private void closeChunk() throws IOException {
        if (lIIllIllllIIlIIl(this.chunkRemaining)) {
            this.skip(this.chunkRemaining + PNGDecoder.lllIIIIIIIIIIl[9]);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            this.readFully(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1], PNGDecoder.lllIIIIIIIIIIl[9]);
            final int llllllllllllIllIIIlIIllIIlllIIll = this.readInt(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1]);
            final int llllllllllllIllIIIlIIllIIlllIIlI = (int)this.crc.getValue();
            if (lIIllIllllIIIIII(llllllllllllIllIIIlIIllIIlllIIlI, llllllllllllIllIIIlIIllIIlllIIll)) {
                throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[27]]);
            }
        }
        this.chunkRemaining = PNGDecoder.lllIIIIIIIIIIl[1];
        this.chunkLength = PNGDecoder.lllIIIIIIIIIIl[1];
        this.chunkType = PNGDecoder.lllIIIIIIIIIIl[1];
    }
    
    private static void lIIllIlllIllllII() {
        (lllIIIIIIIIIIl = new int[42])[0] = (-(0xFFFFDEE2 & 0x67DD) & (0xFFFFF6BF & 0x5FFF));
        PNGDecoder.lllIIIIIIIIIIl[1] = ("   ".length() & ("   ".length() ^ -" ".length()));
        PNGDecoder.lllIIIIIIIIIIl[2] = (-(0xFFFFB7E5 & 0x5ABB) & (0xFFFFDFF7 & 0x494876FA));
        PNGDecoder.lllIIIIIIIIIIl[3] = "   ".length();
        PNGDecoder.lllIIIIIIIIIIl[4] = " ".length();
        PNGDecoder.lllIIIIIIIIIIl[5] = (0x7F ^ 0x26 ^ (0xF8 ^ 0xA7));
        PNGDecoder.lllIIIIIIIIIIl[6] = "  ".length();
        PNGDecoder.lllIIIIIIIIIIl[7] = (0x3C ^ 0x3B);
        PNGDecoder.lllIIIIIIIIIIl[8] = (0x95 ^ 0x9D);
        PNGDecoder.lllIIIIIIIIIIl[9] = (0x2 ^ 0x6);
        PNGDecoder.lllIIIIIIIIIIl[10] = (0x43 ^ 0x46);
        PNGDecoder.lllIIIIIIIIIIl[11] = (0x48 ^ 0x40 ^ " ".length());
        PNGDecoder.lllIIIIIIIIIIl[12] = -" ".length();
        PNGDecoder.lllIIIIIIIIIIl[13] = 55 + 79 - 13 + 134;
        PNGDecoder.lllIIIIIIIIIIl[14] = (0x3C ^ 0x53 ^ (0x2C ^ 0x4C));
        PNGDecoder.lllIIIIIIIIIIl[15] = (0x9C ^ 0x96);
        PNGDecoder.lllIIIIIIIIIIl[16] = (0xCA ^ 0xC7);
        PNGDecoder.lllIIIIIIIIIIl[17] = (0x34 ^ 0x3F);
        PNGDecoder.lllIIIIIIIIIIl[18] = (0x6B ^ 0x67);
        PNGDecoder.lllIIIIIIIIIIl[19] = (0x1 ^ 0xF);
        PNGDecoder.lllIIIIIIIIIIl[20] = (0x99 ^ 0x89);
        PNGDecoder.lllIIIIIIIIIIl[21] = (0x6E ^ 0x76 ^ (0x2C ^ 0x25));
        PNGDecoder.lllIIIIIIIIIIl[22] = (10 + 123 - 4 + 18 ^ 71 + 37 - 65 + 86);
        PNGDecoder.lllIIIIIIIIIIl[23] = (0xF4 ^ 0xA8 ^ (0xC7 ^ 0x88));
        PNGDecoder.lllIIIIIIIIIIl[24] = (0xFFFFE77F & 0x1980);
        PNGDecoder.lllIIIIIIIIIIl[25] = (0x14 ^ 0x0);
        PNGDecoder.lllIIIIIIIIIIl[26] = (0x3A ^ 0x74 ^ (0x9 ^ 0x52));
        PNGDecoder.lllIIIIIIIIIIl[27] = (0x8A ^ 0x9C);
        PNGDecoder.lllIIIIIIIIIIl[28] = (0xAB ^ 0xBC);
        PNGDecoder.lllIIIIIIIIIIl[29] = (128 + 40 - 67 + 118 ^ 130 + 122 - 231 + 174);
        PNGDecoder.lllIIIIIIIIIIl[30] = (-(0xFFFFB1FB & 0x5E2F) & (0xFFFFDF7F & 0x494471FE));
        PNGDecoder.lllIIIIIIIIIIl[31] = (0x67 ^ 0x17 ^ (0xFE ^ 0x97));
        PNGDecoder.lllIIIIIIIIIIl[32] = (0xA7 ^ 0xBD);
        PNGDecoder.lllIIIIIIIIIIl[33] = (0x7C ^ 0x67);
        PNGDecoder.lllIIIIIIIIIIl[34] = (-(131 + 116 - 241 + 127) & (0xFFFFEFDF & 0x74525EF7));
        PNGDecoder.lllIIIIIIIIIIl[35] = (-(0xFFFFFCF9 & 0x2B87) & (0xFFFFFED5 & 0x504C7DEF));
        PNGDecoder.lllIIIIIIIIIIl[36] = (0xFFFFEEDD & 0x49455F66);
        PNGDecoder.lllIIIIIIIIIIl[37] = -(0xF8 ^ 0x8F ^ ((0x83 ^ 0xA3) & ~(0x3F ^ 0x1F)));
        PNGDecoder.lllIIIIIIIIIIl[38] = (66 + 9 + 94 + 46 ^ 71 + 58 - 115 + 121);
        PNGDecoder.lllIIIIIIIIIIl[39] = (0x47 ^ 0x9);
        PNGDecoder.lllIIIIIIIIIIl[40] = (0x82 ^ 0xC5);
        PNGDecoder.lllIIIIIIIIIIl[41] = (22 + 20 + 30 + 82 ^ 93 + 96 - 81 + 26);
    }
    
    private void copyPALtoRGBA(final ByteBuffer llllllllllllIllIIIlIIlllIlIIIIll, final byte[] llllllllllllIllIIIlIIlllIlIIIlIl) {
        if (lIIllIllllIIIIIl(this.paletteA)) {
            int llllllllllllIllIIIlIIlllIlIlIIII = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllIlIIllll = llllllllllllIllIIIlIIlllIlIIIlIl.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIlIlIIII, llllllllllllIllIIIlIIlllIlIIllll)) {
                final int llllllllllllIllIIIlIIlllIlIlIlIl = llllllllllllIllIIIlIIlllIlIIIlIl[llllllllllllIllIIIlIIlllIlIlIIII] & PNGDecoder.lllIIIIIIIIIIl[13];
                final byte llllllllllllIllIIIlIIlllIlIlIlII = this.palette[llllllllllllIllIIIlIIlllIlIlIlIl * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[1]];
                final byte llllllllllllIllIIIlIIlllIlIlIIll = this.palette[llllllllllllIllIIIlIIlllIlIlIlIl * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllIlIlIIlI = this.palette[llllllllllllIllIIIlIIlllIlIlIlIl * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[6]];
                final byte llllllllllllIllIIIlIIlllIlIlIIIl = this.paletteA[llllllllllllIllIIIlIIlllIlIlIlIl];
                llllllllllllIllIIIlIIlllIlIIIIll.put(llllllllllllIllIIIlIIlllIlIlIlII).put(llllllllllllIllIIIlIIlllIlIlIIll).put(llllllllllllIllIIIlIIlllIlIlIIlI).put(llllllllllllIllIIIlIIlllIlIlIIIl);
                "".length();
                ++llllllllllllIllIIIlIIlllIlIlIIII;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            int llllllllllllIllIIIlIIlllIlIIlIIl = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllIlIIlIII = llllllllllllIllIIIlIIlllIlIIIlIl.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIlIIlIIl, llllllllllllIllIIIlIIlllIlIIlIII)) {
                final int llllllllllllIllIIIlIIlllIlIIlllI = llllllllllllIllIIIlIIlllIlIIIlIl[llllllllllllIllIIIlIIlllIlIIlIIl] & PNGDecoder.lllIIIIIIIIIIl[13];
                final byte llllllllllllIllIIIlIIlllIlIIllIl = this.palette[llllllllllllIllIIIlIIlllIlIIlllI * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[1]];
                final byte llllllllllllIllIIIlIIlllIlIIllII = this.palette[llllllllllllIllIIIlIIlllIlIIlllI * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllIlIIlIll = this.palette[llllllllllllIllIIIlIIlllIlIIlllI * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[6]];
                final byte llllllllllllIllIIIlIIlllIlIIlIlI = (byte)PNGDecoder.lllIIIIIIIIIIl[12];
                llllllllllllIllIIIlIIlllIlIIIIll.put(llllllllllllIllIIIlIIlllIlIIllIl).put(llllllllllllIllIIIlIIlllIlIIllII).put(llllllllllllIllIIIlIIlllIlIIlIll).put(llllllllllllIllIIIlIIlllIlIIlIlI);
                "".length();
                ++llllllllllllIllIIIlIIlllIlIIlIIl;
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
        }
    }
    
    private static boolean lIIllIllllIIIIIl(final Object llllllllllllIllIIIlIIlIlllIIIllI) {
        return llllllllllllIllIIIlIIlIlllIIIllI != null;
    }
    
    private static boolean lIIllIllllIIIllI(final int llllllllllllIllIIIlIIlIllIlllIlI) {
        return llllllllllllIllIIIlIIlIllIlllIlI < 0;
    }
    
    private void copyRGBAtoABGR(final ByteBuffer llllllllllllIllIIIlIIllllIlIIIlI, final byte[] llllllllllllIllIIIlIIllllIlIIIll) {
        int llllllllllllIllIIIlIIllllIlIIlll = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllllIlIIllI = llllllllllllIllIIIlIIllllIlIIIll.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllllIlIIlll, llllllllllllIllIIIlIIllllIlIIllI)) {
            llllllllllllIllIIIlIIllllIlIIIlI.put(llllllllllllIllIIIlIIllllIlIIIll[llllllllllllIllIIIlIIllllIlIIlll + PNGDecoder.lllIIIIIIIIIIl[3]]).put(llllllllllllIllIIIlIIllllIlIIIll[llllllllllllIllIIIlIIllllIlIIlll + PNGDecoder.lllIIIIIIIIIIl[6]]).put(llllllllllllIllIIIlIIllllIlIIIll[llllllllllllIllIIIlIIllllIlIIlll + PNGDecoder.lllIIIIIIIIIIl[4]]).put(llllllllllllIllIIIlIIllllIlIIIll[llllllllllllIllIIIlIIllllIlIIlll]);
            "".length();
            llllllllllllIllIIIlIIllllIlIIlll += 4;
            "".length();
            if (-(0xA ^ 0xF) >= 0) {
                return;
            }
        }
    }
    
    private static boolean lIIllIlllIllllIl(final int llllllllllllIllIIIlIIlIllIllllII) {
        return llllllllllllIllIIIlIIlIllIllllII == 0;
    }
    
    public Format decideTextureFormat(final Format llllllllllllIllIIIlIlIIIIlIIllIl) {
        switch (this.colorType) {
            case 2: {
                if (!lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.ABGR) || !lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.RGBA) || !lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.BGRA) || lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.RGB)) {
                    return llllllllllllIllIIIlIlIIIIlIIllIl;
                }
                return PNGDecoder.RGB;
            }
            case 6: {
                if (!lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.ABGR) || !lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.RGBA) || !lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.BGRA) || lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.RGB)) {
                    return llllllllllllIllIIIlIlIIIIlIIllIl;
                }
                return PNGDecoder.RGBA;
            }
            case 0: {
                if (!lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.LUMINANCE) || lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.ALPHA)) {
                    return llllllllllllIllIIIlIlIIIIlIIllIl;
                }
                return PNGDecoder.LUMINANCE;
            }
            case 4: {
                return PNGDecoder.LUMINANCE_ALPHA;
            }
            case 3: {
                if (!lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.ABGR) || !lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.RGBA) || lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIlIIllIl, PNGDecoder.BGRA)) {
                    return llllllllllllIllIIIlIlIIIIlIIllIl;
                }
                return PNGDecoder.RGBA;
            }
            default: {
                throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[6]]);
            }
        }
    }
    
    private static boolean lIIllIllllIIlIII(final int llllllllllllIllIIIlIIlIlllIllIIl, final int llllllllllllIllIIIlIIlIlllIllIII) {
        return llllllllllllIllIIIlIIlIlllIllIIl >= llllllllllllIllIIIlIIlIlllIllIII;
    }
    
    private static boolean lIIllIllllIIlIll(final int llllllllllllIllIIIlIIlIllIlllIII) {
        return llllllllllllIllIIIlIIlIllIlllIII <= 0;
    }
    
    private void unfilter(final byte[] llllllllllllIllIIIlIIllIlllIIIIl, final byte[] llllllllllllIllIIIlIIllIllIlllIl) throws IOException {
        switch (llllllllllllIllIIIlIIllIlllIIIIl[PNGDecoder.lllIIIIIIIIIIl[1]]) {
            case 0: {
                "".length();
                if (((43 + 121 - 131 + 116 ^ 74 + 76 - 115 + 110) & (127 + 19 - 44 + 36 ^ 17 + 52 - 64 + 137 ^ -" ".length())) >= (0x31 ^ 0x22 ^ (0xB2 ^ 0xA5))) {
                    return;
                }
                break;
            }
            case 1: {
                this.unfilterSub(llllllllllllIllIIIlIIllIlllIIIIl);
                "".length();
                if (-" ".length() > -" ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                this.unfilterUp(llllllllllllIllIIIlIIllIlllIIIIl, llllllllllllIllIIIlIIllIllIlllIl);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 3: {
                this.unfilterAverage(llllllllllllIllIIIlIIllIlllIIIIl, llllllllllllIllIIIlIIllIllIlllIl);
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 4: {
                this.unfilterPaeth(llllllllllllIllIIIlIIllIlllIIIIl, llllllllllllIllIIIlIIllIllIlllIl);
                "".length();
                if (-(118 + 33 - 62 + 46 ^ 8 + 103 - 65 + 85) > 0) {
                    return;
                }
                break;
            }
            default: {
                throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[15]]).append(llllllllllllIllIIIlIIllIlllIIIIl[PNGDecoder.lllIIIIIIIIIIl[1]])));
            }
        }
    }
    
    public boolean hasAlpha() {
        int n;
        if (!lIIllIllllIIIIII(this.colorType, PNGDecoder.lllIIIIIIIIIIl[5]) || !lIIllIlllIllllll(this.paletteA) || lIIllIllllIIIIIl(this.transPixel)) {
            n = PNGDecoder.lllIIIIIIIIIIl[4];
            "".length();
            if ("   ".length() == 0) {
                return ((0x82 ^ 0x9A) & ~(0x97 ^ 0x8F)) != 0x0;
            }
        }
        else {
            n = PNGDecoder.lllIIIIIIIIIIl[1];
        }
        return n != 0;
    }
    
    private static boolean lIIllIllllIIIIII(final int llllllllllllIllIIIlIIlIllIllIIll, final int llllllllllllIllIIIlIIlIllIllIIlI) {
        return llllllllllllIllIIIlIIlIllIllIIll != llllllllllllIllIIIlIIlIllIllIIlI;
    }
    
    private void copyPALtoBGRA(final ByteBuffer llllllllllllIllIIIlIIlllIIIllllI, final byte[] llllllllllllIllIIIlIIlllIIIlllIl) {
        if (lIIllIllllIIIIIl(this.paletteA)) {
            int llllllllllllIllIIIlIIlllIIlIlIll = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllIIlIlIlI = llllllllllllIllIIIlIIlllIIIlllIl.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIIlIlIll, llllllllllllIllIIIlIIlllIIlIlIlI)) {
                final int llllllllllllIllIIIlIIlllIIllIIII = llllllllllllIllIIIlIIlllIIIlllIl[llllllllllllIllIIIlIIlllIIlIlIll] & PNGDecoder.lllIIIIIIIIIIl[13];
                final byte llllllllllllIllIIIlIIlllIIlIllll = this.palette[llllllllllllIllIIIlIIlllIIllIIII * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[1]];
                final byte llllllllllllIllIIIlIIlllIIlIlllI = this.palette[llllllllllllIllIIIlIIlllIIllIIII * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllIIlIllIl = this.palette[llllllllllllIllIIIlIIlllIIllIIII * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[6]];
                final byte llllllllllllIllIIIlIIlllIIlIllII = this.paletteA[llllllllllllIllIIIlIIlllIIllIIII];
                llllllllllllIllIIIlIIlllIIIllllI.put(llllllllllllIllIIIlIIlllIIlIllIl).put(llllllllllllIllIIIlIIlllIIlIlllI).put(llllllllllllIllIIIlIIlllIIlIllll).put(llllllllllllIllIIIlIIlllIIlIllII);
                "".length();
                ++llllllllllllIllIIIlIIlllIIlIlIll;
                "".length();
                if ("  ".length() <= -" ".length()) {
                    return;
                }
            }
            "".length();
            if (" ".length() > " ".length()) {
                return;
            }
        }
        else {
            int llllllllllllIllIIIlIIlllIIlIIlII = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllIIlIIIll = llllllllllllIllIIIlIIlllIIIlllIl.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIIlIIlII, llllllllllllIllIIIlIIlllIIlIIIll)) {
                final int llllllllllllIllIIIlIIlllIIlIlIIl = llllllllllllIllIIIlIIlllIIIlllIl[llllllllllllIllIIIlIIlllIIlIIlII] & PNGDecoder.lllIIIIIIIIIIl[13];
                final byte llllllllllllIllIIIlIIlllIIlIlIII = this.palette[llllllllllllIllIIIlIIlllIIlIlIIl * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[1]];
                final byte llllllllllllIllIIIlIIlllIIlIIlll = this.palette[llllllllllllIllIIIlIIlllIIlIlIIl * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllIIlIIllI = this.palette[llllllllllllIllIIIlIIlllIIlIlIIl * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[6]];
                final byte llllllllllllIllIIIlIIlllIIlIIlIl = (byte)PNGDecoder.lllIIIIIIIIIIl[12];
                llllllllllllIllIIIlIIlllIIIllllI.put(llllllllllllIllIIIlIIlllIIlIIllI).put(llllllllllllIllIIIlIIlllIIlIIlll).put(llllllllllllIllIIIlIIlllIIlIlIII).put(llllllllllllIllIIIlIIlllIIlIIlIl);
                "".length();
                ++llllllllllllIllIIIlIIlllIIlIIlII;
                "".length();
                if ("   ".length() == "  ".length()) {
                    return;
                }
            }
        }
    }
    
    private void readFully(final byte[] llllllllllllIllIIIlIIllIIIlIlIll, int llllllllllllIllIIIlIIllIIIlIlIlI, int llllllllllllIllIIIlIIllIIIlIlIIl) throws IOException {
        do {
            final int llllllllllllIllIIIlIIllIIIllIIIl = this.input.read(llllllllllllIllIIIlIIllIIIlIlIll, (int)llllllllllllIllIIIlIIllIIIlIlIlI, (int)llllllllllllIllIIIlIIllIIIlIlIIl);
            if (lIIllIllllIIIllI(llllllllllllIllIIIlIIllIIIllIIIl)) {
                throw new EOFException();
            }
            llllllllllllIllIIIlIIllIIIlIlIlI += llllllllllllIllIIIlIIllIIIllIIIl;
            llllllllllllIllIIIlIIllIIIlIlIIl -= llllllllllllIllIIIlIIllIIIllIIIl;
        } while (!lIIllIllllIIlIll((int)llllllllllllIllIIIlIIllIIIlIlIIl));
    }
    
    private void refillInflater(final Inflater llllllllllllIllIIIlIIllIIlIIlllI) throws IOException {
        while (lIIllIlllIllllIl(this.chunkRemaining)) {
            this.closeChunk();
            this.openChunk(PNGDecoder.lllIIIIIIIIIIl[30]);
            "".length();
            if ("  ".length() <= " ".length()) {
                return;
            }
        }
        final int llllllllllllIllIIIlIIllIIlIIllIl = this.readChunk(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1], this.buffer.length);
        llllllllllllIllIIIlIIllIIlIIlllI.setInput(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1], llllllllllllIllIIIlIIllIIlIIllIl);
    }
    
    private static boolean lIIllIllllIIlIlI(final int llllllllllllIllIIIlIIlIlllIIllIl, final int llllllllllllIllIIIlIIlIlllIIllII) {
        return llllllllllllIllIIIlIIlIlllIIllIl > llllllllllllIllIIIlIIlIlllIIllII;
    }
    
    public boolean isRGB() {
        int n;
        if (!lIIllIllllIIIIII(this.colorType, PNGDecoder.lllIIIIIIIIIIl[5]) || !lIIllIllllIIIIII(this.colorType, PNGDecoder.lllIIIIIIIIIIl[6]) || lIIllIlllIlllllI(this.colorType, PNGDecoder.lllIIIIIIIIIIl[3])) {
            n = PNGDecoder.lllIIIIIIIIIIl[4];
            "".length();
            if ((0x6B ^ 0x32 ^ (0x75 ^ 0x29)) == 0x0) {
                return ((0xD8 ^ 0x89 ^ (0x12 ^ 0x53)) & (0x48 ^ 0x73 ^ (0x38 ^ 0x13) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = PNGDecoder.lllIIIIIIIIIIl[1];
        }
        return n != 0;
    }
    
    private void expand1(final byte[] llllllllllllIllIIIlIIllIlllIllII, final byte[] llllllllllllIllIIIlIIllIlllIlIIl) {
        int llllllllllllIllIIIlIIllIlllIllll = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllIlllIlllI = llllllllllllIllIIIlIIllIlllIlIIl.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIlllIllll, llllllllllllIllIIIlIIllIlllIlllI)) {
            final int llllllllllllIllIIIlIIllIllllIIII = llllllllllllIllIIIlIIllIlllIllII[PNGDecoder.lllIIIIIIIIIIl[4] + (llllllllllllIllIIIlIIllIlllIllll >> PNGDecoder.lllIIIIIIIIIIl[3])] & PNGDecoder.lllIIIIIIIIIIl[13];
            switch (llllllllllllIllIIIlIIllIlllIlllI - llllllllllllIllIIIlIIllIlllIllll) {
                default: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[7]] = (byte)(llllllllllllIllIIIlIIllIllllIIII & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 7: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[5]] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[4] & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 6: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[10]] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[6] & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 5: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[9]] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[3] & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 4: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[3]] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[9] & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 3: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[6]] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[10] & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 2: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll + PNGDecoder.lllIIIIIIIIIIl[4]] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[5] & PNGDecoder.lllIIIIIIIIIIl[4]);
                }
                case 1: {
                    llllllllllllIllIIIlIIllIlllIlIIl[llllllllllllIllIIIlIIllIlllIllll] = (byte)(llllllllllllIllIIIlIIllIllllIIII >> PNGDecoder.lllIIIIIIIIIIl[7]);
                    llllllllllllIllIIIlIIllIlllIllll += 8;
                    "".length();
                    if (null != null) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    private static String lIIllIlllIIllIll(String llllllllllllIllIIIlIIlIllllIlIII, final String llllllllllllIllIIIlIIlIllllIIlll) {
        llllllllllllIllIIIlIIlIllllIlIII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIIlIIlIllllIlIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIIlIllllIlIll = new StringBuilder();
        final char[] llllllllllllIllIIIlIIlIllllIlIlI = llllllllllllIllIIIlIIlIllllIIlll.toCharArray();
        int llllllllllllIllIIIlIIlIllllIlIIl = PNGDecoder.lllIIIIIIIIIIl[1];
        final double llllllllllllIllIIIlIIlIllllIIIll = (Object)((String)llllllllllllIllIIIlIIlIllllIlIII).toCharArray();
        final double llllllllllllIllIIIlIIlIllllIIIlI = llllllllllllIllIIIlIIlIllllIIIll.length;
        float llllllllllllIllIIIlIIlIllllIIIIl = PNGDecoder.lllIIIIIIIIIIl[1];
        while (lIIllIllllIIIlII((int)llllllllllllIllIIIlIIlIllllIIIIl, (int)llllllllllllIllIIIlIIlIllllIIIlI)) {
            final char llllllllllllIllIIIlIIlIllllIlllI = llllllllllllIllIIIlIIlIllllIIIll[llllllllllllIllIIIlIIlIllllIIIIl];
            llllllllllllIllIIIlIIlIllllIlIll.append((char)(llllllllllllIllIIIlIIlIllllIlllI ^ llllllllllllIllIIIlIIlIllllIlIlI[llllllllllllIllIIIlIIlIllllIlIIl % llllllllllllIllIIIlIIlIllllIlIlI.length]));
            "".length();
            ++llllllllllllIllIIIlIIlIllllIlIIl;
            ++llllllllllllIllIIIlIIlIllllIIIIl;
            "".length();
            if (((0x74 ^ 0x71) & ~(0x4D ^ 0x48)) > " ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIIlIllllIlIll);
    }
    
    private static boolean lIIllIllllIIIIll(final Object llllllllllllIllIIIlIIlIlllIIIIll, final Object llllllllllllIllIIIlIIlIlllIIIIlI) {
        return llllllllllllIllIIIlIIlIlllIIIIll == llllllllllllIllIIIlIIlIlllIIIIlI;
    }
    
    private static boolean lIIllIllllIIIlll(final int llllllllllllIllIIIlIIlIllIlllllI) {
        return llllllllllllIllIIIlIIlIllIlllllI != 0;
    }
    
    private void unfilterPaeth(final byte[] llllllllllllIllIIIlIIllIlIIlIIll, final byte[] llllllllllllIllIIIlIIllIlIIIllIl) {
        final int llllllllllllIllIIIlIIllIlIIlIIIl = this.bytesPerPixel;
        int llllllllllllIllIIIlIIllIlIIlIIII = PNGDecoder.lllIIIIIIIIIIl[4];
        while (lIIllIllllIIIlIl(llllllllllllIllIIIlIIllIlIIlIIII, llllllllllllIllIIIlIIllIlIIlIIIl)) {
            final int n = llllllllllllIllIIIlIIllIlIIlIIII;
            llllllllllllIllIIIlIIllIlIIlIIll[n] += llllllllllllIllIIIlIIllIlIIIllIl[llllllllllllIllIIIlIIllIlIIlIIII];
            ++llllllllllllIllIIIlIIllIlIIlIIII;
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        final int llllllllllllIllIIIlIIllIlIIlIlIl = llllllllllllIllIIIlIIllIlIIlIIll.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIlIIlIIII, llllllllllllIllIIIlIIllIlIIlIlIl)) {
            final int llllllllllllIllIIIlIIllIlIIlllII = llllllllllllIllIIIlIIllIlIIlIIll[llllllllllllIllIIIlIIllIlIIlIIII - llllllllllllIllIIIlIIllIlIIlIIIl] & PNGDecoder.lllIIIIIIIIIIl[13];
            final int llllllllllllIllIIIlIIllIlIIllIll = llllllllllllIllIIIlIIllIlIIIllIl[llllllllllllIllIIIlIIllIlIIlIIII] & PNGDecoder.lllIIIIIIIIIIl[13];
            int llllllllllllIllIIIlIIllIlIIllIlI = llllllllllllIllIIIlIIllIlIIIllIl[llllllllllllIllIIIlIIllIlIIlIIII - llllllllllllIllIIIlIIllIlIIlIIIl] & PNGDecoder.lllIIIIIIIIIIl[13];
            final int llllllllllllIllIIIlIIllIlIIllIIl = llllllllllllIllIIIlIIllIlIIlllII + llllllllllllIllIIIlIIllIlIIllIll - llllllllllllIllIIIlIIllIlIIllIlI;
            int llllllllllllIllIIIlIIllIlIIllIII = llllllllllllIllIIIlIIllIlIIllIIl - llllllllllllIllIIIlIIllIlIIlllII;
            if (lIIllIllllIIIllI(llllllllllllIllIIIlIIllIlIIllIII)) {
                llllllllllllIllIIIlIIllIlIIllIII = -llllllllllllIllIIIlIIllIlIIllIII;
            }
            int llllllllllllIllIIIlIIllIlIIlIlll = llllllllllllIllIIIlIIllIlIIllIIl - llllllllllllIllIIIlIIllIlIIllIll;
            if (lIIllIllllIIIllI(llllllllllllIllIIIlIIllIlIIlIlll)) {
                llllllllllllIllIIIlIIllIlIIlIlll = -llllllllllllIllIIIlIIllIlIIlIlll;
            }
            int llllllllllllIllIIIlIIllIlIIlIllI = llllllllllllIllIIIlIIllIlIIllIIl - llllllllllllIllIIIlIIllIlIIllIlI;
            if (lIIllIllllIIIllI(llllllllllllIllIIIlIIllIlIIlIllI)) {
                llllllllllllIllIIIlIIllIlIIlIllI = -llllllllllllIllIIIlIIllIlIIlIllI;
            }
            if (lIIllIllllIIIlIl(llllllllllllIllIIIlIIllIlIIllIII, llllllllllllIllIIIlIIllIlIIlIlll) && lIIllIllllIIIlIl(llllllllllllIllIIIlIIllIlIIllIII, llllllllllllIllIIIlIIllIlIIlIllI)) {
                llllllllllllIllIIIlIIllIlIIllIlI = llllllllllllIllIIIlIIllIlIIlllII;
                "".length();
                if (-(0x2E ^ 0x2B) >= 0) {
                    return;
                }
            }
            else if (lIIllIllllIIIlIl(llllllllllllIllIIIlIIllIlIIlIlll, llllllllllllIllIIIlIIllIlIIlIllI)) {
                llllllllllllIllIIIlIIllIlIIllIlI = llllllllllllIllIIIlIIllIlIIllIll;
            }
            final int n2 = llllllllllllIllIIIlIIllIlIIlIIII;
            llllllllllllIllIIIlIIllIlIIlIIll[n2] += (byte)llllllllllllIllIIIlIIllIlIIllIlI;
            ++llllllllllllIllIIIlIIllIlIIlIIII;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private void copyRGBtoABGR(final ByteBuffer llllllllllllIllIIIlIlIIIIIIIIIlI, final byte[] llllllllllllIllIIIlIlIIIIIIIIlII) {
        if (lIIllIllllIIIIIl(this.transPixel)) {
            final byte llllllllllllIllIIIlIlIIIIIIIlIll = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[4]];
            final byte llllllllllllIllIIIlIlIIIIIIIlIlI = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[3]];
            final byte llllllllllllIllIIIlIlIIIIIIIlIIl = this.transPixel[PNGDecoder.lllIIIIIIIIIIl[10]];
            int llllllllllllIllIIIlIlIIIIIIIllIl = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIlIIIIIIIllII = llllllllllllIllIIIlIlIIIIIIIIlII.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIlIIIIIIIllIl, llllllllllllIllIIIlIlIIIIIIIllII)) {
                final byte llllllllllllIllIIIlIlIIIIIIlIIIl = llllllllllllIllIIIlIlIIIIIIIIlII[llllllllllllIllIIIlIlIIIIIIIllIl];
                final byte llllllllllllIllIIIlIlIIIIIIlIIII = llllllllllllIllIIIlIlIIIIIIIIlII[llllllllllllIllIIIlIlIIIIIIIllIl + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIlIIIIIIIllll = llllllllllllIllIIIlIlIIIIIIIIlII[llllllllllllIllIIIlIlIIIIIIIllIl + PNGDecoder.lllIIIIIIIIIIl[6]];
                byte llllllllllllIllIIIlIlIIIIIIIlllI = (byte)PNGDecoder.lllIIIIIIIIIIl[12];
                if (lIIllIlllIlllllI(llllllllllllIllIIIlIlIIIIIIlIIIl, llllllllllllIllIIIlIlIIIIIIIlIll) && lIIllIlllIlllllI(llllllllllllIllIIIlIlIIIIIIlIIII, llllllllllllIllIIIlIlIIIIIIIlIlI) && lIIllIlllIlllllI(llllllllllllIllIIIlIlIIIIIIIllll, llllllllllllIllIIIlIlIIIIIIIlIIl)) {
                    llllllllllllIllIIIlIlIIIIIIIlllI = (byte)PNGDecoder.lllIIIIIIIIIIl[1];
                }
                llllllllllllIllIIIlIlIIIIIIIIIlI.put(llllllllllllIllIIIlIlIIIIIIIlllI).put(llllllllllllIllIIIlIlIIIIIIIllll).put(llllllllllllIllIIIlIlIIIIIIlIIII).put(llllllllllllIllIIIlIlIIIIIIlIIIl);
                "".length();
                llllllllllllIllIIIlIlIIIIIIIllIl += 3;
                "".length();
                if (-" ".length() == ((0x50 ^ 0x43) & ~(0x55 ^ 0x46))) {
                    return;
                }
            }
            "".length();
            if ("  ".length() == -" ".length()) {
                return;
            }
        }
        else {
            int llllllllllllIllIIIlIlIIIIIIIlIII = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIlIIIIIIIIlll = llllllllllllIllIIIlIlIIIIIIIIlII.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIlIIIIIIIlIII, llllllllllllIllIIIlIlIIIIIIIIlll)) {
                llllllllllllIllIIIlIlIIIIIIIIIlI.put((byte)PNGDecoder.lllIIIIIIIIIIl[12]).put(llllllllllllIllIIIlIlIIIIIIIIlII[llllllllllllIllIIIlIlIIIIIIIlIII + PNGDecoder.lllIIIIIIIIIIl[6]]).put(llllllllllllIllIIIlIlIIIIIIIIlII[llllllllllllIllIIIlIlIIIIIIIlIII + PNGDecoder.lllIIIIIIIIIIl[4]]).put(llllllllllllIllIIIlIlIIIIIIIIlII[llllllllllllIllIIIlIlIIIIIIIlIII]);
                "".length();
                llllllllllllIllIIIlIlIIIIIIIlIII += 3;
                "".length();
                if ((0x33 ^ 0x37) == 0x0) {
                    return;
                }
            }
        }
    }
    
    private void copyRGBAtoBGRA(final ByteBuffer llllllllllllIllIIIlIIllllIIlIlll, final byte[] llllllllllllIllIIIlIIllllIIlIlII) {
        int llllllllllllIllIIIlIIllllIIllIlI = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllllIIllIIl = llllllllllllIllIIIlIIllllIIlIlII.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllllIIllIlI, llllllllllllIllIIIlIIllllIIllIIl)) {
            llllllllllllIllIIIlIIllllIIlIlll.put(llllllllllllIllIIIlIIllllIIlIlII[llllllllllllIllIIIlIIllllIIllIlI + PNGDecoder.lllIIIIIIIIIIl[6]]).put(llllllllllllIllIIIlIIllllIIlIlII[llllllllllllIllIIIlIIllllIIllIlI + PNGDecoder.lllIIIIIIIIIIl[4]]).put(llllllllllllIllIIIlIIllllIIlIlII[llllllllllllIllIIIlIIllllIIllIlI + PNGDecoder.lllIIIIIIIIIIl[1]]).put(llllllllllllIllIIIlIIllllIIlIlII[llllllllllllIllIIIlIIllllIIllIlI + PNGDecoder.lllIIIIIIIIIIl[3]]);
            "".length();
            llllllllllllIllIIIlIIllllIIllIlI += 4;
            "".length();
            if ("  ".length() >= (110 + 103 - 119 + 61 ^ 44 + 34 + 1 + 80)) {
                return;
            }
        }
    }
    
    private static boolean lIIllIllllIIIIlI(final Object llllllllllllIllIIIlIIlIlllIIlIIl, final Object llllllllllllIllIIIlIIlIlllIIlIII) {
        return llllllllllllIllIIIlIIlIlllIIlIIl != llllllllllllIllIIIlIIlIlllIIlIII;
    }
    
    private static void lIIllIlllIlIIlIl() {
        (llIlllllllIIll = new String[PNGDecoder.lllIIIIIIIIIIl[41]])[PNGDecoder.lllIIIIIIIIIIl[1]] = lIIllIlllIIlIlII("Mm4rgnwqurDtjuvm/8W0ajToSzQbhL8Z", "RCgxq");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[4]] = lIIllIlllIIlIlII("mYcLChtvhrO6Axy5Le2a1PnPZEQw8Vhl", "BXPtc");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[6]] = lIIllIlllIIlIlII("1waoGgxp0JjBW3sc74ETc4ufJEFtLYt4", "JScmC");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[3]] = lIIllIlllIIllIll("PgsFFxQbCgQWAQ9FEA0WBgQCQgIEF1YWDAIWVgsJCgIT", "kevbd");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[9]] = lIIllIlllIIllIll("MRQjLzsUFSIuLgBaNjU5CRskei0LCHAuIw0JcDMmBR01", "dzPZK");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[10]] = lIIllIlllIIlllII("Z4TPEaW9FtfDb6bdWPauseIfTxkCUNrgKQtYt43dihpozv7z/MD4qA==", "qCXgv");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[5]] = lIIllIlllIIlllII("PCPuU+hRBapF+2OnWJFGmpMy55f/asdl8aJQ/wMZz+nb6FxC5SdJmA==", "CkKra");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[7]] = lIIllIlllIIllIll("JBk1NggBGDQ3HRVXJCoMFRI2NxBRESkxWAUfLzBYGBonJB0=", "qwFCx");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[8]] = lIIllIlllIIllIll("MD4bAioVPxoDPwFwDhgoCDEcVzwKIkgDMgwjSB43BDcN", "ePhwZ");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[11]] = lIIllIlllIIllIll("JR0bWiMOBk8TNxseChc/BQYKHg==", "krozZ");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[15]] = lIIllIlllIIllIll("ICIXKSMgKARoKSAgFS09aTgYOCppJQ9oPCotDyQmJylbaA==", "ILaHO");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[17]] = lIIllIlllIIlIlII("lRdPtEfZrMmvHgQ0ZT+FpZpUUKX6pQnx", "soyHD");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[18]] = lIIllIlllIIlllII("XVzu0Bjl20L07sraEkN7wLZfZPmGZWMG", "SQluv");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[16]] = lIIllIlllIIlIlII("6AXNtJ4/0mRBsGakhPjTrzlr1JK1xqLN", "KvJNw");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[19]] = lIIllIlllIIlllII("e4SjKIIarxJw1UT8RbgJRTPYCcf7GqF7", "RnDVh");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[14]] = lIIllIlllIIlllII("jlLv+mSkOw0gosiotJAN+YVt6ZojBDXq", "OhRul");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[20]] = lIIllIlllIIlIlII("cqirv/7YCjCKZrem5Zj0fMMEL2eQsCAgUAnyO4CDGts=", "uWipH");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[21]] = lIIllIlllIIlIlII("Z/lFXtMes4w6QsB6TartBHbNuFFAvHhGq4PNrvonOkM=", "OjRWj");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[22]] = lIIllIlllIIlIlII("nGhQrPNQs+U6f0xewmL91HgW2viLjvNTHeJKCC7cKBs=", "GwWrc");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[23]] = lIIllIlllIIllIll("GDw/OT0dPT44KAlyJSI5CCAgLS4IciEpOQU9KA==", "mRLLM");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[25]] = lIIllIlllIIlIlII("aEOoqwOAFFwB6bCXnZYy3Kk6PrIcTU8iHCY4Aj+WOvk=", "wyZIq");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[26]] = lIIllIlllIIllIll("GjMjB0cNCRg6DE4WBCAPARQZdDciNSh0BAYUAz8=", "namTg");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[27]] = lIIllIlllIIllIll("LTw9By0NNmslEyc=", "dRKfA");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[28]] = lIIllIlllIIllIll("LDoVKA0dJwFtDQE3CyZUSQ==", "iBeMn");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[29]] = lIIllIlllIIlIlII("DbDD59oLl8goTAtOI3yzAVlNen9OsMeO", "GXUiJ");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[31]] = lIIllIlllIIlIlII("m4JNQ65lIzUWefuNBUITKg==", "IdljB");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[32]] = lIIllIlllIIlllII("246il0Kdlsk=", "tNXVq");
        PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[33]] = lIIllIlllIIlIlII("0sUmk525SDoIoUDCNPowMQ==", "baLyR");
    }
    
    private void unfilterUp(final byte[] llllllllllllIllIIIlIIllIllIIIlII, final byte[] llllllllllllIllIIIlIIllIllIIIIll) {
        final int llllllllllllIllIIIlIIllIllIIIIlI = this.bytesPerPixel;
        int llllllllllllIllIIIlIIllIllIIIlll = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllIllIIIllI = llllllllllllIllIIIlIIllIllIIIlII.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIllIIIlll, llllllllllllIllIIIlIIllIllIIIllI)) {
            final int n = llllllllllllIllIIIlIIllIllIIIlll;
            llllllllllllIllIIIlIIllIllIIIlII[n] += llllllllllllIllIIIlIIllIllIIIIll[llllllllllllIllIIIlIIllIllIIIlll];
            ++llllllllllllIllIIIlIIllIllIIIlll;
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
    }
    
    private static String lIIllIlllIIlllII(final String llllllllllllIllIIIlIIllIIIIIlIlI, final String llllllllllllIllIIIlIIllIIIIIlIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIllIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIllIIIIIlIIl.getBytes(StandardCharsets.UTF_8)), PNGDecoder.lllIIIIIIIIIIl[8]), "DES");
            final Cipher llllllllllllIllIIIlIIllIIIIIllII = Cipher.getInstance("DES");
            llllllllllllIllIIIlIIllIIIIIllII.init(PNGDecoder.lllIIIIIIIIIIl[6], llllllllllllIllIIIlIIllIIIIIllIl);
            return new String(llllllllllllIllIIIlIIllIIIIIllII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIllIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIllIIIIIlIll) {
            llllllllllllIllIIIlIIllIIIIIlIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean checkSignature(final byte[] llllllllllllIllIIIlIIllIIIIlIIll) {
        int llllllllllllIllIIIlIIllIIIIlIlIl = PNGDecoder.lllIIIIIIIIIIl[1];
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIIIIlIlIl, PNGDecoder.SIGNATURE.length)) {
            if (lIIllIllllIIIIII(llllllllllllIllIIIlIIllIIIIlIIll[llllllllllllIllIIIlIIllIIIIlIlIl], PNGDecoder.SIGNATURE[llllllllllllIllIIIlIIllIIIIlIlIl])) {
                return PNGDecoder.lllIIIIIIIIIIl[1] != 0;
            }
            ++llllllllllllIllIIIlIIllIIIIlIlIl;
            "".length();
            if (null != null) {
                return ((0xEE ^ 0xAA ^ (0x5B ^ 0x52)) & (82 + 187 - 153 + 138 ^ 35 + 39 - 9 + 114 ^ -" ".length())) != 0x0;
            }
        }
        return PNGDecoder.lllIIIIIIIIIIl[4] != 0;
    }
    
    private static boolean lIIllIllllIIlIIl(final int llllllllllllIllIIIlIIlIllIllIllI) {
        return llllllllllllIllIIIlIIlIllIllIllI > 0;
    }
    
    private static boolean lIIllIlllIllllll(final Object llllllllllllIllIIIlIIlIlllIIIIII) {
        return llllllllllllIllIIIlIIlIlllIIIIII == null;
    }
    
    private int readInt(final byte[] llllllllllllIllIIIlIIllIIIlIIlII, final int llllllllllllIllIIIlIIllIIIlIIIll) {
        return llllllllllllIllIIIlIIllIIIlIIlII[llllllllllllIllIIIlIIllIIIlIIIll] << PNGDecoder.lllIIIIIIIIIIl[29] | (llllllllllllIllIIIlIIllIIIlIIlII[llllllllllllIllIIIlIIllIIIlIIIll + PNGDecoder.lllIIIIIIIIIIl[4]] & PNGDecoder.lllIIIIIIIIIIl[13]) << PNGDecoder.lllIIIIIIIIIIl[20] | (llllllllllllIllIIIlIIllIIIlIIlII[llllllllllllIllIIIlIIllIIIlIIIll + PNGDecoder.lllIIIIIIIIIIl[6]] & PNGDecoder.lllIIIIIIIIIIl[13]) << PNGDecoder.lllIIIIIIIIIIl[8] | (llllllllllllIllIIIlIIllIIIlIIlII[llllllllllllIllIIIlIIllIIIlIIIll + PNGDecoder.lllIIIIIIIIIIl[3]] & PNGDecoder.lllIIIIIIIIIIl[13]);
    }
    
    static {
        lIIllIlllIllllII();
        lIIllIlllIlIIlIl();
        IHDR = PNGDecoder.lllIIIIIIIIIIl[2];
        COLOR_INDEXED = (byte)PNGDecoder.lllIIIIIIIIIIl[3];
        COLOR_TRUEALPHA = (byte)PNGDecoder.lllIIIIIIIIIIl[5];
        tRNS = PNGDecoder.lllIIIIIIIIIIl[34];
        COLOR_GREYSCALE = (byte)PNGDecoder.lllIIIIIIIIIIl[1];
        COLOR_GREYALPHA = (byte)PNGDecoder.lllIIIIIIIIIIl[9];
        IDAT = PNGDecoder.lllIIIIIIIIIIl[30];
        COLOR_TRUECOLOR = (byte)PNGDecoder.lllIIIIIIIIIIl[6];
        PLTE = PNGDecoder.lllIIIIIIIIIIl[35];
        IEND = PNGDecoder.lllIIIIIIIIIIl[36];
        PNGDecoder.ALPHA = new Format(PNGDecoder.lllIIIIIIIIIIl[4], (boolean)(PNGDecoder.lllIIIIIIIIIIl[4] != 0));
        PNGDecoder.LUMINANCE = new Format(PNGDecoder.lllIIIIIIIIIIl[4], (boolean)(PNGDecoder.lllIIIIIIIIIIl[1] != 0));
        PNGDecoder.LUMINANCE_ALPHA = new Format(PNGDecoder.lllIIIIIIIIIIl[6], (boolean)(PNGDecoder.lllIIIIIIIIIIl[4] != 0));
        PNGDecoder.RGB = new Format(PNGDecoder.lllIIIIIIIIIIl[3], (boolean)(PNGDecoder.lllIIIIIIIIIIl[1] != 0));
        PNGDecoder.RGBA = new Format(PNGDecoder.lllIIIIIIIIIIl[9], (boolean)(PNGDecoder.lllIIIIIIIIIIl[4] != 0));
        PNGDecoder.BGRA = new Format(PNGDecoder.lllIIIIIIIIIIl[9], (boolean)(PNGDecoder.lllIIIIIIIIIIl[4] != 0));
        PNGDecoder.ABGR = new Format(PNGDecoder.lllIIIIIIIIIIl[9], (boolean)(PNGDecoder.lllIIIIIIIIIIl[4] != 0));
        final byte[] signature = new byte[PNGDecoder.lllIIIIIIIIIIl[8]];
        signature[PNGDecoder.lllIIIIIIIIIIl[1]] = (byte)PNGDecoder.lllIIIIIIIIIIl[37];
        signature[PNGDecoder.lllIIIIIIIIIIl[4]] = (byte)PNGDecoder.lllIIIIIIIIIIl[38];
        signature[PNGDecoder.lllIIIIIIIIIIl[6]] = (byte)PNGDecoder.lllIIIIIIIIIIl[39];
        signature[PNGDecoder.lllIIIIIIIIIIl[3]] = (byte)PNGDecoder.lllIIIIIIIIIIl[40];
        signature[PNGDecoder.lllIIIIIIIIIIl[9]] = (byte)PNGDecoder.lllIIIIIIIIIIl[16];
        signature[PNGDecoder.lllIIIIIIIIIIl[10]] = (byte)PNGDecoder.lllIIIIIIIIIIl[15];
        signature[PNGDecoder.lllIIIIIIIIIIl[5]] = (byte)PNGDecoder.lllIIIIIIIIIIl[32];
        signature[PNGDecoder.lllIIIIIIIIIIl[7]] = (byte)PNGDecoder.lllIIIIIIIIIIl[15];
        SIGNATURE = signature;
    }
    
    private void expand4(final byte[] llllllllllllIllIIIlIIlllIIIIllII, final byte[] llllllllllllIllIIIlIIlllIIIIlIIl) {
        int llllllllllllIllIIIlIIlllIIIIllll = PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIlllIIIIlllI = llllllllllllIllIIIlIIlllIIIIlIIl.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIIIIllll, llllllllllllIllIIIlIIlllIIIIlllI)) {
            final int llllllllllllIllIIIlIIlllIIIlIIII = llllllllllllIllIIIlIIlllIIIIllII[PNGDecoder.lllIIIIIIIIIIl[4] + (llllllllllllIllIIIlIIlllIIIIllll >> PNGDecoder.lllIIIIIIIIIIl[4])] & PNGDecoder.lllIIIIIIIIIIl[13];
            switch (llllllllllllIllIIIlIIlllIIIIlllI - llllllllllllIllIIIlIIlllIIIIllll) {
                default: {
                    llllllllllllIllIIIlIIlllIIIIlIIl[llllllllllllIllIIIlIIlllIIIIllll + PNGDecoder.lllIIIIIIIIIIl[4]] = (byte)(llllllllllllIllIIIlIIlllIIIlIIII & PNGDecoder.lllIIIIIIIIIIl[14]);
                }
                case 1: {
                    llllllllllllIllIIIlIIlllIIIIlIIl[llllllllllllIllIIIlIIlllIIIIllll] = (byte)(llllllllllllIllIIIlIIlllIIIlIIII >> PNGDecoder.lllIIIIIIIIIIl[9]);
                    llllllllllllIllIIIlIIlllIIIIllll += 2;
                    "".length();
                    if ((0x3E ^ 0xF ^ (0x73 ^ 0x47)) == 0x0) {
                        return;
                    }
                    continue;
                }
            }
        }
    }
    
    private void readIHDR() throws IOException {
        this.checkChunkLength(PNGDecoder.lllIIIIIIIIIIl[16]);
        this.readChunk(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1], PNGDecoder.lllIIIIIIIIIIl[16]);
        "".length();
        this.width = this.readInt(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1]);
        this.height = this.readInt(this.buffer, PNGDecoder.lllIIIIIIIIIIl[9]);
        this.bitdepth = (this.buffer[PNGDecoder.lllIIIIIIIIIIl[8]] & PNGDecoder.lllIIIIIIIIIIl[13]);
        this.colorType = (this.buffer[PNGDecoder.lllIIIIIIIIIIl[11]] & PNGDecoder.lllIIIIIIIIIIl[13]);
        Label_0637: {
            switch (this.colorType) {
                case 0: {
                    if (lIIllIllllIIIIII(this.bitdepth, PNGDecoder.lllIIIIIIIIIIl[8])) {
                        throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[17]]).append(this.bitdepth)));
                    }
                    this.bytesPerPixel = PNGDecoder.lllIIIIIIIIIIl[4];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return;
                    }
                    break;
                }
                case 4: {
                    if (lIIllIllllIIIIII(this.bitdepth, PNGDecoder.lllIIIIIIIIIIl[8])) {
                        throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[18]]).append(this.bitdepth)));
                    }
                    this.bytesPerPixel = PNGDecoder.lllIIIIIIIIIIl[6];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    break;
                }
                case 2: {
                    if (lIIllIllllIIIIII(this.bitdepth, PNGDecoder.lllIIIIIIIIIIl[8])) {
                        throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[16]]).append(this.bitdepth)));
                    }
                    this.bytesPerPixel = PNGDecoder.lllIIIIIIIIIIl[3];
                    "".length();
                    if ("  ".length() <= " ".length()) {
                        return;
                    }
                    break;
                }
                case 6: {
                    if (lIIllIllllIIIIII(this.bitdepth, PNGDecoder.lllIIIIIIIIIIl[8])) {
                        throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[19]]).append(this.bitdepth)));
                    }
                    this.bytesPerPixel = PNGDecoder.lllIIIIIIIIIIl[9];
                    "".length();
                    if ("   ".length() <= -" ".length()) {
                        return;
                    }
                    break;
                }
                case 3: {
                    switch (this.bitdepth) {
                        case 1:
                        case 2:
                        case 4:
                        case 8: {
                            this.bytesPerPixel = PNGDecoder.lllIIIIIIIIIIl[4];
                            "".length();
                            if ("   ".length() >= (0x6B ^ 0x6F)) {
                                return;
                            }
                            break Label_0637;
                        }
                        default: {
                            throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[14]]).append(this.bitdepth)));
                        }
                    }
                    break;
                }
                default: {
                    throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[20]]).append(this.colorType)));
                }
            }
        }
        if (lIIllIllllIIIlll(this.buffer[PNGDecoder.lllIIIIIIIIIIl[15]])) {
            throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[21]]);
        }
        if (lIIllIllllIIIlll(this.buffer[PNGDecoder.lllIIIIIIIIIIl[17]])) {
            throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[22]]);
        }
        if (lIIllIllllIIIlll(this.buffer[PNGDecoder.lllIIIIIIIIIIl[18]])) {
            throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[23]]);
        }
    }
    
    private void readChunkUnzip(final Inflater llllllllllllIllIIIlIIllIIlIIIIII, final byte[] llllllllllllIllIIIlIIllIIIllllll, int llllllllllllIllIIIlIIllIIIlllIIl, int llllllllllllIllIIIlIIllIIIlllIII) throws IOException {
        try {
            do {
                final int llllllllllllIllIIIlIIllIIlIIIIll = llllllllllllIllIIIlIIllIIlIIIIII.inflate(llllllllllllIllIIIlIIllIIIllllll, llllllllllllIllIIIlIIllIIIlllIIl, llllllllllllIllIIIlIIllIIIlllIII);
                if (lIIllIllllIIlIll(llllllllllllIllIIIlIIllIIlIIIIll)) {
                    if (lIIllIllllIIIlll(llllllllllllIllIIIlIIllIIlIIIIII.finished() ? 1 : 0)) {
                        throw new EOFException();
                    }
                    if (!lIIllIllllIIIlll(llllllllllllIllIIIlIIllIIlIIIIII.needsInput() ? 1 : 0)) {
                        throw new IOException(String.valueOf(new StringBuilder().append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[31]]).append(llllllllllllIllIIIlIIllIIIlllIII).append(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[32]])));
                    }
                    this.refillInflater(llllllllllllIllIIIlIIllIIlIIIIII);
                    "".length();
                    if (-(0xBE ^ 0xBA) >= 0) {
                        return;
                    }
                    continue;
                }
                else {
                    llllllllllllIllIIIlIIllIIIlllIIl += llllllllllllIllIIIlIIllIIlIIIIll;
                    llllllllllllIllIIIlIIllIIIlllIII -= llllllllllllIllIIIlIIllIIlIIIIll;
                }
            } while (!lIIllIllllIIlIll(llllllllllllIllIIIlIIllIIIlllIII));
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (DataFormatException llllllllllllIllIIIlIIllIIlIIIIlI) {
            throw (IOException)new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[33]]).initCause(llllllllllllIllIIIlIIllIIlIIIIlI);
        }
    }
    
    public void decode(final ByteBuffer llllllllllllIllIIIlIlIIIIIlllIlI, final int llllllllllllIllIIIlIlIIIIIlllIIl, final Format llllllllllllIllIIIlIlIIIIIlllIII) throws IOException {
        final int llllllllllllIllIIIlIlIIIIIllIlll = llllllllllllIllIIIlIlIIIIIlllIlI.position();
        final int llllllllllllIllIIIlIlIIIIIllIllI = (this.width * this.bitdepth + PNGDecoder.lllIIIIIIIIIIl[7]) / PNGDecoder.lllIIIIIIIIIIl[8] * this.bytesPerPixel;
        byte[] llllllllllllIllIIIlIlIIIIIllIlIl = new byte[llllllllllllIllIIIlIlIIIIIllIllI + PNGDecoder.lllIIIIIIIIIIl[4]];
        byte[] llllllllllllIllIIIlIlIIIIIllIlII = new byte[llllllllllllIllIIIlIlIIIIIllIllI + PNGDecoder.lllIIIIIIIIIIl[4]];
        byte[] array;
        if (lIIllIllllIIIlII(this.bitdepth, PNGDecoder.lllIIIIIIIIIIl[8])) {
            array = new byte[this.width + PNGDecoder.lllIIIIIIIIIIl[4]];
            "".length();
            if ((0xB6 ^ 0xB2) == " ".length()) {
                return;
            }
        }
        else {
            array = null;
        }
        byte[] llllllllllllIllIIIlIlIIIIIllIIll = array;
        final Inflater llllllllllllIllIIIlIlIIIIIllIIlI = new Inflater();
        try {
            int llllllllllllIllIIIlIlIIIIIllllII = PNGDecoder.lllIIIIIIIIIIl[1];
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIlIIIIIllllII, this.height)) {
                this.readChunkUnzip(llllllllllllIllIIIlIlIIIIIllIIlI, llllllllllllIllIIIlIlIIIIIllIlIl, PNGDecoder.lllIIIIIIIIIIl[1], llllllllllllIllIIIlIlIIIIIllIlIl.length);
                this.unfilter(llllllllllllIllIIIlIlIIIIIllIlIl, llllllllllllIllIIIlIlIIIIIllIlII);
                llllllllllllIllIIIlIlIIIIIlllIlI.position(llllllllllllIllIIIlIlIIIIIllIlll + llllllllllllIllIIIlIlIIIIIllllII * llllllllllllIllIIIlIlIIIIIlllIIl);
                "".length();
                switch (this.colorType) {
                    case 2: {
                        if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.ABGR)) {
                            this.copyRGBtoABGR(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if ("  ".length() < "  ".length()) {
                                return;
                            }
                            break;
                        }
                        else if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.RGBA)) {
                            this.copyRGBtoRGBA(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if (((0x3B ^ 0x22 ^ (0xFA ^ 0xAD)) & (0x1F ^ 0x5B ^ (0x2 ^ 0x8) ^ -" ".length())) != 0x0) {
                                return;
                            }
                            break;
                        }
                        else if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.BGRA)) {
                            this.copyRGBtoBGRA(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if (((165 + 116 - 219 + 107 ^ 48 + 156 - 58 + 30) & (0x46 ^ 0x21 ^ (0x1D ^ 0x63) ^ -" ".length())) > 0) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (!lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.RGB)) {
                                throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[3]]);
                            }
                            this.copy(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if (((0x82 ^ 0x98) & ~(0x67 ^ 0x7D)) >= "  ".length()) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 6: {
                        if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.ABGR)) {
                            this.copyRGBAtoABGR(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if (-" ".length() >= "   ".length()) {
                                return;
                            }
                            break;
                        }
                        else if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.RGBA)) {
                            this.copy(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.BGRA)) {
                            this.copyRGBAtoBGRA(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (!lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.RGB)) {
                                throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[9]]);
                            }
                            this.copyRGBAtoRGB(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                            "".length();
                            if ("   ".length() > "   ".length()) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    case 0: {
                        if (lIIllIllllIIIIlI(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.LUMINANCE) && !lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.ALPHA)) {
                            throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[10]]);
                        }
                        this.copy(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                        "".length();
                        if (((0x18 ^ 0xD) & ~(0x3A ^ 0x2F)) > "   ".length()) {
                            return;
                        }
                        break;
                    }
                    case 4: {
                        if (!lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.LUMINANCE_ALPHA)) {
                            throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[5]]);
                        }
                        this.copy(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIlIl);
                        "".length();
                        if ("  ".length() <= 0) {
                            return;
                        }
                        break;
                    }
                    case 3: {
                        switch (this.bitdepth) {
                            case 8: {
                                llllllllllllIllIIIlIlIIIIIllIIll = llllllllllllIllIIIlIlIIIIIllIlIl;
                                "".length();
                                if ((0xA7 ^ 0xA3) == 0x0) {
                                    return;
                                }
                                break;
                            }
                            case 4: {
                                this.expand4(llllllllllllIllIIIlIlIIIIIllIlIl, llllllllllllIllIIIlIlIIIIIllIIll);
                                "".length();
                                if (null != null) {
                                    return;
                                }
                                break;
                            }
                            case 2: {
                                this.expand2(llllllllllllIllIIIlIlIIIIIllIlIl, llllllllllllIllIIIlIlIIIIIllIIll);
                                "".length();
                                if ((0x81 ^ 0x85) < " ".length()) {
                                    return;
                                }
                                break;
                            }
                            case 1: {
                                this.expand1(llllllllllllIllIIIlIlIIIIIllIlIl, llllllllllllIllIIIlIlIIIIIllIIll);
                                "".length();
                                if ("  ".length() < ((0x9D ^ 0xC6 ^ (0x45 ^ 0x2)) & (46 + 11 - 20 + 124 ^ 63 + 185 - 209 + 150 ^ -" ".length()))) {
                                    return;
                                }
                                break;
                            }
                            default: {
                                throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[7]]);
                            }
                        }
                        if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.ABGR)) {
                            this.copyPALtoABGR(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIIll);
                            "".length();
                            if ((19 + 137 - 125 + 164 ^ 158 + 75 - 111 + 77) <= ((20 + 80 + 54 + 16 ^ 124 + 81 - 96 + 44) & (0x1 ^ 0x6 ^ (0x2C ^ 0x18) ^ -" ".length()))) {
                                return;
                            }
                            break;
                        }
                        else if (lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.RGBA)) {
                            this.copyPALtoRGBA(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIIll);
                            "".length();
                            if ((146 + 137 - 150 + 25 ^ 79 + 116 - 108 + 67) == ((0x18 ^ 0x7F ^ (0x41 ^ 0x6A)) & (0x4F ^ 0x5F ^ (0x41 ^ 0x1D) ^ -" ".length()))) {
                                return;
                            }
                            break;
                        }
                        else {
                            if (!lIIllIllllIIIIll(llllllllllllIllIIIlIlIIIIIlllIII, PNGDecoder.BGRA)) {
                                throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[8]]);
                            }
                            this.copyPALtoBGRA(llllllllllllIllIIIlIlIIIIIlllIlI, llllllllllllIllIIIlIlIIIIIllIIll);
                            "".length();
                            if (-"   ".length() > 0) {
                                return;
                            }
                            break;
                        }
                        break;
                    }
                    default: {
                        throw new UnsupportedOperationException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[11]]);
                    }
                }
                final byte[] llllllllllllIllIIIlIlIIIIIllllIl = llllllllllllIllIIIlIlIIIIIllIlIl;
                llllllllllllIllIIIlIlIIIIIllIlIl = llllllllllllIllIIIlIlIIIIIllIlII;
                llllllllllllIllIIIlIlIIIIIllIlII = llllllllllllIllIIIlIlIIIIIllllIl;
                ++llllllllllllIllIIIlIlIIIIIllllII;
                "".length();
                if ((66 + 156 - 95 + 41 ^ 1 + 49 - 19 + 142) <= 0) {
                    return;
                }
            }
            llllllllllllIllIIIlIlIIIIIllIIlI.end();
            "".length();
            if ((0x2C ^ 0x28) <= 0) {
                return;
            }
        }
        finally {
            llllllllllllIllIIIlIlIIIIIllIIlI.end();
        }
    }
    
    private void copyPALtoABGR(final ByteBuffer llllllllllllIllIIIlIIlllIllIlIll, final byte[] llllllllllllIllIIIlIIlllIllIlIlI) {
        if (lIIllIllllIIIIIl(this.paletteA)) {
            int llllllllllllIllIIIlIIlllIlllIlIl = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllIlllIlII = llllllllllllIllIIIlIIlllIllIlIlI.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIlllIlIl, llllllllllllIllIIIlIIlllIlllIlII)) {
                final int llllllllllllIllIIIlIIlllIllllIlI = llllllllllllIllIIIlIIlllIllIlIlI[llllllllllllIllIIIlIIlllIlllIlIl] & PNGDecoder.lllIIIIIIIIIIl[13];
                final byte llllllllllllIllIIIlIIlllIllllIIl = this.palette[llllllllllllIllIIIlIIlllIllllIlI * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[1]];
                final byte llllllllllllIllIIIlIIlllIllllIII = this.palette[llllllllllllIllIIIlIIlllIllllIlI * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllIlllIlll = this.palette[llllllllllllIllIIIlIIlllIllllIlI * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[6]];
                final byte llllllllllllIllIIIlIIlllIlllIllI = this.paletteA[llllllllllllIllIIIlIIlllIllllIlI];
                llllllllllllIllIIIlIIlllIllIlIll.put(llllllllllllIllIIIlIIlllIlllIllI).put(llllllllllllIllIIIlIIlllIlllIlll).put(llllllllllllIllIIIlIIlllIllllIII).put(llllllllllllIllIIIlIIlllIllllIIl);
                "".length();
                ++llllllllllllIllIIIlIIlllIlllIlIl;
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
        }
        else {
            int llllllllllllIllIIIlIIlllIllIlllI = PNGDecoder.lllIIIIIIIIIIl[4];
            final int llllllllllllIllIIIlIIlllIllIllIl = llllllllllllIllIIIlIIlllIllIlIlI.length;
            while (lIIllIllllIIIlII(llllllllllllIllIIIlIIlllIllIlllI, llllllllllllIllIIIlIIlllIllIllIl)) {
                final int llllllllllllIllIIIlIIlllIlllIIll = llllllllllllIllIIIlIIlllIllIlIlI[llllllllllllIllIIIlIIlllIllIlllI] & PNGDecoder.lllIIIIIIIIIIl[13];
                final byte llllllllllllIllIIIlIIlllIlllIIlI = this.palette[llllllllllllIllIIIlIIlllIlllIIll * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[1]];
                final byte llllllllllllIllIIIlIIlllIlllIIIl = this.palette[llllllllllllIllIIIlIIlllIlllIIll * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[4]];
                final byte llllllllllllIllIIIlIIlllIlllIIII = this.palette[llllllllllllIllIIIlIIlllIlllIIll * PNGDecoder.lllIIIIIIIIIIl[3] + PNGDecoder.lllIIIIIIIIIIl[6]];
                final byte llllllllllllIllIIIlIIlllIllIllll = (byte)PNGDecoder.lllIIIIIIIIIIl[12];
                llllllllllllIllIIIlIIlllIllIlIll.put(llllllllllllIllIIIlIIlllIllIllll).put(llllllllllllIllIIIlIIlllIlllIIII).put(llllllllllllIllIIIlIIlllIlllIIIl).put(llllllllllllIllIIIlIIlllIlllIIlI);
                "".length();
                ++llllllllllllIllIIIlIIlllIllIlllI;
                "".length();
                if (-" ".length() >= ((83 + 172 - 200 + 126 ^ 153 + 161 - 192 + 40) & (43 + 27 + 13 + 57 ^ 124 + 52 - 148 + 127 ^ -" ".length()))) {
                    return;
                }
            }
        }
    }
    
    private void readtRNS() throws IOException {
        switch (this.colorType) {
            case 0: {
                this.checkChunkLength(PNGDecoder.lllIIIIIIIIIIl[6]);
                this.transPixel = new byte[PNGDecoder.lllIIIIIIIIIIl[6]];
                this.readChunk(this.transPixel, PNGDecoder.lllIIIIIIIIIIl[1], PNGDecoder.lllIIIIIIIIIIl[6]);
                "".length();
                "".length();
                if (" ".length() == 0) {
                    return;
                }
                break;
            }
            case 2: {
                this.checkChunkLength(PNGDecoder.lllIIIIIIIIIIl[5]);
                this.transPixel = new byte[PNGDecoder.lllIIIIIIIIIIl[5]];
                this.readChunk(this.transPixel, PNGDecoder.lllIIIIIIIIIIl[1], PNGDecoder.lllIIIIIIIIIIl[5]);
                "".length();
                "".length();
                if (((0x82 ^ 0x9C) & ~(0x36 ^ 0x28)) != 0x0) {
                    return;
                }
                break;
            }
            case 3: {
                if (lIIllIlllIllllll(this.palette)) {
                    throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[26]]);
                }
                this.paletteA = new byte[this.palette.length / PNGDecoder.lllIIIIIIIIIIl[3]];
                Arrays.fill(this.paletteA, (byte)PNGDecoder.lllIIIIIIIIIIl[12]);
                this.readChunk(this.paletteA, PNGDecoder.lllIIIIIIIIIIl[1], this.paletteA.length);
                "".length();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
                break;
            }
        }
    }
    
    private static String lIIllIlllIIlIlII(final String llllllllllllIllIIIlIIlIllllllIll, final String llllllllllllIllIIIlIIlIllllllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIIllIIIIIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIIlIllllllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIIlIlllllllll = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIIlIlllllllll.init(PNGDecoder.lllIIIIIIIIIIl[6], llllllllllllIllIIIlIIllIIIIIIIII);
            return new String(llllllllllllIllIIIlIIlIlllllllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIIlIllllllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIIlIllllllllI) {
            llllllllllllIllIIIlIIlIllllllllI.printStackTrace();
            return null;
        }
    }
    
    private void unfilterAverage(final byte[] llllllllllllIllIIIlIIllIlIlIlllI, final byte[] llllllllllllIllIIIlIIllIlIlIllIl) {
        final int llllllllllllIllIIIlIIllIlIllIIIl = this.bytesPerPixel;
        int llllllllllllIllIIIlIIllIlIllIIII = PNGDecoder.lllIIIIIIIIIIl[4];
        while (lIIllIllllIIIlIl(llllllllllllIllIIIlIIllIlIllIIII, llllllllllllIllIIIlIIllIlIllIIIl)) {
            final int n = llllllllllllIllIIIlIIllIlIllIIII;
            llllllllllllIllIIIlIIllIlIlIlllI[n] += (byte)((llllllllllllIllIIIlIIllIlIlIllIl[llllllllllllIllIIIlIIllIlIllIIII] & PNGDecoder.lllIIIIIIIIIIl[13]) >>> PNGDecoder.lllIIIIIIIIIIl[4]);
            ++llllllllllllIllIIIlIIllIlIllIIII;
            "".length();
            if ("  ".length() <= 0) {
                return;
            }
        }
        final int llllllllllllIllIIIlIIllIlIllIlIl = llllllllllllIllIIIlIIllIlIlIlllI.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIlIllIIII, llllllllllllIllIIIlIIllIlIllIlIl)) {
            final int n2 = llllllllllllIllIIIlIIllIlIllIIII;
            llllllllllllIllIIIlIIllIlIlIlllI[n2] += (byte)((llllllllllllIllIIIlIIllIlIlIllIl[llllllllllllIllIIIlIIllIlIllIIII] & PNGDecoder.lllIIIIIIIIIIl[13]) + (llllllllllllIllIIIlIIllIlIlIlllI[llllllllllllIllIIIlIIllIlIllIIII - llllllllllllIllIIIlIIllIlIllIIIl] & PNGDecoder.lllIIIIIIIIIIl[13]) >>> PNGDecoder.lllIIIIIIIIIIl[4]);
            ++llllllllllllIllIIIlIIllIlIllIIII;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private void skip(long llllllllllllIllIIIlIIllIIIIllIIl) throws IOException {
        while (lIIllIllllIIlIIl(lIIllIllllIIllII(llllllllllllIllIIIlIIllIIIIllIIl, 0L))) {
            final long llllllllllllIllIIIlIIllIIIIlllIl = this.input.skip(llllllllllllIllIIIlIIllIIIIllIIl);
            if (lIIllIllllIIIllI(lIIllIllllIIllII(llllllllllllIllIIIlIIllIIIIlllIl, 0L))) {
                throw new EOFException();
            }
            llllllllllllIllIIIlIIllIIIIllIIl -= llllllllllllIllIIIlIIllIIIIlllIl;
            "".length();
            if ((0x50 ^ 0x54) < "   ".length()) {
                return;
            }
        }
    }
    
    public PNGDecoder(final InputStream llllllllllllIllIIIlIlIIIIlIlllll) throws IOException {
        this.input = llllllllllllIllIIIlIlIIIIlIlllll;
        this.crc = new CRC32();
        this.buffer = new byte[PNGDecoder.lllIIIIIIIIIIl[0]];
        this.readFully(this.buffer, PNGDecoder.lllIIIIIIIIIIl[1], PNGDecoder.SIGNATURE.length);
        if (lIIllIlllIllllIl(checkSignature(this.buffer) ? 1 : 0)) {
            throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[1]]);
        }
        this.openChunk(PNGDecoder.lllIIIIIIIIIIl[2]);
        this.readIHDR();
        this.closeChunk();
        do {
            this.openChunk();
            switch (this.chunkType) {
                case 1229209940: {
                    "".length();
                    if ((14 + 96 - 32 + 57 ^ 106 + 22 - 111 + 114) < "   ".length()) {
                        throw null;
                    }
                    if (lIIllIlllIlllllI(this.colorType, PNGDecoder.lllIIIIIIIIIIl[3]) && lIIllIlllIllllll(this.palette)) {
                        throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[4]]);
                    }
                    return;
                }
                case 1347179589: {
                    this.readPLTE();
                    "".length();
                    if ((139 + 97 - 140 + 44 ^ 92 + 57 - 86 + 73) != (0x8E ^ 0xA2 ^ (0xEA ^ 0xC2))) {
                        throw null;
                    }
                    break;
                }
                case 1951551059: {
                    this.readtRNS();
                    break;
                }
            }
            this.closeChunk();
            "".length();
        } while (null == null);
        throw null;
    }
    
    private void readPLTE() throws IOException {
        final int llllllllllllIllIIIlIIllIIlllllII = this.chunkLength / PNGDecoder.lllIIIIIIIIIIl[3];
        if (!lIIllIllllIIlIII(llllllllllllIllIIIlIIllIIlllllII, PNGDecoder.lllIIIIIIIIIIl[4]) || !lIIllIllllIIIlIl(llllllllllllIllIIIlIIllIIlllllII, PNGDecoder.lllIIIIIIIIIIl[24]) || lIIllIllllIIIlll(this.chunkLength % PNGDecoder.lllIIIIIIIIIIl[3])) {
            throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[25]]);
        }
        this.palette = new byte[llllllllllllIllIIIlIIllIIlllllII * PNGDecoder.lllIIIIIIIIIIl[3]];
        this.readChunk(this.palette, PNGDecoder.lllIIIIIIIIIIl[1], this.palette.length);
        "".length();
    }
    
    private static boolean lIIllIllllIIIlIl(final int llllllllllllIllIIIlIIlIlllIlIIIl, final int llllllllllllIllIIIlIIlIlllIlIIII) {
        return llllllllllllIllIIIlIIlIlllIlIIIl <= llllllllllllIllIIIlIIlIlllIlIIII;
    }
    
    private void checkChunkLength(final int llllllllllllIllIIIlIIllIIlIlllll) throws IOException {
        if (lIIllIllllIIIIII(this.chunkLength, llllllllllllIllIIIlIIllIIlIlllll)) {
            throw new IOException(PNGDecoder.llIlllllllIIll[PNGDecoder.lllIIIIIIIIIIl[29]]);
        }
    }
    
    private void copy(final ByteBuffer llllllllllllIllIIIlIlIIIIIlIIIIl, final byte[] llllllllllllIllIIIlIlIIIIIlIIIII) {
        llllllllllllIllIIIlIlIIIIIlIIIIl.put(llllllllllllIllIIIlIlIIIIIlIIIII, PNGDecoder.lllIIIIIIIIIIl[4], llllllllllllIllIIIlIlIIIIIlIIIII.length - PNGDecoder.lllIIIIIIIIIIl[4]);
        "".length();
    }
    
    private int readChunk(final byte[] llllllllllllIllIIIlIIllIIlIlIlIl, final int llllllllllllIllIIIlIIllIIlIlIlII, int llllllllllllIllIIIlIIllIIlIlIIll) throws IOException {
        if (lIIllIllllIIlIlI(llllllllllllIllIIIlIIllIIlIlIIll, this.chunkRemaining)) {
            llllllllllllIllIIIlIIllIIlIlIIll = this.chunkRemaining;
        }
        this.readFully(llllllllllllIllIIIlIIllIIlIlIlIl, llllllllllllIllIIIlIIllIIlIlIlII, llllllllllllIllIIIlIIllIIlIlIIll);
        this.crc.update(llllllllllllIllIIIlIIllIIlIlIlIl, llllllllllllIllIIIlIIllIIlIlIlII, llllllllllllIllIIIlIIllIIlIlIIll);
        this.chunkRemaining -= llllllllllllIllIIIlIIllIIlIlIIll;
        return llllllllllllIllIIIlIIllIIlIlIIll;
    }
    
    private void unfilterSub(final byte[] llllllllllllIllIIIlIIllIllIlIlII) {
        final int llllllllllllIllIIIlIIllIllIlIIll = this.bytesPerPixel;
        int llllllllllllIllIIIlIIllIllIlIlll = llllllllllllIllIIIlIIllIllIlIIll + PNGDecoder.lllIIIIIIIIIIl[4];
        final int llllllllllllIllIIIlIIllIllIlIllI = llllllllllllIllIIIlIIllIllIlIlII.length;
        while (lIIllIllllIIIlII(llllllllllllIllIIIlIIllIllIlIlll, llllllllllllIllIIIlIIllIllIlIllI)) {
            final int n = llllllllllllIllIIIlIIllIllIlIlll;
            llllllllllllIllIIIlIIllIllIlIlII[n] += llllllllllllIllIIIlIIllIllIlIlII[llllllllllllIllIIIlIIllIllIlIlll - llllllllllllIllIIIlIIllIllIlIIll];
            ++llllllllllllIllIIIlIIllIllIlIlll;
            "".length();
            if ((0x1B ^ 0x1F) != (0xB3 ^ 0xB7)) {
                return;
            }
        }
    }
    
    public int getHeight() {
        return this.height;
    }
    
    private static boolean lIIllIllllIIIlII(final int llllllllllllIllIIIlIIlIlllIlIlIl, final int llllllllllllIllIIIlIIlIlllIlIlII) {
        return llllllllllllIllIIIlIIlIlllIlIlIl < llllllllllllIllIIIlIIlIlllIlIlII;
    }
    
    private static int lIIllIllllIIllII(final long n, final long n2) {
        return lcmp(n, n2);
    }
    
    public static class Format
    {
        final /* synthetic */ int numComponents;
        final /* synthetic */ boolean hasAlpha;
        
        public int getNumComponents() {
            return this.numComponents;
        }
        
        public boolean isHasAlpha() {
            return this.hasAlpha;
        }
        
        private Format(final int lllllllllllllIlIIIIllIllllllIlII, final boolean lllllllllllllIlIIIIllIllllllIllI) {
            this.numComponents = lllllllllllllIlIIIIllIllllllIlII;
            this.hasAlpha = lllllllllllllIlIIIIllIllllllIllI;
        }
    }
}
