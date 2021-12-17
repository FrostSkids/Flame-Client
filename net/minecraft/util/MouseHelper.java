// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.util;

import org.lwjgl.opengl.Display;
import org.lwjgl.input.Mouse;

public class MouseHelper
{
    public /* synthetic */ int deltaX;
    private static final /* synthetic */ int[] lllIlIllIlllII;
    public /* synthetic */ int deltaY;
    
    public void grabMouseCursor() {
        Mouse.setGrabbed((boolean)(MouseHelper.lllIlIllIlllII[0] != 0));
        this.deltaX = MouseHelper.lllIlIllIlllII[1];
        this.deltaY = MouseHelper.lllIlIllIlllII[1];
    }
    
    private static void lIlIIIllIllIIIIl() {
        (lllIlIllIlllII = new int[3])[0] = " ".length();
        MouseHelper.lllIlIllIlllII[1] = (" ".length() & ~" ".length());
        MouseHelper.lllIlIllIlllII[2] = "  ".length();
    }
    
    public void mouseXYChange() {
        this.deltaX = Mouse.getDX();
        this.deltaY = Mouse.getDY();
    }
    
    public void ungrabMouseCursor() {
        Mouse.setCursorPosition(Display.getWidth() / MouseHelper.lllIlIllIlllII[2], Display.getHeight() / MouseHelper.lllIlIllIlllII[2]);
        Mouse.setGrabbed((boolean)(MouseHelper.lllIlIllIlllII[1] != 0));
    }
    
    static {
        lIlIIIllIllIIIIl();
    }
}
