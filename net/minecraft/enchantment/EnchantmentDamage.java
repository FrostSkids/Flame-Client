// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import net.minecraft.potion.PotionEffect;
import net.minecraft.potion.Potion;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EnumCreatureAttribute;

public class EnchantmentDamage extends Enchantment
{
    private static final /* synthetic */ int[] thresholdEnchantability;
    private static final /* synthetic */ int[] baseEnchantability;
    private static final /* synthetic */ int[] lIllllIllllllI;
    private static final /* synthetic */ int[] levelEnchantability;
    private static final /* synthetic */ String[] protectionName;
    private static final /* synthetic */ String[] lIllllIlllllII;
    public final /* synthetic */ int damageType;
    
    private static void lIIIIlIIllllllll() {
        (lIllllIllllllI = new int[10])[0] = "   ".length();
        EnchantmentDamage.lIllllIllllllI[1] = ((0x64 ^ 0x7F) & ~(0x10 ^ 0xB));
        EnchantmentDamage.lIllllIllllllI[2] = " ".length();
        EnchantmentDamage.lIllllIllllllI[3] = "  ".length();
        EnchantmentDamage.lIllllIllllllI[4] = (0x66 ^ 0x63);
        EnchantmentDamage.lIllllIllllllI[5] = (((0x56 ^ 0x76) & ~(0xBA ^ 0x9A)) ^ (0x80 ^ 0x8B));
        EnchantmentDamage.lIllllIllllllI[6] = (0x64 ^ 0x18 ^ (0x6C ^ 0x18));
        EnchantmentDamage.lIllllIllllllI[7] = (11 + 98 - 108 + 165 ^ 88 + 121 - 42 + 11);
        EnchantmentDamage.lIllllIllllllI[8] = (0x76 ^ 0x7C);
        EnchantmentDamage.lIllllIllllllI[9] = (0x8 ^ 0xC);
    }
    
