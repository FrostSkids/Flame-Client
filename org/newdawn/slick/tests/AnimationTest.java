// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.SpriteSheet;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Animation;
import org.newdawn.slick.BasicGame;

public class AnimationTest extends BasicGame
{
    private static final /* synthetic */ int[] lIllIIIlIIllll;
    private /* synthetic */ Animation limited;
    private /* synthetic */ Animation manual;
    private /* synthetic */ Animation pingPong;
    private static final /* synthetic */ String[] lIllIIIlIIllII;
    private /* synthetic */ Animation animation;
    private /* synthetic */ GameContainer container;
    private /* synthetic */ int start;
    
    private static boolean llllIllllllIIIl(final int lllllllllllllIIIIIllIIlIllIIIIlI) {
        return lllllllllllllIIIIIllIIlIllIIIIlI != 0;
    }
    
    private static String llllIlllllIIIIl(final String lllllllllllllIIIIIllIIlIllIlIIIl, final String lllllllllllllIIIIIllIIlIllIlIIII) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIlIllIlIlII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlIllIlIIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIIllIIlIllIlIIll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIIllIIlIllIlIIll.init(AnimationTest.lIllIIIlIIllll[8], lllllllllllllIIIIIllIIlIllIlIlII);
            return new String(lllllllllllllIIIIIllIIlIllIlIIll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlIllIlIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIlIllIlIIlI) {
            lllllllllllllIIIIIllIIlIllIlIIlI.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllllllIIll(final int lllllllllllllIIIIIllIIlIllIIlIIl, final int lllllllllllllIIIIIllIIlIllIIlIII) {
        return lllllllllllllIIIIIllIIlIllIIlIIl == lllllllllllllIIIIIllIIlIllIIlIII;
    }
    
    public AnimationTest() {
        super(AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[0]]);
        this.start = AnimationTest.lIllIIIlIIllll[1];
    }
    
    private static boolean llllIllllllIIII(final int lllllllllllllIIIIIllIIlIlIlllllI) {
        return lllllllllllllIIIIIllIIlIlIlllllI < 0;
    }
    
