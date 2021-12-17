// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.gui;

import java.util.Iterator;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.InputListener;
import java.util.HashSet;
import java.util.Set;
import org.newdawn.slick.Input;
import org.newdawn.slick.util.InputAdapter;

public abstract class AbstractComponent extends InputAdapter
{
    private static /* synthetic */ AbstractComponent currentFocus;
    protected /* synthetic */ GUIContext container;
    private static final /* synthetic */ int[] lIlllIIllllIlI;
    private /* synthetic */ boolean focus;
    protected /* synthetic */ Input input;
    protected /* synthetic */ Set listeners;
    
    private static boolean lIIIIIlIIlIlIlll(final Object llllllllllllIlllllIIIlllIIIIlIII, final Object llllllllllllIlllllIIIlllIIIIIlll) {
        return llllllllllllIlllllIIIlllIIIIlIII == llllllllllllIlllllIIIlllIIIIIlll;
    }
    
    public AbstractComponent(final GUIContext llllllllllllIlllllIIIlllIIllIlll) {
        this.focus = (AbstractComponent.lIlllIIllllIlI[0] != 0);
        this.container = llllllllllllIlllllIIIlllIIllIlll;
        this.listeners = new HashSet();
        this.input = llllllllllllIlllllIIIlllIIllIlll.getInput();
        this.input.addPrimaryListener(this);
        this.setLocation(AbstractComponent.lIlllIIllllIlI[0], AbstractComponent.lIlllIIllllIlI[0]);
    }
    
    public boolean hasFocus() {
        return this.focus;
    }
    
    protected void consumeEvent() {
        this.input.consumeEvent();
    }
    
    @Override
    public void mouseReleased(final int llllllllllllIlllllIIIlllIIIlIIlI, final int llllllllllllIlllllIIIlllIIIIlllI, final int llllllllllllIlllllIIIlllIIIlIIII) {
        this.setFocus(Rectangle.contains((float)llllllllllllIlllllIIIlllIIIIlllI, (float)llllllllllllIlllllIIIlllIIIlIIII, (float)this.getX(), (float)this.getY(), (float)this.getWidth(), (float)this.getHeight()));
    }
    
    public abstract int getHeight();
    
    private static boolean lIIIIIlIIlIlIlIl(final int llllllllllllIlllllIIIlllIIIIIlIl) {
        return llllllllllllIlllllIIIlllIIIIIlIl != 0;
    }
    
    public void setFocus(final boolean llllllllllllIlllllIIIlllIIIlllll) {
        if (lIIIIIlIIlIlIlIl(llllllllllllIlllllIIIlllIIIlllll ? 1 : 0)) {
            if (lIIIIIlIIlIlIllI(AbstractComponent.currentFocus)) {
                AbstractComponent.currentFocus.setFocus((boolean)(AbstractComponent.lIlllIIllllIlI[0] != 0));
            }
            AbstractComponent.currentFocus = this;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        else if (lIIIIIlIIlIlIlll(AbstractComponent.currentFocus, this)) {
            AbstractComponent.currentFocus = null;
        }
        this.focus = llllllllllllIlllllIIIlllIIIlllll;
    }
    
    public abstract void render(final GUIContext p0, final Graphics p1) throws SlickException;
    
    public abstract int getY();
    
    protected void notifyListeners() {
        final Iterator llllllllllllIlllllIIIlllIIlIIlIl = this.listeners.iterator();
        while (lIIIIIlIIlIlIlIl(llllllllllllIlllllIIIlllIIlIIlIl.hasNext() ? 1 : 0)) {
            llllllllllllIlllllIIIlllIIlIIlIl.next().componentActivated(this);
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
    }
    
    public abstract int getWidth();
    
    private static void lIIIIIlIIlIlIlII() {
        (lIlllIIllllIlI = new int[1])[0] = ((0x8B ^ 0x93) & ~(0xB0 ^ 0xA8));
    }
    
    public abstract int getX();
    
    public void removeListener(final ComponentListener llllllllllllIlllllIIIlllIIlIlIll) {
        this.listeners.remove(llllllllllllIlllllIIIlllIIlIlIll);
        "".length();
    }
    
    private static boolean lIIIIIlIIlIlIllI(final Object llllllllllllIlllllIIIlllIIIIlIll) {
        return llllllllllllIlllllIIIlllIIIIlIll != null;
    }
    
    static {
        lIIIIIlIIlIlIlII();
        AbstractComponent.currentFocus = null;
    }
    
    public void addListener(final ComponentListener llllllllllllIlllllIIIlllIIlIllll) {
        this.listeners.add(llllllllllllIlllllIIIlllIIlIllll);
        "".length();
    }
    
    public abstract void setLocation(final int p0, final int p1);
}
