// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

public class BlockDoubleStoneSlabNew extends BlockStoneSlabNew
{
    private static final /* synthetic */ int[] lIllIIIIllIlII;
    
    @Override
    public boolean isDouble() {
        return BlockDoubleStoneSlabNew.lIllIIIIllIlII[0] != 0;
    }
    
    private static void llllIllIllllIlI() {
        (lIllIIIIllIlII = new int[1])[0] = " ".length();
    }
    
    static {
        llllIllIllllIlI();
    }
}
