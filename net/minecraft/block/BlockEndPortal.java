// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumParticleTypes;
import java.util.Random;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.MapColor;
import net.minecraft.tileentity.TileEntityEndPortal;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class BlockEndPortal extends BlockContainer
{
    private static final /* synthetic */ int[] lIIIlIllllIllI;
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIlIIIIlIIlIlIIlllIl, final BlockPos lllllllllllllIlIIIIlIIlIlIIlllII, final IBlockState lllllllllllllIlIIIIlIIlIlIIllIll, final AxisAlignedBB lllllllllllllIlIIIIlIIlIlIIllIlI, final List<AxisAlignedBB> lllllllllllllIlIIIIlIIlIlIIllIIl, final Entity lllllllllllllIlIIIIlIIlIlIIllIII) {
    }
    
    private static boolean llIIIIlIIIlllll(final int lllllllllllllIlIIIIlIIlIIllIIIIl) {
        return lllllllllllllIlIIIIlIIlIIllIIIIl == 0;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIlIIIIlIIlIIllIllII, final BlockPos lllllllllllllIlIIIIlIIlIIllIlIll) {
        return null;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockEndPortal.lIIIlIllllIllI[0] != 0;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIlIIIIlIIlIlIllIlII, final int lllllllllllllIlIIIIlIIlIlIllIIll) {
        return new TileEntityEndPortal();
    }
    
    @Override
    public MapColor getMapColor(final IBlockState lllllllllllllIlIIIIlIIlIIllIlIIl) {
        return MapColor.blackColor;
    }
    
    private static void llIIIIlIIIlllII() {
        (lIIIlIllllIllI = new int[2])[0] = ((0x4 ^ 0x41 ^ (0x3 ^ 0x76)) & (0x26 ^ 0x2E ^ (0x44 ^ 0x7C) ^ -" ".length()));
        BlockEndPortal.lIIIlIllllIllI[1] = " ".length();
    }
    
    private static boolean llIIIIlIIIllllI(final Object lllllllllllllIlIIIIlIIlIIllIIIll) {
        return lllllllllllllIlIIIIlIIlIIllIIIll == null;
    }
    
    static {
        llIIIIlIIIlllII();
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIlIIIIlIIlIlIlIIlIl, final BlockPos lllllllllllllIlIIIIlIIlIlIlIIlII, final EnumFacing lllllllllllllIlIIIIlIIlIlIIlllll) {
        int shouldSideBeRendered;
        if (llIIIIlIIIlllIl(lllllllllllllIlIIIIlIIlIlIIlllll, EnumFacing.DOWN)) {
            shouldSideBeRendered = (super.shouldSideBeRendered(lllllllllllllIlIIIIlIIlIlIlIIlIl, lllllllllllllIlIIIIlIIlIlIlIIlII, lllllllllllllIlIIIIlIIlIlIIlllll) ? 1 : 0);
            "".length();
            if (" ".length() != " ".length()) {
                return ((0xA ^ 0x47 ^ (0x51 ^ 0x18)) & (0x61 ^ 0x4F ^ (0xB8 ^ 0x92) ^ -" ".length())) != 0x0;
            }
        }
        else {
            shouldSideBeRendered = BlockEndPortal.lIIIlIllllIllI[0];
        }
        return shouldSideBeRendered != 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockEndPortal.lIIIlIllllIllI[0] != 0;
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIlIIIIlIIlIIlllIllI, final BlockPos lllllllllllllIlIIIIlIIlIIlllllll, final IBlockState lllllllllllllIlIIIIlIIlIIllllllI, final Random lllllllllllllIlIIIIlIIlIIlllIlII) {
        final double lllllllllllllIlIIIIlIIlIIlllllII = lllllllllllllIlIIIIlIIlIIlllllll.getX() + lllllllllllllIlIIIIlIIlIIlllIlII.nextFloat();
        final double lllllllllllllIlIIIIlIIlIIllllIll = lllllllllllllIlIIIIlIIlIIlllllll.getY() + 0.8f;
        final double lllllllllllllIlIIIIlIIlIIllllIlI = lllllllllllllIlIIIIlIIlIIlllllll.getZ() + lllllllllllllIlIIIIlIIlIIlllIlII.nextFloat();
        final double lllllllllllllIlIIIIlIIlIIllllIIl = 0.0;
        final double lllllllllllllIlIIIIlIIlIIllllIII = 0.0;
        final double lllllllllllllIlIIIIlIIlIIlllIlll = 0.0;
        lllllllllllllIlIIIIlIIlIIlllIllI.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIlIIIIlIIlIIlllllII, lllllllllllllIlIIIIlIIlIIllllIll, lllllllllllllIlIIIIlIIlIIllllIlI, lllllllllllllIlIIIIlIIlIIllllIIl, lllllllllllllIlIIIIlIIlIIllllIII, lllllllllllllIlIIIIlIIlIIlllIlll, new int[BlockEndPortal.lIIIlIllllIllI[0]]);
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World lllllllllllllIlIIIIlIIlIlIIlIIII, final BlockPos lllllllllllllIlIIIIlIIlIlIIIllll, final IBlockState lllllllllllllIlIIIIlIIlIlIIIlllI, final Entity lllllllllllllIlIIIIlIIlIlIIIlIll) {
        if (llIIIIlIIIllllI(lllllllllllllIlIIIIlIIlIlIIIlIll.ridingEntity) && llIIIIlIIIllllI(lllllllllllllIlIIIIlIIlIlIIIlIll.riddenByEntity) && llIIIIlIIIlllll(lllllllllllllIlIIIIlIIlIlIIlIIII.isRemote ? 1 : 0)) {
            lllllllllllllIlIIIIlIIlIlIIIlIll.travelToDimension(BlockEndPortal.lIIIlIllllIllI[1]);
        }
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIlIIIIlIIlIlIlIllll, final BlockPos lllllllllllllIlIIIIlIIlIlIlIlllI) {
        final float lllllllllllllIlIIIIlIIlIlIlIllIl = 0.0625f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, lllllllllllllIlIIIIlIIlIlIlIllIl, 1.0f);
    }
    
    @Override
    public int quantityDropped(final Random lllllllllllllIlIIIIlIIlIlIIlIlII) {
        return BlockEndPortal.lIIIlIllllIllI[0];
    }
    
    private static boolean llIIIIlIIIlllIl(final Object lllllllllllllIlIIIIlIIlIIllIIllI, final Object lllllllllllllIlIIIIlIIlIIllIIlIl) {
        return lllllllllllllIlIIIIlIIlIIllIIllI == lllllllllllllIlIIIIlIIlIIllIIlIl;
    }
    
    protected BlockEndPortal(final Material lllllllllllllIlIIIIlIIlIlIllIllI) {
        super(lllllllllllllIlIIIIlIIlIlIllIllI);
        this.setLightLevel(1.0f);
        "".length();
    }
}
