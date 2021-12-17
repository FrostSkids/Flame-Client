// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.enchantment;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.util.ResourceLocation;

public class EnchantmentUntouching extends Enchantment
{
    private static final /* synthetic */ int[] llIIlIllIllIII;
    private static final /* synthetic */ String[] llIIlIllIlIlll;
    
    @Override
    public int getMaxLevel() {
        return EnchantmentUntouching.llIIlIllIllIII[3];
    }
    
    private static boolean lIIIllIllIlllllI(final Object llllllllllllIlllIIIlIIlllIlIlIll, final Object llllllllllllIlllIIIlIIlllIlIlIlI) {
        return llllllllllllIlllIIIlIIlllIlIlIll == llllllllllllIlllIIIlIIlllIlIlIlI;
    }
    
    private static boolean lIIIllIllIllllll(final int llllllllllllIlllIIIlIIlllIlIllll, final int llllllllllllIlllIIIlIIlllIlIlllI) {
        return llllllllllllIlllIIIlIIlllIlIllll < llllllllllllIlllIIIlIIlllIlIlllI;
    }
    
    protected EnchantmentUntouching(final int llllllllllllIlllIIIlIIlllllIIIIl, final ResourceLocation llllllllllllIlllIIIlIIlllllIIlII, final int llllllllllllIlllIIIlIIllllIlllll) {
        super(llllllllllllIlllIIIlIIlllllIIIIl, llllllllllllIlllIIIlIIlllllIIlII, llllllllllllIlllIIIlIIllllIlllll, EnumEnchantmentType.DIGGER);
        this.setName(EnchantmentUntouching.llIIlIllIlIlll[EnchantmentUntouching.llIIlIllIllIII[0]]);
        "".length();
    }
    
    private static String lIIIllIllIlllIIl(String llllllllllllIlllIIIlIIlllIlllIlI, final String llllllllllllIlllIIIlIIlllIlllIIl) {
        llllllllllllIlllIIIlIIlllIlllIlI = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIIIlIIlllIlllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIIIlIIlllIllllIl = new StringBuilder();
        final char[] llllllllllllIlllIIIlIIlllIllllII = llllllllllllIlllIIIlIIlllIlllIIl.toCharArray();
        int llllllllllllIlllIIIlIIlllIlllIll = EnchantmentUntouching.llIIlIllIllIII[0];
        final int llllllllllllIlllIIIlIIlllIllIlIl = (Object)((String)llllllllllllIlllIIIlIIlllIlllIlI).toCharArray();
        final String llllllllllllIlllIIIlIIlllIllIlII = (String)llllllllllllIlllIIIlIIlllIllIlIl.length;
        long llllllllllllIlllIIIlIIlllIllIIll = EnchantmentUntouching.llIIlIllIllIII[0];
        while (lIIIllIllIllllll((int)llllllllllllIlllIIIlIIlllIllIIll, (int)llllllllllllIlllIIIlIIlllIllIlII)) {
            final char llllllllllllIlllIIIlIIllllIIIIII = llllllllllllIlllIIIlIIlllIllIlIl[llllllllllllIlllIIIlIIlllIllIIll];
            llllllllllllIlllIIIlIIlllIllllIl.append((char)(llllllllllllIlllIIIlIIllllIIIIII ^ llllllllllllIlllIIIlIIlllIllllII[llllllllllllIlllIIIlIIlllIlllIll % llllllllllllIlllIIIlIIlllIllllII.length]));
            "".length();
            ++llllllllllllIlllIIIlIIlllIlllIll;
            ++llllllllllllIlllIIIlIIlllIllIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIIIlIIlllIllllIl);
    }
    
    @Override
    public boolean canApplyTogether(final Enchantment llllllllllllIlllIIIlIIllllIlIIlI) {
        if (lIIIllIllIllllII(super.canApplyTogether(llllllllllllIlllIIIlIIllllIlIIlI) ? 1 : 0) && lIIIllIllIllllIl(llllllllllllIlllIIIlIIllllIlIIlI.effectId, EnchantmentUntouching.fortune.effectId)) {
            return EnchantmentUntouching.llIIlIllIllIII[3] != 0;
        }
        return EnchantmentUntouching.llIIlIllIllIII[0] != 0;
    }
    
    @Override
    public int getMinEnchantability(final int llllllllllllIlllIIIlIIllllIlllIl) {
        return EnchantmentUntouching.llIIlIllIllIII[1];
    }
    
    private static boolean lIIIllIllIllllIl(final int llllllllllllIlllIIIlIIlllIlIIlIl, final int llllllllllllIlllIIIlIIlllIlIIlII) {
        return llllllllllllIlllIIIlIIlllIlIIlIl != llllllllllllIlllIIIlIIlllIlIIlII;
    }
    
    @Override
    public int getMaxEnchantability(final int llllllllllllIlllIIIlIIllllIlIlll) {
        return super.getMinEnchantability(llllllllllllIlllIIIlIIllllIlIlll) + EnchantmentUntouching.llIIlIllIllIII[2];
    }
    
    static {
        lIIIllIllIlllIll();
        lIIIllIllIlllIlI();
    }
    
    private static void lIIIllIllIlllIlI() {
        (llIIlIllIlIlll = new String[EnchantmentUntouching.llIIlIllIllIII[3]])[EnchantmentUntouching.llIIlIllIllIII[0]] = lIIIllIllIlllIIl("ITQSBjM3Mg8HIQ==", "TZfiF");
    }
    
    private static void lIIIllIllIlllIll() {
        (llIIlIllIllIII = new int[4])[0] = ((0x43 ^ 0x1B) & ~(0x49 ^ 0x11));
        EnchantmentUntouching.llIIlIllIllIII[1] = (151 + 123 - 176 + 55 ^ 16 + 105 - 21 + 50);
        EnchantmentUntouching.llIIlIllIllIII[2] = (0xAD ^ 0x9F);
        EnchantmentUntouching.llIIlIllIllIII[3] = " ".length();
    }
    
    @Override
    public boolean canApply(final ItemStack llllllllllllIlllIIIlIIllllIIlIlI) {
        int canApply;
        if (lIIIllIllIlllllI(llllllllllllIlllIIIlIIllllIIlIlI.getItem(), Items.shears)) {
            canApply = EnchantmentUntouching.llIIlIllIllIII[3];
            "".length();
            if (((0xDB ^ 0xA2 ^ (0x6D ^ 0x55)) & (0xA9 ^ 0x94 ^ (0xD7 ^ 0xAB) ^ -" ".length()) & (((160 + 143 - 227 + 91 ^ 60 + 19 + 54 + 27) & (39 + 117 - 70 + 41 ^ (0xDB ^ 0xA3) ^ -" ".length())) ^ -" ".length())) != 0x0) {
                return ((156 + 217 - 293 + 155 ^ 145 + 0 - 144 + 193) & (0x4B ^ 0x2B ^ (0x79 ^ 0x30) ^ -" ".length())) != 0x0;
            }
        }
        else {
            canApply = (super.canApply(llllllllllllIlllIIIlIIllllIIlIlI) ? 1 : 0);
        }
        return canApply != 0;
    }
    
    private static boolean lIIIllIllIllllII(final int llllllllllllIlllIIIlIIlllIlIlIII) {
        return llllllllllllIlllIIIlIIlllIlIlIII != 0;
    }
}
