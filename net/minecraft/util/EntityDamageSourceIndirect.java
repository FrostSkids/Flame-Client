// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import net.minecraft.item.ItemStack;
import net.minecraft.entity.EntityLivingBase;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.entity.Entity;

public class EntityDamageSourceIndirect extends EntityDamageSource
{
    private static final /* synthetic */ String[] lIIllIIlIlllll;
    private static final /* synthetic */ int[] lIIllIIllIIIIl;
    private /* synthetic */ Entity indirectEntity;
    
    private static boolean llIlIllllIIIlIl(final Object lllllllllllllIIlIlIlllllllllllIl) {
        return lllllllllllllIIlIlIlllllllllllIl != null;
    }
    
    private static String llIlIlllIllllIl(final String lllllllllllllIIlIllIIIIIIIIIIIlI, final String lllllllllllllIIlIllIIIIIIIIIIIIl) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIIIIIIIIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIIIIIIIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlIllIIIIIIIIIIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIlIllIIIIIIIIIIllI.init(EntityDamageSourceIndirect.lIIllIIllIIIIl[3], lllllllllllllIIlIllIIIIIIIIIIlll);
            return new String(lllllllllllllIIlIllIIIIIIIIIIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIIIIIIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIIIIIIIIlIl) {
            lllllllllllllIIlIllIIIIIIIIIIlIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIlIllllIIIlII(final int lllllllllllllIIlIlIllllllllllIIl) {
        return lllllllllllllIIlIlIllllllllllIIl != 0;
    }
    
    static {
        llIlIllllIIIIlI();
        llIlIllllIIIIII();
    }
    
    private static boolean llIlIllllIIIIll(final Object lllllllllllllIIlIlIllllllllllIll) {
        return lllllllllllllIIlIlIllllllllllIll == null;
    }
    
    private static void llIlIllllIIIIII() {
        (lIIllIIlIlllll = new String[EntityDamageSourceIndirect.lIIllIIllIIIIl[3]])[EntityDamageSourceIndirect.lIIllIIllIIIIl[0]] = llIlIlllIllllIl("ew7mG0GkvT7dxbZRMVDMzA==", "TgUFx");
        EntityDamageSourceIndirect.lIIllIIlIlllll[EntityDamageSourceIndirect.lIIllIIllIIIIl[1]] = llIlIlllIllllll("HfkZOGBZQvA=", "EuEUL");
    }
    
    public EntityDamageSourceIndirect(final String lllllllllllllIIlIllIIIIIIIllIIll, final Entity lllllllllllllIIlIllIIIIIIIllIIlI, final Entity lllllllllllllIIlIllIIIIIIIllIIIl) {
        super(lllllllllllllIIlIllIIIIIIIllIIll, lllllllllllllIIlIllIIIIIIIllIIlI);
        this.indirectEntity = lllllllllllllIIlIllIIIIIIIllIIIl;
    }
    
    private static String llIlIlllIllllll(final String lllllllllllllIIlIllIIIIIIIIIllll, final String lllllllllllllIIlIllIIIIIIIIIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIlIllIIIIIIIIlIlII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlIllIIIIIIIIIlllI.getBytes(StandardCharsets.UTF_8)), EntityDamageSourceIndirect.lIIllIIllIIIIl[4]), "DES");
            final Cipher lllllllllllllIIlIllIIIIIIIIlIIll = Cipher.getInstance("DES");
            lllllllllllllIIlIllIIIIIIIIlIIll.init(EntityDamageSourceIndirect.lIIllIIllIIIIl[3], lllllllllllllIIlIllIIIIIIIIlIlII);
            return new String(lllllllllllllIIlIllIIIIIIIIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlIllIIIIIIIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlIllIIIIIIIIlIIlI) {
            lllllllllllllIIlIllIIIIIIIIlIIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public IChatComponent getDeathMessage(final EntityLivingBase lllllllllllllIIlIllIIIIIIIIlllIl) {
        IChatComponent chatComponent;
        if (llIlIllllIIIIll(this.indirectEntity)) {
            chatComponent = this.damageSourceEntity.getDisplayName();
            "".length();
            if (((120 + 107 - 133 + 123 ^ 6 + 73 + 3 + 66) & (0x37 ^ 0xF ^ (0x21 ^ 0x54) ^ -" ".length())) >= " ".length()) {
                return null;
            }
        }
        else {
            chatComponent = this.indirectEntity.getDisplayName();
        }
        final IChatComponent lllllllllllllIIlIllIIIIIIIlIIIlI = chatComponent;
        ItemStack heldItem;
        if (llIlIllllIIIlII((this.indirectEntity instanceof EntityLivingBase) ? 1 : 0)) {
            heldItem = ((EntityLivingBase)this.indirectEntity).getHeldItem();
            "".length();
            if (null != null) {
                return null;
            }
        }
        else {
            heldItem = null;
        }
        final ItemStack lllllllllllllIIlIllIIIIIIIlIIIIl = heldItem;
        final String lllllllllllllIIlIllIIIIIIIlIIIII = String.valueOf(new StringBuilder(EntityDamageSourceIndirect.lIIllIIlIlllll[EntityDamageSourceIndirect.lIIllIIllIIIIl[0]]).append(this.damageType));
        final String lllllllllllllIIlIllIIIIIIIIlllll = String.valueOf(new StringBuilder(String.valueOf(lllllllllllllIIlIllIIIIIIIlIIIII)).append(EntityDamageSourceIndirect.lIIllIIlIlllll[EntityDamageSourceIndirect.lIIllIIllIIIIl[1]]));
        ChatComponentTranslation chatComponentTranslation;
        if (llIlIllllIIIlIl(lllllllllllllIIlIllIIIIIIIlIIIIl) && llIlIllllIIIlII(lllllllllllllIIlIllIIIIIIIlIIIIl.hasDisplayName() ? 1 : 0) && llIlIllllIIIlII(StatCollector.canTranslate(lllllllllllllIIlIllIIIIIIIIlllll) ? 1 : 0)) {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI;
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl;
            chatComponentTranslation = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI, lllllllllllllIlIIlIlllIIlIIIIIIl);
            lllllllllllllIlIIlIlllIIlIIIIIlI = lllllllllllllIIlIllIIIIIIIIlllll;
            lllllllllllllIlIIlIlllIIlIIIIIIl = new Object[EntityDamageSourceIndirect.lIIllIIllIIIIl[2]];
            lllllllllllllIlIIlIlllIIlIIIIIIl[EntityDamageSourceIndirect.lIIllIIllIIIIl[0]] = lllllllllllllIIlIllIIIIIIIIlllIl.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl[EntityDamageSourceIndirect.lIIllIIllIIIIl[1]] = lllllllllllllIIlIllIIIIIIIlIIIlI;
            lllllllllllllIlIIlIlllIIlIIIIIIl[EntityDamageSourceIndirect.lIIllIIllIIIIl[3]] = lllllllllllllIIlIllIIIIIIIlIIIIl.getChatComponent();
            "".length();
            if (((0x9E ^ 0xA0) & ~(0x83 ^ 0xBD)) != 0x0) {
                return null;
            }
        }
        else {
            final String lllllllllllllIlIIlIlllIIlIIIIIlI2;
            final Object[] lllllllllllllIlIIlIlllIIlIIIIIIl2;
            chatComponentTranslation = new ChatComponentTranslation(lllllllllllllIlIIlIlllIIlIIIIIlI2, lllllllllllllIlIIlIlllIIlIIIIIIl2);
            lllllllllllllIlIIlIlllIIlIIIIIlI2 = lllllllllllllIIlIllIIIIIIIlIIIII;
            lllllllllllllIlIIlIlllIIlIIIIIIl2 = new Object[EntityDamageSourceIndirect.lIIllIIllIIIIl[3]];
            lllllllllllllIlIIlIlllIIlIIIIIIl2[EntityDamageSourceIndirect.lIIllIIllIIIIl[0]] = lllllllllllllIIlIllIIIIIIIIlllIl.getDisplayName();
            lllllllllllllIlIIlIlllIIlIIIIIIl2[EntityDamageSourceIndirect.lIIllIIllIIIIl[1]] = lllllllllllllIIlIllIIIIIIIlIIIlI;
        }
        return chatComponentTranslation;
    }
    
    @Override
    public Entity getEntity() {
        return this.indirectEntity;
    }
    
    private static void llIlIllllIIIIlI() {
        (lIIllIIllIIIIl = new int[5])[0] = ((0x8C ^ 0xBC) & ~(0x2B ^ 0x1B));
        EntityDamageSourceIndirect.lIIllIIllIIIIl[1] = " ".length();
        EntityDamageSourceIndirect.lIIllIIllIIIIl[2] = "   ".length();
        EntityDamageSourceIndirect.lIIllIIllIIIIl[3] = "  ".length();
        EntityDamageSourceIndirect.lIIllIIllIIIIl[4] = (0x76 ^ 0x2E ^ (0x4B ^ 0x1B));
    }
    
    @Override
    public Entity getSourceOfDamage() {
        return this.damageSourceEntity;
    }
}
