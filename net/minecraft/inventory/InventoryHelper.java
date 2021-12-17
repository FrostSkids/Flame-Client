// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.util.BlockPos;
import net.minecraft.entity.Entity;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import java.util.Random;

public class InventoryHelper
{
    private static final /* synthetic */ Random RANDOM;
    private static final /* synthetic */ int[] lIlIlIIlIIlllI;
    
    private static boolean lllIllIIIlIlIII(final int lllllllllllllIIIlIlIIIlIllIllIII) {
        return lllllllllllllIIIlIlIIIlIllIllIII != 0;
    }
    
    private static boolean lllIllIIIlIIllI(final int lllllllllllllIIIlIlIIIlIlllIIIIl, final int lllllllllllllIIIlIlIIIlIlllIIIII) {
        return lllllllllllllIIIlIlIIIlIlllIIIIl >= lllllllllllllIIIlIlIIIlIlllIIIII;
    }
    
    static {
        lllIllIIIlIIlII();
        RANDOM = new Random();
    }
    
    private static void lllIllIIIlIIlII() {
        (lIlIlIIlIIlllI = new int[3])[0] = ((0x4A ^ 0x9) & ~(0x23 ^ 0x60));
        InventoryHelper.lIlIlIIlIIlllI[1] = (0x18 ^ 0x2E ^ (0x23 ^ 0x0));
        InventoryHelper.lIlIlIIlIIlllI[2] = (0x46 ^ 0x4C);
    }
    
    private static void func_180174_a(final World lllllllllllllIIIlIlIIIllIIIIlIll, final double lllllllllllllIIIlIlIIIllIIIlIIIl, final double lllllllllllllIIIlIlIIIllIIIIlIIl, final double lllllllllllllIIIlIlIIIllIIIIllll, final IInventory lllllllllllllIIIlIlIIIllIIIIlllI) {
        int lllllllllllllIIIlIlIIIllIIIIllIl = InventoryHelper.lIlIlIIlIIlllI[0];
        "".length();
        if (-" ".length() > 0) {
            return;
        }
        while (!lllIllIIIlIIllI(lllllllllllllIIIlIlIIIllIIIIllIl, lllllllllllllIIIlIlIIIllIIIIlllI.getSizeInventory())) {
            final ItemStack lllllllllllllIIIlIlIIIllIIIIllII = lllllllllllllIIIlIlIIIllIIIIlllI.getStackInSlot(lllllllllllllIIIlIlIIIllIIIIllIl);
            if (lllIllIIIlIIlIl(lllllllllllllIIIlIlIIIllIIIIllII)) {
                spawnItemStack(lllllllllllllIIIlIlIIIllIIIIlIll, lllllllllllllIIIlIlIIIllIIIlIIIl, lllllllllllllIIIlIlIIIllIIIIlIIl, lllllllllllllIIIlIlIIIllIIIIllll, lllllllllllllIIIlIlIIIllIIIIllII);
            }
            ++lllllllllllllIIIlIlIIIllIIIIllIl;
        }
    }
    
    private static boolean lllIllIIIlIlIIl(final int lllllllllllllIIIlIlIIIlIllIlIllI) {
        return lllllllllllllIIIlIlIIIlIllIlIllI <= 0;
    }
    
