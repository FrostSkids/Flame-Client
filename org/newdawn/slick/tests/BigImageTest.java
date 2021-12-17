// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.BigImage;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class BigImageTest extends BasicGame
{
    private static final /* synthetic */ String[] lIlIlIIIllIIIl;
    private /* synthetic */ Image imageX;
    private /* synthetic */ float x;
    private static final /* synthetic */ int[] lIlIlIIIllIIlI;
    private /* synthetic */ Image image;
    private /* synthetic */ Image original;
    private /* synthetic */ float y;
    private /* synthetic */ SpriteSheet bigSheet;
    private /* synthetic */ Image sub;
    private /* synthetic */ Image imageY;
    private /* synthetic */ float ang;
    private /* synthetic */ Image scaledSub;
    
    public void render(final GameContainer lllllllllllllIIIlIlIlIIIIlIlllII, final Graphics lllllllllllllIIIlIlIlIIIIlIllIll) {
        this.original.draw(0.0f, 0.0f, new Color(1.0f, 1.0f, 1.0f, 0.4f));
        this.image.draw(this.x, this.y);
        this.imageX.draw(this.x + 400.0f, this.y);
        this.imageY.draw(this.x, this.y + 300.0f);
        this.scaledSub.draw(this.x + 300.0f, this.y + 300.0f);
        this.bigSheet.getSprite(BigImageTest.lIlIlIIIllIIlI[8], BigImageTest.lIlIlIIIllIIlI[9]).draw(50.0f, 10.0f);
        lllllllllllllIIIlIlIlIIIIlIllIll.setColor(Color.white);
        lllllllllllllIIIlIlIlIIIIlIllIll.drawRect(50.0f, 10.0f, 64.0f, 64.0f);
        lllllllllllllIIIlIlIlIIIIlIllIll.rotate(this.x + 400.0f, this.y + 165.0f, this.ang);
        lllllllllllllIIIlIlIlIIIIlIllIll.drawImage(this.sub, this.x + 300.0f, this.y + 100.0f);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIlIlIlIIIIlIIllll, final int lllllllllllllIIIlIlIlIIIIlIIlllI) throws SlickException {
        this.ang += lllllllllllllIIIlIlIlIIIIlIIlllI * 0.1f;
        if (lllIlIllllIIIIl(lllllllllllllIIIlIlIlIIIIlIIllll.getInput().isKeyDown(BigImageTest.lIlIlIIIllIIlI[12]) ? 1 : 0)) {
            this.x -= lllllllllllllIIIlIlIlIIIIlIIlllI * 0.1f;
        }
        if (lllIlIllllIIIIl(lllllllllllllIIIlIlIlIIIIlIIllll.getInput().isKeyDown(BigImageTest.lIlIlIIIllIIlI[13]) ? 1 : 0)) {
            this.x += lllllllllllllIIIlIlIlIIIIlIIlllI * 0.1f;
        }
        if (lllIlIllllIIIIl(lllllllllllllIIIlIlIlIIIIlIIllll.getInput().isKeyDown(BigImageTest.lIlIlIIIllIIlI[5]) ? 1 : 0)) {
            this.y -= lllllllllllllIIIlIlIlIIIIlIIlllI * 0.1f;
        }
        if (lllIlIllllIIIIl(lllllllllllllIIIlIlIlIIIIlIIllll.getInput().isKeyDown(BigImageTest.lIlIlIIIllIIlI[14]) ? 1 : 0)) {
            this.y += lllllllllllllIIIlIlIlIIIIlIIlllI * 0.1f;
        }
    }
    
    private static void lllIlIllllIIIII() {
        (lIlIlIIIllIIlI = new int[16])[0] = ((0xCF ^ 0x84) & ~(0xF9 ^ 0xB2));
        BigImageTest.lIlIlIIIllIIlI[1] = " ".length();
        BigImageTest.lIlIlIIIllIIlI[2] = "  ".length();
        BigImageTest.lIlIlIIIllIIlI[3] = (-(0xFFFFBFF6 & 0x6CDF) & (0xFFFFBFDF & 0x6EF5));
        BigImageTest.lIlIlIIIllIIlI[4] = (0x8C ^ 0x97) + (0x4B ^ 0x3) - -(0x40 ^ 0x5) + (0x41 ^ 0x6B);
        BigImageTest.lIlIlIIIllIIlI[5] = 150 + 194 - 191 + 47;
        BigImageTest.lIlIlIIIllIIlI[6] = 44 + 118 - 67 + 35;
        BigImageTest.lIlIlIIIllIIlI[7] = (0x5B ^ 0x4B);
        BigImageTest.lIlIlIIIllIIlI[8] = (0x76 ^ 0x71);
        BigImageTest.lIlIlIIIllIIlI[9] = (0xB1 ^ 0xB4);
        BigImageTest.lIlIlIIIllIIlI[10] = (0xFFFF9376 & 0x6FA9);
        BigImageTest.lIlIlIIIllIIlI[11] = (0xFFFF9BDB & 0x667C);
        BigImageTest.lIlIlIIIllIIlI[12] = 125 + 0 + 24 + 17 + (69 + 9 - 41 + 110) - (0xFFFF9B3D & 0x65C6) + (137 + 107 - 198 + 104);
        BigImageTest.lIlIlIIIllIIlI[13] = (0x34 ^ 0x1D) + (0x31 ^ 0x7A) - -(0x1 ^ 0x10) + (0xCB ^ 0x83);
        BigImageTest.lIlIlIIIllIIlI[14] = (0xCD ^ 0xA9) + (78 + 153 - 137 + 99) - (0xCC ^ 0xB5) + (0x80 ^ 0xA4);
        BigImageTest.lIlIlIIIllIIlI[15] = (0x50 ^ 0x58);
    }
    
    public static void main(final String[] lllllllllllllIIIlIlIlIIIIlIlIlIl) {
        try {
            final AppGameContainer lllllllllllllIIIlIlIlIIIIlIlIlll = new AppGameContainer(new BigImageTest());
            lllllllllllllIIIlIlIlIIIIlIlIlll.setDisplayMode(BigImageTest.lIlIlIIIllIIlI[10], BigImageTest.lIlIlIIIllIIlI[11], (boolean)(BigImageTest.lIlIlIIIllIIlI[0] != 0));
            lllllllllllllIIIlIlIlIIIIlIlIlll.start();
            "".length();
            if (-(0xD4 ^ 0xA0 ^ (0x54 ^ 0x24)) >= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIlIlIlIIIIlIlIllI) {
            lllllllllllllIIIlIlIlIIIIlIlIllI.printStackTrace();
        }
    }
    
    public BigImageTest() {
        super(BigImageTest.lIlIlIIIllIIIl[BigImageTest.lIlIlIIIllIIlI[0]]);
        this.ang = 30.0f;
    }
    
    private static boolean lllIlIllllIIIIl(final int lllllllllllllIIIlIlIlIIIIIllllII) {
        return lllllllllllllIIIlIlIlIIIIIllllII != 0;
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIlIlIlIIIIllIIIIl) throws SlickException {
        final BigImage bigImage = new BigImage(BigImageTest.lIlIlIIIllIIIl[BigImageTest.lIlIlIIIllIIlI[1]], BigImageTest.lIlIlIIIllIIlI[2], BigImageTest.lIlIlIIIllIIlI[3]);
        this.image = bigImage;
        this.original = bigImage;
        this.sub = this.image.getSubImage(BigImageTest.lIlIlIIIllIIlI[4], BigImageTest.lIlIlIIIllIIlI[4], BigImageTest.lIlIlIIIllIIlI[5], BigImageTest.lIlIlIIIllIIlI[6]);
        this.scaledSub = this.sub.getScaledCopy(2.0f);
        this.image = this.image.getScaledCopy(0.3f);
        this.imageX = this.image.getFlippedCopy((boolean)(BigImageTest.lIlIlIIIllIIlI[1] != 0), (boolean)(BigImageTest.lIlIlIIIllIIlI[0] != 0));
        this.imageY = this.imageX.getFlippedCopy((boolean)(BigImageTest.lIlIlIIIllIIlI[1] != 0), (boolean)(BigImageTest.lIlIlIIIllIIlI[1] != 0));
        this.bigSheet = new SpriteSheet(this.original, BigImageTest.lIlIlIIIllIIlI[7], BigImageTest.lIlIlIIIllIIlI[7]);
    }
    
    private static void lllIlIlllIlllll() {
        (lIlIlIIIllIIIl = new String[BigImageTest.lIlIlIIIllIIlI[2]])[BigImageTest.lIlIlIIIllIIlI[0]] = lllIlIlllIllllI("ca5p4eEYOYzfS7BnwK/6+Q==", "BqLJn");
        BigImageTest.lIlIlIIIllIIIl[BigImageTest.lIlIlIIIllIIlI[1]] = lllIlIlllIllllI("54rtXriBzQglCGLvn3v2vZrF9z6AOfRo", "teEZP");
    }
    
    private static String lllIlIlllIllllI(final String lllllllllllllIIIlIlIlIIIIlIIIIIl, final String lllllllllllllIIIlIlIlIIIIlIIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIlIlIlIIIIlIIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIlIlIIIIlIIIIlI.getBytes(StandardCharsets.UTF_8)), BigImageTest.lIlIlIIIllIIlI[15]), "DES");
            final Cipher lllllllllllllIIIlIlIlIIIIlIIIlIl = Cipher.getInstance("DES");
            lllllllllllllIIIlIlIlIIIIlIIIlIl.init(BigImageTest.lIlIlIIIllIIlI[2], lllllllllllllIIIlIlIlIIIIlIIIllI);
            return new String(lllllllllllllIIIlIlIlIIIIlIIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIlIlIIIIlIIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIlIlIlIIIIlIIIlII) {
            lllllllllllllIIIlIlIlIIIIlIIIlII.printStackTrace();
            return null;
        }
    }
    
    static {
        lllIlIllllIIIII();
        lllIlIlllIlllll();
    }
}
