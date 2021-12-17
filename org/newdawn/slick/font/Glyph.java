// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font;

import java.awt.font.GlyphMetrics;
import org.newdawn.slick.UnicodeFont;
import java.awt.font.GlyphVector;
import java.awt.Rectangle;
import org.newdawn.slick.Image;
import java.awt.Shape;

public class Glyph
{
    private /* synthetic */ short width;
    private /* synthetic */ short yOffset;
    private /* synthetic */ Shape shape;
    private static final /* synthetic */ int[] lllIIllllIlIIl;
    private /* synthetic */ boolean isMissing;
    private /* synthetic */ int codePoint;
    private /* synthetic */ Image image;
    private /* synthetic */ short height;
    
    public int getYOffset() {
        return this.yOffset;
    }
    
    public void setShape(final Shape llllllllllllIlIlllIlIllllIlIIIIl) {
        this.shape = llllllllllllIlIlllIlIllllIlIIIIl;
    }
    
    public Shape getShape() {
        return this.shape;
    }
    
    private static boolean lIlIIIIIllllIIII(final int llllllllllllIlIlllIlIllllIIlIIIl) {
        return llllllllllllIlIlllIlIllllIIlIIIl > 0;
    }
    
    public Image getImage() {
        return this.image;
    }
    
    static {
        lIlIIIIIlllIllll();
    }
    
    public boolean isMissing() {
        return this.isMissing;
    }
    
    public int getCodePoint() {
        return this.codePoint;
    }
    
    public Glyph(final int llllllllllllIlIlllIlIlllllIIIlII, final Rectangle llllllllllllIlIlllIlIlllllIIlllI, final GlyphVector llllllllllllIlIlllIlIlllllIIllIl, final int llllllllllllIlIlllIlIlllllIIllII, final UnicodeFont llllllllllllIlIlllIlIlllllIIlIll) {
        this.codePoint = llllllllllllIlIlllIlIlllllIIIlII;
        final GlyphMetrics llllllllllllIlIlllIlIlllllIIlIlI = llllllllllllIlIlllIlIlllllIIllIl.getGlyphMetrics(llllllllllllIlIlllIlIlllllIIllII);
        int llllllllllllIlIlllIlIlllllIIlIIl = (int)llllllllllllIlIlllIlIlllllIIlIlI.getLSB();
        if (lIlIIIIIllllIIII(llllllllllllIlIlllIlIlllllIIlIIl)) {
            llllllllllllIlIlllIlIlllllIIlIIl = Glyph.lllIIllllIlIIl[0];
        }
        int llllllllllllIlIlllIlIlllllIIlIII = (int)llllllllllllIlIlllIlIlllllIIlIlI.getRSB();
        if (lIlIIIIIllllIIII(llllllllllllIlIlllIlIlllllIIlIII)) {
            llllllllllllIlIlllIlIlllllIIlIII = Glyph.lllIIllllIlIIl[0];
        }
        final int llllllllllllIlIlllIlIlllllIIIlll = llllllllllllIlIlllIlIlllllIIlllI.width - llllllllllllIlIlllIlIlllllIIlIIl - llllllllllllIlIlllIlIlllllIIlIII;
        final int llllllllllllIlIlllIlIlllllIIIllI = llllllllllllIlIlllIlIlllllIIlllI.height;
        if (lIlIIIIIllllIIII(llllllllllllIlIlllIlIlllllIIIlll) && lIlIIIIIllllIIII(llllllllllllIlIlllIlIlllllIIIllI)) {
            final int llllllllllllIlIlllIlIlllllIlIlIl = llllllllllllIlIlllIlIlllllIIlIll.getPaddingTop();
            final int llllllllllllIlIlllIlIlllllIlIlII = llllllllllllIlIlllIlIlllllIIlIll.getPaddingRight();
            final int llllllllllllIlIlllIlIlllllIlIIll = llllllllllllIlIlllIlIlllllIIlIll.getPaddingBottom();
            final int llllllllllllIlIlllIlIlllllIlIIlI = llllllllllllIlIlllIlIlllllIIlIll.getPaddingLeft();
            final int llllllllllllIlIlllIlIlllllIlIIIl = Glyph.lllIIllllIlIIl[1];
            this.width = (short)(llllllllllllIlIlllIlIlllllIIIlll + llllllllllllIlIlllIlIlllllIlIIlI + llllllllllllIlIlllIlIlllllIlIlII + llllllllllllIlIlllIlIlllllIlIIIl);
            this.height = (short)(llllllllllllIlIlllIlIlllllIIIllI + llllllllllllIlIlllIlIlllllIlIlIl + llllllllllllIlIlllIlIlllllIlIIll + llllllllllllIlIlllIlIlllllIlIIIl);
            this.yOffset = (short)(llllllllllllIlIlllIlIlllllIIlIll.getAscent() + llllllllllllIlIlllIlIlllllIIlllI.y - llllllllllllIlIlllIlIlllllIlIlIl);
        }
        this.shape = llllllllllllIlIlllIlIlllllIIllIl.getGlyphOutline(llllllllllllIlIlllIlIlllllIIllII, (float)(-llllllllllllIlIlllIlIlllllIIlllI.x + llllllllllllIlIlllIlIlllllIIlIll.getPaddingLeft()), (float)(-llllllllllllIlIlllIlIlllllIIlllI.y + llllllllllllIlIlllIlIlllllIIlIll.getPaddingTop()));
        int isMissing;
        if (lIlIIIIIllllIIIl(llllllllllllIlIlllIlIlllllIIlIll.getFont().canDisplay((char)llllllllllllIlIlllIlIlllllIIIlII) ? 1 : 0)) {
            isMissing = Glyph.lllIIllllIlIIl[1];
            "".length();
            if ("  ".length() != "  ".length()) {
                throw null;
            }
        }
        else {
            isMissing = Glyph.lllIIllllIlIIl[0];
        }
        this.isMissing = (isMissing != 0);
    }
    
    private static boolean lIlIIIIIllllIIIl(final int llllllllllllIlIlllIlIllllIIlIIll) {
        return llllllllllllIlIlllIlIllllIIlIIll == 0;
    }
    
    public int getHeight() {
        return this.height;
    }
    
    public int getWidth() {
        return this.width;
    }
    
    private static void lIlIIIIIlllIllll() {
        (lllIIllllIlIIl = new int[2])[0] = ((0x1 ^ 0x26) & ~(0x6 ^ 0x21));
        Glyph.lllIIllllIlIIl[1] = " ".length();
    }
    
    public void setImage(final Image llllllllllllIlIlllIlIllllIIllIII) {
        this.image = llllllllllllIlIlllIlIllllIIllIII;
    }
}
