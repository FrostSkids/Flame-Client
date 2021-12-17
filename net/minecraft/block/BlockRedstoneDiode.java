// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.material.Material;
import java.util.Random;
import net.minecraft.world.World;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.IBlockAccess;

public abstract class BlockRedstoneDiode extends BlockDirectional
{
    private static final /* synthetic */ int[] lIlIIllllIllll;
    protected final /* synthetic */ boolean isRepeaterPowered;
    
    public boolean isLocked(final IBlockAccess lllllllllllllIIIlIllIlllIIlIllII, final BlockPos lllllllllllllIIIlIllIlllIIlIlIll, final IBlockState lllllllllllllIIIlIllIlllIIlIlIlI) {
        return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
    }
    
    protected int getActiveSignal(final IBlockAccess lllllllllllllIIIlIllIllIlIIIlIll, final BlockPos lllllllllllllIIIlIllIllIlIIIlIlI, final IBlockState lllllllllllllIIIlIllIllIlIIIlIIl) {
        return BlockRedstoneDiode.lIlIIllllIllll[6];
    }
    
    @Override
    public int getStrongPower(final IBlockAccess lllllllllllllIIIlIllIlllIllIlIII, final BlockPos lllllllllllllIIIlIllIlllIllIIlll, final IBlockState lllllllllllllIIIlIllIlllIllIIllI, final EnumFacing lllllllllllllIIIlIllIlllIllIIlIl) {
        return this.getWeakPower(lllllllllllllIIIlIllIlllIllIlIII, lllllllllllllIIIlIllIlllIllIIlll, lllllllllllllIIIlIllIlllIllIIllI, lllllllllllllIIIlIllIlllIllIIlIl);
    }
    
    public static boolean isRedstoneRepeaterBlockID(final Block lllllllllllllIIIlIllIllIlIIIIllI) {
        if (lllIlIlIIIlIIIl(Blocks.unpowered_repeater.isAssociated(lllllllllllllIIIlIllIllIlIIIIllI) ? 1 : 0) && lllIlIlIIIlIIIl(Blocks.unpowered_comparator.isAssociated(lllllllllllllIIIlIllIllIlIIIIllI) ? 1 : 0)) {
            return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
        }
        return BlockRedstoneDiode.lIlIIllllIllll[3] != 0;
    }
    
    private static boolean lllIlIlIIIlIIIl(final int lllllllllllllIIIlIllIlIlIlllIllI) {
        return lllllllllllllIIIlIllIlIlIlllIllI == 0;
    }
    
    protected abstract int getDelay(final IBlockState p0);
    
