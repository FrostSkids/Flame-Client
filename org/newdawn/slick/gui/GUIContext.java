// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.gui;

import org.newdawn.slick.Input;
import org.newdawn.slick.Font;
import org.newdawn.slick.opengl.ImageData;
import org.lwjgl.input.Cursor;
import org.newdawn.slick.SlickException;

public interface GUIContext
{
    void setMouseCursor(final String p0, final int p1, final int p2) throws SlickException;
    
    int getWidth();
    
    void setMouseCursor(final Cursor p0, final int p1, final int p2) throws SlickException;
    
    int getHeight();
    
    int getScreenHeight();
    
    void setMouseCursor(final ImageData p0, final int p1, final int p2) throws SlickException;
    
    Font getDefaultFont();
    
    long getTime();
    
    int getScreenWidth();
    
    void setDefaultMouseCursor();
    
    Input getInput();
}
