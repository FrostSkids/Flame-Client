// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.block.model;

import net.minecraft.util.EnumFacing;

public class BakedQuad
{
    protected final /* synthetic */ int[] vertexData;
    protected final /* synthetic */ int tintIndex;
    private static final /* synthetic */ int[] llllIIIlIIlIl;
    protected final /* synthetic */ EnumFacing face;
    
    static {
        lIlIIlllIllIlII();
    }
    
    public BakedQuad(final int[] lllllllllllllIlIllllIIlIllIlIlll, final int lllllllllllllIlIllllIIlIllIllIlI, final EnumFacing lllllllllllllIlIllllIIlIllIllIIl) {
        this.vertexData = lllllllllllllIlIllllIIlIllIlIlll;
        this.tintIndex = lllllllllllllIlIllllIIlIllIllIlI;
        this.face = lllllllllllllIlIllllIIlIllIllIIl;
    }
    
    public int getTintIndex() {
        return this.tintIndex;
    }
    
    private static void lIlIIlllIllIlII() {
        (llllIIIlIIlIl = new int[3])[0] = -" ".length();
        BakedQuad.llllIIIlIIlIl[1] = " ".length();
        BakedQuad.llllIIIlIIlIl[2] = ((0x4B ^ 0x29) & ~(0xF9 ^ 0x9B));
    }
    
    public EnumFacing getFace() {
        return this.face;
    }
    
    public boolean hasTintIndex() {
        if (lIlIIlllIllIlIl(this.tintIndex, BakedQuad.llllIIIlIIlIl[0])) {
            return BakedQuad.llllIIIlIIlIl[1] != 0;
        }
        return BakedQuad.llllIIIlIIlIl[2] != 0;
    }
    
    public int[] getVertexData() {
        return this.vertexData;
    }
    
    private static boolean lIlIIlllIllIlIl(final int lllllllllllllIlIllllIIlIllIIIllI, final int lllllllllllllIlIllllIIlIllIIIlIl) {
        return lllllllllllllIlIllllIIlIllIIIllI != lllllllllllllIlIllllIIlIllIIIlIl;
    }
}
