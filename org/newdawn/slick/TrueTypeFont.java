// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.awt.RenderingHints;
import org.newdawn.slick.opengl.GLUtils;
import java.util.HashMap;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.io.IOException;
import org.newdawn.slick.util.BufferedImageUtil;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.util.Map;
import java.awt.FontMetrics;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.renderer.SGL;

public class TrueTypeFont implements Font
{
    private static final /* synthetic */ SGL GL;
    private /* synthetic */ java.awt.Font font;
    private static final /* synthetic */ String[] lIlIlIlllIlIlI;
    private /* synthetic */ boolean antiAlias;
    private /* synthetic */ IntObject[] charArray;
    private /* synthetic */ int fontHeight;
    private /* synthetic */ Texture fontTexture;
    private /* synthetic */ FontMetrics fontMetrics;
    private /* synthetic */ Map customChars;
    private /* synthetic */ int textureHeight;
    private /* synthetic */ int fontSize;
    private /* synthetic */ int textureWidth;
    private static final /* synthetic */ int[] lIlIlIlllIlIll;
    
    private static boolean lllIlllllIIIIII(final int lllllllllllllIIIIllllIlllIllIlll, final int lllllllllllllIIIIllllIlllIllIllI) {
        return lllllllllllllIIIIllllIlllIllIlll < lllllllllllllIIIIllllIlllIllIllI;
    }
    
