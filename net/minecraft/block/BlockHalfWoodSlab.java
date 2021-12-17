// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

public class BlockHalfWoodSlab extends BlockWoodSlab
{
    private static final /* synthetic */ int[] lIllllIlIIlIII;
    
    private static void lIIIIlIIIllIlIlI() {
        (lIllllIlIIlIII = new int[1])[0] = ((0x9D ^ 0xC6) & ~(0x27 ^ 0x7C));
    }
    
    static {
        lIIIIlIIIllIlIlI();
    }
    
    @Override
    public boolean isDouble() {
        return BlockHalfWoodSlab.lIllllIlIIlIII[0] != 0;
    }
}
