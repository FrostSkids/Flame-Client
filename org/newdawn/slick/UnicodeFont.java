// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.IOException;
import java.awt.FontFormatException;
import org.newdawn.slick.util.ResourceLoader;
import java.awt.font.FontRenderContext;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.opengl.TextureImpl;
import java.util.Collection;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.awt.FontMetrics;
import java.text.AttributedCharacterIterator;
import java.awt.font.TextAttribute;
import java.util.Map;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collections;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.font.HieroSettings;
import org.newdawn.slick.opengl.renderer.Renderer;
import java.awt.Rectangle;
import java.awt.font.GlyphVector;
import org.newdawn.slick.font.GlyphPage;
import org.newdawn.slick.opengl.renderer.SGL;
import org.newdawn.slick.font.Glyph;
import java.util.LinkedHashMap;
import java.util.Comparator;
import java.util.List;

public class UnicodeFont implements Font
{
    private /* synthetic */ String ttfFileRef;
    private /* synthetic */ java.awt.Font font;
    private /* synthetic */ int glyphPageHeight;
    private final /* synthetic */ List queuedGlyphs;
    private /* synthetic */ int paddingLeft;
    private static final /* synthetic */ Comparator heightComparator;
    private final /* synthetic */ List effects;
    private /* synthetic */ int ascent;
    private /* synthetic */ int glyphPageWidth;
    private /* synthetic */ int eldestDisplayListID;
    private static final /* synthetic */ int[] lIlIIlIIllllII;
    private /* synthetic */ int paddingRight;
    private /* synthetic */ int leading;
    private /* synthetic */ int paddingTop;
    private static final /* synthetic */ String[] lIlIIlIIlllIlI;
    private final /* synthetic */ LinkedHashMap displayLists;
    private /* synthetic */ int descent;
    private final /* synthetic */ List glyphPages;
    private static final /* synthetic */ DisplayList EMPTY_DISPLAY_LIST;
    private /* synthetic */ int baseDisplayListID;
    private /* synthetic */ Glyph missingGlyph;
    private /* synthetic */ boolean displayListCaching;
    private /* synthetic */ int paddingAdvanceX;
    private static final /* synthetic */ SGL GL;
    private final /* synthetic */ Glyph[][] glyphs;
    private /* synthetic */ int spaceWidth;
    private /* synthetic */ int paddingAdvanceY;
    private /* synthetic */ int paddingBottom;
    
