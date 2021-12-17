// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import java.util.Random;
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.state.IBlockState;

public abstract class WorldGenHugeTrees extends WorldGenAbstractTree
{
    protected /* synthetic */ int extraRandomHeight;
    protected final /* synthetic */ IBlockState leavesMetadata;
    protected final /* synthetic */ IBlockState woodMetadata;
    private static final /* synthetic */ int[] llIlIIlIllIlII;
    protected final /* synthetic */ int baseHeight;
    
    private static void lIIlIIlIlIIllIlI() {
        (llIlIIlIllIlII = new int[5])[0] = "   ".length();
        WorldGenHugeTrees.llIlIIlIllIlII[1] = " ".length();
        WorldGenHugeTrees.llIlIIlIllIlII[2] = (0xFFFFE5ED & 0x1B12);
        WorldGenHugeTrees.llIlIIlIllIlII[3] = ((0x9C ^ 0xAC) & ~(0xC ^ 0x3C));
        WorldGenHugeTrees.llIlIIlIllIlII[4] = "  ".length();
    }
    
    static {
        lIIlIIlIlIIllIlI();
    }
    
    protected void func_175928_b(final World llllllllllllIllIllIIIIlIlIIlllII, final BlockPos llllllllllllIllIllIIIIlIlIlIIlII, final int llllllllllllIllIllIIIIlIlIIllIlI) {
        final int llllllllllllIllIllIIIIlIlIlIIIlI = llllllllllllIllIllIIIIlIlIIllIlI * llllllllllllIllIllIIIIlIlIIllIlI;
        int llllllllllllIllIllIIIIlIlIlIIIIl = -llllllllllllIllIllIIIIlIlIIllIlI;
        "".length();
        if (-(102 + 129 - 130 + 90 ^ 115 + 50 - 125 + 146) >= 0) {
            return;
        }
        while (!lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIlIlIIIIl, llllllllllllIllIllIIIIlIlIIllIlI)) {
            int llllllllllllIllIllIIIIlIlIlIIIII = -llllllllllllIllIllIIIIlIlIIllIlI;
            "".length();
            if ("   ".length() == -" ".length()) {
                return;
            }
            while (!lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIlIlIIIII, llllllllllllIllIllIIIIlIlIIllIlI)) {
                if (lIIlIIlIlIIlllIl(llllllllllllIllIllIIIIlIlIlIIIIl * llllllllllllIllIllIIIIlIlIlIIIIl + llllllllllllIllIllIIIIlIlIlIIIII * llllllllllllIllIllIIIIlIlIlIIIII, llllllllllllIllIllIIIIlIlIlIIIlI)) {
                    final BlockPos llllllllllllIllIllIIIIlIlIIlllll = llllllllllllIllIllIIIIlIlIlIIlII.add(llllllllllllIllIllIIIIlIlIlIIIIl, WorldGenHugeTrees.llIlIIlIllIlII[3], llllllllllllIllIllIIIIlIlIlIIIII);
                    final Material llllllllllllIllIllIIIIlIlIIllllI = llllllllllllIllIllIIIIlIlIIlllII.getBlockState(llllllllllllIllIllIIIIlIlIIlllll).getBlock().getMaterial();
                    if (!lIIlIIlIlIlIIIIl(llllllllllllIllIllIIIIlIlIIllllI, Material.air) || lIIlIIlIlIlIIIlI(llllllllllllIllIllIIIIlIlIIllllI, Material.leaves)) {
                        this.setBlockAndNotifyAdequately(llllllllllllIllIllIIIIlIlIIlllII, llllllllllllIllIllIIIIlIlIIlllll, this.leavesMetadata);
                    }
                }
                ++llllllllllllIllIllIIIIlIlIlIIIII;
            }
            ++llllllllllllIllIllIIIIlIlIlIIIIl;
        }
    }
    
    private static boolean lIIlIIlIlIlIIIII(final int llllllllllllIllIllIIIIlIlIIIlllI, final int llllllllllllIllIllIIIIlIlIIIllIl) {
        return llllllllllllIllIllIIIIlIlIIIlllI < llllllllllllIllIllIIIIlIlIIIllIl;
    }
    
    private static boolean lIIlIIlIlIIlllll(final int llllllllllllIllIllIIIIlIIlllIlll) {
        return llllllllllllIllIllIIIIlIIlllIlll >= 0;
    }
    
    private static boolean lIIlIIlIlIlIIIlI(final Object llllllllllllIllIllIIIIlIIllllllI, final Object llllllllllllIllIllIIIIlIIlllllIl) {
        return llllllllllllIllIllIIIIlIIllllllI == llllllllllllIllIllIIIIlIIlllllIl;
    }
    
    private static boolean lIIlIIlIlIIlllII(final int llllllllllllIllIllIIIIlIlIIlIIlI, final int llllllllllllIllIllIIIIlIlIIlIIIl) {
        return llllllllllllIllIllIIIIlIlIIlIIlI >= llllllllllllIllIllIIIIlIlIIlIIIl;
    }
    
    private boolean func_175927_a(final BlockPos llllllllllllIllIllIIIIlIlllIIllI, final World llllllllllllIllIllIIIIlIlllIIlIl) {
        final BlockPos llllllllllllIllIllIIIIlIlllIIlII = llllllllllllIllIllIIIIlIlllIIllI.down();
        final Block llllllllllllIllIllIIIIlIlllIIIll = llllllllllllIllIllIIIIlIlllIIlIl.getBlockState(llllllllllllIllIllIIIIlIlllIIlII).getBlock();
        if ((!lIIlIIlIlIlIIIIl(llllllllllllIllIllIIIIlIlllIIIll, Blocks.grass) || lIIlIIlIlIlIIIlI(llllllllllllIllIllIIIIlIlllIIIll, Blocks.dirt)) && lIIlIIlIlIIlllII(llllllllllllIllIllIIIIlIlllIIllI.getY(), WorldGenHugeTrees.llIlIIlIllIlII[4])) {
            this.func_175921_a(llllllllllllIllIllIIIIlIlllIIlIl, llllllllllllIllIllIIIIlIlllIIlII);
            this.func_175921_a(llllllllllllIllIllIIIIlIlllIIlIl, llllllllllllIllIllIIIIlIlllIIlII.east());
            this.func_175921_a(llllllllllllIllIllIIIIlIlllIIlIl, llllllllllllIllIllIIIIlIlllIIlII.south());
            this.func_175921_a(llllllllllllIllIllIIIIlIlllIIlIl, llllllllllllIllIllIIIIlIlllIIlII.south().east());
            return WorldGenHugeTrees.llIlIIlIllIlII[1] != 0;
        }
        return WorldGenHugeTrees.llIlIIlIllIlII[3] != 0;
    }
    
    private static boolean lIIlIIlIlIlIIIll(final int llllllllllllIllIllIIIIlIIllllIll) {
        return llllllllllllIllIllIIIIlIIllllIll != 0;
    }
    
    private static boolean lIIlIIlIlIIllllI(final int llllllllllllIllIllIIIIlIIllllIIl) {
        return llllllllllllIllIllIIIIlIIllllIIl == 0;
    }
    
    private static boolean lIIlIIlIlIlIIIIl(final Object llllllllllllIllIllIIIIlIlIIIIIlI, final Object llllllllllllIllIllIIIIlIlIIIIIIl) {
        return llllllllllllIllIllIIIIlIlIIIIIlI != llllllllllllIllIllIIIIlIlIIIIIIl;
    }
    
    protected int func_150533_a(final Random llllllllllllIllIllIIIIllIIIIllII) {
        int llllllllllllIllIllIIIIllIIIIlIll = llllllllllllIllIllIIIIllIIIIllII.nextInt(WorldGenHugeTrees.llIlIIlIllIlII[0]) + this.baseHeight;
        if (lIIlIIlIlIIllIll(this.extraRandomHeight, WorldGenHugeTrees.llIlIIlIllIlII[1])) {
            llllllllllllIllIllIIIIllIIIIlIll += llllllllllllIllIllIIIIllIIIIllII.nextInt(this.extraRandomHeight);
        }
        return llllllllllllIllIllIIIIllIIIIlIll;
    }
    
    private static boolean lIIlIIlIlIIlllIl(final int llllllllllllIllIllIIIIlIlIIIlIlI, final int llllllllllllIllIllIIIIlIlIIIlIIl) {
        return llllllllllllIllIllIIIIlIlIIIlIlI <= llllllllllllIllIllIIIIlIlIIIlIIl;
    }
    
    private static boolean lIIlIIlIlIIllIll(final int llllllllllllIllIllIIIIlIlIIIIllI, final int llllllllllllIllIllIIIIlIlIIIIlIl) {
        return llllllllllllIllIllIIIIlIlIIIIllI > llllllllllllIllIllIIIIlIlIIIIlIl;
    }
    
    public WorldGenHugeTrees(final boolean llllllllllllIllIllIIIIllIIIllIll, final int llllllllllllIllIllIIIIllIIIllIlI, final int llllllllllllIllIllIIIIllIIIllIIl, final IBlockState llllllllllllIllIllIIIIllIIIlIIlI, final IBlockState llllllllllllIllIllIIIIllIIIlIlll) {
        super(llllllllllllIllIllIIIIllIIIllIll);
        this.baseHeight = llllllllllllIllIllIIIIllIIIllIlI;
        this.extraRandomHeight = llllllllllllIllIllIIIIllIIIllIIl;
        this.woodMetadata = llllllllllllIllIllIIIIllIIIlIIlI;
        this.leavesMetadata = llllllllllllIllIllIIIIllIIIlIlll;
    }
    
    private boolean func_175926_c(final World llllllllllllIllIllIIIIlIllllIlII, final BlockPos llllllllllllIllIllIIIIlIllllllII, final int llllllllllllIllIllIIIIlIlllllIll) {
        boolean llllllllllllIllIllIIIIlIlllllIlI = WorldGenHugeTrees.llIlIIlIllIlII[1] != 0;
        if (!lIIlIIlIlIIlllII(llllllllllllIllIllIIIIlIllllllII.getY(), WorldGenHugeTrees.llIlIIlIllIlII[1]) || !lIIlIIlIlIIlllIl(llllllllllllIllIllIIIIlIllllllII.getY() + llllllllllllIllIllIIIIlIlllllIll + WorldGenHugeTrees.llIlIIlIllIlII[1], WorldGenHugeTrees.llIlIIlIllIlII[2])) {
            return WorldGenHugeTrees.llIlIIlIllIlII[3] != 0;
        }
        int llllllllllllIllIllIIIIlIlllllIIl = WorldGenHugeTrees.llIlIIlIllIlII[3];
        "".length();
        if (((0x77 ^ 0x7B ^ (0x38 ^ 0x7C)) & (194 + 18 - 98 + 90 ^ 45 + 0 - 13 + 100 ^ -" ".length())) == -" ".length()) {
            return ((0x33 ^ 0x78 ^ (0xFE ^ 0xBF)) & (149 + 36 - 156 + 159 ^ 19 + 179 - 111 + 95 ^ -" ".length())) != 0x0;
        }
        while (!lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIlllllIIl, WorldGenHugeTrees.llIlIIlIllIlII[1] + llllllllllllIllIllIIIIlIlllllIll)) {
            int llllllllllllIllIllIIIIlIlllllIII = WorldGenHugeTrees.llIlIIlIllIlII[4];
            if (lIIlIIlIlIIllllI(llllllllllllIllIllIIIIlIlllllIIl)) {
                llllllllllllIllIllIIIIlIlllllIII = WorldGenHugeTrees.llIlIIlIllIlII[1];
                "".length();
                if (((0xFD ^ 0xC5 ^ (0x35 ^ 0x32)) & (109 + 44 - 44 + 36 ^ 127 + 166 - 232 + 113 ^ -" ".length())) != 0x0) {
                    return ((0x54 ^ 0x4C ^ (0x1A ^ 0x3C)) & (0xB2 ^ 0xA5 ^ (0x96 ^ 0xBF) ^ -" ".length())) != 0x0;
                }
            }
            else if (lIIlIIlIlIIlllII(llllllllllllIllIllIIIIlIlllllIIl, WorldGenHugeTrees.llIlIIlIllIlII[1] + llllllllllllIllIllIIIIlIlllllIll - WorldGenHugeTrees.llIlIIlIllIlII[4])) {
                llllllllllllIllIllIIIIlIlllllIII = WorldGenHugeTrees.llIlIIlIllIlII[4];
            }
            int llllllllllllIllIllIIIIlIllllIlll = -llllllllllllIllIllIIIIlIlllllIII;
            "".length();
            if (-(0x63 ^ 0x67) >= 0) {
                return ((0x2A ^ 0x4A) & ~(0x57 ^ 0x37)) != 0x0;
            }
            while (lIIlIIlIlIIlllIl(llllllllllllIllIllIIIIlIllllIlll, llllllllllllIllIllIIIIlIlllllIII) && !lIIlIIlIlIIllllI(llllllllllllIllIllIIIIlIlllllIlI ? 1 : 0)) {
                int llllllllllllIllIllIIIIlIllllIllI = -llllllllllllIllIllIIIIlIlllllIII;
                "".length();
                if ((0x9 ^ 0x5E ^ (0xA ^ 0x59)) <= "   ".length()) {
                    return ((0x73 ^ 0x15 ^ (0x3F ^ 0x79)) & (0x17 ^ 0x47 ^ (0x11 ^ 0x61) ^ -" ".length())) != 0x0;
                }
                while (lIIlIIlIlIIlllIl(llllllllllllIllIllIIIIlIllllIllI, llllllllllllIllIllIIIIlIlllllIII) && !lIIlIIlIlIIllllI(llllllllllllIllIllIIIIlIlllllIlI ? 1 : 0)) {
                    if (!lIIlIIlIlIIlllll(llllllllllllIllIllIIIIlIllllllII.getY() + llllllllllllIllIllIIIIlIlllllIIl) || !lIIlIIlIlIlIIIII(llllllllllllIllIllIIIIlIllllllII.getY() + llllllllllllIllIllIIIIlIlllllIIl, WorldGenHugeTrees.llIlIIlIllIlII[2]) || lIIlIIlIlIIllllI(this.func_150523_a(llllllllllllIllIllIIIIlIllllIlII.getBlockState(llllllllllllIllIllIIIIlIllllllII.add(llllllllllllIllIllIIIIlIllllIlll, llllllllllllIllIllIIIIlIlllllIIl, llllllllllllIllIllIIIIlIllllIllI)).getBlock()) ? 1 : 0)) {
                        llllllllllllIllIllIIIIlIlllllIlI = (WorldGenHugeTrees.llIlIIlIllIlII[3] != 0);
                    }
                    ++llllllllllllIllIllIIIIlIllllIllI;
                }
                ++llllllllllllIllIllIIIIlIllllIlll;
            }
            ++llllllllllllIllIllIIIIlIlllllIIl;
        }
        return llllllllllllIllIllIIIIlIlllllIlI;
    }
    
    protected boolean func_175929_a(final World llllllllllllIllIllIIIIlIllIlIIll, final Random llllllllllllIllIllIIIIlIllIlIlll, final BlockPos llllllllllllIllIllIIIIlIllIlIllI, final int llllllllllllIllIllIIIIlIllIlIlIl) {
        if (lIIlIIlIlIlIIIll(this.func_175926_c(llllllllllllIllIllIIIIlIllIlIIll, llllllllllllIllIllIIIIlIllIlIllI, llllllllllllIllIllIIIIlIllIlIlIl) ? 1 : 0) && lIIlIIlIlIlIIIll(this.func_175927_a(llllllllllllIllIllIIIIlIllIlIllI, llllllllllllIllIllIIIIlIllIlIIll) ? 1 : 0)) {
            return WorldGenHugeTrees.llIlIIlIllIlII[1] != 0;
        }
        return WorldGenHugeTrees.llIlIIlIllIlII[3] != 0;
    }
    
    protected void func_175925_a(final World llllllllllllIllIllIIIIlIllIIIlII, final BlockPos llllllllllllIllIllIIIIlIlIlllIII, final int llllllllllllIllIllIIIIlIllIIIIlI) {
        final int llllllllllllIllIllIIIIlIllIIIIIl = llllllllllllIllIllIIIIlIllIIIIlI * llllllllllllIllIllIIIIlIllIIIIlI;
        int llllllllllllIllIllIIIIlIllIIIIII = -llllllllllllIllIllIIIIlIllIIIIlI;
        "".length();
        if (-" ".length() >= "  ".length()) {
            return;
        }
        while (!lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIllIIIIII, llllllllllllIllIllIIIIlIllIIIIlI + WorldGenHugeTrees.llIlIIlIllIlII[1])) {
            int llllllllllllIllIllIIIIlIlIllllll = -llllllllllllIllIllIIIIlIllIIIIlI;
            "".length();
            if (" ".length() == 0) {
                return;
            }
            while (!lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIlIllllll, llllllllllllIllIllIIIIlIllIIIIlI + WorldGenHugeTrees.llIlIIlIllIlII[1])) {
                final int llllllllllllIllIllIIIIlIlIlllllI = llllllllllllIllIllIIIIlIllIIIIII - WorldGenHugeTrees.llIlIIlIllIlII[1];
                final int llllllllllllIllIllIIIIlIlIllllIl = llllllllllllIllIllIIIIlIlIllllll - WorldGenHugeTrees.llIlIIlIllIlII[1];
                if (!lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIllIIIIII * llllllllllllIllIllIIIIlIllIIIIII + llllllllllllIllIllIIIIlIlIllllll * llllllllllllIllIllIIIIlIlIllllll, llllllllllllIllIllIIIIlIllIIIIIl) || !lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIlIlllllI * llllllllllllIllIllIIIIlIlIlllllI + llllllllllllIllIllIIIIlIlIllllIl * llllllllllllIllIllIIIIlIlIllllIl, llllllllllllIllIllIIIIlIllIIIIIl) || !lIIlIIlIlIIllIll(llllllllllllIllIllIIIIlIllIIIIII * llllllllllllIllIllIIIIlIllIIIIII + llllllllllllIllIllIIIIlIlIllllIl * llllllllllllIllIllIIIIlIlIllllIl, llllllllllllIllIllIIIIlIllIIIIIl) || lIIlIIlIlIIlllIl(llllllllllllIllIllIIIIlIlIlllllI * llllllllllllIllIllIIIIlIlIlllllI + llllllllllllIllIllIIIIlIlIllllll * llllllllllllIllIllIIIIlIlIllllll, llllllllllllIllIllIIIIlIllIIIIIl)) {
                    final BlockPos llllllllllllIllIllIIIIlIlIllllII = llllllllllllIllIllIIIIlIlIlllIII.add(llllllllllllIllIllIIIIlIllIIIIII, WorldGenHugeTrees.llIlIIlIllIlII[3], llllllllllllIllIllIIIIlIlIllllll);
                    final Material llllllllllllIllIllIIIIlIlIlllIll = llllllllllllIllIllIIIIlIllIIIlII.getBlockState(llllllllllllIllIllIIIIlIlIllllII).getBlock().getMaterial();
                    if (!lIIlIIlIlIlIIIIl(llllllllllllIllIllIIIIlIlIlllIll, Material.air) || lIIlIIlIlIlIIIlI(llllllllllllIllIllIIIIlIlIlllIll, Material.leaves)) {
                        this.setBlockAndNotifyAdequately(llllllllllllIllIllIIIIlIllIIIlII, llllllllllllIllIllIIIIlIlIllllII, this.leavesMetadata);
                    }
                }
                ++llllllllllllIllIllIIIIlIlIllllll;
            }
            ++llllllllllllIllIllIIIIlIllIIIIII;
        }
    }
}
