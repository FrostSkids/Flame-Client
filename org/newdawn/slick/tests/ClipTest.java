// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class ClipTest extends BasicGame
{
    private /* synthetic */ float ang;
    private static final /* synthetic */ int[] lIIIIllIIlIlII;
    private /* synthetic */ boolean world;
    private /* synthetic */ boolean clip;
    private static final /* synthetic */ String[] lIIIIllIIIlllI;
    
    public ClipTest() {
        super(ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[0]]);
        this.ang = 0.0f;
    }
    
    private static boolean lIlllIllIIlIIll(final int lllllllllllllIlIIlIIlllIlIIllIll, final int lllllllllllllIlIIlIIlllIlIIllIlI) {
        return lllllllllllllIlIIlIIlllIlIIllIll < lllllllllllllIlIIlIIlllIlIIllIlI;
    }
    
    public void render(final GameContainer lllllllllllllIlIIlIIlllIlllIIIll, final Graphics lllllllllllllIlIIlIIlllIlllIIIII) throws SlickException {
        lllllllllllllIlIIlIIlllIlllIIIII.setColor(Color.white);
        lllllllllllllIlIIlIIlllIlllIIIII.drawString(ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[1]], 100.0f, 10.0f);
        lllllllllllllIlIIlIIlllIlllIIIII.drawString(ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[2]], 100.0f, 30.0f);
        lllllllllllllIlIIlIIlllIlllIIIII.drawString(ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[3]], 100.0f, 50.0f);
        if (lIlllIllIIlIIIl(this.world ? 1 : 0)) {
            lllllllllllllIlIIlIIlllIlllIIIII.drawString(ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[4]], 200.0f, 80.0f);
        }
        if (lIlllIllIIlIIIl(this.clip ? 1 : 0)) {
            lllllllllllllIlIIlIIlllIlllIIIII.drawString(ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[5]], 200.0f, 80.0f);
        }
        lllllllllllllIlIIlIIlllIlllIIIII.rotate(400.0f, 400.0f, this.ang);
        if (lIlllIllIIlIIIl(this.world ? 1 : 0)) {
            lllllllllllllIlIIlIIlllIlllIIIII.setWorldClip(350.0f, 302.0f, 100.0f, 196.0f);
        }
        if (lIlllIllIIlIIIl(this.clip ? 1 : 0)) {
            lllllllllllllIlIIlIIlllIlllIIIII.setClip(ClipTest.lIIIIllIIlIlII[6], ClipTest.lIIIIllIIlIlII[7], ClipTest.lIIIIllIIlIlII[8], ClipTest.lIIIIllIIlIlII[9]);
        }
        lllllllllllllIlIIlIIlllIlllIIIII.setColor(Color.red);
        lllllllllllllIlIIlIIlllIlllIIIII.fillOval(300.0f, 300.0f, 200.0f, 200.0f);
        lllllllllllllIlIIlIIlllIlllIIIII.setColor(Color.blue);
        lllllllllllllIlIIlIIlllIlllIIIII.fillRect(390.0f, 200.0f, 20.0f, 400.0f);
        lllllllllllllIlIIlIIlllIlllIIIII.clearClip();
        lllllllllllllIlIIlIIlllIlllIIIII.clearWorldClip();
    }
    
    private static boolean lIlllIllIIlIIIl(final int lllllllllllllIlIIlIIlllIlIIllIII) {
        return lllllllllllllIlIIlIIlllIlIIllIII != 0;
    }
    
    private static void lIlllIllIIlIIII() {
        (lIIIIllIIlIlII = new int[14])[0] = ((0x44 ^ 0x13) & ~(0x3C ^ 0x6B));
        ClipTest.lIIIIllIIlIlII[1] = " ".length();
        ClipTest.lIIIIllIIlIlII[2] = "  ".length();
        ClipTest.lIIIIllIIlIlII[3] = "   ".length();
        ClipTest.lIIIIllIIlIlII[4] = (0x18 ^ 0x1C);
        ClipTest.lIIIIllIIlIlII[5] = (0x1E ^ 0x1B);
        ClipTest.lIIIIllIIlIlII[6] = (-(0xFFFFF2F3 & 0x2FAD) & (0xFFFFF3FE & 0x2FFF));
        ClipTest.lIIIIllIIlIlII[7] = (0xFFFFEB7E & 0x15AF);
        ClipTest.lIIIIllIIlIlII[8] = (0x5E ^ 0x3A);
        ClipTest.lIIIIllIIlIlII[9] = 136 + 26 - 60 + 50 + (0x8 ^ 0x70) - (0x38 ^ 0x67) + (0x5A ^ 0x49);
        ClipTest.lIIIIllIIlIlII[10] = (0xFFFF8364 & 0x7FBB);
        ClipTest.lIIIIllIIlIlII[11] = (-(0xFFFF9D7C & 0x6F8B) & (0xFFFF9F5F & 0x6FFF));
        ClipTest.lIIIIllIIlIlII[12] = (0x49 ^ 0x4F);
        ClipTest.lIIIIllIIlIlII[13] = (0x42 ^ 0x36 ^ (0xC4 ^ 0xB8));
    }
    
    private static String lIlllIllIIIIIll(final String lllllllllllllIlIIlIIlllIllIIlIlI, final String lllllllllllllIlIIlIIlllIllIIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlllIllIIllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlllIllIIlIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIIlIIlllIllIIlllI = Cipher.getInstance("Blowfish");
            lllllllllllllIlIIlIIlllIllIIlllI.init(ClipTest.lIIIIllIIlIlII[2], lllllllllllllIlIIlIIlllIllIIllll);
            return new String(lllllllllllllIlIIlIIlllIllIIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlllIllIIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlllIllIIllIl) {
            lllllllllllllIlIIlIIlllIllIIllIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIIlIIlllIlllIlIlI, final int lllllllllllllIlIIlIIlllIlllIlIIl) throws SlickException {
        this.ang += lllllllllllllIlIIlIIlllIlllIlIIl * 0.01f;
    }
    
    static {
        lIlllIllIIlIIII();
        lIlllIllIIIlllI();
    }
    
    private static void lIlllIllIIIlllI() {
        (lIIIIllIIIlllI = new String[ClipTest.lIIIIllIIlIlII[12]])[ClipTest.lIIIIllIIlIlII[0]] = lIlllIllIIIIIll("qdJ7q8xiMAsalIQsx7iELw==", "AmEJG");
        ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[1]] = lIlllIllIIIIIll("JYnbpNo7svjrwpLKAhgLTQ==", "vaoym");
        ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[2]] = lIlllIllIIIlIll("UXRHaCUAJg8tGEMXBiEGEz0ELw==", "cTjHv");
        ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[3]] = lIlllIllIIIllII("fslYK+S1SuQ/f/o1GFsAXF5olpI6oL/E", "PiLKA");
        ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[4]] = lIlllIllIIIlIll("GDcHNDZvOxkxIh8xGz9SCjYUOj4KPA==", "OxUxr");
        ClipTest.lIIIIllIIIlllI[ClipTest.lIIIIllIIlIlII[5]] = lIlllIllIIIlIll("MBABHTwtcxAUMDMDGhY+QxYdGTsvFhc=", "cSSXy");
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIIlIIlllIlllIlllI) throws SlickException {
    }
    
    private static String lIlllIllIIIllII(final String lllllllllllllIlIIlIIlllIlIlIIlll, final String lllllllllllllIlIIlIIlllIlIlIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIIlIIlllIlIlIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIlIIlllIlIlIIllI.getBytes(StandardCharsets.UTF_8)), ClipTest.lIIIIllIIlIlII[13]), "DES");
            final Cipher lllllllllllllIlIIlIIlllIlIlIlIIl = Cipher.getInstance("DES");
            lllllllllllllIlIIlIIlllIlIlIlIIl.init(ClipTest.lIIIIllIIlIlII[2], lllllllllllllIlIIlIIlllIlIlIlIlI);
            return new String(lllllllllllllIlIIlIIlllIlIlIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIlIIlllIlIlIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIlIIlllIlIlIlIII) {
            lllllllllllllIlIIlIIlllIlIlIlIII.printStackTrace();
            return null;
        }
    }
    
    public static void main(final String[] lllllllllllllIlIIlIIlllIllIlIlIl) {
        try {
            final AppGameContainer lllllllllllllIlIIlIIlllIllIlIlll = new AppGameContainer(new ClipTest());
            lllllllllllllIlIIlIIlllIllIlIlll.setDisplayMode(ClipTest.lIIIIllIIlIlII[10], ClipTest.lIIIIllIIlIlII[11], (boolean)(ClipTest.lIIIIllIIlIlII[0] != 0));
            lllllllllllllIlIIlIIlllIllIlIlll.start();
            "".length();
            if (" ".length() < -" ".length()) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIIlIIlllIllIlIllI) {
            lllllllllllllIlIIlIIlllIllIlIllI.printStackTrace();
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIIlIIlllIllIlllII, final char lllllllllllllIlIIlIIlllIllIllIll) {
        if (lIlllIllIIlIIlI(lllllllllllllIlIIlIIlllIllIlllII, ClipTest.lIIIIllIIlIlII[2])) {
            this.world = (ClipTest.lIIIIllIIlIlII[0] != 0);
            this.clip = (ClipTest.lIIIIllIIlIlII[0] != 0);
        }
        if (lIlllIllIIlIIlI(lllllllllllllIlIIlIIlllIllIlllII, ClipTest.lIIIIllIIlIlII[3])) {
            this.world = (ClipTest.lIIIIllIIlIlII[0] != 0);
            this.clip = (ClipTest.lIIIIllIIlIlII[1] != 0);
        }
        if (lIlllIllIIlIIlI(lllllllllllllIlIIlIIlllIllIlllII, ClipTest.lIIIIllIIlIlII[4])) {
            this.world = (ClipTest.lIIIIllIIlIlII[1] != 0);
            this.clip = (ClipTest.lIIIIllIIlIlII[0] != 0);
        }
    }
    
    private static String lIlllIllIIIlIll(String lllllllllllllIlIIlIIlllIlIllIlll, final String lllllllllllllIlIIlIIlllIlIlllIll) {
        lllllllllllllIlIIlIIlllIlIllIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIIlIIlllIlIllIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIlIIlllIlIlllIlI = new StringBuilder();
        final char[] lllllllllllllIlIIlIIlllIlIlllIIl = lllllllllllllIlIIlIIlllIlIlllIll.toCharArray();
        int lllllllllllllIlIIlIIlllIlIlllIII = ClipTest.lIIIIllIIlIlII[0];
        final Exception lllllllllllllIlIIlIIlllIlIllIIlI = (Object)lllllllllllllIlIIlIIlllIlIllIlll.toCharArray();
        final Exception lllllllllllllIlIIlIIlllIlIllIIIl = (Exception)lllllllllllllIlIIlIIlllIlIllIIlI.length;
        double lllllllllllllIlIIlIIlllIlIllIIII = ClipTest.lIIIIllIIlIlII[0];
        while (lIlllIllIIlIIll((int)lllllllllllllIlIIlIIlllIlIllIIII, (int)lllllllllllllIlIIlIIlllIlIllIIIl)) {
            final char lllllllllllllIlIIlIIlllIlIllllIl = lllllllllllllIlIIlIIlllIlIllIIlI[lllllllllllllIlIIlIIlllIlIllIIII];
            lllllllllllllIlIIlIIlllIlIlllIlI.append((char)(lllllllllllllIlIIlIIlllIlIllllIl ^ lllllllllllllIlIIlIIlllIlIlllIIl[lllllllllllllIlIIlIIlllIlIlllIII % lllllllllllllIlIIlIIlllIlIlllIIl.length]));
            "".length();
            ++lllllllllllllIlIIlIIlllIlIlllIII;
            ++lllllllllllllIlIIlIIlllIlIllIIII;
            "".length();
            if (" ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIlIIlllIlIlllIlI);
    }
    
    private static boolean lIlllIllIIlIIlI(final int lllllllllllllIlIIlIIlllIlIIlllll, final int lllllllllllllIlIIlIIlllIlIIllllI) {
        return lllllllllllllIlIIlIIlllIlIIlllll == lllllllllllllIlIIlIIlllIlIIllllI;
    }
}