    @Override
    public String getName() {
        return String.valueOf(new StringBuilder(EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[0]]).append(EnchantmentDamage.protectionName[this.damageType]));
    }
    
    @Override
    public float calcDamageByCreature(final int llllllllllllIllllIIllllllIIlIIIl, final EnumCreatureAttribute llllllllllllIllllIIllllllIIlIIII) {
        float n;
        if (lIIIIlIlIIIIIIII(this.damageType)) {
            n = llllllllllllIllllIIllllllIIlIIIl * 1.25f;
            "".length();
            if (null != null) {
                return 0.0f;
            }
        }
        else if (lIIIIlIlIIIIIIIl(this.damageType, EnchantmentDamage.lIllllIllllllI[2]) && lIIIIlIlIIIIIIlI(llllllllllllIllllIIllllllIIlIIII, EnumCreatureAttribute.UNDEAD)) {
            n = llllllllllllIllllIIllllllIIlIIIl * 2.5f;
            "".length();
            if ((60 + 116 - 124 + 99 ^ 60 + 122 - 102 + 67) < (103 + 38 - 135 + 153 ^ 50 + 80 - 6 + 31)) {
                return 0.0f;
            }
        }
        else if (lIIIIlIlIIIIIIIl(this.damageType, EnchantmentDamage.lIllllIllllllI[3]) && lIIIIlIlIIIIIIlI(llllllllllllIllllIIllllllIIlIIII, EnumCreatureAttribute.ARTHROPOD)) {
            n = llllllllllllIllllIIllllllIIlIIIl * 2.5f;
            "".length();
            if (null != null) {
                return 0.0f;
            }
        }
        else {
            n = 0.0f;
        }
        return n;
    }
    
    @Override
    public boolean canApply(final ItemStack llllllllllllIllllIIllllllIIIIIlI) {
        int canApply;
        if (lIIIIlIlIIIIIIll((llllllllllllIllllIIllllllIIIIIlI.getItem() instanceof ItemAxe) ? 1 : 0)) {
            canApply = EnchantmentDamage.lIllllIllllllI[2];
            "".length();
            if (((0x18 ^ 0x79) & ~(0xE5 ^ 0x84)) != 0x0) {
                return ((0x1B ^ 0x4A) & ~(0xC9 ^ 0x98)) != 0x0;
            }
        }
        else {
            canApply = (super.canApply(llllllllllllIllllIIllllllIIIIIlI) ? 1 : 0);
        }
        return canApply != 0;
    }
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIllllIIllllllIIlIlll) {
        return this.getMinEnchantability(llllllllllllIllllIIllllllIIlIlll) + EnchantmentDamage.thresholdEnchantability[this.damageType];
    }
    
    private static void lIIIIlIIlllllIII() {
        (lIllllIlllllII = new String[EnchantmentDamage.lIllllIllllllI[9]])[EnchantmentDamage.lIllllIllllllI[1]] = lIIIIlIIllllIlIl("lpeFQA2gJV4=", "dzfxr");
        EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[2]] = lIIIIlIIllllIlIl("BhS9Od0vyRo=", "Hgxat");
        EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[3]] = lIIIIlIIllllIllI("PO97wr2tIQvNOffL35MtKA==", "UNvkp");
        EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[0]] = lIIIIlIIllllIlIl("8znKXYoS28wCf9VFsUWiyuQvLe+qt7US", "NNrmA");
    }
    
    private static boolean lIIIIlIlIIIIIIlI(final Object llllllllllllIllllIIlllllIlIIllIl, final Object llllllllllllIllllIIlllllIlIIllII) {
        return llllllllllllIllllIIlllllIlIIllIl == llllllllllllIllllIIlllllIlIIllII;
    }
    
    private static boolean lIIIIlIlIIIIIIII(final int llllllllllllIllllIIlllllIlIIlIII) {
        return llllllllllllIllllIIlllllIlIIlIII == 0;
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentDamage.lIllllIllllllI[4];
    }
    
    private static String lIIIIlIIllllIlIl(final String llllllllllllIllllIIlllllIllIIllI, final String llllllllllllIllllIIlllllIllIIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIIlllllIllIlIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllllIllIIIll.getBytes(StandardCharsets.UTF_8)), EnchantmentDamage.lIllllIllllllI[6]), "DES");
            final Cipher llllllllllllIllllIIlllllIllIlIII = Cipher.getInstance("DES");
            llllllllllllIllllIIlllllIllIlIII.init(EnchantmentDamage.lIllllIllllllI[3], llllllllllllIllllIIlllllIllIlIIl);
            return new String(llllllllllllIllllIIlllllIllIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllllIllIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlllllIllIIlll) {
            llllllllllllIllllIIlllllIllIIlll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIIIlIIllllllll();
        lIIIIlIIlllllIII();
        final String[] protectionName2 = new String[EnchantmentDamage.lIllllIllllllI[0]];
        protectionName2[EnchantmentDamage.lIllllIllllllI[1]] = EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[1]];
        protectionName2[EnchantmentDamage.lIllllIllllllI[2]] = EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[2]];
        protectionName2[EnchantmentDamage.lIllllIllllllI[3]] = EnchantmentDamage.lIllllIlllllII[EnchantmentDamage.lIllllIllllllI[3]];
        protectionName = protectionName2;
        final int[] baseEnchantability2 = new int[EnchantmentDamage.lIllllIllllllI[0]];
        baseEnchantability2[EnchantmentDamage.lIllllIllllllI[1]] = EnchantmentDamage.lIllllIllllllI[2];
        baseEnchantability2[EnchantmentDamage.lIllllIllllllI[2]] = EnchantmentDamage.lIllllIllllllI[4];
        baseEnchantability2[EnchantmentDamage.lIllllIllllllI[3]] = EnchantmentDamage.lIllllIllllllI[4];
        baseEnchantability = baseEnchantability2;
        final int[] levelEnchantability2 = new int[EnchantmentDamage.lIllllIllllllI[0]];
        levelEnchantability2[EnchantmentDamage.lIllllIllllllI[1]] = EnchantmentDamage.lIllllIllllllI[5];
        levelEnchantability2[EnchantmentDamage.lIllllIllllllI[2]] = EnchantmentDamage.lIllllIllllllI[6];
        levelEnchantability2[EnchantmentDamage.lIllllIllllllI[3]] = EnchantmentDamage.lIllllIllllllI[6];
        levelEnchantability = levelEnchantability2;
        final int[] thresholdEnchantability2 = new int[EnchantmentDamage.lIllllIllllllI[0]];
        thresholdEnchantability2[EnchantmentDamage.lIllllIllllllI[1]] = EnchantmentDamage.lIllllIllllllI[7];
        thresholdEnchantability2[EnchantmentDamage.lIllllIllllllI[2]] = EnchantmentDamage.lIllllIllllllI[7];
        thresholdEnchantability2[EnchantmentDamage.lIllllIllllllI[3]] = EnchantmentDamage.lIllllIllllllI[7];
        thresholdEnchantability = thresholdEnchantability2;
    }
    
    @Override
    public boolean canApplyTogether(final Enchantment llllllllllllIllllIIllllllIIIIlll) {
        int n;
        if (lIIIIlIlIIIIIIll((llllllllllllIllllIIllllllIIIIlll instanceof EnchantmentDamage) ? 1 : 0)) {
            n = EnchantmentDamage.lIllllIllllllI[1];
            "".length();
            if ("   ".length() == 0) {
                return ((0x76 ^ 0x2D) & ~(0x24 ^ 0x7F)) != 0x0;
            }
        }
        else {
            n = EnchantmentDamage.lIllllIllllllI[2];
        }
        return n != 0;
    }
    
    private static String lIIIIlIIllllIllI(final String llllllllllllIllllIIlllllIlIllIIl, final String llllllllllllIllllIIlllllIlIllIII) {
        try {
            final SecretKeySpec llllllllllllIllllIIlllllIlIlllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllllIlIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIlllllIlIllIll = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIlllllIlIllIll.init(EnchantmentDamage.lIllllIllllllI[3], llllllllllllIllllIIlllllIlIlllII);
            return new String(llllllllllllIllllIIlllllIlIllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllllIlIllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIlllllIlIllIlI) {
            llllllllllllIllllIIlllllIlIllIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIIlIlIIIIIIIl(final int llllllllllllIllllIIlllllIlIlIIIl, final int llllllllllllIllllIIlllllIlIlIIII) {
        return llllllllllllIllllIIlllllIlIlIIIl == llllllllllllIllllIIlllllIlIlIIII;
    }
    
    @Override
    public void onEntityDamaged(final EntityLivingBase llllllllllllIllllIIlllllIlllIIlI, final Entity llllllllllllIllllIIlllllIlllIlll, final int llllllllllllIllllIIlllllIlllIllI) {
        if (lIIIIlIlIIIIIIll((llllllllllllIllllIIlllllIlllIlll instanceof EntityLivingBase) ? 1 : 0)) {
            final EntityLivingBase llllllllllllIllllIIlllllIlllIlIl = (EntityLivingBase)llllllllllllIllllIIlllllIlllIlll;
            if (lIIIIlIlIIIIIIIl(this.damageType, EnchantmentDamage.lIllllIllllllI[3]) && lIIIIlIlIIIIIIlI(llllllllllllIllllIIlllllIlllIlIl.getCreatureAttribute(), EnumCreatureAttribute.ARTHROPOD)) {
                final int llllllllllllIllllIIlllllIlllIlII = EnchantmentDamage.lIllllIllllllI[7] + llllllllllllIllllIIlllllIlllIIlI.getRNG().nextInt(EnchantmentDamage.lIllllIllllllI[8] * llllllllllllIllllIIlllllIlllIllI);
                llllllllllllIllllIIlllllIlllIlIl.addPotionEffect(new PotionEffect(Potion.moveSlowdown.id, llllllllllllIllllIIlllllIlllIlII, EnchantmentDamage.lIllllIllllllI[0]));
            }
        }
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIllllIIllllllIIlllIl) {
        return EnchantmentDamage.baseEnchantability[this.damageType] + (llllllllllllIllllIIllllllIIlllIl - EnchantmentDamage.lIllllIllllllI[2]) * EnchantmentDamage.levelEnchantability[this.damageType];
    }
    
    private static boolean lIIIIlIlIIIIIIll(final int llllllllllllIllllIIlllllIlIIlIlI) {
        return llllllllllllIllllIIlllllIlIIlIlI != 0;
    }
    
    public EnchantmentDamage(final int llllllllllllIllllIIllllllIlIIllI, final ResourceLocation llllllllllllIllllIIllllllIlIIlIl, final int llllllllllllIllllIIllllllIlIlIIl, final int llllllllllllIllllIIllllllIlIlIII) {
        super(llllllllllllIllllIIllllllIlIIllI, llllllllllllIllllIIllllllIlIIlIl, llllllllllllIllllIIllllllIlIlIIl, EnumEnchantmentType.WEAPON);
        this.damageType = llllllllllllIllllIIllllllIlIlIII;
    }
}
