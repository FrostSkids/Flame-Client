// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.material;

public class MaterialPortal extends Material
{
    private static final /* synthetic */ int[] lIlIlIllllIIII;
    
    public MaterialPortal(final MapColor lllllllllllllIIIIllllIllIIllIlIl) {
        super(lllllllllllllIIIIllllIllIIllIlIl);
    }
    
    static {
        lllIlllllIlIIll();
    }
    
    private static void lllIlllllIlIIll() {
        (lIlIlIllllIIII = new int[1])[0] = ((0xFE ^ 0xBE ^ (0xC3 ^ 0xB4)) & (0xB3 ^ 0x9A ^ (0x36 ^ 0x28) ^ -" ".length()));
    }
    
    @Override
    public boolean isSolid() {
        return MaterialPortal.lIlIlIllllIIII[0] != 0;
    }
    
    @Override
    public boolean blocksLight() {
        return MaterialPortal.lIlIlIllllIIII[0] != 0;
    }
    
    @Override
    public boolean blocksMovement() {
        return MaterialPortal.lIlIlIllllIIII[0] != 0;
    }
}
