// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util.pathfinding.navmesh;

public class Link
{
    private /* synthetic */ float py;
    private /* synthetic */ float px;
    private /* synthetic */ Space target;
    
    public Link(final float lllllllllllllIlIlIIlllIllIlIIIll, final float lllllllllllllIlIlIIlllIllIIllllI, final Space lllllllllllllIlIlIIlllIllIIlllIl) {
        this.px = lllllllllllllIlIlIIlllIllIlIIIll;
        this.py = lllllllllllllIlIlIIlllIllIIllllI;
        this.target = lllllllllllllIlIlIIlllIllIIlllIl;
    }
    
    public Space getTarget() {
        return this.target;
    }
    
    public float getX() {
        return this.px;
    }
    
    public float distance2(final float lllllllllllllIlIlIIlllIllIIlIIIl, final float lllllllllllllIlIlIIlllIllIIlIlIl) {
        final float lllllllllllllIlIlIIlllIllIIlIlII = lllllllllllllIlIlIIlllIllIIlIIIl - this.px;
        final float lllllllllllllIlIlIIlllIllIIlIIll = lllllllllllllIlIlIIlllIllIIlIlIl - this.py;
        return lllllllllllllIlIlIIlllIllIIlIlII * lllllllllllllIlIlIIlllIllIIlIlII + lllllllllllllIlIlIIlllIllIIlIIll * lllllllllllllIlIlIIlllIllIIlIIll;
    }
    
    public float getY() {
        return this.py;
    }
}
