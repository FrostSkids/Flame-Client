// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block;

public class BlockHalfStoneSlab extends BlockStoneSlab
{
    private static final /* synthetic */ int[] llIllIllIIlllI;
    
    private static void lIIllIIIIIllllIl() {
        (llIllIllIIlllI = new int[1])[0] = ((0xE9 ^ 0xBA) & ~(0x2D ^ 0x7E));
    }
    
    static {
        lIIllIIIIIllllIl();
    }
    
    @Override
    public boolean isDouble() {
        return BlockHalfStoneSlab.llIllIllIIlllI[0] != 0;
    }
}
