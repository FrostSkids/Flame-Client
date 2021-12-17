// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.layer;

import net.minecraft.world.WorldType;
import net.minecraft.world.gen.ChunkProviderSettings;
import net.minecraft.world.biome.BiomeGenBase;

public class GenLayerBiome extends GenLayer
{
    private /* synthetic */ BiomeGenBase[] field_151621_d;
    private static final /* synthetic */ int[] lIllIIIllllIII;
    private /* synthetic */ BiomeGenBase[] field_151620_f;
    private /* synthetic */ BiomeGenBase[] field_151622_e;
    private final /* synthetic */ ChunkProviderSettings field_175973_g;
    private /* synthetic */ BiomeGenBase[] field_151623_c;
    
    private static boolean lllllIIlIIlIIII(final int lllllllllllllIIIIIlIIllllllIIIIl, final int lllllllllllllIIIIIlIIlllllIlllll) {
        return lllllllllllllIIIIIlIIllllllIIIIl == lllllllllllllIIIIIlIIlllllIlllll;
    }
    
    private static boolean lllllIIlIIlIIlI(final int lllllllllllllIIIIIlIIlllllIIIlIl) {
        return lllllllllllllIIIIIlIIlllllIIIlIl == 0;
    }
    
    private static boolean lllllIIlIIlIlII(final int lllllllllllllIIIIIlIIlllllIlIlll, final int lllllllllllllIIIIIlIIlllllIlIlIl) {
        return lllllllllllllIIIIIlIIlllllIlIlll >= lllllllllllllIIIIIlIIlllllIlIlIl;
    }
    
    private static boolean lllllIIlIIIllII(final Object lllllllllllllIIIIIlIIlllllIIlllI, final Object lllllllllllllIIIIIlIIlllllIIllII) {
        return lllllllllllllIIIIIlIIlllllIIlllI == lllllllllllllIIIIIlIIlllllIIllII;
    }
    
    private static void lllllIIlIIIlIll() {
        (lIllIIIllllIII = new int[10])[0] = (0x32 ^ 0x34);
        GenLayerBiome.lIllIIIllllIII[1] = ((0x2A ^ 0xB ^ (0x3C ^ 0x2B)) & (0xE2 ^ 0xBF ^ (0x19 ^ 0x72) ^ -" ".length()));
        GenLayerBiome.lIllIIIllllIII[2] = " ".length();
        GenLayerBiome.lIllIIIllllIII[3] = "  ".length();
        GenLayerBiome.lIllIIIllllIII[4] = "   ".length();
        GenLayerBiome.lIllIIIllllIII[5] = (0x4D ^ 0x49);
        GenLayerBiome.lIllIIIllllIII[6] = (0x33 ^ 0x36);
        GenLayerBiome.lIllIIIllllIII[7] = (0xFFFFEFE1 & 0x1F1E);
        GenLayerBiome.lIllIIIllllIII[8] = (0xAD ^ 0xA5);
        GenLayerBiome.lIllIIIllllIII[9] = -(0xFFFFCFFB & 0x3F05);
    }
    
    private static boolean lllllIIlIIIlllI(final int lllllllllllllIIIIIlIIlllllIIIIII) {
        return lllllllllllllIIIIIlIIlllllIIIIII >= 0;
    }
    
    private static boolean lllllIIlIIIllll(final int lllllllllllllIIIIIlIIlllllIIlIII) {
        return lllllllllllllIIIIIlIIlllllIIlIII != 0;
    }
    
