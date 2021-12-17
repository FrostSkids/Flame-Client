// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.inventory;

import net.minecraft.util.IChatComponent;

public class AnimalChest extends InventoryBasic
{
    private static final /* synthetic */ int[] lIlIllIlllIIIl;
    
    public AnimalChest(final String lllllllllllllIIIIllIIllIlIlIlIIl, final int lllllllllllllIIIIllIIllIlIlIlIll) {
        super(lllllllllllllIIIIllIIllIlIlIlIIl, (boolean)(AnimalChest.lIlIllIlllIIIl[0] != 0), lllllllllllllIIIIllIIllIlIlIlIll);
    }
    
    public AnimalChest(final IChatComponent lllllllllllllIIIIllIIllIlIlIIIll, final int lllllllllllllIIIIllIIllIlIlIIIlI) {
        super(lllllllllllllIIIIllIIllIlIlIIIll, lllllllllllllIIIIllIIllIlIlIIIlI);
    }
    
    private static void llllIIlIIIlllIl() {
        (lIlIllIlllIIIl = new int[1])[0] = ((0xFB ^ 0xBE) & ~(0xE1 ^ 0xA4));
    }
    
    static {
        llllIIlIIIlllIl();
    }
}