    public int getHeight(final String lllllllllllllIIIllIllllIIlIIIllI) {
        if (lllIIlIlllIlIII(lllllllllllllIIIllIllllIIlIIIllI)) {
            throw new IllegalArgumentException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[18]]);
        }
        if (lllIIlIlllIllIl(lllllllllllllIIIllIllllIIlIIIllI.length())) {
            return UnicodeFont.lIlIIlIIllllII[0];
        }
        if (lllIIlIlllIIllI(this.displayListCaching ? 1 : 0)) {
            final DisplayList lllllllllllllIIIllIllllIIlIIllIl = this.displayLists.get(lllllllllllllIIIllIllllIIlIIIllI);
            if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIIlIIllIl)) {
                return lllllllllllllIIIllIllllIIlIIllIl.height;
            }
        }
        final char[] lllllllllllllIIIllIllllIIlIIIlIl = lllllllllllllIIIllIllllIIlIIIllI.toCharArray();
        final GlyphVector lllllllllllllIIIllIllllIIlIIIlII = this.font.layoutGlyphVector(GlyphPage.renderContext, lllllllllllllIIIllIllllIIlIIIlIl, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllIIlIIIlIl.length, UnicodeFont.lIlIIlIIllllII[0]);
        int lllllllllllllIIIllIllllIIlIIIIll = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIIlIIIIlI = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIIlIIlIIl = UnicodeFont.lIlIIlIIllllII[0];
        final int lllllllllllllIIIllIllllIIlIIlIII = lllllllllllllIIIllIllllIIlIIIlII.getNumGlyphs();
        while (lllIIlIlllIlIIl(lllllllllllllIIIllIllllIIlIIlIIl, lllllllllllllIIIllIllllIIlIIlIII)) {
            final int lllllllllllllIIIllIllllIIlIIllII = lllllllllllllIIIllIllllIIlIIIlII.getGlyphCharIndex(lllllllllllllIIIllIllllIIlIIlIIl);
            final int lllllllllllllIIIllIllllIIlIIlIll = lllllllllllllIIIllIllllIIlIIIllI.codePointAt(lllllllllllllIIIllIllllIIlIIllII);
            if (lllIIlIlllIlIlI(lllllllllllllIIIllIllllIIlIIlIll, UnicodeFont.lIlIIlIIllllII[11])) {
                "".length();
                if (null != null) {
                    return (0x72 ^ 0x63) & ~(0x6E ^ 0x7F);
                }
            }
            else {
                final Rectangle lllllllllllllIIIllIllllIIlIIlIlI = this.getGlyphBounds(lllllllllllllIIIllIllllIIlIIIlII, lllllllllllllIIIllIllllIIlIIlIIl, lllllllllllllIIIllIllllIIlIIlIll);
                lllllllllllllIIIllIllllIIlIIIIlI = Math.max(lllllllllllllIIIllIllllIIlIIIIlI, this.ascent + lllllllllllllIIIllIllllIIlIIlIlI.y + lllllllllllllIIIllIllllIIlIIlIlI.height);
                if (lllIIlIlllIlIlI(lllllllllllllIIIllIllllIIlIIlIll, UnicodeFont.lIlIIlIIllllII[18])) {
                    ++lllllllllllllIIIllIllllIIlIIIIll;
                    lllllllllllllIIIllIllllIIlIIIIlI = UnicodeFont.lIlIIlIIllllII[0];
                }
            }
            ++lllllllllllllIIIllIllllIIlIIlIIl;
            "".length();
            if (-" ".length() > "   ".length()) {
                return (0x5A ^ 0x39) & ~(0x42 ^ 0x21);
            }
        }
        return lllllllllllllIIIllIllllIIlIIIIll * this.getLineHeight() + lllllllllllllIIIllIllllIIlIIIIlI;
    }
    
    private static boolean lllIIlIlllIllll(final int lllllllllllllIIIllIlllIlIllIIlII, final int lllllllllllllIIIllIlllIlIllIIIll) {
        return lllllllllllllIIIllIlllIlIllIIlII > lllllllllllllIIIllIlllIlIllIIIll;
    }
    
    public int getWidth(final String lllllllllllllIIIllIllllIIllIlIlI) {
        if (lllIIlIlllIlIII(lllllllllllllIIIllIllllIIllIlIlI)) {
            throw new IllegalArgumentException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[21]]);
        }
        if (lllIIlIlllIllIl(lllllllllllllIIIllIllllIIllIlIlI.length())) {
            return UnicodeFont.lIlIIlIIllllII[0];
        }
        if (lllIIlIlllIIllI(this.displayListCaching ? 1 : 0)) {
            final DisplayList lllllllllllllIIIllIllllIIlllIIIl = this.displayLists.get(lllllllllllllIIIllIllllIIllIlIlI);
            if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIIlllIIIl)) {
                return lllllllllllllIIIllIllllIIlllIIIl.width;
            }
        }
        final char[] lllllllllllllIIIllIllllIIllIlIIl = lllllllllllllIIIllIllllIIllIlIlI.toCharArray();
        final GlyphVector lllllllllllllIIIllIllllIIllIlIII = this.font.layoutGlyphVector(GlyphPage.renderContext, lllllllllllllIIIllIllllIIllIlIIl, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllIIllIlIIl.length, UnicodeFont.lIlIIlIIllllII[0]);
        int lllllllllllllIIIllIllllIIllIIlll = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIIllIIllI = UnicodeFont.lIlIIlIIllllII[0];
        boolean lllllllllllllIIIllIllllIIllIIlIl = UnicodeFont.lIlIIlIIllllII[0] != 0;
        int lllllllllllllIIIllIllllIIllIllIl = UnicodeFont.lIlIIlIIllllII[0];
        final int lllllllllllllIIIllIllllIIllIllII = lllllllllllllIIIllIllllIIllIlIII.getNumGlyphs();
        while (lllIIlIlllIlIIl(lllllllllllllIIIllIllllIIllIllIl, lllllllllllllIIIllIllllIIllIllII)) {
            final int lllllllllllllIIIllIllllIIlllIIII = lllllllllllllIIIllIllllIIllIlIII.getGlyphCharIndex(lllllllllllllIIIllIllllIIllIllIl);
            final int lllllllllllllIIIllIllllIIllIllll = lllllllllllllIIIllIllllIIllIlIlI.codePointAt(lllllllllllllIIIllIllllIIlllIIII);
            final Rectangle lllllllllllllIIIllIllllIIllIlllI = this.getGlyphBounds(lllllllllllllIIIllIllllIIllIlIII, lllllllllllllIIIllIllllIIllIllIl, lllllllllllllIIIllIllllIIllIllll);
            if (lllIIlIlllIIllI(lllllllllllllIIIllIllllIIllIIlIl ? 1 : 0) && lllIIlIlllIlllI(lllllllllllllIIIllIllllIIllIllll, UnicodeFont.lIlIIlIIllllII[18])) {
                lllllllllllllIIIllIllllIIllIIllI = -lllllllllllllIIIllIllllIIllIlllI.x;
            }
            if (lllIIlIllllIIlI(lllllllllllllIIIllIllllIIllIllIl)) {
                lllllllllllllIIIllIllllIIllIIllI += this.paddingLeft + this.paddingRight + this.paddingAdvanceX;
            }
            lllllllllllllIIIllIllllIIllIIlll = Math.max(lllllllllllllIIIllIllllIIllIIlll, lllllllllllllIIIllIllllIIllIlllI.x + lllllllllllllIIIllIllllIIllIIllI + lllllllllllllIIIllIllllIIllIlllI.width);
            if (lllIIlIlllIlIlI(lllllllllllllIIIllIllllIIllIllll, UnicodeFont.lIlIIlIIllllII[18])) {
                lllllllllllllIIIllIllllIIllIIlIl = (UnicodeFont.lIlIIlIIllllII[1] != 0);
            }
            ++lllllllllllllIIIllIllllIIllIllIl;
            "".length();
            if (-"   ".length() >= 0) {
                return (0x88 ^ 0x9F ^ (0x7A ^ 0x5E)) & (6 + 64 + 51 + 55 ^ 125 + 80 - 184 + 110 ^ -" ".length());
            }
        }
        return lllllllllllllIIIllIllllIIllIIlll;
    }
    
    public int getPaddingLeft() {
        return this.paddingLeft;
    }
    
    static {
        lllIIlIlllIIlIl();
        lllIIlIlllIIlII();
        DISPLAY_LIST_CACHE_SIZE = UnicodeFont.lIlIIlIIllllII[6];
        PAGE_SIZE = UnicodeFont.lIlIIlIIllllII[4];
        PAGES = UnicodeFont.lIlIIlIIllllII[2];
        MAX_GLYPH_CODE = UnicodeFont.lIlIIlIIllllII[19];
        GL = Renderer.get();
        EMPTY_DISPLAY_LIST = new DisplayList();
        heightComparator = new Comparator() {
            public int compare(final Object lllllllllllllIIIIIlllllIlIIlIIIl, final Object lllllllllllllIIIIIlllllIlIIlIIII) {
                return ((Glyph)lllllllllllllIIIIIlllllIlIIlIIIl).getHeight() - ((Glyph)lllllllllllllIIIIIlllllIlIIlIIII).getHeight();
            }
        };
    }
    
    public int getPaddingRight() {
        return this.paddingRight;
    }
    
    public int getPaddingBottom() {
        return this.paddingBottom;
    }
    
    public UnicodeFont(final java.awt.Font lllllllllllllIIIllIlllllllllIIIl, final String lllllllllllllIIIllIlllllllllIIll) throws SlickException {
        this(lllllllllllllIIIllIlllllllllIIIl, new HieroSettings(lllllllllllllIIIllIlllllllllIIll));
    }
    
    public boolean isCaching() {
        return this.displayListCaching;
    }
    
    public int getLeading() {
        return this.leading;
    }
    
    public void addAsciiGlyphs() {
        this.addGlyphs(UnicodeFont.lIlIIlIIllllII[11], UnicodeFont.lIlIIlIIllllII[12]);
    }
    
    public void setPaddingRight(final int lllllllllllllIIIllIlllIllllllIII) {
        this.paddingRight = lllllllllllllIIIllIlllIllllllIII;
    }
    
    private static String lllIIlIllIllIll(String lllllllllllllIIIllIlllIllIIllIIl, final String lllllllllllllIIIllIlllIllIIllIII) {
        lllllllllllllIIIllIlllIllIIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllIlllIllIIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIlllIllIIlllII = new StringBuilder();
        final char[] lllllllllllllIIIllIlllIllIIllIll = lllllllllllllIIIllIlllIllIIllIII.toCharArray();
        int lllllllllllllIIIllIlllIllIIllIlI = UnicodeFont.lIlIIlIIllllII[0];
        final boolean lllllllllllllIIIllIlllIllIIlIlII = (Object)lllllllllllllIIIllIlllIllIIllIIl.toCharArray();
        final int lllllllllllllIIIllIlllIllIIlIIll = lllllllllllllIIIllIlllIllIIlIlII.length;
        Exception lllllllllllllIIIllIlllIllIIlIIlI = (Exception)UnicodeFont.lIlIIlIIllllII[0];
        while (lllIIlIlllIlIIl((int)lllllllllllllIIIllIlllIllIIlIIlI, lllllllllllllIIIllIlllIllIIlIIll)) {
            final char lllllllllllllIIIllIlllIllIIlllll = lllllllllllllIIIllIlllIllIIlIlII[lllllllllllllIIIllIlllIllIIlIIlI];
            lllllllllllllIIIllIlllIllIIlllII.append((char)(lllllllllllllIIIllIlllIllIIlllll ^ lllllllllllllIIIllIlllIllIIllIll[lllllllllllllIIIllIlllIllIIllIlI % lllllllllllllIIIllIlllIllIIllIll.length]));
            "".length();
            ++lllllllllllllIIIllIlllIllIIllIlI;
            ++lllllllllllllIIIllIlllIllIIlIIlI;
            "".length();
            if ("   ".length() >= (0x4E ^ 0x43 ^ (0x9B ^ 0x92))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIlllIllIIlllII);
    }
    
    private Rectangle getGlyphBounds(final GlyphVector lllllllllllllIIIllIllllIlIIIIlII, final int lllllllllllllIIIllIllllIlIIIIIll, final int lllllllllllllIIIllIllllIlIIIIlll) {
        final Rectangle lllllllllllllIIIllIllllIlIIIIllI = lllllllllllllIIIllIllllIlIIIIlII.getGlyphPixelBounds(lllllllllllllIIIllIllllIlIIIIIll, GlyphPage.renderContext, 0.0f, 0.0f);
        if (lllIIlIlllIlIlI(lllllllllllllIIIllIllllIlIIIIlll, UnicodeFont.lIlIIlIIllllII[11])) {
            lllllllllllllIIIllIllllIlIIIIllI.width = this.spaceWidth;
        }
        return lllllllllllllIIIllIllllIlIIIIllI;
    }
    
    private static boolean lllIIlIlllIlllI(final int lllllllllllllIIIllIlllIlIlIlIIII, final int lllllllllllllIIIllIlllIlIlIIllll) {
        return lllllllllllllIIIllIlllIlIlIlIIII != lllllllllllllIIIllIlllIlIlIIllll;
    }
    
    public void setPaddingAdvanceX(final int lllllllllllllIIIllIlllIlllllIIIl) {
        this.paddingAdvanceX = lllllllllllllIIIllIlllIlllllIIIl;
    }
    
    public boolean loadGlyphs(int lllllllllllllIIIllIlllllIlIIIIII) throws SlickException {
        if (lllIIlIlllIIllI(this.queuedGlyphs.isEmpty() ? 1 : 0)) {
            return UnicodeFont.lIlIIlIIllllII[0] != 0;
        }
        if (lllIIlIlllIIllI(this.effects.isEmpty() ? 1 : 0)) {
            throw new IllegalStateException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[14]]);
        }
        final Iterator lllllllllllllIIIllIlllllIlIIIlll = this.queuedGlyphs.iterator();
        while (lllIIlIlllIIllI(lllllllllllllIIIllIlllllIlIIIlll.hasNext() ? 1 : 0)) {
            final Glyph lllllllllllllIIIllIlllllIlIIlIIl = lllllllllllllIIIllIlllllIlIIIlll.next();
            final int lllllllllllllIIIllIlllllIlIIlIII = lllllllllllllIIIllIlllllIlIIlIIl.getCodePoint();
            if (!lllIIlIlllIIllI(lllllllllllllIIIllIlllllIlIIlIIl.getWidth()) || lllIIlIlllIlIlI(lllllllllllllIIIllIlllllIlIIlIII, UnicodeFont.lIlIIlIIllllII[11])) {
                lllllllllllllIIIllIlllllIlIIIlll.remove();
                "".length();
                if (null != null) {
                    return ((0x20 ^ 0x7B ^ (0x7E ^ 0x3C)) & (0x4A ^ 0x24 ^ (0xF2 ^ 0x85) ^ -" ".length())) != 0x0;
                }
                continue;
            }
            else {
                if (lllIIlIlllIIllI(lllllllllllllIIIllIlllllIlIIlIIl.isMissing() ? 1 : 0)) {
                    if (lllIIlIlllIlIll(this.missingGlyph)) {
                        if (!lllIIlIlllIllII(lllllllllllllIIIllIlllllIlIIlIIl, this.missingGlyph)) {
                            continue;
                        }
                        lllllllllllllIIIllIlllllIlIIIlll.remove();
                        "".length();
                        if (null != null) {
                            return ((0x30 ^ 0x6) & ~(0x7 ^ 0x31)) != 0x0;
                        }
                        continue;
                    }
                    else {
                        this.missingGlyph = lllllllllllllIIIllIlllllIlIIlIIl;
                    }
                }
                "".length();
                if ("  ".length() != "  ".length()) {
                    return ((0x5E ^ 0x1C) & ~(0x3 ^ 0x41)) != 0x0;
                }
                continue;
            }
        }
        Collections.sort((List<Object>)this.queuedGlyphs, UnicodeFont.heightComparator);
        final Iterator lllllllllllllIIIllIlllllIlIIIlIl = this.glyphPages.iterator();
        while (lllIIlIlllIIllI(lllllllllllllIIIllIlllllIlIIIlIl.hasNext() ? 1 : 0)) {
            final GlyphPage lllllllllllllIIIllIlllllIlIIIllI = lllllllllllllIIIllIlllllIlIIIlIl.next();
            lllllllllllllIIIllIlllllIlIIIIII -= lllllllllllllIIIllIlllllIlIIIllI.loadGlyphs(this.queuedGlyphs, lllllllllllllIIIllIlllllIlIIIIII);
            if (!lllIIlIlllIIllI(lllllllllllllIIIllIlllllIlIIIIII) || lllIIlIlllIIllI(this.queuedGlyphs.isEmpty() ? 1 : 0)) {
                return UnicodeFont.lIlIIlIIllllII[1] != 0;
            }
            "".length();
            if ("  ".length() > "   ".length()) {
                return ((0x11 ^ 0x14) & ~(0x58 ^ 0x5D)) != 0x0;
            }
        }
        while (lllIIlIlllIllIl(this.queuedGlyphs.isEmpty() ? 1 : 0)) {
            final GlyphPage lllllllllllllIIIllIlllllIlIIIlII = new GlyphPage(this, this.glyphPageWidth, this.glyphPageHeight);
            this.glyphPages.add(lllllllllllllIIIllIlllllIlIIIlII);
            "".length();
            lllllllllllllIIIllIlllllIlIIIIII -= lllllllllllllIIIllIlllllIlIIIlII.loadGlyphs(this.queuedGlyphs, lllllllllllllIIIllIlllllIlIIIIII);
            if (lllIIlIlllIllIl(lllllllllllllIIIllIlllllIlIIIIII)) {
                return UnicodeFont.lIlIIlIIllllII[1] != 0;
            }
            "".length();
            if ((0x58 ^ 0x5C) != (0xB ^ 0xF)) {
                return ((0x3F ^ 0x64) & ~(0x22 ^ 0x79)) != 0x0;
            }
        }
        return UnicodeFont.lIlIIlIIllllII[1] != 0;
    }
    
    public UnicodeFont(final String lllllllllllllIIIlllIIIIIIIIllIII, final String lllllllllllllIIIlllIIIIIIIIlIlII) throws SlickException {
        this(lllllllllllllIIIlllIIIIIIIIllIII, new HieroSettings(lllllllllllllIIIlllIIIIIIIIlIlII));
    }
    
    private static void lllIIlIlllIIlII() {
        (lIlIIlIIlllIlI = new String[UnicodeFont.lIlIIlIIllllII[28]])[UnicodeFont.lIlIIlIIllllII[0]] = lllIIlIllIllIIl("0zePGjy/24Ich6cf8xL99A==", "omKtU");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[1]] = lllIIlIllIllIlI("6hvyUwhY0sCY5Q8QWOe0UbXy4uw8OWDv", "XufRF");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[7]] = lllIIlIllIllIlI("31SAtlAVH/8=", "RRrfb");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[8]] = lllIIlIllIllIIl("M59sL8ZUEZ7IGJjomjp1tw==", "YszMf");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[9]] = lllIIlIllIllIlI("Lh9tGnFV0ao=", "vYOwo");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[10]] = lllIIlIllIllIlI("UTcaJG3T9cp3+nzu18WEjhwtGzHdS+wi", "prEnB");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[14]] = lllIIlIllIllIll("ExskTTcpGiICBiI1LgMWZx40HhZnGyAbB2cSNU0OIhIyGUIoHSRNByEVJA4WZxEkCw01FmEMDD5TJgEbNxsyTQEmHWEPB2cfLgwGIhdv", "GsAmb");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[15]] = lllIIlIllIllIIl("NXwE5iG3qnLjd6LbiGbd2z7LjUqUZ2KS", "ZekyD");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[16]] = lllIIlIllIllIIl("I2tcbyPRPhDjO7p2/JMrP4G/C6GUflFH", "llwKr");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[21]] = lllIIlIllIllIIl("/aj02GzaYRdKR9xVBCAxjaSNcpFWhrIw", "jBNui");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[18]] = lllIIlIllIllIIl("PKkYru7oSUe7eJ1i7jKl2fEgQ7lPYN57", "tNGDV");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[22]] = lllIIlIllIllIll("AhE3MFEVFSEqHgJULSFRGAEjKF8=", "vtODq");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[23]] = lllIIlIllIllIlI("McXdPglxaQ6p6tHhwBOUg8blKUYmBKXJ", "JyfAY");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[24]] = lllIIlIllIllIlI("F0UyY7EXr/l/bLM56nZDoQ==", "qeTPQ");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[25]] = lllIIlIllIllIIl("n8jZCL4ssg2cEg5/PPUxfj0voka5PEP1", "hPUBW");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[26]] = lllIIlIllIllIll("NAUUBAwlBBA=", "DiupB");
        UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[27]] = lllIIlIllIllIlI("a/svkDkkVpo=", "AYawe");
    }
    
    public int getSpaceWidth() {
        return this.spaceWidth;
    }
    
    private static boolean lllIIlIlllIlIll(final Object lllllllllllllIIIllIlllIlIlIlllIl) {
        return lllllllllllllIIIllIlllIlIlIlllIl != null;
    }
    
    public UnicodeFont(final String lllllllllllllIIIlllIIIIIIIIIlIlI, final HieroSettings lllllllllllllIIIlllIIIIIIIIIlIIl) throws SlickException {
        this.glyphs = new Glyph[UnicodeFont.lIlIIlIIllllII[2]][];
        this.glyphPages = new ArrayList();
        this.queuedGlyphs = new ArrayList(UnicodeFont.lIlIIlIIllllII[3]);
        this.effects = new ArrayList();
        this.glyphPageWidth = UnicodeFont.lIlIIlIIllllII[4];
        this.glyphPageHeight = UnicodeFont.lIlIIlIIllllII[4];
        this.displayListCaching = (UnicodeFont.lIlIIlIIllllII[1] != 0);
        this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
        this.displayLists = new LinkedHashMap(UnicodeFont.lIlIIlIIllllII[6], 1.0f, (boolean)(UnicodeFont.lIlIIlIIllllII[1] != 0)) {
            private static final /* synthetic */ int[] lllIllllIIlIll;
            
            private static boolean lIlIIlIlllllIlll(final Object llllllllllllIlIllIIIIIIIllIIlIll) {
                return llllllllllllIlIllIIIIIIIllIIlIll != null;
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlIllIIIIIIIllIlIlIl) {
                final DisplayList llllllllllllIlIllIIIIIIIllIlIlII = llllllllllllIlIllIIIIIIIllIlIlIl.getValue();
                if (lIlIIlIlllllIlll(llllllllllllIlIllIIIIIIIllIlIlII)) {
                    UnicodeFont.this.eldestDisplayListID = llllllllllllIlIllIIIIIIIllIlIlII.id;
                    "".length();
                }
                int n;
                if (lIlIIlIllllllIII(this.size(), UnicodeFont$2.lllIllllIIlIll[0])) {
                    n = UnicodeFont$2.lllIllllIIlIll[1];
                    "".length();
                    if (((0x15 ^ 0x75) & ~(0x2A ^ 0x4A)) >= " ".length()) {
                        return ((0x53 ^ 0x77) & ~(0x9F ^ 0xBB)) != 0x0;
                    }
                }
                else {
                    n = UnicodeFont$2.lllIllllIIlIll[2];
                }
                return n != 0;
            }
            
            static {
                lIlIIlIlllllIllI();
            }
            
            private static boolean lIlIIlIllllllIII(final int llllllllllllIlIllIIIIIIIllIIlllI, final int llllllllllllIlIllIIIIIIIllIIllIl) {
                return llllllllllllIlIllIIIIIIIllIIlllI > llllllllllllIlIllIIIIIIIllIIllIl;
            }
            
            private static void lIlIIlIlllllIllI() {
                (lllIllllIIlIll = new int[3])[0] = 148 + 147 - 241 + 146;
                UnicodeFont$2.lllIllllIIlIll[1] = " ".length();
                UnicodeFont$2.lllIllllIIlIll[2] = ((102 + 165 - 171 + 77 ^ 24 + 36 + 15 + 69) & (9 + 110 - 117 + 138 ^ 92 + 66 - 93 + 112 ^ -" ".length()));
            }
        };
        this.ttfFileRef = lllllllllllllIIIlllIIIIIIIIIlIlI;
        final java.awt.Font lllllllllllllIIIlllIIIIIIIIIllII = createFont(lllllllllllllIIIlllIIIIIIIIIlIlI);
        this.initializeFont(lllllllllllllIIIlllIIIIIIIIIllII, lllllllllllllIIIlllIIIIIIIIIlIIl.getFontSize(), lllllllllllllIIIlllIIIIIIIIIlIIl.isBold(), lllllllllllllIIIlllIIIIIIIIIlIIl.isItalic());
        this.loadSettings(lllllllllllllIIIlllIIIIIIIIIlIIl);
    }
    
    public void destroy() {
        this.clearGlyphs();
    }
    
    private static boolean lllIIlIlllIlIII(final Object lllllllllllllIIIllIlllIlIlIllIll) {
        return lllllllllllllIIIllIlllIlIlIllIll == null;
    }
    
    public boolean loadGlyphs() throws SlickException {
        return this.loadGlyphs(UnicodeFont.lIlIIlIIllllII[5]);
    }
    
    public void setPaddingTop(final int lllllllllllllIIIllIllllIIIIlIlIl) {
        this.paddingTop = lllllllllllllIIIllIllllIIIIlIlIl;
    }
    
    public int getDescent() {
        return this.descent;
    }
    
    public void drawString(final float lllllllllllllIIIllIllllIllIlIlIl, final float lllllllllllllIIIllIllllIllIIllIl, final String lllllllllllllIIIllIllllIllIlIIll, final Color lllllllllllllIIIllIllllIllIIlIll, final int lllllllllllllIIIllIllllIllIIlIlI, final int lllllllllllllIIIllIllllIllIIlIIl) {
        this.drawDisplayList(lllllllllllllIIIllIllllIllIlIlIl, lllllllllllllIIIllIllllIllIIllIl, lllllllllllllIIIllIllllIllIlIIll, lllllllllllllIIIllIllllIllIIlIll, lllllllllllllIIIllIllllIllIIlIlI, lllllllllllllIIIllIllllIllIIlIIl);
        "".length();
    }
    
    private static boolean lllIIlIlllIlIIl(final int lllllllllllllIIIllIlllIlIllIllII, final int lllllllllllllIIIllIlllIlIllIlIll) {
        return lllllllllllllIIIllIlllIlIllIllII < lllllllllllllIIIllIlllIlIllIlIll;
    }
    
    public int getGlyphPageHeight() {
        return this.glyphPageHeight;
    }
    
    public int getLineHeight() {
        return this.descent + this.ascent + this.leading + this.paddingTop + this.paddingBottom + this.paddingAdvanceY;
    }
    
    public void addGlyphs(final String lllllllllllllIIIllIlllllIllIIlII) {
        if (lllIIlIlllIlIII(lllllllllllllIIIllIlllllIllIIlII)) {
            throw new IllegalArgumentException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[10]]);
        }
        final char[] lllllllllllllIIIllIlllllIllIIIll = lllllllllllllIIIllIlllllIllIIlII.toCharArray();
        final GlyphVector lllllllllllllIIIllIlllllIllIIIIl = this.font.layoutGlyphVector(GlyphPage.renderContext, lllllllllllllIIIllIlllllIllIIIll, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIlllllIllIIIll.length, UnicodeFont.lIlIIlIIllllII[0]);
        int lllllllllllllIIIllIlllllIllIlIII = UnicodeFont.lIlIIlIIllllII[0];
        final int lllllllllllllIIIllIlllllIllIIllI = lllllllllllllIIIllIlllllIllIIIIl.getNumGlyphs();
        while (lllIIlIlllIlIIl(lllllllllllllIIIllIlllllIllIlIII, lllllllllllllIIIllIlllllIllIIllI)) {
            final int lllllllllllllIIIllIlllllIllIllIl = lllllllllllllIIIllIlllllIllIIlII.codePointAt(lllllllllllllIIIllIlllllIllIIIIl.getGlyphCharIndex(lllllllllllllIIIllIlllllIllIlIII));
            final Rectangle lllllllllllllIIIllIlllllIllIlIlI = this.getGlyphBounds(lllllllllllllIIIllIlllllIllIIIIl, lllllllllllllIIIllIlllllIllIlIII, lllllllllllllIIIllIlllllIllIllIl);
            this.getGlyph(lllllllllllllIIIllIlllllIllIIIIl.getGlyphCode(lllllllllllllIIIllIlllllIllIlIII), lllllllllllllIIIllIlllllIllIllIl, lllllllllllllIIIllIlllllIllIlIlI, lllllllllllllIIIllIlllllIllIIIIl, lllllllllllllIIIllIlllllIllIlIII);
            "".length();
            ++lllllllllllllIIIllIlllllIllIlIII;
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
    }
    
    private static boolean lllIIlIllllIIII(final int lllllllllllllIIIllIlllIlIlIlIlIl) {
        return lllllllllllllIIIllIlllIlIlIlIlIl >= 0;
    }
    
    private void initializeFont(final java.awt.Font lllllllllllllIIIllIllllllIlllIIl, final int lllllllllllllIIIllIlllllllIIIIlI, final boolean lllllllllllllIIIllIllllllIllIllI, final boolean lllllllllllllIIIllIllllllIllIlIl) {
        final Map lllllllllllllIIIllIllllllIlllllI = lllllllllllllIIIllIllllllIlllIIl.getAttributes();
        lllllllllllllIIIllIllllllIlllllI.put(TextAttribute.SIZE, new Float((float)lllllllllllllIIIllIlllllllIIIIlI));
        "".length();
        final Map map = lllllllllllllIIIllIllllllIlllllI;
        final TextAttribute weight = TextAttribute.WEIGHT;
        Float n;
        if (lllIIlIlllIIllI(lllllllllllllIIIllIllllllIllIllI ? 1 : 0)) {
            n = TextAttribute.WEIGHT_BOLD;
            "".length();
            if (" ".length() < ((0x3B ^ 0x14 ^ (0x5B ^ 0x4D)) & (0x84 ^ 0x9E ^ (0x16 ^ 0x35) ^ -" ".length()))) {
                return;
            }
        }
        else {
            n = TextAttribute.WEIGHT_REGULAR;
        }
        map.put(weight, n);
        "".length();
        final Map map2 = lllllllllllllIIIllIllllllIlllllI;
        final TextAttribute posture = TextAttribute.POSTURE;
        Float n2;
        if (lllIIlIlllIIllI(lllllllllllllIIIllIllllllIllIlIl ? 1 : 0)) {
            n2 = TextAttribute.POSTURE_OBLIQUE;
            "".length();
            if (-" ".length() >= ((58 + 59 - 64 + 98 ^ 42 + 168 - 139 + 124) & (188 + 140 - 114 + 6 ^ 65 + 29 + 12 + 30 ^ -" ".length()))) {
                return;
            }
        }
        else {
            n2 = TextAttribute.POSTURE_REGULAR;
        }
        map2.put(posture, n2);
        "".length();
        try {
            lllllllllllllIIIllIllllllIlllllI.put(TextAttribute.class.getDeclaredField(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[7]]).get(null), TextAttribute.class.getDeclaredField(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[8]]).get(null));
            "".length();
            "".length();
            if (((0x8D ^ 0xB5 ^ (0x3C ^ 0x41)) & (0x29 ^ 0x5C ^ (0x4C ^ 0x7C) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (Exception ex) {}
        this.font = lllllllllllllIIIllIllllllIlllIIl.deriveFont(lllllllllllllIIIllIllllllIlllllI);
        final FontMetrics lllllllllllllIIIllIllllllIllllIl = GlyphPage.getScratchGraphics().getFontMetrics(this.font);
        this.ascent = lllllllllllllIIIllIllllllIllllIl.getAscent();
        this.descent = lllllllllllllIIIllIllllllIllllIl.getDescent();
        this.leading = lllllllllllllIIIllIllllllIllllIl.getLeading();
        final char[] lllllllllllllIIIllIllllllIllllII = UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[9]].toCharArray();
        final GlyphVector lllllllllllllIIIllIllllllIlllIll = this.font.layoutGlyphVector(GlyphPage.renderContext, lllllllllllllIIIllIllllllIllllII, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllllIllllII.length, UnicodeFont.lIlIIlIIllllII[0]);
        this.spaceWidth = lllllllllllllIIIllIllllllIlllIll.getGlyphLogicalBounds(UnicodeFont.lIlIIlIIllllII[0]).getBounds().width;
    }
    
    private static boolean lllIIlIlllIllIl(final int lllllllllllllIIIllIlllIlIlIlIlll) {
        return lllllllllllllIIIllIlllIlIlIlIlll == 0;
    }
    
    public UnicodeFont(final String lllllllllllllIIIllIlllllllllllII, final int lllllllllllllIIIllIllllllllllIll, final boolean lllllllllllllIIIllIllllllllllIlI, final boolean lllllllllllllIIIllIllllllllllIIl) throws SlickException {
        this.glyphs = new Glyph[UnicodeFont.lIlIIlIIllllII[2]][];
        this.glyphPages = new ArrayList();
        this.queuedGlyphs = new ArrayList(UnicodeFont.lIlIIlIIllllII[3]);
        this.effects = new ArrayList();
        this.glyphPageWidth = UnicodeFont.lIlIIlIIllllII[4];
        this.glyphPageHeight = UnicodeFont.lIlIIlIIllllII[4];
        this.displayListCaching = (UnicodeFont.lIlIIlIIllllII[1] != 0);
        this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
        this.displayLists = new LinkedHashMap(UnicodeFont.lIlIIlIIllllII[6], 1.0f, (boolean)(UnicodeFont.lIlIIlIIllllII[1] != 0)) {
            private static final /* synthetic */ int[] lllIllllIIlIll;
            
            private static boolean lIlIIlIlllllIlll(final Object llllllllllllIlIllIIIIIIIllIIlIll) {
                return llllllllllllIlIllIIIIIIIllIIlIll != null;
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlIllIIIIIIIllIlIlIl) {
                final DisplayList llllllllllllIlIllIIIIIIIllIlIlII = llllllllllllIlIllIIIIIIIllIlIlIl.getValue();
                if (lIlIIlIlllllIlll(llllllllllllIlIllIIIIIIIllIlIlII)) {
                    UnicodeFont.this.eldestDisplayListID = llllllllllllIlIllIIIIIIIllIlIlII.id;
                    "".length();
                }
                int n;
                if (lIlIIlIllllllIII(this.size(), UnicodeFont$2.lllIllllIIlIll[0])) {
                    n = UnicodeFont$2.lllIllllIIlIll[1];
                    "".length();
                    if (((0x15 ^ 0x75) & ~(0x2A ^ 0x4A)) >= " ".length()) {
                        return ((0x53 ^ 0x77) & ~(0x9F ^ 0xBB)) != 0x0;
                    }
                }
                else {
                    n = UnicodeFont$2.lllIllllIIlIll[2];
                }
                return n != 0;
            }
            
            static {
                lIlIIlIlllllIllI();
            }
            
            private static boolean lIlIIlIllllllIII(final int llllllllllllIlIllIIIIIIIllIIlllI, final int llllllllllllIlIllIIIIIIIllIIllIl) {
                return llllllllllllIlIllIIIIIIIllIIlllI > llllllllllllIlIllIIIIIIIllIIllIl;
            }
            
            private static void lIlIIlIlllllIllI() {
                (lllIllllIIlIll = new int[3])[0] = 148 + 147 - 241 + 146;
                UnicodeFont$2.lllIllllIIlIll[1] = " ".length();
                UnicodeFont$2.lllIllllIIlIll[2] = ((102 + 165 - 171 + 77 ^ 24 + 36 + 15 + 69) & (9 + 110 - 117 + 138 ^ 92 + 66 - 93 + 112 ^ -" ".length()));
            }
        };
        this.ttfFileRef = lllllllllllllIIIllIlllllllllllII;
        this.initializeFont(createFont(lllllllllllllIIIllIlllllllllllII), lllllllllllllIIIllIllllllllllIll, lllllllllllllIIIllIllllllllllIlI, lllllllllllllIIIllIllllllllllIIl);
    }
    
    private static String lllIIlIllIllIIl(final String lllllllllllllIIIllIlllIllIIIlIIl, final String lllllllllllllIIIllIlllIllIIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlllIllIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlllIllIIIIllI.getBytes(StandardCharsets.UTF_8)), UnicodeFont.lIlIIlIIllllII[16]), "DES");
            final Cipher lllllllllllllIIIllIlllIllIIIlIll = Cipher.getInstance("DES");
            lllllllllllllIIIllIlllIllIIIlIll.init(UnicodeFont.lIlIIlIIllllII[7], lllllllllllllIIIllIlllIllIIIllII);
            return new String(lllllllllllllIIIllIlllIllIIIlIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlllIllIIIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlllIllIIIlIlI) {
            lllllllllllllIIIllIlllIllIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIlIllllIIlI(final int lllllllllllllIIIllIlllIlIlIlIIll) {
        return lllllllllllllIIIllIlllIlIlIlIIll > 0;
    }
    
    public List getEffects() {
        return this.effects;
    }
    
    private static String lllIIlIllIllIlI(final String lllllllllllllIIIllIlllIlIlllllII, final String lllllllllllllIIIllIlllIlIllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllIlllIlIlllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIlllIlIllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIlllIlIllllllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIlllIlIllllllI.init(UnicodeFont.lIlIIlIIllllII[7], lllllllllllllIIIllIlllIlIlllllll);
            return new String(lllllllllllllIIIllIlllIlIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIlllIlIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIlllIlIlllllIl) {
            lllllllllllllIIIllIlllIlIlllllIl.printStackTrace();
            return null;
        }
    }
    
    public UnicodeFont(final java.awt.Font lllllllllllllIIIllIllllllllIIIll) {
        this.glyphs = new Glyph[UnicodeFont.lIlIIlIIllllII[2]][];
        this.glyphPages = new ArrayList();
        this.queuedGlyphs = new ArrayList(UnicodeFont.lIlIIlIIllllII[3]);
        this.effects = new ArrayList();
        this.glyphPageWidth = UnicodeFont.lIlIIlIIllllII[4];
        this.glyphPageHeight = UnicodeFont.lIlIIlIIllllII[4];
        this.displayListCaching = (UnicodeFont.lIlIIlIIllllII[1] != 0);
        this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
        this.displayLists = new LinkedHashMap(UnicodeFont.lIlIIlIIllllII[6], 1.0f, (boolean)(UnicodeFont.lIlIIlIIllllII[1] != 0)) {
            private static final /* synthetic */ int[] lllIllllIIlIll;
            
            private static boolean lIlIIlIlllllIlll(final Object llllllllllllIlIllIIIIIIIllIIlIll) {
                return llllllllllllIlIllIIIIIIIllIIlIll != null;
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlIllIIIIIIIllIlIlIl) {
                final DisplayList llllllllllllIlIllIIIIIIIllIlIlII = llllllllllllIlIllIIIIIIIllIlIlIl.getValue();
                if (lIlIIlIlllllIlll(llllllllllllIlIllIIIIIIIllIlIlII)) {
                    UnicodeFont.this.eldestDisplayListID = llllllllllllIlIllIIIIIIIllIlIlII.id;
                    "".length();
                }
                int n;
                if (lIlIIlIllllllIII(this.size(), UnicodeFont$2.lllIllllIIlIll[0])) {
                    n = UnicodeFont$2.lllIllllIIlIll[1];
                    "".length();
                    if (((0x15 ^ 0x75) & ~(0x2A ^ 0x4A)) >= " ".length()) {
                        return ((0x53 ^ 0x77) & ~(0x9F ^ 0xBB)) != 0x0;
                    }
                }
                else {
                    n = UnicodeFont$2.lllIllllIIlIll[2];
                }
                return n != 0;
            }
            
            static {
                lIlIIlIlllllIllI();
            }
            
            private static boolean lIlIIlIllllllIII(final int llllllllllllIlIllIIIIIIIllIIlllI, final int llllllllllllIlIllIIIIIIIllIIllIl) {
                return llllllllllllIlIllIIIIIIIllIIlllI > llllllllllllIlIllIIIIIIIllIIllIl;
            }
            
            private static void lIlIIlIlllllIllI() {
                (lllIllllIIlIll = new int[3])[0] = 148 + 147 - 241 + 146;
                UnicodeFont$2.lllIllllIIlIll[1] = " ".length();
                UnicodeFont$2.lllIllllIIlIll[2] = ((102 + 165 - 171 + 77 ^ 24 + 36 + 15 + 69) & (9 + 110 - 117 + 138 ^ 92 + 66 - 93 + 112 ^ -" ".length()));
            }
        };
        this.initializeFont(lllllllllllllIIIllIllllllllIIIll, lllllllllllllIIIllIllllllllIIIll.getSize(), lllllllllllllIIIllIllllllllIIIll.isBold(), lllllllllllllIIIllIllllllllIIIll.isItalic());
    }
    
    public int getPaddingAdvanceX() {
        return this.paddingAdvanceX;
    }
    
    private void loadSettings(final HieroSettings lllllllllllllIIIllIllllllIIlllll) {
        this.paddingTop = lllllllllllllIIIllIllllllIIlllll.getPaddingTop();
        this.paddingLeft = lllllllllllllIIIllIllllllIIlllll.getPaddingLeft();
        this.paddingBottom = lllllllllllllIIIllIllllllIIlllll.getPaddingBottom();
        this.paddingRight = lllllllllllllIIIllIllllllIIlllll.getPaddingRight();
        this.paddingAdvanceX = lllllllllllllIIIllIllllllIIlllll.getPaddingAdvanceX();
        this.paddingAdvanceY = lllllllllllllIIIllIllllllIIlllll.getPaddingAdvanceY();
        this.glyphPageWidth = lllllllllllllIIIllIllllllIIlllll.getGlyphPageWidth();
        this.glyphPageHeight = lllllllllllllIIIllIllllllIIlllll.getGlyphPageHeight();
        this.effects.addAll(lllllllllllllIIIllIllllllIIlllll.getEffects());
        "".length();
    }
    
    public UnicodeFont(final java.awt.Font lllllllllllllIIIllIllllllllIlIll, final HieroSettings lllllllllllllIIIllIllllllllIlIlI) {
        this.glyphs = new Glyph[UnicodeFont.lIlIIlIIllllII[2]][];
        this.glyphPages = new ArrayList();
        this.queuedGlyphs = new ArrayList(UnicodeFont.lIlIIlIIllllII[3]);
        this.effects = new ArrayList();
        this.glyphPageWidth = UnicodeFont.lIlIIlIIllllII[4];
        this.glyphPageHeight = UnicodeFont.lIlIIlIIllllII[4];
        this.displayListCaching = (UnicodeFont.lIlIIlIIllllII[1] != 0);
        this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
        this.displayLists = new LinkedHashMap(UnicodeFont.lIlIIlIIllllII[6], 1.0f, (boolean)(UnicodeFont.lIlIIlIIllllII[1] != 0)) {
            private static final /* synthetic */ int[] lllIllllIIlIll;
            
            private static boolean lIlIIlIlllllIlll(final Object llllllllllllIlIllIIIIIIIllIIlIll) {
                return llllllllllllIlIllIIIIIIIllIIlIll != null;
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlIllIIIIIIIllIlIlIl) {
                final DisplayList llllllllllllIlIllIIIIIIIllIlIlII = llllllllllllIlIllIIIIIIIllIlIlIl.getValue();
                if (lIlIIlIlllllIlll(llllllllllllIlIllIIIIIIIllIlIlII)) {
                    UnicodeFont.this.eldestDisplayListID = llllllllllllIlIllIIIIIIIllIlIlII.id;
                    "".length();
                }
                int n;
                if (lIlIIlIllllllIII(this.size(), UnicodeFont$2.lllIllllIIlIll[0])) {
                    n = UnicodeFont$2.lllIllllIIlIll[1];
                    "".length();
                    if (((0x15 ^ 0x75) & ~(0x2A ^ 0x4A)) >= " ".length()) {
                        return ((0x53 ^ 0x77) & ~(0x9F ^ 0xBB)) != 0x0;
                    }
                }
                else {
                    n = UnicodeFont$2.lllIllllIIlIll[2];
                }
                return n != 0;
            }
            
            static {
                lIlIIlIlllllIllI();
            }
            
            private static boolean lIlIIlIllllllIII(final int llllllllllllIlIllIIIIIIIllIIlllI, final int llllllllllllIlIllIIIIIIIllIIllIl) {
                return llllllllllllIlIllIIIIIIIllIIlllI > llllllllllllIlIllIIIIIIIllIIllIl;
            }
            
            private static void lIlIIlIlllllIllI() {
                (lllIllllIIlIll = new int[3])[0] = 148 + 147 - 241 + 146;
                UnicodeFont$2.lllIllllIIlIll[1] = " ".length();
                UnicodeFont$2.lllIllllIIlIll[2] = ((102 + 165 - 171 + 77 ^ 24 + 36 + 15 + 69) & (9 + 110 - 117 + 138 ^ 92 + 66 - 93 + 112 ^ -" ".length()));
            }
        };
        this.initializeFont(lllllllllllllIIIllIllllllllIlIll, lllllllllllllIIIllIllllllllIlIlI.getFontSize(), lllllllllllllIIIllIllllllllIlIlI.isBold(), lllllllllllllIIIllIllllllllIlIlI.isItalic());
        this.loadSettings(lllllllllllllIIIllIllllllllIlIlI);
    }
    
    private static boolean lllIIlIlllIIlll(final int lllllllllllllIIIllIlllIlIllIlIII, final int lllllllllllllIIIllIlllIlIllIIlll) {
        return lllllllllllllIIIllIlllIlIllIlIII <= lllllllllllllIIIllIlllIlIllIIlll;
    }
    
    private static boolean lllIIlIllllIIIl(final int lllllllllllllIIIllIlllIlIlllIIII, final int lllllllllllllIIIllIlllIlIllIllll) {
        return lllllllllllllIIIllIlllIlIlllIIII >= lllllllllllllIIIllIlllIlIllIllll;
    }
    
    private static boolean lllIIlIlllIllII(final Object lllllllllllllIIIllIlllIlIllIIIII, final Object lllllllllllllIIIllIlllIlIlIlllll) {
        return lllllllllllllIIIllIlllIlIllIIIII != lllllllllllllIIIllIlllIlIlIlllll;
    }
    
    public void setDisplayListCaching(final boolean lllllllllllllIIIllIlllIllIlllIll) {
        this.displayListCaching = lllllllllllllIIIllIlllIllIlllIll;
    }
    
    public int getAscent() {
        return this.ascent;
    }
    
    public void addNeheGlyphs() {
        this.addGlyphs(UnicodeFont.lIlIIlIIllllII[11], UnicodeFont.lIlIIlIIllllII[13]);
    }
    
    private static boolean lllIIlIlllIIllI(final int lllllllllllllIIIllIlllIlIlIllIIl) {
        return lllllllllllllIIIllIlllIlIlIllIIl != 0;
    }
    
    public DisplayList drawDisplayList(float lllllllllllllIIIllIllllIllllIllI, float lllllllllllllIIIllIlllllIIIIIlll, final String lllllllllllllIIIllIlllllIIIIIllI, final Color lllllllllllllIIIllIlllllIIIIIlIl, final int lllllllllllllIIIllIllllIllllIIlI, final int lllllllllllllIIIllIllllIllllIIIl) {
        if (lllIIlIlllIlIII(lllllllllllllIIIllIlllllIIIIIllI)) {
            throw new IllegalArgumentException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[15]]);
        }
        if (lllIIlIlllIllIl(lllllllllllllIIIllIlllllIIIIIllI.length())) {
            return UnicodeFont.EMPTY_DISPLAY_LIST;
        }
        if (lllIIlIlllIlIII(lllllllllllllIIIllIlllllIIIIIlIl)) {
            throw new IllegalArgumentException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[16]]);
        }
        lllllllllllllIIIllIllllIllllIllI -= this.paddingLeft;
        lllllllllllllIIIllIlllllIIIIIlll -= this.paddingTop;
        final String lllllllllllllIIIllIlllllIIIIIIlI = lllllllllllllIIIllIlllllIIIIIllI.substring(lllllllllllllIIIllIllllIllllIIlI, lllllllllllllIIIllIllllIllllIIIl);
        lllllllllllllIIIllIlllllIIIIIlIl.bind();
        TextureImpl.bindNone();
        DisplayList lllllllllllllIIIllIlllllIIIIIIIl = null;
        if (lllIIlIlllIIllI(this.displayListCaching ? 1 : 0) && lllIIlIlllIIllI(this.queuedGlyphs.isEmpty() ? 1 : 0)) {
            if (lllIIlIlllIlIlI(this.baseDisplayListID, UnicodeFont.lIlIIlIIllllII[5])) {
                this.baseDisplayListID = UnicodeFont.GL.glGenLists(UnicodeFont.lIlIIlIIllllII[6]);
                if (lllIIlIlllIllIl(this.baseDisplayListID)) {
                    this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
                    this.displayListCaching = (UnicodeFont.lIlIIlIIllllII[0] != 0);
                    return new DisplayList();
                }
            }
            lllllllllllllIIIllIlllllIIIIIIIl = this.displayLists.get(lllllllllllllIIIllIlllllIIIIIIlI);
            if (lllIIlIlllIlIll(lllllllllllllIIIllIlllllIIIIIIIl)) {
                if (!lllIIlIlllIIllI(lllllllllllllIIIllIlllllIIIIIIIl.invalid ? 1 : 0)) {
                    UnicodeFont.GL.glTranslatef(lllllllllllllIIIllIllllIllllIllI, lllllllllllllIIIllIlllllIIIIIlll, 0.0f);
                    UnicodeFont.GL.glCallList(lllllllllllllIIIllIlllllIIIIIIIl.id);
                    UnicodeFont.GL.glTranslatef(-lllllllllllllIIIllIllllIllllIllI, -lllllllllllllIIIllIlllllIIIIIlll, 0.0f);
                    return lllllllllllllIIIllIlllllIIIIIIIl;
                }
                lllllllllllllIIIllIlllllIIIIIIIl.invalid = (UnicodeFont.lIlIIlIIllllII[0] != 0);
                "".length();
                if ((0x51 ^ 0x5E ^ (0x90 ^ 0x9B)) < 0) {
                    return null;
                }
            }
            else if (lllIIlIlllIlIII(lllllllllllllIIIllIlllllIIIIIIIl)) {
                lllllllllllllIIIllIlllllIIIIIIIl = new DisplayList();
                final int lllllllllllllIIIllIlllllIIIlIIlI = this.displayLists.size();
                this.displayLists.put(lllllllllllllIIIllIlllllIIIIIIlI, lllllllllllllIIIllIlllllIIIIIIIl);
                "".length();
                if (lllIIlIlllIlIIl(lllllllllllllIIIllIlllllIIIlIIlI, UnicodeFont.lIlIIlIIllllII[6])) {
                    lllllllllllllIIIllIlllllIIIIIIIl.id = this.baseDisplayListID + lllllllllllllIIIllIlllllIIIlIIlI;
                    "".length();
                    if (((0xAA ^ 0x98) & ~(0x7E ^ 0x4C)) != 0x0) {
                        return null;
                    }
                }
                else {
                    lllllllllllllIIIllIlllllIIIIIIIl.id = this.eldestDisplayListID;
                }
            }
            this.displayLists.put(lllllllllllllIIIllIlllllIIIIIIlI, lllllllllllllIIIllIlllllIIIIIIIl);
            "".length();
        }
        UnicodeFont.GL.glTranslatef(lllllllllllllIIIllIllllIllllIllI, lllllllllllllIIIllIlllllIIIIIlll, 0.0f);
        if (lllIIlIlllIlIll(lllllllllllllIIIllIlllllIIIIIIIl)) {
            UnicodeFont.GL.glNewList(lllllllllllllIIIllIlllllIIIIIIIl.id, UnicodeFont.lIlIIlIIllllII[17]);
        }
        final char[] lllllllllllllIIIllIlllllIIIIIIII = lllllllllllllIIIllIlllllIIIIIllI.substring(UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllIllllIIIl).toCharArray();
        final GlyphVector lllllllllllllIIIllIllllIllllllll = this.font.layoutGlyphVector(GlyphPage.renderContext, lllllllllllllIIIllIlllllIIIIIIII, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIlllllIIIIIIII.length, UnicodeFont.lIlIIlIIllllII[0]);
        int lllllllllllllIIIllIllllIlllllllI = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIllllllIl = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIllllllII = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIlllllIll = UnicodeFont.lIlIIlIIllllII[0];
        int lllllllllllllIIIllIllllIlllllIlI = this.ascent;
        boolean lllllllllllllIIIllIllllIlllllIIl = UnicodeFont.lIlIIlIIllllII[0] != 0;
        Texture lllllllllllllIIIllIllllIlllllIII = null;
        int lllllllllllllIIIllIlllllIIIIlIll = UnicodeFont.lIlIIlIIllllII[0];
        final int lllllllllllllIIIllIlllllIIIIlIlI = lllllllllllllIIIllIllllIllllllll.getNumGlyphs();
        while (lllIIlIlllIlIIl(lllllllllllllIIIllIlllllIIIIlIll, lllllllllllllIIIllIlllllIIIIlIlI)) {
            final int lllllllllllllIIIllIlllllIIIlIIII = lllllllllllllIIIllIllllIllllllll.getGlyphCharIndex(lllllllllllllIIIllIlllllIIIIlIll);
            if (lllIIlIlllIlIIl(lllllllllllllIIIllIlllllIIIlIIII, lllllllllllllIIIllIllllIllllIIlI)) {
                "".length();
                if ((0xA1 ^ 0xA5) < " ".length()) {
                    return null;
                }
            }
            else if (lllIIlIlllIllll(lllllllllllllIIIllIlllllIIIlIIII, lllllllllllllIIIllIllllIllllIIIl)) {
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
                break;
            }
            else {
                final int lllllllllllllIIIllIlllllIIIIllll = lllllllllllllIIIllIlllllIIIIIllI.codePointAt(lllllllllllllIIIllIlllllIIIlIIII);
                final Rectangle lllllllllllllIIIllIlllllIIIIlllI = this.getGlyphBounds(lllllllllllllIIIllIllllIllllllll, lllllllllllllIIIllIlllllIIIIlIll, lllllllllllllIIIllIlllllIIIIllll);
                final Glyph lllllllllllllIIIllIlllllIIIIllIl = this.getGlyph(lllllllllllllIIIllIllllIllllllll.getGlyphCode(lllllllllllllIIIllIlllllIIIIlIll), lllllllllllllIIIllIlllllIIIIllll, lllllllllllllIIIllIlllllIIIIlllI, lllllllllllllIIIllIllllIllllllll, lllllllllllllIIIllIlllllIIIIlIll);
                if (lllIIlIlllIIllI(lllllllllllllIIIllIllllIlllllIIl ? 1 : 0) && lllIIlIlllIlllI(lllllllllllllIIIllIlllllIIIIllll, UnicodeFont.lIlIIlIIllllII[18])) {
                    lllllllllllllIIIllIllllIlllllIll = -lllllllllllllIIIllIlllllIIIIlllI.x;
                    lllllllllllllIIIllIllllIlllllIIl = (UnicodeFont.lIlIIlIIllllII[0] != 0);
                }
                Image lllllllllllllIIIllIlllllIIIIllII = lllllllllllllIIIllIlllllIIIIllIl.getImage();
                if (lllIIlIlllIlIII(lllllllllllllIIIllIlllllIIIIllII) && lllIIlIlllIlIll(this.missingGlyph) && lllIIlIlllIIllI(lllllllllllllIIIllIlllllIIIIllIl.isMissing() ? 1 : 0)) {
                    lllllllllllllIIIllIlllllIIIIllII = this.missingGlyph.getImage();
                }
                if (lllIIlIlllIlIll(lllllllllllllIIIllIlllllIIIIllII)) {
                    final Texture lllllllllllllIIIllIlllllIIIlIIIl = lllllllllllllIIIllIlllllIIIIllII.getTexture();
                    if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIlllllIII) && lllIIlIlllIllII(lllllllllllllIIIllIllllIlllllIII, lllllllllllllIIIllIlllllIIIlIIIl)) {
                        UnicodeFont.GL.glEnd();
                        lllllllllllllIIIllIllllIlllllIII = null;
                    }
                    if (lllIIlIlllIlIII(lllllllllllllIIIllIllllIlllllIII)) {
                        lllllllllllllIIIllIlllllIIIlIIIl.bind();
                        UnicodeFont.GL.glBegin(UnicodeFont.lIlIIlIIllllII[15]);
                        lllllllllllllIIIllIllllIlllllIII = lllllllllllllIIIllIlllllIIIlIIIl;
                    }
                    lllllllllllllIIIllIlllllIIIIllII.drawEmbedded((float)(lllllllllllllIIIllIlllllIIIIlllI.x + lllllllllllllIIIllIllllIlllllIll), (float)(lllllllllllllIIIllIlllllIIIIlllI.y + lllllllllllllIIIllIllllIlllllIlI), (float)lllllllllllllIIIllIlllllIIIIllII.getWidth(), (float)lllllllllllllIIIllIlllllIIIIllII.getHeight());
                }
                if (lllIIlIllllIIII(lllllllllllllIIIllIlllllIIIIlIll)) {
                    lllllllllllllIIIllIllllIlllllIll += this.paddingRight + this.paddingLeft + this.paddingAdvanceX;
                }
                lllllllllllllIIIllIllllIlllllllI = Math.max(lllllllllllllIIIllIllllIlllllllI, lllllllllllllIIIllIlllllIIIIlllI.x + lllllllllllllIIIllIllllIlllllIll + lllllllllllllIIIllIlllllIIIIlllI.width);
                lllllllllllllIIIllIllllIllllllIl = Math.max(lllllllllllllIIIllIllllIllllllIl, this.ascent + lllllllllllllIIIllIlllllIIIIlllI.y + lllllllllllllIIIllIlllllIIIIlllI.height);
                if (lllIIlIlllIlIlI(lllllllllllllIIIllIlllllIIIIllll, UnicodeFont.lIlIIlIIllllII[18])) {
                    lllllllllllllIIIllIllllIlllllIIl = (UnicodeFont.lIlIIlIIllllII[1] != 0);
                    lllllllllllllIIIllIllllIlllllIlI += this.getLineHeight();
                    ++lllllllllllllIIIllIllllIllllllII;
                    lllllllllllllIIIllIllllIllllllIl = UnicodeFont.lIlIIlIIllllII[0];
                }
            }
            ++lllllllllllllIIIllIlllllIIIIlIll;
            "".length();
            if ("  ".length() == 0) {
                return null;
            }
        }
        if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIlllllIII)) {
            UnicodeFont.GL.glEnd();
        }
        if (lllIIlIlllIlIll(lllllllllllllIIIllIlllllIIIIIIIl)) {
            UnicodeFont.GL.glEndList();
            if (lllIIlIlllIllIl(this.queuedGlyphs.isEmpty() ? 1 : 0)) {
                lllllllllllllIIIllIlllllIIIIIIIl.invalid = (UnicodeFont.lIlIIlIIllllII[1] != 0);
            }
        }
        UnicodeFont.GL.glTranslatef(-lllllllllllllIIIllIllllIllllIllI, -lllllllllllllIIIllIlllllIIIIIlll, 0.0f);
        if (lllIIlIlllIlIII(lllllllllllllIIIllIlllllIIIIIIIl)) {
            lllllllllllllIIIllIlllllIIIIIIIl = new DisplayList();
        }
        lllllllllllllIIIllIlllllIIIIIIIl.width = (short)lllllllllllllIIIllIllllIlllllllI;
        lllllllllllllIIIllIlllllIIIIIIIl.height = (short)(lllllllllllllIIIllIllllIllllllII * this.getLineHeight() + lllllllllllllIIIllIllllIllllllIl);
        return lllllllllllllIIIllIlllllIIIIIIIl;
    }
    
    private static boolean lllIIlIlllIlIlI(final int lllllllllllllIIIllIlllIlIlllIlII, final int lllllllllllllIIIllIlllIlIlllIIll) {
        return lllllllllllllIIIllIlllIlIlllIlII == lllllllllllllIIIllIlllIlIlllIIll;
    }
    
    private static void lllIIlIlllIIlIl() {
        (lIlIIlIIllllII = new int[29])[0] = ((28 + 105 - 117 + 126 ^ 112 + 63 - 107 + 77) & (77 + 51 - 123 + 146 ^ 17 + 65 - 7 + 61 ^ -" ".length()));
        UnicodeFont.lIlIIlIIllllII[1] = " ".length();
        UnicodeFont.lIlIIlIIllllII[2] = (-(0xFFFFA6D3 & 0x5DAD) & (0xFFFFBEFF & 0x4DFF));
        UnicodeFont.lIlIIlIIllllII[3] = (0xFFFF976E & 0x6991);
        UnicodeFont.lIlIIlIIllllII[4] = (0xFFFFA7C2 & 0x5A3D);
        UnicodeFont.lIlIIlIIllllII[5] = -" ".length();
        UnicodeFont.lIlIIlIIllllII[6] = 106 + 176 - 158 + 66 + (82 + 28 - 21 + 49) - (40 + 144 - 128 + 141) + (0x4B ^ 0xE);
        UnicodeFont.lIlIIlIIllllII[7] = "  ".length();
        UnicodeFont.lIlIIlIIllllII[8] = "   ".length();
        UnicodeFont.lIlIIlIIllllII[9] = (0x60 ^ 0x64);
        UnicodeFont.lIlIIlIIllllII[10] = (0x19 ^ 0x1C);
        UnicodeFont.lIlIIlIIllllII[11] = (0x85 ^ 0xA5);
        UnicodeFont.lIlIIlIIllllII[12] = 82 + 116 - 71 + 128;
        UnicodeFont.lIlIIlIIllllII[13] = 26 + 96 - 105 + 111;
        UnicodeFont.lIlIIlIIllllII[14] = (0x17 ^ 0x11);
        UnicodeFont.lIlIIlIIllllII[15] = (176 + 116 - 196 + 100 ^ 194 + 103 - 292 + 190);
        UnicodeFont.lIlIIlIIllllII[16] = (0xBE ^ 0xB6);
        UnicodeFont.lIlIIlIIllllII[17] = (-(0xFFFFDD47 & 0x62FD) & (0xFFFFFF4D & 0x53F7));
        UnicodeFont.lIlIIlIIllllII[18] = (0x63 ^ 0x7C ^ (0xD5 ^ 0xC0));
        UnicodeFont.lIlIIlIIllllII[19] = (-" ".length() & (-1 & 0x10FFFF));
        UnicodeFont.lIlIIlIIllllII[20] = (0xFFFFB7FF & 0x49FF);
        UnicodeFont.lIlIIlIIllllII[21] = (43 + 60 - 1 + 62 ^ 0 + 165 - 107 + 115);
        UnicodeFont.lIlIIlIIllllII[22] = (70 + 134 - 195 + 130 ^ 5 + 39 + 50 + 34);
        UnicodeFont.lIlIIlIIllllII[23] = (0x27 ^ 0x7A ^ (0x78 ^ 0x29));
        UnicodeFont.lIlIIlIIllllII[24] = (0x86 ^ 0x8B);
        UnicodeFont.lIlIIlIIllllII[25] = (0x54 ^ 0x4F ^ (0x11 ^ 0x4));
        UnicodeFont.lIlIIlIIllllII[26] = (0x50 ^ 0x5F);
        UnicodeFont.lIlIIlIIllllII[27] = (0x4E ^ 0x5E);
        UnicodeFont.lIlIIlIIllllII[28] = (0x42 ^ 0x53);
    }
    
    public void setPaddingBottom(final int lllllllllllllIIIllIllllIIIIIIIll) {
        this.paddingBottom = lllllllllllllIIIllIllllIIIIIIIll;
    }
    
    public void addGlyphs(final int lllllllllllllIIIllIllllllIIIllIl, final int lllllllllllllIIIllIllllllIIIlIll) {
        int lllllllllllllIIIllIllllllIIlIIlI = lllllllllllllIIIllIllllllIIIllIl;
        while (lllIIlIlllIIlll(lllllllllllllIIIllIllllllIIlIIlI, lllllllllllllIIIllIllllllIIIlIll)) {
            this.addGlyphs(new String(Character.toChars(lllllllllllllIIIllIllllllIIlIIlI)));
            ++lllllllllllllIIIllIllllllIIlIIlI;
            "".length();
            if ((0x11 ^ 0x15) <= 0) {
                return;
            }
        }
    }
    
    public UnicodeFont(final java.awt.Font lllllllllllllIIIllIlllllllIlIlIl, final int lllllllllllllIIIllIlllllllIlIlII, final boolean lllllllllllllIIIllIlllllllIlIIll, final boolean lllllllllllllIIIllIlllllllIlIlll) {
        this.glyphs = new Glyph[UnicodeFont.lIlIIlIIllllII[2]][];
        this.glyphPages = new ArrayList();
        this.queuedGlyphs = new ArrayList(UnicodeFont.lIlIIlIIllllII[3]);
        this.effects = new ArrayList();
        this.glyphPageWidth = UnicodeFont.lIlIIlIIllllII[4];
        this.glyphPageHeight = UnicodeFont.lIlIIlIIllllII[4];
        this.displayListCaching = (UnicodeFont.lIlIIlIIllllII[1] != 0);
        this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
        this.displayLists = new LinkedHashMap(UnicodeFont.lIlIIlIIllllII[6], 1.0f, (boolean)(UnicodeFont.lIlIIlIIllllII[1] != 0)) {
            private static final /* synthetic */ int[] lllIllllIIlIll;
            
            private static boolean lIlIIlIlllllIlll(final Object llllllllllllIlIllIIIIIIIllIIlIll) {
                return llllllllllllIlIllIIIIIIIllIIlIll != null;
            }
            
            @Override
            protected boolean removeEldestEntry(final Map.Entry llllllllllllIlIllIIIIIIIllIlIlIl) {
                final DisplayList llllllllllllIlIllIIIIIIIllIlIlII = llllllllllllIlIllIIIIIIIllIlIlIl.getValue();
                if (lIlIIlIlllllIlll(llllllllllllIlIllIIIIIIIllIlIlII)) {
                    UnicodeFont.this.eldestDisplayListID = llllllllllllIlIllIIIIIIIllIlIlII.id;
                    "".length();
                }
                int n;
                if (lIlIIlIllllllIII(this.size(), UnicodeFont$2.lllIllllIIlIll[0])) {
                    n = UnicodeFont$2.lllIllllIIlIll[1];
                    "".length();
                    if (((0x15 ^ 0x75) & ~(0x2A ^ 0x4A)) >= " ".length()) {
                        return ((0x53 ^ 0x77) & ~(0x9F ^ 0xBB)) != 0x0;
                    }
                }
                else {
                    n = UnicodeFont$2.lllIllllIIlIll[2];
                }
                return n != 0;
            }
            
            static {
                lIlIIlIlllllIllI();
            }
            
            private static boolean lIlIIlIllllllIII(final int llllllllllllIlIllIIIIIIIllIIlllI, final int llllllllllllIlIllIIIIIIIllIIllIl) {
                return llllllllllllIlIllIIIIIIIllIIlllI > llllllllllllIlIllIIIIIIIllIIllIl;
            }
            
            private static void lIlIIlIlllllIllI() {
                (lllIllllIIlIll = new int[3])[0] = 148 + 147 - 241 + 146;
                UnicodeFont$2.lllIllllIIlIll[1] = " ".length();
                UnicodeFont$2.lllIllllIIlIll[2] = ((102 + 165 - 171 + 77 ^ 24 + 36 + 15 + 69) & (9 + 110 - 117 + 138 ^ 92 + 66 - 93 + 112 ^ -" ".length()));
            }
        };
        this.initializeFont(lllllllllllllIIIllIlllllllIlIlIl, lllllllllllllIIIllIlllllllIlIlII, lllllllllllllIIIllIlllllllIlIIll, lllllllllllllIIIllIlllllllIlIlll);
    }
    
    public int getGlyphPageWidth() {
        return this.glyphPageWidth;
    }
    
    public int getPaddingAdvanceY() {
        return this.paddingAdvanceY;
    }
    
    public void setPaddingLeft(final int lllllllllllllIIIllIllllIIIIIllII) {
        this.paddingLeft = lllllllllllllIIIllIllllIIIIIllII;
    }
    
    public int getYOffset(String lllllllllllllIIIllIllllIIIlIIlll) {
        if (lllIIlIlllIlIII(lllllllllllllIIIllIllllIIIlIIlll)) {
            throw new IllegalArgumentException(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[22]]);
        }
        DisplayList lllllllllllllIIIllIllllIIIlIllIl = null;
        if (lllIIlIlllIIllI(this.displayListCaching ? 1 : 0)) {
            lllllllllllllIIIllIllllIIIlIllIl = this.displayLists.get(lllllllllllllIIIllIllllIIIlIIlll);
            if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIIIlIllIl) && lllIIlIlllIlIll(lllllllllllllIIIllIllllIIIlIllIl.yOffset)) {
                return lllllllllllllIIIllIllllIIIlIllIl.yOffset;
            }
        }
        final int lllllllllllllIIIllIllllIIIlIllII = ((String)lllllllllllllIIIllIllllIIIlIIlll).indexOf(UnicodeFont.lIlIIlIIllllII[18]);
        if (lllIIlIlllIlllI(lllllllllllllIIIllIllllIIIlIllII, UnicodeFont.lIlIIlIIllllII[5])) {
            lllllllllllllIIIllIllllIIIlIIlll = ((String)lllllllllllllIIIllIllllIIIlIIlll).substring(UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllIIIlIllII);
        }
        final char[] lllllllllllllIIIllIllllIIIlIlIll = ((String)lllllllllllllIIIllIllllIIIlIIlll).toCharArray();
        final GlyphVector lllllllllllllIIIllIllllIIIlIlIlI = this.font.layoutGlyphVector(GlyphPage.renderContext, lllllllllllllIIIllIllllIIIlIlIll, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllIIIlIlIll.length, UnicodeFont.lIlIIlIIllllII[0]);
        final int lllllllllllllIIIllIllllIIIlIlIIl = this.ascent + lllllllllllllIIIllIllllIIIlIlIlI.getPixelBounds(null, 0.0f, 0.0f).y;
        if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIIIlIllIl)) {
            lllllllllllllIIIllIllllIIIlIllIl.yOffset = new Short((short)lllllllllllllIIIllIllllIIIlIlIIl);
        }
        return lllllllllllllIIIllIllllIIIlIlIIl;
    }
    
    public void setGlyphPageHeight(final int lllllllllllllIIIllIlllIlllIIlIII) {
        this.glyphPageHeight = lllllllllllllIIIllIlllIlllIIlIII;
    }
    
    public void drawString(final float lllllllllllllIIIllIllllIlIllllll, final float lllllllllllllIIIllIllllIllIIIIlI, final String lllllllllllllIIIllIllllIllIIIIIl) {
        this.drawString(lllllllllllllIIIllIllllIlIllllll, lllllllllllllIIIllIllllIllIIIIlI, lllllllllllllIIIllIllllIllIIIIIl, Color.white);
    }
    
    private static java.awt.Font createFont(final String lllllllllllllIIIlllIIIIIIIIllllI) throws SlickException {
        try {
            return java.awt.Font.createFont(UnicodeFont.lIlIIlIIllllII[0], ResourceLoader.getResourceAsStream(lllllllllllllIIIlllIIIIIIIIllllI));
        }
        catch (FontFormatException lllllllllllllIIIlllIIIIIIIlIIIIl) {
            throw new SlickException(String.valueOf(new StringBuilder().append(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[0]]).append(lllllllllllllIIIlllIIIIIIIIllllI)), lllllllllllllIIIlllIIIIIIIlIIIIl);
        }
        catch (IOException lllllllllllllIIIlllIIIIIIIlIIIII) {
            throw new SlickException(String.valueOf(new StringBuilder().append(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[1]]).append(lllllllllllllIIIlllIIIIIIIIllllI)), lllllllllllllIIIlllIIIIIIIlIIIII);
        }
    }
    
    public List getGlyphPages() {
        return this.glyphPages;
    }
    
    public void setGlyphPageWidth(final int lllllllllllllIIIllIlllIlllIlIIll) {
        this.glyphPageWidth = lllllllllllllIIIllIlllIlllIlIIll;
    }
    
    public void clearGlyphs() {
        int lllllllllllllIIIllIlllllIIlllIII = UnicodeFont.lIlIIlIIllllII[0];
        while (lllIIlIlllIlIIl(lllllllllllllIIIllIlllllIIlllIII, UnicodeFont.lIlIIlIIllllII[2])) {
            this.glyphs[lllllllllllllIIIllIlllllIIlllIII] = null;
            ++lllllllllllllIIIllIlllllIIlllIII;
            "".length();
            if (null != null) {
                return;
            }
        }
        final Iterator lllllllllllllIIIllIlllllIIllIlIl = this.glyphPages.iterator();
        while (lllIIlIlllIIllI(lllllllllllllIIIllIlllllIIllIlIl.hasNext() ? 1 : 0)) {
            final GlyphPage lllllllllllllIIIllIlllllIIllIllI = lllllllllllllIIIllIlllllIIllIlIl.next();
            try {
                lllllllllllllIIIllIlllllIIllIllI.getImage().destroy();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (SlickException ex) {}
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        this.glyphPages.clear();
        if (lllIIlIlllIlllI(this.baseDisplayListID, UnicodeFont.lIlIIlIIllllII[5])) {
            UnicodeFont.GL.glDeleteLists(this.baseDisplayListID, this.displayLists.size());
            this.baseDisplayListID = UnicodeFont.lIlIIlIIllllII[5];
        }
        this.queuedGlyphs.clear();
        this.missingGlyph = null;
    }
    
    public java.awt.Font getFont() {
        return this.font;
    }
    
    public int getPaddingTop() {
        return this.paddingTop;
    }
    
    public String getFontFile() {
        if (lllIIlIlllIlIII(this.ttfFileRef)) {
            try {
                final Class<?> forName = Class.forName(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[23]]);
                final String name = UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[24]];
                final Class[] parameterTypes = new Class[UnicodeFont.lIlIIlIIllllII[1]];
                parameterTypes[UnicodeFont.lIlIIlIIllllII[0]] = java.awt.Font.class;
                final Method declaredMethod = forName.getDeclaredMethod(name, (Class[])parameterTypes);
                final Object obj = null;
                final Object[] args = new Object[UnicodeFont.lIlIIlIIllllII[1]];
                args[UnicodeFont.lIlIIlIIllllII[0]] = this.font;
                final Object lllllllllllllIIIllIlllIllIllIlIl = declaredMethod.invoke(obj, args);
                final Field lllllllllllllIIIllIlllIllIllIlII = Class.forName(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[25]]).getDeclaredField(UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[26]]);
                lllllllllllllIIIllIlllIllIllIlII.setAccessible((boolean)(UnicodeFont.lIlIIlIIllllII[1] != 0));
                this.ttfFileRef = (String)lllllllllllllIIIllIlllIllIllIlII.get(lllllllllllllIIIllIlllIllIllIlIl);
                "".length();
                if (-" ".length() >= 0) {
                    return null;
                }
            }
            catch (Throwable t) {}
            if (lllIIlIlllIlIII(this.ttfFileRef)) {
                this.ttfFileRef = UnicodeFont.lIlIIlIIlllIlI[UnicodeFont.lIlIIlIIllllII[27]];
            }
        }
        if (lllIIlIlllIllIl(this.ttfFileRef.length())) {
            return null;
        }
        return this.ttfFileRef;
    }
    
    public void drawString(final float lllllllllllllIIIllIllllIlIllIIIl, final float lllllllllllllIIIllIllllIlIllIIII, final String lllllllllllllIIIllIllllIlIllIlII, final Color lllllllllllllIIIllIllllIlIllIIll) {
        this.drawString(lllllllllllllIIIllIllllIlIllIIIl, lllllllllllllIIIllIllllIlIllIIII, lllllllllllllIIIllIllllIlIllIlII, lllllllllllllIIIllIllllIlIllIIll, UnicodeFont.lIlIIlIIllllII[0], lllllllllllllIIIllIllllIlIllIlII.length());
    }
    
    public void setPaddingAdvanceY(final int lllllllllllllIIIllIlllIllllIlIII) {
        this.paddingAdvanceY = lllllllllllllIIIllIlllIllllIlIII;
    }
    
    private Glyph getGlyph(final int lllllllllllllIIIllIllllIlIIllIII, final int lllllllllllllIIIllIllllIlIlIIIIl, final Rectangle lllllllllllllIIIllIllllIlIlIIIII, final GlyphVector lllllllllllllIIIllIllllIlIIlIlIl, final int lllllllllllllIIIllIllllIlIIlIlII) {
        if (!lllIIlIllllIIII(lllllllllllllIIIllIllllIlIIllIII) || lllIIlIllllIIIl(lllllllllllllIIIllIllllIlIIllIII, UnicodeFont.lIlIIlIIllllII[19])) {
            return new Glyph(lllllllllllllIIIllIllllIlIlIIIIl, lllllllllllllIIIllIllllIlIlIIIII, lllllllllllllIIIllIllllIlIIlIlIl, lllllllllllllIIIllIllllIlIIlIlII, this) {
                private static final /* synthetic */ int[] lIIllIIIllIIII;
                
                @Override
                public boolean isMissing() {
                    return UnicodeFont$3.lIIllIIIllIIII[0] != 0;
                }
                
                private static void llIlIllIlIIIIlI() {
                    (lIIllIIIllIIII = new int[1])[0] = " ".length();
                }
                
                static {
                    llIlIllIlIIIIlI();
                }
            };
        }
        final int lllllllllllllIIIllIllllIlIIlllIl = lllllllllllllIIIllIllllIlIIllIII / UnicodeFont.lIlIIlIIllllII[4];
        final int lllllllllllllIIIllIllllIlIIlllII = lllllllllllllIIIllIllllIlIIllIII & UnicodeFont.lIlIIlIIllllII[20];
        Glyph lllllllllllllIIIllIllllIlIIllIll = null;
        Glyph[] lllllllllllllIIIllIllllIlIIllIlI = this.glyphs[lllllllllllllIIIllIllllIlIIlllIl];
        if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIlIIllIlI)) {
            lllllllllllllIIIllIllllIlIIllIll = lllllllllllllIIIllIllllIlIIllIlI[lllllllllllllIIIllIllllIlIIlllII];
            if (lllIIlIlllIlIll(lllllllllllllIIIllIllllIlIIllIll)) {
                return lllllllllllllIIIllIllllIlIIllIll;
            }
        }
        else {
            final Glyph[][] glyphs = this.glyphs;
            final int n = lllllllllllllIIIllIllllIlIIlllIl;
            final Glyph[] array = new Glyph[UnicodeFont.lIlIIlIIllllII[4]];
            glyphs[n] = array;
            lllllllllllllIIIllIllllIlIIllIlI = array;
        }
        final Glyph[] array2 = lllllllllllllIIIllIllllIlIIllIlI;
        final int n2 = lllllllllllllIIIllIllllIlIIlllII;
        final Glyph glyph = new Glyph(lllllllllllllIIIllIllllIlIlIIIIl, lllllllllllllIIIllIllllIlIlIIIII, lllllllllllllIIIllIllllIlIIlIlIl, lllllllllllllIIIllIllllIlIIlIlII, this);
        array2[n2] = glyph;
        lllllllllllllIIIllIllllIlIIllIll = glyph;
        this.queuedGlyphs.add(lllllllllllllIIIllIllllIlIIllIll);
        "".length();
        return lllllllllllllIIIllIllllIlIIllIll;
    }
    
    public static class DisplayList
    {
        public /* synthetic */ short width;
        /* synthetic */ int id;
        /* synthetic */ Short yOffset;
        /* synthetic */ boolean invalid;
        public /* synthetic */ short height;
        
        DisplayList() {
        }
    }
}
