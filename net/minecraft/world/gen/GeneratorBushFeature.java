// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen;

import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.BlockBush;
import net.minecraft.world.gen.feature.WorldGenerator;

public class GeneratorBushFeature extends WorldGenerator
{
    private /* synthetic */ BlockBush field_175908_a;
    private static final /* synthetic */ int[] llIlIIIllllllI;
    
    static {
        lIIlIIlIIIlllIII();
    }
    
    private static void lIIlIIlIIIlllIII() {
        (llIlIIIllllllI = new int[7])[0] = ((111 + 19 - 106 + 105 ^ 94 + 85 - 66 + 46) & (217 + 70 - 164 + 95 ^ 155 + 167 - 305 + 179 ^ -" ".length()));
        GeneratorBushFeature.llIlIIIllllllI[1] = (0x3D ^ 0x35);
        GeneratorBushFeature.llIlIIIllllllI[2] = (0x12 ^ 0x16);
        GeneratorBushFeature.llIlIIIllllllI[3] = 143 + 180 - 238 + 123 + (0x1B ^ 0x7) - (0xDA ^ 0x81) + (0xD3 ^ 0xBD);
        GeneratorBushFeature.llIlIIIllllllI[4] = "  ".length();
        GeneratorBushFeature.llIlIIIllllllI[5] = (0x27 ^ 0x67);
        GeneratorBushFeature.llIlIIIllllllI[6] = " ".length();
    }
    
    private static boolean lIIlIIlIIIlllIll(final int llllllllllllIllIllIIlIIlllIllIlI, final int llllllllllllIllIllIIlIIlllIllIIl) {
        return llllllllllllIllIllIIlIIlllIllIlI >= llllllllllllIllIllIIlIIlllIllIIl;
    }
    
    private static boolean lIIlIIlIIIlllIlI(final int llllllllllllIllIllIIlIIlllIlIllI, final int llllllllllllIllIllIIlIIlllIlIlIl) {
        return llllllllllllIllIllIIlIIlllIlIllI < llllllllllllIllIllIIlIIlllIlIlIl;
    }
    
    private static boolean lIIlIIlIIIlllIIl(final int llllllllllllIllIllIIlIIlllIlIIll) {
        return llllllllllllIllIllIIlIIlllIlIIll != 0;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIllIIlIIllllIIIIl, final Random llllllllllllIllIllIIlIIllllIIIII, final BlockPos llllllllllllIllIllIIlIIllllIIlIl) {
        int llllllllllllIllIllIIlIIllllIIlII = GeneratorBushFeature.llIlIIIllllllI[0];
        "".length();
        if ("   ".length() < 0) {
            return ((0xEE ^ 0xA8 ^ (0xF ^ 0x29)) & ((" ".length() & ~" ".length()) ^ (0x70 ^ 0x10) ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIlIIIlllIll(llllllllllllIllIllIIlIIllllIIlII, GeneratorBushFeature.llIlIIIllllllI[5])) {
            final BlockPos llllllllllllIllIllIIlIIllllIIIll = llllllllllllIllIllIIlIIllllIIlIl.add(llllllllllllIllIllIIlIIllllIIIII.nextInt(GeneratorBushFeature.llIlIIIllllllI[1]) - llllllllllllIllIllIIlIIllllIIIII.nextInt(GeneratorBushFeature.llIlIIIllllllI[1]), llllllllllllIllIllIIlIIllllIIIII.nextInt(GeneratorBushFeature.llIlIIIllllllI[2]) - llllllllllllIllIllIIlIIllllIIIII.nextInt(GeneratorBushFeature.llIlIIIllllllI[2]), llllllllllllIllIllIIlIIllllIIIII.nextInt(GeneratorBushFeature.llIlIIIllllllI[1]) - llllllllllllIllIllIIlIIllllIIIII.nextInt(GeneratorBushFeature.llIlIIIllllllI[1]));
            if (lIIlIIlIIIlllIIl(llllllllllllIllIllIIlIIllllIIIIl.isAirBlock(llllllllllllIllIllIIlIIllllIIIll) ? 1 : 0) && (!lIIlIIlIIIlllIIl(llllllllllllIllIllIIlIIllllIIIIl.provider.getHasNoSky() ? 1 : 0) || lIIlIIlIIIlllIlI(llllllllllllIllIllIIlIIllllIIIll.getY(), GeneratorBushFeature.llIlIIIllllllI[3])) && lIIlIIlIIIlllIIl(this.field_175908_a.canBlockStay(llllllllllllIllIllIIlIIllllIIIIl, llllllllllllIllIllIIlIIllllIIIll, this.field_175908_a.getDefaultState()) ? 1 : 0)) {
                llllllllllllIllIllIIlIIllllIIIIl.setBlockState(llllllllllllIllIllIIlIIllllIIIll, this.field_175908_a.getDefaultState(), GeneratorBushFeature.llIlIIIllllllI[4]);
                "".length();
            }
            ++llllllllllllIllIllIIlIIllllIIlII;
        }
        return GeneratorBushFeature.llIlIIIllllllI[6] != 0;
    }
    
    public GeneratorBushFeature(final BlockBush llllllllllllIllIllIIlIIllllIllll) {
        this.field_175908_a = llllllllllllIllIllIIlIIllllIllll;
    }
}
