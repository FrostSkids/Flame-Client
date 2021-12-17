// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.block.state.BlockState;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.util.Vec3;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.init.Blocks;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.tileentity.TileEntityPiston;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyDirection;
import net.minecraft.block.properties.PropertyEnum;

public class BlockPistonMoving extends BlockContainer
{
    private static final /* synthetic */ int[] lIlIIlllIllIll;
    public static final /* synthetic */ PropertyEnum<BlockPistonExtension.EnumPistonType> TYPE;
    public static final /* synthetic */ PropertyDirection FACING;
    
    public static TileEntity newTileEntity(final IBlockState lllllllllllllIIIlIllllIlllIllIIl, final EnumFacing lllllllllllllIIIlIllllIlllIllIII, final boolean lllllllllllllIIIlIllllIlllIlIlll, final boolean lllllllllllllIIIlIllllIlllIlIIlI) {
        return new TileEntityPiston(lllllllllllllIIIlIllllIlllIllIIl, lllllllllllllIIIlIllllIlllIllIII, lllllllllllllIIIlIllllIlllIlIlll, lllllllllllllIIIlIllllIlllIlIIlI);
    }
    
    private static boolean lllIlIIllIIIIIl(final Object lllllllllllllIIIlIllllIlIIIIIlII, final Object lllllllllllllIIIlIllllIlIIIIIIll) {
        return lllllllllllllIIIlIllllIlIIIIIlII == lllllllllllllIIIlIllllIlIIIIIIll;
    }
    
    private TileEntityPiston getTileEntity(final IBlockAccess lllllllllllllIIIlIllllIlIIlIIIlI, final BlockPos lllllllllllllIIIlIllllIlIIlIIlII) {
        final TileEntity lllllllllllllIIIlIllllIlIIlIIIll = lllllllllllllIIIlIllllIlIIlIIIlI.getTileEntity(lllllllllllllIIIlIllllIlIIlIIlII);
        TileEntityPiston tileEntityPiston;
        if (lllIlIIlIllllII((lllllllllllllIIIlIllllIlIIlIIIll instanceof TileEntityPiston) ? 1 : 0)) {
            tileEntityPiston = (TileEntityPiston)lllllllllllllIIIlIllllIlIIlIIIll;
            "".length();
            if ((0xA7 ^ 0xA3) <= "   ".length()) {
                return null;
            }
        }
        else {
            tileEntityPiston = null;
        }
        return tileEntityPiston;
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIIlIllllIllIIllIll, final Random lllllllllllllIIIlIllllIllIIllIlI, final int lllllllllllllIIIlIllllIllIIllIIl) {
        return null;
    }
    
    private static boolean lllIlIIllIIIIII(final Object lllllllllllllIIIlIllllIlIIIIlIlI, final Object lllllllllllllIIIlIllllIlIIIIlIIl) {
        return lllllllllllllIIIlIllllIlIIIIlIlI != lllllllllllllIIIlIllllIlIIIIlIIl;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockPistonMoving.lIlIIlllIllIll[0] != 0;
    }
    
    @Override
    public void dropBlockAsItemWithChance(final World lllllllllllllIIIlIllllIllIIIlIlI, final BlockPos lllllllllllllIIIlIllllIllIIlIIIl, final IBlockState lllllllllllllIIIlIllllIllIIlIIII, final float lllllllllllllIIIlIllllIllIIIllll, final int lllllllllllllIIIlIllllIllIIIlllI) {
        if (lllIlIIlIllllIl(lllllllllllllIIIlIllllIllIIIlIlI.isRemote ? 1 : 0)) {
            final TileEntityPiston lllllllllllllIIIlIllllIllIIIllIl = this.getTileEntity(lllllllllllllIIIlIllllIllIIIlIlI, lllllllllllllIIIlIllllIllIIlIIIl);
            if (lllIlIIlIllllll(lllllllllllllIIIlIllllIllIIIllIl)) {
                final IBlockState lllllllllllllIIIlIllllIllIIIllII = lllllllllllllIIIlIllllIllIIIllIl.getPistonState();
                lllllllllllllIIIlIllllIllIIIllII.getBlock().dropBlockAsItem(lllllllllllllIIIlIllllIllIIIlIlI, lllllllllllllIIIlIllllIllIIlIIIl, lllllllllllllIIIlIllllIllIIIllII, BlockPistonMoving.lIlIIlllIllIll[0]);
            }
        }
    }
    
    private static boolean lllIlIIllIIIIll(final int lllllllllllllIIIlIllllIIlllllIIl) {
        return lllllllllllllIIIlIllllIIlllllIIl > 0;
    }
    
