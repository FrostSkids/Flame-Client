// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.gui;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.Input;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.Sound;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;

public class MouseOverArea extends AbstractComponent
{
    private /* synthetic */ Image mouseDownImage;
    private /* synthetic */ Color normalColor;
    private static final /* synthetic */ int[] llllllIIIlIIl;
    private /* synthetic */ Sound mouseDownSound;
    private /* synthetic */ Color currentColor;
    private /* synthetic */ Color mouseDownColor;
    private /* synthetic */ boolean over;
    private /* synthetic */ Shape area;
    private /* synthetic */ boolean mouseUp;
    private /* synthetic */ Image mouseOverImage;
    private /* synthetic */ Sound mouseOverSound;
    private /* synthetic */ Color mouseOverColor;
    private /* synthetic */ int state;
    private /* synthetic */ Image currentImage;
    private /* synthetic */ boolean mouseDown;
    private /* synthetic */ Image normalImage;
    
    public void setMouseDownSound(final Sound lllllllllllllIlIlIlIllIIlIlllIIl) {
        this.mouseDownSound = lllllllllllllIlIlIlIllIIlIlllIIl;
    }
    
    public MouseOverArea(final GUIContext lllllllllllllIlIlIlIllIlIIIlllII, final Image lllllllllllllIlIlIlIllIlIIIlIllI, final Shape lllllllllllllIlIlIlIllIlIIIlIlIl) {
        super(lllllllllllllIlIlIlIllIlIIIlllII);
        this.normalColor = Color.white;
        this.mouseOverColor = Color.white;
        this.mouseDownColor = Color.white;
        this.state = MouseOverArea.llllllIIIlIIl[0];
        this.area = lllllllllllllIlIlIlIllIlIIIlIlIl;
        this.normalImage = lllllllllllllIlIlIlIllIlIIIlIllI;
        this.currentImage = lllllllllllllIlIlIlIllIlIIIlIllI;
        this.mouseOverImage = lllllllllllllIlIlIlIllIlIIIlIllI;
        this.mouseDownImage = lllllllllllllIlIlIlIllIlIIIlIllI;
        this.currentColor = this.normalColor;
        this.state = MouseOverArea.llllllIIIlIIl[0];
        final Input lllllllllllllIlIlIlIllIlIIIllIIl = lllllllllllllIlIlIlIllIlIIIlllII.getInput();
        this.over = this.area.contains((float)lllllllllllllIlIlIlIllIlIIIllIIl.getMouseX(), (float)lllllllllllllIlIlIlIllIlIIIllIIl.getMouseY());
        this.mouseDown = lllllllllllllIlIlIlIllIlIIIllIIl.isMouseButtonDown(MouseOverArea.llllllIIIlIIl[1]);
        this.updateImage();
    }
    
    public void setMouseDownImage(final Image lllllllllllllIlIlIlIllIIllIlIlll) {
        this.mouseDownImage = lllllllllllllIlIlIlIllIIllIlIlll;
    }
    
    @Override
    public int getY() {
        return (int)this.area.getY();
    }
    
    @Override
    public int getWidth() {
        return (int)(this.area.getMaxX() - this.area.getX());
    }
    
    public void setX(final float lllllllllllllIlIlIlIllIlIIIIIlll) {
        this.area.setX(lllllllllllllIlIlIlIllIlIIIIIlll);
    }
    
    public void setNormalImage(final Image lllllllllllllIlIlIlIllIIlllIIIIl) {
        this.normalImage = lllllllllllllIlIlIlIllIIlllIIIIl;
    }
    
    @Override
    public int getHeight() {
        return (int)(this.area.getMaxY() - this.area.getY());
    }
    
    @Override
    public void mousePressed(final int lllllllllllllIlIlIlIllIIlIIllIIl, final int lllllllllllllIlIlIlIllIIlIIlIlII, final int lllllllllllllIlIlIlIllIIlIIlIIll) {
        this.over = this.area.contains((float)lllllllllllllIlIlIlIllIIlIIlIlII, (float)lllllllllllllIlIlIlIllIIlIIlIIll);
        if (lIlIlllllIlllIl(lllllllllllllIlIlIlIllIIlIIllIIl)) {
            this.mouseDown = (MouseOverArea.llllllIIIlIIl[0] != 0);
        }
    }
    
