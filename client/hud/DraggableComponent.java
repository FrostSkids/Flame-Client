// 
// Decompiled by Procyon v0.5.36
// 

package client.hud;

import org.lwjgl.input.Mouse;
import net.minecraft.client.gui.Gui;

public class DraggableComponent
{
    private /* synthetic */ int lastX;
    private static final /* synthetic */ int[] lIIlIIllllIllI;
    private /* synthetic */ boolean dragging;
    private /* synthetic */ int height;
    private /* synthetic */ int y;
    private /* synthetic */ int lastY;
    private /* synthetic */ int x;
    private /* synthetic */ int color;
    private /* synthetic */ int width;
    
    public void setxPosition(final int lllllllllllllIIllIlIlIllIIIlIlIl) {
        this.x = lllllllllllllIIllIlIlIllIIIlIlIl;
    }
    
    private static boolean llIIlllIllllIll(final int lllllllllllllIIllIlIlIlIlllIIIIl, final int lllllllllllllIIllIlIlIlIlllIIIII) {
        return lllllllllllllIIllIlIlIlIlllIIIIl <= lllllllllllllIIllIlIlIlIlllIIIII;
    }
    
    private static void llIIlllIllllIIl() {
        (lIIlIIllllIllI = new int[2])[0] = " ".length();
        DraggableComponent.lIIlIIllllIllI[1] = ((0x38 ^ 0x17) & ~(0x8F ^ 0xA0));
    }
    
    public void setColor(final int lllllllllllllIIllIlIlIllIIIIIIII) {
        this.color = lllllllllllllIIllIlIlIllIIIIIIII;
    }
    
    static {
        llIIlllIllllIIl();
    }
    
    public int getColor() {
        return this.color;
    }
    
    private static boolean llIIlllIlllllIl(final int lllllllllllllIIllIlIlIlIllIlllII) {
        return lllllllllllllIIllIlIlIlIllIlllII == 0;
    }
    
    public void draw(final int lllllllllllllIIllIlIlIlIlllllIIl, final int lllllllllllllIIllIlIlIlIllllIIll) {
        this.draggingFix(lllllllllllllIIllIlIlIlIlllllIIl, lllllllllllllIIllIlIlIlIllllIIll);
        Gui.drawRect(this.getxPosition(), this.getyPosition(), this.getxPosition() + this.getWidth(), this.getyPosition() + this.getHeight(), this.getColor());
        int n;
        if (llIIlllIllllIlI(lllllllllllllIIllIlIlIlIlllllIIl, this.getxPosition()) && llIIlllIllllIll(lllllllllllllIIllIlIlIlIlllllIIl, this.getxPosition() + this.getWidth())) {
            n = DraggableComponent.lIIlIIllllIllI[0];
            "".length();
            if (((0x42 ^ 0x4A) & ~(0x45 ^ 0x4D)) != ((0xE4 ^ 0xC4) & ~(0x86 ^ 0xA6))) {
                return;
            }
        }
        else {
            n = DraggableComponent.lIIlIIllllIllI[1];
        }
        final boolean lllllllllllllIIllIlIlIlIllllIlll = n != 0;
        int n2;
        if (llIIlllIllllIlI(lllllllllllllIIllIlIlIlIllllIIll, this.getyPosition()) && llIIlllIllllIll(lllllllllllllIIllIlIlIlIllllIIll, this.getyPosition() + this.getHeight())) {
            n2 = DraggableComponent.lIIlIIllllIllI[0];
            "".length();
            if ((0xB5 ^ 0xB1) == " ".length()) {
                return;
            }
        }
        else {
            n2 = DraggableComponent.lIIlIIllllIllI[1];
        }
        final boolean lllllllllllllIIllIlIlIlIllllIllI = n2 != 0;
        if (llIIlllIlllllII(lllllllllllllIIllIlIlIlIllllIlll ? 1 : 0) && llIIlllIlllllII(lllllllllllllIIllIlIlIlIllllIllI ? 1 : 0) && llIIlllIlllllII(Mouse.isButtonDown(DraggableComponent.lIIlIIllllIllI[1]) ? 1 : 0) && llIIlllIlllllIl(this.dragging ? 1 : 0)) {
            this.lastX = this.x - lllllllllllllIIllIlIlIlIlllllIIl;
            this.lastY = this.y - lllllllllllllIIllIlIlIlIllllIIll;
            this.dragging = (DraggableComponent.lIIlIIllllIllI[0] != 0);
        }
    }
    
    public int getWidth() {
        return this.width;
    }
    
    private static boolean llIIlllIlllllII(final int lllllllllllllIIllIlIlIlIllIllllI) {
        return lllllllllllllIIllIlIlIlIllIllllI != 0;
    }
    
    public DraggableComponent(final int lllllllllllllIIllIlIlIllIIlIlIll, final int lllllllllllllIIllIlIlIllIIlIIlII, final int lllllllllllllIIllIlIlIllIIlIIIll, final int lllllllllllllIIllIlIlIllIIlIlIII, final int lllllllllllllIIllIlIlIllIIlIIlll) {
        this.width = lllllllllllllIIllIlIlIllIIlIIIll;
        this.height = lllllllllllllIIllIlIlIllIIlIlIII;
        this.x = lllllllllllllIIllIlIlIllIIlIlIll;
        this.y = lllllllllllllIIllIlIlIllIIlIIlII;
        this.color = lllllllllllllIIllIlIlIllIIlIIlll;
    }
    
    public int getxPosition() {
        return this.x;
    }
    
    private void draggingFix(final int lllllllllllllIIllIlIlIlIlllIlIIl, final int lllllllllllllIIllIlIlIlIlllIlIll) {
        if (llIIlllIlllllII(this.dragging ? 1 : 0)) {
            this.x = lllllllllllllIIllIlIlIlIlllIlIIl + this.lastX;
            this.y = lllllllllllllIIllIlIlIlIlllIlIll + this.lastY;
            if (llIIlllIlllllIl(Mouse.isButtonDown(DraggableComponent.lIIlIIllllIllI[1]) ? 1 : 0)) {
                this.dragging = (DraggableComponent.lIIlIIllllIllI[1] != 0);
            }
        }
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public void setyPosition(final int lllllllllllllIIllIlIlIllIIIIllll) {
        this.y = lllllllllllllIIllIlIlIllIIIIllll;
    }
    
    private static boolean llIIlllIllllIlI(final int lllllllllllllIIllIlIlIlIlllIIlIl, final int lllllllllllllIIllIlIlIlIlllIIlII) {
        return lllllllllllllIIllIlIlIlIlllIIlIl >= lllllllllllllIIllIlIlIlIlllIIlII;
    }
    
    public int getyPosition() {
        return this.y;
    }
}
