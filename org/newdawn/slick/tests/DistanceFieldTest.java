// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.BasicGame;

public class DistanceFieldTest extends BasicGame
{
    private /* synthetic */ AngelCodeFont font;
    private static final /* synthetic */ int[] lIlIlllIllllIl;
    private static final /* synthetic */ String[] lIlIlllIlllIIl;
    
    private static String llllIlIIIIIlIIl(final String lllllllllllllIIIIlIlIlIlllllIIlI, final String lllllllllllllIIIIlIlIlIlllllIIll) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIlIlllllIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIlIlllllIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIlIlIlllllIllI = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIlIlIlllllIllI.init(DistanceFieldTest.lIlIlllIllllIl[2], lllllllllllllIIIIlIlIlIlllllIlll);
            return new String(lllllllllllllIIIIlIlIlIlllllIllI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIlllllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIlIlllllIlIl) {
            lllllllllllllIIIIlIlIlIlllllIlIl.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] lllllllllllllIIIIlIlIlIlllllllIl) {
        try {
            final AppGameContainer lllllllllllllIIIIlIlIlIlllllllll = new AppGameContainer(new DistanceFieldTest());
            lllllllllllllIIIIlIlIlIlllllllll.setDisplayMode(DistanceFieldTest.lIlIlllIllllIl[13], DistanceFieldTest.lIlIlllIllllIl[14], (boolean)(DistanceFieldTest.lIlIlllIllllIl[0] != 0));
            lllllllllllllIIIIlIlIlIlllllllll.start();
            "".length();
            if (" ".length() >= (0xBD ^ 0xB9)) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIIlIlIlIllllllllI) {
            lllllllllllllIIIIlIlIlIllllllllI.printStackTrace();
        }
    }
    
    static {
        llllIlIIIIlllII();
        llllIlIIIIIllII();
    }
    
    private static String llllIlIIIIIlIll(String lllllllllllllIIIIlIlIlIlllIlIIlI, final String lllllllllllllIIIIlIlIlIlllIlIIIl) {
        lllllllllllllIIIIlIlIlIlllIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIlllIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIlIlllIlIlIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIlIlllIlIlII = lllllllllllllIIIIlIlIlIlllIlIIIl.toCharArray();
        int lllllllllllllIIIIlIlIlIlllIlIIll = DistanceFieldTest.lIlIlllIllllIl[0];
        final Exception lllllllllllllIIIIlIlIlIlllIIllIl = (Object)lllllllllllllIIIIlIlIlIlllIlIIlI.toCharArray();
        final float lllllllllllllIIIIlIlIlIlllIIllII = lllllllllllllIIIIlIlIlIlllIIllIl.length;
        short lllllllllllllIIIIlIlIlIlllIIlIll = (short)DistanceFieldTest.lIlIlllIllllIl[0];
        while (llllIlIIIIlllIl(lllllllllllllIIIIlIlIlIlllIIlIll, (int)lllllllllllllIIIIlIlIlIlllIIllII)) {
            final char lllllllllllllIIIIlIlIlIlllIllIII = lllllllllllllIIIIlIlIlIlllIIllIl[lllllllllllllIIIIlIlIlIlllIIlIll];
            lllllllllllllIIIIlIlIlIlllIlIlIl.append((char)(lllllllllllllIIIIlIlIlIlllIllIII ^ lllllllllllllIIIIlIlIlIlllIlIlII[lllllllllllllIIIIlIlIlIlllIlIIll % lllllllllllllIIIIlIlIlIlllIlIlII.length]));
            "".length();
            ++lllllllllllllIIIIlIlIlIlllIlIIll;
            ++lllllllllllllIIIIlIlIlIlllIIlIll;
            "".length();
            if ("  ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIlIlllIlIlIl);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIIlIlIllIIIIlIIll) throws SlickException {
        this.font = new AngelCodeFont(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[1]], DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[2]]);
        lllllllllllllIIIIlIlIllIIIIlIIll.getGraphics().setBackground(Color.black);
    }
    
    public DistanceFieldTest() {
        super(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[0]]);
    }
    
    public void render(final GameContainer lllllllllllllIIIIlIlIllIIIIIlIIl, final Graphics lllllllllllllIIIIlIlIllIIIIIlIII) throws SlickException {
        final String lllllllllllllIIIIlIlIllIIIIIIlll = DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[3]];
        this.font.drawString(610.0f, 100.0f, lllllllllllllIIIIlIlIllIIIIIIlll);
        GL11.glDisable(DistanceFieldTest.lIlIlllIllllIl[4]);
        GL11.glEnable(DistanceFieldTest.lIlIlllIllllIl[5]);
        GL11.glAlphaFunc(DistanceFieldTest.lIlIlllIllllIl[6], 0.5f);
        this.font.drawString(610.0f, 150.0f, lllllllllllllIIIIlIlIllIIIIIIlll);
        GL11.glDisable(DistanceFieldTest.lIlIlllIllllIl[5]);
        GL11.glEnable(DistanceFieldTest.lIlIlllIllllIl[4]);
        lllllllllllllIIIIlIlIllIIIIIlIII.translate(-50.0f, -130.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.scale(10.0f, 10.0f);
        this.font.drawString(0.0f, 0.0f, lllllllllllllIIIIlIlIllIIIIIIlll);
        GL11.glDisable(DistanceFieldTest.lIlIlllIllllIl[4]);
        GL11.glEnable(DistanceFieldTest.lIlIlllIllllIl[5]);
        GL11.glAlphaFunc(DistanceFieldTest.lIlIlllIllllIl[6], 0.5f);
        this.font.drawString(0.0f, 26.0f, lllllllllllllIIIIlIlIllIIIIIIlll);
        GL11.glDisable(DistanceFieldTest.lIlIlllIllllIl[5]);
        GL11.glEnable(DistanceFieldTest.lIlIlllIllllIl[4]);
        lllllllllllllIIIIlIlIllIIIIIlIII.resetTransform();
        lllllllllllllIIIIlIlIllIIIIIlIII.setColor(Color.lightGray);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawString(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[7]], 620.0f, 210.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawString(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[8]], 40.0f, 575.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.setColor(Color.darkGray);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawRect(40.0f, 40.0f, 560.0f, 530.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawRect(610.0f, 105.0f, 150.0f, 100.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.setColor(Color.white);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawString(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[9]], 620.0f, 300.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawString(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[10]], 620.0f, 320.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawString(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[11]], 620.0f, 340.0f);
        lllllllllllllIIIIlIlIllIIIIIlIII.drawString(DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[12]], 620.0f, 360.0f);
    }
    
    private static boolean llllIlIIIIlllIl(final int lllllllllllllIIIIlIlIlIlllIIIlll, final int lllllllllllllIIIIlIlIlIlllIIIllI) {
        return lllllllllllllIIIIlIlIlIlllIIIlll < lllllllllllllIIIIlIlIlIlllIIIllI;
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIIIIlIlIllIIIIIIIlI, final char lllllllllllllIIIIlIlIllIIIIIIIIl) {
    }
    
    private static void llllIlIIIIIllII() {
        (lIlIlllIlllIIl = new String[DistanceFieldTest.lIlIlllIllllIl[15]])[DistanceFieldTest.lIlIlllIllllIl[0]] = llllIlIIIIIlIII("jldQNZdFTEnTEgRLIPWQq8+WuYS4leuy", "tqzfQ");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[1]] = llllIlIIIIIlIIl("cfqHAR82i+YfuRCfIMZCKxukMEGedO8m", "KosDT");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[2]] = llllIlIIIIIlIII("KyC/8SsVc7i1QtjmKEIfu+CZh+zdz+leAKbhf/1M9zQ=", "CUMHD");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[3]] = llllIlIIIIIlIll("MDcQ", "QUsAz");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[7]] = llllIlIIIIIlIll("IiMiCwwDMCdMNgQrLkwKA3EYBAAIJQ==", "mQKle");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[8]] = llllIlIIIIIlIll("XXUrRiIPJD8DUTk1", "lESfq");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[9]] = llllIlIIIIIlIII("spg5SwhW5IYFZEVPbGYpG82dc1uM5U4e", "fONpZ");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[10]] = llllIlIIIIIlIII("5ASKIqkBcpU0W1c6Ie2bOg==", "Jrsru");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[11]] = llllIlIIIIIlIII("fJfkXHsHp1aIPIGmnnrNQTenyZnMHqEG0/Gk6n9XWDY=", "RgiFl");
        DistanceFieldTest.lIlIlllIlllIIl[DistanceFieldTest.lIlIlllIllllIl[12]] = llllIlIIIIIlIll("OxM2FgYBCjJYaEhCZw==", "hpWxU");
    }
    
    private static void llllIlIIIIlllII() {
        (lIlIlllIllllIl = new int[16])[0] = ((0x53 ^ 0x2E ^ (0x31 ^ 0x1F)) & (0x53 ^ 0x35 ^ (0xA1 ^ 0x94) ^ -" ".length()));
        DistanceFieldTest.lIlIlllIllllIl[1] = " ".length();
        DistanceFieldTest.lIlIlllIllllIl[2] = "  ".length();
        DistanceFieldTest.lIlIlllIllllIl[3] = "   ".length();
        DistanceFieldTest.lIlIlllIllllIl[4] = (-(0xFFFFEAAF & 0x355E) & (0xFFFFBFEF & 0x6BFF));
        DistanceFieldTest.lIlIlllIllllIl[5] = (0xFFFF8BF8 & 0x7FC7);
        DistanceFieldTest.lIlIlllIllllIl[6] = (0xFFFFD6D7 & 0x2B2E);
        DistanceFieldTest.lIlIlllIllllIl[7] = (0x9E ^ 0xB3 ^ (0x41 ^ 0x68));
        DistanceFieldTest.lIlIlllIllllIl[8] = (12 + 116 - 37 + 93 ^ 30 + 33 + 80 + 46);
        DistanceFieldTest.lIlIlllIllllIl[9] = (83 + 78 - 25 + 31 ^ 139 + 14 - 44 + 52);
        DistanceFieldTest.lIlIlllIllllIl[10] = (49 + 150 - 102 + 63 ^ 131 + 97 - 143 + 82);
        DistanceFieldTest.lIlIlllIllllIl[11] = (177 + 50 - 167 + 127 ^ 102 + 17 - 0 + 60);
        DistanceFieldTest.lIlIlllIllllIl[12] = (0x68 ^ 0x61);
        DistanceFieldTest.lIlIlllIllllIl[13] = (0xFFFFA3F3 & 0x5F2C);
        DistanceFieldTest.lIlIlllIllllIl[14] = (-(0xFFFFF5BE & 0x5EC9) & (0xFFFFFEFF & 0x57DF));
        DistanceFieldTest.lIlIlllIllllIl[15] = (0x7D ^ 0x77);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIIlIlIllIIIIIllll, final int lllllllllllllIIIIlIlIllIIIIIlllI) throws SlickException {
    }
    
    private static String llllIlIIIIIlIII(final String lllllllllllllIIIIlIlIlIllllIIlIl, final String lllllllllllllIIIIlIlIlIllllIIllI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIlIllllIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIlIllllIIllI.getBytes(StandardCharsets.UTF_8)), DistanceFieldTest.lIlIlllIllllIl[11]), "DES");
            final Cipher lllllllllllllIIIIlIlIlIllllIlIIl = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIlIllllIlIIl.init(DistanceFieldTest.lIlIlllIllllIl[2], lllllllllllllIIIIlIlIlIllllIlIlI);
            return new String(lllllllllllllIIIIlIlIlIllllIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIlIllllIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIlIllllIlIII) {
            lllllllllllllIIIIlIlIlIllllIlIII.printStackTrace();
            return null;
        }
    }
}
