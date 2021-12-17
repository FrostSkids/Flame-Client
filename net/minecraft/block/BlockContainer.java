// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.MapColor;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.material.Material;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public abstract class BlockContainer extends Block implements ITileEntityProvider
{
    private static final /* synthetic */ int[] lIIlIIIllIlIlI;
    
    private static boolean llIIlIllIllllII(final Object lllllllllllllIIlllIIlIIIlIIIlIlI, final Object lllllllllllllIIlllIIlIIIlIIIlIIl) {
        return lllllllllllllIIlllIIlIIIlIIIlIlI == lllllllllllllIIlllIIlIIIlIIIlIIl;
    }
    
    private static void llIIlIllIlllIll() {
        (lIIlIIIllIlIlI = new int[3])[0] = " ".length();
        BlockContainer.lIIlIIIllIlIlI[1] = ((41 + 157 - 58 + 19 ^ 11 + 120 - 3 + 24) & (0x33 ^ 0x1D ^ (0x63 ^ 0x4A) ^ -" ".length()));
        BlockContainer.lIIlIIIllIlIlI[2] = -" ".length();
    }
    
    protected boolean func_181086_a(final World lllllllllllllIIlllIIlIIIlllIIIll, final BlockPos lllllllllllllIIlllIIlIIIllIllllI, final EnumFacing lllllllllllllIIlllIIlIIIllIlllII) {
        if (llIIlIllIllllII(lllllllllllllIIlllIIlIIIlllIIIll.getBlockState(lllllllllllllIIlllIIlIIIllIllllI.offset(lllllllllllllIIlllIIlIIIllIlllII)).getBlock().getMaterial(), Material.cactus)) {
            return BlockContainer.lIIlIIIllIlIlI[0] != 0;
        }
        return BlockContainer.lIIlIIIllIlIlI[1] != 0;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIlllIIlIIIlIllllII, final BlockPos lllllllllllllIIlllIIlIIIlIlllIlI, final IBlockState lllllllllllllIIlllIIlIIIlIlllIII) {
        super.breakBlock(lllllllllllllIIlllIIlIIIlIllllII, lllllllllllllIIlllIIlIIIlIlllIlI, lllllllllllllIIlllIIlIIIlIlllIII);
        lllllllllllllIIlllIIlIIIlIllllII.removeTileEntity(lllllllllllllIIlllIIlIIIlIlllIlI);
    }
    
    private static boolean llIIlIllIllllIl(final int lllllllllllllIIlllIIlIIIlIIIIIIl) {
        return lllllllllllllIIlllIIlIIIlIIIIIIl == 0;
    }
    
    private static boolean llIIlIllIllllll(final Object lllllllllllllIIlllIIlIIIlIIIIllI) {
        return lllllllllllllIIlllIIlIIIlIIIIllI == null;
    }
    
    @Override
    public boolean onBlockEventReceived(final World lllllllllllllIIlllIIlIIIlIlIlIIl, final BlockPos lllllllllllllIIlllIIlIIIlIlIIllI, final IBlockState lllllllllllllIIlllIIlIIIlIlIIlII, final int lllllllllllllIIlllIIlIIIlIIlIlIl, final int lllllllllllllIIlllIIlIIIlIIlIIll) {
        super.onBlockEventReceived(lllllllllllllIIlllIIlIIIlIlIlIIl, lllllllllllllIIlllIIlIIIlIlIIllI, lllllllllllllIIlllIIlIIIlIlIIlII, lllllllllllllIIlllIIlIIIlIIlIlIl, lllllllllllllIIlllIIlIIIlIIlIIll);
        "".length();
        final TileEntity lllllllllllllIIlllIIlIIIlIIlllll = lllllllllllllIIlllIIlIIIlIlIlIIl.getTileEntity(lllllllllllllIIlllIIlIIIlIlIIllI);
        int receiveClientEvent;
        if (llIIlIllIllllll(lllllllllllllIIlllIIlIIIlIIlllll)) {
            receiveClientEvent = BlockContainer.lIIlIIIllIlIlI[1];
            "".length();
            if (((0x94 ^ 0xA1) & ~(0x98 ^ 0xAD)) > (0xA ^ 0xE)) {
                return ((0x99 ^ 0x81) & ~(0x38 ^ 0x20)) != 0x0;
            }
        }
        else {
            receiveClientEvent = (lllllllllllllIIlllIIlIIIlIIlllll.receiveClientEvent(lllllllllllllIIlllIIlIIIlIIlIlIl, lllllllllllllIIlllIIlIIIlIIlIIll) ? 1 : 0);
        }
        return receiveClientEvent != 0;
    }
    
    protected BlockContainer(final Material lllllllllllllIIlllIIlIIIlllIllII, final MapColor lllllllllllllIIlllIIlIIIlllIlIll) {
        super(lllllllllllllIIlllIIlIIIlllIllII, lllllllllllllIIlllIIlIIIlllIlIll);
        this.isBlockContainer = (BlockContainer.lIIlIIIllIlIlI[0] != 0);
    }
    
    protected BlockContainer(final Material lllllllllllllIIlllIIlIIIllllIIIl) {
        this(lllllllllllllIIlllIIlIIIllllIIIl, lllllllllllllIIlllIIlIIIllllIIIl.getMaterialMapColor());
    }
    
    static {
        llIIlIllIlllIll();
    }
    
    @Override
    public int getRenderType() {
        return BlockContainer.lIIlIIIllIlIlI[2];
    }
    
    protected boolean func_181087_e(final World lllllllllllllIIlllIIlIIIllIlIllI, final BlockPos lllllllllllllIIlllIIlIIIllIlIlIl) {
        if (llIIlIllIllllIl(this.func_181086_a(lllllllllllllIIlllIIlIIIllIlIllI, lllllllllllllIIlllIIlIIIllIlIlIl, EnumFacing.NORTH) ? 1 : 0) && llIIlIllIllllIl(this.func_181086_a(lllllllllllllIIlllIIlIIIllIlIllI, lllllllllllllIIlllIIlIIIllIlIlIl, EnumFacing.SOUTH) ? 1 : 0) && llIIlIllIllllIl(this.func_181086_a(lllllllllllllIIlllIIlIIIllIlIllI, lllllllllllllIIlllIIlIIIllIlIlIl, EnumFacing.WEST) ? 1 : 0) && llIIlIllIllllIl(this.func_181086_a(lllllllllllllIIlllIIlIIIllIlIllI, lllllllllllllIIlllIIlIIIllIlIlIl, EnumFacing.EAST) ? 1 : 0)) {
            return BlockContainer.lIIlIIIllIlIlI[1] != 0;
        }
        return BlockContainer.lIIlIIIllIlIlI[0] != 0;
    }
}