    @Override
    public void updateTick(final World lllllllllllllIIIlIllIllllIIIIIIl, final BlockPos lllllllllllllIIIlIllIllllIIIIllI, final IBlockState lllllllllllllIIIlIllIlllIlllllll, final Random lllllllllllllIIIlIllIllllIIIIlII) {
        if (lllIlIlIIIlIIIl(this.isLocked(lllllllllllllIIIlIllIllllIIIIIIl, lllllllllllllIIIlIllIllllIIIIllI, lllllllllllllIIIlIllIlllIlllllll) ? 1 : 0)) {
            final boolean lllllllllllllIIIlIllIllllIIIIIll = this.shouldBePowered(lllllllllllllIIIlIllIllllIIIIIIl, lllllllllllllIIIlIllIllllIIIIllI, lllllllllllllIIIlIllIlllIlllllll);
            if (lllIlIlIIIlIIII(this.isRepeaterPowered ? 1 : 0) && lllIlIlIIIlIIIl(lllllllllllllIIIlIllIllllIIIIIll ? 1 : 0)) {
                lllllllllllllIIIlIllIllllIIIIIIl.setBlockState(lllllllllllllIIIlIllIllllIIIIllI, this.getUnpoweredState(lllllllllllllIIIlIllIlllIlllllll), BlockRedstoneDiode.lIlIIllllIllll[1]);
                "".length();
                "".length();
                if (((0x4D ^ 0x42) & ~(0xAC ^ 0xA3)) < 0) {
                    return;
                }
            }
            else if (lllIlIlIIIlIIIl(this.isRepeaterPowered ? 1 : 0)) {
                lllllllllllllIIIlIllIllllIIIIIIl.setBlockState(lllllllllllllIIIlIllIllllIIIIllI, this.getPoweredState(lllllllllllllIIIlIllIlllIlllllll), BlockRedstoneDiode.lIlIIllllIllll[1]);
                "".length();
                if (lllIlIlIIIlIIIl(lllllllllllllIIIlIllIllllIIIIIll ? 1 : 0)) {
                    lllllllllllllIIIlIllIllllIIIIIIl.updateBlockTick(lllllllllllllIIIlIllIllllIIIIllI, this.getPoweredState(lllllllllllllIIIlIllIlllIlllllll).getBlock(), this.getTickDelay(lllllllllllllIIIlIllIlllIlllllll), BlockRedstoneDiode.lIlIIllllIllll[2]);
                }
            }
        }
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIIlIllIlllIllllIll, final BlockPos lllllllllllllIIIlIllIlllIllllIlI, final EnumFacing lllllllllllllIIIlIllIlllIllllIIl) {
        if (lllIlIlIIIlIIlI(lllllllllllllIIIlIllIlllIllllIIl.getAxis(), EnumFacing.Axis.Y)) {
            return BlockRedstoneDiode.lIlIIllllIllll[3] != 0;
        }
        return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
    }
    
    protected BlockRedstoneDiode(final boolean lllllllllllllIIIlIllIllllIlIIlII) {
        super(Material.circuits);
        this.isRepeaterPowered = lllllllllllllIIIlIllIllllIlIIlII;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
    }
    
    private static boolean lllIlIlIIIlIlII(final int lllllllllllllIIIlIllIllIIllIIIII, final int lllllllllllllIIIlIllIllIIlIlllll) {
        return lllllllllllllIIIlIllIllIIllIIIII >= lllllllllllllIIIlIllIllIIlIlllll;
    }
    
    @Override
    public void randomTick(final World lllllllllllllIIIlIllIllllIIlIIIl, final BlockPos lllllllllllllIIIlIllIllllIIlIIII, final IBlockState lllllllllllllIIIlIllIllllIIIllll, final Random lllllllllllllIIIlIllIllllIIIlllI) {
    }
    
    private static boolean lllIlIlIIIlIIII(final int lllllllllllllIIIlIllIlIlIllllIII) {
        return lllllllllllllIIIlIllIlIlIllllIII != 0;
    }
    
    protected boolean isPowered(final IBlockState lllllllllllllIIIlIllIlllIlllIlIl) {
        return this.isRepeaterPowered;
    }
    
    @Override
    public boolean canProvidePower() {
        return BlockRedstoneDiode.lIlIIllllIllll[3] != 0;
    }
    
    protected abstract IBlockState getUnpoweredState(final IBlockState p0);
    
    public boolean isAssociated(final Block lllllllllllllIIIlIllIllIlIIIIIlI) {
        if (lllIlIlIIIlIIlI(lllllllllllllIIIlIllIllIlIIIIIlI, this.getPoweredState(this.getDefaultState()).getBlock()) && lllIlIlIIIlIIlI(lllllllllllllIIIlIllIllIlIIIIIlI, this.getUnpoweredState(this.getDefaultState()).getBlock())) {
            return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
        }
        return BlockRedstoneDiode.lIlIIllllIllll[3] != 0;
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIIlIllIllIlIlllIll, final BlockPos lllllllllllllIIIlIllIllIlIlllIlI, final IBlockState lllllllllllllIIIlIllIllIlIlllIIl) {
        this.notifyNeighbors(lllllllllllllIIIlIllIllIlIlllIll, lllllllllllllIIIlIllIllIlIlllIlI, lllllllllllllIIIlIllIllIlIlllIIl);
    }
    
