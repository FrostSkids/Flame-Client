// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import com.google.common.collect.Lists;
import net.minecraft.util.WeightedRandom;
import java.util.List;
import java.util.Arrays;
import java.util.Iterator;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.nbt.NBTTagList;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EnumCreatureAttribute;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.Item;
import com.google.common.collect.Maps;
import net.minecraft.init.Items;
import java.util.Map;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import java.util.Random;

public class EnchantmentHelper
{
    private static final /* synthetic */ Random enchantmentRand;
    private static final /* synthetic */ DamageIterator ENCHANTMENT_ITERATOR_DAMAGE;
    private static final /* synthetic */ String[] lIIIIllIIlIlll;
    private static final /* synthetic */ ModifierDamage enchantmentModifierDamage;
    private static final /* synthetic */ int[] lIIIIllIlIlllI;
    private static final /* synthetic */ ModifierLiving enchantmentModifierLiving;
    private static final /* synthetic */ HurtIterator ENCHANTMENT_ITERATOR_HURT;
    
    public static int getLuckOfSeaModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIllIIl) {
        return getEnchantmentLevel(Enchantment.luckOfTheSea.effectId, lllllllllllllIlIIlIIlIIIlIIllIIl.getHeldItem());
    }
    
    public static Map<Integer, EnchantmentData> mapEnchantmentData(final int lllllllllllllIlIIlIIlIIIIIIllIlI, final ItemStack lllllllllllllIlIIlIIlIIIIIIlIIlI) {
        final Item lllllllllllllIlIIlIIlIIIIIIllIII = lllllllllllllIlIIlIIlIIIIIIlIIlI.getItem();
        Map<Integer, EnchantmentData> lllllllllllllIlIIlIIlIIIIIIlIlll = null;
        int n;
        if (lIlllIlllllIlll(lllllllllllllIlIIlIIlIIIIIIlIIlI.getItem(), Items.book)) {
            n = EnchantmentHelper.lIIIIllIlIlllI[1];
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        else {
            n = EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        final boolean lllllllllllllIlIIlIIlIIIIIIlIllI = n != 0;
        final byte lllllllllllllIlIIlIIlIIIIIIIlIll;
        final Exception lllllllllllllIlIIlIIlIIIIIIIllII = (Exception)((Enchantment[])(Object)(lllllllllllllIlIIlIIlIIIIIIIlIll = (byte)(Object)Enchantment.enchantmentsBookList)).length;
        int lllllllllllllIlIIlIIlIIIIIIIllIl = EnchantmentHelper.lIIIIllIlIlllI[0];
        "".length();
        if (" ".length() <= -" ".length()) {
            return null;
        }
        while (!lIlllIlllllIllI(lllllllllllllIlIIlIIlIIIIIIIllIl, (int)lllllllllllllIlIIlIIlIIIIIIIllII)) {
            final Enchantment lllllllllllllIlIIlIIlIIIIIIlIlIl = lllllllllllllIlIIlIIlIIIIIIIlIll[lllllllllllllIlIIlIIlIIIIIIIllIl];
            if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIIIIlIlIl) && (!lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIIIlIlIl.type.canEnchantItem(lllllllllllllIlIIlIIlIIIIIIllIII) ? 1 : 0) || lIlllIlllllllII(lllllllllllllIlIIlIIlIIIIIIlIllI ? 1 : 0))) {
                int lllllllllllllIlIIlIIlIIIIIIlIlII = lllllllllllllIlIIlIIlIIIIIIlIlIl.getMinLevel();
                "".length();
                if (" ".length() <= -" ".length()) {
                    return null;
                }
                while (!lIlllIlllllllIl(lllllllllllllIlIIlIIlIIIIIIlIlII, lllllllllllllIlIIlIIlIIIIIIlIlIl.getMaxLevel())) {
                    if (lIlllIlllllIllI(lllllllllllllIlIIlIIlIIIIIIllIlI, lllllllllllllIlIIlIIlIIIIIIlIlIl.getMinEnchantability(lllllllllllllIlIIlIIlIIIIIIlIlII)) && lIllllIIIIIIIIl(lllllllllllllIlIIlIIlIIIIIIllIlI, lllllllllllllIlIIlIIlIIIIIIlIlIl.getMaxEnchantability(lllllllllllllIlIIlIIlIIIIIIlIlII))) {
                        if (lIlllIlllllIlII(lllllllllllllIlIIlIIlIIIIIIlIlll)) {
                            lllllllllllllIlIIlIIlIIIIIIlIlll = (Map<Integer, EnchantmentData>)Maps.newHashMap();
                        }
                        lllllllllllllIlIIlIIlIIIIIIlIlll.put(lllllllllllllIlIIlIIlIIIIIIlIlIl.effectId, new EnchantmentData(lllllllllllllIlIIlIIlIIIIIIlIlIl, lllllllllllllIlIIlIIlIIIIIIlIlII));
                        "".length();
                    }
                    ++lllllllllllllIlIIlIIlIIIIIIlIlII;
                }
            }
            ++lllllllllllllIlIIlIIlIIIIIIIllIl;
        }
        return lllllllllllllIlIIlIIlIIIIIIlIlll;
    }
    
    public static int getLootingModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIlIIll) {
        return getEnchantmentLevel(Enchantment.looting.effectId, lllllllllllllIlIIlIIlIIIlIIlIIll.getHeldItem());
    }
    
    public static int calcItemStackEnchantability(final Random lllllllllllllIlIIlIIlIIIIllllIIl, final int lllllllllllllIlIIlIIlIIIIllllIII, int lllllllllllllIlIIlIIlIIIIlllIIII, final ItemStack lllllllllllllIlIIlIIlIIIIlllIllI) {
        final Item lllllllllllllIlIIlIIlIIIIlllIlIl = lllllllllllllIlIIlIIlIIIIlllIllI.getItem();
        final int lllllllllllllIlIIlIIlIIIIlllIlII = lllllllllllllIlIIlIIlIIIIlllIlIl.getItemEnchantability();
        if (lIlllIlllllllll(lllllllllllllIlIIlIIlIIIIlllIlII)) {
            return EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        if (lIlllIlllllllIl((int)lllllllllllllIlIIlIIlIIIIlllIIII, EnchantmentHelper.lIIIIllIlIlllI[11])) {
            lllllllllllllIlIIlIIlIIIIlllIIII = EnchantmentHelper.lIIIIllIlIlllI[11];
        }
        final int lllllllllllllIlIIlIIlIIIIlllIIll = (int)(lllllllllllllIlIIlIIlIIIIllllIIl.nextInt(EnchantmentHelper.lIIIIllIlIlllI[8]) + EnchantmentHelper.lIIIIllIlIlllI[1] + (lllllllllllllIlIIlIIlIIIIlllIIII >> EnchantmentHelper.lIIIIllIlIlllI[1]) + lllllllllllllIlIIlIIlIIIIllllIIl.nextInt((int)(lllllllllllllIlIIlIIlIIIIlllIIII + EnchantmentHelper.lIIIIllIlIlllI[1])));
        int n;
        if (lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIllllIII)) {
            n = Math.max(lllllllllllllIlIIlIIlIIIIlllIIll / EnchantmentHelper.lIIIIllIlIlllI[3], EnchantmentHelper.lIIIIllIlIlllI[1]);
            "".length();
            if (((0x17 ^ 0x42) & ~(0x77 ^ 0x22)) < 0) {
                return (0x0 ^ 0x55) & ~(0x9 ^ 0x5C);
            }
        }
        else if (lIlllIlllllIlIl(lllllllllllllIlIIlIIlIIIIllllIII, EnchantmentHelper.lIIIIllIlIlllI[1])) {
            n = lllllllllllllIlIIlIIlIIIIlllIIll * EnchantmentHelper.lIIIIllIlIlllI[2] / EnchantmentHelper.lIIIIllIlIlllI[3] + EnchantmentHelper.lIIIIllIlIlllI[1];
            "".length();
            if (((0x8D ^ 0x9D) & ~(0x1E ^ 0xE)) > 0) {
                return (0x43 ^ 0x65) & ~(0xA4 ^ 0x82);
            }
        }
        else {
            n = Math.max(lllllllllllllIlIIlIIlIIIIlllIIll, (int)(lllllllllllllIlIIlIIlIIIIlllIIII * EnchantmentHelper.lIIIIllIlIlllI[2]));
        }
        return n;
    }
    
    private static String lIlllIllIlIIIIl(final String lllllllllllllIlIIlIIIlllllIllIll, final String lllllllllllllIlIIlIIIlllllIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIIllllllIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIIlllllIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIIlllllIlllll = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIIlllllIlllll.init(EnchantmentHelper.lIIIIllIlIlllI[2], lllllllllllllIlIIlIIIllllllIIIII);
            return new String(lllllllllllllIlIIlIIIlllllIlllll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIIlllllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIIlllllIllllI) {
            lllllllllllllIlIIlIIIlllllIllllI.printStackTrace();
            return null;
        }
    }
    
    private static String lIlllIllIlIIlII(String lllllllllllllIlIIlIIIllllllIllIl, final String lllllllllllllIlIIlIIIllllllIllII) {
        lllllllllllllIlIIlIIIllllllIllIl = (long)new String(Base64.getDecoder().decode(((String)lllllllllllllIlIIlIIIllllllIllIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIIlllllllIIII = new StringBuilder();
        final char[] lllllllllllllIlIIlIIIllllllIllll = lllllllllllllIlIIlIIIllllllIllII.toCharArray();
        int lllllllllllllIlIIlIIIllllllIlllI = EnchantmentHelper.lIIIIllIlIlllI[0];
        final String lllllllllllllIlIIlIIIllllllIlIII = (Object)((String)lllllllllllllIlIIlIIIllllllIllIl).toCharArray();
        final double lllllllllllllIlIIlIIIllllllIIlll = lllllllllllllIlIIlIIIllllllIlIII.length;
        char lllllllllllllIlIIlIIIllllllIIllI = (char)EnchantmentHelper.lIIIIllIlIlllI[0];
        while (lIllllIIIIIIIII(lllllllllllllIlIIlIIIllllllIIllI, (int)lllllllllllllIlIIlIIIllllllIIlll)) {
            final char lllllllllllllIlIIlIIIlllllllIIll = lllllllllllllIlIIlIIIllllllIlIII[lllllllllllllIlIIlIIIllllllIIllI];
            lllllllllllllIlIIlIIIlllllllIIII.append((char)(lllllllllllllIlIIlIIIlllllllIIll ^ lllllllllllllIlIIlIIIllllllIllll[lllllllllllllIlIIlIIIllllllIlllI % lllllllllllllIlIIlIIIllllllIllll.length]));
            "".length();
            ++lllllllllllllIlIIlIIIllllllIlllI;
            ++lllllllllllllIlIIlIIIllllllIIllI;
            "".length();
            if ((0xFF ^ 0x8D ^ (0x7B ^ 0xC)) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIIlllllllIIII);
    }
    
    public static void applyArthropodEnchantments(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIllIlII, final Entity lllllllllllllIlIIlIIlIIIlIllIIll) {
        EnchantmentHelper.ENCHANTMENT_ITERATOR_DAMAGE.user = lllllllllllllIlIIlIIlIIIlIllIlII;
        EnchantmentHelper.ENCHANTMENT_ITERATOR_DAMAGE.target = lllllllllllllIlIIlIIlIIIlIllIIll;
        if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIlIllIlII)) {
            applyEnchantmentModifierArray(EnchantmentHelper.ENCHANTMENT_ITERATOR_DAMAGE, lllllllllllllIlIIlIIlIIIlIllIlII.getInventory());
        }
        if (lIlllIlllllllII((lllllllllllllIlIIlIIlIIIlIllIlII instanceof EntityPlayer) ? 1 : 0)) {
            applyEnchantmentModifier(EnchantmentHelper.ENCHANTMENT_ITERATOR_DAMAGE, lllllllllllllIlIIlIIlIIIlIllIlII.getHeldItem());
        }
    }
    
    public static int getKnockbackModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIlIlllI) {
        return getEnchantmentLevel(Enchantment.knockback.effectId, lllllllllllllIlIIlIIlIIIlIlIlllI.getHeldItem());
    }
    
    private static boolean lIlllIlllllllIl(final int lllllllllllllIlIIlIIIlllllIIIlIl, final int lllllllllllllIlIIlIIIlllllIIIlII) {
        return lllllllllllllIlIIlIIIlllllIIIlIl > lllllllllllllIlIIlIIIlllllIIIlII;
    }
    
    public static boolean getSilkTouchModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIlllll) {
        if (lIlllIllllllIlI(getEnchantmentLevel(Enchantment.silkTouch.effectId, lllllllllllllIlIIlIIlIIIlIIlllll.getHeldItem()))) {
            return EnchantmentHelper.lIIIIllIlIlllI[1] != 0;
        }
        return EnchantmentHelper.lIIIIllIlIlllI[0] != 0;
    }
    
    private static boolean lIlllIlllllIlIl(final int lllllllllllllIlIIlIIIlllllIlIlIl, final int lllllllllllllIlIIlIIIlllllIlIlII) {
        return lllllllllllllIlIIlIIIlllllIlIlIl == lllllllllllllIlIIlIIIlllllIlIlII;
    }
    
    private static void lIlllIllIlIlIII() {
        (lIIIIllIIlIlll = new String[EnchantmentHelper.lIIIIllIlIlllI[13]])[EnchantmentHelper.lIIIIllIlIlllI[0]] = lIlllIllIlIIIIl("gM6mFwIro5M=", "Cnear");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[1]] = lIlllIllIlIIIll("+UflW+xpuo4=", "IuOYV");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[2]] = lIlllIllIlIIlII("JTw=", "LXLuK");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[3]] = lIlllIllIlIIIll("r3k+yX+O5dU=", "AgqGV");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[4]] = lIlllIllIlIIIIl("QY6HTdRMT1A=", "Uxmyg");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[5]] = lIlllIllIlIIIIl("XbtXeTlC8Js=", "ijiHA");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[6]] = lIlllIllIlIIlII("Jg8LOg==", "CahRx");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[7]] = lIlllIllIlIIIll("3l6eTOYjBE0=", "nMEfH");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[8]] = lIlllIllIlIIIIl("l0kvWO2XQJM=", "EYGqT");
        EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[9]] = lIlllIllIlIIlII("GDM6", "tEVuG");
    }
    
    public static float func_152377_a(final ItemStack lllllllllllllIlIIlIIlIIIllIIIIII, final EnumCreatureAttribute lllllllllllllIlIIlIIlIIIlIllllll) {
        EnchantmentHelper.enchantmentModifierLiving.livingModifier = 0.0f;
        EnchantmentHelper.enchantmentModifierLiving.entityLiving = lllllllllllllIlIIlIIlIIIlIllllll;
        applyEnchantmentModifier(EnchantmentHelper.enchantmentModifierLiving, lllllllllllllIlIIlIIlIIIllIIIIII);
        return EnchantmentHelper.enchantmentModifierLiving.livingModifier;
    }
    
    private static boolean lIllllIIIIIIIII(final int lllllllllllllIlIIlIIIlllllIIllIl, final int lllllllllllllIlIIlIIIlllllIIllII) {
        return lllllllllllllIlIIlIIIlllllIIllIl < lllllllllllllIlIIlIIIlllllIIllII;
    }
    
    public static int getEnchantmentModifierDamage(final ItemStack[] lllllllllllllIlIIlIIlIIIllIIIllI, final DamageSource lllllllllllllIlIIlIIlIIIllIIIIll) {
        EnchantmentHelper.enchantmentModifierDamage.damageModifier = EnchantmentHelper.lIIIIllIlIlllI[0];
        EnchantmentHelper.enchantmentModifierDamage.source = lllllllllllllIlIIlIIlIIIllIIIIll;
        applyEnchantmentModifierArray(EnchantmentHelper.enchantmentModifierDamage, lllllllllllllIlIIlIIlIIIllIIIllI);
        if (lIlllIlllllllIl(EnchantmentHelper.enchantmentModifierDamage.damageModifier, EnchantmentHelper.lIIIIllIlIlllI[10])) {
            EnchantmentHelper.enchantmentModifierDamage.damageModifier = EnchantmentHelper.lIIIIllIlIlllI[10];
            "".length();
            if (((0x43 ^ 0x5D) & ~(0x81 ^ 0x9F)) >= " ".length()) {
                return (0x61 ^ 0x2E) & ~(0xC9 ^ 0x86);
            }
        }
        else if (lIlllIllllllllI(EnchantmentHelper.enchantmentModifierDamage.damageModifier)) {
            EnchantmentHelper.enchantmentModifierDamage.damageModifier = EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        return (EnchantmentHelper.enchantmentModifierDamage.damageModifier + EnchantmentHelper.lIIIIllIlIlllI[1] >> EnchantmentHelper.lIIIIllIlIlllI[1]) + EnchantmentHelper.enchantmentRand.nextInt((EnchantmentHelper.enchantmentModifierDamage.damageModifier >> EnchantmentHelper.lIIIIllIlIlllI[1]) + EnchantmentHelper.lIIIIllIlIlllI[1]);
    }
    
    public static int getFortuneModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIlllII) {
        return getEnchantmentLevel(Enchantment.fortune.effectId, lllllllllllllIlIIlIIlIIIlIIlllII.getHeldItem());
    }
    
    private static boolean lIlllIllllllIII(final Object lllllllllllllIlIIlIIIllllIlllIlI) {
        return lllllllllllllIlIIlIIIllllIlllIlI != null;
    }
    
    private static boolean lIlllIlllllIllI(final int lllllllllllllIlIIlIIIlllllIlIIIl, final int lllllllllllllIlIIlIIIlllllIlIIII) {
        return lllllllllllllIlIIlIIIlllllIlIIIl >= lllllllllllllIlIIlIIIlllllIlIIII;
    }
    
    public static void setEnchantments(final Map<Integer, Integer> lllllllllllllIlIIlIIlIIlIIIIIlIl, final ItemStack lllllllllllllIlIIlIIlIIlIIIIIlII) {
        final NBTTagList lllllllllllllIlIIlIIlIIlIIIIlIlI = new NBTTagList();
        final Iterator lllllllllllllIlIIlIIlIIlIIIIlIIl = lllllllllllllIlIIlIIlIIlIIIIIlIl.keySet().iterator();
        "".length();
        if (((31 + 93 - 108 + 136 ^ 32 + 63 - 50 + 96) & (40 + 53 - 79 + 174 ^ 26 + 55 + 4 + 84 ^ -" ".length())) >= " ".length()) {
            return;
        }
        while (!lIlllIllllllIIl(lllllllllllllIlIIlIIlIIlIIIIlIIl.hasNext() ? 1 : 0)) {
            final int lllllllllllllIlIIlIIlIIlIIIIlIII = lllllllllllllIlIIlIIlIIlIIIIlIIl.next();
            final Enchantment lllllllllllllIlIIlIIlIIlIIIIIlll = Enchantment.getEnchantmentById(lllllllllllllIlIIlIIlIIlIIIIlIII);
            if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIlIIIIIlll)) {
                final NBTTagCompound lllllllllllllIlIIlIIlIIlIIIIIllI = new NBTTagCompound();
                lllllllllllllIlIIlIIlIIlIIIIIllI.setShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[4]], (short)lllllllllllllIlIIlIIlIIlIIIIlIII);
                lllllllllllllIlIIlIIlIIlIIIIIllI.setShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[5]], (short)(int)lllllllllllllIlIIlIIlIIlIIIIIlIl.get(lllllllllllllIlIIlIIlIIlIIIIlIII));
                lllllllllllllIlIIlIIlIIlIIIIlIlI.appendTag(lllllllllllllIlIIlIIlIIlIIIIIllI);
                if (!lIlllIlllllIlll(lllllllllllllIlIIlIIlIIlIIIIIlII.getItem(), Items.enchanted_book)) {
                    continue;
                }
                Items.enchanted_book.addEnchantment(lllllllllllllIlIIlIIlIIlIIIIIlII, new EnchantmentData(lllllllllllllIlIIlIIlIIlIIIIIlll, lllllllllllllIlIIlIIlIIlIIIIIlIl.get(lllllllllllllIlIIlIIlIIlIIIIlIII)));
            }
        }
        if (lIlllIllllllIlI(lllllllllllllIlIIlIIlIIlIIIIlIlI.tagCount())) {
            if (lIlllIllllllIll(lllllllllllllIlIIlIIlIIlIIIIIlII.getItem(), Items.enchanted_book)) {
                lllllllllllllIlIIlIIlIIlIIIIIlII.setTagInfo(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[6]], lllllllllllllIlIIlIIlIIlIIIIlIlI);
                "".length();
                if (((0x42 ^ 0x70) & ~(0x56 ^ 0x64)) != 0x0) {
                    return;
                }
            }
        }
        else if (lIlllIlllllllII(lllllllllllllIlIIlIIlIIlIIIIIlII.hasTagCompound() ? 1 : 0)) {
            lllllllllllllIlIIlIIlIIlIIIIIlII.getTagCompound().removeTag(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[7]]);
        }
    }
    
    private static String lIlllIllIlIIIll(final String lllllllllllllIlIIlIIlIIIIIIIIIlI, final String lllllllllllllIlIIlIIlIIIIIIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlIIIIIIIIlIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), EnchantmentHelper.lIIIIllIlIlllI[8]), "DES");
            final Cipher lllllllllllllIlIIlIIlIIIIIIIIlII = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIlIIIIIIIIlII.init(EnchantmentHelper.lIIIIllIlIlllI[2], lllllllllllllIlIIlIIlIIIIIIIIlIl);
            return new String(lllllllllllllIlIIlIIlIIIIIIIIlII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlIIIIIIIIIll) {
            lllllllllllllIlIIlIIlIIIIIIIIIll.printStackTrace();
            return null;
        }
    }
    
    public static int getRespiration(final Entity lllllllllllllIlIIlIIlIIIlIlIlIIl) {
        return getMaxEnchantmentLevel(Enchantment.respiration.effectId, lllllllllllllIlIIlIIlIIIlIlIlIIl.getInventory());
    }
    
    static {
        lIlllIlllllIIll();
        lIlllIllIlIlIII();
        enchantmentRand = new Random();
        enchantmentModifierDamage = new ModifierDamage(null);
        enchantmentModifierLiving = new ModifierLiving(null);
        ENCHANTMENT_ITERATOR_HURT = new HurtIterator(null);
        ENCHANTMENT_ITERATOR_DAMAGE = new DamageIterator(null);
    }
    
    private static boolean lIlllIlllllIlII(final Object lllllllllllllIlIIlIIIllllIlllIII) {
        return lllllllllllllIlIIlIIIllllIlllIII == null;
    }
    
    private static boolean lIllllIIIIIIIIl(final int lllllllllllllIlIIlIIIlllllIIlIIl, final int lllllllllllllIlIIlIIIlllllIIlIII) {
        return lllllllllllllIlIIlIIIlllllIIlIIl <= lllllllllllllIlIIlIIIlllllIIlIII;
    }
    
    public static int getLureModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIlIllI) {
        return getEnchantmentLevel(Enchantment.lure.effectId, lllllllllllllIlIIlIIlIIIlIIlIllI.getHeldItem());
    }
    
    public static ItemStack addRandomEnchantment(final Random lllllllllllllIlIIlIIlIIIIllIIlII, final ItemStack lllllllllllllIlIIlIIlIIIIlIlllIl, final int lllllllllllllIlIIlIIlIIIIllIIIlI) {
        final List<EnchantmentData> lllllllllllllIlIIlIIlIIIIllIIIIl = buildEnchantmentList(lllllllllllllIlIIlIIlIIIIllIIlII, lllllllllllllIlIIlIIlIIIIlIlllIl, lllllllllllllIlIIlIIlIIIIllIIIlI);
        int n;
        if (lIlllIlllllIlll(lllllllllllllIlIIlIIlIIIIlIlllIl.getItem(), Items.book)) {
            n = EnchantmentHelper.lIIIIllIlIlllI[1];
            "".length();
            if (-(0x27 ^ 0x23) >= 0) {
                return null;
            }
        }
        else {
            n = EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        final boolean lllllllllllllIlIIlIIlIIIIllIIIII = n != 0;
        if (lIlllIlllllllII(lllllllllllllIlIIlIIlIIIIllIIIII ? 1 : 0)) {
            lllllllllllllIlIIlIIlIIIIlIlllIl.setItem(Items.enchanted_book);
        }
        if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIIllIIIIl)) {
            final byte lllllllllllllIlIIlIIlIIIIlIllIII = (byte)lllllllllllllIlIIlIIlIIIIllIIIIl.iterator();
            "".length();
            if (null != null) {
                return null;
            }
            while (!lIlllIllllllIIl(((Iterator)lllllllllllllIlIIlIIlIIIIlIllIII).hasNext() ? 1 : 0)) {
                final EnchantmentData lllllllllllllIlIIlIIlIIIIlIlllll = ((Iterator<EnchantmentData>)lllllllllllllIlIIlIIlIIIIlIllIII).next();
                if (lIlllIlllllllII(lllllllllllllIlIIlIIlIIIIllIIIII ? 1 : 0)) {
                    Items.enchanted_book.addEnchantment(lllllllllllllIlIIlIIlIIIIlIlllIl, lllllllllllllIlIIlIIlIIIIlIlllll);
                    "".length();
                    if ("   ".length() > "   ".length()) {
                        return null;
                    }
                    continue;
                }
                else {
                    lllllllllllllIlIIlIIlIIIIlIlllIl.addEnchantment(lllllllllllllIlIIlIIlIIIIlIlllll.enchantmentobj, lllllllllllllIlIIlIIlIIIIlIlllll.enchantmentLevel);
                }
            }
        }
        return lllllllllllllIlIIlIIlIIIIlIlllIl;
    }
    
    private static boolean lIlllIlllllllII(final int lllllllllllllIlIIlIIIllllIllIllI) {
        return lllllllllllllIlIIlIIIllllIllIllI != 0;
    }
    
    public static Map<Integer, Integer> getEnchantments(final ItemStack lllllllllllllIlIIlIIlIIlIIIllIIl) {
        final Map<Integer, Integer> lllllllllllllIlIIlIIlIIlIIIllllI = (Map<Integer, Integer>)Maps.newLinkedHashMap();
        NBTTagList list;
        if (lIlllIlllllIlll(lllllllllllllIlIIlIIlIIlIIIllIIl.getItem(), Items.enchanted_book)) {
            list = Items.enchanted_book.getEnchantments(lllllllllllllIlIIlIIlIIlIIIllIIl);
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        else {
            list = lllllllllllllIlIIlIIlIIlIIIllIIl.getEnchantmentTagList();
        }
        final NBTTagList lllllllllllllIlIIlIIlIIlIIIlllIl = list;
        if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIlIIIlllIl)) {
            int lllllllllllllIlIIlIIlIIlIIIlllII = EnchantmentHelper.lIIIIllIlIlllI[0];
            "".length();
            if (-"   ".length() > 0) {
                return null;
            }
            while (!lIlllIlllllIllI(lllllllllllllIlIIlIIlIIlIIIlllII, lllllllllllllIlIIlIIlIIlIIIlllIl.tagCount())) {
                final int lllllllllllllIlIIlIIlIIlIIIllIll = lllllllllllllIlIIlIIlIIlIIIlllIl.getCompoundTagAt(lllllllllllllIlIIlIIlIIlIIIlllII).getShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[2]]);
                final int lllllllllllllIlIIlIIlIIlIIIllIlI = lllllllllllllIlIIlIIlIIlIIIlllIl.getCompoundTagAt(lllllllllllllIlIIlIIlIIlIIIlllII).getShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[3]]);
                lllllllllllllIlIIlIIlIIlIIIllllI.put(lllllllllllllIlIIlIIlIIlIIIllIll, lllllllllllllIlIIlIIlIIlIIIllIlI);
                "".length();
                ++lllllllllllllIlIIlIIlIIlIIIlllII;
            }
        }
        return lllllllllllllIlIIlIIlIIlIIIllllI;
    }
    
    public static void applyThornEnchantments(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIlllIII, final Entity lllllllllllllIlIIlIIlIIIlIlllIIl) {
        EnchantmentHelper.ENCHANTMENT_ITERATOR_HURT.attacker = lllllllllllllIlIIlIIlIIIlIlllIIl;
        EnchantmentHelper.ENCHANTMENT_ITERATOR_HURT.user = lllllllllllllIlIIlIIlIIIlIlllIII;
        if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIlIlllIII)) {
            applyEnchantmentModifierArray(EnchantmentHelper.ENCHANTMENT_ITERATOR_HURT, lllllllllllllIlIIlIIlIIIlIlllIII.getInventory());
        }
        if (lIlllIlllllllII((lllllllllllllIlIIlIIlIIIlIlllIIl instanceof EntityPlayer) ? 1 : 0)) {
            applyEnchantmentModifier(EnchantmentHelper.ENCHANTMENT_ITERATOR_HURT, lllllllllllllIlIIlIIlIIIlIlllIII.getHeldItem());
        }
    }
    
    public static List<EnchantmentData> buildEnchantmentList(final Random lllllllllllllIlIIlIIlIIIIIllIlIl, final ItemStack lllllllllllllIlIIlIIlIIIIlIIIlIl, final int lllllllllllllIlIIlIIlIIIIlIIIlII) {
        final Item lllllllllllllIlIIlIIlIIIIlIIIIll = lllllllllllllIlIIlIIlIIIIlIIIlIl.getItem();
        int lllllllllllllIlIIlIIlIIIIlIIIIlI = lllllllllllllIlIIlIIlIIIIlIIIIll.getItemEnchantability();
        if (lIlllIlllllllll(lllllllllllllIlIIlIIlIIIIlIIIIlI)) {
            return null;
        }
        lllllllllllllIlIIlIIlIIIIlIIIIlI /= EnchantmentHelper.lIIIIllIlIlllI[2];
        lllllllllllllIlIIlIIlIIIIlIIIIlI = EnchantmentHelper.lIIIIllIlIlllI[1] + lllllllllllllIlIIlIIlIIIIIllIlIl.nextInt((lllllllllllllIlIIlIIlIIIIlIIIIlI >> EnchantmentHelper.lIIIIllIlIlllI[1]) + EnchantmentHelper.lIIIIllIlIlllI[1]) + lllllllllllllIlIIlIIlIIIIIllIlIl.nextInt((lllllllllllllIlIIlIIlIIIIlIIIIlI >> EnchantmentHelper.lIIIIllIlIlllI[1]) + EnchantmentHelper.lIIIIllIlIlllI[1]);
        final int lllllllllllllIlIIlIIlIIIIlIIIIIl = lllllllllllllIlIIlIIlIIIIlIIIIlI + lllllllllllllIlIIlIIlIIIIlIIIlII;
        final float lllllllllllllIlIIlIIlIIIIlIIIIII = (lllllllllllllIlIIlIIlIIIIIllIlIl.nextFloat() + lllllllllllllIlIIlIIlIIIIIllIlIl.nextFloat() - 1.0f) * 0.15f;
        int lllllllllllllIlIIlIIlIIIIIllllll = (int)(lllllllllllllIlIIlIIlIIIIlIIIIIl * (1.0f + lllllllllllllIlIIlIIlIIIIlIIIIII) + 0.5f);
        if (lIllllIIIIIIIII(lllllllllllllIlIIlIIlIIIIIllllll, EnchantmentHelper.lIIIIllIlIlllI[1])) {
            lllllllllllllIlIIlIIlIIIIIllllll = EnchantmentHelper.lIIIIllIlIlllI[1];
        }
        List<EnchantmentData> lllllllllllllIlIIlIIlIIIIIlllllI = null;
        final Map<Integer, EnchantmentData> lllllllllllllIlIIlIIlIIIIIllllIl = mapEnchantmentData(lllllllllllllIlIIlIIlIIIIIllllll, lllllllllllllIlIIlIIlIIIIlIIIlIl);
        if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIIIllllIl) && lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIIllllIl.isEmpty() ? 1 : 0)) {
            final EnchantmentData lllllllllllllIlIIlIIlIIIIIllllII = WeightedRandom.getRandomItem(lllllllllllllIlIIlIIlIIIIIllIlIl, lllllllllllllIlIIlIIlIIIIIllllIl.values());
            if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIIIllllII)) {
                lllllllllllllIlIIlIIlIIIIIlllllI = (List<EnchantmentData>)Lists.newArrayList();
                lllllllllllllIlIIlIIlIIIIIlllllI.add(lllllllllllllIlIIlIIlIIIIIllllII);
                "".length();
                int lllllllllllllIlIIlIIlIIIIIlllIll = lllllllllllllIlIIlIIlIIIIIllllll;
                "".length();
                if (-" ".length() > -" ".length()) {
                    return null;
                }
                while (!lIlllIlllllllIl(lllllllllllllIlIIlIIlIIIIIllIlIl.nextInt(EnchantmentHelper.lIIIIllIlIlllI[12]), lllllllllllllIlIIlIIlIIIIIlllIll)) {
                    final Iterator<Integer> lllllllllllllIlIIlIIlIIIIIlllIlI = lllllllllllllIlIIlIIlIIIIIllllIl.keySet().iterator();
                    "".length();
                    if (" ".length() < ((0x11 ^ 0x1C) & ~(0xB ^ 0x6))) {
                        return null;
                    }
                    while (!lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIIlllIlI.hasNext() ? 1 : 0)) {
                        final Integer lllllllllllllIlIIlIIlIIIIIlllIIl = lllllllllllllIlIIlIIlIIIIIlllIlI.next();
                        boolean lllllllllllllIlIIlIIlIIIIIlllIII = EnchantmentHelper.lIIIIllIlIlllI[1] != 0;
                        final char lllllllllllllIlIIlIIlIIIIIlIIlIl = (char)lllllllllllllIlIIlIIlIIIIIlllllI.iterator();
                        "".length();
                        if ("  ".length() < " ".length()) {
                            return null;
                        }
                        while (!lIlllIllllllIIl(((Iterator)lllllllllllllIlIIlIIlIIIIIlIIlIl).hasNext() ? 1 : 0)) {
                            final EnchantmentData lllllllllllllIlIIlIIlIIIIIllIlll = ((Iterator<EnchantmentData>)lllllllllllllIlIIlIIlIIIIIlIIlIl).next();
                            if (lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIIllIlll.enchantmentobj.canApplyTogether(Enchantment.getEnchantmentById(lllllllllllllIlIIlIIlIIIIIlllIIl)) ? 1 : 0)) {
                                lllllllllllllIlIIlIIlIIIIIlllIII = (EnchantmentHelper.lIIIIllIlIlllI[0] != 0);
                                "".length();
                                if ((0x48 ^ 0x7F ^ (0x40 ^ 0x73)) == 0x0) {
                                    return null;
                                }
                                break;
                            }
                        }
                        if (!lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIIlllIII ? 1 : 0)) {
                            continue;
                        }
                        lllllllllllllIlIIlIIlIIIIIlllIlI.remove();
                    }
                    if (lIlllIllllllIIl(lllllllllllllIlIIlIIlIIIIIllllIl.isEmpty() ? 1 : 0)) {
                        final EnchantmentData lllllllllllllIlIIlIIlIIIIIllIllI = WeightedRandom.getRandomItem(lllllllllllllIlIIlIIlIIIIIllIlIl, lllllllllllllIlIIlIIlIIIIIllllIl.values());
                        lllllllllllllIlIIlIIlIIIIIlllllI.add(lllllllllllllIlIIlIIlIIIIIllIllI);
                        "".length();
                    }
                    lllllllllllllIlIIlIIlIIIIIlllIll >>= EnchantmentHelper.lIIIIllIlIlllI[1];
                }
            }
        }
        return lllllllllllllIlIIlIIlIIIIIlllllI;
    }
    
    private static void applyEnchantmentModifierArray(final IModifier lllllllllllllIlIIlIIlIIIllIIlllI, final ItemStack[] lllllllllllllIlIIlIIlIIIllIlIIII) {
        final String lllllllllllllIlIIlIIlIIIllIIlIIl = (Object)lllllllllllllIlIIlIIlIIIllIlIIII;
        final int lllllllllllllIlIIlIIlIIIllIIlIlI = lllllllllllllIlIIlIIlIIIllIlIIII.length;
        boolean lllllllllllllIlIIlIIlIIIllIIlIll = EnchantmentHelper.lIIIIllIlIlllI[0] != 0;
        "".length();
        if (" ".length() < 0) {
            return;
        }
        while (!lIlllIlllllIllI(lllllllllllllIlIIlIIlIIIllIIlIll ? 1 : 0, lllllllllllllIlIIlIIlIIIllIIlIlI)) {
            final ItemStack lllllllllllllIlIIlIIlIIIllIIllll = lllllllllllllIlIIlIIlIIIllIIlIIl[lllllllllllllIlIIlIIlIIIllIIlIll];
            applyEnchantmentModifier(lllllllllllllIlIIlIIlIIIllIIlllI, lllllllllllllIlIIlIIlIIIllIIllll);
            ++lllllllllllllIlIIlIIlIIIllIIlIll;
        }
    }
    
    private static boolean lIlllIllllllIIl(final int lllllllllllllIlIIlIIIllllIllIlII) {
        return lllllllllllllIlIIlIIIllllIllIlII == 0;
    }
    
    private static boolean lIlllIlllllIlll(final Object lllllllllllllIlIIlIIIllllIllllIl, final Object lllllllllllllIlIIlIIIllllIllllII) {
        return lllllllllllllIlIIlIIIllllIllllIl == lllllllllllllIlIIlIIIllllIllllII;
    }
    
    private static void applyEnchantmentModifier(final IModifier lllllllllllllIlIIlIIlIIIllIlllIl, final ItemStack lllllllllllllIlIIlIIlIIIlllIIIlI) {
        if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIlllIIIlI)) {
            final NBTTagList lllllllllllllIlIIlIIlIIIlllIIIIl = lllllllllllllIlIIlIIlIIIlllIIIlI.getEnchantmentTagList();
            if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIlllIIIIl)) {
                int lllllllllllllIlIIlIIlIIIlllIIIII = EnchantmentHelper.lIIIIllIlIlllI[0];
                "".length();
                if ("  ".length() < " ".length()) {
                    return;
                }
                while (!lIlllIlllllIllI(lllllllllllllIlIIlIIlIIIlllIIIII, lllllllllllllIlIIlIIlIIIlllIIIIl.tagCount())) {
                    final int lllllllllllllIlIIlIIlIIIllIlllll = lllllllllllllIlIIlIIlIIIlllIIIIl.getCompoundTagAt(lllllllllllllIlIIlIIlIIIlllIIIII).getShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[8]]);
                    final int lllllllllllllIlIIlIIlIIIllIllllI = lllllllllllllIlIIlIIlIIIlllIIIIl.getCompoundTagAt(lllllllllllllIlIIlIIlIIIlllIIIII).getShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[9]]);
                    if (lIlllIllllllIII(Enchantment.getEnchantmentById(lllllllllllllIlIIlIIlIIIllIlllll))) {
                        lllllllllllllIlIIlIIlIIIllIlllIl.calculateModifier(Enchantment.getEnchantmentById(lllllllllllllIlIIlIIlIIIllIlllll), lllllllllllllIlIIlIIlIIIllIllllI);
                    }
                    ++lllllllllllllIlIIlIIlIIIlllIIIII;
                }
            }
        }
    }
    
    public static int getEfficiencyModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIlIIIll) {
        return getEnchantmentLevel(Enchantment.efficiency.effectId, lllllllllllllIlIIlIIlIIIlIlIIIll.getHeldItem());
    }
    
    public static boolean getAquaAffinityModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIlIIII) {
        if (lIlllIllllllIlI(getMaxEnchantmentLevel(Enchantment.aquaAffinity.effectId, lllllllllllllIlIIlIIlIIIlIIlIIII.getInventory()))) {
            return EnchantmentHelper.lIIIIllIlIlllI[1] != 0;
        }
        return EnchantmentHelper.lIIIIllIlIlllI[0] != 0;
    }
    
    public static ItemStack getEnchantedItem(final Enchantment lllllllllllllIlIIlIIlIIIlIIIIllI, final EntityLivingBase lllllllllllllIlIIlIIlIIIlIIIIlIl) {
        final float lllllllllllllIlIIlIIlIIIlIIIIIIl;
        final float lllllllllllllIlIIlIIlIIIlIIIIIlI = ((ItemStack[])(Object)(lllllllllllllIlIIlIIlIIIlIIIIIIl = (float)(Object)lllllllllllllIlIIlIIlIIIlIIIIlIl.getInventory())).length;
        Exception lllllllllllllIlIIlIIlIIIlIIIIIll = (Exception)EnchantmentHelper.lIIIIllIlIlllI[0];
        "".length();
        if (-"   ".length() > 0) {
            return null;
        }
        while (!lIlllIlllllIllI((int)lllllllllllllIlIIlIIlIIIlIIIIIll, (int)lllllllllllllIlIIlIIlIIIlIIIIIlI)) {
            final ItemStack lllllllllllllIlIIlIIlIIIlIIIIlll = lllllllllllllIlIIlIIlIIIlIIIIIIl[lllllllllllllIlIIlIIlIIIlIIIIIll];
            if (lIlllIllllllIII(lllllllllllllIlIIlIIlIIIlIIIIlll) && lIlllIllllllIlI(getEnchantmentLevel(lllllllllllllIlIIlIIlIIIlIIIIllI.effectId, lllllllllllllIlIIlIIlIIIlIIIIlll))) {
                return lllllllllllllIlIIlIIlIIIlIIIIlll;
            }
            ++lllllllllllllIlIIlIIlIIIlIIIIIll;
        }
        return null;
    }
    
    private static boolean lIlllIllllllIlI(final int lllllllllllllIlIIlIIIllllIlIlllI) {
        return lllllllllllllIlIIlIIIllllIlIlllI > 0;
    }
    
    private static void lIlllIlllllIIll() {
        (lIIIIllIlIlllI = new int[14])[0] = ((74 + 36 - 22 + 84 ^ 59 + 104 - 73 + 68) & (0x8F ^ 0xB1 ^ (0x7 ^ 0xB) ^ -" ".length()));
        EnchantmentHelper.lIIIIllIlIlllI[1] = " ".length();
        EnchantmentHelper.lIIIIllIlIlllI[2] = "  ".length();
        EnchantmentHelper.lIIIIllIlIlllI[3] = "   ".length();
        EnchantmentHelper.lIIIIllIlIlllI[4] = (0x23 ^ 0x14 ^ (0x26 ^ 0x15));
        EnchantmentHelper.lIIIIllIlIlllI[5] = (0x40 ^ 0x45);
        EnchantmentHelper.lIIIIllIlIlllI[6] = (0x2B ^ 0x2D);
        EnchantmentHelper.lIIIIllIlIlllI[7] = (0x7A ^ 0x16 ^ (0xD1 ^ 0xBA));
        EnchantmentHelper.lIIIIllIlIlllI[8] = (0x7D ^ 0x75);
        EnchantmentHelper.lIIIIllIlIlllI[9] = (0x3D ^ 0x32 ^ (0x17 ^ 0x11));
        EnchantmentHelper.lIIIIllIlIlllI[10] = (0x1A ^ 0x3);
        EnchantmentHelper.lIIIIllIlIlllI[11] = (0xA4 ^ 0x95 ^ (0x62 ^ 0x5C));
        EnchantmentHelper.lIIIIllIlIlllI[12] = (0x13 ^ 0x21);
        EnchantmentHelper.lIIIIllIlIlllI[13] = (0x26 ^ 0x2C);
    }
    
    private static boolean lIlllIlllllllll(final int lllllllllllllIlIIlIIIllllIllIIII) {
        return lllllllllllllIlIIlIIIllllIllIIII <= 0;
    }
    
    public static int getDepthStriderModifier(final Entity lllllllllllllIlIIlIIlIIIlIlIIlIl) {
        return getMaxEnchantmentLevel(Enchantment.depthStrider.effectId, lllllllllllllIlIIlIIlIIIlIlIIlIl.getInventory());
    }
    
    public static int getFireAspectModifier(final EntityLivingBase lllllllllllllIlIIlIIlIIIlIlIlIll) {
        return getEnchantmentLevel(Enchantment.fireAspect.effectId, lllllllllllllIlIIlIIlIIIlIlIlIll.getHeldItem());
    }
    
    public static int getMaxEnchantmentLevel(final int lllllllllllllIlIIlIIlIIIllllIIIl, final ItemStack[] lllllllllllllIlIIlIIlIIIllllIlIl) {
        if (lIlllIlllllIlII(lllllllllllllIlIIlIIlIIIllllIlIl)) {
            return EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        int lllllllllllllIlIIlIIlIIIllllIlII = EnchantmentHelper.lIIIIllIlIlllI[0];
        final char lllllllllllllIlIIlIIlIIIlllIlIll = (Object)lllllllllllllIlIIlIIlIIIllllIlIl;
        final char lllllllllllllIlIIlIIlIIIlllIllII = (char)lllllllllllllIlIIlIIlIIIllllIlIl.length;
        int lllllllllllllIlIIlIIlIIIlllIllIl = EnchantmentHelper.lIIIIllIlIlllI[0];
        "".length();
        if ((0x70 ^ 0x10 ^ (0x7D ^ 0x18)) == 0x0) {
            return (0x0 ^ 0x60 ^ (0xDE ^ 0x87)) & (144 + 39 - 89 + 57 ^ 170 + 67 - 78 + 15 ^ -" ".length());
        }
        while (!lIlllIlllllIllI(lllllllllllllIlIIlIIlIIIlllIllIl, lllllllllllllIlIIlIIlIIIlllIllII)) {
            final ItemStack lllllllllllllIlIIlIIlIIIllllIIll = lllllllllllllIlIIlIIlIIIlllIlIll[lllllllllllllIlIIlIIlIIIlllIllIl];
            final int lllllllllllllIlIIlIIlIIIllllIIlI = getEnchantmentLevel(lllllllllllllIlIIlIIlIIIllllIIIl, lllllllllllllIlIIlIIlIIIllllIIll);
            if (lIlllIlllllllIl(lllllllllllllIlIIlIIlIIIllllIIlI, lllllllllllllIlIIlIIlIIIllllIlII)) {
                lllllllllllllIlIIlIIlIIIllllIlII = lllllllllllllIlIIlIIlIIIllllIIlI;
            }
            ++lllllllllllllIlIIlIIlIIIlllIllIl;
        }
        return lllllllllllllIlIIlIIlIIIllllIlII;
    }
    
    public static int getEnchantmentLevel(final int lllllllllllllIlIIlIIlIIlIIllIIIl, final ItemStack lllllllllllllIlIIlIIlIIlIIlIlIlI) {
        if (lIlllIlllllIlII(lllllllllllllIlIIlIIlIIlIIlIlIlI)) {
            return EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        final NBTTagList lllllllllllllIlIIlIIlIIlIIlIllll = lllllllllllllIlIIlIIlIIlIIlIlIlI.getEnchantmentTagList();
        if (lIlllIlllllIlII(lllllllllllllIlIIlIIlIIlIIlIllll)) {
            return EnchantmentHelper.lIIIIllIlIlllI[0];
        }
        int lllllllllllllIlIIlIIlIIlIIlIlllI = EnchantmentHelper.lIIIIllIlIlllI[0];
        "".length();
        if (" ".length() <= -" ".length()) {
            return (0x35 ^ 0x1) & ~(0xA5 ^ 0x91);
        }
        while (!lIlllIlllllIllI(lllllllllllllIlIIlIIlIIlIIlIlllI, lllllllllllllIlIIlIIlIIlIIlIllll.tagCount())) {
            final int lllllllllllllIlIIlIIlIIlIIlIllIl = lllllllllllllIlIIlIIlIIlIIlIllll.getCompoundTagAt(lllllllllllllIlIIlIIlIIlIIlIlllI).getShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[0]]);
            final int lllllllllllllIlIIlIIlIIlIIlIllII = lllllllllllllIlIIlIIlIIlIIlIllll.getCompoundTagAt(lllllllllllllIlIIlIIlIIlIIlIlllI).getShort(EnchantmentHelper.lIIIIllIIlIlll[EnchantmentHelper.lIIIIllIlIlllI[1]]);
            if (lIlllIlllllIlIl(lllllllllllllIlIIlIIlIIlIIlIllIl, lllllllllllllIlIIlIIlIIlIIllIIIl)) {
                return lllllllllllllIlIIlIIlIIlIIlIllII;
            }
            ++lllllllllllllIlIIlIIlIIlIIlIlllI;
        }
        return EnchantmentHelper.lIIIIllIlIlllI[0];
    }
    
    private static boolean lIlllIllllllllI(final int lllllllllllllIlIIlIIIllllIllIIlI) {
        return lllllllllllllIlIIlIIIllllIllIIlI < 0;
    }
    
    private static boolean lIlllIllllllIll(final Object lllllllllllllIlIIlIIIlllllIIIIIl, final Object lllllllllllllIlIIlIIIlllllIIIIII) {
        return lllllllllllllIlIIlIIIlllllIIIIIl != lllllllllllllIlIIlIIIlllllIIIIII;
    }
    
    static final class ModifierLiving implements IModifier
    {
        public /* synthetic */ EnumCreatureAttribute entityLiving;
        public /* synthetic */ float livingModifier;
        
        @Override
        public void calculateModifier(final Enchantment lllllllllllllIIlIIlIlIIlIIIIIlIl, final int lllllllllllllIIlIIlIlIIlIIIIIlll) {
            this.livingModifier += lllllllllllllIIlIIlIlIIlIIIIIlIl.calcDamageByCreature(lllllllllllllIIlIIlIlIIlIIIIIlll, this.entityLiving);
        }
        
        private ModifierLiving() {
        }
    }
    
    interface IModifier
    {
        void calculateModifier(final Enchantment p0, final int p1);
    }
    
    static final class DamageIterator implements IModifier
    {
        public /* synthetic */ Entity target;
        public /* synthetic */ EntityLivingBase user;
        
        private DamageIterator() {
        }
        
        @Override
        public void calculateModifier(final Enchantment lllllllllllllIIIIIllllIlIllIlllI, final int lllllllllllllIIIIIllllIlIllIlIlI) {
            lllllllllllllIIIIIllllIlIllIlllI.onEntityDamaged(this.user, this.target, lllllllllllllIIIIIllllIlIllIlIlI);
        }
    }
    
    static final class HurtIterator implements IModifier
    {
        public /* synthetic */ EntityLivingBase user;
        public /* synthetic */ Entity attacker;
        
        @Override
        public void calculateModifier(final Enchantment llllllllllllIlIllllllIIllIllIIlI, final int llllllllllllIlIllllllIIllIllIlII) {
            llllllllllllIlIllllllIIllIllIIlI.onUserHurt(this.user, this.attacker, llllllllllllIlIllllllIIllIllIlII);
        }
        
        private HurtIterator() {
        }
    }
    
    static final class ModifierDamage implements IModifier
    {
        public /* synthetic */ DamageSource source;
        public /* synthetic */ int damageModifier;
        
        private ModifierDamage() {
        }
        
        @Override
        public void calculateModifier(final Enchantment lllllllllllllIlIlIlIllIIIlIlIlII, final int lllllllllllllIlIlIlIllIIIlIlIIll) {
            this.damageModifier += lllllllllllllIlIlIlIllIIIlIlIlII.calcModifierDamage(lllllllllllllIlIlIlIllIIIlIlIIll, this.source);
        }
    }
}
