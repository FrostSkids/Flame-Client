// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class TransformTest extends BasicGame
{
    private static final /* synthetic */ int[] lllIIIlllIIIIl;
    private static final /* synthetic */ String[] lllIIIlllIIIII;
    private /* synthetic */ float scale;
    private /* synthetic */ boolean scaleDown;
    private /* synthetic */ boolean scaleUp;
    
    @Override
    public void update(final GameContainer llllllllllllIlIlllllllIIlIlllIlI, final int llllllllllllIlIlllllllIIlIlllIIl) {
        if (lIIllllIIIllIIIl(this.scaleUp ? 1 : 0)) {
            this.scale += llllllllllllIlIlllllllIIlIlllIIl * 0.001f;
        }
        if (lIIllllIIIllIIIl(this.scaleDown ? 1 : 0)) {
            this.scale -= llllllllllllIlIlllllllIIlIlllIIl * 0.001f;
        }
    }
    
    private static boolean lIIllllIIIllIIlI(final int llllllllllllIlIlllllllIIlIIIlIII, final int llllllllllllIlIlllllllIIlIIIIlll) {
        return llllllllllllIlIlllllllIIlIIIlIII == llllllllllllIlIlllllllIIlIIIIlll;
    }
    
    public static void main(final String[] llllllllllllIlIlllllllIIlIlIIlIl) {
        try {
            final AppGameContainer llllllllllllIlIlllllllIIlIlIIlll = new AppGameContainer(new TransformTest());
            llllllllllllIlIlllllllIIlIlIIlll.setDisplayMode(TransformTest.lllIIIlllIIIIl[7], TransformTest.lllIIIlllIIIIl[8], (boolean)(TransformTest.lllIIIlllIIIIl[0] != 0));
            llllllllllllIlIlllllllIIlIlIIlll.start();
            "".length();
            if (-"  ".length() > 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlIlllllllIIlIlIIllI) {
            llllllllllllIlIlllllllIIlIlIIllI.printStackTrace();
        }
    }
    
    private static void lIIllllIIIlIlllI() {
        (lllIIIlllIIIII = new String[TransformTest.lllIIIlllIIIIl[4]])[TransformTest.lllIIIlllIIIIl[0]] = lIIllllIIIlIllIl("AxUQHAQxCAMfVwMCAgY=", "Wgqrw");
    }
    
    private static boolean lIIllllIIIllIIIl(final int llllllllllllIlIlllllllIIIllllllI) {
        return llllllllllllIlIlllllllIIIllllllI != 0;
    }
    
    public void render(final GameContainer llllllllllllIlIlllllllIIllIIIIll, final Graphics llllllllllllIlIlllllllIIllIIIIlI) {
        llllllllllllIlIlllllllIIllIIIIlI.translate(320.0f, 240.0f);
        llllllllllllIlIlllllllIIllIIIIlI.scale(this.scale, this.scale);
        llllllllllllIlIlllllllIIllIIIIlI.setColor(Color.red);
        int llllllllllllIlIlllllllIIllIIIlIl = TransformTest.lllIIIlllIIIIl[0];
        while (lIIllllIIIllIIII(llllllllllllIlIlllllllIIllIIIlIl, TransformTest.lllIIIlllIIIIl[2])) {
            int llllllllllllIlIlllllllIIllIIIllI = TransformTest.lllIIIlllIIIIl[0];
            while (lIIllllIIIllIIII(llllllllllllIlIlllllllIIllIIIllI, TransformTest.lllIIIlllIIIIl[2])) {
                llllllllllllIlIlllllllIIllIIIIlI.fillRect((float)(TransformTest.lllIIIlllIIIIl[3] + llllllllllllIlIlllllllIIllIIIlIl * TransformTest.lllIIIlllIIIIl[1]), (float)(TransformTest.lllIIIlllIIIIl[3] + llllllllllllIlIlllllllIIllIIIllI * TransformTest.lllIIIlllIIIIl[1]), 80.0f, 80.0f);
                ++llllllllllllIlIlllllllIIllIIIllI;
                "".length();
                if ("   ".length() == 0) {
                    return;
                }
            }
            ++llllllllllllIlIlllllllIIllIIIlIl;
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        llllllllllllIlIlllllllIIllIIIIlI.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        llllllllllllIlIlllllllIIllIIIIlI.fillRect(-320.0f, -240.0f, 640.0f, 480.0f);
        llllllllllllIlIlllllllIIllIIIIlI.setColor(Color.white);
        llllllllllllIlIlllllllIIllIIIIlI.drawRect(-320.0f, -240.0f, 640.0f, 480.0f);
    }
    
    public TransformTest() {
        super(TransformTest.lllIIIlllIIIII[TransformTest.lllIIIlllIIIIl[0]]);
        this.scale = 1.0f;
    }
    
    static {
        lIIllllIIIlIllll();
        lIIllllIIIlIlllI();
    }
    
    private static String lIIllllIIIlIllIl(String llllllllllllIlIlllllllIIlIIlIlII, final String llllllllllllIlIlllllllIIlIIllIII) {
        llllllllllllIlIlllllllIIlIIlIlII = new String(Base64.getDecoder().decode(llllllllllllIlIlllllllIIlIIlIlII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlIlllllllIIlIIlIlll = new StringBuilder();
        final char[] llllllllllllIlIlllllllIIlIIlIllI = llllllllllllIlIlllllllIIlIIllIII.toCharArray();
        int llllllllllllIlIlllllllIIlIIlIlIl = TransformTest.lllIIIlllIIIIl[0];
        final byte llllllllllllIlIlllllllIIlIIIllll = (Object)llllllllllllIlIlllllllIIlIIlIlII.toCharArray();
        final double llllllllllllIlIlllllllIIlIIIlllI = llllllllllllIlIlllllllIIlIIIllll.length;
        short llllllllllllIlIlllllllIIlIIIllIl = (short)TransformTest.lllIIIlllIIIIl[0];
        while (lIIllllIIIllIIII(llllllllllllIlIlllllllIIlIIIllIl, (int)llllllllllllIlIlllllllIIlIIIlllI)) {
            final char llllllllllllIlIlllllllIIlIIllIlI = llllllllllllIlIlllllllIIlIIIllll[llllllllllllIlIlllllllIIlIIIllIl];
            llllllllllllIlIlllllllIIlIIlIlll.append((char)(llllllllllllIlIlllllllIIlIIllIlI ^ llllllllllllIlIlllllllIIlIIlIllI[llllllllllllIlIlllllllIIlIIlIlIl % llllllllllllIlIlllllllIIlIIlIllI.length]));
            "".length();
            ++llllllllllllIlIlllllllIIlIIlIlIl;
            ++llllllllllllIlIlllllllIIlIIIllIl;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlIlllllllIIlIIlIlll);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlIlllllllIIllIIlIll) throws SlickException {
        llllllllllllIlIlllllllIIllIIlIll.setTargetFrameRate(TransformTest.lllIIIlllIIIIl[1]);
    }
    
    private static boolean lIIllllIIIllIIII(final int llllllllllllIlIlllllllIIlIIIIIlI, final int llllllllllllIlIlllllllIIlIIIIIIl) {
        return llllllllllllIlIlllllllIIlIIIIIlI < llllllllllllIlIlllllllIIlIIIIIIl;
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlIlllllllIIlIllIIll, final char llllllllllllIlIlllllllIIlIllIIlI) {
        if (lIIllllIIIllIIlI(llllllllllllIlIlllllllIIlIllIIll, TransformTest.lllIIIlllIIIIl[4])) {
            System.exit(TransformTest.lllIIIlllIIIIl[0]);
        }
        if (lIIllllIIIllIIlI(llllllllllllIlIlllllllIIlIllIIll, TransformTest.lllIIIlllIIIIl[5])) {
            this.scaleUp = (TransformTest.lllIIIlllIIIIl[4] != 0);
        }
        if (lIIllllIIIllIIlI(llllllllllllIlIlllllllIIlIllIIll, TransformTest.lllIIIlllIIIIl[6])) {
            this.scaleDown = (TransformTest.lllIIIlllIIIIl[4] != 0);
        }
    }
    
    @Override
    public void keyReleased(final int llllllllllllIlIlllllllIIlIlIllII, final char llllllllllllIlIlllllllIIlIlIlIll) {
        if (lIIllllIIIllIIlI(llllllllllllIlIlllllllIIlIlIllII, TransformTest.lllIIIlllIIIIl[5])) {
            this.scaleUp = (TransformTest.lllIIIlllIIIIl[0] != 0);
        }
        if (lIIllllIIIllIIlI(llllllllllllIlIlllllllIIlIlIllII, TransformTest.lllIIIlllIIIIl[6])) {
            this.scaleDown = (TransformTest.lllIIIlllIIIIl[0] != 0);
        }
    }
    
    private static void lIIllllIIIlIllll() {
        (lllIIIlllIIIIl = new int[9])[0] = ((0x27 ^ 0x7C) & ~(0x5F ^ 0x4));
        TransformTest.lllIIIlllIIIIl[1] = (112 + 177 - 127 + 53 ^ 37 + 28 - 62 + 176);
        TransformTest.lllIIIlllIIIIl[2] = (0xC7 ^ 0x9E ^ (0x38 ^ 0x6B));
        TransformTest.lllIIIlllIIIIl[3] = -(0xFFFFC7F6 & 0x39FD);
        TransformTest.lllIIIlllIIIIl[4] = " ".length();
        TransformTest.lllIIIlllIIIIl[5] = (0x85 ^ 0x95);
        TransformTest.lllIIIlllIIIIl[6] = (52 + 167 - 125 + 80 ^ 109 + 74 - 63 + 56);
        TransformTest.lllIIIlllIIIIl[7] = (-(0xFFFFFB9F & 0x5C77) & (0xFFFFFF97 & 0x5AFE));
        TransformTest.lllIIIlllIIIIl[8] = (0xFFFF9DFB & 0x63E4);
    }
}
