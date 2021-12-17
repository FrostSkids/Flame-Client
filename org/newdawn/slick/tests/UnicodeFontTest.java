// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.font.effects.ColorEffect;
import java.awt.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import java.io.IOException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Input;
import org.newdawn.slick.UnicodeFont;
import org.newdawn.slick.BasicGame;

public class UnicodeFontTest extends BasicGame
{
    private /* synthetic */ UnicodeFont unicodeFont;
    private static final /* synthetic */ int[] lIlIIllIlllIII;
    private static final /* synthetic */ String[] lIlIIllIllIlll;
    
    public static void main(final String[] lllllllllllllIIIllIIlIIIlllIlIll) throws IOException, SlickException {
        Input.disableControllers();
        final AppGameContainer lllllllllllllIIIllIIlIIIlllIlIlI = new AppGameContainer(new UnicodeFontTest());
        lllllllllllllIIIllIIlIIIlllIlIlI.setDisplayMode(UnicodeFontTest.lIlIIllIlllIII[6], UnicodeFontTest.lIlIIllIlllIII[7], (boolean)(UnicodeFontTest.lIlIIllIlllIII[0] != 0));
        lllllllllllllIIIllIIlIIIlllIlIlI.setTargetFrameRate(UnicodeFontTest.lIlIIllIlllIII[8]);
        lllllllllllllIIIllIIlIIIlllIlIlI.start();
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIllIIlIIIlllIllll, final int lllllllllllllIIIllIIlIIIlllIlllI) throws SlickException {
        this.unicodeFont.loadGlyphs(UnicodeFontTest.lIlIIllIlllIII[1]);
        "".length();
    }
    
    private static void lllIlIIIIllIlIl() {
        (lIlIIllIlllIII = new int[10])[0] = ((0x94 ^ 0xA4) & ~(0x5A ^ 0x6A));
        UnicodeFontTest.lIlIIllIlllIII[1] = " ".length();
        UnicodeFontTest.lIlIIllIlllIII[2] = (163 + 41 - 29 + 0 ^ 68 + 149 - 138 + 80);
        UnicodeFontTest.lIlIIllIlllIII[3] = "  ".length();
        UnicodeFontTest.lIlIIllIlllIII[4] = (0x5D ^ 0x7C);
        UnicodeFontTest.lIlIIllIlllIII[5] = "   ".length();
        UnicodeFontTest.lIlIIllIlllIII[6] = (-(0xFFFFFDF7 & 0x677D) & (0xFFFFF7FC & 0x6F77));
        UnicodeFontTest.lIlIIllIlllIII[7] = (-(0xFFFFFFEF & 0x3D93) & (0xFFFFBFFA & 0x7FDF));
        UnicodeFontTest.lIlIIllIlllIII[8] = (0x40 ^ 0x54);
        UnicodeFontTest.lIlIIllIlllIII[9] = (0xDB ^ 0x85 ^ (0x1C ^ 0x46));
    }
    
