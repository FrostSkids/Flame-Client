// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.io.UnsupportedEncodingException;
import org.newdawn.slick.util.Log;

public class SpriteSheetFont implements Font
{
    private /* synthetic */ char startingCharacter;
    private /* synthetic */ int charHeight;
    private static final /* synthetic */ int[] lIIIIlIIllllll;
    private /* synthetic */ int horizontalCount;
    private static final /* synthetic */ String[] lIIIIlIIllllIl;
    private /* synthetic */ SpriteSheet font;
    private /* synthetic */ int numChars;
    private /* synthetic */ int charWidth;
    
    public void drawString(final float lllllllllllllIlIIlIllllIIlIlIIlI, final float lllllllllllllIlIIlIllllIIlIIIlIl, final String lllllllllllllIlIIlIllllIIlIIlllI, final Color lllllllllllllIlIIlIllllIIlIIIIIl, final int lllllllllllllIlIIlIllllIIlIIlIlI, final int lllllllllllllIlIIlIllllIIlIIlIIl) {
        try {
            final byte[] lllllllllllllIlIIlIllllIIlIlIllI = lllllllllllllIlIIlIllllIIlIIlllI.getBytes(SpriteSheetFont.lIIIIlIIllllIl[SpriteSheetFont.lIIIIlIIllllll[0]]);
            int lllllllllllllIlIIlIllllIIlIlIlll = SpriteSheetFont.lIIIIlIIllllll[0];
            while (lIlllIIlIIlIIlI(lllllllllllllIlIIlIllllIIlIlIlll, lllllllllllllIlIIlIllllIIlIlIllI.length)) {
                final int lllllllllllllIlIIlIllllIIlIllIII = lllllllllllllIlIIlIllllIIlIlIllI[lllllllllllllIlIIlIllllIIlIlIlll] - this.startingCharacter;
                if (lIlllIIlIIlIIlI(lllllllllllllIlIIlIllllIIlIllIII, this.numChars)) {
                    final int lllllllllllllIlIIlIllllIIlIllIlI = lllllllllllllIlIIlIllllIIlIllIII % this.horizontalCount;
                    final int lllllllllllllIlIIlIllllIIlIllIIl = lllllllllllllIlIIlIllllIIlIllIII / this.horizontalCount;
                    if (!lIlllIIlIIlIIlI(lllllllllllllIlIIlIllllIIlIlIlll, lllllllllllllIlIIlIllllIIlIIlIlI) || lIlllIIlIIlIIll(lllllllllllllIlIIlIllllIIlIlIlll, lllllllllllllIlIIlIllllIIlIIlIIl)) {
                        this.font.getSprite(lllllllllllllIlIIlIllllIIlIllIlI, lllllllllllllIlIIlIllllIIlIllIIl).draw(lllllllllllllIlIIlIllllIIlIlIIlI + lllllllllllllIlIIlIllllIIlIlIlll * this.charWidth, lllllllllllllIlIIlIllllIIlIIIlIl, lllllllllllllIlIIlIllllIIlIIIIIl);
                    }
                }
                ++lllllllllllllIlIIlIllllIIlIlIlll;
                "".length();
                if ("  ".length() >= "   ".length()) {
                    return;
                }
            }
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (UnsupportedEncodingException lllllllllllllIlIIlIllllIIlIlIlIl) {
            Log.error(lllllllllllllIlIIlIllllIIlIlIlIl);
        }
    }
    
    private static String lIlllIIlIIIllII(String lllllllllllllIlIIlIllllIIIIlIIll, final String lllllllllllllIlIIlIllllIIIIlIIlI) {
        lllllllllllllIlIIlIllllIIIIlIIll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIllllIIIIlIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIllllIIIIlIllI = new StringBuilder();
        final char[] lllllllllllllIlIIlIllllIIIIlIlIl = lllllllllllllIlIIlIllllIIIIlIIlI.toCharArray();
        int lllllllllllllIlIIlIllllIIIIlIlII = SpriteSheetFont.lIIIIlIIllllll[0];
        final Exception lllllllllllllIlIIlIllllIIIIIlllI = (Object)lllllllllllllIlIIlIllllIIIIlIIll.toCharArray();
        final Exception lllllllllllllIlIIlIllllIIIIIllIl = (Exception)lllllllllllllIlIIlIllllIIIIIlllI.length;
        String lllllllllllllIlIIlIllllIIIIIllII = (String)SpriteSheetFont.lIIIIlIIllllll[0];
        while (lIlllIIlIIlIIlI((int)lllllllllllllIlIIlIllllIIIIIllII, (int)lllllllllllllIlIIlIllllIIIIIllIl)) {
            final char lllllllllllllIlIIlIllllIIIIllIIl = lllllllllllllIlIIlIllllIIIIIlllI[lllllllllllllIlIIlIllllIIIIIllII];
            lllllllllllllIlIIlIllllIIIIlIllI.append((char)(lllllllllllllIlIIlIllllIIIIllIIl ^ lllllllllllllIlIIlIllllIIIIlIlIl[lllllllllllllIlIIlIllllIIIIlIlII % lllllllllllllIlIIlIllllIIIIlIlIl.length]));
            "".length();
            ++lllllllllllllIlIIlIllllIIIIlIlII;
            ++lllllllllllllIlIIlIllllIIIIIllII;
            "".length();
            if (-" ".length() > "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIllllIIIIlIllI);
    }
    
    public int getHeight(final String lllllllllllllIlIIlIllllIIIllIlIl) {
        return this.charHeight;
    }
    
    private static boolean lIlllIIlIIlIIlI(final int lllllllllllllIlIIlIllllIIIIIlIII, final int lllllllllllllIlIIlIllllIIIIIIlll) {
        return lllllllllllllIlIIlIllllIIIIIlIII < lllllllllllllIlIIlIllllIIIIIIlll;
    }
    
    public int getWidth(final String lllllllllllllIlIIlIllllIIIlIlIIl) {
        return this.charWidth * lllllllllllllIlIIlIllllIIIlIlIIl.length();
    }
    
    private static boolean lIlllIIlIIlIIll(final int lllllllllllllIlIIlIllllIIIIIIlII, final int lllllllllllllIlIIlIllllIIIIIIIll) {
        return lllllllllllllIlIIlIllllIIIIIIlII <= lllllllllllllIlIIlIllllIIIIIIIll;
    }
    
    public int getLineHeight() {
        return this.charHeight;
    }
    
    public SpriteSheetFont(final SpriteSheet lllllllllllllIlIIlIllllIlIIIlllI, final char lllllllllllllIlIIlIllllIlIIIllIl) {
        this.font = lllllllllllllIlIIlIllllIlIIIlllI;
        this.startingCharacter = lllllllllllllIlIIlIllllIlIIIllIl;
        this.horizontalCount = lllllllllllllIlIIlIllllIlIIIlllI.getHorizontalCount();
        final int lllllllllllllIlIIlIllllIlIIIllII = lllllllllllllIlIIlIllllIlIIIlllI.getVerticalCount();
        this.charWidth = lllllllllllllIlIIlIllllIlIIIlllI.getWidth() / this.horizontalCount;
        this.charHeight = lllllllllllllIlIIlIllllIlIIIlllI.getHeight() / lllllllllllllIlIIlIllllIlIIIllII;
        this.numChars = this.horizontalCount * lllllllllllllIlIIlIllllIlIIIllII;
    }
    
    private static void lIlllIIlIIIllIl() {
        (lIIIIlIIllllIl = new String[SpriteSheetFont.lIIIIlIIllllll[1]])[SpriteSheetFont.lIIIIlIIllllll[0]] = lIlllIIlIIIllII("NCJ9LhAiOBk=", "aqPoC");
    }
    
    private static void lIlllIIlIIlIIII() {
        (lIIIIlIIllllll = new int[2])[0] = ((0x77 ^ 0x1D ^ (0xA0 ^ 0x86)) & (0x4B ^ 0x3C ^ (0x21 ^ 0x1A) ^ -" ".length()));
        SpriteSheetFont.lIIIIlIIllllll[1] = " ".length();
    }
    
    public void drawString(final float lllllllllllllIlIIlIllllIlIIIIIlI, final float lllllllllllllIlIIlIllllIIlllllIl, final String lllllllllllllIlIIlIllllIlIIIIIII) {
        this.drawString(lllllllllllllIlIIlIllllIlIIIIIlI, lllllllllllllIlIIlIllllIIlllllIl, lllllllllllllIlIIlIllllIlIIIIIII, Color.white);
    }
    
    static {
        lIlllIIlIIlIIII();
        lIlllIIlIIIllIl();
    }
    
    public void drawString(final float lllllllllllllIlIIlIllllIIlllIIII, final float lllllllllllllIlIIlIllllIIllIllll, final String lllllllllllllIlIIlIllllIIllIllIl, final Color lllllllllllllIlIIlIllllIIlllIIlI) {
        this.drawString(lllllllllllllIlIIlIllllIIlllIIII, lllllllllllllIlIIlIllllIIllIllll, lllllllllllllIlIIlIllllIIllIllIl, lllllllllllllIlIIlIllllIIlllIIlI, SpriteSheetFont.lIIIIlIIllllll[0], lllllllllllllIlIIlIllllIIllIllIl.length() - SpriteSheetFont.lIIIIlIIllllll[1]);
    }
}
