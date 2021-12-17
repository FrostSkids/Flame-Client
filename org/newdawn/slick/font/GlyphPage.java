// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.font;

import java.util.ListIterator;
import org.newdawn.slick.opengl.TextureImpl;
import java.awt.RenderingHints;
import java.nio.ByteOrder;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.awt.image.WritableRaster;
import java.util.Iterator;
import java.awt.Shape;
import org.newdawn.slick.font.effects.Effect;
import java.awt.Color;
import java.awt.Composite;
import java.awt.AlphaComposite;
import org.newdawn.slick.SlickException;
import java.util.ArrayList;
import org.newdawn.slick.UnicodeFont;
import java.nio.ByteBuffer;
import java.awt.image.BufferedImage;
import java.nio.IntBuffer;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.Image;
import java.util.List;
import java.awt.font.FontRenderContext;
import java.awt.Graphics2D;

public class GlyphPage
{
    private static final /* synthetic */ int[] llIllIlIIIllll;
    private static /* synthetic */ Graphics2D scratchGraphics;
    public static /* synthetic */ FontRenderContext renderContext;
    private final /* synthetic */ List pageGlyphs;
    private final /* synthetic */ int pageWidth;
    private /* synthetic */ boolean orderAscending;
    private final /* synthetic */ Image pageImage;
    private static final /* synthetic */ SGL GL;
    private /* synthetic */ int pageX;
    private static /* synthetic */ IntBuffer scratchIntBuffer;
    private static /* synthetic */ BufferedImage scratchImage;
    private /* synthetic */ int pageY;
    private static /* synthetic */ ByteBuffer scratchByteBuffer;
    private /* synthetic */ int rowHeight;
    private final /* synthetic */ UnicodeFont unicodeFont;
    private final /* synthetic */ int pageHeight;
    
    private static void lIIlIllllIlIllII() {
        (llIllIlIIIllll = new int[10])[0] = (0xA7 ^ 0x87);
        GlyphPage.llIllIlIIIllll[1] = -" ".length();
        GlyphPage.llIllIlIIIllll[2] = ((0xFA ^ 0xB0) & ~(0x26 ^ 0x6C));
        GlyphPage.llIllIlIIIllll[3] = (0xFFFFC352 & 0x3DAD);
        GlyphPage.llIllIlIIIllll[4] = " ".length();
        GlyphPage.llIllIlIIIllll[5] = (0xFFFFFFF5 & 0xDEB);
        GlyphPage.llIllIlIIIllll[6] = (0xFFFF8BF3 & 0xF4ED);
        GlyphPage.llIllIlIIIllll[7] = (0xFFFFB775 & 0x5C8B);
        GlyphPage.llIllIlIIIllll[8] = (-(0xFFFFFDCF & 0x73BF) & (0xFFFFF5BE & 0x47BCF));
        GlyphPage.llIllIlIIIllll[9] = "  ".length();
    }
    
    public GlyphPage(final UnicodeFont llllllllllllIllIIllIlllIlIIlllIl, final int llllllllllllIllIIllIlllIlIlIIIII, final int llllllllllllIllIIllIlllIlIIlllll) throws SlickException {
        this.pageGlyphs = new ArrayList(GlyphPage.llIllIlIIIllll[0]);
        this.unicodeFont = llllllllllllIllIIllIlllIlIIlllIl;
        this.pageWidth = llllllllllllIllIIllIlllIlIlIIIII;
        this.pageHeight = llllllllllllIllIIllIlllIlIIlllll;
        this.pageImage = new Image(llllllllllllIllIIllIlllIlIlIIIII, llllllllllllIllIIllIlllIlIIlllll);
    }
    
