// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class ImageMemTest extends BasicGame
{
    private static final /* synthetic */ int[] llIlIIlIlIIlIl;
    private static final /* synthetic */ String[] llIlIIlIlIIIII;
    
    public ImageMemTest() {
        super(ImageMemTest.llIlIIlIlIIIII[ImageMemTest.llIlIIlIlIIlIl[0]]);
    }
    
    static {
        lIIlIIlIlIIIlIll();
        lIIlIIlIlIIIlIlI();
    }
    
    public void render(final GameContainer llllllllllllIllIllIIIlIIIIlIllII, final Graphics llllllllllllIllIllIIIlIIIIlIlIll) {
    }
    
    private static void lIIlIIlIlIIIlIll() {
        (llIlIIlIlIIlIl = new int[6])[0] = ((0x48 ^ 0x57) & ~(0x70 ^ 0x6F));
        ImageMemTest.llIlIIlIlIIlIl[1] = (-(0xFFFFFAFD & 0x578F) & (0xFFFFFBFC & 0x5FEF));
        ImageMemTest.llIlIIlIlIIlIl[2] = (0xFFFFA779 & 0x5BA6);
        ImageMemTest.llIlIIlIlIIlIl[3] = (0xFFFFB6FA & 0x4B5D);
        ImageMemTest.llIlIIlIlIIlIl[4] = " ".length();
        ImageMemTest.llIlIIlIlIIlIl[5] = "  ".length();
    }
    
    public static void main(final String[] llllllllllllIllIllIIIlIIIIlIIlII) {
        try {
            final AppGameContainer llllllllllllIllIllIIIlIIIIlIIllI = new AppGameContainer(new ImageMemTest());
            llllllllllllIllIllIIIlIIIIlIIllI.setDisplayMode(ImageMemTest.llIlIIlIlIIlIl[2], ImageMemTest.llIlIIlIlIIlIl[3], (boolean)(ImageMemTest.llIlIIlIlIIlIl[0] != 0));
            llllllllllllIllIllIIIlIIIIlIIllI.start();
            "".length();
            if (-" ".length() >= 0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIllIIIlIIIIlIIlIl) {
            llllllllllllIllIllIIIlIIIIlIIlIl.printStackTrace();
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIllIIIlIIIIllIIlI) throws SlickException {
        try {
            Image llllllllllllIllIllIIIlIIIIllIlll = new Image(ImageMemTest.llIlIIlIlIIlIl[1], ImageMemTest.llIlIIlIlIIlIl[1]);
            llllllllllllIllIllIIIlIIIIllIlll.getGraphics();
            "".length();
            llllllllllllIllIllIIIlIIIIllIlll.destroy();
            llllllllllllIllIllIIIlIIIIllIlll = new Image(ImageMemTest.llIlIIlIlIIlIl[1], ImageMemTest.llIlIIlIlIIlIl[1]);
            llllllllllllIllIllIIIlIIIIllIlll.getGraphics();
            "".length();
            "".length();
            if (((0x8A ^ 0x95 ^ (0xDF ^ 0x93)) & (0x45 ^ 0x6 ^ (0x17 ^ 0x7) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (Exception llllllllllllIllIllIIIlIIIIllIlIl) {
            llllllllllllIllIllIIIlIIIIllIlIl.printStackTrace();
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIllIIIlIIIIlIlIIl, final int llllllllllllIllIllIIIlIIIIlIlIII) {
    }
    
    private static void lIIlIIlIlIIIlIlI() {
        (llIlIIlIlIIIII = new String[ImageMemTest.llIlIIlIlIIlIl[4]])[ImageMemTest.llIlIIlIlIIlIl[0]] = lIIlIIlIlIIIlIIl("+ePGCvAJvWQ4BfFrz2YUyteS+MpxEGgi", "xVhdF");
    }
    
    private static String lIIlIIlIlIIIlIIl(final String llllllllllllIllIllIIIlIIIIIllIll, final String llllllllllllIllIllIIIlIIIIIllIII) {
        try {
            final SecretKeySpec llllllllllllIllIllIIIlIIIIIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIllIIIlIIIIIllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIllIIIlIIIIIlllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIllIIIlIIIIIlllIl.init(ImageMemTest.llIlIIlIlIIlIl[5], llllllllllllIllIllIIIlIIIIIllllI);
            return new String(llllllllllllIllIllIIIlIIIIIlllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIllIIIlIIIIIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIllIIIlIIIIIlllII) {
            llllllllllllIllIllIIIlIIIIIlllII.printStackTrace();
            return null;
        }
    }
}
