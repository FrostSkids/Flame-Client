// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.util.Bootstrap;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.tiled.TiledMap;
import org.newdawn.slick.BasicGame;

public class IsoTiledTest extends BasicGame
{
    private static final /* synthetic */ String[] lIlIllllIIIlll;
    private /* synthetic */ TiledMap tilemap;
    private static final /* synthetic */ int[] lIlIllllIIlIll;
    
    static {
        llllIlIIlIllIlI();
        llllIlIIlIlIIII();
    }
    
    private static boolean llllIlIIlIllIll(final int lllllllllllllIIIIlIlIIIllIlIlllI, final int lllllllllllllIIIIlIlIIIllIlIllIl) {
        return lllllllllllllIIIIlIlIIIllIlIlllI < lllllllllllllIIIIlIlIIIllIlIllIl;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIIIIlIlIIIllllIlIlI, final int lllllllllllllIIIIlIlIIIllllIlIIl) throws SlickException {
    }
    
    public IsoTiledTest() {
        super(IsoTiledTest.lIlIllllIIIlll[IsoTiledTest.lIlIllllIIlIll[0]]);
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIIIIlIlIIIllllIllIl) throws SlickException {
        this.tilemap = new TiledMap(IsoTiledTest.lIlIllllIIIlll[IsoTiledTest.lIlIllllIIlIll[1]], IsoTiledTest.lIlIllllIIIlll[IsoTiledTest.lIlIllllIIlIll[2]]);
    }
    
