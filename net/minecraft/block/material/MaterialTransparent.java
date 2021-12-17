// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.material;

public class MaterialTransparent extends Material
{
    private static final /* synthetic */ int[] lIIIlIIlIIlIlI;
    
    @Override
    public boolean blocksLight() {
        return MaterialTransparent.lIIIlIIlIIlIlI[0] != 0;
    }
    
    private static void lIllllllIIllIll() {
        (lIIIlIIlIIlIlI = new int[1])[0] = ((0x42 ^ 0x38 ^ (0x4F ^ 0x3)) & (0x16 ^ 0x72 ^ (0x0 ^ 0x52) ^ -" ".length()));
    }
    
    static {
        lIllllllIIllIll();
    }
    
    @Override
    public boolean blocksMovement() {
        return MaterialTransparent.lIIIlIIlIIlIlI[0] != 0;
    }
    
    public MaterialTransparent(final MapColor lllllllllllllIlIIIlIlIlIllIlIIII) {
        super(lllllllllllllIlIIIlIlIlIllIlIIII);
        this.setReplaceable();
        "".length();
    }
    
    @Override
    public boolean isSolid() {
        return MaterialTransparent.lIIIlIIlIIlIlI[0] != 0;
    }
}
