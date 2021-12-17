// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.util.ResourceLocation;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

public class EnchantmentKnockback extends Enchantment
{
    private static final /* synthetic */ String[] llIlIIlIllIIIl;
    private static final /* synthetic */ int[] llIlIIlIllIIlI;
    
    static {
        lIIlIIlIlIIllIIl();
        lIIlIIlIlIIlIlll();
    }
    
    private static void lIIlIIlIlIIllIIl() {
        (llIlIIlIllIIlI = new int[6])[0] = ((129 + 99 - 142 + 150 ^ 158 + 26 - 145 + 149) & (55 + 33 - 17 + 139 ^ 86 + 64 - 107 + 87 ^ -" ".length()));
        EnchantmentKnockback.llIlIIlIllIIlI[1] = (0xBC ^ 0xB9);
        EnchantmentKnockback.llIlIIlIllIIlI[2] = (104 + 105 - 178 + 100 ^ 18 + 77 - 69 + 125);
        EnchantmentKnockback.llIlIIlIllIIlI[3] = " ".length();
        EnchantmentKnockback.llIlIIlIllIIlI[4] = (71 + 7 - 20 + 73 ^ 157 + 50 - 177 + 147);
        EnchantmentKnockback.llIlIIlIllIIlI[5] = "  ".length();
    }
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIllIllIIIIllIIllIIIl) {
        return super.getMinEnchantability(llllllllllllIllIllIIIIllIIllIIIl) + EnchantmentKnockback.llIlIIlIllIIlI[4];
    }
    
    private static String lIIlIIlIlIIlIlIl(final String llllllllllllIllIllIIIIllIIlIlIII, final String llllllllllllIllIllIIIIllIIlIIlll) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIIllIIlIlIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIIllIIlIIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIIllIIlIlIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIIllIIlIlIlI.init(EnchantmentKnockback.llIlIIlIllIIlI[5], llllllllllllIllIllIIIIllIIlIlIll);
            return new String(llllllllllllIllIllIIIIllIIlIlIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIIllIIlIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIIllIIlIlIIl) {
            llllllllllllIllIllIIIIllIIlIlIIl.printStackTrace();
            return null;
        }
    }
    
    protected EnchantmentKnockback(final int llllllllllllIllIllIIIIllIIllllIl, final ResourceLocation llllllllllllIllIllIIIIllIlIIIIII, final int llllllllllllIllIllIIIIllIIllllll) {
        super(llllllllllllIllIllIIIIllIIllllIl, llllllllllllIllIllIIIIllIlIIIIII, llllllllllllIllIllIIIIllIIllllll, EnumEnchantmentType.WEAPON);
        this.setName(EnchantmentKnockback.llIlIIlIllIIIl[EnchantmentKnockback.llIlIIlIllIIlI[0]]);
        "".length();
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIllIllIIIIllIIllIlll) {
        return EnchantmentKnockback.llIlIIlIllIIlI[1] + EnchantmentKnockback.llIlIIlIllIIlI[2] * (llllllllllllIllIllIIIIllIIllIlll - EnchantmentKnockback.llIlIIlIllIIlI[3]);
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentKnockback.llIlIIlIllIIlI[5];
    }
    
    private static void lIIlIIlIlIIlIlll() {
        (llIlIIlIllIIIl = new String[EnchantmentKnockback.llIlIIlIllIIlI[3]])[EnchantmentKnockback.llIlIIlIllIIlI[0]] = lIIlIIlIlIIlIlIl("fNoaR9RrVhOxsb2v5AdD7Q==", "IQYNo");
    }
}