    public MouseOverArea(final GUIContext lllllllllllllIlIlIlIllIlIIlIllll, final Image lllllllllllllIlIlIlIllIlIIlIIlll, final int lllllllllllllIlIlIlIllIlIIlIIllI, final int lllllllllllllIlIlIlIllIlIIlIIlIl, final int lllllllllllllIlIlIlIllIlIIlIIlII, final int lllllllllllllIlIlIlIllIlIIlIIIll) {
        this(lllllllllllllIlIlIlIllIlIIlIllll, lllllllllllllIlIlIlIllIlIIlIIlll, new Rectangle((float)lllllllllllllIlIlIlIllIlIIlIIllI, (float)lllllllllllllIlIlIlIllIlIIlIIlIl, (float)lllllllllllllIlIlIlIllIlIIlIIlII, (float)lllllllllllllIlIlIlIllIlIIlIIIll));
    }
    
    public void setMouseOverSound(final Sound lllllllllllllIlIlIlIllIIlIllllll) {
        this.mouseOverSound = lllllllllllllIlIlIlIllIIlIllllll;
    }
    
    public MouseOverArea(final GUIContext lllllllllllllIlIlIlIllIlIIlllllI, final Image lllllllllllllIlIlIlIllIlIIllllIl, final int lllllllllllllIlIlIlIllIlIlIIIlII, final int lllllllllllllIlIlIlIllIlIlIIIIll, final int lllllllllllllIlIlIlIllIlIlIIIIlI, final int lllllllllllllIlIlIlIllIlIIlllIIl, final ComponentListener lllllllllllllIlIlIlIllIlIIlllIII) {
        this(lllllllllllllIlIlIlIllIlIIlllllI, lllllllllllllIlIlIlIllIlIIllllIl, lllllllllllllIlIlIlIllIlIlIIIlII, lllllllllllllIlIlIlIllIlIlIIIIll, lllllllllllllIlIlIlIllIlIlIIIIlI, lllllllllllllIlIlIlIllIlIIlllIIl);
        this.addListener(lllllllllllllIlIlIlIllIlIIlllIII);
    }
    
    @Override
    public int getX() {
        return (int)this.area.getX();
    }
    
    @Override
    public void mouseMoved(final int lllllllllllllIlIlIlIllIIlIllIlII, final int lllllllllllllIlIlIlIllIIlIllIIll, final int lllllllllllllIlIlIlIllIIlIllIIlI, final int lllllllllllllIlIlIlIllIIlIlIlllI) {
        this.over = this.area.contains((float)lllllllllllllIlIlIlIllIIlIllIIlI, (float)lllllllllllllIlIlIlIllIIlIlIlllI);
    }
    
    private void updateImage() {
        if (lIlIlllllIlllIl(this.over ? 1 : 0)) {
            this.currentImage = this.normalImage;
            this.currentColor = this.normalColor;
            this.state = MouseOverArea.llllllIIIlIIl[0];
            this.mouseUp = (MouseOverArea.llllllIIIlIIl[1] != 0);
            "".length();
            if (null != null) {
                return;
            }
        }
        else {
            if (lIlIlllllIllllI(this.mouseDown ? 1 : 0)) {
                if (lIlIlllllIlllll(this.state, MouseOverArea.llllllIIIlIIl[2]) && lIlIlllllIllllI(this.mouseUp ? 1 : 0)) {
                    if (lIlIlllllIlllII(this.mouseDownSound)) {
                        this.mouseDownSound.play();
                    }
                    this.currentImage = this.mouseDownImage;
                    this.currentColor = this.mouseDownColor;
                    this.state = MouseOverArea.llllllIIIlIIl[2];
                    this.notifyListeners();
                    this.mouseUp = (MouseOverArea.llllllIIIlIIl[1] != 0);
                }
                return;
            }
            this.mouseUp = (MouseOverArea.llllllIIIlIIl[0] != 0);
            if (lIlIlllllIlllll(this.state, MouseOverArea.llllllIIIlIIl[3])) {
                if (lIlIlllllIlllII(this.mouseOverSound)) {
                    this.mouseOverSound.play();
                }
                this.currentImage = this.mouseOverImage;
                this.currentColor = this.mouseOverColor;
                this.state = MouseOverArea.llllllIIIlIIl[3];
            }
        }
        this.mouseDown = (MouseOverArea.llllllIIIlIIl[1] != 0);
        this.state = MouseOverArea.llllllIIIlIIl[0];
    }
    
