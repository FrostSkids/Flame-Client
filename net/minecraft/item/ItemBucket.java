// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.util.EnumParticleTypes;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.block.state.IBlockState;
import net.minecraft.util.BlockPos;
import net.minecraft.init.Items;
import net.minecraft.stats.StatList;
import net.minecraft.block.properties.IProperty;
import net.minecraft.block.BlockLiquid;
import net.minecraft.block.material.Material;
import net.minecraft.util.MovingObjectPosition;
import net.minecraft.init.Blocks;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.block.Block;

public class ItemBucket extends Item
{
    private static final /* synthetic */ int[] lIlIllIIlIlIII;
    private static final /* synthetic */ String[] lIlIllIIlIIlll;
    private /* synthetic */ Block isFull;
    
    private static boolean llllIIIIlllIlIl(final Object lllllllllllllIIIIlllIIIIIllIllIl) {
        return lllllllllllllIIIIlllIIIIIllIllIl == null;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIIIlllIIIIlIllIIII, final World lllllllllllllIIIIlllIIIIlIlllIIl, final EntityPlayer lllllllllllllIIIIlllIIIIlIlllIII) {
        int n;
        if (llllIIIIlllIlII(this.isFull, Blocks.air)) {
            n = ItemBucket.lIlIllIIlIlIII[0];
            "".length();
            if (((0x97 ^ 0xA9) & ~(0x1F ^ 0x21)) > "  ".length()) {
                return null;
            }
        }
        else {
            n = ItemBucket.lIlIllIIlIlIII[1];
        }
        final boolean lllllllllllllIIIIlllIIIIlIllIlll = n != 0;
        final MovingObjectPosition lllllllllllllIIIIlllIIIIlIllIllI = this.getMovingObjectPositionFromPlayer(lllllllllllllIIIIlllIIIIlIlllIIl, lllllllllllllIIIIlllIIIIlIlllIII, lllllllllllllIIIIlllIIIIlIllIlll);
        if (llllIIIIlllIlIl(lllllllllllllIIIIlllIIIIlIllIllI)) {
            return lllllllllllllIIIIlllIIIIlIllIIII;
        }
        if (llllIIIIlllIlII(lllllllllllllIIIIlllIIIIlIllIllI.typeOfHit, MovingObjectPosition.MovingObjectType.BLOCK)) {
            final BlockPos lllllllllllllIIIIlllIIIIlIllIlIl = lllllllllllllIIIIlllIIIIlIllIllI.getBlockPos();
            if (llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIlllIIl.isBlockModifiable(lllllllllllllIIIIlllIIIIlIlllIII, lllllllllllllIIIIlllIIIIlIllIlIl) ? 1 : 0)) {
                return lllllllllllllIIIIlllIIIIlIllIIII;
            }
            if (llllIIIIlllIlll(lllllllllllllIIIIlllIIIIlIllIlll ? 1 : 0)) {
                if (llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIlllIII.canPlayerEdit(lllllllllllllIIIIlllIIIIlIllIlIl.offset(lllllllllllllIIIIlllIIIIlIllIllI.sideHit), lllllllllllllIIIIlllIIIIlIllIllI.sideHit, lllllllllllllIIIIlllIIIIlIllIIII) ? 1 : 0)) {
                    return lllllllllllllIIIIlllIIIIlIllIIII;
                }
                final IBlockState lllllllllllllIIIIlllIIIIlIllIlII = lllllllllllllIIIIlllIIIIlIlllIIl.getBlockState(lllllllllllllIIIIlllIIIIlIllIlIl);
                final Material lllllllllllllIIIIlllIIIIlIllIIll = lllllllllllllIIIIlllIIIIlIllIlII.getBlock().getMaterial();
                if (llllIIIIlllIlII(lllllllllllllIIIIlllIIIIlIllIIll, Material.water) && llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIllIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
                    lllllllllllllIIIIlllIIIIlIlllIIl.setBlockToAir(lllllllllllllIIIIlllIIIIlIllIlIl);
                    "".length();
                    lllllllllllllIIIIlllIIIIlIlllIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                    return this.fillBucket(lllllllllllllIIIIlllIIIIlIllIIII, lllllllllllllIIIIlllIIIIlIlllIII, Items.water_bucket);
                }
                if (llllIIIIlllIlII(lllllllllllllIIIIlllIIIIlIllIIll, Material.lava) && llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIllIlII.getValue((IProperty<Integer>)BlockLiquid.LEVEL))) {
                    lllllllllllllIIIIlllIIIIlIlllIIl.setBlockToAir(lllllllllllllIIIIlllIIIIlIllIlIl);
                    "".length();
                    lllllllllllllIIIIlllIIIIlIlllIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                    return this.fillBucket(lllllllllllllIIIIlllIIIIlIllIIII, lllllllllllllIIIIlllIIIIlIlllIII, Items.lava_bucket);
                }
            }
            else {
                if (llllIIIIlllIlII(this.isFull, Blocks.air)) {
                    return new ItemStack(Items.bucket);
                }
                final BlockPos lllllllllllllIIIIlllIIIIlIllIIlI = lllllllllllllIIIIlllIIIIlIllIlIl.offset(lllllllllllllIIIIlllIIIIlIllIllI.sideHit);
                if (llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIlllIII.canPlayerEdit(lllllllllllllIIIIlllIIIIlIllIIlI, lllllllllllllIIIIlllIIIIlIllIllI.sideHit, lllllllllllllIIIIlllIIIIlIllIIII) ? 1 : 0)) {
                    return lllllllllllllIIIIlllIIIIlIllIIII;
                }
                if (llllIIIIlllIlll(this.tryPlaceContainedLiquid(lllllllllllllIIIIlllIIIIlIlllIIl, lllllllllllllIIIIlllIIIIlIllIIlI) ? 1 : 0) && llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIlllIII.capabilities.isCreativeMode ? 1 : 0)) {
                    lllllllllllllIIIIlllIIIIlIlllIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
                    return new ItemStack(Items.bucket);
                }
            }
        }
        return lllllllllllllIIIIlllIIIIlIllIIII;
    }
    
    private static boolean llllIIIIlllIllI(final int lllllllllllllIIIIlllIIIIIllIlIIl) {
        return lllllllllllllIIIIlllIIIIIllIlIIl == 0;
    }
    
    private static String llllIIIIlllIIIl(final String lllllllllllllIIIIlllIIIIIllllIlI, final String lllllllllllllIIIIlllIIIIIllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlllIIIIIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlllIIIIIllllIIl.getBytes(StandardCharsets.UTF_8)), ItemBucket.lIlIllIIlIlIII[2]), "DES");
            final Cipher lllllllllllllIIIIlllIIIIIllllllI = Cipher.getInstance("DES");
            lllllllllllllIIIIlllIIIIIllllllI.init(ItemBucket.lIlIllIIlIlIII[4], lllllllllllllIIIIlllIIIIIlllllll);
            return new String(lllllllllllllIIIIlllIIIIIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlllIIIIIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlllIIIIIlllllIl) {
            lllllllllllllIIIIlllIIIIIlllllIl.printStackTrace();
            return null;
        }
    }
    
    private static void llllIIIIlllIIlI() {
        (lIlIllIIlIIlll = new String[ItemBucket.lIlIllIIlIlIII[0]])[ItemBucket.lIlIllIIlIlIII[1]] = llllIIIIlllIIIl("kfXfZxMr1sO3QYIQhDRgcQ==", "fAgpJ");
    }
    
    public boolean tryPlaceContainedLiquid(final World lllllllllllllIIIIlllIIIIlIIlIlII, final BlockPos lllllllllllllIIIIlllIIIIlIIIlIlI) {
        if (llllIIIIlllIlII(this.isFull, Blocks.air)) {
            return ItemBucket.lIlIllIIlIlIII[1] != 0;
        }
        final Material lllllllllllllIIIIlllIIIIlIIlIIlI = lllllllllllllIIIIlllIIIIlIIlIlII.getBlockState(lllllllllllllIIIIlllIIIIlIIIlIlI).getBlock().getMaterial();
        int n;
        if (llllIIIIlllIlll(lllllllllllllIIIIlllIIIIlIIlIIlI.isSolid() ? 1 : 0)) {
            n = ItemBucket.lIlIllIIlIlIII[1];
            "".length();
            if ("  ".length() <= -" ".length()) {
                return ((" ".length() ^ (0xB0 ^ 0xA9)) & (0xFF ^ 0xB9 ^ (0x3B ^ 0x65) ^ -" ".length())) != 0x0;
            }
        }
        else {
            n = ItemBucket.lIlIllIIlIlIII[0];
        }
        final boolean lllllllllllllIIIIlllIIIIlIIlIIIl = n != 0;
        if (llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIIlIlII.isAirBlock(lllllllllllllIIIIlllIIIIlIIIlIlI) ? 1 : 0) && llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIIlIIIl ? 1 : 0)) {
            return ItemBucket.lIlIllIIlIlIII[1] != 0;
        }
        if (llllIIIIlllIlll(lllllllllllllIIIIlllIIIIlIIlIlII.provider.doesWaterVaporize() ? 1 : 0) && llllIIIIlllIlII(this.isFull, Blocks.flowing_water)) {
            final int lllllllllllllIIIIlllIIIIlIIlIIII = lllllllllllllIIIIlllIIIIlIIIlIlI.getX();
            final int lllllllllllllIIIIlllIIIIlIIIllll = lllllllllllllIIIIlllIIIIlIIIlIlI.getY();
            final int lllllllllllllIIIIlllIIIIlIIIlllI = lllllllllllllIIIIlllIIIIlIIIlIlI.getZ();
            lllllllllllllIIIIlllIIIIlIIlIlII.playSoundEffect(lllllllllllllIIIIlllIIIIlIIlIIII + 0.5f, lllllllllllllIIIIlllIIIIlIIIllll + 0.5f, lllllllllllllIIIIlllIIIIlIIIlllI + 0.5f, ItemBucket.lIlIllIIlIIlll[ItemBucket.lIlIllIIlIlIII[1]], 0.5f, 2.6f + (lllllllllllllIIIIlllIIIIlIIlIlII.rand.nextFloat() - lllllllllllllIIIIlllIIIIlIIlIlII.rand.nextFloat()) * 0.8f);
            int lllllllllllllIIIIlllIIIIlIIIllIl = ItemBucket.lIlIllIIlIlIII[1];
            "".length();
            if (" ".length() == 0) {
                return ((0x22 ^ 0x32) & ~(0x4B ^ 0x5B)) != 0x0;
            }
            while (!llllIIIIllllIIl(lllllllllllllIIIIlllIIIIlIIIllIl, ItemBucket.lIlIllIIlIlIII[2])) {
                lllllllllllllIIIIlllIIIIlIIlIlII.spawnParticle(EnumParticleTypes.SMOKE_LARGE, lllllllllllllIIIIlllIIIIlIIlIIII + Math.random(), lllllllllllllIIIIlllIIIIlIIIllll + Math.random(), lllllllllllllIIIIlllIIIIlIIIlllI + Math.random(), 0.0, 0.0, 0.0, new int[ItemBucket.lIlIllIIlIlIII[1]]);
                ++lllllllllllllIIIIlllIIIIlIIIllIl;
            }
            "".length();
            if (((0x6C ^ 0x74 ^ (0x70 ^ 0x53)) & (0x9C ^ 0x8F ^ (0x44 ^ 0x6C) ^ -" ".length())) > "   ".length()) {
                return ((0x27 ^ 0x5E ^ (0x18 ^ 0x36)) & (0x15 ^ 0x7F ^ (0xAC ^ 0x91) ^ -" ".length())) != 0x0;
            }
        }
        else {
            if (llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIIlIlII.isRemote ? 1 : 0) && llllIIIIlllIlll(lllllllllllllIIIIlllIIIIlIIlIIIl ? 1 : 0) && llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIIlIIlI.isLiquid() ? 1 : 0)) {
                lllllllllllllIIIIlllIIIIlIIlIlII.destroyBlock(lllllllllllllIIIIlllIIIIlIIIlIlI, (boolean)(ItemBucket.lIlIllIIlIlIII[0] != 0));
                "".length();
            }
            lllllllllllllIIIIlllIIIIlIIlIlII.setBlockState(lllllllllllllIIIIlllIIIIlIIIlIlI, this.isFull.getDefaultState(), ItemBucket.lIlIllIIlIlIII[3]);
            "".length();
        }
        return ItemBucket.lIlIllIIlIlIII[0] != 0;
    }
    
    private ItemStack fillBucket(final ItemStack lllllllllllllIIIIlllIIIIlIlIIIIl, final EntityPlayer lllllllllllllIIIIlllIIIIlIlIIIll, final Item lllllllllllllIIIIlllIIIIlIlIIIlI) {
        if (llllIIIIlllIlll(lllllllllllllIIIIlllIIIIlIlIIIll.capabilities.isCreativeMode ? 1 : 0)) {
            return lllllllllllllIIIIlllIIIIlIlIIIIl;
        }
        final int n = lllllllllllllIIIIlllIIIIlIlIIIIl.stackSize - ItemBucket.lIlIllIIlIlIII[0];
        lllllllllllllIIIIlllIIIIlIlIIIIl.stackSize = n;
        if (llllIIIIllllIII(n)) {
            return new ItemStack(lllllllllllllIIIIlllIIIIlIlIIIlI);
        }
        if (llllIIIIlllIllI(lllllllllllllIIIIlllIIIIlIlIIIll.inventory.addItemStackToInventory(new ItemStack(lllllllllllllIIIIlllIIIIlIlIIIlI)) ? 1 : 0)) {
            lllllllllllllIIIIlllIIIIlIlIIIll.dropPlayerItemWithRandomChoice(new ItemStack(lllllllllllllIIIIlllIIIIlIlIIIlI, ItemBucket.lIlIllIIlIlIII[0], ItemBucket.lIlIllIIlIlIII[1]), (boolean)(ItemBucket.lIlIllIIlIlIII[1] != 0));
            "".length();
        }
        return lllllllllllllIIIIlllIIIIlIlIIIIl;
    }
    
    private static void llllIIIIlllIIll() {
        (lIlIllIIlIlIII = new int[5])[0] = " ".length();
        ItemBucket.lIlIllIIlIlIII[1] = ((0xC1 ^ 0x83) & ~(0x31 ^ 0x73));
        ItemBucket.lIlIllIIlIlIII[2] = (0x16 ^ 0x1E);
        ItemBucket.lIlIllIIlIlIII[3] = "   ".length();
        ItemBucket.lIlIllIIlIlIII[4] = "  ".length();
    }
    
    private static boolean llllIIIIlllIlll(final int lllllllllllllIIIIlllIIIIIllIlIll) {
        return lllllllllllllIIIIlllIIIIIllIlIll != 0;
    }
    
    private static boolean llllIIIIllllIII(final int lllllllllllllIIIIlllIIIIIllIIlll) {
        return lllllllllllllIIIIlllIIIIIllIIlll <= 0;
    }
    
    private static boolean llllIIIIlllIlII(final Object lllllllllllllIIIIlllIIIIIlllIIII, final Object lllllllllllllIIIIlllIIIIIllIllll) {
        return lllllllllllllIIIIlllIIIIIlllIIII == lllllllllllllIIIIlllIIIIIllIllll;
    }
    
    public ItemBucket(final Block lllllllllllllIIIIlllIIIIllIIIlIl) {
        this.maxStackSize = ItemBucket.lIlIllIIlIlIII[0];
        this.isFull = lllllllllllllIIIIlllIIIIllIIIlIl;
        this.setCreativeTab(CreativeTabs.tabMisc);
        "".length();
    }
    
    private static boolean llllIIIIllllIIl(final int lllllllllllllIIIIlllIIIIIlllIlII, final int lllllllllllllIIIIlllIIIIIlllIIll) {
        return lllllllllllllIIIIlllIIIIIlllIlII >= lllllllllllllIIIIlllIIIIIlllIIll;
    }
    
    static {
        llllIIIIlllIIll();
        llllIIIIlllIIlI();
    }
}
