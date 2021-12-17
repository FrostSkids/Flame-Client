// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.util.ReportedException;
import java.util.concurrent.Callable;
import net.minecraft.crash.CrashReport;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.WorldType;

public abstract class GenLayer
{
    private /* synthetic */ long worldGenSeed;
    protected /* synthetic */ GenLayer parent;
    private static final /* synthetic */ String[] lIllIlIIlllIll;
    private /* synthetic */ long chunkSeed;
    private static final /* synthetic */ int[] lIllIlIIlllllI;
    protected /* synthetic */ long baseSeed;
    
    public static GenLayer[] initializeAllBiomeGenerators(final long lllllllllllllIIIIIIIIIIllllIlIll, final WorldType lllllllllllllIIIIIIIIIIllllIlIlI, final String lllllllllllllIIIIIIIIIIllllIlIIl) {
        GenLayer lllllllllllllIIIIIIIIIlIIIIIlIIl = new GenLayerIsland(1L);
        lllllllllllllIIIIIIIIIlIIIIIlIIl = new GenLayerFuzzyZoom(2000L, lllllllllllllIIIIIIIIIlIIIIIlIIl);
        final GenLayerAddIsland lllllllllllllIIIIIIIIIlIIIIIlIII = new GenLayerAddIsland(1L, lllllllllllllIIIIIIIIIlIIIIIlIIl);
        final GenLayerZoom lllllllllllllIIIIIIIIIlIIIIIIlll = new GenLayerZoom(2001L, lllllllllllllIIIIIIIIIlIIIIIlIII);
        GenLayerAddIsland lllllllllllllIIIIIIIIIlIIIIIIllI = new GenLayerAddIsland(2L, lllllllllllllIIIIIIIIIlIIIIIIlll);
        lllllllllllllIIIIIIIIIlIIIIIIllI = new GenLayerAddIsland(50L, lllllllllllllIIIIIIIIIlIIIIIIllI);
        lllllllllllllIIIIIIIIIlIIIIIIllI = new GenLayerAddIsland(70L, lllllllllllllIIIIIIIIIlIIIIIIllI);
        final GenLayerRemoveTooMuchOcean lllllllllllllIIIIIIIIIlIIIIIIlIl = new GenLayerRemoveTooMuchOcean(2L, lllllllllllllIIIIIIIIIlIIIIIIllI);
        final GenLayerAddSnow lllllllllllllIIIIIIIIIlIIIIIIlII = new GenLayerAddSnow(2L, lllllllllllllIIIIIIIIIlIIIIIIlIl);
        final GenLayerAddIsland lllllllllllllIIIIIIIIIlIIIIIIIll = new GenLayerAddIsland(3L, lllllllllllllIIIIIIIIIlIIIIIIlII);
        GenLayerEdge lllllllllllllIIIIIIIIIlIIIIIIIlI = new GenLayerEdge(2L, lllllllllllllIIIIIIIIIlIIIIIIIll, GenLayerEdge.Mode.COOL_WARM);
        lllllllllllllIIIIIIIIIlIIIIIIIlI = new GenLayerEdge(2L, lllllllllllllIIIIIIIIIlIIIIIIIlI, GenLayerEdge.Mode.HEAT_ICE);
        lllllllllllllIIIIIIIIIlIIIIIIIlI = new GenLayerEdge(3L, lllllllllllllIIIIIIIIIlIIIIIIIlI, GenLayerEdge.Mode.SPECIAL);
        GenLayerZoom lllllllllllllIIIIIIIIIlIIIIIIIIl = new GenLayerZoom(2002L, lllllllllllllIIIIIIIIIlIIIIIIIlI);
        lllllllllllllIIIIIIIIIlIIIIIIIIl = new GenLayerZoom(2003L, lllllllllllllIIIIIIIIIlIIIIIIIIl);
        final GenLayerAddIsland lllllllllllllIIIIIIIIIlIIIIIIIII = new GenLayerAddIsland(4L, lllllllllllllIIIIIIIIIlIIIIIIIIl);
        final GenLayerAddMushroomIsland lllllllllllllIIIIIIIIIIlllllllll = new GenLayerAddMushroomIsland(5L, lllllllllllllIIIIIIIIIlIIIIIIIII);
        final GenLayerDeepOcean lllllllllllllIIIIIIIIIIllllllllI = new GenLayerDeepOcean(4L, lllllllllllllIIIIIIIIIIlllllllll);
        final GenLayer lllllllllllllIIIIIIIIIIlllllllIl = GenLayerZoom.magnify(1000L, lllllllllllllIIIIIIIIIIllllllllI, GenLayer.lIllIlIIlllllI[0]);
        ChunkProviderSettings lllllllllllllIIIIIIIIIIlllllllII = null;
        int lllllllllllllIIIIIIIIIIllllllIlI;
        int lllllllllllllIIIIIIIIIIllllllIll = lllllllllllllIIIIIIIIIIllllllIlI = GenLayer.lIllIlIIlllllI[1];
        if (llllllIlIIIIIlI(lllllllllllllIIIIIIIIIIllllIlIlI, WorldType.CUSTOMIZED) && llllllIlIIIIIll(lllllllllllllIIIIIIIIIIllllIlIIl.length())) {
            lllllllllllllIIIIIIIIIIlllllllII = ChunkProviderSettings.Factory.jsonToFactory(lllllllllllllIIIIIIIIIIllllIlIIl).func_177864_b();
            lllllllllllllIIIIIIIIIIllllllIll = lllllllllllllIIIIIIIIIIlllllllII.biomeSize;
            lllllllllllllIIIIIIIIIIllllllIlI = lllllllllllllIIIIIIIIIIlllllllII.riverSize;
        }
        if (llllllIlIIIIIlI(lllllllllllllIIIIIIIIIIllllIlIlI, WorldType.LARGE_BIOMES)) {
            lllllllllllllIIIIIIIIIIllllllIll = GenLayer.lIllIlIIlllllI[2];
        }
        final GenLayer lllllllllllllIIIIIIIIIIllllllIIl = GenLayerZoom.magnify(1000L, lllllllllllllIIIIIIIIIIlllllllIl, GenLayer.lIllIlIIlllllI[0]);
        final GenLayerRiverInit lllllllllllllIIIIIIIIIIllllllIII = new GenLayerRiverInit(100L, lllllllllllllIIIIIIIIIIllllllIIl);
        final GenLayerBiome lllllllllllllIIIIIIIIIIlllllIlll = new GenLayerBiome(200L, lllllllllllllIIIIIIIIIIlllllllIl, lllllllllllllIIIIIIIIIIllllIlIlI, lllllllllllllIIIIIIIIIIllllIlIIl);
        final GenLayer lllllllllllllIIIIIIIIIIlllllIllI = GenLayerZoom.magnify(1000L, lllllllllllllIIIIIIIIIIlllllIlll, GenLayer.lIllIlIIlllllI[3]);
        final GenLayerBiomeEdge lllllllllllllIIIIIIIIIIlllllIlIl = new GenLayerBiomeEdge(1000L, lllllllllllllIIIIIIIIIIlllllIllI);
        final GenLayer lllllllllllllIIIIIIIIIIlllllIlII = GenLayerZoom.magnify(1000L, lllllllllllllIIIIIIIIIIllllllIII, GenLayer.lIllIlIIlllllI[3]);
        GenLayer lllllllllllllIIIIIIIIIIlllllIIll = new GenLayerHills(1000L, lllllllllllllIIIIIIIIIIlllllIlIl, lllllllllllllIIIIIIIIIIlllllIlII);
        GenLayer lllllllllllllIIIIIIIIIIlllllIIlI = GenLayerZoom.magnify(1000L, lllllllllllllIIIIIIIIIIllllllIII, GenLayer.lIllIlIIlllllI[3]);
        lllllllllllllIIIIIIIIIIlllllIIlI = GenLayerZoom.magnify(1000L, lllllllllllllIIIIIIIIIIlllllIIlI, lllllllllllllIIIIIIIIIIllllllIlI);
        final GenLayerRiver lllllllllllllIIIIIIIIIIlllllIIIl = new GenLayerRiver(1L, lllllllllllllIIIIIIIIIIlllllIIlI);
        final GenLayerSmooth lllllllllllllIIIIIIIIIIlllllIIII = new GenLayerSmooth(1000L, lllllllllllllIIIIIIIIIIlllllIIIl);
        lllllllllllllIIIIIIIIIIlllllIIll = new GenLayerRareBiome(1001L, lllllllllllllIIIIIIIIIIlllllIIll);
        int lllllllllllllIIIIIIIIIIllllIllll = GenLayer.lIllIlIIlllllI[0];
        "".length();
        if (((0x2A ^ 0x3D) & ~(0x4C ^ 0x5B)) != 0x0) {
            return null;
        }
        while (!llllllIlIIIIlll(lllllllllllllIIIIIIIIIIllllIllll, lllllllllllllIIIIIIIIIIllllllIll)) {
            lllllllllllllIIIIIIIIIIlllllIIll = new GenLayerZoom(GenLayer.lIllIlIIlllllI[4] + lllllllllllllIIIIIIIIIIllllIllll, lllllllllllllIIIIIIIIIIlllllIIll);
            if (llllllIlIIIIlII(lllllllllllllIIIIIIIIIIllllIllll)) {
                lllllllllllllIIIIIIIIIIlllllIIll = new GenLayerAddIsland(3L, lllllllllllllIIIIIIIIIIlllllIIll);
            }
            if (!llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllllIllll, GenLayer.lIllIlIIlllllI[5]) || llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllllllIll, GenLayer.lIllIlIIlllllI[5])) {
                lllllllllllllIIIIIIIIIIlllllIIll = new GenLayerShore(1000L, lllllllllllllIIIIIIIIIIlllllIIll);
            }
            ++lllllllllllllIIIIIIIIIIllllIllll;
        }
        final GenLayerSmooth lllllllllllllIIIIIIIIIIllllIlllI = new GenLayerSmooth(1000L, lllllllllllllIIIIIIIIIIlllllIIll);
        final GenLayerRiverMix lllllllllllllIIIIIIIIIIllllIllIl = new GenLayerRiverMix(100L, lllllllllllllIIIIIIIIIIllllIlllI, lllllllllllllIIIIIIIIIIlllllIIII);
        final GenLayer lllllllllllllIIIIIIIIIIllllIllII = new GenLayerVoronoiZoom(10L, lllllllllllllIIIIIIIIIIllllIllIl);
        lllllllllllllIIIIIIIIIIllllIllIl.initWorldGenSeed(lllllllllllllIIIIIIIIIIllllIlIll);
        lllllllllllllIIIIIIIIIIllllIllII.initWorldGenSeed(lllllllllllllIIIIIIIIIIllllIlIll);
        final GenLayer[] array = new GenLayer[GenLayer.lIllIlIIlllllI[6]];
        array[GenLayer.lIllIlIIlllllI[0]] = lllllllllllllIIIIIIIIIIllllIllIl;
        array[GenLayer.lIllIlIIlllllI[5]] = lllllllllllllIIIIIIIIIIllllIllII;
        array[GenLayer.lIllIlIIlllllI[3]] = lllllllllllllIIIIIIIIIIllllIllIl;
        return array;
    }
    
    private static boolean llllllIlIIIlIIl(final int lllllllllllllIIIIIIIIIIlIlIIIllI) {
        return lllllllllllllIIIIIIIIIIlIlIIIllI < 0;
    }
    
    private static boolean llllllIlIIIIIlI(final Object lllllllllllllIIIIIIIIIIlIlIIllIl, final Object lllllllllllllIIIIIIIIIIlIlIIllII) {
        return lllllllllllllIIIIIIIIIIlIlIIllIl == lllllllllllllIIIIIIIIIIlIlIIllII;
    }
    
    protected int selectRandom(final int... lllllllllllllIIIIIIIIIIllIIlIIII) {
        return lllllllllllllIIIIIIIIIIllIIlIIII[this.nextInt(lllllllllllllIIIIIIIIIIllIIlIIII.length)];
    }
    
    public void initWorldGenSeed(final long lllllllllllllIIIIIIIIIIlllIIIIlI) {
        this.worldGenSeed = lllllllllllllIIIIIIIIIIlllIIIIlI;
        if (llllllIlIIIlIII(this.parent)) {
            this.parent.initWorldGenSeed(lllllllllllllIIIIIIIIIIlllIIIIlI);
        }
        this.worldGenSeed *= this.worldGenSeed * 6364136223846793005L + 1442695040888963407L;
        this.worldGenSeed += this.baseSeed;
        this.worldGenSeed *= this.worldGenSeed * 6364136223846793005L + 1442695040888963407L;
        this.worldGenSeed += this.baseSeed;
        this.worldGenSeed *= this.worldGenSeed * 6364136223846793005L + 1442695040888963407L;
        this.worldGenSeed += this.baseSeed;
    }
    
    protected static boolean biomesEqualOrMesaPlateau(final int lllllllllllllIIIIIIIIIIllIlIIllI, final int lllllllllllllIIIIIIIIIIllIIllllI) {
        if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIlIIllI, lllllllllllllIIIIIIIIIIllIIllllI)) {
            return GenLayer.lIllIlIIlllllI[5] != 0;
        }
        if (llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIlIIllI, BiomeGenBase.mesaPlateau_F.biomeID) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIlIIllI, BiomeGenBase.mesaPlateau.biomeID)) {
            final BiomeGenBase lllllllllllllIIIIIIIIIIllIlIIlII = BiomeGenBase.getBiome(lllllllllllllIIIIIIIIIIllIlIIllI);
            final BiomeGenBase lllllllllllllIIIIIIIIIIllIlIIIll = BiomeGenBase.getBiome(lllllllllllllIIIIIIIIIIllIIllllI);
            try {
                int equalTo;
                if (llllllIlIIIlIII(lllllllllllllIIIIIIIIIIllIlIIlII) && llllllIlIIIlIII(lllllllllllllIIIIIIIIIIllIlIIIll)) {
                    equalTo = (lllllllllllllIIIIIIIIIIllIlIIlII.isEqualTo(lllllllllllllIIIIIIIIIIllIlIIIll) ? 1 : 0);
                    "".length();
                    if (((0xFB ^ 0xB7) & ~(0xD8 ^ 0x94)) >= "  ".length()) {
                        return ((0xBC ^ 0x81) & ~(0xFE ^ 0xC3)) != 0x0;
                    }
                }
                else {
                    equalTo = GenLayer.lIllIlIIlllllI[0];
                }
                return equalTo != 0;
            }
            catch (Throwable lllllllllllllIIIIIIIIIIllIlIIIlI) {
                final CrashReport lllllllllllllIIIIIIIIIIllIlIIIIl = CrashReport.makeCrashReport(lllllllllllllIIIIIIIIIIllIlIIIlI, GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[0]]);
                final CrashReportCategory lllllllllllllIIIIIIIIIIllIlIIIII = lllllllllllllIIIIIIIIIIllIlIIIIl.makeCategory(GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[5]]);
                lllllllllllllIIIIIIIIIIllIlIIIII.addCrashSection(GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[3]], lllllllllllllIIIIIIIIIIllIlIIllI);
                lllllllllllllIIIIIIIIIIllIlIIIII.addCrashSection(GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[6]], lllllllllllllIIIIIIIIIIllIIllllI);
                lllllllllllllIIIIIIIIIIllIlIIIII.addCrashSectionCallable(GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[1]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return String.valueOf(lllllllllllllIIIIIIIIIIllIlIIlII);
                    }
                });
                lllllllllllllIIIIIIIIIIllIlIIIII.addCrashSectionCallable(GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[8]], new Callable<String>() {
                    @Override
                    public String call() throws Exception {
                        return String.valueOf(lllllllllllllIIIIIIIIIIllIlIIIll);
                    }
                });
                throw new ReportedException(lllllllllllllIIIIIIIIIIllIlIIIIl);
            }
        }
        if (llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIllllI, BiomeGenBase.mesaPlateau_F.biomeID) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIllllI, BiomeGenBase.mesaPlateau.biomeID)) {
            return GenLayer.lIllIlIIlllllI[0] != 0;
        }
        return GenLayer.lIllIlIIlllllI[5] != 0;
    }
    
    private static boolean llllllIlIIIIllI(final int lllllllllllllIIIIIIIIIIlIlIllIIl, final int lllllllllllllIIIIIIIIIIlIlIllIII) {
        return lllllllllllllIIIIIIIIIIlIlIllIIl == lllllllllllllIIIIIIIIIIlIlIllIII;
    }
    
    private static boolean llllllIlIIIIlIl(final int lllllllllllllIIIIIIIIIIlIlIIIIIl, final int lllllllllllllIIIIIIIIIIlIlIIIIII) {
        return lllllllllllllIIIIIIIIIIlIlIIIIIl != lllllllllllllIIIIIIIIIIlIlIIIIII;
    }
    
    private static void llllllIlIIIIIIl() {
        (lIllIlIIlllllI = new int[9])[0] = ("  ".length() & ("  ".length() ^ -" ".length()));
        GenLayer.lIllIlIIlllllI[1] = (0xAE ^ 0x9F ^ (0x8 ^ 0x3D));
        GenLayer.lIllIlIIlllllI[2] = (58 + 34 - 48 + 89 ^ 81 + 61 - 93 + 82);
        GenLayer.lIllIlIIlllllI[3] = "  ".length();
        GenLayer.lIllIlIIlllllI[4] = (-(0xFFFFFA9F & 0x3D73) & (0xFFFFBBFA & 0x7FFF));
        GenLayer.lIllIlIIlllllI[5] = " ".length();
        GenLayer.lIllIlIIlllllI[6] = "   ".length();
        GenLayer.lIllIlIIlllllI[7] = (0x56 ^ 0x4E);
        GenLayer.lIllIlIIlllllI[8] = (0x56 ^ 0x53);
    }
    
    private static boolean llllllIlIIIlIlI(final int lllllllllllllIIIIIIIIIIlIlIlIIIl, final int lllllllllllllIIIIIIIIIIlIlIlIIII) {
        return lllllllllllllIIIIIIIIIIlIlIlIIIl < lllllllllllllIIIIIIIIIIlIlIlIIII;
    }
    
    private static boolean llllllIlIIIIlll(final int lllllllllllllIIIIIIIIIIlIlIlIlIl, final int lllllllllllllIIIIIIIIIIlIlIlIlII) {
        return lllllllllllllIIIIIIIIIIlIlIlIlIl >= lllllllllllllIIIIIIIIIIlIlIlIlII;
    }
    
    private static boolean llllllIlIIIlIII(final Object lllllllllllllIIIIIIIIIIlIlIIlIlI) {
        return lllllllllllllIIIIIIIIIIlIlIIlIlI != null;
    }
    
    private static String llllllIIllllIII(String lllllllllllllIIIIIIIIIIlIllIIlII, final String lllllllllllllIIIIIIIIIIlIllIlIII) {
        lllllllllllllIIIIIIIIIIlIllIIlII = new String(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIIlIllIIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIIIIIlIllIIlll = new StringBuilder();
        final char[] lllllllllllllIIIIIIIIIIlIllIIllI = lllllllllllllIIIIIIIIIIlIllIlIII.toCharArray();
        int lllllllllllllIIIIIIIIIIlIllIIlIl = GenLayer.lIllIlIIlllllI[0];
        final boolean lllllllllllllIIIIIIIIIIlIlIlllll = (Object)lllllllllllllIIIIIIIIIIlIllIIlII.toCharArray();
        final Exception lllllllllllllIIIIIIIIIIlIlIllllI = (Exception)lllllllllllllIIIIIIIIIIlIlIlllll.length;
        byte lllllllllllllIIIIIIIIIIlIlIlllIl = (byte)GenLayer.lIllIlIIlllllI[0];
        while (llllllIlIIIlIlI(lllllllllllllIIIIIIIIIIlIlIlllIl, (int)lllllllllllllIIIIIIIIIIlIlIllllI)) {
            final char lllllllllllllIIIIIIIIIIlIllIlIlI = lllllllllllllIIIIIIIIIIlIlIlllll[lllllllllllllIIIIIIIIIIlIlIlllIl];
            lllllllllllllIIIIIIIIIIlIllIIlll.append((char)(lllllllllllllIIIIIIIIIIlIllIlIlI ^ lllllllllllllIIIIIIIIIIlIllIIllI[lllllllllllllIIIIIIIIIIlIllIIlIl % lllllllllllllIIIIIIIIIIlIllIIllI.length]));
            "".length();
            ++lllllllllllllIIIIIIIIIIlIllIIlIl;
            ++lllllllllllllIIIIIIIIIIlIlIlllIl;
            "".length();
            if (((0x23 ^ 0x73) & ~(0xDD ^ 0x8D)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIIIIIlIllIIlll);
    }
    
    public GenLayer(final long lllllllllllllIIIIIIIIIIlllIIlIII) {
        this.baseSeed = lllllllllllllIIIIIIIIIIlllIIlIII;
        this.baseSeed *= this.baseSeed * 6364136223846793005L + 1442695040888963407L;
        this.baseSeed += lllllllllllllIIIIIIIIIIlllIIlIII;
        this.baseSeed *= this.baseSeed * 6364136223846793005L + 1442695040888963407L;
        this.baseSeed += lllllllllllllIIIIIIIIIIlllIIlIII;
        this.baseSeed *= this.baseSeed * 6364136223846793005L + 1442695040888963407L;
        this.baseSeed += lllllllllllllIIIIIIIIIIlllIIlIII;
    }
    
    protected int nextInt(final int lllllllllllllIIIIIIIIIIllIlIllll) {
        int lllllllllllllIIIIIIIIIIllIllIIIl = (int)((this.chunkSeed >> GenLayer.lIllIlIIlllllI[7]) % lllllllllllllIIIIIIIIIIllIlIllll);
        if (llllllIlIIIlIIl(lllllllllllllIIIIIIIIIIllIllIIIl)) {
            lllllllllllllIIIIIIIIIIllIllIIIl += lllllllllllllIIIIIIIIIIllIlIllll;
        }
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += this.worldGenSeed;
        return lllllllllllllIIIIIIIIIIllIllIIIl;
    }
    
    private static boolean llllllIlIIIIlII(final int lllllllllllllIIIIIIIIIIlIlIIlIII) {
        return lllllllllllllIIIIIIIIIIlIlIIlIII == 0;
    }
    
    protected static boolean isBiomeOceanic(final int lllllllllllllIIIIIIIIIIllIIlIllI) {
        if (llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIlIllI, BiomeGenBase.ocean.biomeID) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIlIllI, BiomeGenBase.deepOcean.biomeID) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIlIllI, BiomeGenBase.frozenOcean.biomeID)) {
            return GenLayer.lIllIlIIlllllI[0] != 0;
        }
        return GenLayer.lIllIlIIlllllI[5] != 0;
    }
    
    static {
        llllllIlIIIIIIl();
        llllllIIllllIlI();
    }
    
    private static boolean llllllIlIIIIIll(final int lllllllllllllIIIIIIIIIIlIlIIIlII) {
        return lllllllllllllIIIIIIIIIIlIlIIIlII > 0;
    }
    
    public abstract int[] getInts(final int p0, final int p1, final int p2, final int p3);
    
    private static void llllllIIllllIlI() {
        (lIllIlIIlllIll = new String[GenLayer.lIllIlIIlllllI[2]])[GenLayer.lIllIlIIlllllI[0]] = llllllIIlllIllI("xVsTgYwnjCcA2mHeURhFAGj0OKsNq2tP", "cYbnA");
        GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[5]] = llllllIIllllIII("KQ0XIDQYRBooOAUDWC4+BhQZPzQP", "kdxMQ");
        GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[3]] = llllllIIlllIllI("hKgMFo1gTrHNjgf9IyK0oQ==", "JPDOp");
        GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[6]] = llllllIIlllIllI("qgZuQ/WNoI32b14w7mqAxQ==", "fKUHg");
        GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[1]] = llllllIIlllIllI("16zmZ40YlEM=", "qEUtC");
        GenLayer.lIllIlIIlllIll[GenLayer.lIllIlIIlllllI[8]] = llllllIIllllIII("IxoXCilBMQ==", "asxgL");
    }
    
    public void initChunkSeed(final long lllllllllllllIIIIIIIIIIllIlllIll, final long lllllllllllllIIIIIIIIIIllIlllIlI) {
        this.chunkSeed = this.worldGenSeed;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += lllllllllllllIIIIIIIIIIllIlllIll;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += lllllllllllllIIIIIIIIIIllIlllIlI;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += lllllllllllllIIIIIIIIIIllIlllIll;
        this.chunkSeed *= this.chunkSeed * 6364136223846793005L + 1442695040888963407L;
        this.chunkSeed += lllllllllllllIIIIIIIIIIllIlllIlI;
    }
    
    private static String llllllIIlllIllI(final String lllllllllllllIIIIIIIIIIlIllllIIl, final String lllllllllllllIIIIIIIIIIlIlllIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIIIIIlIlllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIIIIIlIlllIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIIIIIlIllllIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIIIIIlIllllIll.init(GenLayer.lIllIlIIlllllI[3], lllllllllllllIIIIIIIIIIlIlllllII);
            return new String(lllllllllllllIIIIIIIIIIlIllllIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIIIIIlIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIIIIIlIllllIlI) {
            lllllllllllllIIIIIIIIIIlIllllIlI.printStackTrace();
            return null;
        }
    }
    
    protected int selectModeOrRandom(final int lllllllllllllIIIIIIIIIIllIIIlIIl, final int lllllllllllllIIIIIIIIIIllIIIlIII, final int lllllllllllllIIIIIIIIIIllIIIIIlI, final int lllllllllllllIIIIIIIIIIllIIIIIIl) {
        int selectRandom;
        if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIII, lllllllllllllIIIIIIIIIIllIIIIIlI) && llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIIIlI, lllllllllllllIIIIIIIIIIllIIIIIIl)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIII;
            "".length();
            if ("   ".length() == 0) {
                return (109 + 7 - 76 + 101 ^ 125 + 126 - 174 + 57) & (0x2B ^ 0x71 ^ (0x26 ^ 0x77) ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIlIII) && llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIlI)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIIl;
            "".length();
            if (-(0x43 ^ 0x50 ^ (0x7A ^ 0x6C)) >= 0) {
                return (0x8 ^ 0x5E ^ (0x27 ^ 0x4E)) & (0x78 ^ 0x50 ^ (0xA2 ^ 0xB5) ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIlIII) && llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIIl)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIIl;
            "".length();
            if (null != null) {
                return (0x1 ^ 0x52 ^ (0xEB ^ 0x87)) & (0x25 ^ 0x57 ^ (0xF4 ^ 0xB9) ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIlI) && llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIIl)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIIl;
            "".length();
            if (((0x28 ^ 0x14 ^ (0xB ^ 0x69)) & (0xB0 ^ 0xAC ^ (0x29 ^ 0x6B) ^ -" ".length())) < 0) {
                return (146 + 150 - 148 + 35 ^ 104 + 59 - 97 + 78) & (119 + 36 - 78 + 71 ^ 153 + 110 - 137 + 53 ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIlIII) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIIIIlI, lllllllllllllIIIIIIIIIIllIIIIIIl)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIIl;
            "".length();
            if ("   ".length() <= ((0x13 ^ 0x2B) & ~(0x18 ^ 0x20))) {
                return (0xC ^ 0x4D) & ~(0xE8 ^ 0xA9);
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIlI) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIIlIII, lllllllllllllIIIIIIIIIIllIIIIIIl)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIIl;
            "".length();
            if ("  ".length() <= 0) {
                return (0x2F ^ 0x3C ^ (0x38 ^ 0x6E)) & (64 + 213 - 192 + 142 ^ 32 + 39 + 80 + 15 ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIIl) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIIlIII, lllllllllllllIIIIIIIIIIllIIIIIlI)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIIl;
            "".length();
            if (" ".length() > "  ".length()) {
                return (0xB5 ^ 0x93 ^ (0x76 ^ 0x42)) & (83 + 58 - 46 + 62 ^ 104 + 120 - 149 + 68 ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIII, lllllllllllllIIIIIIIIIIllIIIIIlI) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIIl)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIII;
            "".length();
            if (-" ".length() > 0) {
                return (0xA2 ^ 0x95) & ~(0x6A ^ 0x5D);
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIlIII, lllllllllllllIIIIIIIIIIllIIIIIIl) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIIIlI)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIlIII;
            "".length();
            if ((178 + 100 - 172 + 86 ^ 172 + 185 - 353 + 192) == ((178 + 39 - 162 + 187 ^ 140 + 131 - 85 + 5) & (20 + 128 - 27 + 96 ^ 130 + 63 - 93 + 48 ^ -" ".length()))) {
                return (46 + 43 - 18 + 59 ^ 28 + 42 - 46 + 170) & (102 + 166 - 198 + 130 ^ 39 + 22 - 43 + 118 ^ -" ".length());
            }
        }
        else if (llllllIlIIIIllI(lllllllllllllIIIIIIIIIIllIIIIIlI, lllllllllllllIIIIIIIIIIllIIIIIIl) && llllllIlIIIIlIl(lllllllllllllIIIIIIIIIIllIIIlIIl, lllllllllllllIIIIIIIIIIllIIIlIII)) {
            selectRandom = lllllllllllllIIIIIIIIIIllIIIIIlI;
            "".length();
            if (" ".length() <= -" ".length()) {
                return (0xE9 ^ 0xB6) & ~(0xFB ^ 0xA4);
            }
        }
        else {
            final int[] lllllllllllllIIIIIIIIIIllIIlIIII = new int[GenLayer.lIllIlIIlllllI[1]];
            lllllllllllllIIIIIIIIIIllIIlIIII[GenLayer.lIllIlIIlllllI[0]] = lllllllllllllIIIIIIIIIIllIIIlIIl;
            lllllllllllllIIIIIIIIIIllIIlIIII[GenLayer.lIllIlIIlllllI[5]] = lllllllllllllIIIIIIIIIIllIIIlIII;
            lllllllllllllIIIIIIIIIIllIIlIIII[GenLayer.lIllIlIIlllllI[3]] = lllllllllllllIIIIIIIIIIllIIIIIlI;
            lllllllllllllIIIIIIIIIIllIIlIIII[GenLayer.lIllIlIIlllllI[6]] = lllllllllllllIIIIIIIIIIllIIIIIIl;
            selectRandom = this.selectRandom(lllllllllllllIIIIIIIIIIllIIlIIII);
        }
        return selectRandom;
    }
}
