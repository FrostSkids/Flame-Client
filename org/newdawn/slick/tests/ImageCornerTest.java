// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class ImageCornerTest extends BasicGame
{
    private /* synthetic */ int height;
    private /* synthetic */ Image image;
    private static final /* synthetic */ int[] llIlIlllIlIllI;
    private /* synthetic */ int width;
    private /* synthetic */ Image[] images;
    private static final /* synthetic */ String[] llIlIlllIlIIlI;
    
    private static String lIIlIlIllIlllllI(final String llllllllllllIllIlIIIllllIlllllII, final String llllllllllllIllIlIIIllllIlllIllI) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIlllllIIIIIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIllllIlllIllI.getBytes(StandardCharsets.UTF_8)), ImageCornerTest.llIlIlllIlIllI[9]), "DES");
            final Cipher llllllllllllIllIlIIIlllllIIIIIII = Cipher.getInstance("DES");
            llllllllllllIllIlIIIlllllIIIIIII.init(ImageCornerTest.llIlIlllIlIllI[4], llllllllllllIllIlIIIlllllIIIIIlI);
            return new String(llllllllllllIllIlIIIlllllIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIllllIlllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIllllIllllllI) {
            llllllllllllIllIlIIIllllIllllllI.printStackTrace();
            return null;
        }
    }
    
    static {
        lIIlIlIlllIIIIlI();
        lIIlIlIllIllllll();
    }
    
    public static void main(final String[] llllllllllllIllIlIIIlllllIllIIll) {
        final boolean llllllllllllIllIlIIIlllllIllIIIl = ImageCornerTest.llIlIlllIlIllI[0] != 0;
        try {
            final AppGameContainer llllllllllllIllIlIIIlllllIllIlIl = new AppGameContainer(new ImageCornerTest());
            llllllllllllIllIlIIIlllllIllIlIl.setDisplayMode(ImageCornerTest.llIlIlllIlIllI[11], ImageCornerTest.llIlIlllIlIllI[12], (boolean)(ImageCornerTest.llIlIlllIlIllI[0] != 0));
            llllllllllllIllIlIIIlllllIllIlIl.start();
            "".length();
            if ((0x49 ^ 0x6F ^ (0x25 ^ 0x7)) == 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIlIIIlllllIllIlII) {
            llllllllllllIllIlIIIlllllIllIlII.printStackTrace();
        }
    }
    
    public ImageCornerTest() {
        super(ImageCornerTest.llIlIlllIlIIlI[ImageCornerTest.llIlIlllIlIllI[0]]);
    }
    
    public void render(final GameContainer llllllllllllIllIlIIIllllllIIIIII, final Graphics llllllllllllIllIlIIIlllllIlllllI) {
        int llllllllllllIllIlIIIllllllIIIIll = ImageCornerTest.llIlIlllIlIllI[0];
        while (lIIlIlIlllIIIIll(llllllllllllIllIlIIIllllllIIIIll, ImageCornerTest.llIlIlllIlIllI[2])) {
            int llllllllllllIllIlIIIllllllIIIlII = ImageCornerTest.llIlIlllIlIllI[0];
            while (lIIlIlIlllIIIIll(llllllllllllIllIlIIIllllllIIIlII, ImageCornerTest.llIlIlllIlIllI[2])) {
                this.images[llllllllllllIllIlIIIllllllIIIIll + llllllllllllIllIlIIIllllllIIIlII * ImageCornerTest.llIlIlllIlIllI[2]].draw((float)(ImageCornerTest.llIlIlllIlIllI[10] + llllllllllllIllIlIIIllllllIIIIll * this.width), (float)(ImageCornerTest.llIlIlllIlIllI[10] + llllllllllllIllIlIIIllllllIIIlII * this.height));
                ++llllllllllllIllIlIIIllllllIIIlII;
                "".length();
                if (((0x2E ^ 0x2A) & ~(0xC7 ^ 0xC3)) < 0) {
                    return;
                }
            }
            ++llllllllllllIllIlIIIllllllIIIIll;
            "".length();
            if (null != null) {
                return;
            }
        }
    }
    
    private static void lIIlIlIllIllllll() {
        (llIlIlllIlIIlI = new String[ImageCornerTest.llIlIlllIlIllI[4]])[ImageCornerTest.llIlIlllIlIllI[0]] = lIIlIlIllIllllIl("XDXGMZZA8M/NYw567nxMizeHtrwv6W/w", "bFsgb");
        ImageCornerTest.llIlIlllIlIIlI[ImageCornerTest.llIlIlllIlIllI[1]] = lIIlIlIllIlllllI("usBaPPOuYQ/y28/s1MOjorh8/SKh3/he", "TGuit");
    }
    
    private static void lIIlIlIlllIIIIlI() {
        (llIlIlllIlIllI = new int[13])[0] = ((0x86 ^ 0xC3 ^ (0x5A ^ 0x5C)) & (34 + 48 + 89 + 39 ^ 95 + 1 - 86 + 135 ^ -" ".length()));
        ImageCornerTest.llIlIlllIlIllI[1] = " ".length();
        ImageCornerTest.llIlIlllIlIllI[2] = "   ".length();
        ImageCornerTest.llIlIlllIlIllI[3] = (73 + 96 - 100 + 64 ^ 54 + 21 + 65 + 0);
        ImageCornerTest.llIlIlllIlIllI[4] = "  ".length();
        ImageCornerTest.llIlIlllIlIllI[5] = (0x7E ^ 0x7A);
        ImageCornerTest.llIlIlllIlIllI[6] = (0x94 ^ 0x91);
        ImageCornerTest.llIlIlllIlIllI[7] = (113 + 88 - 170 + 129 ^ 75 + 126 - 63 + 28);
        ImageCornerTest.llIlIlllIlIllI[8] = (0x5A ^ 0x46 ^ (0x79 ^ 0x62));
        ImageCornerTest.llIlIlllIlIllI[9] = (0x97 ^ 0x9F);
        ImageCornerTest.llIlIlllIlIllI[10] = (0xE7 ^ 0x83);
        ImageCornerTest.llIlIlllIlIllI[11] = (0xFFFF8FF9 & 0x7326);
        ImageCornerTest.llIlIlllIlIllI[12] = (-(0xFFFFDD77 & 0x7F8C) & (0xFFFFDF7F & 0x7FDB));
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIlIIIllllllIIlIll) throws SlickException {
        this.image = new Image(ImageCornerTest.llIlIlllIlIIlI[ImageCornerTest.llIlIlllIlIllI[1]]);
        this.width = this.image.getWidth() / ImageCornerTest.llIlIlllIlIllI[2];
        this.height = this.image.getHeight() / ImageCornerTest.llIlIlllIlIllI[2];
        final Image[] images = new Image[ImageCornerTest.llIlIlllIlIllI[3]];
        images[ImageCornerTest.llIlIlllIlIllI[0]] = this.image.getSubImage(ImageCornerTest.llIlIlllIlIllI[0], ImageCornerTest.llIlIlllIlIllI[0], this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[1]] = this.image.getSubImage(this.width, ImageCornerTest.llIlIlllIlIllI[0], this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[4]] = this.image.getSubImage(this.width * ImageCornerTest.llIlIlllIlIllI[4], ImageCornerTest.llIlIlllIlIllI[0], this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[2]] = this.image.getSubImage(ImageCornerTest.llIlIlllIlIllI[0], this.height, this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[5]] = this.image.getSubImage(this.width, this.height, this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[6]] = this.image.getSubImage(this.width * ImageCornerTest.llIlIlllIlIllI[4], this.height, this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[7]] = this.image.getSubImage(ImageCornerTest.llIlIlllIlIllI[0], this.height * ImageCornerTest.llIlIlllIlIllI[4], this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[8]] = this.image.getSubImage(this.width, this.height * ImageCornerTest.llIlIlllIlIllI[4], this.width, this.height);
        images[ImageCornerTest.llIlIlllIlIllI[9]] = this.image.getSubImage(this.width * ImageCornerTest.llIlIlllIlIllI[4], this.height * ImageCornerTest.llIlIlllIlIllI[4], this.width, this.height);
        this.images = images;
        this.images[ImageCornerTest.llIlIlllIlIllI[0]].setColor(ImageCornerTest.llIlIlllIlIllI[4], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[1]].setColor(ImageCornerTest.llIlIlllIlIllI[2], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[1]].setColor(ImageCornerTest.llIlIlllIlIllI[4], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[4]].setColor(ImageCornerTest.llIlIlllIlIllI[2], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[2]].setColor(ImageCornerTest.llIlIlllIlIllI[1], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[2]].setColor(ImageCornerTest.llIlIlllIlIllI[4], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[5]].setColor(ImageCornerTest.llIlIlllIlIllI[1], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[5]].setColor(ImageCornerTest.llIlIlllIlIllI[0], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[5]].setColor(ImageCornerTest.llIlIlllIlIllI[2], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[5]].setColor(ImageCornerTest.llIlIlllIlIllI[4], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[6]].setColor(ImageCornerTest.llIlIlllIlIllI[0], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[6]].setColor(ImageCornerTest.llIlIlllIlIllI[2], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[7]].setColor(ImageCornerTest.llIlIlllIlIllI[1], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[8]].setColor(ImageCornerTest.llIlIlllIlIllI[1], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[8]].setColor(ImageCornerTest.llIlIlllIlIllI[0], 0.0f, 1.0f, 1.0f, 1.0f);
        this.images[ImageCornerTest.llIlIlllIlIllI[9]].setColor(ImageCornerTest.llIlIlllIlIllI[0], 0.0f, 1.0f, 1.0f, 1.0f);
    }
    
    private static boolean lIIlIlIlllIIIIll(final int llllllllllllIllIlIIIllllIllIIllI, final int llllllllllllIllIlIIIllllIllIIlII) {
        return llllllllllllIllIlIIIllllIllIIllI < llllllllllllIllIlIIIllllIllIIlII;
    }
    
    private static String lIIlIlIllIllllIl(final String llllllllllllIllIlIIIlllllIIlIIlI, final String llllllllllllIllIlIIIlllllIIIllII) {
        try {
            final SecretKeySpec llllllllllllIllIlIIIlllllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIIIlllllIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIIIlllllIIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIIIlllllIIlIllI.init(ImageCornerTest.llIlIlllIlIllI[4], llllllllllllIllIlIIIlllllIIllIII);
            return new String(llllllllllllIllIlIIIlllllIIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIIIlllllIIlIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIIIlllllIIlIlII) {
            llllllllllllIllIlIIIlllllIIlIlII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIlIIIlllllIlIlIIl, final int llllllllllllIllIlIIIlllllIlIlIII) throws SlickException {
    }
}
