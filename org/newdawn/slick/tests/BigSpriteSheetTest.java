// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.BigImage;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class BigSpriteSheetTest extends BasicGame
{
    private /* synthetic */ boolean oldMethod;
    private static final /* synthetic */ String[] lIlIIIllIIIlll;
    private /* synthetic */ Image original;
    private /* synthetic */ SpriteSheet bigSheet;
    private static final /* synthetic */ int[] lIlIIIllIIlIII;
    
    private static boolean lllIIIlllIIIlIl(final int lllllllllllllIIIllllIIlIllIlllIl) {
        return lllllllllllllIIIllllIIlIllIlllIl != 0;
    }
    
    static {
        lllIIIlllIIIlII();
        lllIIIlllIIIIll();
    }
    
    private static boolean lllIIIlllIIIllI(final int lllllllllllllIIIllllIIlIlllIIIII, final int lllllllllllllIIIllllIIlIllIlllll) {
        return lllllllllllllIIIllllIIlIlllIIIII < lllllllllllllIIIllllIIlIllIlllll;
    }
    
    public void render(final GameContainer lllllllllllllIIIllllIIllIIlIIlII, final Graphics lllllllllllllIIIllllIIllIIlIIIll) {
        if (lllIIIlllIIIlIl(this.oldMethod ? 1 : 0)) {
            int lllllllllllllIIIllllIIllIIlIlIll = BigSpriteSheetTest.lIlIIIllIIlIII[0];
            while (lllIIIlllIIIllI(lllllllllllllIIIllllIIllIIlIlIll, BigSpriteSheetTest.lIlIIIllIIlIII[5])) {
                int lllllllllllllIIIllllIIllIIlIllII = BigSpriteSheetTest.lIlIIIllIIlIII[0];
                while (lllIIIlllIIIllI(lllllllllllllIIIllllIIllIIlIllII, BigSpriteSheetTest.lIlIIIllIIlIII[6])) {
                    this.bigSheet.getSprite(lllllllllllllIIIllllIIllIIlIlIll, lllllllllllllIIIllllIIllIIlIllII).draw((float)(BigSpriteSheetTest.lIlIIIllIIlIII[7] + lllllllllllllIIIllllIIllIIlIlIll * BigSpriteSheetTest.lIlIIIllIIlIII[8]), (float)(BigSpriteSheetTest.lIlIIIllIIlIII[9] + lllllllllllllIIIllllIIllIIlIllII * BigSpriteSheetTest.lIlIIIllIIlIII[8]));
                    ++lllllllllllllIIIllllIIllIIlIllII;
                    "".length();
                    if (((0x3 ^ 0x55) & ~(0xC9 ^ 0x9F)) != 0x0) {
                        return;
                    }
                }
                ++lllllllllllllIIIllllIIllIIlIlIll;
                "".length();
                if ("  ".length() <= 0) {
                    return;
                }
            }
            "".length();
            if (" ".length() != " ".length()) {
                return;
            }
        }
        else {
            this.bigSheet.startUse();
            int lllllllllllllIIIllllIIllIIlIlIIl = BigSpriteSheetTest.lIlIIIllIIlIII[0];
            while (lllIIIlllIIIllI(lllllllllllllIIIllllIIllIIlIlIIl, BigSpriteSheetTest.lIlIIIllIIlIII[5])) {
                int lllllllllllllIIIllllIIllIIlIlIlI = BigSpriteSheetTest.lIlIIIllIIlIII[0];
                while (lllIIIlllIIIllI(lllllllllllllIIIllllIIllIIlIlIlI, BigSpriteSheetTest.lIlIIIllIIlIII[6])) {
                    this.bigSheet.renderInUse(BigSpriteSheetTest.lIlIIIllIIlIII[7] + lllllllllllllIIIllllIIllIIlIlIIl * BigSpriteSheetTest.lIlIIIllIIlIII[8], BigSpriteSheetTest.lIlIIIllIIlIII[9] + lllllllllllllIIIllllIIllIIlIlIlI * BigSpriteSheetTest.lIlIIIllIIlIII[8], lllllllllllllIIIllllIIllIIlIlIIl, lllllllllllllIIIllllIIllIIlIlIlI);
                    ++lllllllllllllIIIllllIIllIIlIlIlI;
                    "".length();
                    if (null != null) {
                        return;
                    }
                }
                ++lllllllllllllIIIllllIIllIIlIlIIl;
                "".length();
                if (-(0x5B ^ 0x5F) >= 0) {
                    return;
                }
            }
            this.bigSheet.endUse();
        }
        lllllllllllllIIIllllIIllIIlIIIll.drawString(BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[2]], 10.0f, 30.0f);
        lllllllllllllIIIllllIIllIIlIIlII.getDefaultFont().drawString(10.0f, 100.0f, BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[10]]);
    }
    
    private static String lllIIIlllIIIIIl(String lllllllllllllIIIllllIIlIlllIlIll, final String lllllllllllllIIIllllIIlIlllIllll) {
        lllllllllllllIIIllllIIlIlllIlIll = (double)new String(Base64.getDecoder().decode(((String)lllllllllllllIIIllllIIlIlllIlIll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIllllIIlIlllIlllI = new StringBuilder();
        final char[] lllllllllllllIIIllllIIlIlllIllIl = lllllllllllllIIIllllIIlIlllIllll.toCharArray();
        int lllllllllllllIIIllllIIlIlllIllII = BigSpriteSheetTest.lIlIIIllIIlIII[0];
        final short lllllllllllllIIIllllIIlIlllIIllI = (Object)((String)lllllllllllllIIIllllIIlIlllIlIll).toCharArray();
        final String lllllllllllllIIIllllIIlIlllIIlIl = (String)lllllllllllllIIIllllIIlIlllIIllI.length;
        String lllllllllllllIIIllllIIlIlllIIlII = (String)BigSpriteSheetTest.lIlIIIllIIlIII[0];
        while (lllIIIlllIIIllI((int)lllllllllllllIIIllllIIlIlllIIlII, (int)lllllllllllllIIIllllIIlIlllIIlIl)) {
            final char lllllllllllllIIIllllIIlIllllIIIl = lllllllllllllIIIllllIIlIlllIIllI[lllllllllllllIIIllllIIlIlllIIlII];
            lllllllllllllIIIllllIIlIlllIlllI.append((char)(lllllllllllllIIIllllIIlIllllIIIl ^ lllllllllllllIIIllllIIlIlllIllIl[lllllllllllllIIIllllIIlIlllIllII % lllllllllllllIIIllllIIlIlllIllIl.length]));
            "".length();
            ++lllllllllllllIIIllllIIlIlllIllII;
            ++lllllllllllllIIIllllIIlIlllIIlII;
            "".length();
            if ("   ".length() < 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIllllIIlIlllIlllI);
    }
    
    private static String lllIIIlllIIIIII(final String lllllllllllllIIIllllIIllIIIIIIII, final String lllllllllllllIIIllllIIlIllllllIl) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIllIIIIIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIlIllllllIl.getBytes(StandardCharsets.UTF_8)), BigSpriteSheetTest.lIlIIIllIIlIII[15]), "DES");
            final Cipher lllllllllllllIIIllllIIllIIIIIIlI = Cipher.getInstance("DES");
            lllllllllllllIIIllllIIllIIIIIIlI.init(BigSpriteSheetTest.lIlIIIllIIlIII[2], lllllllllllllIIIllllIIllIIIIIIll);
            return new String(lllllllllllllIIIllllIIllIIIIIIlI.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIllIIIIIIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIllIIIIIIIl) {
            lllllllllllllIIIllllIIllIIIIIIIl.printStackTrace();
            return null;
        }
    }
    
    private static String lllIIIlllIIIIlI(final String lllllllllllllIIIllllIIllIIIIllIl, final String lllllllllllllIIIllllIIllIIIIllII) {
        try {
            final SecretKeySpec lllllllllllllIIIllllIIllIIIlIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIllllIIllIIIIllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIllllIIllIIIIllll = Cipher.getInstance("Blowfish");
            lllllllllllllIIIllllIIllIIIIllll.init(BigSpriteSheetTest.lIlIIIllIIlIII[2], lllllllllllllIIIllllIIllIIIlIIII);
            return new String(lllllllllllllIIIllllIIllIIIIllll.doFinal(Base64.getDecoder().decode(lllllllllllllIIIllllIIllIIIIllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIllllIIllIIIIlllI) {
            lllllllllllllIIIllllIIllIIIIlllI.printStackTrace();
            return null;
        }
    }
    
    private static boolean lllIIIlllIIIlll(final int lllllllllllllIIIllllIIlIllIllIll) {
        return lllllllllllllIIIllllIIlIllIllIll == 0;
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIllllIIllIIllIIll) throws SlickException {
        this.original = new BigImage(BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[1]], BigSpriteSheetTest.lIlIIIllIIlIII[2], BigSpriteSheetTest.lIlIIIllIIlIII[3]);
        this.bigSheet = new SpriteSheet(this.original, BigSpriteSheetTest.lIlIIIllIIlIII[4], BigSpriteSheetTest.lIlIIIllIIlIII[4]);
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIllllIIllIIIllIII, final int lllllllllllllIIIllllIIllIIIlIlll) throws SlickException {
        if (lllIIIlllIIIlIl(lllllllllllllIIIllllIIllIIIllIII.getInput().isKeyPressed(BigSpriteSheetTest.lIlIIIllIIlIII[13]) ? 1 : 0)) {
            int oldMethod;
            if (lllIIIlllIIIlll(this.oldMethod ? 1 : 0)) {
                oldMethod = BigSpriteSheetTest.lIlIIIllIIlIII[1];
                "".length();
                if (" ".length() < 0) {
                    return;
                }
            }
            else {
                oldMethod = BigSpriteSheetTest.lIlIIIllIIlIII[0];
            }
            this.oldMethod = (oldMethod != 0);
        }
    }
    
    private static void lllIIIlllIIIlII() {
        (lIlIIIllIIlIII = new int[16])[0] = ((0xC4 ^ 0x9F) & ~(0x7 ^ 0x5C));
        BigSpriteSheetTest.lIlIIIllIIlIII[1] = " ".length();
        BigSpriteSheetTest.lIlIIIllIIlIII[2] = "  ".length();
        BigSpriteSheetTest.lIlIIIllIIlIII[3] = (0xFFFFFDA4 & 0x35B);
        BigSpriteSheetTest.lIlIIIllIIlIII[4] = (0x0 ^ 0x10);
        BigSpriteSheetTest.lIlIIIllIIlIII[5] = (0xCD ^ 0x92 ^ (0x16 ^ 0x62));
        BigSpriteSheetTest.lIlIIIllIIlIII[6] = (113 + 16 - 53 + 70 ^ 18 + 7 + 62 + 50);
        BigSpriteSheetTest.lIlIIIllIIlIII[7] = ("   ".length() ^ (0x74 ^ 0x7D));
        BigSpriteSheetTest.lIlIIIllIIlIII[8] = (0x4C ^ 0x5E);
        BigSpriteSheetTest.lIlIIIllIIlIII[9] = (0x46 ^ 0x74);
        BigSpriteSheetTest.lIlIIIllIIlIII[10] = "   ".length();
        BigSpriteSheetTest.lIlIIIllIIlIII[11] = (0xFFFFC73E & 0x3BE1);
        BigSpriteSheetTest.lIlIIIllIIlIII[12] = (-(0xFFFFFBFF & 0x65A8) & (0xFFFFF7FF & 0x6BFF));
        BigSpriteSheetTest.lIlIIIllIIlIII[13] = (0x32 ^ 0xB);
        BigSpriteSheetTest.lIlIIIllIIlIII[14] = (0x2A ^ 0x4E ^ (0x43 ^ 0x23));
        BigSpriteSheetTest.lIlIIIllIIlIII[15] = (0x71 ^ 0x79);
    }
    
    public static void main(final String[] lllllllllllllIIIllllIIllIIIlllIl) {
        try {
            final AppGameContainer lllllllllllllIIIllllIIllIIIlllll = new AppGameContainer(new BigSpriteSheetTest());
            lllllllllllllIIIllllIIllIIIlllll.setDisplayMode(BigSpriteSheetTest.lIlIIIllIIlIII[11], BigSpriteSheetTest.lIlIIIllIIlIII[12], (boolean)(BigSpriteSheetTest.lIlIIIllIIlIII[0] != 0));
            lllllllllllllIIIllllIIllIIIlllll.start();
            "".length();
            if ((0xA ^ 0xF) <= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIIIllllIIllIIIllllI) {
            lllllllllllllIIIllllIIllIIIllllI.printStackTrace();
        }
    }
    
    public BigSpriteSheetTest() {
        super(BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[0]]);
        this.oldMethod = (BigSpriteSheetTest.lIlIIIllIIlIII[1] != 0);
    }
    
    private static void lllIIIlllIIIIll() {
        (lIlIIIllIIIlll = new String[BigSpriteSheetTest.lIlIIIllIIlIII[14]])[BigSpriteSheetTest.lIlIIIllIIlIII[0]] = lllIIIlllIIIIII("Jvre/qHXDKDu0PyGCeoXJ12wJIqNblSN", "buvEZ");
        BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[1]] = lllIIIlllIIIIIl("Mz8jIA0mLjF7Cy49OTkIID9+IA4m", "GZPTi");
        BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[2]] = lllIIIlllIIIIIl("JD4GEh9UPxMADxFsFw5MACMEBgARbBEEAhApEQgCE2wOBBgcIwc=", "tLcal");
        BigSpriteSheetTest.lIlIIIllIIIlll[BigSpriteSheetTest.lIlIIIllIIlIII[10]] = lllIIIlllIIIIlI("UeJfKTclXmg=", "jkPyH");
    }
}
