// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.material.Material;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntitySign;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.IBlockAccess;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockSign extends BlockContainer
{
    private static final /* synthetic */ int[] lIIIIlllIlIIll;
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIlIIlIIIIIIlIIIlIll, final BlockPos lllllllllllllIlIIlIIIIIIlIIIIlll) {
        if (lIllllIIlIlIlll(this.func_181087_e(lllllllllllllIlIIlIIIIIIlIIIlIll, lllllllllllllIlIIlIIIIIIlIIIIlll) ? 1 : 0) && lIllllIIlIlIllI(super.canPlaceBlockAt(lllllllllllllIlIIlIIIIIIlIIIlIll, lllllllllllllIlIIlIIIIIIlIIIIlll) ? 1 : 0)) {
            return BlockSign.lIIIIlllIlIIll[1] != 0;
        }
        return BlockSign.lIIIIlllIlIIll[0] != 0;
    }
    
    @Override
    public boolean func_181623_g() {
        return BlockSign.lIIIIlllIlIIll[1] != 0;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIlIIlIIIIIIlIllllIl, final BlockPos lllllllllllllIlIIlIIIIIIlIllllII, final IBlockState lllllllllllllIlIIlIIIIIIlIlllIll) {
        return null;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIIlIIIIIIlIlIIIll, final BlockPos lllllllllllllIlIIlIIIIIIlIlIIIlI) {
        return Items.sign;
    }
    
    @Override
    public boolean isPassable(final IBlockAccess lllllllllllllIlIIlIIIIIIlIlIllll, final BlockPos lllllllllllllIlIIlIIIIIIlIlIlllI) {
        return BlockSign.lIIIIlllIlIIll[1] != 0;
    }
    
    static {
        lIllllIIlIlIlIl();
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIlIIlIIIIIIlIIlIIll, final BlockPos lllllllllllllIlIIlIIIIIIlIIlIIlI, final IBlockState lllllllllllllIlIIlIIIIIIlIIllIlI, final EntityPlayer lllllllllllllIlIIlIIIIIIlIIlIIIl, final EnumFacing lllllllllllllIlIIlIIIIIIlIIllIII, final float lllllllllllllIlIIlIIIIIIlIIlIlll, final float lllllllllllllIlIIlIIIIIIlIIlIllI, final float lllllllllllllIlIIlIIIIIIlIIlIlIl) {
        if (lIllllIIlIlIllI(lllllllllllllIlIIlIIIIIIlIIlIIll.isRemote ? 1 : 0)) {
            return BlockSign.lIIIIlllIlIIll[1] != 0;
        }
        final TileEntity lllllllllllllIlIIlIIIIIIlIIlIlII = lllllllllllllIlIIlIIIIIIlIIlIIll.getTileEntity(lllllllllllllIlIIlIIIIIIlIIlIIlI);
        int executeCommand;
        if (lIllllIIlIlIllI((lllllllllllllIlIIlIIIIIIlIIlIlII instanceof TileEntitySign) ? 1 : 0)) {
            executeCommand = (((TileEntitySign)lllllllllllllIlIIlIIIIIIlIIlIlII).executeCommand(lllllllllllllIlIIlIIIIIIlIIlIIIl) ? 1 : 0);
            "".length();
            if (null != null) {
                return ((88 + 141 - 81 + 88 ^ 98 + 34 - 101 + 131) & (16 + 101 + 119 + 15 ^ 140 + 88 - 48 + 1 ^ -" ".length())) != 0x0;
            }
        }
        else {
            executeCommand = BlockSign.lIIIIlllIlIIll[0];
        }
        return executeCommand != 0;
    }
    
    private static boolean lIllllIIlIlIlll(final int lllllllllllllIlIIlIIIIIIlIIIIIll) {
        return lllllllllllllIlIIlIIIIIIlIIIIIll == 0;
    }
    
    protected BlockSign() {
        super(Material.wood);
        final float lllllllllllllIlIIlIIIIIIllIIIIll = 0.25f;
        final float lllllllllllllIlIIlIIIIIIllIIIIlI = 1.0f;
        this.setBlockBounds(0.5f - lllllllllllllIlIIlIIIIIIllIIIIll, 0.0f, 0.5f - lllllllllllllIlIIlIIIIIIllIIIIll, 0.5f + lllllllllllllIlIIlIIIIIIllIIIIll, lllllllllllllIlIIlIIIIIIllIIIIlI, 0.5f + lllllllllllllIlIIlIIIIIIllIIIIll);
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIlIIlIIIIIIlIlIlIlI, final int lllllllllllllIlIIlIIIIIIlIlIlIIl) {
        return new TileEntitySign();
    }
    
    @Override
    public boolean isFullCube() {
        return BlockSign.lIIIIlllIlIIll[0] != 0;
    }
    
    private static void lIllllIIlIlIlIl() {
        (lIIIIlllIlIIll = new int[2])[0] = ((0x3D ^ 0x4) & ~(0x7C ^ 0x45));
        BlockSign.lIIIIlllIlIIll[1] = " ".length();
    }
    
    @Override
    public AxisAlignedBB getSelectedBoundingBox(final World lllllllllllllIlIIlIIIIIIlIllIIll, final BlockPos lllllllllllllIlIIlIIIIIIlIllIIlI) {
        this.setBlockBoundsBasedOnState(lllllllllllllIlIIlIIIIIIlIllIIll, lllllllllllllIlIIlIIIIIIlIllIIlI);
        return super.getSelectedBoundingBox(lllllllllllllIlIIlIIIIIIlIllIIll, lllllllllllllIlIIlIIIIIIlIllIIlI);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockSign.lIIIIlllIlIIll[0] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIlIIlIIIIIIlIlIIlll, final Random lllllllllllllIlIIlIIIIIIlIlIIllI, final int lllllllllllllIlIIlIIIIIIlIlIIlIl) {
        return Items.sign;
    }
    
    private static boolean lIllllIIlIlIllI(final int lllllllllllllIlIIlIIIIIIlIIIIlIl) {
        return lllllllllllllIlIIlIIIIIIlIIIIlIl != 0;
    }
}
