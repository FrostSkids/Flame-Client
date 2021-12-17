// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.world.gen.feature;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import java.util.Random;
import net.minecraft.world.World;

public abstract class WorldGenerator
{
    private static final /* synthetic */ int[] llIIlIIlllIlll;
    private final /* synthetic */ boolean doBlockNotify;
    
    public abstract boolean generate(final World p0, final Random p1, final BlockPos p2);
    
    public WorldGenerator(final boolean llllllllllllIlllIIlIIlIIIIlIIlIl) {
        this.doBlockNotify = llllllllllllIlllIIlIIlIIIIlIIlIl;
    }
    
    public void func_175904_e() {
    }
    
    protected void setBlockAndNotifyAdequately(final World llllllllllllIlllIIlIIlIIIIIllIII, final BlockPos llllllllllllIlllIIlIIlIIIIIlIlll, final IBlockState llllllllllllIlllIIlIIlIIIIIllIlI) {
        if (lIIIllIIlIlIlllI(this.doBlockNotify ? 1 : 0)) {
            llllllllllllIlllIIlIIlIIIIIllIII.setBlockState(llllllllllllIlllIIlIIlIIIIIlIlll, llllllllllllIlllIIlIIlIIIIIllIlI, WorldGenerator.llIIlIIlllIlll[1]);
            "".length();
            "".length();
            if ("   ".length() < "  ".length()) {
                return;
            }
        }
        else {
            llllllllllllIlllIIlIIlIIIIIllIII.setBlockState(llllllllllllIlllIIlIIlIIIIIlIlll, llllllllllllIlllIIlIIlIIIIIllIlI, WorldGenerator.llIIlIIlllIlll[2]);
            "".length();
        }
    }
    
    static {
        lIIIllIIlIlIllIl();
    }
    
    private static void lIIIllIIlIlIllIl() {
        (llIIlIIlllIlll = new int[3])[0] = ((0x2B ^ 0x75) & ~(0xE ^ 0x50));
        WorldGenerator.llIIlIIlllIlll[1] = "   ".length();
        WorldGenerator.llIIlIIlllIlll[2] = "  ".length();
    }
    
    private static boolean lIIIllIIlIlIlllI(final int llllllllllllIlllIIlIIlIIIIIlIlII) {
        return llllllllllllIlllIIlIIlIIIIIlIlII != 0;
    }
    
    public WorldGenerator() {
        this((boolean)(WorldGenerator.llIIlIIlllIlll[0] != 0));
    }
}
