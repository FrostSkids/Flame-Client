// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.dispenser;

public class PositionImpl implements IPosition
{
    protected final /* synthetic */ double y;
    protected final /* synthetic */ double x;
    protected final /* synthetic */ double z;
    
    @Override
    public double getY() {
        return this.y;
    }
    
    @Override
    public double getX() {
        return this.x;
    }
    
    @Override
    public double getZ() {
        return this.z;
    }
    
    public PositionImpl(final double lllllllllllllIIlIIlIIllIIIIIlllI, final double lllllllllllllIIlIIlIIllIIIIIlIIl, final double lllllllllllllIIlIIlIIllIIIIIlIII) {
        this.x = lllllllllllllIIlIIlIIllIIIIIlllI;
        this.y = lllllllllllllIIlIIlIIllIIIIIlIIl;
        this.z = lllllllllllllIIlIIlIIllIIIIIlIII;
    }
}