    private void renderGlyph(final Glyph llllllllllllIllIIllIlllIIllIIlll, final int llllllllllllIllIIllIlllIIllIllII, final int llllllllllllIllIIllIlllIIllIIlIl) throws SlickException {
        GlyphPage.scratchGraphics.setComposite(AlphaComposite.Clear);
        GlyphPage.scratchGraphics.fillRect(GlyphPage.llIllIlIIIllll[2], GlyphPage.llIllIlIIIllll[2], GlyphPage.llIllIlIIIllll[3], GlyphPage.llIllIlIIIllll[3]);
        GlyphPage.scratchGraphics.setComposite(AlphaComposite.SrcOver);
        GlyphPage.scratchGraphics.setColor(Color.white);
        final Iterator llllllllllllIllIIllIlllIIlllIIII = this.unicodeFont.getEffects().iterator();
        while (lIIlIllllIlIllIl(llllllllllllIllIIllIlllIIlllIIII.hasNext() ? 1 : 0)) {
            llllllllllllIllIIllIlllIIlllIIII.next().draw(GlyphPage.scratchImage, GlyphPage.scratchGraphics, this.unicodeFont, llllllllllllIllIIllIlllIIllIIlll);
            "".length();
            if (" ".length() > "   ".length()) {
                return;
            }
        }
        llllllllllllIllIIllIlllIIllIIlll.setShape(null);
        final WritableRaster llllllllllllIllIIllIlllIIllIlIlI = GlyphPage.scratchImage.getRaster();
        final int[] llllllllllllIllIIllIlllIIllIlIIl = new int[llllllllllllIllIIllIlllIIllIllII];
        int llllllllllllIllIIllIlllIIllIllll = GlyphPage.llIllIlIIIllll[2];
        while (lIIlIllllIllIIlI(llllllllllllIllIIllIlllIIllIllll, llllllllllllIllIIllIlllIIllIIlIl)) {
            llllllllllllIllIIllIlllIIllIlIlI.getDataElements(GlyphPage.llIllIlIIIllll[2], llllllllllllIllIIllIlllIIllIllll, llllllllllllIllIIllIlllIIllIllII, GlyphPage.llIllIlIIIllll[4], llllllllllllIllIIllIlllIIllIlIIl);
            "".length();
            GlyphPage.scratchIntBuffer.put(llllllllllllIllIIllIlllIIllIlIIl);
            "".length();
            ++llllllllllllIllIIllIlllIIllIllll;
            "".length();
            if ("   ".length() <= "  ".length()) {
                return;
            }
        }
        GlyphPage.GL.glTexSubImage2D(GlyphPage.llIllIlIIIllll[5], GlyphPage.llIllIlIIIllll[2], this.pageX, this.pageY, llllllllllllIllIIllIlllIIllIllII, llllllllllllIllIIllIlllIIllIIlIl, GlyphPage.llIllIlIIIllll[6], GlyphPage.llIllIlIIIllll[7], GlyphPage.scratchByteBuffer);
        GlyphPage.scratchIntBuffer.clear();
        "".length();
        llllllllllllIllIIllIlllIIllIIlll.setImage(this.pageImage.getSubImage(this.pageX, this.pageY, llllllllllllIllIIllIlllIIllIllII, llllllllllllIllIIllIlllIIllIIlIl));
    }
    
    private static boolean lIIlIllllIlIllll(final int llllllllllllIllIIllIlllIIlIIllII, final int llllllllllllIllIIllIlllIIlIIlIll) {
        return llllllllllllIllIIllIlllIIlIIllII >= llllllllllllIllIIllIlllIIlIIlIll;
    }
    
    private static boolean lIIlIllllIlIllIl(final int llllllllllllIllIIllIlllIIlIIIIIl) {
        return llllllllllllIllIIllIlllIIlIIIIIl != 0;
    }
    
    private static boolean lIIlIllllIllIIII(final int llllllllllllIllIIllIlllIIlIIIlII, final int llllllllllllIllIIllIlllIIlIIIIll) {
        return llllllllllllIllIIllIlllIIlIIIlII > llllllllllllIllIIllIlllIIlIIIIll;
    }
    
    private static boolean lIIlIllllIllIIIl(final int llllllllllllIllIIllIlllIIIllllll) {
        return llllllllllllIllIIllIlllIIIllllll == 0;
    }
    
    public List getGlyphs() {
        return this.pageGlyphs;
    }
    
    public Image getImage() {
        return this.pageImage;
    }
    
    static {
        lIIlIllllIlIllII();
        MAX_GLYPH_SIZE = GlyphPage.llIllIlIIIllll[3];
        GL = Renderer.get();
        (GlyphPage.scratchByteBuffer = ByteBuffer.allocateDirect(GlyphPage.llIllIlIIIllll[8])).order(ByteOrder.LITTLE_ENDIAN);
        "".length();
        GlyphPage.scratchIntBuffer = GlyphPage.scratchByteBuffer.asIntBuffer();
        GlyphPage.scratchImage = new BufferedImage(GlyphPage.llIllIlIIIllll[3], GlyphPage.llIllIlIIIllll[3], GlyphPage.llIllIlIIIllll[9]);
        (GlyphPage.scratchGraphics = (Graphics2D)GlyphPage.scratchImage.getGraphics()).setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GlyphPage.scratchGraphics.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
        GlyphPage.scratchGraphics.setRenderingHint(RenderingHints.KEY_FRACTIONALMETRICS, RenderingHints.VALUE_FRACTIONALMETRICS_ON);
        GlyphPage.renderContext = GlyphPage.scratchGraphics.getFontRenderContext();
    }
    
