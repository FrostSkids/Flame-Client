// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.biome;

import java.util.Iterator;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public class BiomeColorHelper
{
    private static final /* synthetic */ ColorResolver field_180291_a;
    private static final /* synthetic */ ColorResolver field_180289_b;
    private static final /* synthetic */ ColorResolver field_180290_c;
    private static final /* synthetic */ int[] lIllIllIIIIllI;
    
    private static void lllllllIllIIIll() {
        (lIllIllIIIIllI = new int[9])[0] = ((0x2 ^ 0x51 ^ (0xCB ^ 0xAD)) & (3 + 149 - 12 + 45 ^ 46 + 126 - 61 + 29 ^ -" ".length()));
        BiomeColorHelper.lIllIllIIIIllI[1] = -" ".length();
        BiomeColorHelper.lIllIllIIIIllI[2] = " ".length();
        BiomeColorHelper.lIllIllIIIIllI[3] = (0xFFFF9036 & 0xFF6FC9);
        BiomeColorHelper.lIllIllIIIIllI[4] = (0x68 ^ 0x78);
        BiomeColorHelper.lIllIllIIIIllI[5] = (0xFFFFFF31 & 0xFFCE);
        BiomeColorHelper.lIllIllIIIIllI[6] = (0x9D ^ 0x95);
        BiomeColorHelper.lIllIllIIIIllI[7] = 169 + 203 - 184 + 67;
        BiomeColorHelper.lIllIllIIIIllI[8] = (0x46 ^ 0x4F);
    }
    
    private static int func_180285_a(final IBlockAccess llllllllllllIlllllllIllIIIlllllI, final BlockPos llllllllllllIlllllllIllIIIllIlIl, final ColorResolver llllllllllllIlllllllIllIIIllllII) {
        int llllllllllllIlllllllIllIIIlllIll = BiomeColorHelper.lIllIllIIIIllI[0];
        int llllllllllllIlllllllIllIIIlllIlI = BiomeColorHelper.lIllIllIIIIllI[0];
        int llllllllllllIlllllllIllIIIlllIIl = BiomeColorHelper.lIllIllIIIIllI[0];
        final byte llllllllllllIlllllllIllIIIlIllll = (byte)BlockPos.getAllInBoxMutable(llllllllllllIlllllllIllIIIllIlIl.add(BiomeColorHelper.lIllIllIIIIllI[1], BiomeColorHelper.lIllIllIIIIllI[0], BiomeColorHelper.lIllIllIIIIllI[1]), llllllllllllIlllllllIllIIIllIlIl.add(BiomeColorHelper.lIllIllIIIIllI[2], BiomeColorHelper.lIllIllIIIIllI[0], BiomeColorHelper.lIllIllIIIIllI[2])).iterator();
        "".length();
        if (((0xB6 ^ 0xC6 ^ (0x39 ^ 0x1C)) & (0x3C ^ 0x72 ^ (0x19 ^ 0x2) ^ -" ".length())) >= (0x51 ^ 0x2A ^ 39 + 112 - 24 + 0)) {
            return (0x2A ^ 0x7E ^ ((0xA4 ^ 0x8D) & ~(0x6C ^ 0x45))) & (0x68 ^ 0xE ^ (0xA4 ^ 0x96) ^ -" ".length());
        }
        while (!lllllllIllIIlII(((Iterator)llllllllllllIlllllllIllIIIlIllll).hasNext() ? 1 : 0)) {
            final BlockPos.MutableBlockPos llllllllllllIlllllllIllIIIlllIII = ((Iterator<BlockPos.MutableBlockPos>)llllllllllllIlllllllIllIIIlIllll).next();
            final int llllllllllllIlllllllIllIIIllIlll = llllllllllllIlllllllIllIIIllllII.getColorAtPos(llllllllllllIlllllllIllIIIlllllI.getBiomeGenForCoords(llllllllllllIlllllllIllIIIlllIII), llllllllllllIlllllllIllIIIlllIII);
            llllllllllllIlllllllIllIIIlllIll += (llllllllllllIlllllllIllIIIllIlll & BiomeColorHelper.lIllIllIIIIllI[3]) >> BiomeColorHelper.lIllIllIIIIllI[4];
            llllllllllllIlllllllIllIIIlllIlI += (llllllllllllIlllllllIllIIIllIlll & BiomeColorHelper.lIllIllIIIIllI[5]) >> BiomeColorHelper.lIllIllIIIIllI[6];
            llllllllllllIlllllllIllIIIlllIIl += (llllllllllllIlllllllIllIIIllIlll & BiomeColorHelper.lIllIllIIIIllI[7]);
        }
        return (llllllllllllIlllllllIllIIIlllIll / BiomeColorHelper.lIllIllIIIIllI[8] & BiomeColorHelper.lIllIllIIIIllI[7]) << BiomeColorHelper.lIllIllIIIIllI[4] | (llllllllllllIlllllllIllIIIlllIlI / BiomeColorHelper.lIllIllIIIIllI[8] & BiomeColorHelper.lIllIllIIIIllI[7]) << BiomeColorHelper.lIllIllIIIIllI[6] | (llllllllllllIlllllllIllIIIlllIIl / BiomeColorHelper.lIllIllIIIIllI[8] & BiomeColorHelper.lIllIllIIIIllI[7]);
    }
    
    static {
        lllllllIllIIIll();
        field_180291_a = new ColorResolver() {
            @Override
            public int getColorAtPos(final BiomeGenBase lllllllllllllIlIIllIllllIIIlllll, final BlockPos lllllllllllllIlIIllIllllIIIllllI) {
                return lllllllllllllIlIIllIllllIIIlllll.getGrassColorAtPos(lllllllllllllIlIIllIllllIIIllllI);
            }
        };
        field_180289_b = new ColorResolver() {
            @Override
            public int getColorAtPos(final BiomeGenBase llllllllllllIllIlIlIlIIlllIIIIII, final BlockPos llllllllllllIllIlIlIlIIllIllllll) {
                return llllllllllllIllIlIlIlIIlllIIIIII.getFoliageColorAtPos(llllllllllllIllIlIlIlIIllIllllll);
            }
        };
        field_180290_c = new ColorResolver() {
            @Override
            public int getColorAtPos(final BiomeGenBase llllllllllllIllllIIIIllIIIlIIlIl, final BlockPos llllllllllllIllllIIIIllIIIlIIllI) {
                return llllllllllllIllllIIIIllIIIlIIlIl.waterColorMultiplier;
            }
        };
    }
    
    public static int getFoliageColorAtPos(final IBlockAccess llllllllllllIlllllllIllIIIlIIIll, final BlockPos llllllllllllIlllllllIllIIIlIIIlI) {
        return func_180285_a(llllllllllllIlllllllIllIIIlIIIll, llllllllllllIlllllllIllIIIlIIIlI, BiomeColorHelper.field_180289_b);
    }
    
    public static int getWaterColorAtPos(final IBlockAccess llllllllllllIlllllllIllIIIIlllIl, final BlockPos llllllllllllIlllllllIllIIIIlllII) {
        return func_180285_a(llllllllllllIlllllllIllIIIIlllIl, llllllllllllIlllllllIllIIIIlllII, BiomeColorHelper.field_180290_c);
    }
    
    private static boolean lllllllIllIIlII(final int llllllllllllIlllllllIllIIIIllIlI) {
        return llllllllllllIlllllllIllIIIIllIlI == 0;
    }
    
    public static int getGrassColorAtPos(final IBlockAccess llllllllllllIlllllllIllIIIlIlIIl, final BlockPos llllllllllllIlllllllIllIIIlIlIlI) {
        return func_180285_a(llllllllllllIlllllllIllIIIlIlIIl, llllllllllllIlllllllIllIIIlIlIlI, BiomeColorHelper.field_180291_a);
    }
    
    interface ColorResolver
    {
        int getColorAtPos(final BiomeGenBase p0, final BlockPos p1);
    }
}
