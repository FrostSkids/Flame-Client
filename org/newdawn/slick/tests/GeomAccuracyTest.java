// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.geom.RoundedRectangle;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
import org.newdawn.slick.geom.Ellipse;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Color;
import org.newdawn.slick.BasicGame;

public class GeomAccuracyTest extends BasicGame
{
    private /* synthetic */ Color overlayColor;
    private /* synthetic */ Image magImage;
    private /* synthetic */ Color geomColor;
    private /* synthetic */ int colorIndex;
    private static final /* synthetic */ int[] lllIlIIllllIlI;
    private /* synthetic */ boolean hideOverlay;
    private /* synthetic */ GameContainer container;
    private /* synthetic */ int curTest;
    private static final /* synthetic */ String[] lllIlIIllIllII;
    
    @Override
    public void init(final GameContainer llllllllllllIlIllIlllIIlIllllIlI) throws SlickException {
        this.container = llllllllllllIlIllIlllIIlIllllIlI;
        this.geomColor = Color.magenta;
        this.overlayColor = Color.white;
        this.magImage = new Image(GeomAccuracyTest.lllIlIIllllIlI[1], GeomAccuracyTest.lllIlIIllllIlI[1]);
    }
    
    void ovalTest(final Graphics llllllllllllIlIllIlllIIlIllIIIII) {
        llllllllllllIlIllIlllIIlIllIIIII.setColor(this.geomColor);
        llllllllllllIlIllIlllIIlIllIIIII.drawOval(100.0f, 100.0f, 99.0f, 99.0f);
        llllllllllllIlIllIlllIIlIllIIIII.fillOval(100.0f, 250.0f, 99.0f, 99.0f);
        Ellipse llllllllllllIlIllIlllIIlIllIIIlI = new Ellipse(449.0f, 149.0f, 49.0f, 49.0f);
        llllllllllllIlIllIlllIIlIllIIIII.draw(llllllllllllIlIllIlllIIlIllIIIlI);
        llllllllllllIlIllIlllIIlIllIIIlI = new Ellipse(449.0f, 299.0f, 49.0f, 49.0f);
        llllllllllllIlIllIlllIIlIllIIIII.fill(llllllllllllIlIllIlllIIlIllIIIlI);
        if (lIlIIIlIlIIIllIl(this.hideOverlay ? 1 : 0)) {
            llllllllllllIlIllIlllIIlIllIIIII.setColor(this.overlayColor);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(100.0f, 149.0f, 198.0f, 149.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(149.0f, 100.0f, 149.0f, 198.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(100.0f, 299.0f, 198.0f, 299.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(149.0f, 250.0f, 149.0f, 348.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(400.0f, 149.0f, 498.0f, 149.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(449.0f, 100.0f, 449.0f, 198.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(400.0f, 299.0f, 498.0f, 299.0f);
            llllllllllllIlIllIlllIIlIllIIIII.drawLine(449.0f, 250.0f, 449.0f, 348.0f);
        }
    }
    
    private static boolean lIlIIIlIlIIIllIl(final int llllllllllllIlIllIlllIIlIIIIIlIl) {
        return llllllllllllIlIllIlllIIlIIIIIlIl == 0;
    }
    
    void arcTest(final Graphics llllllllllllIlIllIlllIIlIllIlIlI) {
        if (lIlIIIlIlIIIllIl(this.hideOverlay ? 1 : 0)) {
            llllllllllllIlIllIlllIIlIllIlIlI.setColor(this.overlayColor);
            llllllllllllIlIllIlllIIlIllIlIlI.drawLine(198.0f, 100.0f, 198.0f, 198.0f);
            llllllllllllIlIllIlllIIlIllIlIlI.drawLine(100.0f, 198.0f, 198.0f, 198.0f);
        }
        llllllllllllIlIllIlllIIlIllIlIlI.setColor(this.geomColor);
        llllllllllllIlIllIlllIIlIllIlIlI.drawArc(100.0f, 100.0f, 99.0f, 99.0f, 0.0f, 90.0f);
    }
    
    private static void lIlIIIlIlIIIllII() {
        (lllIlIIllllIlI = new int[23])[0] = ((50 + 167 - 185 + 145 ^ 55 + 150 - 54 + 35) & (0xAE ^ 0xC3 ^ (0x66 ^ 0x0) ^ -" ".length()));
        GeomAccuracyTest.lllIlIIllllIlI[1] = (159 + 118 - 141 + 28 ^ 172 + 43 - 183 + 145);
        GeomAccuracyTest.lllIlIIllllIlI[2] = " ".length();
        GeomAccuracyTest.lllIlIIllllIlI[3] = "  ".length();
        GeomAccuracyTest.lllIlIIllllIlI[4] = "   ".length();
        GeomAccuracyTest.lllIlIIllllIlI[5] = (0xAA ^ 0xAE);
        GeomAccuracyTest.lllIlIIllllIlI[6] = (0xBE ^ 0x87 ^ (0x2C ^ 0x10));
        GeomAccuracyTest.lllIlIIllllIlI[7] = (0x6C ^ 0x6A);
        GeomAccuracyTest.lllIlIIllllIlI[8] = (0xBD ^ 0xBA);
        GeomAccuracyTest.lllIlIIllllIlI[9] = (0xBC ^ 0x8E ^ (0x7A ^ 0x40));
        GeomAccuracyTest.lllIlIIllllIlI[10] = (0xE2 ^ 0x95 ^ (0x6B ^ 0x15));
        GeomAccuracyTest.lllIlIIllllIlI[11] = (0xBF ^ 0xB5);
        GeomAccuracyTest.lllIlIIllllIlI[12] = (0x16 ^ 0x1D);
        GeomAccuracyTest.lllIlIIllllIlI[13] = (0x2C ^ 0x7A ^ (0x9D ^ 0xC7));
        GeomAccuracyTest.lllIlIIllllIlI[14] = (0x7C ^ 0x60 ^ (0x9F ^ 0x8E));
        GeomAccuracyTest.lllIlIIllllIlI[15] = (0x92 ^ 0xA1 ^ (0x16 ^ 0x2B));
        GeomAccuracyTest.lllIlIIllllIlI[16] = (0xA4 ^ 0xAB);
        GeomAccuracyTest.lllIlIIllllIlI[17] = (22 + 109 - 3 + 16 ^ 130 + 50 - 135 + 116);
        GeomAccuracyTest.lllIlIIllllIlI[18] = (0xA8 ^ 0x86);
        GeomAccuracyTest.lllIlIIllllIlI[19] = (0x35 ^ 0x74 ^ (0xDD ^ 0x88));
        GeomAccuracyTest.lllIlIIllllIlI[20] = (0xFFFFB7B9 & 0x4B66);
        GeomAccuracyTest.lllIlIIllllIlI[21] = (-(0xFFFFBD3F & 0x7FE1) & (0xFFFFBFFD & 0x7F7A));
        GeomAccuracyTest.lllIlIIllllIlI[22] = (0x46 ^ 0x56);
    }
    
    public void render(final GameContainer llllllllllllIlIllIlllIIlIlllIIII, final Graphics llllllllllllIlIllIlllIIlIlllIIll) {
        String llllllllllllIlIllIlllIIlIlllIIlI = new String();
        switch (this.curTest) {
            case 0: {
                llllllllllllIlIllIlllIIlIlllIIlI = GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[2]];
                this.rectTest(llllllllllllIlIllIlllIIlIlllIIll);
                "".length();
                if (-"  ".length() > 0) {
                    return;
                }
                break;
            }
            case 1: {
                llllllllllllIlIllIlllIIlIlllIIlI = GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[3]];
                this.ovalTest(llllllllllllIlIllIlllIIlIlllIIll);
                "".length();
                if ("  ".length() > "   ".length()) {
                    return;
                }
                break;
            }
            case 2: {
                llllllllllllIlIllIlllIIlIlllIIlI = GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[4]];
                this.arcTest(llllllllllllIlIllIlllIIlIlllIIll);
                break;
            }
        }
        llllllllllllIlIllIlllIIlIlllIIll.setColor(Color.white);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[5]], 200.0f, 55.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[6]], 200.0f, 35.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[7]], 200.0f, 15.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[8]], 400.0f, 35.0f);
        llllllllllllIlIllIlllIIlIlllIIll.setColor(Color.blue);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(llllllllllllIlIllIlllIIlIlllIIlI, 485.0f, 35.0f);
        llllllllllllIlIllIlllIIlIlllIIll.setColor(Color.white);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[9]], 10.0f, 150.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[10]], 10.0f, 300.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[11]], 125.0f, 400.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[12]], 450.0f, 400.0f);
        llllllllllllIlIllIlllIIlIlllIIll.copyArea(this.magImage, llllllllllllIlIllIlllIIlIlllIIII.getInput().getMouseX() - GeomAccuracyTest.lllIlIIllllIlI[11], llllllllllllIlIllIlllIIlIlllIIII.getInput().getMouseY() - GeomAccuracyTest.lllIlIIllllIlI[11]);
        this.magImage.draw(351.0f, 451.0f, 5.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[13]], 250.0f, 475.0f);
        llllllllllllIlIllIlllIIlIlllIIll.setColor(Color.darkGray);
        llllllllllllIlIllIlllIIlIlllIIll.drawRect(350.0f, 450.0f, 106.0f, 106.0f);
        llllllllllllIlIllIlllIIlIlllIIll.setColor(Color.white);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[14]], 500.0f, 450.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[15]], 525.0f, 470.0f);
        llllllllllllIlIllIlllIIlIlllIIll.drawString(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[16]], 525.0f, 490.0f);
    }
    
    void rectTest(final Graphics llllllllllllIlIllIlllIIlIlIllIIl) {
        llllllllllllIlIllIlllIIlIlIllIIl.setColor(this.geomColor);
        llllllllllllIlIllIlllIIlIlIllIIl.drawRect(100.0f, 100.0f, 99.0f, 99.0f);
        llllllllllllIlIllIlllIIlIlIllIIl.fillRect(100.0f, 250.0f, 99.0f, 99.0f);
        llllllllllllIlIllIlllIIlIlIllIIl.drawRoundRect(250.0f, 100.0f, 99.0f, 99.0f, GeomAccuracyTest.lllIlIIllllIlI[11]);
        llllllllllllIlIllIlllIIlIlIllIIl.fillRoundRect(250.0f, 250.0f, 99.0f, 99.0f, GeomAccuracyTest.lllIlIIllllIlI[11]);
        Rectangle llllllllllllIlIllIlllIIlIlIllIII = new Rectangle(400.0f, 100.0f, 99.0f, 99.0f);
        llllllllllllIlIllIlllIIlIlIllIIl.draw(llllllllllllIlIllIlllIIlIlIllIII);
        llllllllllllIlIllIlllIIlIlIllIII = new Rectangle(400.0f, 250.0f, 99.0f, 99.0f);
        llllllllllllIlIllIlllIIlIlIllIIl.fill(llllllllllllIlIllIlllIIlIlIllIII);
        RoundedRectangle llllllllllllIlIllIlllIIlIlIlIlll = new RoundedRectangle(550.0f, 100.0f, 99.0f, 99.0f, 10.0f);
        llllllllllllIlIllIlllIIlIlIllIIl.draw(llllllllllllIlIllIlllIIlIlIlIlll);
        llllllllllllIlIllIlllIIlIlIlIlll = new RoundedRectangle(550.0f, 250.0f, 99.0f, 99.0f, 10.0f);
        llllllllllllIlIllIlllIIlIlIllIIl.fill(llllllllllllIlIllIlllIIlIlIlIlll);
        if (lIlIIIlIlIIIllIl(this.hideOverlay ? 1 : 0)) {
            llllllllllllIlIllIlllIIlIlIllIIl.setColor(this.overlayColor);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(100.0f, 149.0f, 198.0f, 149.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(149.0f, 100.0f, 149.0f, 198.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(250.0f, 149.0f, 348.0f, 149.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(299.0f, 100.0f, 299.0f, 198.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(400.0f, 149.0f, 498.0f, 149.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(449.0f, 100.0f, 449.0f, 198.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(550.0f, 149.0f, 648.0f, 149.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(599.0f, 100.0f, 599.0f, 198.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(100.0f, 299.0f, 198.0f, 299.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(149.0f, 250.0f, 149.0f, 348.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(250.0f, 299.0f, 348.0f, 299.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(299.0f, 250.0f, 299.0f, 348.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(400.0f, 299.0f, 498.0f, 299.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(449.0f, 250.0f, 449.0f, 348.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(550.0f, 299.0f, 648.0f, 299.0f);
            llllllllllllIlIllIlllIIlIlIllIIl.drawLine(599.0f, 250.0f, 599.0f, 348.0f);
        }
    }
    
    private static void lIlIIIlIIllllllI() {
        (lllIlIIllIllII = new String[GeomAccuracyTest.lllIlIIllllIlI[22]])[GeomAccuracyTest.lllIlIIllllIlI[0]] = lIlIIIlIIlllIIll("JDY/Ix0XISluOQAwJTwZACpwGh0QJyM=", "cSPNx");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[2]] = lIlIIIlIIlllIlII("JgF0jy9N+iJaiSf9sH3lAw==", "uActQ");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[3]] = lIlIIIlIIlllIlll("e/bznuhQeyQ=", "oNKEM");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[4]] = lIlIIIlIIlllIIll("AwIyAw==", "BpQpt");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[5]] = lIlIIIlIIlllIlII("ypnZaX+zwJ5bBrrDXMoY9cB4huR07XUdgNCJAoENYOA=", "Igryk");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[6]] = lIlIIIlIIlllIlll("QeJFTzZGp4d4NL0bJu5RiaJ/bkriszfO", "fZbLw");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[7]] = lIlIIIlIIlllIlll("oJWwrWicPNlzdIilLbKiH9DAG9QMmy2WAFOsANlg7/w=", "BnZGy");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[8]] = lIlIIIlIIlllIlll("2uVN1d2DpwjbLpNZYqPIQQ==", "uaCGJ");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[9]] = lIlIIIlIIlllIlII("jjY9tfg3XPo=", "AAWlG");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[10]] = lIlIIIlIIlllIlII("af6gLKKpLvU=", "ZnvGV");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[11]] = lIlIIIlIIlllIlll("GLUA6Ua/jzbDYV242MCyupafWCJBy9mTa+EBU9S0qnU=", "wRXVN");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[12]] = lIlIIIlIIlllIlll("IdoFwiza4U9ep1UWYpebtM+SdKGI11wp", "MnRvG");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[13]] = lIlIIIlIIlllIlII("iCn96yXazfOIS8pS0n5Bqg==", "apxZr");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[14]] = lIlIIIlIIlllIlII("ZVuHeSGxPIc=", "CeHwS");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[15]] = lIlIIIlIIlllIlII("2py/rGrfo4bA1rpnyQDbK+mLXlC6bw0FwkpF8alNE9YCrxggfYneQw==", "hxvHu");
        GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[16]] = lIlIIIlIIlllIlII("zSOGtup8FJ5OVqRUIxUahT8b1jTXuqMCAV0u41uYdrw=", "IePCr");
    }
    
    private static boolean lIlIIIlIlIIIllll(final int llllllllllllIlIllIlllIIlIIIIlIII, final int llllllllllllIlIllIlllIIlIIIIIlll) {
        return llllllllllllIlIllIlllIIlIIIIlIII < llllllllllllIlIllIlllIIlIIIIIlll;
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlIllIlllIIlIlIIlIIl, final char llllllllllllIlIllIlllIIlIlIIlIll) {
        if (lIlIIIlIlIIIlllI(llllllllllllIlIllIlllIIlIlIIlIIl, GeomAccuracyTest.lllIlIIllllIlI[2])) {
            System.exit(GeomAccuracyTest.lllIlIIllllIlI[0]);
        }
        if (lIlIIIlIlIIIlllI(llllllllllllIlIllIlllIIlIlIIlIIl, GeomAccuracyTest.lllIlIIllllIlI[17])) {
            this.curTest += GeomAccuracyTest.lllIlIIllllIlI[2];
            this.curTest %= GeomAccuracyTest.lllIlIIllllIlI[4];
        }
        if (lIlIIIlIlIIIlllI(llllllllllllIlIllIlllIIlIlIIlIIl, GeomAccuracyTest.lllIlIIllllIlI[18])) {
            this.colorIndex += GeomAccuracyTest.lllIlIIllllIlI[2];
            this.colorIndex %= GeomAccuracyTest.lllIlIIllllIlI[5];
            this.setColors();
        }
        if (lIlIIIlIlIIIlllI(llllllllllllIlIllIlllIIlIlIIlIIl, GeomAccuracyTest.lllIlIIllllIlI[19])) {
            int hideOverlay;
            if (lIlIIIlIlIIIllIl(this.hideOverlay ? 1 : 0)) {
                hideOverlay = GeomAccuracyTest.lllIlIIllllIlI[2];
                "".length();
                if (((48 + 79 - 3 + 85 ^ 110 + 57 - 43 + 34) & (0x5E ^ 0x6A ^ (0xDB ^ 0xA0) ^ -" ".length())) > 0) {
                    return;
                }
            }
            else {
                hideOverlay = GeomAccuracyTest.lllIlIIllllIlI[0];
            }
            this.hideOverlay = (hideOverlay != 0);
        }
    }
    
    private void setColors() {
        switch (this.colorIndex) {
            case 0: {
                this.overlayColor = Color.white;
                this.geomColor = Color.magenta;
                "".length();
                if (" ".length() >= (0xDB ^ 0xC2 ^ (0x2 ^ 0x1F))) {
                    return;
                }
                break;
            }
            case 1: {
                this.overlayColor = Color.magenta;
                this.geomColor = Color.white;
                "".length();
                if (null != null) {
                    return;
                }
                break;
            }
            case 2: {
                this.overlayColor = Color.red;
                this.geomColor = Color.green;
                "".length();
                if ((76 + 94 - 42 + 29 ^ 42 + 10 + 13 + 88) == 0x0) {
                    return;
                }
                break;
            }
            case 3: {
                this.overlayColor = Color.red;
                this.geomColor = Color.white;
                break;
            }
        }
    }
    
    private static boolean lIlIIIlIlIIIlllI(final int llllllllllllIlIllIlllIIlIIIIllII, final int llllllllllllIlIllIlllIIlIIIIlIll) {
        return llllllllllllIlIllIlllIIlIIIIllII == llllllllllllIlIllIlllIIlIIIIlIll;
    }
    
    private static String lIlIIIlIIlllIlll(final String llllllllllllIlIllIlllIIlIIlIllII, final String llllllllllllIlIllIlllIIlIIlIlIll) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIIlIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), GeomAccuracyTest.lllIlIIllllIlI[9]), "DES");
            final Cipher llllllllllllIlIllIlllIIlIIlIlllI = Cipher.getInstance("DES");
            llllllllllllIlIllIlllIIlIIlIlllI.init(GeomAccuracyTest.lllIlIIllllIlI[3], llllllllllllIlIllIlllIIlIIlIllll);
            return new String(llllllllllllIlIllIlllIIlIIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIIlIIlIllIl) {
            llllllllllllIlIllIlllIIlIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIIIlIlIIIllII();
        lIlIIIlIIllllllI();
        NUMTESTS = GeomAccuracyTest.lllIlIIllllIlI[4];
    }
    
    private static String lIlIIIlIIlllIlII(final String llllllllllllIlIllIlllIIlIIlllIIl, final String llllllllllllIlIllIlllIIlIIlllIII) {
        try {
            final SecretKeySpec llllllllllllIlIllIlllIIlIIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIIlIIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIllIlllIIlIIlllIll = Cipher.getInstance("Blowfish");
            llllllllllllIlIllIlllIIlIIlllIll.init(GeomAccuracyTest.lllIlIIllllIlI[3], llllllllllllIlIllIlllIIlIIllllII);
            return new String(llllllllllllIlIllIlllIIlIIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIIlIIlllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIllIlllIIlIIlllIlI) {
            llllllllllllIlIllIlllIIlIIlllIlI.printStackTrace();
            return null;
        }
    }
    
    private static String lIlIIIlIIlllIIll(String llllllllllllIlIllIlllIIlIIIlllII, final String llllllllllllIlIllIlllIIlIIIlIllI) {
        llllllllllllIlIllIlllIIlIIIlllII = new String(Base64.getDecoder().decode(llllllllllllIlIllIlllIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIllIlllIIlIIIllIlI = new StringBuilder();
        final char[] llllllllllllIlIllIlllIIlIIIllIIl = llllllllllllIlIllIlllIIlIIIlIllI.toCharArray();
        int llllllllllllIlIllIlllIIlIIIllIII = GeomAccuracyTest.lllIlIIllllIlI[0];
        final int llllllllllllIlIllIlllIIlIIIlIIlI = (Object)llllllllllllIlIllIlllIIlIIIlllII.toCharArray();
        final long llllllllllllIlIllIlllIIlIIIlIIIl = llllllllllllIlIllIlllIIlIIIlIIlI.length;
        Exception llllllllllllIlIllIlllIIlIIIlIIII = (Exception)GeomAccuracyTest.lllIlIIllllIlI[0];
        while (lIlIIIlIlIIIllll((int)llllllllllllIlIllIlllIIlIIIlIIII, (int)llllllllllllIlIllIlllIIlIIIlIIIl)) {
            final char llllllllllllIlIllIlllIIlIIIlllIl = llllllllllllIlIllIlllIIlIIIlIIlI[llllllllllllIlIllIlllIIlIIIlIIII];
            llllllllllllIlIllIlllIIlIIIllIlI.append((char)(llllllllllllIlIllIlllIIlIIIlllIl ^ llllllllllllIlIllIlllIIlIIIllIIl[llllllllllllIlIllIlllIIlIIIllIII % llllllllllllIlIllIlllIIlIIIllIIl.length]));
            "".length();
            ++llllllllllllIlIllIlllIIlIIIllIII;
            ++llllllllllllIlIllIlllIIlIIIlIIII;
            "".length();
            if (-" ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIllIlllIIlIIIllIlI);
    }
    
    public static void main(final String[] llllllllllllIlIllIlllIIlIlIIIIlI) {
        try {
            final AppGameContainer llllllllllllIlIllIlllIIlIlIIIlII = new AppGameContainer(new GeomAccuracyTest());
            llllllllllllIlIllIlllIIlIlIIIlII.setDisplayMode(GeomAccuracyTest.lllIlIIllllIlI[20], GeomAccuracyTest.lllIlIIllllIlI[21], (boolean)(GeomAccuracyTest.lllIlIIllllIlI[0] != 0));
            llllllllllllIlIllIlllIIlIlIIIlII.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIllIlllIIlIlIIIIll) {
            llllllllllllIlIllIlllIIlIlIIIIll.printStackTrace();
        }
    }
    
    public GeomAccuracyTest() {
        super(GeomAccuracyTest.lllIlIIllIllII[GeomAccuracyTest.lllIlIIllllIlI[0]]);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlIllIlllIIlIlIlIIIl, final int llllllllllllIlIllIlllIIlIlIlIIII) {
    }
}
