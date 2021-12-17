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
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class TransformTest2 extends BasicGame
{
    private /* synthetic */ boolean moveLeft;
    private /* synthetic */ boolean scaleDown;
    private /* synthetic */ boolean moveUp;
    private /* synthetic */ float scale;
    private static final /* synthetic */ String[] lllIIIlIlllIIl;
    private static final /* synthetic */ int[] lllIIIlIlllllI;
    private /* synthetic */ float camY;
    private /* synthetic */ float camX;
    private /* synthetic */ boolean moveDown;
    private /* synthetic */ boolean scaleUp;
    private /* synthetic */ boolean moveRight;
    
    @Override
    public void init(final GameContainer llllllllllllIllIIIIIIlIIIIIIIIII) throws SlickException {
        llllllllllllIllIIIIIIlIIIIIIIIII.setTargetFrameRate(TransformTest2.lllIIIlIlllllI[1]);
    }
    
    private static boolean lIIlllIllIlllIII(final int llllllllllllIllIIIIIIIlllIlllllI) {
        return llllllllllllIllIIIIIIIlllIlllllI != 0;
    }
    
    private static boolean lIIlllIllIlllIIl(final int llllllllllllIllIIIIIIIllllIIIlIl, final int llllllllllllIllIIIIIIIllllIIIlII) {
        return llllllllllllIllIIIIIIIllllIIIlIl == llllllllllllIllIIIIIIIllllIIIlII;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIIIIIIIlllllIllIl, final int llllllllllllIllIIIIIIIlllllIlIIl) {
        if (lIIlllIllIlllIII(this.scaleUp ? 1 : 0)) {
            this.scale += llllllllllllIllIIIIIIIlllllIlIIl * 0.001f;
        }
        if (lIIlllIllIlllIII(this.scaleDown ? 1 : 0)) {
            this.scale -= llllllllllllIllIIIIIIIlllllIlIIl * 0.001f;
        }
        final float llllllllllllIllIIIIIIIlllllIlIll = llllllllllllIllIIIIIIIlllllIlIIl * 0.4f * (1.0f / this.scale);
        if (lIIlllIllIlllIII(this.moveLeft ? 1 : 0)) {
            this.camX -= llllllllllllIllIIIIIIIlllllIlIll;
        }
        if (lIIlllIllIlllIII(this.moveUp ? 1 : 0)) {
            this.camY -= llllllllllllIllIIIIIIIlllllIlIll;
        }
        if (lIIlllIllIlllIII(this.moveRight ? 1 : 0)) {
            this.camX += llllllllllllIllIIIIIIIlllllIlIll;
        }
        if (lIIlllIllIlllIII(this.moveDown ? 1 : 0)) {
            this.camY += llllllllllllIllIIIIIIIlllllIlIll;
        }
    }
    
    @Override
    public void keyReleased(final int llllllllllllIllIIIIIIIllllIlllIl, final char llllllllllllIllIIIIIIIllllIlllII) {
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIllllIlllIl, TransformTest2.lllIIIlIlllllI[5])) {
            this.scaleUp = (TransformTest2.lllIIIlIlllllI[0] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIllllIlllIl, TransformTest2.lllIIIlIlllllI[6])) {
            this.scaleDown = (TransformTest2.lllIIIlIlllllI[0] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIllllIlllIl, TransformTest2.lllIIIlIlllllI[7])) {
            this.moveLeft = (TransformTest2.lllIIIlIlllllI[0] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIllllIlllIl, TransformTest2.lllIIIlIlllllI[8])) {
            this.moveUp = (TransformTest2.lllIIIlIlllllI[0] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIllllIlllIl, TransformTest2.lllIIIlIlllllI[9])) {
            this.moveRight = (TransformTest2.lllIIIlIlllllI[0] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIllllIlllIl, TransformTest2.lllIIIlIlllllI[10])) {
            this.moveDown = (TransformTest2.lllIIIlIlllllI[0] != 0);
        }
    }
    
    public void render(final GameContainer llllllllllllIllIIIIIIIllllllIlll, final Graphics llllllllllllIllIIIIIIIllllllIllI) {
        llllllllllllIllIIIIIIIllllllIllI.translate(320.0f, 240.0f);
        llllllllllllIllIIIIIIIllllllIllI.translate(-this.camX * this.scale, -this.camY * this.scale);
        llllllllllllIllIIIIIIIllllllIllI.scale(this.scale, this.scale);
        llllllllllllIllIIIIIIIllllllIllI.setColor(Color.red);
        int llllllllllllIllIIIIIIIlllllllIIl = TransformTest2.lllIIIlIlllllI[0];
        while (lIIlllIllIllIlll(llllllllllllIllIIIIIIIlllllllIIl, TransformTest2.lllIIIlIlllllI[2])) {
            int llllllllllllIllIIIIIIIlllllllIlI = TransformTest2.lllIIIlIlllllI[0];
            while (lIIlllIllIllIlll(llllllllllllIllIIIIIIIlllllllIlI, TransformTest2.lllIIIlIlllllI[2])) {
                llllllllllllIllIIIIIIIllllllIllI.fillRect((float)(TransformTest2.lllIIIlIlllllI[3] + llllllllllllIllIIIIIIIlllllllIIl * TransformTest2.lllIIIlIlllllI[1]), (float)(TransformTest2.lllIIIlIlllllI[3] + llllllllllllIllIIIIIIIlllllllIlI * TransformTest2.lllIIIlIlllllI[1]), 80.0f, 80.0f);
                ++llllllllllllIllIIIIIIIlllllllIlI;
                "".length();
                if (-" ".length() > "   ".length()) {
                    return;
                }
            }
            ++llllllllllllIllIIIIIIIlllllllIIl;
            "".length();
            if ((127 + 106 - 192 + 155 ^ 34 + 112 + 39 + 7) < "  ".length()) {
                return;
            }
        }
        llllllllllllIllIIIIIIIllllllIllI.setColor(new Color(1.0f, 1.0f, 1.0f, 0.5f));
        llllllllllllIllIIIIIIIllllllIllI.fillRect(-320.0f, -240.0f, 640.0f, 480.0f);
        llllllllllllIllIIIIIIIllllllIllI.setColor(Color.white);
        llllllllllllIllIIIIIIIllllllIllI.drawRect(-320.0f, -240.0f, 640.0f, 480.0f);
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIIIIIIIlllllIIlII, final char llllllllllllIllIIIIIIIlllllIIIll) {
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[4])) {
            System.exit(TransformTest2.lllIIIlIlllllI[0]);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[5])) {
            this.scaleUp = (TransformTest2.lllIIIlIlllllI[4] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[6])) {
            this.scaleDown = (TransformTest2.lllIIIlIlllllI[4] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[7])) {
            this.moveLeft = (TransformTest2.lllIIIlIlllllI[4] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[8])) {
            this.moveUp = (TransformTest2.lllIIIlIlllllI[4] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[9])) {
            this.moveRight = (TransformTest2.lllIIIlIlllllI[4] != 0);
        }
        if (lIIlllIllIlllIIl(llllllllllllIllIIIIIIIlllllIIlII, TransformTest2.lllIIIlIlllllI[10])) {
            this.moveDown = (TransformTest2.lllIIIlIlllllI[4] != 0);
        }
    }
    
    public static void main(final String[] llllllllllllIllIIIIIIIllllIlIllI) {
        try {
            final AppGameContainer llllllllllllIllIIIIIIIllllIllIII = new AppGameContainer(new TransformTest2());
            llllllllllllIllIIIIIIIllllIllIII.setDisplayMode(TransformTest2.lllIIIlIlllllI[11], TransformTest2.lllIIIlIlllllI[12], (boolean)(TransformTest2.lllIIIlIlllllI[0] != 0));
            llllllllllllIllIIIIIIIllllIllIII.start();
            "".length();
            if (null != null) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIIIIIllllIlIlll) {
            llllllllllllIllIIIIIIIllllIlIlll.printStackTrace();
        }
    }
    
    private static void lIIlllIllIllIllI() {
        (lllIIIlIlllllI = new int[15])[0] = ((0xE9 ^ 0xBA) & ~(0x2 ^ 0x51));
        TransformTest2.lllIIIlIlllllI[1] = (0x54 ^ 0x42 ^ (0xE4 ^ 0x96));
        TransformTest2.lllIIIlIlllllI[2] = (0xB4 ^ 0xC0 ^ (0xC ^ 0x72));
        TransformTest2.lllIIIlIlllllI[3] = -(-(0xFFFFEFDB & 0x7C25) & (0xFFFFEDF6 & 0x7FFD));
        TransformTest2.lllIIIlIlllllI[4] = " ".length();
        TransformTest2.lllIIIlIlllllI[5] = (0x12 ^ 0x2);
        TransformTest2.lllIIIlIlllllI[6] = (0x1E ^ 0x0);
        TransformTest2.lllIIIlIlllllI[7] = 54 + 166 - 114 + 97;
        TransformTest2.lllIIIlIlllllI[8] = 58 + 189 - 202 + 155;
        TransformTest2.lllIIIlIlllllI[9] = 121 + 23 + 18 + 43;
        TransformTest2.lllIIIlIlllllI[10] = (0x4E ^ 0x72) + (0x50 ^ 0x25) - (0x44 ^ 0x6D) + (0xC7 ^ 0x8F);
        TransformTest2.lllIIIlIlllllI[11] = (0xFFFF8AF6 & 0x7789);
        TransformTest2.lllIIIlIlllllI[12] = (0xFFFF8DF8 & 0x73E7);
        TransformTest2.lllIIIlIlllllI[13] = (0x59 ^ 0x51);
        TransformTest2.lllIIIlIlllllI[14] = "  ".length();
    }
    
    static {
        lIIlllIllIllIllI();
        lIIlllIllIlIlIlI();
    }
    
    private static void lIIlllIllIlIlIlI() {
        (lllIIIlIlllIIl = new String[TransformTest2.lllIIIlIlllllI[4]])[TransformTest2.lllIIIlIlllllI[0]] = lIIlllIllIlIlIIl("KgrXAJnMCT60HU0/DpeUwA==", "EZLMy");
    }
    
    private static boolean lIIlllIllIllIlll(final int llllllllllllIllIIIIIIIllllIIIIIl, final int llllllllllllIllIIIIIIIllllIIIIII) {
        return llllllllllllIllIIIIIIIllllIIIIIl < llllllllllllIllIIIIIIIllllIIIIII;
    }
    
    public TransformTest2() {
        super(TransformTest2.lllIIIlIlllIIl[TransformTest2.lllIIIlIlllllI[0]]);
        this.scale = 1.0f;
        this.camX = 320.0f;
        this.camY = 240.0f;
    }
    
    private static String lIIlllIllIlIlIIl(final String llllllllllllIllIIIIIIIllllIIllIl, final String llllllllllllIllIIIIIIIllllIIllII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIIIllllIlIIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIIIllllIIllII.getBytes(StandardCharsets.UTF_8)), TransformTest2.lllIIIlIlllllI[13]), "DES");
            final Cipher llllllllllllIllIIIIIIIllllIIllll = Cipher.getInstance("DES");
            llllllllllllIllIIIIIIIllllIIllll.init(TransformTest2.lllIIIlIlllllI[14], llllllllllllIllIIIIIIIllllIlIIII);
            return new String(llllllllllllIllIIIIIIIllllIIllll.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIIIllllIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIIIllllIIlllI) {
            llllllllllllIllIIIIIIIllllIIlllI.printStackTrace();
            return null;
        }
    }
}
