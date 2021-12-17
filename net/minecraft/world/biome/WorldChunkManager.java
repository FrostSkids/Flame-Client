// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import net.minecraft.world.World;
import java.util.Random;
import com.google.common.collect.Lists;
import net.minecraft.world.WorldType;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import net.minecraft.crash.CrashReport;
import net.minecraft.util.BlockPos;
import net.minecraft.world.gen.layer.IntCache;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.List;
import net.minecraft.world.gen.layer.GenLayer;

public class WorldChunkManager
{
    private static final /* synthetic */ int[] lIllIIlIIlllll;
    private /* synthetic */ GenLayer genBiomes;
    private static final /* synthetic */ String[] lIllIIIllllllI;
    private /* synthetic */ BiomeCache biomeCache;
    private /* synthetic */ GenLayer biomeIndexLayer;
    private /* synthetic */ String field_180301_f;
    private /* synthetic */ List<BiomeGenBase> biomesToSpawnIn;
    
    private static boolean lllllIIllIlIIll(final Object lllllllllllllIIIIIlIIIIlIIIIlIIl) {
        return lllllllllllllIIIIIlIIIIlIIIIlIIl != null;
    }
    
    private static String lllllIIlIIllIll(final String lllllllllllllIIIIIlIIIIlIIlIllII, final String lllllllllllllIIIIIlIIIIlIIlIlIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIIIlIIllIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIIIlIIlIlIlI.getBytes(StandardCharsets.UTF_8)), WorldChunkManager.lIllIIlIIlllll[8]), "DES");
            final Cipher lllllllllllllIIIIIlIIIIlIIllIlII = Cipher.getInstance("DES");
            lllllllllllllIIIIIlIIIIlIIllIlII.init(WorldChunkManager.lIllIIlIIlllll[2], lllllllllllllIIIIIlIIIIlIIllIlIl);
            return new String(lllllllllllllIIIIIlIIIIlIIllIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIIIlIIllIIlI) {
            lllllllllllllIIIIIlIIIIlIIllIIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lllllIIlIlIIIII() {
        (lIllIIIllllllI = new String[WorldChunkManager.lIllIIlIIlllll[23]])[WorldChunkManager.lIllIIlIIlllll[0]] = lllllIIlIIllIIl("KyZbOAav/W4=", "ZtbBp");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[1]] = lllllIIlIIllIlI("ERYzBgAxHGUlBTcVIEcFPA==", "XxEgl");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[2]] = lllllIIlIIllIlI("PS41NBwYLS4YFhYiKQ==", "yABZz");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[3]] = lllllIIlIIllIlI("NBwrLhx2HCA=", "VuDCy");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[4]] = lllllIIlIIllIlI("EzYjDzAWNTgSDSp5JwgsEg==", "wYTaV");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[5]] = lllllIIlIIllIIl("Xu7TNzwfwvU=", "lCJSG");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[6]] = lllllIIlIIllIll("AvV1X8OKlsk=", "iTWxX");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[7]] = lllllIIlIIllIlI("FQ==", "bDiOK");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[8]] = lllllIIlIIllIIl("Ile2ZIz8qsI=", "Yfeeb");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[9]] = lllllIIlIIllIlI("BjgvFC0mMnk3KCA7PFUoKw==", "OVYuA");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[10]] = lllllIIlIIllIIl("dVJOFMLFyexLaMPAjepZIw==", "CelWm");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[11]] = lllllIIlIIllIll("qy1YReTHF9Xk25yzKxxb8g==", "ideWR");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[12]] = lllllIIlIIllIlI("Lg==", "VAVjo");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[13]] = lllllIIlIIllIll("yDFuawOw15k=", "vaBnE");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[14]] = lllllIIlIIllIll("JVEkaUxgrsw=", "iUQsq");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[15]] = lllllIIlIIllIlI("IA==", "HLDFk");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[16]] = lllllIIlIIllIIl("eThiR9BQOos/7ov1+d5sCrbdQ9BeHJlB", "IiMeT");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[17]] = lllllIIlIIllIll("ASroSt757S0=", "ieElk");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[18]] = lllllIIlIIllIIl("yxW7C6yk8r8=", "RAfPE");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[19]] = lllllIIlIIllIll("cwKRP98dPOE=", "bgmYB");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[20]] = lllllIIlIIllIlI("KA==", "RnGpQ");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[21]] = lllllIIlIIllIlI("GiIWIQcb", "hCrHr");
        WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[22]] = lllllIIlIIllIlI("Ki8jHhUuJw==", "KCOqb");
    }
    
    public BiomeGenBase[] getBiomeGenAt(BiomeGenBase[] lllllllllllllIIIIIlIIIlIIllIIlII, final int lllllllllllllIIIIIlIIIlIIlllIlII, final int lllllllllllllIIIIIlIIIlIIllIIIIl, final int lllllllllllllIIIIIlIIIlIIllIIIII, final int lllllllllllllIIIIIlIIIlIIlIlllll, final boolean lllllllllllllIIIIIlIIIlIIlIlllIl) {
        IntCache.resetIntCache();
        if (!lllllIIllIlIIll(lllllllllllllIIIIIlIIIlIIllIIlII) || lllllIIllIlIlII(lllllllllllllIIIIIlIIIlIIllIIlII.length, lllllllllllllIIIIIlIIIlIIllIIIII * lllllllllllllIIIIIlIIIlIIlIlllll)) {
            lllllllllllllIIIIIlIIIlIIllIIlII = new BiomeGenBase[lllllllllllllIIIIIlIIIlIIllIIIII * lllllllllllllIIIIIlIIIlIIlIlllll];
        }
        if (lllllIIllIllIll(lllllllllllllIIIIIlIIIlIIlIlllIl ? 1 : 0) && lllllIIllIlllII(lllllllllllllIIIIIlIIIlIIllIIIII, WorldChunkManager.lIllIIlIIlllll[16]) && lllllIIllIlllII(lllllllllllllIIIIIlIIIlIIlIlllll, WorldChunkManager.lIllIIlIIlllll[16]) && lllllIIllIlllIl(lllllllllllllIIIIIlIIIlIIlllIlII & WorldChunkManager.lIllIIlIIlllll[15]) && lllllIIllIlllIl(lllllllllllllIIIIIlIIIlIIllIIIIl & WorldChunkManager.lIllIIlIIlllll[15])) {
            final BiomeGenBase[] lllllllllllllIIIIIlIIIlIIllIllII = this.biomeCache.getCachedBiomes(lllllllllllllIIIIIlIIIlIIlllIlII, lllllllllllllIIIIIlIIIlIIllIIIIl);
            System.arraycopy(lllllllllllllIIIIIlIIIlIIllIllII, WorldChunkManager.lIllIIlIIlllll[0], lllllllllllllIIIIIlIIIlIIllIIlII, WorldChunkManager.lIllIIlIIlllll[0], lllllllllllllIIIIIlIIIlIIllIIIII * lllllllllllllIIIIIlIIIlIIlIlllll);
            return lllllllllllllIIIIIlIIIlIIllIIlII;
        }
        final int[] lllllllllllllIIIIIlIIIlIIllIlIlI = this.biomeIndexLayer.getInts(lllllllllllllIIIIIlIIIlIIlllIlII, lllllllllllllIIIIIlIIIlIIllIIIIl, lllllllllllllIIIIIlIIIlIIllIIIII, lllllllllllllIIIIIlIIIlIIlIlllll);
        int lllllllllllllIIIIIlIIIlIIllIlIII = WorldChunkManager.lIllIIlIIlllll[0];
        "".length();
        if (null != null) {
            return null;
        }
        while (!lllllIIllIlIlll(lllllllllllllIIIIIlIIIlIIllIlIII, lllllllllllllIIIIIlIIIlIIllIIIII * lllllllllllllIIIIIlIIIlIIlIlllll)) {
            lllllllllllllIIIIIlIIIlIIllIIlII[lllllllllllllIIIIIlIIIlIIllIlIII] = BiomeGenBase.getBiomeFromBiomeList(lllllllllllllIIIIIlIIIlIIllIlIlI[lllllllllllllIIIIIlIIIlIIllIlIII], BiomeGenBase.field_180279_ad);
            ++lllllllllllllIIIIIlIIIlIIllIlIII;
        }
        return lllllllllllllIIIIIlIIIlIIllIIlII;
    }
    
    public BiomeGenBase getBiomeGenerator(final BlockPos lllllllllllllIIIIIlIIIllIIIIlllI) {
        return this.getBiomeGenerator(lllllllllllllIIIIIlIIIllIIIIlllI, null);
    }
    
    public BiomeGenBase[] getBiomesForGeneration(BiomeGenBase[] lllllllllllllIIIIIlIIIlIlIllllIl, final int lllllllllllllIIIIIlIIIlIlIllllII, final int lllllllllllllIIIIIlIIIlIlIlllIlI, final int lllllllllllllIIIIIlIIIlIlIlllIII, final int lllllllllllllIIIIIlIIIlIllIIlIIl) {
        IntCache.resetIntCache();
        if (!lllllIIllIlIIll(lllllllllllllIIIIIlIIIlIlIllllIl) || lllllIIllIlIlII(lllllllllllllIIIIIlIIIlIlIllllIl.length, lllllllllllllIIIIIlIIIlIlIlllIII * lllllllllllllIIIIIlIIIlIllIIlIIl)) {
            lllllllllllllIIIIIlIIIlIlIllllIl = new BiomeGenBase[lllllllllllllIIIIIlIIIlIlIlllIII * lllllllllllllIIIIIlIIIlIllIIlIIl];
        }
        final int[] lllllllllllllIIIIIlIIIlIllIIlIII = this.genBiomes.getInts(lllllllllllllIIIIIlIIIlIlIllllII, lllllllllllllIIIIIlIIIlIlIlllIlI, lllllllllllllIIIIIlIIIlIlIlllIII, lllllllllllllIIIIIlIIIlIllIIlIIl);
        try {
            int lllllllllllllIIIIIlIIIlIllIIIllI = WorldChunkManager.lIllIIlIIlllll[0];
            "".length();
            if (" ".length() > (0x77 ^ 0x73)) {
                return null;
            }
            while (!lllllIIllIlIlll(lllllllllllllIIIIIlIIIlIllIIIllI, lllllllllllllIIIIIlIIIlIlIlllIII * lllllllllllllIIIIIlIIIlIllIIlIIl)) {
                lllllllllllllIIIIIlIIIlIlIllllIl[lllllllllllllIIIIIlIIIlIllIIIllI] = BiomeGenBase.getBiomeFromBiomeList(lllllllllllllIIIIIlIIIlIllIIlIII[lllllllllllllIIIIIlIIIlIllIIIllI], BiomeGenBase.field_180279_ad);
                ++lllllllllllllIIIIIlIIIlIllIIIllI;
            }
            return lllllllllllllIIIIIlIIIlIlIllllIl;
        }
        catch (Throwable lllllllllllllIIIIIlIIIlIllIIIlIl) {
            final CrashReport lllllllllllllIIIIIlIIIlIllIIIIll = CrashReport.makeCrashReport(lllllllllllllIIIIIlIIIlIllIIIlIl, WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[9]]);
            final CrashReportCategory lllllllllllllIIIIIlIIIlIllIIIIIl = lllllllllllllIIIIIlIIIlIllIIIIll.makeCategory(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[10]]);
            lllllllllllllIIIIIlIIIlIllIIIIIl.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[11]], lllllllllllllIIIIIlIIIlIlIllllIl.length);
            lllllllllllllIIIIIlIIIlIllIIIIIl.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[12]], lllllllllllllIIIIIlIIIlIlIllllII);
            lllllllllllllIIIIIlIIIlIllIIIIIl.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[13]], lllllllllllllIIIIIlIIIlIlIlllIlI);
            lllllllllllllIIIIIlIIIlIllIIIIIl.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[14]], lllllllllllllIIIIIlIIIlIlIlllIII);
            lllllllllllllIIIIIlIIIlIllIIIIIl.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[15]], lllllllllllllIIIIIlIIIlIllIIlIIl);
            throw new ReportedException(lllllllllllllIIIIIlIIIlIllIIIIll);
        }
    }
    
    public void cleanupCache() {
        this.biomeCache.cleanupCache();
    }
    
    public float getTemperatureAtHeight(final float lllllllllllllIIIIIlIIIlIllIllllI, final int lllllllllllllIIIIIlIIIlIllIlllll) {
        return lllllllllllllIIIIIlIIIlIllIllllI;
    }
    
    private static boolean lllllIIllIlllII(final int lllllllllllllIIIIIlIIIIlIIIlllII, final int lllllllllllllIIIIIlIIIIlIIIllIll) {
        return lllllllllllllIIIIIlIIIIlIIIlllII == lllllllllllllIIIIIlIIIIlIIIllIll;
    }
    
    private static boolean lllllIIllIlllIl(final int lllllllllllllIIIIIlIIIIlIIIIIIII) {
        return lllllllllllllIIIIIlIIIIlIIIIIIII == 0;
    }
    
    public float[] getRainfall(float[] lllllllllllllIIIIIlIIIlIlllIllII, final int lllllllllllllIIIIIlIIIlIlllIlIll, final int lllllllllllllIIIIIlIIIlIlllIlIlI, final int lllllllllllllIIIIIlIIIlIlllIlIIl, final int lllllllllllllIIIIIlIIIlIllllIlII) {
        IntCache.resetIntCache();
        if (!lllllIIllIlIIll(lllllllllllllIIIIIlIIIlIlllIllII) || lllllIIllIlIlII(lllllllllllllIIIIIlIIIlIlllIllII.length, lllllllllllllIIIIIlIIIlIlllIlIIl * lllllllllllllIIIIIlIIIlIllllIlII)) {
            lllllllllllllIIIIIlIIIlIlllIllII = new float[lllllllllllllIIIIIlIIIlIlllIlIIl * lllllllllllllIIIIIlIIIlIllllIlII];
        }
        final int[] lllllllllllllIIIIIlIIIlIllllIIll = this.biomeIndexLayer.getInts(lllllllllllllIIIIIlIIIlIlllIlIll, lllllllllllllIIIIIlIIIlIlllIlIlI, lllllllllllllIIIIIlIIIlIlllIlIIl, lllllllllllllIIIIIlIIIlIllllIlII);
        int lllllllllllllIIIIIlIIIlIllllIIlI = WorldChunkManager.lIllIIlIIlllll[0];
        "".length();
        if ((0x1A ^ 0x1E) != (0xB9 ^ 0xBD)) {
            return null;
        }
        while (!lllllIIllIlIlll(lllllllllllllIIIIIlIIIlIllllIIlI, lllllllllllllIIIIIlIIIlIlllIlIIl * lllllllllllllIIIIIlIIIlIllllIlII)) {
            try {
                float lllllllllllllIIIIIlIIIlIllllIIIl = BiomeGenBase.getBiomeFromBiomeList(lllllllllllllIIIIIlIIIlIllllIIll[lllllllllllllIIIIIlIIIlIllllIIlI], BiomeGenBase.field_180279_ad).getIntRainfall() / 65536.0f;
                if (lllllIIllIlIllI(lllllIIllIlIIlI(lllllllllllllIIIIIlIIIlIllllIIIl, 1.0f))) {
                    lllllllllllllIIIIIlIIIlIllllIIIl = 1.0f;
                }
                lllllllllllllIIIIIlIIIlIlllIllII[lllllllllllllIIIIIlIIIlIllllIIlI] = lllllllllllllIIIIIlIIIlIllllIIIl;
                "".length();
                if ((0x9 ^ 0xD) == 0x0) {
                    return null;
                }
            }
            catch (Throwable lllllllllllllIIIIIlIIIlIllllIIII) {
                final CrashReport lllllllllllllIIIIIlIIIlIlllIllll = CrashReport.makeCrashReport(lllllllllllllIIIIIlIIIlIllllIIII, WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[1]]);
                final CrashReportCategory lllllllllllllIIIIIlIIIlIlllIlllI = lllllllllllllIIIIIlIIIlIlllIllll.makeCategory(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[2]]);
                lllllllllllllIIIIIlIIIlIlllIlllI.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[3]], lllllllllllllIIIIIlIIIlIllllIIlI);
                lllllllllllllIIIIIlIIIlIlllIlllI.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[4]], lllllllllllllIIIIIlIIIlIlllIllII.length);
                lllllllllllllIIIIIlIIIlIlllIlllI.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[5]], lllllllllllllIIIIIlIIIlIlllIlIll);
                lllllllllllllIIIIIlIIIlIlllIlllI.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[6]], lllllllllllllIIIIIlIIIlIlllIlIlI);
                lllllllllllllIIIIIlIIIlIlllIlllI.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[7]], lllllllllllllIIIIIlIIIlIlllIlIIl);
                lllllllllllllIIIIIlIIIlIlllIlllI.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[8]], lllllllllllllIIIIIlIIIlIllllIlII);
                throw new ReportedException(lllllllllllllIIIIIlIIIlIlllIllll);
            }
            ++lllllllllllllIIIIIlIIIlIllllIIlI;
        }
        return (float[])lllllllllllllIIIIIlIIIlIlllIllII;
    }
    
    private static int lllllIIllIlIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public BiomeGenBase getBiomeGenerator(final BlockPos lllllllllllllIIIIIlIIIllIIIIIllI, final BiomeGenBase lllllllllllllIIIIIlIIIllIIIIIlIl) {
        return this.biomeCache.func_180284_a(lllllllllllllIIIIIlIIIllIIIIIllI.getX(), lllllllllllllIIIIIlIIIllIIIIIllI.getZ(), lllllllllllllIIIIIlIIIllIIIIIlIl);
    }
    
    public WorldChunkManager(final long lllllllllllllIIIIIlIIIllIIlIIIII, final WorldType lllllllllllllIIIIIlIIIllIIIlllll, final String lllllllllllllIIIIIlIIIllIIlIIIll) {
        this();
        this.field_180301_f = lllllllllllllIIIIIlIIIllIIlIIIll;
        final GenLayer[] lllllllllllllIIIIIlIIIllIIlIIIlI = GenLayer.initializeAllBiomeGenerators(lllllllllllllIIIIIlIIIllIIlIIIII, lllllllllllllIIIIIlIIIllIIIlllll, lllllllllllllIIIIIlIIIllIIlIIIll);
        this.genBiomes = lllllllllllllIIIIIlIIIllIIlIIIlI[WorldChunkManager.lIllIIlIIlllll[0]];
        this.biomeIndexLayer = lllllllllllllIIIIIlIIIllIIlIIIlI[WorldChunkManager.lIllIIlIIlllll[1]];
    }
    
    protected WorldChunkManager() {
        this.biomeCache = new BiomeCache(this);
        this.field_180301_f = WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[0]];
        this.biomesToSpawnIn = (List<BiomeGenBase>)Lists.newArrayList();
        this.biomesToSpawnIn.add(BiomeGenBase.forest);
        "".length();
        this.biomesToSpawnIn.add(BiomeGenBase.plains);
        "".length();
        this.biomesToSpawnIn.add(BiomeGenBase.taiga);
        "".length();
        this.biomesToSpawnIn.add(BiomeGenBase.taigaHills);
        "".length();
        this.biomesToSpawnIn.add(BiomeGenBase.forestHills);
        "".length();
        this.biomesToSpawnIn.add(BiomeGenBase.jungle);
        "".length();
        this.biomesToSpawnIn.add(BiomeGenBase.jungleHills);
        "".length();
    }
    
    public List<BiomeGenBase> getBiomesToSpawnIn() {
        return this.biomesToSpawnIn;
    }
    
    public boolean areBiomesViable(final int lllllllllllllIIIIIlIIIlIIIIlIIII, final int lllllllllllllIIIIIlIIIlIIIlIlIlI, final int lllllllllllllIIIIIlIIIlIIIlIlIII, final List<BiomeGenBase> lllllllllllllIIIIIlIIIlIIIIIlIlI) {
        IntCache.resetIntCache();
        final int lllllllllllllIIIIIlIIIlIIIlIIlIl = lllllllllllllIIIIIlIIIlIIIIlIIII - lllllllllllllIIIIIlIIIlIIIlIlIII >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIlIIIlIIIll = lllllllllllllIIIIIlIIIlIIIlIlIlI - lllllllllllllIIIIIlIIIlIIIlIlIII >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIlIIIlIIIlI = lllllllllllllIIIIIlIIIlIIIIlIIII + lllllllllllllIIIIIlIIIlIIIlIlIII >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIlIIIlIIIIl = lllllllllllllIIIIIlIIIlIIIlIlIlI + lllllllllllllIIIIIlIIIlIIIlIlIII >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIlIIIIlllll = lllllllllllllIIIIIlIIIlIIIlIIIlI - lllllllllllllIIIIIlIIIlIIIlIIlIl + WorldChunkManager.lIllIIlIIlllll[1];
        final int lllllllllllllIIIIIlIIIlIIIIlllIl = lllllllllllllIIIIIlIIIlIIIlIIIIl - lllllllllllllIIIIIlIIIlIIIlIIIll + WorldChunkManager.lIllIIlIIlllll[1];
        final int[] lllllllllllllIIIIIlIIIlIIIIllIll = this.genBiomes.getInts(lllllllllllllIIIIIlIIIlIIIlIIlIl, lllllllllllllIIIIIlIIIlIIIlIIIll, lllllllllllllIIIIIlIIIlIIIIlllll, lllllllllllllIIIIIlIIIlIIIIlllIl);
        try {
            int lllllllllllllIIIIIlIIIlIIIIllIlI = WorldChunkManager.lIllIIlIIlllll[0];
            "".length();
            if ((23 + 130 - 70 + 61 ^ 87 + 97 - 69 + 33) < -" ".length()) {
                return ((0x64 ^ 0x41 ^ (0x7C ^ 0x6)) & (0x50 ^ 0x49 ^ (0x23 ^ 0x65) ^ -" ".length())) != 0x0;
            }
            while (!lllllIIllIlIlll(lllllllllllllIIIIIlIIIlIIIIllIlI, lllllllllllllIIIIIlIIIlIIIIlllll * lllllllllllllIIIIIlIIIlIIIIlllIl)) {
                final BiomeGenBase lllllllllllllIIIIIlIIIlIIIIllIII = BiomeGenBase.getBiome(lllllllllllllIIIIIlIIIlIIIIllIll[lllllllllllllIIIIIlIIIlIIIIllIlI]);
                if (lllllIIllIlllIl(lllllllllllllIIIIIlIIIlIIIIIlIlI.contains(lllllllllllllIIIIIlIIIlIIIIllIII) ? 1 : 0)) {
                    return WorldChunkManager.lIllIIlIIlllll[0] != 0;
                }
                ++lllllllllllllIIIIIlIIIlIIIIllIlI;
            }
            return WorldChunkManager.lIllIIlIIlllll[1] != 0;
        }
        catch (Throwable lllllllllllllIIIIIlIIIlIIIIlIllI) {
            final CrashReport lllllllllllllIIIIIlIIIlIIIIlIlIl = CrashReport.makeCrashReport(lllllllllllllIIIIIlIIIlIIIIlIllI, WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[16]]);
            final CrashReportCategory lllllllllllllIIIIIlIIIlIIIIlIIll = lllllllllllllIIIIIlIIIlIIIIlIlIl.makeCategory(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[17]]);
            lllllllllllllIIIIIlIIIlIIIIlIIll.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[18]], this.genBiomes.toString());
            lllllllllllllIIIIIlIIIlIIIIlIIll.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[19]], lllllllllllllIIIIIlIIIlIIIIlIIII);
            lllllllllllllIIIIIlIIIlIIIIlIIll.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[20]], lllllllllllllIIIIIlIIIlIIIlIlIlI);
            lllllllllllllIIIIIlIIIlIIIIlIIll.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[21]], lllllllllllllIIIIIlIIIlIIIlIlIII);
            lllllllllllllIIIIIlIIIlIIIIlIIll.addCrashSection(WorldChunkManager.lIllIIIllllllI[WorldChunkManager.lIllIIlIIlllll[22]], lllllllllllllIIIIIlIIIlIIIIIlIlI);
            throw new ReportedException(lllllllllllllIIIIIlIIIlIIIIlIlIl);
        }
    }
    
    static {
        lllllIIllIlIIIl();
        lllllIIlIlIIIII();
    }
    
    private static void lllllIIllIlIIIl() {
        (lIllIIlIIlllll = new int[24])[0] = ((161 + 77 - 232 + 158 ^ 91 + 73 - 121 + 105) & (19 + 164 - 123 + 183 ^ 26 + 37 + 88 + 44 ^ -" ".length()));
        WorldChunkManager.lIllIIlIIlllll[1] = " ".length();
        WorldChunkManager.lIllIIlIIlllll[2] = "  ".length();
        WorldChunkManager.lIllIIlIIlllll[3] = "   ".length();
        WorldChunkManager.lIllIIlIIlllll[4] = (0x7E ^ 0x14 ^ (0xDD ^ 0xB3));
        WorldChunkManager.lIllIIlIIlllll[5] = (0x6C ^ 0xC ^ (0x28 ^ 0x4D));
        WorldChunkManager.lIllIIlIIlllll[6] = (0xA0 ^ 0xA6);
        WorldChunkManager.lIllIIlIIlllll[7] = (0xD2 ^ 0x8F ^ (0x15 ^ 0x4F));
        WorldChunkManager.lIllIIlIIlllll[8] = (0xB3 ^ 0xB9 ^ "  ".length());
        WorldChunkManager.lIllIIlIIlllll[9] = (87 + 114 - 173 + 108 ^ 36 + 35 - 37 + 95);
        WorldChunkManager.lIllIIlIIlllll[10] = (0x3C ^ 0x36);
        WorldChunkManager.lIllIIlIIlllll[11] = (0xD9 ^ 0xB7 ^ (0x6E ^ 0xB));
        WorldChunkManager.lIllIIlIIlllll[12] = (0x38 ^ 0x5A ^ (0x6D ^ 0x3));
        WorldChunkManager.lIllIIlIIlllll[13] = (164 + 48 - 10 + 3 ^ 132 + 172 - 114 + 2);
        WorldChunkManager.lIllIIlIIlllll[14] = (28 + 78 - 82 + 160 ^ 169 + 47 - 129 + 95);
        WorldChunkManager.lIllIIlIIlllll[15] = (0xD3 ^ 0xB5 ^ (0x52 ^ 0x3B));
        WorldChunkManager.lIllIIlIIlllll[16] = (0x19 ^ 0x9);
        WorldChunkManager.lIllIIlIIlllll[17] = (0x6B ^ 0x7A);
        WorldChunkManager.lIllIIlIIlllll[18] = (0x63 ^ 0x71);
        WorldChunkManager.lIllIIlIIlllll[19] = (0x11 ^ 0x40 ^ (0xE7 ^ 0xA5));
        WorldChunkManager.lIllIIlIIlllll[20] = (0x84 ^ 0x90);
        WorldChunkManager.lIllIIlIIlllll[21] = (1 + 0 + 125 + 19 ^ 115 + 38 - 41 + 20);
        WorldChunkManager.lIllIIlIIlllll[22] = (0x32 ^ 0x24);
        WorldChunkManager.lIllIIlIIlllll[23] = (0x6 ^ 0x42 ^ (0xD7 ^ 0x84));
    }
    
    private static String lllllIIlIIllIlI(String lllllllllllllIIIIIlIIIIlIlIIllII, final String lllllllllllllIIIIIlIIIIlIlIIlIll) {
        lllllllllllllIIIIIlIIIIlIlIIllII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIlIIIIlIlIIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIlIIIIlIlIIllll = new StringBuilder();
        final char[] lllllllllllllIIIIIlIIIIlIlIIlllI = lllllllllllllIIIIIlIIIIlIlIIlIll.toCharArray();
        int lllllllllllllIIIIIlIIIIlIlIIllIl = WorldChunkManager.lIllIIlIIlllll[0];
        final long lllllllllllllIIIIIlIIIIlIlIIIlIl = (Object)((String)lllllllllllllIIIIIlIIIIlIlIIllII).toCharArray();
        final Exception lllllllllllllIIIIIlIIIIlIlIIIlII = (Exception)lllllllllllllIIIIIlIIIIlIlIIIlIl.length;
        short lllllllllllllIIIIIlIIIIlIlIIIIlI = (short)WorldChunkManager.lIllIIlIIlllll[0];
        while (lllllIIllIlIlII(lllllllllllllIIIIIlIIIIlIlIIIIlI, (int)lllllllllllllIIIIIlIIIIlIlIIIlII)) {
            final char lllllllllllllIIIIIlIIIIlIlIlIlIl = lllllllllllllIIIIIlIIIIlIlIIIlIl[lllllllllllllIIIIIlIIIIlIlIIIIlI];
            lllllllllllllIIIIIlIIIIlIlIIllll.append((char)(lllllllllllllIIIIIlIIIIlIlIlIlIl ^ lllllllllllllIIIIIlIIIIlIlIIlllI[lllllllllllllIIIIIlIIIIlIlIIllIl % lllllllllllllIIIIIlIIIIlIlIIlllI.length]));
            "".length();
            ++lllllllllllllIIIIIlIIIIlIlIIllIl;
            ++lllllllllllllIIIIIlIIIIlIlIIIIlI;
            "".length();
            if (((0x44 ^ 0x42) & ~(0x9A ^ 0x9C)) < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIlIIIIlIlIIllll);
    }
    
    private static boolean lllllIIllIllIll(final int lllllllllllllIIIIIlIIIIlIIIIIlIl) {
        return lllllllllllllIIIIIlIIIIlIIIIIlIl != 0;
    }
    
    private static boolean lllllIIllIlIlII(final int lllllllllllllIIIIIlIIIIlIIIIllIl, final int lllllllllllllIIIIIlIIIIlIIIIlIll) {
        return lllllllllllllIIIIIlIIIIlIIIIllIl < lllllllllllllIIIIIlIIIIlIIIIlIll;
    }
    
    public BlockPos findBiomePosition(final int lllllllllllllIIIIIlIIIIlllIIlIlI, final int lllllllllllllIIIIIlIIIIlllIIlIIl, final int lllllllllllllIIIIIlIIIIllIlIlIlI, final List<BiomeGenBase> lllllllllllllIIIIIlIIIIllIlIlIIl, final Random lllllllllllllIIIIIlIIIIlllIIIIll) {
        IntCache.resetIntCache();
        final int lllllllllllllIIIIIlIIIIlllIIIIIl = lllllllllllllIIIIIlIIIIlllIIlIlI - lllllllllllllIIIIIlIIIIllIlIlIlI >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIIllIllllll = lllllllllllllIIIIIlIIIIlllIIlIIl - lllllllllllllIIIIIlIIIIllIlIlIlI >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIIllIlllllI = lllllllllllllIIIIIlIIIIlllIIlIlI + lllllllllllllIIIIIlIIIIllIlIlIlI >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIIllIllllII = lllllllllllllIIIIIlIIIIlllIIlIIl + lllllllllllllIIIIIlIIIIllIlIlIlI >> WorldChunkManager.lIllIIlIIlllll[2];
        final int lllllllllllllIIIIIlIIIIllIlllIlI = lllllllllllllIIIIIlIIIIllIlllllI - lllllllllllllIIIIIlIIIIlllIIIIIl + WorldChunkManager.lIllIIlIIlllll[1];
        final int lllllllllllllIIIIIlIIIIllIlllIIl = lllllllllllllIIIIIlIIIIllIllllII - lllllllllllllIIIIIlIIIIllIllllll + WorldChunkManager.lIllIIlIIlllll[1];
        final int[] lllllllllllllIIIIIlIIIIllIllIlll = this.genBiomes.getInts(lllllllllllllIIIIIlIIIIlllIIIIIl, lllllllllllllIIIIIlIIIIllIllllll, lllllllllllllIIIIIlIIIIllIlllIlI, lllllllllllllIIIIIlIIIIllIlllIIl);
        BlockPos lllllllllllllIIIIIlIIIIllIllIlIl = null;
        int lllllllllllllIIIIIlIIIIllIllIIll = WorldChunkManager.lIllIIlIIlllll[0];
        int lllllllllllllIIIIIlIIIIllIllIIIl = WorldChunkManager.lIllIIlIIlllll[0];
        "".length();
        if ("   ".length() < 0) {
            return null;
        }
        while (!lllllIIllIlIlll(lllllllllllllIIIIIlIIIIllIllIIIl, lllllllllllllIIIIIlIIIIllIlllIlI * lllllllllllllIIIIIlIIIIllIlllIIl)) {
            final int lllllllllllllIIIIIlIIIIllIllIIII = lllllllllllllIIIIIlIIIIlllIIIIIl + lllllllllllllIIIIIlIIIIllIllIIIl % lllllllllllllIIIIIlIIIIllIlllIlI << WorldChunkManager.lIllIIlIIlllll[2];
            final int lllllllllllllIIIIIlIIIIllIlIllll = lllllllllllllIIIIIlIIIIllIllllll + lllllllllllllIIIIIlIIIIllIllIIIl / lllllllllllllIIIIIlIIIIllIlllIlI << WorldChunkManager.lIllIIlIIlllll[2];
            final BiomeGenBase lllllllllllllIIIIIlIIIIllIlIlllI = BiomeGenBase.getBiome(lllllllllllllIIIIIlIIIIllIllIlll[lllllllllllllIIIIIlIIIIllIllIIIl]);
            if (lllllIIllIllIll(lllllllllllllIIIIIlIIIIllIlIlIIl.contains(lllllllllllllIIIIIlIIIIllIlIlllI) ? 1 : 0) && (!lllllIIllIlIIll(lllllllllllllIIIIIlIIIIllIllIlIl) || lllllIIllIlllIl(lllllllllllllIIIIIlIIIIlllIIIIll.nextInt(lllllllllllllIIIIIlIIIIllIllIIll + WorldChunkManager.lIllIIlIIlllll[1])))) {
                lllllllllllllIIIIIlIIIIllIllIlIl = new BlockPos(lllllllllllllIIIIIlIIIIllIllIIII, WorldChunkManager.lIllIIlIIlllll[0], lllllllllllllIIIIIlIIIIllIlIllll);
                ++lllllllllllllIIIIIlIIIIllIllIIll;
            }
            ++lllllllllllllIIIIIlIIIIllIllIIIl;
        }
        return lllllllllllllIIIIIlIIIIllIllIlIl;
    }
    
    private static boolean lllllIIllIlIlll(final int lllllllllllllIIIIIlIIIIlIIIlIllI, final int lllllllllllllIIIIIlIIIIlIIIlIlII) {
        return lllllllllllllIIIIIlIIIIlIIIlIllI >= lllllllllllllIIIIIlIIIIlIIIlIlII;
    }
    
    private static boolean lllllIIllIlIllI(final int lllllllllllllIIIIIlIIIIIllllllII) {
        return lllllllllllllIIIIIlIIIIIllllllII > 0;
    }
    
    public WorldChunkManager(final World lllllllllllllIIIIIlIIIllIIIlIlll) {
        this(lllllllllllllIIIIIlIIIllIIIlIlll.getSeed(), lllllllllllllIIIIIlIIIllIIIlIlll.getWorldInfo().getTerrainType(), lllllllllllllIIIIIlIIIllIIIlIlll.getWorldInfo().getGeneratorOptions());
    }
    
    public BiomeGenBase[] loadBlockGeneratorData(final BiomeGenBase[] lllllllllllllIIIIIlIIIlIlIlIIlII, final int lllllllllllllIIIIIlIIIlIlIIllIII, final int lllllllllllllIIIIIlIIIlIlIIlIllI, final int lllllllllllllIIIIIlIIIlIlIIlIlII, final int lllllllllllllIIIIIlIIIlIlIIlIIlI) {
        return this.getBiomeGenAt(lllllllllllllIIIIIlIIIlIlIlIIlII, lllllllllllllIIIIIlIIIlIlIIllIII, lllllllllllllIIIIIlIIIlIlIIlIllI, lllllllllllllIIIIIlIIIlIlIIlIlII, lllllllllllllIIIIIlIIIlIlIIlIIlI, (boolean)(WorldChunkManager.lIllIIlIIlllll[1] != 0));
    }
    
    private static String lllllIIlIIllIIl(final String lllllllllllllIIIIIlIIIIlIlllIIlI, final String lllllllllllllIIIIIlIIIIlIllIllll) {
        try {
            final SecretKeySpec lllllllllllllIIIIIlIIIIlIlllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIlIIIIlIllIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIlIIIIlIlllIlIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIlIIIIlIlllIlIl.init(WorldChunkManager.lIllIIlIIlllll[2], lllllllllllllIIIIIlIIIIlIlllIlll);
            return new String(lllllllllllllIIIIIlIIIIlIlllIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIlIIIIlIlllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIlIIIIlIlllIIll) {
            lllllllllllllIIIIIlIIIIlIlllIIll.printStackTrace();
            return null;
        }
    }
}