    private static void lllIlIIIIllIlII() {
        (lIlIIllIllIlll = new String[UnicodeFontTest.lIlIIllIlllIII[9]])[UnicodeFontTest.lIlIIllIlllIII[0]] = lllIlIIIIllIIll("Py0IMVEtJxUx", "yBfEq");
        UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[1]] = lllIlIIIIllIIll("DnhgMicDJiAyPUIkICs6Hm0uNycMLmExOgs=", "mBOEN");
        UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[3]] = lllIlIIIIllIIll("IAIdFXodGVQzNB0JGwI/MgUaEnt+IwBGKBsJHxx0VCERFDQdBBNceiBG", "tjtfZ");
        UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[5]] = lllIlIIIIllIIll("Omsha3dlaUVvCxsVTGc=", "DJaJT");
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIllIIlIIlIIIIIIIl) throws SlickException {
        lllllllllllllIIIllIIlIIlIIIIIIIl.setShowFPS((boolean)(UnicodeFontTest.lIlIIllIlllIII[0] != 0));
        this.unicodeFont = new UnicodeFont(UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[1]], UnicodeFontTest.lIlIIllIlllIII[2], (boolean)(UnicodeFontTest.lIlIIllIlllIII[0] != 0), (boolean)(UnicodeFontTest.lIlIIllIlllIII[0] != 0));
        this.unicodeFont.getEffects().add(new ColorEffect(Color.white));
        "".length();
        lllllllllllllIIIllIIlIIlIIIIIIIl.getGraphics().setBackground(org.newdawn.slick.Color.darkGray);
    }
    
    private static String lllIlIIIIllIIll(String lllllllllllllIIIllIIlIIIllIllIIl, final String lllllllllllllIIIllIIlIIIllIllIII) {
        lllllllllllllIIIllIIlIIIllIllIIl = new String(Base64.getDecoder().decode(lllllllllllllIIIllIIlIIIllIllIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIIlIIIllIlllII = new StringBuilder();
        final char[] lllllllllllllIIIllIIlIIIllIllIll = lllllllllllllIIIllIIlIIIllIllIII.toCharArray();
        int lllllllllllllIIIllIIlIIIllIllIlI = UnicodeFontTest.lIlIIllIlllIII[0];
        final byte lllllllllllllIIIllIIlIIIllIlIlII = (Object)lllllllllllllIIIllIIlIIIllIllIIl.toCharArray();
        final boolean lllllllllllllIIIllIIlIIIllIlIIll = lllllllllllllIIIllIIlIIIllIlIlII.length != 0;
        char lllllllllllllIIIllIIlIIIllIlIIlI = (char)UnicodeFontTest.lIlIIllIlllIII[0];
        while (lllIlIIIIllIllI(lllllllllllllIIIllIIlIIIllIlIIlI, lllllllllllllIIIllIIlIIIllIlIIll ? 1 : 0)) {
            final char lllllllllllllIIIllIIlIIIllIlllll = lllllllllllllIIIllIIlIIIllIlIlII[lllllllllllllIIIllIIlIIIllIlIIlI];
            lllllllllllllIIIllIIlIIIllIlllII.append((char)(lllllllllllllIIIllIIlIIIllIlllll ^ lllllllllllllIIIllIIlIIIllIllIll[lllllllllllllIIIllIIlIIIllIllIlI % lllllllllllllIIIllIIlIIIllIllIll.length]));
            "".length();
            ++lllllllllllllIIIllIIlIIIllIllIlI;
            ++lllllllllllllIIIllIIlIIIllIlIIlI;
            "".length();
            if ((70 + 6 - 0 + 66 ^ 56 + 131 - 63 + 14) == 0x0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIIlIIIllIlllII);
    }
    
    public UnicodeFontTest() {
        super(UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[0]]);
    }
    
    public void render(final GameContainer lllllllllllllIIIllIIlIIIlllllIIl, final Graphics lllllllllllllIIIllIIlIIIllllIlII) {
        lllllllllllllIIIllIIlIIIllllIlII.setColor(org.newdawn.slick.Color.white);
        final String lllllllllllllIIIllIIlIIIllllIlll = UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[3]];
        this.unicodeFont.drawString(10.0f, 33.0f, lllllllllllllIIIllIIlIIIllllIlll);
        lllllllllllllIIIllIIlIIIllllIlII.setColor(org.newdawn.slick.Color.red);
        lllllllllllllIIIllIIlIIIllllIlII.drawRect(10.0f, 33.0f, (float)this.unicodeFont.getWidth(lllllllllllllIIIllIIlIIIllllIlll), (float)this.unicodeFont.getLineHeight());
        lllllllllllllIIIllIIlIIIllllIlII.setColor(org.newdawn.slick.Color.blue);
        final int lllllllllllllIIIllIIlIIIllllIllI = this.unicodeFont.getYOffset(lllllllllllllIIIllIIlIIIllllIlll);
        lllllllllllllIIIllIIlIIIllllIlII.drawRect(10.0f, (float)(UnicodeFontTest.lIlIIllIlllIII[4] + lllllllllllllIIIllIIlIIIllllIllI), (float)this.unicodeFont.getWidth(lllllllllllllIIIllIIlIIIllllIlll), (float)(this.unicodeFont.getHeight(lllllllllllllIIIllIIlIIIllllIlll) - lllllllllllllIIIllIIlIIIllllIllI));
        this.unicodeFont.addGlyphs(UnicodeFontTest.lIlIIllIllIlll[UnicodeFontTest.lIlIIllIlllIII[5]]);
    }
    
    private static boolean lllIlIIIIllIllI(final int lllllllllllllIIIllIIlIIIllIIlllI, final int lllllllllllllIIIllIIlIIIllIIllIl) {
        return lllllllllllllIIIllIIlIIIllIIlllI < lllllllllllllIIIllIIlIIIllIIllIl;
    }
    
    static {
        lllIlIIIIllIlIl();
        lllIlIIIIllIlII();
    }
}
