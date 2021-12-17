// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.dispenser.BehaviorDefaultDispenseItem;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.Material;
import net.minecraft.dispenser.PositionImpl;
import net.minecraft.dispenser.IPosition;
import net.minecraft.dispenser.IBlockSource;
import net.minecraft.inventory.Container;
import net.minecraft.stats.StatList;
import net.minecraft.tileentity.TileEntityDropper;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.tileentity.TileEntityDispenser;
import net.minecraft.block.state.BlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.properties.PropertyDirection;
import java.util.Random;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.dispenser.IBehaviorDispenseItem;
import net.minecraft.item.Item;
import net.minecraft.util.RegistryDefaulted;

public class BlockDispenser extends BlockContainer
{
    public static final /* synthetic */ RegistryDefaulted<Item, IBehaviorDispenseItem> dispenseBehaviorRegistry;
    public static final /* synthetic */ PropertyBool TRIGGERED;
    protected /* synthetic */ Random rand;
    private static final /* synthetic */ String[] llIlllIlIllIII;
    private static final /* synthetic */ int[] llIlllIlIllIlI;
    public static final /* synthetic */ PropertyDirection FACING;
    
    public static EnumFacing getFacing(final int llllllllllllIllIIlIIIlIllllIllIl) {
        return EnumFacing.getFront(llllllllllllIllIIlIIIlIllllIllIl & BlockDispenser.llIlllIlIllIlI[5]);
    }
    
    protected IBehaviorDispenseItem getBehavior(final ItemStack llllllllllllIllIIlIIIllIIlIlIIll) {
        final RegistryDefaulted<Item, IBehaviorDispenseItem> dispenseBehaviorRegistry = BlockDispenser.dispenseBehaviorRegistry;
        Item item;
        if (lIIllIIllllIllll(llllllllllllIllIIlIIIllIIlIlIIll)) {
            item = null;
            "".length();
            if ("   ".length() != "   ".length()) {
                return null;
            }
        }
        else {
            item = llllllllllllIllIIlIIIllIIlIlIIll.getItem();
        }
        return dispenseBehaviorRegistry.getObject(item);
    }
    
    private static boolean lIIllIIllllIlIlI(final int llllllllllllIllIIlIIIlIIlllIlllI) {
        return llllllllllllIllIIlIIIlIIlllIlllI != 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIllIIlIIIlIlllIIlIII) {
        int llllllllllllIllIIlIIIlIlllIIIlll = BlockDispenser.llIlllIlIllIlI[0];
        llllllllllllIllIIlIIIlIlllIIIlll |= llllllllllllIllIIlIIIlIlllIIlIII.getValue((IProperty<EnumFacing>)BlockDispenser.FACING).getIndex();
        if (lIIllIIllllIlIlI(((boolean)llllllllllllIllIIlIIIlIlllIIlIII.getValue((IProperty<Boolean>)BlockDispenser.TRIGGERED)) ? 1 : 0)) {
            llllllllllllIllIIlIIIlIlllIIIlll |= BlockDispenser.llIlllIlIllIlI[7];
        }
        return llllllllllllIllIIlIIIlIlllIIIlll;
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockDispenser.llIlllIlIllIlI[1] != 0;
    }
    
    private static boolean lIIllIIllllIlIll(final Object llllllllllllIllIIlIIIlIIllllIIlI) {
        return llllllllllllIllIIlIIIlIIllllIIlI != null;
    }
    
