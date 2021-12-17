// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.awt.event.WindowListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowAdapter;
import java.awt.Component;
import java.awt.LayoutManager;
import java.awt.GridLayout;
import java.awt.Frame;
import org.newdawn.slick.Game;
import org.newdawn.slick.CanvasGameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class CanvasContainerTest extends BasicGame
{
    private /* synthetic */ Image tga;
    private /* synthetic */ Image image;
    private static final /* synthetic */ int[] lIlIIlIlIlllII;
    private /* synthetic */ Image gif;
    private /* synthetic */ Image scaled;
    private /* synthetic */ Image scaleMe;
    private /* synthetic */ Image subImage;
    private /* synthetic */ float rot;
    private static final /* synthetic */ String[] lIlIIlIlIllIll;
    
    private static int lllIIllIIllIIlI(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    public CanvasContainerTest() {
        super(CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[0]]);
    }
    
    public static void main(final String[] lllllllllllllIIIllIllIIllIIlllIl) {
        try {
            final CanvasGameContainer lllllllllllllIIIllIllIIllIlIIIII = new CanvasGameContainer(new CanvasContainerTest());
            final Frame lllllllllllllIIIllIllIIllIIlllll = new Frame(CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[9]]);
            lllllllllllllIIIllIllIIllIIlllll.setLayout(new GridLayout(CanvasContainerTest.lIlIIlIlIlllII[1], CanvasContainerTest.lIlIIlIlIlllII[2]));
            lllllllllllllIIIllIllIIllIIlllll.setSize(CanvasContainerTest.lIlIIlIlIlllII[10], CanvasContainerTest.lIlIIlIlIlllII[10]);
            lllllllllllllIIIllIllIIllIIlllll.add(lllllllllllllIIIllIllIIllIlIIIII);
            "".length();
            lllllllllllllIIIllIllIIllIIlllll.addWindowListener(new WindowAdapter() {
                private static final /* synthetic */ int[] lIIlllIIllllII;
                
                private static void llIllIllIIllIll() {
                    (lIIlllIIllllII = new int[1])[0] = ((0x1D ^ 0x55 ^ (0xA1 ^ 0x8A)) & (0xCC ^ 0xB9 ^ (0x4 ^ 0x12) ^ -" ".length()));
                }
                
                static {
                    llIllIllIIllIll();
                }
                
                @Override
                public void windowClosing(final WindowEvent lllllllllllllIIlIlIIIIIllIIIllIl) {
                    System.exit(CanvasContainerTest$1.lIIlllIIllllII[0]);
                }
            });
            lllllllllllllIIIllIllIIllIIlllll.setVisible((boolean)(CanvasContainerTest.lIlIIlIlIlllII[1] != 0));
            lllllllllllllIIIllIllIIllIlIIIII.start();
            "".length();
            if ("  ".length() != "  ".length()) {
                return;
            }
        }
        catch (Exception lllllllllllllIIIllIllIIllIIllllI) {
            lllllllllllllIIIllIllIIllIIllllI.printStackTrace();
        }
    }
    
    private static String lllIIllIIlIllIl(String lllllllllllllIIIllIllIIlIllIlIlI, final String lllllllllllllIIIllIllIIlIllIlllI) {
        lllllllllllllIIIllIllIIlIllIlIlI = (float)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllIllIIlIllIlIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllIllIIlIllIllIl = new StringBuilder();
        final char[] lllllllllllllIIIllIllIIlIllIllII = lllllllllllllIIIllIllIIlIllIlllI.toCharArray();
        int lllllllllllllIIIllIllIIlIllIlIll = CanvasContainerTest.lIlIIlIlIlllII[0];
        final char lllllllllllllIIIllIllIIlIllIIlIl = (Object)((String)lllllllllllllIIIllIllIIlIllIlIlI).toCharArray();
        final String lllllllllllllIIIllIllIIlIllIIlII = (String)lllllllllllllIIIllIllIIlIllIIlIl.length;
        char lllllllllllllIIIllIllIIlIllIIIll = (char)CanvasContainerTest.lIlIIlIlIlllII[0];
        while (lllIIllIIllIIIl(lllllllllllllIIIllIllIIlIllIIIll, (int)lllllllllllllIIIllIllIIlIllIIlII)) {
            final char lllllllllllllIIIllIllIIlIlllIIII = lllllllllllllIIIllIllIIlIllIIlIl[lllllllllllllIIIllIllIIlIllIIIll];
            lllllllllllllIIIllIllIIlIllIllIl.append((char)(lllllllllllllIIIllIllIIlIlllIIII ^ lllllllllllllIIIllIllIIlIllIllII[lllllllllllllIIIllIllIIlIllIlIll % lllllllllllllIIIllIllIIlIllIllII.length]));
            "".length();
            ++lllllllllllllIIIllIllIIlIllIlIll;
            ++lllllllllllllIIIllIllIIlIllIIIll;
            "".length();
            if (((0x60 ^ 0x44) & ~(0x21 ^ 0x5)) > 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllIllIIlIllIllIl);
    }
    
    private static String lllIIllIIlIllII(final String lllllllllllllIIIllIllIIlIlllllIl, final String lllllllllllllIIIllIllIIlIlllllII) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIIllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIIlIlllllII.getBytes(StandardCharsets.UTF_8)), CanvasContainerTest.lIlIIlIlIlllII[13]), "DES");
            final Cipher lllllllllllllIIIllIllIIllIIIIIIl = Cipher.getInstance("DES");
            lllllllllllllIIIllIllIIllIIIIIIl.init(CanvasContainerTest.lIlIIlIlIlllII[2], lllllllllllllIIIllIllIIllIIIIIlI);
            return new String(lllllllllllllIIIllIllIIllIIIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIIlIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIIllIIIIIII) {
            lllllllllllllIIIllIllIIllIIIIIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIllIllIIllIlllllI) throws SlickException {
        final Image image = new Image(CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[1]]);
        this.tga = image;
        this.image = image;
        this.scaleMe = new Image(CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[2]], (boolean)(CanvasContainerTest.lIlIIlIlIlllII[1] != 0), CanvasContainerTest.lIlIIlIlIlllII[2]);
        this.gif = new Image(CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[3]]);
        this.scaled = this.gif.getScaledCopy(CanvasContainerTest.lIlIIlIlIlllII[4], CanvasContainerTest.lIlIIlIlIlllII[4]);
        this.subImage = this.image.getSubImage(CanvasContainerTest.lIlIIlIlIlllII[5], CanvasContainerTest.lIlIIlIlIlllII[0], CanvasContainerTest.lIlIIlIlIlllII[6], CanvasContainerTest.lIlIIlIlIlllII[7]);
        this.rot = 0.0f;
    }
    
    private static void lllIIllIIlIlllI() {
        (lIlIIlIlIllIll = new String[CanvasContainerTest.lIlIIlIlIlllII[12]])[CanvasContainerTest.lIlIIlIlIlllII[0]] = lllIIllIIlIlIll("Oph8UAifXqISeRF1uugU0tp9P+AHgT57", "YfASL");
        CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[1]] = lllIIllIIlIlIll("n4IAKYElj/GKCe2jvyqNDFbu2KOgDrlS", "iYwSX");
        CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[2]] = lllIIllIIlIllII("6habGbk3QrNyxUtUB0Rg0FX/IefjqDST", "hlwHL");
        CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[3]] = lllIIllIIlIllIl("LD0fDRA5LA1WGDc/A1cTMT4=", "XXlyt");
        CanvasContainerTest.lIlIIlIlIllIll[CanvasContainerTest.lIlIIlIlIlllII[9]] = lllIIllIIlIllII("3FEjNvcyNGg=", "RHXpJ");
    }
    
    private static boolean lllIIllIIllIIll(final int lllllllllllllIIIllIllIIlIlIlIlII) {
        return lllllllllllllIIIllIllIIlIlIlIlII > 0;
    }
    
    public void render(final GameContainer lllllllllllllIIIllIllIIllIllIlII, final Graphics lllllllllllllIIIllIllIIllIllIIll) {
        this.image.draw(0.0f, 0.0f);
        this.image.draw(500.0f, 0.0f, 200.0f, 100.0f);
        this.scaleMe.draw(500.0f, 100.0f, 200.0f, 100.0f);
        this.scaled.draw(400.0f, 500.0f);
        final Image lllllllllllllIIIllIllIIllIllIIlI = this.scaled.getFlippedCopy((boolean)(CanvasContainerTest.lIlIIlIlIlllII[1] != 0), (boolean)(CanvasContainerTest.lIlIIlIlIlllII[0] != 0));
        lllllllllllllIIIllIllIIllIllIIlI.draw(520.0f, 500.0f);
        final Image lllllllllllllIIIllIllIIllIllIIIl = lllllllllllllIIIllIllIIllIllIIlI.getFlippedCopy((boolean)(CanvasContainerTest.lIlIIlIlIlllII[0] != 0), (boolean)(CanvasContainerTest.lIlIIlIlIlllII[1] != 0));
        lllllllllllllIIIllIllIIllIllIIIl.draw(520.0f, 380.0f);
        final Image lllllllllllllIIIllIllIIllIllIIII = lllllllllllllIIIllIllIIllIllIIIl.getFlippedCopy((boolean)(CanvasContainerTest.lIlIIlIlIlllII[1] != 0), (boolean)(CanvasContainerTest.lIlIIlIlIlllII[0] != 0));
        lllllllllllllIIIllIllIIllIllIIII.draw(400.0f, 380.0f);
        int lllllllllllllIIIllIllIIllIllIllI = CanvasContainerTest.lIlIIlIlIlllII[0];
        while (lllIIllIIllIIIl(lllllllllllllIIIllIllIIllIllIllI, CanvasContainerTest.lIlIIlIlIlllII[3])) {
            this.subImage.draw((float)(CanvasContainerTest.lIlIIlIlIlllII[5] + lllllllllllllIIIllIllIIllIllIllI * CanvasContainerTest.lIlIIlIlIlllII[8]), 300.0f);
            ++lllllllllllllIIIllIllIIllIllIllI;
            "".length();
            if (((0x10 ^ 0x48 ^ (0x29 ^ 0x11)) & (0xA6 ^ 0x9D ^ (0x27 ^ 0x7C) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        lllllllllllllIIIllIllIIllIllIIll.translate(500.0f, 200.0f);
        lllllllllllllIIIllIllIIllIllIIll.rotate(50.0f, 50.0f, this.rot);
        lllllllllllllIIIllIllIIllIllIIll.scale(0.3f, 0.3f);
        this.image.draw();
        lllllllllllllIIIllIllIIllIllIIll.resetTransform();
    }
    
    private static boolean lllIIllIIllIlII(final int lllllllllllllIIIllIllIIlIlIlllll, final int lllllllllllllIIIllIllIIlIlIllllI) {
        return lllllllllllllIIIllIllIIlIlIlllll == lllllllllllllIIIllIllIIlIlIllllI;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIllIllIIllIlIIllI, final int lllllllllllllIIIllIllIIllIlIIIll) {
        this.rot += lllllllllllllIIIllIllIIllIlIIIll * 0.1f;
        if (lllIIllIIllIIll(lllIIllIIllIIlI(this.rot, 360.0f))) {
            this.rot -= 360.0f;
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIIllIllIIllIIlIlII, final char lllllllllllllIIIllIllIIllIIlIllI) {
        if (lllIIllIIllIlII(lllllllllllllIIIllIllIIllIIlIlII, CanvasContainerTest.lIlIIlIlIlllII[11])) {
            if (lllIIllIIllIlIl(this.image, this.gif)) {
                this.image = this.tga;
                "".length();
                if ("  ".length() > "  ".length()) {
                    return;
                }
            }
            else {
                this.image = this.gif;
            }
        }
    }
    
    static {
        lllIIllIIllIIII();
        lllIIllIIlIlllI();
    }
    
    private static boolean lllIIllIIllIlIl(final Object lllllllllllllIIIllIllIIlIlIlIlll, final Object lllllllllllllIIIllIllIIlIlIlIllI) {
        return lllllllllllllIIIllIllIIlIlIlIlll == lllllllllllllIIIllIllIIlIlIlIllI;
    }
    
    private static String lllIIllIIlIlIll(final String lllllllllllllIIIllIllIIllIIIlIlI, final String lllllllllllllIIIllIllIIllIIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIIIllIllIIllIIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllIllIIllIIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllIllIIllIIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllIllIIllIIIlllI.init(CanvasContainerTest.lIlIIlIlIlllII[2], lllllllllllllIIIllIllIIllIIIllll);
            return new String(lllllllllllllIIIllIllIIllIIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllIllIIllIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllIllIIllIIIllIl) {
            lllllllllllllIIIllIllIIllIIIllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIllIIllIIIl(final int lllllllllllllIIIllIllIIlIlIllIll, final int lllllllllllllIIIllIllIIlIlIllIlI) {
        return lllllllllllllIIIllIllIIlIlIllIll < lllllllllllllIIIllIllIIlIlIllIlI;
    }
    
    private static void lllIIllIIllIIII() {
        (lIlIIlIlIlllII = new int[14])[0] = ("  ".length() & ~"  ".length());
        CanvasContainerTest.lIlIIlIlIlllII[1] = " ".length();
        CanvasContainerTest.lIlIIlIlIlllII[2] = "  ".length();
        CanvasContainerTest.lIlIIlIlIlllII[3] = "   ".length();
        CanvasContainerTest.lIlIIlIlIlllII[4] = (0xF5 ^ 0x92 ^ (0x4B ^ 0x54));
        CanvasContainerTest.lIlIIlIlIlllII[5] = 120 + 36 - 54 + 98;
        CanvasContainerTest.lIlIIlIlIlllII[6] = (0x6E ^ 0x28);
        CanvasContainerTest.lIlIIlIlIlllII[7] = (-(0xFFFFFCEC & 0x43B7) & (0xFFFFC5EF & 0x7BB7));
        CanvasContainerTest.lIlIIlIlIlllII[8] = (0x52 ^ 0x36 ^ (0x33 ^ 0x49));
        CanvasContainerTest.lIlIIlIlIlllII[9] = (0xAD ^ 0xA9);
        CanvasContainerTest.lIlIIlIlIlllII[10] = (0xFFFFD9F4 & 0x27FF);
        CanvasContainerTest.lIlIIlIlIlllII[11] = (0x41 ^ 0x78);
        CanvasContainerTest.lIlIIlIlIlllII[12] = (0x2 ^ 0x69 ^ (0xD ^ 0x63));
        CanvasContainerTest.lIlIIlIlIlllII[13] = (0x12 ^ 0x1A);
    }
}