    public GenLayerBiome(final long lllllllllllllIIIIIlIlIIIIIlIIIIl, final GenLayer lllllllllllllIIIIIlIlIIIIIlIIlIl, final WorldType lllllllllllllIIIIIlIlIIIIIIlllll, final String lllllllllllllIIIIIlIlIIIIIIllllI) {
        super(lllllllllllllIIIIIlIlIIIIIlIIIIl);
        final BiomeGenBase[] field_151623_c = new BiomeGenBase[GenLayerBiome.lIllIIIllllIII[0]];
        field_151623_c[GenLayerBiome.lIllIIIllllIII[1]] = BiomeGenBase.desert;
        field_151623_c[GenLayerBiome.lIllIIIllllIII[2]] = BiomeGenBase.desert;
        field_151623_c[GenLayerBiome.lIllIIIllllIII[3]] = BiomeGenBase.desert;
        field_151623_c[GenLayerBiome.lIllIIIllllIII[4]] = BiomeGenBase.savanna;
        field_151623_c[GenLayerBiome.lIllIIIllllIII[5]] = BiomeGenBase.savanna;
        field_151623_c[GenLayerBiome.lIllIIIllllIII[6]] = BiomeGenBase.plains;
        this.field_151623_c = field_151623_c;
        final BiomeGenBase[] field_151621_d = new BiomeGenBase[GenLayerBiome.lIllIIIllllIII[0]];
        field_151621_d[GenLayerBiome.lIllIIIllllIII[1]] = BiomeGenBase.forest;
        field_151621_d[GenLayerBiome.lIllIIIllllIII[2]] = BiomeGenBase.roofedForest;
        field_151621_d[GenLayerBiome.lIllIIIllllIII[3]] = BiomeGenBase.extremeHills;
        field_151621_d[GenLayerBiome.lIllIIIllllIII[4]] = BiomeGenBase.plains;
        field_151621_d[GenLayerBiome.lIllIIIllllIII[5]] = BiomeGenBase.birchForest;
        field_151621_d[GenLayerBiome.lIllIIIllllIII[6]] = BiomeGenBase.swampland;
        this.field_151621_d = field_151621_d;
        final BiomeGenBase[] field_151622_e = new BiomeGenBase[GenLayerBiome.lIllIIIllllIII[5]];
        field_151622_e[GenLayerBiome.lIllIIIllllIII[1]] = BiomeGenBase.forest;
        field_151622_e[GenLayerBiome.lIllIIIllllIII[2]] = BiomeGenBase.extremeHills;
        field_151622_e[GenLayerBiome.lIllIIIllllIII[3]] = BiomeGenBase.taiga;
        field_151622_e[GenLayerBiome.lIllIIIllllIII[4]] = BiomeGenBase.plains;
        this.field_151622_e = field_151622_e;
        final BiomeGenBase[] field_151620_f = new BiomeGenBase[GenLayerBiome.lIllIIIllllIII[5]];
        field_151620_f[GenLayerBiome.lIllIIIllllIII[1]] = BiomeGenBase.icePlains;
        field_151620_f[GenLayerBiome.lIllIIIllllIII[2]] = BiomeGenBase.icePlains;
        field_151620_f[GenLayerBiome.lIllIIIllllIII[3]] = BiomeGenBase.icePlains;
        field_151620_f[GenLayerBiome.lIllIIIllllIII[4]] = BiomeGenBase.coldTaiga;
        this.field_151620_f = field_151620_f;
        this.parent = lllllllllllllIIIIIlIlIIIIIlIIlIl;
        if (lllllIIlIIIllII(lllllllllllllIIIIIlIlIIIIIIlllll, WorldType.DEFAULT_1_1)) {
            final BiomeGenBase[] field_151623_c2 = new BiomeGenBase[GenLayerBiome.lIllIIIllllIII[0]];
            field_151623_c2[GenLayerBiome.lIllIIIllllIII[1]] = BiomeGenBase.desert;
            field_151623_c2[GenLayerBiome.lIllIIIllllIII[2]] = BiomeGenBase.forest;
            field_151623_c2[GenLayerBiome.lIllIIIllllIII[3]] = BiomeGenBase.extremeHills;
            field_151623_c2[GenLayerBiome.lIllIIIllllIII[4]] = BiomeGenBase.swampland;
            field_151623_c2[GenLayerBiome.lIllIIIllllIII[5]] = BiomeGenBase.plains;
            field_151623_c2[GenLayerBiome.lIllIIIllllIII[6]] = BiomeGenBase.taiga;
            this.field_151623_c = field_151623_c2;
            this.field_175973_g = null;
            "".length();
            if (null != null) {
                throw null;
            }
        }
        else if (lllllIIlIIIllII(lllllllllllllIIIIIlIlIIIIIIlllll, WorldType.CUSTOMIZED)) {
            this.field_175973_g = ChunkProviderSettings.Factory.jsonToFactory(lllllllllllllIIIIIlIlIIIIIIllllI).func_177864_b();
            "".length();
            if ("   ".length() == 0) {
                throw null;
            }
        }
        else {
            this.field_175973_g = null;
        }
    }
    
