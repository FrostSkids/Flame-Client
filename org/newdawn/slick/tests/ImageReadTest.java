// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

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
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class ImageReadTest extends BasicGame
{
    private /* synthetic */ Image image;
    private /* synthetic */ Color[] read;
    private static final /* synthetic */ int[] llllIllIlIIll;
    private static final /* synthetic */ String[] llllIllIlIIIl;
    private /* synthetic */ Graphics g;
    
    private static String lIlIlIllIIlllll(final String lllllllllllllIlIllIlIIIIlllllIII, final String lllllllllllllIlIllIlIIIIlllllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIIIllllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIIIlllllIIl.getBytes(StandardCharsets.UTF_8)), ImageReadTest.llllIllIlIIll[17]), "DES");
            final Cipher lllllllllllllIlIllIlIIIIllllllII = Cipher.getInstance("DES");
            lllllllllllllIlIllIlIIIIllllllII.init(ImageReadTest.llllIllIlIIll[5], lllllllllllllIlIllIlIIIIllllllIl);
            return new String(lllllllllllllIlIllIlIIIIllllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIIlllllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIIIlllllIll) {
            lllllllllllllIlIllIlIIIIlllllIll.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIlIlIllIlIIlll(final int lllllllllllllIlIllIlIIIIllllIIlI, final int lllllllllllllIlIllIlIIIIllllIIIl) {
        return lllllllllllllIlIllIlIIIIllllIIlI >= lllllllllllllIlIllIlIIIIllllIIIl;
    }
    
    public ImageReadTest() {
        super(ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[0]]);
        this.read = new Color[ImageReadTest.llllIllIlIIll[1]];
    }
    
    private static void lIlIlIllIlIIlIl() {
        (llllIllIlIIll = new int[18])[0] = ((0x2B ^ 0x4E ^ (0x2E ^ 0xB)) & (161 + 163 - 310 + 231 ^ 104 + 83 - 103 + 97 ^ -" ".length()));
        ImageReadTest.llllIllIlIIll[1] = (0x74 ^ 0x72);
        ImageReadTest.llllIllIlIIll[2] = " ".length();
        ImageReadTest.llllIllIlIIll[3] = (68 + 10 + 67 + 44 ^ 94 + 129 - 147 + 87);
        ImageReadTest.llllIllIlIIll[4] = (0x65 ^ 0x4D);
        ImageReadTest.llllIllIlIIll[5] = "  ".length();
        ImageReadTest.llllIllIlIIll[6] = (0xEE ^ 0xBA ^ (0xC5 ^ 0xA6));
        ImageReadTest.llllIllIlIIll[7] = (0xD9 ^ 0x9C ^ "   ".length());
        ImageReadTest.llllIllIlIIll[8] = "   ".length();
        ImageReadTest.llllIllIlIIll[9] = (0x21 ^ 0x71);
        ImageReadTest.llllIllIlIIll[10] = (0x0 ^ 0x73 ^ (0x70 ^ 0x59));
        ImageReadTest.llllIllIlIIll[11] = (0x27 ^ 0x23);
        ImageReadTest.llllIllIlIIll[12] = (0xCA ^ 0xB4 ^ (0x12 ^ 0x69));
        ImageReadTest.llllIllIlIIll[13] = (0x10 ^ 0x74);
        ImageReadTest.llllIllIlIIll[14] = 150 + 96 - 226 + 180;
        ImageReadTest.llllIllIlIIll[15] = (0xFFFF97A0 & 0x6B7F);
        ImageReadTest.llllIllIlIIll[16] = (0xFFFFFAD8 & 0x77F);
        ImageReadTest.llllIllIlIIll[17] = (0xA5 ^ 0xAD);
    }
    
    static {
        lIlIlIllIlIIlIl();
        lIlIlIllIlIIIIl();
    }
    
    public static void main(final String[] lllllllllllllIlIllIlIIIlIIlIlIII) {
        try {
            final AppGameContainer lllllllllllllIlIllIlIIIlIIlIlIlI = new AppGameContainer(new ImageReadTest());
            lllllllllllllIlIllIlIIIlIIlIlIlI.setDisplayMode(ImageReadTest.llllIllIlIIll[15], ImageReadTest.llllIllIlIIll[16], (boolean)(ImageReadTest.llllIllIlIIll[0] != 0));
            lllllllllllllIlIllIlIIIlIIlIlIlI.start();
            "".length();
            if (-" ".length() > 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIllIlIIIlIIlIlIIl) {
            lllllllllllllIlIllIlIIIlIIlIlIIl.printStackTrace();
        }
    }
    
    private static String lIlIlIllIIllllI(final String lllllllllllllIlIllIlIIIlIIIlllll, final String lllllllllllllIlIllIlIIIlIIIlllII) {
        try {
            final SecretKeySpec lllllllllllllIlIllIlIIIlIIlIIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIllIlIIIlIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIllIlIIIlIIlIIIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIllIlIIIlIIlIIIIl.init(ImageReadTest.llllIllIlIIll[5], lllllllllllllIlIllIlIIIlIIlIIIlI);
            return new String(lllllllllllllIlIllIlIIIlIIlIIIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIlIIIlllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIllIlIIIlIIlIIIII) {
            lllllllllllllIlIllIlIIIlIIlIIIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIlIllIlIIIIl() {
        (llllIllIlIIIl = new String[ImageReadTest.llllIllIlIIll[12]])[ImageReadTest.llllIllIlIIll[0]] = lIlIlIllIIllllI("6qNu9If+EfXjGvlFADxaUg==", "aYjdA");
        ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[2]] = lIlIlIllIIlllll("G2rnc9TGnR8I8k5kNtlkFjWGaWIUODFg", "mMfpW");
        ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[5]] = lIlIlIllIIlllll("PmLAJWZ9eBmekfN2HKfSVtzPt2o5qNVVy4mOVHGIecc=", "XGWwe");
        ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[8]] = lIlIlIllIlIIIII("PB1oOQYSFC1qSw==", "ssHPk");
        ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[11]] = lIlIlIllIIllllI("WS/MhLzIu/xd95HjD7TOqA==", "fgnBp");
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIllIlIIIlIlIIIIIl) throws SlickException {
        this.image = new Image(ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[2]]);
        this.read[ImageReadTest.llllIllIlIIll[0]] = this.image.getColor(ImageReadTest.llllIllIlIIll[0], ImageReadTest.llllIllIlIIll[0]);
        this.read[ImageReadTest.llllIllIlIIll[2]] = this.image.getColor(ImageReadTest.llllIllIlIIll[3], ImageReadTest.llllIllIlIIll[4]);
        this.read[ImageReadTest.llllIllIlIIll[5]] = this.image.getColor(ImageReadTest.llllIllIlIIll[6], ImageReadTest.llllIllIlIIll[7]);
        this.read[ImageReadTest.llllIllIlIIll[8]] = this.image.getColor(ImageReadTest.llllIllIlIIll[9], ImageReadTest.llllIllIlIIll[10]);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIllIlIIIlIIlIlllI, final int lllllllllllllIlIllIlIIIlIIllIIlI) {
        final int lllllllllllllIlIllIlIIIlIIllIIIl = lllllllllllllIlIllIlIIIlIIlIlllI.getInput().getMouseX();
        final int lllllllllllllIlIllIlIIIlIIllIIII = lllllllllllllIlIllIlIIIlIIlIlllI.getInput().getMouseY();
        if (lIlIlIllIlIIlll(lllllllllllllIlIllIlIIIlIIllIIIl, ImageReadTest.llllIllIlIIll[13]) && lIlIlIllIlIIlll(lllllllllllllIlIllIlIIIlIIllIIII, ImageReadTest.llllIllIlIIll[13]) && lIlIlIllIlIlIII(lllllllllllllIlIllIlIIIlIIllIIIl, ImageReadTest.llllIllIlIIll[14]) && lIlIlIllIlIlIII(lllllllllllllIlIllIlIIIlIIllIIII, ImageReadTest.llllIllIlIIll[14])) {
            this.read[ImageReadTest.llllIllIlIIll[11]] = this.image.getColor(lllllllllllllIlIllIlIIIlIIllIIIl - ImageReadTest.llllIllIlIIll[13], lllllllllllllIlIllIlIIIlIIllIIII - ImageReadTest.llllIllIlIIll[13]);
            "".length();
            if (" ".length() < 0) {
                return;
            }
        }
        else {
            this.read[ImageReadTest.llllIllIlIIll[11]] = Color.black;
        }
        this.read[ImageReadTest.llllIllIlIIll[12]] = this.g.getPixel(lllllllllllllIlIllIlIIIlIIllIIIl, lllllllllllllIlIllIlIIIlIIllIIII);
    }
    
    private static boolean lIlIlIllIlIlIII(final int lllllllllllllIlIllIlIIIIlllIlllI, final int lllllllllllllIlIllIlIIIIlllIllIl) {
        return lllllllllllllIlIllIlIIIIlllIlllI < lllllllllllllIlIllIlIIIIlllIllIl;
    }
    
    public void render(final GameContainer lllllllllllllIlIllIlIIIlIIllllII, final Graphics lllllllllllllIlIllIlIIIlIIlllIll) {
        this.g = lllllllllllllIlIllIlIIIlIIlllIll;
        this.image.draw(100.0f, 100.0f);
        lllllllllllllIlIllIlIIIlIIlllIll.setColor(Color.white);
        lllllllllllllIlIllIlIIIlIIlllIll.drawString(ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[5]], 200.0f, 20.0f);
        lllllllllllllIlIllIlIIIlIIlllIll.setColor(this.read[ImageReadTest.llllIllIlIIll[0]]);
        lllllllllllllIlIllIlIIIlIIlllIll.drawString(this.read[ImageReadTest.llllIllIlIIll[0]].toString(), 100.0f, 300.0f);
        lllllllllllllIlIllIlIIIlIIlllIll.setColor(this.read[ImageReadTest.llllIllIlIIll[2]]);
        lllllllllllllIlIllIlIIIlIIlllIll.drawString(this.read[ImageReadTest.llllIllIlIIll[2]].toString(), 150.0f, 320.0f);
        lllllllllllllIlIllIlIIIlIIlllIll.setColor(this.read[ImageReadTest.llllIllIlIIll[5]]);
        lllllllllllllIlIllIlIIIlIIlllIll.drawString(this.read[ImageReadTest.llllIllIlIIll[5]].toString(), 200.0f, 340.0f);
        lllllllllllllIlIllIlIIIlIIlllIll.setColor(this.read[ImageReadTest.llllIllIlIIll[8]]);
        lllllllllllllIlIllIlIIIlIIlllIll.drawString(this.read[ImageReadTest.llllIllIlIIll[8]].toString(), 250.0f, 360.0f);
        if (lIlIlIllIlIIllI(this.read[ImageReadTest.llllIllIlIIll[11]])) {
            lllllllllllllIlIllIlIIIlIIlllIll.setColor(this.read[ImageReadTest.llllIllIlIIll[11]]);
            lllllllllllllIlIllIlIIIlIIlllIll.drawString(String.valueOf(new StringBuilder().append(ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[8]]).append(this.read[ImageReadTest.llllIllIlIIll[11]].toString())), 100.0f, 250.0f);
        }
        if (lIlIlIllIlIIllI(this.read[ImageReadTest.llllIllIlIIll[12]])) {
            lllllllllllllIlIllIlIIIlIIlllIll.setColor(Color.white);
            lllllllllllllIlIllIlIIIlIIlllIll.drawString(String.valueOf(new StringBuilder().append(ImageReadTest.llllIllIlIIIl[ImageReadTest.llllIllIlIIll[11]]).append(this.read[ImageReadTest.llllIllIlIIll[12]].toString())), 100.0f, 270.0f);
        }
    }
    
    private static boolean lIlIlIllIlIIllI(final Object lllllllllllllIlIllIlIIIIlllIlIll) {
        return lllllllllllllIlIllIlIIIIlllIlIll != null;
    }
    
    private static String lIlIlIllIlIIIII(String lllllllllllllIlIllIlIIIlIIIIlIlI, final String lllllllllllllIlIllIlIIIlIIIIlIIl) {
        lllllllllllllIlIllIlIIIlIIIIlIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIllIlIIIlIIIIlIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIllIlIIIlIIIIllIl = new StringBuilder();
        final char[] lllllllllllllIlIllIlIIIlIIIIllII = lllllllllllllIlIllIlIIIlIIIIlIIl.toCharArray();
        int lllllllllllllIlIllIlIIIlIIIIlIll = ImageReadTest.llllIllIlIIll[0];
        final char lllllllllllllIlIllIlIIIlIIIIIlIl = (Object)lllllllllllllIlIllIlIIIlIIIIlIlI.toCharArray();
        final int lllllllllllllIlIllIlIIIlIIIIIlII = lllllllllllllIlIllIlIIIlIIIIIlIl.length;
        Exception lllllllllllllIlIllIlIIIlIIIIIIll = (Exception)ImageReadTest.llllIllIlIIll[0];
        while (lIlIlIllIlIlIII((int)lllllllllllllIlIllIlIIIlIIIIIIll, lllllllllllllIlIllIlIIIlIIIIIlII)) {
            final char lllllllllllllIlIllIlIIIlIIIlIIII = lllllllllllllIlIllIlIIIlIIIIIlIl[lllllllllllllIlIllIlIIIlIIIIIIll];
            lllllllllllllIlIllIlIIIlIIIIllIl.append((char)(lllllllllllllIlIllIlIIIlIIIlIIII ^ lllllllllllllIlIllIlIIIlIIIIllII[lllllllllllllIlIllIlIIIlIIIIlIll % lllllllllllllIlIllIlIIIlIIIIllII.length]));
            "".length();
            ++lllllllllllllIlIllIlIIIlIIIIlIll;
            ++lllllllllllllIlIllIlIIIlIIIIIIll;
            "".length();
            if ("   ".length() == " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIllIlIIIlIIIIllIl);
    }
}
