// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.openal.SoundStore;
import org.lwjgl.input.Keyboard;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.io.File;
import org.newdawn.slick.openal.AudioLoader;
import java.io.IOException;
import java.io.InputStream;
import org.newdawn.slick.opengl.TextureLoader;
import java.io.FileInputStream;
import org.newdawn.slick.TrueTypeFont;
import org.newdawn.slick.util.Log;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Color;
import org.newdawn.slick.opengl.Texture;
import org.newdawn.slick.Font;
import org.newdawn.slick.openal.Audio;

public class TestUtils
{
    private /* synthetic */ Audio aifEffect;
    private static final /* synthetic */ String[] llllllIlIIllI;
    private /* synthetic */ Audio modStream;
    private /* synthetic */ Font font;
    private static final /* synthetic */ int[] llllllIlIIlll;
    private /* synthetic */ Texture texture;
    private /* synthetic */ Audio wavEffect;
    private /* synthetic */ Audio oggStream;
    private /* synthetic */ Audio oggEffect;
    
    public void render() {
        Color.white.bind();
        this.texture.bind();
        GL11.glBegin(TestUtils.llllllIlIIlll[21]);
        GL11.glTexCoord2f(0.0f, 0.0f);
        GL11.glVertex2f(100.0f, 100.0f);
        GL11.glTexCoord2f(1.0f, 0.0f);
        GL11.glVertex2f((float)(TestUtils.llllllIlIIlll[3] + this.texture.getTextureWidth()), 100.0f);
        GL11.glTexCoord2f(1.0f, 1.0f);
        GL11.glVertex2f((float)(TestUtils.llllllIlIIlll[3] + this.texture.getTextureWidth()), (float)(TestUtils.llllllIlIIlll[3] + this.texture.getTextureHeight()));
        GL11.glTexCoord2f(0.0f, 1.0f);
        GL11.glVertex2f(100.0f, (float)(TestUtils.llllllIlIIlll[3] + this.texture.getTextureHeight()));
        GL11.glEnd();
        this.font.drawString(150.0f, 300.0f, TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[32]], Color.yellow);
    }
    
    private static String lIllIIIIIIlIllI(String lllllllllllllIlIlIlIlIIIlIIlIIII, final String lllllllllllllIlIlIlIlIIIlIIIllll) {
        lllllllllllllIlIlIlIlIIIlIIlIIII = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIlIIlIIII.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlIlIIIlIIIlllI = new StringBuilder();
        final char[] lllllllllllllIlIlIlIlIIIlIIIllIl = lllllllllllllIlIlIlIlIIIlIIIllll.toCharArray();
        int lllllllllllllIlIlIlIlIIIlIIIllII = TestUtils.llllllIlIIlll[4];
        final short lllllllllllllIlIlIlIlIIIlIIIIllI = (Object)lllllllllllllIlIlIlIlIIIlIIlIIII.toCharArray();
        final byte lllllllllllllIlIlIlIlIIIlIIIIlIl = (byte)lllllllllllllIlIlIlIlIIIlIIIIllI.length;
        char lllllllllllllIlIlIlIlIIIlIIIIlII = (char)TestUtils.llllllIlIIlll[4];
        while (lIllIIIIIIllIll(lllllllllllllIlIlIlIlIIIlIIIIlII, lllllllllllllIlIlIlIlIIIlIIIIlIl)) {
            final char lllllllllllllIlIlIlIlIIIlIIlIIIl = lllllllllllllIlIlIlIlIIIlIIIIllI[lllllllllllllIlIlIlIlIIIlIIIIlII];
            lllllllllllllIlIlIlIlIIIlIIIlllI.append((char)(lllllllllllllIlIlIlIlIIIlIIlIIIl ^ lllllllllllllIlIlIlIlIIIlIIIllIl[lllllllllllllIlIlIlIlIIIlIIIllII % lllllllllllllIlIlIlIlIIIlIIIllIl.length]));
            "".length();
            ++lllllllllllllIlIlIlIlIIIlIIIllII;
            ++lllllllllllllIlIlIlIlIIIlIIIIlII;
            "".length();
            if (" ".length() <= ((0x25 ^ 0x13) & ~(0x2F ^ 0x19))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlIlIIIlIIIlllI);
    }
    
    public void init() {
        Log.setVerbose((boolean)(TestUtils.llllllIlIIlll[4] != 0));
        final java.awt.Font lllllllllllllIlIlIlIlIIIlIllIlIl = new java.awt.Font(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[4]], TestUtils.llllllIlIIlll[5], TestUtils.llllllIlIIlll[15]);
        this.font = new TrueTypeFont(lllllllllllllIlIlIlIlIIIlIllIlIl, (boolean)(TestUtils.llllllIlIIlll[4] != 0));
        try {
            this.texture = TextureLoader.getTexture(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[5]], new FileInputStream(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[16]]));
            System.out.println(String.valueOf(new StringBuilder().append(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[17]]).append(this.texture)));
            System.out.println(String.valueOf(new StringBuilder().append(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[18]]).append(this.texture.getImageWidth())));
            System.out.println(String.valueOf(new StringBuilder().append(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[19]]).append(this.texture.getImageWidth())));
            System.out.println(String.valueOf(new StringBuilder().append(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[20]]).append(this.texture.getTextureWidth())));
            System.out.println(String.valueOf(new StringBuilder().append(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[21]]).append(this.texture.getTextureHeight())));
            System.out.println(String.valueOf(new StringBuilder().append(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[22]]).append(this.texture.getTextureID())));
            "".length();
            if (-(0x9E ^ 0xA1 ^ (0x98 ^ 0xA3)) > 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIlIlIIIlIlllIII) {
            lllllllllllllIlIlIlIlIIIlIlllIII.printStackTrace();
        }
        try {
            this.oggEffect = AudioLoader.getAudio(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[23]], new FileInputStream(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[24]]));
            this.oggStream = AudioLoader.getStreamingAudio(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[25]], new File(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[26]]).toURL());
            this.modStream = AudioLoader.getStreamingAudio(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[27]], new File(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[28]]).toURL());
            this.modStream.playAsMusic(1.0f, 1.0f, (boolean)(TestUtils.llllllIlIIlll[5] != 0));
            "".length();
            this.aifEffect = AudioLoader.getAudio(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[29]], new FileInputStream(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[15]]));
            this.wavEffect = AudioLoader.getAudio(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[30]], new FileInputStream(TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[31]]));
            "".length();
            if (" ".length() == 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIlIlIIIlIllIlll) {
            lllllllllllllIlIlIlIlIIIlIllIlll.printStackTrace();
        }
    }
    
    private static boolean lIllIIIIIIllIIl(final int lllllllllllllIlIlIlIlIIIIllIllII) {
        return lllllllllllllIlIlIlIlIIIIllIllII != 0;
    }
    
    public static void main(final String[] lllllllllllllIlIlIlIlIIIlIlIlIlI) {
        final TestUtils lllllllllllllIlIlIlIlIIIlIlIlIIl = new TestUtils();
        lllllllllllllIlIlIlIlIIIlIlIlIIl.start();
    }
    
    private static void lIllIIIIIIllIII() {
        (llllllIlIIlll = new int[34])[0] = (0xFFFFD77A & 0x2BA5);
        TestUtils.llllllIlIIlll[1] = (0xFFFF9779 & 0x6ADE);
        TestUtils.llllllIlIIlll[2] = (0xFFFFC898 & 0x7767);
        TestUtils.llllllIlIIlll[3] = (40 + 188 - 3 + 20 ^ 137 + 1 - 0 + 7);
        TestUtils.llllllIlIIlll[4] = ((0x8B ^ 0xAE ^ (0xF7 ^ 0xB0)) & (0x5 ^ 0x7E ^ (0x8D ^ 0x94) ^ -" ".length()));
        TestUtils.llllllIlIIlll[5] = " ".length();
        TestUtils.llllllIlIIlll[6] = (0xFFFFFFEB & 0xDF5);
        TestUtils.llllllIlIIlll[7] = (0xFFFFFF53 & 0x1DAD);
        TestUtils.llllllIlIIlll[8] = (0xFFFFFF79 & 0xBF7);
        TestUtils.llllllIlIIlll[9] = (-(0xFFFFFDBF & 0x72EF) & (-1 & 0x7BFE));
        TestUtils.llllllIlIIlll[10] = (-(0xFFFFDD1E & 0x72FF) & (-1 & 0x5BFF));
        TestUtils.llllllIlIIlll[11] = (0xFFFF9BD6 & 0x672B);
        TestUtils.llllllIlIIlll[12] = (-(0xFFFFDDDD & 0x7E3F) & (0xFFFFDF1F & 0x7FFF));
        TestUtils.llllllIlIIlll[13] = (-(0xFFFFC0FF & 0x7F78) & (0xFFFFFF77 & 0x57FF));
        TestUtils.llllllIlIIlll[14] = (0xFFFFD709 & 0x3FF7);
        TestUtils.llllllIlIIlll[15] = (0x3E ^ 0x2E);
        TestUtils.llllllIlIIlll[16] = "  ".length();
        TestUtils.llllllIlIIlll[17] = "   ".length();
        TestUtils.llllllIlIIlll[18] = (0x4F ^ 0x27 ^ (0x6A ^ 0x6));
        TestUtils.llllllIlIIlll[19] = (0x61 ^ 0x64);
        TestUtils.llllllIlIIlll[20] = (0x7E ^ 0x4A ^ (0x86 ^ 0xB4));
        TestUtils.llllllIlIIlll[21] = (0x3D ^ 0x3A);
        TestUtils.llllllIlIIlll[22] = (0x6 ^ 0x6C ^ (0x48 ^ 0x2A));
        TestUtils.llllllIlIIlll[23] = (61 + 123 - 77 + 72 ^ 23 + 56 + 5 + 102);
        TestUtils.llllllIlIIlll[24] = (132 + 44 - 142 + 120 ^ 19 + 24 - 30 + 131);
        TestUtils.llllllIlIIlll[25] = (0x25 ^ 0x7A ^ (0x62 ^ 0x36));
        TestUtils.llllllIlIIlll[26] = (0x6D ^ 0xE ^ (0xDE ^ 0xB1));
        TestUtils.llllllIlIIlll[27] = (0xED ^ 0x93 ^ (0x78 ^ 0xB));
        TestUtils.llllllIlIIlll[28] = (0x58 ^ 0x56);
        TestUtils.llllllIlIIlll[29] = (0x1D ^ 0x12);
        TestUtils.llllllIlIIlll[30] = (0x37 ^ 0x26);
        TestUtils.llllllIlIIlll[31] = (0x26 ^ 0x34);
        TestUtils.llllllIlIIlll[32] = (0x6B ^ 0x32 ^ (0x70 ^ 0x3A));
        TestUtils.llllllIlIIlll[33] = (0x12 ^ 0x69 ^ (0x4A ^ 0x25));
    }
    
    private static String lIllIIIIIIlIlIl(final String lllllllllllllIlIlIlIlIIIIllllIIl, final String lllllllllllllIlIlIlIlIIIIllllIII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIIIIllllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIIIllllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlIlIIIIlllllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlIlIIIIlllllIl.init(TestUtils.llllllIlIIlll[16], lllllllllllllIlIlIlIlIIIIllllllI);
            return new String(lllllllllllllIlIlIlIlIIIIlllllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIIllllIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIIIIlllllII) {
            lllllllllllllIlIlIlIlIIIIlllllII.printStackTrace();
            return null;
        }
    }
    
    public void update() {
        while (lIllIIIIIIllIIl(Keyboard.next() ? 1 : 0)) {
            if (lIllIIIIIIllIIl(Keyboard.getEventKeyState() ? 1 : 0)) {
                if (lIllIIIIIIllIlI(Keyboard.getEventKey(), TestUtils.llllllIlIIlll[15])) {
                    this.oggEffect.playAsSoundEffect(1.0f, 1.0f, (boolean)(TestUtils.llllllIlIIlll[4] != 0));
                    "".length();
                }
                if (lIllIIIIIIllIlI(Keyboard.getEventKey(), TestUtils.llllllIlIIlll[30])) {
                    this.oggStream.playAsMusic(1.0f, 1.0f, (boolean)(TestUtils.llllllIlIIlll[5] != 0));
                    "".length();
                }
                if (lIllIIIIIIllIlI(Keyboard.getEventKey(), TestUtils.llllllIlIIlll[31])) {
                    this.modStream.playAsMusic(1.0f, 1.0f, (boolean)(TestUtils.llllllIlIIlll[5] != 0));
                    "".length();
                }
                if (lIllIIIIIIllIlI(Keyboard.getEventKey(), TestUtils.llllllIlIIlll[32])) {
                    this.aifEffect.playAsSoundEffect(1.0f, 1.0f, (boolean)(TestUtils.llllllIlIIlll[4] != 0));
                    "".length();
                }
                if (!lIllIIIIIIllIlI(Keyboard.getEventKey(), TestUtils.llllllIlIIlll[33])) {
                    continue;
                }
                this.wavEffect.playAsSoundEffect(1.0f, 1.0f, (boolean)(TestUtils.llllllIlIIlll[4] != 0));
                "".length();
                "".length();
                if (-" ".length() > 0) {
                    return;
                }
                continue;
            }
        }
        SoundStore.get().poll(TestUtils.llllllIlIIlll[4]);
    }
    
    private static void lIllIIIIIIlIlll() {
        (llllllIlIIllI = new String[TestUtils.llllllIlIIlll[33]])[TestUtils.llllllIlIIlll[4]] = lIllIIIIIIlIlII("zubNK6OHss/uM6PRqesvzw==", "RbVpd");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[5]] = lIllIIIIIIlIlII("ozTs6gxB824=", "XCOnG");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[16]] = lIllIIIIIIlIlIl("guB0fHZM7DpVJY+J5lY+l7yIhHmlSRWq", "ztMen");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[17]] = lIllIIIIIIlIllI("HjUdOTM4NUUhKSs0ACl8ag==", "JPeMF");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[18]] = lIllIIIIIIlIlIl("5U7rLr33auZ9A9xM7lxvJ6LdZNey8PXh", "iclcP");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[19]] = lIllIIIIIIlIlII("p/A0E+9cdivH+9CYR/cMPLdSvfUuO8A8", "PWjJJ");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[20]] = lIllIIIIIIlIlIl("naMkmM/3Zz4OgR4sIwGm+wDorIsQcqlt", "poWxf");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[21]] = lIllIIIIIIlIllI("dXdwMS8zPSUXL2shNQwtIz1qRQ==", "KIPeJ");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[22]] = lIllIIIIIIlIlIl("SqbdQyu7gxKfBuv6JEhewg==", "xLGvL");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[23]] = lIllIIIIIIlIlII("onhtaFgociY=", "zlFwc");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[24]] = lIllIIIIIIlIlIl("BhrsG/ghP1jsbwYh1J68nNeeFka7Ieis", "Oqaeg");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[25]] = lIllIIIIIIlIllI("GDE1", "WvrTR");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[26]] = lIllIIIIIIlIlIl("TqZqA7njA39OABC8z+t60+BCuYQhMcrq", "soJbm");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[27]] = lIllIIIIIIlIllI("OAgL", "uGOKt");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[28]] = lIllIIIIIIlIlIl("HhAzptKt1G5YCQYgwuJ02OFb1sqjr1Zf", "gEuBm");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[29]] = lIllIIIIIIlIlIl("7TbEzD5uduM=", "kAOfd");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[15]] = lIllIIIIIIlIlIl("5ch+XyOHCKWJ0hW5AZpUCwriAGc7IoQM", "OOswJ");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[30]] = lIllIIIIIIlIllI("HRAg", "JQvFK");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[31]] = lIllIIIIIIlIlII("+qse5uvytDCP+lZeUDx/r84Ozuyaw7b5", "wzugA");
        TestUtils.llllllIlIIllI[TestUtils.llllllIlIIlll[32]] = lIllIIIIIIlIllI("HgkqJyV2ADEhLRpsMSQ4Ggg=", "VLfkj");
    }
    
    private static boolean lIllIIIIIIllIll(final int lllllllllllllIlIlIlIlIIIIllIllll, final int lllllllllllllIlIlIlIlIIIIllIlllI) {
        return lllllllllllllIlIlIlIlIIIIllIllll < lllllllllllllIlIlIlIlIIIIllIlllI;
    }
    
    private void initGL(final int lllllllllllllIlIlIlIlIIIllIIIIII, final int lllllllllllllIlIlIlIlIIIlIllllll) {
        try {
            Display.setDisplayMode(new DisplayMode(lllllllllllllIlIlIlIlIIIllIIIIII, lllllllllllllIlIlIlIlIIIlIllllll));
            Display.create();
            Display.setVSyncEnabled((boolean)(TestUtils.llllllIlIIlll[5] != 0));
            "".length();
            if ("  ".length() <= ((0xCF ^ 0x88 ^ 80 + 91 - 47 + 3) & (0xF2 ^ 0x9D ^ (0xF0 ^ 0xA7) ^ -" ".length()))) {
                return;
            }
        }
        catch (LWJGLException lllllllllllllIlIlIlIlIIIllIIIIlI) {
            lllllllllllllIlIlIlIlIIIllIIIIlI.printStackTrace();
            System.exit(TestUtils.llllllIlIIlll[4]);
        }
        GL11.glEnable(TestUtils.llllllIlIIlll[6]);
        GL11.glShadeModel(TestUtils.llllllIlIIlll[7]);
        GL11.glDisable(TestUtils.llllllIlIIlll[8]);
        GL11.glDisable(TestUtils.llllllIlIIlll[9]);
        GL11.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GL11.glClearDepth(1.0);
        GL11.glEnable(TestUtils.llllllIlIIlll[10]);
        GL11.glBlendFunc(TestUtils.llllllIlIIlll[11], TestUtils.llllllIlIIlll[12]);
        GL11.glViewport(TestUtils.llllllIlIIlll[4], TestUtils.llllllIlIIlll[4], lllllllllllllIlIlIlIlIIIllIIIIII, lllllllllllllIlIlIlIlIIIlIllllll);
        GL11.glMatrixMode(TestUtils.llllllIlIIlll[13]);
        GL11.glMatrixMode(TestUtils.llllllIlIIlll[14]);
        GL11.glLoadIdentity();
        GL11.glOrtho(0.0, (double)lllllllllllllIlIlIlIlIIIllIIIIII, (double)lllllllllllllIlIlIlIlIIIlIllllll, 0.0, 1.0, -1.0);
        GL11.glMatrixMode(TestUtils.llllllIlIIlll[13]);
    }
    
    private static String lIllIIIIIIlIlII(final String lllllllllllllIlIlIlIlIIIlIlIIIII, final String lllllllllllllIlIlIlIlIIIlIIlllIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlIlIIIlIlIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlIlIIIlIIlllIl.getBytes(StandardCharsets.UTF_8)), TestUtils.llllllIlIIlll[22]), "DES");
            final Cipher lllllllllllllIlIlIlIlIIIlIlIIIlI = Cipher.getInstance("DES");
            lllllllllllllIlIlIlIlIIIlIlIIIlI.init(TestUtils.llllllIlIIlll[16], lllllllllllllIlIlIlIlIIIlIlIIIll);
            return new String(lllllllllllllIlIlIlIlIIIlIlIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlIlIIIlIlIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlIlIIIlIlIIIIl) {
            lllllllllllllIlIlIlIlIIIlIlIIIIl.printStackTrace();
            return null;
        }
    }
    
    public void start() {
        this.initGL(TestUtils.llllllIlIIlll[0], TestUtils.llllllIlIIlll[1]);
        this.init();
        while (true) {
            this.update();
            GL11.glClear(TestUtils.llllllIlIIlll[2]);
            this.render();
            Display.update();
            Display.sync(TestUtils.llllllIlIIlll[3]);
            if (lIllIIIIIIllIIl(Display.isCloseRequested() ? 1 : 0)) {
                System.exit(TestUtils.llllllIlIIlll[4]);
                "".length();
                if (null != null) {
                    break;
                }
                continue;
            }
        }
    }
    
    static {
        lIllIIIIIIllIII();
        lIllIIIIIIlIlll();
    }
    
    private static boolean lIllIIIIIIllIlI(final int lllllllllllllIlIlIlIlIIIIlllIIll, final int lllllllllllllIlIlIlIlIIIIlllIIlI) {
        return lllllllllllllIlIlIlIlIIIIlllIIll == lllllllllllllIlIlIlIlIIIIlllIIlI;
    }
}
