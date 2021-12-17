// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.lwjgl.BufferUtils;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

public class PNGImageData implements LoadableImageData
{
    private /* synthetic */ int texHeight;
    private static final /* synthetic */ int[] llIlIIlIIllIIl;
    private /* synthetic */ int height;
    private static final /* synthetic */ String[] llIlIIlIIllIII;
    private /* synthetic */ int width;
    private /* synthetic */ int texWidth;
    private /* synthetic */ ByteBuffer scratch;
    private /* synthetic */ int bitDepth;
    
    public int getTexWidth() {
        return this.texWidth;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getTexHeight() {
        return this.texHeight;
    }
    
    public ByteBuffer getImageBufferData() {
        return this.scratch;
    }
    
    private static void lIIlIIlIIlllIIIl() {
        (llIlIIlIIllIII = new String[PNGImageData.llIlIIlIIllIIl[6]])[PNGImageData.llIlIIlIIllIIl[0]] = lIIlIIlIIlllIIII("dgMH8k9mSCIaQ+Rip7MVS9MAQAKkNss+0AW0o7sRWlfb5+pU3mNbwGvEPPfGUc8d1q045al8I3U=", "ejkJC");
        PNGImageData.llIlIIlIIllIII[PNGImageData.llIlIIlIIllIIl[1]] = lIIlIIlIIlllIIII("1izNaKC6tjWsrMmDK+IuhXnidW82RD0VoZegznQvTBFc/juGCCTW1s83uOcPzqbNhvrjB7BmnGjj81sP8fbwmQ==", "kbmAa");
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIllIllIIIlIllIlIIllI) throws IOException {
        return this.loadImage(llllllllllllIllIllIIIlIllIlIIllI, (boolean)(PNGImageData.llIlIIlIIllIIl[0] != 0), null);
    }
    
    static {
        lIIlIIlIIlllIIlI();
        lIIlIIlIIlllIIIl();
    }
    
    public int getWidth() {
        return this.width;
    }
    
    private static void lIIlIIlIIlllIIlI() {
        (llIlIIlIIllIIl = new int[10])[0] = ((0xC1 ^ 0x9A ^ (0x41 ^ 0x3C)) & (120 + 90 - 175 + 117 ^ 46 + 71 - 91 + 164 ^ -" ".length()));
        PNGImageData.llIlIIlIIllIIl[1] = " ".length();
        PNGImageData.llIlIIlIIllIIl[2] = (0x93 ^ 0x97);
        PNGImageData.llIlIIlIIllIIl[3] = "   ".length();
        PNGImageData.llIlIIlIIllIIl[4] = (0x8 ^ 0x28);
        PNGImageData.llIlIIlIIllIIl[5] = (0x4D ^ 0x3B ^ (0xFE ^ 0x90));
        PNGImageData.llIlIIlIIllIIl[6] = "  ".length();
        PNGImageData.llIlIIlIIllIIl[7] = -" ".length();
        PNGImageData.llIlIIlIIllIIl[8] = (0xFFFFBF05 & 0x41FA);
        PNGImageData.llIlIIlIIllIIl[9] = (0x45 ^ 0x4D);
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIllIllIIIlIlIlllIllI, final boolean llllllllllllIllIllIIIlIlIlllllII, boolean llllllllllllIllIllIIIlIlIlllIlIl, final int[] llllllllllllIllIllIIIlIlIllllIlI) throws IOException {
        if (lIIlIIlIIlllIIll(llllllllllllIllIllIIIlIlIllllIlI)) {
            llllllllllllIllIllIIIlIlIlllIlIl = (PNGImageData.llIlIIlIIllIIl[1] != 0);
            throw new IOException(PNGImageData.llIlIIlIIllIII[PNGImageData.llIlIIlIIllIIl[0]]);
        }
        final PNGDecoder llllllllllllIllIllIIIlIlIllllIIl = new PNGDecoder(llllllllllllIllIllIIIlIlIlllIllI);
        if (lIIlIIlIIlllIlII(llllllllllllIllIllIIIlIlIllllIIl.isRGB() ? 1 : 0)) {
            throw new IOException(PNGImageData.llIlIIlIIllIII[PNGImageData.llIlIIlIIllIIl[1]]);
        }
        this.width = llllllllllllIllIllIIIlIlIllllIIl.getWidth();
        this.height = llllllllllllIllIllIIIlIlIllllIIl.getHeight();
        this.texWidth = this.get2Fold(this.width);
        this.texHeight = this.get2Fold(this.height);
        int n;
        if (lIIlIIlIIlllIlIl(llllllllllllIllIllIIIlIlIllllIIl.hasAlpha() ? 1 : 0)) {
            n = PNGImageData.llIlIIlIIllIIl[2];
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            n = PNGImageData.llIlIIlIIllIIl[3];
        }
        final int llllllllllllIllIllIIIlIlIllllIII = n;
        int bitDepth;
        if (lIIlIIlIIlllIlIl(llllllllllllIllIllIIIlIlIllllIIl.hasAlpha() ? 1 : 0)) {
            bitDepth = PNGImageData.llIlIIlIIllIIl[4];
            "".length();
            if (((18 + 62 + 65 + 42 ^ 43 + 109 - 141 + 168) & (0x35 ^ 0x25 ^ (0xD ^ 0x15) ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            bitDepth = PNGImageData.llIlIIlIIllIIl[5];
        }
        this.bitDepth = bitDepth;
        this.scratch = BufferUtils.createByteBuffer(this.texWidth * this.texHeight * llllllllllllIllIllIIIlIlIllllIII);
        final PNGDecoder pngDecoder = llllllllllllIllIllIIIlIlIllllIIl;
        final ByteBuffer scratch = this.scratch;
        final int llllllllllllIllIIIlIlIIIIIlllIIl = this.texWidth * llllllllllllIllIllIIIlIlIllllIII;
        PNGDecoder.Format llllllllllllIllIIIlIlIIIIIlllIII;
        if (lIIlIIlIIlllIllI(llllllllllllIllIllIIIlIlIllllIII, PNGImageData.llIlIIlIIllIIl[2])) {
            llllllllllllIllIIIlIlIIIIIlllIII = PNGDecoder.RGBA;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            llllllllllllIllIIIlIlIIIIIlllIII = PNGDecoder.RGB;
        }
        pngDecoder.decode(scratch, llllllllllllIllIIIlIlIIIIIlllIIl, llllllllllllIllIIIlIlIIIIIlllIII);
        if (lIIlIIlIIlllIlll(this.height, this.texHeight - PNGImageData.llIlIIlIIllIIl[1])) {
            final int llllllllllllIllIllIIIlIllIIIlIlI = (this.texHeight - PNGImageData.llIlIIlIIllIIl[1]) * (this.texWidth * llllllllllllIllIllIIIlIlIllllIII);
            final int llllllllllllIllIllIIIlIllIIIlIIl = (this.height - PNGImageData.llIlIIlIIllIIl[1]) * (this.texWidth * llllllllllllIllIllIIIlIlIllllIII);
            int llllllllllllIllIllIIIlIllIIIlIll = PNGImageData.llIlIIlIIllIIl[0];
            while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIlIll, this.texWidth)) {
                int llllllllllllIllIllIIIlIllIIIllII = PNGImageData.llIlIIlIIllIIl[0];
                while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIllII, llllllllllllIllIllIIIlIlIllllIII)) {
                    this.scratch.put(llllllllllllIllIllIIIlIllIIIlIlI + llllllllllllIllIllIIIlIllIIIlIll + llllllllllllIllIllIIIlIllIIIllII, this.scratch.get(llllllllllllIllIllIIIlIllIIIlIll + llllllllllllIllIllIIIlIllIIIllII));
                    "".length();
                    this.scratch.put(llllllllllllIllIllIIIlIllIIIlIIl + this.texWidth * llllllllllllIllIllIIIlIlIllllIII + llllllllllllIllIllIIIlIllIIIlIll + llllllllllllIllIllIIIlIllIIIllII, this.scratch.get(llllllllllllIllIllIIIlIllIIIlIIl + llllllllllllIllIllIIIlIllIIIlIll + llllllllllllIllIllIIIlIllIIIllII));
                    "".length();
                    ++llllllllllllIllIllIIIlIllIIIllII;
                    "".length();
                    if ((0x79 ^ 0x4D ^ (0x39 ^ 0x9)) == 0x0) {
                        return null;
                    }
                }
                ++llllllllllllIllIllIIIlIllIIIlIll;
                "".length();
                if ("  ".length() < -" ".length()) {
                    return null;
                }
            }
        }
        if (lIIlIIlIIlllIlll(this.width, this.texWidth - PNGImageData.llIlIIlIIllIIl[1])) {
            int llllllllllllIllIllIIIlIllIIIIlll = PNGImageData.llIlIIlIIllIIl[0];
            while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIIlll, this.texHeight)) {
                int llllllllllllIllIllIIIlIllIIIlIII = PNGImageData.llIlIIlIIllIIl[0];
                while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIlIII, llllllllllllIllIllIIIlIlIllllIII)) {
                    this.scratch.put((llllllllllllIllIllIIIlIllIIIIlll + PNGImageData.llIlIIlIIllIIl[1]) * (this.texWidth * llllllllllllIllIllIIIlIlIllllIII) - llllllllllllIllIllIIIlIlIllllIII + llllllllllllIllIllIIIlIllIIIlIII, this.scratch.get(llllllllllllIllIllIIIlIllIIIIlll * (this.texWidth * llllllllllllIllIllIIIlIlIllllIII) + llllllllllllIllIllIIIlIllIIIlIII));
                    "".length();
                    this.scratch.put(llllllllllllIllIllIIIlIllIIIIlll * (this.texWidth * llllllllllllIllIllIIIlIlIllllIII) + this.width * llllllllllllIllIllIIIlIlIllllIII + llllllllllllIllIllIIIlIllIIIlIII, this.scratch.get(llllllllllllIllIllIIIlIllIIIIlll * (this.texWidth * llllllllllllIllIllIIIlIlIllllIII) + (this.width - PNGImageData.llIlIIlIIllIIl[1]) * llllllllllllIllIllIIIlIlIllllIII + llllllllllllIllIllIIIlIllIIIlIII));
                    "".length();
                    ++llllllllllllIllIllIIIlIllIIIlIII;
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                }
                ++llllllllllllIllIllIIIlIllIIIIlll;
                "".length();
                if (" ".length() < " ".length()) {
                    return null;
                }
            }
        }
        if (lIIlIIlIIlllIlII(llllllllllllIllIllIIIlIlIllllIIl.hasAlpha() ? 1 : 0) && lIIlIIlIIlllIlIl(llllllllllllIllIllIIIlIlIlllIlIl ? 1 : 0)) {
            final ByteBuffer llllllllllllIllIllIIIlIllIIIIIlI = BufferUtils.createByteBuffer(this.texWidth * this.texHeight * PNGImageData.llIlIIlIIllIIl[2]);
            int llllllllllllIllIllIIIlIllIIIIIll = PNGImageData.llIlIIlIIllIIl[0];
            while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIIIll, this.texWidth)) {
                int llllllllllllIllIllIIIlIllIIIIlII = PNGImageData.llIlIIlIIllIIl[0];
                while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIIlII, this.texHeight)) {
                    final int llllllllllllIllIllIIIlIllIIIIllI = llllllllllllIllIllIIIlIllIIIIlII * PNGImageData.llIlIIlIIllIIl[3] + llllllllllllIllIllIIIlIllIIIIIll * this.texHeight * PNGImageData.llIlIIlIIllIIl[3];
                    final int llllllllllllIllIllIIIlIllIIIIlIl = llllllllllllIllIllIIIlIllIIIIlII * PNGImageData.llIlIIlIIllIIl[2] + llllllllllllIllIllIIIlIllIIIIIll * this.texHeight * PNGImageData.llIlIIlIIllIIl[2];
                    llllllllllllIllIllIIIlIllIIIIIlI.put(llllllllllllIllIllIIIlIllIIIIlIl, this.scratch.get(llllllllllllIllIllIIIlIllIIIIllI));
                    "".length();
                    llllllllllllIllIllIIIlIllIIIIIlI.put(llllllllllllIllIllIIIlIllIIIIlIl + PNGImageData.llIlIIlIIllIIl[1], this.scratch.get(llllllllllllIllIllIIIlIllIIIIllI + PNGImageData.llIlIIlIIllIIl[1]));
                    "".length();
                    llllllllllllIllIllIIIlIllIIIIIlI.put(llllllllllllIllIllIIIlIllIIIIlIl + PNGImageData.llIlIIlIIllIIl[6], this.scratch.get(llllllllllllIllIllIIIlIllIIIIllI + PNGImageData.llIlIIlIIllIIl[6]));
                    "".length();
                    if (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIIIll, this.getHeight()) && lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIIlII, this.getWidth())) {
                        llllllllllllIllIllIIIlIllIIIIIlI.put(llllllllllllIllIllIIIlIllIIIIlIl + PNGImageData.llIlIIlIIllIIl[3], (byte)PNGImageData.llIlIIlIIllIIl[7]);
                        "".length();
                        "".length();
                        if ((0x51 ^ 0x58 ^ (0xF ^ 0x3)) <= 0) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIllIllIIIlIllIIIIIlI.put(llllllllllllIllIllIIIlIllIIIIlIl + PNGImageData.llIlIIlIIllIIl[3], (byte)PNGImageData.llIlIIlIIllIIl[0]);
                        "".length();
                    }
                    ++llllllllllllIllIllIIIlIllIIIIlII;
                    "".length();
                    if (((80 + 196 - 151 + 76 ^ 75 + 39 + 11 + 74) & (0x6B ^ 0x56 ^ (0x77 ^ 0x44) ^ -" ".length())) != 0x0) {
                        return null;
                    }
                }
                ++llllllllllllIllIllIIIlIllIIIIIll;
                "".length();
                if (((0x54 ^ 0x9) & ~(0x98 ^ 0xC5)) > " ".length()) {
                    return null;
                }
            }
            this.bitDepth = PNGImageData.llIlIIlIIllIIl[4];
            this.scratch = llllllllllllIllIllIIIlIllIIIIIlI;
        }
        if (lIIlIIlIIlllIIll(llllllllllllIllIllIIIlIlIllllIlI)) {
            int llllllllllllIllIllIIIlIlIlllllll = PNGImageData.llIlIIlIIllIIl[0];
            while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIlIlllllll, this.texWidth * this.texHeight * PNGImageData.llIlIIlIIllIIl[2])) {
                boolean llllllllllllIllIllIIIlIllIIIIIII = PNGImageData.llIlIIlIIllIIl[1] != 0;
                int llllllllllllIllIllIIIlIllIIIIIIl = PNGImageData.llIlIIlIIllIIl[0];
                while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIllIIIIIIl, PNGImageData.llIlIIlIIllIIl[3])) {
                    if (lIIlIIlIIllllIII(this.toInt(this.scratch.get(llllllllllllIllIllIIIlIlIlllllll + llllllllllllIllIllIIIlIllIIIIIIl)), llllllllllllIllIllIIIlIlIllllIlI[llllllllllllIllIllIIIlIllIIIIIIl])) {
                        llllllllllllIllIllIIIlIllIIIIIII = (PNGImageData.llIlIIlIIllIIl[0] != 0);
                    }
                    ++llllllllllllIllIllIIIlIllIIIIIIl;
                    "".length();
                    if ((0x64 ^ 0x10 ^ (0xDB ^ 0xAB)) < 0) {
                        return null;
                    }
                }
                if (lIIlIIlIIlllIlIl(llllllllllllIllIllIIIlIllIIIIIII ? 1 : 0)) {
                    this.scratch.put(llllllllllllIllIllIIIlIlIlllllll + PNGImageData.llIlIIlIIllIIl[3], (byte)PNGImageData.llIlIIlIIllIIl[0]);
                    "".length();
                }
                llllllllllllIllIllIIIlIlIlllllll += 4;
                "".length();
                if (((0x7E ^ 0x28) & ~(0x6E ^ 0x38)) != 0x0) {
                    return null;
                }
            }
        }
        this.scratch.position(PNGImageData.llIlIIlIIllIIl[0]);
        "".length();
        return this.scratch;
    }
    
    private static boolean lIIlIIlIIlllIlll(final int llllllllllllIllIllIIIlIlIlIIIllI, final int llllllllllllIllIllIIIlIlIlIIIlIl) {
        return llllllllllllIllIllIIIlIlIlIIIllI < llllllllllllIllIllIIIlIlIlIIIlIl;
    }
    
    private int toInt(final byte llllllllllllIllIllIIIlIlIllIlIIl) {
        if (lIIlIIlIIllllIIl(llllllllllllIllIllIIIlIlIllIlIIl)) {
            return PNGImageData.llIlIIlIIllIIl[8] + llllllllllllIllIllIIIlIlIllIlIIl;
        }
        return llllllllllllIllIllIIIlIlIllIlIIl;
    }
    
    private static boolean lIIlIIlIIlllIIll(final Object llllllllllllIllIllIIIlIlIlIIIIll) {
        return llllllllllllIllIllIIIlIlIlIIIIll != null;
    }
    
    private static boolean lIIlIIlIIllllIII(final int llllllllllllIllIllIIIlIlIIlllIlI, final int llllllllllllIllIllIIIlIlIIlllIIl) {
        return llllllllllllIllIllIIIlIlIIlllIlI != llllllllllllIllIllIIIlIlIIlllIIl;
    }
    
    private static boolean lIIlIIlIIlllIllI(final int llllllllllllIllIllIIIlIlIlIIlIlI, final int llllllllllllIllIllIIIlIlIlIIlIIl) {
        return llllllllllllIllIllIIIlIlIlIIlIlI == llllllllllllIllIllIIIlIlIlIIlIIl;
    }
    
    private static boolean lIIlIIlIIlllIlIl(final int llllllllllllIllIllIIIlIlIlIIIIIl) {
        return llllllllllllIllIllIIIlIlIlIIIIIl != 0;
    }
    
    private static String lIIlIIlIIlllIIII(final String llllllllllllIllIllIIIlIlIlIlIIlI, final String llllllllllllIllIllIIIlIlIlIIllll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlIlIlIlIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlIlIlIIllll.getBytes(StandardCharsets.UTF_8)), PNGImageData.llIlIIlIIllIIl[9]), "DES");
            final Cipher llllllllllllIllIllIIIlIlIlIlIlII = Cipher.getInstance("DES");
            llllllllllllIllIllIIIlIlIlIlIlII.init(PNGImageData.llIlIIlIIllIIl[6], llllllllllllIllIllIIIlIlIlIlIlIl);
            return new String(llllllllllllIllIllIIIlIlIlIlIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlIlIlIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlIlIlIlIIll) {
            llllllllllllIllIllIIIlIlIlIlIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIIlIIllllIIl(final int llllllllllllIllIllIIIlIlIIllllIl) {
        return llllllllllllIllIllIIIlIlIIllllIl < 0;
    }
    
    private int get2Fold(final int llllllllllllIllIllIIIlIlIllIIIll) {
        int llllllllllllIllIllIIIlIlIllIIlII = PNGImageData.llIlIIlIIllIIl[6];
        while (lIIlIIlIIlllIlll(llllllllllllIllIllIIIlIlIllIIlII, llllllllllllIllIllIIIlIlIllIIIll)) {
            llllllllllllIllIllIIIlIlIllIIlII *= PNGImageData.llIlIIlIIllIIl[6];
            "".length();
            if ((62 + 137 - 78 + 27 ^ 111 + 86 - 189 + 136) < 0) {
                return (80 + 43 - 113 + 129 ^ 135 + 121 - 191 + 130) & (153 + 251 - 157 + 5 ^ 87 + 156 - 205 + 142 ^ -" ".length());
            }
        }
        return llllllllllllIllIllIIIlIlIllIIlII;
    }
    
    public int getDepth() {
        return this.bitDepth;
    }
    
    public void configureEdging(final boolean llllllllllllIllIllIIIlIlIllIIIII) {
    }
    
    private static boolean lIIlIIlIIlllIlII(final int llllllllllllIllIllIIIlIlIIllllll) {
        return llllllllllllIllIllIIIlIlIIllllll == 0;
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIllIllIIIlIllIIllIlI, final boolean llllllllllllIllIllIIIlIllIIllIIl, final int[] llllllllllllIllIllIIIlIllIIllIII) throws IOException {
        return this.loadImage(llllllllllllIllIllIIIlIllIIllIlI, llllllllllllIllIllIIIlIllIIllIIl, (boolean)(PNGImageData.llIlIIlIIllIIl[0] != 0), llllllllllllIllIllIIIlIllIIllIII);
    }
}
