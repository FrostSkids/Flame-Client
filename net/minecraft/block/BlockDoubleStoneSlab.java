// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

public class BlockDoubleStoneSlab extends BlockStoneSlab
{
    private static final /* synthetic */ int[] lllIlIIIlIlIlI;
    
    private static void lIlIIIIllIlIIlIl() {
        (lllIlIIIlIlIlI = new int[1])[0] = " ".length();
    }
    
    @Override
    public boolean isDouble() {
        return BlockDoubleStoneSlab.lllIlIIIlIlIlI[0] != 0;
    }
    
    static {
        lIlIIIIllIlIIlIl();
    }
}