    private static boolean lllIlIIlIlllllI(final Object lllllllllllllIIIlIllllIlIIIIIIIl) {
        return lllllllllllllIIIlIllllIlIIIIIIIl == null;
    }
    
    private static boolean lllIlIIlIllllll(final Object lllllllllllllIIIlIllllIlIIIIIlll) {
        return lllllllllllllIIIlIllllIlIIIIIlll != null;
    }
    
    private static boolean lllIlIIlIllllII(final int lllllllllllllIIIlIllllIIllllllll) {
        return lllllllllllllIIIlIllllIIllllllll != 0;
    }
    
    private static void lllIlIIlIlllIll() {
        (lIlIIlllIllIll = new int[4])[0] = ((81 + 27 + 18 + 56 ^ 128 + 49 - 60 + 43) & (0x2B ^ 0x68 ^ (0x16 ^ 0x43) ^ -" ".length()));
        BlockPistonMoving.lIlIIlllIllIll[1] = " ".length();
        BlockPistonMoving.lIlIIlllIllIll[2] = (0xA7 ^ 0xAF);
        BlockPistonMoving.lIlIIlllIllIll[3] = "  ".length();
    }
    
    public BlockPistonMoving() {
        super(Material.piston);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockPistonMoving.FACING, EnumFacing.NORTH).withProperty(BlockPistonMoving.TYPE, BlockPistonExtension.EnumPistonType.DEFAULT));
        this.setHardness(-1.0f);
        "".length();
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIIlIllllIlIlIlIlll, final BlockPos lllllllllllllIIIlIllllIlIlIlIllI) {
        final TileEntityPiston lllllllllllllIIIlIllllIlIlIlllIl = this.getTileEntity(lllllllllllllIIIlIllllIlIlIlIlll, lllllllllllllIIIlIllllIlIlIlIllI);
        if (lllIlIIlIllllll(lllllllllllllIIIlIllllIlIlIlllIl)) {
            final IBlockState lllllllllllllIIIlIllllIlIlIlllII = lllllllllllllIIIlIllllIlIlIlllIl.getPistonState();
            final Block lllllllllllllIIIlIllllIlIlIllIll = lllllllllllllIIIlIllllIlIlIlllII.getBlock();
            if (!lllIlIIllIIIIII(lllllllllllllIIIlIllllIlIlIllIll, this) || lllIlIIllIIIIIl(lllllllllllllIIIlIllllIlIlIllIll.getMaterial(), Material.air)) {
                return;
            }
            float lllllllllllllIIIlIllllIlIlIllIlI = lllllllllllllIIIlIllllIlIlIlllIl.getProgress(0.0f);
            if (lllIlIIlIllllII(lllllllllllllIIIlIllllIlIlIlllIl.isExtending() ? 1 : 0)) {
                lllllllllllllIIIlIllllIlIlIllIlI = 1.0f - lllllllllllllIIIlIllllIlIlIllIlI;
            }
            lllllllllllllIIIlIllllIlIlIllIll.setBlockBoundsBasedOnState(lllllllllllllIIIlIllllIlIlIlIlll, lllllllllllllIIIlIllllIlIlIlIllI);
            if (!lllIlIIllIIIIII(lllllllllllllIIIlIllllIlIlIllIll, Blocks.piston) || lllIlIIllIIIIIl(lllllllllllllIIIlIllllIlIlIllIll, Blocks.sticky_piston)) {
                lllllllllllllIIIlIllllIlIlIllIlI = 0.0f;
            }
            final EnumFacing lllllllllllllIIIlIllllIlIlIllIIl = lllllllllllllIIIlIllllIlIlIlllIl.getFacing();
            this.minX = lllllllllllllIIIlIllllIlIlIllIll.getBlockBoundsMinX() - lllllllllllllIIIlIllllIlIlIllIIl.getFrontOffsetX() * lllllllllllllIIIlIllllIlIlIllIlI;
            this.minY = lllllllllllllIIIlIllllIlIlIllIll.getBlockBoundsMinY() - lllllllllllllIIIlIllllIlIlIllIIl.getFrontOffsetY() * lllllllllllllIIIlIllllIlIlIllIlI;
            this.minZ = lllllllllllllIIIlIllllIlIlIllIll.getBlockBoundsMinZ() - lllllllllllllIIIlIllllIlIlIllIIl.getFrontOffsetZ() * lllllllllllllIIIlIllllIlIlIllIlI;
            this.maxX = lllllllllllllIIIlIllllIlIlIllIll.getBlockBoundsMaxX() - lllllllllllllIIIlIllllIlIlIllIIl.getFrontOffsetX() * lllllllllllllIIIlIllllIlIlIllIlI;
            this.maxY = lllllllllllllIIIlIllllIlIlIllIll.getBlockBoundsMaxY() - lllllllllllllIIIlIllllIlIlIllIIl.getFrontOffsetY() * lllllllllllllIIIlIllllIlIlIllIlI;
            this.maxZ = lllllllllllllIIIlIllllIlIlIllIll.getBlockBoundsMaxZ() - lllllllllllllIIIlIllllIlIlIllIIl.getFrontOffsetZ() * lllllllllllllIIIlIllllIlIlIllIlI;
        }
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIIlIllllIlIIIllllI, final BlockPos lllllllllllllIIIlIllllIlIIIlllIl) {
        return null;
    }
    
    public AxisAlignedBB getBoundingBox(final World lllllllllllllIIIlIllllIlIlIIIIlI, final BlockPos lllllllllllllIIIlIllllIlIlIIIIIl, final IBlockState lllllllllllllIIIlIllllIlIIllIIll, final float lllllllllllllIIIlIllllIlIIllIIlI, final EnumFacing lllllllllllllIIIlIllllIlIIlllllI) {
        if (!lllIlIIllIIIIII(lllllllllllllIIIlIllllIlIIllIIll.getBlock(), this) || !lllIlIIllIIIIII(lllllllllllllIIIlIllllIlIIllIIll.getBlock().getMaterial(), Material.air)) {
            return null;
        }
        final AxisAlignedBB lllllllllllllIIIlIllllIlIIllllIl = lllllllllllllIIIlIllllIlIIllIIll.getBlock().getCollisionBoundingBox(lllllllllllllIIIlIllllIlIlIIIIlI, lllllllllllllIIIlIllllIlIlIIIIIl, lllllllllllllIIIlIllllIlIIllIIll);
        if (lllIlIIlIlllllI(lllllllllllllIIIlIllllIlIIllllIl)) {
            return null;
        }
        double lllllllllllllIIIlIllllIlIIllllII = lllllllllllllIIIlIllllIlIIllllIl.minX;
        double lllllllllllllIIIlIllllIlIIlllIll = lllllllllllllIIIlIllllIlIIllllIl.minY;
        double lllllllllllllIIIlIllllIlIIlllIlI = lllllllllllllIIIlIllllIlIIllllIl.minZ;
        double lllllllllllllIIIlIllllIlIIlllIIl = lllllllllllllIIIlIllllIlIIllllIl.maxX;
        double lllllllllllllIIIlIllllIlIIlllIII = lllllllllllllIIIlIllllIlIIllllIl.maxY;
        double lllllllllllllIIIlIllllIlIIllIlll = lllllllllllllIIIlIllllIlIIllllIl.maxZ;
        if (lllIlIIllIIIIlI(lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetX())) {
            lllllllllllllIIIlIllllIlIIllllII -= lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetX() * lllllllllllllIIIlIllllIlIIllIIlI;
            "".length();
            if ((119 + 93 - 91 + 15 ^ 86 + 89 - 70 + 35) < 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlIllllIlIIlllIIl -= lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetX() * lllllllllllllIIIlIllllIlIIllIIlI;
        }
        if (lllIlIIllIIIIlI(lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetY())) {
            lllllllllllllIIIlIllllIlIIlllIll -= lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetY() * lllllllllllllIIIlIllllIlIIllIIlI;
            "".length();
            if (((96 + 6 - 92 + 156 ^ 153 + 14 - 111 + 98) & (63 + 70 - 123 + 154 ^ 83 + 129 - 61 + 1 ^ -" ".length())) < ((135 + 37 + 44 + 6 ^ 68 + 4 - 46 + 107) & (0x29 ^ 0x4C ^ (0x4 ^ 0x3A) ^ -" ".length()))) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlIllllIlIIlllIII -= lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetY() * lllllllllllllIIIlIllllIlIIllIIlI;
        }
        if (lllIlIIllIIIIlI(lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetZ())) {
            lllllllllllllIIIlIllllIlIIlllIlI -= lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetZ() * lllllllllllllIIIlIllllIlIIllIIlI;
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            lllllllllllllIIIlIllllIlIIllIlll -= lllllllllllllIIIlIllllIlIIlllllI.getFrontOffsetZ() * lllllllllllllIIIlIllllIlIIllIIlI;
        }
        return new AxisAlignedBB(lllllllllllllIIIlIllllIlIIllllII, lllllllllllllIIIlIllllIlIIlllIll, lllllllllllllIIIlIllllIlIIlllIlI, lllllllllllllIIIlIllllIlIIlllIIl, lllllllllllllIIIlIllllIlIIlllIII, lllllllllllllIIIlIllllIlIIllIlll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIIlIllllIlIIIlIIIl) {
        int lllllllllllllIIIlIllllIlIIIlIIlI = BlockPistonMoving.lIlIIlllIllIll[0];
        lllllllllllllIIIlIllllIlIIIlIIlI |= lllllllllllllIIIlIllllIlIIIlIIIl.getValue((IProperty<EnumFacing>)BlockPistonMoving.FACING).getIndex();
        if (lllIlIIllIIIIIl(lllllllllllllIIIlIllllIlIIIlIIIl.getValue(BlockPistonMoving.TYPE), BlockPistonExtension.EnumPistonType.STICKY)) {
            lllllllllllllIIIlIllllIlIIIlIIlI |= BlockPistonMoving.lIlIIlllIllIll[2];
        }
        return lllllllllllllIIIlIllllIlIIIlIIlI;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIIlIllllIllIIllllI, final BlockPos lllllllllllllIIIlIllllIllIlIIlIl, final IBlockState lllllllllllllIIIlIllllIllIlIIlII, final EntityPlayer lllllllllllllIIIlIllllIllIlIIIll, final EnumFacing lllllllllllllIIIlIllllIllIlIIIlI, final float lllllllllllllIIIlIllllIllIlIIIIl, final float lllllllllllllIIIlIllllIllIlIIIII, final float lllllllllllllIIIlIllllIllIIlllll) {
        if (lllIlIIlIllllIl(lllllllllllllIIIlIllllIllIIllllI.isRemote ? 1 : 0) && lllIlIIlIlllllI(lllllllllllllIIIlIllllIllIIllllI.getTileEntity(lllllllllllllIIIlIllllIllIlIIlIl))) {
            lllllllllllllIIIlIllllIllIIllllI.setBlockToAir(lllllllllllllIIIlIllllIllIlIIlIl);
            "".length();
            return BlockPistonMoving.lIlIIlllIllIll[1] != 0;
        }
        return BlockPistonMoving.lIlIIlllIllIll[0] != 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockPistonMoving.lIlIIlllIllIll[0] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIIlIllllIlIIIllIIl) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockPistonMoving.FACING, BlockPistonExtension.getFacing(lllllllllllllIIIlIllllIlIIIllIIl));
        final PropertyEnum<BlockPistonExtension.EnumPistonType> type = BlockPistonMoving.TYPE;
        BlockPistonExtension.EnumPistonType enumPistonType;
        if (lllIlIIllIIIIll(lllllllllllllIIIlIllllIlIIIllIIl & BlockPistonMoving.lIlIIlllIllIll[2])) {
            enumPistonType = BlockPistonExtension.EnumPistonType.STICKY;
            "".length();
            if (" ".length() != " ".length()) {
                return null;
            }
        }
        else {
            enumPistonType = BlockPistonExtension.EnumPistonType.DEFAULT;
        }
        return withProperty.withProperty((IProperty<Comparable>)type, enumPistonType);
    }
    
    private static boolean lllIlIIllIIIIlI(final int lllllllllllllIIIlIllllIIlllllIll) {
        return lllllllllllllIIIlIllllIIlllllIll < 0;
    }
    
    static {
        lllIlIIlIlllIll();
        FACING = BlockPistonExtension.FACING;
        TYPE = BlockPistonExtension.TYPE;
    }
    
    @Override
    public boolean canPlaceBlockOnSide(final World lllllllllllllIIIlIllllIllIlllllI, final BlockPos lllllllllllllIIIlIllllIllIllllIl, final EnumFacing lllllllllllllIIIlIllllIllIllllII) {
        return BlockPistonMoving.lIlIIlllIllIll[0] != 0;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(final World lllllllllllllIIIlIllllIllIllIIII, final BlockPos lllllllllllllIIIlIllllIllIlIllll, final IBlockState lllllllllllllIIIlIllllIllIlIlllI) {
        final BlockPos lllllllllllllIIIlIllllIllIllIIlI = lllllllllllllIIIlIllllIllIlIllll.offset(lllllllllllllIIIlIllllIllIlIlllI.getValue((IProperty<EnumFacing>)BlockPistonMoving.FACING).getOpposite());
        final IBlockState lllllllllllllIIIlIllllIllIllIIIl = lllllllllllllIIIlIllllIllIllIIII.getBlockState(lllllllllllllIIIlIllllIllIllIIlI);
        if (lllIlIIlIllllII((lllllllllllllIIIlIllllIllIllIIIl.getBlock() instanceof BlockPistonBase) ? 1 : 0) && lllIlIIlIllllII(((boolean)lllllllllllllIIIlIllllIllIllIIIl.getValue((IProperty<Boolean>)BlockPistonBase.EXTENDED)) ? 1 : 0)) {
            lllllllllllllIIIlIllllIllIllIIII.setBlockToAir(lllllllllllllIIIlIllllIllIllIIlI);
            "".length();
        }
    }
    
    @Override
    public MovingObjectPosition collisionRayTrace(final World lllllllllllllIIIlIllllIllIIIIlIl, final BlockPos lllllllllllllIIIlIllllIllIIIIlII, final Vec3 lllllllllllllIIIlIllllIllIIIIIll, final Vec3 lllllllllllllIIIlIllllIllIIIIIlI) {
        return null;
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIIlIllllIlllIIIIIl, final BlockPos lllllllllllllIIIlIllllIlllIIIIII) {
        return BlockPistonMoving.lIlIIlllIllIll[0] != 0;
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIIlIllllIlllIIlIll, final BlockPos lllllllllllllIIIlIllllIlllIIIlIl, final IBlockState lllllllllllllIIIlIllllIlllIIlIIl) {
        final TileEntity lllllllllllllIIIlIllllIlllIIlIII = lllllllllllllIIIlIllllIlllIIlIll.getTileEntity(lllllllllllllIIIlIllllIlllIIIlIl);
        if (lllIlIIlIllllII((lllllllllllllIIIlIllllIlllIIlIII instanceof TileEntityPiston) ? 1 : 0)) {
            ((TileEntityPiston)lllllllllllllIIIlIllllIlllIIlIII).clearPistonTileEntity();
            "".length();
            if ("  ".length() == (0x90 ^ 0x94)) {
                return;
            }
        }
        else {
            super.breakBlock(lllllllllllllIIIlIllllIlllIIlIll, lllllllllllllIIIlIllllIlllIIIlIl, lllllllllllllIIIlIllllIlllIIlIIl);
        }
    }
    
    private static boolean lllIlIIlIllllIl(final int lllllllllllllIIIlIllllIIllllllIl) {
        return lllllllllllllIIIlIllllIIllllllIl == 0;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIlIllllIlIllllIlI, final BlockPos lllllllllllllIIIlIllllIlIllllIIl, final IBlockState lllllllllllllIIIlIllllIlIlllllII, final Block lllllllllllllIIIlIllllIlIllllIll) {
        if (lllIlIIlIllllIl(lllllllllllllIIIlIllllIlIllllIlI.isRemote ? 1 : 0)) {
            lllllllllllllIIIlIllllIlIllllIlI.getTileEntity(lllllllllllllIIIlIllllIlIllllIIl);
            "".length();
        }
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIIlIllllIlllIlllll, final int lllllllllllllIIIlIllllIlllIllllI) {
        return null;
    }
    
    @Override
    public AxisAlignedBB getCollisionBoundingBox(final World lllllllllllllIIIlIllllIlIllIllII, final BlockPos lllllllllllllIIIlIllllIlIlllIIIl, final IBlockState lllllllllllllIIIlIllllIlIlllIIII) {
        final TileEntityPiston lllllllllllllIIIlIllllIlIllIllll = this.getTileEntity(lllllllllllllIIIlIllllIlIllIllII, lllllllllllllIIIlIllllIlIlllIIIl);
        if (lllIlIIlIlllllI(lllllllllllllIIIlIllllIlIllIllll)) {
            return null;
        }
        float lllllllllllllIIIlIllllIlIllIlllI = lllllllllllllIIIlIllllIlIllIllll.getProgress(0.0f);
        if (lllIlIIlIllllII(lllllllllllllIIIlIllllIlIllIllll.isExtending() ? 1 : 0)) {
            lllllllllllllIIIlIllllIlIllIlllI = 1.0f - lllllllllllllIIIlIllllIlIllIlllI;
        }
        return this.getBoundingBox(lllllllllllllIIIlIllllIlIllIllII, lllllllllllllIIIlIllllIlIlllIIIl, lllllllllllllIIIlIllllIlIllIllll.getPistonState(), lllllllllllllIIIlIllllIlIllIlllI, lllllllllllllIIIlIllllIlIllIllll.getFacing());
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockPistonMoving.lIlIIlllIllIll[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonMoving.lIlIIlllIllIll[0]] = BlockPistonMoving.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockPistonMoving.lIlIIlllIllIll[1]] = BlockPistonMoving.TYPE;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
}
