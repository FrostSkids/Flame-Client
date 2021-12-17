// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.potion;

import java.util.Iterator;
import net.minecraft.entity.SharedMonsterAttributes;
import com.google.common.collect.Maps;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import net.minecraft.util.StringUtils;
import net.minecraft.entity.ai.attributes.IAttributeInstance;
import net.minecraft.entity.ai.attributes.BaseAttributeMap;
import net.minecraft.entity.Entity;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.DamageSource;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.ai.attributes.IAttribute;
import java.util.Map;

public class Potion
{
    private static final /* synthetic */ int[] lIllIIlIlIllIl;
    public static final /* synthetic */ Potion[] potionTypes;
    public static final /* synthetic */ Potion harm;
    public static final /* synthetic */ Potion wither;
    public final /* synthetic */ int id;
    private /* synthetic */ String name;
    public static final /* synthetic */ Potion hunger;
    private final /* synthetic */ int liquidColor;
    private /* synthetic */ double effectiveness;
    private static final /* synthetic */ String[] lIllIIlIlIIIll;
    private final /* synthetic */ Map<IAttribute, AttributeModifier> attributeModifierMap;
    private /* synthetic */ int statusIconIndex;
    private /* synthetic */ boolean usable;
    public static final /* synthetic */ Potion saturation;
    private static final /* synthetic */ Map<ResourceLocation, Potion> field_180150_I;
    public static final /* synthetic */ Potion heal;
    public static final /* synthetic */ Potion poison;
    public static final /* synthetic */ Potion regeneration;
    private final /* synthetic */ boolean isBadEffect;
    
    public int getLiquidColor() {
        return this.liquidColor;
    }
    
    private static boolean lllllIlIIIIlIll(final int lllllllllllllIIIIIIlllIllIlIIIII) {
        return lllllllllllllIIIIIIlllIllIlIIIII != 0;
    }
    
