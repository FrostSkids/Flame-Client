// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.opengl.SlickCallable;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.nio.FloatBuffer;
import org.lwjgl.opengl.GL11;
import org.lwjgl.BufferUtils;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Image;
import org.newdawn.slick.Animation;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.BasicGame;

public class SlickCallableTest extends BasicGame
{
    private /* synthetic */ AngelCodeFont font;
    private static final /* synthetic */ String[] lIIIlIlIlIlIII;
    private static final /* synthetic */ int[] lIIIlIlIlIllII;
    private /* synthetic */ Animation homer;
    private /* synthetic */ float rot;
    private /* synthetic */ Image back;
    private /* synthetic */ Image image;
    
    private static String llIIIIIlIIIIlll(final String lllllllllllllIlIIIIllIllIllIIlll, final String lllllllllllllIlIIIIllIllIllIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIllIllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIllIllIIlII.getBytes(StandardCharsets.UTF_8)), SlickCallableTest.lIIIlIlIlIllII[22]), "DES");
            final Cipher lllllllllllllIlIIIIllIllIllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIIIllIllIllIlIIl.init(SlickCallableTest.lIIIlIlIlIllII[2], lllllllllllllIlIIIIllIllIllIlIlI);
            return new String(lllllllllllllIlIIIIllIllIllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIllIllIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIllIllIlIII) {
            lllllllllllllIlIIIIllIllIllIlIII.printStackTrace();
            return null;
        }
    }
    
    public void renderGL() {
        final FloatBuffer floatBuffer;
        final FloatBuffer lllllllllllllIlIIIIllIllllIIlIIl = floatBuffer = BufferUtils.createFloatBuffer(SlickCallableTest.lIIIlIlIlIllII[4]);
        final float[] src = new float[SlickCallableTest.lIIIlIlIlIllII[4]];
        src[SlickCallableTest.lIIIlIlIlIllII[0]] = 5.0f;
        src[SlickCallableTest.lIIIlIlIlIllII[1]] = 5.0f;
        src[SlickCallableTest.lIIIlIlIlIllII[2]] = 10.0f;
        src[SlickCallableTest.lIIIlIlIlIllII[3]] = 0.0f;
        floatBuffer.put(src).flip();
        "".length();
        final FloatBuffer floatBuffer2;
        final FloatBuffer lllllllllllllIlIIIIllIllllIIlIII = floatBuffer2 = BufferUtils.createFloatBuffer(SlickCallableTest.lIIIlIlIlIllII[4]);
        final float[] src2 = new float[SlickCallableTest.lIIIlIlIlIllII[4]];
        src2[SlickCallableTest.lIIIlIlIlIllII[0]] = 0.8f;
        src2[SlickCallableTest.lIIIlIlIlIllII[1]] = 0.1f;
        src2[SlickCallableTest.lIIIlIlIlIllII[2]] = 0.0f;
        src2[SlickCallableTest.lIIIlIlIlIllII[3]] = 1.0f;
        floatBuffer2.put(src2).flip();
        "".length();
        GL11.glLight(SlickCallableTest.lIIIlIlIlIllII[11], SlickCallableTest.lIIIlIlIlIllII[12], lllllllllllllIlIIIIllIllllIIlIIl);
        GL11.glEnable(SlickCallableTest.lIIIlIlIlIllII[11]);
        GL11.glEnable(SlickCallableTest.lIIIlIlIlIllII[13]);
        GL11.glEnable(SlickCallableTest.lIIIlIlIlIllII[14]);
        GL11.glEnable(SlickCallableTest.lIIIlIlIlIllII[15]);
        GL11.glMatrixMode(SlickCallableTest.lIIIlIlIlIllII[16]);
        GL11.glLoadIdentity();
        final float lllllllllllllIlIIIIllIllllIIIlll = 0.75f;
        GL11.glFrustum(-1.0, 1.0, (double)(-lllllllllllllIlIIIIllIllllIIIlll), (double)lllllllllllllIlIIIIllIllllIIIlll, 5.0, 60.0);
        GL11.glMatrixMode(SlickCallableTest.lIIIlIlIlIllII[17]);
        GL11.glLoadIdentity();
        GL11.glTranslatef(0.0f, 0.0f, -40.0f);
        GL11.glRotatef(this.rot, 0.0f, 1.0f, 1.0f);
        GL11.glMaterial(SlickCallableTest.lIIIlIlIlIllII[18], SlickCallableTest.lIIIlIlIlIllII[19], lllllllllllllIlIIIIllIllllIIlIII);
        this.gear(0.5f, 2.0f, 2.0f, SlickCallableTest.lIIIlIlIlIllII[20], 0.7f);
    }
    
    private static String llIIIIIlIIIlIIl(String lllllllllllllIlIIIIllIllIlllIlll, final String lllllllllllllIlIIIIllIllIllllIll) {
        lllllllllllllIlIIIIllIllIlllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIllIllIlllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIllIllIllllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIIIllIllIllllIIl = lllllllllllllIlIIIIllIllIllllIll.toCharArray();
        int lllllllllllllIlIIIIllIllIllllIII = SlickCallableTest.lIIIlIlIlIllII[0];
        final float lllllllllllllIlIIIIllIllIlllIIlI = (Object)lllllllllllllIlIIIIllIllIlllIlll.toCharArray();
        final byte lllllllllllllIlIIIIllIllIlllIIIl = (byte)lllllllllllllIlIIIIllIllIlllIIlI.length;
        Exception lllllllllllllIlIIIIllIllIlllIIII = (Exception)SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIIl((int)lllllllllllllIlIIIIllIllIlllIIII, lllllllllllllIlIIIIllIllIlllIIIl)) {
            final char lllllllllllllIlIIIIllIllIlllllIl = lllllllllllllIlIIIIllIllIlllIIlI[lllllllllllllIlIIIIllIllIlllIIII];
            lllllllllllllIlIIIIllIllIllllIlI.append((char)(lllllllllllllIlIIIIllIllIlllllIl ^ lllllllllllllIlIIIIllIllIllllIIl[lllllllllllllIlIIIIllIllIllllIII % lllllllllllllIlIIIIllIllIllllIIl.length]));
            "".length();
            ++lllllllllllllIlIIIIllIllIllllIII;
            ++lllllllllllllIlIIIIllIllIlllIIII;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIllIllIllllIlI);
    }
    
    public SlickCallableTest() {
        super(SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[0]]);
    }
    
    public static void main(final String[] lllllllllllllIlIIIIllIlllIIIlIII) {
        try {
            final AppGameContainer lllllllllllllIlIIIIllIlllIIIlIlI = new AppGameContainer(new SlickCallableTest());
            lllllllllllllIlIIIIllIlllIIIlIlI.setDisplayMode(SlickCallableTest.lIIIlIlIlIllII[24], SlickCallableTest.lIIIlIlIlIllII[25], (boolean)(SlickCallableTest.lIIIlIlIlIllII[0] != 0));
            lllllllllllllIlIIIIllIlllIIIlIlI.start();
            "".length();
            if (-"   ".length() >= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIIIIllIlllIIIlIIl) {
            lllllllllllllIlIIIIllIlllIIIlIIl.printStackTrace();
        }
    }
    
    private static void llIIIIIlIIIllll() {
        (lIIIlIlIlIllII = new int[26])[0] = ((31 + 67 - 2 + 35 ^ 1 + 95 + 65 + 7) & (107 + 167 - 215 + 112 ^ 40 + 36 - 74 + 126 ^ -" ".length()));
        SlickCallableTest.lIIIlIlIlIllII[1] = " ".length();
        SlickCallableTest.lIIIlIlIlIllII[2] = "  ".length();
        SlickCallableTest.lIIIlIlIlIllII[3] = "   ".length();
        SlickCallableTest.lIIIlIlIlIllII[4] = (0x32 ^ 0x18 ^ (0x82 ^ 0xAC));
        SlickCallableTest.lIIIlIlIlIllII[5] = (0xF4 ^ 0xA0 ^ (0x24 ^ 0x75));
        SlickCallableTest.lIIIlIlIlIllII[6] = (0x3B ^ 0x1F);
        SlickCallableTest.lIIIlIlIlIllII[7] = (223 + 53 - 181 + 145 ^ 113 + 24 - 133 + 173);
        SlickCallableTest.lIIIlIlIlIllII[8] = (86 + 54 + 7 + 33 ^ 111 + 97 - 159 + 130);
        SlickCallableTest.lIIIlIlIlIllII[9] = 128 + 6 - 98 + 114;
        SlickCallableTest.lIIIlIlIlIllII[10] = (66 + 122 - 182 + 168 ^ 33 + 153 - 59 + 41);
        SlickCallableTest.lIIIlIlIlIllII[11] = (0xFFFFDE4F & 0x61B0);
        SlickCallableTest.lIIIlIlIlIllII[12] = (0xFFFFF293 & 0x1F6F);
        SlickCallableTest.lIIIlIlIlIllII[13] = (0xFFFFCB6E & 0x3FD5);
        SlickCallableTest.lIIIlIlIlIllII[14] = (-(0xFFFFF4DB & 0x6FA7) & (0xFFFFEFF3 & 0x7FFF));
        SlickCallableTest.lIIIlIlIlIllII[15] = (-(0xFFFFFD93 & 0x72FC) & (-1 & 0x7BDF));
        SlickCallableTest.lIIIlIlIlIllII[16] = (0xFFFFF7DF & 0x1F21);
        SlickCallableTest.lIIIlIlIlIllII[17] = (0xFFFFDF14 & 0x37EB);
        SlickCallableTest.lIIIlIlIlIllII[18] = (-(0xFFFF9BB7 & 0x7DEA) & (0xFFFFBDFF & 0x5FA5));
        SlickCallableTest.lIIIlIlIlIllII[19] = (-(0xFFFFEDAB & 0x53F6) & (0xFFFFFFFB & 0x57A7));
        SlickCallableTest.lIIIlIlIlIllII[20] = (0x31 ^ 0x3B);
        SlickCallableTest.lIIIlIlIlIllII[21] = (0xFFFFBF36 & 0x5DC9);
        SlickCallableTest.lIIIlIlIlIllII[22] = (0x47 ^ 0x4F);
        SlickCallableTest.lIIIlIlIlIllII[23] = (-(0xFFFFEFE3 & 0x72DD) & (0xFFFFFFC9 & 0x7FF7));
        SlickCallableTest.lIIIlIlIlIllII[24] = (-(0xFFFFA86B & 0x77DD) & (0xFFFFA36F & 0x7FF8));
        SlickCallableTest.lIIIlIlIlIllII[25] = (0xFFFFC65A & 0x3BFD);
    }
    
    public void render(final GameContainer lllllllllllllIlIIIIllIllllIlIlII, final Graphics lllllllllllllIlIIIIllIllllIlIIll) throws SlickException {
        lllllllllllllIlIIIIllIllllIlIIll.scale(2.0f, 2.0f);
        lllllllllllllIlIIIIllIllllIlIIll.fillRect(0.0f, 0.0f, 800.0f, 600.0f, this.back, 0.0f, 0.0f);
        lllllllllllllIlIIIIllIllllIlIIll.resetTransform();
        lllllllllllllIlIIIIllIllllIlIIll.drawImage(this.image, 100.0f, 100.0f);
        this.image.draw(100.0f, 200.0f, 80.0f, 200.0f);
        this.font.drawString(100.0f, 200.0f, SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[10]]);
        final SlickCallable lllllllllllllIlIIIIllIllllIlIIlI = new SlickCallable() {
            @Override
            protected void performGLOperations() throws SlickException {
                SlickCallableTest.this.renderGL();
            }
        };
        lllllllllllllIlIIIIllIllllIlIIlI.call();
        this.homer.draw(450.0f, 250.0f, 80.0f, 200.0f);
        this.font.drawString(150.0f, 300.0f, SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[8]]);
    }
    
    private void gear(final float lllllllllllllIlIIIIllIlllIlIIIII, final float lllllllllllllIlIIIIllIlllIlIlIIl, final float lllllllllllllIlIIIIllIlllIlIlIII, final int lllllllllllllIlIIIIllIlllIlIIlll, final float lllllllllllllIlIIIIllIlllIIlllII) {
        final float lllllllllllllIlIIIIllIlllIlIIlII = lllllllllllllIlIIIIllIlllIlIIIII;
        final float lllllllllllllIlIIIIllIlllIlIIIll = lllllllllllllIlIIIIllIlllIlIlIIl - lllllllllllllIlIIIIllIlllIIlllII / 2.0f;
        final float lllllllllllllIlIIIIllIlllIlIIIlI = lllllllllllllIlIIIIllIlllIlIlIIl + lllllllllllllIlIIIIllIlllIIlllII / 2.0f;
        final float lllllllllllllIlIIIIllIlllIlIIIIl = 6.2831855f / lllllllllllllIlIIIIllIlllIlIIlll / 4.0f;
        GL11.glShadeModel(SlickCallableTest.lIIIlIlIlIllII[21]);
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glBegin(SlickCallableTest.lIIIlIlIlIllII[22]);
        int lllllllllllllIlIIIIllIlllIlIIlIl = SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIII(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
            final float lllllllllllllIlIIIIllIlllIllIlII = lllllllllllllIlIIIIllIlllIlIIlIl * 2.0f * 3.1415927f / lllllllllllllIlIIIIllIlllIlIIlll;
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIlII), lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIlII), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIlII), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIlII), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            if (llIIIIIlIIlIIIl(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
                GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIlII), lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIlII), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
                GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIlII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIlII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            }
            ++lllllllllllllIlIIIIllIlllIlIIlIl;
            "".length();
            if (" ".length() <= -" ".length()) {
                return;
            }
        }
        GL11.glEnd();
        GL11.glBegin(SlickCallableTest.lIIIlIlIlIllII[8]);
        lllllllllllllIlIIIIllIlllIlIIlIl = SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIIl(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
            final float lllllllllllllIlIIIIllIlllIllIIll = lllllllllllllIlIIIIllIlllIlIIlIl * 2.0f * 3.1415927f / lllllllllllllIlIIIIllIlllIlIIlll;
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIll), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIll), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIll + lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIll + lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIll + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIll + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIll + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIll + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            ++lllllllllllllIlIIIIllIlllIlIIlIl;
            "".length();
            if (-" ".length() > (0x5C ^ 0x2E ^ (0x70 ^ 0x6))) {
                return;
            }
        }
        GL11.glEnd();
        GL11.glNormal3f(0.0f, 0.0f, -1.0f);
        GL11.glBegin(SlickCallableTest.lIIIlIlIlIllII[22]);
        lllllllllllllIlIIIIllIlllIlIIlIl = SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIII(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
            final float lllllllllllllIlIIIIllIlllIllIIlI = lllllllllllllIlIIIIllIlllIlIIlIl * 2.0f * 3.1415927f / lllllllllllllIlIIIIllIlllIlIIlll;
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIlI), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIlI), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIlI), lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIlI), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIlI + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIlI + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIlI), lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIlI), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            ++lllllllllllllIlIIIIllIlllIlIIlIl;
            "".length();
            if (((0x1F ^ 0x49) & ~(0xCC ^ 0x9A)) != 0x0) {
                return;
            }
        }
        GL11.glEnd();
        GL11.glBegin(SlickCallableTest.lIIIlIlIlIllII[8]);
        lllllllllllllIlIIIIllIlllIlIIlIl = SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIIl(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
            final float lllllllllllllIlIIIIllIlllIllIIIl = lllllllllllllIlIIIIllIlllIlIIlIl * 2.0f * 3.1415927f / lllllllllllllIlIIIIllIlllIlIIlll;
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIIl + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIIl + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIIl + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIIl + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIIl + lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIIl + lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            ++lllllllllllllIlIIIIllIlllIlIIlIl;
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        GL11.glEnd();
        GL11.glNormal3f(0.0f, 0.0f, 1.0f);
        GL11.glBegin(SlickCallableTest.lIIIlIlIlIllII[22]);
        lllllllllllllIlIIIIllIlllIlIIlIl = SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIIl(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
            final float lllllllllllllIlIIIIllIlllIllIIII = lllllllllllllIlIIIIllIlllIlIIlIl * 2.0f * 3.1415927f / lllllllllllllIlIIIIllIlllIlIIlll;
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            float lllllllllllllIlIIIIllIlllIlIllll = lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + lllllllllllllIlIIIIllIlllIlIIIIl) - lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII);
            float lllllllllllllIlIIIIllIlllIlIlllI = lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + lllllllllllllIlIIIIllIlllIlIIIIl) - lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII);
            final float lllllllllllllIlIIIIllIlllIlIllIl = (float)Math.sqrt(lllllllllllllIlIIIIllIlllIlIllll * lllllllllllllIlIIIIllIlllIlIllll + lllllllllllllIlIIIIllIlllIlIlllI * lllllllllllllIlIIIIllIlllIlIlllI);
            lllllllllllllIlIIIIllIlllIlIllll /= lllllllllllllIlIIIIllIlllIlIllIl;
            lllllllllllllIlIIIIllIlllIlIlllI /= lllllllllllllIlIIIIllIlllIlIllIl;
            GL11.glNormal3f(lllllllllllllIlIIIIllIlllIlIlllI, -lllllllllllllIlIIIIllIlllIlIllll, 0.0f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glNormal3f((float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII), (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII), 0.0f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            lllllllllllllIlIIIIllIlllIlIllll = lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl) - lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl);
            lllllllllllllIlIIIIllIlllIlIlllI = lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl) - lllllllllllllIlIIIIllIlllIlIIIlI * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + 2.0f * lllllllllllllIlIIIIllIlllIlIIIIl);
            GL11.glNormal3f(lllllllllllllIlIIIIllIlllIlIlllI, -lllllllllllllIlIIIIllIlllIlIllll, 0.0f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII + 3.0f * lllllllllllllIlIIIIllIlllIlIIIIl), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glNormal3f((float)Math.cos(lllllllllllllIlIIIIllIlllIllIIII), (float)Math.sin(lllllllllllllIlIIIIllIlllIllIIII), 0.0f);
            ++lllllllllllllIlIIIIllIlllIlIIlIl;
            "".length();
            if (((0x7A ^ 0x6F ^ "   ".length()) & (0x57 ^ 0x17 ^ (0x37 ^ 0x61) ^ -" ".length())) != 0x0) {
                return;
            }
        }
        GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(0.0), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(0.0), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
        GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.cos(0.0), lllllllllllllIlIIIIllIlllIlIIIll * (float)Math.sin(0.0), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
        GL11.glEnd();
        GL11.glShadeModel(SlickCallableTest.lIIIlIlIlIllII[23]);
        GL11.glBegin(SlickCallableTest.lIIIlIlIlIllII[22]);
        lllllllllllllIlIIIIllIlllIlIIlIl = SlickCallableTest.lIIIlIlIlIllII[0];
        while (llIIIIIlIIlIIII(lllllllllllllIlIIIIllIlllIlIIlIl, lllllllllllllIlIIIIllIlllIlIIlll)) {
            final float lllllllllllllIlIIIIllIlllIlIllII = lllllllllllllIlIIIIllIlllIlIIlIl * 2.0f * 3.1415927f / lllllllllllllIlIIIIllIlllIlIIlll;
            GL11.glNormal3f(-(float)Math.cos(lllllllllllllIlIIIIllIlllIlIllII), -(float)Math.sin(lllllllllllllIlIIIIllIlllIlIllII), 0.0f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.cos(lllllllllllllIlIIIIllIlllIlIllII), lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.sin(lllllllllllllIlIIIIllIlllIlIllII), -lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            GL11.glVertex3f(lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.cos(lllllllllllllIlIIIIllIlllIlIllII), lllllllllllllIlIIIIllIlllIlIIlII * (float)Math.sin(lllllllllllllIlIIIIllIlllIlIllII), lllllllllllllIlIIIIllIlllIlIlIII * 0.5f);
            ++lllllllllllllIlIIIIllIlllIlIIlIl;
            "".length();
            if (null != null) {
                return;
            }
        }
        GL11.glEnd();
    }
    
    private static boolean llIIIIIlIIlIIIl(final int lllllllllllllIlIIIIllIllIlIlIIlI, final int lllllllllllllIlIIIIllIllIlIlIIIl) {
        return lllllllllllllIlIIIIllIllIlIlIIlI < lllllllllllllIlIIIIllIllIlIlIIIl;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIIIIllIlllIIIllll, final int lllllllllllllIlIIIIllIlllIIIlllI) {
        this.rot += lllllllllllllIlIIIIllIlllIIIlllI * 0.1f;
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIIIIllIllllIlllII) throws SlickException {
        this.image = new Image(SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[1]]);
        this.back = new Image(SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[2]]);
        this.font = new AngelCodeFont(SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[3]], SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[4]]);
        final SpriteSheet lllllllllllllIlIIIIllIllllIllIll = new SpriteSheet(SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[5]], SlickCallableTest.lIIIlIlIlIllII[6], SlickCallableTest.lIIIlIlIlIllII[7]);
        this.homer = new Animation(lllllllllllllIlIIIIllIllllIllIll, SlickCallableTest.lIIIlIlIlIllII[0], SlickCallableTest.lIIIlIlIlIllII[0], SlickCallableTest.lIIIlIlIlIllII[8], SlickCallableTest.lIIIlIlIlIllII[0], (boolean)(SlickCallableTest.lIIIlIlIlIllII[1] != 0), SlickCallableTest.lIIIlIlIlIllII[9], (boolean)(SlickCallableTest.lIIIlIlIlIllII[1] != 0));
    }
    
    private static String llIIIIIlIIIlIII(final String lllllllllllllIlIIIIllIllIlIllIlI, final String lllllllllllllIlIIIIllIllIlIlIlll) {
        try {
            final SecretKeySpec lllllllllllllIlIIIIllIllIlIlllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIIllIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIIIllIllIlIlllII = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIIIllIllIlIlllII.init(SlickCallableTest.lIIIlIlIlIllII[2], lllllllllllllIlIIIIllIllIlIlllIl);
            return new String(lllllllllllllIlIIIIllIllIlIlllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIIllIllIlIllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIIllIllIlIllIll) {
            lllllllllllllIlIIIIllIllIlIllIll.printStackTrace();
            return null;
        }
    }
    
    static {
        llIIIIIlIIIllll();
        llIIIIIlIIIlIlI();
    }
    
    private static boolean llIIIIIlIIlIIII(final int lllllllllllllIlIIIIllIllIlIIlllI, final int lllllllllllllIlIIIIllIllIlIIllIl) {
        return lllllllllllllIlIIIIllIllIlIIlllI <= lllllllllllllIlIIIIllIllIlIIllIl;
    }
    
    private static void llIIIIIlIIIlIlI() {
        (lIIIlIlIlIlIII = new String[SlickCallableTest.lIIIlIlIlIllII[22]])[SlickCallableTest.lIIIlIlIlIllII[0]] = llIIIIIlIIIIlll("miuPduuLVR2vMmuCFG9jv2TCJV0l62Qs", "RYEPo");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[1]] = llIIIIIlIIIlIII("7ErxUIGV7y3J/JaBnQTqBQNHVVBE9FEJ", "iJKad");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[2]] = llIIIIIlIIIIlll("DSv6sb8CwlMw6rssIu7U3JcDKkTS70gK", "xINXe");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[3]] = llIIIIIlIIIlIIl("BRYqAwIQBzhYDhgWKxhIFx0t", "qsYwf");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[4]] = llIIIIIlIIIlIII("c/k0mHA2NoB5vT1MDCPHzGjC2xa4qGd4", "gvFaq");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[5]] = llIIIIIlIIIlIII("IMr20WlqQ+Dw4ihlSYVDkPl1rq1Jsua3", "KxFAl");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[10]] = llIIIIIlIIIIlll("akIS0HtfY7xbRnTrDTvPWRR3L5gq4Mir2sfVCrLf4v8=", "SGxJj");
        SlickCallableTest.lIIIlIlIlIlIII[SlickCallableTest.lIIIlIlIlIllII[8]] = llIIIIIlIIIIlll("JtMtdPl6Wpaf5AxVQKUvI4Eu9WUSXHvcz9RvN6UnU9U=", "GHSsK");
    }
}
