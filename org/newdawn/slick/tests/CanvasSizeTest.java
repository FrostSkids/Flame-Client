// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.util.Log;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Frame;
import org.newdawn.slick.Game;
import org.newdawn.slick.CanvasGameContainer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class CanvasSizeTest extends BasicGame
{
    private static final /* synthetic */ String[] llllllllIIIll;
    private static final /* synthetic */ int[] llllllllIIlII;
    
    @Override
    public void init(final GameContainer lllllllllllllIlIlIIllIlIIlllIlll) throws SlickException {
        System.out.println(String.valueOf(new StringBuilder().append(lllllllllllllIlIlIIllIlIIlllIlll.getWidth()).append(CanvasSizeTest.llllllllIIIll[CanvasSizeTest.llllllllIIlII[1]]).append(lllllllllllllIlIlIIllIlIIlllIlll.getHeight())));
    }
    
    private static String lIllIIIllIIlIII(String lllllllllllllIlIlIIllIlIIlIIlIll, final String lllllllllllllIlIlIIllIlIIlIIlIlI) {
        lllllllllllllIlIlIIllIlIIlIIlIll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlIIlIIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIIllIlIIlIIlllI = new StringBuilder();
        final char[] lllllllllllllIlIlIIllIlIIlIIllIl = lllllllllllllIlIlIIllIlIIlIIlIlI.toCharArray();
        int lllllllllllllIlIlIIllIlIIlIIllII = CanvasSizeTest.llllllllIIlII[0];
        final float lllllllllllllIlIlIIllIlIIlIIIllI = (Object)lllllllllllllIlIlIIllIlIIlIIlIll.toCharArray();
        final double lllllllllllllIlIlIIllIlIIlIIIlIl = lllllllllllllIlIlIIllIlIIlIIIllI.length;
        int lllllllllllllIlIlIIllIlIIlIIIlII = CanvasSizeTest.llllllllIIlII[0];
        while (lIllIIIllIIllII(lllllllllllllIlIlIIllIlIIlIIIlII, (int)lllllllllllllIlIlIIllIlIIlIIIlIl)) {
            final char lllllllllllllIlIlIIllIlIIlIlIIIl = lllllllllllllIlIlIIllIlIIlIIIllI[lllllllllllllIlIlIIllIlIIlIIIlII];
            lllllllllllllIlIlIIllIlIIlIIlllI.append((char)(lllllllllllllIlIlIIllIlIIlIlIIIl ^ lllllllllllllIlIlIIllIlIIlIIllIl[lllllllllllllIlIlIIllIlIIlIIllII % lllllllllllllIlIlIIllIlIIlIIllIl.length]));
            "".length();
            ++lllllllllllllIlIlIIllIlIIlIIllII;
            ++lllllllllllllIlIlIIllIlIIlIIIlII;
            "".length();
            if ("   ".length() < " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIIllIlIIlIIlllI);
    }
    
    private static void lIllIIIllIIlIll() {
        (llllllllIIlII = new int[6])[0] = ((87 + 88 - 64 + 58 ^ 61 + 60 - 108 + 146) & (0x9B ^ 0xB4 ^ (0x96 ^ 0x8F) ^ -" ".length()));
        CanvasSizeTest.llllllllIIlII[1] = " ".length();
        CanvasSizeTest.llllllllIIlII[2] = (0xFFFFF2E3 & 0xF9C);
        CanvasSizeTest.llllllllIIlII[3] = (0xFFFFD5FF & 0x2BE0);
        CanvasSizeTest.llllllllIIlII[4] = "  ".length();
        CanvasSizeTest.llllllllIIlII[5] = "   ".length();
    }
    
    private static String lIllIIIllIIlIIl(final String lllllllllllllIlIlIIllIlIIllIIIII, final String lllllllllllllIlIlIIllIlIIlIlllll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIlIIllIIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIlIIlIlllll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllIlIIllIIIlI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllIlIIllIIIlI.init(CanvasSizeTest.llllllllIIlII[4], lllllllllllllIlIlIIllIlIIllIIIll);
            return new String(lllllllllllllIlIlIIllIlIIllIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlIIllIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIlIIllIIIIl) {
            lllllllllllllIlIlIIllIlIIllIIIIl.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllIIIllIIlIll();
        lIllIIIllIIlIlI();
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIlIIllIlIIlllIIIl, final int lllllllllllllIlIlIIllIlIIlllIIII) throws SlickException {
    }
    
    public CanvasSizeTest() {
        super(CanvasSizeTest.llllllllIIIll[CanvasSizeTest.llllllllIIlII[0]]);
    }
    
    private static void lIllIIIllIIlIlI() {
        (llllllllIIIll = new String[CanvasSizeTest.llllllllIIlII[5]])[CanvasSizeTest.llllllllIIlII[0]] = lIllIIIllIIlIII("JxUZHw==", "spjkf");
        CanvasSizeTest.llllllllIIIll[CanvasSizeTest.llllllllIIlII[1]] = lIllIIIllIIlIII("a0s=", "GkmXV");
        CanvasSizeTest.llllllllIIIll[CanvasSizeTest.llllllllIIlII[4]] = lIllIIIllIIlIIl("bjFTGhDxEvo=", "ETJkY");
    }
    
    public static void main(final String[] lllllllllllllIlIlIIllIlIIllIlIlI) {
        try {
            final CanvasGameContainer lllllllllllllIlIlIIllIlIIllIllIl = new CanvasGameContainer(new CanvasSizeTest());
            lllllllllllllIlIlIIllIlIIllIllIl.setSize(CanvasSizeTest.llllllllIIlII[2], CanvasSizeTest.llllllllIIlII[3]);
            final Frame lllllllllllllIlIlIIllIlIIllIllII = new Frame(CanvasSizeTest.llllllllIIIll[CanvasSizeTest.llllllllIIlII[4]]);
            lllllllllllllIlIlIIllIlIIllIllII.setLayout(new GridLayout(CanvasSizeTest.llllllllIIlII[1], CanvasSizeTest.llllllllIIlII[4]));
            lllllllllllllIlIlIIllIlIIllIllII.add(lllllllllllllIlIlIIllIlIIllIllIl);
            "".length();
            lllllllllllllIlIlIIllIlIIllIllII.pack();
            lllllllllllllIlIlIIllIlIIllIllII.addWindowListener(new WindowAdapter() {
                private static final /* synthetic */ int[] lllIIlIlIIllll;
                
                private static void lIIllllllIlIIIII() {
                    (lllIIlIlIIllll = new int[1])[0] = ((0x16 ^ 0x50) & ~(0x67 ^ 0x21));
                }
                
                static {
                    lIIllllllIlIIIII();
                }
                
                @Override
                public void windowClosing(final WindowEvent llllllllllllIlIllllIlIIIIlllIlll) {
                    System.exit(CanvasSizeTest$1.lllIIlIlIIllll[0]);
                }
            });
            lllllllllllllIlIlIIllIlIIllIllII.setVisible((boolean)(CanvasSizeTest.llllllllIIlII[1] != 0));
            lllllllllllllIlIlIIllIlIIllIllIl.start();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (Exception lllllllllllllIlIlIIllIlIIllIlIll) {
            Log.error(lllllllllllllIlIlIIllIlIIllIlIll);
        }
    }
    
    public void render(final GameContainer lllllllllllllIlIlIIllIlIIlllIlII, final Graphics lllllllllllllIlIlIIllIlIIlllIIll) throws SlickException {
    }
    
    private static boolean lIllIIIllIIllII(final int lllllllllllllIlIlIIllIlIIlIIIIII, final int lllllllllllllIlIlIIllIlIIIllllll) {
        return lllllllllllllIlIlIIllIlIIlIIIIII < lllllllllllllIlIlIIllIlIIIllllll;
    }
}
