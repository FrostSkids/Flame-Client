// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockCompressedPowered extends Block
{
    private static final /* synthetic */ int[] lllIllIIlllIlI;
    
    public BlockCompressedPowered(final Material llllllllllllIlIllIIlIllIIlIllllI, final MapColor llllllllllllIlIllIIlIllIIllIIIII) {
        super(llllllllllllIlIllIIlIllIIlIllllI, llllllllllllIlIllIIlIllIIllIIIII);
    }
    
    static {
        lIlIIlIIlIIlIllI();
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockCompressedPowered.lllIllIIlllIlI[0] != 0;
    }
    
    private static void lIlIIlIIlIIlIllI() {
        (lllIllIIlllIlI = new int[2])[0] = " ".length();
        BlockCompressedPowered.lllIllIIlllIlI[1] = (60 + 73 - 25 + 35 ^ 17 + 120 - 82 + 73);
    }
    
    @Override
    public int getWeakPower(final IBlockAccess llllllllllllIlIllIIlIllIIlIllIlI, final BlockPos llllllllllllIlIllIIlIllIIlIllIIl, final IBlockState llllllllllllIlIllIIlIllIIlIllIII, final EnumFacing llllllllllllIlIllIIlIllIIlIlIlll) {
        return BlockCompressedPowered.lllIllIIlllIlI[1];
    }
}
