// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.structure;

import java.util.Iterator;
import net.minecraft.world.World;
import java.util.Random;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import java.util.Map;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.monster.EntityWitch;
import com.google.common.collect.Lists;
import net.minecraft.util.BlockPos;
import net.minecraft.world.biome.BiomeGenBase;
import java.util.List;

public class MapGenScatteredFeature extends MapGenStructure
{
    private /* synthetic */ int maxDistanceBetweenScatteredFeatures;
    private /* synthetic */ List<BiomeGenBase.SpawnListEntry> scatteredFeatureSpawnList;
    private static final /* synthetic */ int[] lIIIIIIlIIlIIl;
    private static final /* synthetic */ List<BiomeGenBase> biomelist;
    private static final /* synthetic */ String[] lIIIIIIlIIlIII;
    private /* synthetic */ int minDistanceBetweenScatteredFeatures;
    
    private static boolean lIllIIllllllIlI(final int lllllllllllllIlIlIIIIllllIIIIlll, final int lllllllllllllIlIlIIIIllllIIIIllI) {
        return lllllllllllllIlIlIIIIllllIIIIlll == lllllllllllllIlIlIIIIllllIIIIllI;
    }
    
    public boolean func_175798_a(final BlockPos lllllllllllllIlIlIIIIllllIlIIIII) {
        final StructureStart lllllllllllllIlIlIIIIllllIIlllll = this.func_175797_c(lllllllllllllIlIlIIIIllllIlIIIII);
        if (lIllIIlllllllIl(lllllllllllllIlIlIIIIllllIIlllll) && lIllIIlllllIlll((lllllllllllllIlIlIIIIllllIIlllll instanceof Start) ? 1 : 0) && lIllIIllllllIII(lllllllllllllIlIlIIIIllllIIlllll.components.isEmpty() ? 1 : 0)) {
            final StructureComponent lllllllllllllIlIlIIIIllllIIllllI = lllllllllllllIlIlIIIIllllIIlllll.components.getFirst();
            return lllllllllllllIlIlIIIIllllIIllllI instanceof ComponentScatteredFeaturePieces.SwampHut;
        }
        return MapGenScatteredFeature.lIIIIIIlIIlIIl[1] != 0;
    }
    
    @Override
    public String getStructureName() {
        return MapGenScatteredFeature.lIIIIIIlIIlIII[MapGenScatteredFeature.lIIIIIIlIIlIIl[2]];
    }
    
    public MapGenScatteredFeature() {
        this.scatteredFeatureSpawnList = (List<BiomeGenBase.SpawnListEntry>)Lists.newArrayList();
        this.maxDistanceBetweenScatteredFeatures = MapGenScatteredFeature.lIIIIIIlIIlIIl[6];
        this.minDistanceBetweenScatteredFeatures = MapGenScatteredFeature.lIIIIIIlIIlIIl[7];
        this.scatteredFeatureSpawnList.add(new BiomeGenBase.SpawnListEntry(EntityWitch.class, MapGenScatteredFeature.lIIIIIIlIIlIIl[2], MapGenScatteredFeature.lIIIIIIlIIlIIl[2], MapGenScatteredFeature.lIIIIIIlIIlIIl[2]));
        "".length();
    }
    
    private static void lIllIIlllllIlIl() {
        (lIIIIIIlIIlIII = new String[MapGenScatteredFeature.lIIIIIIlIIlIIl[3]])[MapGenScatteredFeature.lIIIIIIlIIlIIl[1]] = lIllIIlllllIlII("CsnmQgg/6hwN3tC+fcrT7A==", "DRqgM");
        MapGenScatteredFeature.lIIIIIIlIIlIII[MapGenScatteredFeature.lIIIIIIlIIlIIl[2]] = lIllIIlllllIlII("ATEUgw5CRck=", "gGfNq");
    }
    