    @Override
    public IBlockState getStateForEntityRender(final IBlockState llllllllllllIllIIlIIIlIllllIIIII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockDispenser.FACING, EnumFacing.SOUTH);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIllIIlIIIllIIIlIIIlI, final BlockPos llllllllllllIllIIlIIIllIIIlIIIIl, final EnumFacing llllllllllllIllIIlIIIllIIIlIlIIl, final float llllllllllllIllIIlIIIllIIIlIlIII, final float llllllllllllIllIIlIIIllIIIlIIlll, final float llllllllllllIllIIlIIIllIIIlIIllI, final int llllllllllllIllIIlIIIllIIIlIIlIl, final EntityLivingBase llllllllllllIllIIlIIIllIIIlIIlII) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockDispenser.FACING, BlockPistonBase.getFacingFromEntity(llllllllllllIllIIlIIIllIIIlIIIlI, llllllllllllIllIIlIIIllIIIlIIIIl, llllllllllllIllIIlIIIllIIIlIIlII)).withProperty((IProperty<Comparable>)BlockDispenser.TRIGGERED, (boolean)(BlockDispenser.llIlllIlIllIlI[0] != 0));
    }
    
    private static boolean lIIllIIlllllIIII(final int llllllllllllIllIIlIIIlIIlllIIllI) {
        return llllllllllllIllIIlIIIlIIlllIIllI > 0;
    }
    
    private static boolean lIIllIIllllIlllI(final int llllllllllllIllIIlIIIlIIlllIlIII) {
        return llllllllllllIllIIlIIIlIIlllIlIII <= 0;
    }
    
    private static boolean lIIllIIllllIlIII(final int llllllllllllIllIIlIIIlIIlllIllII) {
        return llllllllllllIllIIlIIIlIIlllIllII == 0;
    }
    
    private static boolean lIIllIIllllIllIl(final Object llllllllllllIllIIlIIIlIIlllllIIl, final Object llllllllllllIllIIlIIIlIIlllllIII) {
        return llllllllllllIllIIlIIIlIIlllllIIl != llllllllllllIllIIlIIIlIIlllllIII;
    }
    
    @Override
    public void onNeighborBlockChange(final World llllllllllllIllIIlIIIllIIlIIlIlI, final BlockPos llllllllllllIllIIlIIIllIIlIIlIIl, final IBlockState llllllllllllIllIIlIIIllIIlIIlIII, final Block llllllllllllIllIIlIIIllIIlIIIlll) {
        int n;
        if (lIIllIIllllIlIII(llllllllllllIllIIlIIIllIIlIIlIlI.isBlockPowered(llllllllllllIllIIlIIIllIIlIIlIIl) ? 1 : 0) && lIIllIIllllIlIII(llllllllllllIllIIlIIIllIIlIIlIlI.isBlockPowered(llllllllllllIllIIlIIIllIIlIIlIIl.up()) ? 1 : 0)) {
            n = BlockDispenser.llIlllIlIllIlI[0];
            "".length();
            if (((0x1 ^ 0x27 ^ (0xE2 ^ 0x80)) & (0x8 ^ 0x71 ^ (0x9 ^ 0x34) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = BlockDispenser.llIlllIlIllIlI[1];
        }
        final boolean llllllllllllIllIIlIIIllIIlIIIllI = n != 0;
        final boolean llllllllllllIllIIlIIIllIIlIIIlIl = llllllllllllIllIIlIIIllIIlIIlIII.getValue((IProperty<Boolean>)BlockDispenser.TRIGGERED);
        if (lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIIlIIIllI ? 1 : 0) && lIIllIIllllIlIII(llllllllllllIllIIlIIIllIIlIIIlIl ? 1 : 0)) {
            llllllllllllIllIIlIIIllIIlIIlIlI.scheduleUpdate(llllllllllllIllIIlIIIllIIlIIlIIl, this, this.tickRate(llllllllllllIllIIlIIIllIIlIIlIlI));
            llllllllllllIllIIlIIIllIIlIIlIlI.setBlockState(llllllllllllIllIIlIIIllIIlIIlIIl, llllllllllllIllIIlIIIllIIlIIlIII.withProperty((IProperty<Comparable>)BlockDispenser.TRIGGERED, (boolean)(BlockDispenser.llIlllIlIllIlI[1] != 0)), BlockDispenser.llIlllIlIllIlI[2]);
            "".length();
            "".length();
            if (-"  ".length() >= 0) {
                return;
            }
        }
        else if (lIIllIIllllIlIII(llllllllllllIllIIlIIIllIIlIIIllI ? 1 : 0) && lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIIlIIIlIl ? 1 : 0)) {
            llllllllllllIllIIlIIIllIIlIIlIlI.setBlockState(llllllllllllIllIIlIIIllIIlIIlIIl, llllllllllllIllIIlIIIllIIlIIlIII.withProperty((IProperty<Comparable>)BlockDispenser.TRIGGERED, (boolean)(BlockDispenser.llIlllIlIllIlI[0] != 0)), BlockDispenser.llIlllIlIllIlI[2]);
            "".length();
        }
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockDispenser.llIlllIlIllIlI[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDispenser.llIlllIlIllIlI[0]] = BlockDispenser.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockDispenser.llIlllIlIllIlI[1]] = BlockDispenser.TRIGGERED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static boolean lIIllIIllllIllll(final Object llllllllllllIllIIlIIIlIIllllIIII) {
        return llllllllllllIllIIlIIIlIIllllIIII == null;
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIllIIlIIIllIIIIlIIlI, final BlockPos llllllllllllIllIIlIIIllIIIIlIIIl, final IBlockState llllllllllllIllIIlIIIllIIIIlIllI, final EntityLivingBase llllllllllllIllIIlIIIllIIIIIllll, final ItemStack llllllllllllIllIIlIIIllIIIIIlllI) {
        llllllllllllIllIIlIIIllIIIIlIIlI.setBlockState(llllllllllllIllIIlIIIllIIIIlIIIl, llllllllllllIllIIlIIIllIIIIlIllI.withProperty((IProperty<Comparable>)BlockDispenser.FACING, BlockPistonBase.getFacingFromEntity(llllllllllllIllIIlIIIllIIIIlIIlI, llllllllllllIllIIlIIIllIIIIlIIIl, llllllllllllIllIIlIIIllIIIIIllll)), BlockDispenser.llIlllIlIllIlI[3]);
        "".length();
        if (lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIIIIIlllI.hasDisplayName() ? 1 : 0)) {
            final TileEntity llllllllllllIllIIlIIIllIIIIlIIll = llllllllllllIllIIlIIIllIIIIlIIlI.getTileEntity(llllllllllllIllIIlIIIllIIIIlIIIl);
            if (lIIllIIllllIlIlI((llllllllllllIllIIlIIIllIIIIlIIll instanceof TileEntityDispenser) ? 1 : 0)) {
                ((TileEntityDispenser)llllllllllllIllIIlIIIllIIIIlIIll).setCustomName(llllllllllllIllIIlIIIllIIIIIlllI.getDisplayName());
            }
        }
    }
    
    private static boolean lIIllIIlllllIIIl(final int llllllllllllIllIIlIIIlIIllllllIl, final int llllllllllllIllIIlIIIlIIllllllII) {
        return llllllllllllIllIIlIIIlIIllllllIl < llllllllllllIllIIlIIIlIIllllllII;
    }
    
    @Override
    public void onBlockAdded(final World llllllllllllIllIIlIIIllIlIlIIIlI, final BlockPos llllllllllllIllIIlIIIllIlIIlllIl, final IBlockState llllllllllllIllIIlIIIllIlIIlllII) {
        super.onBlockAdded(llllllllllllIllIIlIIIllIlIlIIIlI, llllllllllllIllIIlIIIllIlIIlllIl, llllllllllllIllIIlIIIllIlIIlllII);
        this.setDefaultDirection(llllllllllllIllIIlIIIllIlIlIIIlI, llllllllllllIllIIlIIIllIlIIlllIl, llllllllllllIllIIlIIIllIlIIlllII);
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIllIIlIIIllIIlllllIl, final BlockPos llllllllllllIllIIlIIIllIIlllIIll, final IBlockState llllllllllllIllIIlIIIllIIllllIll, final EntityPlayer llllllllllllIllIIlIIIllIIllllIlI, final EnumFacing llllllllllllIllIIlIIIllIIllllIIl, final float llllllllllllIllIIlIIIllIIllllIII, final float llllllllllllIllIIlIIIllIIlllIlll, final float llllllllllllIllIIlIIIllIIlllIllI) {
        if (lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIIlllllIl.isRemote ? 1 : 0)) {
            return BlockDispenser.llIlllIlIllIlI[1] != 0;
        }
        final TileEntity llllllllllllIllIIlIIIllIIlllIlIl = llllllllllllIllIIlIIIllIIlllllIl.getTileEntity(llllllllllllIllIIlIIIllIIlllIIll);
        if (lIIllIIllllIlIlI((llllllllllllIllIIlIIIllIIlllIlIl instanceof TileEntityDispenser) ? 1 : 0)) {
            llllllllllllIllIIlIIIllIIllllIlI.displayGUIChest((IInventory)llllllllllllIllIIlIIIllIIlllIlIl);
            if (lIIllIIllllIlIlI((llllllllllllIllIIlIIIllIIlllIlIl instanceof TileEntityDropper) ? 1 : 0)) {
                llllllllllllIllIIlIIIllIIllllIlI.triggerAchievement(StatList.field_181731_O);
                "".length();
                if ((0xED ^ 0xAD ^ (0xDF ^ 0x9A)) <= 0) {
                    return (("  ".length() ^ (0x6 ^ 0x66)) & (0xCC ^ 0x94 ^ (0x6 ^ 0x3C) ^ -" ".length())) != 0x0;
                }
            }
            else {
                llllllllllllIllIIlIIIllIIllllIlI.triggerAchievement(StatList.field_181733_Q);
            }
        }
        return BlockDispenser.llIlllIlIllIlI[1] != 0;
    }
    
    @Override
    public int getRenderType() {
        return BlockDispenser.llIlllIlIllIlI[6];
    }
    
    @Override
    public int getComparatorInputOverride(final World llllllllllllIllIIlIIIlIllllIIlll, final BlockPos llllllllllllIllIIlIIIlIllllIIlII) {
        return Container.calcRedstone(llllllllllllIllIIlIIIlIllllIIlll.getTileEntity(llllllllllllIllIIlIIIlIllllIIlII));
    }
    
    public static IPosition getDispensePosition(final IBlockSource llllllllllllIllIIlIIIlIlllllIIll) {
        final EnumFacing llllllllllllIllIIlIIIlIlllllIlll = getFacing(llllllllllllIllIIlIIIlIlllllIIll.getBlockMetadata());
        final double llllllllllllIllIIlIIIlIlllllIllI = llllllllllllIllIIlIIIlIlllllIIll.getX() + 0.7 * llllllllllllIllIIlIIIlIlllllIlll.getFrontOffsetX();
        final double llllllllllllIllIIlIIIlIlllllIlIl = llllllllllllIllIIlIIIlIlllllIIll.getY() + 0.7 * llllllllllllIllIIlIIIlIlllllIlll.getFrontOffsetY();
        final double llllllllllllIllIIlIIIlIlllllIlII = llllllllllllIllIIlIIIlIlllllIIll.getZ() + 0.7 * llllllllllllIllIIlIIIlIlllllIlll.getFrontOffsetZ();
        return new PositionImpl(llllllllllllIllIIlIIIlIlllllIllI, llllllllllllIllIIlIIIlIlllllIlIl, llllllllllllIllIIlIIIlIlllllIlII);
    }
    
    @Override
    public int tickRate(final World llllllllllllIllIIlIIIllIlIlIlIII) {
        return BlockDispenser.llIlllIlIllIlI[2];
    }
    
    protected void dispense(final World llllllllllllIllIIlIIIllIIllIIllI, final BlockPos llllllllllllIllIIlIIIllIIllIIlIl) {
        final BlockSourceImpl llllllllllllIllIIlIIIllIIllIIlII = new BlockSourceImpl(llllllllllllIllIIlIIIllIIllIIllI, llllllllllllIllIIlIIIllIIllIIlIl);
        final TileEntityDispenser llllllllllllIllIIlIIIllIIllIIIll = llllllllllllIllIIlIIIllIIllIIlII.getBlockTileEntity();
        if (lIIllIIllllIlIll(llllllllllllIllIIlIIIllIIllIIIll)) {
            final int llllllllllllIllIIlIIIllIIllIIIlI = llllllllllllIllIIlIIIllIIllIIIll.getDispenseSlot();
            if (lIIllIIllllIllII(llllllllllllIllIIlIIIllIIllIIIlI)) {
                llllllllllllIllIIlIIIllIIllIIllI.playAuxSFX(BlockDispenser.llIlllIlIllIlI[4], llllllllllllIllIIlIIIllIIllIIlIl, BlockDispenser.llIlllIlIllIlI[0]);
                "".length();
                if ((0x4C ^ 0x67 ^ (0xAA ^ 0x85)) <= 0) {
                    return;
                }
            }
            else {
                final ItemStack llllllllllllIllIIlIIIllIIllIIIIl = llllllllllllIllIIlIIIllIIllIIIll.getStackInSlot(llllllllllllIllIIlIIIllIIllIIIlI);
                final IBehaviorDispenseItem llllllllllllIllIIlIIIllIIllIIIII = this.getBehavior(llllllllllllIllIIlIIIllIIllIIIIl);
                if (lIIllIIllllIllIl(llllllllllllIllIIlIIIllIIllIIIII, IBehaviorDispenseItem.itemDispenseBehaviorProvider)) {
                    final ItemStack llllllllllllIllIIlIIIllIIlIlllll = llllllllllllIllIIlIIIllIIllIIIII.dispense(llllllllllllIllIIlIIIllIIllIIlII, llllllllllllIllIIlIIIllIIllIIIIl);
                    final TileEntityDispenser tileEntityDispenser = llllllllllllIllIIlIIIllIIllIIIll;
                    final int lllllllllllllIIIIIlllIlllllllIll = llllllllllllIllIIlIIIllIIllIIIlI;
                    ItemStack lllllllllllllIIIIIlllIllllllIlll;
                    if (lIIllIIllllIlllI(llllllllllllIllIIlIIIllIIlIlllll.stackSize)) {
                        lllllllllllllIIIIIlllIllllllIlll = null;
                        "".length();
                        if ("   ".length() == (0x84 ^ 0x80)) {
                            return;
                        }
                    }
                    else {
                        lllllllllllllIIIIIlllIllllllIlll = llllllllllllIllIIlIIIllIIlIlllll;
                    }
                    tileEntityDispenser.setInventorySlotContents(lllllllllllllIIIIIlllIlllllllIll, lllllllllllllIIIIIlllIllllllIlll);
                }
            }
        }
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIllIIlIIIlIlllIllIIl) {
        final IBlockState withProperty = this.getDefaultState().withProperty((IProperty<Comparable>)BlockDispenser.FACING, getFacing(llllllllllllIllIIlIIIlIlllIllIIl));
        final PropertyBool triggered = BlockDispenser.TRIGGERED;
        int b;
        if (lIIllIIlllllIIII(llllllllllllIllIIlIIIlIlllIllIIl & BlockDispenser.llIlllIlIllIlI[7])) {
            b = BlockDispenser.llIlllIlIllIlI[1];
            "".length();
            if ("  ".length() <= 0) {
                return null;
            }
        }
        else {
            b = BlockDispenser.llIlllIlIllIlI[0];
        }
        return withProperty.withProperty((IProperty<Comparable>)triggered, (boolean)(b != 0));
    }
    
    private static boolean lIIllIIllllIllII(final int llllllllllllIllIIlIIIlIIlllIlIlI) {
        return llllllllllllIllIIlIIIlIIlllIlIlI < 0;
    }
    
    protected BlockDispenser() {
        super(Material.rock);
        this.rand = new Random();
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockDispenser.FACING, EnumFacing.NORTH).withProperty((IProperty<Comparable>)BlockDispenser.TRIGGERED, (boolean)(BlockDispenser.llIlllIlIllIlI[0] != 0)));
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
    }
    
    @Override
    public void breakBlock(final World llllllllllllIllIIlIIIllIIIIIIIIl, final BlockPos llllllllllllIllIIlIIIllIIIIIIIII, final IBlockState llllllllllllIllIIlIIIllIIIIIIlII) {
        final TileEntity llllllllllllIllIIlIIIllIIIIIIIll = llllllllllllIllIIlIIIllIIIIIIIIl.getTileEntity(llllllllllllIllIIlIIIllIIIIIIIII);
        if (lIIllIIllllIlIlI((llllllllllllIllIIlIIIllIIIIIIIll instanceof TileEntityDispenser) ? 1 : 0)) {
            InventoryHelper.dropInventoryItems(llllllllllllIllIIlIIIllIIIIIIIIl, llllllllllllIllIIlIIIllIIIIIIIII, (IInventory)llllllllllllIllIIlIIIllIIIIIIIll);
            llllllllllllIllIIlIIIllIIIIIIIIl.updateComparatorOutputLevel(llllllllllllIllIIlIIIllIIIIIIIII, this);
        }
        super.breakBlock(llllllllllllIllIIlIIIllIIIIIIIIl, llllllllllllIllIIlIIIllIIIIIIIII, llllllllllllIllIIlIIIllIIIIIIlII);
    }
    
    private void setDefaultDirection(final World llllllllllllIllIIlIIIllIlIIIlIlI, final BlockPos llllllllllllIllIIlIIIllIlIIlIIIl, final IBlockState llllllllllllIllIIlIIIllIlIIIlIII) {
        if (lIIllIIllllIlIII(llllllllllllIllIIlIIIllIlIIIlIlI.isRemote ? 1 : 0)) {
            EnumFacing llllllllllllIllIIlIIIllIlIIIllll = llllllllllllIllIIlIIIllIlIIIlIII.getValue((IProperty<EnumFacing>)BlockDispenser.FACING);
            final boolean llllllllllllIllIIlIIIllIlIIIlllI = llllllllllllIllIIlIIIllIlIIIlIlI.getBlockState(llllllllllllIllIIlIIIllIlIIlIIIl.north()).getBlock().isFullBlock();
            final boolean llllllllllllIllIIlIIIllIlIIIllIl = llllllllllllIllIIlIIIllIlIIIlIlI.getBlockState(llllllllllllIllIIlIIIllIlIIlIIIl.south()).getBlock().isFullBlock();
            if (lIIllIIllllIlIIl(llllllllllllIllIIlIIIllIlIIIllll, EnumFacing.NORTH) && lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIlIIIlllI ? 1 : 0) && lIIllIIllllIlIII(llllllllllllIllIIlIIIllIlIIIllIl ? 1 : 0)) {
                llllllllllllIllIIlIIIllIlIIIllll = EnumFacing.SOUTH;
                "".length();
                if ((0xB3 ^ 0xB6) == 0x0) {
                    return;
                }
            }
            else if (lIIllIIllllIlIIl(llllllllllllIllIIlIIIllIlIIIllll, EnumFacing.SOUTH) && lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIlIIIllIl ? 1 : 0) && lIIllIIllllIlIII(llllllllllllIllIIlIIIllIlIIIlllI ? 1 : 0)) {
                llllllllllllIllIIlIIIllIlIIIllll = EnumFacing.NORTH;
                "".length();
                if (-" ".length() >= "   ".length()) {
                    return;
                }
            }
            else {
                final boolean llllllllllllIllIIlIIIllIlIIIllII = llllllllllllIllIIlIIIllIlIIIlIlI.getBlockState(llllllllllllIllIIlIIIllIlIIlIIIl.west()).getBlock().isFullBlock();
                final boolean llllllllllllIllIIlIIIllIlIIIlIll = llllllllllllIllIIlIIIllIlIIIlIlI.getBlockState(llllllllllllIllIIlIIIllIlIIlIIIl.east()).getBlock().isFullBlock();
                if (lIIllIIllllIlIIl(llllllllllllIllIIlIIIllIlIIIllll, EnumFacing.WEST) && lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIlIIIllII ? 1 : 0) && lIIllIIllllIlIII(llllllllllllIllIIlIIIllIlIIIlIll ? 1 : 0)) {
                    llllllllllllIllIIlIIIllIlIIIllll = EnumFacing.EAST;
                    "".length();
                    if ("  ".length() != "  ".length()) {
                        return;
                    }
                }
                else if (lIIllIIllllIlIIl(llllllllllllIllIIlIIIllIlIIIllll, EnumFacing.EAST) && lIIllIIllllIlIlI(llllllllllllIllIIlIIIllIlIIIlIll ? 1 : 0) && lIIllIIllllIlIII(llllllllllllIllIIlIIIllIlIIIllII ? 1 : 0)) {
                    llllllllllllIllIIlIIIllIlIIIllll = EnumFacing.WEST;
                }
            }
            llllllllllllIllIIlIIIllIlIIIlIlI.setBlockState(llllllllllllIllIIlIIIllIlIIlIIIl, llllllllllllIllIIlIIIllIlIIIlIII.withProperty((IProperty<Comparable>)BlockDispenser.FACING, llllllllllllIllIIlIIIllIlIIIllll).withProperty((IProperty<Comparable>)BlockDispenser.TRIGGERED, (boolean)(BlockDispenser.llIlllIlIllIlI[0] != 0)), BlockDispenser.llIlllIlIllIlI[3]);
            "".length();
        }
    }
    
    private static String lIIllIIllllIIIII(final String llllllllllllIllIIlIIIlIlIIIllIll, final String llllllllllllIllIIlIIIlIlIIIlllII) {
        try {
            final SecretKeySpec llllllllllllIllIIlIIIlIlIIlIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlIIIlIlIIIlllII.getBytes(StandardCharsets.UTF_8)), BlockDispenser.llIlllIlIllIlI[7]), "DES");
            final Cipher llllllllllllIllIIlIIIlIlIIIlllll = Cipher.getInstance("DES");
            llllllllllllIllIIlIIIlIlIIIlllll.init(BlockDispenser.llIlllIlIllIlI[3], llllllllllllIllIIlIIIlIlIIlIIIII);
            return new String(llllllllllllIllIIlIIIlIlIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIlIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlIIIlIlIIIllllI) {
            llllllllllllIllIIlIIIlIlIIIllllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIIllIIllllIIlIl(String llllllllllllIllIIlIIIlIlIIIIlIII, final String llllllllllllIllIIlIIIlIlIIIIllII) {
        llllllllllllIllIIlIIIlIlIIIIlIII = new String(Base64.getDecoder().decode(llllllllllllIllIIlIIIlIlIIIIlIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIlIIIlIlIIIIlIll = new StringBuilder();
        final char[] llllllllllllIllIIlIIIlIlIIIIlIlI = llllllllllllIllIIlIIIlIlIIIIllII.toCharArray();
        int llllllllllllIllIIlIIIlIlIIIIlIIl = BlockDispenser.llIlllIlIllIlI[0];
        final float llllllllllllIllIIlIIIlIlIIIIIIll = (Object)llllllllllllIllIIlIIIlIlIIIIlIII.toCharArray();
        final byte llllllllllllIllIIlIIIlIlIIIIIIlI = (byte)llllllllllllIllIIlIIIlIlIIIIIIll.length;
        char llllllllllllIllIIlIIIlIlIIIIIIIl = (char)BlockDispenser.llIlllIlIllIlI[0];
        while (lIIllIIlllllIIIl(llllllllllllIllIIlIIIlIlIIIIIIIl, llllllllllllIllIIlIIIlIlIIIIIIlI)) {
            final char llllllllllllIllIIlIIIlIlIIIIlllI = llllllllllllIllIIlIIIlIlIIIIIIll[llllllllllllIllIIlIIIlIlIIIIIIIl];
            llllllllllllIllIIlIIIlIlIIIIlIll.append((char)(llllllllllllIllIIlIIIlIlIIIIlllI ^ llllllllllllIllIIlIIIlIlIIIIlIlI[llllllllllllIllIIlIIIlIlIIIIlIIl % llllllllllllIllIIlIIIlIlIIIIlIlI.length]));
            "".length();
            ++llllllllllllIllIIlIIIlIlIIIIlIIl;
            ++llllllllllllIllIIlIIIlIlIIIIIIIl;
            "".length();
            if ((85 + 153 - 237 + 177 ^ 42 + 37 - 9 + 113) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIlIIIlIlIIIIlIll);
    }
    
    @Override
    public void updateTick(final World llllllllllllIllIIlIIIllIIIlllIlI, final BlockPos llllllllllllIllIIlIIIllIIIlllIIl, final IBlockState llllllllllllIllIIlIIIllIIIlllIII, final Random llllllllllllIllIIlIIIllIIIllIlll) {
        if (lIIllIIllllIlIII(llllllllllllIllIIlIIIllIIIlllIlI.isRemote ? 1 : 0)) {
            this.dispense(llllllllllllIllIIlIIIllIIIlllIlI, llllllllllllIllIIlIIIllIIIlllIIl);
        }
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIllIIlIIIllIIIllIIlI, final int llllllllllllIllIIlIIIllIIIllIIIl) {
        return new TileEntityDispenser();
    }
    
    private static boolean lIIllIIllllIlIIl(final Object llllllllllllIllIIlIIIlIIllllIlIl, final Object llllllllllllIllIIlIIIlIIllllIlII) {
        return llllllllllllIllIIlIIIlIIllllIlIl == llllllllllllIllIIlIIIlIIllllIlII;
    }
    
    private static void lIIllIIllllIIlll() {
        (llIlllIlIllIlI = new int[8])[0] = ((0xDA ^ 0x8A) & ~(0xF2 ^ 0xA2));
        BlockDispenser.llIlllIlIllIlI[1] = " ".length();
        BlockDispenser.llIlllIlIllIlI[2] = (0x1 ^ 0x5);
        BlockDispenser.llIlllIlIllIlI[3] = "  ".length();
        BlockDispenser.llIlllIlIllIlI[4] = (0xFFFFBFFD & 0x43EB);
        BlockDispenser.llIlllIlIllIlI[5] = (0x37 ^ 0x44 ^ (0x42 ^ 0x36));
        BlockDispenser.llIlllIlIllIlI[6] = "   ".length();
        BlockDispenser.llIlllIlIllIlI[7] = (1 + 4 + 106 + 47 ^ 38 + 45 - 22 + 89);
    }
    
    static {
        lIIllIIllllIIlll();
        lIIllIIllllIIllI();
        FACING = PropertyDirection.create(BlockDispenser.llIlllIlIllIII[BlockDispenser.llIlllIlIllIlI[0]]);
        TRIGGERED = PropertyBool.create(BlockDispenser.llIlllIlIllIII[BlockDispenser.llIlllIlIllIlI[1]]);
        dispenseBehaviorRegistry = new RegistryDefaulted<Item, IBehaviorDispenseItem>(new BehaviorDefaultDispenseItem());
    }
    
    private static void lIIllIIllllIIllI() {
        (llIlllIlIllIII = new String[BlockDispenser.llIlllIlIllIlI[3]])[BlockDispenser.llIlllIlIllIlI[0]] = lIIllIIllllIIIII("RkBL+jLmJRc=", "Lcjsu");
        BlockDispenser.llIlllIlIllIII[BlockDispenser.llIlllIlIllIlI[1]] = lIIllIIllllIIlIl("JSU+Ly80JTIs", "QWWHH");
    }
}