    public void performEffect(final EntityLivingBase lllllllllllllIIIIIIllllIIllIlllI, final int lllllllllllllIIIIIIllllIIllIllIl) {
        if (lllllIlIIIIlllI(this.id, Potion.regeneration.id)) {
            if (lllllIlIIIIllll(lllllIlIIIIllII(lllllllllllllIIIIIIllllIIllIlllI.getHealth(), lllllllllllllIIIIIIllllIIllIlllI.getMaxHealth()))) {
                lllllllllllllIIIIIIllllIIllIlllI.heal(1.0f);
                "".length();
                if ("  ".length() > (0x31 ^ 0x35)) {
                    return;
                }
            }
        }
        else if (lllllIlIIIIlllI(this.id, Potion.poison.id)) {
            if (lllllIlIIIlIIII(lllllIlIIIIllIl(lllllllllllllIIIIIIllllIIllIlllI.getHealth(), 1.0f))) {
                lllllllllllllIIIIIIllllIIllIlllI.attackEntityFrom(DamageSource.magic, 1.0f);
                "".length();
                "".length();
                if ((76 + 103 - 158 + 128 ^ 130 + 110 - 225 + 130) <= "   ".length()) {
                    return;
                }
            }
        }
        else if (lllllIlIIIIlllI(this.id, Potion.wither.id)) {
            lllllllllllllIIIIIIllllIIllIlllI.attackEntityFrom(DamageSource.wither, 1.0f);
            "".length();
            "".length();
            if ("  ".length() == ((0x27 ^ 0xF) & ~(0x3 ^ 0x2B))) {
                return;
            }
        }
        else if (lllllIlIIIIlllI(this.id, Potion.hunger.id) && lllllIlIIIIlIll((lllllllllllllIIIIIIllllIIllIlllI instanceof EntityPlayer) ? 1 : 0)) {
            ((EntityPlayer)lllllllllllllIIIIIIllllIIllIlllI).addExhaustion(0.025f * (lllllllllllllIIIIIIllllIIllIllIl + Potion.lIllIIlIlIllIl[1]));
            "".length();
            if ((0x8 ^ 0x7F ^ (0x5 ^ 0x77)) == 0x0) {
                return;
            }
        }
        else if (lllllIlIIIIlllI(this.id, Potion.saturation.id) && lllllIlIIIIlIll((lllllllllllllIIIIIIllllIIllIlllI instanceof EntityPlayer) ? 1 : 0)) {
            if (lllllIlIIIlIIIl(lllllllllllllIIIIIIllllIIllIlllI.worldObj.isRemote ? 1 : 0)) {
                ((EntityPlayer)lllllllllllllIIIIIIllllIIllIlllI).getFoodStats().addStats(lllllllllllllIIIIIIllllIIllIllIl + Potion.lIllIIlIlIllIl[1], 1.0f);
                "".length();
                if (" ".length() == 0) {
                    return;
                }
            }
        }
        else if ((!lllllIlIIIIlllI(this.id, Potion.heal.id) || lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIllIlllI.isEntityUndead() ? 1 : 0)) && (!lllllIlIIIIlllI(this.id, Potion.harm.id) || lllllIlIIIlIIIl(lllllllllllllIIIIIIllllIIllIlllI.isEntityUndead() ? 1 : 0))) {
            if ((lllllIlIIIIlllI(this.id, Potion.harm.id) && !lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIllIlllI.isEntityUndead() ? 1 : 0)) || (lllllIlIIIIlllI(this.id, Potion.heal.id) && lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIllIlllI.isEntityUndead() ? 1 : 0))) {
                lllllllllllllIIIIIIllllIIllIlllI.attackEntityFrom(DamageSource.magic, (float)(Potion.lIllIIlIlIllIl[9] << lllllllllllllIIIIIIllllIIllIllIl));
                "".length();
                "".length();
                if ("  ".length() != "  ".length()) {
                    return;
                }
            }
        }
        else {
            lllllllllllllIIIIIIllllIIllIlllI.heal((float)Math.max(Potion.lIllIIlIlIllIl[7] << lllllllllllllIIIIIIllllIIllIllIl, Potion.lIllIIlIlIllIl[2]));
        }
    }
    
    private static String lllllIIlllIIlII(final String lllllllllllllIIIIIIlllIlllIIlIIl, final String lllllllllllllIIIIIIlllIlllIIlIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlllIlllIIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlllIlllIIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIIlllIlllIIllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIIlllIlllIIllIl.init(Potion.lIllIIlIlIllIl[4], lllllllllllllIIIIIIlllIlllIIlllI);
            return new String(lllllllllllllIIIIIIlllIlllIIllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIlllIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlllIlllIIllII) {
            lllllllllllllIIIIIIlllIlllIIllII.printStackTrace();
            return null;
        }
    }
    
    public int getStatusIconIndex() {
        return this.statusIconIndex;
    }
    
    public void affectEntity(final Entity lllllllllllllIIIIIIllllIIllIIlII, final Entity lllllllllllllIIIIIIllllIIlIllIll, final EntityLivingBase lllllllllllllIIIIIIllllIIlIllIlI, final int lllllllllllllIIIIIIllllIIlIllIIl, final double lllllllllllllIIIIIIllllIIlIllIII) {
        if ((!lllllIlIIIIlllI(this.id, Potion.heal.id) || lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIlIllIlI.isEntityUndead() ? 1 : 0)) && (!lllllIlIIIIlllI(this.id, Potion.harm.id) || lllllIlIIIlIIIl(lllllllllllllIIIIIIllllIIlIllIlI.isEntityUndead() ? 1 : 0))) {
            if ((lllllIlIIIIlllI(this.id, Potion.harm.id) && !lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIlIllIlI.isEntityUndead() ? 1 : 0)) || (lllllIlIIIIlllI(this.id, Potion.heal.id) && lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIlIllIlI.isEntityUndead() ? 1 : 0))) {
                final int lllllllllllllIIIIIIllllIIlIlllll = (int)(lllllllllllllIIIIIIllllIIlIllIII * (Potion.lIllIIlIlIllIl[9] << lllllllllllllIIIIIIllllIIlIllIIl) + 0.5);
                if (lllllIlIIIlIIlI(lllllllllllllIIIIIIllllIIllIIlII)) {
                    lllllllllllllIIIIIIllllIIlIllIlI.attackEntityFrom(DamageSource.magic, (float)lllllllllllllIIIIIIllllIIlIlllll);
                    "".length();
                    "".length();
                    if ((0x3B ^ 0x3F) <= 0) {
                        return;
                    }
                }
                else {
                    lllllllllllllIIIIIIllllIIlIllIlI.attackEntityFrom(DamageSource.causeIndirectMagicDamage(lllllllllllllIIIIIIllllIIllIIlII, lllllllllllllIIIIIIllllIIlIllIll), (float)lllllllllllllIIIIIIllllIIlIlllll);
                    "".length();
                    "".length();
                    if ((0x3B ^ 0x3F) < "  ".length()) {
                        return;
                    }
                }
            }
        }
        else {
            final int lllllllllllllIIIIIIllllIIlIllllI = (int)(lllllllllllllIIIIIIllllIIlIllIII * (Potion.lIllIIlIlIllIl[7] << lllllllllllllIIIIIIllllIIlIllIIl) + 0.5);
            lllllllllllllIIIIIIllllIIlIllIlI.heal((float)lllllllllllllIIIIIIllllIIlIllllI);
        }
    }
    
    private static boolean lllllIlIIIlIIll(final int lllllllllllllIIIIIIlllIllIIlllII) {
        return lllllllllllllIIIIIIlllIllIIlllII >= 0;
    }
    
    public double getEffectiveness() {
        return this.effectiveness;
    }
    
    private static boolean lllllIlIIIlIIlI(final Object lllllllllllllIIIIIIlllIllIlIIIlI) {
        return lllllllllllllIIIIIIlllIllIlIIIlI == null;
    }
    
    protected Potion setEffectiveness(final double lllllllllllllIIIIIIllllIIIlIlIlI) {
        this.effectiveness = lllllllllllllIIIIIIllllIIIlIlIlI;
        return this;
    }
    
    protected Potion setIconIndex(final int lllllllllllllIIIIIIllllIIllllIlI, final int lllllllllllllIIIIIIllllIIllllIIl) {
        this.statusIconIndex = lllllllllllllIIIIIIllllIIllllIlI + lllllllllllllIIIIIIllllIIllllIIl * Potion.lIllIIlIlIllIl[12];
        return this;
    }
    
    private static boolean lllllIlIIIlIIII(final int lllllllllllllIIIIIIlllIllIIllIII) {
        return lllllllllllllIIIIIIlllIllIIllIII > 0;
    }
    
    public void removeAttributesModifiersFromEntity(final EntityLivingBase lllllllllllllIIIIIIllllIIIIIIlIl, final BaseAttributeMap lllllllllllllIIIIIIllllIIIIIIlII, final int lllllllllllllIIIIIIllllIIIIIIIll) {
        final boolean lllllllllllllIIIIIIlllIlllllllIl = (boolean)this.attributeModifierMap.entrySet().iterator();
        "".length();
        if (-"  ".length() > 0) {
            return;
        }
        while (!lllllIlIIIlIIIl(((Iterator)lllllllllllllIIIIIIlllIlllllllIl).hasNext() ? 1 : 0)) {
            final Map.Entry<IAttribute, AttributeModifier> lllllllllllllIIIIIIllllIIIIIIIlI = ((Iterator<Map.Entry<IAttribute, AttributeModifier>>)lllllllllllllIIIIIIlllIlllllllIl).next();
            final IAttributeInstance lllllllllllllIIIIIIllllIIIIIIIIl = lllllllllllllIIIIIIllllIIIIIIlII.getAttributeInstance(lllllllllllllIIIIIIllllIIIIIIIlI.getKey());
            if (lllllIlIIIlIlII(lllllllllllllIIIIIIllllIIIIIIIIl)) {
                lllllllllllllIIIIIIllllIIIIIIIIl.removeModifier(lllllllllllllIIIIIIllllIIIIIIIlI.getValue());
            }
        }
    }
    
    public String getName() {
        return this.name;
    }
    
    private static boolean lllllIlIIIIlllI(final int lllllllllllllIIIIIIlllIllIlIlIll, final int lllllllllllllIIIIIIlllIllIlIlIlI) {
        return lllllllllllllIIIIIIlllIllIlIlIll == lllllllllllllIIIIIIlllIllIlIlIlI;
    }
    
    public void applyAttributesModifiersToEntity(final EntityLivingBase lllllllllllllIIIIIIlllIlllllIIll, final BaseAttributeMap lllllllllllllIIIIIIlllIllllIllII, final int lllllllllllllIIIIIIlllIllllIlIll) {
        final byte lllllllllllllIIIIIIlllIllllIlIIl = (byte)this.attributeModifierMap.entrySet().iterator();
        "".length();
        if (-" ".length() != -" ".length()) {
            return;
        }
        while (!lllllIlIIIlIIIl(((Iterator)lllllllllllllIIIIIIlllIllllIlIIl).hasNext() ? 1 : 0)) {
            final Map.Entry<IAttribute, AttributeModifier> lllllllllllllIIIIIIlllIlllllIIII = ((Iterator<Map.Entry<IAttribute, AttributeModifier>>)lllllllllllllIIIIIIlllIllllIlIIl).next();
            final IAttributeInstance lllllllllllllIIIIIIlllIllllIllll = lllllllllllllIIIIIIlllIllllIllII.getAttributeInstance(lllllllllllllIIIIIIlllIlllllIIII.getKey());
            if (lllllIlIIIlIlII(lllllllllllllIIIIIIlllIllllIllll)) {
                final AttributeModifier lllllllllllllIIIIIIlllIllllIlllI = lllllllllllllIIIIIIlllIlllllIIII.getValue();
                lllllllllllllIIIIIIlllIllllIllll.removeModifier(lllllllllllllIIIIIIlllIllllIlllI);
                lllllllllllllIIIIIIlllIllllIllll.applyModifier(new AttributeModifier(lllllllllllllIIIIIIlllIllllIlllI.getID(), String.valueOf(new StringBuilder(String.valueOf(this.getName())).append(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[76]]).append(lllllllllllllIIIIIIlllIllllIlIll)), this.getAttributeModifierAmount(lllllllllllllIIIIIIlllIllllIlIll, lllllllllllllIIIIIIlllIllllIlllI), lllllllllllllIIIIIIlllIllllIlllI.getOperation()));
            }
        }
    }
    
    public int getId() {
        return this.id;
    }
    
    public Map<IAttribute, AttributeModifier> getAttributeModifierMap() {
        return this.attributeModifierMap;
    }
    
    private static void lllllIlIIIIlIlI() {
        (lIllIIlIlIllIl = new int[78])[0] = (0xA4 ^ 0x9D ^ (0x3A ^ 0x23));
        Potion.lIllIIlIlIllIl[1] = " ".length();
        Potion.lIllIIlIlIllIl[2] = ((0x66 ^ 0x4F) & ~(0x28 ^ 0x1));
        Potion.lIllIIlIlIllIl[3] = (-(0xFFFFC07F & 0x7FAA) & (-1 & 0x7CEFEF));
        Potion.lIllIIlIlIllIl[4] = "  ".length();
        Potion.lIllIIlIlIllIl[5] = "   ".length();
        Potion.lIllIIlIlIllIl[6] = (0xFFFFFFD7 & 0x5A6CA9);
        Potion.lIllIIlIlIllIl[7] = (0x9B ^ 0xC4 ^ (0xCE ^ 0x95));
        Potion.lIllIIlIlIllIl[8] = (0xE7 ^ 0xC2 ^ (0x10 ^ 0x30));
        Potion.lIllIIlIlIllIl[9] = (0x1F ^ 0x7F ^ (0x65 ^ 0x3));
        Potion.lIllIIlIlIllIl[10] = (0xFFFFDCD7 & 0xD9E36B);
        Potion.lIllIIlIlIllIl[11] = (0xB2 ^ 0xB5);
        Potion.lIllIIlIlIllIl[12] = (0x61 ^ 0xF ^ (0xE4 ^ 0x82));
        Potion.lIllIIlIlIllIl[13] = (-(0xFFFFE3FD & 0x1D63) & (0xFFFFEFFF & 0x4A5377));
        Potion.lIllIIlIlIllIl[14] = (0xCB ^ 0xC2);
        Potion.lIllIIlIlIllIl[15] = (0xC ^ 0x3F ^ (0x1 ^ 0x38));
        Potion.lIllIIlIlIllIl[16] = (0xFFFFFCBB & 0x932767);
        Potion.lIllIIlIlIllIl[17] = (14 + 133 - 34 + 41 ^ 49 + 73 - 111 + 134);
        Potion.lIllIIlIlIllIl[18] = (93 + 120 - 109 + 81 ^ 178 + 44 - 76 + 35);
        Potion.lIllIIlIlIllIl[19] = (0x24 ^ 0x1B ^ (0xA9 ^ 0x9B));
        Potion.lIllIIlIlIllIl[20] = (0xFFFFFCE7 & 0xF8273B);
        Potion.lIllIIlIlIllIl[21] = (0x8B ^ 0x85);
        Potion.lIllIIlIlIllIl[22] = (0x0 ^ 0xF);
        Potion.lIllIIlIlIllIl[23] = (-(0xFFFFFFF7 & 0x5519) & (0xFFFFDF1B & 0x437FFD));
        Potion.lIllIIlIlIllIl[24] = (0xFC ^ 0x85 ^ (0x7A ^ 0x13));
        Potion.lIllIIlIlIllIl[25] = (0xD4 ^ 0x92 ^ (0x7E ^ 0x29));
        Potion.lIllIIlIlIllIl[26] = (0xFFFFFF7C & 0x22FFCF);
        Potion.lIllIIlIlIllIl[27] = ("   ".length() ^ (0xD0 ^ 0xC1));
        Potion.lIllIIlIlIllIl[28] = (0xFB ^ 0xA4 ^ (0x5C ^ 0x10));
        Potion.lIllIIlIlIllIl[29] = (0xFFFFDFEE & 0x553D5B);
        Potion.lIllIIlIlIllIl[30] = (0xD6 ^ 0xB6 ^ (0xC7 ^ 0xB3));
        Potion.lIllIIlIlIllIl[31] = (0x88 ^ 0xB3 ^ (0x2A ^ 0x4));
        Potion.lIllIIlIlIllIl[32] = (0xFFFFFDBB & 0xCD5EEF);
        Potion.lIllIIlIlIllIl[33] = (0x99 ^ 0x8F);
        Potion.lIllIIlIlIllIl[34] = (0xD4 ^ 0xC3);
        Potion.lIllIIlIlIllIl[35] = (0xFFFFE5BE & 0x995F7B);
        Potion.lIllIIlIlIllIl[36] = (0x8 ^ 0x10);
        Potion.lIllIIlIlIllIl[37] = (0x3A ^ 0x23);
        Potion.lIllIIlIlIllIl[38] = (0xFFFFBF3E & 0xE4DAFB);
        Potion.lIllIIlIlIllIl[39] = (0x78 ^ 0x62);
        Potion.lIllIIlIlIllIl[40] = (0xA9 ^ 0xB2);
        Potion.lIllIIlIlIllIl[41] = (0xFFFFD7FF & 0x2E7A99);
        Potion.lIllIIlIlIllIl[42] = (0x74 ^ 0x4F ^ (0xA6 ^ 0x81));
        Potion.lIllIIlIlIllIl[43] = (0x4A ^ 0x42 ^ (0x7B ^ 0x6E));
        Potion.lIllIIlIlIllIl[44] = (0xFFFFBBDA & 0x7FC7B7);
        Potion.lIllIIlIlIllIl[45] = (0x7F ^ 0x52 ^ (0x5B ^ 0x68));
        Potion.lIllIIlIlIllIl[46] = (0x5C ^ 0x7F ^ (0x30 ^ 0xC));
        Potion.lIllIIlIlIllIl[47] = (0xFFFFBFA7 & 0x1F5F7B);
        Potion.lIllIIlIlIllIl[48] = (125 + 54 - 104 + 72 ^ 122 + 13 + 4 + 39);
        Potion.lIllIIlIlIllIl[49] = (0xFFFF9FB5 & 0x1F7FEB);
        Potion.lIllIIlIlIllIl[50] = (13 + 181 + 8 + 23 ^ 35 + 93 + 59 + 8);
        Potion.lIllIIlIlIllIl[51] = (0xE2 ^ 0xC1);
        Potion.lIllIIlIlIllIl[52] = (-(0xFFFFA9A3 & 0x5EFD) & (0xFFFFFEFF & 0x587FF3));
        Potion.lIllIIlIlIllIl[53] = (0x60 ^ 0x44);
        Potion.lIllIIlIlIllIl[54] = (0xB3 ^ 0x99 ^ (0x7E ^ 0x71));
        Potion.lIllIIlIlIllIl[55] = (0xFFFFCF4C & 0x487DFB);
        Potion.lIllIIlIlIllIl[56] = (0x74 ^ 0x52);
        Potion.lIllIIlIlIllIl[57] = (0xB7 ^ 0x90);
        Potion.lIllIIlIlIllIl[58] = (0x71 ^ 0x59);
        Potion.lIllIIlIlIllIl[59] = (0xFFFFB37D & 0x4EDFB3);
        Potion.lIllIIlIlIllIl[60] = (0xBC ^ 0x95);
        Potion.lIllIIlIlIllIl[61] = (0x5 ^ 0x36 ^ (0xA7 ^ 0xBE));
        Potion.lIllIIlIlIllIl[62] = (0xFFFFEE7F & 0x353BA7);
        Potion.lIllIIlIlIllIl[63] = (0x79 ^ 0x52);
        Potion.lIllIIlIlIllIl[64] = (11 + 100 - 47 + 78 ^ 31 + 94 + 4 + 33);
        Potion.lIllIIlIlIllIl[65] = (0xFFFFFF37 & 0xF87DEB);
        Potion.lIllIIlIlIllIl[66] = (0x93 ^ 0xB8 ^ (0x41 ^ 0x47));
        Potion.lIllIIlIlIllIl[67] = (0xA2 ^ 0x8C);
        Potion.lIllIIlIlIllIl[68] = (0x68 ^ 0x25 ^ (0xFC ^ 0x9E));
        Potion.lIllIIlIlIllIl[69] = (0xFFFFFBF5 & 0x2556AF);
        Potion.lIllIIlIlIllIl[70] = (0x99 ^ 0xA9);
        Potion.lIllIIlIlIllIl[71] = (41 + 0 + 40 + 66 ^ 134 + 126 - 252 + 154);
        Potion.lIllIIlIlIllIl[72] = (0x99 ^ 0xAB);
        Potion.lIllIIlIlIllIl[73] = (0x19 ^ 0x2A);
        Potion.lIllIIlIlIllIl[74] = -" ".length();
        Potion.lIllIIlIlIllIl[75] = (0x38 ^ 0xC);
        Potion.lIllIIlIlIllIl[76] = (0x7A ^ 0x4F);
        Potion.lIllIIlIlIllIl[77] = (0x56 ^ 0x50 ^ (0xAB ^ 0x9B));
    }
    
    private static boolean lllllIlIIIlIlIl(final int lllllllllllllIIIIIIlllIllIlIIlll, final int lllllllllllllIIIIIIlllIllIlIIllI) {
        return lllllllllllllIIIIIIlllIllIlIIlll < lllllllllllllIIIIIIlllIllIlIIllI;
    }
    
    private static int lllllIlIIIIllII(final float n, final float n2) {
        return fcmpg(n, n2);
    }
    
    public boolean isUsable() {
        return this.usable;
    }
    
    public static Potion getPotionFromResourceLocation(final String lllllllllllllIIIIIIllllIlIIIIIll) {
        return Potion.field_180150_I.get(new ResourceLocation(lllllllllllllIIIIIIllllIlIIIIIll));
    }
    
    public static String getDurationString(final PotionEffect lllllllllllllIIIIIIllllIIIllIIIl) {
        if (lllllIlIIIIlIll(lllllllllllllIIIIIIllllIIIllIIIl.getIsPotionDurationMax() ? 1 : 0)) {
            return Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[75]];
        }
        final int lllllllllllllIIIIIIllllIIIllIIlI = lllllllllllllIIIIIIllllIIIllIIIl.getDuration();
        return StringUtils.ticksToElapsedTime(lllllllllllllIIIIIIllllIIIllIIlI);
    }
    
    public Potion registerPotionAttributeModifier(final IAttribute lllllllllllllIIIIIIllllIIIIlIIll, final String lllllllllllllIIIIIIllllIIIIlIIlI, final double lllllllllllllIIIIIIllllIIIIlIIIl, final int lllllllllllllIIIIIIllllIIIIlIIII) {
        final AttributeModifier lllllllllllllIIIIIIllllIIIIlIlIl = new AttributeModifier(UUID.fromString(lllllllllllllIIIIIIllllIIIIlIIlI), this.getName(), lllllllllllllIIIIIIllllIIIIlIIIl, lllllllllllllIIIIIIllllIIIIlIIII);
        this.attributeModifierMap.put(lllllllllllllIIIIIIllllIIIIlIIll, lllllllllllllIIIIIIllllIIIIlIlIl);
        "".length();
        return this;
    }
    
    public boolean isBadEffect() {
        return this.isBadEffect;
    }
    
    public static Set<ResourceLocation> func_181168_c() {
        return Potion.field_180150_I.keySet();
    }
    
    private static boolean lllllIlIIIIllll(final int lllllllllllllIIIIIIlllIllIIllIlI) {
        return lllllllllllllIIIIIIlllIllIIllIlI < 0;
    }
    
    public boolean isInstant() {
        return Potion.lIllIIlIlIllIl[2] != 0;
    }
    
    private static String lllllIIlllIllIl(final String lllllllllllllIIIIIIlllIlllIlIllI, final String lllllllllllllIIIIIIlllIlllIlIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIIlllIlllIllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIIlllIlllIlIlIl.getBytes(StandardCharsets.UTF_8)), Potion.lIllIIlIlIllIl[12]), "DES");
            final Cipher lllllllllllllIIIIIIlllIlllIllIlI = Cipher.getInstance("DES");
            lllllllllllllIIIIIIlllIlllIllIlI.init(Potion.lIllIIlIlIllIl[4], lllllllllllllIIIIIIlllIlllIllIll);
            return new String(lllllllllllllIIIIIIlllIlllIllIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIIlllIlllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIIlllIlllIllIIl) {
            lllllllllllllIIIIIIlllIlllIllIIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllllIlIIIlIIIl(final int lllllllllllllIIIIIIlllIllIIllllI) {
        return lllllllllllllIIIIIIlllIllIIllllI == 0;
    }
    
    static {
        lllllIlIIIIlIlI();
        lllllIlIIIIIlIl();
        potionTypes = new Potion[Potion.lIllIIlIlIllIl[0]];
        field_180150_I = Maps.newHashMap();
        field_180151_b = null;
        moveSpeed = new Potion(Potion.lIllIIlIlIllIl[1], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[2]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[3]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[1]]).setIconIndex(Potion.lIllIIlIlIllIl[2], Potion.lIllIIlIlIllIl[2]).registerPotionAttributeModifier(SharedMonsterAttributes.movementSpeed, Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[4]], 0.20000000298023224, Potion.lIllIIlIlIllIl[4]);
        moveSlowdown = new Potion(Potion.lIllIIlIlIllIl[4], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[5]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[6]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[7]]).setIconIndex(Potion.lIllIIlIlIllIl[1], Potion.lIllIIlIlIllIl[2]).registerPotionAttributeModifier(SharedMonsterAttributes.movementSpeed, Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[8]], -0.15000000596046448, Potion.lIllIIlIlIllIl[4]);
        digSpeed = new Potion(Potion.lIllIIlIlIllIl[5], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[9]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[10]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[11]]).setIconIndex(Potion.lIllIIlIlIllIl[4], Potion.lIllIIlIlIllIl[2]).setEffectiveness(1.5);
        digSlowdown = new Potion(Potion.lIllIIlIlIllIl[7], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[12]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[13]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[14]]).setIconIndex(Potion.lIllIIlIlIllIl[5], Potion.lIllIIlIlIllIl[2]);
        damageBoost = new PotionAttackDamage(Potion.lIllIIlIlIllIl[8], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[15]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[16]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[17]]).setIconIndex(Potion.lIllIIlIlIllIl[7], Potion.lIllIIlIlIllIl[2]).registerPotionAttributeModifier(SharedMonsterAttributes.attackDamage, Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[18]], 2.5, Potion.lIllIIlIlIllIl[4]);
        heal = new PotionHealth(Potion.lIllIIlIlIllIl[9], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[19]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[20]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[21]]);
        harm = new PotionHealth(Potion.lIllIIlIlIllIl[11], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[22]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[23]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[24]]);
        jump = new Potion(Potion.lIllIIlIlIllIl[12], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[25]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[26]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[27]]).setIconIndex(Potion.lIllIIlIlIllIl[4], Potion.lIllIIlIlIllIl[1]);
        confusion = new Potion(Potion.lIllIIlIlIllIl[14], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[28]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[29]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[30]]).setIconIndex(Potion.lIllIIlIlIllIl[5], Potion.lIllIIlIlIllIl[1]).setEffectiveness(0.25);
        regeneration = new Potion(Potion.lIllIIlIlIllIl[15], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[31]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[32]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[33]]).setIconIndex(Potion.lIllIIlIlIllIl[11], Potion.lIllIIlIlIllIl[2]).setEffectiveness(0.25);
        resistance = new Potion(Potion.lIllIIlIlIllIl[17], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[34]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[35]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[36]]).setIconIndex(Potion.lIllIIlIlIllIl[9], Potion.lIllIIlIlIllIl[1]);
        fireResistance = new Potion(Potion.lIllIIlIlIllIl[18], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[37]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[38]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[39]]).setIconIndex(Potion.lIllIIlIlIllIl[11], Potion.lIllIIlIlIllIl[1]);
        waterBreathing = new Potion(Potion.lIllIIlIlIllIl[19], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[40]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[41]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[42]]).setIconIndex(Potion.lIllIIlIlIllIl[2], Potion.lIllIIlIlIllIl[4]);
        invisibility = new Potion(Potion.lIllIIlIlIllIl[21], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[43]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[44]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[45]]).setIconIndex(Potion.lIllIIlIlIllIl[2], Potion.lIllIIlIlIllIl[1]);
        blindness = new Potion(Potion.lIllIIlIlIllIl[22], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[46]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[47]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[0]]).setIconIndex(Potion.lIllIIlIlIllIl[8], Potion.lIllIIlIlIllIl[1]).setEffectiveness(0.25);
        nightVision = new Potion(Potion.lIllIIlIlIllIl[24], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[48]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[49]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[50]]).setIconIndex(Potion.lIllIIlIlIllIl[7], Potion.lIllIIlIlIllIl[1]);
        hunger = new Potion(Potion.lIllIIlIlIllIl[25], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[51]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[52]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[53]]).setIconIndex(Potion.lIllIIlIlIllIl[1], Potion.lIllIIlIlIllIl[1]);
        weakness = new PotionAttackDamage(Potion.lIllIIlIlIllIl[27], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[54]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[55]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[56]]).setIconIndex(Potion.lIllIIlIlIllIl[8], Potion.lIllIIlIlIllIl[2]).registerPotionAttributeModifier(SharedMonsterAttributes.attackDamage, Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[57]], 2.0, Potion.lIllIIlIlIllIl[2]);
        poison = new Potion(Potion.lIllIIlIlIllIl[28], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[58]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[59]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[60]]).setIconIndex(Potion.lIllIIlIlIllIl[9], Potion.lIllIIlIlIllIl[2]).setEffectiveness(0.25);
        wither = new Potion(Potion.lIllIIlIlIllIl[30], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[61]]), (boolean)(Potion.lIllIIlIlIllIl[1] != 0), Potion.lIllIIlIlIllIl[62]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[63]]).setIconIndex(Potion.lIllIIlIlIllIl[1], Potion.lIllIIlIlIllIl[4]).setEffectiveness(0.25);
        healthBoost = new PotionHealthBoost(Potion.lIllIIlIlIllIl[31], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[64]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[65]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[66]]).setIconIndex(Potion.lIllIIlIlIllIl[4], Potion.lIllIIlIlIllIl[4]).registerPotionAttributeModifier(SharedMonsterAttributes.maxHealth, Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[67]], 4.0, Potion.lIllIIlIlIllIl[2]);
        absorption = new PotionAbsorption(Potion.lIllIIlIlIllIl[33], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[68]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[69]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[70]]).setIconIndex(Potion.lIllIIlIlIllIl[4], Potion.lIllIIlIlIllIl[4]);
        saturation = new PotionHealth(Potion.lIllIIlIlIllIl[34], new ResourceLocation(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[71]]), (boolean)(Potion.lIllIIlIlIllIl[2] != 0), Potion.lIllIIlIlIllIl[20]).setPotionName(Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[72]]);
        field_180153_z = null;
        field_180147_A = null;
        field_180148_B = null;
        field_180149_C = null;
        field_180143_D = null;
        field_180144_E = null;
        field_180145_F = null;
        field_180146_G = null;
    }
    
    public boolean isReady(final int lllllllllllllIIIIIIllllIIlIlIIII, final int lllllllllllllIIIIIIllllIIlIIllll) {
        if (lllllIlIIIIlllI(this.id, Potion.regeneration.id)) {
            final int lllllllllllllIIIIIIllllIIlIIlllI = Potion.lIllIIlIlIllIl[72] >> lllllllllllllIIIIIIllllIIlIIllll;
            int n;
            if (lllllIlIIIlIIII(lllllllllllllIIIIIIllllIIlIIlllI)) {
                if (lllllIlIIIlIIIl(lllllllllllllIIIIIIllllIIlIlIIII % lllllllllllllIIIIIIllllIIlIIlllI)) {
                    n = Potion.lIllIIlIlIllIl[1];
                    "".length();
                    if ("  ".length() > "   ".length()) {
                        return ((0x48 ^ 0x5A) & ~(0xAB ^ 0xB9)) != 0x0;
                    }
                }
                else {
                    n = Potion.lIllIIlIlIllIl[2];
                    "".length();
                    if (((0xF3 ^ 0x80 ^ (0xEE ^ 0x83)) & (0xB ^ 0x4D ^ (0x32 ^ 0x6A) ^ -" ".length())) < 0) {
                        return ((0x40 ^ 0x6E ^ (0x2A ^ 0x2)) & (58 + 31 + 9 + 36 ^ 87 + 27 - 70 + 84 ^ -" ".length())) != 0x0;
                    }
                }
            }
            else {
                n = Potion.lIllIIlIlIllIl[1];
            }
            return n != 0;
        }
        if (lllllIlIIIIlllI(this.id, Potion.poison.id)) {
            final int lllllllllllllIIIIIIllllIIlIIllIl = Potion.lIllIIlIlIllIl[37] >> lllllllllllllIIIIIIllllIIlIIllll;
            int n2;
            if (lllllIlIIIlIIII(lllllllllllllIIIIIIllllIIlIIllIl)) {
                if (lllllIlIIIlIIIl(lllllllllllllIIIIIIllllIIlIlIIII % lllllllllllllIIIIIIllllIIlIIllIl)) {
                    n2 = Potion.lIllIIlIlIllIl[1];
                    "".length();
                    if (((0xE3 ^ 0xBD) & ~(0x9 ^ 0x57)) < ((0xE6 ^ 0xA9) & ~(0x17 ^ 0x58))) {
                        return ((0x80 ^ 0xA8) & ~(0x65 ^ 0x4D)) != 0x0;
                    }
                }
                else {
                    n2 = Potion.lIllIIlIlIllIl[2];
                    "".length();
                    if ((0x44 ^ 0x40) > (0x1F ^ 0x1B)) {
                        return ((0x24 ^ 0x3F) & ~(0x9A ^ 0x81)) != 0x0;
                    }
                }
            }
            else {
                n2 = Potion.lIllIIlIlIllIl[1];
            }
            return n2 != 0;
        }
        if (lllllIlIIIIlllI(this.id, Potion.wither.id)) {
            final int lllllllllllllIIIIIIllllIIlIIllII = Potion.lIllIIlIlIllIl[58] >> lllllllllllllIIIIIIllllIIlIIllll;
            int n3;
            if (lllllIlIIIlIIII(lllllllllllllIIIIIIllllIIlIIllII)) {
                if (lllllIlIIIlIIIl(lllllllllllllIIIIIIllllIIlIlIIII % lllllllllllllIIIIIIllllIIlIIllII)) {
                    n3 = Potion.lIllIIlIlIllIl[1];
                    "".length();
                    if (-" ".length() > ((76 + 36 - 86 + 112 ^ 112 + 46 - 12 + 45) & (107 + 39 - 57 + 54 ^ 99 + 146 - 131 + 72 ^ -" ".length()))) {
                        return ((0x19 ^ 0x54 ^ (0x7 ^ 0x63)) & (93 + 67 - 31 + 18 ^ 27 + 147 - 39 + 51 ^ -" ".length())) != 0x0;
                    }
                }
                else {
                    n3 = Potion.lIllIIlIlIllIl[2];
                    "".length();
                    if ("   ".length() == -" ".length()) {
                        return ((0xD9 ^ 0xAC ^ (0xF4 ^ 0xA4)) & (0x20 ^ 0xD ^ (0x2C ^ 0x24) ^ -" ".length())) != 0x0;
                    }
                }
            }
            else {
                n3 = Potion.lIllIIlIlIllIl[1];
            }
            return n3 != 0;
        }
        if (lllllIlIIIIlllI(this.id, Potion.hunger.id)) {
            return Potion.lIllIIlIlIllIl[1] != 0;
        }
        return Potion.lIllIIlIlIllIl[2] != 0;
    }
    
    private static int lllllIlIIIIllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    private static boolean lllllIlIIIlIlII(final Object lllllllllllllIIIIIIlllIllIlIIlII) {
        return lllllllllllllIIIIIIlllIllIlIIlII != null;
    }
    
    private static void lllllIlIIIIIlIl() {
        (lIllIIlIlIIIll = new String[Potion.lIllIIlIlIllIl[77]])[Potion.lIllIIlIlIllIl[2]] = lllllIIlllIIlII("hjZykdj1AJs=", "wVRAS");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[1]] = lllllIIlllIIlII("wV2oncswJThtIQ1xcbXWSvHY2jM7/Ul0", "kzveS");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[4]] = lllllIIlllIllII("VmgwLTQubEdFRlhvM0VBW2BJRUxcbDNFRyluN15NX25BXkZa", "oYqhu");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[5]] = lllllIIlllIIlII("ysU3uug+Q1VwzpCpkOR/jQ==", "YZkys");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[7]] = lllllIIlllIllIl("iH/eVl7t3B64v4sxHPd0d/kvF+N5fwCu", "VNeiU");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[8]] = lllllIIlllIllII("UV1TQSIjWSZbUSUpW1tSVl9TW19SXCZbU1dYIEcgV1pTTl9W", "flcvf");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[9]] = lllllIIlllIIlII("iCclZ+k91bE=", "WEEaN");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[11]] = lllllIIlllIllII("ATcXPz8fdgc/NyIoBjM0", "qXcVP");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[12]] = lllllIIlllIllIl("EcHLOEVI9pYbikZoTUvFOQ==", "Xskkx");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[14]] = lllllIIlllIllII("OhgCLCEkWRIsKRkbGTIKJQAY", "JwvEN");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[15]] = lllllIIlllIllIl("AEGaNMPeWfn0oycXmtTh8A==", "doKZr");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[17]] = lllllIIlllIllII("EyMYIj8NYggqPQIrCQk/DD8Y", "cLlKP");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[18]] = lllllIIlllIllII("b0JJMk5pQEVbTxhAQVtNH0NIW0EYNDRbOms1Q0U4bzI1QThg", "Yvqvy");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[19]] = lllllIIlllIllII("AQgBFTQGEi0JMAkKBgk=", "hfraU");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[21]] = lllllIIlllIllIl("KUXMSM06RyqCW3TAVK4w2Q==", "rWSuK");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[22]] = lllllIIlllIllIl("6zTPS6znMRpteDmy8K7ofg==", "lmrhj");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[24]] = lllllIIlllIIlII("fkMmbYnS02b7guFRwdDpPg==", "gYJCd");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[25]] = lllllIIlllIllII("HA88CRMUFT4KOA==", "vzQyL");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[27]] = lllllIIlllIllII("CAIePSEWQwAhIwg=", "xmjTN");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[28]] = lllllIIlllIllII("ORICCwI2", "Wswxg");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[30]] = lllllIIlllIllII("NyobOz0paww9PCEwHDs9KQ==", "GEoRR");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[31]] = lllllIIlllIllIl("NU8Z5RpqCQ/ywWZuLqYH9w==", "hTfFb");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[33]] = lllllIIlllIllIl("lCJS4iNLc0my7R/2Ddtg7Jg+Df9a/Mdh", "cJFpn");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[34]] = lllllIIlllIllIl("Rc6Bzq4OjmvdVusJOpNO7A==", "fkKCU");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[36]] = lllllIIlllIllII("NDc6MAwqdjw8EC0rOjgNJz0=", "DXNYc");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[37]] = lllllIIlllIllIl("lSBwc/Vm/1x3u8ivGORU7Q==", "zEUqQ");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[39]] = lllllIIlllIllIl("3JT2ZsHiU7f8oD8KPfqz7Bwpij0H1I/l", "ZhhMl");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[40]] = lllllIIlllIllII("BzceNQMvNBg1EAQ+Az4W", "pVjPq");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[42]] = lllllIIlllIllIl("pigQBk484fgtE+nHmiVANZq+nI6XU9Bt", "zHPVE");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[43]] = lllllIIlllIIlII("HuTxlozuHkWKs92UqwYoWA==", "cGfvP");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[45]] = lllllIIlllIllII("KCQFJxY2ZRggDzE4GCwQNCIFNw==", "XKqNy");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[46]] = lllllIIlllIIlII("8YfcYP9lC/S/F6XjcJ6+rA==", "adhZT");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[0]] = lllllIIlllIllIl("9e4So6rvNSQfEnMK5UnsVchVXvajystV", "ruvgN");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[48]] = lllllIIlllIllIl("+LFis1KMq7V67NfrCroxkw==", "sPqRK");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[50]] = lllllIIlllIllII("BA0fDSIaTAUNKhwWPQ0+HQ0F", "tbkdM");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[51]] = lllllIIlllIllII("BiAiBCMc", "nULcF");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[53]] = lllllIIlllIllII("NwY4MRUpRyQtFCAMPg==", "GiLXz");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[54]] = lllllIIlllIllIl("rzX5qTfaBs7kZ4k3FKM1TA==", "uXnWa");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[56]] = lllllIIlllIIlII("UWXvNovZTxG1gY/rfKa6rg==", "yqjIP");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[57]] = lllllIIlllIIlII("ve/3dabhsCh6INw7KuMED1Nxho5Ze/j+f5/aJPLde98HYJirlEVygA==", "ebDxx");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[58]] = lllllIIlllIllII("JgsmEgk4", "VdOaf");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[60]] = lllllIIlllIllII("GjwtACYEfSkGIBk8Nw==", "jSYiI");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[61]] = lllllIIlllIllIl("E7e5uC2Vwcw=", "iRQjk");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[63]] = lllllIIlllIllIl("kowbCtWheKMw7gVO4TOh9Q==", "AbpRM");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[64]] = lllllIIlllIllIl("1Hy8RaUePMlSU5nVnd7B6A==", "hyudT");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[66]] = lllllIIlllIllII("CAANLR0WQREhExQbEQYdFxwN", "xoyDr");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[67]] = lllllIIlllIllII("TwlbAFE4DF9rUEt1W2tVTAwuayNCdFtrIkx8LnMiPwhUfyI5", "zMmFa");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[68]] = lllllIIlllIllIl("eXsiwCHf3SXMbKxpnbIZKg==", "Sippa");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[70]] = lllllIIlllIllII("MhYWICMsVwMrPy0LEj0lLRc=", "BybIL");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[71]] = lllllIIlllIIlII("TjcvGfM2wB25XYBj/L0vVA==", "uEHyu");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[72]] = lllllIIlllIIlII("NZqml+w2DgHM12Wq69ZXDDB/o5WjF826", "jcZxK");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[73]] = lllllIIlllIIlII("6mdCjGBTZuc=", "TWFnO");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[75]] = lllllIIlllIllII("RlNKTnI=", "lypdX");
        Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[76]] = lllllIIlllIllII("Sw==", "kMfQJ");
    }
    
    public double getAttributeModifierAmount(final int lllllllllllllIIIIIIlllIllllIIIIl, final AttributeModifier lllllllllllllIIIIIIlllIllllIIIlI) {
        return lllllllllllllIIIIIIlllIllllIIIlI.getAmount() * (lllllllllllllIIIIIIlllIllllIIIIl + Potion.lIllIIlIlIllIl[1]);
    }
    
    public boolean hasStatusIcon() {
        if (lllllIlIIIlIIll(this.statusIconIndex)) {
            return Potion.lIllIIlIlIllIl[1] != 0;
        }
        return Potion.lIllIIlIlIllIl[2] != 0;
    }
    
    public Potion setPotionName(final String lllllllllllllIIIIIIllllIIlIIIlII) {
        this.name = lllllllllllllIIIIIIllllIIlIIIlII;
        return this;
    }
    
    private static String lllllIIlllIllII(String lllllllllllllIIIIIIlllIllIllIllI, final String lllllllllllllIIIIIIlllIllIlllIlI) {
        lllllllllllllIIIIIIlllIllIllIllI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIIIlllIllIllIllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIIlllIllIlllIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIIlllIllIlllIII = lllllllllllllIIIIIIlllIllIlllIlI.toCharArray();
        int lllllllllllllIIIIIIlllIllIllIlll = Potion.lIllIIlIlIllIl[2];
        final short lllllllllllllIIIIIIlllIllIllIIIl = (Object)((String)lllllllllllllIIIIIIlllIllIllIllI).toCharArray();
        final int lllllllllllllIIIIIIlllIllIllIIII = lllllllllllllIIIIIIlllIllIllIIIl.length;
        byte lllllllllllllIIIIIIlllIllIlIllll = (byte)Potion.lIllIIlIlIllIl[2];
        while (lllllIlIIIlIlIl(lllllllllllllIIIIIIlllIllIlIllll, lllllllllllllIIIIIIlllIllIllIIII)) {
            final char lllllllllllllIIIIIIlllIllIllllII = lllllllllllllIIIIIIlllIllIllIIIl[lllllllllllllIIIIIIlllIllIlIllll];
            lllllllllllllIIIIIIlllIllIlllIIl.append((char)(lllllllllllllIIIIIIlllIllIllllII ^ lllllllllllllIIIIIIlllIllIlllIII[lllllllllllllIIIIIIlllIllIllIlll % lllllllllllllIIIIIIlllIllIlllIII.length]));
            "".length();
            ++lllllllllllllIIIIIIlllIllIllIlll;
            ++lllllllllllllIIIIIIlllIllIlIllll;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIIlllIllIlllIIl);
    }
    
    protected Potion(final int lllllllllllllIIIIIIllllIlIIIlIII, final ResourceLocation lllllllllllllIIIIIIllllIlIIIIlll, final boolean lllllllllllllIIIIIIllllIlIIIlIll, final int lllllllllllllIIIIIIllllIlIIIlIlI) {
        this.attributeModifierMap = (Map<IAttribute, AttributeModifier>)Maps.newHashMap();
        this.name = Potion.lIllIIlIlIIIll[Potion.lIllIIlIlIllIl[73]];
        this.statusIconIndex = Potion.lIllIIlIlIllIl[74];
        this.id = lllllllllllllIIIIIIllllIlIIIlIII;
        Potion.potionTypes[lllllllllllllIIIIIIllllIlIIIlIII] = this;
        Potion.field_180150_I.put(lllllllllllllIIIIIIllllIlIIIIlll, this);
        "".length();
        this.isBadEffect = lllllllllllllIIIIIIllllIlIIIlIll;
        if (lllllIlIIIIlIll(lllllllllllllIIIIIIllllIlIIIlIll ? 1 : 0)) {
            this.effectiveness = 0.5;
            "".length();
            if ((0x40 ^ 0x44) != (0x36 ^ 0x32)) {
                throw null;
            }
        }
        else {
            this.effectiveness = 1.0;
        }
        this.liquidColor = lllllllllllllIIIIIIllllIlIIIlIlI;
    }
}
