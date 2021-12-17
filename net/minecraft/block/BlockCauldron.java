// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

import java.util.Random;
import net.minecraft.block.state.BlockState;
import net.minecraft.tileentity.TileEntityBanner;
import net.minecraft.item.ItemBanner;
import net.minecraft.item.ItemArmor;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.stats.StatList;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.entity.player.EntityPlayer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.MathHelper;
import java.util.List;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.entity.Entity;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.properties.PropertyInteger;

public class BlockCauldron extends Block
{
    public static final /* synthetic */ PropertyInteger LEVEL;
    private static final /* synthetic */ String[] lllIllIlIlIIIl;
    private static final /* synthetic */ int[] lllIllIlIlIIlI;
    
    private static boolean lIlIIlIIlllIlIIl(final int llllllllllllIlIllIIlIIIIIllIIlIl) {
        return llllllllllllIlIllIIlIIIIIllIIlIl <= 0;
    }
    
    @Override
    public int getMetaFromState(final IBlockState llllllllllllIlIllIIlIIIIlIIIlllI) {
        return llllllllllllIlIllIIlIIIIlIIIlllI.getValue((IProperty<Integer>)BlockCauldron.LEVEL);
    }
    
    public BlockCauldron() {
        super(Material.iron, MapColor.stoneColor);
        this.setDefaultState(this.blockState.getBaseState().withProperty((IProperty<Comparable>)BlockCauldron.LEVEL, BlockCauldron.lllIllIlIlIIlI[0]));
    }
    
