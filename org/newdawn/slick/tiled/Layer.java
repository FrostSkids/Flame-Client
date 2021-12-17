// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tiled;

import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import java.io.IOException;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.Log;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;
import java.io.ByteArrayInputStream;
import org.w3c.dom.Element;
import java.util.Properties;

public class Layer
{
    public /* synthetic */ Properties props;
    public /* synthetic */ int index;
    public /* synthetic */ int[][][] data;
    private static final /* synthetic */ String[] lllllllllIlII;
    private static final /* synthetic */ int[] lIIIIIIIlIlIll;
    private static /* synthetic */ byte[] baseCodes;
    public /* synthetic */ int height;
    public /* synthetic */ String name;
    private final /* synthetic */ TiledMap map;
    public /* synthetic */ int width;
    
    private byte[] decodeBase64(final char[] lllllllllllllIlIlIIlIIIIIIIlIlll) {
        int lllllllllllllIlIlIIlIIIIIIIlllIl = lllllllllllllIlIlIIlIIIIIIIlIlll.length;
        int lllllllllllllIlIlIIlIIIIIIlIIIlI = Layer.lIIIIIIIlIlIll[0];
        while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIIIlIIIlI, lllllllllllllIlIlIIlIIIIIIIlIlll.length)) {
            if (!lIllIIllIIlIllI(lllllllllllllIlIlIIlIIIIIIIlIlll[lllllllllllllIlIlIIlIIIIIIlIIIlI], Layer.lIIIIIIIlIlIll[19]) || lIllIIllIIlIIlI(Layer.baseCodes[lllllllllllllIlIlIIlIIIIIIIlIlll[lllllllllllllIlIlIIlIIIIIIlIIIlI]])) {
                --lllllllllllllIlIlIIlIIIIIIIlllIl;
            }
            ++lllllllllllllIlIlIIlIIIIIIlIIIlI;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        int lllllllllllllIlIlIIlIIIIIIIlllII = lllllllllllllIlIlIIlIIIIIIIlllIl / Layer.lIIIIIIIlIlIll[4] * Layer.lIIIIIIIlIlIll[3];
        if (lIllIIllIIlIlII(lllllllllllllIlIlIIlIIIIIIIlllIl % Layer.lIIIIIIIlIlIll[4], Layer.lIIIIIIIlIlIll[3])) {
            lllllllllllllIlIlIIlIIIIIIIlllII += 2;
        }
        if (lIllIIllIIlIlII(lllllllllllllIlIlIIlIIIIIIIlllIl % Layer.lIIIIIIIlIlIll[4], Layer.lIIIIIIIlIlIll[2])) {
            ++lllllllllllllIlIlIIlIIIIIIIlllII;
        }
        final byte[] lllllllllllllIlIlIIlIIIIIIIllIll = new byte[lllllllllllllIlIlIIlIIIIIIIlllII];
        int lllllllllllllIlIlIIlIIIIIIIllIlI = Layer.lIIIIIIIlIlIll[0];
        int lllllllllllllIlIlIIlIIIIIIIllIIl = Layer.lIIIIIIIlIlIll[0];
        int lllllllllllllIlIlIIlIIIIIIIllIII = Layer.lIIIIIIIlIlIll[0];
        int lllllllllllllIlIlIIlIIIIIIlIIIII = Layer.lIIIIIIIlIlIll[0];
        while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIIIlIIIII, lllllllllllllIlIlIIlIIIIIIIlIlll.length)) {
            int n;
            if (lIllIIllIIlIlll(lllllllllllllIlIlIIlIIIIIIIlIlll[lllllllllllllIlIlIIlIIIIIIlIIIII], Layer.lIIIIIIIlIlIll[19])) {
                n = Layer.lIIIIIIIlIlIll[14];
                "".length();
                if (((87 + 19 - 95 + 116 ^ (0x9D ^ 0xC6)) & (" ".length() ^ (0x35 ^ 0x10) ^ -" ".length())) != 0x0) {
                    return null;
                }
            }
            else {
                n = Layer.baseCodes[lllllllllllllIlIlIIlIIIIIIIlIlll[lllllllllllllIlIlIIlIIIIIIlIIIII]];
            }
            final int lllllllllllllIlIlIIlIIIIIIlIIIIl = n;
            if (lIllIIllIIlIIIl(lllllllllllllIlIlIIlIIIIIIlIIIIl)) {
                lllllllllllllIlIlIIlIIIIIIIllIIl <<= Layer.lIIIIIIIlIlIll[6];
                lllllllllllllIlIlIIlIIIIIIIllIlI += 6;
                lllllllllllllIlIlIIlIIIIIIIllIIl |= lllllllllllllIlIlIIlIIIIIIlIIIIl;
                if (lIllIIllIIlIIll(lllllllllllllIlIlIIlIIIIIIIllIlI, Layer.lIIIIIIIlIlIll[8])) {
                    lllllllllllllIlIlIIlIIIIIIIllIlI -= 8;
                    lllllllllllllIlIlIIlIIIIIIIllIll[lllllllllllllIlIlIIlIIIIIIIllIII++] = (byte)(lllllllllllllIlIlIIlIIIIIIIllIIl >> lllllllllllllIlIlIIlIIIIIIIllIlI & Layer.lIIIIIIIlIlIll[19]);
                }
            }
            ++lllllllllllllIlIlIIlIIIIIIlIIIII;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        if (lIllIIllIIllIII(lllllllllllllIlIlIIlIIIIIIIllIII, lllllllllllllIlIlIIlIIIIIIIllIll.length)) {
            throw new RuntimeException(String.valueOf(new StringBuilder().append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[12]]).append(lllllllllllllIlIlIIlIIIIIIIllIII).append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[20]]).append(lllllllllllllIlIlIIlIIIIIIIllIll.length).append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[21]])));
        }
        return lllllllllllllIlIlIIlIIIIIIIllIll;
    }
    
    private static void lIllIIllIIIllII() {
        (lIIIIIIIlIlIll = new int[36])[0] = ((0xDB ^ 0x92) & ~(0xEA ^ 0xA3));
        Layer.lIIIIIIIlIlIll[1] = " ".length();
        Layer.lIIIIIIIlIlIll[2] = "  ".length();
        Layer.lIIIIIIIlIlIll[3] = "   ".length();
        Layer.lIIIIIIIlIlIll[4] = (0x6B ^ 0x6F);
        Layer.lIIIIIIIlIlIll[5] = (0x8C ^ 0x89);
        Layer.lIIIIIIIlIlIll[6] = (0x6 ^ 0x0);
        Layer.lIIIIIIIlIlIll[7] = (0x24 ^ 0x23);
        Layer.lIIIIIIIlIlIll[8] = (0x5 ^ 0x6E ^ (0x3 ^ 0x60));
        Layer.lIIIIIIIlIlIll[9] = (0x47 ^ 0x60 ^ (0xB1 ^ 0x9F));
        Layer.lIIIIIIIlIlIll[10] = (0x2C ^ 0x45 ^ (0x55 ^ 0x36));
        Layer.lIIIIIIIlIlIll[11] = (112 + 95 - 171 + 171 ^ 177 + 107 - 182 + 94);
        Layer.lIIIIIIIlIlIll[12] = (0x3C ^ 0x2C);
        Layer.lIIIIIIIlIlIll[13] = (0x1A ^ 0x2);
        Layer.lIIIIIIIlIlIll[14] = -" ".length();
        Layer.lIIIIIIIlIlIll[15] = (0x2B ^ 0x72 ^ (0xC1 ^ 0x94));
        Layer.lIIIIIIIlIlIll[16] = (0x9 ^ 0x4);
        Layer.lIIIIIIIlIlIll[17] = (0xBA ^ 0x8B ^ (0x68 ^ 0x57));
        Layer.lIIIIIIIlIlIll[18] = (11 + 132 - 114 + 136 ^ 4 + 107 + 13 + 46);
        Layer.lIIIIIIIlIlIll[19] = 97 + 218 - 314 + 254;
        Layer.lIIIIIIIlIlIll[20] = (92 + 61 - 86 + 61 ^ 124 + 98 - 88 + 11);
        Layer.lIIIIIIIlIlIll[21] = (0xF8 ^ 0xA5 ^ (0xFB ^ 0xB4));
        Layer.lIIIIIIIlIlIll[22] = (0xFFFFF501 & 0xBFE);
        Layer.lIIIIIIIlIlIll[23] = (0x51 ^ 0x10);
        Layer.lIIIIIIIlIlIll[24] = (0x18 ^ 0x56 ^ (0xB0 ^ 0xA4));
        Layer.lIIIIIIIlIlIll[25] = (95 + 19 - 22 + 137 ^ 72 + 60 - 120 + 120);
        Layer.lIIIIIIIlIlIll[26] = (0x94 ^ 0x87 ^ (0x5E ^ 0x37));
        Layer.lIIIIIIIlIlIll[27] = (0xB6 ^ 0xAC);
        Layer.lIIIIIIIlIlIll[28] = (0x47 ^ 0x77);
        Layer.lIIIIIIIlIlIll[29] = (23 + 110 - 119 + 176 ^ 24 + 74 - 65 + 102);
        Layer.lIIIIIIIlIlIll[30] = (0xBD ^ 0x89);
        Layer.lIIIIIIIlIlIll[31] = (0x89 ^ 0xA2);
        Layer.lIIIIIIIlIlIll[32] = (83 + 64 - 42 + 65 ^ 98 + 89 - 39 + 0);
        Layer.lIIIIIIIlIlIll[33] = (0xB8 ^ 0x97);
        Layer.lIIIIIIIlIlIll[34] = (0xB3 ^ 0x8C);
        Layer.lIIIIIIIlIlIll[35] = (0xF ^ 0x4B ^ (0xE0 ^ 0xB7));
    }
    
    private static boolean lIllIIllIIlIlll(final int lllllllllllllIlIlIIIllllllIIIlII, final int lllllllllllllIlIlIIIllllllIIIIll) {
        return lllllllllllllIlIlIIIllllllIIIlII > lllllllllllllIlIlIIIllllllIIIIll;
    }
    
    private static boolean lIllIIllIIlIllI(final int lllllllllllllIlIlIIIllllllIIlIII, final int lllllllllllllIlIlIIIllllllIIIlll) {
        return lllllllllllllIlIlIIIllllllIIlIII <= lllllllllllllIlIlIIIllllllIIIlll;
    }
    
    private static boolean lIllIIllIIIlllI(final int lllllllllllllIlIlIIIllllllIIllII, final int lllllllllllllIlIlIIIllllllIIlIll) {
        return lllllllllllllIlIlIIIllllllIIllII < lllllllllllllIlIlIIIllllllIIlIll;
    }
    
    private static boolean lIllIIllIIIllIl(final Object lllllllllllllIlIlIIIllllllIIIIIl) {
        return lllllllllllllIlIlIIIllllllIIIIIl != null;
    }
    
    private static boolean lIllIIllIIllIII(final int lllllllllllllIlIlIIIlllllIllIlII, final int lllllllllllllIlIlIIIlllllIllIIll) {
        return lllllllllllllIlIlIIIlllllIllIlII != lllllllllllllIlIlIIIlllllIllIIll;
    }
    
    public void render(final int lllllllllllllIlIlIIlIIIIIIlllIlI, final int lllllllllllllIlIlIIlIIIIIlIIIIll, final int lllllllllllllIlIlIIlIIIIIIlllIII, final int lllllllllllllIlIlIIlIIIIIIllIlll, final int lllllllllllllIlIlIIlIIIIIIllIllI, final int lllllllllllllIlIlIIlIIIIIIllllll, final boolean lllllllllllllIlIlIIlIIIIIIlllllI, final int lllllllllllllIlIlIIlIIIIIIllllIl, final int lllllllllllllIlIlIIlIIIIIIllllII) {
        int lllllllllllllIlIlIIlIIIIIlIIIllI = Layer.lIIIIIIIlIlIll[0];
        while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIIlIIIllI, this.map.getTileSetCount())) {
            TileSet lllllllllllllIlIlIIlIIIIIlIIIlll = null;
            int lllllllllllllIlIlIIlIIIIIlIIlIII = Layer.lIIIIIIIlIlIll[0];
            while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIIlIIlIII, lllllllllllllIlIlIIlIIIIIIllIllI)) {
                if (lIllIIllIIlIIIl(lllllllllllllIlIlIIlIIIIIIlllIII + lllllllllllllIlIlIIlIIIIIlIIlIII)) {
                    if (lIllIIllIIlIIlI(lllllllllllllIlIlIIlIIIIIIllIlll + lllllllllllllIlIlIIlIIIIIIllllll)) {
                        "".length();
                        if (" ".length() >= (0x21 ^ 0x25)) {
                            return;
                        }
                    }
                    else if (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIIIlllIII + lllllllllllllIlIlIIlIIIIIlIIlIII, this.width)) {
                        if (lIllIIllIIlIIll(lllllllllllllIlIlIIlIIIIIIllIlll + lllllllllllllIlIlIIlIIIIIIllllll, this.height)) {
                            "".length();
                            if ((0x65 ^ 0x60) <= 0) {
                                return;
                            }
                        }
                        else if (lIllIIllIIlIlII(this.data[lllllllllllllIlIlIIlIIIIIIlllIII + lllllllllllllIlIlIIlIIIIIlIIlIII][lllllllllllllIlIlIIlIIIIIIllIlll + lllllllllllllIlIlIIlIIIIIIllllll][Layer.lIIIIIIIlIlIll[0]], lllllllllllllIlIlIIlIIIIIlIIIllI)) {
                            if (lIllIIllIIlIlIl(lllllllllllllIlIlIIlIIIIIlIIIlll)) {
                                lllllllllllllIlIlIIlIIIIIlIIIlll = this.map.getTileSet(lllllllllllllIlIlIIlIIIIIlIIIllI);
                                lllllllllllllIlIlIIlIIIIIlIIIlll.tiles.startUse();
                            }
                            final int lllllllllllllIlIlIIlIIIIIlIIlIll = lllllllllllllIlIlIIlIIIIIlIIIlll.getTileX(this.data[lllllllllllllIlIlIIlIIIIIIlllIII + lllllllllllllIlIlIIlIIIIIlIIlIII][lllllllllllllIlIlIIlIIIIIIllIlll + lllllllllllllIlIlIIlIIIIIIllllll][Layer.lIIIIIIIlIlIll[1]]);
                            final int lllllllllllllIlIlIIlIIIIIlIIlIlI = lllllllllllllIlIlIIlIIIIIlIIIlll.getTileY(this.data[lllllllllllllIlIlIIlIIIIIIlllIII + lllllllllllllIlIlIIlIIIIIlIIlIII][lllllllllllllIlIlIIlIIIIIIllIlll + lllllllllllllIlIlIIlIIIIIIllllll][Layer.lIIIIIIIlIlIll[1]]);
                            final int lllllllllllllIlIlIIlIIIIIlIIlIIl = lllllllllllllIlIlIIlIIIIIlIIIlll.tileHeight - lllllllllllllIlIlIIlIIIIIIllllII;
                            lllllllllllllIlIlIIlIIIIIlIIIlll.tiles.renderInUse(lllllllllllllIlIlIIlIIIIIIlllIlI + lllllllllllllIlIlIIlIIIIIlIIlIII * lllllllllllllIlIlIIlIIIIIIllllIl, lllllllllllllIlIlIIlIIIIIlIIIIll + lllllllllllllIlIlIIlIIIIIIllllll * lllllllllllllIlIlIIlIIIIIIllllII - lllllllllllllIlIlIIlIIIIIlIIlIIl, lllllllllllllIlIlIIlIIIIIlIIlIll, lllllllllllllIlIlIIlIIIIIlIIlIlI);
                        }
                    }
                }
                ++lllllllllllllIlIlIIlIIIIIlIIlIII;
                "".length();
                if (((0x96 ^ 0xB6 ^ (0x67 ^ 0x1A)) & (129 + 55 - 132 + 157 ^ 37 + 1 - 28 + 130 ^ -" ".length())) >= " ".length()) {
                    return;
                }
            }
            if (lIllIIllIIIllll(lllllllllllllIlIlIIlIIIIIIlllllI ? 1 : 0)) {
                if (lIllIIllIIIllIl(lllllllllllllIlIlIIlIIIIIlIIIlll)) {
                    lllllllllllllIlIlIIlIIIIIlIIIlll.tiles.endUse();
                    lllllllllllllIlIlIIlIIIIIlIIIlll = null;
                }
                this.map.renderedLine(lllllllllllllIlIlIIlIIIIIIllllll, lllllllllllllIlIlIIlIIIIIIllllll + lllllllllllllIlIlIIlIIIIIIllIlll, this.index);
            }
            if (lIllIIllIIIllIl(lllllllllllllIlIlIIlIIIIIlIIIlll)) {
                lllllllllllllIlIlIIlIIIIIlIIIlll.tiles.endUse();
            }
            ++lllllllllllllIlIlIIlIIIIIlIIIllI;
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
    }
    
    public int getTileID(final int lllllllllllllIlIlIIlIIIIIllIllII, final int lllllllllllllIlIlIIlIIIIIllIlllI) {
        return this.data[lllllllllllllIlIlIIlIIIIIllIllII][lllllllllllllIlIlIIlIIIIIllIlllI][Layer.lIIIIIIIlIlIll[2]];
    }
    
    static {
        lIllIIllIIIllII();
        lIllIIlIIIlIIll();
        Layer.baseCodes = new byte[Layer.lIIIIIIIlIlIll[22]];
        int lllllllllllllIlIlIIlIIIIIIIIllIl = Layer.lIIIIIIIlIlIll[0];
        while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIIIIIllIl, Layer.lIIIIIIIlIlIll[22])) {
            Layer.baseCodes[lllllllllllllIlIlIIlIIIIIIIIllIl] = (byte)Layer.lIIIIIIIlIlIll[14];
            ++lllllllllllllIlIlIIlIIIIIIIIllIl;
            "".length();
            if ((0xF ^ 0xB) != (0x42 ^ 0x46)) {
                return;
            }
        }
        int lllllllllllllIlIlIIlIIIIIIIIllII = Layer.lIIIIIIIlIlIll[23];
        while (lIllIIllIIlIllI(lllllllllllllIlIlIIlIIIIIIIIllII, Layer.lIIIIIIIlIlIll[24])) {
            Layer.baseCodes[lllllllllllllIlIlIIlIIIIIIIIllII] = (byte)(lllllllllllllIlIlIIlIIIIIIIIllII - Layer.lIIIIIIIlIlIll[23]);
            ++lllllllllllllIlIlIIlIIIIIIIIllII;
            "".length();
            if (-" ".length() == (0xB0 ^ 0xB4)) {
                return;
            }
        }
        int lllllllllllllIlIlIIlIIIIIIIIlIll = Layer.lIIIIIIIlIlIll[25];
        while (lIllIIllIIlIllI(lllllllllllllIlIlIIlIIIIIIIIlIll, Layer.lIIIIIIIlIlIll[26])) {
            Layer.baseCodes[lllllllllllllIlIlIIlIIIIIIIIlIll] = (byte)(Layer.lIIIIIIIlIlIll[27] + lllllllllllllIlIlIIlIIIIIIIIlIll - Layer.lIIIIIIIlIlIll[25]);
            ++lllllllllllllIlIlIIlIIIIIIIIlIll;
            "".length();
            if (((1 + 95 + 28 + 47 ^ 77 + 13 - 83 + 184) & (0x13 ^ 0x65 ^ (0xDC ^ 0xBE) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        int lllllllllllllIlIlIIlIIIIIIIIlIlI = Layer.lIIIIIIIlIlIll[28];
        while (lIllIIllIIlIllI(lllllllllllllIlIlIIlIIIIIIIIlIlI, Layer.lIIIIIIIlIlIll[29])) {
            Layer.baseCodes[lllllllllllllIlIlIIlIIIIIIIIlIlI] = (byte)(Layer.lIIIIIIIlIlIll[30] + lllllllllllllIlIlIIlIIIIIIIIlIlI - Layer.lIIIIIIIlIlIll[28]);
            ++lllllllllllllIlIlIIlIIIIIIIIlIlI;
            "".length();
            if (" ".length() <= ((0x1F ^ 0x7F) & ~(0x3F ^ 0x5F))) {
                return;
            }
        }
        Layer.baseCodes[Layer.lIIIIIIIlIlIll[31]] = (byte)Layer.lIIIIIIIlIlIll[32];
        Layer.baseCodes[Layer.lIIIIIIIlIlIll[33]] = (byte)Layer.lIIIIIIIlIlIll[34];
    }
    
    public Layer(final TiledMap lllllllllllllIlIlIIlIIIIlIIIIIIl, final Element lllllllllllllIlIlIIlIIIIlIIIIlll) throws SlickException {
        this.map = lllllllllllllIlIlIIlIIIIlIIIIIIl;
        this.name = lllllllllllllIlIlIIlIIIIlIIIIlll.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[0]]);
        this.width = Integer.parseInt(lllllllllllllIlIlIIlIIIIlIIIIlll.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[1]]));
        this.height = Integer.parseInt(lllllllllllllIlIlIIlIIIIlIIIIlll.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[2]]));
        this.data = new int[this.width][this.height][Layer.lIIIIIIIlIlIll[3]];
        final Element lllllllllllllIlIlIIlIIIIlIIIIllI = (Element)lllllllllllllIlIlIIlIIIIlIIIIlll.getElementsByTagName(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[3]]).item(Layer.lIIIIIIIlIlIll[0]);
        if (lIllIIllIIIllIl(lllllllllllllIlIlIIlIIIIlIIIIllI)) {
            final NodeList lllllllllllllIlIlIIlIIIIlIIlIIll = lllllllllllllIlIlIIlIIIIlIIIIllI.getElementsByTagName(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[4]]);
            if (lIllIIllIIIllIl(lllllllllllllIlIlIIlIIIIlIIlIIll)) {
                this.props = new Properties();
                int lllllllllllllIlIlIIlIIIIlIIlIlII = Layer.lIIIIIIIlIlIll[0];
                while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIlIIlIlII, lllllllllllllIlIlIIlIIIIlIIlIIll.getLength())) {
                    final Element lllllllllllllIlIlIIlIIIIlIIlIlll = (Element)lllllllllllllIlIlIIlIIIIlIIlIIll.item(lllllllllllllIlIlIIlIIIIlIIlIlII);
                    final String lllllllllllllIlIlIIlIIIIlIIlIllI = lllllllllllllIlIlIIlIIIIlIIlIlll.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[5]]);
                    final String lllllllllllllIlIlIIlIIIIlIIlIlIl = lllllllllllllIlIlIIlIIIIlIIlIlll.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[6]]);
                    this.props.setProperty(lllllllllllllIlIlIIlIIIIlIIlIllI, lllllllllllllIlIlIIlIIIIlIIlIlIl);
                    "".length();
                    ++lllllllllllllIlIlIIlIIIIlIIlIlII;
                    "".length();
                    if ((0x6F ^ 0x6B) != (0x78 ^ 0x7C)) {
                        throw null;
                    }
                }
            }
        }
        final Element lllllllllllllIlIlIIlIIIIlIIIIlIl = (Element)lllllllllllllIlIlIIlIIIIlIIIIlll.getElementsByTagName(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[7]]).item(Layer.lIIIIIIIlIlIll[0]);
        final String lllllllllllllIlIlIIlIIIIlIIIIlII = lllllllllllllIlIlIIlIIIIlIIIIlIl.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[8]]);
        final String lllllllllllllIlIlIIlIIIIlIIIIIll = lllllllllllllIlIlIIlIIIIlIIIIlIl.getAttribute(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[9]]);
        if (lIllIIllIIIllll(lllllllllllllIlIlIIlIIIIlIIIIlII.equals(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[10]]) ? 1 : 0) && lIllIIllIIIllll(lllllllllllllIlIlIIlIIIIlIIIIIll.equals(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[11]]) ? 1 : 0)) {
            try {
                final Node lllllllllllllIlIlIIlIIIIlIIIlllI = lllllllllllllIlIlIIlIIIIlIIIIlIl.getFirstChild();
                final char[] lllllllllllllIlIlIIlIIIIlIIIllIl = lllllllllllllIlIlIIlIIIIlIIIlllI.getNodeValue().trim().toCharArray();
                final byte[] lllllllllllllIlIlIIlIIIIlIIIllII = this.decodeBase64(lllllllllllllIlIlIIlIIIIlIIIllIl);
                final GZIPInputStream lllllllllllllIlIlIIlIIIIlIIIlIll = new GZIPInputStream(new ByteArrayInputStream(lllllllllllllIlIlIIlIIIIlIIIllII));
                int lllllllllllllIlIlIIlIIIIlIIIllll = Layer.lIIIIIIIlIlIll[0];
                while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIlIIIllll, this.height)) {
                    int lllllllllllllIlIlIIlIIIIlIIlIIII = Layer.lIIIIIIIlIlIll[0];
                    while (lIllIIllIIIlllI(lllllllllllllIlIlIIlIIIIlIIlIIII, this.width)) {
                        int lllllllllllllIlIlIIlIIIIlIIlIIIl = Layer.lIIIIIIIlIlIll[0];
                        lllllllllllllIlIlIIlIIIIlIIlIIIl |= lllllllllllllIlIlIIlIIIIlIIIlIll.read();
                        lllllllllllllIlIlIIlIIIIlIIlIIIl |= lllllllllllllIlIlIIlIIIIlIIIlIll.read() << Layer.lIIIIIIIlIlIll[8];
                        lllllllllllllIlIlIIlIIIIlIIlIIIl |= lllllllllllllIlIlIIlIIIIlIIIlIll.read() << Layer.lIIIIIIIlIlIll[12];
                        lllllllllllllIlIlIIlIIIIlIIlIIIl |= lllllllllllllIlIlIIlIIIIlIIIlIll.read() << Layer.lIIIIIIIlIlIll[13];
                        if (lIllIIllIIlIIII(lllllllllllllIlIlIIlIIIIlIIlIIIl)) {
                            this.data[lllllllllllllIlIlIIlIIIIlIIlIIII][lllllllllllllIlIlIIlIIIIlIIIllll][Layer.lIIIIIIIlIlIll[0]] = Layer.lIIIIIIIlIlIll[14];
                            this.data[lllllllllllllIlIlIIlIIIIlIIlIIII][lllllllllllllIlIlIIlIIIIlIIIllll][Layer.lIIIIIIIlIlIll[1]] = Layer.lIIIIIIIlIlIll[0];
                            this.data[lllllllllllllIlIlIIlIIIIlIIlIIII][lllllllllllllIlIlIIlIIIIlIIIllll][Layer.lIIIIIIIlIlIll[2]] = Layer.lIIIIIIIlIlIll[0];
                            "".length();
                            if (-"  ".length() > 0) {
                                throw null;
                            }
                        }
                        else {
                            final TileSet lllllllllllllIlIlIIlIIIIlIIlIIlI = lllllllllllllIlIlIIlIIIIlIIIIIIl.findTileSet(lllllllllllllIlIlIIlIIIIlIIlIIIl);
                            if (lIllIIllIIIllIl(lllllllllllllIlIlIIlIIIIlIIlIIlI)) {
                                this.data[lllllllllllllIlIlIIlIIIIlIIlIIII][lllllllllllllIlIlIIlIIIIlIIIllll][Layer.lIIIIIIIlIlIll[0]] = lllllllllllllIlIlIIlIIIIlIIlIIlI.index;
                                this.data[lllllllllllllIlIlIIlIIIIlIIlIIII][lllllllllllllIlIlIIlIIIIlIIIllll][Layer.lIIIIIIIlIlIll[1]] = lllllllllllllIlIlIIlIIIIlIIlIIIl - lllllllllllllIlIlIIlIIIIlIIlIIlI.firstGID;
                            }
                            this.data[lllllllllllllIlIlIIlIIIIlIIlIIII][lllllllllllllIlIlIIlIIIIlIIIllll][Layer.lIIIIIIIlIlIll[2]] = lllllllllllllIlIlIIlIIIIlIIlIIIl;
                        }
                        ++lllllllllllllIlIlIIlIIIIlIIlIIII;
                        "".length();
                        if ((0xA2 ^ 0xA6) < (0x8 ^ 0xC)) {
                            throw null;
                        }
                    }
                    ++lllllllllllllIlIlIIlIIIIlIIIllll;
                    "".length();
                    if (((0xE2 ^ 0xBD) & ~(0xF7 ^ 0xA8)) != 0x0) {
                        throw null;
                    }
                }
                "".length();
                if (-"   ".length() > 0) {
                    throw null;
                }
                return;
            }
            catch (IOException lllllllllllllIlIlIIlIIIIlIIIlIlI) {
                Log.error(lllllllllllllIlIlIIlIIIIlIIIlIlI);
                throw new SlickException(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[15]]);
            }
            throw new SlickException(String.valueOf(new StringBuilder().append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[16]]).append(lllllllllllllIlIlIIlIIIIlIIIIlII).append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[17]]).append(lllllllllllllIlIlIIlIIIIlIIIIIll).append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[18]])));
        }
        throw new SlickException(String.valueOf(new StringBuilder().append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[16]]).append(lllllllllllllIlIlIIlIIIIlIIIIlII).append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[17]]).append(lllllllllllllIlIlIIlIIIIlIIIIIll).append(Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[18]])));
    }
    
    private static void lIllIIlIIIlIIll() {
        (lllllllllIlII = new String[Layer.lIIIIIIIlIlIll[35]])[Layer.lIIIIIIIlIlIll[0]] = lIllIIlIIIIllIl("PGjNB+bi1Kk=", "ZHwta");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[1]] = lIllIIlIIIIllIl("1vQIDMoa2n4=", "LmcYs");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[2]] = lIllIIlIIIIllIl("LzWuItUtstI=", "kLMyY");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[3]] = lIllIIlIIIIlllI("AzE/PB0BNzkpCw==", "sCPLx");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[4]] = lIllIIlIIIIlllI("OB8uJjw6GTg=", "HmAVY");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[5]] = lIllIIlIIIIllll("+uOUcKb+b7Q=", "Ofwiw");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[6]] = lIllIIlIIIIllll("F6I/qPLUc8g=", "aqeIT");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[7]] = lIllIIlIIIIlllI("EQ0xJw==", "ulEFY");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[8]] = lIllIIlIIIIllll("GWaLSW8EadG71/1LtD6S9Q==", "cgJwV");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[9]] = lIllIIlIIIIllIl("M14iKWCRLWUDsS2NIicJ7Q==", "iGZxw");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[10]] = lIllIIlIIIIlllI("FikREX5A", "tHbtH");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[11]] = lIllIIlIIIIllIl("dgSsE2bMfnM=", "ZzkIk");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[15]] = lIllIIlIIIIllIl("pJFwPHGFW/ny4u2Vd6Gbf+DV5ZJbHNb2ywg+q1mj6PQ=", "RFfJX");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[16]] = lIllIIlIIIIlllI("LSwFMz0ILQQybQwrGiMpWC8XNm0MOwYjd1g=", "xBvFM");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[17]] = lIllIIlIIIIllll("X0K6NdGXQUQ=", "vOkzb");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[18]] = lIllIIlIIIIlllI("aUw3KBgwRD88HTlEOicHLFJsZgc8FCgpBj0BPG8=", "IdXFt");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[12]] = lIllIIlIIIIlllI("HisWA3E2LwwFJTJqAxIhPysQEXEuJUIANHo9EA0/PWpKFSM1PgdC", "ZJbbQ");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[20]] = lIllIIlIIIIlllI("ejU6NSU2InI4NXo=", "ZFRZP");
        Layer.lllllllllIlII[Layer.lIIIIIIIlIlIll[21]] = lIllIIlIIIIllIl("Z0fe7GY3ZBs=", "MJWNG");
    }
    
    private static boolean lIllIIllIIlIIlI(final int lllllllllllllIlIlIIIlllllIllIlll) {
        return lllllllllllllIlIlIIIlllllIllIlll < 0;
    }
    
    private static boolean lIllIIllIIlIIll(final int lllllllllllllIlIlIIIllllllIlIIII, final int lllllllllllllIlIlIIIllllllIIllll) {
        return lllllllllllllIlIlIIIllllllIlIIII >= lllllllllllllIlIlIIIllllllIIllll;
    }
    
    private static boolean lIllIIllIIlIIIl(final int lllllllllllllIlIlIIIlllllIlllIIl) {
        return lllllllllllllIlIlIIIlllllIlllIIl >= 0;
    }
    
    private static boolean lIllIIllIIlIIII(final int lllllllllllllIlIlIIIlllllIlllIll) {
        return lllllllllllllIlIlIIIlllllIlllIll == 0;
    }
    
    private static boolean lIllIIllIIIllll(final int lllllllllllllIlIlIIIlllllIllllIl) {
        return lllllllllllllIlIlIIIlllllIllllIl != 0;
    }
    
    private static boolean lIllIIllIIlIlIl(final Object lllllllllllllIlIlIIIlllllIllllll) {
        return lllllllllllllIlIlIIIlllllIllllll == null;
    }
    
    private static boolean lIllIIllIIlIlII(final int lllllllllllllIlIlIIIllllllIlIlII, final int lllllllllllllIlIlIIIllllllIlIIll) {
        return lllllllllllllIlIlIIIllllllIlIlII == lllllllllllllIlIlIIIllllllIlIIll;
    }
    
    private static String lIllIIlIIIIllIl(final String lllllllllllllIlIlIIIllllllIlllII, final String lllllllllllllIlIlIIIllllllIllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIllllllIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIllllllIllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIllllllIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIllllllIllllI.init(Layer.lIIIIIIIlIlIll[2], lllllllllllllIlIlIIIllllllIlllll);
            return new String(lllllllllllllIlIlIIIllllllIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIllllllIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIllllllIlllIl) {
            lllllllllllllIlIlIIIllllllIlllIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIllIIlIIIIlllI(String lllllllllllllIlIlIIIlllllllIllII, final String lllllllllllllIlIlIIIlllllllIlIll) {
        lllllllllllllIlIlIIIlllllllIllII = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIIlllllllIllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIIlllllllIllll = new StringBuilder();
        final char[] lllllllllllllIlIlIIIlllllllIlllI = lllllllllllllIlIlIIIlllllllIlIll.toCharArray();
        int lllllllllllllIlIlIIIlllllllIllIl = Layer.lIIIIIIIlIlIll[0];
        final String lllllllllllllIlIlIIIlllllllIIlll = (Object)lllllllllllllIlIlIIIlllllllIllII.toCharArray();
        final Exception lllllllllllllIlIlIIIlllllllIIllI = (Exception)lllllllllllllIlIlIIIlllllllIIlll.length;
        float lllllllllllllIlIlIIIlllllllIIlIl = Layer.lIIIIIIIlIlIll[0];
        while (lIllIIllIIIlllI((int)lllllllllllllIlIlIIIlllllllIIlIl, (int)lllllllllllllIlIlIIIlllllllIIllI)) {
            final char lllllllllllllIlIlIIIllllllllIIlI = lllllllllllllIlIlIIIlllllllIIlll[lllllllllllllIlIlIIIlllllllIIlIl];
            lllllllllllllIlIlIIIlllllllIllll.append((char)(lllllllllllllIlIlIIIllllllllIIlI ^ lllllllllllllIlIlIIIlllllllIlllI[lllllllllllllIlIlIIIlllllllIllIl % lllllllllllllIlIlIIIlllllllIlllI.length]));
            "".length();
            ++lllllllllllllIlIlIIIlllllllIllIl;
            ++lllllllllllllIlIlIIIlllllllIIlIl;
            "".length();
            if (" ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIIlllllllIllll);
    }
    
    private static String lIllIIlIIIIllll(final String lllllllllllllIlIlIIIllllllllllll, final String lllllllllllllIlIlIIlIIIIIIIIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIlIIIIIIIIIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIlIIIIIIIIIIII.getBytes(StandardCharsets.UTF_8)), Layer.lIIIIIIIlIlIll[8]), "DES");
            final Cipher lllllllllllllIlIlIIlIIIIIIIIIIll = Cipher.getInstance("DES");
            lllllllllllllIlIlIIlIIIIIIIIIIll.init(Layer.lIIIIIIIlIlIll[2], lllllllllllllIlIlIIlIIIIIIIIIlII);
            return new String(lllllllllllllIlIlIIlIIIIIIIIIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIllllllllllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIlIIIIIIIIIIlI) {
            lllllllllllllIlIlIIlIIIIIIIIIIlI.printStackTrace();
            return null;
        }
    }
    
    public void setTileID(final int lllllllllllllIlIlIIlIIIIIlIlllll, final int lllllllllllllIlIlIIlIIIIIlIllllI, final int lllllllllllllIlIlIIlIIIIIllIIIIl) {
        if (lIllIIllIIlIIII(lllllllllllllIlIlIIlIIIIIllIIIIl)) {
            this.data[lllllllllllllIlIlIIlIIIIIlIlllll][lllllllllllllIlIlIIlIIIIIlIllllI][Layer.lIIIIIIIlIlIll[0]] = Layer.lIIIIIIIlIlIll[14];
            this.data[lllllllllllllIlIlIIlIIIIIlIlllll][lllllllllllllIlIlIIlIIIIIlIllllI][Layer.lIIIIIIIlIlIll[1]] = Layer.lIIIIIIIlIlIll[0];
            this.data[lllllllllllllIlIlIIlIIIIIlIlllll][lllllllllllllIlIlIIlIIIIIlIllllI][Layer.lIIIIIIIlIlIll[2]] = Layer.lIIIIIIIlIlIll[0];
            "".length();
            if ((0x9C ^ 0xAA ^ (0x38 ^ 0xA)) <= 0) {
                return;
            }
        }
        else {
            final TileSet lllllllllllllIlIlIIlIIIIIllIIlIl = this.map.findTileSet(lllllllllllllIlIlIIlIIIIIllIIIIl);
            this.data[lllllllllllllIlIlIIlIIIIIlIlllll][lllllllllllllIlIlIIlIIIIIlIllllI][Layer.lIIIIIIIlIlIll[0]] = lllllllllllllIlIlIIlIIIIIllIIlIl.index;
            this.data[lllllllllllllIlIlIIlIIIIIlIlllll][lllllllllllllIlIlIIlIIIIIlIllllI][Layer.lIIIIIIIlIlIll[1]] = lllllllllllllIlIlIIlIIIIIllIIIIl - lllllllllllllIlIlIIlIIIIIllIIlIl.firstGID;
            this.data[lllllllllllllIlIlIIlIIIIIlIlllll][lllllllllllllIlIlIIlIIIIIlIllllI][Layer.lIIIIIIIlIlIll[2]] = lllllllllllllIlIlIIlIIIIIllIIIIl;
        }
    }
}
