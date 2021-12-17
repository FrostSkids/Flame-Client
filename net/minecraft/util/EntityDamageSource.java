// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.entity.Entity;

public class EntityDamageSource extends DamageSource
{
    private static final /* synthetic */ int[] lllIllIIIIllIl;
    protected /* synthetic */ Entity damageSourceEntity;
    private /* synthetic */ boolean isThornsDamage;
    private static final /* synthetic */ String[] lllIllIIIIllII;
    
    private static boolean lIlIIIlllllllIlI(final Object llllllllllllIlIllIIlllllIIllIIlI) {
        return llllllllllllIlIllIIlllllIIllIIlI != null;
    }
    
    private static String lIlIIIllllllIlIl(String llllllllllllIlIllIIlllllIlIIIIII, final String llllllllllllIlIllIIlllllIIllllll) {
        llllllllllllIlIllIIlllllIlIIIIII = new String(Base64.getDecoder().decode(llllllllllllIlIllIIlllllIlIIIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIIlllllIlIIIIll = new StringBuilder();
        final char[] llllllllllllIlIllIIlllllIlIIIIlI = llllllllllllIlIllIIlllllIIllllll.toCharArray();
        int llllllllllllIlIllIIlllllIlIIIIIl = EntityDamageSource.lllIllIIIIllIl[0];
        final String llllllllllllIlIllIIlllllIIlllIll = (Object)llllllllllllIlIllIIlllllIlIIIIII.toCharArray();
        final String llllllllllllIlIllIIlllllIIlllIlI = (String)llllllllllllIlIllIIlllllIIlllIll.length;
        short llllllllllllIlIllIIlllllIIlllIIl = (short)EntityDamageSource.lllIllIIIIllIl[0];
        while (lIlIIIllllllllII(llllllllllllIlIllIIlllllIIlllIIl, (int)llllllllllllIlIllIIlllllIIlllIlI)) {
            final char llllllllllllIlIllIIlllllIlIIIllI = llllllllllllIlIllIIlllllIIlllIll[llllllllllllIlIllIIlllllIIlllIIl];
            llllllllllllIlIllIIlllllIlIIIIll.append((char)(llllllllllllIlIllIIlllllIlIIIllI ^ llllllllllllIlIllIIlllllIlIIIIlI[llllllllllllIlIllIIlllllIlIIIIIl % llllllllllllIlIllIIlllllIlIIIIlI.length]));
            "".length();
            ++llllllllllllIlIllIIlllllIlIIIIIl;
            ++llllllllllllIlIllIIlllllIIlllIIl;
            "".length();
            if ((0xB1 ^ 0xB5) <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIIlllllIlIIIIll);
    }
    
    public boolean getIsThornsDamage() {
        return this.isThornsDamage;
    }
    
    private static void lIlIIIlllllllIII() {
        (lllIllIIIIllIl = new int[5])[0] = ((91 + 110 - 190 + 123 ^ 157 + 9 - 71 + 94) & (0xDE ^ 0xAF ^ (0x13 ^ 0x59) ^ -" ".length()));
        EntityDamageSource.lllIllIIIIllIl[1] = " ".length();
        EntityDamageSource.lllIllIIIIllIl[2] = "   ".length();
        EntityDamageSource.lllIllIIIIllIl[3] = "  ".length();
        EntityDamageSource.lllIllIIIIllIl[4] = (0x8 ^ 0x74 ^ (0x63 ^ 0x17));
    }
    
    private static boolean lIlIIIlllllllIIl(final int llllllllllllIlIllIIlllllIIllIIII) {
        return llllllllllllIlIllIIlllllIIllIIII != 0;
    }
    
    @Override
    public Entity getEntity() {
        return this.damageSourceEntity;
    }
    
    private static String lIlIIIllllllIllI(final String llllllllllllIlIllIIlllllIlIlIIll, final String llllllllllllIlIllIIlllllIlIlIIlI) {
        try {
            final SecretKeySpec llllllllllllIlIllIIlllllIlIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIIlllllIlIlIIlI.getBytes(StandardCharsets.UTF_8)), EntityDamageSource.lllIllIIIIllIl[4]), "DES");
            final Cipher llllllllllllIlIllIIlllllIlIlIlll = Cipher.getInstance("DES");
            llllllllllllIlIllIIlllllIlIlIlll.init(EntityDamageSource.lllIllIIIIllIl[3], llllllllllllIlIllIIlllllIlIllIII);
            return new String(llllllllllllIlIllIIlllllIlIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIIlllllIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIIlllllIlIlIllI) {
            llllllllllllIlIllIIlllllIlIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIIIllllllllII(final int llllllllllllIlIllIIlllllIIllIlIl, final int llllllllllllIlIllIIlllllIIllIlII) {
        return llllllllllllIlIllIIlllllIIllIlIl < llllllllllllIlIllIIlllllIIllIlII;
    }
    
    @Override
    public IChatComponent getDeathMessage(final EntityLivingBase llllllllllllIlIllIIlllllIllIIIll) {
        ItemStack heldItem;
        if (lIlIIIlllllllIIl((this.damageSourceEntity instanceof EntityLivingBase) ? 1 : 0)) {
            heldItem = ((EntityLivingBase)this.damageSourceEntity).getHeldItem();
            "".length();
            if ((157 + 47 - 54 + 26 ^ 178 + 96 - 201 + 108) <= 0) {
                return null;
            }
        }
        else {
            heldItem = null;
        }
        final ItemStack llllllllllllIlIllIIlllllIllIIlll = heldItem;
        final String llllllllllllIlIllIIlllllIllIIllI = String.valueOf(new StringBuilder(EntityDamageSource.lllIllIIIIllII[EntityDamageSource.lllIllIIIIllIl[0]]).append(this.damageType));
        final String llllllllllllIlIllIIlllllIllIIlIl = String.valueOf(new StringBuilder(String.valueOf(llllllllllllIlIllIIlllllIllIIllI)).append(EntityDamageSource.lllIllIIIIllII[EntityDamageSource.lllIllIIIIllIl[1]]));
        ChatComponentTranslation chatComponentTranslation;
        if (lIlIIIlllllllIlI(llllllllllllIlIllIIlllllIllIIlll) && lIlIIIlllllllIIl(llllllllllllIlIllIIlllllIllIIlll.hasDisplayName() ? 1 : 0) && lIlIIIlllllllIIl(StatCollector.canTranslate(llllllllllllIlIllIIlllllIllIIlIl) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI;
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl;
            chatComponentTranslation = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIlIIlIlllIIlIIIIIlI = llllllllllllIlIllIIlllllIllIIlIl;
            lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[EntityDamageSource.lllIllIIIIllIl[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[EntityDamageSource.lllIllIIIIllIl[0]] = llllllllllllIlIllIIlllllIllIIIll.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl[EntityDamageSource.lllIllIIIIllIl[1]] = this.damageSourceEntity.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl[EntityDamageSource.lllIllIIIIllIl[3]] = llllllllllllIlIllIIlllllIllIIlll.getChatComponent();
            "".length();
            if (((5 + 63 + 21 + 59 ^ 101 + 127 - 189 + 145) & (210 + 167 - 338 + 194 ^ 158 + 20 - 153 + 172 ^ -" ".length())) != 0x0) {
                return null;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2;
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2;
            chatComponentTranslation = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
            lllllllllllllIlIIlIlllIIlIIIIIlI2 = llllllllllllIlIllIIlllllIllIIllI;
            lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[EntityDamageSource.lllIllIIIIllIl[3]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[EntityDamageSource.lllIllIIIIllIl[0]] = llllllllllllIlIllIIlllllIllIIIll.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl2[EntityDamageSource.lllIllIIIIllIl[1]] = this.damageSourceEntity.getDisplayName();
        }
        return chatComponentTranslation;
    }
    
    static {
        lIlIIIlllllllIII();
        lIlIIIllllllIlll();
    }
    
    public EntityDamageSource(final String llllllllllllIlIllIIlllllIllllIIl, final Entity llllllllllllIlIllIIlllllIllllIll) {
        super(llllllllllllIlIllIIlllllIllllIIl);
        this.isThornsDamage = (EntityDamageSource.lllIllIIIIllIl[0] != 0);
        this.damageSourceEntity = llllllllllllIlIllIIlllllIllllIll;
    }
    
    private static void lIlIIIllllllIlll() {
        (lllIllIIIIllII = new String[EntityDamageSource.lllIllIIIIllIl[3]])[EntityDamageSource.lllIllIIIIllIl[0]] = lIlIIIllllllIlIl("NTIIOCB/Nh04KTI8Rw==", "QWiLH");
        EntityDamageSource.lllIllIIIIllII[EntityDamageSource.lllIllIIIIllIl[1]] = lIlIIIllllllIllI("DvH2cnuJoFU=", "bslwb");
    }
    
    @Override
    public boolean isDifficultyScaled() {
        if (lIlIIIlllllllIlI(this.damageSourceEntity) && lIlIIIlllllllIIl((this.damageSourceEntity instanceof EntityLivingBase) ? 1 : 0) && lIlIIIlllllllIll((this.damageSourceEntity instanceof EntityPlayer) ? 1 : 0)) {
            return EntityDamageSource.lllIllIIIIllIl[1] != 0;
        }
        return EntityDamageSource.lllIllIIIIllIl[0] != 0;
    }
    
    public EntityDamageSource setIsThornsDamage() {
        this.isThornsDamage = (EntityDamageSource.lllIllIIIIllIl[1] != 0);
        return this;
    }
    
    private static boolean lIlIIIlllllllIll(final int llllllllllllIlIllIIlllllIIlIlllI) {
        return llllllllllllIlIllIIlllllIIlIlllI == 0;
    }
}
