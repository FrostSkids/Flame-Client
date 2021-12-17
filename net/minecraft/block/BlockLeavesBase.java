// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;

public class BlockLeavesBase extends Block
{
    private static final /* synthetic */ int[] llIIllIIllIlIl;
    protected /* synthetic */ boolean fancyGraphics;
    
    private static void lIIIlllIlIllIIll() {
        (llIIllIIllIlIl = new int[1])[0] = ((0x9E ^ 0xAD) & ~(0xF7 ^ 0xC4));
    }
    
    protected BlockLeavesBase(final Material llllllllllllIlllIIIIIlIIlIlIlIII, final boolean llllllllllllIlllIIIIIlIIlIlIIlII) {
        super(llllllllllllIlllIIIIIlIIlIlIlIII);
        this.fancyGraphics = llllllllllllIlllIIIIIlIIlIlIIlII;
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess llllllllllllIlllIIIIIlIIlIIllIIl, final BlockPos llllllllllllIlllIIIIIlIIlIIllIII, final EnumFacing llllllllllllIlllIIIIIlIIlIIlIlll) {
        int shouldSideBeRendered;
        if (lIIIlllIlIllIlII(this.fancyGraphics ? 1 : 0) && lIIIlllIlIllIlIl(llllllllllllIlllIIIIIlIIlIIllIIl.getBlockState(llllllllllllIlllIIIIIlIIlIIllIII).getBlock(), this)) {
            shouldSideBeRendered = BlockLeavesBase.llIIllIIllIlIl[0];
            "".length();
            if (-" ".length() >= "  ".length()) {
                return ((0x86 ^ 0x8A ^ (0x81 ^ 0xAA)) & (0x55 ^ 0x1D ^ (0x2 ^ 0x6D) ^ -" ".length())) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = (super.shouldSideBeRendered(llllllllllllIlllIIIIIlIIlIIllIIl, llllllllllllIlllIIIIIlIIlIIllIII, llllllllllllIlllIIIIIlIIlIIlIlll) ? 1 : 0);
        }
        return shouldSideBeRendered != 0;
    }
    
    static {
        lIIIlllIlIllIIll();
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockLeavesBase.llIIllIIllIlIl[0] != 0;
    }
    
    private static boolean lIIIlllIlIllIlIl(final Object llllllllllllIlllIIIIIlIIlIIlIlII, final Object llllllllllllIlllIIIIIlIIlIIlIIll) {
        return llllllllllllIlllIIIIIlIIlIIlIlII == llllllllllllIlllIIIIIlIIlIIlIIll;
    }
    
    private static boolean lIIIlllIlIllIlII(final int llllllllllllIlllIIIIIlIIlIIlIIIl) {
        return llllllllllllIlllIIIIIlIIlIIlIIIl == 0;
    }
}