    static {
        lIlIlllllIllIll();
        MOUSE_DOWN = MouseOverArea.llllllIIIlIIl[2];
        MOUSE_OVER = MouseOverArea.llllllIIIlIIl[3];
        NORMAL = MouseOverArea.llllllIIIlIIl[0];
    }
    
    public MouseOverArea(final GUIContext lllllllllllllIlIlIlIllIlIlIlIIll, final Image lllllllllllllIlIlIlIllIlIlIlIIlI, final int lllllllllllllIlIlIlIllIlIlIlIllI, final int lllllllllllllIlIlIlIllIlIlIlIlIl) {
        this(lllllllllllllIlIlIlIllIlIlIlIIll, lllllllllllllIlIlIlIllIlIlIlIIlI, lllllllllllllIlIlIlIllIlIlIlIllI, lllllllllllllIlIlIlIllIlIlIlIlIl, lllllllllllllIlIlIlIllIlIlIlIIlI.getWidth(), lllllllllllllIlIlIlIllIlIlIlIIlI.getHeight());
    }
    
    @Override
    public void mouseDragged(final int lllllllllllllIlIlIlIllIIlIlIIIlI, final int lllllllllllllIlIlIlIllIIlIlIIIIl, final int lllllllllllllIlIlIlIllIIlIlIIIII, final int lllllllllllllIlIlIlIllIIlIIlllll) {
        this.mouseMoved(lllllllllllllIlIlIlIllIIlIlIIIlI, lllllllllllllIlIlIlIllIIlIlIIIIl, lllllllllllllIlIlIlIllIIlIlIIIII, lllllllllllllIlIlIlIllIIlIIlllll);
    }
    
    private static void lIlIlllllIllIll() {
        (llllllIIIlIIl = new int[4])[0] = " ".length();
        MouseOverArea.llllllIIIlIIl[1] = (" ".length() & (" ".length() ^ -" ".length()));
        MouseOverArea.llllllIIIlIIl[2] = "  ".length();
        MouseOverArea.llllllIIIlIIl[3] = "   ".length();
    }
    
    public void setNormalColor(final Color lllllllllllllIlIlIlIllIIllllIlIl) {
        this.normalColor = lllllllllllllIlIlIlIllIIllllIlIl;
    }
    
    public void setY(final float lllllllllllllIlIlIlIllIlIIIIIIIl) {
        this.area.setY(lllllllllllllIlIlIlIllIlIIIIIIIl);
    }
    
    private static boolean lIlIlllllIlllll(final int lllllllllllllIlIlIlIllIIIllIllII, final int lllllllllllllIlIlIlIllIIIllIlIll) {
        return lllllllllllllIlIlIlIllIIIllIllII != lllllllllllllIlIlIlIllIIIllIlIll;
    }
    
    public boolean isMouseOver() {
        return this.over;
    }
    
    @Override
    public void mouseReleased(final int lllllllllllllIlIlIlIllIIlIIIllIl, final int lllllllllllllIlIlIlIllIIlIIIlIII, final int lllllllllllllIlIlIlIllIIlIIIIlll) {
        this.over = this.area.contains((float)lllllllllllllIlIlIlIllIIlIIIlIII, (float)lllllllllllllIlIlIlIllIIlIIIIlll);
        if (lIlIlllllIlllIl(lllllllllllllIlIlIlIllIIlIIIllIl)) {
            this.mouseDown = (MouseOverArea.llllllIIIlIIl[1] != 0);
        }
    }
    