    public int loadGlyphs(final List llllllllllllIllIIllIlllIlIIIIlII, final int llllllllllllIllIIllIlllIIlllllll) throws SlickException {
        if (lIIlIllllIlIllIl(this.rowHeight) && lIIlIllllIlIlllI(llllllllllllIllIIllIlllIIlllllll, GlyphPage.llIllIlIIIllll[1])) {
            int llllllllllllIllIIllIlllIlIIIllII = this.pageX;
            int llllllllllllIllIIllIlllIlIIIlIll = this.pageY;
            int llllllllllllIllIIllIlllIlIIIlIlI = this.rowHeight;
            final Iterator llllllllllllIllIIllIlllIlIIIllIl = this.getIterator(llllllllllllIllIIllIlllIlIIIIlII);
            while (lIIlIllllIlIllIl(llllllllllllIllIIllIlllIlIIIllIl.hasNext() ? 1 : 0)) {
                final Glyph llllllllllllIllIIllIlllIlIIlIIII = llllllllllllIllIIllIlllIlIIIllIl.next();
                final int llllllllllllIllIIllIlllIlIIIllll = llllllllllllIllIIllIlllIlIIlIIII.getWidth();
                final int llllllllllllIllIIllIlllIlIIIlllI = llllllllllllIllIIllIlllIlIIlIIII.getHeight();
                if (lIIlIllllIlIllll(llllllllllllIllIIllIlllIlIIIllII + llllllllllllIllIIllIlllIlIIIllll, this.pageWidth)) {
                    llllllllllllIllIIllIlllIlIIIllII = GlyphPage.llIllIlIIIllll[2];
                    llllllllllllIllIIllIlllIlIIIlIll += llllllllllllIllIIllIlllIlIIIlIlI;
                    llllllllllllIllIIllIlllIlIIIlIlI = llllllllllllIllIIllIlllIlIIIlllI;
                    "".length();
                    if (((0x9E ^ 0x8E) & ~(0x35 ^ 0x25)) == (0xC5 ^ 0xC1)) {
                        return (0x7D ^ 0x5F) & ~(0x95 ^ 0xB7);
                    }
                }
                else if (lIIlIllllIllIIII(llllllllllllIllIIllIlllIlIIIlllI, llllllllllllIllIIllIlllIlIIIlIlI)) {
                    llllllllllllIllIIllIlllIlIIIlIlI = llllllllllllIllIIllIlllIlIIIlllI;
                }
                if (lIIlIllllIlIllll(llllllllllllIllIIllIlllIlIIIlIll + llllllllllllIllIIllIlllIlIIIlIlI, this.pageWidth)) {
                    return GlyphPage.llIllIlIIIllll[2];
                }
                llllllllllllIllIIllIlllIlIIIllII += llllllllllllIllIIllIlllIlIIIllll;
                "".length();
                if ("  ".length() == 0) {
                    return (0x3E ^ 0x73) & ~(0x75 ^ 0x38);
                }
            }
        }
        org.newdawn.slick.Color.white.bind();
        this.pageImage.bind();
        int llllllllllllIllIIllIlllIlIIIIIlI = GlyphPage.llIllIlIIIllll[2];
        final Iterator llllllllllllIllIIllIlllIlIIIIllI = this.getIterator(llllllllllllIllIIllIlllIlIIIIlII);
        while (lIIlIllllIlIllIl(llllllllllllIllIIllIlllIlIIIIllI.hasNext() ? 1 : 0)) {
            final Glyph llllllllllllIllIIllIlllIlIIIlIIl = llllllllllllIllIIllIlllIlIIIIllI.next();
            final int llllllllllllIllIIllIlllIlIIIlIII = Math.min(GlyphPage.llIllIlIIIllll[3], llllllllllllIllIIllIlllIlIIIlIIl.getWidth());
            final int llllllllllllIllIIllIlllIlIIIIlll = Math.min(GlyphPage.llIllIlIIIllll[3], llllllllllllIllIIllIlllIlIIIlIIl.getHeight());
            if (lIIlIllllIllIIIl(this.rowHeight)) {
                this.rowHeight = llllllllllllIllIIllIlllIlIIIIlll;
                "".length();
                if (" ".length() == 0) {
                    return (0x1B ^ 0x7B) & ~(0x0 ^ 0x60);
                }
            }
            else if (lIIlIllllIlIllll(this.pageX + llllllllllllIllIIllIlllIlIIIlIII, this.pageWidth)) {
                if (lIIlIllllIlIllll(this.pageY + this.rowHeight + llllllllllllIllIIllIlllIlIIIIlll, this.pageHeight)) {
                    "".length();
                    if (-" ".length() > 0) {
                        return (0x4 ^ 0xC) & ~(0xCA ^ 0xC2);
                    }
                    break;
                }
                else {
                    this.pageX = GlyphPage.llIllIlIIIllll[2];
                    this.pageY += this.rowHeight;
                    this.rowHeight = llllllllllllIllIIllIlllIlIIIIlll;
                    "".length();
                    if ((25 + 99 - 45 + 71 ^ 144 + 119 - 174 + 57) < (" ".length() & (" ".length() ^ -" ".length()))) {
                        return (0x30 ^ 0x13 ^ (0xA5 ^ 0xAB)) & (0x4B ^ 0x46 ^ (0x13 ^ 0x33) ^ -" ".length());
                    }
                }
            }
            else if (lIIlIllllIllIIII(llllllllllllIllIIllIlllIlIIIIlll, this.rowHeight)) {
                if (lIIlIllllIlIllll(this.pageY + llllllllllllIllIIllIlllIlIIIIlll, this.pageHeight)) {
                    "".length();
                    if ("  ".length() == 0) {
                        return (0xD3 ^ 0x86) & ~(0x19 ^ 0x4C);
                    }
                    break;
                }
                else {
                    this.rowHeight = llllllllllllIllIIllIlllIlIIIIlll;
                }
            }
            this.renderGlyph(llllllllllllIllIIllIlllIlIIIlIIl, llllllllllllIllIIllIlllIlIIIlIII, llllllllllllIllIIllIlllIlIIIIlll);
            this.pageGlyphs.add(llllllllllllIllIIllIlllIlIIIlIIl);
            "".length();
            this.pageX += llllllllllllIllIIllIlllIlIIIlIII;
            llllllllllllIllIIllIlllIlIIIIllI.remove();
            if (lIIlIllllIlIlllI(++llllllllllllIllIIllIlllIlIIIIIlI, llllllllllllIllIIllIlllIIlllllll)) {
                int orderAscending;
                if (lIIlIllllIllIIIl(this.orderAscending ? 1 : 0)) {
                    orderAscending = GlyphPage.llIllIlIIIllll[4];
                    "".length();
                    if (null != null) {
                        return (0x8E ^ 0x9A) & ~(0x35 ^ 0x21);
                    }
                }
                else {
                    orderAscending = GlyphPage.llIllIlIIIllll[2];
                }
                this.orderAscending = (orderAscending != 0);
                "".length();
                if (-(0x26 ^ 0x22) > 0) {
                    return (0x5F ^ 0x66) & ~(0x39 ^ 0x0);
                }
                break;
            }
            else {
                "".length();
                if (-"   ".length() >= 0) {
                    return (0x39 ^ 0x19 ^ (0x40 ^ 0x67)) & (126 + 127 - 124 + 46 ^ 121 + 45 - 88 + 90 ^ -" ".length());
                }
                continue;
            }
        }
        TextureImpl.bindNone();
        int orderAscending2;
        if (lIIlIllllIllIIIl(this.orderAscending ? 1 : 0)) {
            orderAscending2 = GlyphPage.llIllIlIIIllll[4];
            "".length();
            if (" ".length() == 0) {
                return (0xA9 ^ 0x85) & ~(0xA8 ^ 0x84);
            }
        }
        else {
            orderAscending2 = GlyphPage.llIllIlIIIllll[2];
        }
        this.orderAscending = (orderAscending2 != 0);
        return llllllllllllIllIIllIlllIlIIIIIlI;
    }
    
