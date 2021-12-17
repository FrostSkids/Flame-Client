// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class WorldGenClay extends WorldGenerator
{
    private /* synthetic */ int numberOfBlocks;
    private /* synthetic */ Block field_150546_a;
    private static final /* synthetic */ int[] lIllIlllIllIIl;
    
    private static boolean lIIIIIIIIlIIIlll(final Object llllllllllllIllllllIIlIllIlllIll, final Object llllllllllllIllllllIIlIllIlllIlI) {
        return llllllllllllIllllllIIlIllIlllIll != llllllllllllIllllllIIlIllIlllIlI;
    }
    
    private static boolean lIIIIIIIIlIIlIIl(final Object llllllllllllIllllllIIlIllIllIlll, final Object llllllllllllIllllllIIlIllIllIllI) {
        return llllllllllllIllllllIIlIllIllIlll == llllllllllllIllllllIIlIllIllIllI;
    }
    
    private static void lIIIIIIIIlIIIllI() {
        (lIllIlllIllIIl = new int[3])[0] = ((0x77 ^ 0x2A) & ~(0x7F ^ 0x22));
        WorldGenClay.lIllIlllIllIIl[1] = "  ".length();
        WorldGenClay.lIllIlllIllIIl[2] = " ".length();
    }
    
    static {
        lIIIIIIIIlIIIllI();
    }
    
    private static boolean lIIIIIIIIlIIlIII(final int llllllllllllIllllllIIlIlllIIIIll, final int llllllllllllIllllllIIlIlllIIIIlI) {
        return llllllllllllIllllllIIlIlllIIIIll <= llllllllllllIllllllIIlIlllIIIIlI;
    }
    
    @Override
    public boolean generate(final World llllllllllllIllllllIIlIlllIlIIIl, final Random llllllllllllIllllllIIlIlllIlIIII, final BlockPos llllllllllllIllllllIIlIlllIlllII) {
        if (lIIIIIIIIlIIIlll(llllllllllllIllllllIIlIlllIlIIIl.getBlockState(llllllllllllIllllllIIlIlllIlllII).getBlock().getMaterial(), Material.water)) {
            return WorldGenClay.lIllIlllIllIIl[0] != 0;
        }
        final int llllllllllllIllllllIIlIlllIllIll = llllllllllllIllllllIIlIlllIlIIII.nextInt(this.numberOfBlocks - WorldGenClay.lIllIlllIllIIl[1]) + WorldGenClay.lIllIlllIllIIl[1];
        final int llllllllllllIllllllIIlIlllIllIlI = WorldGenClay.lIllIlllIllIIl[2];
        int llllllllllllIllllllIIlIlllIllIIl = llllllllllllIllllllIIlIlllIlllII.getX() - llllllllllllIllllllIIlIlllIllIll;
        "".length();
        if (((" ".length() ^ (0x71 ^ 0x4D)) & (0x94 ^ 0xB5 ^ (0x32 ^ 0x2E) ^ -" ".length())) > "  ".length()) {
            return ((0x82 ^ 0x98 ^ (0xC3 ^ 0x99)) & (0x75 ^ 0x32 ^ (0x24 ^ 0x23) ^ -" ".length())) != 0x0;
        }
        while (!lIIIIIIIIlIIlIlI(llllllllllllIllllllIIlIlllIllIIl, llllllllllllIllllllIIlIlllIlllII.getX() + llllllllllllIllllllIIlIlllIllIll)) {
            int llllllllllllIllllllIIlIlllIllIII = llllllllllllIllllllIIlIlllIlllII.getZ() - llllllllllllIllllllIIlIlllIllIll;
            "".length();
            if (((0xF ^ 0x49) & ~(0xF4 ^ 0xB2)) != 0x0) {
                return ((0x6A ^ 0x35) & ~(0x9D ^ 0xC2)) != 0x0;
            }
            while (!lIIIIIIIIlIIlIlI(llllllllllllIllllllIIlIlllIllIII, llllllllllllIllllllIIlIlllIlllII.getZ() + llllllllllllIllllllIIlIlllIllIll)) {
                final int llllllllllllIllllllIIlIlllIlIlll = llllllllllllIllllllIIlIlllIllIIl - llllllllllllIllllllIIlIlllIlllII.getX();
                final int llllllllllllIllllllIIlIlllIlIllI = llllllllllllIllllllIIlIlllIllIII - llllllllllllIllllllIIlIlllIlllII.getZ();
                if (lIIIIIIIIlIIlIII(llllllllllllIllllllIIlIlllIlIlll * llllllllllllIllllllIIlIlllIlIlll + llllllllllllIllllllIIlIlllIlIllI * llllllllllllIllllllIIlIlllIlIllI, llllllllllllIllllllIIlIlllIllIll * llllllllllllIllllllIIlIlllIllIll)) {
                    int llllllllllllIllllllIIlIlllIlIlIl = llllllllllllIllllllIIlIlllIlllII.getY() - llllllllllllIllllllIIlIlllIllIlI;
                    "".length();
                    if (" ".length() != " ".length()) {
                        return ((0x9C ^ 0xA8) & ~(0x59 ^ 0x6D)) != 0x0;
                    }
                    while (!lIIIIIIIIlIIlIlI(llllllllllllIllllllIIlIlllIlIlIl, llllllllllllIllllllIIlIlllIlllII.getY() + llllllllllllIllllllIIlIlllIllIlI)) {
                        final BlockPos llllllllllllIllllllIIlIlllIlIlII = new BlockPos(llllllllllllIllllllIIlIlllIllIIl, llllllllllllIllllllIIlIlllIlIlIl, llllllllllllIllllllIIlIlllIllIII);
                        final Block llllllllllllIllllllIIlIlllIlIIll = llllllllllllIllllllIIlIlllIlIIIl.getBlockState(llllllllllllIllllllIIlIlllIlIlII).getBlock();
                        if (!lIIIIIIIIlIIIlll(llllllllllllIllllllIIlIlllIlIIll, Blocks.dirt) || lIIIIIIIIlIIlIIl(llllllllllllIllllllIIlIlllIlIIll, Blocks.clay)) {
                            llllllllllllIllllllIIlIlllIlIIIl.setBlockState(llllllllllllIllllllIIlIlllIlIlII, this.field_150546_a.getDefaultState(), WorldGenClay.lIllIlllIllIIl[1]);
                            "".length();
                        }
                        ++llllllllllllIllllllIIlIlllIlIlIl;
                    }
                }
                ++llllllllllllIllllllIIlIlllIllIII;
            }
            ++llllllllllllIllllllIIlIlllIllIIl;
        }
        return WorldGenClay.lIllIlllIllIIl[2] != 0;
    }
    
    public WorldGenClay(final int llllllllllllIllllllIIlIllllIllIl) {
        this.field_150546_a = Blocks.clay;
        this.numberOfBlocks = llllllllllllIllllllIIlIllllIllIl;
    }
    
    private static boolean lIIIIIIIIlIIlIlI(final int llllllllllllIllllllIIlIllIllllll, final int llllllllllllIllllllIIlIllIlllllI) {
        return llllllllllllIllllllIIlIllIllllll > llllllllllllIllllllIIlIllIlllllI;
    }
}
