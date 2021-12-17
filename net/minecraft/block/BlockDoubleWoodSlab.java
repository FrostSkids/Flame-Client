// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

public class BlockDoubleWoodSlab extends BlockWoodSlab
{
    private static final /* synthetic */ int[] lIlIIIllIIlllI;
    
    static {
        lllIIIlllIIllII();
    }
    
    private static void lllIIIlllIIllII() {
        (lIlIIIllIIlllI = new int[1])[0] = " ".length();
    }
    
    @Override
    public boolean isDouble() {
        return BlockDoubleWoodSlab.lIlIIIllIIlllI[0] != 0;
    }
}
