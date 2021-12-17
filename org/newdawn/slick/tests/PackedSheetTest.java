// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.SpriteSheet;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Animation;
import org.newdawn.slick.PackedSpriteSheet;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class PackedSheetTest extends BasicGame
{
    private static final /* synthetic */ String[] llIIIlIIIlIlll;
    private /* synthetic */ Image rocket;
    private /* synthetic */ PackedSpriteSheet sheet;
    private /* synthetic */ Animation runner;
    private /* synthetic */ GameContainer container;
    private static final /* synthetic */ int[] llIIIlIIIllIIl;
    private /* synthetic */ float ang;
    private /* synthetic */ float r;
    
    @Override
    public void keyPressed(final int llllllllllllIlllIllIIIlIIlIllIll, final char llllllllllllIlllIllIIIlIIlIlllIl) {
        if (lIIIlIIIllIlllll(llllllllllllIlllIllIIIlIIlIllIll, PackedSheetTest.llIIIlIIIllIIl[1])) {
            this.container.exit();
        }
    }
    
    private static String lIIIlIIIllIlIlII(final String llllllllllllIlllIllIIIlIIlIIIllI, final String llllllllllllIlllIllIIIlIIlIIIIll) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIlIIlIIlIIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIlIIlIIIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIIlIIlIIlIII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIIlIIlIIlIII.init(PackedSheetTest.llIIIlIIIllIIl[2], llllllllllllIlllIllIIIlIIlIIlIIl);
            return new String(llllllllllllIlllIllIIIlIIlIIlIII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIlIIlIIIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIlIIlIIIlll) {
            llllllllllllIlllIllIIIlIIlIIIlll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIllIIIlIIllllIII) throws SlickException {
        this.container = llllllllllllIlllIllIIIlIIllllIII;
        this.sheet = new PackedSpriteSheet(PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[1]], PackedSheetTest.llIIIlIIIllIIl[2]);
        this.rocket = this.sheet.getSprite(PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[2]]);
        final SpriteSheet llllllllllllIlllIllIIIlIIllllIlI = this.sheet.getSpriteSheet(PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[3]]);
        this.runner = new Animation();
        int llllllllllllIlllIllIIIlIIlllllIl = PackedSheetTest.llIIIlIIIllIIl[0];
        while (lIIIlIIIllIlllII(llllllllllllIlllIllIIIlIIlllllIl, PackedSheetTest.llIIIlIIIllIIl[2])) {
            int llllllllllllIlllIllIIIlIIllllllI = PackedSheetTest.llIIIlIIIllIIl[0];
            while (lIIIlIIIllIlllII(llllllllllllIlllIllIIIlIIllllllI, PackedSheetTest.llIIIlIIIllIIl[4])) {
                this.runner.addFrame(llllllllllllIlllIllIIIlIIllllIlI.getSprite(llllllllllllIlllIllIIIlIIllllllI, llllllllllllIlllIllIIIlIIlllllIl), PackedSheetTest.llIIIlIIIllIIl[5]);
                ++llllllllllllIlllIllIIIlIIllllllI;
                "".length();
                if (-" ".length() == "  ".length()) {
                    return;
                }
            }
            ++llllllllllllIlllIllIIIlIIlllllIl;
            "".length();
            if (" ".length() > (0x6 ^ 0x2)) {
                return;
            }
        }
    }
    
    private static String lIIIlIIIllIlIllI(String llllllllllllIlllIllIIIlIIIllIIIl, final String llllllllllllIlllIllIIIlIIIllIIII) {
        llllllllllllIlllIllIIIlIIIllIIIl = new String(Base64.getDecoder().decode(llllllllllllIlllIllIIIlIIIllIIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIIlIIIllIlII = new StringBuilder();
        final char[] llllllllllllIlllIllIIIlIIIllIIll = llllllllllllIlllIllIIIlIIIllIIII.toCharArray();
        int llllllllllllIlllIllIIIlIIIllIIlI = PackedSheetTest.llIIIlIIIllIIl[0];
        final double llllllllllllIlllIllIIIlIIIlIllII = (Object)llllllllllllIlllIllIIIlIIIllIIIl.toCharArray();
        final float llllllllllllIlllIllIIIlIIIlIlIll = llllllllllllIlllIllIIIlIIIlIllII.length;
        double llllllllllllIlllIllIIIlIIIlIlIlI = PackedSheetTest.llIIIlIIIllIIl[0];
        while (lIIIlIIIllIlllII((int)llllllllllllIlllIllIIIlIIIlIlIlI, (int)llllllllllllIlllIllIIIlIIIlIlIll)) {
            final char llllllllllllIlllIllIIIlIIIllIlll = llllllllllllIlllIllIIIlIIIlIllII[llllllllllllIlllIllIIIlIIIlIlIlI];
            llllllllllllIlllIllIIIlIIIllIlII.append((char)(llllllllllllIlllIllIIIlIIIllIlll ^ llllllllllllIlllIllIIIlIIIllIIll[llllllllllllIlllIllIIIlIIIllIIlI % llllllllllllIlllIllIIIlIIIllIIll.length]));
            "".length();
            ++llllllllllllIlllIllIIIlIIIllIIlI;
            ++llllllllllllIlllIllIIIlIIIlIlIlI;
            "".length();
            if (-(0xD8 ^ 0x8B ^ (0xDE ^ 0x89)) >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIIlIIIllIlII);
    }
    
    private static boolean lIIIlIIIllIlllll(final int llllllllllllIlllIllIIIlIIIlIIllI, final int llllllllllllIlllIllIIIlIIIlIIlIl) {
        return llllllllllllIlllIllIIIlIIIlIIllI == llllllllllllIlllIllIIIlIIIlIIlIl;
    }
    
    private static boolean lIIIlIIIllIllllI(final int llllllllllllIlllIllIIIlIIIIlllll) {
        return llllllllllllIlllIllIIIlIIIIlllll > 0;
    }
    
    private static int lIIIlIIIllIlllIl(final float n, final float n2) {
        return fcmpl(n, n2);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIllIIIlIIllIlIlI, final int llllllllllllIlllIllIIIlIIllIIlll) {
        this.r += llllllllllllIlllIllIIIlIIllIIlll * 0.4f;
        if (lIIIlIIIllIllllI(lIIIlIIIllIlllIl(this.r, 900.0f))) {
            this.r = -500.0f;
        }
        this.ang += llllllllllllIlllIllIIIlIIllIIlll * 0.1f;
    }
    
    private static void lIIIlIIIllIlIlll() {
        (llIIIlIIIlIlll = new String[PackedSheetTest.llIIIlIIIllIIl[9]])[PackedSheetTest.llIIIlIIIllIIl[0]] = lIIIlIIIllIlIlII("0vUx06mPY8QACyMu0lxH61GuIuDO0LjtbDpsxCkPe38=", "YFgvD");
        PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[1]] = lIIIlIIIllIlIlIl("HGbHWC4KFg3Hg/JqFCkFQYirLUwfVEwu", "xuJyC");
        PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[2]] = lIIIlIIIllIlIllI("BCgWGx8C", "vGupz");
        PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[3]] = lIIIlIIIllIlIllI("IzEgDx8j", "QDNaz");
        PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[6]] = lIIIlIIIllIlIlIl("jkEN27WJ8jg=", "KfFfJ");
    }
    
    public PackedSheetTest() {
        super(PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[0]]);
        this.r = -500.0f;
    }
    
    public void render(final GameContainer llllllllllllIlllIllIIIlIIlllIIIl, final Graphics llllllllllllIlllIllIIIlIIllIlllI) {
        this.rocket.draw((float)(int)this.r, 100.0f);
        this.runner.draw(250.0f, 250.0f);
        llllllllllllIlllIllIIIlIIllIlllI.scale(1.2f, 1.2f);
        this.runner.draw(250.0f, 250.0f);
        llllllllllllIlllIllIIIlIIllIlllI.scale(1.2f, 1.2f);
        this.runner.draw(250.0f, 250.0f);
        llllllllllllIlllIllIIIlIIllIlllI.resetTransform();
        llllllllllllIlllIllIIIlIIllIlllI.rotate(670.0f, 470.0f, this.ang);
        this.sheet.getSprite(PackedSheetTest.llIIIlIIIlIlll[PackedSheetTest.llIIIlIIIllIIl[6]]).draw(600.0f, 400.0f);
    }
    
    static {
        lIIIlIIIllIllIll();
        lIIIlIIIllIlIlll();
    }
    
    private static boolean lIIIlIIIllIlllII(final int llllllllllllIlllIllIIIlIIIlIIIlI, final int llllllllllllIlllIllIIIlIIIlIIIIl) {
        return llllllllllllIlllIllIIIlIIIlIIIlI < llllllllllllIlllIllIIIlIIIlIIIIl;
    }
    
    public static void main(final String[] llllllllllllIlllIllIIIlIIllIIIll) {
        try {
            final AppGameContainer llllllllllllIlllIllIIIlIIllIIlIl = new AppGameContainer(new PackedSheetTest());
            llllllllllllIlllIllIIIlIIllIIlIl.setDisplayMode(PackedSheetTest.llIIIlIIIllIIl[7], PackedSheetTest.llIIIlIIIllIIl[8], (boolean)(PackedSheetTest.llIIIlIIIllIIl[0] != 0));
            llllllllllllIlllIllIIIlIIllIIlIl.start();
            "".length();
            if ((0xAD ^ 0xA8) == 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllIllIIIlIIllIIlII) {
            llllllllllllIlllIllIIIlIIllIIlII.printStackTrace();
        }
    }
    
    private static String lIIIlIIIllIlIlIl(final String llllllllllllIlllIllIIIlIIlIlIIll, final String llllllllllllIlllIllIIIlIIlIlIIII) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIIlIIlIlIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIIlIIlIlIIII.getBytes(StandardCharsets.UTF_8)), PackedSheetTest.llIIIlIIIllIIl[10]), "DES");
            final Cipher llllllllllllIlllIllIIIlIIlIlIlIl = Cipher.getInstance("DES");
            llllllllllllIlllIllIIIlIIlIlIlIl.init(PackedSheetTest.llIIIlIIIllIIl[2], llllllllllllIlllIllIIIlIIlIlIllI);
            return new String(llllllllllllIlllIllIIIlIIlIlIlIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIIlIIlIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIIlIIlIlIlII) {
            llllllllllllIlllIllIIIlIIlIlIlII.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIlIIIllIllIll() {
        (llIIIlIIIllIIl = new int[11])[0] = ((0xB ^ 0x2F) & ~(0x88 ^ 0xAC));
        PackedSheetTest.llIIIlIIIllIIl[1] = " ".length();
        PackedSheetTest.llIIIlIIIllIIl[2] = "  ".length();
        PackedSheetTest.llIIIlIIIllIIl[3] = "   ".length();
        PackedSheetTest.llIIIlIIIllIIl[4] = (0xB0 ^ 0x93 ^ (0x9A ^ 0xBF));
        PackedSheetTest.llIIIlIIIllIIl[5] = (69 + 59 - 18 + 17 ^ (0xC ^ 0x41));
        PackedSheetTest.llIIIlIIIllIIl[6] = (27 + 90 - 105 + 128 ^ 97 + 87 - 141 + 93);
        PackedSheetTest.llIIIlIIIllIIl[7] = (-(0xFFFFBE5F & 0x69F9) & (0xFFFFAB7E & 0x7FF9));
        PackedSheetTest.llIIIlIIIllIIl[8] = (-(0xFFFFDFCE & 0x65B5) & (0xFFFFEFFF & 0x57DB));
        PackedSheetTest.llIIIlIIIllIIl[9] = (0x82 ^ 0x87);
        PackedSheetTest.llIIIlIIIllIIl[10] = (0xC9 ^ 0xC1);
    }
}
