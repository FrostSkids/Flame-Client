// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockPlanks;
import net.minecraft.init.Blocks;
import net.minecraft.util.EnumFacing;
import net.minecraft.block.Block;
import net.minecraft.util.EnumParticleTypes;
import net.minecraft.world.IBlockAccess;
import net.minecraft.block.material.Material;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import java.util.List;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.block.state.IBlockState;
import net.minecraft.block.IGrowable;
import net.minecraft.util.BlockPos;
import net.minecraft.world.World;

public class ItemDye extends Item
{
    private static final /* synthetic */ String[] lIIllIlIllIlII;
    private static final /* synthetic */ int[] lIIllIlIlllIIl;
    
    public static boolean applyBonemeal(final ItemStack lllllllllllllIIlIlIlIIIlIIIlllll, final World lllllllllllllIIlIlIlIIIlIIlIIIll, final BlockPos lllllllllllllIIlIlIlIIIlIIlIIIlI) {
        final IBlockState lllllllllllllIIlIlIlIIIlIIlIIIIl = lllllllllllllIIlIlIlIIIlIIlIIIll.getBlockState(lllllllllllllIIlIlIlIIIlIIlIIIlI);
        if (llIllIIlIlIlIIl((lllllllllllllIIlIlIlIIIlIIlIIIIl.getBlock() instanceof IGrowable) ? 1 : 0)) {
            final IGrowable lllllllllllllIIlIlIlIIIlIIlIIIII = (IGrowable)lllllllllllllIIlIlIlIIIlIIlIIIIl.getBlock();
            if (llIllIIlIlIlIIl(lllllllllllllIIlIlIlIIIlIIlIIIII.canGrow(lllllllllllllIIlIlIlIIIlIIlIIIll, lllllllllllllIIlIlIlIIIlIIlIIIlI, lllllllllllllIIlIlIlIIIlIIlIIIIl, lllllllllllllIIlIlIlIIIlIIlIIIll.isRemote) ? 1 : 0)) {
                if (llIllIIlIlIIlll(lllllllllllllIIlIlIlIIIlIIlIIIll.isRemote ? 1 : 0)) {
                    if (llIllIIlIlIlIIl(lllllllllllllIIlIlIlIIIlIIlIIIII.canUseBonemeal(lllllllllllllIIlIlIlIIIlIIlIIIll, lllllllllllllIIlIlIlIIIlIIlIIIll.rand, lllllllllllllIIlIlIlIIIlIIlIIIlI, lllllllllllllIIlIlIlIIIlIIlIIIIl) ? 1 : 0)) {
                        lllllllllllllIIlIlIlIIIlIIlIIIII.grow(lllllllllllllIIlIlIlIIIlIIlIIIll, lllllllllllllIIlIlIlIIIlIIlIIIll.rand, lllllllllllllIIlIlIlIIIlIIlIIIlI, lllllllllllllIIlIlIlIIIlIIlIIIIl);
                    }
                    lllllllllllllIIlIlIlIIIlIIIlllll.stackSize -= ItemDye.lIIllIlIlllIIl[3];
                }
                return ItemDye.lIIllIlIlllIIl[3] != 0;
            }
        }
        return ItemDye.lIIllIlIlllIIl[1] != 0;
    }
    
    private static boolean llIllIIlIlIlIll(final int lllllllllllllIIlIlIlIIIIllIllIlI, final int lllllllllllllIIlIlIlIIIIllIllIIl) {
        return lllllllllllllIIlIlIlIIIIllIllIlI >= lllllllllllllIIlIlIlIIIIllIllIIl;
    }
    
