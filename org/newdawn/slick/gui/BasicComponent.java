// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.gui;

import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;

public abstract class BasicComponent extends AbstractComponent
{
    protected /* synthetic */ int width;
    protected /* synthetic */ int height;
    protected /* synthetic */ int x;
    protected /* synthetic */ int y;
    
    @Override
    public int getWidth() {
        return this.width;
    }
    
    @Override
    public void render(final GUIContext llllllllllllIlllllllIIIIlIlIlIII, final Graphics llllllllllllIlllllllIIIIlIlIIlll) throws SlickException {
        this.renderImpl(llllllllllllIlllllllIIIIlIlIlIII, llllllllllllIlllllllIIIIlIlIIlll);
    }
    
    public BasicComponent(final GUIContext llllllllllllIlllllllIIIIlIlllllI) {
        super(llllllllllllIlllllllIIIIlIlllllI);
    }
    
    @Override
    public int getHeight() {
        return this.height;
    }
    
    @Override
    public void setLocation(final int llllllllllllIlllllllIIIIlIIlllll, final int llllllllllllIlllllllIIIIlIlIIIIl) {
        this.x = llllllllllllIlllllllIIIIlIIlllll;
        this.y = llllllllllllIlllllllIIIIlIlIIIIl;
    }
    
    @Override
    public int getX() {
        return this.x;
    }
    
    public abstract void renderImpl(final GUIContext p0, final Graphics p1);
    
    @Override
    public int getY() {
        return this.y;
    }
}