    private static String llllIlIIlIIlllI(final String lllllllllllllIIIIlIlIIIlllIllIll, final String lllllllllllllIIIIlIlIIIlllIllIlI) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIIlllIllllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIIlllIllIlI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIIIIlIlIIIlllIlllIl = Cipher.getInstance("Blowfish");
            lllllllllllllIIIIlIlIIIlllIlllIl.init(IsoTiledTest.lIlIllllIIlIll[2], lllllllllllllIIIIlIlIIIlllIllllI);
            return new String(lllllllllllllIIIIlIlIIIlllIlllIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIlllIllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIIlllIlllII) {
            lllllllllllllIIIIlIlIIIlllIlllII.printStackTrace();
            return null;
        }
    }
    
    private static void llllIlIIlIllIlI() {
        (lIlIllllIIlIll = new int[9])[0] = ("   ".length() & ~"   ".length());
        IsoTiledTest.lIlIllllIIlIll[1] = " ".length();
        IsoTiledTest.lIlIllllIIlIll[2] = "  ".length();
        IsoTiledTest.lIlIllllIIlIll[3] = (0xFFFFE75E & 0x19FF);
        IsoTiledTest.lIlIllllIIlIll[4] = (0x69 ^ 0x32) + (0x20 ^ 0x25) - -(0xA0 ^ 0x8D) + (0x21 ^ 0x28);
        IsoTiledTest.lIlIllllIIlIll[5] = (-(0xFFFFF6B0 & 0x1D5F) & (-1 & 0x172F));
        IsoTiledTest.lIlIllllIIlIll[6] = (0xFFFFAA7C & 0x57DB);
        IsoTiledTest.lIlIllllIIlIll[7] = "   ".length();
        IsoTiledTest.lIlIllllIIlIll[8] = (0x66 ^ 0x11 ^ 103 + 77 - 68 + 15);
    }
    
    public static void main(final String[] lllllllllllllIIIIlIlIIIllllIIIll) {
        Bootstrap.runAsApplication(new IsoTiledTest(), IsoTiledTest.lIlIllllIIlIll[5], IsoTiledTest.lIlIllllIIlIll[6], (boolean)(IsoTiledTest.lIlIllllIIlIll[0] != 0));
    }
    
    private static void llllIlIIlIlIIII() {
        (lIlIllllIIIlll = new String[IsoTiledTest.lIlIllllIIlIll[7]])[IsoTiledTest.lIlIllllIIlIll[0]] = llllIlIIlIIllIl("gFh0RpgIhHinr0sWhcoOh32jhXzh7fv5ANLJh1e+Jmc=", "etKWd");
        IsoTiledTest.lIlIllllIIIlll[IsoTiledTest.lIlIllllIIlIll[1]] = llllIlIIlIIlllI("0OZvGoT5zUCTyXKJv1vfg6IsgLZcTj+4", "bRmxA");
        IsoTiledTest.lIlIllllIIIlll[IsoTiledTest.lIlIllllIIlIll[2]] = llllIlIIlIIllll("MjULEQAnJBlK", "FPxed");
    }
    
    public void render(final GameContainer lllllllllllllIIIIlIlIIIllllIIllI, final Graphics lllllllllllllIIIIlIlIIIllllIIlIl) throws SlickException {
        this.tilemap.render(IsoTiledTest.lIlIllllIIlIll[3], IsoTiledTest.lIlIllllIIlIll[4]);
    }
    
    private static String llllIlIIlIIllll(String lllllllllllllIIIIlIlIIIlllIIIllI, final String lllllllllllllIIIIlIlIIIlllIIlIlI) {
        lllllllllllllIIIIlIlIIIlllIIIllI = new String(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIlllIIIllI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIIIlIlIIIlllIIlIIl = new StringBuilder();
        final char[] lllllllllllllIIIIlIlIIIlllIIlIII = lllllllllllllIIIIlIlIIIlllIIlIlI.toCharArray();
        int lllllllllllllIIIIlIlIIIlllIIIlll = IsoTiledTest.lIlIllllIIlIll[0];
        final double lllllllllllllIIIIlIlIIIlllIIIIIl = (Object)lllllllllllllIIIIlIlIIIlllIIIllI.toCharArray();
        final long lllllllllllllIIIIlIlIIIlllIIIIII = lllllllllllllIIIIlIlIIIlllIIIIIl.length;
        float lllllllllllllIIIIlIlIIIllIllllll = IsoTiledTest.lIlIllllIIlIll[0];
        while (llllIlIIlIllIll((int)lllllllllllllIIIIlIlIIIllIllllll, (int)lllllllllllllIIIIlIlIIIlllIIIIII)) {
            final char lllllllllllllIIIIlIlIIIlllIIllII = lllllllllllllIIIIlIlIIIlllIIIIIl[lllllllllllllIIIIlIlIIIllIllllll];
            lllllllllllllIIIIlIlIIIlllIIlIIl.append((char)(lllllllllllllIIIIlIlIIIlllIIllII ^ lllllllllllllIIIIlIlIIIlllIIlIII[lllllllllllllIIIIlIlIIIlllIIIlll % lllllllllllllIIIIlIlIIIlllIIlIII.length]));
            "".length();
            ++lllllllllllllIIIIlIlIIIlllIIIlll;
            ++lllllllllllllIIIIlIlIIIllIllllll;
            "".length();
            if (null != null) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIIIlIlIIIlllIIlIIl);
    }
    
    private static String llllIlIIlIIllIl(final String lllllllllllllIIIIlIlIIIllIllIllI, final String lllllllllllllIIIIlIlIIIllIllIlIl) {
        try {
            final SecretKeySpec lllllllllllllIIIIlIlIIIllIlllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIIlIlIIIllIllIlIl.getBytes(StandardCharsets.UTF_8)), IsoTiledTest.lIlIllllIIlIll[8]), "DES");
            final Cipher lllllllllllllIIIIlIlIIIllIlllIII = Cipher.getInstance("DES");
            lllllllllllllIIIIlIlIIIllIlllIII.init(IsoTiledTest.lIlIllllIIlIll[2], lllllllllllllIIIIlIlIIIllIlllIIl);
            return new String(lllllllllllllIIIIlIlIIIllIlllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIIIlIlIIIllIllIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIIIlIlIIIllIllIlll) {
            lllllllllllllIIIIlIlIIIllIllIlll.printStackTrace();
            return null;
        }
    }
}