    public void setLocation(final float lllllllllllllIlIlIlIllIlIIIIllll, final float lllllllllllllIlIlIlIllIlIIIIlllI) {
        if (lIlIlllllIlllII(this.area)) {
            this.area.setX(lllllllllllllIlIlIlIllIlIIIIllll);
            this.area.setY(lllllllllllllIlIlIlIllIlIIIIlllI);
        }
    }
    
    private static boolean lIlIlllllIlllII(final Object lllllllllllllIlIlIlIllIIIlllIIll) {
        return lllllllllllllIlIlIlIllIIIlllIIll != null;
    }
    
    @Override
    public void render(final GUIContext lllllllllllllIlIlIlIllIIllIIllIl, final Graphics lllllllllllllIlIlIlIllIIllIIllII) {
        if (lIlIlllllIlllII(this.currentImage)) {
            final int lllllllllllllIlIlIlIllIIllIlIIII = (int)(this.area.getX() + (this.getWidth() - this.currentImage.getWidth()) / MouseOverArea.llllllIIIlIIl[2]);
            final int lllllllllllllIlIlIlIllIIllIIllll = (int)(this.area.getY() + (this.getHeight() - this.currentImage.getHeight()) / MouseOverArea.llllllIIIlIIl[2]);
            this.currentImage.draw((float)lllllllllllllIlIlIlIllIIllIlIIII, (float)lllllllllllllIlIlIlIllIIllIIllll, this.currentColor);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        else {
            lllllllllllllIlIlIlIllIIllIIllII.setColor(this.currentColor);
            lllllllllllllIlIlIlIllIIllIIllII.fill(this.area);
        }
        this.updateImage();
    }
    
    public void setMouseOverColor(final Color lllllllllllllIlIlIlIllIIlllIllIl) {
        this.mouseOverColor = lllllllllllllIlIlIlIllIIlllIllIl;
    }
    
    @Override
    public void setLocation(final int lllllllllllllIlIlIlIllIIIllllIIl, final int lllllllllllllIlIlIlIllIIIllllIII) {
        this.setLocation((float)lllllllllllllIlIlIlIllIIIllllIIl, (float)lllllllllllllIlIlIlIllIIIllllIII);
    }
    
    private static boolean lIlIlllllIllllI(final int lllllllllllllIlIlIlIllIIIlllIIIl) {
        return lllllllllllllIlIlIlIllIIIlllIIIl != 0;
    }
    
    private static boolean lIlIlllllIlllIl(final int lllllllllllllIlIlIlIllIIIllIllll) {
        return lllllllllllllIlIlIlIllIIIllIllll == 0;
    }
    
    public MouseOverArea(final GUIContext lllllllllllllIlIlIlIllIlIllIlIIl, final Image lllllllllllllIlIlIlIllIlIllIIIlI, final int lllllllllllllIlIlIlIllIlIllIIlll, final int lllllllllllllIlIlIlIllIlIllIIllI, final ComponentListener lllllllllllllIlIlIlIllIlIlIlllll) {
        this(lllllllllllllIlIlIlIllIlIllIlIIl, lllllllllllllIlIlIlIllIlIllIIIlI, lllllllllllllIlIlIlIllIlIllIIlll, lllllllllllllIlIlIlIllIlIllIIllI, lllllllllllllIlIlIlIllIlIllIIIlI.getWidth(), lllllllllllllIlIlIlIllIlIllIIIlI.getHeight());
        this.addListener(lllllllllllllIlIlIlIllIlIlIlllll);
    }
    
    public void setMouseOverImage(final Image lllllllllllllIlIlIlIllIIllIllIll) {
        this.mouseOverImage = lllllllllllllIlIlIlIllIIllIllIll;
    }
    
    public void setMouseDownColor(final Color lllllllllllllIlIlIlIllIIlllIlIIl) {
        this.mouseDownColor = lllllllllllllIlIlIlIllIIlllIlIIl;
    }
}
