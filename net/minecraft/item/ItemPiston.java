// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.item;

import net.minecraft.block.Block;

public class ItemPiston extends ItemBlock
{
    private static final /* synthetic */ int[] lIllIIllIIIlIl;
    
    static {
        lllllIlIIlllIlI();
    }
    
    @Override
    public int getMetadata(final int lllllllllllllIIIIIIllIlIlllllIIl) {
        return ItemPiston.lIllIIllIIIlIl[0];
    }
    
    public ItemPiston(final Block lllllllllllllIIIIIIllIlIllllllIl) {
        super(lllllllllllllIIIIIIllIlIllllllIl);
    }
    
    private static void lllllIlIIlllIlI() {
        (lIllIIllIIIlIl = new int[1])[0] = (0x7A ^ 0x43 ^ (0x5F ^ 0x61));
    }
}
