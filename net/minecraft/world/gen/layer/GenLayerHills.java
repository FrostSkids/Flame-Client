// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import net.minecraft.world.biome.BiomeGenBase;
import org.apache.logging.log4j.Logger;

public class GenLayerHills extends GenLayer
{
    private /* synthetic */ GenLayer field_151628_d;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] lllIIlIllIIlII;
    private static final /* synthetic */ int[] lllIIlIllIIlIl;
    
    private static boolean lIIlllllllIlIIIl(final Object llllllllllllIlIllllIIllIIIllIlll) {
        return llllllllllllIlIllllIIllIIIllIlll != null;
    }
    
    @Override
    public int[] getInts(final int llllllllllllIlIllllIIllIIllllIll, final int llllllllllllIlIllllIIllIIllllIlI, final int llllllllllllIlIllllIIllIIllIIlIl, final int llllllllllllIlIllllIIllIIllIIlII) {
        final int[] llllllllllllIlIllllIIllIIlllIlll = this.parent.getInts(llllllllllllIlIllllIIllIIllllIll - GenLayerHills.lllIIlIllIIlIl[0], llllllllllllIlIllllIIllIIllllIlI - GenLayerHills.lllIIlIllIIlIl[0], llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1], llllllllllllIlIllllIIllIIllIIlII + GenLayerHills.lllIIlIllIIlIl[1]);
        final int[] llllllllllllIlIllllIIllIIlllIllI = this.field_151628_d.getInts(llllllllllllIlIllllIIllIIllllIll - GenLayerHills.lllIIlIllIIlIl[0], llllllllllllIlIllllIIllIIllllIlI - GenLayerHills.lllIIlIllIIlIl[0], llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1], llllllllllllIlIllllIIllIIllIIlII + GenLayerHills.lllIIlIllIIlIl[1]);
        final int[] llllllllllllIlIllllIIllIIlllIlIl = IntCache.getIntCache(llllllllllllIlIllllIIllIIllIIlIl * llllllllllllIlIllllIIllIIllIIlII);
        int llllllllllllIlIllllIIllIIlllIlII = GenLayerHills.lllIIlIllIIlIl[2];
        "".length();
        if ("  ".length() != "  ".length()) {
            return null;
        }
        while (!lIIlllllllIIllIl(llllllllllllIlIllllIIllIIlllIlII, llllllllllllIlIllllIIllIIllIIlII)) {
            int llllllllllllIlIllllIIllIIlllIIll = GenLayerHills.lllIIlIllIIlIl[2];
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
            while (!lIIlllllllIIllIl(llllllllllllIlIllllIIllIIlllIIll, llllllllllllIlIllllIIllIIllIIlIl)) {
                this.initChunkSeed(llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIllllIll, llllllllllllIlIllllIIllIIlllIlII + llllllllllllIlIllllIIllIIllllIlI);
                final int llllllllllllIlIllllIIllIIlllIIlI = llllllllllllIlIllllIIllIIlllIlll[llllllllllllIlIllllIIllIIlllIIll + GenLayerHills.lllIIlIllIIlIl[0] + (llllllllllllIlIllllIIllIIlllIlII + GenLayerHills.lllIIlIllIIlIl[0]) * (llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1])];
                final int llllllllllllIlIllllIIllIIlllIIIl = llllllllllllIlIllllIIllIIlllIllI[llllllllllllIlIllllIIllIIlllIIll + GenLayerHills.lllIIlIllIIlIl[0] + (llllllllllllIlIllllIIllIIlllIlII + GenLayerHills.lllIIlIllIIlIl[0]) * (llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1])];
                int n;
                if (lIIlllllllIIlIIl((llllllllllllIlIllllIIllIIlllIIIl - GenLayerHills.lllIIlIllIIlIl[1]) % GenLayerHills.lllIIlIllIIlIl[3])) {
                    n = GenLayerHills.lllIIlIllIIlIl[0];
                    "".length();
                    if ("  ".length() <= ((0x1C ^ 0x60 ^ (0x31 ^ 0x73)) & (0x29 ^ 0x22 ^ (0x26 ^ 0x13) ^ -" ".length()))) {
                        return null;
                    }
                }
                else {
                    n = GenLayerHills.lllIIlIllIIlIl[2];
                }
                final boolean llllllllllllIlIllllIIllIIlllIIII = n != 0;
                if (lIIlllllllIIlIll(llllllllllllIlIllllIIllIIlllIIlI, GenLayerHills.lllIIlIllIIlIl[4])) {
                    GenLayerHills.logger.debug(String.valueOf(new StringBuilder(GenLayerHills.lllIIlIllIIlII[GenLayerHills.lllIIlIllIIlIl[2]]).append(llllllllllllIlIllllIIllIIlllIIlI)));
                }
                if (lIIlllllllIIllII(llllllllllllIlIllllIIllIIlllIIlI) && lIIlllllllIIllIl(llllllllllllIlIllllIIllIIlllIIIl, GenLayerHills.lllIIlIllIIlIl[1]) && lIIlllllllIIlllI((llllllllllllIlIllllIIllIIlllIIIl - GenLayerHills.lllIIlIllIIlIl[1]) % GenLayerHills.lllIIlIllIIlIl[3], GenLayerHills.lllIIlIllIIlIl[0]) && lIIlllllllIIllll(llllllllllllIlIllllIIllIIlllIIlI, GenLayerHills.lllIIlIllIIlIl[5])) {
                    if (lIIlllllllIlIIIl(BiomeGenBase.getBiome(llllllllllllIlIllllIIllIIlllIIlI + GenLayerHills.lllIIlIllIIlIl[5]))) {
                        llllllllllllIlIllllIIllIIlllIlIl[llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIlllIlII * llllllllllllIlIllllIIllIIllIIlIl] = llllllllllllIlIllllIIllIIlllIIlI + GenLayerHills.lllIIlIllIIlIl[5];
                        "".length();
                        if (-" ".length() >= 0) {
                            return null;
                        }
                    }
                    else {
                        llllllllllllIlIllllIIllIIlllIlIl[llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIlllIlII * llllllllllllIlIllllIIllIIllIIlIl] = llllllllllllIlIllllIIllIIlllIIlI;
                        "".length();
                        if (-(0xDD ^ 0xAA ^ (0x3 ^ 0x71)) >= 0) {
                            return null;
                        }
                    }
                }
                else if (lIIlllllllIIllII(this.nextInt(GenLayerHills.lllIIlIllIIlIl[6])) && lIIlllllllIIlIIl(llllllllllllIlIllllIIllIIlllIIII ? 1 : 0)) {
                    llllllllllllIlIllllIIllIIlllIlIl[llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIlllIlII * llllllllllllIlIllllIIllIIllIIlIl] = llllllllllllIlIllllIIllIIlllIIlI;
                    "".length();
                    if ("  ".length() <= 0) {
                        return null;
                    }
                }
                else {
                    int llllllllllllIlIllllIIllIIllIllll = llllllllllllIlIllllIIllIIlllIIlI;
                    if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.desert.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.desertHills.biomeID;
                        "".length();
                        if (((0x8B ^ 0xA1) & ~(0x85 ^ 0xAF)) != 0x0) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.forest.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.forestHills.biomeID;
                        "".length();
                        if (((0x65 ^ 0x1D ^ (0x13 ^ 0x53)) & (0x8B ^ 0xB4 ^ (0xA2 ^ 0xA5) ^ -" ".length())) >= (0x81 ^ 0xC1 ^ (0xCC ^ 0x88))) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.birchForest.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.birchForestHills.biomeID;
                        "".length();
                        if (-" ".length() == "   ".length()) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.roofedForest.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.plains.biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.taiga.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.taigaHills.biomeID;
                        "".length();
                        if ((0xA ^ 0xF) == 0x0) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.megaTaiga.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.megaTaigaHills.biomeID;
                        "".length();
                        if ("   ".length() <= -" ".length()) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.coldTaiga.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.coldTaigaHills.biomeID;
                        "".length();
                        if (((0xE ^ 0x55) & ~(0x7B ^ 0x20)) > " ".length()) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.plains.biomeID)) {
                        if (lIIlllllllIIlIIl(this.nextInt(GenLayerHills.lllIIlIllIIlIl[6]))) {
                            llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.forestHills.biomeID;
                            "".length();
                            if (null != null) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.forest.biomeID;
                            "".length();
                            if (((117 + 37 - 15 + 10 ^ 81 + 112 - 36 + 27) & (85 + 135 - 81 + 27 ^ 87 + 88 - 169 + 133 ^ -" ".length())) != 0x0) {
                                return null;
                            }
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.icePlains.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.iceMountains.biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.jungle.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.jungleHills.biomeID;
                        "".length();
                        if (-" ".length() != -" ".length()) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.ocean.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.deepOcean.biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.extremeHills.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.extremeHillsPlus.biomeID;
                        "".length();
                        if ("   ".length() == 0) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.savanna.biomeID)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.savannaPlateau.biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIllII(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.mesaPlateau_F.biomeID) ? 1 : 0)) {
                        llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.mesa.biomeID;
                        "".length();
                        if (-"  ".length() >= 0) {
                            return null;
                        }
                    }
                    else if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIlllIIlI, BiomeGenBase.deepOcean.biomeID) && lIIlllllllIIlIIl(this.nextInt(GenLayerHills.lllIIlIllIIlIl[6]))) {
                        final int llllllllllllIlIllllIIllIIllIlllI = this.nextInt(GenLayerHills.lllIIlIllIIlIl[1]);
                        if (lIIlllllllIIlIIl(llllllllllllIlIllllIIllIIllIlllI)) {
                            llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.plains.biomeID;
                            "".length();
                            if (" ".length() <= -" ".length()) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllllIIllIIllIllll = BiomeGenBase.forest.biomeID;
                        }
                    }
                    if (lIIlllllllIIllII(llllllllllllIlIllllIIllIIlllIIII ? 1 : 0) && lIIlllllllIlIlII(llllllllllllIlIllllIIllIIllIllll, llllllllllllIlIllllIIllIIlllIIlI)) {
                        if (lIIlllllllIlIIIl(BiomeGenBase.getBiome(llllllllllllIlIllllIIllIIllIllll + GenLayerHills.lllIIlIllIIlIl[5]))) {
                            llllllllllllIlIllllIIllIIllIllll += 128;
                            "".length();
                            if (((0x49 ^ 0x14) & ~(0x2A ^ 0x77)) < ((0xE0 ^ 0xB2) & ~(0x7D ^ 0x2F))) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllllIIllIIllIllll = llllllllllllIlIllllIIllIIlllIIlI;
                        }
                    }
                    if (lIIlllllllIIlllI(llllllllllllIlIllllIIllIIllIllll, llllllllllllIlIllllIIllIIlllIIlI)) {
                        llllllllllllIlIllllIIllIIlllIlIl[llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIlllIlII * llllllllllllIlIllllIIllIIllIIlIl] = llllllllllllIlIllllIIllIIlllIIlI;
                        "".length();
                        if ("  ".length() > "   ".length()) {
                            return null;
                        }
                    }
                    else {
                        final int llllllllllllIlIllllIIllIIllIllIl = llllllllllllIlIllllIIllIIlllIlll[llllllllllllIlIllllIIllIIlllIIll + GenLayerHills.lllIIlIllIIlIl[0] + (llllllllllllIlIllllIIllIIlllIlII + GenLayerHills.lllIIlIllIIlIl[0] - GenLayerHills.lllIIlIllIIlIl[0]) * (llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1])];
                        final int llllllllllllIlIllllIIllIIllIllII = llllllllllllIlIllllIIllIIlllIlll[llllllllllllIlIllllIIllIIlllIIll + GenLayerHills.lllIIlIllIIlIl[0] + GenLayerHills.lllIIlIllIIlIl[0] + (llllllllllllIlIllllIIllIIlllIlII + GenLayerHills.lllIIlIllIIlIl[0]) * (llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1])];
                        final int llllllllllllIlIllllIIllIIllIlIll = llllllllllllIlIllllIIllIIlllIlll[llllllllllllIlIllllIIllIIlllIIll + GenLayerHills.lllIIlIllIIlIl[0] - GenLayerHills.lllIIlIllIIlIl[0] + (llllllllllllIlIllllIIllIIlllIlII + GenLayerHills.lllIIlIllIIlIl[0]) * (llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1])];
                        final int llllllllllllIlIllllIIllIIllIlIlI = llllllllllllIlIllllIIllIIlllIlll[llllllllllllIlIllllIIllIIlllIIll + GenLayerHills.lllIIlIllIIlIl[0] + (llllllllllllIlIllllIIllIIlllIlII + GenLayerHills.lllIIlIllIIlIl[0] + GenLayerHills.lllIIlIllIIlIl[0]) * (llllllllllllIlIllllIIllIIllIIlIl + GenLayerHills.lllIIlIllIIlIl[1])];
                        int llllllllllllIlIllllIIllIIllIlIIl = GenLayerHills.lllIIlIllIIlIl[2];
                        if (lIIlllllllIIllII(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIlIllllIIllIIllIllIl, llllllllllllIlIllllIIllIIlllIIlI) ? 1 : 0)) {
                            ++llllllllllllIlIllllIIllIIllIlIIl;
                        }
                        if (lIIlllllllIIllII(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIlIllllIIllIIllIllII, llllllllllllIlIllllIIllIIlllIIlI) ? 1 : 0)) {
                            ++llllllllllllIlIllllIIllIIllIlIIl;
                        }
                        if (lIIlllllllIIllII(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIlIllllIIllIIllIlIll, llllllllllllIlIllllIIllIIlllIIlI) ? 1 : 0)) {
                            ++llllllllllllIlIllllIIllIIllIlIIl;
                        }
                        if (lIIlllllllIIllII(GenLayer.biomesEqualOrMesaPlateau(llllllllllllIlIllllIIllIIllIlIlI, llllllllllllIlIllllIIllIIlllIIlI) ? 1 : 0)) {
                            ++llllllllllllIlIllllIIllIIllIlIIl;
                        }
                        if (lIIlllllllIIllIl(llllllllllllIlIllllIIllIIllIlIIl, GenLayerHills.lllIIlIllIIlIl[6])) {
                            llllllllllllIlIllllIIllIIlllIlIl[llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIlllIlII * llllllllllllIlIllllIIllIIllIIlIl] = llllllllllllIlIllllIIllIIllIllll;
                            "".length();
                            if (((0x54 ^ 0x18 ^ (0xD9 ^ 0x92)) & (0x60 ^ 0x77 ^ (0x20 ^ 0x30) ^ -" ".length())) >= "  ".length()) {
                                return null;
                            }
                        }
                        else {
                            llllllllllllIlIllllIIllIIlllIlIl[llllllllllllIlIllllIIllIIlllIIll + llllllllllllIlIllllIIllIIlllIlII * llllllllllllIlIllllIIllIIllIIlIl] = llllllllllllIlIllllIIllIIlllIIlI;
                        }
                    }
                }
                ++llllllllllllIlIllllIIllIIlllIIll;
            }
            ++llllllllllllIlIllllIIllIIlllIlII;
        }
        return llllllllllllIlIllllIIllIIlllIlIl;
    }
    
    private static boolean lIIlllllllIIlIll(final int llllllllllllIlIllllIIllIIIlllIlI, final int llllllllllllIlIllllIIllIIIlllIIl) {
        return llllllllllllIlIllllIIllIIIlllIlI > llllllllllllIlIllllIIllIIIlllIIl;
    }
    
    private static void lIIlllllllIIIlll() {
        (lllIIlIllIIlII = new String[GenLayerHills.lllIIlIllIIlIl[0]])[GenLayerHills.lllIIlIllIIlIl[2]] = lIIlllllllIIIllI("gT8x4PrQm5w=", "ropgo");
    }
    
    private static boolean lIIlllllllIIlllI(final int llllllllllllIlIllllIIllIIlIIIllI, final int llllllllllllIlIllllIIllIIlIIIlIl) {
        return llllllllllllIlIllllIIllIIlIIIllI == llllllllllllIlIllllIIllIIlIIIlIl;
    }
    
    static {
        lIIlllllllIIlIII();
        lIIlllllllIIIlll();
        logger = LogManager.getLogger();
    }
    
    private static boolean lIIlllllllIIlIIl(final int llllllllllllIlIllllIIllIIIllIIll) {
        return llllllllllllIlIllllIIllIIIllIIll == 0;
    }
    
    private static boolean lIIlllllllIIllll(final int llllllllllllIlIllllIIllIIIlllllI, final int llllllllllllIlIllllIIllIIIllllIl) {
        return llllllllllllIlIllllIIllIIIlllllI < llllllllllllIlIllllIIllIIIllllIl;
    }
    
    public GenLayerHills(final long llllllllllllIlIllllIIllIlIIlIIlI, final GenLayer llllllllllllIlIllllIIllIlIIlIIIl, final GenLayer llllllllllllIlIllllIIllIlIIlIIII) {
        super(llllllllllllIlIllllIIllIlIIlIIlI);
        this.parent = llllllllllllIlIllllIIllIlIIlIIIl;
        this.field_151628_d = llllllllllllIlIllllIIllIlIIlIIII;
    }
    
    private static boolean lIIlllllllIlIlII(final int llllllllllllIlIllllIIllIIIllIIII, final int llllllllllllIlIllllIIllIIIlIllll) {
        return llllllllllllIlIllllIIllIIIllIIII != llllllllllllIlIllllIIllIIIlIllll;
    }
    
    private static boolean lIIlllllllIIllIl(final int llllllllllllIlIllllIIllIIlIIIIlI, final int llllllllllllIlIllllIIllIIlIIIIIl) {
        return llllllllllllIlIllllIIllIIlIIIIlI >= llllllllllllIlIllllIIllIIlIIIIIl;
    }
    
    private static boolean lIIlllllllIIllII(final int llllllllllllIlIllllIIllIIIllIlIl) {
        return llllllllllllIlIllllIIllIIIllIlIl != 0;
    }
    
    private static String lIIlllllllIIIllI(final String llllllllllllIlIllllIIllIIlIIlllI, final String llllllllllllIlIllllIIllIIlIIllIl) {
        try {
            final SecretKeySpec llllllllllllIlIllllIIllIIlIlIIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllllIIllIIlIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllllIIllIIlIlIIII = Cipher.getInstance("Blowfish");
            llllllllllllIlIllllIIllIIlIlIIII.init(GenLayerHills.lllIIlIllIIlIl[1], llllllllllllIlIllllIIllIIlIlIIIl);
            return new String(llllllllllllIlIllllIIllIIlIlIIII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllllIIllIIlIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllllIIllIIlIIllll) {
            llllllllllllIlIllllIIllIIlIIllll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllllllIIlIII() {
        (lllIIlIllIIlIl = new int[7])[0] = " ".length();
        GenLayerHills.lllIIlIllIIlIl[1] = "  ".length();
        GenLayerHills.lllIIlIllIIlIl[2] = ((0x6C ^ 0x67 ^ (0x2F ^ 0x7A)) & (15 + 117 + 10 + 95 ^ 70 + 154 - 113 + 68 ^ -" ".length()));
        GenLayerHills.lllIIlIllIIlIl[3] = (0x6E ^ 0x5 ^ (0xC2 ^ 0xB4));
        GenLayerHills.lllIIlIllIIlIl[4] = (0xD2 ^ 0x92) + (143 + 106 - 151 + 99) - (141 + 20 - 125 + 124) + (108 + 104 - 67 + 9);
        GenLayerHills.lllIIlIllIIlIl[5] = (0x6C ^ 0x44) + (0xF0 ^ 0xC0) - (0x32 ^ 0x7E) + (0x79 ^ 0xD);
        GenLayerHills.lllIIlIllIIlIl[6] = "   ".length();
    }
}
