// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

public class ItemSimpleFoiled extends Item
{
    private static final /* synthetic */ int[] llllIlIIIIIlI;
    
    static {
        lIlIlIIlIllllIl();
    }
    
    @Override
    public boolean hasEffect(final ItemStack lllllllllllllIlIlllIIIIIllIllIll) {
        return ItemSimpleFoiled.llllIlIIIIIlI[0] != 0;
    }
    
    private static void lIlIlIIlIllllIl() {
        (llllIlIIIIIlI = new int[1])[0] = " ".length();
    }
}