    private static void llllIlllllIIIlI() {
        (lIllIIIlIIllII = new String[AnimationTest.lIllIIIlIIllll[15]])[AnimationTest.lIllIIIlIIllll[0]] = llllIllllIlllll("vyyZhRFBzIgqTNjiSMDdsQ==", "rknod");
        AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[2]] = llllIlllllIIIII("EzIbNRYGIwluGgg6DTMTCT4FbwIJMA==", "gWhAr");
        AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[8]] = llllIlllllIIIII("IAY3DA9TAjlPGBYFIg4YB15/TwsdHzsOHhoZOA==", "svVoj");
        AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[9]] = llllIlllllIIIII("BAcNTxY5AwgbPzROAAEzPQ8VBjU+VEE=", "PnaoZ");
        AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[10]] = llllIlllllIIIIl("b5KZKbwgRyTmxIg8nUTm6iTaREPAjHmB6jtqwl11soMtpryr3JP7bA==", "WgKpY");
        AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[11]] = llllIlllllIIIII("HS49KhYiKTRtAD8mPih8", "MGSMF");
    }
    
    private static String llllIlllllIIIII(String lllllllllllllIIIIIllIIlIllllIIll, final String lllllllllllllIIIIIllIIlIlllIllIl) {
        lllllllllllllIIIIIllIIlIllllIIll = new String(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlIllllIIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIIllIIlIllllIIIl = new StringBuilder();
        final char[] lllllllllllllIIIIIllIIlIllllIIII = lllllllllllllIIIIIllIIlIlllIllIl.toCharArray();
        int lllllllllllllIIIIIllIIlIlllIllll = AnimationTest.lIllIIIlIIllll[0];
        final double lllllllllllllIIIIIllIIlIlllIlIIl = (Object)lllllllllllllIIIIIllIIlIllllIIll.toCharArray();
        final char lllllllllllllIIIIIllIIlIlllIlIII = (char)lllllllllllllIIIIIllIIlIlllIlIIl.length;
        Exception lllllllllllllIIIIIllIIlIlllIIlll = (Exception)AnimationTest.lIllIIIlIIllll[0];
        while (llllIlllllIllll((int)lllllllllllllIIIIIllIIlIlllIIlll, lllllllllllllIIIIIllIIlIlllIlIII)) {
            final char lllllllllllllIIIIIllIIlIllllIlII = lllllllllllllIIIIIllIIlIlllIlIIl[lllllllllllllIIIIIllIIlIlllIIlll];
            lllllllllllllIIIIIllIIlIllllIIIl.append((char)(lllllllllllllIIIIIllIIlIllllIlII ^ lllllllllllllIIIIIllIIlIllllIIII[lllllllllllllIIIIIllIIlIlllIllll % lllllllllllllIIIIIllIIlIllllIIII.length]));
            "".length();
            ++lllllllllllllIIIIIllIIlIlllIllll;
            ++lllllllllllllIIIIIllIIlIlllIIlll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIIllIIlIllllIIIl);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIIIllIIllIIIlllII) throws SlickException {
        this.container = lllllllllllllIIIIIllIIllIIIlllII;
        final SpriteSheet lllllllllllllIIIIIllIIllIIIllllI = new SpriteSheet(AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[2]], AnimationTest.lIllIIIlIIllll[3], AnimationTest.lIllIIIlIIllll[4]);
        this.animation = new Animation();
        int lllllllllllllIIIIIllIIllIIlIIIll = AnimationTest.lIllIIIlIIllll[0];
        while (llllIlllllIllll(lllllllllllllIIIIIllIIllIIlIIIll, AnimationTest.lIllIIIlIIllll[5])) {
            this.animation.addFrame(lllllllllllllIIIIIllIIllIIIllllI.getSprite(lllllllllllllIIIIIllIIllIIlIIIll, AnimationTest.lIllIIIlIIllll[0]), AnimationTest.lIllIIIlIIllll[6]);
            ++lllllllllllllIIIIIllIIllIIlIIIll;
            "".length();
            if ("   ".length() <= -" ".length()) {
                return;
            }
        }
        this.limited = new Animation();
        int lllllllllllllIIIIIllIIllIIlIIIlI = AnimationTest.lIllIIIlIIllll[0];
        while (llllIlllllIllll(lllllllllllllIIIIIllIIllIIlIIIlI, AnimationTest.lIllIIIlIIllll[5])) {
            this.limited.addFrame(lllllllllllllIIIIIllIIllIIIllllI.getSprite(lllllllllllllIIIIIllIIllIIlIIIlI, AnimationTest.lIllIIIlIIllll[0]), AnimationTest.lIllIIIlIIllll[6]);
            ++lllllllllllllIIIIIllIIllIIlIIIlI;
            "".length();
            if (null != null) {
                return;
            }
        }
        this.limited.stopAt(AnimationTest.lIllIIIlIIllll[7]);
        this.manual = new Animation((boolean)(AnimationTest.lIllIIIlIIllll[0] != 0));
        int lllllllllllllIIIIIllIIllIIlIIIIl = AnimationTest.lIllIIIlIIllll[0];
        while (llllIlllllIllll(lllllllllllllIIIIIllIIllIIlIIIIl, AnimationTest.lIllIIIlIIllll[5])) {
            this.manual.addFrame(lllllllllllllIIIIIllIIllIIIllllI.getSprite(lllllllllllllIIIIIllIIllIIlIIIIl, AnimationTest.lIllIIIlIIllll[0]), AnimationTest.lIllIIIlIIllll[6]);
            ++lllllllllllllIIIIIllIIllIIlIIIIl;
            "".length();
            if (" ".length() < " ".length()) {
                return;
            }
        }
        this.pingPong = new Animation(lllllllllllllIIIIIllIIllIIIllllI, AnimationTest.lIllIIIlIIllll[0], AnimationTest.lIllIIIlIIllll[0], AnimationTest.lIllIIIlIIllll[7], AnimationTest.lIllIIIlIIllll[0], (boolean)(AnimationTest.lIllIIIlIIllll[2] != 0), AnimationTest.lIllIIIlIIllll[6], (boolean)(AnimationTest.lIllIIIlIIllll[2] != 0));
        this.pingPong.setPingPong((boolean)(AnimationTest.lIllIIIlIIllll[2] != 0));
        lllllllllllllIIIIIllIIllIIIlllII.getGraphics().setBackground(new Color(0.4f, 0.6f, 0.6f));
    }
    
    public void render(final GameContainer lllllllllllllIIIIIllIIllIIIlIllI, final Graphics lllllllllllllIIIIIllIIllIIIlIlIl) {
        lllllllllllllIIIIIllIIllIIIlIlIl.drawString(AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[8]], 100.0f, 50.0f);
        lllllllllllllIIIIIllIIllIIIlIlIl.drawString(String.valueOf(new StringBuilder().append(AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[9]]).append(this.start)), 100.0f, 500.0f);
        lllllllllllllIIIIIllIIllIIIlIlIl.drawString(AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[10]], 100.0f, 70.0f);
        lllllllllllllIIIIIllIIllIIIlIlIl.drawString(String.valueOf(new StringBuilder().append(AnimationTest.lIllIIIlIIllII[AnimationTest.lIllIIIlIIllll[11]]).append(this.pingPong.getFrame())), 600.0f, 70.0f);
        lllllllllllllIIIIIllIIllIIIlIlIl.scale(-1.0f, 1.0f);
        this.animation.draw(-100.0f, 100.0f);
        this.animation.draw(-200.0f, 100.0f, 144.0f, 260.0f);
        if (llllIllllllIIII(this.start)) {
            this.limited.draw(-400.0f, 100.0f, 144.0f, 260.0f);
        }
        this.manual.draw(-600.0f, 100.0f, 144.0f, 260.0f);
        this.pingPong.draw(-700.0f, 100.0f, 72.0f, 130.0f);
    }
    
    static {
        llllIlllllIlllI();
        llllIlllllIIIlI();
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIIIIllIIllIIIIIIIl, final char lllllllllllllIIIIIllIIllIIIIIIII) {
        if (llllIllllllIIll(lllllllllllllIIIIIllIIllIIIIIIIl, AnimationTest.lIllIIIlIIllll[2])) {
            this.container.exit();
        }
        if (llllIllllllIIll(lllllllllllllIIIIIllIIllIIIIIIIl, AnimationTest.lIllIIIlIIllll[14])) {
            this.limited.restart();
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIIIllIIllIIIIlIll, final int lllllllllllllIIIIIllIIllIIIIlIlI) {
        if (llllIllllllIIIl(lllllllllllllIIIIIllIIllIIIIlIll.getInput().isKeyDown(AnimationTest.lIllIIIlIIllll[8]) ? 1 : 0)) {
            this.manual.update(lllllllllllllIIIIIllIIllIIIIlIlI);
        }
        if (llllIllllllIIlI(this.start)) {
            this.start -= lllllllllllllIIIIIllIIllIIIIlIlI;
        }
    }
    
    public static void main(final String[] lllllllllllllIIIIIllIIllIIIIIllI) {
        try {
            final AppGameContainer lllllllllllllIIIIIllIIllIIIIlIII = new AppGameContainer(new AnimationTest());
            lllllllllllllIIIIIllIIllIIIIlIII.setDisplayMode(AnimationTest.lIllIIIlIIllll[12], AnimationTest.lIllIIIlIIllll[13], (boolean)(AnimationTest.lIllIIIlIIllll[0] != 0));
            lllllllllllllIIIIIllIIllIIIIlIII.start();
            "".length();
            if (((0x14 ^ 0x73 ^ (0x69 ^ 0x4)) & (0xB6 ^ 0x96 ^ (0x43 ^ 0x69) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIIIllIIllIIIIIlll) {
            lllllllllllllIIIIIllIIllIIIIIlll.printStackTrace();
        }
    }
    
    private static void llllIlllllIlllI() {
        (lIllIIIlIIllll = new int[16])[0] = ((81 + 114 - 174 + 118 ^ 3 + 71 - 10 + 112) & (0x85 ^ 0xAC ^ (0x2F ^ 0x3D) ^ -" ".length()));
        AnimationTest.lIllIIIlIIllll[1] = (-(0xFFFFEA7F & 0x55F3) & (0xFFFFD7FF & 0x7BFA));
        AnimationTest.lIllIIIlIIllll[2] = " ".length();
        AnimationTest.lIllIIIlIIllll[3] = (0x9A ^ 0xBE);
        AnimationTest.lIllIIIlIIllll[4] = (0x16 ^ 0x57);
        AnimationTest.lIllIIIlIIllll[5] = (0x5F ^ 0x57);
        AnimationTest.lIllIIIlIIllll[6] = 38 + 115 - 7 + 4;
        AnimationTest.lIllIIIlIIllll[7] = (0x30 ^ 0xB ^ (0x5C ^ 0x60));
        AnimationTest.lIllIIIlIIllll[8] = "  ".length();
        AnimationTest.lIllIIIlIIllll[9] = "   ".length();
        AnimationTest.lIllIIIlIIllll[10] = (0x39 ^ 0x3D);
        AnimationTest.lIllIIIlIIllll[11] = (110 + 41 - 117 + 109 ^ 71 + 109 - 179 + 137);
        AnimationTest.lIllIIIlIIllll[12] = (0xFFFFAF7E & 0x53A1);
        AnimationTest.lIllIIIlIIllll[13] = (-(0xFFFFF7BD & 0x48E6) & (0xFFFFD2FF & 0x6FFB));
        AnimationTest.lIllIIIlIIllll[14] = (129 + 41 - 145 + 118 ^ 169 + 20 - 115 + 108);
        AnimationTest.lIllIIIlIIllll[15] = (0xC ^ 0x7D ^ (0xC ^ 0x7B));
    }
    
    private static boolean llllIlllllIllll(final int lllllllllllllIIIIIllIIlIllIIIlIl, final int lllllllllllllIIIIIllIIlIllIIIlII) {
        return lllllllllllllIIIIIllIIlIllIIIlIl < lllllllllllllIIIIIllIIlIllIIIlII;
    }
    
    private static String llllIllllIlllll(final String lllllllllllllIIIIIllIIlIllIllllI, final String lllllllllllllIIIIIllIIlIllIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIIllIIlIlllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIIllIIlIllIlllIl.getBytes(StandardCharsets.UTF_8)), AnimationTest.lIllIIIlIIllll[5]), "DES");
            final Cipher lllllllllllllIIIIIllIIlIlllIIIII = Cipher.getInstance("DES");
            lllllllllllllIIIIIllIIlIlllIIIII.init(AnimationTest.lIllIIIlIIllll[8], lllllllllllllIIIIIllIIlIlllIIIIl);
            return new String(lllllllllllllIIIIIllIIlIlllIIIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIIllIIlIllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIIllIIlIllIlllll) {
            lllllllllllllIIIIIllIIlIllIlllll.printStackTrace();
            return null;
        }
    }
    
    private static boolean llllIllllllIIlI(final int lllllllllllllIIIIIllIIlIllIIIIII) {
        return lllllllllllllIIIIIllIIlIllIIIIII >= 0;
    }
}
