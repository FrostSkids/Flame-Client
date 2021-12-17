// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.util;

import org.newdawn.slick.Image;
import org.newdawn.slick.Color;

public class LocatedImage
{
    private /* synthetic */ int x;
    private /* synthetic */ float height;
    private /* synthetic */ Color filter;
    private /* synthetic */ float width;
    private /* synthetic */ int y;
    private /* synthetic */ Image image;
    
    public void setHeight(final float llllllllllllIllIIIIlllIllIlllIIl) {
        this.height = llllllllllllIllIIIIlllIllIlllIIl;
    }
    
    public Color getColor() {
        return this.filter;
    }
    
    public LocatedImage(final Image llllllllllllIllIIIIlllIlllIIlIll, final int llllllllllllIllIIIIlllIlllIIlIlI, final int llllllllllllIllIIIIlllIlllIIlIIl) {
        this.filter = Color.white;
        this.image = llllllllllllIllIIIIlllIlllIIlIll;
        this.x = llllllllllllIllIIIIlllIlllIIlIlI;
        this.y = llllllllllllIllIIIIlllIlllIIlIIl;
        this.width = (float)llllllllllllIllIIIIlllIlllIIlIll.getWidth();
        this.height = (float)llllllllllllIllIIIIlllIlllIIlIll.getHeight();
    }
    
    public void setX(final int llllllllllllIllIIIIlllIllIlIIllI) {
        this.x = llllllllllllIllIIIIlllIllIlIIllI;
    }
    
    public int getX() {
        return this.x;
    }
    
    public int getY() {
        return this.y;
    }
    
    public void setWidth(final float llllllllllllIllIIIIlllIllIllIlIl) {
        this.width = llllllllllllIllIIIIlllIllIllIlIl;
    }
    
    public void setColor(final Color llllllllllllIllIIIIlllIllIlIllIl) {
        this.filter = llllllllllllIllIIIIlllIllIlIllIl;
    }
    
    public float getHeight() {
        return this.height;
    }
    
    public void draw() {
        this.image.draw((float)this.x, (float)this.y, this.width, this.height, this.filter);
    }
    
    public float getWidth() {
        return this.width;
    }
    
    public void setY(final int llllllllllllIllIIIIlllIllIlIIIII) {
        this.y = llllllllllllIllIIIIlllIllIlIIIII;
    }
}
