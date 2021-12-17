// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import java.util.Arrays;
import net.minecraft.stats.StatList;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantment;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.init.Items;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBow extends Item
{
    private static final /* synthetic */ String[] lIIIIlIllIIlIl;
    private static final /* synthetic */ int[] lIIIIlIlllIlIl;
    
    public ItemBow() {
        this.maxStackSize = ItemBow.lIIIIlIlllIlIl[2];
        this.setMaxDamage(ItemBow.lIIIIlIlllIlIl[4]);
        "".length();
        this.setCreativeTab(CreativeTabs.tabCombat);
        "".length();
    }
    
    private static boolean lIlllIlIllIIIlI(final int lllllllllllllIlIIlIlIIIIllllIIll) {
        return lllllllllllllIlIIlIlIIIIllllIIll <= 0;
    }
    
    private static boolean lIlllIlIllIIIIl(final int lllllllllllllIlIIlIlIIIIllllIlll) {
        return lllllllllllllIlIIlIlIIIIllllIlll == 0;
    }
    
    private static void lIlllIlIlIllllI() {
        (lIIIIlIlllIlIl = new int[9])[0] = "   ".length();
        ItemBow.lIIIIlIlllIlIl[1] = ((0x91 ^ 0x97 ^ (0x46 ^ 0xD)) & (0xA1 ^ 0x91 ^ (0x24 ^ 0x59) ^ -" ".length()));
        ItemBow.lIIIIlIlllIlIl[2] = " ".length();
        ItemBow.lIIIIlIlllIlIl[3] = "  ".length();
        ItemBow.lIIIIlIlllIlIl[4] = (0xFFFF87A5 & 0x79DA);
        ItemBow.lIIIIlIlllIlIl[5] = (132 + 211 - 139 + 34 ^ 95 + 31 - 104 + 116);
        ItemBow.lIIIIlIlllIlIl[6] = (-(0xFFFFC1D5 & 0x7E3E) & (0xFFFFFFFB & 0x15957));
        ItemBow.lIIIIlIlllIlIl[7] = (0x1 ^ 0x5);
        ItemBow.lIIIIlIlllIlIl[8] = (63 + 109 - 79 + 108 ^ 10 + 169 - 15 + 29);
    }
    
    static {
        lIlllIlIlIllllI();
        lIlllIlIIllIIIl();
        final String[] bowPullIconNameArray2 = new String[ItemBow.lIIIIlIlllIlIl[0]];
        bowPullIconNameArray2[ItemBow.lIIIIlIlllIlIl[1]] = ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[1]];
        bowPullIconNameArray2[ItemBow.lIIIIlIlllIlIl[2]] = ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[2]];
        bowPullIconNameArray2[ItemBow.lIIIIlIlllIlIl[3]] = ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[3]];
        bowPullIconNameArray = bowPullIconNameArray2;
    }
    
    @Override
    public ItemStack onItemRightClick(final ItemStack lllllllllllllIlIIlIlIIIlIIllIIll, final World lllllllllllllIlIIlIlIIIlIIllIllI, final EntityPlayer lllllllllllllIlIIlIlIIIlIIllIIlI) {
        if (!lIlllIlIllIIIIl(lllllllllllllIlIIlIlIIIlIIllIIlI.capabilities.isCreativeMode ? 1 : 0) || lIlllIlIllIIIll(lllllllllllllIlIIlIlIIIlIIllIIlI.inventory.hasItem(Items.arrow) ? 1 : 0)) {
            lllllllllllllIlIIlIlIIIlIIllIIlI.setItemInUse(lllllllllllllIlIIlIlIIIlIIllIIll, this.getMaxItemUseDuration(lllllllllllllIlIIlIlIIIlIIllIIll));
        }
        return lllllllllllllIlIIlIlIIIlIIllIIll;
    }
    
    @Override
    public int getMaxItemUseDuration(final ItemStack lllllllllllllIlIIlIlIIIlIIlllllI) {
        return ItemBow.lIIIIlIlllIlIl[6];
    }
    
    @Override
    public EnumAction getItemUseAction(final ItemStack lllllllllllllIlIIlIlIIIlIIllllII) {
        return EnumAction.BOW;
    }
    
    private static String lIlllIlIIlIlllI(String lllllllllllllIlIIlIlIIIlIIIIIlll, final String lllllllllllllIlIIlIlIIIlIIIIlIll) {
        lllllllllllllIlIIlIlIIIlIIIIIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIlIIIIIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIlIIIlIIIIlIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIlIIIlIIIIlIIl = lllllllllllllIlIIlIlIIIlIIIIlIll.toCharArray();
        int lllllllllllllIlIIlIlIIIlIIIIlIII = ItemBow.lIIIIlIlllIlIl[1];
        final int lllllllllllllIlIIlIlIIIlIIIIIIlI = (Object)lllllllllllllIlIIlIlIIIlIIIIIlll.toCharArray();
        final short lllllllllllllIlIIlIlIIIlIIIIIIIl = (short)lllllllllllllIlIIlIlIIIlIIIIIIlI.length;
        float lllllllllllllIlIIlIlIIIlIIIIIIII = ItemBow.lIIIIlIlllIlIl[1];
        while (lIlllIlIllIIllI((int)lllllllllllllIlIIlIlIIIlIIIIIIII, lllllllllllllIlIIlIlIIIlIIIIIIIl)) {
            final char lllllllllllllIlIIlIlIIIlIIIIllIl = lllllllllllllIlIIlIlIIIlIIIIIIlI[lllllllllllllIlIIlIlIIIlIIIIIIII];
            lllllllllllllIlIIlIlIIIlIIIIlIlI.append((char)(lllllllllllllIlIIlIlIIIlIIIIllIl ^ lllllllllllllIlIIlIlIIIlIIIIlIIl[lllllllllllllIlIIlIlIIIlIIIIlIII % lllllllllllllIlIIlIlIIIlIIIIlIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIlIIIlIIIIlIII;
            ++lllllllllllllIlIIlIlIIIlIIIIIIII;
            "".length();
            if (((0x14 ^ 0x4D) & ~(0x38 ^ 0x61)) != 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIlIIIlIIIIlIlI);
    }
    
    @Override
    public ItemStack onItemUseFinish(final ItemStack lllllllllllllIlIIlIlIIIlIlIIIIll, final World lllllllllllllIlIIlIlIIIlIlIIIIlI, final EntityPlayer lllllllllllllIlIIlIlIIIlIlIIIIIl) {
        return lllllllllllllIlIIlIlIIIlIlIIIIll;
    }
    
    private static int lIlllIlIlIlllll(final double n, final double n2) {
        return dcmpg(n, n2);
    }
    
    @Override
    public int getItemEnchantability() {
        return ItemBow.lIIIIlIlllIlIl[2];
    }
    
    private static String lIlllIlIIllIIII(final String lllllllllllllIlIIlIlIIIlIIIlllII, final String lllllllllllllIlIIlIlIIIlIIIllIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIIlIIIlllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIIlIIIllIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIlIIIlIIIllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIlIIIlIIIllllI.init(ItemBow.lIIIIlIlllIlIl[3], lllllllllllllIlIIlIlIIIlIIIlllll);
            return new String(lllllllllllllIlIIlIlIIIlIIIllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIlIIIlllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIIlIIIlllIl) {
            lllllllllllllIlIIlIlIIIlIIIlllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onPlayerStoppedUsing(final ItemStack lllllllllllllIlIIlIlIIIlIlIllIlI, final World lllllllllllllIlIIlIlIIIlIlIllIIl, final EntityPlayer lllllllllllllIlIIlIlIIIlIlIllIII, final int lllllllllllllIlIIlIlIIIlIlIlIlll) {
        int n;
        if (lIlllIlIllIIIIl(lllllllllllllIlIIlIlIIIlIlIllIII.capabilities.isCreativeMode ? 1 : 0) && lIlllIlIllIIIlI(EnchantmentHelper.getEnchantmentLevel(Enchantment.infinity.effectId, lllllllllllllIlIIlIlIIIlIlIllIlI))) {
            n = ItemBow.lIIIIlIlllIlIl[1];
            "".length();
            if (((0x1A ^ 0x66 ^ (0x72 ^ 0x35)) & (0x2F ^ 0x41 ^ (0x10 ^ 0x45) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        else {
            n = ItemBow.lIIIIlIlllIlIl[2];
        }
        final boolean lllllllllllllIlIIlIlIIIlIlIlIllI = n != 0;
        if (!lIlllIlIllIIIIl(lllllllllllllIlIIlIlIIIlIlIlIllI ? 1 : 0) || lIlllIlIllIIIll(lllllllllllllIlIIlIlIIIlIlIllIII.inventory.hasItem(Items.arrow) ? 1 : 0)) {
            final int lllllllllllllIlIIlIlIIIlIlIlIlIl = this.getMaxItemUseDuration(lllllllllllllIlIIlIlIIIlIlIllIlI) - lllllllllllllIlIIlIlIIIlIlIlIlll;
            float lllllllllllllIlIIlIlIIIlIlIlIlII = lllllllllllllIlIIlIlIIIlIlIlIlIl / 20.0f;
            lllllllllllllIlIIlIlIIIlIlIlIlII = (lllllllllllllIlIIlIlIIIlIlIlIlII * lllllllllllllIlIIlIlIIIlIlIlIlII + lllllllllllllIlIIlIlIIIlIlIlIlII * 2.0f) / 3.0f;
            if (lIlllIlIllIIlII(lIlllIlIlIlllll(lllllllllllllIlIIlIlIIIlIlIlIlII, 0.1))) {
                return;
            }
            if (lIlllIlIllIIlIl(lIlllIlIllIIIII(lllllllllllllIlIIlIlIIIlIlIlIlII, 1.0f))) {
                lllllllllllllIlIIlIlIIIlIlIlIlII = 1.0f;
            }
            final EntityArrow lllllllllllllIlIIlIlIIIlIlIlIIll = new EntityArrow(lllllllllllllIlIIlIlIIIlIlIllIIl, lllllllllllllIlIIlIlIIIlIlIllIII, lllllllllllllIlIIlIlIIIlIlIlIlII * 2.0f);
            if (lIlllIlIllIIIIl(lIlllIlIllIIIII(lllllllllllllIlIIlIlIIIlIlIlIlII, 1.0f))) {
                lllllllllllllIlIIlIlIIIlIlIlIIll.setIsCritical((boolean)(ItemBow.lIIIIlIlllIlIl[2] != 0));
            }
            final int lllllllllllllIlIIlIlIIIlIlIlIIlI = EnchantmentHelper.getEnchantmentLevel(Enchantment.power.effectId, lllllllllllllIlIIlIlIIIlIlIllIlI);
            if (lIlllIlIllIIlIl(lllllllllllllIlIIlIlIIIlIlIlIIlI)) {
                lllllllllllllIlIIlIlIIIlIlIlIIll.setDamage(lllllllllllllIlIIlIlIIIlIlIlIIll.getDamage() + lllllllllllllIlIIlIlIIIlIlIlIIlI * 0.5 + 0.5);
            }
            final int lllllllllllllIlIIlIlIIIlIlIlIIIl = EnchantmentHelper.getEnchantmentLevel(Enchantment.punch.effectId, lllllllllllllIlIIlIlIIIlIlIllIlI);
            if (lIlllIlIllIIlIl(lllllllllllllIlIIlIlIIIlIlIlIIIl)) {
                lllllllllllllIlIIlIlIIIlIlIlIIll.setKnockbackStrength(lllllllllllllIlIIlIlIIIlIlIlIIIl);
            }
            if (lIlllIlIllIIlIl(EnchantmentHelper.getEnchantmentLevel(Enchantment.flame.effectId, lllllllllllllIlIIlIlIIIlIlIllIlI))) {
                lllllllllllllIlIIlIlIIIlIlIlIIll.setFire(ItemBow.lIIIIlIlllIlIl[5]);
            }
            lllllllllllllIlIIlIlIIIlIlIllIlI.damageItem(ItemBow.lIIIIlIlllIlIl[2], lllllllllllllIlIIlIlIIIlIlIllIII);
            lllllllllllllIlIIlIlIIIlIlIllIIl.playSoundAtEntity(lllllllllllllIlIIlIlIIIlIlIllIII, ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[0]], 1.0f, 1.0f / (ItemBow.itemRand.nextFloat() * 0.4f + 1.2f) + lllllllllllllIlIIlIlIIIlIlIlIlII * 0.5f);
            if (lIlllIlIllIIIll(lllllllllllllIlIIlIlIIIlIlIlIllI ? 1 : 0)) {
                lllllllllllllIlIIlIlIIIlIlIlIIll.canBePickedUp = ItemBow.lIIIIlIlllIlIl[3];
                "".length();
                if (((0x2D ^ 0x57 ^ (0x98 ^ 0xB3)) & (125 + 217 - 195 + 88 ^ 79 + 111 - 13 + 9 ^ -" ".length())) < 0) {
                    return;
                }
            }
            else {
                lllllllllllllIlIIlIlIIIlIlIllIII.inventory.consumeInventoryItem(Items.arrow);
                "".length();
            }
            lllllllllllllIlIIlIlIIIlIlIllIII.triggerAchievement(StatList.objectUseStats[Item.getIdFromItem(this)]);
            if (lIlllIlIllIIIIl(lllllllllllllIlIIlIlIIIlIlIllIIl.isRemote ? 1 : 0)) {
                lllllllllllllIlIIlIlIIIlIlIllIIl.spawnEntityInWorld(lllllllllllllIlIIlIlIIIlIlIlIIll);
                "".length();
            }
        }
    }
    
    private static boolean lIlllIlIllIIllI(final int lllllllllllllIlIIlIlIIIIllllllII, final int lllllllllllllIlIIlIlIIIIlllllIll) {
        return lllllllllllllIlIIlIlIIIIllllllII < lllllllllllllIlIIlIlIIIIlllllIll;
    }
    
    private static int lIlllIlIllIIIII(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lIlllIlIllIIlIl(final int lllllllllllllIlIIlIlIIIIllllIIIl) {
        return lllllllllllllIlIIlIlIIIIllllIIIl > 0;
    }
    
    private static boolean lIlllIlIllIIIll(final int lllllllllllllIlIIlIlIIIIlllllIIl) {
        return lllllllllllllIlIIlIlIIIIlllllIIl != 0;
    }
    
    private static String lIlllIlIIlIllll(final String lllllllllllllIlIIlIlIIIlIIlIIlll, final String lllllllllllllIlIIlIlIIIlIIlIlIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIlIIIlIIlIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIlIIIlIIlIlIII.getBytes(StandardCharsets.UTF_8)), ItemBow.lIIIIlIlllIlIl[8]), "DES");
            final Cipher lllllllllllllIlIIlIlIIIlIIlIlIll = Cipher.getInstance("DES");
            lllllllllllllIlIIlIlIIIlIIlIlIll.init(ItemBow.lIIIIlIlllIlIl[3], lllllllllllllIlIIlIlIIIlIIlIllII);
            return new String(lllllllllllllIlIIlIlIIIlIIlIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIlIIIlIIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIlIIIlIIlIlIlI) {
            lllllllllllllIlIIlIlIIIlIIlIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static void lIlllIlIIllIIIl() {
        (lIIIIlIllIIlIl = new String[ItemBow.lIIIIlIlllIlIl[7]])[ItemBow.lIIIIlIlllIlIl[1]] = lIlllIlIIlIlllI("ICEYKgQ+Myt2", "PTtFm");
        ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[2]] = lIlllIlIIlIllll("Q+e/7Wdo8+YGFlCVgv13YA==", "kyMPW");
        ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[3]] = lIlllIlIIlIlllI("OTYOFiInJD1I", "ICbzK");
        ItemBow.lIIIIlIllIIlIl[ItemBow.lIIIIlIlllIlIl[0]] = lIlllIlIIllIIII("FyrBBO+nfhxvbERrOO/A8Q==", "vTnPT");
    }
    
    private static boolean lIlllIlIllIIlII(final int lllllllllllllIlIIlIlIIIIllllIlIl) {
        return lllllllllllllIlIIlIlIIIIllllIlIl < 0;
    }
}
