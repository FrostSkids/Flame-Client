// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class EnchantmentDigging extends Enchantment
{
    private static final /* synthetic */ int[] lIIIlIlIIlIIlI;
    private static final /* synthetic */ String[] lIIIlIlIIlIIIl;
    
    @Override
    public int getMaxLevel() {
        return EnchantmentDigging.lIIIlIlIIlIIlI[4];
    }
    
    @Override
    public boolean canApply(final ItemStack lllllllllllllIlIIIIlllllIIlIllIl) {
        int canApply;
        if (llIIIIIIlIlIIII(lllllllllllllIlIIIIlllllIIlIllIl.getItem(), Items.shears)) {
            canApply = EnchantmentDigging.lIIIlIlIIlIIlI[1];
            "".length();
            if (null != null) {
                return ((0xE6 ^ 0xC6) & ~(0xD ^ 0x2D)) != 0x0;
            }
        }
        else {
            canApply = (super.canApply(lllllllllllllIlIIIIlllllIIlIllIl) ? 1 : 0);
        }
        return canApply != 0;
    }
    
    static {
        llIIIIIIlIIllll();
        llIIIIIIlIIlllI();
    }
    
    private static boolean llIIIIIIlIlIIII(final Object lllllllllllllIlIIIIlllllIIIllIll, final Object lllllllllllllIlIIIIlllllIIIllIlI) {
        return lllllllllllllIlIIIIlllllIIIllIll == lllllllllllllIlIIIIlllllIIIllIlI;
    }
    
    private static String llIIIIIIlIIllIl(final String lllllllllllllIlIIIIlllllIIlIIIIl, final String lllllllllllllIlIIIIlllllIIlIIIII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIlllllIIlIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIlllllIIlIIIII.getBytes(StandardCharsets.UTF_8)), EnchantmentDigging.lIIIlIlIIlIIlI[5]), "DES");
            final Cipher lllllllllllllIlIIIIlllllIIlIIlIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIlllllIIlIIlIl.init(EnchantmentDigging.lIIIlIlIIlIIlI[6], lllllllllllllIlIIIIlllllIIlIIllI);
            return new String(lllllllllllllIlIIIIlllllIIlIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIlllllIIlIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIlllllIIlIIlII) {
            lllllllllllllIlIIIIlllllIIlIIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public int getMinEnchantability(final int lllllllllllllIlIIIIlllllIIlllIIl) {
        return EnchantmentDigging.lIIIlIlIIlIIlI[1] + EnchantmentDigging.lIIIlIlIIlIIlI[2] * (lllllllllllllIlIIIIlllllIIlllIIl - EnchantmentDigging.lIIIlIlIIlIIlI[1]);
    }
    
    protected EnchantmentDigging(final int lllllllllllllIlIIIIlllllIIlllllI, final ResourceLocation lllllllllllllIlIIIIlllllIlIIIIIl, final int lllllllllllllIlIIIIlllllIlIIIIII) {
        super(lllllllllllllIlIIIIlllllIIlllllI, lllllllllllllIlIIIIlllllIlIIIIIl, lllllllllllllIlIIIIlllllIlIIIIII, EnumEnchantmentType.DIGGER);
        this.setName(EnchantmentDigging.lIIIlIlIIlIIIl[EnchantmentDigging.lIIIlIlIIlIIlI[0]]);
        "".length();
    }
    
    @Override
    public int getMaxEnchantability(final int lllllllllllllIlIIIIlllllIIllIlII) {
        return super.getMinEnchantability(lllllllllllllIlIIIIlllllIIllIlII) + EnchantmentDigging.lIIIlIlIIlIIlI[3];
    }
    
    private static void llIIIIIIlIIllll() {
        (lIIIlIlIIlIIlI = new int[7])[0] = ((0x1E ^ 0x51) & ~(0xC4 ^ 0x8B));
        EnchantmentDigging.lIIIlIlIIlIIlI[1] = " ".length();
        EnchantmentDigging.lIIIlIlIIlIIlI[2] = (0x50 ^ 0x46 ^ (0x66 ^ 0x7A));
        EnchantmentDigging.lIIIlIlIIlIIlI[3] = (0x34 ^ 0x6);
        EnchantmentDigging.lIIIlIlIIlIIlI[4] = (0x13 ^ 0x16);
        EnchantmentDigging.lIIIlIlIIlIIlI[5] = (165 + 162 - 199 + 39 ^ 46 + 90 - 57 + 96);
        EnchantmentDigging.lIIIlIlIIlIIlI[6] = "  ".length();
    }
    
    private static void llIIIIIIlIIlllI() {
        (lIIIlIlIIlIIIl = new String[EnchantmentDigging.lIIIlIlIIlIIlI[1]])[EnchantmentDigging.lIIIlIlIIlIIlI[0]] = llIIIIIIlIIllIl("ImNYqQnZNI0=", "dajKP");
    }
}