    static {
        llIllIIlIlIIllI();
        llIllIIlIIlllII();
        final int[] dyeColors2 = new int[ItemDye.lIIllIlIlllIIl[0]];
        dyeColors2[ItemDye.lIIllIlIlllIIl[1]] = ItemDye.lIIllIlIlllIIl[2];
        dyeColors2[ItemDye.lIIllIlIlllIIl[3]] = ItemDye.lIIllIlIlllIIl[4];
        dyeColors2[ItemDye.lIIllIlIlllIIl[5]] = ItemDye.lIIllIlIlllIIl[6];
        dyeColors2[ItemDye.lIIllIlIlllIIl[7]] = ItemDye.lIIllIlIlllIIl[8];
        dyeColors2[ItemDye.lIIllIlIlllIIl[9]] = ItemDye.lIIllIlIlllIIl[10];
        dyeColors2[ItemDye.lIIllIlIlllIIl[11]] = ItemDye.lIIllIlIlllIIl[12];
        dyeColors2[ItemDye.lIIllIlIlllIIl[13]] = ItemDye.lIIllIlIlllIIl[14];
        dyeColors2[ItemDye.lIIllIlIlllIIl[15]] = ItemDye.lIIllIlIlllIIl[16];
        dyeColors2[ItemDye.lIIllIlIlllIIl[17]] = ItemDye.lIIllIlIlllIIl[18];
        dyeColors2[ItemDye.lIIllIlIlllIIl[19]] = ItemDye.lIIllIlIlllIIl[20];
        dyeColors2[ItemDye.lIIllIlIlllIIl[21]] = ItemDye.lIIllIlIlllIIl[22];
        dyeColors2[ItemDye.lIIllIlIlllIIl[23]] = ItemDye.lIIllIlIlllIIl[24];
        dyeColors2[ItemDye.lIIllIlIlllIIl[25]] = ItemDye.lIIllIlIlllIIl[26];
        dyeColors2[ItemDye.lIIllIlIlllIIl[27]] = ItemDye.lIIllIlIlllIIl[28];
        dyeColors2[ItemDye.lIIllIlIlllIIl[29]] = ItemDye.lIIllIlIlllIIl[30];
        dyeColors2[ItemDye.lIIllIlIlllIIl[31]] = ItemDye.lIIllIlIlllIIl[32];
        dyeColors = dyeColors2;
    }
    
