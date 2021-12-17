// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;

public class DoubleClickTest extends BasicGame
{
    private static final /* synthetic */ int[] lIIlIIIlllIIlI;
    private /* synthetic */ String message;
    private static final /* synthetic */ String[] lIIlIIIllIllII;
    
    private static void llIIlIlllIIlIlI() {
        (lIIlIIIlllIIlI = new int[11])[0] = ((" ".length() ^ (0x5F ^ 0x45)) & (0x58 ^ 0x13 ^ (0xF5 ^ 0xA5) ^ -" ".length()));
        DoubleClickTest.lIIlIIIlllIIlI[1] = " ".length();
        DoubleClickTest.lIIlIIIlllIIlI[2] = (0xFFFFC7F6 & 0x3B29);
        DoubleClickTest.lIIlIIIlllIIlI[3] = (0xFFFFA6F8 & 0x5B5F);
        DoubleClickTest.lIIlIIIlllIIlI[4] = "  ".length();
        DoubleClickTest.lIIlIIIlllIIlI[5] = "   ".length();
        DoubleClickTest.lIIlIIIlllIIlI[6] = (0x80 ^ 0x84);
        DoubleClickTest.lIIlIIIlllIIlI[7] = (0x3F ^ 0x3A);
        DoubleClickTest.lIIlIIIlllIIlI[8] = (101 + 26 - 88 + 93 ^ 108 + 66 - 68 + 24);
        DoubleClickTest.lIIlIIIlllIIlI[9] = (0x28 ^ 0x70 ^ (0x74 ^ 0x2B));
        DoubleClickTest.lIIlIIIlllIIlI[10] = (0x53 ^ 0x39 ^ (0xE8 ^ 0x8A));
    }
    
