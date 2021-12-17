// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font.effects;

import java.awt.image.ImageObserver;
import java.awt.Image;
import org.newdawn.slick.font.Glyph;
import org.newdawn.slick.UnicodeFont;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.awt.image.BufferedImageOp;

public class FilterEffect implements Effect
{
    private /* synthetic */ BufferedImageOp filter;
    private static final /* synthetic */ int[] llllIlIlIlIII;
    
    static {
        lIlIlIlIIllllIl();
    }
    
    public BufferedImageOp getFilter() {
        return this.filter;
    }
    
    public void draw(final BufferedImage lllllllllllllIlIllIllIIlIIIIlIII, final Graphics2D lllllllllllllIlIllIllIIlIIIIIlll, final UnicodeFont lllllllllllllIlIllIllIIlIIIIIllI, final Glyph lllllllllllllIlIllIllIIlIIIIIlIl) {
        final BufferedImage lllllllllllllIlIllIllIIlIIIIIlII = EffectUtil.getScratchImage();
        this.filter.filter(lllllllllllllIlIllIllIIlIIIIlIII, lllllllllllllIlIllIllIIlIIIIIlII);
        "".length();
        lllllllllllllIlIllIllIIlIIIIlIII.getGraphics().drawImage(lllllllllllllIlIllIllIIlIIIIIlII, FilterEffect.llllIlIlIlIII[0], FilterEffect.llllIlIlIlIII[0], null);
        "".length();
    }
    
    public void setFilter(final BufferedImageOp lllllllllllllIlIllIllIIIlllllIlI) {
        this.filter = lllllllllllllIlIllIllIIIlllllIlI;
    }
    
    public FilterEffect() {
    }
    
    private static void lIlIlIlIIllllIl() {
        (llllIlIlIlIII = new int[1])[0] = ((0x1F ^ 0x40) & ~(0xE1 ^ 0xBE));
    }
    
    public FilterEffect(final BufferedImageOp lllllllllllllIlIllIllIIlIIIIllIl) {
        this.filter = lllllllllllllIlIllIllIIlIIIIllIl;
    }
}