    private static boolean lllIlIlIIIlIlIl(final int lllllllllllllIIIlIllIlIlIlllIlII) {
        return lllllllllllllIIIlIllIlIlIlllIlII > 0;
    }
    
    protected boolean shouldBePowered(final World lllllllllllllIIIlIllIlllIIlIIIII, final BlockPos lllllllllllllIIIlIllIlllIIlIIIll, final IBlockState lllllllllllllIIIlIllIlllIIIllllI) {
        if (lllIlIlIIIlIlIl(this.calculateInputStrength(lllllllllllllIIIlIllIlllIIlIIIII, lllllllllllllIIIlIllIlllIIlIIIll, lllllllllllllIIIlIllIlllIIIllllI))) {
            return BlockRedstoneDiode.lIlIIllllIllll[3] != 0;
        }
        return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
    }
    
    protected void notifyNeighbors(final World lllllllllllllIIIlIllIllIlIllIIIl, final BlockPos lllllllllllllIIIlIllIllIlIlIlIlI, final IBlockState lllllllllllllIIIlIllIllIlIlIlIIl) {
        final EnumFacing lllllllllllllIIIlIllIllIlIlIlllI = lllllllllllllIIIlIllIllIlIlIlIIl.getValue((IProperty<EnumFacing>)BlockRedstoneDiode.FACING);
        final BlockPos lllllllllllllIIIlIllIllIlIlIllIl = lllllllllllllIIIlIllIllIlIlIlIlI.offset(lllllllllllllIIIlIllIllIlIlIlllI.getOpposite());
        lllllllllllllIIIlIllIllIlIllIIIl.notifyBlockOfStateChange(lllllllllllllIIIlIllIllIlIlIllIl, this);
        lllllllllllllIIIlIllIllIlIllIIIl.notifyNeighborsOfStateExcept(lllllllllllllIIIlIllIllIlIlIllIl, this, lllllllllllllIIIlIllIllIlIlIlllI);
    }
    
