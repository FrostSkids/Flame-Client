// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.material;

public class MaterialLogic extends Material
{
    private static final /* synthetic */ int[] lIlllIIlIIlIII;
    
    static {
        lIIIIIIllIllIllI();
    }
    
    @Override
    public boolean blocksLight() {
        return MaterialLogic.lIlllIIlIIlIII[0] != 0;
    }
    
    @Override
    public boolean blocksMovement() {
        return MaterialLogic.lIlllIIlIIlIII[0] != 0;
    }
    
    public MaterialLogic(final MapColor llllllllllllIlllllIlIIIllIlIIllI) {
        super(llllllllllllIlllllIlIIIllIlIIllI);
        this.setAdventureModeExempt();
        "".length();
    }
    
    @Override
    public boolean isSolid() {
        return MaterialLogic.lIlllIIlIIlIII[0] != 0;
    }
    
    private static void lIIIIIIllIllIllI() {
        (lIlllIIlIIlIII = new int[1])[0] = ((0x57 ^ 0x21 ^ (0x4E ^ 0x63)) & (0xCE ^ 0xC7 ^ (0xFF ^ 0xAD) ^ -" ".length()));
    }
}
