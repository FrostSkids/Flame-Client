// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import com.google.common.base.Predicate;
import net.minecraft.inventory.InventoryEnderChest;
import net.minecraft.stats.StatList;
import net.minecraft.inventory.IInventory;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumParticleTypes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.tileentity.TileEntityEnderChest;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import java.util.Random;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.properties.IProperty;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.PropertyDirection;

public class BlockEnderChest extends BlockContainer
{
    private static final /* synthetic */ String[] llIIIIIIlIIIll;
    private static final /* synthetic */ int[] llIIIIIIlIIlII;
    public static final /* synthetic */ PropertyDirection FACING;
    
    protected BlockEnderChest() {
        super(Material.rock);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockEnderChest.FACING, EnumFacing.NORTH));
        this.setCreativeTab(CreativeTabs.tabDecorations);
        "".length();
        this.setBlockBounds(0.0625f, 0.0f, 0.0625f, 0.9375f, 0.875f, 0.9375f);
    }
    
    @Override
    public IBlockState onBlockPlaced(final World llllllllllllIlllIllllllIllIllIIl, final BlockPos llllllllllllIlllIllllllIllIllIII, final EnumFacing llllllllllllIlllIllllllIllIlIlll, final float llllllllllllIlllIllllllIllIlIllI, final float llllllllllllIlllIllllllIllIlIlIl, final float llllllllllllIlllIllllllIllIlIlII, final int llllllllllllIlllIllllllIllIlIIll, final EntityLivingBase llllllllllllIlllIllllllIllIlIIlI) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockEnderChest.FACING, llllllllllllIlllIllllllIllIlIIlI.getHorizontalFacing().getOpposite());
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockEnderChest.llIIIIIIlIIlII[0] != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlllIllllllIlllIIIlI, final Random llllllllllllIlllIllllllIlllIIIIl, final int llllllllllllIlllIllllllIlllIIIII) {
        return Item.getItemFromBlock(Blocks.obsidian);
    }
    
    @Override
    protected boolean canSilkHarvest() {
        return BlockEnderChest.llIIIIIIlIIlII[3] != 0;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World llllllllllllIlllIllllllIlIlIlIll, final int llllllllllllIlllIllllllIlIlIlIlI) {
        return new TileEntityEnderChest();
    }
    
    private static String lIIIIllIllIlIIll(final String llllllllllllIlllIllllllIIllIlIlI, final String llllllllllllIlllIllllllIIllIlIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllllllIIllIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllllllIIllIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllllllIIllIlllI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllllllIIllIlllI.init(BlockEnderChest.llIIIIIIlIIlII[1], llllllllllllIlllIllllllIIllIllll);
            return new String(llllllllllllIlllIllllllIIllIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllllllIIllIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllllllIIllIllIl) {
            llllllllllllIlllIllllllIIllIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlllIllllllIIllllIII) {
        return llllllllllllIlllIllllllIIllllIII.getValue((IProperty<EnumFacing>)BlockEnderChest.FACING).getIndex();
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlllIllllllIIlllllll) {
        EnumFacing llllllllllllIlllIllllllIIllllllI = EnumFacing.getFront(llllllllllllIlllIllllllIIlllllll);
        if (lIIIIllIllIllIlI(llllllllllllIlllIllllllIIllllllI.getAxis(), EnumFacing.Axis.Y)) {
            llllllllllllIlllIllllllIIllllllI = EnumFacing.NORTH;
        }
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockEnderChest.FACING, llllllllllllIlllIllllllIIllllllI);
    }
    
    private static boolean lIIIIllIllIllIlI(final Object llllllllllllIlllIllllllIIlIllllI, final Object llllllllllllIlllIllllllIIlIlllIl) {
        return llllllllllllIlllIllllllIIlIllllI == llllllllllllIlllIllllllIIlIlllIl;
    }
    
    private static void lIIIIllIllIlIllI() {
        (llIIIIIIlIIlII = new int[5])[0] = ((0x53 ^ 0x14) & ~(0x77 ^ 0x30));
        BlockEnderChest.llIIIIIIlIIlII[1] = "  ".length();
        BlockEnderChest.llIIIIIIlIIlII[2] = (0xAA ^ 0xA0 ^ "  ".length());
        BlockEnderChest.llIIIIIIlIIlII[3] = " ".length();
        BlockEnderChest.llIIIIIIlIIlII[4] = "   ".length();
    }
    
    @Override
    public void randomDisplayTick(final World llllllllllllIlllIllllllIlIIIlllI, final BlockPos llllllllllllIlllIllllllIlIIllIll, final IBlockState llllllllllllIlllIllllllIlIIllIlI, final Random llllllllllllIlllIllllllIlIIIlIll) {
        int llllllllllllIlllIllllllIlIIllIII = BlockEnderChest.llIIIIIIlIIlII[0];
        "".length();
        if (((0x66 ^ 0x7F ^ (0x43 ^ 0x1)) & (0x5F ^ 0x3A ^ (0xBB ^ 0x85) ^ -" ".length())) != 0x0) {
            return;
        }
        while (!lIIIIllIllIllIIl(llllllllllllIlllIllllllIlIIllIII, BlockEnderChest.llIIIIIIlIIlII[4])) {
            final int llllllllllllIlllIllllllIlIIlIlll = llllllllllllIlllIllllllIlIIIlIll.nextInt(BlockEnderChest.llIIIIIIlIIlII[1]) * BlockEnderChest.llIIIIIIlIIlII[1] - BlockEnderChest.llIIIIIIlIIlII[3];
            final int llllllllllllIlllIllllllIlIIlIllI = llllllllllllIlllIllllllIlIIIlIll.nextInt(BlockEnderChest.llIIIIIIlIIlII[1]) * BlockEnderChest.llIIIIIIlIIlII[1] - BlockEnderChest.llIIIIIIlIIlII[3];
            final double llllllllllllIlllIllllllIlIIlIlIl = llllllllllllIlllIllllllIlIIllIll.getX() + 0.5 + 0.25 * llllllllllllIlllIllllllIlIIlIlll;
            final double llllllllllllIlllIllllllIlIIlIlII = llllllllllllIlllIllllllIlIIllIll.getY() + llllllllllllIlllIllllllIlIIIlIll.nextFloat();
            final double llllllllllllIlllIllllllIlIIlIIll = llllllllllllIlllIllllllIlIIllIll.getZ() + 0.5 + 0.25 * llllllllllllIlllIllllllIlIIlIllI;
            final double llllllllllllIlllIllllllIlIIlIIlI = llllllllllllIlllIllllllIlIIIlIll.nextFloat() * llllllllllllIlllIllllllIlIIlIlll;
            final double llllllllllllIlllIllllllIlIIlIIIl = (llllllllllllIlllIllllllIlIIIlIll.nextFloat() - 0.5) * 0.125;
            final double llllllllllllIlllIllllllIlIIlIIII = llllllllllllIlllIllllllIlIIIlIll.nextFloat() * llllllllllllIlllIllllllIlIIlIllI;
            llllllllllllIlllIllllllIlIIIlllI.spawnParticle(EnumParticleTypes.PORTAL, llllllllllllIlllIllllllIlIIlIlIl, llllllllllllIlllIllllllIlIIlIlII, llllllllllllIlllIllllllIlIIlIIll, llllllllllllIlllIllllllIlIIlIIlI, llllllllllllIlllIllllllIlIIlIIIl, llllllllllllIlllIllllllIlIIlIIII, new int[BlockEnderChest.llIIIIIIlIIlII[0]]);
            ++llllllllllllIlllIllllllIlIIllIII;
        }
    }
    
    @Override
    public void onBlockPlacedBy(final World llllllllllllIlllIllllllIllIIlIlI, final BlockPos llllllllllllIlllIllllllIllIIlIIl, final IBlockState llllllllllllIlllIllllllIllIIIIll, final EntityLivingBase llllllllllllIlllIllllllIllIIIlll, final ItemStack llllllllllllIlllIllllllIllIIIllI) {
        llllllllllllIlllIllllllIllIIlIlI.setBlockState(llllllllllllIlllIllllllIllIIlIIl, llllllllllllIlllIllllllIllIIIIll.withProperty((IProperty<Comparable>)BlockEnderChest.FACING, llllllllllllIlllIllllllIllIIIlll.getHorizontalFacing().getOpposite()), BlockEnderChest.llIIIIIIlIIlII[1]);
        "".length();
    }
    
    private static boolean lIIIIllIllIllIIl(final int llllllllllllIlllIllllllIIllIIlII, final int llllllllllllIlllIllllllIIllIIIll) {
        return llllllllllllIlllIllllllIIllIIlII >= llllllllllllIlllIllllllIIllIIIll;
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockEnderChest.llIIIIIIlIIlII[3]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockEnderChest.llIIIIIIlIIlII[0]] = BlockEnderChest.FACING;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public boolean isFullCube() {
        return BlockEnderChest.llIIIIIIlIIlII[0] != 0;
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIlllIllllllIlIlllIll, final BlockPos llllllllllllIlllIllllllIlIlllIlI, final IBlockState llllllllllllIlllIllllllIlIlllIIl, final EntityPlayer llllllllllllIlllIllllllIlIlllIII, final EnumFacing llllllllllllIlllIllllllIlIllIlll, final float llllllllllllIlllIllllllIlIllIllI, final float llllllllllllIlllIllllllIlIllIlIl, final float llllllllllllIlllIllllllIlIllIlII) {
        final InventoryEnderChest llllllllllllIlllIllllllIlIllIIll = llllllllllllIlllIllllllIlIlllIII.getInventoryEnderChest();
        final TileEntity llllllllllllIlllIllllllIlIllIIlI = llllllllllllIlllIllllllIlIlllIll.getTileEntity(llllllllllllIlllIllllllIlIlllIlI);
        if (!lIIIIllIllIlIlll(llllllllllllIlllIllllllIlIllIIll) || !lIIIIllIllIllIII((llllllllllllIlllIllllllIlIllIIlI instanceof TileEntityEnderChest) ? 1 : 0)) {
            return BlockEnderChest.llIIIIIIlIIlII[3] != 0;
        }
        if (lIIIIllIllIllIII(llllllllllllIlllIllllllIlIlllIll.getBlockState(llllllllllllIlllIllllllIlIlllIlI.up()).getBlock().isNormalCube() ? 1 : 0)) {
            return BlockEnderChest.llIIIIIIlIIlII[3] != 0;
        }
        if (lIIIIllIllIllIII(llllllllllllIlllIllllllIlIlllIll.isRemote ? 1 : 0)) {
            return BlockEnderChest.llIIIIIIlIIlII[3] != 0;
        }
        llllllllllllIlllIllllllIlIllIIll.setChestTileEntity((TileEntityEnderChest)llllllllllllIlllIllllllIlIllIIlI);
        llllllllllllIlllIllllllIlIlllIII.displayGUIChest(llllllllllllIlllIllllllIlIllIIll);
        llllllllllllIlllIllllllIlIlllIII.triggerAchievement(StatList.field_181738_V);
        return BlockEnderChest.llIIIIIIlIIlII[3] != 0;
    }
    
    @Override
    public int quantityDropped(final Random llllllllllllIlllIllllllIllIllllI) {
        return BlockEnderChest.llIIIIIIlIIlII[2];
    }
    
    static {
        lIIIIllIllIlIllI();
        lIIIIllIllIlIlIl();
        FACING = PropertyDirection.create(BlockEnderChest.llIIIIIIlIIIll[BlockEnderChest.llIIIIIIlIIlII[0]], (Predicate<EnumFacing>)EnumFacing.Plane.HORIZONTAL);
    }
    
    private static void lIIIIllIllIlIlIl() {
        (llIIIIIIlIIIll = new String[BlockEnderChest.llIIIIIIlIIlII[3]])[BlockEnderChest.llIIIIIIlIIlII[0]] = lIIIIllIllIlIIll("6raUboFvPbg=", "lwuNU");
    }
    
    @Override
    public int getRenderType() {
        return BlockEnderChest.llIIIIIIlIIlII[1];
    }
    
    private static boolean lIIIIllIllIlIlll(final Object llllllllllllIlllIllllllIIllIIIIl) {
        return llllllllllllIlllIllllllIIllIIIIl != null;
    }
    
    private static boolean lIIIIllIllIllIII(final int llllllllllllIlllIllllllIIlIllIll) {
        return llllllllllllIlllIllllllIIlIllIll != 0;
    }
}
