// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.Block;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import net.minecraft.block.BlockLeaves;

public class ItemLeaves extends ItemBlock
{
    private static final /* synthetic */ int[] llIllIlIIlIIll;
    private final /* synthetic */ BlockLeaves leaves;
    private static final /* synthetic */ String[] llIllIlIIlIIlI;
    
    @Override
    public int getMetadata(final int llllllllllllIllIIllIlllIIIIIIIll) {
        return llllllllllllIllIIllIlllIIIIIIIll | ItemLeaves.llIllIlIIlIIll[2];
    }
    
    private static String lIIlIllllIlllIll(String llllllllllllIllIIllIllIllllIIlIl, final String llllllllllllIllIIllIllIllllIIlII) {
        llllllllllllIllIIllIllIllllIIlIl = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllIIllIllIllllIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIllIllIllllIlIII = new StringBuilder();
        final char[] llllllllllllIllIIllIllIllllIIlll = llllllllllllIllIIllIllIllllIIlII.toCharArray();
        int llllllllllllIllIIllIllIllllIIllI = ItemLeaves.llIllIlIIlIIll[0];
        final int llllllllllllIllIIllIllIllllIIIII = (Object)((String)llllllllllllIllIIllIllIllllIIlIl).toCharArray();
        final char llllllllllllIllIIllIllIlllIlllll = (char)llllllllllllIllIIllIllIllllIIIII.length;
        float llllllllllllIllIIllIllIlllIllllI = ItemLeaves.llIllIlIIlIIll[0];
        while (lIIlIllllIlllllI((int)llllllllllllIllIIllIllIlllIllllI, llllllllllllIllIIllIllIlllIlllll)) {
            final char llllllllllllIllIIllIllIllllIlIll = llllllllllllIllIIllIllIllllIIIII[llllllllllllIllIIllIllIlllIllllI];
            llllllllllllIllIIllIllIllllIlIII.append((char)(llllllllllllIllIIllIllIllllIlIll ^ llllllllllllIllIIllIllIllllIIlll[llllllllllllIllIIllIllIllllIIllI % llllllllllllIllIIllIllIllllIIlll.length]));
            "".length();
            ++llllllllllllIllIIllIllIllllIIllI;
            ++llllllllllllIllIIllIllIlllIllllI;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIllIllIllllIlIII);
    }
    
    static {
        lIIlIllllIllllIl();
        lIIlIllllIllllII();
    }
    
    private static void lIIlIllllIllllII() {
        (llIllIlIIlIIlI = new String[ItemLeaves.llIllIlIIlIIll[1]])[ItemLeaves.llIllIlIIlIIll[0]] = lIIlIllllIlllIll("Ww==", "uOLrl");
    }
    
    @Override
    public int getColorFromItemStack(final ItemStack llllllllllllIllIIllIllIllllllIll, final int llllllllllllIllIIllIllIlllllllIl) {
        return this.leaves.getRenderColor(this.leaves.getStateFromMeta(llllllllllllIllIIllIllIllllllIll.getMetadata()));
    }
    
    private static void lIIlIllllIllllIl() {
        (llIllIlIIlIIll = new int[3])[0] = ((98 + 37 - 22 + 126 ^ 98 + 13 + 10 + 41) & (0x27 ^ 0x2C ^ (0x12 ^ 0x54) ^ -" ".length()));
        ItemLeaves.llIllIlIIlIIll[1] = " ".length();
        ItemLeaves.llIllIlIIlIIll[2] = (0x4B ^ 0x4F);
    }
    
    public ItemLeaves(final BlockLeaves llllllllllllIllIIllIlllIIIIIlIII) {
        super(llllllllllllIllIIllIlllIIIIIlIII);
        this.leaves = llllllllllllIllIIllIlllIIIIIlIII;
        this.setMaxDamage(ItemLeaves.llIllIlIIlIIll[0]);
        "".length();
        this.setHasSubtypes((boolean)(ItemLeaves.llIllIlIIlIIll[1] != 0));
        "".length();
    }
    
    @Override
    public String getUnlocalizedName(final ItemStack llllllllllllIllIIllIllIlllllIlll) {
        return String.valueOf(new StringBuilder(String.valueOf(super.getUnlocalizedName())).append(ItemLeaves.llIllIlIIlIIlI[ItemLeaves.llIllIlIIlIIll[0]]).append(this.leaves.getWoodType(llllllllllllIllIIllIllIlllllIlll.getMetadata()).getUnlocalizedName()));
    }
    
    private static boolean lIIlIllllIlllllI(final int llllllllllllIllIIllIllIlllIllIlI, final int llllllllllllIllIIllIllIlllIllIIl) {
        return llllllllllllIllIIllIllIlllIllIlI < llllllllllllIllIIllIllIlllIllIIl;
    }
}