    private static boolean lIllIIlllllllIl(final Object lllllllllllllIlIlIIIIllllIIIIIII) {
        return lllllllllllllIlIlIIIIllllIIIIIII != null;
    }
    
    public MapGenScatteredFeature(final Map<String, String> lllllllllllllIlIlIIIIlllllIlIlIl) {
        this();
        final int lllllllllllllIlIlIIIIlllllIlIIII = (int)lllllllllllllIlIlIIIIlllllIlIlIl.entrySet().iterator();
        "".length();
        if ((0x34 ^ 0x31) == 0x0) {
            throw null;
        }
        while (!lIllIIllllllIII(((Iterator)lllllllllllllIlIlIIIIlllllIlIIII).hasNext() ? 1 : 0)) {
            final Map.Entry<String, String> lllllllllllllIlIlIIIIlllllIlIlII = ((Iterator<Map.Entry<String, String>>)lllllllllllllIlIlIIIIlllllIlIIII).next();
            if (lIllIIlllllIlll(lllllllllllllIlIlIIIIlllllIlIlII.getKey().equals(MapGenScatteredFeature.lIIIIIIlIIlIII[MapGenScatteredFeature.lIIIIIIlIIlIIl[1]]) ? 1 : 0)) {
                this.maxDistanceBetweenScatteredFeatures = MathHelper.parseIntWithDefaultAndMax(lllllllllllllIlIlIIIIlllllIlIlII.getValue(), this.maxDistanceBetweenScatteredFeatures, this.minDistanceBetweenScatteredFeatures + MapGenScatteredFeature.lIIIIIIlIIlIIl[2]);
            }
        }
    }
    
    private static boolean lIllIIlllllllII(final Object lllllllllllllIlIlIIIIllllIIIIIll, final Object lllllllllllllIlIlIIIIllllIIIIIlI) {
        return lllllllllllllIlIlIIIIllllIIIIIll == lllllllllllllIlIlIIIIllllIIIIIlI;
    }
    
    private static boolean lIllIIllllllIll(final Object lllllllllllllIlIlIIIIlllIllllllI) {
        return lllllllllllllIlIlIIIIlllIllllllI == null;
    }
    
    private static void lIllIIlllllIllI() {
        (lIIIIIIlIIlIIl = new int[10])[0] = (0x70 ^ 0xE ^ (0x1 ^ 0x7A));
        MapGenScatteredFeature.lIIIIIIlIIlIIl[1] = ((0x70 ^ 0x1A ^ (0x7B ^ 0x2D)) & (156 + 158 - 273 + 133 ^ 5 + 34 - 12 + 119 ^ -" ".length()));
        MapGenScatteredFeature.lIIIIIIlIIlIIl[2] = " ".length();
        MapGenScatteredFeature.lIIIIIIlIIlIIl[3] = "  ".length();
        MapGenScatteredFeature.lIIIIIIlIIlIIl[4] = "   ".length();
        MapGenScatteredFeature.lIIIIIIlIIlIIl[5] = (0x1 ^ 0xA ^ (0x2A ^ 0x25));
        MapGenScatteredFeature.lIIIIIIlIIlIIl[6] = (0x75 ^ 0x3C ^ (0x3E ^ 0x57));
        MapGenScatteredFeature.lIIIIIIlIIlIIl[7] = (0x91 ^ 0x99);
        MapGenScatteredFeature.lIIIIIIlIIlIIl[8] = (0xFFFFB5F7 & 0xDB5E79);
        MapGenScatteredFeature.lIIIIIIlIIlIIl[9] = (0x38 ^ 0x6D ^ (0x39 ^ 0x7C));
    }
    
    @Override
    protected StructureStart getStructureStart(final int lllllllllllllIlIlIIIIllllIlIIlll, final int lllllllllllllIlIlIIIIllllIlIIllI) {
        return new Start(this.worldObj, this.rand, lllllllllllllIlIlIIIIllllIlIIlll, lllllllllllllIlIlIIIIllllIlIIllI);
    }
    