    @Override
    public void getSubItems(final Item lllllllllllllIIlIlIlIIIIllllIIII, final CreativeTabs lllllllllllllIIlIlIlIIIIlllIllll, final List<ItemStack> lllllllllllllIIlIlIlIIIIlllIlIll) {
        int lllllllllllllIIlIlIlIIIIlllIllIl = ItemDye.lIIllIlIlllIIl[1];
        "".length();
        if (((0x53 ^ 0x43) & ~(0x3E ^ 0x2E)) != 0x0) {
            return;
        }
        while (!llIllIIlIlIlIll(lllllllllllllIIlIlIlIIIIlllIllIl, ItemDye.lIIllIlIlllIIl[0])) {
            lllllllllllllIIlIlIlIIIIlllIlIll.add(new ItemStack(lllllllllllllIIlIlIlIIIIllllIIII, ItemDye.lIIllIlIlllIIl[3], lllllllllllllIIlIlIlIIIIlllIllIl));
            "".length();
            ++lllllllllllllIIlIlIlIIIIlllIllIl;
        }
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIIlIlIlIIIlIlIlIIll) {
        final int lllllllllllllIIlIlIlIIIlIlIlIIlI = lllllllllllllIIlIlIlIIIlIlIlIIll.getMetadata();
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(ItemDye.lIIllIlIllIlII[ItemDye.lIIllIlIlllIIl[1]]).append(EnumDyeColor.byDyeDamage(lllllllllllllIIlIlIlIIIlIlIlIIlI).getUnlocalizedName()));
    }
    
    private static void llIllIIlIlIIllI() {
        (lIIllIlIlllIIl = new int[34])[0] = (0x37 ^ 0x27);
        ItemDye.lIIllIlIlllIIl[1] = ((0xCB ^ 0x90 ^ (0x20 ^ 0x33)) & (99 + 105 - 109 + 117 ^ 52 + 135 - 182 + 151 ^ -" ".length()));
        ItemDye.lIIllIlIlllIIl[2] = (-(0xFFFFD6D3 & 0x69AD) & (0xFFFFFFDB & 0x1E5BBF));
        ItemDye.lIIllIlIlllIIl[3] = " ".length();
        ItemDye.lIIllIlIlllIIl[4] = (0xFFFFF33F & 0xB33DEC);
        ItemDye.lIIllIlIlllIIl[5] = "  ".length();
        ItemDye.lIIllIlIlllIIl[6] = (0xFFFFF99F & 0x3B577A);
        ItemDye.lIIllIlIlllIIl[7] = "   ".length();
        ItemDye.lIIllIlIlllIIl[8] = (-(0xFFFFF6FD & 0xBE7) & (0xFFFFB2FF & 0x517FFE));
        ItemDye.lIIllIlIlllIIl[9] = (0x91 ^ 0x96 ^ "   ".length());
        ItemDye.lIIllIlIlllIIl[10] = (-(0xFFFF9EEF & 0x695D) & (0xFFFFBFFE & 0x2579DF));
        ItemDye.lIIllIlIlllIIl[11] = (0x1A ^ 0x31 ^ (0xA7 ^ 0x89));
        ItemDye.lIIllIlIlllIIl[12] = (-(0xFFFFF49F & 0x5B62) & (-1 & 0x7B7FBF));
        ItemDye.lIIllIlIlllIIl[13] = (0x84 ^ 0xBC ^ (0x8E ^ 0xB0));
        ItemDye.lIIllIlIlllIIl[14] = (-(0xFFFFDDED & 0x2B5B) & (0xFFFFFFDF & 0x287FFF));
        ItemDye.lIIllIlIlllIIl[15] = (0xE2 ^ 0xB1 ^ (0x42 ^ 0x16));
        ItemDye.lIIllIlIlllIIl[16] = (-(0xFFFFFF51 & 0x54FF) & (0xFFFFFFFB & 0xABFFFF));
        ItemDye.lIIllIlIlllIIl[17] = (0x8D ^ 0x85);
        ItemDye.lIIllIlIlllIIl[18] = (-(0xFFFFFEDF & 0x1DBD) & (0xFFFFFFDF & 0x435FFF));
        ItemDye.lIIllIlIlllIIl[19] = (0x1 ^ 0x8);
        ItemDye.lIIllIlIlllIIl[20] = (-(0xFFFFD4C9 & 0x7F3E) & (0xFFFFDF9F & 0xD8F5FF));
        ItemDye.lIIllIlIlllIIl[21] = (10 + 138 + 10 + 18 ^ 160 + 86 - 154 + 94);
        ItemDye.lIIllIlIlllIIl[22] = (0xFFFFFF36 & 0x41CDFD);
        ItemDye.lIIllIlIlllIIl[23] = (0x58 ^ 0x53);
        ItemDye.lIIllIlIlllIIl[24] = (-"  ".length() & (0xFFFFDFFB & 0xDEEF2F));
        ItemDye.lIIllIlIlllIIl[25] = (0x14 ^ 0x31 ^ (0x74 ^ 0x5D));
        ItemDye.lIIllIlIlllIIl[26] = (-(0xFFFFF525 & 0x2EFF) & (0xFFFFBFF7 & 0x66EDFF));
        ItemDye.lIIllIlIlllIIl[27] = (0x5B ^ 0x56);
        ItemDye.lIIllIlIlllIIl[28] = (0xFFFFF6CF & 0xC35DFD);
        ItemDye.lIIllIlIlllIIl[29] = (0x44 ^ 0x4A);
        ItemDye.lIIllIlIlllIIl[30] = (0xFFFFA947 & 0xEBDEFC);
        ItemDye.lIIllIlIlllIIl[31] = (0x4 ^ 0x2F ^ (0xB7 ^ 0x93));
        ItemDye.lIIllIlIlllIIl[32] = (-(0xFFFF9BDF & 0x6527) & (0xFFFFF7FE & 0xF0F9F7));
        ItemDye.lIIllIlIlllIIl[33] = (-(0xFFFFF6BB & 0x5947) & (0xFFFFF7F7 & 0x5FDF));
    }
    
    public ItemDye() {
        this.setHasSubtypes((boolean)(ItemDye.lIIllIlIlllIIl[3] != 0));
        "".length();
        this.setMaxDamage(ItemDye.lIIllIlIlllIIl[1]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabMaterials);
        "".length();
    }
    
    private static boolean llIllIIlIlIIlll(final int lllllllllllllIIlIlIlIIIIllIIllIl) {
        return lllllllllllllIIlIlIlIIIIllIIllIl == 0;
    }
    
    private static void llIllIIlIIlllII() {
        (lIIllIlIllIlII = new String[ItemDye.lIIllIlIlllIIl[3]])[ItemDye.lIIllIlIlllIIl[1]] = llIllIIlIIllIll("YS4godX3y1g=", "JoHVp");
    }
    
    @Override
    public boolean itemInteractionForEntity(final ItemStack lllllllllllllIIlIlIlIIIIllllllIl, final EntityPlayer lllllllllllllIIlIlIlIIIIllllllII, final EntityLivingBase lllllllllllllIIlIlIlIIIIllllIlll) {
        if (llIllIIlIlIlIIl((lllllllllllllIIlIlIlIIIIllllIlll instanceof EntitySheep) ? 1 : 0)) {
            final EntitySheep lllllllllllllIIlIlIlIIIIlllllIlI = (EntitySheep)lllllllllllllIIlIlIlIIIIllllIlll;
            final EnumDyeColor lllllllllllllIIlIlIlIIIIlllllIIl = EnumDyeColor.byDyeDamage(lllllllllllllIIlIlIlIIIIllllllIl.getMetadata());
            if (llIllIIlIlIIlll(lllllllllllllIIlIlIlIIIIlllllIlI.getSheared() ? 1 : 0) && llIllIIlIlIlIlI(lllllllllllllIIlIlIlIIIIlllllIlI.getFleeceColor(), lllllllllllllIIlIlIlIIIIlllllIIl)) {
                lllllllllllllIIlIlIlIIIIlllllIlI.setFleeceColor(lllllllllllllIIlIlIlIIIIlllllIIl);
                lllllllllllllIIlIlIlIIIIllllllIl.stackSize -= ItemDye.lIIllIlIlllIIl[3];
            }
            return ItemDye.lIIllIlIlllIIl[3] != 0;
        }
        return ItemDye.lIIllIlIlllIIl[1] != 0;
    }
    
    private static boolean llIllIIlIlIlIII(final Object lllllllllllllIIlIlIlIIIIllIlIIlI, final Object lllllllllllllIIlIlIlIIIIllIlIIIl) {
        return lllllllllllllIIlIlIlIIIIllIlIIlI == lllllllllllllIIlIlIlIIIIllIlIIIl;
    }
    
    private static boolean llIllIIlIlIlIIl(final int lllllllllllllIIlIlIlIIIIllIIllll) {
        return lllllllllllllIIlIlIlIIIIllIIllll != 0;
    }
    
    public static void spawnBonemealParticles(final World lllllllllllllIIlIlIlIIIlIIIlIIlI, final BlockPos lllllllllllllIIlIlIlIIIlIIIlIIIl, int lllllllllllllIIlIlIlIIIlIIIIlIII) {
        if (llIllIIlIlIIlll(lllllllllllllIIlIlIlIIIlIIIIlIII)) {
            lllllllllllllIIlIlIlIIIlIIIIlIII = ItemDye.lIIllIlIlllIIl[31];
        }
        final Block lllllllllllllIIlIlIlIIIlIIIIllll = lllllllllllllIIlIlIlIIIlIIIlIIlI.getBlockState(lllllllllllllIIlIlIlIIIlIIIlIIIl).getBlock();
        if (llIllIIlIlIlIlI(lllllllllllllIIlIlIlIIIlIIIIllll.getMaterial(), Material.air)) {
            lllllllllllllIIlIlIlIIIlIIIIllll.setBlockBoundsBasedOnState(lllllllllllllIIlIlIlIIIlIIIlIIlI, lllllllllllllIIlIlIlIIIlIIIlIIIl);
            int lllllllllllllIIlIlIlIIIlIIIIlllI = ItemDye.lIIllIlIlllIIl[1];
            "".length();
            if ("   ".length() > "   ".length()) {
                return;
            }
            while (!llIllIIlIlIlIll(lllllllllllllIIlIlIlIIIlIIIIlllI, lllllllllllllIIlIlIlIIIlIIIIlIII)) {
                final double lllllllllllllIIlIlIlIIIlIIIIllIl = ItemDye.itemRand.nextGaussian() * 0.02;
                final double lllllllllllllIIlIlIlIIIlIIIIllII = ItemDye.itemRand.nextGaussian() * 0.02;
                final double lllllllllllllIIlIlIlIIIlIIIIlIll = ItemDye.itemRand.nextGaussian() * 0.02;
                lllllllllllllIIlIlIlIIIlIIIlIIlI.spawnParticle(EnumParticleTypes.VILLAGER_HAPPY, lllllllllllllIIlIlIlIIIlIIIlIIIl.getX() + ItemDye.itemRand.nextFloat(), lllllllllllllIIlIlIlIIIlIIIlIIIl.getY() + ItemDye.itemRand.nextFloat() * lllllllllllllIIlIlIlIIIlIIIIllll.getBlockBoundsMaxY(), lllllllllllllIIlIlIlIIIlIIIlIIIl.getZ() + ItemDye.itemRand.nextFloat(), lllllllllllllIIlIlIlIIIlIIIIllIl, lllllllllllllIIlIlIlIIIlIIIIllII, lllllllllllllIIlIlIlIIIlIIIIlIll, new int[ItemDye.lIIllIlIlllIIl[1]]);
                ++lllllllllllllIIlIlIlIIIlIIIIlllI;
            }
        }
    }
    
    @Override
    public boolean onItemUse(final ItemStack lllllllllllllIIlIlIlIIIlIIllIlIl, final EntityPlayer lllllllllllllIIlIlIlIIIlIIllIlII, final World lllllllllllllIIlIlIlIIIlIIllIIll, BlockPos lllllllllllllIIlIlIlIIIlIIllIIlI, final EnumFacing lllllllllllllIIlIlIlIIIlIIllIIIl, final float lllllllllllllIIlIlIlIIIlIIllIIII, final float lllllllllllllIIlIlIlIIIlIIlllIll, final float lllllllllllllIIlIlIlIIIlIIlIlllI) {
        if (llIllIIlIlIIlll(lllllllllllllIIlIlIlIIIlIIllIlII.canPlayerEdit(lllllllllllllIIlIlIlIIIlIIllIIlI.offset(lllllllllllllIIlIlIlIIIlIIllIIIl), lllllllllllllIIlIlIlIIIlIIllIIIl, lllllllllllllIIlIlIlIIIlIIllIlIl) ? 1 : 0)) {
            return ItemDye.lIIllIlIlllIIl[1] != 0;
        }
        final EnumDyeColor lllllllllllllIIlIlIlIIIlIIlllIIl = EnumDyeColor.byDyeDamage(lllllllllllllIIlIlIlIIIlIIllIlIl.getMetadata());
        if (llIllIIlIlIlIII(lllllllllllllIIlIlIlIIIlIIlllIIl, EnumDyeColor.WHITE)) {
            if (llIllIIlIlIlIIl(applyBonemeal(lllllllllllllIIlIlIlIIIlIIllIlIl, lllllllllllllIIlIlIlIIIlIIllIIll, lllllllllllllIIlIlIlIIIlIIllIIlI) ? 1 : 0)) {
                if (llIllIIlIlIIlll(lllllllllllllIIlIlIlIIIlIIllIIll.isRemote ? 1 : 0)) {
                    lllllllllllllIIlIlIlIIIlIIllIIll.playAuxSFX(ItemDye.lIIllIlIlllIIl[33], lllllllllllllIIlIlIlIIIlIIllIIlI, ItemDye.lIIllIlIlllIIl[1]);
                }
                return ItemDye.lIIllIlIlllIIl[3] != 0;
            }
        }
        else if (llIllIIlIlIlIII(lllllllllllllIIlIlIlIIIlIIlllIIl, EnumDyeColor.BROWN)) {
            final IBlockState lllllllllllllIIlIlIlIIIlIIlllIII = lllllllllllllIIlIlIlIIIlIIllIIll.getBlockState(lllllllllllllIIlIlIlIIIlIIllIIlI);
            final Block lllllllllllllIIlIlIlIIIlIIllIlll = lllllllllllllIIlIlIlIIIlIIlllIII.getBlock();
            if (llIllIIlIlIlIII(lllllllllllllIIlIlIlIIIlIIllIlll, Blocks.log) && llIllIIlIlIlIII(lllllllllllllIIlIlIlIIIlIIlllIII.getValue(BlockPlanks.VARIANT), BlockPlanks.EnumType.JUNGLE)) {
                if (llIllIIlIlIlIII(lllllllllllllIIlIlIlIIIlIIllIIIl, EnumFacing.DOWN)) {
                    return ItemDye.lIIllIlIlllIIl[1] != 0;
                }
                if (llIllIIlIlIlIII(lllllllllllllIIlIlIlIIIlIIllIIIl, EnumFacing.UP)) {
                    return ItemDye.lIIllIlIlllIIl[1] != 0;
                }
                lllllllllllllIIlIlIlIIIlIIllIIlI = lllllllllllllIIlIlIlIIIlIIllIIlI.offset(lllllllllllllIIlIlIlIIIlIIllIIIl);
                if (llIllIIlIlIlIIl(lllllllllllllIIlIlIlIIIlIIllIIll.isAirBlock(lllllllllllllIIlIlIlIIIlIIllIIlI) ? 1 : 0)) {
                    final IBlockState lllllllllllllIIlIlIlIIIlIIllIllI = Blocks.cocoa.onBlockPlaced(lllllllllllllIIlIlIlIIIlIIllIIll, lllllllllllllIIlIlIlIIIlIIllIIlI, lllllllllllllIIlIlIlIIIlIIllIIIl, lllllllllllllIIlIlIlIIIlIIllIIII, lllllllllllllIIlIlIlIIIlIIlllIll, lllllllllllllIIlIlIlIIIlIIlIlllI, ItemDye.lIIllIlIlllIIl[1], lllllllllllllIIlIlIlIIIlIIllIlII);
                    lllllllllllllIIlIlIlIIIlIIllIIll.setBlockState(lllllllllllllIIlIlIlIIIlIIllIIlI, lllllllllllllIIlIlIlIIIlIIllIllI, ItemDye.lIIllIlIlllIIl[5]);
                    "".length();
                    if (llIllIIlIlIIlll(lllllllllllllIIlIlIlIIIlIIllIlII.capabilities.isCreativeMode ? 1 : 0)) {
                        lllllllllllllIIlIlIlIIIlIIllIlIl.stackSize -= ItemDye.lIIllIlIlllIIl[3];
                    }
                }
                return ItemDye.lIIllIlIlllIIl[3] != 0;
            }
        }
        return ItemDye.lIIllIlIlllIIl[1] != 0;
    }
    
    private static String llIllIIlIIllIll(final String lllllllllllllIIlIlIlIIIIlllIIIII, final String lllllllllllllIIlIlIlIIIIllIlllll) {
        try {
            final SecretKeySpec lllllllllllllIIlIlIlIIIIlllIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIlIlIIIIllIlllll.getBytes(StandardCharsets.UTF_8)), ItemDye.lIIllIlIlllIIl[17]), "DES");
            final Cipher lllllllllllllIIlIlIlIIIIlllIIlII = Cipher.getInstance("DES");
            lllllllllllllIIlIlIlIIIIlllIIlII.init(ItemDye.lIIllIlIlllIIl[5], lllllllllllllIIlIlIlIIIIlllIIlIl);
            return new String(lllllllllllllIIlIlIlIIIIlllIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIlIlIIIIlllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIlIlIIIIlllIIIll) {
            lllllllllllllIIlIlIlIIIIlllIIIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIllIIlIlIlIlI(final Object lllllllllllllIIlIlIlIIIIllIlIllI, final Object lllllllllllllIIlIlIlIIIIllIlIlIl) {
        return lllllllllllllIIlIlIlIIIIllIlIllI != lllllllllllllIIlIlIlIIIIllIlIlIl;
    }
}