    private Iterator getIterator(final List llllllllllllIllIIllIlllIIlIlllIl) {
        if (lIIlIllllIlIllIl(this.orderAscending ? 1 : 0)) {
            return llllllllllllIllIIllIlllIIlIlllIl.iterator();
        }
        final ListIterator llllllllllllIllIIllIlllIIlIlllII = llllllllllllIllIIllIlllIIlIlllIl.listIterator(llllllllllllIllIIllIlllIIlIlllIl.size());
        return new Iterator() {
            public Object next() {
                return llllllllllllIllIIllIlllIIlIlllII.previous();
            }
            
            public boolean hasNext() {
                return llllllllllllIllIIllIlllIIlIlllII.hasPrevious();
            }
            
            public void remove() {
                llllllllllllIllIIllIlllIIlIlllII.remove();
            }
        };
    }
    
    public static Graphics2D getScratchGraphics() {
        return GlyphPage.scratchGraphics;
    }
    
    private static boolean lIIlIllllIlIlllI(final int llllllllllllIllIIllIlllIIlIlIIII, final int llllllllllllIllIIllIlllIIlIIllll) {
        return llllllllllllIllIIllIlllIIlIlIIII == llllllllllllIllIIllIlllIIlIIllll;
    }
    
    private static boolean lIIlIllllIllIIlI(final int llllllllllllIllIIllIlllIIlIIlIII, final int llllllllllllIllIIllIlllIIlIIIlll) {
        return llllllllllllIllIIllIlllIIlIIlIII < llllllllllllIllIIllIlllIIlIIIlll;
    }
}
