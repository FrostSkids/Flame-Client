// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.chunk.storage;

import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.BlockPos;
import net.minecraft.nbt.NBTBase;
import net.minecraft.world.chunk.NibbleArray;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.world.biome.WorldChunkManager;
import net.minecraft.nbt.NBTTagCompound;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class ChunkLoader
{
    private static final /* synthetic */ String[] llllIllIIlllI;
    private static final /* synthetic */ int[] llllIllIlllIl;
    
    private static void lIlIlIllIIlllIl() {
        (llllIllIIlllI = new String[ChunkLoader.llllIllIlllIl[31]])[ChunkLoader.llllIllIlllIl[0]] = lIlIlIllIIlIIII("HDkCOQ==", "dimJI");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[1]] = lIlIlIllIIlIIII("OwY+EQ==", "AVQbf");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[2]] = lIlIlIllIIlIIII("LAANGTkd", "nlbzR");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[3]] = lIlIlIllIIlIIII("NAAhLQ==", "paULD");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[5]] = lIlIlIllIIlIIIl("poGqHgdKHxW+yPA9evWxzQ==", "mXSDV");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[6]] = lIlIlIllIIlIIII("KyQCOgQlIQoxGw==", "iHmYo");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[7]] = lIlIlIllIIlIIIl("7l1teqGCUUx501wb91cDFQ==", "QUCyX");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[4]] = lIlIlIllIIlIIII("AxwWNw4+FzQqHyIVBTEKMw==", "WydEo");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[8]] = lIlIlIllIIlIIll("7eiH6Obl0aSSCgsch7u6dQ==", "IYRTs");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[10]] = lIlIlIllIIlIIII("GhAlIRIgDSAwPisK", "NyIDW");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[9]] = lIlIlIllIIlIIIl("U8I1LtlR5Xi6qQtxpNZgsQ==", "UgDyO");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[11]] = lIlIlIllIIlIIll("HYhEk5qtMeqUdVfnJq7fow==", "yJktz");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[12]] = lIlIlIllIIlIIII("OzsaATcHPggBBw==", "wZiub");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[13]] = lIlIlIllIIlIIII("IicXCQ==", "Zwxzv");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[14]] = lIlIlIllIIlIIll("EuFNWTyyZ54=", "ZUowo");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[15]] = lIlIlIllIIlIIII("Kik/PBcWLC08Jw==", "fHLHB");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[16]] = lIlIlIllIIlIIIl("M3AsltaezOTxIUeHgrRp/w==", "jEDaQ");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[17]] = lIlIlIllIIlIIll("JqL3aVKePtMtUa6OinJy6qt6hqDVAYYS", "aWjrQ");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[20]] = lIlIlIllIIlIIll("9BroNmFBiLg=", "JGTcs");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[21]] = lIlIlIllIIlIIIl("R+JJ61kCEPM=", "fnUDB");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[22]] = lIlIlIllIIlIIII("EhQWGQ==", "VubxE");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[23]] = lIlIlIllIIlIIIl("6/kuMo8S/zYYI3FmQM5XTg==", "umkHK");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[24]] = lIlIlIllIIlIIIl("jVF/HLiY2P42Rzjb87x7KQ==", "nAQQh");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[25]] = lIlIlIllIIlIIll("gPFW05OEN1ntF13DDXX1jA==", "LYLVc");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[27]] = lIlIlIllIIlIIll("WrpngRkyS4o=", "qyVlW");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[28]] = lIlIlIllIIlIIIl("Auo/tKi7bknFA40B2kVtTQ==", "lRJpo");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[29]] = lIlIlIllIIlIIIl("X1kSHv/EOSQB41kc+ZX/QA==", "tLikr");
        ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[30]] = lIlIlIllIIlIIll("MFqRMWfuaNP0wo9ATlmO5A==", "gcLth");
    }
    
    private static String lIlIlIllIIlIIll(final String lllllllllllllIlIllIIllllIIlIlIIl, final String lllllllllllllIlIllIIllllIIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIllllIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIllllIIlIlIII.getBytes(StandardCharsets.UTF_8)), ChunkLoader.llllIllIlllIl[8]), "DES");
            final Cipher lllllllllllllIlIllIIllllIIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIllIIllllIIlIlIll.init(ChunkLoader.llllIllIlllIl[2], lllllllllllllIlIllIIllllIIlIllII);
            return new String(lllllllllllllIlIllIIllllIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIllllIIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIllllIIlIlIlI) {
            lllllllllllllIlIllIIllllIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIlIllIIlIIIl(final String lllllllllllllIlIllIIllllIIIIIlII, final String lllllllllllllIlIllIIllllIIIIIIll) {
        try {
            final SecretKeySpec lllllllllllllIlIllIIllllIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIIllllIIIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIIllllIIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIIllllIIIIIllI.init(ChunkLoader.llllIllIlllIl[2], lllllllllllllIlIllIIllllIIIIIlll);
            return new String(lllllllllllllIlIllIIllllIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIIllllIIIIIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIIllllIIIIIlIl) {
            lllllllllllllIlIllIIllllIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIlIllIIlIIII(String lllllllllllllIlIllIIllllIIIlIlII, final String lllllllllllllIlIllIIllllIIIlIIll) {
        lllllllllllllIlIllIIllllIIIlIlII = new String(Base64.getDecoder().decode(lllllllllllllIlIllIIllllIIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIIllllIIIlIlll = new StringBuilder();
        final char[] lllllllllllllIlIllIIllllIIIlIllI = lllllllllllllIlIllIIllllIIIlIIll.toCharArray();
        int lllllllllllllIlIllIIllllIIIlIlIl = ChunkLoader.llllIllIlllIl[0];
        final boolean lllllllllllllIlIllIIllllIIIIllll = (Object)lllllllllllllIlIllIIllllIIIlIlII.toCharArray();
        final int lllllllllllllIlIllIIllllIIIIlllI = lllllllllllllIlIllIIllllIIIIllll.length;
        Exception lllllllllllllIlIllIIllllIIIIllIl = (Exception)ChunkLoader.llllIllIlllIl[0];
        while (lIlIlIllllIIIlI((int)lllllllllllllIlIllIIllllIIIIllIl, lllllllllllllIlIllIIllllIIIIlllI)) {
            final char lllllllllllllIlIllIIllllIIIllIlI = lllllllllllllIlIllIIllllIIIIllll[lllllllllllllIlIllIIllllIIIIllIl];
            lllllllllllllIlIllIIllllIIIlIlll.append((char)(lllllllllllllIlIllIIllllIIIllIlI ^ lllllllllllllIlIllIIllllIIIlIllI[lllllllllllllIlIllIIllllIIIlIlIl % lllllllllllllIlIllIIllllIIIlIllI.length]));
            "".length();
            ++lllllllllllllIlIllIIllllIIIlIlIl;
            ++lllllllllllllIlIllIIllllIIIIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIIllllIIIlIlll);
    }
    
    private static boolean lIlIlIllllIIIlI(final int lllllllllllllIlIllIIlllIlllllIII, final int lllllllllllllIlIllIIlllIllllIlll) {
        return lllllllllllllIlIllIIlllIlllllIII < lllllllllllllIlIllIIlllIllllIlll;
    }
    
    public static void convertToAnvilFormat(final AnvilConverterData lllllllllllllIlIllIIllllIlIllIll, final NBTTagCompound lllllllllllllIlIllIIllllIIllllll, final WorldChunkManager lllllllllllllIlIllIIllllIIlllllI) {
        lllllllllllllIlIllIIllllIIllllll.setInteger(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[13]], lllllllllllllIlIllIIllllIlIllIll.x);
        lllllllllllllIlIllIIllllIIllllll.setInteger(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[14]], lllllllllllllIlIllIIllllIlIllIll.z);
        lllllllllllllIlIllIIllllIIllllll.setLong(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[15]], lllllllllllllIlIllIIllllIlIllIll.lastUpdated);
        final int[] lllllllllllllIlIllIIllllIlIllIII = new int[lllllllllllllIlIllIIllllIlIllIll.heightmap.length];
        int lllllllllllllIlIllIIllllIlIlIlll = ChunkLoader.llllIllIlllIl[0];
        "".length();
        if ((0xD ^ 0x9) < (0x2 ^ 0x6)) {
            return;
        }
        while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIlIlll, lllllllllllllIlIllIIllllIlIllIll.heightmap.length)) {
            lllllllllllllIlIllIIllllIlIllIII[lllllllllllllIlIllIIllllIlIlIlll] = lllllllllllllIlIllIIllllIlIllIll.heightmap[lllllllllllllIlIllIIllllIlIlIlll];
            ++lllllllllllllIlIllIIllllIlIlIlll;
        }
        lllllllllllllIlIllIIllllIIllllll.setIntArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[16]], lllllllllllllIlIllIIllllIlIllIII);
        lllllllllllllIlIllIIllllIIllllll.setBoolean(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[17]], lllllllllllllIlIllIIllllIlIllIll.terrainPopulated);
        final NBTTagList lllllllllllllIlIllIIllllIlIlIllI = new NBTTagList();
        int lllllllllllllIlIllIIllllIlIlIlIl = ChunkLoader.llllIllIlllIl[0];
        "".length();
        if (-"   ".length() > 0) {
            return;
        }
        while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIlIlIl, ChunkLoader.llllIllIlllIl[8])) {
            boolean lllllllllllllIlIllIIllllIlIlIlII = ChunkLoader.llllIllIlllIl[1] != 0;
            int lllllllllllllIlIllIIllllIlIlIIll = ChunkLoader.llllIllIlllIl[0];
            "".length();
            if (" ".length() <= 0) {
                return;
            }
            while (lIlIlIllllIIIlI(lllllllllllllIlIllIIllllIlIlIIll, ChunkLoader.llllIllIlllIl[16]) && !lIlIlIllllIIIll(lllllllllllllIlIllIIllllIlIlIlII ? 1 : 0)) {
                int lllllllllllllIlIllIIllllIlIlIIlI = ChunkLoader.llllIllIlllIl[0];
                "".length();
                if (-" ".length() >= 0) {
                    return;
                }
                while (lIlIlIllllIIIlI(lllllllllllllIlIllIIllllIlIlIIlI, ChunkLoader.llllIllIlllIl[16]) && !lIlIlIllllIIIll(lllllllllllllIlIllIIllllIlIlIlII ? 1 : 0)) {
                    int lllllllllllllIlIllIIllllIlIlIIIl = ChunkLoader.llllIllIlllIl[0];
                    "".length();
                    if (((0x2C ^ 0x10) & ~(0x19 ^ 0x25)) != 0x0) {
                        return;
                    }
                    while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIlIIIl, ChunkLoader.llllIllIlllIl[16])) {
                        final int lllllllllllllIlIllIIllllIlIlIIII = lllllllllllllIlIllIIllllIlIlIIll << ChunkLoader.llllIllIlllIl[11] | lllllllllllllIlIllIIllllIlIlIIIl << ChunkLoader.llllIllIlllIl[4] | lllllllllllllIlIllIIllllIlIlIIlI + (lllllllllllllIlIllIIllllIlIlIlIl << ChunkLoader.llllIllIlllIl[5]);
                        final int lllllllllllllIlIllIIllllIlIIllll = lllllllllllllIlIllIIllllIlIllIll.blocks[lllllllllllllIlIllIIllllIlIlIIII];
                        if (lIlIlIllllIIIIl(lllllllllllllIlIllIIllllIlIIllll)) {
                            lllllllllllllIlIllIIllllIlIlIlII = (ChunkLoader.llllIllIlllIl[0] != 0);
                            "".length();
                            if (null != null) {
                                return;
                            }
                            break;
                        }
                        else {
                            ++lllllllllllllIlIllIIllllIlIlIIIl;
                        }
                    }
                    ++lllllllllllllIlIllIIllllIlIlIIlI;
                }
                ++lllllllllllllIlIllIIllllIlIlIIll;
            }
            if (lIlIlIllllIIIll(lllllllllllllIlIllIIllllIlIlIlII ? 1 : 0)) {
                final byte[] lllllllllllllIlIllIIllllIlIIlllI = new byte[ChunkLoader.llllIllIlllIl[18]];
                final NibbleArray lllllllllllllIlIllIIllllIlIIllIl = new NibbleArray();
                final NibbleArray lllllllllllllIlIllIIllllIlIIllII = new NibbleArray();
                final NibbleArray lllllllllllllIlIllIIllllIlIIlIll = new NibbleArray();
                int lllllllllllllIlIllIIllllIlIIlIlI = ChunkLoader.llllIllIlllIl[0];
                "".length();
                if (-"   ".length() > 0) {
                    return;
                }
                while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIIlIlI, ChunkLoader.llllIllIlllIl[16])) {
                    int lllllllllllllIlIllIIllllIlIIlIIl = ChunkLoader.llllIllIlllIl[0];
                    "".length();
                    if (null != null) {
                        return;
                    }
                    while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIIlIIl, ChunkLoader.llllIllIlllIl[16])) {
                        int lllllllllllllIlIllIIllllIlIIlIII = ChunkLoader.llllIllIlllIl[0];
                        "".length();
                        if (((0x76 ^ 0x6F) & ~(0x70 ^ 0x69)) != 0x0) {
                            return;
                        }
                        while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIIlIII, ChunkLoader.llllIllIlllIl[16])) {
                            final int lllllllllllllIlIllIIllllIlIIIlll = lllllllllllllIlIllIIllllIlIIlIlI << ChunkLoader.llllIllIlllIl[11] | lllllllllllllIlIllIIllllIlIIlIII << ChunkLoader.llllIllIlllIl[4] | lllllllllllllIlIllIIllllIlIIlIIl + (lllllllllllllIlIllIIllllIlIlIlIl << ChunkLoader.llllIllIlllIl[5]);
                            final int lllllllllllllIlIllIIllllIlIIIllI = lllllllllllllIlIllIIllllIlIllIll.blocks[lllllllllllllIlIllIIllllIlIIIlll];
                            lllllllllllllIlIllIIllllIlIIlllI[lllllllllllllIlIllIIllllIlIIlIIl << ChunkLoader.llllIllIlllIl[8] | lllllllllllllIlIllIIllllIlIIlIII << ChunkLoader.llllIllIlllIl[5] | lllllllllllllIlIllIIllllIlIIlIlI] = (byte)(lllllllllllllIlIllIIllllIlIIIllI & ChunkLoader.llllIllIlllIl[19]);
                            lllllllllllllIlIllIIllllIlIIllIl.set(lllllllllllllIlIllIIllllIlIIlIlI, lllllllllllllIlIllIIllllIlIIlIIl, lllllllllllllIlIllIIllllIlIIlIII, lllllllllllllIlIllIIllllIlIllIll.data.get(lllllllllllllIlIllIIllllIlIIlIlI, lllllllllllllIlIllIIllllIlIIlIIl + (lllllllllllllIlIllIIllllIlIlIlIl << ChunkLoader.llllIllIlllIl[5]), lllllllllllllIlIllIIllllIlIIlIII));
                            lllllllllllllIlIllIIllllIlIIllII.set(lllllllllllllIlIllIIllllIlIIlIlI, lllllllllllllIlIllIIllllIlIIlIIl, lllllllllllllIlIllIIllllIlIIlIII, lllllllllllllIlIllIIllllIlIllIll.skyLight.get(lllllllllllllIlIllIIllllIlIIlIlI, lllllllllllllIlIllIIllllIlIIlIIl + (lllllllllllllIlIllIIllllIlIlIlIl << ChunkLoader.llllIllIlllIl[5]), lllllllllllllIlIllIIllllIlIIlIII));
                            lllllllllllllIlIllIIllllIlIIlIll.set(lllllllllllllIlIllIIllllIlIIlIlI, lllllllllllllIlIllIIllllIlIIlIIl, lllllllllllllIlIllIIllllIlIIlIII, lllllllllllllIlIllIIllllIlIllIll.blockLight.get(lllllllllllllIlIllIIllllIlIIlIlI, lllllllllllllIlIllIIllllIlIIlIIl + (lllllllllllllIlIllIIllllIlIlIlIl << ChunkLoader.llllIllIlllIl[5]), lllllllllllllIlIllIIllllIlIIlIII));
                            ++lllllllllllllIlIllIIllllIlIIlIII;
                        }
                        ++lllllllllllllIlIllIIllllIlIIlIIl;
                    }
                    ++lllllllllllllIlIllIIllllIlIIlIlI;
                }
                final NBTTagCompound lllllllllllllIlIllIIllllIlIIIlIl = new NBTTagCompound();
                lllllllllllllIlIllIIllllIlIIIlIl.setByte(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[20]], (byte)(lllllllllllllIlIllIIllllIlIlIlIl & ChunkLoader.llllIllIlllIl[19]));
                lllllllllllllIlIllIIllllIlIIIlIl.setByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[21]], lllllllllllllIlIllIIllllIlIIlllI);
                lllllllllllllIlIllIIllllIlIIIlIl.setByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[22]], lllllllllllllIlIllIIllllIlIIllIl.getData());
                lllllllllllllIlIllIIllllIlIIIlIl.setByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[23]], lllllllllllllIlIllIIllllIlIIllII.getData());
                lllllllllllllIlIllIIllllIlIIIlIl.setByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[24]], lllllllllllllIlIllIIllllIlIIlIll.getData());
                lllllllllllllIlIllIIllllIlIlIllI.appendTag(lllllllllllllIlIllIIllllIlIIIlIl);
            }
            ++lllllllllllllIlIllIIllllIlIlIlIl;
        }
        lllllllllllllIlIllIIllllIIllllll.setTag(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[25]], lllllllllllllIlIllIIllllIlIlIllI);
        final byte[] lllllllllllllIlIllIIllllIlIIIlII = new byte[ChunkLoader.llllIllIlllIl[26]];
        final BlockPos.MutableBlockPos lllllllllllllIlIllIIllllIlIIIIll = new BlockPos.MutableBlockPos();
        int lllllllllllllIlIllIIllllIlIIIIlI = ChunkLoader.llllIllIlllIl[0];
        "".length();
        if ("  ".length() <= " ".length()) {
            return;
        }
        while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIIIIlI, ChunkLoader.llllIllIlllIl[16])) {
            int lllllllllllllIlIllIIllllIlIIIIIl = ChunkLoader.llllIllIlllIl[0];
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!lIlIlIllllIIIII(lllllllllllllIlIllIIllllIlIIIIIl, ChunkLoader.llllIllIlllIl[16])) {
                lllllllllllllIlIllIIllllIlIIIIll.func_181079_c(lllllllllllllIlIllIIllllIlIllIll.x << ChunkLoader.llllIllIlllIl[5] | lllllllllllllIlIllIIllllIlIIIIlI, ChunkLoader.llllIllIlllIl[0], lllllllllllllIlIllIIllllIlIllIll.z << ChunkLoader.llllIllIlllIl[5] | lllllllllllllIlIllIIllllIlIIIIIl);
                "".length();
                lllllllllllllIlIllIIllllIlIIIlII[lllllllllllllIlIllIIllllIlIIIIIl << ChunkLoader.llllIllIlllIl[5] | lllllllllllllIlIllIIllllIlIIIIlI] = (byte)(lllllllllllllIlIllIIllllIIlllllI.getBiomeGenerator(lllllllllllllIlIllIIllllIlIIIIll, BiomeGenBase.field_180279_ad).biomeID & ChunkLoader.llllIllIlllIl[19]);
                ++lllllllllllllIlIllIIllllIlIIIIIl;
            }
            ++lllllllllllllIlIllIIllllIlIIIIlI;
        }
        lllllllllllllIlIllIIllllIIllllll.setByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[27]], lllllllllllllIlIllIIllllIlIIIlII);
        lllllllllllllIlIllIIllllIIllllll.setTag(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[28]], lllllllllllllIlIllIIllllIlIllIll.entities);
        lllllllllllllIlIllIIllllIIllllll.setTag(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[29]], lllllllllllllIlIllIIllllIlIllIll.tileEntities);
        if (lIlIlIllllIIlII(lllllllllllllIlIllIIllllIlIllIll.tileTicks)) {
            lllllllllllllIlIllIIllllIIllllll.setTag(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[30]], lllllllllllllIlIllIIllllIlIllIll.tileTicks);
        }
    }
    
    static {
        lIlIlIlllIlllll();
        lIlIlIllIIlllIl();
    }
    
    public static AnvilConverterData load(final NBTTagCompound lllllllllllllIlIllIIllllIlllIlIl) {
        final int lllllllllllllIlIllIIllllIlllIlII = lllllllllllllIlIllIIllllIlllIlIl.getInteger(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[0]]);
        final int lllllllllllllIlIllIIllllIlllIIll = lllllllllllllIlIllIIllllIlllIlIl.getInteger(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[1]]);
        final AnvilConverterData lllllllllllllIlIllIIllllIlllIIlI = new AnvilConverterData(lllllllllllllIlIllIIllllIlllIlII, lllllllllllllIlIllIIllllIlllIIll);
        lllllllllllllIlIllIIllllIlllIIlI.blocks = lllllllllllllIlIllIIllllIlllIlIl.getByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[2]]);
        lllllllllllllIlIllIIllllIlllIIlI.data = new NibbleArrayReader(lllllllllllllIlIllIIllllIlllIlIl.getByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[3]]), ChunkLoader.llllIllIlllIl[4]);
        lllllllllllllIlIllIIllllIlllIIlI.skyLight = new NibbleArrayReader(lllllllllllllIlIllIIllllIlllIlIl.getByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[5]]), ChunkLoader.llllIllIlllIl[4]);
        lllllllllllllIlIllIIllllIlllIIlI.blockLight = new NibbleArrayReader(lllllllllllllIlIllIIllllIlllIlIl.getByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[6]]), ChunkLoader.llllIllIlllIl[4]);
        lllllllllllllIlIllIIllllIlllIIlI.heightmap = lllllllllllllIlIllIIllllIlllIlIl.getByteArray(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[7]]);
        lllllllllllllIlIllIIllllIlllIIlI.terrainPopulated = lllllllllllllIlIllIIllllIlllIlIl.getBoolean(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[4]]);
        lllllllllllllIlIllIIllllIlllIIlI.entities = lllllllllllllIlIllIIllllIlllIlIl.getTagList(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[8]], ChunkLoader.llllIllIlllIl[9]);
        lllllllllllllIlIllIIllllIlllIIlI.tileEntities = lllllllllllllIlIllIIllllIlllIlIl.getTagList(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[10]], ChunkLoader.llllIllIlllIl[9]);
        lllllllllllllIlIllIIllllIlllIIlI.tileTicks = lllllllllllllIlIllIIllllIlllIlIl.getTagList(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[9]], ChunkLoader.llllIllIlllIl[9]);
        try {
            lllllllllllllIlIllIIllllIlllIIlI.lastUpdated = lllllllllllllIlIllIIllllIlllIlIl.getLong(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[11]]);
            "".length();
            if (" ".length() < 0) {
                return null;
            }
        }
        catch (ClassCastException lllllllllllllIlIllIIllllIlllIIIl) {
            lllllllllllllIlIllIIllllIlllIIlI.lastUpdated = lllllllllllllIlIllIIllllIlllIlIl.getInteger(ChunkLoader.llllIllIIlllI[ChunkLoader.llllIllIlllIl[12]]);
        }
        return lllllllllllllIlIllIIllllIlllIIlI;
    }
    
    private static void lIlIlIlllIlllll() {
        (llllIllIlllIl = new int[32])[0] = ((0xAA ^ 0xB2 ^ ((0x92 ^ 0xA0) & ~(0x49 ^ 0x7B))) & (51 + 67 - 37 + 74 ^ 116 + 20 - 58 + 53 ^ -" ".length()));
        ChunkLoader.llllIllIlllIl[1] = " ".length();
        ChunkLoader.llllIllIlllIl[2] = "  ".length();
        ChunkLoader.llllIllIlllIl[3] = "   ".length();
        ChunkLoader.llllIllIlllIl[4] = (0xA ^ 0x41 ^ (0x5D ^ 0x11));
        ChunkLoader.llllIllIlllIl[5] = (0x21 ^ 0x25);
        ChunkLoader.llllIllIlllIl[6] = (0x56 ^ 0x16 ^ (0x4E ^ 0xB));
        ChunkLoader.llllIllIlllIl[7] = (0x51 ^ 0x57);
        ChunkLoader.llllIllIlllIl[8] = (0x88 ^ 0x80);
        ChunkLoader.llllIllIlllIl[9] = (0x7C ^ 0x76);
        ChunkLoader.llllIllIlllIl[10] = (0xE6 ^ 0xA7 ^ (0xCA ^ 0x82));
        ChunkLoader.llllIllIlllIl[11] = (0x2E ^ 0x1F ^ (0xB7 ^ 0x8D));
        ChunkLoader.llllIllIlllIl[12] = (0x4D ^ 0x30 ^ (0xC0 ^ 0xB1));
        ChunkLoader.llllIllIlllIl[13] = (0x20 ^ 0x78 ^ (0x47 ^ 0x12));
        ChunkLoader.llllIllIlllIl[14] = (0x43 ^ 0x4D);
        ChunkLoader.llllIllIlllIl[15] = (61 + 64 + 23 + 5 ^ 49 + 78 - 106 + 129);
        ChunkLoader.llllIllIlllIl[16] = (0x33 ^ 0x23);
        ChunkLoader.llllIllIlllIl[17] = (0xD4 ^ 0xC5);
        ChunkLoader.llllIllIlllIl[18] = (-(0xFFFFED7E & 0x7FF9) & (0xFFFFFD7F & 0x7FF7));
        ChunkLoader.llllIllIlllIl[19] = 87 + 92 - 6 + 82;
        ChunkLoader.llllIllIlllIl[20] = (0x23 ^ 0x31);
        ChunkLoader.llllIllIlllIl[21] = (0x53 ^ 0x9 ^ (0x62 ^ 0x2B));
        ChunkLoader.llllIllIlllIl[22] = (0x20 ^ 0x3A ^ (0x14 ^ 0x1A));
        ChunkLoader.llllIllIlllIl[23] = (0x70 ^ 0x74 ^ (0x3A ^ 0x2B));
        ChunkLoader.llllIllIlllIl[24] = (155 + 141 - 253 + 143 ^ 152 + 150 - 151 + 21);
        ChunkLoader.llllIllIlllIl[25] = (0xE6 ^ 0xBE ^ (0x6 ^ 0x49));
        ChunkLoader.llllIllIlllIl[26] = (-(0xFFFFA447 & 0x7FFF) & (0xFFFFADD7 & 0x776E));
        ChunkLoader.llllIllIlllIl[27] = (0x31 ^ 0x7C ^ (0xC4 ^ 0x91));
        ChunkLoader.llllIllIlllIl[28] = (0x2E ^ 0x3B ^ (0x59 ^ 0x55));
        ChunkLoader.llllIllIlllIl[29] = (0x8C ^ 0x96);
        ChunkLoader.llllIllIlllIl[30] = (0xE1 ^ 0xA9 ^ (0xC5 ^ 0x96));
        ChunkLoader.llllIllIlllIl[31] = (0x1C ^ 0x77 ^ (0x14 ^ 0x63));
    }
    
    private static boolean lIlIlIllllIIIIl(final int lllllllllllllIlIllIIlllIllllIIll) {
        return lllllllllllllIlIllIIlllIllllIIll != 0;
    }
    
    private static boolean lIlIlIllllIIIll(final int lllllllllllllIlIllIIlllIllllIIIl) {
        return lllllllllllllIlIllIIlllIllllIIIl == 0;
    }
    
    private static boolean lIlIlIllllIIlII(final Object lllllllllllllIlIllIIlllIllllIlIl) {
        return lllllllllllllIlIllIIlllIllllIlIl != null;
    }
    
    private static boolean lIlIlIllllIIIII(final int lllllllllllllIlIllIIlllIllllllII, final int lllllllllllllIlIllIIlllIlllllIll) {
        return lllllllllllllIlIllIIlllIllllllII >= lllllllllllllIlIllIIlllIlllllIll;
    }
    
    public static class AnvilConverterData
    {
        public /* synthetic */ byte[] blocks;
        public /* synthetic */ NBTTagList entities;
        public /* synthetic */ NBTTagList tileEntities;
        public final /* synthetic */ int x;
        public /* synthetic */ NBTTagList tileTicks;
        public final /* synthetic */ int z;
        public /* synthetic */ NibbleArrayReader skyLight;
        public /* synthetic */ boolean terrainPopulated;
        public /* synthetic */ byte[] heightmap;
        public /* synthetic */ NibbleArrayReader data;
        public /* synthetic */ NibbleArrayReader blockLight;
        public /* synthetic */ long lastUpdated;
        
        public AnvilConverterData(final int lllllllllllllIlIlIllIlIIlllllIII, final int lllllllllllllIlIlIllIlIIllllIlll) {
            this.x = lllllllllllllIlIlIllIlIIlllllIII;
            this.z = lllllllllllllIlIlIllIlIIllllIlll;
        }
    }
}
