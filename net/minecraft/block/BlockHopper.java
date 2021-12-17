// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.stats.StatList;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import com.google.common.base.Predicate;
import net.minecraft.world.IBlockAccess;
import net.minecraft.util.EnumFacing;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.tileentity.TileEntityHopper;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.BlockState;
import net.minecraft.inventory.Container;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;
import net.minecraft.block.properties.PropertyDirection;

public class BlockHopper extends BlockContainer
{
    private static final /* synthetic */ int[] lIIlllIlIIlllI;
    public static final /* synthetic */ PropertyDirection FACING;
    public static final /* synthetic */ PropertyBool ENABLED;
    private static final /* synthetic */ String[] lIIlllIlIIllII;
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIIlIIllllIIlIlllIlI, final BlockPos lllllllllllllIIlIIllllIIlIlllIll) {
        return Container.calcRedstone(lllllllllllllIIlIIllllIIlIlllIlI.getTileEntity(lllllllllllllIIlIIllllIIlIlllIll));
    }
    
    private static void llIllIlllIlIlll() {
        (lIIlllIlIIllII = new String[BlockHopper.lIIlllIlIIlllI[6]])[BlockHopper.lIIlllIlIIlllI[0]] = llIllIlllIlIlIl("vAk0IDNxR0I=", "ccKTf");
        BlockHopper.lIIlllIlIIllII[BlockHopper.lIIlllIlIIlllI[1]] = llIllIlllIlIllI("FS0OLSAVJw==", "pCoOL");
    }
    
    private static void llIllIlllIlllll() {
        (lIIlllIlIIlllI = new int[7])[0] = ((0xB6 ^ 0xA8) & ~(0x91 ^ 0x8F));
        BlockHopper.lIIlllIlIIlllI[1] = " ".length();
        BlockHopper.lIIlllIlIIlllI[2] = (0x89 ^ 0x8D);
        BlockHopper.lIIlllIlIIlllI[3] = "   ".length();
        BlockHopper.lIIlllIlIIlllI[4] = (0x42 ^ 0x45);
        BlockHopper.lIIlllIlIIlllI[5] = (0x1D ^ 0x3C ^ (0x2A ^ 0x3));
        BlockHopper.lIIlllIlIIlllI[6] = "  ".length();
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockHopper.lIIlllIlIIlllI[6]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockHopper.lIIlllIlIIlllI[0]] = BlockHopper.FACING;
        llllllllllllIllllIIIlIlIIlIIIlll[BlockHopper.lIIlllIlIIlllI[1]] = BlockHopper.ENABLED;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIlIIllllIIllIlIIIl, final BlockPos lllllllllllllIIlIIllllIIllIlIIII, final IBlockState lllllllllllllIIlIIllllIIllIIllll) {
        final TileEntity lllllllllllllIIlIIllllIIllIlIIll = lllllllllllllIIlIIllllIIllIlIIIl.getTileEntity(lllllllllllllIIlIIllllIIllIlIIII);
        if (llIllIllllIIIIl((lllllllllllllIIlIIllllIIllIlIIll instanceof TileEntityHopper) ? 1 : 0)) {
            InventoryHelper.dropInventoryItems(lllllllllllllIIlIIllllIIllIlIIIl, lllllllllllllIIlIIllllIIllIlIIII, (IInventory)lllllllllllllIIlIIllllIIllIlIIll);
            lllllllllllllIIlIIllllIIllIlIIIl.updateComparatorOutputLevel(lllllllllllllIIlIIllllIIllIlIIII, this);
        }
        super.breakBlock(lllllllllllllIIlIIllllIIllIlIIIl, lllllllllllllIIlIIllllIIllIlIIII, lllllllllllllIIlIIllllIIllIIllll);
    }
    
    public static EnumFacing getFacing(final int lllllllllllllIIlIIllllIIllIIIlII) {
        return EnumFacing.getFront(lllllllllllllIIlIIllllIIllIIIlII & BlockHopper.lIIlllIlIIlllI[4]);
    }
    
    private void updateState(final World lllllllllllllIIlIIllllIIlllIIlII, final BlockPos lllllllllllllIIlIIllllIIllIlllll, final IBlockState lllllllllllllIIlIIllllIIlllIIIlI) {
        int n;
        if (llIllIllllIIIIl(lllllllllllllIIlIIllllIIlllIIlII.isBlockPowered(lllllllllllllIIlIIllllIIllIlllll) ? 1 : 0)) {
            n = BlockHopper.lIIlllIlIIlllI[0];
            "".length();
            if (-(0x72 ^ 0x77) >= 0) {
                return;
            }
        }
        else {
            n = BlockHopper.lIIlllIlIIlllI[1];
        }
        final boolean lllllllllllllIIlIIllllIIlllIIIIl = n != 0;
        if (llIllIllllIIIlI(lllllllllllllIIlIIllllIIlllIIIIl ? 1 : 0, ((boolean)lllllllllllllIIlIIllllIIlllIIIlI.getValue((IProperty<Boolean>)BlockHopper.ENABLED)) ? 1 : 0)) {
            lllllllllllllIIlIIllllIIlllIIlII.setBlockState(lllllllllllllIIlIIllllIIllIlllll, lllllllllllllIIlIIllllIIlllIIIlI.withProperty((IProperty<Comparable>)BlockHopper.ENABLED, lllllllllllllIIlIIllllIIlllIIIIl), BlockHopper.lIIlllIlIIlllI[2]);
            "".length();
        }
    }
    
    private static boolean llIllIllllIIIII(final Object lllllllllllllIIlIIllllIIIlllllII, final Object lllllllllllllIIlIIllllIIIllllIll) {
        return lllllllllllllIIlIIllllIIIlllllII == lllllllllllllIIlIIllllIIIllllIll;
    }
    
    public static boolean isEnabled(final int lllllllllllllIIlIIllllIIllIIIIIl) {
        if (llIllIllllIIIlI(lllllllllllllIIlIIllllIIllIIIIIl & BlockHopper.lIIlllIlIIlllI[5], BlockHopper.lIIlllIlIIlllI[5])) {
            return BlockHopper.lIIlllIlIIlllI[1] != 0;
        }
        return BlockHopper.lIIlllIlIIlllI[0] != 0;
    }
    
    @Override
    public boolean shouldSideBeRendered(final IBlockAccess lllllllllllllIIlIIllllIIllIIlIIl, final BlockPos lllllllllllllIIlIIllllIIllIIlIII, final EnumFacing lllllllllllllIIlIIllllIIllIIIlll) {
        return BlockHopper.lIIlllIlIIlllI[1] != 0;
    }
    
    static {
        llIllIlllIlllll();
        llIllIlllIlIlll();
        FACING = PropertyDirection.create(BlockHopper.lIIlllIlIIllII[BlockHopper.lIIlllIlIIlllI[0]], (Predicate<EnumFacing>)new Predicate<EnumFacing>() {
            private static final /* synthetic */ int[] lIllllIlIIlIll;
            
            public boolean apply(final EnumFacing llllllllllllIllllIlIIllIlIIlIIIl) {
                if (lIIIIlIIIllIllll(llllllllllllIllllIlIIllIlIIlIIIl, EnumFacing.UP)) {
                    return BlockHopper$1.lIllllIlIIlIll[0] != 0;
                }
                return BlockHopper$1.lIllllIlIIlIll[1] != 0;
            }
            
            private static boolean lIIIIlIIIllIllll(final Object llllllllllllIllllIlIIllIlIIIIlll, final Object llllllllllllIllllIlIIllIlIIIIlIl) {
                return llllllllllllIllllIlIIllIlIIIIlll != llllllllllllIllllIlIIllIlIIIIlIl;
            }
            
            private static void lIIIIlIIIllIllIl() {
                (lIllllIlIIlIll = new int[2])[0] = " ".length();
                BlockHopper$1.lIllllIlIIlIll[1] = (("  ".length() ^ (0x4A ^ 0x58)) & (87 + 45 - 40 + 39 ^ 83 + 29 - 102 + 137 ^ -" ".length()));
            }
            
            static {
                lIIIIlIIIllIllIl();
            }
        });
        ENABLED = PropertyBool.create(BlockHopper.lIIlllIlIIllII[BlockHopper.lIIlllIlIIlllI[1]]);
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIIlIIllllIlIlIIIIll, final BlockPos lllllllllllllIIlIIllllIlIlIIIIlI, final IBlockState lllllllllllllIIlIIllllIlIlIIlIIl, final AxisAlignedBB lllllllllllllIIlIIllllIlIlIIIIII, final List<AxisAlignedBB> lllllllllllllIIlIIllllIlIlIIIlll, final Entity lllllllllllllIIlIIllllIlIIlllllI) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        super.addCollisionBoxesToList(lllllllllllllIIlIIllllIlIlIIIIll, lllllllllllllIIlIIllllIlIlIIIIlI, lllllllllllllIIlIIllllIlIlIIlIIl, lllllllllllllIIlIIllllIlIlIIIIII, lllllllllllllIIlIIllllIlIlIIIlll, lllllllllllllIIlIIllllIlIIlllllI);
        final float lllllllllllllIIlIIllllIlIlIIIlIl = 0.125f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, lllllllllllllIIlIIllllIlIlIIIlIl, 1.0f, 1.0f);
        super.addCollisionBoxesToList(lllllllllllllIIlIIllllIlIlIIIIll, lllllllllllllIIlIIllllIlIlIIIIlI, lllllllllllllIIlIIllllIlIlIIlIIl, lllllllllllllIIlIIllllIlIlIIIIII, lllllllllllllIIlIIllllIlIlIIIlll, lllllllllllllIIlIIllllIlIIlllllI);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, lllllllllllllIIlIIllllIlIlIIIlIl);
        super.addCollisionBoxesToList(lllllllllllllIIlIIllllIlIlIIIIll, lllllllllllllIIlIIllllIlIlIIIIlI, lllllllllllllIIlIIllllIlIlIIlIIl, lllllllllllllIIlIIllllIlIlIIIIII, lllllllllllllIIlIIllllIlIlIIIlll, lllllllllllllIIlIIllllIlIIlllllI);
        this.setBlockBounds(1.0f - lllllllllllllIIlIIllllIlIlIIIlIl, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.addCollisionBoxesToList(lllllllllllllIIlIIllllIlIlIIIIll, lllllllllllllIIlIIllllIlIlIIIIlI, lllllllllllllIIlIIllllIlIlIIlIIl, lllllllllllllIIlIIllllIlIlIIIIII, lllllllllllllIIlIIllllIlIlIIIlll, lllllllllllllIIlIIllllIlIIlllllI);
        this.setBlockBounds(0.0f, 0.0f, 1.0f - lllllllllllllIIlIIllllIlIlIIIlIl, 1.0f, 1.0f, 1.0f);
        super.addCollisionBoxesToList(lllllllllllllIIlIIllllIlIlIIIIll, lllllllllllllIIlIIllllIlIlIIIIlI, lllllllllllllIIlIIllllIlIlIIlIIl, lllllllllllllIIlIIllllIlIlIIIIII, lllllllllllllIIlIIllllIlIlIIIlll, lllllllllllllIIlIIllllIlIIlllllI);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT_MIPPED;
    }
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIlIIllllIIlllllIlI, final BlockPos lllllllllllllIIlIIllllIlIIIIIIlI, final IBlockState lllllllllllllIIlIIllllIlIIIIIIIl, final EntityPlayer lllllllllllllIIlIIllllIlIIIIIIII, final EnumFacing lllllllllllllIIlIIllllIIllllllll, final float lllllllllllllIIlIIllllIIlllllllI, final float lllllllllllllIIlIIllllIIllllllIl, final float lllllllllllllIIlIIllllIIllllllII) {
        if (llIllIllllIIIIl(lllllllllllllIIlIIllllIIlllllIlI.isRemote ? 1 : 0)) {
            return BlockHopper.lIIlllIlIIlllI[1] != 0;
        }
        final TileEntity lllllllllllllIIlIIllllIIlllllIll = lllllllllllllIIlIIllllIIlllllIlI.getTileEntity(lllllllllllllIIlIIllllIlIIIIIIlI);
        if (llIllIllllIIIIl((lllllllllllllIIlIIllllIIlllllIll instanceof TileEntityHopper) ? 1 : 0)) {
            lllllllllllllIIlIIllllIlIIIIIIII.displayGUIChest((IInventory)lllllllllllllIIlIIllllIIlllllIll);
            lllllllllllllIIlIIllllIlIIIIIIII.triggerAchievement(StatList.field_181732_P);
        }
        return BlockHopper.lIIlllIlIIlllI[1] != 0;
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockHopper.lIIlllIlIIlllI[1] != 0;
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIIlIIllllIlIIIllIlI, final BlockPos lllllllllllllIIlIIllllIlIIIllIIl, final IBlockState lllllllllllllIIlIIllllIlIIIlllll, final EntityLivingBase lllllllllllllIIlIIllllIlIIIllllI, final ItemStack lllllllllllllIIlIIllllIlIIIlIllI) {
        super.onBlockPlacedBy(lllllllllllllIIlIIllllIlIIIllIlI, lllllllllllllIIlIIllllIlIIIllIIl, lllllllllllllIIlIIllllIlIIIlllll, lllllllllllllIIlIIllllIlIIIllllI, lllllllllllllIIlIIllllIlIIIlIllI);
        if (llIllIllllIIIIl(lllllllllllllIIlIIllllIlIIIlIllI.hasDisplayName() ? 1 : 0)) {
            final TileEntity lllllllllllllIIlIIllllIlIIIlllII = lllllllllllllIIlIIllllIlIIIllIlI.getTileEntity(lllllllllllllIIlIIllllIlIIIllIIl);
            if (llIllIllllIIIIl((lllllllllllllIIlIIllllIlIIIlllII instanceof TileEntityHopper) ? 1 : 0)) {
                ((TileEntityHopper)lllllllllllllIIlIIllllIlIIIlllII).setCustomName(lllllllllllllIIlIIllllIlIIIlIllI.getDisplayName());
            }
        }
    }
    
    private static boolean llIllIllllIIlII(final int lllllllllllllIIlIIllllIIlIIIIIII, final int lllllllllllllIIlIIllllIIIlllllll) {
        return lllllllllllllIIlIIllllIIlIIIIIII < lllllllllllllIIlIIllllIIIlllllll;
    }
    
    @Override
    public void onNeighborBlockChange(final World lllllllllllllIIlIIllllIIlllIllII, final BlockPos lllllllllllllIIlIIllllIIllllIIII, final IBlockState lllllllllllllIIlIIllllIIlllIllll, final Block lllllllllllllIIlIIllllIIlllIlllI) {
        this.updateState(lllllllllllllIIlIIllllIIlllIllII, lllllllllllllIIlIIllllIIllllIIII, lllllllllllllIIlIIllllIIlllIllll);
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIllllIIlIlIlllI) {
        int lllllllllllllIIlIIllllIIlIlIllIl = BlockHopper.lIIlllIlIIlllI[0];
        lllllllllllllIIlIIllllIIlIlIllIl |= lllllllllllllIIlIIllllIIlIlIlllI.getValue((IProperty<EnumFacing>)BlockHopper.FACING).getIndex();
        if (llIllIllllIIIll(((boolean)lllllllllllllIIlIIllllIIlIlIlllI.getValue((IProperty<Boolean>)BlockHopper.ENABLED)) ? 1 : 0)) {
            lllllllllllllIIlIIllllIIlIlIllIl |= BlockHopper.lIIlllIlIIlllI[5];
        }
        return lllllllllllllIIlIIllllIIlIlIllIl;
    }
    
    @Override
    public int getRenderType() {
        return BlockHopper.lIIlllIlIIlllI[3];
    }
    
    private static boolean llIllIllllIIIlI(final int lllllllllllllIIlIIllllIIIlllIlII, final int lllllllllllllIIlIIllllIIIlllIIll) {
        return lllllllllllllIIlIIllllIIIlllIlII != lllllllllllllIIlIIllllIIIlllIIll;
    }
    
    @Override
    public IBlockState onBlockPlaced(final World lllllllllllllIIlIIllllIlIIlllIII, final BlockPos lllllllllllllIIlIIllllIlIIllIlll, final EnumFacing lllllllllllllIIlIIllllIlIIlIlllI, final float lllllllllllllIIlIIllllIlIIllIlIl, final float lllllllllllllIIlIIllllIlIIllIlII, final float lllllllllllllIIlIIllllIlIIllIIll, final int lllllllllllllIIlIIllllIlIIllIIlI, final EntityLivingBase lllllllllllllIIlIIllllIlIIllIIIl) {
        EnumFacing lllllllllllllIIlIIllllIlIIllIIII = lllllllllllllIIlIIllllIlIIlIlllI.getOpposite();
        if (llIllIllllIIIII(lllllllllllllIIlIIllllIlIIllIIII, EnumFacing.UP)) {
            lllllllllllllIIlIIllllIlIIllIIII = EnumFacing.DOWN;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockHopper.FACING, lllllllllllllIIlIIllllIlIIllIIII).withProperty((IProperty<Comparable>)BlockHopper.ENABLED, (boolean)(BlockHopper.lIIlllIlIIlllI[1] != 0));
    }
    
    @Override
    public void onBlockAdded(final World lllllllllllllIIlIIllllIlIIIIllll, final BlockPos lllllllllllllIIlIIllllIlIIIIlIlI, final IBlockState lllllllllllllIIlIIllllIlIIIIllIl) {
        this.updateState(lllllllllllllIIlIIllllIlIIIIllll, lllllllllllllIIlIIllllIlIIIIlIlI, lllllllllllllIIlIIllllIlIIIIllIl);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockHopper.lIIlllIlIIlllI[0] != 0;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIllllIIlIllIIlI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockHopper.FACING, getFacing(lllllllllllllIIlIIllllIIlIllIIlI)).withProperty((IProperty<Comparable>)BlockHopper.ENABLED, isEnabled(lllllllllllllIIlIIllllIIlIllIIlI));
    }
    
    @Override
    public void setBlockBoundsBasedOnState(final IBlockAccess lllllllllllllIIlIIllllIlIlIlIlll, final BlockPos lllllllllllllIIlIIllllIlIlIlIllI) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockHopper.lIIlllIlIIlllI[0] != 0;
    }
    
    private static boolean llIllIllllIIIll(final int lllllllllllllIIlIIllllIIIlllIlll) {
        return lllllllllllllIIlIIllllIIIlllIlll == 0;
    }
    
    private static String llIllIlllIlIlIl(final String lllllllllllllIIlIIllllIIlIIIIllI, final String lllllllllllllIIlIIllllIIlIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlIIllllIIlIIIlIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIllllIIlIIIIlll.getBytes(StandardCharsets.UTF_8)), BlockHopper.lIIlllIlIIlllI[5]), "DES");
            final Cipher lllllllllllllIIlIIllllIIlIIIlIlI = Cipher.getInstance("DES");
            lllllllllllllIIlIIllllIIlIIIlIlI.init(BlockHopper.lIIlllIlIIlllI[6], lllllllllllllIIlIIllllIIlIIIlIll);
            return new String(lllllllllllllIIlIIllllIIlIIIlIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIllllIIlIIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIllllIIlIIIlIIl) {
            lllllllllllllIIlIIllllIIlIIIlIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIllllIIIIl(final int lllllllllllllIIlIIllllIIIllllIIl) {
        return lllllllllllllIIlIIllllIIIllllIIl != 0;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIlIIllllIlIIlIlIll, final int lllllllllllllIIlIIllllIlIIlIlIlI) {
        return new TileEntityHopper();
    }
    
    public BlockHopper() {
        super(Material.iron, MapColor.stoneColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockHopper.FACING, EnumFacing.DOWN).withProperty((IProperty<Comparable>)BlockHopper.ENABLED, (boolean)(BlockHopper.lIIlllIlIIlllI[1] != 0)));
        this.setCreativeTab(CreativeTabs.tabRedstone);
        "".length();
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static String llIllIlllIlIllI(String lllllllllllllIIlIIllllIIlIIllIII, final String lllllllllllllIIlIIllllIIlIIlIlll) {
        lllllllllllllIIlIIllllIIlIIllIII = (byte)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIllllIIlIIllIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIllllIIlIIllIll = new StringBuilder();
        final char[] lllllllllllllIIlIIllllIIlIIllIlI = lllllllllllllIIlIIllllIIlIIlIlll.toCharArray();
        int lllllllllllllIIlIIllllIIlIIllIIl = BlockHopper.lIIlllIlIIlllI[0];
        final int lllllllllllllIIlIIllllIIlIIlIIll = (Object)((String)lllllllllllllIIlIIllllIIlIIllIII).toCharArray();
        final Exception lllllllllllllIIlIIllllIIlIIlIIlI = (Exception)lllllllllllllIIlIIllllIIlIIlIIll.length;
        short lllllllllllllIIlIIllllIIlIIlIIIl = (short)BlockHopper.lIIlllIlIIlllI[0];
        while (llIllIllllIIlII(lllllllllllllIIlIIllllIIlIIlIIIl, (int)lllllllllllllIIlIIllllIIlIIlIIlI)) {
            final char lllllllllllllIIlIIllllIIlIIllllI = lllllllllllllIIlIIllllIIlIIlIIll[lllllllllllllIIlIIllllIIlIIlIIIl];
            lllllllllllllIIlIIllllIIlIIllIll.append((char)(lllllllllllllIIlIIllllIIlIIllllI ^ lllllllllllllIIlIIllllIIlIIllIlI[lllllllllllllIIlIIllllIIlIIllIIl % lllllllllllllIIlIIllllIIlIIllIlI.length]));
            "".length();
            ++lllllllllllllIIlIIllllIIlIIllIIl;
            ++lllllllllllllIIlIIllllIIlIIlIIIl;
            "".length();
            if (-" ".length() >= (75 + 20 - 58 + 90 ^ (0x54 ^ 0x2F))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIllllIIlIIllIll);
    }
}
