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
import java.nio.ByteOrder;
import java.io.DataInputStream;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.io.InputStream;

public class TGAImageData implements LoadableImageData
{
    private /* synthetic */ int texHeight;
    private /* synthetic */ short pixelDepth;
    private static final /* synthetic */ String[] lllIlllIIIIIll;
    private /* synthetic */ int width;
    private /* synthetic */ int texWidth;
    private static final /* synthetic */ int[] lllIlllIIIlIIl;
    private /* synthetic */ int height;
    
    private static boolean lIlIIlIllIIIIIll(final int llllllllllllIlIllIIIIllIIllIllII) {
        return llllllllllllIlIllIIIIllIIllIllII > 0;
    }
    
    private static boolean lIlIIlIllIIIIIlI(final int llllllllllllIlIllIIIIllIIlllIIII) {
        return llllllllllllIlIllIIIIllIIlllIIII == 0;
    }
    
    private static boolean lIlIIlIllIIIIlIl(final int llllllllllllIlIllIIIIllIIllIlllI) {
        return llllllllllllIlIllIIIIllIIllIlllI >= 0;
    }
    
    static {
        lIlIIlIlIllllllI();
        lIlIIlIlIllIllIl();
    }
    
    private static boolean lIlIIlIllIIIIIII(final int llllllllllllIlIllIIIIllIIllIlIIl, final int llllllllllllIlIllIIIIllIIllIlIII) {
        return llllllllllllIlIllIIIIllIIllIlIIl != llllllllllllIlIllIIIIllIIllIlIII;
    }
    
    private static boolean lIlIIlIlIlllllll(final Object llllllllllllIlIllIIIIllIIllllIII) {
        return llllllllllllIlIllIIIIllIIllllIII != null;
    }
    
