// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;

public class EnchantmentFireAspect extends Enchantment
{
    private static final /* synthetic */ int[] lllIlIlIlIlIlI;
    private static final /* synthetic */ String[] lllIlIlIlIlIIl;
    
    private static void lIlIIIlIllllllIl() {
        (lllIlIlIlIlIlI = new int[6])[0] = ((141 + 126 - 212 + 126 ^ 130 + 111 - 155 + 49) & (17 + 74 + 32 + 120 ^ 153 + 19 - 121 + 142 ^ -" ".length()));
        EnchantmentFireAspect.lllIlIlIlIlIlI[1] = (0x5A ^ 0x9 ^ (0xCF ^ 0x96));
        EnchantmentFireAspect.lllIlIlIlIlIlI[2] = (0xF7 ^ 0x9B ^ (0x35 ^ 0x4D));
        EnchantmentFireAspect.lllIlIlIlIlIlI[3] = " ".length();
        EnchantmentFireAspect.lllIlIlIlIlIlI[4] = (139 + 44 - 12 + 1 ^ 144 + 106 - 99 + 7);
        EnchantmentFireAspect.lllIlIlIlIlIlI[5] = "  ".length();
    }
    
    protected EnchantmentFireAspect(final int llllllllllllIlIllIllIIlIllIIIIII, final ResourceLocation llllllllllllIlIllIllIIlIllIIIIll, final int llllllllllllIlIllIllIIlIllIIIIlI) {
        super(llllllllllllIlIllIllIIlIllIIIIII, llllllllllllIlIllIllIIlIllIIIIll, llllllllllllIlIllIllIIlIllIIIIlI, EnumEnchantmentType.WEAPON);
        this.setName(EnchantmentFireAspect.lllIlIlIlIlIIl[EnchantmentFireAspect.lllIlIlIlIlIlI[0]]);
        "".length();
    }
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIlIllIllIIlIlIllIlII) {
        return super.getMinEnchantability(llllllllllllIlIllIllIIlIlIllIlII) + EnchantmentFireAspect.lllIlIlIlIlIlI[4];
    }
    
    static {
        lIlIIIlIllllllIl();
        lIlIIIlIlllllIll();
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIlIllIllIIlIlIlllIll) {
        return EnchantmentFireAspect.lllIlIlIlIlIlI[1] + EnchantmentFireAspect.lllIlIlIlIlIlI[2] * (llllllllllllIlIllIllIIlIlIlllIll - EnchantmentFireAspect.lllIlIlIlIlIlI[3]);
    }
    
    private static void lIlIIIlIlllllIll() {
        (lllIlIlIlIlIIl = new String[EnchantmentFireAspect.lllIlIlIlIlIlI[3]])[EnchantmentFireAspect.lllIlIlIlIlIlI[0]] = lIlIIIlIlllllIlI("BSA3Pw==", "cIEZZ");
    }
    
    @Override
    public int getMaxLevel() {
        return EnchantmentFireAspect.lllIlIlIlIlIlI[5];
    }
    
    private static String lIlIIIlIlllllIlI(String llllllllllllIlIllIllIIlIlIlIIIll, final String llllllllllllIlIllIllIIlIlIlIIIlI) {
        llllllllllllIlIllIllIIlIlIlIIIll = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlIllIllIIlIlIlIIIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIllIIlIlIlIIllI = new StringBuilder();
        final char[] llllllllllllIlIllIllIIlIlIlIIlIl = llllllllllllIlIllIllIIlIlIlIIIlI.toCharArray();
        int llllllllllllIlIllIllIIlIlIlIIlII = EnchantmentFireAspect.lllIlIlIlIlIlI[0];
        final byte llllllllllllIlIllIllIIlIlIIllllI = (Object)((String)llllllllllllIlIllIllIIlIlIlIIIll).toCharArray();
        final short llllllllllllIlIllIllIIlIlIIlllIl = (short)llllllllllllIlIllIllIIlIlIIllllI.length;
        double llllllllllllIlIllIllIIlIlIIlllII = EnchantmentFireAspect.lllIlIlIlIlIlI[0];
        while (lIlIIIlIlllllllI((int)llllllllllllIlIllIllIIlIlIIlllII, llllllllllllIlIllIllIIlIlIIlllIl)) {
            final char llllllllllllIlIllIllIIlIlIlIlIIl = llllllllllllIlIllIllIIlIlIIllllI[llllllllllllIlIllIllIIlIlIIlllII];
            llllllllllllIlIllIllIIlIlIlIIllI.append((char)(llllllllllllIlIllIllIIlIlIlIlIIl ^ llllllllllllIlIllIllIIlIlIlIIlIl[llllllllllllIlIllIllIIlIlIlIIlII % llllllllllllIlIllIllIIlIlIlIIlIl.length]));
            "".length();
            ++llllllllllllIlIllIllIIlIlIlIIlII;
            ++llllllllllllIlIllIllIIlIlIIlllII;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIllIIlIlIlIIllI);
    }
    
    private static boolean lIlIIIlIlllllllI(final int llllllllllllIlIllIllIIlIlIIllIII, final int llllllllllllIlIllIllIIlIlIIlIlll) {
        return llllllllllllIlIllIllIIlIlIIllIII < llllllllllllIlIllIllIIlIlIIlIlll;
    }
}