    public boolean isFacingTowardsRepeater(final World lllllllllllllIIIlIllIllIIlllIlII, final BlockPos lllllllllllllIIIlIllIllIIlllIIll, final IBlockState lllllllllllllIIIlIllIllIIlllIIlI) {
        final EnumFacing lllllllllllllIIIlIllIllIIlllIllI = lllllllllllllIIIlIllIllIIlllIIlI.getValue((IProperty<EnumFacing>)BlockRedstoneDiode.FACING).getOpposite();
        final BlockPos lllllllllllllIIIlIllIllIIlllIlIl = lllllllllllllIIIlIllIllIIlllIIll.offset(lllllllllllllIIIlIllIllIIlllIllI);
        int n;
        if (lllIlIlIIIlIIII(isRedstoneRepeaterBlockID(lllllllllllllIIIlIllIllIIlllIlII.getBlockState(lllllllllllllIIIlIllIllIIlllIlIl).getBlock()) ? 1 : 0)) {
            if (lllIlIlIIIlIIlI(lllllllllllllIIIlIllIllIIlllIlII.getBlockState(lllllllllllllIIIlIllIllIIlllIlIl).getValue((IProperty<Object>)BlockRedstoneDiode.FACING), lllllllllllllIIIlIllIllIIlllIllI)) {
                n = BlockRedstoneDiode.lIlIIllllIllll[3];
                "".length();
                if (-" ".length() > 0) {
                    return ((0x1F ^ 0x2) & ~(0x45 ^ 0x58)) != 0x0;
                }
            }
            else {
                n = BlockRedstoneDiode.lIlIIllllIllll[0];
                "".length();
                if ((0x5D ^ 0x58) == 0x0) {
                    return ("   ".length() & ~"   ".length()) != 0x0;
                }
            }
        }
        else {
            n = BlockRedstoneDiode.lIlIIllllIllll[0];
        }
        return n != 0;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIIlIllIllIllIlllII, final BlockPos lllllllllllllIIIlIllIllIllIllIll, final EnumFacing lllllllllllllIIIlIllIllIllIllIlI, final float lllllllllllllIIIlIllIllIllIllIIl, final float lllllllllllllIIIlIllIllIllIllIII, final float lllllllllllllIIIlIllIllIllIlIlll, final int lllllllllllllIIIlIllIllIllIlIllI, final EntityLivingBase lllllllllllllIIIlIllIllIllIlIIll) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockRedstoneDiode.FACING, lllllllllllllIIIlIllIllIllIlIIll.getHorizontalFacing().getOpposite());
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIIlIllIlllIlIIllII, final BlockPos lllllllllllllIIIlIllIlllIlIIIlIl, final IBlockState lllllllllllllIIIlIllIlllIlIIIlII, final Block lllllllllllllIIIlIllIlllIlIIlIIl) {
        if (lllIlIlIIIlIIII(this.canBlockStay(lllllllllllllIIIlIllIlllIlIIllII, lllllllllllllIIIlIllIlllIlIIIlIl) ? 1 : 0)) {
            this.updateState(lllllllllllllIIIlIllIlllIlIIllII, lllllllllllllIIIlIllIlllIlIIIlIl, lllllllllllllIIIlIllIlllIlIIIlII);
            "".length();
            if ((0x57 ^ 0x53) == 0x0) {
                return;
            }
        }
        else {
            this.dropBlockAsItem(lllllllllllllIIIlIllIlllIlIIllII, lllllllllllllIIIlIllIlllIlIIIlIl, lllllllllllllIIIlIllIlllIlIIIlII, BlockRedstoneDiode.lIlIIllllIllll[0]);
            lllllllllllllIIIlIllIlllIlIIllII.setBlockToAir(lllllllllllllIIIlIllIlllIlIIIlIl);
            "".length();
            final short lllllllllllllIIIlIllIlllIlIIIIII;
            final String lllllllllllllIIIlIllIlllIlIIIIIl = (String)((EnumFacing[])(Object)(lllllllllllllIIIlIllIlllIlIIIIII = (short)(Object)EnumFacing.values())).length;
            boolean lllllllllllllIIIlIllIlllIlIIIIlI = BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
            "".length();
            if ("   ".length() != "   ".length()) {
                return;
            }
            while (!lllIlIlIIIlIlII(lllllllllllllIIIlIllIlllIlIIIIlI ? 1 : 0, (int)lllllllllllllIIIlIllIlllIlIIIIIl)) {
                final EnumFacing lllllllllllllIIIlIllIlllIlIIlIII = lllllllllllllIIIlIllIlllIlIIIIII[lllllllllllllIIIlIllIlllIlIIIIlI];
                lllllllllllllIIIlIllIlllIlIIllII.notifyNeighborsOfStateChange(lllllllllllllIIIlIllIlllIlIIIlIl.offset(lllllllllllllIIIlIllIlllIlIIlIII), this);
                ++lllllllllllllIIIlIllIlllIlIIIIlI;
            }
        }
    }
    
    @Override
    public boolean canPlaceBlockAt(final World lllllllllllllIIIlIllIllllIIllllI, final BlockPos lllllllllllllIIIlIllIllllIIllIlI) {
        int canPlaceBlock;
        if (lllIlIlIIIlIIII(World.doesBlockHaveSolidTopSurface(lllllllllllllIIIlIllIllllIIllllI, lllllllllllllIIIlIllIllllIIllIlI.down()) ? 1 : 0)) {
            canPlaceBlock = (super.canPlaceBlockAt(lllllllllllllIIIlIllIllllIIllllI, lllllllllllllIIIlIllIllllIIllIlI) ? 1 : 0);
            "".length();
            if (" ".length() != " ".length()) {
                return ((0x60 ^ 0x4C) & ~(0xA7 ^ 0x8B)) != 0x0;
            }
        }
        else {
            canPlaceBlock = BlockRedstoneDiode.lIlIIllllIllll[0];
        }
        return canPlaceBlock != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    static {
        lllIlIlIIIIllll();
    }
    
    @Override
    public boolean isAssociatedBlock(final Block lllllllllllllIIIlIllIllIIllIIlII) {
        return this.isAssociated(lllllllllllllIIIlIllIllIIllIIlII);
    }
    
    protected int getPowerOnSide(final IBlockAccess lllllllllllllIIIlIllIllIlllIIlIl, final BlockPos lllllllllllllIIIlIllIllIlllIIlII, final EnumFacing lllllllllllllIIIlIllIllIlllIlIIl) {
        final IBlockState lllllllllllllIIIlIllIllIlllIlIII = lllllllllllllIIIlIllIllIlllIIlIl.getBlockState(lllllllllllllIIIlIllIllIlllIIlII);
        final Block lllllllllllllIIIlIllIllIlllIIlll = lllllllllllllIIIlIllIllIlllIlIII.getBlock();
        int n;
        if (lllIlIlIIIlIIII(this.canPowerSide(lllllllllllllIIIlIllIllIlllIIlll) ? 1 : 0)) {
            if (lllIlIlIIIlIIll(lllllllllllllIIIlIllIllIlllIIlll, Blocks.redstone_wire)) {
                n = lllllllllllllIIIlIllIllIlllIlIII.getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
                "".length();
                if (((0x5C ^ 0x48 ^ (0x5D ^ 0x59)) & (28 + 96 - 94 + 139 ^ 4 + 116 - 117 + 182 ^ -" ".length())) >= "  ".length()) {
                    return (101 + 73 - 85 + 59 ^ 42 + 70 + 57 + 21) & (0x92 ^ 0x94 ^ (0x23 ^ 0xF) ^ -" ".length());
                }
            }
            else {
                n = lllllllllllllIIIlIllIllIlllIIlIl.getStrongPower(lllllllllllllIIIlIllIllIlllIIlII, lllllllllllllIIIlIllIllIlllIlIIl);
                "".length();
                if (null != null) {
                    return (16 + 201 - 37 + 63 ^ 2 + 49 + 52 + 92) & (0x33 ^ 0x58 ^ (0x4D ^ 0x16) ^ -" ".length());
                }
            }
        }
        else {
            n = BlockRedstoneDiode.lIlIIllllIllll[0];
        }
        return n;
    }
    
    protected boolean canPowerSide(final Block lllllllllllllIIIlIllIllIlIIIllIl) {
        return lllllllllllllIIIlIllIllIlIIIllIl.canProvidePower();
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIIIlIllIllIllIIIlll, final BlockPos lllllllllllllIIIlIllIllIllIIIllI, final IBlockState lllllllllllllIIIlIllIllIllIIIlIl, final EntityLivingBase lllllllllllllIIIlIllIllIllIIlIlI, final ItemStack lllllllllllllIIIlIllIllIllIIlIIl) {
        if (lllIlIlIIIlIIII(this.shouldBePowered(lllllllllllllIIIlIllIllIllIIIlll, lllllllllllllIIIlIllIllIllIIIllI, lllllllllllllIIIlIllIllIllIIIlIl) ? 1 : 0)) {
            lllllllllllllIIIlIllIllIllIIIlll.scheduleUpdate(lllllllllllllIIIlIllIllIllIIIllI, this, BlockRedstoneDiode.lIlIIllllIllll[3]);
        }
    }
    
    private static boolean lllIlIlIIIlIIll(final Object lllllllllllllIIIlIllIlIlIllllIll, final Object lllllllllllllIIIlIllIlIlIllllIlI) {
        return lllllllllllllIIIlIllIlIlIllllIll == lllllllllllllIIIlIllIlIlIllllIlI;
    }
    
    protected int getTickDelay(final IBlockState lllllllllllllIIIlIllIllIIllIlIlI) {
        return this.getDelay(lllllllllllllIIIlIllIllIIllIlIlI);
    }
    
    private static void lllIlIlIIIIllll() {
        (lIlIIllllIllll = new int[7])[0] = ((0x1 ^ 0x1F) & ~(0xB ^ 0x15));
        BlockRedstoneDiode.lIlIIllllIllll[1] = "  ".length();
        BlockRedstoneDiode.lIlIIllllIllll[2] = -" ".length();
        BlockRedstoneDiode.lIlIIllllIllll[3] = " ".length();
        BlockRedstoneDiode.lIlIIllllIllll[4] = -"   ".length();
        BlockRedstoneDiode.lIlIIllllIllll[5] = -"  ".length();
        BlockRedstoneDiode.lIlIIllllIllll[6] = (0xAE ^ 0x88 ^ (0x24 ^ 0xD));
    }
    
    private static boolean lllIlIlIIIlIIlI(final Object lllllllllllllIIIlIllIlIlIlllllll, final Object lllllllllllllIIIlIllIlIlIllllllI) {
        return lllllllllllllIIIlIllIlIlIlllllll != lllllllllllllIIIlIllIlIlIllllllI;
    }
    
    protected void updateState(final World lllllllllllllIIIlIllIlllIIllIIlI, final BlockPos lllllllllllllIIIlIllIlllIIllIIIl, final IBlockState lllllllllllllIIIlIllIlllIIllIIII) {
        if (lllIlIlIIIlIIIl(this.isLocked(lllllllllllllIIIlIllIlllIIllIIlI, lllllllllllllIIIlIllIlllIIllIIIl, lllllllllllllIIIlIllIlllIIllIIII) ? 1 : 0)) {
            final boolean lllllllllllllIIIlIllIlllIIllIlIl = this.shouldBePowered(lllllllllllllIIIlIllIlllIIllIIlI, lllllllllllllIIIlIllIlllIIllIIIl, lllllllllllllIIIlIllIlllIIllIIII);
            if (((lllIlIlIIIlIIII(this.isRepeaterPowered ? 1 : 0) && !lllIlIlIIIlIIII(lllllllllllllIIIlIllIlllIIllIlIl ? 1 : 0)) || (lllIlIlIIIlIIIl(this.isRepeaterPowered ? 1 : 0) && lllIlIlIIIlIIII(lllllllllllllIIIlIllIlllIIllIlIl ? 1 : 0))) && lllIlIlIIIlIIIl(lllllllllllllIIIlIllIlllIIllIIlI.isBlockTickPending(lllllllllllllIIIlIllIlllIIllIIIl, this) ? 1 : 0)) {
                int lllllllllllllIIIlIllIlllIIllIlII = BlockRedstoneDiode.lIlIIllllIllll[2];
                if (lllIlIlIIIlIIII(this.isFacingTowardsRepeater(lllllllllllllIIIlIllIlllIIllIIlI, lllllllllllllIIIlIllIlllIIllIIIl, lllllllllllllIIIlIllIlllIIllIIII) ? 1 : 0)) {
                    lllllllllllllIIIlIllIlllIIllIlII = BlockRedstoneDiode.lIlIIllllIllll[4];
                    "".length();
                    if (((0xC4 ^ 0x92) & ~(0x44 ^ 0x12)) < -" ".length()) {
                        return;
                    }
                }
                else if (lllIlIlIIIlIIII(this.isRepeaterPowered ? 1 : 0)) {
                    lllllllllllllIIIlIllIlllIIllIlII = BlockRedstoneDiode.lIlIIllllIllll[5];
                }
                lllllllllllllIIIlIllIlllIIllIIlI.updateBlockTick(lllllllllllllIIIlIllIlllIIllIIIl, this, this.getDelay(lllllllllllllIIIlIllIlllIIllIIII), lllllllllllllIIIlIllIlllIIllIlII);
            }
        }
    }
    
    protected int getPowerOnSides(final IBlockAccess lllllllllllllIIIlIllIllIllllllll, final BlockPos lllllllllllllIIIlIllIllIllllIlll, final IBlockState lllllllllllllIIIlIllIllIllllIllI) {
        final EnumFacing lllllllllllllIIIlIllIllIllllllII = lllllllllllllIIIlIllIllIllllIllI.getValue((IProperty<EnumFacing>)BlockRedstoneDiode.FACING);
        final EnumFacing lllllllllllllIIIlIllIllIlllllIll = lllllllllllllIIIlIllIllIllllllII.rotateY();
        final EnumFacing lllllllllllllIIIlIllIllIlllllIlI = lllllllllllllIIIlIllIllIllllllII.rotateYCCW();
        return Math.max(this.getPowerOnSide(lllllllllllllIIIlIllIllIllllllll, lllllllllllllIIIlIllIllIllllIlll.offset(lllllllllllllIIIlIllIllIlllllIll), lllllllllllllIIIlIllIllIlllllIll), this.getPowerOnSide(lllllllllllllIIIlIllIllIllllllll, lllllllllllllIIIlIllIllIllllIlll.offset(lllllllllllllIIIlIllIllIlllllIlI), lllllllllllllIIIlIllIllIlllllIlI));
    }
    
    @Override
    public boolean isFullCube() {
        return BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
    }
    
    @Override
    public int getWeakPower(final IBlockAccess lllllllllllllIIIlIllIlllIlIllIIl, final BlockPos lllllllllllllIIIlIllIlllIlIlllIl, final IBlockState lllllllllllllIIIlIllIlllIlIlIlll, final EnumFacing lllllllllllllIIIlIllIlllIlIllIll) {
        int activeSignal;
        if (lllIlIlIIIlIIIl(this.isPowered(lllllllllllllIIIlIllIlllIlIlIlll) ? 1 : 0)) {
            activeSignal = BlockRedstoneDiode.lIlIIllllIllll[0];
            "".length();
            if ("  ".length() <= 0) {
                return (0x6F ^ 0x24 ^ (0xC1 ^ 0xC5)) & (0x32 ^ 0x26 ^ (0x64 ^ 0x3F) ^ -" ".length());
            }
        }
        else if (lllIlIlIIIlIIll(lllllllllllllIIIlIllIlllIlIlIlll.getValue((IProperty<Object>)BlockRedstoneDiode.FACING), lllllllllllllIIIlIllIlllIlIllIll)) {
            activeSignal = this.getActiveSignal(lllllllllllllIIIlIllIlllIlIllIIl, lllllllllllllIIIlIllIlllIlIlllIl, lllllllllllllIIIlIllIlllIlIlIlll);
            "".length();
            if (-"  ".length() > 0) {
                return (0x75 ^ 0x59 ^ (0x68 ^ 0x76)) & (0xB1 ^ 0xB7 ^ (0x18 ^ 0x2C) ^ -" ".length());
            }
        }
        else {
            activeSignal = BlockRedstoneDiode.lIlIIllllIllll[0];
        }
        return activeSignal;
    }
    
    @Override
    public void onBlockDestroyedByPlayer(final World lllllllllllllIIIlIllIllIlIIllIII, final BlockPos lllllllllllllIIIlIllIllIlIIlllII, final IBlockState lllllllllllllIIIlIllIllIlIIlIllI) {
        if (lllIlIlIIIlIIII(this.isRepeaterPowered ? 1 : 0)) {
            final float lllllllllllllIIIlIllIllIlIIlIIlI;
            final Exception lllllllllllllIIIlIllIllIlIIlIIll = (Exception)((EnumFacing[])(Object)(lllllllllllllIIIlIllIllIlIIlIIlI = (float)(Object)EnumFacing.values())).length;
            boolean lllllllllllllIIIlIllIllIlIIlIlII = BlockRedstoneDiode.lIlIIllllIllll[0] != 0;
            "".length();
            if (-("   ".length() ^ (0x42 ^ 0x44)) >= 0) {
                return;
            }
            while (!lllIlIlIIIlIlII(lllllllllllllIIIlIllIllIlIIlIlII ? 1 : 0, (int)lllllllllllllIIIlIllIllIlIIlIIll)) {
                final EnumFacing lllllllllllllIIIlIllIllIlIIllIlI = lllllllllllllIIIlIllIllIlIIlIIlI[lllllllllllllIIIlIllIllIlIIlIlII];
                lllllllllllllIIIlIllIllIlIIllIII.notifyNeighborsOfStateChange(lllllllllllllIIIlIllIllIlIIlllII.offset(lllllllllllllIIIlIllIllIlIIllIlI), this);
                ++lllllllllllllIIIlIllIllIlIIlIlII;
            }
        }
        super.onBlockDestroyedByPlayer(lllllllllllllIIIlIllIllIlIIllIII, lllllllllllllIIIlIllIllIlIIlllII, lllllllllllllIIIlIllIllIlIIlIllI);
    }
    
    protected int calculateInputStrength(final World lllllllllllllIIIlIllIlllIIIlIlIl, final BlockPos lllllllllllllIIIlIllIlllIIIlIlII, final IBlockState lllllllllllllIIIlIllIlllIIIlIIll) {
        final EnumFacing lllllllllllllIIIlIllIlllIIIlIIlI = lllllllllllllIIIlIllIlllIIIlIIll.getValue((IProperty<EnumFacing>)BlockRedstoneDiode.FACING);
        final BlockPos lllllllllllllIIIlIllIlllIIIlIIIl = lllllllllllllIIIlIllIlllIIIlIlII.offset(lllllllllllllIIIlIllIlllIIIlIIlI);
        final int lllllllllllllIIIlIllIlllIIIlIIII = lllllllllllllIIIlIllIlllIIIlIlIl.getRedstonePower(lllllllllllllIIIlIllIlllIIIlIIIl, lllllllllllllIIIlIllIlllIIIlIIlI);
        if (lllIlIlIIIlIlII(lllllllllllllIIIlIllIlllIIIlIIII, BlockRedstoneDiode.lIlIIllllIllll[6])) {
            return lllllllllllllIIIlIllIlllIIIlIIII;
        }
        final IBlockState lllllllllllllIIIlIllIlllIIIIllll = lllllllllllllIIIlIllIlllIIIlIlIl.getBlockState(lllllllllllllIIIlIllIlllIIIlIIIl);
        final int a = lllllllllllllIIIlIllIlllIIIlIIII;
        int intValue;
        if (lllIlIlIIIlIIll(lllllllllllllIIIlIllIlllIIIIllll.getBlock(), Blocks.redstone_wire)) {
            intValue = lllllllllllllIIIlIllIlllIIIIllll.getValue((IProperty<Integer>)BlockRedstoneWire.POWER);
            "".length();
            if ((66 + 118 - 104 + 65 ^ 81 + 142 - 117 + 43) < -" ".length()) {
                return (73 + 70 - 45 + 87 ^ 49 + 129 - 145 + 124) & (0x1C ^ 0x77 ^ (0xD6 ^ 0x99) ^ -" ".length());
            }
        }
        else {
            intValue = BlockRedstoneDiode.lIlIIllllIllll[0];
        }
        return Math.max(a, intValue);
    }
    
    protected abstract IBlockState getPoweredState(final IBlockState p0);
    
    public boolean canBlockStay(final World lllllllllllllIIIlIllIllllIIlIlII, final BlockPos lllllllllllllIIIlIllIllllIIlIIll) {
        return World.doesBlockHaveSolidTopSurface(lllllllllllllIIIlIllIllllIIlIlII, lllllllllllllIIIlIllIllllIIlIIll.down());
    }
}
