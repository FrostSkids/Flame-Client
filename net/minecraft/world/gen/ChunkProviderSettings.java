// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import com.google.gson.GsonBuilder;
import com.google.gson.Gson;
import java.util.Arrays;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.util.JsonUtils;
import com.google.gson.JsonParseException;
import com.google.gson.JsonDeserializationContext;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import com.google.gson.JsonObject;
import com.google.gson.JsonElement;
import com.google.gson.JsonSerializationContext;
import java.lang.reflect.Type;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.google.gson.JsonSerializer;
import com.google.gson.JsonDeserializer;

public class ChunkProviderSettings
{
    public final /* synthetic */ float mainNoiseScaleY;
    public final /* synthetic */ int redstoneMinHeight;
    public final /* synthetic */ int gravelCount;
    public final /* synthetic */ int seaLevel;
    public final /* synthetic */ int diamondMinHeight;
    public final /* synthetic */ int dungeonChance;
    public final /* synthetic */ int ironSize;
    public final /* synthetic */ int goldSize;
    public final /* synthetic */ int lapisSize;
    public final /* synthetic */ float mainNoiseScaleX;
    public final /* synthetic */ int riverSize;
    public final /* synthetic */ int lavaLakeChance;
    public final /* synthetic */ int graniteCount;
    public final /* synthetic */ int dioriteSize;
    public final /* synthetic */ int graniteMinHeight;
    public final /* synthetic */ boolean useRavines;
    public final /* synthetic */ int coalSize;
    public final /* synthetic */ float coordinateScale;
    public final /* synthetic */ int goldMinHeight;
    public final /* synthetic */ int andesiteSize;
    public final /* synthetic */ int coalMaxHeight;
    public final /* synthetic */ int gravelSize;
    public final /* synthetic */ float baseSize;
    public final /* synthetic */ int coalMinHeight;
    public final /* synthetic */ boolean useWaterLakes;
    public final /* synthetic */ int fixedBiome;
    public final /* synthetic */ int diamondSize;
    public final /* synthetic */ int andesiteMaxHeight;
    public final /* synthetic */ int redstoneSize;
    public final /* synthetic */ float upperLimitScale;
    public final /* synthetic */ float biomeScaleWeight;
    public final /* synthetic */ int goldCount;
    public final /* synthetic */ int waterLakeChance;
    public final /* synthetic */ int gravelMaxHeight;
    public final /* synthetic */ int dirtSize;
    public final /* synthetic */ float mainNoiseScaleZ;
    public final /* synthetic */ int andesiteMinHeight;
    public final /* synthetic */ int andesiteCount;
    public final /* synthetic */ float stretchY;
    public final /* synthetic */ int biomeSize;
    public final /* synthetic */ int dioriteMaxHeight;
    public final /* synthetic */ int diamondCount;
    public final /* synthetic */ int dirtMaxHeight;
    public final /* synthetic */ int lapisCenterHeight;
    public final /* synthetic */ boolean useLavaLakes;
    public final /* synthetic */ int goldMaxHeight;
    public final /* synthetic */ int dirtCount;
    public final /* synthetic */ boolean useVillages;
    public final /* synthetic */ int lapisCount;
    public final /* synthetic */ boolean useStrongholds;
    public final /* synthetic */ int ironMaxHeight;
    public final /* synthetic */ float biomeDepthOffSet;
    public final /* synthetic */ float biomeScaleOffset;
    public final /* synthetic */ boolean useTemples;
    public final /* synthetic */ int gravelMinHeight;
    public final /* synthetic */ boolean useMineShafts;
    public final /* synthetic */ int diamondMaxHeight;
    public final /* synthetic */ int dirtMinHeight;
    public final /* synthetic */ float lowerLimitScale;
    public final /* synthetic */ int graniteMaxHeight;
    public final /* synthetic */ int dioriteMinHeight;
    public final /* synthetic */ float depthNoiseScaleZ;
    public final /* synthetic */ int redstoneCount;
    public final /* synthetic */ float depthNoiseScaleExponent;
    public final /* synthetic */ int redstoneMaxHeight;
    public final /* synthetic */ int coalCount;
    public final /* synthetic */ float heightScale;
    public final /* synthetic */ int ironCount;
    public final /* synthetic */ float depthNoiseScaleX;
    public final /* synthetic */ boolean useLavaOceans;
    public final /* synthetic */ int dioriteCount;
    public final /* synthetic */ boolean useDungeons;
    public final /* synthetic */ boolean useCaves;
    public final /* synthetic */ int lapisSpread;
    public final /* synthetic */ float biomeDepthWeight;
    public final /* synthetic */ int graniteSize;
    public final /* synthetic */ int ironMinHeight;
    public final /* synthetic */ boolean useMonuments;
    
    private ChunkProviderSettings(final Factory lllllllllllllIIIlllIllllIlllIllI) {
        this.coordinateScale = lllllllllllllIIIlllIllllIlllIllI.coordinateScale;
        this.heightScale = lllllllllllllIIIlllIllllIlllIllI.heightScale;
        this.upperLimitScale = lllllllllllllIIIlllIllllIlllIllI.upperLimitScale;
        this.lowerLimitScale = lllllllllllllIIIlllIllllIlllIllI.lowerLimitScale;
        this.depthNoiseScaleX = lllllllllllllIIIlllIllllIlllIllI.depthNoiseScaleX;
        this.depthNoiseScaleZ = lllllllllllllIIIlllIllllIlllIllI.depthNoiseScaleZ;
        this.depthNoiseScaleExponent = lllllllllllllIIIlllIllllIlllIllI.depthNoiseScaleExponent;
        this.mainNoiseScaleX = lllllllllllllIIIlllIllllIlllIllI.mainNoiseScaleX;
        this.mainNoiseScaleY = lllllllllllllIIIlllIllllIlllIllI.mainNoiseScaleY;
        this.mainNoiseScaleZ = lllllllllllllIIIlllIllllIlllIllI.mainNoiseScaleZ;
        this.baseSize = lllllllllllllIIIlllIllllIlllIllI.baseSize;
        this.stretchY = lllllllllllllIIIlllIllllIlllIllI.stretchY;
        this.biomeDepthWeight = lllllllllllllIIIlllIllllIlllIllI.biomeDepthWeight;
        this.biomeDepthOffSet = lllllllllllllIIIlllIllllIlllIllI.biomeDepthOffset;
        this.biomeScaleWeight = lllllllllllllIIIlllIllllIlllIllI.biomeScaleWeight;
        this.biomeScaleOffset = lllllllllllllIIIlllIllllIlllIllI.biomeScaleOffset;
        this.seaLevel = lllllllllllllIIIlllIllllIlllIllI.seaLevel;
        this.useCaves = lllllllllllllIIIlllIllllIlllIllI.useCaves;
        this.useDungeons = lllllllllllllIIIlllIllllIlllIllI.useDungeons;
        this.dungeonChance = lllllllllllllIIIlllIllllIlllIllI.dungeonChance;
        this.useStrongholds = lllllllllllllIIIlllIllllIlllIllI.useStrongholds;
        this.useVillages = lllllllllllllIIIlllIllllIlllIllI.useVillages;
        this.useMineShafts = lllllllllllllIIIlllIllllIlllIllI.useMineShafts;
        this.useTemples = lllllllllllllIIIlllIllllIlllIllI.useTemples;
        this.useMonuments = lllllllllllllIIIlllIllllIlllIllI.useMonuments;
        this.useRavines = lllllllllllllIIIlllIllllIlllIllI.useRavines;
        this.useWaterLakes = lllllllllllllIIIlllIllllIlllIllI.useWaterLakes;
        this.waterLakeChance = lllllllllllllIIIlllIllllIlllIllI.waterLakeChance;
        this.useLavaLakes = lllllllllllllIIIlllIllllIlllIllI.useLavaLakes;
        this.lavaLakeChance = lllllllllllllIIIlllIllllIlllIllI.lavaLakeChance;
        this.useLavaOceans = lllllllllllllIIIlllIllllIlllIllI.useLavaOceans;
        this.fixedBiome = lllllllllllllIIIlllIllllIlllIllI.fixedBiome;
        this.biomeSize = lllllllllllllIIIlllIllllIlllIllI.biomeSize;
        this.riverSize = lllllllllllllIIIlllIllllIlllIllI.riverSize;
        this.dirtSize = lllllllllllllIIIlllIllllIlllIllI.dirtSize;
        this.dirtCount = lllllllllllllIIIlllIllllIlllIllI.dirtCount;
        this.dirtMinHeight = lllllllllllllIIIlllIllllIlllIllI.dirtMinHeight;
        this.dirtMaxHeight = lllllllllllllIIIlllIllllIlllIllI.dirtMaxHeight;
        this.gravelSize = lllllllllllllIIIlllIllllIlllIllI.gravelSize;
        this.gravelCount = lllllllllllllIIIlllIllllIlllIllI.gravelCount;
        this.gravelMinHeight = lllllllllllllIIIlllIllllIlllIllI.gravelMinHeight;
        this.gravelMaxHeight = lllllllllllllIIIlllIllllIlllIllI.gravelMaxHeight;
        this.graniteSize = lllllllllllllIIIlllIllllIlllIllI.graniteSize;
        this.graniteCount = lllllllllllllIIIlllIllllIlllIllI.graniteCount;
        this.graniteMinHeight = lllllllllllllIIIlllIllllIlllIllI.graniteMinHeight;
        this.graniteMaxHeight = lllllllllllllIIIlllIllllIlllIllI.graniteMaxHeight;
        this.dioriteSize = lllllllllllllIIIlllIllllIlllIllI.dioriteSize;
        this.dioriteCount = lllllllllllllIIIlllIllllIlllIllI.dioriteCount;
        this.dioriteMinHeight = lllllllllllllIIIlllIllllIlllIllI.dioriteMinHeight;
        this.dioriteMaxHeight = lllllllllllllIIIlllIllllIlllIllI.dioriteMaxHeight;
        this.andesiteSize = lllllllllllllIIIlllIllllIlllIllI.andesiteSize;
        this.andesiteCount = lllllllllllllIIIlllIllllIlllIllI.andesiteCount;
        this.andesiteMinHeight = lllllllllllllIIIlllIllllIlllIllI.andesiteMinHeight;
        this.andesiteMaxHeight = lllllllllllllIIIlllIllllIlllIllI.andesiteMaxHeight;
        this.coalSize = lllllllllllllIIIlllIllllIlllIllI.coalSize;
        this.coalCount = lllllllllllllIIIlllIllllIlllIllI.coalCount;
        this.coalMinHeight = lllllllllllllIIIlllIllllIlllIllI.coalMinHeight;
        this.coalMaxHeight = lllllllllllllIIIlllIllllIlllIllI.coalMaxHeight;
        this.ironSize = lllllllllllllIIIlllIllllIlllIllI.ironSize;
        this.ironCount = lllllllllllllIIIlllIllllIlllIllI.ironCount;
        this.ironMinHeight = lllllllllllllIIIlllIllllIlllIllI.ironMinHeight;
        this.ironMaxHeight = lllllllllllllIIIlllIllllIlllIllI.ironMaxHeight;
        this.goldSize = lllllllllllllIIIlllIllllIlllIllI.goldSize;
        this.goldCount = lllllllllllllIIIlllIllllIlllIllI.goldCount;
        this.goldMinHeight = lllllllllllllIIIlllIllllIlllIllI.goldMinHeight;
        this.goldMaxHeight = lllllllllllllIIIlllIllllIlllIllI.goldMaxHeight;
        this.redstoneSize = lllllllllllllIIIlllIllllIlllIllI.redstoneSize;
        this.redstoneCount = lllllllllllllIIIlllIllllIlllIllI.redstoneCount;
        this.redstoneMinHeight = lllllllllllllIIIlllIllllIlllIllI.redstoneMinHeight;
        this.redstoneMaxHeight = lllllllllllllIIIlllIllllIlllIllI.redstoneMaxHeight;
        this.diamondSize = lllllllllllllIIIlllIllllIlllIllI.diamondSize;
        this.diamondCount = lllllllllllllIIIlllIllllIlllIllI.diamondCount;
        this.diamondMinHeight = lllllllllllllIIIlllIllllIlllIllI.diamondMinHeight;
        this.diamondMaxHeight = lllllllllllllIIIlllIllllIlllIllI.diamondMaxHeight;
        this.lapisSize = lllllllllllllIIIlllIllllIlllIllI.lapisSize;
        this.lapisCount = lllllllllllllIIIlllIllllIlllIllI.lapisCount;
        this.lapisCenterHeight = lllllllllllllIIIlllIllllIlllIllI.lapisCenterHeight;
        this.lapisSpread = lllllllllllllIIIlllIllllIlllIllI.lapisSpread;
    }
    
    public static class Serializer implements JsonDeserializer<Factory>, JsonSerializer<Factory>
    {
        private static final /* synthetic */ int[] lIIIlIlIlllIIl;
        private static final /* synthetic */ String[] lIIIlIlIIIlllI;
        
        private static String llIIIIIIlIIllII(String lllllllllllllIlIIIIllIIIlIIlIllI, final String lllllllllllllIlIIIIllIIIlIIlIlIl) {
            lllllllllllllIlIIIIllIIIlIIlIllI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIllIIIlIIlIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
            final StringBuilder lllllllllllllIlIIIIllIIIlIIllIIl = new StringBuilder();
            final char[] lllllllllllllIlIIIIllIIIlIIllIII = lllllllllllllIlIIIIllIIIlIIlIlIl.toCharArray();
            int lllllllllllllIlIIIIllIIIlIIlIlll = Serializer.lIIIlIlIlllIIl[0];
            final String lllllllllllllIlIIIIllIIIlIIlIIIl = (Object)lllllllllllllIlIIIIllIIIlIIlIllI.toCharArray();
            final char lllllllllllllIlIIIIllIIIlIIlIIII = (char)lllllllllllllIlIIIIllIIIlIIlIIIl.length;
            String lllllllllllllIlIIIIllIIIlIIIllll = (String)Serializer.lIIIlIlIlllIIl[0];
            while (llIIIIIlIlllIlI((int)lllllllllllllIlIIIIllIIIlIIIllll, lllllllllllllIlIIIIllIIIlIIlIIII)) {
                final char lllllllllllllIlIIIIllIIIlIIlllII = lllllllllllllIlIIIIllIIIlIIlIIIl[lllllllllllllIlIIIIllIIIlIIIllll];
                lllllllllllllIlIIIIllIIIlIIllIIl.append((char)(lllllllllllllIlIIIIllIIIlIIlllII ^ lllllllllllllIlIIIIllIIIlIIllIII[lllllllllllllIlIIIIllIIIlIIlIlll % lllllllllllllIlIIIIllIIIlIIllIII.length]));
                "".length();
                ++lllllllllllllIlIIIIllIIIlIIlIlll;
                ++lllllllllllllIlIIIIllIIIlIIIllll;
                "".length();
                if (null != null) {
                    return null;
                }
            }
            return String.valueOf(lllllllllllllIlIIIIllIIIlIIllIIl);
        }
        
