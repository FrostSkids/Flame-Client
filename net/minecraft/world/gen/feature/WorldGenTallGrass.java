// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.util.Vec3i;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.init.Blocks;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.state.IBlockState;

public class WorldGenTallGrass extends WorldGenerator
{
    private final /* synthetic */ IBlockState tallGrassState;
    private static final /* synthetic */ int[] llIllIIIIlllIl;
    
    public WorldGenTallGrass(final BlockTallGrass.EnumType llllllllllllIllIlIIIIlIIlIlIIIII) {
        this.tallGrassState = Blocks.tallgrass.getDefaultState().withProperty(BlockTallGrass.TYPE, llllllllllllIllIlIIIIlIIlIlIIIII);
    }
    
    private static boolean lIIlIllIIllIIIII(final int llllllllllllIllIlIIIIlIIIllllIlI) {
        return llllllllllllIllIlIIIIlIIIllllIlI != 0;
    }
    
    private static boolean lIIlIllIIllIIIIl(final int llllllllllllIllIlIIIIlIIlIIIIlIl, final int llllllllllllIllIlIIIIlIIlIIIIlII) {
        return llllllllllllIllIlIIIIlIIlIIIIlIl >= llllllllllllIllIlIIIIlIIlIIIIlII;
    }
    
    private static void lIIlIllIIlIlllII() {
        (llIllIIIIlllIl = new int[6])[0] = ((0x16 ^ 0x2) & ~(0x8D ^ 0x99));
        WorldGenTallGrass.llIllIIIIlllIl[1] = (104 + 41 + 27 + 35 ^ 26 + 60 - 10 + 123);
        WorldGenTallGrass.llIllIIIIlllIl[2] = (((0x31 ^ 0x4) & ~(0x58 ^ 0x6D)) ^ (0x51 ^ 0x55));
        WorldGenTallGrass.llIllIIIIlllIl[3] = "  ".length();
        WorldGenTallGrass.llIllIIIIlllIl[4] = 53 + 108 - 62 + 29;
        WorldGenTallGrass.llIllIIIIlllIl[5] = " ".length();
    }
    
    static {
        lIIlIllIIlIlllII();
    }
    
    @Override
    public boolean generate(final World llllllllllllIllIlIIIIlIIlIIlIlIl, final Random llllllllllllIllIlIIIIlIIlIIIllII, BlockPos llllllllllllIllIlIIIIlIIlIIIlIll) {
        "".length();
        if ((0x1D ^ 0x19) == 0x0) {
            return ((0x6A ^ 0x7B) & ~(0xE ^ 0x1F)) != 0x0;
        }
        Block llllllllllllIllIlIIIIlIIlIIlIIIl;
        while ((!lIIlIllIIlIlllIl((llllllllllllIllIlIIIIlIIlIIlIIIl = llllllllllllIllIlIIIIlIIlIIlIlIl.getBlockState((BlockPos)llllllllllllIllIlIIIIlIIlIIIlIll).getBlock()).getMaterial(), Material.air) || lIIlIllIIlIllllI(llllllllllllIllIlIIIIlIIlIIlIIIl.getMaterial(), Material.leaves)) && !lIIlIllIIlIlllll(((Vec3i)llllllllllllIllIlIIIIlIIlIIIlIll).getY())) {
            llllllllllllIllIlIIIIlIIlIIIlIll = ((BlockPos)llllllllllllIllIlIIIIlIIlIIIlIll).down();
        }
        int llllllllllllIllIlIIIIlIIlIIlIIII = WorldGenTallGrass.llIllIIIIlllIl[0];
        "".length();
        if (null != null) {
            return ((0xB0 ^ 0x84) & ~(0xA ^ 0x3E)) != 0x0;
        }
        while (!lIIlIllIIllIIIIl(llllllllllllIllIlIIIIlIIlIIlIIII, WorldGenTallGrass.llIllIIIIlllIl[4])) {
            final BlockPos llllllllllllIllIlIIIIlIIlIIIllll = ((BlockPos)llllllllllllIllIlIIIIlIIlIIIlIll).add(llllllllllllIllIlIIIIlIIlIIIllII.nextInt(WorldGenTallGrass.llIllIIIIlllIl[1]) - llllllllllllIllIlIIIIlIIlIIIllII.nextInt(WorldGenTallGrass.llIllIIIIlllIl[1]), llllllllllllIllIlIIIIlIIlIIIllII.nextInt(WorldGenTallGrass.llIllIIIIlllIl[2]) - llllllllllllIllIlIIIIlIIlIIIllII.nextInt(WorldGenTallGrass.llIllIIIIlllIl[2]), llllllllllllIllIlIIIIlIIlIIIllII.nextInt(WorldGenTallGrass.llIllIIIIlllIl[1]) - llllllllllllIllIlIIIIlIIlIIIllII.nextInt(WorldGenTallGrass.llIllIIIIlllIl[1]));
            if (lIIlIllIIllIIIII(llllllllllllIllIlIIIIlIIlIIlIlIl.isAirBlock(llllllllllllIllIlIIIIlIIlIIIllll) ? 1 : 0) && lIIlIllIIllIIIII(Blocks.tallgrass.canBlockStay(llllllllllllIllIlIIIIlIIlIIlIlIl, llllllllllllIllIlIIIIlIIlIIIllll, this.tallGrassState) ? 1 : 0)) {
                llllllllllllIllIlIIIIlIIlIIlIlIl.setBlockState(llllllllllllIllIlIIIIlIIlIIIllll, this.tallGrassState, WorldGenTallGrass.llIllIIIIlllIl[3]);
                "".length();
            }
            ++llllllllllllIllIlIIIIlIIlIIlIIII;
        }
        return WorldGenTallGrass.llIllIIIIlllIl[5] != 0;
    }
    
    private static boolean lIIlIllIIlIllllI(final Object llllllllllllIllIlIIIIlIIIlllllIl, final Object llllllllllllIllIlIIIIlIIIlllllII) {
        return llllllllllllIllIlIIIIlIIIlllllIl == llllllllllllIllIlIIIIlIIIlllllII;
    }
    
    private static boolean lIIlIllIIlIlllll(final int llllllllllllIllIlIIIIlIIIllllIII) {
        return llllllllllllIllIlIIIIlIIIllllIII <= 0;
    }
    
    private static boolean lIIlIllIIlIlllIl(final Object llllllllllllIllIlIIIIlIIlIIIIIIl, final Object llllllllllllIllIlIIIIlIIlIIIIIII) {
        return llllllllllllIllIlIIIIlIIlIIIIIIl != llllllllllllIllIlIIIIlIIlIIIIIII;
    }
}
