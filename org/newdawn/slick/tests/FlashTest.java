// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class FlashTest extends BasicGame
{
    private /* synthetic */ Image image;
    private /* synthetic */ GameContainer container;
    private static final /* synthetic */ int[] llllllllIIIlI;
    private /* synthetic */ boolean flash;
    private static final /* synthetic */ String[] llllllllIIIIl;
    
    private static boolean lIllIIIllIIIlIl(final int lllllllllllllIlIlIIllIlIIlllllll) {
        return lllllllllllllIlIlIIllIlIIlllllll != 0;
    }
    
    public static void main(final String[] lllllllllllllIlIlIIllIlIlIlIIlll) {
        try {
            final AppGameContainer lllllllllllllIlIlIIllIlIlIlIlIIl = new AppGameContainer(new FlashTest());
            lllllllllllllIlIlIIllIlIlIlIlIIl.setDisplayMode(FlashTest.llllllllIIIlI[3], FlashTest.llllllllIIIlI[4], (boolean)(FlashTest.llllllllIIIlI[0] != 0));
            lllllllllllllIlIlIIllIlIlIlIlIIl.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIlIIllIlIlIlIlIII) {
            lllllllllllllIlIlIIllIlIlIlIlIII.printStackTrace();
        }
    }
    
    private static boolean lIllIIIllIIIllI(final int lllllllllllllIlIlIIllIlIlIIIIIlI, final int lllllllllllllIlIlIIllIlIlIIIIIIl) {
        return lllllllllllllIlIlIIllIlIlIIIIIlI == lllllllllllllIlIlIIllIlIlIIIIIIl;
    }
    
    private static String lIllIIIllIIIIIl(final String lllllllllllllIlIlIIllIlIlIIlIlIl, final String lllllllllllllIlIlIIllIlIlIIlIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIlIlIIllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIlIlIIlIlII.getBytes(StandardCharsets.UTF_8)), FlashTest.llllllllIIIlI[7]), "DES");
            final Cipher lllllllllllllIlIlIIllIlIlIIllIIl = Cipher.getInstance("DES");
            lllllllllllllIlIlIIllIlIlIIllIIl.init(FlashTest.llllllllIIIlI[2], lllllllllllllIlIlIIllIlIlIIllIlI);
            return new String(lllllllllllllIlIlIIllIlIlIIllIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIlIlIIllIII) {
            lllllllllllllIlIlIIllIlIlIIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIlIIllIlIlIlIIIlI, final char lllllllllllllIlIlIIllIlIlIlIIIIl) {
        if (lIllIIIllIIIllI(lllllllllllllIlIlIIllIlIlIlIIIlI, FlashTest.llllllllIIIlI[5])) {
            int flash;
            if (lIllIIIllIIIlll(this.flash ? 1 : 0)) {
                flash = FlashTest.llllllllIIIlI[1];
                "".length();
                if (null != null) {
                    return;
                }
            }
            else {
                flash = FlashTest.llllllllIIIlI[0];
            }
            this.flash = (flash != 0);
        }
        if (lIllIIIllIIIllI(lllllllllllllIlIlIIllIlIlIlIIIlI, FlashTest.llllllllIIIlI[1])) {
            this.container.exit();
        }
    }
    
    public void render(final GameContainer lllllllllllllIlIlIIllIlIlIllIIIl, final Graphics lllllllllllllIlIlIIllIlIlIlIlllI) {
        lllllllllllllIlIlIIllIlIlIlIlllI.drawString(FlashTest.llllllllIIIIl[FlashTest.llllllllIIIlI[2]], 10.0f, 50.0f);
        if (lIllIIIllIIIlIl(this.flash ? 1 : 0)) {
            this.image.draw(100.0f, 100.0f);
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        else {
            this.image.drawFlash(100.0f, 100.0f, (float)this.image.getWidth(), (float)this.image.getHeight(), new Color(1.0f, 0.0f, 1.0f, 1.0f));
        }
    }
    
    private static boolean lIllIIIllIIIlll(final int lllllllllllllIlIlIIllIlIIlllllIl) {
        return lllllllllllllIlIlIIllIlIIlllllIl == 0;
    }
    
    private static void lIllIIIllIIIlII() {
        (llllllllIIIlI = new int[8])[0] = ((0xF8 ^ 0x8E ^ (0xDF ^ 0xAF)) & (0x10 ^ 0xD ^ (0x87 ^ 0x9C) ^ -" ".length()));
        FlashTest.llllllllIIIlI[1] = " ".length();
        FlashTest.llllllllIIIlI[2] = "  ".length();
        FlashTest.llllllllIIIlI[3] = (0xFFFFBFB1 & 0x436E);
        FlashTest.llllllllIIIlI[4] = (0xFFFF8FFD & 0x725A);
        FlashTest.llllllllIIIlI[5] = (0x1 ^ 0x38);
        FlashTest.llllllllIIIlI[6] = "   ".length();
        FlashTest.llllllllIIIlI[7] = (0x82 ^ 0x8A);
    }
    
    private static String lIllIIIllIIIIlI(final String lllllllllllllIlIlIIllIlIlIIIlIlI, final String lllllllllllllIlIlIIllIlIlIIIlIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIIllIlIlIIIllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIIllIlIlIIIlIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIIllIlIlIIIllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIIllIlIlIIIllII.init(FlashTest.llllllllIIIlI[2], lllllllllllllIlIlIIllIlIlIIIllIl);
            return new String(lllllllllllllIlIlIIllIlIlIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIIllIlIlIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIIllIlIlIIIlIll) {
            lllllllllllllIlIlIIllIlIlIIIlIll.printStackTrace();
            return null;
        }
    }
    
    static {
        lIllIIIllIIIlII();
        lIllIIIllIIIIll();
    }
    
    private static void lIllIIIllIIIIll() {
        (llllllllIIIIl = new String[FlashTest.llllllllIIIlI[6]])[FlashTest.llllllllIIIlI[0]] = lIllIIIllIIIIIl("5xEbx6avHfnIHHw5sxfvDw==", "TqQfE");
        FlashTest.llllllllIIIIl[FlashTest.llllllllIIIlI[1]] = lIllIIIllIIIIlI("kCzHRiy2ZVA61Rlbns1Y6ohSOj8PyOs6", "KDDvl");
        FlashTest.llllllllIIIIl[FlashTest.llllllllIIIlI[2]] = lIllIIIllIIIIIl("S6L6oX0KrWCmszsujehokxNSi3ZU6aUz", "kxCph");
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIlIIllIlIlIllIlIl) throws SlickException {
        this.container = lllllllllllllIlIlIIllIlIlIllIlIl;
        this.image = new Image(FlashTest.llllllllIIIIl[FlashTest.llllllllIIIlI[1]]);
    }
    
    public FlashTest() {
        super(FlashTest.llllllllIIIIl[FlashTest.llllllllIIIlI[0]]);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIlIIllIlIlIlIllII, final int lllllllllllllIlIlIIllIlIlIlIlIll) {
    }
}
