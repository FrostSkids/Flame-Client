// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.block.material;

public class MaterialLiquid extends Material
{
    private static final /* synthetic */ int[] lIlIllllIIlllI;
    
    private static void llllIlIIlIlllIl() {
        (lIlIllllIIlllI = new int[2])[0] = " ".length();
        MaterialLiquid.lIlIllllIIlllI[1] = ((0x53 ^ 0x12) & ~(0x74 ^ 0x35));
    }
    
    @Override
    public boolean isSolid() {
        return MaterialLiquid.lIlIllllIIlllI[1] != 0;
    }
    
    public MaterialLiquid(final MapColor lllllllllllllIIIIlIlIIIllIlIlIIl) {
        super(lllllllllllllIIIIlIlIIIllIlIlIIl);
        this.setReplaceable();
        "".length();
        this.setNoPushMobility();
        "".length();
    }
    
    @Override
    public boolean blocksMovement() {
        return MaterialLiquid.lIlIllllIIlllI[1] != 0;
    }
    
    @Override
    public boolean isLiquid() {
        return MaterialLiquid.lIlIllllIIlllI[0] != 0;
    }
    
    static {
        llllIlIIlIlllIl();
    }
}