    public List<BiomeGenBase.SpawnListEntry> getScatteredFeatureSpawnList() {
        return this.scatteredFeatureSpawnList;
    }
    
    private static String lIllIIlllllIlII(final String lllllllllllllIlIlIIIIllllIIIllIl, final String lllllllllllllIlIlIIIIllllIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIIIllllIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIIIllllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIIIllllIIlIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIIIllllIIlIIIl.init(MapGenScatteredFeature.lIIIIIIlIIlIIl[3], lllllllllllllIlIlIIIIllllIIlIIlI);
            return new String(lllllllllllllIlIlIIIIllllIIlIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIIIllllIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIIIllllIIlIIII) {
            lllllllllllllIlIlIIIIllllIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIllIIllllllIII(final int lllllllllllllIlIlIIIIlllIllllIlI) {
        return lllllllllllllIlIlIIIIlllIllllIlI == 0;
    }
    
    private static boolean lIllIIlllllIlll(final int lllllllllllllIlIlIIIIlllIlllllII) {
        return lllllllllllllIlIlIIIIlllIlllllII != 0;
    }
    
    private static boolean lIllIIllllllIIl(final int lllllllllllllIlIlIIIIlllIllllIII) {
        return lllllllllllllIlIlIIIIlllIllllIII < 0;
    }
    
    static {
        lIllIIlllllIllI();
        lIllIIlllllIlIl();
        final BiomeGenBase[] a = new BiomeGenBase[MapGenScatteredFeature.lIIIIIIlIIlIIl[0]];
        a[MapGenScatteredFeature.lIIIIIIlIIlIIl[1]] = BiomeGenBase.desert;
        a[MapGenScatteredFeature.lIIIIIIlIIlIIl[2]] = BiomeGenBase.desertHills;
        a[MapGenScatteredFeature.lIIIIIIlIIlIIl[3]] = BiomeGenBase.jungle;
        a[MapGenScatteredFeature.lIIIIIIlIIlIIl[4]] = BiomeGenBase.jungleHills;
        a[MapGenScatteredFeature.lIIIIIIlIIlIIl[5]] = BiomeGenBase.swampland;
        biomelist = Arrays.asList(a);
    }
    
    @Override
    protected boolean canSpawnStructureAtCoords(int lllllllllllllIlIlIIIIllllIlllIII, int lllllllllllllIlIlIIIIllllIllIlll) {
        final int lllllllllllllIlIlIIIIlllllIIIIII = lllllllllllllIlIlIIIIllllIlllIII;
        final int lllllllllllllIlIlIIIIllllIllllll = lllllllllllllIlIlIIIIllllIllIlll;
        if (lIllIIllllllIIl(lllllllllllllIlIlIIIIllllIlllIII)) {
            lllllllllllllIlIlIIIIllllIlllIII -= this.maxDistanceBetweenScatteredFeatures - MapGenScatteredFeature.lIIIIIIlIIlIIl[2];
        }
        if (lIllIIllllllIIl(lllllllllllllIlIlIIIIllllIllIlll)) {
            lllllllllllllIlIlIIIIllllIllIlll -= this.maxDistanceBetweenScatteredFeatures - MapGenScatteredFeature.lIIIIIIlIIlIIl[2];
        }
        int lllllllllllllIlIlIIIIllllIlllllI = lllllllllllllIlIlIIIIllllIlllIII / this.maxDistanceBetweenScatteredFeatures;
        int lllllllllllllIlIlIIIIllllIllllIl = lllllllllllllIlIlIIIIllllIllIlll / this.maxDistanceBetweenScatteredFeatures;
        final Random lllllllllllllIlIlIIIIllllIllllII = this.worldObj.setRandomSeed(lllllllllllllIlIlIIIIllllIlllllI, lllllllllllllIlIlIIIIllllIllllIl, MapGenScatteredFeature.lIIIIIIlIIlIIl[8]);
        lllllllllllllIlIlIIIIllllIlllllI *= this.maxDistanceBetweenScatteredFeatures;
        lllllllllllllIlIlIIIIllllIllllIl *= this.maxDistanceBetweenScatteredFeatures;
        lllllllllllllIlIlIIIIllllIlllllI += lllllllllllllIlIlIIIIllllIllllII.nextInt(this.maxDistanceBetweenScatteredFeatures - this.minDistanceBetweenScatteredFeatures);
        lllllllllllllIlIlIIIIllllIllllIl += lllllllllllllIlIlIIIIllllIllllII.nextInt(this.maxDistanceBetweenScatteredFeatures - this.minDistanceBetweenScatteredFeatures);
        if (lIllIIllllllIlI(lllllllllllllIlIlIIIIlllllIIIIII, lllllllllllllIlIlIIIIllllIlllllI) && lIllIIllllllIlI(lllllllllllllIlIlIIIIllllIllllll, lllllllllllllIlIlIIIIllllIllllIl)) {
            final BiomeGenBase lllllllllllllIlIlIIIIllllIlllIll = this.worldObj.getWorldChunkManager().getBiomeGenerator(new BlockPos(lllllllllllllIlIlIIIIlllllIIIIII * MapGenScatteredFeature.lIIIIIIlIIlIIl[9] + MapGenScatteredFeature.lIIIIIIlIIlIIl[7], MapGenScatteredFeature.lIIIIIIlIIlIIl[1], lllllllllllllIlIlIIIIllllIllllll * MapGenScatteredFeature.lIIIIIIlIIlIIl[9] + MapGenScatteredFeature.lIIIIIIlIIlIIl[7]));
            if (lIllIIllllllIll(lllllllllllllIlIlIIIIllllIlllIll)) {
                return MapGenScatteredFeature.lIIIIIIlIIlIIl[1] != 0;
            }
            final double lllllllllllllIlIlIIIIllllIlIllll = (double)MapGenScatteredFeature.biomelist.iterator();
            "".length();
            if (-"   ".length() > 0) {
                return ((0x51 ^ 0x48) & ~(0x65 ^ 0x7C)) != 0x0;
            }
            while (!lIllIIllllllIII(((Iterator)lllllllllllllIlIlIIIIllllIlIllll).hasNext() ? 1 : 0)) {
                final BiomeGenBase lllllllllllllIlIlIIIIllllIlllIlI = ((Iterator<BiomeGenBase>)lllllllllllllIlIlIIIIllllIlIllll).next();
                if (lIllIIlllllllII(lllllllllllllIlIlIIIIllllIlllIll, lllllllllllllIlIlIIIIllllIlllIlI)) {
                    return MapGenScatteredFeature.lIIIIIIlIIlIIl[2] != 0;
                }
            }
        }
        return MapGenScatteredFeature.lIIIIIIlIIlIIl[1] != 0;
    }
    
    public static class Start extends StructureStart
    {
        private static final /* synthetic */ int[] lIIIlIlIIlIllI;
        
        private static boolean llIIIIIIlIlIlll(final Object lllllllllllllIlIIIIllllIlIllIlIl, final Object lllllllllllllIlIIIIllllIlIllIlII) {
            return lllllllllllllIlIIIIllllIlIllIlIl != lllllllllllllIlIIIIllllIlIllIlII;
        }
        
        static {
            llIIIIIIlIlIllI();
        }
        
        public Start(final World lllllllllllllIlIIIIllllIllIIIllI, final Random lllllllllllllIlIIIIllllIlIllllII, final int lllllllllllllIlIIIIllllIllIIIlII, final int lllllllllllllIlIIIIllllIlIlllIlI) {
            super(lllllllllllllIlIIIIllllIllIIIlII, lllllllllllllIlIIIIllllIlIlllIlI);
            final BiomeGenBase lllllllllllllIlIIIIllllIllIIIIlI = lllllllllllllIlIIIIllllIllIIIllI.getBiomeGenForCoords(new BlockPos(lllllllllllllIlIIIIllllIllIIIlII * Start.lIIIlIlIIlIllI[0] + Start.lIIIlIlIIlIllI[1], Start.lIIIlIlIIlIllI[2], lllllllllllllIlIIIIllllIlIlllIlI * Start.lIIIlIlIIlIllI[0] + Start.lIIIlIlIIlIllI[1]));
            if (llIIIIIIlIlIlll(lllllllllllllIlIIIIllllIllIIIIlI, BiomeGenBase.jungle) && llIIIIIIlIlIlll(lllllllllllllIlIIIIllllIllIIIIlI, BiomeGenBase.jungleHills)) {
                if (llIIIIIIlIllIII(lllllllllllllIlIIIIllllIllIIIIlI, BiomeGenBase.swampland)) {
                    final ComponentScatteredFeaturePieces.SwampHut lllllllllllllIlIIIIllllIllIIIIIl = new ComponentScatteredFeaturePieces.SwampHut(lllllllllllllIlIIIIllllIlIllllII, lllllllllllllIlIIIIllllIllIIIlII * Start.lIIIlIlIIlIllI[0], lllllllllllllIlIIIIllllIlIlllIlI * Start.lIIIlIlIIlIllI[0]);
                    this.components.add(lllllllllllllIlIIIIllllIllIIIIIl);
                    "".length();
                    "".length();
                    if (((0x66 ^ 0x57) & ~(0x40 ^ 0x71)) != 0x0) {
                        throw null;
                    }
                }
                else if (!llIIIIIIlIlIlll(lllllllllllllIlIIIIllllIllIIIIlI, BiomeGenBase.desert) || llIIIIIIlIllIII(lllllllllllllIlIIIIllllIllIIIIlI, BiomeGenBase.desertHills)) {
                    final ComponentScatteredFeaturePieces.DesertPyramid lllllllllllllIlIIIIllllIllIIIIII = new ComponentScatteredFeaturePieces.DesertPyramid(lllllllllllllIlIIIIllllIlIllllII, lllllllllllllIlIIIIllllIllIIIlII * Start.lIIIlIlIIlIllI[0], lllllllllllllIlIIIIllllIlIlllIlI * Start.lIIIlIlIIlIllI[0]);
                    this.components.add(lllllllllllllIlIIIIllllIllIIIIII);
                    "".length();
                    "".length();
                    if ((0xF ^ 0xB) < 0) {
                        throw null;
                    }
                }
            }
            else {
                final ComponentScatteredFeaturePieces.JunglePyramid lllllllllllllIlIIIIllllIlIllllll = new ComponentScatteredFeaturePieces.JunglePyramid(lllllllllllllIlIIIIllllIlIllllII, lllllllllllllIlIIIIllllIllIIIlII * Start.lIIIlIlIIlIllI[0], lllllllllllllIlIIIIllllIlIlllIlI * Start.lIIIlIlIIlIllI[0]);
                this.components.add(lllllllllllllIlIIIIllllIlIllllll);
                "".length();
            }
            this.updateBoundingBox();
        }
        
        private static void llIIIIIIlIlIllI() {
            (lIIIlIlIIlIllI = new int[3])[0] = (0x1A ^ 0x1E ^ (0xE ^ 0x1A));
            Start.lIIIlIlIIlIllI[1] = (0x96 ^ 0xC4 ^ (0x2E ^ 0x74));
            Start.lIIIlIlIIlIllI[2] = ((0x8B ^ 0xC1) & ~(0xD5 ^ 0x9F));
        }
        
        public Start() {
        }
        
        private static boolean llIIIIIIlIllIII(final Object lllllllllllllIlIIIIllllIlIllIIIl, final Object lllllllllllllIlIIIIllllIlIllIIII) {
            return lllllllllllllIlIIIIllllIlIllIIIl == lllllllllllllIlIIIIllllIlIllIIII;
        }
    }
}