    private static void spawnItemStack(final World lllllllllllllIIIlIlIIIlIlllIlllI, final double lllllllllllllIIIlIlIIIlIlllllIII, final double lllllllllllllIIIlIlIIIlIllllIlll, final double lllllllllllllIIIlIlIIIlIlllIlIll, final ItemStack lllllllllllllIIIlIlIIIlIlllIlIlI) {
        final float lllllllllllllIIIlIlIIIlIllllIlII = InventoryHelper.RANDOM.nextFloat() * 0.8f + 0.1f;
        final float lllllllllllllIIIlIlIIIlIllllIIll = InventoryHelper.RANDOM.nextFloat() * 0.8f + 0.1f;
        final float lllllllllllllIIIlIlIIIlIllllIIlI = InventoryHelper.RANDOM.nextFloat() * 0.8f + 0.1f;
        "".length();
        if ("  ".length() > (77 + 41 + 26 + 7 ^ 79 + 26 + 15 + 27)) {
            return;
        }
        while (!lllIllIIIlIlIIl(lllllllllllllIIIlIlIIIlIlllIlIlI.stackSize)) {
            int lllllllllllllIIIlIlIIIlIllllIIIl = InventoryHelper.RANDOM.nextInt(InventoryHelper.lIlIlIIlIIlllI[1]) + InventoryHelper.lIlIlIIlIIlllI[2];
            if (lllIllIIIlIIlll(lllllllllllllIIIlIlIIIlIllllIIIl, lllllllllllllIIIlIlIIIlIlllIlIlI.stackSize)) {
                lllllllllllllIIIlIlIIIlIllllIIIl = lllllllllllllIIIlIlIIIlIlllIlIlI.stackSize;
            }
            lllllllllllllIIIlIlIIIlIlllIlIlI.stackSize -= lllllllllllllIIIlIlIIIlIllllIIIl;
            final EntityItem lllllllllllllIIIlIlIIIlIllllIIII = new EntityItem(lllllllllllllIIIlIlIIIlIlllIlllI, lllllllllllllIIIlIlIIIlIlllllIII + lllllllllllllIIIlIlIIIlIllllIlII, lllllllllllllIIIlIlIIIlIllllIlll + lllllllllllllIIIlIlIIIlIllllIIll, lllllllllllllIIIlIlIIIlIlllIlIll + lllllllllllllIIIlIlIIIlIllllIIlI, new ItemStack(lllllllllllllIIIlIlIIIlIlllIlIlI.getItem(), lllllllllllllIIIlIlIIIlIllllIIIl, lllllllllllllIIIlIlIIIlIlllIlIlI.getMetadata()));
            if (lllIllIIIlIlIII(lllllllllllllIIIlIlIIIlIlllIlIlI.hasTagCompound() ? 1 : 0)) {
                lllllllllllllIIIlIlIIIlIllllIIII.getEntityItem().setTagCompound((NBTTagCompound)lllllllllllllIIIlIlIIIlIlllIlIlI.getTagCompound().copy());
            }
            final float lllllllllllllIIIlIlIIIlIlllIllll = 0.05f;
            lllllllllllllIIIlIlIIIlIllllIIII.motionX = InventoryHelper.RANDOM.nextGaussian() * lllllllllllllIIIlIlIIIlIlllIllll;
            lllllllllllllIIIlIlIIIlIllllIIII.motionY = InventoryHelper.RANDOM.nextGaussian() * lllllllllllllIIIlIlIIIlIlllIllll + 0.20000000298023224;
            lllllllllllllIIIlIlIIIlIllllIIII.motionZ = InventoryHelper.RANDOM.nextGaussian() * lllllllllllllIIIlIlIIIlIlllIllll;
            lllllllllllllIIIlIlIIIlIlllIlllI.spawnEntityInWorld(lllllllllllllIIIlIlIIIlIllllIIII);
            "".length();
        }
    }
    
    public static void func_180176_a(final World lllllllllllllIIIlIlIIIllIIIlllII, final Entity lllllllllllllIIIlIlIIIllIIIllIll, final IInventory lllllllllllllIIIlIlIIIllIIIlllIl) {
        func_180174_a(lllllllllllllIIIlIlIIIllIIIlllII, lllllllllllllIIIlIlIIIllIIIllIll.posX, lllllllllllllIIIlIlIIIllIIIllIll.posY, lllllllllllllIIIlIlIIIllIIIllIll.posZ, lllllllllllllIIIlIlIIIllIIIlllIl);
    }
    
    private static boolean lllIllIIIlIIlll(final int lllllllllllllIIIlIlIIIlIllIlllIl, final int lllllllllllllIIIlIlIIIlIllIlllII) {
        return lllllllllllllIIIlIlIIIlIllIlllIl > lllllllllllllIIIlIlIIIlIllIlllII;
    }
    
    private static boolean lllIllIIIlIIlIl(final Object lllllllllllllIIIlIlIIIlIllIllIlI) {
        return lllllllllllllIIIlIlIIIlIllIllIlI != null;
    }
    
    public static void dropInventoryItems(final World lllllllllllllIIIlIlIIIllIIlIIlIl, final BlockPos lllllllllllllIIIlIlIIIllIIlIIlII, final IInventory lllllllllllllIIIlIlIIIllIIlIIllI) {
        func_180174_a(lllllllllllllIIIlIlIIIllIIlIIlIl, lllllllllllllIIIlIlIIIllIIlIIlII.getX(), lllllllllllllIIIlIlIIIllIIlIIlII.getY(), lllllllllllllIIIlIlIIIllIIlIIlII.getZ(), lllllllllllllIIIlIlIIIllIIlIIllI);
    }
}