        private static void llIIIIIlIlllIIl() {
            (lIIIlIlIlllIIl = new int[158])[0] = ((0x6D ^ 0x7A ^ (0x31 ^ 0x11)) & (0x5B ^ 0x44 ^ (0xF ^ 0x27) ^ -" ".length()));
            Serializer.lIIIlIlIlllIIl[1] = " ".length();
            Serializer.lIIIlIlIlllIIl[2] = "  ".length();
            Serializer.lIIIlIlIlllIIl[3] = "   ".length();
            Serializer.lIIIlIlIlllIIl[4] = (0xE ^ 0xA);
            Serializer.lIIIlIlIlllIIl[5] = (0xA ^ 0x62 ^ (0xDA ^ 0xB7));
            Serializer.lIIIlIlIlllIIl[6] = (106 + 155 - 223 + 135 ^ 95 + 10 + 32 + 34);
            Serializer.lIIIlIlIlllIIl[7] = (13 + 124 - 30 + 24 ^ 1 + 121 - 61 + 71);
            Serializer.lIIIlIlIlllIIl[8] = (0x93 ^ 0x9B);
            Serializer.lIIIlIlIlllIIl[9] = (0x5C ^ 0x48 ^ (0x94 ^ 0x89));
            Serializer.lIIIlIlIlllIIl[10] = (0x38 ^ 0x32);
            Serializer.lIIIlIlIlllIIl[11] = (0xCB ^ 0x8C ^ (0x51 ^ 0x1D));
            Serializer.lIIIlIlIlllIIl[12] = (0x5 ^ 0x1D ^ (0xBB ^ 0xAF));
            Serializer.lIIIlIlIlllIIl[13] = (91 + 123 - 129 + 43 ^ 133 + 12 - 18 + 14);
            Serializer.lIIIlIlIlllIIl[14] = (0x1A ^ 0x14);
            Serializer.lIIIlIlIlllIIl[15] = (0x12 ^ 0x2A ^ (0x55 ^ 0x62));
            Serializer.lIIIlIlIlllIIl[16] = (0x51 ^ 0x41);
            Serializer.lIIIlIlIlllIIl[17] = (0x43 ^ 0x2A ^ (0xFF ^ 0x87));
            Serializer.lIIIlIlIlllIIl[18] = (0x24 ^ 0x36);
            Serializer.lIIIlIlIlllIIl[19] = (0x39 ^ 0x5C ^ (0xD4 ^ 0xA2));
            Serializer.lIIIlIlIlllIIl[20] = (0x5C ^ 0x2C ^ (0x5E ^ 0x3A));
            Serializer.lIIIlIlIlllIIl[21] = (0x5B ^ 0x4E);
            Serializer.lIIIlIlIlllIIl[22] = (0x40 ^ 0x56);
            Serializer.lIIIlIlIlllIIl[23] = (0xD0 ^ 0xA4 ^ (0xE3 ^ 0x80));
            Serializer.lIIIlIlIlllIIl[24] = (0x71 ^ 0x69);
            Serializer.lIIIlIlIlllIIl[25] = (0x82 ^ 0xA1 ^ (0x68 ^ 0x52));
            Serializer.lIIIlIlIlllIIl[26] = (0xD9 ^ 0xC3);
            Serializer.lIIIlIlIlllIIl[27] = (0xB1 ^ 0xAA);
            Serializer.lIIIlIlIlllIIl[28] = (0x8 ^ 0x11 ^ (0x35 ^ 0x30));
            Serializer.lIIIlIlIlllIIl[29] = (0xA6 ^ 0xC5 ^ (0xD1 ^ 0xAF));
            Serializer.lIIIlIlIlllIIl[30] = (0x26 ^ 0x38 ^ ((0xDE ^ 0xBE) & ~(0x5F ^ 0x3F)));
            Serializer.lIIIlIlIlllIIl[31] = (0xDA ^ 0xC5);
            Serializer.lIIIlIlIlllIIl[32] = (0x19 ^ 0x3F);
            Serializer.lIIIlIlIlllIIl[33] = -" ".length();
            Serializer.lIIIlIlIlllIIl[34] = (0xE4 ^ 0xC4);
            Serializer.lIIIlIlIlllIIl[35] = (0x9E ^ 0xBF);
            Serializer.lIIIlIlIlllIIl[36] = (0x66 ^ 0x44);
            Serializer.lIIIlIlIlllIIl[37] = (87 + 57 - 126 + 122 ^ 93 + 35 - 47 + 94);
            Serializer.lIIIlIlIlllIIl[38] = (0xCF ^ 0xBD ^ (0x5B ^ 0xD));
            Serializer.lIIIlIlIlllIIl[39] = (0x63 ^ 0x46);
            Serializer.lIIIlIlIlllIIl[40] = (0x54 ^ 0x73);
            Serializer.lIIIlIlIlllIIl[41] = (0x26 ^ 0xE);
            Serializer.lIIIlIlIlllIIl[42] = (0xB9 ^ 0x90);
            Serializer.lIIIlIlIlllIIl[43] = (0x96 ^ 0xBC);
            Serializer.lIIIlIlIlllIIl[44] = (0x21 ^ 0xA);
            Serializer.lIIIlIlIlllIIl[45] = (90 + 42 - 97 + 97 ^ 139 + 146 - 150 + 33);
            Serializer.lIIIlIlIlllIIl[46] = (0x33 ^ 0x1E);
            Serializer.lIIIlIlIlllIIl[47] = (0x5F ^ 0x4B ^ (0xAD ^ 0x97));
            Serializer.lIIIlIlIlllIIl[48] = (34 + 50 - 5 + 101 ^ 29 + 63 - 39 + 102);
            Serializer.lIIIlIlIlllIIl[49] = (0x53 ^ 0x63);
            Serializer.lIIIlIlIlllIIl[50] = (63 + 11 + 63 + 0 ^ 41 + 31 + 111 + 1);
            Serializer.lIIIlIlIlllIIl[51] = (0x79 ^ 0x4B);
            Serializer.lIIIlIlIlllIIl[52] = (0xB7 ^ 0x83 ^ (0x46 ^ 0x41));
            Serializer.lIIIlIlIlllIIl[53] = (0x11 ^ 0x25);
            Serializer.lIIIlIlIlllIIl[54] = (0xC9 ^ 0xB7 ^ (0x5E ^ 0x15));
            Serializer.lIIIlIlIlllIIl[55] = (0x76 ^ 0x52 ^ (0xB8 ^ 0xAA));
            Serializer.lIIIlIlIlllIIl[56] = (0x26 ^ 0x7 ^ (0x80 ^ 0x96));
            Serializer.lIIIlIlIlllIIl[57] = (0x1A ^ 0x22);
            Serializer.lIIIlIlIlllIIl[58] = (0x12 ^ 0x47 ^ (0x4D ^ 0x21));
            Serializer.lIIIlIlIlllIIl[59] = (0xFA ^ 0xC0);
            Serializer.lIIIlIlIlllIIl[60] = (0x1 ^ 0x3A);
            Serializer.lIIIlIlIlllIIl[61] = (0x3A ^ 0x14 ^ (0x5 ^ 0x17));
            Serializer.lIIIlIlIlllIIl[62] = (0x74 ^ 0x49);
            Serializer.lIIIlIlIlllIIl[63] = (0x42 ^ 0x7C);
            Serializer.lIIIlIlIlllIIl[64] = (0x26 ^ 0x55 ^ (0x3E ^ 0x72));
            Serializer.lIIIlIlIlllIIl[65] = (0x5B ^ 0x1B);
            Serializer.lIIIlIlIlllIIl[66] = (0xCA ^ 0x8B);
            Serializer.lIIIlIlIlllIIl[67] = (171 + 54 - 70 + 52 ^ 89 + 24 + 21 + 7);
            Serializer.lIIIlIlIlllIIl[68] = (0x4A ^ 0x9);
            Serializer.lIIIlIlIlllIIl[69] = (0x12 ^ 0x56);
            Serializer.lIIIlIlIlllIIl[70] = (56 + 188 - 120 + 92 ^ 55 + 121 - 51 + 32);
            Serializer.lIIIlIlIlllIIl[71] = (89 + 203 - 80 + 3 ^ 92 + 126 - 205 + 132);
            Serializer.lIIIlIlIlllIIl[72] = (0x26 ^ 0x61);
            Serializer.lIIIlIlIlllIIl[73] = (0x76 ^ 0x3E);
            Serializer.lIIIlIlIlllIIl[74] = (0x76 ^ 0x3F);
            Serializer.lIIIlIlIlllIIl[75] = (0x25 ^ 0xF ^ (0x48 ^ 0x28));
            Serializer.lIIIlIlIlllIIl[76] = (0x41 ^ 0xE ^ (0xBB ^ 0xBF));
            Serializer.lIIIlIlIlllIIl[77] = (0x3F ^ 0x73);
            Serializer.lIIIlIlIlllIIl[78] = (63 + 53 - 56 + 194 ^ 75 + 151 - 134 + 87);
            Serializer.lIIIlIlIlllIIl[79] = (143 + 17 - 148 + 227 ^ 69 + 115 - 43 + 20);
            Serializer.lIIIlIlIlllIIl[80] = (0x69 ^ 0x6D ^ (0xCC ^ 0x87));
            Serializer.lIIIlIlIlllIIl[81] = (0x1F ^ 0x4F);
            Serializer.lIIIlIlIlllIIl[82] = (0x73 ^ 0x22);
            Serializer.lIIIlIlIlllIIl[83] = (0xE7 ^ 0x89 ^ (0x6F ^ 0x53));
            Serializer.lIIIlIlIlllIIl[84] = (0x47 ^ 0x17 ^ "   ".length());
            Serializer.lIIIlIlIlllIIl[85] = (0x13 ^ 0x47);
            Serializer.lIIIlIlIlllIIl[86] = (0xDA ^ 0xAB ^ (0x54 ^ 0x70));
            Serializer.lIIIlIlIlllIIl[87] = (0x18 ^ 0x32 ^ (0xD0 ^ 0xAC));
            Serializer.lIIIlIlIlllIIl[88] = (0xE8 ^ 0xBF);
            Serializer.lIIIlIlIlllIIl[89] = (0x43 ^ 0x3A ^ (0x28 ^ 0x9));
            Serializer.lIIIlIlIlllIIl[90] = (0xBF ^ 0x85 ^ (0x69 ^ 0xA));
            Serializer.lIIIlIlIlllIIl[91] = (0x1F ^ 0x3B ^ (0x37 ^ 0x49));
            Serializer.lIIIlIlIlllIIl[92] = (0xF1 ^ 0xAA);
            Serializer.lIIIlIlIlllIIl[93] = (0xD8 ^ 0x84);
            Serializer.lIIIlIlIlllIIl[94] = (171 + 163 - 213 + 119 ^ 46 + 17 + 70 + 40);
            Serializer.lIIIlIlIlllIIl[95] = (12 + 182 - 170 + 201 ^ 82 + 21 - 54 + 142);
            Serializer.lIIIlIlIlllIIl[96] = (0x36 ^ 0x4E ^ (0x84 ^ 0xA3));
            Serializer.lIIIlIlIlllIIl[97] = (148 + 22 - 23 + 58 ^ 116 + 83 - 130 + 104);
            Serializer.lIIIlIlIlllIIl[98] = (0x33 ^ 0x52);
            Serializer.lIIIlIlIlllIIl[99] = (0xE ^ 0x6C);
            Serializer.lIIIlIlIlllIIl[100] = (0x92 ^ 0xA8 ^ (0x54 ^ 0xD));
            Serializer.lIIIlIlIlllIIl[101] = (101 + 103 - 117 + 121 ^ 115 + 57 - 168 + 176);
            Serializer.lIIIlIlIlllIIl[102] = (0x36 ^ 0x53);
            Serializer.lIIIlIlIlllIIl[103] = (0x2A ^ 0x33 ^ 59 + 5 + 28 + 35);
            Serializer.lIIIlIlIlllIIl[104] = (76 + 128 - 6 + 40 ^ 122 + 79 - 94 + 30);
            Serializer.lIIIlIlIlllIIl[105] = (0x70 ^ 0x18);
            Serializer.lIIIlIlIlllIIl[106] = (0xE5 ^ 0x8C);
            Serializer.lIIIlIlIlllIIl[107] = (70 + 163 - 99 + 39 ^ 171 + 162 - 160 + 26);
            Serializer.lIIIlIlIlllIIl[108] = (0x4 ^ 0x73 ^ (0x2A ^ 0x36));
            Serializer.lIIIlIlIlllIIl[109] = (0x26 ^ 0x4A);
            Serializer.lIIIlIlIlllIIl[110] = (0xE9 ^ 0xAC ^ (0xA7 ^ 0x8F));
            Serializer.lIIIlIlIlllIIl[111] = (0x81 ^ 0xB0 ^ (0x9 ^ 0x56));
            Serializer.lIIIlIlIlllIIl[112] = (0x19 ^ 0x76);
            Serializer.lIIIlIlIlllIIl[113] = (0xF ^ 0x62 ^ (0x44 ^ 0x59));
            Serializer.lIIIlIlIlllIIl[114] = (0xBA ^ 0xC1 ^ (0x23 ^ 0x29));
            Serializer.lIIIlIlIlllIIl[115] = (0x91 ^ 0x8C ^ (0x48 ^ 0x27));
            Serializer.lIIIlIlIlllIIl[116] = (0x38 ^ 0x4B);
            Serializer.lIIIlIlIlllIIl[117] = (0xD3 ^ 0xA7);
            Serializer.lIIIlIlIlllIIl[118] = (82 + 3 - 2 + 151 ^ 120 + 39 - 73 + 73);
            Serializer.lIIIlIlIlllIIl[119] = (0x18 ^ 0x4E ^ (0x59 ^ 0x79));
            Serializer.lIIIlIlIlllIIl[120] = (0xC1 ^ 0xB6);
            Serializer.lIIIlIlIlllIIl[121] = (0xEF ^ 0x97);
            Serializer.lIIIlIlIlllIIl[122] = (40 + 35 - 32 + 151 ^ 70 + 59 - 32 + 90);
            Serializer.lIIIlIlIlllIIl[123] = (0x4C ^ 0x36);
            Serializer.lIIIlIlIlllIIl[124] = (164 + 165 - 280 + 142 ^ 155 + 64 - 111 + 88);
            Serializer.lIIIlIlIlllIIl[125] = (0x38 ^ 0x44);
            Serializer.lIIIlIlIlllIIl[126] = (0x2C ^ 0x51);
            Serializer.lIIIlIlIlllIIl[127] = (0xEC ^ 0x9A ^ (0x39 ^ 0x31));
            Serializer.lIIIlIlIlllIIl[128] = 43 + 103 - 109 + 90;
            Serializer.lIIIlIlIlllIIl[129] = (0x5 ^ 0x79) + (0xEC ^ 0xC0) - (32 + 83 - 93 + 127) + (0xE1 ^ 0x8C);
            Serializer.lIIIlIlIlllIIl[130] = (0xBB ^ 0x9C) + (0x3A ^ 0x43) - (0x7B ^ 0x64) + ((0x63 ^ 0x29) & ~(0x5A ^ 0x10));
            Serializer.lIIIlIlIlllIIl[131] = (0xF6 ^ 0x92) + (0x73 ^ 0x6A) - (0x78 ^ 0x1F) + (0x2 ^ 0x6E);
            Serializer.lIIIlIlIlllIIl[132] = 58 + 72 - 77 + 78;
            Serializer.lIIIlIlIlllIIl[133] = 109 + 60 - 108 + 71;
            Serializer.lIIIlIlIlllIIl[134] = (0x1A ^ 0xA) + (0x1C ^ 0x58) - -(0x9F ^ 0x97) + (0xBD ^ 0x94);
            Serializer.lIIIlIlIlllIIl[135] = 35 + 86 - 118 + 131;
            Serializer.lIIIlIlIlllIIl[136] = 15 + 72 - 51 + 99;
            Serializer.lIIIlIlIlllIIl[137] = (0x2F ^ 0xB) + (0xC7 ^ 0x94) - (0x8B ^ 0x98) + (0x96 ^ 0xB2);
            Serializer.lIIIlIlIlllIIl[138] = (0x20 ^ 0x12) + (0x73 ^ 0x63) - -(0x84 ^ 0xA0) + (0x3D ^ 0x1E);
            Serializer.lIIIlIlIlllIIl[139] = (0xE6 ^ 0xC6) + (0x62 ^ 0x6C) - (0xB6 ^ 0xB8) + (0x61 ^ 0xB);
            Serializer.lIIIlIlIlllIIl[140] = (0x18 ^ 0x5B) + (0xB0 ^ 0xA6) - -(0x15 ^ 0x1A) + (0x21 ^ 0x2);
            Serializer.lIIIlIlIlllIIl[141] = (0x83 ^ 0x84) + (0xC ^ 0x38) - (0x7F ^ 0x51) + (92 + 4 + 15 + 16);
            Serializer.lIIIlIlIlllIIl[142] = 55 + 135 - 139 + 90;
            Serializer.lIIIlIlIlllIIl[143] = 123 + 94 - 202 + 127;
            Serializer.lIIIlIlIlllIIl[144] = (0x56 ^ 0x1A) + (70 + 84 - 143 + 122) - (72 + 86 - 133 + 119) + (0x5A ^ 0x14);
            Serializer.lIIIlIlIlllIIl[145] = 105 + 30 - 30 + 39;
            Serializer.lIIIlIlIlllIIl[146] = 128 + 43 - 68 + 42;
            Serializer.lIIIlIlIlllIIl[147] = (0xD4 ^ 0xB2) + (0x6C ^ 0x63) - (0x5F ^ 0x3C) + (36 + 107 - 126 + 111);
            Serializer.lIIIlIlIlllIIl[148] = 101 + 8 + 8 + 30;
            Serializer.lIIIlIlIlllIIl[149] = 53 + 115 - 141 + 121;
            Serializer.lIIIlIlIlllIIl[150] = (0xE1 ^ 0xC1) + (0x4 ^ 0x67) - -(0xA2 ^ 0xAE) + (0xB9 ^ 0xBF);
            Serializer.lIIIlIlIlllIIl[151] = 123 + 10 - 60 + 77;
            Serializer.lIIIlIlIlllIIl[152] = (0xD5 ^ 0xBF) + (0xAE ^ 0xB8) - (0xDB ^ 0xC6) + (0x16 ^ 0x22);
            Serializer.lIIIlIlIlllIIl[153] = 32 + 97 - 14 + 37;
            Serializer.lIIIlIlIlllIIl[154] = 37 + 123 - 105 + 82 + (0x41 ^ 0x58) - (0x18 ^ 0x26) + (0x96 ^ 0xA3);
            Serializer.lIIIlIlIlllIIl[155] = (0xDC ^ 0x9B) + (118 + 90 - 140 + 72) - (47 + 53 + 54 + 42) + (103 + 75 - 55 + 16);
            Serializer.lIIIlIlIlllIIl[156] = (0x17 ^ 0x1C) + (0x41 ^ 0x2A) - (0x6B ^ 0x71) + (0xB2 ^ 0x8D);
            Serializer.lIIIlIlIlllIIl[157] = (0xBC ^ 0x99) + (0x5E ^ 0x1B) - (0x98 ^ 0xA6) + (0x15 ^ 0x65);
        }
        
