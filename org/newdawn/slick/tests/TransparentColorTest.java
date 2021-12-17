// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class TransparentColorTest extends BasicGame
{
    private /* synthetic */ Image image;
    private static final /* synthetic */ int[] llIIlIIIllIlII;
    private /* synthetic */ Image timage;
    private static final /* synthetic */ String[] llIIlIIIllIIlI;
    
    public static void main(final String[] llllllllllllIlllIIlIlllIlIIIlIIl) {
        try {
            final AppGameContainer llllllllllllIlllIIlIlllIlIIIlIll = new AppGameContainer(new TransparentColorTest());
            llllllllllllIlllIIlIlllIlIIIlIll.setDisplayMode(TransparentColorTest.llIIlIIIllIlII[7], TransparentColorTest.llIIlIIIllIlII[8], (boolean)(TransparentColorTest.llIIlIIIllIlII[0] != 0));
            llllllllllllIlllIIlIlllIlIIIlIll.start();
            "".length();
            if (((0xA3 ^ 0xA4) & ~(0x1F ^ 0x18)) != 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllIIlIlllIlIIIlIlI) {
            llllllllllllIlllIIlIlllIlIIIlIlI.printStackTrace();
        }
    }
    
    private static String lIIIllIIIIIIIIll(final String llllllllllllIlllIIlIlllIIllIlllI, final String llllllllllllIlllIIlIlllIIllIllIl) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlllIIlllIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlllIIllIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIIlIlllIIlllIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIlllIIlIlllIIlllIIlI.init(TransparentColorTest.llIIlIIIllIlII[2], llllllllllllIlllIIlIlllIIlllIIll);
            return new String(llllllllllllIlllIIlIlllIIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlllIIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlllIIlllIIIl) {
            llllllllllllIlllIIlIlllIIlllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIIlIlllIlIIIlllI, final int llllllllllllIlllIIlIlllIlIIIllIl) {
    }
    
    public void render(final GameContainer llllllllllllIlllIIlIlllIlIIlIIll, final Graphics llllllllllllIlllIIlIlllIlIIlIIII) {
        llllllllllllIlllIIlIlllIlIIlIIII.setBackground(Color.red);
        this.image.draw(10.0f, 10.0f);
        this.timage.draw(10.0f, 310.0f);
    }
    
    private static void lIIIllIIIIIIllII() {
        (llIIlIIIllIIlI = new String[TransparentColorTest.llIIlIIIllIlII[9]])[TransparentColorTest.llIIlIIIllIlII[0]] = lIIIllIIIIIIIIlI("HHD6SgYF2AoFmwkAONrcIyb9rsQa1H1D", "cvySs");
        TransparentColorTest.llIIlIIIllIIlI[TransparentColorTest.llIIlIIIllIlII[1]] = lIIIllIIIIIIIIll("5AyVzuDCn1vroED/L6i+HX4ryWvUG86+", "GbmAQ");
        TransparentColorTest.llIIlIIIllIIlI[TransparentColorTest.llIIlIIIllIlII[2]] = lIIIllIIIIIIIIll("KBukVPJ1rUaCxWZNC5pBdnvJVzMsnXKG", "mySxY");
    }
    
    public TransparentColorTest() {
        super(TransparentColorTest.llIIlIIIllIIlI[TransparentColorTest.llIIlIIIllIlII[0]]);
    }
    
    static {
        lIIIllIIIIIIlllI();
        lIIIllIIIIIIllII();
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlllIIlIlllIlIIIIllI, final char llllllllllllIlllIIlIlllIlIIIIlIl) {
    }
    
    private static void lIIIllIIIIIIlllI() {
        (llIIlIIIllIlII = new int[11])[0] = ((0xA6 ^ 0xB0 ^ (0x5E ^ 0x11)) & (100 + 156 - 117 + 80 ^ 18 + 5 + 75 + 32 ^ -" ".length()));
        TransparentColorTest.llIIlIIIllIlII[1] = " ".length();
        TransparentColorTest.llIIlIIIllIlII[2] = "  ".length();
        TransparentColorTest.llIIlIIIllIlII[3] = (0x99 ^ 0xC7);
        TransparentColorTest.llIIlIIIllIlII[4] = (48 + 18 + 15 + 173 ^ 48 + 9 + 122 + 9);
        TransparentColorTest.llIIlIIIllIlII[5] = (20 + 119 - 102 + 115 ^ 110 + 154 - 136 + 49);
        TransparentColorTest.llIIlIIIllIlII[6] = (0x97 ^ 0xC3) + (49 + 133 - 45 + 46) - (0x5F ^ 0x4) + (0xE6 ^ 0xA9);
        TransparentColorTest.llIIlIIIllIlII[7] = (-(0xFFFFFCD7 & 0x7FAF) & (0xFFFFFFBE & 0x7FE7));
        TransparentColorTest.llIIlIIIllIlII[8] = (0xFFFFE779 & 0x1ADE);
        TransparentColorTest.llIIlIIIllIlII[9] = "   ".length();
        TransparentColorTest.llIIlIIIllIlII[10] = (0x4 ^ 0xC);
    }
    
    private static String lIIIllIIIIIIIIlI(final String llllllllllllIlllIIlIlllIIlllllIl, final String llllllllllllIlllIIlIlllIIlllllII) {
        try {
            final SecretKeySpec llllllllllllIlllIIlIlllIlIIIIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIlIlllIIlllllII.getBytes(StandardCharsets.UTF_8)), TransparentColorTest.llIIlIIIllIlII[10]), "DES");
            final Cipher llllllllllllIlllIIlIlllIIlllllll = Cipher.getInstance("DES");
            llllllllllllIlllIIlIlllIIlllllll.init(TransparentColorTest.llIIlIIIllIlII[2], llllllllllllIlllIIlIlllIlIIIIIII);
            return new String(llllllllllllIlllIIlIlllIIlllllll.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIlIlllIIlllllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIIlIlllIIllllllI) {
            llllllllllllIlllIIlIlllIIllllllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIIlIlllIlIIllIII) throws SlickException {
        this.image = new Image(TransparentColorTest.llIIlIIIllIIlI[TransparentColorTest.llIIlIIIllIlII[1]]);
        this.timage = new Image(TransparentColorTest.llIIlIIIllIIlI[TransparentColorTest.llIIlIIIllIlII[2]], new Color(TransparentColorTest.llIIlIIIllIlII[3], TransparentColorTest.llIIlIIIllIlII[4], TransparentColorTest.llIIlIIIllIlII[5], TransparentColorTest.llIIlIIIllIlII[6]));
    }
}