    public DoubleClickTest() {
        super(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[0]]);
        this.message = DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[1]];
    }
    
    public static void main(final String[] lllllllllllllIIlllIIlIIIIIlIIIlI) {
        try {
            final AppGameContainer lllllllllllllIIlllIIlIIIIIlIIlII = new AppGameContainer(new DoubleClickTest());
            lllllllllllllIIlllIIlIIIIIlIIlII.setDisplayMode(DoubleClickTest.lIIlIIIlllIIlI[2], DoubleClickTest.lIIlIIIlllIIlI[3], (boolean)(DoubleClickTest.lIIlIIIlllIIlI[0] != 0));
            lllllllllllllIIlllIIlIIIIIlIIlII.start();
            "".length();
            if ((0x88 ^ 0xAE ^ (0x47 ^ 0x65)) <= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIlllIIlIIIIIlIIIll) {
            lllllllllllllIIlllIIlIIIIIlIIIll.printStackTrace();
        }
    }
    
    private static String llIIlIlllIIIIIl(String lllllllllllllIIlllIIIllllllllIlI, final String lllllllllllllIIlllIIIllllllllIIl) {
        lllllllllllllIIlllIIIllllllllIlI = new String(Base64.getDecoder().decode(lllllllllllllIIlllIIIllllllllIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIlllIIIllllllllIII = new StringBuilder();
        final char[] lllllllllllllIIlllIIIlllllllIlll = lllllllllllllIIlllIIIllllllllIIl.toCharArray();
        int lllllllllllllIIlllIIIlllllllIllI = DoubleClickTest.lIIlIIIlllIIlI[0];
        final boolean lllllllllllllIIlllIIIlllllllIIII = (Object)lllllllllllllIIlllIIIllllllllIlI.toCharArray();
        final char lllllllllllllIIlllIIIllllllIllll = (char)lllllllllllllIIlllIIIlllllllIIII.length;
        byte lllllllllllllIIlllIIIllllllIlllI = (byte)DoubleClickTest.lIIlIIIlllIIlI[0];
        while (llIIlIlllIIllII(lllllllllllllIIlllIIIllllllIlllI, lllllllllllllIIlllIIIllllllIllll)) {
            final char lllllllllllllIIlllIIIllllllllIll = lllllllllllllIIlllIIIlllllllIIII[lllllllllllllIIlllIIIllllllIlllI];
            lllllllllllllIIlllIIIllllllllIII.append((char)(lllllllllllllIIlllIIIllllllllIll ^ lllllllllllllIIlllIIIlllllllIlll[lllllllllllllIIlllIIIlllllllIllI % lllllllllllllIIlllIIIlllllllIlll.length]));
            "".length();
            ++lllllllllllllIIlllIIIlllllllIllI;
            ++lllllllllllllIIlllIIIllllllIlllI;
            "".length();
            if (" ".length() >= "   ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIlllIIIllllllllIII);
    }
    
    private static boolean llIIlIlllIIllII(final int lllllllllllllIIlllIIIlllllIllIIl, final int lllllllllllllIIlllIIIlllllIllIII) {
        return lllllllllllllIIlllIIIlllllIllIIl < lllllllllllllIIlllIIIlllllIllIII;
    }
    
    @Override
    public void mouseClicked(final int lllllllllllllIIlllIIlIIIIIIlIlIl, final int lllllllllllllIIlllIIlIIIIIIlIlII, final int lllllllllllllIIlllIIlIIIIIIlIIll, final int lllllllllllllIIlllIIlIIIIIIlIIlI) {
        if (llIIlIlllIIlIll(lllllllllllllIIlllIIlIIIIIIlIIlI, DoubleClickTest.lIIlIIIlllIIlI[1])) {
            this.message = String.valueOf(new StringBuilder().append(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[4]]).append(lllllllllllllIIlllIIlIIIIIIlIlIl).append(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[5]]).append(lllllllllllllIIlllIIlIIIIIIlIlII).append(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[6]]).append(lllllllllllllIIlllIIlIIIIIIlIIll));
        }
        if (llIIlIlllIIlIll(lllllllllllllIIlllIIlIIIIIIlIIlI, DoubleClickTest.lIIlIIIlllIIlI[4])) {
            this.message = String.valueOf(new StringBuilder().append(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[7]]).append(lllllllllllllIIlllIIlIIIIIIlIlIl).append(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[8]]).append(lllllllllllllIIlllIIlIIIIIIlIlII).append(DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[9]]).append(lllllllllllllIIlllIIlIIIIIIlIIll));
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIlllIIlIIIIIlIlllI, final int lllllllllllllIIlllIIlIIIIIlIllIl) throws SlickException {
    }
    
    static {
        llIIlIlllIIlIlI();
        llIIlIlllIIIllI();
    }
    
    public void render(final GameContainer lllllllllllllIIlllIIlIIIIIlIlIIl, final Graphics lllllllllllllIIlllIIlIIIIIlIIllI) throws SlickException {
        lllllllllllllIIlllIIlIIIIIlIIllI.drawString(this.message, 100.0f, 100.0f);
    }
    
    private static String llIIlIlllIIIIll(final String lllllllllllllIIlllIIIllllllIIIll, final String lllllllllllllIIlllIIIllllllIIIlI) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIIllllllIlIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIIllllllIIIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIlllIIIllllllIIlll = Cipher.getInstance("Blowfish");
            lllllllllllllIIlllIIIllllllIIlll.init(DoubleClickTest.lIIlIIIlllIIlI[4], lllllllllllllIIlllIIIllllllIlIII);
            return new String(lllllllllllllIIlllIIIllllllIIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIIllllllIIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIIllllllIIllI) {
            lllllllllllllIIlllIIIllllllIIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIlllIIlIIIIIllIIII) throws SlickException {
    }
    
    private static boolean llIIlIlllIIlIll(final int lllllllllllllIIlllIIIlllllIlllIl, final int lllllllllllllIIlllIIIlllllIlllII) {
        return lllllllllllllIIlllIIIlllllIlllIl == lllllllllllllIIlllIIIlllllIlllII;
    }
    
    private static void llIIlIlllIIIllI() {
        (lIIlIIIllIllII = new String[DoubleClickTest.lIIlIIIlllIIlI[10]])[DoubleClickTest.lIIlIIIlllIIlI[0]] = llIIlIlllIIIIIl("Nh0ZGzYXUi8VMxEZTC0/AQY=", "rrlyZ");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[1]] = llIIlIlllIIIIlI("5g48UEDjGowTvUVao96KjTE1ToNin9PZ", "pBUbn");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[4]] = llIIlIlllIIIIIl("ACAaAxo2aTcIHzAiTkQ=", "SItdv");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[5]] = llIIlIlllIIIIll("BHrFBtWc5JA=", "YFGTw");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[6]] = llIIlIlllIIIIll("A9h06lPhVU8=", "ILnPt");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[7]] = llIIlIlllIIIIll("utdtjJijCKZx19fPiM3+Qw==", "qMlHG");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[8]] = llIIlIlllIIIIIl("dw==", "WjOPF");
        DoubleClickTest.lIIlIIIllIllII[DoubleClickTest.lIIlIIIlllIIlI[9]] = llIIlIlllIIIIlI("KR3jFy3wbTA=", "qUguF");
    }
    
    private static String llIIlIlllIIIIlI(final String lllllllllllllIIlllIIlIIIIIIIlIlI, final String lllllllllllllIIlllIIlIIIIIIIIlll) {
        try {
            final SecretKeySpec lllllllllllllIIlllIIlIIIIIIIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIlllIIlIIIIIIIIlll.getBytes(StandardCharsets.UTF_8)), DoubleClickTest.lIIlIIIlllIIlI[10]), "DES");
            final Cipher lllllllllllllIIlllIIlIIIIIIIllII = Cipher.getInstance("DES");
            lllllllllllllIIlllIIlIIIIIIIllII.init(DoubleClickTest.lIIlIIIlllIIlI[4], lllllllllllllIIlllIIlIIIIIIIllIl);
            return new String(lllllllllllllIIlllIIlIIIIIIIllII.doFinal(Base64.getDecoder().decode(lllllllllllllIIlllIIlIIIIIIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIlllIIlIIIIIIIlIll) {
            lllllllllllllIIlllIIlIIIIIIIlIll.printStackTrace();
            return null;
        }
    }
}
