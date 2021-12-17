// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class ImageTest extends BasicGame
{
    private /* synthetic */ Image scaleMe;
    private static final /* synthetic */ int[] lIIIlllllIIllI;
    public static /* synthetic */ boolean exitMe;
    private /* synthetic */ Image subImage;
    private /* synthetic */ Image scaled;
    private /* synthetic */ Image rotImage;
    private static final /* synthetic */ String[] lIIIlllllIIIll;
    private /* synthetic */ Image tga;
    private /* synthetic */ float rot;
    private /* synthetic */ Image gif;
    private /* synthetic */ Image image;
    
    static {
        llIIlIIIIllIIII();
        llIIlIIIIlIIlIl();
        ImageTest.exitMe = (ImageTest.lIIIlllllIIllI[1] != 0);
    }
    
    private static int llIIlIIIIllIIll(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIllllIIIlllIIIIlll, final char lllllllllllllIIllllIIIlllIIIIllI) {
        if (llIIlIIIIllIllI(lllllllllllllIIllllIIIlllIIIIlll, ImageTest.lIIIlllllIIllI[15])) {
            if (llIIlIIIIllIlll(this.image, this.gif)) {
                this.image = this.tga;
                "".length();
                if (((0x17 ^ 0x77) & ~(0x23 ^ 0x43)) != 0x0) {
                    return;
                }
            }
            else {
                this.image = this.gif;
            }
        }
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIllllIIIlllIllIIIl) throws SlickException {
        final Image image = new Image(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[1]]);
        this.tga = image;
        this.image = image;
        this.rotImage = new Image(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[2]]);
        this.rotImage = this.rotImage.getScaledCopy(this.rotImage.getWidth() / ImageTest.lIIIlllllIIllI[2], this.rotImage.getHeight() / ImageTest.lIIIlllllIIllI[2]);
        this.scaleMe = new Image(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[3]], (boolean)(ImageTest.lIIIlllllIIllI[1] != 0), ImageTest.lIIIlllllIIllI[2]);
        this.gif = new Image(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[4]]);
        this.gif.destroy();
        this.gif = new Image(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[5]]);
        this.scaled = this.gif.getScaledCopy(ImageTest.lIIIlllllIIllI[6], ImageTest.lIIIlllllIIllI[6]);
        this.subImage = this.image.getSubImage(ImageTest.lIIIlllllIIllI[7], ImageTest.lIIIlllllIIllI[0], ImageTest.lIIIlllllIIllI[8], ImageTest.lIIIlllllIIllI[9]);
        this.rot = 0.0f;
        if (llIIlIIIIllIIIl(ImageTest.exitMe ? 1 : 0)) {
            lllllllllllllIIllllIIIlllIllIIIl.exit();
        }
        final Image lllllllllllllIIllllIIIlllIllIIII = this.tga.getSubImage(ImageTest.lIIIlllllIIllI[10], ImageTest.lIIIlllllIIllI[10], ImageTest.lIIIlllllIIllI[10], ImageTest.lIIIlllllIIllI[10]);
        System.out.println(lllllllllllllIIllllIIIlllIllIIII.getColor(ImageTest.lIIIlllllIIllI[10], ImageTest.lIIIlllllIIllI[10]));
    }
    
    private static boolean llIIlIIIIllIIlI(final int lllllllllllllIIllllIIIllIlIIlIll, final int lllllllllllllIIllllIIIllIlIIlIlI) {
        return lllllllllllllIIllllIIIllIlIIlIll < lllllllllllllIIllllIIIllIlIIlIlI;
    }
    
    private static void llIIlIIIIlIIlIl() {
        (lIIIlllllIIIll = new String[ImageTest.lIIIlllllIIllI[16]])[ImageTest.lIIIlllllIIllI[0]] = llIIlIIIIlIIIIl("W/Px5+LrcxGtkzoO316IDg==", "RohHp");
        ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[1]] = llIIlIIIIlIIIIl("PYSr7diRMwaGHDApCvfLxxhQGDb3dJXM", "gtQjw");
        ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[2]] = llIIlIIIIlIIIlI("AB0BMQwVDBNqBBsfHWsYGh8=", "txrEh");
        ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[3]] = llIIlIIIIlIIIll("xjt4g8IwBDr+EtYWkPVaBAKbR+rEaUN8", "fSUvE");
        ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[4]] = llIIlIIIIlIIIlI("FS0bMhwAPAlpFA4vB2gfCC4=", "aHhFx");
        ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[5]] = llIIlIIIIlIIIll("oi24v8fHt9SZC1S1ymnGQWk7Pg0Gqbrv", "CEBng");
        ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[14]] = llIIlIIIIlIIIll("mJzO68CNRkujJnWaesTDCkGulBQk7xFH", "oArNt");
    }
    
    private static String llIIlIIIIlIIIll(final String lllllllllllllIIllllIIIllIllllIlI, final String lllllllllllllIIllllIIIllIllllIll) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIllIlllllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIllIllllIll.getBytes(StandardCharsets.UTF_8)), ImageTest.lIIIlllllIIllI[17]), "DES");
            final Cipher lllllllllllllIIllllIIIllIllllllI = Cipher.getInstance("DES");
            lllllllllllllIIllllIIIllIllllllI.init(ImageTest.lIIIlllllIIllI[2], lllllllllllllIIllllIIIllIlllllll);
            return new String(lllllllllllllIIllllIIIllIllllllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIllIllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIllIlllllIl) {
            lllllllllllllIIllllIIIllIlllllIl.printStackTrace();
            return null;
        }
    }
    
    private static boolean llIIlIIIIllIIIl(final int lllllllllllllIIllllIIIllIlIIIlII) {
        return lllllllllllllIIllllIIIllIlIIIlII != 0;
    }
    
    public static void main(final String[] lllllllllllllIIllllIIIlllIIIlllI) {
        final boolean lllllllllllllIIllllIIIlllIIIllIl = ImageTest.lIIIlllllIIllI[0] != 0;
        try {
            ImageTest.exitMe = (ImageTest.lIIIlllllIIllI[0] != 0);
            if (llIIlIIIIllIIIl(lllllllllllllIIllllIIIlllIIIllIl ? 1 : 0)) {
                GameContainer.enableSharedContext();
                ImageTest.exitMe = (ImageTest.lIIIlllllIIllI[1] != 0);
            }
            final AppGameContainer appGameContainer;
            AppGameContainer lllllllllllllIIllllIIIlllIIlIIII = appGameContainer = new AppGameContainer(new ImageTest());
            int forceExit;
            if (llIIlIIIIllIlIl(lllllllllllllIIllllIIIlllIIIllIl ? 1 : 0)) {
                forceExit = ImageTest.lIIIlllllIIllI[1];
                "".length();
                if ((119 + 149 - 127 + 46 ^ 79 + 42 - 27 + 96) <= 0) {
                    return;
                }
            }
            else {
                forceExit = ImageTest.lIIIlllllIIllI[0];
            }
            appGameContainer.setForceExit((boolean)(forceExit != 0));
            lllllllllllllIIllllIIIlllIIlIIII.setDisplayMode(ImageTest.lIIIlllllIIllI[12], ImageTest.lIIIlllllIIllI[13], (boolean)(ImageTest.lIIIlllllIIllI[0] != 0));
            lllllllllllllIIllllIIIlllIIlIIII.start();
            if (llIIlIIIIllIIIl(lllllllllllllIIllllIIIlllIIIllIl ? 1 : 0)) {
                System.out.println(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[14]]);
                ImageTest.exitMe = (ImageTest.lIIIlllllIIllI[0] != 0);
                lllllllllllllIIllllIIIlllIIlIIII = new AppGameContainer(new ImageTest());
                lllllllllllllIIllllIIIlllIIlIIII.setDisplayMode(ImageTest.lIIIlllllIIllI[12], ImageTest.lIIIlllllIIllI[13], (boolean)(ImageTest.lIIIlllllIIllI[0] != 0));
                lllllllllllllIIllllIIIlllIIlIIII.start();
            }
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIllllIIIlllIIIllll) {
            lllllllllllllIIllllIIIlllIIIllll.printStackTrace();
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIllllIIIlllIIlIllI, final int lllllllllllllIIllllIIIlllIIlIlIl) {
        this.rot += lllllllllllllIIllllIIIlllIIlIlIl * 0.1f;
        if (llIIlIIIIllIlII(llIIlIIIIllIIll(this.rot, 360.0f))) {
            this.rot -= 360.0f;
        }
    }
    
    private static boolean llIIlIIIIllIlIl(final int lllllllllllllIIllllIIIllIlIIIIlI) {
        return lllllllllllllIIllllIIIllIlIIIIlI == 0;
    }
    
    private static boolean llIIlIIIIllIlll(final Object lllllllllllllIIllllIIIllIlIIIlll, final Object lllllllllllllIIllllIIIllIlIIIllI) {
        return lllllllllllllIIllllIIIllIlIIIlll == lllllllllllllIIllllIIIllIlIIIllI;
    }
    
    private static boolean llIIlIIIIllIlII(final int lllllllllllllIIllllIIIllIlIIIIII) {
        return lllllllllllllIIllllIIIllIlIIIIII > 0;
    }
    
    private static void llIIlIIIIllIIII() {
        (lIIIlllllIIllI = new int[18])[0] = ((0x48 ^ 0x77 ^ (0x13 ^ 0x63)) & (142 + 163 - 225 + 114 ^ 109 + 77 - 147 + 102 ^ -" ".length()));
        ImageTest.lIIIlllllIIllI[1] = " ".length();
        ImageTest.lIIIlllllIIllI[2] = "  ".length();
        ImageTest.lIIIlllllIIllI[3] = "   ".length();
        ImageTest.lIIIlllllIIllI[4] = (0x57 ^ 0x21 ^ (0x6B ^ 0x19));
        ImageTest.lIIIlllllIIllI[5] = (0x57 ^ 0x52);
        ImageTest.lIIIlllllIIllI[6] = (152 + 205 - 299 + 151 ^ 10 + 56 + 99 + 4);
        ImageTest.lIIIlllllIIllI[7] = 26 + 133 + 17 + 24;
        ImageTest.lIIIlllllIIllI[8] = (59 + 171 - 228 + 205 ^ 4 + 20 + 25 + 88);
        ImageTest.lIIIlllllIIllI[9] = (-(0xFFFFF6FE & 0x6FFD) & (0xFFFFE7FF & 0x7FFF));
        ImageTest.lIIIlllllIIllI[10] = (0xC9 ^ 0x9D ^ (0x5B ^ 0x3D));
        ImageTest.lIIIlllllIIllI[11] = (0x90 ^ 0x8E);
        ImageTest.lIIIlllllIIllI[12] = (-(0xFFFFECA6 & 0x5FDF) & (0xFFFFFFF5 & 0x4FAF));
        ImageTest.lIIIlllllIIllI[13] = (0xFFFF9AF9 & 0x675E);
        ImageTest.lIIIlllllIIllI[14] = (0xCA ^ 0xB8 ^ (0xDB ^ 0xAF));
        ImageTest.lIIIlllllIIllI[15] = (0x8D ^ 0xB4);
        ImageTest.lIIIlllllIIllI[16] = (0x79 ^ 0x7E);
        ImageTest.lIIIlllllIIllI[17] = (0x11 ^ 0x2A ^ (0x66 ^ 0x55));
    }
    
    private static String llIIlIIIIlIIIlI(String lllllllllllllIIllllIIIllIlIllIlI, final String lllllllllllllIIllllIIIllIlIllIIl) {
        lllllllllllllIIllllIIIllIlIllIlI = (char)new String(Base64.getDecoder().decode(((String)lllllllllllllIIllllIIIllIlIllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllllIIIllIlIlllIl = new StringBuilder();
        final char[] lllllllllllllIIllllIIIllIlIlllII = lllllllllllllIIllllIIIllIlIllIIl.toCharArray();
        int lllllllllllllIIllllIIIllIlIllIll = ImageTest.lIIIlllllIIllI[0];
        final long lllllllllllllIIllllIIIllIlIlIlIl = (Object)((String)lllllllllllllIIllllIIIllIlIllIlI).toCharArray();
        final float lllllllllllllIIllllIIIllIlIlIlII = lllllllllllllIIllllIIIllIlIlIlIl.length;
        float lllllllllllllIIllllIIIllIlIlIIll = ImageTest.lIIIlllllIIllI[0];
        while (llIIlIIIIllIIlI((int)lllllllllllllIIllllIIIllIlIlIIll, (int)lllllllllllllIIllllIIIllIlIlIlII)) {
            final char lllllllllllllIIllllIIIllIllIIIII = lllllllllllllIIllllIIIllIlIlIlIl[lllllllllllllIIllllIIIllIlIlIIll];
            lllllllllllllIIllllIIIllIlIlllIl.append((char)(lllllllllllllIIllllIIIllIllIIIII ^ lllllllllllllIIllllIIIllIlIlllII[lllllllllllllIIllllIIIllIlIllIll % lllllllllllllIIllllIIIllIlIlllII.length]));
            "".length();
            ++lllllllllllllIIllllIIIllIlIllIll;
            ++lllllllllllllIIllllIIIllIlIlIIll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllllIIIllIlIlllIl);
    }
    
    public void render(final GameContainer lllllllllllllIIllllIIIlllIlIIlII, final Graphics lllllllllllllIIllllIIIlllIlIIIll) {
        lllllllllllllIIllllIIIlllIlIIIll.drawRect(0.0f, 0.0f, (float)this.image.getWidth(), (float)this.image.getHeight());
        this.image.draw(0.0f, 0.0f);
        this.image.draw(500.0f, 0.0f, 200.0f, 100.0f);
        this.scaleMe.draw(500.0f, 100.0f, 200.0f, 100.0f);
        this.scaled.draw(400.0f, 500.0f);
        final Image lllllllllllllIIllllIIIlllIlIIIlI = this.scaled.getFlippedCopy((boolean)(ImageTest.lIIIlllllIIllI[1] != 0), (boolean)(ImageTest.lIIIlllllIIllI[0] != 0));
        lllllllllllllIIllllIIIlllIlIIIlI.draw(520.0f, 500.0f);
        final Image lllllllllllllIIllllIIIlllIlIIIIl = lllllllllllllIIllllIIIlllIlIIIlI.getFlippedCopy((boolean)(ImageTest.lIIIlllllIIllI[0] != 0), (boolean)(ImageTest.lIIIlllllIIllI[1] != 0));
        lllllllllllllIIllllIIIlllIlIIIIl.draw(520.0f, 380.0f);
        final Image lllllllllllllIIllllIIIlllIlIIIII = lllllllllllllIIllllIIIlllIlIIIIl.getFlippedCopy((boolean)(ImageTest.lIIIlllllIIllI[1] != 0), (boolean)(ImageTest.lIIIlllllIIllI[0] != 0));
        lllllllllllllIIllllIIIlllIlIIIII.draw(400.0f, 380.0f);
        int lllllllllllllIIllllIIIlllIlIIllI = ImageTest.lIIIlllllIIllI[0];
        while (llIIlIIIIllIIlI(lllllllllllllIIllllIIIlllIlIIllI, ImageTest.lIIIlllllIIllI[3])) {
            this.subImage.draw((float)(ImageTest.lIIIlllllIIllI[7] + lllllllllllllIIllllIIIlllIlIIllI * ImageTest.lIIIlllllIIllI[11]), 300.0f);
            ++lllllllllllllIIllllIIIlllIlIIllI;
            "".length();
            if ("   ".length() >= (105 + 53 - 92 + 64 ^ 81 + 4 + 39 + 10)) {
                return;
            }
        }
        lllllllllllllIIllllIIIlllIlIIIll.translate(500.0f, 200.0f);
        lllllllllllllIIllllIIIlllIlIIIll.rotate(50.0f, 50.0f, this.rot);
        lllllllllllllIIllllIIIlllIlIIIll.scale(0.3f, 0.3f);
        this.image.draw();
        lllllllllllllIIllllIIIlllIlIIIll.resetTransform();
        this.rotImage.setRotation(this.rot);
        this.rotImage.draw(100.0f, 200.0f);
    }
    
    private static String llIIlIIIIlIIIIl(final String lllllllllllllIIllllIIIllIllIllll, final String lllllllllllllIIllllIIIllIllIlllI) {
        try {
            final SecretKeySpec lllllllllllllIIllllIIIllIlllIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllllIIIllIllIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIllllIIIllIlllIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIllllIIIllIlllIIIl.init(ImageTest.lIIIlllllIIllI[2], lllllllllllllIIllllIIIllIlllIIlI);
            return new String(lllllllllllllIIllllIIIllIlllIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIllllIIIllIllIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllllIIIllIlllIIII) {
            lllllllllllllIIllllIIIllIlllIIII.printStackTrace();
            return null;
        }
    }
    
    public ImageTest() {
        super(ImageTest.lIIIlllllIIIll[ImageTest.lIIIlllllIIllI[0]]);
    }
    
    private static boolean llIIlIIIIllIllI(final int lllllllllllllIIllllIIIllIlIIllll, final int lllllllllllllIIllllIIIllIlIIlllI) {
        return lllllllllllllIIllllIIIllIlIIllll == lllllllllllllIIllllIIIllIlIIlllI;
    }
}
