// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.stats.StatList;
import net.minecraft.entity.projectile.EntityFishHook;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;

public class ItemFishingRod extends Item
{
    private static final /* synthetic */ int[] lIIlIlIllIIllI;
    private static final /* synthetic */ String[] lIIlIlIllIIlIl;
    
    public ItemFishingRod() {
        this.setMaxDamage(ItemFishingRod.lIIlIlIllIIllI[0]);
        "".length();
        this.setMaxStackSize(ItemFishingRod.lIIlIlIllIIllI[1]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabTools);
        "".length();
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIIllIIllIllIIlIIIlI, final World lllllllllllllIIllIIllIllIIlIIllI, final EntityPlayer lllllllllllllIIllIIllIllIIlIIlIl) {
        if (llIlIIIlIIlIllI(lllllllllllllIIllIIllIllIIlIIlIl.fishEntity)) {
            final int lllllllllllllIIllIIllIllIIlIIlII = lllllllllllllIIllIIllIllIIlIIlIl.fishEntity.handleHookRetraction();
            lllllllllllllIIllIIllIllIIlIIIlI.damageItem(lllllllllllllIIllIIllIllIIlIIlII, lllllllllllllIIllIIllIllIIlIIlIl);
            lllllllllllllIIllIIllIllIIlIIlIl.swingItem();
            "".length();
            if ((0xD3 ^ 0xC3 ^ (0x95 ^ 0x81)) < 0) {
                return null;
            }
        }
        else {
            lllllllllllllIIllIIllIllIIlIIllI.playSoundAtEntity(lllllllllllllIIllIIllIllIIlIIlIl, ItemFishingRod.lIIlIlIllIIlIl[ItemFishingRod.lIIlIlIllIIllI[2]], 0.5f, 0.4f / (ItemFishingRod.itemRand.nextFloat() * 0.4f + 0.8f));
            if (llIlIIIlIIlIlll(lllllllllllllIIllIIllIllIIlIIllI.isRemote ? 1 : 0)) {
                lllllllllllllIIllIIllIllIIlIIllI.spawnEntityInWorld(new EntityFishHook(lllllllllllllIIllIIllIllIIlIIllI, lllllllllllllIIllIIllIllIIlIIlIl));
                "".length();
            }
            lllllllllllllIIllIIllIllIIlIIlIl.swingItem();
            lllllllllllllIIllIIllIllIIlIIlIl.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
        }
        return lllllllllllllIIllIIllIllIIlIIIlI;
    }
    
    @Override
    public int getItemEnchantability() {
        return ItemFishingRod.lIIlIlIllIIllI[1];
    }
    
    static {
        llIlIIIlIIlIlIl();
        llIlIIIlIIlIlII();
    }
    
    @Override
    public boolean isFull3D() {
        return ItemFishingRod.lIIlIlIllIIllI[1] != 0;
    }
    
    private static String llIlIIIlIIlIIll(final String lllllllllllllIIllIIllIllIIIlIIII, final String lllllllllllllIIllIIllIllIIIIllll) {
        try {
            final SecretKeySpec lllllllllllllIIllIIllIllIIIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIIllIllIIIIllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllIIllIllIIIlIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIIllIIllIllIIIlIIlI.init(ItemFishingRod.lIIlIlIllIIllI[3], lllllllllllllIIllIIllIllIIIlIIll);
            return new String(lllllllllllllIIllIIllIllIIIlIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIIllIllIIIlIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIIllIllIIIlIIIl) {
            lllllllllllllIIllIIllIllIIIlIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public boolean isItemTool(final ItemStack lllllllllllllIIllIIllIllIIIllIll) {
        return super.isItemTool(lllllllllllllIIllIIllIllIIIllIll);
    }
    
    private static void llIlIIIlIIlIlIl() {
        (lIIlIlIllIIllI = new int[4])[0] = (0xCA ^ 0xA0 ^ (0x9A ^ 0xB0));
        ItemFishingRod.lIIlIlIllIIllI[1] = " ".length();
        ItemFishingRod.lIIlIlIllIIllI[2] = ((0x16 ^ 0x18) & ~(0x56 ^ 0x58));
        ItemFishingRod.lIIlIlIllIIllI[3] = "  ".length();
    }
    
    private static boolean llIlIIIlIIlIllI(final Object lllllllllllllIIllIIllIllIIIIlIIl) {
        return lllllllllllllIIllIIllIllIIIIlIIl != null;
    }
    
    @Override
    public boolean shouldRotateAroundWhenRendering() {
        return ItemFishingRod.lIIlIlIllIIllI[1] != 0;
    }
    
    private static void llIlIIIlIIlIlII() {
        (lIIlIlIllIIlIl = new String[ItemFishingRod.lIIlIlIllIIllI[1]])[ItemFishingRod.lIIlIlIllIIllI[2]] = llIlIIIlIIlIIll("xIb3/quClhgP7rg1++c4RA==", "CzEYb");
    }
    
    private static boolean llIlIIIlIIlIlll(final int lllllllllllllIIllIIllIllIIIIIlll) {
        return lllllllllllllIIllIIllIllIIIIIlll == 0;
    }
}