    private int get2Fold(final int llllllllllllIlIllIIIIllIlIlIlIll) {
        int llllllllllllIlIllIIIIllIlIlIllII = TGAImageData.lllIlllIIIlIIl[6];
        while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlIlIllII, llllllllllllIlIllIIIIllIlIlIlIll)) {
            llllllllllllIlIllIIIIllIlIlIllII *= TGAImageData.lllIlllIIIlIIl[6];
            "".length();
            if (-" ".length() >= 0) {
                return (0x7A ^ 0x38 ^ (0x9E ^ 0x9A)) & (0x6A ^ 0x5E ^ (0x2B ^ 0x59) ^ -" ".length());
            }
        }
        return llllllllllllIlIllIIIIllIlIlIllII;
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIlIllIIIIlllIIIlIIlI, final boolean llllllllllllIlIllIIIIlllIIIlIIIl, final int[] llllllllllllIlIllIIIIlllIIIlIlII) throws IOException {
        return this.loadImage(llllllllllllIlIllIIIIlllIIIlIIlI, llllllllllllIlIllIIIIlllIIIlIIIl, (boolean)(TGAImageData.lllIlllIIIlIIl[4] != 0), llllllllllllIlIllIIIIlllIIIlIlII);
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIlIllIIIIllIlllIIIII, boolean llllllllllllIlIllIIIIllIllIIlIII, boolean llllllllllllIlIllIIIIllIllIIIlll, final int[] llllllllllllIlIllIIIIllIllIIIllI) throws IOException {
        if (lIlIIlIlIlllllll(llllllllllllIlIllIIIIllIllIIIllI)) {
            llllllllllllIlIllIIIIllIllIIIlll = TGAImageData.lllIlllIIIlIIl[3];
        }
        byte llllllllllllIlIllIIIIllIllIlllII = (byte)TGAImageData.lllIlllIIIlIIl[4];
        byte llllllllllllIlIllIIIIllIllIllIll = (byte)TGAImageData.lllIlllIIIlIIl[4];
        byte llllllllllllIlIllIIIIllIllIllIlI = (byte)TGAImageData.lllIlllIIIlIIl[4];
        byte llllllllllllIlIllIIIIllIllIllIIl = (byte)TGAImageData.lllIlllIIIlIIl[4];
        final BufferedInputStream llllllllllllIlIllIIIIllIllIllIII = new BufferedInputStream(llllllllllllIlIllIIIIllIlllIIIII, TGAImageData.lllIlllIIIlIIl[5]);
        final DataInputStream llllllllllllIlIllIIIIllIllIlIlll = new DataInputStream(llllllllllllIlIllIIIIllIllIllIII);
        final short llllllllllllIlIllIIIIllIllIlIllI = (short)llllllllllllIlIllIIIIllIllIlIlll.read();
        final short llllllllllllIlIllIIIIllIllIlIlIl = (short)llllllllllllIlIllIIIIllIllIlIlll.read();
        final short llllllllllllIlIllIIIIllIllIlIlII = (short)llllllllllllIlIllIIIIllIllIlIlll.read();
        final short llllllllllllIlIllIIIIllIllIlIIll = this.flipEndian(llllllllllllIlIllIIIIllIllIlIlll.readShort());
        final short llllllllllllIlIllIIIIllIllIlIIlI = this.flipEndian(llllllllllllIlIllIIIIllIllIlIlll.readShort());
        final short llllllllllllIlIllIIIIllIllIlIIIl = (short)llllllllllllIlIllIIIIllIllIlIlll.read();
        final short llllllllllllIlIllIIIIllIllIlIIII = this.flipEndian(llllllllllllIlIllIIIIllIllIlIlll.readShort());
        final short llllllllllllIlIllIIIIllIllIIllll = this.flipEndian(llllllllllllIlIllIIIIllIllIlIlll.readShort());
        if (lIlIIlIllIIIIIII(llllllllllllIlIllIIIIllIllIlIlII, TGAImageData.lllIlllIIIlIIl[6])) {
            throw new IOException(TGAImageData.lllIlllIIIIIll[TGAImageData.lllIlllIIIlIIl[4]]);
        }
        this.width = this.flipEndian(llllllllllllIlIllIIIIllIllIlIlll.readShort());
        this.height = this.flipEndian(llllllllllllIlIllIIIIllIllIlIlll.readShort());
        this.pixelDepth = (short)llllllllllllIlIllIIIIllIllIlIlll.read();
        if (lIlIIlIllIIIIIIl(this.pixelDepth, TGAImageData.lllIlllIIIlIIl[7])) {
            llllllllllllIlIllIIIIllIllIIIlll = TGAImageData.lllIlllIIIlIIl[4];
        }
        this.texWidth = this.get2Fold(this.width);
        this.texHeight = this.get2Fold(this.height);
        final short llllllllllllIlIllIIIIllIllIIlllI = (short)llllllllllllIlIllIIIIllIllIlIlll.read();
        if (lIlIIlIllIIIIIlI(llllllllllllIlIllIIIIllIllIIlllI & TGAImageData.lllIlllIIIlIIl[7])) {
            long n;
            if (lIlIIlIllIIIIIlI((int)llllllllllllIlIllIIIIllIllIIlIII)) {
                n = TGAImageData.lllIlllIIIlIIl[3];
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                n = TGAImageData.lllIlllIIIlIIl[4];
            }
            llllllllllllIlIllIIIIllIllIIlIII = n;
        }
        if (lIlIIlIllIIIIIll(llllllllllllIlIllIIIIllIllIlIllI)) {
            llllllllllllIlIllIIIIllIllIllIII.skip(llllllllllllIlIllIIIIllIllIlIllI);
        }
        byte[] llllllllllllIlIllIIIIllIllIIllIl = null;
        if (!lIlIIlIllIIIIIII(this.pixelDepth, TGAImageData.lllIlllIIIlIIl[7]) || lIlIIlIllIIIIlII((int)llllllllllllIlIllIIIIllIllIIIlll)) {
            this.pixelDepth = (short)TGAImageData.lllIlllIIIlIIl[7];
            llllllllllllIlIllIIIIllIllIIllIl = new byte[this.texWidth * this.texHeight * TGAImageData.lllIlllIIIlIIl[8]];
            "".length();
            if (-" ".length() > -" ".length()) {
                return null;
            }
        }
        else {
            if (!lIlIIlIllIIIIIIl(this.pixelDepth, TGAImageData.lllIlllIIIlIIl[9])) {
                throw new RuntimeException(TGAImageData.lllIlllIIIIIll[TGAImageData.lllIlllIIIlIIl[3]]);
            }
            llllllllllllIlIllIIIIllIllIIllIl = new byte[this.texWidth * this.texHeight * TGAImageData.lllIlllIIIlIIl[10]];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
        }
        if (lIlIIlIllIIIIIIl(this.pixelDepth, TGAImageData.lllIlllIIIlIIl[9])) {
            if (lIlIIlIllIIIIlII((int)llllllllllllIlIllIIIIllIllIIlIII)) {
                int llllllllllllIlIllIIIIllIllllIIll = this.height - TGAImageData.lllIlllIIIlIIl[3];
                while (lIlIIlIllIIIIlIl(llllllllllllIlIllIIIIllIllllIIll)) {
                    int llllllllllllIlIllIIIIllIllllIlII = TGAImageData.lllIlllIIIlIIl[4];
                    while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIllllIlII, this.width)) {
                        llllllllllllIlIllIIIIllIllIllIlI = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIllIll = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIlllII = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        final int llllllllllllIlIllIIIIllIllllIlIl = (llllllllllllIlIllIIIIllIllllIlII + llllllllllllIlIllIIIIllIllllIIll * this.texWidth) * TGAImageData.lllIlllIIIlIIl[10];
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIllllIlIl] = llllllllllllIlIllIIIIllIllIlllII;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIllllIlIl + TGAImageData.lllIlllIIIlIIl[3]] = llllllllllllIlIllIIIIllIllIllIll;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIllllIlIl + TGAImageData.lllIlllIIIlIIl[6]] = llllllllllllIlIllIIIIllIllIllIlI;
                        ++llllllllllllIlIllIIIIllIllllIlII;
                        "".length();
                        if (((0x6A ^ 0x4D) & ~(0x2D ^ 0xA)) > 0) {
                            return null;
                        }
                    }
                    --llllllllllllIlIllIIIIllIllllIIll;
                    "".length();
                    if ("   ".length() < 0) {
                        return null;
                    }
                }
                "".length();
                if (null != null) {
                    return null;
                }
            }
            else {
                int llllllllllllIlIllIIIIllIllllIIII = TGAImageData.lllIlllIIIlIIl[4];
                while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIllllIIII, this.height)) {
                    int llllllllllllIlIllIIIIllIllllIIIl = TGAImageData.lllIlllIIIlIIl[4];
                    while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIllllIIIl, this.width)) {
                        llllllllllllIlIllIIIIllIllIllIlI = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIllIll = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIlllII = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        final int llllllllllllIlIllIIIIllIllllIIlI = (llllllllllllIlIllIIIIllIllllIIIl + llllllllllllIlIllIIIIllIllllIIII * this.texWidth) * TGAImageData.lllIlllIIIlIIl[10];
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIllllIIlI] = llllllllllllIlIllIIIIllIllIlllII;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIllllIIlI + TGAImageData.lllIlllIIIlIIl[3]] = llllllllllllIlIllIIIIllIllIllIll;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIllllIIlI + TGAImageData.lllIlllIIIlIIl[6]] = llllllllllllIlIllIIIIllIllIllIlI;
                        ++llllllllllllIlIllIIIIllIllllIIIl;
                        "".length();
                        if ("  ".length() < "  ".length()) {
                            return null;
                        }
                    }
                    ++llllllllllllIlIllIIIIllIllllIIII;
                    "".length();
                    if (((0x6F ^ 0x21) & ~(0x63 ^ 0x2D)) == "   ".length()) {
                        return null;
                    }
                }
                "".length();
                if (" ".length() < " ".length()) {
                    return null;
                }
            }
        }
        else if (lIlIIlIllIIIIIIl(this.pixelDepth, TGAImageData.lllIlllIIIlIIl[7])) {
            if (lIlIIlIllIIIIlII((int)llllllllllllIlIllIIIIllIllIIlIII)) {
                int llllllllllllIlIllIIIIllIlllIllIl = this.height - TGAImageData.lllIlllIIIlIIl[3];
                while (lIlIIlIllIIIIlIl(llllllllllllIlIllIIIIllIlllIllIl)) {
                    int llllllllllllIlIllIIIIllIlllIlllI = TGAImageData.lllIlllIIIlIIl[4];
                    while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIlllI, this.width)) {
                        llllllllllllIlIllIIIIllIllIllIlI = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIllIll = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIlllII = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        if (lIlIIlIllIIIIlII((int)llllllllllllIlIllIIIIllIllIIIlll)) {
                            llllllllllllIlIllIIIIllIllIllIIl = (byte)TGAImageData.lllIlllIIIlIIl[11];
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllIIIIllIllIllIIl = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        }
                        final int llllllllllllIlIllIIIIllIlllIllll = (llllllllllllIlIllIIIIllIlllIlllI + llllllllllllIlIllIIIIllIlllIllIl * this.texWidth) * TGAImageData.lllIlllIIIlIIl[8];
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll] = llllllllllllIlIllIIIIllIllIlllII;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll + TGAImageData.lllIlllIIIlIIl[3]] = llllllllllllIlIllIIIIllIllIllIll;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll + TGAImageData.lllIlllIIIlIIl[6]] = llllllllllllIlIllIIIIllIllIllIlI;
                        llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll + TGAImageData.lllIlllIIIlIIl[10]] = llllllllllllIlIllIIIIllIllIllIIl;
                        if (lIlIIlIllIIIIIlI(llllllllllllIlIllIIIIllIllIllIIl)) {
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll + TGAImageData.lllIlllIIIlIIl[6]] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll + TGAImageData.lllIlllIIIlIIl[3]] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllll] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                        }
                        ++llllllllllllIlIllIIIIllIlllIlllI;
                        "".length();
                        if ((0xB ^ 0x44 ^ (0x0 ^ 0x4A)) == 0x0) {
                            return null;
                        }
                    }
                    --llllllllllllIlIllIIIIllIlllIllIl;
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                "".length();
                if (-"  ".length() > 0) {
                    return null;
                }
            }
            else {
                int llllllllllllIlIllIIIIllIlllIlIlI = TGAImageData.lllIlllIIIlIIl[4];
                while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIlIlI, this.height)) {
                    int llllllllllllIlIllIIIIllIlllIlIll = TGAImageData.lllIlllIIIlIIl[4];
                    while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIlIll, this.width)) {
                        llllllllllllIlIllIIIIllIllIllIlI = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIllIll = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        llllllllllllIlIllIIIIllIllIlllII = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        if (lIlIIlIllIIIIlII((int)llllllllllllIlIllIIIIllIllIIIlll)) {
                            llllllllllllIlIllIIIIllIllIllIIl = (byte)TGAImageData.lllIlllIIIlIIl[11];
                            "".length();
                            if (-(0xA6 ^ 0xB4 ^ (0x3C ^ 0x2A)) >= 0) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllIIIIllIllIllIIl = llllllllllllIlIllIIIIllIllIlIlll.readByte();
                        }
                        final int llllllllllllIlIllIIIIllIlllIllII = (llllllllllllIlIllIIIIllIlllIlIll + llllllllllllIlIllIIIIllIlllIlIlI * this.texWidth) * TGAImageData.lllIlllIIIlIIl[8];
                        if (lIlIIlIllIIIIlll(ByteOrder.nativeOrder(), ByteOrder.BIG_ENDIAN)) {
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII] = llllllllllllIlIllIIIIllIllIlllII;
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[3]] = llllllllllllIlIllIIIIllIllIllIll;
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[6]] = llllllllllllIlIllIIIIllIllIllIlI;
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[10]] = llllllllllllIlIllIIIIllIllIllIIl;
                            "".length();
                            if (-(162 + 45 - 93 + 75 ^ 145 + 134 - 241 + 147) > 0) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII] = llllllllllllIlIllIIIIllIllIlllII;
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[3]] = llllllllllllIlIllIIIIllIllIllIll;
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[6]] = llllllllllllIlIllIIIIllIllIllIlI;
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[10]] = llllllllllllIlIllIIIIllIllIllIIl;
                        }
                        if (lIlIIlIllIIIIIlI(llllllllllllIlIllIIIIllIllIllIIl)) {
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[6]] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII + TGAImageData.lllIlllIIIlIIl[3]] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                            llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIllII] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                        }
                        ++llllllllllllIlIllIIIIllIlllIlIll;
                        "".length();
                        if ("   ".length() < 0) {
                            return null;
                        }
                    }
                    ++llllllllllllIlIllIIIIllIlllIlIlI;
                    "".length();
                    if ("  ".length() < "  ".length()) {
                        return null;
                    }
                }
            }
        }
        llllllllllllIlIllIIIIllIlllIIIII.close();
        if (lIlIIlIlIlllllll(llllllllllllIlIllIIIIllIllIIIllI)) {
            int llllllllllllIlIllIIIIllIlllIIlll = TGAImageData.lllIlllIIIlIIl[4];
            while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIIlll, llllllllllllIlIllIIIIllIllIIllIl.length)) {
                boolean llllllllllllIlIllIIIIllIlllIlIII = TGAImageData.lllIlllIIIlIIl[3] != 0;
                int llllllllllllIlIllIIIIllIlllIlIIl = TGAImageData.lllIlllIIIlIIl[4];
                while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIlIIl, TGAImageData.lllIlllIIIlIIl[10])) {
                    if (lIlIIlIllIIIIIII(llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIIlll + llllllllllllIlIllIIIIllIlllIlIIl], llllllllllllIlIllIIIIllIllIIIllI[llllllllllllIlIllIIIIllIlllIlIIl])) {
                        llllllllllllIlIllIIIIllIlllIlIII = (TGAImageData.lllIlllIIIlIIl[4] != 0);
                    }
                    ++llllllllllllIlIllIIIIllIlllIlIIl;
                    "".length();
                    if ("   ".length() <= 0) {
                        return null;
                    }
                }
                if (lIlIIlIllIIIIlII(llllllllllllIlIllIIIIllIlllIlIII ? 1 : 0)) {
                    llllllllllllIlIllIIIIllIllIIllIl[llllllllllllIlIllIIIIllIlllIIlll + TGAImageData.lllIlllIIIlIIl[10]] = (byte)TGAImageData.lllIlllIIIlIIl[4];
                }
                llllllllllllIlIllIIIIllIlllIIlll += 4;
                "".length();
                if ((0x22 ^ 0x26) < 0) {
                    return null;
                }
            }
        }
        final ByteBuffer llllllllllllIlIllIIIIllIllIIllII = BufferUtils.createByteBuffer(llllllllllllIlIllIIIIllIllIIllIl.length);
        llllllllllllIlIllIIIIllIllIIllII.put(llllllllllllIlIllIIIIllIllIIllIl);
        "".length();
        final int llllllllllllIlIllIIIIllIllIIlIll = this.pixelDepth / TGAImageData.lllIlllIIIlIIl[1];
        if (lIlIIlIllIIIIllI(this.height, this.texHeight - TGAImageData.lllIlllIIIlIIl[3])) {
            final int llllllllllllIlIllIIIIllIlllIIlIl = (this.texHeight - TGAImageData.lllIlllIIIlIIl[3]) * (this.texWidth * llllllllllllIlIllIIIIllIllIIlIll);
            final int llllllllllllIlIllIIIIllIlllIIlII = (this.height - TGAImageData.lllIlllIIIlIIl[3]) * (this.texWidth * llllllllllllIlIllIIIIllIllIIlIll);
            int llllllllllllIlIllIIIIllIlllIIllI = TGAImageData.lllIlllIIIlIIl[4];
            while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIIllI, this.texWidth * llllllllllllIlIllIIIIllIllIIlIll)) {
                llllllllllllIlIllIIIIllIllIIllII.put(llllllllllllIlIllIIIIllIlllIIlIl + llllllllllllIlIllIIIIllIlllIIllI, llllllllllllIlIllIIIIllIllIIllII.get(llllllllllllIlIllIIIIllIlllIIllI));
                "".length();
                llllllllllllIlIllIIIIllIllIIllII.put(llllllllllllIlIllIIIIllIlllIIlII + this.texWidth * llllllllllllIlIllIIIIllIllIIlIll + llllllllllllIlIllIIIIllIlllIIllI, llllllllllllIlIllIIIIllIllIIllII.get(this.texWidth * llllllllllllIlIllIIIIllIllIIlIll + llllllllllllIlIllIIIIllIlllIIllI));
                "".length();
                ++llllllllllllIlIllIIIIllIlllIIllI;
                "".length();
                if ("  ".length() <= 0) {
                    return null;
                }
            }
        }
        if (lIlIIlIllIIIIllI(this.width, this.texWidth - TGAImageData.lllIlllIIIlIIl[3])) {
            int llllllllllllIlIllIIIIllIlllIIIlI = TGAImageData.lllIlllIIIlIIl[4];
            while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIIIlI, this.texHeight)) {
                int llllllllllllIlIllIIIIllIlllIIIll = TGAImageData.lllIlllIIIlIIl[4];
                while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlllIIIll, llllllllllllIlIllIIIIllIllIIlIll)) {
                    llllllllllllIlIllIIIIllIllIIllII.put((llllllllllllIlIllIIIIllIlllIIIlI + TGAImageData.lllIlllIIIlIIl[3]) * (this.texWidth * llllllllllllIlIllIIIIllIllIIlIll) - llllllllllllIlIllIIIIllIllIIlIll + llllllllllllIlIllIIIIllIlllIIIll, llllllllllllIlIllIIIIllIllIIllII.get(llllllllllllIlIllIIIIllIlllIIIlI * (this.texWidth * llllllllllllIlIllIIIIllIllIIlIll) + llllllllllllIlIllIIIIllIlllIIIll));
                    "".length();
                    llllllllllllIlIllIIIIllIllIIllII.put(llllllllllllIlIllIIIIllIlllIIIlI * (this.texWidth * llllllllllllIlIllIIIIllIllIIlIll) + this.width * llllllllllllIlIllIIIIllIllIIlIll + llllllllllllIlIllIIIIllIlllIIIll, llllllllllllIlIllIIIIllIllIIllII.get(llllllllllllIlIllIIIIllIlllIIIlI * (this.texWidth * llllllllllllIlIllIIIIllIllIIlIll) + (this.width - TGAImageData.lllIlllIIIlIIl[3]) * llllllllllllIlIllIIIIllIllIIlIll + llllllllllllIlIllIIIIllIlllIIIll));
                    "".length();
                    ++llllllllllllIlIllIIIIllIlllIIIll;
                    "".length();
                    if (null != null) {
                        return null;
                    }
                }
                ++llllllllllllIlIllIIIIllIlllIIIlI;
                "".length();
                if ("  ".length() != "  ".length()) {
                    return null;
                }
            }
        }
        llllllllllllIlIllIIIIllIllIIllII.flip();
        "".length();
        return llllllllllllIlIllIIIIllIllIIllII;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getTexHeight() {
        return this.texHeight;
    }
    
    private static boolean lIlIIlIllIIIIlll(final Object llllllllllllIlIllIIIIllIIlllIlIl, final Object llllllllllllIlIllIIIIllIIlllIlII) {
        return llllllllllllIlIllIIIIllIIlllIlIl == llllllllllllIlIllIIIIllIIlllIlII;
    }
    
    private static boolean lIlIIlIllIIIIIIl(final int llllllllllllIlIllIIIIllIIlllllll, final int llllllllllllIlIllIIIIllIIllllllI) {
        return llllllllllllIlIllIIIIllIIlllllll == llllllllllllIlIllIIIIllIIllllllI;
    }
    
    private static void lIlIIlIlIllIllIl() {
        (lllIlllIIIIIll = new String[TGAImageData.lllIlllIIIlIIl[10]])[TGAImageData.lllIlllIIIlIIl[4]] = lIlIIlIlIllIlIlI("M2ThoNdczE7vzp/E335i8HSfRPwzSE9ErBO1Hp/K1sqJCJmmD638qf57QtAJINVotmvfV9bBZdQ=", "uhyPa");
        TGAImageData.lllIlllIIIIIll[TGAImageData.lllIlllIIIlIIl[3]] = lIlIIlIlIllIlIll("LgE2G25TW3oDIAVPaVBuAwYuQhomLilCLxMKehE7ER81EDoECw==", "aoZbN");
        TGAImageData.lllIlllIIIIIll[TGAImageData.lllIlllIIIlIIl[6]] = lIlIIlIlIllIlIlI("dhRZJkDV+otCK9+SCSrpJlUv3QY04VwL9P0tKTFBlkHro7fm/VGJzQ==", "DePjn");
    }
    
    private static void lIlIIlIlIllllllI() {
        (lllIlllIIIlIIl = new int[12])[0] = (-1 & 0xFFFF);
        TGAImageData.lllIlllIIIlIIl[1] = (102 + 87 - 57 + 47 ^ 105 + 21 - 58 + 119);
        TGAImageData.lllIlllIIIlIIl[2] = (0xFFFFFF93 & 0xFF6C);
        TGAImageData.lllIlllIIIlIIl[3] = " ".length();
        TGAImageData.lllIlllIIIlIIl[4] = ((0x47 ^ 0x11) & ~(0xE7 ^ 0xB1));
        TGAImageData.lllIlllIIIlIIl[5] = (-(0xFFFFEE7F & 0x5196) & (0xFFFFCEB7 & 0x1F7FD));
        TGAImageData.lllIlllIIIlIIl[6] = "  ".length();
        TGAImageData.lllIlllIIIlIIl[7] = (0x4E ^ 0x6E);
        TGAImageData.lllIlllIIIlIIl[8] = (0x60 ^ 0x64);
        TGAImageData.lllIlllIIIlIIl[9] = (0x61 ^ 0x79);
        TGAImageData.lllIlllIIIlIIl[10] = "   ".length();
        TGAImageData.lllIlllIIIlIIl[11] = -" ".length();
    }
    
    private static boolean lIlIIlIllIIIIlII(final int llllllllllllIlIllIIIIllIIlllIIlI) {
        return llllllllllllIlIllIIIIllIIlllIIlI != 0;
    }
    
    private static boolean lIlIIlIllIIIIllI(final int llllllllllllIlIllIIIIllIIllllIll, final int llllllllllllIlIllIIIIllIIllllIlI) {
        return llllllllllllIlIllIIIIllIIllllIll < llllllllllllIlIllIIIIllIIllllIlI;
    }
    
    public int getTexWidth() {
        return this.texWidth;
    }
    
    public void configureEdging(final boolean llllllllllllIlIllIIIIllIlIlIIlll) {
    }
    
    private static String lIlIIlIlIllIlIlI(final String llllllllllllIlIllIIIIllIlIIIIlIl, final String llllllllllllIlIllIIIIllIlIIIIllI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIIIllIlIIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIIIllIlIIIIllI.getBytes(StandardCharsets.UTF_8)), TGAImageData.lllIlllIIIlIIl[1]), "DES");
            final Cipher llllllllllllIlIllIIIIllIlIIIlIIl = Cipher.getInstance("DES");
            llllllllllllIlIllIIIIllIlIIIlIIl.init(TGAImageData.lllIlllIIIlIIl[6], llllllllllllIlIllIIIIllIlIIIlIlI);
            return new String(llllllllllllIlIllIIIIllIlIIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIIIllIlIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIIIllIlIIIlIII) {
            llllllllllllIlIllIIIIllIlIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIlIlIllIlIll(String llllllllllllIlIllIIIIllIlIIlIlll, final String llllllllllllIlIllIIIIllIlIIllIll) {
        llllllllllllIlIllIIIIllIlIIlIlll = new String(Base64.getDecoder().decode(llllllllllllIlIllIIIIllIlIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIIIllIlIIllIlI = new StringBuilder();
        final char[] llllllllllllIlIllIIIIllIlIIllIIl = llllllllllllIlIllIIIIllIlIIllIll.toCharArray();
        int llllllllllllIlIllIIIIllIlIIllIII = TGAImageData.lllIlllIIIlIIl[4];
        final double llllllllllllIlIllIIIIllIlIIlIIlI = (Object)llllllllllllIlIllIIIIllIlIIlIlll.toCharArray();
        final int llllllllllllIlIllIIIIllIlIIlIIIl = llllllllllllIlIllIIIIllIlIIlIIlI.length;
        char llllllllllllIlIllIIIIllIlIIlIIII = (char)TGAImageData.lllIlllIIIlIIl[4];
        while (lIlIIlIllIIIIllI(llllllllllllIlIllIIIIllIlIIlIIII, llllllllllllIlIllIIIIllIlIIlIIIl)) {
            final char llllllllllllIlIllIIIIllIlIIlllIl = llllllllllllIlIllIIIIllIlIIlIIlI[llllllllllllIlIllIIIIllIlIIlIIII];
            llllllllllllIlIllIIIIllIlIIllIlI.append((char)(llllllllllllIlIllIIIIllIlIIlllIl ^ llllllllllllIlIllIIIIllIlIIllIIl[llllllllllllIlIllIIIIllIlIIllIII % llllllllllllIlIllIIIIllIlIIllIIl.length]));
            "".length();
            ++llllllllllllIlIllIIIIllIlIIllIII;
            ++llllllllllllIlIllIIIIllIlIIlIIII;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIIIllIlIIllIlI);
    }
    
    private short flipEndian(final short llllllllllllIlIllIIIIlllIIllIlII) {
        final int llllllllllllIlIllIIIIlllIIllIIll = llllllllllllIlIllIIIIlllIIllIlII & TGAImageData.lllIlllIIIlIIl[0];
        return (short)(llllllllllllIlIllIIIIlllIIllIIll << TGAImageData.lllIlllIIIlIIl[1] | (llllllllllllIlIllIIIIlllIIllIIll & TGAImageData.lllIlllIIIlIIl[2]) >>> TGAImageData.lllIlllIIIlIIl[1]);
    }
    
    public ByteBuffer getImageBufferData() {
        throw new RuntimeException(TGAImageData.lllIlllIIIIIll[TGAImageData.lllIlllIIIlIIl[6]]);
    }
    
    public int getWidth() {
        return this.width;
    }
    
    public int getDepth() {
        return this.pixelDepth;
    }
    
    public ByteBuffer loadImage(final InputStream llllllllllllIlIllIIIIlllIIIlllII) throws IOException {
        return this.loadImage(llllllllllllIlIllIIIIlllIIIlllII, (boolean)(TGAImageData.lllIlllIIIlIIl[3] != 0), null);
    }
}
