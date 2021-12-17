// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.BlockFlower;

public class WorldGenFlowers extends WorldGenerator
{
    private static final /* synthetic */ int[] lIIllllIllIlII;
    private /* synthetic */ BlockFlower flower;
    private /* synthetic */ IBlockState field_175915_b;
    
    @Override
    public boolean generate(final World lllllllllllllIIlIIlIIllIIllIllIl, final Random lllllllllllllIIlIIlIIllIIllIIllI, final BlockPos lllllllllllllIIlIIlIIllIIllIlIll) {
        int lllllllllllllIIlIIlIIllIIllIlIlI = WorldGenFlowers.lIIllllIllIlII[0];
        "".length();
        if ("   ".length() == 0) {
            return ((0x81 ^ 0xBB ^ (0x1F ^ 0x7A)) & (0x19 ^ 0x4B ^ (0x6E ^ 0x63) ^ -" ".length())) != 0x0;
        }
        while (!llIllllIIlIIIll(lllllllllllllIIlIIlIIllIIllIlIlI, WorldGenFlowers.lIIllllIllIlII[5])) {
            final BlockPos lllllllllllllIIlIIlIIllIIllIlIIl = lllllllllllllIIlIIlIIllIIllIlIll.add(lllllllllllllIIlIIlIIllIIllIIllI.nextInt(WorldGenFlowers.lIIllllIllIlII[1]) - lllllllllllllIIlIIlIIllIIllIIllI.nextInt(WorldGenFlowers.lIIllllIllIlII[1]), lllllllllllllIIlIIlIIllIIllIIllI.nextInt(WorldGenFlowers.lIIllllIllIlII[2]) - lllllllllllllIIlIIlIIllIIllIIllI.nextInt(WorldGenFlowers.lIIllllIllIlII[2]), lllllllllllllIIlIIlIIllIIllIIllI.nextInt(WorldGenFlowers.lIIllllIllIlII[1]) - lllllllllllllIIlIIlIIllIIllIIllI.nextInt(WorldGenFlowers.lIIllllIllIlII[1]));
            if (llIllllIIlIIIIl(lllllllllllllIIlIIlIIllIIllIllIl.isAirBlock(lllllllllllllIIlIIlIIllIIllIlIIl) ? 1 : 0) && (!llIllllIIlIIIIl(lllllllllllllIIlIIlIIllIIllIllIl.provider.getHasNoSky() ? 1 : 0) || llIllllIIlIIIlI(lllllllllllllIIlIIlIIllIIllIlIIl.getY(), WorldGenFlowers.lIIllllIllIlII[3])) && llIllllIIlIIIIl(this.flower.canBlockStay(lllllllllllllIIlIIlIIllIIllIllIl, lllllllllllllIIlIIlIIllIIllIlIIl, this.field_175915_b) ? 1 : 0)) {
                lllllllllllllIIlIIlIIllIIllIllIl.setBlockState(lllllllllllllIIlIIlIIllIIllIlIIl, this.field_175915_b, WorldGenFlowers.lIIllllIllIlII[4]);
                "".length();
            }
            ++lllllllllllllIIlIIlIIllIIllIlIlI;
        }
        return WorldGenFlowers.lIIllllIllIlII[6] != 0;
    }
    
    private static boolean llIllllIIlIIIIl(final int lllllllllllllIIlIIlIIllIIlIlIllI) {
        return lllllllllllllIIlIIlIIllIIlIlIllI != 0;
    }
    
    public WorldGenFlowers(final BlockFlower lllllllllllllIIlIIlIIllIlIIIIIlI, final BlockFlower.EnumFlowerType lllllllllllllIIlIIlIIllIlIIIIIIl) {
        this.setGeneratedBlock(lllllllllllllIIlIIlIIllIlIIIIIlI, lllllllllllllIIlIIlIIllIlIIIIIIl);
    }
    
    private static boolean llIllllIIlIIIll(final int lllllllllllllIIlIIlIIllIIllIIIII, final int lllllllllllllIIlIIlIIllIIlIlllll) {
        return lllllllllllllIIlIIlIIllIIllIIIII >= lllllllllllllIIlIIlIIllIIlIlllll;
    }
    
    private static void llIllllIIlIIIII() {
        (lIIllllIllIlII = new int[7])[0] = ((0x61 ^ 0x6C) & ~(0xB8 ^ 0xB5));
        WorldGenFlowers.lIIllllIllIlII[1] = (0x2 ^ 0x2E ^ (0x2F ^ 0xB));
        WorldGenFlowers.lIIllllIllIlII[2] = (0x3D ^ 0x39);
        WorldGenFlowers.lIIllllIllIlII[3] = 73 + 44 + 12 + 3 + (211 + 182 - 383 + 217) - (16 + 33 + 112 + 0) + (0x7C ^ 0x45);
        WorldGenFlowers.lIIllllIllIlII[4] = "  ".length();
        WorldGenFlowers.lIIllllIllIlII[5] = (0x83 ^ 0x9E ^ (0xD3 ^ 0x8E));
        WorldGenFlowers.lIIllllIllIlII[6] = " ".length();
    }
    
    static {
        llIllllIIlIIIII();
    }
    
    private static boolean llIllllIIlIIIlI(final int lllllllllllllIIlIIlIIllIIlIllIll, final int lllllllllllllIIlIIlIIllIIlIllIIl) {
        return lllllllllllllIIlIIlIIllIIlIllIll < lllllllllllllIIlIIlIIllIIlIllIIl;
    }
    
    public void setGeneratedBlock(final BlockFlower lllllllllllllIIlIIlIIllIIlllIllI, final BlockFlower.EnumFlowerType lllllllllllllIIlIIlIIllIIllllIII) {
        this.flower = lllllllllllllIIlIIlIIllIIlllIllI;
        this.field_175915_b = lllllllllllllIIlIIlIIllIIlllIllI.getDefaultState().withProperty(lllllllllllllIIlIIlIIllIIlllIllI.getTypeProperty(), lllllllllllllIIlIIlIIllIIllllIII);
    }
}
