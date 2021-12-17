// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import net.minecraft.util.EnumParticleTypes;
import net.minecraft.block.state.BlockState;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.inventory.InventoryHelper;
import net.minecraft.inventory.Container;
import net.minecraft.block.properties.IProperty;
import java.util.Random;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.entity.Entity;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.StatCollector;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.stats.StatList;
import net.minecraft.inventory.IInventory;
import net.minecraft.tileentity.TileEntityBrewingStand;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.properties.PropertyBool;

public class BlockBrewingStand extends BlockContainer
{
    public static final /* synthetic */ PropertyBool[] HAS_BOTTLE;
    private static final /* synthetic */ String[] lIIllllIIllIlI;
    private static final /* synthetic */ int[] lIIllllIIlllII;
    
    @Override
    public boolean onBlockActivated(final World lllllllllllllIIlIIlIllIIIIlIlIll, final BlockPos lllllllllllllIIlIIlIllIIIIllIIll, final IBlockState lllllllllllllIIlIIlIllIIIIllIIlI, final EntityPlayer lllllllllllllIIlIIlIllIIIIlIlIIl, final EnumFacing lllllllllllllIIlIIlIllIIIIllIIII, final float lllllllllllllIIlIIlIllIIIIlIllll, final float lllllllllllllIIlIIlIllIIIIlIlllI, final float lllllllllllllIIlIIlIllIIIIlIllIl) {
        if (llIlllIllIlllIl(lllllllllllllIIlIIlIllIIIIlIlIll.isRemote ? 1 : 0)) {
            return BlockBrewingStand.lIIllllIIlllII[2] != 0;
        }
        final TileEntity lllllllllllllIIlIIlIllIIIIlIllII = lllllllllllllIIlIIlIllIIIIlIlIll.getTileEntity(lllllllllllllIIlIIlIllIIIIllIIll);
        if (llIlllIllIlllIl((lllllllllllllIIlIIlIllIIIIlIllII instanceof TileEntityBrewingStand) ? 1 : 0)) {
            lllllllllllllIIlIIlIllIIIIlIlIIl.displayGUIChest((IInventory)lllllllllllllIIlIIlIllIIIIlIllII);
            lllllllllllllIIlIIlIllIIIIlIlIIl.triggerAchievement(StatList.field_181729_M);
        }
        return BlockBrewingStand.lIIllllIIlllII[2] != 0;
    }
    
    private static boolean llIlllIlllIIIII(final int lllllllllllllIIlIIlIlIlllIlIIIIl, final int lllllllllllllIIlIIlIlIlllIlIIIII) {
        return lllllllllllllIIlIIlIlIlllIlIIIIl < lllllllllllllIIlIIlIlIlllIlIIIII;
    }
    
