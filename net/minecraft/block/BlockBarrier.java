// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockBarrier extends Block
{
    private static final /* synthetic */ int[] llIlllllIlIllI;
    
    @Override
    public int getRenderType() {
        return BlockBarrier.llIlllllIlIllI[1];
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World llllllllllllIllIIIlIlllIlIlllIIl, final BlockPos llllllllllllIllIIIlIlllIlIlllIII, final IBlockState llllllllllllIllIIIlIlllIlIllIlll, final float llllllllllllIllIIIlIlllIlIllIllI, final int llllllllllllIllIIIlIlllIlIllIlIl) {
    }
    
    private static void lIIllIllIIlllllI() {
        (llIlllllIlIllI = new int[3])[0] = " ".length();
        BlockBarrier.llIlllllIlIllI[1] = -" ".length();
        BlockBarrier.llIlllllIlIllI[2] = ((163 + 40 - 50 + 14 ^ 148 + 58 - 54 + 26) & (4 + 20 - 9 + 156 ^ 165 + 104 - 266 + 187 ^ -" ".length()));
    }
    
    protected BlockBarrier() {
        super(Material.barrier);
        this.setBlockUnbreakable();
        "".length();
        this.setResistance(6000001.0f);
        "".length();
        this.disableStats();
        "".length();
        this.translucent = (BlockBarrier.llIlllllIlIllI[0] != 0);
    }
    
    @Override
    public float getAmbientOcclusionLightValue() {
        return 1.0f;
    }
    
    static {
        lIIllIllIIlllllI();
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBarrier.llIlllllIlIllI[2] != 0;
    }
}