    @Override
    public void onEntityCollidedWithBlock(final World llllllllllllIlIllIIlIIIIlllIIlIl, final BlockPos llllllllllllIlIllIIlIIIIlllIlIll, final IBlockState llllllllllllIlIllIIlIIIIlllIlIlI, final Entity llllllllllllIlIllIIlIIIIlllIlIIl) {
        final int llllllllllllIlIllIIlIIIIlllIlIII = llllllllllllIlIllIIlIIIIlllIlIlI.getValue((IProperty<Integer>)BlockCauldron.LEVEL);
        final float llllllllllllIlIllIIlIIIIlllIIlll = llllllllllllIlIllIIlIIIIlllIlIll.getY() + (6.0f + BlockCauldron.lllIllIlIlIIlI[1] * llllllllllllIlIllIIlIIIIlllIlIII) / 16.0f;
        if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIlllIIlIl.isRemote ? 1 : 0) && lIlIIlIIlllIIlll(llllllllllllIlIllIIlIIIIlllIlIIl.isBurning() ? 1 : 0) && lIlIIlIIlllIlIII(llllllllllllIlIllIIlIIIIlllIlIII) && lIlIIlIIlllIlIIl(lIlIIlIIlllIIlIl(llllllllllllIlIllIIlIIIIlllIlIIl.getEntityBoundingBox().minY, llllllllllllIlIllIIlIIIIlllIIlll))) {
            llllllllllllIlIllIIlIIIIlllIlIIl.extinguish();
            this.setWaterLevel(llllllllllllIlIllIIlIIIIlllIIlIl, llllllllllllIlIllIIlIIIIlllIlIll, llllllllllllIlIllIIlIIIIlllIlIlI, llllllllllllIlIllIIlIIIIlllIlIII - BlockCauldron.lllIllIlIlIIlI[2]);
        }
    }
    
    @Override
    public void setBlockBoundsForItemRender() {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    @Override
    public Item getItem(final World llllllllllllIlIllIIlIIIIlIlIIIII, final BlockPos llllllllllllIlIllIIlIIIIlIIlllll) {
        return Items.cauldron;
    }
    
    @Override
    public void addCollisionBoxesToList(final World llllllllllllIlIllIIlIIIlIIIIlIII, final BlockPos llllllllllllIlIllIIlIIIIllllllll, final IBlockState llllllllllllIlIllIIlIIIIlllllllI, final AxisAlignedBB llllllllllllIlIllIIlIIIIllllllIl, final List<AxisAlignedBB> llllllllllllIlIllIIlIIIIllllllII, final Entity llllllllllllIlIllIIlIIIIlllllIll) {
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 0.3125f, 1.0f);
        super.addCollisionBoxesToList(llllllllllllIlIllIIlIIIlIIIIlIII, llllllllllllIlIllIIlIIIIllllllll, llllllllllllIlIllIIlIIIIlllllllI, llllllllllllIlIllIIlIIIIllllllIl, llllllllllllIlIllIIlIIIIllllllII, llllllllllllIlIllIIlIIIIlllllIll);
        final float llllllllllllIlIllIIlIIIlIIIIIIlI = 0.125f;
        this.setBlockBounds(0.0f, 0.0f, 0.0f, llllllllllllIlIllIIlIIIlIIIIIIlI, 1.0f, 1.0f);
        super.addCollisionBoxesToList(llllllllllllIlIllIIlIIIlIIIIlIII, llllllllllllIlIllIIlIIIIllllllll, llllllllllllIlIllIIlIIIIlllllllI, llllllllllllIlIllIIlIIIIllllllIl, llllllllllllIlIllIIlIIIIllllllII, llllllllllllIlIllIIlIIIIlllllIll);
        this.setBlockBounds(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, llllllllllllIlIllIIlIIIlIIIIIIlI);
        super.addCollisionBoxesToList(llllllllllllIlIllIIlIIIlIIIIlIII, llllllllllllIlIllIIlIIIIllllllll, llllllllllllIlIllIIlIIIIlllllllI, llllllllllllIlIllIIlIIIIllllllIl, llllllllllllIlIllIIlIIIIllllllII, llllllllllllIlIllIIlIIIIlllllIll);
        this.setBlockBounds(1.0f - llllllllllllIlIllIIlIIIlIIIIIIlI, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        super.addCollisionBoxesToList(llllllllllllIlIllIIlIIIlIIIIlIII, llllllllllllIlIllIIlIIIIllllllll, llllllllllllIlIllIIlIIIIlllllllI, llllllllllllIlIllIIlIIIIllllllIl, llllllllllllIlIllIIlIIIIllllllII, llllllllllllIlIllIIlIIIIlllllIll);
        this.setBlockBounds(0.0f, 0.0f, 1.0f - llllllllllllIlIllIIlIIIlIIIIIIlI, 1.0f, 1.0f, 1.0f);
        super.addCollisionBoxesToList(llllllllllllIlIllIIlIIIlIIIIlIII, llllllllllllIlIllIIlIIIIllllllll, llllllllllllIlIllIIlIIIIlllllllI, llllllllllllIlIllIIlIIIIllllllIl, llllllllllllIlIllIIlIIIIllllllII, llllllllllllIlIllIIlIIIIlllllIll);
        this.setBlockBoundsForItemRender();
    }
    
    public void setWaterLevel(final World llllllllllllIlIllIIlIIIIlIllIIll, final BlockPos llllllllllllIlIllIIlIIIIlIllIIlI, final IBlockState llllllllllllIlIllIIlIIIIlIllIllI, final int llllllllllllIlIllIIlIIIIlIllIlIl) {
        llllllllllllIlIllIIlIIIIlIllIIll.setBlockState(llllllllllllIlIllIIlIIIIlIllIIlI, llllllllllllIlIllIIlIIIIlIllIllI.withProperty((IProperty<Comparable>)BlockCauldron.LEVEL, MathHelper.clamp_int(llllllllllllIlIllIIlIIIIlIllIlIl, BlockCauldron.lllIllIlIlIIlI[0], BlockCauldron.lllIllIlIlIIlI[1])), BlockCauldron.lllIllIlIlIIlI[3]);
        "".length();
        llllllllllllIlIllIIlIIIIlIllIIll.updateComparatorOutputLevel(llllllllllllIlIllIIlIIIIlIllIIlI, this);
    }
    
    private static boolean lIlIIlIIlllIIllI(final int llllllllllllIlIllIIlIIIIIllIIlll) {
        return llllllllllllIlIllIIlIIIIIllIIlll == 0;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return BlockCauldron.lllIllIlIlIIlI[0] != 0;
    }
    
    @Override
    public boolean hasComparatorInputOverride() {
        return BlockCauldron.lllIllIlIlIIlI[2] != 0;
    }
    
    @Override
    public void fillWithRain(final World llllllllllllIlIllIIlIIIIlIlIlIII, final BlockPos llllllllllllIlIllIIlIIIIlIlIlIlI) {
        if (lIlIIlIIlllIlllI(llllllllllllIlIllIIlIIIIlIlIlIII.rand.nextInt(BlockCauldron.lllIllIlIlIIlI[4]), BlockCauldron.lllIllIlIlIIlI[2])) {
            final IBlockState llllllllllllIlIllIIlIIIIlIlIlIIl = llllllllllllIlIllIIlIIIIlIlIlIII.getBlockState(llllllllllllIlIllIIlIIIIlIlIlIlI);
            if (lIlIIlIIlllIllII(llllllllllllIlIllIIlIIIIlIlIlIIl.getValue((IProperty<Integer>)BlockCauldron.LEVEL), BlockCauldron.lllIllIlIlIIlI[1])) {
                llllllllllllIlIllIIlIIIIlIlIlIII.setBlockState(llllllllllllIlIllIIlIIIIlIlIlIlI, llllllllllllIlIllIIlIIIIlIlIlIIl.cycleProperty((IProperty<Comparable>)BlockCauldron.LEVEL), BlockCauldron.lllIllIlIlIIlI[3]);
                "".length();
            }
        }
    }
    
    private static String lIlIIlIIlllIIIlI(final String llllllllllllIlIllIIlIIIIlIIIIIII, final String llllllllllllIlIllIIlIIIIlIIIIIIl) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlIIIIlIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlIIIIlIIIIIIl.getBytes(StandardCharsets.UTF_8)), BlockCauldron.lllIllIlIlIIlI[5]), "DES");
            final Cipher llllllllllllIlIllIIlIIIIlIIIIlII = Cipher.getInstance("DES");
            llllllllllllIlIllIIlIIIIlIIIIlII.init(BlockCauldron.lllIllIlIlIIlI[3], llllllllllllIlIllIIlIIIIlIIIIlIl);
            return new String(llllllllllllIlIllIIlIIIIlIIIIlII.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlIIIIlIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlIIIIlIIIIIll) {
            llllllllllllIlIllIIlIIIIlIIIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIlIIlllIllIl(final int llllllllllllIlIllIIlIIIIIlllIIlI, final int llllllllllllIlIllIIlIIIIIlllIIIl) {
        return llllllllllllIlIllIIlIIIIIlllIIlI <= llllllllllllIlIllIIlIIIIIlllIIIl;
    }
    
    @Override
    public boolean onBlockActivated(final World llllllllllllIlIllIIlIIIIllIIIllI, final BlockPos llllllllllllIlIllIIlIIIIllIIIlIl, final IBlockState llllllllllllIlIllIIlIIIIllIIIlII, final EntityPlayer llllllllllllIlIllIIlIIIIllIIIIll, final EnumFacing llllllllllllIlIllIIlIIIIllIlIIIl, final float llllllllllllIlIllIIlIIIIllIlIIII, final float llllllllllllIlIllIIlIIIIllIIllll, final float llllllllllllIlIllIIlIIIIllIIlllI) {
        if (lIlIIlIIlllIIlll(llllllllllllIlIllIIlIIIIllIIIllI.isRemote ? 1 : 0)) {
            return BlockCauldron.lllIllIlIlIIlI[2] != 0;
        }
        final ItemStack llllllllllllIlIllIIlIIIIllIIllIl = llllllllllllIlIllIIlIIIIllIIIIll.inventory.getCurrentItem();
        if (lIlIIlIIlllIlIlI(llllllllllllIlIllIIlIIIIllIIllIl)) {
            return BlockCauldron.lllIllIlIlIIlI[2] != 0;
        }
        final int llllllllllllIlIllIIlIIIIllIIllII = llllllllllllIlIllIIlIIIIllIIIlII.getValue((IProperty<Integer>)BlockCauldron.LEVEL);
        final Item llllllllllllIlIllIIlIIIIllIIlIll = llllllllllllIlIllIIlIIIIllIIllIl.getItem();
        if (lIlIIlIIlllIlIll(llllllllllllIlIllIIlIIIIllIIlIll, Items.water_bucket)) {
            if (lIlIIlIIlllIllII(llllllllllllIlIllIIlIIIIllIIllII, BlockCauldron.lllIllIlIlIIlI[1])) {
                if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                    llllllllllllIlIllIIlIIIIllIIIIll.inventory.setInventorySlotContents(llllllllllllIlIllIIlIIIIllIIIIll.inventory.currentItem, new ItemStack(Items.bucket));
                }
                llllllllllllIlIllIIlIIIIllIIIIll.triggerAchievement(StatList.field_181725_I);
                this.setWaterLevel(llllllllllllIlIllIIlIIIIllIIIllI, llllllllllllIlIllIIlIIIIllIIIlIl, llllllllllllIlIllIIlIIIIllIIIlII, BlockCauldron.lllIllIlIlIIlI[1]);
            }
            return BlockCauldron.lllIllIlIlIIlI[2] != 0;
        }
        if (lIlIIlIIlllIlIll(llllllllllllIlIllIIlIIIIllIIlIll, Items.glass_bottle)) {
            if (lIlIIlIIlllIlIII(llllllllllllIlIllIIlIIIIllIIllII)) {
                if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                    final ItemStack llllllllllllIlIllIIlIIIIllIIlIlI = new ItemStack(Items.potionitem, BlockCauldron.lllIllIlIlIIlI[2], BlockCauldron.lllIllIlIlIIlI[0]);
                    if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.inventory.addItemStackToInventory(llllllllllllIlIllIIlIIIIllIIlIlI) ? 1 : 0)) {
                        llllllllllllIlIllIIlIIIIllIIIllI.spawnEntityInWorld(new EntityItem(llllllllllllIlIllIIlIIIIllIIIllI, llllllllllllIlIllIIlIIIIllIIIlIl.getX() + 0.5, llllllllllllIlIllIIlIIIIllIIIlIl.getY() + 1.5, llllllllllllIlIllIIlIIIIllIIIlIl.getZ() + 0.5, llllllllllllIlIllIIlIIIIllIIlIlI));
                        "".length();
                        "".length();
                        if (((0x64 ^ 0x62) & ~(0x7F ^ 0x79)) > "   ".length()) {
                            return ((0x22 ^ 0x42) & ~(0x6A ^ 0xA)) != 0x0;
                        }
                    }
                    else if (lIlIIlIIlllIIlll((llllllllllllIlIllIIlIIIIllIIIIll instanceof EntityPlayerMP) ? 1 : 0)) {
                        ((EntityPlayerMP)llllllllllllIlIllIIlIIIIllIIIIll).sendContainerToPlayer(llllllllllllIlIllIIlIIIIllIIIIll.inventoryContainer);
                    }
                    llllllllllllIlIllIIlIIIIllIIIIll.triggerAchievement(StatList.field_181726_J);
                    final ItemStack itemStack = llllllllllllIlIllIIlIIIIllIIllIl;
                    itemStack.stackSize -= BlockCauldron.lllIllIlIlIIlI[2];
                    if (lIlIIlIIlllIlIIl(llllllllllllIlIllIIlIIIIllIIllIl.stackSize)) {
                        llllllllllllIlIllIIlIIIIllIIIIll.inventory.setInventorySlotContents(llllllllllllIlIllIIlIIIIllIIIIll.inventory.currentItem, null);
                    }
                }
                this.setWaterLevel(llllllllllllIlIllIIlIIIIllIIIllI, llllllllllllIlIllIIlIIIIllIIIlIl, llllllllllllIlIllIIlIIIIllIIIlII, llllllllllllIlIllIIlIIIIllIIllII - BlockCauldron.lllIllIlIlIIlI[2]);
            }
            return BlockCauldron.lllIllIlIlIIlI[2] != 0;
        }
        if (lIlIIlIIlllIlIII(llllllllllllIlIllIIlIIIIllIIllII) && lIlIIlIIlllIIlll((llllllllllllIlIllIIlIIIIllIIlIll instanceof ItemArmor) ? 1 : 0)) {
            final ItemArmor llllllllllllIlIllIIlIIIIllIIlIIl = (ItemArmor)llllllllllllIlIllIIlIIIIllIIlIll;
            if (lIlIIlIIlllIlIll(llllllllllllIlIllIIlIIIIllIIlIIl.getArmorMaterial(), ItemArmor.ArmorMaterial.LEATHER) && lIlIIlIIlllIIlll(llllllllllllIlIllIIlIIIIllIIlIIl.hasColor(llllllllllllIlIllIIlIIIIllIIllIl) ? 1 : 0)) {
                llllllllllllIlIllIIlIIIIllIIlIIl.removeColor(llllllllllllIlIllIIlIIIIllIIllIl);
                this.setWaterLevel(llllllllllllIlIllIIlIIIIllIIIllI, llllllllllllIlIllIIlIIIIllIIIlIl, llllllllllllIlIllIIlIIIIllIIIlII, llllllllllllIlIllIIlIIIIllIIllII - BlockCauldron.lllIllIlIlIIlI[2]);
                llllllllllllIlIllIIlIIIIllIIIIll.triggerAchievement(StatList.field_181727_K);
                return BlockCauldron.lllIllIlIlIIlI[2] != 0;
            }
        }
        if (lIlIIlIIlllIlIII(llllllllllllIlIllIIlIIIIllIIllII) && lIlIIlIIlllIIlll((llllllllllllIlIllIIlIIIIllIIlIll instanceof ItemBanner) ? 1 : 0) && lIlIIlIIlllIlIII(TileEntityBanner.getPatterns(llllllllllllIlIllIIlIIIIllIIllIl))) {
            final ItemStack llllllllllllIlIllIIlIIIIllIIlIII = llllllllllllIlIllIIlIIIIllIIllIl.copy();
            llllllllllllIlIllIIlIIIIllIIlIII.stackSize = BlockCauldron.lllIllIlIlIIlI[2];
            TileEntityBanner.removeBannerData(llllllllllllIlIllIIlIIIIllIIlIII);
            if (lIlIIlIIlllIllIl(llllllllllllIlIllIIlIIIIllIIllIl.stackSize, BlockCauldron.lllIllIlIlIIlI[2]) && lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                llllllllllllIlIllIIlIIIIllIIIIll.inventory.setInventorySlotContents(llllllllllllIlIllIIlIIIIllIIIIll.inventory.currentItem, llllllllllllIlIllIIlIIIIllIIlIII);
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x3F ^ 0x63) & ~(0xC7 ^ 0x9B)) != 0x0;
                }
            }
            else {
                if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.inventory.addItemStackToInventory(llllllllllllIlIllIIlIIIIllIIlIII) ? 1 : 0)) {
                    llllllllllllIlIllIIlIIIIllIIIllI.spawnEntityInWorld(new EntityItem(llllllllllllIlIllIIlIIIIllIIIllI, llllllllllllIlIllIIlIIIIllIIIlIl.getX() + 0.5, llllllllllllIlIllIIlIIIIllIIIlIl.getY() + 1.5, llllllllllllIlIllIIlIIIIllIIIlIl.getZ() + 0.5, llllllllllllIlIllIIlIIIIllIIlIII));
                    "".length();
                    "".length();
                    if (null != null) {
                        return ((0x9 ^ 0x3) & ~(0x2D ^ 0x27)) != 0x0;
                    }
                }
                else if (lIlIIlIIlllIIlll((llllllllllllIlIllIIlIIIIllIIIIll instanceof EntityPlayerMP) ? 1 : 0)) {
                    ((EntityPlayerMP)llllllllllllIlIllIIlIIIIllIIIIll).sendContainerToPlayer(llllllllllllIlIllIIlIIIIllIIIIll.inventoryContainer);
                }
                llllllllllllIlIllIIlIIIIllIIIIll.triggerAchievement(StatList.field_181728_L);
                if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                    final ItemStack itemStack2 = llllllllllllIlIllIIlIIIIllIIllIl;
                    itemStack2.stackSize -= BlockCauldron.lllIllIlIlIIlI[2];
                }
            }
            if (lIlIIlIIlllIIllI(llllllllllllIlIllIIlIIIIllIIIIll.capabilities.isCreativeMode ? 1 : 0)) {
                this.setWaterLevel(llllllllllllIlIllIIlIIIIllIIIllI, llllllllllllIlIllIIlIIIIllIIIlIl, llllllllllllIlIllIIlIIIIllIIIlII, llllllllllllIlIllIIlIIIIllIIllII - BlockCauldron.lllIllIlIlIIlI[2]);
            }
            return BlockCauldron.lllIllIlIlIIlI[2] != 0;
        }
        return BlockCauldron.lllIllIlIlIIlI[0] != 0;
    }
    
    private static void lIlIIlIIlllIIIll() {
        (lllIllIlIlIIIl = new String[BlockCauldron.lllIllIlIlIIlI[2]])[BlockCauldron.lllIllIlIlIIlI[0]] = lIlIIlIIlllIIIlI("ZFfDHfOhwhk=", "VlDUS");
    }
    
    @Override
    protected BlockState createBlockState() {
        final IProperty[] llllllllllllIllllIIIlIlIIlIIIlll = new IProperty[BlockCauldron.lllIllIlIlIIlI[2]];
        llllllllllllIllllIIIlIlIIlIIIlll[BlockCauldron.lllIllIlIlIIlI[0]] = BlockCauldron.LEVEL;
        return new BlockState(this, llllllllllllIllllIIIlIlIIlIIIlll);
    }
    
    private static void lIlIIlIIlllIIlII() {
        (lllIllIlIlIIlI = new int[6])[0] = (" ".length() & ~" ".length());
        BlockCauldron.lllIllIlIlIIlI[1] = "   ".length();
        BlockCauldron.lllIllIlIlIIlI[2] = " ".length();
        BlockCauldron.lllIllIlIlIIlI[3] = "  ".length();
        BlockCauldron.lllIllIlIlIIlI[4] = (0x4B ^ 0x18 ^ (0x72 ^ 0x35));
        BlockCauldron.lllIllIlIlIIlI[5] = (0x58 ^ 0x4A ^ (0x42 ^ 0x58));
    }
    
    @Override
    public IBlockState getStateFromMeta(final int llllllllllllIlIllIIlIIIIlIIlIIIl) {
        return this.getDefaultState().withProperty((IProperty<Comparable>)BlockCauldron.LEVEL, llllllllllllIlIllIIlIIIIlIIlIIIl);
    }
    
    private static int lIlIIlIIlllIIlIl(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    private static boolean lIlIIlIIlllIlIlI(final Object llllllllllllIlIllIIlIIIIIllIlIll) {
        return llllllllllllIlIllIIlIIIIIllIlIll == null;
    }
    
    @Override
    public boolean isFullCube() {
        return BlockCauldron.lllIllIlIlIIlI[0] != 0;
    }
    
    private static boolean lIlIIlIIlllIlllI(final int llllllllllllIlIllIIlIIIIIllllIlI, final int llllllllllllIlIllIIlIIIIIllllIIl) {
        return llllllllllllIlIllIIlIIIIIllllIlI == llllllllllllIlIllIIlIIIIIllllIIl;
    }
    
    static {
        lIlIIlIIlllIIlII();
        lIlIIlIIlllIIIll();
        LEVEL = PropertyInteger.create(BlockCauldron.lllIllIlIlIIIl[BlockCauldron.lllIllIlIlIIlI[0]], BlockCauldron.lllIllIlIlIIlI[0], BlockCauldron.lllIllIlIlIIlI[1]);
    }
    
    private static boolean lIlIIlIIlllIIlll(final int llllllllllllIlIllIIlIIIIIllIlIIl) {
        return llllllllllllIlIllIIlIIIIIllIlIIl != 0;
    }
    
    @Override
    public Item getItemDropped(final IBlockState llllllllllllIlIllIIlIIIIlIlIIlII, final Random llllllllllllIlIllIIlIIIIlIlIIIll, final int llllllllllllIlIllIIlIIIIlIlIIIlI) {
        return Items.cauldron;
    }
    
    private static boolean lIlIIlIIlllIllII(final int llllllllllllIlIllIIlIIIIIlllIllI, final int llllllllllllIlIllIIlIIIIIlllIlIl) {
        return llllllllllllIlIllIIlIIIIIlllIllI < llllllllllllIlIllIIlIIIIIlllIlIl;
    }
    
    private static boolean lIlIIlIIlllIlIII(final int llllllllllllIlIllIIlIIIIIllIIIll) {
        return llllllllllllIlIllIIlIIIIIllIIIll > 0;
    }
    
    private static boolean lIlIIlIIlllIlIll(final Object llllllllllllIlIllIIlIIIIIllIlllI, final Object llllllllllllIlIllIIlIIIIIllIllIl) {
        return llllllllllllIlIllIIlIIIIIllIlllI == llllllllllllIlIllIIlIIIIIllIllIl;
    }
    
    @Override
    public int getComparatorInputOverride(final World llllllllllllIlIllIIlIIIIlIIllIII, final BlockPos llllllllllllIlIllIIlIIIIlIIllIIl) {
        return llllllllllllIlIllIIlIIIIlIIllIII.getBlockState(llllllllllllIlIllIIlIIIIlIIllIIl).getValue((IProperty<Integer>)BlockCauldron.LEVEL);
    }
}
