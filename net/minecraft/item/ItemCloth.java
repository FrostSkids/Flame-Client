// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.Block;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ItemCloth extends ItemBlock
{
    private static final /* synthetic */ int[] lIlIllllIIlIII;
    private static final /* synthetic */ String[] lIlIllllIIIllI;
    
    @Override
    public String getUnlocalizedName(final ItemStack lllllllllllllIIIIlIlIIlIlIlIIIII) {
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(ItemCloth.lIlIllllIIIllI[ItemCloth.lIlIllllIIlIII[0]]).append(EnumDyeColor.byMetadata(lllllllllllllIIIIlIlIIlIlIlIIIII.getMetadata()).getUnlocalizedName()));
    }
    
    private static String llllIlIIlIIlIll(String lllllllllllllIIIIlIlIIlIlIIlIIII, final String lllllllllllllIIIIlIlIIlIlIIIllll) {
        lllllllllllllIIIIlIlIIlIlIIlIIII = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIIlIlIIlIlIIlIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIIlIlIIlIIll = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIIlIlIIlIIlI = lllllllllllllIIIIlIlIIlIlIIIllll.toCharArray();
        int lllllllllllllIIIIlIlIIlIlIIlIIIl = ItemCloth.lIlIllllIIlIII[0];
        final int lllllllllllllIIIIlIlIIlIlIIIlIll = (Object)((String)lllllllllllllIIIIlIlIIlIlIIlIIII).toCharArray();
        final int lllllllllllllIIIIlIlIIlIlIIIlIlI = lllllllllllllIIIIlIlIIlIlIIIlIll.length;
        double lllllllllllllIIIIlIlIIlIlIIIlIIl = ItemCloth.lIlIllllIIlIII[0];
        while (llllIlIIlIlIIlI((int)lllllllllllllIIIIlIlIIlIlIIIlIIl, lllllllllllllIIIIlIlIIlIlIIIlIlI)) {
            final char lllllllllllllIIIIlIlIIlIlIIlIllI = lllllllllllllIIIIlIlIIlIlIIIlIll[lllllllllllllIIIIlIlIIlIlIIIlIIl];
            lllllllllllllIIIIlIlIIlIlIIlIIll.append((char)(lllllllllllllIIIIlIlIIlIlIIlIllI ^ lllllllllllllIIIIlIlIIlIlIIlIIlI[lllllllllllllIIIIlIlIIlIlIIlIIIl % lllllllllllllIIIIlIlIIlIlIIlIIlI.length]));
            "".length();
            ++lllllllllllllIIIIlIlIIlIlIIlIIIl;
            ++lllllllllllllIIIIlIlIIlIlIIIlIIl;
            "".length();
            if (-" ".length() != -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIIlIlIIlIIll);
    }
    
    public ItemCloth(final Block lllllllllllllIIIIlIlIIlIlIlIllII) {
        super(lllllllllllllIIIIlIlIIlIlIlIllII);
        this.setMaxDamage(ItemCloth.lIlIllllIIlIII[0]);
        "".length();
        this.setHasSubtypes((boolean)(ItemCloth.lIlIllllIIlIII[1] != 0));
        "".length();
    }
    
    static {
        llllIlIIlIlIIIl();
        llllIlIIlIIllII();
    }
    
    private static void llllIlIIlIIllII() {
        (lIlIllllIIIllI = new String[ItemCloth.lIlIllllIIlIII[1]])[ItemCloth.lIlIllllIIlIII[0]] = llllIlIIlIIlIll("ag==", "DnBmy");
    }
    
    private static void llllIlIIlIlIIIl() {
        (lIlIllllIIlIII = new int[2])[0] = ((0x15 ^ 0x21) & ~(0x16 ^ 0x22));
        ItemCloth.lIlIllllIIlIII[1] = " ".length();
    }
    
    private static boolean llllIlIIlIlIIlI(final int lllllllllllllIIIIlIlIIlIlIIIIlIl, final int lllllllllllllIIIIlIlIIlIlIIIIlII) {
        return lllllllllllllIIIIlIlIIlIlIIIIlIl < lllllllllllllIIIIlIlIIlIlIIIIlII;
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIIIIlIlIIlIlIlIIlll) {
        return lllllllllllllIIIIlIlIIlIlIlIIlll;
    }
}