        private static boolean llIIIIIlIlllIlI(final int lllllllllllllIlIIIIllIIIlIIIIlll, final int lllllllllllllIlIIIIllIIIlIIIIllI) {
            return lllllllllllllIlIIIIllIIIlIIIIlll < lllllllllllllIlIIIIllIIIlIIIIllI;
        }
        
        public JsonElement serialize(final Factory lllllllllllllIlIIIIllIIIlllIIIlI, final Type lllllllllllllIlIIIIllIIIlllIIIIl, final JsonSerializationContext lllllllllllllIlIIIIllIIIlllIIIII) {
            final JsonObject lllllllllllllIlIIIIllIIIllIlllll = new JsonObject();
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[79]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.coordinateScale);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[80]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.heightScale);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[81]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.lowerLimitScale);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[82]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.upperLimitScale);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[83]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.depthNoiseScaleX);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[84]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.depthNoiseScaleZ);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[85]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.depthNoiseScaleExponent);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[86]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.mainNoiseScaleX);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[87]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.mainNoiseScaleY);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[88]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.mainNoiseScaleZ);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[89]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.baseSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[90]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.stretchY);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[91]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.biomeDepthWeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[92]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.biomeDepthOffset);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[93]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.biomeScaleWeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[94]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.biomeScaleOffset);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[95]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.seaLevel);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[96]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useCaves));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[97]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useDungeons));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[98]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dungeonChance);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[99]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useStrongholds));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[100]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useVillages));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[101]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useMineShafts));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[102]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useTemples));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[103]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useMonuments));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[104]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useRavines));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[105]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useWaterLakes));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[106]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.waterLakeChance);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[107]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useLavaLakes));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[108]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.lavaLakeChance);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[109]], Boolean.valueOf(lllllllllllllIlIIIIllIIIlllIIIlI.useLavaOceans));
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[110]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.fixedBiome);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[111]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.biomeSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[112]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.riverSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[113]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dirtSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[114]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dirtCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[115]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dirtMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[116]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dirtMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[117]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.gravelSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[118]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.gravelCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[119]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.gravelMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[120]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.gravelMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[121]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.graniteSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[122]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.graniteCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[123]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.graniteMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[124]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.graniteMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[125]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dioriteSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[126]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dioriteCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[127]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dioriteMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[128]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.dioriteMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[129]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.andesiteSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[130]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.andesiteCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[131]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.andesiteMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[132]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.andesiteMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[133]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.coalSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[134]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.coalCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[135]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.coalMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[136]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.coalMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[137]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.ironSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[138]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.ironCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[139]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.ironMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[140]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.ironMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[141]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.goldSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[142]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.goldCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[143]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.goldMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[144]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.goldMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[145]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.redstoneSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[146]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.redstoneCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[147]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.redstoneMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[148]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.redstoneMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[149]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.diamondSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[150]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.diamondCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[151]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.diamondMinHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[152]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.diamondMaxHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[153]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.lapisSize);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[154]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.lapisCount);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[155]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.lapisCenterHeight);
            lllllllllllllIlIIIIllIIIllIlllll.addProperty(Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[156]], (Number)lllllllllllllIlIIIIllIIIlllIIIlI.lapisSpread);
            return (JsonElement)lllllllllllllIlIIIIllIIIllIlllll;
        }
        
        static {
            llIIIIIlIlllIIl();
            llIIIIIIlllIIlI();
        }
        
        private static boolean llIIIIIlIlllIll(final int lllllllllllllIlIIIIllIIIlIIIlIll, final int lllllllllllllIlIIIIllIIIlIIIlIlI) {
            return lllllllllllllIlIIIIllIIIlIIIlIll >= lllllllllllllIlIIIIllIIIlIIIlIlI;
        }
        
        private static String llIIIIIIlIIlIlI(final String lllllllllllllIlIIIIllIIIlIlIlIll, final String lllllllllllllIlIIIIllIIIlIlIlIII) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIllIIIlIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIIIlIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                final Cipher lllllllllllllIlIIIIllIIIlIlIllIl = Cipher.getInstance("Blowfish");
                lllllllllllllIlIIIIllIIIlIlIllIl.init(Serializer.lIIIlIlIlllIIl[2], lllllllllllllIlIIIIllIIIlIlIlllI);
                return new String(lllllllllllllIlIIIIllIIIlIlIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIIIlIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIllIIIlIlIllII) {
                lllllllllllllIlIIIIllIIIlIlIllII.printStackTrace();
                return null;
            }
        }
        
        private static void llIIIIIIlllIIlI() {
            (lIIIlIlIIIlllI = new String[Serializer.lIIIlIlIlllIIl[157]])[Serializer.lIIIlIlIlllIIl[0]] = llIIIIIIlIIlIlI("/OoWTFk6irV3YqwGeGo/6Q==", "rTYAk");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[1]] = llIIIIIIlIIlIll("3zUwwunqRq+/rMGyr5eNZg==", "JBOCo");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[2]] = llIIIIIIlIIllII("OT09NyYZOyc7IAYxKz4x", "URJRT");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[3]] = llIIIIIIlIIlIll("OLso0EunFNtXElNQqkTT9A==", "LUhgT");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[4]] = llIIIIIIlIIlIlI("fk8rHzeTz0R3wg9LbxXKU25gq2bvBYj9", "BIYEG");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[5]] = llIIIIIIlIIlIlI("q00KDe39nA5NEND2giBXeBlPR8xLRUZs", "AMVbp");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[6]] = llIIIIIIlIIlIlI("A0qhbnTkkUxz7DQ+Dn6gv1QIviORo0kv", "VnkXf");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[7]] = llIIIIIIlIIlIlI("KLOQBD3pGUtkGg+BuAbtbA==", "auMct");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[8]] = llIIIIIIlIIllII("LBUjDAUuHTkHGCIVJgcS", "AtJbK");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[9]] = llIIIIIIlIIlIll("7sstPSaWf81ynsHbQzvVZw==", "bHRGn");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[10]] = llIIIIIIlIIlIll("prdEyQ0vTlOHnwHfP8XPeg==", "cKlgz");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[11]] = llIIIIIIlIIlIll("tj44KMy8RdAKWNEEnXUkpA==", "SeteS");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[12]] = llIIIIIIlIIlIll("WzKTkJHqIYrOyM97UCH0h+eJVA6+un2i", "XTNBI");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[13]] = llIIIIIIlIIlIll("mglUPOkyI74zTt1oXaLDxYeiCaZGUduw", "AwOIu");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[14]] = llIIIIIIlIIlIll("x10GcqoNfeHZ2XcBHelYQ5BEjsNpYfto", "CLanK");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[15]] = llIIIIIIlIIlIll("Wmx3qos/xS6DSpjAdokdsyynJ2FDS3JI", "BVeMp");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[16]] = llIIIIIIlIIllII("PQ44AjY4DjU=", "NkYNS");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[17]] = llIIIIIIlIIlIll("Int4y7yWrejHhgxm2GGjDg==", "tCsNa");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[18]] = llIIIIIIlIIllII("HSARLwYGNBEEHRs=", "hStks");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[19]] = llIIIIIIlIIlIll("wSbdj9BtVDKw9EumSRAQ2A==", "QHGgZ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[20]] = llIIIIIIlIIlIll("CF16jULJ2gTlqjd4Eb8Big==", "GjHWZ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[21]] = llIIIIIIlIIlIll("vevxudODxTUNapTJroYSAg==", "POMxy");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[22]] = llIIIIIIlIIllII("GRkqBD8CDxwhNwoePA==", "ljOIV");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[23]] = llIIIIIIlIIlIll("z3hVMjYEogcHFUKS+Koehg==", "BKjzJ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[24]] = llIIIIIIlIIllII("ER4LIj8KGAMKPhAe", "dmnoP");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[25]] = llIIIIIIlIIlIll("D4Xfe9pUbfJkovGkaSRMxQ==", "TAsuB");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[26]] = llIIIIIIlIIllII("PhgoBiA/Dj8dICAOPg==", "KkMQA");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[27]] = llIIIIIIlIIllII("JDcEDDUfNxsMBDs3Hgoi", "SVpiG");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[28]] = llIIIIIIlIIlIlI("/bMxLpRvvwOuTLbB2jYrcQ==", "daygA");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[29]] = llIIIIIIlIIlIll("T1EeHpmiWlXiDX7g3UPn6g==", "rWvYA");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[30]] = llIIIIIIlIIlIll("JI+Xo9j6M0BkIMYvR2w12w==", "pKlTO");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[31]] = llIIIIIIlIIlIll("zlY/s+cAj6BL4qPd6eWC2w==", "AAAvE");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[34]] = llIIIIIIlIIllII("FiMEKiInIxEi", "tJkGG");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[35]] = llIIIIIIlIIlIlI("SQHD8qwQu9XGUYxydX6duQ==", "QgpZx");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[36]] = llIIIIIIlIIllII("Jy8IESQqPB8=", "CFzew");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[37]] = llIIIIIIlIIlIlI("cfBy93Qzcz+xfzgg05CEQw==", "cMdsy");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[38]] = llIIIIIIlIIlIll("f0zXrSbOKdcvvFIVCexRiQ==", "Thwvz");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[39]] = llIIIIIIlIIlIlI("qkskV6ohiFnngYQpOsVScA==", "Pozss");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[32]] = llIIIIIIlIIlIlI("Jv0cbX7XeEmA7qHarEeCrQ==", "JsbJI");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[40]] = llIIIIIIlIIlIll("WFa0rEZrhJoEn9fspy2y8g==", "fcUIB");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[41]] = llIIIIIIlIIlIll("uSsXORs4SIZflxm//692fw==", "efZsO");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[42]] = llIIIIIIlIIlIll("rG1bQa5NG/Y142uNO7bZiw==", "Sqbqd");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[43]] = llIIIIIIlIIlIll("3vFF9hEW2u0B8XexdokGCg==", "IipQI");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[44]] = llIIIIIIlIIlIlI("IT9Tx2D0EnEZlY870exDZQ==", "TTcLj");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[45]] = llIIIIIIlIIlIlI("r5JR3o+70wb54tYsNudLBydrvryaJ1Ku", "SXoyt");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[46]] = llIIIIIIlIIlIll("Ob5asfBMGLBEOs1sjNuJ7ZS9g+u/gNl0", "DLnaL");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[47]] = llIIIIIIlIIlIll("KtBmzJAlwaHsNaeI3JU+ow==", "aSvzx");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[48]] = llIIIIIIlIIlIlI("YIIdvwYSYwgzMxbdSwPqIQ==", "nubMs");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[49]] = llIIIIIIlIIlIll("erAse8/Q0XUEV4lo208Aboeua0ewrZ5a", "ZVkDl");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[50]] = llIIIIIIlIIlIlI("1aULk38U5pqKdp68h5rtRQZBf+/TssBI", "sybKU");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[51]] = llIIIIIIlIIlIlI("cLDe/WfGaSBIkFNBQCN2qg==", "LGUnS");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[52]] = llIIIIIIlIIlIll("R+1jpSrhvgxlaNf8SyY+Yw==", "sSVdi");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[53]] = llIIIIIIlIIlIll("xb/43hrKue3Z9kmvVR7McEN8B/CTJ9Hv", "kesBl");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[54]] = llIIIIIIlIIlIll("va8b+yB/7HsqgAXq97K8HnyhNVDNdjxD", "BwefF");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[55]] = llIIIIIIlIIlIlI("/qJ0OW0ZrOWKtKMZZhiZlg==", "GkZDs");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[56]] = llIIIIIIlIIlIll("XhByZQz6YT8ZHNjIrIffNg==", "Ryuxr");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[57]] = llIIIIIIlIIlIll("eq1BQM8oMGkRYE/k+dCjmg==", "wtaGx");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[58]] = llIIIIIIlIIllII("FQ4MBiEXGSUPBREJGQ==", "vamjl");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[59]] = llIIIIIIlIIlIlI("2ltSblqDtjz5iuLEr4O1Bw==", "OMXvO");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[60]] = llIIIIIIlIIlIlI("0b7dKhFLrCty4PKhxKgfHg==", "uHhPJ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[61]] = llIIIIIIlIIlIlI("kacWKUW5GFihmqkqVOpKEQ==", "grJWT");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[62]] = llIIIIIIlIIllII("LCU9FzkkLxocHSI/Jg==", "EWRyt");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[63]] = llIIIIIIlIIllII("KAI1IiYmFzw=", "OmYFu");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[64]] = llIIIIIIlIIlIll("LFaD9swnyzN3X+mFdBRQCw==", "BNEQS");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[65]] = llIIIIIIlIIllII("KwMULyUlAjAuASsEDA==", "LlxKh");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[66]] = llIIIIIIlIIllII("Ezw6KxkVKx4qPRM7Ig==", "tSVOT");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[67]] = llIIIIIIlIIlIlI("ZKIIEEKmtfCx1ANUHtrYsA==", "BRrpk");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[68]] = llIIIIIIlIIlIlI("yZ6NTgTG8NAXnHXQkhV6fQ==", "HTxgW");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[69]] = llIIIIIIlIIllII("OysoOR0mICkHACcGKSMOITo=", "INLJi");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[70]] = llIIIIIIlIIllII("BgYrNiEbDSoINAwrKiwyHBc=", "tcOEU");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[71]] = llIIIIIIlIIlIlI("74RHzfUKBX/toefKlw4LTg==", "LPtuV");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[72]] = llIIIIIIlIIlIll("mmNBsYlG4Hcy94BIUkx9JQ==", "ReAgj");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[73]] = llIIIIIIlIIllII("IQMtJAgrDgEgCQ0PJS4PMQ==", "EjLIg");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[74]] = llIIIIIIlIIllII("LB8CJRomEi4pDQATCi8dPA==", "HvcHu");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[75]] = llIIIIIIlIIllII("DxMmIBcwGyws", "crVId");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[76]] = llIIIIIIlIIllII("FQgDHAo6BgYbDQ==", "yisuy");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[77]] = llIIIIIIlIIlIll("2Z0GRJTMkH6ofx2fD7fN7S3jio9G7K08", "kYmVa");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[78]] = llIIIIIIlIIlIll("Nlhzcc9/Crvul3Azf+pw2w==", "RHZzG");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[79]] = llIIIIIIlIIllII("IgQZCCcoBRcOJhIIFxYm", "AkvzC");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[80]] = llIIIIIIlIIlIlI("j+cGSCWyKC3H0TnwPIS9Nw==", "iWbqJ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[81]] = llIIIIIIlIIlIlI("GgYm4Pn0K56MCtCQc9s5gw==", "DvKfF");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[82]] = llIIIIIIlIIlIlI("hg3i8JQ5Q74DFpuiSQLJww==", "WDvjt");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[83]] = llIIIIIIlIIlIll("FXHxLGfLn1oeeiVDa+L/sDXud9ikEVLQ", "shfoh");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[84]] = llIIIIIIlIIllII("MTM0JCYbOS0jKwY1JTwrDw==", "UVDPN");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[85]] = llIIIIIIlIIllII("Dg4TPwEkBAo4DDkIAicMLxMTJAcPBRc=", "jkcKi");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[86]] = llIIIIIIlIIllII("GDk9KiUaMSchOBY5OCEz", "uXTDk");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[87]] = llIIIIIIlIIlIll("tGVILEBeDJB6Mxo1siw/sg==", "WlPgo");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[88]] = llIIIIIIlIIllII("PzArFwo9ODEcFzEwLhwe", "RQByD");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[89]] = llIIIIIIlIIlIlI("Q9hGITW71nkDKPNOjLPjbA==", "icZfj");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[90]] = llIIIIIIlIIllII("Hj0XMBAOITw=", "mIeUd");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[91]] = llIIIIIIlIIlIlI("+BiDued/mUqhPGMagfP13rdFsbWbKjBS", "AmcCA");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[92]] = llIIIIIIlIIllII("NBgdIgoSFAI7BxkXFDwKIg==", "VqrOo");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[93]] = llIIIIIIlIIlIlI("56mUoCkozJKtZL0wPuI0l7p+JyMVkBm0", "vlkXV");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[94]] = llIIIIIIlIIlIlI("cZT6Jky/kkpWcHjKjFwJKTH/Lb/mzj3j", "XxSkP");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[95]] = llIIIIIIlIIlIll("YegIxrj0bfZ2NLRca8IzrA==", "gmIWE");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[96]] = llIIIIIIlIIllII("ATogJzcCLDY=", "tIEdV");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[97]] = llIIIIIIlIIlIlI("aDVYTCWSCnZ8MsDs9IhgWA==", "COvIf");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[98]] = llIIIIIIlIIlIll("tLnxYKViI3Jfpu1sKyQ/UA==", "wAdSv");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[99]] = llIIIIIIlIIlIll("GavhpvNK63AIVhVAVixPyQ==", "xnVny");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[100]] = llIIIIIIlIIlIll("HNqclzWXCKwFkFsKVAVaLQ==", "vlHTp");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[101]] = llIIIIIIlIIlIlI("NftNaw23FVYNZs01JtKUFQ==", "cWEso");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[102]] = llIIIIIIlIIlIlI("7YmF7qhqC2Kx+aVJ6ocsSw==", "mPfCw");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[103]] = llIIIIIIlIIlIll("E1JJWbt7NsZD7GPZsq7npw==", "pbAGb");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[104]] = llIIIIIIlIIlIll("JLBMHYzpbuDChXK8omryKA==", "CIVNu");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[105]] = llIIIIIIlIIlIll("18ewWdAR2RC7PERgyn5eEg==", "jsykv");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[106]] = llIIIIIIlIIllII("AiouKj85KjEqDh0qNCwo", "uKZOM");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[107]] = llIIIIIIlIIllII("HhUPOTIdByYUOA4V", "kfjuS");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[108]] = llIIIIIIlIIlIll("HqvidPMlXe5Y1DPTXVzcnw==", "BWAvI");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[109]] = llIIIIIIlIIllII("AiMVAycBMT8sIxY+Aw==", "wPpOF");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[110]] = llIIIIIIlIIllII("NQg9FycRCCofJg==", "SaErC");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[111]] = llIIIIIIlIIlIll("ICii83xYBj20n5DoI3iMPA==", "NsMQG");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[112]] = llIIIIIIlIIllII("HzAXADg+MBsA", "mYaeJ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[113]] = llIIIIIIlIIlIll("5VtdeKYfsdKzYWgtz6NjwQ==", "UTETz");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[114]] = llIIIIIIlIIlIlI("ruJXgAeaRGDtL0PBGPYHQA==", "Vedbd");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[115]] = llIIIIIIlIIllII("Cwo3BxQGDQ0WMAgLMQ==", "ocEsY");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[116]] = llIIIIIIlIIlIll("+rjhKc3VJerhjKdOYWFAtw==", "IKoNn");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[117]] = llIIIIIIlIIlIlI("NMoG9yFK2ozAsA7Q4/4ZdA==", "YLCra");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[118]] = llIIIIIIlIIllII("NAEEDBQ/MAoPHyc=", "Ssezq");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[119]] = llIIIIIIlIIlIlI("AqV/zVBoQEYqJGtRUR/ORg==", "ojYzc");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[120]] = llIIIIIIlIIllII("AjUFPyQJCgUxCQAuAyE1", "eGdIA");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[121]] = llIIIIIIlIIlIlI("u33jXCV2QGkXceIScuV2Yg==", "CMFQI");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[122]] = llIIIIIIlIIlIll("NtQej9P0/3//kIKmH6ZR+Q==", "BWDua");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[123]] = llIIIIIIlIIlIll("8PwyabuTWOiAZb2SE/fhjF3hhirTSAas", "jvDAb");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[124]] = llIIIIIIlIIlIlI("Ckspa4JSp1+hEJ9+XJIVjf9RLWFYkWyg", "MwjVw");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[125]] = llIIIIIIlIIlIlI("UMSfcmXM1xJTzh1+QEwVIw==", "ckXlD");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[126]] = llIIIIIIlIIlIll("T6SVdS210X3U88wqW1qEfA==", "MicvB");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[127]] = llIIIIIIlIIllII("PiweECAuIDwLJxIgGAUhLg==", "ZEqbI");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[128]] = llIIIIIIlIIllII("KTwLNQE5MCkmEAUwDSAAOQ==", "MUdGh");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[129]] = llIIIIIIlIIlIlI("BHL4T/5JbUKGWf+J6qAGIA==", "lmjaU");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[130]] = llIIIIIIlIIlIll("BFIHZnPpvrsGA9qyAkxXJg==", "cZHwm");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[131]] = llIIIIIIlIIlIlI("4jjMz7ZlHeBRdLnk6fu3iOhCGRj6/tx0", "VPPPH");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[132]] = llIIIIIIlIIlIlI("g4d3gj8DKLJl7kQADMVkh6zgnizRaCsQ", "UvqVu");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[133]] = llIIIIIIlIIlIlI("4rnEpXZ5hXpzBNgXcbwbtA==", "jLPiC");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[134]] = llIIIIIIlIIlIll("PKujtWHL/uj7U7S7zx9pLA==", "sVxvB");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[135]] = llIIIIIIlIIllII("GSAwCAATIRkBJB0nJQ==", "zOQdM");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[136]] = llIIIIIIlIIlIll("/IXN9gpz7u4qLj96szOlXw==", "Bucvn");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[137]] = llIIIIIIlIIlIlI("3dj2rK18UggNghVthaR0lA==", "RbWyG");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[138]] = llIIIIIIlIIlIlI("AxJEoTL/evcYnBqUs1C9JA==", "cfnLO");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[139]] = llIIIIIIlIIlIll("rDbP/jE86mOLXquNmY8L+w==", "gsLap");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[140]] = llIIIIIIlIIlIll("RgUTOFtFzxkUg4YPjtsc/g==", "ZnXqC");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[141]] = llIIIIIIlIIllII("IRstCiUvDiQ=", "FtAnv");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[142]] = llIIIIIIlIIlIll("uJMKDfp4D/BCMbR5DsssXg==", "sMgQd");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[143]] = llIIIIIIlIIlIlI("qLoohSGRsmxre0V4UfSuFA==", "TUUuc");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[144]] = llIIIIIIlIIlIlI("LQX2+3dRUrtEj6xKmidtLQ==", "OlyQp");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[145]] = llIIIIIIlIIlIll("SiujvA8fkanSp1+qG+RUBw==", "zYheE");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[146]] = llIIIIIIlIIlIlI("J9EgKc2Af8gv8hQBhIXZgw==", "RHIca");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[147]] = llIIIIIIlIIlIlI("OBRkgeTVodQVDQB0YGuDFjsnKznxONmt", "TpJoW");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[148]] = llIIIIIIlIIlIlI("/ZgNpq0HtwQH9B0sUbVyMFQodvcjnwnE", "wTHmd");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[149]] = llIIIIIIlIIlIlI("cjujsugJy/jDiC+DtIUM5g==", "THgdi");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[150]] = llIIIIIIlIIlIll("U71OCIsNotZWb3JpRgNgOg==", "xwXrA");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[151]] = llIIIIIIlIIlIlI("9qCXVA/9w2CSvUATFYRWXdZSUP0aR935", "SGCgM");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[152]] = llIIIIIIlIIlIlI("IXCPekpXR2K426B1ISrtaP/AwjmcNGQv", "jIXZS");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[153]] = llIIIIIIlIIllII("OBMYECIHGxIc", "TrhyQ");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[154]] = llIIIIIIlIIlIlI("eJaFXtalBgv9aEbsBIsnNQ==", "kwnog");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[155]] = llIIIIIIlIIlIlI("MeRsZsTMlypz+LyZuUcSykisBLgpVC3k", "VJKVd");
            Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[156]] = llIIIIIIlIIllII("HCYYKD4jNxokLBQ=", "pGhAM");
        }
        
        public Factory deserialize(final JsonElement lllllllllllllIlIIIIllIIIlllIlllI, final Type lllllllllllllIlIIIIllIIIlllIllIl, final JsonDeserializationContext lllllllllllllIlIIIIllIIIlllIllII) throws JsonParseException {
            final JsonObject lllllllllllllIlIIIIllIIIlllIlIll = lllllllllllllIlIIIIllIIIlllIlllI.getAsJsonObject();
            final Factory lllllllllllllIlIIIIllIIIlllIlIlI = new Factory();
            try {
                lllllllllllllIlIIIIllIIIlllIlIlI.coordinateScale = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[0]], lllllllllllllIlIIIIllIIIlllIlIlI.coordinateScale);
                lllllllllllllIlIIIIllIIIlllIlIlI.heightScale = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[1]], lllllllllllllIlIIIIllIIIlllIlIlI.heightScale);
                lllllllllllllIlIIIIllIIIlllIlIlI.lowerLimitScale = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[2]], lllllllllllllIlIIIIllIIIlllIlIlI.lowerLimitScale);
                lllllllllllllIlIIIIllIIIlllIlIlI.upperLimitScale = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[3]], lllllllllllllIlIIIIllIIIlllIlIlI.upperLimitScale);
                lllllllllllllIlIIIIllIIIlllIlIlI.depthNoiseScaleX = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[4]], lllllllllllllIlIIIIllIIIlllIlIlI.depthNoiseScaleX);
                lllllllllllllIlIIIIllIIIlllIlIlI.depthNoiseScaleZ = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[5]], lllllllllllllIlIIIIllIIIlllIlIlI.depthNoiseScaleZ);
                lllllllllllllIlIIIIllIIIlllIlIlI.depthNoiseScaleExponent = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[6]], lllllllllllllIlIIIIllIIIlllIlIlI.depthNoiseScaleExponent);
                lllllllllllllIlIIIIllIIIlllIlIlI.mainNoiseScaleX = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[7]], lllllllllllllIlIIIIllIIIlllIlIlI.mainNoiseScaleX);
                lllllllllllllIlIIIIllIIIlllIlIlI.mainNoiseScaleY = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[8]], lllllllllllllIlIIIIllIIIlllIlIlI.mainNoiseScaleY);
                lllllllllllllIlIIIIllIIIlllIlIlI.mainNoiseScaleZ = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[9]], lllllllllllllIlIIIIllIIIlllIlIlI.mainNoiseScaleZ);
                lllllllllllllIlIIIIllIIIlllIlIlI.baseSize = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[10]], lllllllllllllIlIIIIllIIIlllIlIlI.baseSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.stretchY = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[11]], lllllllllllllIlIIIIllIIIlllIlIlI.stretchY);
                lllllllllllllIlIIIIllIIIlllIlIlI.biomeDepthWeight = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[12]], lllllllllllllIlIIIIllIIIlllIlIlI.biomeDepthWeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.biomeDepthOffset = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[13]], lllllllllllllIlIIIIllIIIlllIlIlI.biomeDepthOffset);
                lllllllllllllIlIIIIllIIIlllIlIlI.biomeScaleWeight = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[14]], lllllllllllllIlIIIIllIIIlllIlIlI.biomeScaleWeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.biomeScaleOffset = JsonUtils.getFloat(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[15]], lllllllllllllIlIIIIllIIIlllIlIlI.biomeScaleOffset);
                lllllllllllllIlIIIIllIIIlllIlIlI.seaLevel = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[16]], lllllllllllllIlIIIIllIIIlllIlIlI.seaLevel);
                lllllllllllllIlIIIIllIIIlllIlIlI.useCaves = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[17]], lllllllllllllIlIIIIllIIIlllIlIlI.useCaves);
                lllllllllllllIlIIIIllIIIlllIlIlI.useDungeons = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[18]], lllllllllllllIlIIIIllIIIlllIlIlI.useDungeons);
                lllllllllllllIlIIIIllIIIlllIlIlI.dungeonChance = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[19]], lllllllllllllIlIIIIllIIIlllIlIlI.dungeonChance);
                lllllllllllllIlIIIIllIIIlllIlIlI.useStrongholds = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[20]], lllllllllllllIlIIIIllIIIlllIlIlI.useStrongholds);
                lllllllllllllIlIIIIllIIIlllIlIlI.useVillages = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[21]], lllllllllllllIlIIIIllIIIlllIlIlI.useVillages);
                lllllllllllllIlIIIIllIIIlllIlIlI.useMineShafts = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[22]], lllllllllllllIlIIIIllIIIlllIlIlI.useMineShafts);
                lllllllllllllIlIIIIllIIIlllIlIlI.useTemples = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[23]], lllllllllllllIlIIIIllIIIlllIlIlI.useTemples);
                lllllllllllllIlIIIIllIIIlllIlIlI.useMonuments = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[24]], lllllllllllllIlIIIIllIIIlllIlIlI.useMonuments);
                lllllllllllllIlIIIIllIIIlllIlIlI.useRavines = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[25]], lllllllllllllIlIIIIllIIIlllIlIlI.useRavines);
                lllllllllllllIlIIIIllIIIlllIlIlI.useWaterLakes = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[26]], lllllllllllllIlIIIIllIIIlllIlIlI.useWaterLakes);
                lllllllllllllIlIIIIllIIIlllIlIlI.waterLakeChance = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[27]], lllllllllllllIlIIIIllIIIlllIlIlI.waterLakeChance);
                lllllllllllllIlIIIIllIIIlllIlIlI.useLavaLakes = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[28]], lllllllllllllIlIIIIllIIIlllIlIlI.useLavaLakes);
                lllllllllllllIlIIIIllIIIlllIlIlI.lavaLakeChance = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[29]], lllllllllllllIlIIIIllIIIlllIlIlI.lavaLakeChance);
                lllllllllllllIlIIIIllIIIlllIlIlI.useLavaOceans = JsonUtils.getBoolean(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[30]], lllllllllllllIlIIIIllIIIlllIlIlI.useLavaOceans);
                lllllllllllllIlIIIIllIIIlllIlIlI.fixedBiome = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[31]], lllllllllllllIlIIIIllIIIlllIlIlI.fixedBiome);
                if (llIIIIIlIlllIlI(lllllllllllllIlIIIIllIIIlllIlIlI.fixedBiome, Serializer.lIIIlIlIlllIIl[32]) && llIIIIIlIlllIll(lllllllllllllIlIIIIllIIIlllIlIlI.fixedBiome, Serializer.lIIIlIlIlllIIl[33])) {
                    if (llIIIIIlIlllIll(lllllllllllllIlIIIIllIIIlllIlIlI.fixedBiome, BiomeGenBase.hell.biomeID)) {
                        final Factory factory = lllllllllllllIlIIIIllIIIlllIlIlI;
                        factory.fixedBiome += Serializer.lIIIlIlIlllIIl[2];
                        "".length();
                        if ("   ".length() != "   ".length()) {
                            return null;
                        }
                    }
                }
                else {
                    lllllllllllllIlIIIIllIIIlllIlIlI.fixedBiome = Serializer.lIIIlIlIlllIIl[33];
                }
                lllllllllllllIlIIIIllIIIlllIlIlI.biomeSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[34]], lllllllllllllIlIIIIllIIIlllIlIlI.biomeSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.riverSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[35]], lllllllllllllIlIIIIllIIIlllIlIlI.riverSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.dirtSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[36]], lllllllllllllIlIIIIllIIIlllIlIlI.dirtSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.dirtCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[37]], lllllllllllllIlIIIIllIIIlllIlIlI.dirtCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.dirtMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[38]], lllllllllllllIlIIIIllIIIlllIlIlI.dirtMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.dirtMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[39]], lllllllllllllIlIIIIllIIIlllIlIlI.dirtMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.gravelSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[32]], lllllllllllllIlIIIIllIIIlllIlIlI.gravelSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.gravelCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[40]], lllllllllllllIlIIIIllIIIlllIlIlI.gravelCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.gravelMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[41]], lllllllllllllIlIIIIllIIIlllIlIlI.gravelMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.gravelMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[42]], lllllllllllllIlIIIIllIIIlllIlIlI.gravelMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.graniteSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[43]], lllllllllllllIlIIIIllIIIlllIlIlI.graniteSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.graniteCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[44]], lllllllllllllIlIIIIllIIIlllIlIlI.graniteCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.graniteMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[45]], lllllllllllllIlIIIIllIIIlllIlIlI.graniteMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.graniteMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[46]], lllllllllllllIlIIIIllIIIlllIlIlI.graniteMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.dioriteSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[47]], lllllllllllllIlIIIIllIIIlllIlIlI.dioriteSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.dioriteCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[48]], lllllllllllllIlIIIIllIIIlllIlIlI.dioriteCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.dioriteMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[49]], lllllllllllllIlIIIIllIIIlllIlIlI.dioriteMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.dioriteMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[50]], lllllllllllllIlIIIIllIIIlllIlIlI.dioriteMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.andesiteSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[51]], lllllllllllllIlIIIIllIIIlllIlIlI.andesiteSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.andesiteCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[52]], lllllllllllllIlIIIIllIIIlllIlIlI.andesiteCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.andesiteMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[53]], lllllllllllllIlIIIIllIIIlllIlIlI.andesiteMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.andesiteMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[54]], lllllllllllllIlIIIIllIIIlllIlIlI.andesiteMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.coalSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[55]], lllllllllllllIlIIIIllIIIlllIlIlI.coalSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.coalCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[56]], lllllllllllllIlIIIIllIIIlllIlIlI.coalCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.coalMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[57]], lllllllllllllIlIIIIllIIIlllIlIlI.coalMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.coalMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[58]], lllllllllllllIlIIIIllIIIlllIlIlI.coalMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.ironSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[59]], lllllllllllllIlIIIIllIIIlllIlIlI.ironSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.ironCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[60]], lllllllllllllIlIIIIllIIIlllIlIlI.ironCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.ironMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[61]], lllllllllllllIlIIIIllIIIlllIlIlI.ironMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.ironMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[62]], lllllllllllllIlIIIIllIIIlllIlIlI.ironMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.goldSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[63]], lllllllllllllIlIIIIllIIIlllIlIlI.goldSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.goldCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[64]], lllllllllllllIlIIIIllIIIlllIlIlI.goldCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.goldMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[65]], lllllllllllllIlIIIIllIIIlllIlIlI.goldMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.goldMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[66]], lllllllllllllIlIIIIllIIIlllIlIlI.goldMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.redstoneSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[67]], lllllllllllllIlIIIIllIIIlllIlIlI.redstoneSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.redstoneCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[68]], lllllllllllllIlIIIIllIIIlllIlIlI.redstoneCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.redstoneMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[69]], lllllllllllllIlIIIIllIIIlllIlIlI.redstoneMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.redstoneMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[70]], lllllllllllllIlIIIIllIIIlllIlIlI.redstoneMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.diamondSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[71]], lllllllllllllIlIIIIllIIIlllIlIlI.diamondSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.diamondCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[72]], lllllllllllllIlIIIIllIIIlllIlIlI.diamondCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.diamondMinHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[73]], lllllllllllllIlIIIIllIIIlllIlIlI.diamondMinHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.diamondMaxHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[74]], lllllllllllllIlIIIIllIIIlllIlIlI.diamondMaxHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.lapisSize = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[75]], lllllllllllllIlIIIIllIIIlllIlIlI.lapisSize);
                lllllllllllllIlIIIIllIIIlllIlIlI.lapisCount = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[76]], lllllllllllllIlIIIIllIIIlllIlIlI.lapisCount);
                lllllllllllllIlIIIIllIIIlllIlIlI.lapisCenterHeight = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[77]], lllllllllllllIlIIIIllIIIlllIlIlI.lapisCenterHeight);
                lllllllllllllIlIIIIllIIIlllIlIlI.lapisSpread = JsonUtils.getInt(lllllllllllllIlIIIIllIIIlllIlIll, Serializer.lIIIlIlIIIlllI[Serializer.lIIIlIlIlllIIl[78]], lllllllllllllIlIIIIllIIIlllIlIlI.lapisSpread);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return null;
                }
            }
            catch (Exception ex) {}
            return lllllllllllllIlIIIIllIIIlllIlIlI;
        }
        
        private static String llIIIIIIlIIlIll(final String lllllllllllllIlIIIIllIIIlIllIllI, final String lllllllllllllIlIIIIllIIIlIllIlll) {
            try {
                final SecretKeySpec lllllllllllllIlIIIIllIIIlIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIIIlIllIlll.getBytes(StandardCharsets.UTF_8)), Serializer.lIIIlIlIlllIIl[8]), "DES");
                final Cipher lllllllllllllIlIIIIllIIIlIlllIlI = Cipher.getInstance("DES");
                lllllllllllllIlIIIIllIIIlIlllIlI.init(Serializer.lIIIlIlIlllIIl[2], lllllllllllllIlIIIIllIIIlIlllIll);
                return new String(lllllllllllllIlIIIIllIIIlIlllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIIIlIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
            }
            catch (Exception lllllllllllllIlIIIIllIIIlIlllIIl) {
                lllllllllllllIlIIIIllIIIlIlllIIl.printStackTrace();
                return null;
            }
        }
    }
    
    public static class Factory
    {
        public /* synthetic */ int diamondMinHeight;
        public /* synthetic */ int dirtSize;
        static final /* synthetic */ Gson JSON_ADAPTER;
        public /* synthetic */ float baseSize;
        public /* synthetic */ int dioriteCount;
        public /* synthetic */ int coalMaxHeight;
        public /* synthetic */ float biomeScaleWeight;
        public /* synthetic */ int lapisCenterHeight;
        private static final /* synthetic */ int[] llIllIlIIlIIIl;
        public /* synthetic */ int lapisCount;
        public /* synthetic */ int ironMinHeight;
        public /* synthetic */ int ironCount;
        public /* synthetic */ int ironSize;
        public /* synthetic */ boolean useMonuments;
        public /* synthetic */ int redstoneMaxHeight;
        public /* synthetic */ int coalMinHeight;
        public /* synthetic */ boolean useMineShafts;
        public /* synthetic */ float biomeDepthWeight;
        public /* synthetic */ int dungeonChance;
        public /* synthetic */ float upperLimitScale;
        public /* synthetic */ int dioriteMinHeight;
        public /* synthetic */ int ironMaxHeight;
        public /* synthetic */ int graniteSize;
        public /* synthetic */ int andesiteCount;
        public /* synthetic */ float depthNoiseScaleExponent;
        public /* synthetic */ boolean useTemples;
        public /* synthetic */ boolean useRavines;
        public /* synthetic */ int redstoneCount;
        public /* synthetic */ int graniteMaxHeight;
        public /* synthetic */ int goldMinHeight;
        public /* synthetic */ float stretchY;
        public /* synthetic */ int dirtMinHeight;
        public /* synthetic */ int andesiteMaxHeight;
        public /* synthetic */ boolean useWaterLakes;
        public /* synthetic */ int redstoneMinHeight;
        public /* synthetic */ int diamondSize;
        public /* synthetic */ int lapisSpread;
        public /* synthetic */ int seaLevel;
        public /* synthetic */ float biomeDepthOffset;
        public /* synthetic */ float heightScale;
        public /* synthetic */ boolean useLavaLakes;
        public /* synthetic */ int graniteMinHeight;
        public /* synthetic */ boolean useLavaOceans;
        public /* synthetic */ int graniteCount;
        public /* synthetic */ float coordinateScale;
        public /* synthetic */ int dirtCount;
        public /* synthetic */ int goldCount;
        public /* synthetic */ int dirtMaxHeight;
        public /* synthetic */ float depthNoiseScaleZ;
        public /* synthetic */ int goldMaxHeight;
        public /* synthetic */ int riverSize;
        public /* synthetic */ boolean useCaves;
        public /* synthetic */ int gravelMinHeight;
        public /* synthetic */ int biomeSize;
        public /* synthetic */ boolean useVillages;
        public /* synthetic */ boolean useStrongholds;
        public /* synthetic */ int gravelCount;
        public /* synthetic */ float lowerLimitScale;
        public /* synthetic */ int andesiteMinHeight;
        public /* synthetic */ float depthNoiseScaleX;
        public /* synthetic */ boolean useDungeons;
        public /* synthetic */ int lapisSize;
        public /* synthetic */ float mainNoiseScaleY;
        public /* synthetic */ float mainNoiseScaleX;
        public /* synthetic */ int fixedBiome;
        public /* synthetic */ int diamondMaxHeight;
        public /* synthetic */ int coalCount;
        public /* synthetic */ float biomeScaleOffset;
        public /* synthetic */ int gravelMaxHeight;
        public /* synthetic */ int lavaLakeChance;
        public /* synthetic */ int redstoneSize;
        public /* synthetic */ int coalSize;
        public /* synthetic */ int goldSize;
        public /* synthetic */ float mainNoiseScaleZ;
        public /* synthetic */ int andesiteSize;
        public /* synthetic */ int gravelSize;
        public /* synthetic */ int diamondCount;
        public /* synthetic */ int dioriteMaxHeight;
        public /* synthetic */ int dioriteSize;
        public /* synthetic */ int waterLakeChance;
        
        @Override
        public int hashCode() {
            int floatToIntBits;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.coordinateScale, 0.0f))) {
                floatToIntBits = Float.floatToIntBits(this.coordinateScale);
                "".length();
                if (-" ".length() > "  ".length()) {
                    return (0xA1 ^ 0x9B) & ~(0x8F ^ 0xB5);
                }
            }
            else {
                floatToIntBits = Factory.llIllIlIIlIIIl[5];
            }
            int llllllllllllIllIIllIlllIIIlIIIll = floatToIntBits;
            final int n = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits2;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.heightScale, 0.0f))) {
                floatToIntBits2 = Float.floatToIntBits(this.heightScale);
                "".length();
                if ("   ".length() < 0) {
                    return (0x14 ^ 0x34) & ~(0x41 ^ 0x61);
                }
            }
            else {
                floatToIntBits2 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n + floatToIntBits2;
            final int n2 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits3;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.upperLimitScale, 0.0f))) {
                floatToIntBits3 = Float.floatToIntBits(this.upperLimitScale);
                "".length();
                if (" ".length() >= (0x32 ^ 0x36)) {
                    return (0x27 ^ 0x28) & ~(0x7F ^ 0x70);
                }
            }
            else {
                floatToIntBits3 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n2 + floatToIntBits3;
            final int n3 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits4;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.lowerLimitScale, 0.0f))) {
                floatToIntBits4 = Float.floatToIntBits(this.lowerLimitScale);
                "".length();
                if ((0x91 ^ 0x86 ^ (0x6B ^ 0x78)) < 0) {
                    return (0x49 ^ 0xA ^ (0xE ^ 0x5C)) & (111 + 139 - 71 + 5 ^ 83 + 50 - 9 + 45 ^ -" ".length());
                }
            }
            else {
                floatToIntBits4 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n3 + floatToIntBits4;
            final int n4 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits5;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.depthNoiseScaleX, 0.0f))) {
                floatToIntBits5 = Float.floatToIntBits(this.depthNoiseScaleX);
                "".length();
                if ("  ".length() <= " ".length()) {
                    return (0x66 ^ 0x3F) & ~(0xF7 ^ 0xAE);
                }
            }
            else {
                floatToIntBits5 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n4 + floatToIntBits5;
            final int n5 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits6;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.depthNoiseScaleZ, 0.0f))) {
                floatToIntBits6 = Float.floatToIntBits(this.depthNoiseScaleZ);
                "".length();
                if (" ".length() < " ".length()) {
                    return (0x28 ^ 0x7A) & ~(0x10 ^ 0x42);
                }
            }
            else {
                floatToIntBits6 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n5 + floatToIntBits6;
            final int n6 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits7;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.depthNoiseScaleExponent, 0.0f))) {
                floatToIntBits7 = Float.floatToIntBits(this.depthNoiseScaleExponent);
                "".length();
                if ("  ".length() < 0) {
                    return (0x2C ^ 0x2 ^ (0x47 ^ 0x4D)) & (0x3B ^ 0x69 ^ (0x74 ^ 0x2) ^ -" ".length());
                }
            }
            else {
                floatToIntBits7 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n6 + floatToIntBits7;
            final int n7 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits8;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.mainNoiseScaleX, 0.0f))) {
                floatToIntBits8 = Float.floatToIntBits(this.mainNoiseScaleX);
                "".length();
                if (-" ".length() >= 0) {
                    return (0xDE ^ 0x9D) & ~(0x35 ^ 0x76);
                }
            }
            else {
                floatToIntBits8 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n7 + floatToIntBits8;
            final int n8 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits9;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.mainNoiseScaleY, 0.0f))) {
                floatToIntBits9 = Float.floatToIntBits(this.mainNoiseScaleY);
                "".length();
                if ((0x2C ^ 0x50 ^ (0x61 ^ 0x19)) < 0) {
                    return (0xE2 ^ 0xA9 ^ (0x73 ^ 0x69)) & (155 + 51 - 199 + 205 ^ 32 + 82 - 78 + 97 ^ -" ".length());
                }
            }
            else {
                floatToIntBits9 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n8 + floatToIntBits9;
            final int n9 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits10;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.mainNoiseScaleZ, 0.0f))) {
                floatToIntBits10 = Float.floatToIntBits(this.mainNoiseScaleZ);
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (0xBE ^ 0xA3) & ~(0x1B ^ 0x6) & ~((0x55 ^ 0x69) & ~(0x20 ^ 0x1C));
                }
            }
            else {
                floatToIntBits10 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n9 + floatToIntBits10;
            final int n10 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits11;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.baseSize, 0.0f))) {
                floatToIntBits11 = Float.floatToIntBits(this.baseSize);
                "".length();
                if (((0x4F ^ 0x2) & ~(0x5D ^ 0x10)) != ((0x30 ^ 0x6D) & ~(0x24 ^ 0x79))) {
                    return (0x9E ^ 0xB1) & ~(0x7D ^ 0x52);
                }
            }
            else {
                floatToIntBits11 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n10 + floatToIntBits11;
            final int n11 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits12;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.stretchY, 0.0f))) {
                floatToIntBits12 = Float.floatToIntBits(this.stretchY);
                "".length();
                if ("  ".length() <= 0) {
                    return (0x5C ^ 0x51) & ~(0x9 ^ 0x4);
                }
            }
            else {
                floatToIntBits12 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n11 + floatToIntBits12;
            final int n12 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits13;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.biomeDepthWeight, 0.0f))) {
                floatToIntBits13 = Float.floatToIntBits(this.biomeDepthWeight);
                "".length();
                if (((0x68 ^ 0x70) & ~(0xB ^ 0x13)) > 0) {
                    return (0x46 ^ 0xD) & ~(0x10 ^ 0x5B);
                }
            }
            else {
                floatToIntBits13 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n12 + floatToIntBits13;
            final int n13 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits14;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.biomeDepthOffset, 0.0f))) {
                floatToIntBits14 = Float.floatToIntBits(this.biomeDepthOffset);
                "".length();
                if (-(0x4E ^ 0x1B ^ (0x23 ^ 0x72)) > 0) {
                    return (0xA2 ^ 0xC7 ^ (0xA9 ^ 0x99)) & (151 + 139 - 161 + 102 ^ 76 + 22 + 67 + 13 ^ -" ".length());
                }
            }
            else {
                floatToIntBits14 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n13 + floatToIntBits14;
            final int n14 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits15;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.biomeScaleWeight, 0.0f))) {
                floatToIntBits15 = Float.floatToIntBits(this.biomeScaleWeight);
                "".length();
                if ((0x62 ^ 0x66) <= -" ".length()) {
                    return (0xB7 ^ 0x97) & ~(0x34 ^ 0x14);
                }
            }
            else {
                floatToIntBits15 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n14 + floatToIntBits15;
            final int n15 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int floatToIntBits16;
            if (lIIlIllllIlllIII(lIIlIllllIlllIlI(this.biomeScaleOffset, 0.0f))) {
                floatToIntBits16 = Float.floatToIntBits(this.biomeScaleOffset);
                "".length();
                if ((114 + 97 - 190 + 120 ^ 74 + 67 - 109 + 104) <= 0) {
                    return (0xEC ^ 0x96 ^ (0x66 ^ 0x33)) & (0xB ^ 0x60 ^ (0x7B ^ 0x3F) ^ -" ".length());
                }
            }
            else {
                floatToIntBits16 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n15 + floatToIntBits16;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.seaLevel;
            final int n16 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n17;
            if (lIIlIllllIlllIII(this.useCaves ? 1 : 0)) {
                n17 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if ("   ".length() <= "  ".length()) {
                    return (218 + 28 - 107 + 113 ^ 148 + 145 - 229 + 97) & (0x74 ^ 0x3F ^ (0xA4 ^ 0xB2) ^ -" ".length());
                }
            }
            else {
                n17 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n16 + n17;
            final int n18 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n19;
            if (lIIlIllllIlllIII(this.useDungeons ? 1 : 0)) {
                n19 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if ("  ".length() < 0) {
                    return (0x2C ^ 0x71 ^ (0x3F ^ 0x7B)) & (0x2A ^ 0x15 ^ (0xB4 ^ 0x92) ^ -" ".length());
                }
            }
            else {
                n19 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n18 + n19;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dungeonChance;
            final int n20 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n21;
            if (lIIlIllllIlllIII(this.useStrongholds ? 1 : 0)) {
                n21 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if (((56 + 170 - 158 + 134 ^ 58 + 40 - 35 + 83) & (133 + 46 - 36 + 76 ^ 50 + 128 - 109 + 62 ^ -" ".length())) < 0) {
                    return (20 + 57 - 51 + 110 ^ 67 + 144 - 192 + 131) & (0x4A ^ 0x3F ^ (0xE4 ^ 0x8F) ^ -" ".length());
                }
            }
            else {
                n21 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n20 + n21;
            final int n22 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n23;
            if (lIIlIllllIlllIII(this.useVillages ? 1 : 0)) {
                n23 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if ((141 + 153 - 142 + 16 ^ 6 + 58 + 50 + 58) == 0x0) {
                    return (0xA5 ^ 0xC6 ^ (0x49 ^ 0x70)) & (0x3D ^ 0x51 ^ (0x19 ^ 0x2F) ^ -" ".length());
                }
            }
            else {
                n23 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n22 + n23;
            final int n24 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n25;
            if (lIIlIllllIlllIII(this.useMineShafts ? 1 : 0)) {
                n25 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if ("   ".length() > "   ".length()) {
                    return (0x4B ^ 0x65) & ~(0x22 ^ 0xC);
                }
            }
            else {
                n25 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n24 + n25;
            final int n26 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n27;
            if (lIIlIllllIlllIII(this.useTemples ? 1 : 0)) {
                n27 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if (((0xC2 ^ 0x96) & ~(0x73 ^ 0x27)) != 0x0) {
                    return (0x32 ^ 0x7) & ~(0x46 ^ 0x73);
                }
            }
            else {
                n27 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n26 + n27;
            final int n28 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n29;
            if (lIIlIllllIlllIII(this.useMonuments ? 1 : 0)) {
                n29 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if (-"  ".length() >= 0) {
                    return (85 + 81 - 47 + 26 ^ 136 + 3 - 32 + 51) & (0xD7 ^ 0x84 ^ (0x39 ^ 0x65) ^ -" ".length());
                }
            }
            else {
                n29 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n28 + n29;
            final int n30 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n31;
            if (lIIlIllllIlllIII(this.useRavines ? 1 : 0)) {
                n31 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if (((0x64 ^ 0x6D ^ (0x4B ^ 0xD)) & (0x51 ^ 0x14 ^ (0x39 ^ 0x33) ^ -" ".length())) < 0) {
                    return (151 + 47 - 87 + 57 ^ 19 + 134 - 22 + 8) & (120 + 134 - 247 + 173 ^ 82 + 139 - 92 + 22 ^ -" ".length());
                }
            }
            else {
                n31 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n30 + n31;
            final int n32 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n33;
            if (lIIlIllllIlllIII(this.useWaterLakes ? 1 : 0)) {
                n33 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if (null != null) {
                    return (0x32 ^ 0x29) & ~(0x7B ^ 0x60);
                }
            }
            else {
                n33 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n32 + n33;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.waterLakeChance;
            final int n34 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n35;
            if (lIIlIllllIlllIII(this.useLavaLakes ? 1 : 0)) {
                n35 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if (null != null) {
                    return (50 + 12 + 18 + 80 ^ 158 + 111 - 235 + 125) & (0x24 ^ 0x41 ^ (0x2F ^ 0x75) ^ -" ".length());
                }
            }
            else {
                n35 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n34 + n35;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.lavaLakeChance;
            final int n36 = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll;
            int n37;
            if (lIIlIllllIlllIII(this.useLavaOceans ? 1 : 0)) {
                n37 = Factory.llIllIlIIlIIIl[1];
                "".length();
                if ((139 + 67 - 108 + 49 ^ 59 + 104 - 58 + 46) < 0) {
                    return (0xC1 ^ 0x98 ^ (0xC2 ^ 0x8A)) & (66 + 96 - 143 + 125 ^ 108 + 76 - 156 + 101 ^ -" ".length());
                }
            }
            else {
                n37 = Factory.llIllIlIIlIIIl[5];
            }
            llllllllllllIllIIllIlllIIIlIIIll = n36 + n37;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.fixedBiome;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.biomeSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.riverSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dirtSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dirtCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dirtMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dirtMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.gravelSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.gravelCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.gravelMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.gravelMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.graniteSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.graniteCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.graniteMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.graniteMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dioriteSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dioriteCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dioriteMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.dioriteMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.andesiteSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.andesiteCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.andesiteMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.andesiteMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.coalSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.coalCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.coalMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.coalMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.ironSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.ironCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.ironMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.ironMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.goldSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.goldCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.goldMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.goldMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.redstoneSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.redstoneCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.redstoneMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.redstoneMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.diamondSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.diamondCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.diamondMinHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.diamondMaxHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.lapisSize;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.lapisCount;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.lapisCenterHeight;
            llllllllllllIllIIllIlllIIIlIIIll = Factory.llIllIlIIlIIIl[19] * llllllllllllIllIIllIlllIIIlIIIll + this.lapisSpread;
            return llllllllllllIllIIllIlllIIIlIIIll;
        }
        
        @Override
        public String toString() {
            return Factory.JSON_ADAPTER.toJson((Object)this);
        }
        
        private static int lIIlIllllIlllIlI(final float n, final float n2) {
            return fcmpl(n, n2);
        }
        
        public void func_177863_a() {
            this.coordinateScale = 684.412f;
            this.heightScale = 684.412f;
            this.upperLimitScale = 512.0f;
            this.lowerLimitScale = 512.0f;
            this.depthNoiseScaleX = 200.0f;
            this.depthNoiseScaleZ = 200.0f;
            this.depthNoiseScaleExponent = 0.5f;
            this.mainNoiseScaleX = 80.0f;
            this.mainNoiseScaleY = 160.0f;
            this.mainNoiseScaleZ = 80.0f;
            this.baseSize = 8.5f;
            this.stretchY = 12.0f;
            this.biomeDepthWeight = 1.0f;
            this.biomeDepthOffset = 0.0f;
            this.biomeScaleWeight = 1.0f;
            this.biomeScaleOffset = 0.0f;
            this.seaLevel = Factory.llIllIlIIlIIIl[0];
            this.useCaves = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useDungeons = (Factory.llIllIlIIlIIIl[1] != 0);
            this.dungeonChance = Factory.llIllIlIIlIIIl[2];
            this.useStrongholds = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useVillages = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useMineShafts = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useTemples = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useMonuments = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useRavines = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useWaterLakes = (Factory.llIllIlIIlIIIl[1] != 0);
            this.waterLakeChance = Factory.llIllIlIIlIIIl[3];
            this.useLavaLakes = (Factory.llIllIlIIlIIIl[1] != 0);
            this.lavaLakeChance = Factory.llIllIlIIlIIIl[4];
            this.useLavaOceans = (Factory.llIllIlIIlIIIl[5] != 0);
            this.fixedBiome = Factory.llIllIlIIlIIIl[6];
            this.biomeSize = Factory.llIllIlIIlIIIl[3];
            this.riverSize = Factory.llIllIlIIlIIIl[3];
            this.dirtSize = Factory.llIllIlIIlIIIl[7];
            this.dirtCount = Factory.llIllIlIIlIIIl[8];
            this.dirtMinHeight = Factory.llIllIlIIlIIIl[5];
            this.dirtMaxHeight = Factory.llIllIlIIlIIIl[9];
            this.gravelSize = Factory.llIllIlIIlIIIl[7];
            this.gravelCount = Factory.llIllIlIIlIIIl[2];
            this.gravelMinHeight = Factory.llIllIlIIlIIIl[5];
            this.gravelMaxHeight = Factory.llIllIlIIlIIIl[9];
            this.graniteSize = Factory.llIllIlIIlIIIl[7];
            this.graniteCount = Factory.llIllIlIIlIIIl[8];
            this.graniteMinHeight = Factory.llIllIlIIlIIIl[5];
            this.graniteMaxHeight = Factory.llIllIlIIlIIIl[4];
            this.dioriteSize = Factory.llIllIlIIlIIIl[7];
            this.dioriteCount = Factory.llIllIlIIlIIIl[8];
            this.dioriteMinHeight = Factory.llIllIlIIlIIIl[5];
            this.dioriteMaxHeight = Factory.llIllIlIIlIIIl[4];
            this.andesiteSize = Factory.llIllIlIIlIIIl[7];
            this.andesiteCount = Factory.llIllIlIIlIIIl[8];
            this.andesiteMinHeight = Factory.llIllIlIIlIIIl[5];
            this.andesiteMaxHeight = Factory.llIllIlIIlIIIl[4];
            this.coalSize = Factory.llIllIlIIlIIIl[10];
            this.coalCount = Factory.llIllIlIIlIIIl[11];
            this.coalMinHeight = Factory.llIllIlIIlIIIl[5];
            this.coalMaxHeight = Factory.llIllIlIIlIIIl[12];
            this.ironSize = Factory.llIllIlIIlIIIl[13];
            this.ironCount = Factory.llIllIlIIlIIIl[11];
            this.ironMinHeight = Factory.llIllIlIIlIIIl[5];
            this.ironMaxHeight = Factory.llIllIlIIlIIIl[14];
            this.goldSize = Factory.llIllIlIIlIIIl[13];
            this.goldCount = Factory.llIllIlIIlIIIl[15];
            this.goldMinHeight = Factory.llIllIlIIlIIIl[5];
            this.goldMaxHeight = Factory.llIllIlIIlIIIl[16];
            this.redstoneSize = Factory.llIllIlIIlIIIl[2];
            this.redstoneCount = Factory.llIllIlIIlIIIl[2];
            this.redstoneMinHeight = Factory.llIllIlIIlIIIl[5];
            this.redstoneMaxHeight = Factory.llIllIlIIlIIIl[17];
            this.diamondSize = Factory.llIllIlIIlIIIl[2];
            this.diamondCount = Factory.llIllIlIIlIIIl[1];
            this.diamondMinHeight = Factory.llIllIlIIlIIIl[5];
            this.diamondMaxHeight = Factory.llIllIlIIlIIIl[17];
            this.lapisSize = Factory.llIllIlIIlIIIl[18];
            this.lapisCount = Factory.llIllIlIIlIIIl[1];
            this.lapisCenterHeight = Factory.llIllIlIIlIIIl[17];
            this.lapisSpread = Factory.llIllIlIIlIIIl[17];
        }
        
        private static void lIIlIllllIllIIll() {
            (llIllIlIIlIIIl = new int[20])[0] = (0x5 ^ 0x7B ^ (0x1A ^ 0x5B));
            Factory.llIllIlIIlIIIl[1] = " ".length();
            Factory.llIllIlIIlIIIl[2] = (0x16 ^ 0x1E);
            Factory.llIllIlIIlIIIl[3] = (0x17 ^ 0x51 ^ (0x6A ^ 0x28));
            Factory.llIllIlIIlIIIl[4] = (0xCD ^ 0x8F ^ (0x15 ^ 0x7));
            Factory.llIllIlIIlIIIl[5] = ((0x3E ^ 0x5E ^ (0x14 ^ 0x56)) & (76 + 120 - 163 + 150 ^ 135 + 140 - 245 + 119 ^ -" ".length()));
            Factory.llIllIlIIlIIIl[6] = -" ".length();
            Factory.llIllIlIIlIIIl[7] = (0x99 ^ 0xB8);
            Factory.llIllIlIIlIIIl[8] = (0x96 ^ 0xBE ^ (0x4E ^ 0x6C));
            Factory.llIllIlIIlIIIl[9] = (0xFFFFD31C & 0x2DE3);
            Factory.llIllIlIIlIIIl[10] = (0x5 ^ 0x1C ^ (0x72 ^ 0x7A));
            Factory.llIllIlIIlIIIl[11] = (0x6E ^ 0x3D ^ (0xD3 ^ 0x94));
            Factory.llIllIlIIlIIIl[12] = (0x62 ^ 0x79) + (0x7C ^ 0x3C) - (0xA8 ^ 0xA6) + (0x1F ^ 0x2C);
            Factory.llIllIlIIlIIIl[13] = (0x8 ^ 0x1);
            Factory.llIllIlIIlIIIl[14] = (0x3B ^ 0x7B);
            Factory.llIllIlIIlIIIl[15] = "  ".length();
            Factory.llIllIlIIlIIIl[16] = (0xE5 ^ 0xC5);
            Factory.llIllIlIIlIIIl[17] = (0x79 ^ 0x69);
            Factory.llIllIlIIlIIIl[18] = (0xCA ^ 0x88 ^ (0x9 ^ 0x4C));
            Factory.llIllIlIIlIIIl[19] = (0x72 ^ 0x6D);
        }
        
        private static boolean lIIlIllllIllIllI(final Object llllllllllllIllIIllIlllIIIIlIlII) {
            return llllllllllllIllIIllIlllIIIIlIlII != null;
        }
        
        static {
            lIIlIllllIllIIll();
            JSON_ADAPTER = new GsonBuilder().registerTypeAdapter((Type)Factory.class, (Object)new Serializer()).create();
        }
        
        private static boolean lIIlIllllIlllIIl(final int llllllllllllIllIIllIlllIIIIllIll, final int llllllllllllIllIIllIlllIIIIllIlI) {
            return llllllllllllIllIIllIlllIIIIllIll == llllllllllllIllIIllIlllIIIIllIlI;
        }
        
        private static boolean lIIlIllllIllIlIl(final Object llllllllllllIllIIllIlllIIIIlIlll, final Object llllllllllllIllIIllIlllIIIIlIllI) {
            return llllllllllllIllIIllIlllIIIIlIlll == llllllllllllIllIIllIlllIIIIlIllI;
        }
        
        private static boolean lIIlIllllIlllIII(final int llllllllllllIllIIllIlllIIIIlIIlI) {
            return llllllllllllIllIIllIlllIIIIlIIlI != 0;
        }
        
        private static boolean lIIlIllllIllIlll(final int llllllllllllIllIIllIlllIIIIIllIl, final int llllllllllllIllIIllIlllIIIIIllII) {
            return llllllllllllIllIIllIlllIIIIIllIl != llllllllllllIllIIllIlllIIIIIllII;
        }
        
        public ChunkProviderSettings func_177864_b() {
            return new ChunkProviderSettings(this, null);
        }
        
        public static Factory jsonToFactory(final String llllllllllllIllIIllIlllIIIlllIlI) {
            if (lIIlIllllIllIlII(llllllllllllIllIIllIlllIIIlllIlI.length())) {
                return new Factory();
            }
            try {
                return (Factory)Factory.JSON_ADAPTER.fromJson(llllllllllllIllIIllIlllIIIlllIlI, (Class)Factory.class);
            }
            catch (Exception llllllllllllIllIIllIlllIIIlllIll) {
                return new Factory();
            }
        }
        
        private static boolean lIIlIllllIllIlII(final int llllllllllllIllIIllIlllIIIIlIIII) {
            return llllllllllllIllIIllIlllIIIIlIIII == 0;
        }
        
        public Factory() {
            this.coordinateScale = 684.412f;
            this.heightScale = 684.412f;
            this.upperLimitScale = 512.0f;
            this.lowerLimitScale = 512.0f;
            this.depthNoiseScaleX = 200.0f;
            this.depthNoiseScaleZ = 200.0f;
            this.depthNoiseScaleExponent = 0.5f;
            this.mainNoiseScaleX = 80.0f;
            this.mainNoiseScaleY = 160.0f;
            this.mainNoiseScaleZ = 80.0f;
            this.baseSize = 8.5f;
            this.stretchY = 12.0f;
            this.biomeDepthWeight = 1.0f;
            this.biomeDepthOffset = 0.0f;
            this.biomeScaleWeight = 1.0f;
            this.biomeScaleOffset = 0.0f;
            this.seaLevel = Factory.llIllIlIIlIIIl[0];
            this.useCaves = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useDungeons = (Factory.llIllIlIIlIIIl[1] != 0);
            this.dungeonChance = Factory.llIllIlIIlIIIl[2];
            this.useStrongholds = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useVillages = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useMineShafts = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useTemples = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useMonuments = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useRavines = (Factory.llIllIlIIlIIIl[1] != 0);
            this.useWaterLakes = (Factory.llIllIlIIlIIIl[1] != 0);
            this.waterLakeChance = Factory.llIllIlIIlIIIl[3];
            this.useLavaLakes = (Factory.llIllIlIIlIIIl[1] != 0);
            this.lavaLakeChance = Factory.llIllIlIIlIIIl[4];
            this.useLavaOceans = (Factory.llIllIlIIlIIIl[5] != 0);
            this.fixedBiome = Factory.llIllIlIIlIIIl[6];
            this.biomeSize = Factory.llIllIlIIlIIIl[3];
            this.riverSize = Factory.llIllIlIIlIIIl[3];
            this.dirtSize = Factory.llIllIlIIlIIIl[7];
            this.dirtCount = Factory.llIllIlIIlIIIl[8];
            this.dirtMinHeight = Factory.llIllIlIIlIIIl[5];
            this.dirtMaxHeight = Factory.llIllIlIIlIIIl[9];
            this.gravelSize = Factory.llIllIlIIlIIIl[7];
            this.gravelCount = Factory.llIllIlIIlIIIl[2];
            this.gravelMinHeight = Factory.llIllIlIIlIIIl[5];
            this.gravelMaxHeight = Factory.llIllIlIIlIIIl[9];
            this.graniteSize = Factory.llIllIlIIlIIIl[7];
            this.graniteCount = Factory.llIllIlIIlIIIl[8];
            this.graniteMinHeight = Factory.llIllIlIIlIIIl[5];
            this.graniteMaxHeight = Factory.llIllIlIIlIIIl[4];
            this.dioriteSize = Factory.llIllIlIIlIIIl[7];
            this.dioriteCount = Factory.llIllIlIIlIIIl[8];
            this.dioriteMinHeight = Factory.llIllIlIIlIIIl[5];
            this.dioriteMaxHeight = Factory.llIllIlIIlIIIl[4];
            this.andesiteSize = Factory.llIllIlIIlIIIl[7];
            this.andesiteCount = Factory.llIllIlIIlIIIl[8];
            this.andesiteMinHeight = Factory.llIllIlIIlIIIl[5];
            this.andesiteMaxHeight = Factory.llIllIlIIlIIIl[4];
            this.coalSize = Factory.llIllIlIIlIIIl[10];
            this.coalCount = Factory.llIllIlIIlIIIl[11];
            this.coalMinHeight = Factory.llIllIlIIlIIIl[5];
            this.coalMaxHeight = Factory.llIllIlIIlIIIl[12];
            this.ironSize = Factory.llIllIlIIlIIIl[13];
            this.ironCount = Factory.llIllIlIIlIIIl[11];
            this.ironMinHeight = Factory.llIllIlIIlIIIl[5];
            this.ironMaxHeight = Factory.llIllIlIIlIIIl[14];
            this.goldSize = Factory.llIllIlIIlIIIl[13];
            this.goldCount = Factory.llIllIlIIlIIIl[15];
            this.goldMinHeight = Factory.llIllIlIIlIIIl[5];
            this.goldMaxHeight = Factory.llIllIlIIlIIIl[16];
            this.redstoneSize = Factory.llIllIlIIlIIIl[2];
            this.redstoneCount = Factory.llIllIlIIlIIIl[2];
            this.redstoneMinHeight = Factory.llIllIlIIlIIIl[5];
            this.redstoneMaxHeight = Factory.llIllIlIIlIIIl[17];
            this.diamondSize = Factory.llIllIlIIlIIIl[2];
            this.diamondCount = Factory.llIllIlIIlIIIl[1];
            this.diamondMinHeight = Factory.llIllIlIIlIIIl[5];
            this.diamondMaxHeight = Factory.llIllIlIIlIIIl[17];
            this.lapisSize = Factory.llIllIlIIlIIIl[18];
            this.lapisCount = Factory.llIllIlIIlIIIl[1];
            this.lapisCenterHeight = Factory.llIllIlIIlIIIl[17];
            this.lapisSpread = Factory.llIllIlIIlIIIl[17];
            this.func_177863_a();
        }
        
        @Override
        public boolean equals(final Object llllllllllllIllIIllIlllIIIlIlIII) {
            if (lIIlIllllIllIlIl(this, llllllllllllIllIIllIlllIIIlIlIII)) {
                return Factory.llIllIlIIlIIIl[1] != 0;
            }
            if (lIIlIllllIllIllI(llllllllllllIllIIllIlllIIIlIlIII) && lIIlIllllIllIlIl(this.getClass(), llllllllllllIllIIllIlllIIIlIlIII.getClass())) {
                final Factory llllllllllllIllIIllIlllIIIlIlIlI = (Factory)llllllllllllIllIIllIlllIIIlIlIII;
                int n;
                if (lIIlIllllIllIlll(this.andesiteCount, llllllllllllIllIIllIlllIIIlIlIlI.andesiteCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() > "  ".length()) {
                        return ((0xA3 ^ 0x8B ^ (0x2E ^ 0x4A)) & (0x58 ^ 0x3F ^ (0x35 ^ 0x1E) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.andesiteMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.andesiteMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x13 ^ 0x4E) & ~(0xD5 ^ 0x88)) != 0x0) {
                        return ((0xC9 ^ 0x80) & ~(0x45 ^ 0xC)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.andesiteMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.andesiteMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x27 ^ 0x63) & ~(0x49 ^ 0xD)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.andesiteSize, llllllllllllIllIIllIlllIIIlIlIlI.andesiteSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() == (0x79 ^ 0x7D)) {
                        return ((0x41 ^ 0x20) & ~(0x7D ^ 0x1C)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.baseSize, this.baseSize))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((0x51 ^ 0x1) & ~(0x6 ^ 0x56)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.biomeDepthOffset, this.biomeDepthOffset))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((68 + 19 + 56 + 38 ^ 65 + 96 - 90 + 85) & (0x1A ^ 0x26 ^ (0x9E ^ 0x8B) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.biomeDepthWeight, this.biomeDepthWeight))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() >= (0xA7 ^ 0xA0 ^ "   ".length())) {
                        return ((0x29 ^ 0x66 ^ ((0x48 ^ 0x5) & ~(0xE3 ^ 0xAE))) & (85 + 121 - 97 + 27 ^ 182 + 127 - 198 + 88 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.biomeScaleOffset, this.biomeScaleOffset))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() < "  ".length()) {
                        return ((0x4 ^ 0x2E) & ~(0x6 ^ 0x2C)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.biomeScaleWeight, this.biomeScaleWeight))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() == ("  ".length() & ~"  ".length())) {
                        return ((0x6 ^ 0x66) & ~(0x48 ^ 0x28)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.biomeSize, llllllllllllIllIIllIlllIIIlIlIlI.biomeSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0xCD ^ 0xC5) & ~(0xA3 ^ 0xAB)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.coalCount, llllllllllllIllIIllIlllIIIlIlIlI.coalCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x4 ^ 0x8 ^ (0x72 ^ 0x3C)) & (0x4D ^ 0x5C ^ (0x70 ^ 0x23) ^ -" ".length())) > "  ".length()) {
                        return ((86 + 110 - 81 + 91 ^ 114 + 97 - 77 + 61) & (0x77 ^ 0x63 ^ (0x56 ^ 0x4F) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.coalMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.coalMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0x20 ^ 0x2C ^ (0x79 ^ 0x70)) <= 0) {
                        return ((0x25 ^ 0x30 ^ (0x2E ^ 0x76)) & (57 + 8 + 144 + 20 ^ 124 + 158 - 191 + 77 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.coalMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.coalMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((69 + 5 + 98 + 63 ^ 13 + 183 - 124 + 112) & (0x6C ^ 0x3D ^ "  ".length() ^ -" ".length())) > 0) {
                        return ((54 + 136 - 76 + 38 ^ 24 + 129 - 28 + 19) & (46 + 41 - 43 + 133 ^ 87 + 76 - 19 + 41 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.coalSize, llllllllllllIllIIllIlllIIIlIlIlI.coalSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x8F ^ 0xB0) & ~(0xB8 ^ 0x87)) != 0x0) {
                        return ((0x8F ^ 0xB8) & ~(0x23 ^ 0x14)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.coordinateScale, this.coordinateScale))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((0x7E ^ 0x21) & ~(0x7 ^ 0x58)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.depthNoiseScaleExponent, this.depthNoiseScaleExponent))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() == 0) {
                        return ((0x4D ^ 0x72) & ~(0x64 ^ 0x5B)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.depthNoiseScaleX, this.depthNoiseScaleX))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-(0x7F ^ 0x7B) >= 0) {
                        return ((0x0 ^ 0x1C) & ~(0x9F ^ 0x83)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.depthNoiseScaleZ, this.depthNoiseScaleZ))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() > -" ".length()) {
                        return ((0x5C ^ 0x17) & ~(0xD5 ^ 0x9E)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.diamondCount, llllllllllllIllIIllIlllIIIlIlIlI.diamondCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return ((0xC8 ^ 0x90) & ~(0x37 ^ 0x6F)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.diamondMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.diamondMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x7D ^ 0x8 ^ (0xE8 ^ 0x87)) & (0x0 ^ 0x6E ^ (0xF5 ^ 0x81) ^ -" ".length())) < 0) {
                        return ((138 + 71 - 201 + 134 ^ 98 + 129 - 155 + 66) & (169 + 50 - 171 + 130 ^ 103 + 139 - 66 + 6 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.diamondMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.diamondMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0x67 ^ 0x49 ^ (0xB7 ^ 0x9D)) <= " ".length()) {
                        return ("   ".length() & ("   ".length() ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.diamondSize, llllllllllllIllIIllIlllIIIlIlIlI.diamondSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((230 + 120 - 133 + 25 ^ 130 + 66 - 84 + 66) & (0x45 ^ 0x15 ^ (0x7D ^ 0x6D) ^ -" ".length())) <= -" ".length()) {
                        return ((74 + 94 - 143 + 143 ^ 50 + 179 - 197 + 156) & (0xD1 ^ 0xBD ^ (0x20 ^ 0x58) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dioriteCount, llllllllllllIllIIllIlllIIIlIlIlI.dioriteCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-(((0x34 ^ 0x3F) & ~(0x1A ^ 0x11)) ^ (0x5C ^ 0x58)) >= 0) {
                        return ((0x5D ^ 0x19 ^ (0x63 ^ 0x1F)) & (100 + 137 - 140 + 72 ^ 18 + 40 + 41 + 46 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dioriteMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.dioriteMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() >= ((0x6D ^ 0x44) & ~(0xB2 ^ 0x9B))) {
                        return ((0x26 ^ 0x77) & ~(0x49 ^ 0x18)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dioriteMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.dioriteMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0x89 ^ 0x8D) < -" ".length()) {
                        return ((0xF6 ^ 0xC1) & ~(0x50 ^ 0x67)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dioriteSize, llllllllllllIllIIllIlllIIIlIlIlI.dioriteSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (("  ".length() & ("  ".length() ^ -" ".length())) != 0x0) {
                        return ((8 + 39 + 74 + 20 ^ 28 + 163 - 113 + 91) & (0x45 ^ 0x62 ^ "   ".length() ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dirtCount, llllllllllllIllIIllIlllIIIlIlIlI.dirtCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((0xA ^ 0x3E) & ~(0x5C ^ 0x68)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dirtMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.dirtMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() < ((0x81 ^ 0xBB ^ (0x3B ^ 0x1C)) & (1 + 96 + 33 + 29 ^ 67 + 117 - 107 + 53 ^ -" ".length()))) {
                        return ((0xDD ^ 0xB4 ^ (0x1B ^ 0x74)) & (32 + 107 - 97 + 114 ^ 66 + 48 + 33 + 7 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dirtMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.dirtMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return ((0xBB ^ 0x88) & ~(0x24 ^ 0x17)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dirtSize, llllllllllllIllIIllIlllIIIlIlIlI.dirtSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() == 0) {
                        return ((0x18 ^ 0x7 ^ (0x1F ^ 0x55)) & (31 + 130 - 43 + 33 ^ 8 + 69 + 29 + 88 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.dungeonChance, llllllllllllIllIIllIlllIIIlIlIlI.dungeonChance)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (" ".length() == "   ".length()) {
                        return ((0x59 ^ 0x64) & ~(0x2B ^ 0x16)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.fixedBiome, llllllllllllIllIIllIlllIIIlIlIlI.fixedBiome)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() < 0) {
                        return ((0x97 ^ 0x8D) & ~(0x3 ^ 0x19)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.goldCount, llllllllllllIllIIllIlllIIIlIlIlI.goldCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (" ".length() > " ".length()) {
                        return ((216 + 226 - 264 + 68 ^ 150 + 63 - 181 + 132) & (0x63 ^ 0x21 ^ (0x99 ^ 0x89) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.goldMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.goldMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((0x3 ^ 0x28) & ~(0x58 ^ 0x73)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.goldMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.goldMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0x60 ^ 0x64 ^ ((0x7C ^ 0x58) & ~(0xA0 ^ 0x84))) < -" ".length()) {
                        return ((0x2B ^ 0x27 ^ (0x67 ^ 0x57)) & (0x30 ^ 0x43 ^ (0xE2 ^ 0xAD) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.goldSize, llllllllllllIllIIllIlllIIIlIlIlI.goldSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (" ".length() < ((0x25 ^ 0x3F) & ~(0x90 ^ 0x8A))) {
                        return ((0x6 ^ 0x39) & ~(0x9F ^ 0xA0)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.graniteCount, llllllllllllIllIIllIlllIIIlIlIlI.graniteCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x87 ^ 0x97) & ~(0x6F ^ 0x7F)) < 0) {
                        return ((0x3D ^ 0x20) & ~(0x31 ^ 0x2C)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.graniteMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.graniteMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0xE0 ^ 0x90 ^ (0x49 ^ 0x3D)) < 0) {
                        return ((114 + 195 - 275 + 216 ^ 96 + 97 - 45 + 47) & (0xBA ^ 0xC3 ^ (0x1F ^ 0x5F) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.graniteMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.graniteMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return ((0x3A ^ 0x32) & ~(0xB ^ 0x3)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.graniteSize, llllllllllllIllIIllIlllIIIlIlIlI.graniteSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() < ((0xAD ^ 0x93) & ~(0xA6 ^ 0x98))) {
                        return ((0xC8 ^ 0x80) & ~(0xCD ^ 0x85)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.gravelCount, llllllllllllIllIIllIlllIIIlIlIlI.gravelCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() > (0x6D ^ 0x61 ^ (0x7C ^ 0x74))) {
                        return ((0xEB ^ 0x84 ^ (0x84 ^ 0xAC)) & (0x37 ^ 0x3A ^ (0x3B ^ 0x71) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.gravelMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.gravelMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((59 + 1 + 12 + 103 ^ 77 + 41 - 60 + 110) & (115 + 6 - 65 + 71 ^ (0xF3 ^ 0x8B) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.gravelMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.gravelMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() >= 0) {
                        return ((0xA3 ^ 0x81) & ~(0x6C ^ 0x4E)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.gravelSize, llllllllllllIllIIllIlllIIIlIlIlI.gravelSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0x1E ^ 0x1B) <= 0) {
                        return ((0x4 ^ 0x5E) & ~(0x37 ^ 0x6D)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.heightScale, this.heightScale))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x95 ^ 0xAA) & ~(0x98 ^ 0xA7)) > "   ".length()) {
                        return ((0xBF ^ 0xB7) & ~(0xBA ^ 0xB2)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.ironCount, llllllllllllIllIIllIlllIIIlIlIlI.ironCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((236 + 226 - 433 + 213 ^ 76 + 52 - 42 + 75) & (0xCA ^ 0xC7 ^ (0xDA ^ 0x84) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.ironMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.ironMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((" ".length() & (" ".length() ^ -" ".length())) <= -" ".length()) {
                        return ((0xFC ^ 0xA0 ^ (0xE ^ 0x55)) & (0x19 ^ 0x5B ^ (0x59 ^ 0x1C) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.ironMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.ironMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-"   ".length() >= 0) {
                        return ((0x37 ^ 0x26) & ~(0xA0 ^ 0xB1)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.ironSize, llllllllllllIllIIllIlllIIIlIlIlI.ironSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((0x1D ^ 0x52 ^ (0xC1 ^ 0x9C)) & (29 + 126 - 94 + 75 ^ 41 + 66 - 87 + 134 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.lapisCenterHeight, llllllllllllIllIIllIlllIIIlIlIlI.lapisCenterHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-(0xC7 ^ 0xC3) >= 0) {
                        return ((0x48 ^ 0x7) & ~(0x21 ^ 0x6E)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.lapisCount, llllllllllllIllIIllIlllIIIlIlIlI.lapisCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-"  ".length() > 0) {
                        return ((0x3A ^ 0x6A ^ (0x29 ^ 0x20)) & (175 + 174 - 192 + 37 ^ 43 + 44 - 64 + 132 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.lapisSize, llllllllllllIllIIllIlllIIIlIlIlI.lapisSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0x88 ^ 0xBC) & ~(0x92 ^ 0xA6)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.lapisSpread, llllllllllllIllIIllIlllIIIlIlIlI.lapisSpread)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((102 + 47 - 2 + 3 ^ 35 + 44 + 48 + 15) & (0x57 ^ 0x75 ^ (0x7D ^ 0x47) ^ -" ".length())) == (18 + 85 + 32 + 2 ^ 26 + 49 + 24 + 42)) {
                        return ((0xFA ^ 0xA3 ^ (0x6 ^ 0x1F)) & (85 + 178 - 216 + 180 ^ 54 + 101 - 33 + 41 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.lavaLakeChance, llllllllllllIllIIllIlllIIIlIlIlI.lavaLakeChance)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x75 ^ 0x72 ^ (0x61 ^ 0x5E)) & (0x43 ^ 0x56 ^ (0x11 ^ 0x3C) ^ -" ".length())) != 0x0) {
                        return ((65 + 73 + 19 + 4 ^ 85 + 48 - 86 + 84) & (0xB9 ^ 0xA6 ^ (0x7A ^ 0x47) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.lowerLimitScale, this.lowerLimitScale))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() <= -" ".length()) {
                        return ((0x9B ^ 0xAE) & ~(0x77 ^ 0x42)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.mainNoiseScaleX, this.mainNoiseScaleX))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((0xA1 ^ 0x95 ^ (0x5C ^ 0x47)) & ("  ".length() ^ (0xB3 ^ 0x9E) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.mainNoiseScaleY, this.mainNoiseScaleY))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (" ".length() == -" ".length()) {
                        return ((0x53 ^ 0x65) & ~(0x7F ^ 0x49)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.mainNoiseScaleZ, this.mainNoiseScaleZ))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() != -" ".length()) {
                        return ((0x25 ^ 0x37) & ~(0x80 ^ 0x92)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.redstoneCount, llllllllllllIllIIllIlllIIIlIlIlI.redstoneCount)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-(0x54 ^ 0x51) >= 0) {
                        return ((0x44 ^ 0x8) & ~(0xFF ^ 0xB3)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.redstoneMaxHeight, llllllllllllIllIIllIlllIIIlIlIlI.redstoneMaxHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (" ".length() < 0) {
                        return ((42 + 90 - 43 + 60 ^ 88 + 152 - 175 + 131) & (166 + 70 - 170 + 139 ^ 112 + 94 - 116 + 66 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.redstoneMinHeight, llllllllllllIllIIllIlllIIIlIlIlI.redstoneMinHeight)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((0x3F ^ 0x7A ^ (0x5D ^ 0x3C)) & (0x4C ^ 0x65 ^ (0x9A ^ 0x97) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.redstoneSize, llllllllllllIllIIllIlllIIIlIlIlI.redstoneSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0xFA ^ 0x8F ^ (0x7B ^ 0xA)) == 0x0) {
                        return ((0x92 ^ 0xC6 ^ (0xCC ^ 0x88)) & (0xF8 ^ 0xB7 ^ (0x2F ^ 0x70) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.riverSize, llllllllllllIllIIllIlllIIIlIlIlI.riverSize)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ((0x4B ^ 0x4E) <= 0) {
                        return ((0xCE ^ 0x86) & ~(0xFC ^ 0xB4)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.seaLevel, llllllllllllIllIIllIlllIIIlIlIlI.seaLevel)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x2B ^ 0x19) & ~(0x7D ^ 0x4F)) != ((0x42 ^ 0x78) & ~(0xFE ^ 0xC4))) {
                        return ((0x7C ^ 0x5D) & ~(0x67 ^ 0x46)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.stretchY, this.stretchY))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() > 0) {
                        return ((0xD5 ^ 0xA6 ^ (0x4A ^ 0x33)) & (0xC1 ^ 0xAD ^ (0x5 ^ 0x63) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIII(Float.compare(llllllllllllIllIIllIlllIIIlIlIlI.upperLimitScale, this.upperLimitScale))) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-" ".length() >= " ".length()) {
                        return ((0x69 ^ 0x14 ^ (0xCF ^ 0x80)) & (166 + 74 - 226 + 175 ^ 7 + 119 - 73 + 90 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useCaves ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useCaves ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x1C ^ 0x34) & ~(0x78 ^ 0x50)) == (0x23 ^ 0x27)) {
                        return ((0xE ^ 0x57) & ~(0x7B ^ 0x22)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useDungeons ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useDungeons ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x39 ^ 0x3C ^ (0x29 ^ 0x35)) & (130 + 32 - 93 + 113 ^ 144 + 57 - 63 + 37 ^ -" ".length())) != 0x0) {
                        return ((0x1D ^ 0x74 ^ (0x3B ^ 0x4B)) & (21 + 128 - 61 + 44 ^ 45 + 49 - 73 + 136 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useLavaLakes ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useLavaLakes ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() == 0) {
                        return ((0x8E ^ 0x86) & ~(0x41 ^ 0x49)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useLavaOceans ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useLavaOceans ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-(0x61 ^ 0x65) > 0) {
                        return ((0x83 ^ 0xBA) & ~(0x15 ^ 0x2C)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useMineShafts ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useMineShafts ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (((0x63 ^ 0x37) & ~(0xFE ^ 0xAA)) > "   ".length()) {
                        return ((0x2F ^ 0x61) & ~(0x1A ^ 0x54)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useRavines ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useRavines ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (-"   ".length() > 0) {
                        return ((0x3C ^ 0x8 ^ (0x92 ^ 0x82)) & (224 + 31 - 184 + 160 ^ 89 + 16 - 102 + 192 ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useStrongholds ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useStrongholds ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((0xED ^ 0xA6 ^ (0x37 ^ 0x30)) & (0x5A ^ 0x62 ^ (0x43 ^ 0x37) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useTemples ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useTemples ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (" ".length() == 0) {
                        return ((0xFF ^ 0xAC ^ (0xB ^ 0x1D)) & (0xE ^ 0x1A ^ (0x5B ^ 0xA) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useMonuments ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useMonuments ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("  ".length() < 0) {
                        return ((0x13 ^ 0x56) & ~(0x41 ^ 0x4)) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useVillages ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useVillages ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if (null != null) {
                        return ((0x83 ^ 0xBC ^ (0x59 ^ 0x49)) & (0x2 ^ 0x1D ^ (0xF5 ^ 0xC5) ^ -" ".length())) != 0x0;
                    }
                }
                else if (lIIlIllllIllIlll(this.useWaterLakes ? 1 : 0, llllllllllllIllIIllIlllIIIlIlIlI.useWaterLakes ? 1 : 0)) {
                    n = Factory.llIllIlIIlIIIl[5];
                    "".length();
                    if ("   ".length() <= " ".length()) {
                        return ((0x57 ^ 0x62) & ~(0x72 ^ 0x47)) != 0x0;
                    }
                }
                else if (lIIlIllllIlllIIl(this.waterLakeChance, llllllllllllIllIIllIlllIIIlIlIlI.waterLakeChance)) {
                    n = Factory.llIllIlIIlIIIl[1];
                    "".length();
                    if ("  ".length() == ((0xA7 ^ 0x8B) & ~(0xB3 ^ 0x9F))) {
                        return ((0xBF ^ 0x9B) & ~(0x2E ^ 0xA)) != 0x0;
                    }
                }
                else {
                    n = Factory.llIllIlIIlIIIl[5];
                }
                return n != 0;
            }
            return Factory.llIllIlIIlIIIl[5] != 0;
        }
    }
}