    @Override
    public int[] getInts(final int lllllllllllllIIIIIlIlIIIIIIIIIII, final int lllllllllllllIIIIIlIIlllllllllll, final int lllllllllllllIIIIIlIIllllllllllI, final int lllllllllllllIIIIIlIIlllllllllIl) {
        final int[] lllllllllllllIIIIIlIIlllllllllII = this.parent.getInts(lllllllllllllIIIIIlIlIIIIIIIIIII, lllllllllllllIIIIIlIIlllllllllll, lllllllllllllIIIIIlIIllllllllllI, lllllllllllllIIIIIlIIlllllllllIl);
        final int[] lllllllllllllIIIIIlIIllllllllIll = IntCache.getIntCache(lllllllllllllIIIIIlIIllllllllllI * lllllllllllllIIIIIlIIlllllllllIl);
        int lllllllllllllIIIIIlIIllllllllIlI = GenLayerBiome.lIllIIIllllIII[1];
        "".length();
        if ((0xB5 ^ 0xB0) == 0x0) {
            return null;
        }
        while (!lllllIIlIIlIlII(lllllllllllllIIIIIlIIllllllllIlI, lllllllllllllIIIIIlIIlllllllllIl)) {
            int lllllllllllllIIIIIlIIllllllllIIl = GenLayerBiome.lIllIIIllllIII[1];
            "".length();
            if (((0x7F ^ 0x40) & ~(0x7A ^ 0x45)) != 0x0) {
                return null;
            }
            while (!lllllIIlIIlIlII(lllllllllllllIIIIIlIIllllllllIIl, lllllllllllllIIIIIlIIllllllllllI)) {
                this.initChunkSeed(lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIlIIIIIIIIIII, lllllllllllllIIIIIlIIllllllllIlI + lllllllllllllIIIIIlIIlllllllllll);
                int lllllllllllllIIIIIlIIllllllllIII = lllllllllllllIIIIIlIIlllllllllII[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI];
                final int lllllllllllllIIIIIlIIlllllllIlll = (lllllllllllllIIIIIlIIllllllllIII & GenLayerBiome.lIllIIIllllIII[7]) >> GenLayerBiome.lIllIIIllllIII[8];
                lllllllllllllIIIIIlIIllllllllIII &= GenLayerBiome.lIllIIIllllIII[9];
                if (lllllIIlIIIllIl(this.field_175973_g) && lllllIIlIIIlllI(this.field_175973_g.fixedBiome)) {
                    lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = this.field_175973_g.fixedBiome;
                    "".length();
                    if (-"  ".length() >= 0) {
                        return null;
                    }
                }
                else if (lllllIIlIIIllll(GenLayer.isBiomeOceanic(lllllllllllllIIIIIlIIllllllllIII) ? 1 : 0)) {
                    lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = lllllllllllllIIIIIlIIllllllllIII;
                    "".length();
                    if ((0xBA ^ 0xBE) < (0xA1 ^ 0xA5)) {
                        return null;
                    }
                }
                else if (lllllIIlIIlIIII(lllllllllllllIIIIIlIIllllllllIII, BiomeGenBase.mushroomIsland.biomeID)) {
                    lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = lllllllllllllIIIIIlIIllllllllIII;
                    "".length();
                    if (-" ".length() == " ".length()) {
                        return null;
                    }
                }
                else if (lllllIIlIIlIIII(lllllllllllllIIIIIlIIllllllllIII, GenLayerBiome.lIllIIIllllIII[2])) {
                    if (lllllIIlIIlIIIl(lllllllllllllIIIIIlIIlllllllIlll)) {
                        if (lllllIIlIIlIIlI(this.nextInt(GenLayerBiome.lIllIIIllllIII[4]))) {
                            lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = BiomeGenBase.mesaPlateau.biomeID;
                            "".length();
                            if (((0xC3 ^ 0x80) & ~(0xE1 ^ 0xA2)) != 0x0) {
                                return null;
                            }
                        }
                        else {
                            lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = BiomeGenBase.mesaPlateau_F.biomeID;
                            "".length();
                            if (((0x99 ^ 0xB7 ^ (0xC ^ 0x7D)) & (0x5E ^ 0x2F ^ (0x2E ^ 0x0) ^ -" ".length())) != ((97 + 88 - 127 + 112 ^ 17 + 98 - 60 + 78) & (0xFD ^ 0xA6 ^ (0x34 ^ 0x40) ^ -" ".length()))) {
                                return null;
                            }
                        }
                    }
                    else {
                        lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = this.field_151623_c[this.nextInt(this.field_151623_c.length)].biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                }
                else if (lllllIIlIIlIIII(lllllllllllllIIIIIlIIllllllllIII, GenLayerBiome.lIllIIIllllIII[3])) {
                    if (lllllIIlIIlIIIl(lllllllllllllIIIIIlIIlllllllIlll)) {
                        lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = BiomeGenBase.jungle.biomeID;
                        "".length();
                        if ("  ".length() >= (155 + 90 - 149 + 69 ^ 15 + 92 - 27 + 81)) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = this.field_151621_d[this.nextInt(this.field_151621_d.length)].biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                }
                else if (lllllIIlIIlIIII(lllllllllllllIIIIIlIIllllllllIII, GenLayerBiome.lIllIIIllllIII[4])) {
                    if (lllllIIlIIlIIIl(lllllllllllllIIIIIlIIlllllllIlll)) {
                        lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = BiomeGenBase.megaTaiga.biomeID;
                        "".length();
                        if (null != null) {
                            return null;
                        }
                    }
                    else {
                        lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = this.field_151622_e[this.nextInt(this.field_151622_e.length)].biomeID;
                        "".length();
                        if (((0x89 ^ 0x9F) & ~(0x63 ^ 0x75)) != 0x0) {
                            return null;
                        }
                    }
                }
                else if (lllllIIlIIlIIII(lllllllllllllIIIIIlIIllllllllIII, GenLayerBiome.lIllIIIllllIII[5])) {
                    lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = this.field_151620_f[this.nextInt(this.field_151620_f.length)].biomeID;
                    "".length();
                    if ("  ".length() == (33 + 79 - 52 + 113 ^ 142 + 41 - 181 + 167)) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIIIlIIllllllllIll[lllllllllllllIIIIIlIIllllllllIIl + lllllllllllllIIIIIlIIllllllllIlI * lllllllllllllIIIIIlIIllllllllllI] = BiomeGenBase.mushroomIsland.biomeID;
                }
                ++lllllllllllllIIIIIlIIllllllllIIl;
            }
            ++lllllllllllllIIIIIlIIllllllllIlI;
        }
        return lllllllllllllIIIIIlIIllllllllIll;
    }
    
    static {
        lllllIIlIIIlIll();
    }
    
    private static boolean lllllIIlIIlIIIl(final int lllllllllllllIIIIIlIIllllIllllII) {
        return lllllllllllllIIIIIlIIllllIllllII > 0;
    }
    
    private static boolean lllllIIlIIIllIl(final Object lllllllllllllIIIIIlIIlllllIIlIlI) {
        return lllllllllllllIIIIIlIIlllllIIlIlI != null;
    }
}