    @Override
    public String getLocalizedName() {
        return StatCollector.translateToLocal(BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[0]]);
    }
    
    @Override
    public void addCollisionBoxesToList(final World lllllllllllllIIlIIlIllIIIlIIIIlI, final BlockPos lllllllllllllIIlIIlIllIIIlIIlIII, final IBlockState lllllllllllllIIlIIlIllIIIlIIIlll, final AxisAlignedBB lllllllllllllIIlIIlIllIIIIllllll, final List<AxisAlignedBB> lllllllllllllIIlIIlIllIIIIlllllI, final Entity lllllllllllllIIlIIlIllIIIIllllIl) {
        this.setBlockBounds(0.4375f, 0.0f, 0.4375f, 0.5625f, 0.875f, 0.5625f);
        super.addCollisionBoxesToList(lllllllllllllIIlIIlIllIIIlIIIIlI, lllllllllllllIIlIIlIllIIIlIIlIII, lllllllllllllIIlIIlIllIIIlIIIlll, lllllllllllllIIlIIlIllIIIIllllll, lllllllllllllIIlIIlIllIIIIlllllI, lllllllllllllIIlIIlIllIIIIllllIl);
        this.setBlockBoundsForItemRender();
        super.addCollisionBoxesToList(lllllllllllllIIlIIlIllIIIlIIIIlI, lllllllllllllIIlIIlIllIIIlIIlIII, lllllllllllllIIlIIlIllIIIlIIIlll, lllllllllllllIIlIIlIllIIIIllllll, lllllllllllllIIlIIlIllIIIIlllllI, lllllllllllllIIlIIlIllIIIIllllIl);
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockBrewingStand.lIIllllIIlllII[1] != 0;
    }
    
    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
    
    @Override
    public Item getItem(final World lllllllllllllIIlIIlIlIllllllIIII, final BlockPos lllllllllllllIIlIIlIlIlllllIllll) {
        return Items.brewing_stand;
    }
    
    private static void llIlllIllIlllII() {
        (lIIllllIIlllII = new int[5])[0] = "   ".length();
        BlockBrewingStand.lIIllllIIlllII[1] = ((138 + 221 - 132 + 22 ^ 0 + 64 - 49 + 139) & (0x1D ^ 0x38 ^ (0x31 ^ 0x77) ^ -" ".length()));
        BlockBrewingStand.lIIllllIIlllII[2] = " ".length();
        BlockBrewingStand.lIIllllIIlllII[3] = "  ".length();
        BlockBrewingStand.lIIllllIIlllII[4] = (117 + 70 - 160 + 168 ^ 154 + 67 - 35 + 13);
    }
    
    @Override
    public int getRenderType() {
        return BlockBrewingStand.lIIllllIIlllII[0];
    }
    
    private static String llIlllIllIlIlII(final String lllllllllllllIIlIIlIlIlllIlIlIll, final String lllllllllllllIIlIIlIlIlllIlIllII) {
        try {
            final SecretKeySpec lllllllllllllIIlIIlIlIlllIllIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIIlIlIlllIlIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIIlIlIlllIlIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIIlIlIlllIlIllll.init(BlockBrewingStand.lIIllllIIlllII[3], lllllllllllllIIlIIlIlIlllIllIIII);
            return new String(lllllllllllllIIlIIlIlIlllIlIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIIlIlIlllIlIlIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIIlIlIlllIlIlllI) {
            lllllllllllllIIlIIlIlIlllIlIlllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public Item getItemDropped(final IBlockState lllllllllllllIIlIIlIlIllllllIlII, final Random lllllllllllllIIlIIlIlIllllllIIll, final int lllllllllllllIIlIIlIlIllllllIIlI) {
        return Items.brewing_stand;
    }
    
    @Override
    public IBlockState getStateFromMeta(final int lllllllllllllIIlIIlIlIlllllIIIII) {
        IBlockState lllllllllllllIIlIIlIlIllllIlllll = this.getDefaultState();
        int lllllllllllllIIlIIlIlIllllIllllI = BlockBrewingStand.lIIllllIIlllII[1];
        "".length();
        if ((0x90 ^ 0xC2 ^ (0x6A ^ 0x3C)) < "  ".length()) {
            return null;
        }
        while (!llIlllIllIlllll(lllllllllllllIIlIIlIlIllllIllllI, BlockBrewingStand.lIIllllIIlllII[0])) {
            final IBlockState blockState = lllllllllllllIIlIIlIlIllllIlllll;
            final PropertyBool propertyBool = BlockBrewingStand.HAS_BOTTLE[lllllllllllllIIlIIlIlIllllIllllI];
            int b;
            if (llIlllIllIllllI(lllllllllllllIIlIIlIlIlllllIIIII & BlockBrewingStand.lIIllllIIlllII[2] << lllllllllllllIIlIIlIlIllllIllllI)) {
                b = BlockBrewingStand.lIIllllIIlllII[2];
                "".length();
                if (-"   ".length() >= 0) {
                    return null;
                }
            }
            else {
                b = BlockBrewingStand.lIIllllIIlllII[1];
            }
            lllllllllllllIIlIIlIlIllllIlllll = blockState.withProperty((IProperty<Comparable>)propertyBool, (boolean)(b != 0));
            ++lllllllllllllIIlIIlIlIllllIllllI;
        }
        return lllllllllllllIIlIIlIlIllllIlllll;
    }
    
    @Override
    public int getMetaFromState(final IBlockState lllllllllllllIIlIIlIlIllllIlIlIl) {
        int lllllllllllllIIlIIlIlIllllIlIlII = BlockBrewingStand.lIIllllIIlllII[1];
        int lllllllllllllIIlIIlIlIllllIlIIll = BlockBrewingStand.lIIllllIIlllII[1];
        "".length();
        if (" ".length() <= -" ".length()) {
            return (45 + 1 - 34 + 119 ^ 63 + 74 - 86 + 142) & (0x71 ^ 0x7B ^ (0x1A ^ 0x52) ^ -" ".length());
        }
        while (!llIlllIllIlllll(lllllllllllllIIlIIlIlIllllIlIIll, BlockBrewingStand.lIIllllIIlllII[0])) {
            if (llIlllIllIlllIl(((boolean)lllllllllllllIIlIIlIlIllllIlIlIl.getValue((IProperty<Boolean>)BlockBrewingStand.HAS_BOTTLE[lllllllllllllIIlIIlIlIllllIlIIll])) ? 1 : 0)) {
                lllllllllllllIIlIIlIlIllllIlIlII |= BlockBrewingStand.lIIllllIIlllII[2] << lllllllllllllIIlIIlIlIllllIlIIll;
            }
            ++lllllllllllllIIlIIlIlIllllIlIIll;
        }
        return lllllllllllllIIlIIlIlIllllIlIlII;
    }
    
    @Override
    public int getComparatorInputOverride(final World lllllllllllllIIlIIlIlIlllllIlIII, final BlockPos lllllllllllllIIlIIlIlIlllllIIlll) {
        return Container.calcRedstone(lllllllllllllIIlIIlIlIlllllIlIII.getTileEntity(lllllllllllllIIlIIlIlIlllllIIlll));
    }
    
    static {
        llIlllIllIlllII();
        llIlllIllIlIlll();
        final PropertyBool[] has_BOTTLE = new PropertyBool[BlockBrewingStand.lIIllllIIlllII[0]];
        has_BOTTLE[BlockBrewingStand.lIIllllIIlllII[1]] = PropertyBool.create(BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[1]]);
        has_BOTTLE[BlockBrewingStand.lIIllllIIlllII[2]] = PropertyBool.create(BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[2]]);
        has_BOTTLE[BlockBrewingStand.lIIllllIIlllII[3]] = PropertyBool.create(BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[3]]);
        HAS_BOTTLE = has_BOTTLE;
    }
    
    @Override
    public TileEntity createNewTileEntity(final World lllllllllllllIIlIIlIllIIIlIlIlII, final int lllllllllllllIIlIIlIllIIIlIlIIll) {
        return new TileEntityBrewingStand();
    }
    
    private static boolean llIlllIllIllllI(final int lllllllllllllIIlIIlIlIlllIIlllII) {
        return lllllllllllllIIlIIlIlIlllIIlllII > 0;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockBrewingStand.lIIllllIIlllII[1] != 0;
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
    }
    
    @Override
    public void breakBlock(final World lllllllllllllIIlIIlIlIlllllllllI, final BlockPos lllllllllllllIIlIIlIlIlllllllIII, final IBlockState lllllllllllllIIlIIlIlIllllllIlll) {
        final TileEntity lllllllllllllIIlIIlIlIlllllllIll = lllllllllllllIIlIIlIlIlllllllllI.getTileEntity(lllllllllllllIIlIIlIlIlllllllIII);
        if (llIlllIllIlllIl((lllllllllllllIIlIIlIlIlllllllIll instanceof TileEntityBrewingStand) ? 1 : 0)) {
            InventoryHelper.dropInventoryItems(lllllllllllllIIlIIlIlIlllllllllI, lllllllllllllIIlIIlIlIlllllllIII, (IInventory)lllllllllllllIIlIIlIlIlllllllIll);
        }
        super.breakBlock(lllllllllllllIIlIIlIlIlllllllllI, lllllllllllllIIlIIlIlIlllllllIII, lllllllllllllIIlIIlIlIllllllIlll);
    }
    
    @Override
    public void onBlockPlacedBy(final World lllllllllllllIIlIIlIllIIIIlIIIlI, final BlockPos lllllllllllllIIlIIlIllIIIIIllIll, final IBlockState lllllllllllllIIlIIlIllIIIIlIIIII, final EntityLivingBase lllllllllllllIIlIIlIllIIIIIlllll, final ItemStack lllllllllllllIIlIIlIllIIIIIllllI) {
        if (llIlllIllIlllIl(lllllllllllllIIlIIlIllIIIIIllllI.hasDisplayName() ? 1 : 0)) {
            final TileEntity lllllllllllllIIlIIlIllIIIIIlllIl = lllllllllllllIIlIIlIllIIIIlIIIlI.getTileEntity(lllllllllllllIIlIIlIllIIIIIllIll);
            if (llIlllIllIlllIl((lllllllllllllIIlIIlIllIIIIIlllIl instanceof TileEntityBrewingStand) ? 1 : 0)) {
                ((TileEntityBrewingStand)lllllllllllllIIlIIlIllIIIIIlllIl).setName(lllllllllllllIIlIIlIllIIIIIllllI.getDisplayName());
            }
        }
    }
    
    public BlockBrewingStand() {
        super(Material.iron);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockBrewingStand.HAS_BOTTLE[BlockBrewingStand.lIIllllIIlllII[1]], (boolean)(BlockBrewingStand.lIIllllIIlllII[1] != 0)).withProperty((IProperty<Comparable>)BlockBrewingStand.HAS_BOTTLE[BlockBrewingStand.lIIllllIIlllII[2]], (boolean)(BlockBrewingStand.lIIllllIIlllII[1] != 0)).withProperty((IProperty<Comparable>)BlockBrewingStand.HAS_BOTTLE[BlockBrewingStand.lIIllllIIlllII[3]], (boolean)(BlockBrewingStand.lIIllllIIlllII[1] != 0)));
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockBrewingStand.lIIllllIIlllII[0]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockBrewingStand.lIIllllIIlllII[1]] = BlockBrewingStand.HAS_BOTTLE[BlockBrewingStand.lIIllllIIlllII[1]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockBrewingStand.lIIllllIIlllII[2]] = BlockBrewingStand.HAS_BOTTLE[BlockBrewingStand.lIIllllIIlllII[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockBrewingStand.lIIllllIIlllII[3]] = BlockBrewingStand.HAS_BOTTLE[BlockBrewingStand.lIIllllIIlllII[3]];
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    @Override
    public void randomDisplayTick(final World lllllllllllllIIlIIlIllIIIIIIlIlI, final BlockPos lllllllllllllIIlIIlIllIIIIIIlIIl, final IBlockState lllllllllllllIIlIIlIllIIIIIIllll, final Random lllllllllllllIIlIIlIllIIIIIIlllI) {
        final double lllllllllllllIIlIIlIllIIIIIIllIl = lllllllllllllIIlIIlIllIIIIIIlIIl.getX() + 0.4f + lllllllllllllIIlIIlIllIIIIIIlllI.nextFloat() * 0.2f;
        final double lllllllllllllIIlIIlIllIIIIIIllII = lllllllllllllIIlIIlIllIIIIIIlIIl.getY() + 0.7f + lllllllllllllIIlIIlIllIIIIIIlllI.nextFloat() * 0.3f;
        final double lllllllllllllIIlIIlIllIIIIIIlIll = lllllllllllllIIlIIlIllIIIIIIlIIl.getZ() + 0.4f + lllllllllllllIIlIIlIllIIIIIIlllI.nextFloat() * 0.2f;
        lllllllllllllIIlIIlIllIIIIIIlIlI.spawnParticle(EnumParticleTypes.SMOKE_NORMAL, lllllllllllllIIlIIlIllIIIIIIllIl, lllllllllllllIIlIIlIllIIIIIIllII, lllllllllllllIIlIIlIllIIIIIIlIll, 0.0, 0.0, 0.0, new int[BlockBrewingStand.lIIllllIIlllII[1]]);
    }
    
    private static boolean llIlllIllIlllIl(final int lllllllllllllIIlIIlIlIlllIIllllI) {
        return lllllllllllllIIlIIlIlIlllIIllllI != 0;
    }
    
    private static String llIlllIllIlIllI(String lllllllllllllIIlIIlIlIlllIllllIl, final String lllllllllllllIIlIIlIlIlllIllllII) {
        lllllllllllllIIlIIlIlIlllIllllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIIlIIlIlIlllIllllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlIIlIlIllllIIIIII = new StringBuilder();
        final char[] lllllllllllllIIlIIlIlIlllIllllll = lllllllllllllIIlIIlIlIlllIllllII.toCharArray();
        int lllllllllllllIIlIIlIlIlllIlllllI = BlockBrewingStand.lIIllllIIlllII[1];
        final boolean lllllllllllllIIlIIlIlIlllIlllIII = (Object)((String)lllllllllllllIIlIIlIlIlllIllllIl).toCharArray();
        final short lllllllllllllIIlIIlIlIlllIllIlll = (short)lllllllllllllIIlIIlIlIlllIlllIII.length;
        String lllllllllllllIIlIIlIlIlllIllIllI = (String)BlockBrewingStand.lIIllllIIlllII[1];
        while (llIlllIlllIIIII((int)lllllllllllllIIlIIlIlIlllIllIllI, lllllllllllllIIlIIlIlIlllIllIlll)) {
            final char lllllllllllllIIlIIlIlIllllIIIIll = lllllllllllllIIlIIlIlIlllIlllIII[lllllllllllllIIlIIlIlIlllIllIllI];
            lllllllllllllIIlIIlIlIllllIIIIII.append((char)(lllllllllllllIIlIIlIlIllllIIIIll ^ lllllllllllllIIlIIlIlIlllIllllll[lllllllllllllIIlIIlIlIlllIlllllI % lllllllllllllIIlIIlIlIlllIllllll.length]));
            "".length();
            ++lllllllllllllIIlIIlIlIlllIlllllI;
            ++lllllllllllllIIlIIlIlIlllIllIllI;
            "".length();
            if (-(" ".length() ^ (0x34 ^ 0x31)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlIIlIlIllllIIIIII);
    }
    
    private static boolean llIlllIllIlllll(final int lllllllllllllIIlIIlIlIlllIlIIlIl, final int lllllllllllllIIlIIlIlIlllIlIIlII) {
        return lllllllllllllIIlIIlIlIlllIlIIlIl >= lllllllllllllIIlIIlIlIlllIlIIlII;
    }
    
    private static void llIlllIllIlIlll() {
        (lIIllllIIllIlI = new String[BlockBrewingStand.lIIllllIIlllII[4]])[BlockBrewingStand.lIIllllIIlllII[1]] = llIlllIllIlIlII("h5+iAIx1lPz5kr8NVkkMkA==", "jRaFf");
        BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[2]] = llIlllIllIlIllI("LyAiKRcoNSUaEBhw", "GAQvu");
        BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[3]] = llIlllIllIlIllI("KhAfNAYtBRgHAR1D", "Bqlkd");
        BlockBrewingStand.lIIllllIIllIlI[BlockBrewingStand.lIIllllIIlllII[0]] = llIlllIllIlIllI("DBAkBnsHFiQcPAsDEh80CwBvBTQIAQ==", "edAkU");
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockBrewingStand.lIIllllIIlllII[2] != 0;
    }
}