    private void createSet(final char[] lllllllllllllIIIIlllllIIlIllIIll) {
        if (lllIllllIlllllI(lllllllllllllIIIIlllllIIlIllIIll) && lllIllllIllllll(lllllllllllllIIIIlllllIIlIllIIll.length)) {
            this.textureWidth *= TrueTypeFont.lIlIlIlllIlIll[4];
        }
        try {
            final BufferedImage lllllllllllllIIIIlllllIIlIlllIll = new BufferedImage(this.textureWidth, this.textureHeight, TrueTypeFont.lIlIlIlllIlIll[4]);
            final Graphics2D lllllllllllllIIIIlllllIIlIlllIlI = (Graphics2D)lllllllllllllIIIIlllllIIlIlllIll.getGraphics();
            lllllllllllllIIIIlllllIIlIlllIlI.setColor(new Color(TrueTypeFont.lIlIlIlllIlIll[5], TrueTypeFont.lIlIlIlllIlIll[5], TrueTypeFont.lIlIlIlllIlIll[5], TrueTypeFont.lIlIlIlllIlIll[3]));
            lllllllllllllIIIIlllllIIlIlllIlI.fillRect(TrueTypeFont.lIlIlIlllIlIll[1], TrueTypeFont.lIlIlIlllIlIll[1], this.textureWidth, this.textureHeight);
            int lllllllllllllIIIIlllllIIlIlllIIl = TrueTypeFont.lIlIlIlllIlIll[1];
            int lllllllllllllIIIIlllllIIlIlllIII = TrueTypeFont.lIlIlIlllIlIll[1];
            int lllllllllllllIIIIlllllIIlIllIlll = TrueTypeFont.lIlIlIlllIlIll[1];
            int length;
            if (lllIllllIlllllI(lllllllllllllIIIIlllllIIlIllIIll)) {
                length = lllllllllllllIIIIlllllIIlIllIIll.length;
                "".length();
                if (" ".length() == "   ".length()) {
                    return;
                }
            }
            else {
                length = TrueTypeFont.lIlIlIlllIlIll[1];
            }
            final int lllllllllllllIIIIlllllIIlIllIllI = length;
            int lllllllllllllIIIIlllllIIlIllllII = TrueTypeFont.lIlIlIlllIlIll[1];
            while (lllIlllllIIIIII(lllllllllllllIIIIlllllIIlIllllII, TrueTypeFont.lIlIlIlllIlIll[0] + lllllllllllllIIIIlllllIIlIllIllI)) {
                char c;
                if (lllIlllllIIIIII(lllllllllllllIIIIlllllIIlIllllII, TrueTypeFont.lIlIlIlllIlIll[0])) {
                    c = (char)lllllllllllllIIIIlllllIIlIllllII;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    c = lllllllllllllIIIIlllllIIlIllIIll[lllllllllllllIIIIlllllIIlIllllII - TrueTypeFont.lIlIlIlllIlIll[0]];
                }
                final char lllllllllllllIIIIlllllIIlIllllll = c;
                BufferedImage lllllllllllllIIIIlllllIIlIlllllI = this.getFontImage(lllllllllllllIIIIlllllIIlIllllll);
                final IntObject lllllllllllllIIIIlllllIIlIllllIl = new IntObject();
                lllllllllllllIIIIlllllIIlIllllIl.width = lllllllllllllIIIIlllllIIlIlllllI.getWidth();
                lllllllllllllIIIIlllllIIlIllllIl.height = lllllllllllllIIIIlllllIIlIlllllI.getHeight();
                if (lllIlllllIIIIIl(lllllllllllllIIIIlllllIIlIlllIII + lllllllllllllIIIIlllllIIlIllllIl.width, this.textureWidth)) {
                    lllllllllllllIIIIlllllIIlIlllIII = TrueTypeFont.lIlIlIlllIlIll[1];
                    lllllllllllllIIIIlllllIIlIllIlll += lllllllllllllIIIIlllllIIlIlllIIl;
                    lllllllllllllIIIIlllllIIlIlllIIl = TrueTypeFont.lIlIlIlllIlIll[1];
                }
                lllllllllllllIIIIlllllIIlIllllIl.storedX = lllllllllllllIIIIlllllIIlIlllIII;
                lllllllllllllIIIIlllllIIlIllllIl.storedY = lllllllllllllIIIIlllllIIlIllIlll;
                if (lllIlllllIIIIlI(lllllllllllllIIIIlllllIIlIllllIl.height, this.fontHeight)) {
                    this.fontHeight = lllllllllllllIIIIlllllIIlIllllIl.height;
                }
                if (lllIlllllIIIIlI(lllllllllllllIIIIlllllIIlIllllIl.height, lllllllllllllIIIIlllllIIlIlllIIl)) {
                    lllllllllllllIIIIlllllIIlIlllIIl = lllllllllllllIIIIlllllIIlIllllIl.height;
                }
                lllllllllllllIIIIlllllIIlIlllIlI.drawImage(lllllllllllllIIIIlllllIIlIlllllI, lllllllllllllIIIIlllllIIlIlllIII, lllllllllllllIIIIlllllIIlIllIlll, null);
                "".length();
                lllllllllllllIIIIlllllIIlIlllIII += lllllllllllllIIIIlllllIIlIllllIl.width;
                if (lllIlllllIIIIII(lllllllllllllIIIIlllllIIlIllllII, TrueTypeFont.lIlIlIlllIlIll[0])) {
                    this.charArray[lllllllllllllIIIIlllllIIlIllllII] = lllllllllllllIIIIlllllIIlIllllIl;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                else {
                    this.customChars.put(new Character(lllllllllllllIIIIlllllIIlIllllll), lllllllllllllIIIIlllllIIlIllllIl);
                    "".length();
                }
                lllllllllllllIIIIlllllIIlIlllllI = null;
                ++lllllllllllllIIIIlllllIIlIllllII;
                "".length();
                if (-" ".length() != -" ".length()) {
                    return;
                }
            }
            this.fontTexture = BufferedImageUtil.getTexture(this.font.toString(), lllllllllllllIIIIlllllIIlIlllIll);
            "".length();
            if ("  ".length() == 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIIIIlllllIIlIllIlIl) {
            System.err.println(TrueTypeFont.lIlIlIlllIlIlI[TrueTypeFont.lIlIlIlllIlIll[1]]);
            lllllllllllllIIIIlllllIIlIllIlIl.printStackTrace();
        }
    }
    
    public int getWidth(final String lllllllllllllIIIIlllllIIIllIIllI) {
        int lllllllllllllIIIIlllllIIIllIlIlI = TrueTypeFont.lIlIlIlllIlIll[1];
        IntObject lllllllllllllIIIIlllllIIIllIlIIl = null;
        int lllllllllllllIIIIlllllIIIllIlIII = TrueTypeFont.lIlIlIlllIlIll[1];
        int lllllllllllllIIIIlllllIIIllIllIl = TrueTypeFont.lIlIlIlllIlIll[1];
        while (lllIlllllIIIIII(lllllllllllllIIIIlllllIIIllIllIl, lllllllllllllIIIIlllllIIIllIIllI.length())) {
            lllllllllllllIIIIlllllIIIllIlIII = lllllllllllllIIIIlllllIIIllIIllI.charAt(lllllllllllllIIIIlllllIIIllIllIl);
            if (lllIlllllIIIIII(lllllllllllllIIIIlllllIIIllIlIII, TrueTypeFont.lIlIlIlllIlIll[0])) {
                lllllllllllllIIIIlllllIIIllIlIIl = this.charArray[lllllllllllllIIIIlllllIIIllIlIII];
                "".length();
                if ("   ".length() != "   ".length()) {
                    return (0x21 ^ 0x65) & ~(0x45 ^ 0x1);
                }
            }
            else {
                lllllllllllllIIIIlllllIIIllIlIIl = this.customChars.get(new Character((char)lllllllllllllIIIIlllllIIIllIlIII));
            }
            if (lllIllllIlllllI(lllllllllllllIIIIlllllIIIllIlIIl)) {
                lllllllllllllIIIIlllllIIIllIlIlI += lllllllllllllIIIIlllllIIIllIlIIl.width;
            }
            ++lllllllllllllIIIIlllllIIIllIllIl;
            "".length();
            if (null != null) {
                return (173 + 81 - 39 + 10 ^ 74 + 25 - 28 + 118) & (0x4 ^ 0x3F ^ (0x5C ^ 0x3B) ^ -" ".length());
            }
        }
        return lllllllllllllIIIIlllllIIIllIlIlI;
    }
    
    private static boolean lllIllllIllllll(final int lllllllllllllIIIIllllIlllIlIlIII) {
        return lllllllllllllIIIIllllIlllIlIlIII > 0;
    }
    
    private void drawQuad(final float lllllllllllllIIIIlllllIIlIIlIlII, final float lllllllllllllIIIIlllllIIlIIIIIlI, final float lllllllllllllIIIIlllllIIlIIIIIIl, final float lllllllllllllIIIIlllllIIlIIlIIIl, final float lllllllllllllIIIIlllllIIlIIlIIII, final float lllllllllllllIIIIlllllIIIllllllI, final float lllllllllllllIIIIlllllIIlIIIlllI, final float lllllllllllllIIIIlllllIIlIIIllIl) {
        final float lllllllllllllIIIIlllllIIlIIIllII = lllllllllllllIIIIlllllIIlIIIIIIl - lllllllllllllIIIIlllllIIlIIlIlII;
        final float lllllllllllllIIIIlllllIIlIIIlIll = lllllllllllllIIIIlllllIIlIIlIIIl - lllllllllllllIIIIlllllIIlIIIIIlI;
        final float lllllllllllllIIIIlllllIIlIIIlIlI = lllllllllllllIIIIlllllIIlIIlIIII / this.textureWidth;
        final float lllllllllllllIIIIlllllIIlIIIlIIl = lllllllllllllIIIIlllllIIIllllllI / this.textureHeight;
        final float lllllllllllllIIIIlllllIIlIIIlIII = lllllllllllllIIIIlllllIIlIIIlllI - lllllllllllllIIIIlllllIIlIIlIIII;
        final float lllllllllllllIIIIlllllIIlIIIIlll = lllllllllllllIIIIlllllIIlIIIllIl - lllllllllllllIIIIlllllIIIllllllI;
        final float lllllllllllllIIIIlllllIIlIIIIllI = lllllllllllllIIIIlllllIIlIIIlIII / this.textureWidth;
        final float lllllllllllllIIIIlllllIIlIIIIlIl = lllllllllllllIIIIlllllIIlIIIIlll / this.textureHeight;
        TrueTypeFont.GL.glTexCoord2f(lllllllllllllIIIIlllllIIlIIIlIlI, lllllllllllllIIIIlllllIIlIIIlIIl);
        TrueTypeFont.GL.glVertex2f(lllllllllllllIIIIlllllIIlIIlIlII, lllllllllllllIIIIlllllIIlIIIIIlI);
        TrueTypeFont.GL.glTexCoord2f(lllllllllllllIIIIlllllIIlIIIlIlI, lllllllllllllIIIIlllllIIlIIIlIIl + lllllllllllllIIIIlllllIIlIIIIlIl);
        TrueTypeFont.GL.glVertex2f(lllllllllllllIIIIlllllIIlIIlIlII, lllllllllllllIIIIlllllIIlIIIIIlI + lllllllllllllIIIIlllllIIlIIIlIll);
        TrueTypeFont.GL.glTexCoord2f(lllllllllllllIIIIlllllIIlIIIlIlI + lllllllllllllIIIIlllllIIlIIIIllI, lllllllllllllIIIIlllllIIlIIIlIIl + lllllllllllllIIIIlllllIIlIIIIlIl);
        TrueTypeFont.GL.glVertex2f(lllllllllllllIIIIlllllIIlIIlIlII + lllllllllllllIIIIlllllIIlIIIllII, lllllllllllllIIIIlllllIIlIIIIIlI + lllllllllllllIIIIlllllIIlIIIlIll);
        TrueTypeFont.GL.glTexCoord2f(lllllllllllllIIIIlllllIIlIIIlIlI + lllllllllllllIIIIlllllIIlIIIIllI, lllllllllllllIIIIlllllIIlIIIlIIl);
        TrueTypeFont.GL.glVertex2f(lllllllllllllIIIIlllllIIlIIlIlII + lllllllllllllIIIIlllllIIlIIIllII, lllllllllllllIIIIlllllIIlIIIIIlI);
    }
    
    private static boolean lllIllllIllllII(final int lllllllllllllIIIIllllIllllIIIlII, final int lllllllllllllIIIIllllIllllIIIIll) {
        return lllllllllllllIIIIllllIllllIIIlII == lllllllllllllIIIIllllIllllIIIIll;
    }
    
    private static boolean lllIlllllIIIIIl(final int lllllllllllllIIIIllllIlllIllllIl, final int lllllllllllllIIIIllllIlllIllllII) {
        return lllllllllllllIIIIllllIlllIllllIl >= lllllllllllllIIIIllllIlllIllllII;
    }
    
    private static boolean lllIlllllIIIIll(final int lllllllllllllIIIIllllIlllIllIIll, final int lllllllllllllIIIIllllIlllIllIIlI) {
        return lllllllllllllIIIIllllIlllIllIIll <= lllllllllllllIIIIllllIlllIllIIlI;
    }
    
    static {
        lllIllllIlllIll();
        lllIllllIlllIlI();
        GL = Renderer.get();
    }
    
    public TrueTypeFont(final java.awt.Font lllllllllllllIIIIlllllIIllllIlIl, final boolean lllllllllllllIIIIlllllIIllllIlII, final char[] lllllllllllllIIIIlllllIIllllIIll) {
        this.charArray = new IntObject[TrueTypeFont.lIlIlIlllIlIll[0]];
        this.customChars = new HashMap();
        this.fontSize = TrueTypeFont.lIlIlIlllIlIll[1];
        this.fontHeight = TrueTypeFont.lIlIlIlllIlIll[1];
        this.textureWidth = TrueTypeFont.lIlIlIlllIlIll[2];
        this.textureHeight = TrueTypeFont.lIlIlIlllIlIll[2];
        GLUtils.checkGLContext();
        this.font = lllllllllllllIIIIlllllIIllllIlIl;
        this.fontSize = lllllllllllllIIIIlllllIIllllIlIl.getSize();
        this.antiAlias = lllllllllllllIIIIlllllIIllllIlII;
        this.createSet(lllllllllllllIIIIlllllIIllllIIll);
    }
    
    private BufferedImage getFontImage(final char lllllllllllllIIIIlllllIIllIlIlII) {
        final BufferedImage lllllllllllllIIIIlllllIIllIlllIl = new BufferedImage(TrueTypeFont.lIlIlIlllIlIll[3], TrueTypeFont.lIlIlIlllIlIll[3], TrueTypeFont.lIlIlIlllIlIll[4]);
        final Graphics2D lllllllllllllIIIIlllllIIllIlllII = (Graphics2D)lllllllllllllIIIIlllllIIllIlllIl.getGraphics();
        if (lllIllllIllllII(this.antiAlias ? 1 : 0, TrueTypeFont.lIlIlIlllIlIll[3])) {
            lllllllllllllIIIIlllllIIllIlllII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        lllllllllllllIIIIlllllIIllIlllII.setFont(this.font);
        this.fontMetrics = lllllllllllllIIIIlllllIIllIlllII.getFontMetrics();
        int lllllllllllllIIIIlllllIIllIllIll = this.fontMetrics.charWidth(lllllllllllllIIIIlllllIIllIlIlII);
        if (lllIllllIllllIl(lllllllllllllIIIIlllllIIllIllIll)) {
            lllllllllllllIIIIlllllIIllIllIll = TrueTypeFont.lIlIlIlllIlIll[3];
        }
        int lllllllllllllIIIIlllllIIllIllIlI = this.fontMetrics.getHeight();
        if (lllIllllIllllIl(lllllllllllllIIIIlllllIIllIllIlI)) {
            lllllllllllllIIIIlllllIIllIllIlI = this.fontSize;
        }
        final BufferedImage lllllllllllllIIIIlllllIIllIllIIl = new BufferedImage(lllllllllllllIIIIlllllIIllIllIll, lllllllllllllIIIIlllllIIllIllIlI, TrueTypeFont.lIlIlIlllIlIll[4]);
        final Graphics2D lllllllllllllIIIIlllllIIllIllIII = (Graphics2D)lllllllllllllIIIIlllllIIllIllIIl.getGraphics();
        if (lllIllllIllllII(this.antiAlias ? 1 : 0, TrueTypeFont.lIlIlIlllIlIll[3])) {
            lllllllllllllIIIIlllllIIllIllIII.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        }
        lllllllllllllIIIIlllllIIllIllIII.setFont(this.font);
        lllllllllllllIIIIlllllIIllIllIII.setColor(Color.WHITE);
        final int lllllllllllllIIIIlllllIIllIlIlll = TrueTypeFont.lIlIlIlllIlIll[1];
        final int lllllllllllllIIIIlllllIIllIlIllI = TrueTypeFont.lIlIlIlllIlIll[1];
        lllllllllllllIIIIlllllIIllIllIII.drawString(String.valueOf(lllllllllllllIIIIlllllIIllIlIlII), lllllllllllllIIIIlllllIIllIlIlll, lllllllllllllIIIIlllllIIllIlIllI + this.fontMetrics.getAscent());
        return lllllllllllllIIIIlllllIIllIllIIl;
    }
    
    public TrueTypeFont(final java.awt.Font lllllllllllllIIIIlllllIIlllIlIll, final boolean lllllllllllllIIIIlllllIIlllIlIlI) {
        this(lllllllllllllIIIIlllllIIlllIlIll, lllllllllllllIIIIlllllIIlllIlIlI, null);
    }
    
    public void drawString(final float lllllllllllllIIIIlllllIIIlIIlIlI, final float lllllllllllllIIIIlllllIIIlIIllll, final String lllllllllllllIIIIlllllIIIlIIllIl, final org.newdawn.slick.Color lllllllllllllIIIIlllllIIIlIIIllI) {
        this.drawString(lllllllllllllIIIIlllllIIIlIIlIlI, lllllllllllllIIIIlllllIIIlIIllll, lllllllllllllIIIIlllllIIIlIIllIl, lllllllllllllIIIIlllllIIIlIIIllI, TrueTypeFont.lIlIlIlllIlIll[1], lllllllllllllIIIIlllllIIIlIIllIl.length() - TrueTypeFont.lIlIlIlllIlIll[3]);
    }
    
    public void drawString(final float lllllllllllllIIIIlllllIIIIIllIlI, final float lllllllllllllIIIIlllllIIIIlIIllI, final String lllllllllllllIIIIlllllIIIIIllIII, final org.newdawn.slick.Color lllllllllllllIIIIlllllIIIIIlIlll, final int lllllllllllllIIIIlllllIIIIIlIllI, final int lllllllllllllIIIIlllllIIIIIlIlII) {
        lllllllllllllIIIIlllllIIIIIlIlll.bind();
        this.fontTexture.bind();
        IntObject lllllllllllllIIIIlllllIIIIIllllI = null;
        TrueTypeFont.GL.glBegin(TrueTypeFont.lIlIlIlllIlIll[6]);
        int lllllllllllllIIIIlllllIIIIIlllII = TrueTypeFont.lIlIlIlllIlIll[1];
        int lllllllllllllIIIIlllllIIIIlIllII = TrueTypeFont.lIlIlIlllIlIll[1];
        while (lllIlllllIIIIII(lllllllllllllIIIIlllllIIIIlIllII, lllllllllllllIIIIlllllIIIIIllIII.length())) {
            final int lllllllllllllIIIIlllllIIIIlIllIl = lllllllllllllIIIIlllllIIIIIllIII.charAt(lllllllllllllIIIIlllllIIIIlIllII);
            if (lllIlllllIIIIII(lllllllllllllIIIIlllllIIIIlIllIl, TrueTypeFont.lIlIlIlllIlIll[0])) {
                lllllllllllllIIIIlllllIIIIIllllI = this.charArray[lllllllllllllIIIIlllllIIIIlIllIl];
                "".length();
                if ("   ".length() <= 0) {
                    return;
                }
            }
            else {
                lllllllllllllIIIIlllllIIIIIllllI = this.customChars.get(new Character((char)lllllllllllllIIIIlllllIIIIlIllIl));
            }
            if (lllIllllIlllllI(lllllllllllllIIIIlllllIIIIIllllI)) {
                if (!lllIlllllIIIIII(lllllllllllllIIIIlllllIIIIlIllII, lllllllllllllIIIIlllllIIIIIlIllI) || lllIlllllIIIIll(lllllllllllllIIIIlllllIIIIlIllII, lllllllllllllIIIIlllllIIIIIlIlII)) {
                    this.drawQuad(lllllllllllllIIIIlllllIIIIIllIlI + lllllllllllllIIIIlllllIIIIIlllII, lllllllllllllIIIIlllllIIIIlIIllI, lllllllllllllIIIIlllllIIIIIllIlI + lllllllllllllIIIIlllllIIIIIlllII + lllllllllllllIIIIlllllIIIIIllllI.width, lllllllllllllIIIIlllllIIIIlIIllI + lllllllllllllIIIIlllllIIIIIllllI.height, (float)lllllllllllllIIIIlllllIIIIIllllI.storedX, (float)lllllllllllllIIIIlllllIIIIIllllI.storedY, (float)(lllllllllllllIIIIlllllIIIIIllllI.storedX + lllllllllllllIIIIlllllIIIIIllllI.width), (float)(lllllllllllllIIIIlllllIIIIIllllI.storedY + lllllllllllllIIIIlllllIIIIIllllI.height));
                }
                lllllllllllllIIIIlllllIIIIIlllII += lllllllllllllIIIIlllllIIIIIllllI.width;
            }
            ++lllllllllllllIIIIlllllIIIIlIllII;
            "".length();
            if ("   ".length() < "   ".length()) {
                return;
            }
        }
        TrueTypeFont.GL.glEnd();
    }
    
    public int getLineHeight() {
        return this.fontHeight;
    }
    
    private static String lllIllllIlllIIl(String lllllllllllllIIIIllllIllllIllIlI, final String lllllllllllllIIIIllllIlllllIIIIl) {
        lllllllllllllIIIIllllIllllIllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIllllIllllIllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIllllIlllllIIIII = new StringBuilder();
        final char[] lllllllllllllIIIIllllIllllIllllI = lllllllllllllIIIIllllIlllllIIIIl.toCharArray();
        int lllllllllllllIIIIllllIllllIlllII = TrueTypeFont.lIlIlIlllIlIll[1];
        final char lllllllllllllIIIIllllIllllIlIIII = (Object)lllllllllllllIIIIllllIllllIllIlI.toCharArray();
        final boolean lllllllllllllIIIIllllIllllIIlllI = lllllllllllllIIIIllllIllllIlIIII.length != 0;
        Exception lllllllllllllIIIIllllIllllIIllII = (Exception)TrueTypeFont.lIlIlIlllIlIll[1];
        while (lllIlllllIIIIII((int)lllllllllllllIIIIllllIllllIIllII, lllllllllllllIIIIllllIllllIIlllI ? 1 : 0)) {
            final char lllllllllllllIIIIllllIlllllIIIll = lllllllllllllIIIIllllIllllIlIIII[lllllllllllllIIIIllllIllllIIllII];
            lllllllllllllIIIIllllIlllllIIIII.append((char)(lllllllllllllIIIIllllIlllllIIIll ^ lllllllllllllIIIIllllIllllIllllI[lllllllllllllIIIIllllIllllIlllII % lllllllllllllIIIIllllIllllIllllI.length]));
            "".length();
            ++lllllllllllllIIIIllllIllllIlllII;
            ++lllllllllllllIIIIllllIllllIIllII;
            "".length();
            if (-" ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIllllIlllllIIIII);
    }
    
    private static boolean lllIllllIlllllI(final Object lllllllllllllIIIIllllIlllIlIllII) {
        return lllllllllllllIIIIllllIlllIlIllII != null;
    }
    
    public int getHeight() {
        return this.fontHeight;
    }
    
    private static boolean lllIlllllIIIIlI(final int lllllllllllllIIIIllllIlllIlIllll, final int lllllllllllllIIIIllllIlllIlIlllI) {
        return lllllllllllllIIIIllllIlllIlIllll > lllllllllllllIIIIllllIlllIlIlllI;
    }
    
    private static boolean lllIllllIllllIl(final int lllllllllllllIIIIllllIlllIlIlIlI) {
        return lllllllllllllIIIIllllIlllIlIlIlI <= 0;
    }
    
    public int getHeight(final String lllllllllllllIIIIlllllIIIlIlllII) {
        return this.fontHeight;
    }
    
    private static void lllIllllIlllIll() {
        (lIlIlIlllIlIll = new int[7])[0] = (-(0xFFFFFECF & 0x79BB) & (0xFFFFFF8B & 0x79FE));
        TrueTypeFont.lIlIlIlllIlIll[1] = ((0x8C ^ 0xC3 ^ (0x24 ^ 0x51)) & (0xDC ^ 0x94 ^ (0xF2 ^ 0x80) ^ -" ".length()));
        TrueTypeFont.lIlIlIlllIlIll[2] = (0xFFFFF69B & 0xB64);
        TrueTypeFont.lIlIlIlllIlIll[3] = " ".length();
        TrueTypeFont.lIlIlIlllIlIll[4] = "  ".length();
        TrueTypeFont.lIlIlIlllIlIll[5] = 35 + 178 + 3 + 7 + (0x3D ^ 0x51) - (0xFFFFC1B9 & 0x3F5E) + (160 + 163 - 162 + 43);
        TrueTypeFont.lIlIlIlllIlIll[6] = (0x6F ^ 0x1F ^ (0xFA ^ 0x8D));
    }
    
    private static void lllIllllIlllIlI() {
        (lIlIlIlllIlIlI = new String[TrueTypeFont.lIlIlIlllIlIll[3]])[TrueTypeFont.lIlIlIlllIlIll[1]] = lllIllllIlllIIl("DA8jOgEuTj45RCkcLzcQL04sOQo+QA==", "JnJVd");
    }
    
    public void drawString(final float lllllllllllllIIIIllllIllllllllIl, final float lllllllllllllIIIIllllIlllllllIll, final String lllllllllllllIIIIllllIlllllllIlI) {
        this.drawString(lllllllllllllIIIIllllIllllllllIl, lllllllllllllIIIIllllIlllllllIll, lllllllllllllIIIIllllIlllllllIlI, org.newdawn.slick.Color.white);
    }
    
    private class IntObject
    {
        public /* synthetic */ int width;
        public /* synthetic */ int storedY;
        public /* synthetic */ int height;
        public /* synthetic */ int storedX;
    }
}
