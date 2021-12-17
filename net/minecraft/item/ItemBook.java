// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

public class ItemBook extends Item
{
    private static final /* synthetic */ int[] lIIlIlIIIIIIlI;
    
    static {
        llIIllllIlIIIlI();
    }
    
    private static void llIIllllIlIIIlI() {
        (lIIlIlIIIIIIlI = new int[2])[0] = " ".length();
        ItemBook.lIIlIlIIIIIIlI[1] = ((0x3F ^ 0x70) & ~(0x3F ^ 0x70));
    }
    
    @Override
    public boolean isItemTool(final ItemStack lllllllllllllIIllIlIlIIIIllIllII) {
        if (llIIllllIlIIIll(lllllllllllllIIllIlIlIIIIllIllII.stackSize, ItemBook.lIIlIlIIIIIIlI[0])) {
            return ItemBook.lIIlIlIIIIIIlI[0] != 0;
        }
        return ItemBook.lIIlIlIIIIIIlI[1] != 0;
    }
    
    private static boolean llIIllllIlIIIll(final int lllllllllllllIIllIlIlIIIIllIlIII, final int lllllllllllllIIllIlIlIIIIllIIlll) {
        return lllllllllllllIIllIlIlIIIIllIlIII == lllllllllllllIIllIlIlIIIIllIIlll;
    }
    
    @Override
    public int getItemEnchantability() {
        return ItemBook.lIIlIlIIIIIIlI[0];
    }
}
