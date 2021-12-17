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
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class CopyAreaAlphaTest extends BasicGame
{
    private /* synthetic */ Image copy;
    private static final /* synthetic */ String[] llIlIIlllIIIlI;
    private static final /* synthetic */ int[] llIlIIlllIIIll;
    private /* synthetic */ Image textureMap;
    
    public CopyAreaAlphaTest() {
        super(CopyAreaAlphaTest.llIlIIlllIIIlI[CopyAreaAlphaTest.llIlIIlllIIIll[0]]);
    }
    
    private static void lIIlIIllIIlIlllI() {
        (llIlIIlllIIIll = new int[7])[0] = ((0x47 ^ 0x3E ^ (0xEA ^ 0xAA)) & (0x93 ^ 0x85 ^ (0x21 ^ 0xE) ^ -" ".length()));
        CopyAreaAlphaTest.llIlIIlllIIIll[1] = " ".length();
        CopyAreaAlphaTest.llIlIIlllIIIll[2] = (0x20 ^ 0x30 ^ (0x33 ^ 0x47));
        CopyAreaAlphaTest.llIlIIlllIIIll[3] = (0xFFFF937B & 0x6FA4);
        CopyAreaAlphaTest.llIlIIlllIIIll[4] = (0xFFFFD75B & 0x2AFC);
        CopyAreaAlphaTest.llIlIIlllIIIll[5] = "  ".length();
        CopyAreaAlphaTest.llIlIIlllIIIll[6] = (0x86 ^ 0x8E);
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIlIlllIIlIIlIIlII, final char llllllllllllIllIlIlllIIlIIlIIIll) {
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIlIlllIIlIIlIlllI, final int llllllllllllIllIlIlllIIlIIlIllIl) throws SlickException {
    }
    
    public static void main(final String[] llllllllllllIllIlIlllIIlIIIlllll) {
        try {
            final AppGameContainer llllllllllllIllIlIlllIIlIIlIIIIl = new AppGameContainer(new CopyAreaAlphaTest());
            llllllllllllIllIlIlllIIlIIlIIIIl.setDisplayMode(CopyAreaAlphaTest.llIlIIlllIIIll[3], CopyAreaAlphaTest.llIlIIlllIIIll[4], (boolean)(CopyAreaAlphaTest.llIlIIlllIIIll[0] != 0));
            llllllllllllIllIlIlllIIlIIlIIIIl.start();
            "".length();
            if ((0x58 ^ 0x5C) != (0x80 ^ 0x84)) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIlIlllIIlIIlIIIII) {
            llllllllllllIllIlIlllIIlIIlIIIII.printStackTrace();
        }
    }
    
    static {
        lIIlIIllIIlIlllI();
        lIIlIIllIIlIllIl();
    }
    
    private static void lIIlIIllIIlIllIl() {
        (llIlIIlllIIIlI = new String[CopyAreaAlphaTest.llIlIIlllIIIll[5]])[CopyAreaAlphaTest.llIlIIlllIIIll[0]] = lIIlIIllIIlIlIll("CyQWKQM6LgdwAyQ7DjFiHC4VJA==", "HKfPB");
        CopyAreaAlphaTest.llIlIIlllIIIlI[CopyAreaAlphaTest.llIlIIlllIIIll[1]] = lIIlIIllIIlIllII("23RtnZYZ+FbCGYdRZvNyh6ENrh0ztu6W", "SKUXt");
    }
    
    public void render(final GameContainer llllllllllllIllIlIlllIIlIIlIlIIl, final Graphics llllllllllllIllIlIlllIIlIIlIlIII) throws SlickException {
        llllllllllllIllIlIlllIIlIIlIlIII.clearAlphaMap();
        llllllllllllIllIlIlllIIlIIlIlIII.setDrawMode(Graphics.MODE_NORMAL);
        llllllllllllIllIlIlllIIlIIlIlIII.setColor(Color.white);
        llllllllllllIllIlIlllIIlIIlIlIII.fillOval(100.0f, 100.0f, 150.0f, 150.0f);
        this.textureMap.draw(10.0f, 50.0f);
        llllllllllllIllIlIlllIIlIIlIlIII.copyArea(this.copy, CopyAreaAlphaTest.llIlIIlllIIIll[2], CopyAreaAlphaTest.llIlIIlllIIIll[2]);
        llllllllllllIllIlIlllIIlIIlIlIII.setColor(Color.red);
        llllllllllllIllIlIlllIIlIIlIlIII.fillRect(300.0f, 100.0f, 200.0f, 200.0f);
        this.copy.draw(350.0f, 150.0f);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIlIlllIIlIIllIIII) throws SlickException {
        this.textureMap = new Image(CopyAreaAlphaTest.llIlIIlllIIIlI[CopyAreaAlphaTest.llIlIIlllIIIll[1]]);
        llllllllllllIllIlIlllIIlIIllIIII.getGraphics().setBackground(Color.black);
        this.copy = new Image(CopyAreaAlphaTest.llIlIIlllIIIll[2], CopyAreaAlphaTest.llIlIIlllIIIll[2]);
    }
    
    private static boolean lIIlIIllIIlIllll(final int llllllllllllIllIlIlllIIIllllIllI, final int llllllllllllIllIlIlllIIIllllIlIl) {
        return llllllllllllIllIlIlllIIIllllIllI < llllllllllllIllIlIlllIIIllllIlIl;
    }
    
    private static String lIIlIIllIIlIllII(final String llllllllllllIllIlIlllIIIllllllII, final String llllllllllllIllIlIlllIIIlllllIll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlllIIlIIIIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlllIIIlllllIll.getBytes(StandardCharsets.UTF_8)), CopyAreaAlphaTest.llIlIIlllIIIll[6]), "DES");
            final Cipher llllllllllllIllIlIlllIIlIIIIIIII = Cipher.getInstance("DES");
            llllllllllllIllIlIlllIIlIIIIIIII.init(CopyAreaAlphaTest.llIlIIlllIIIll[5], llllllllllllIllIlIlllIIlIIIIIIIl);
            return new String(llllllllllllIllIlIlllIIlIIIIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlllIIIllllllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlllIIIllllllll) {
            llllllllllllIllIlIlllIIIllllllll.printStackTrace();
            return null;
        }
    }
    
    private static String lIIlIIllIIlIlIll(String llllllllllllIllIlIlllIIlIIIIlllI, final String llllllllllllIllIlIlllIIlIIIlIIlI) {
        llllllllllllIllIlIlllIIlIIIIlllI = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlllIIlIIIIlllI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlllIIlIIIlIIIl = new StringBuilder();
        final char[] llllllllllllIllIlIlllIIlIIIlIIII = llllllllllllIllIlIlllIIlIIIlIIlI.toCharArray();
        int llllllllllllIllIlIlllIIlIIIIllll = CopyAreaAlphaTest.llIlIIlllIIIll[0];
        final short llllllllllllIllIlIlllIIlIIIIlIIl = (Object)((String)llllllllllllIllIlIlllIIlIIIIlllI).toCharArray();
        final byte llllllllllllIllIlIlllIIlIIIIlIII = (byte)llllllllllllIllIlIlllIIlIIIIlIIl.length;
        char llllllllllllIllIlIlllIIlIIIIIlll = (char)CopyAreaAlphaTest.llIlIIlllIIIll[0];
        while (lIIlIIllIIlIllll(llllllllllllIllIlIlllIIlIIIIIlll, llllllllllllIllIlIlllIIlIIIIlIII)) {
            final char llllllllllllIllIlIlllIIlIIIlIlII = llllllllllllIllIlIlllIIlIIIIlIIl[llllllllllllIllIlIlllIIlIIIIIlll];
            llllllllllllIllIlIlllIIlIIIlIIIl.append((char)(llllllllllllIllIlIlllIIlIIIlIlII ^ llllllllllllIllIlIlllIIlIIIlIIII[llllllllllllIllIlIlllIIlIIIIllll % llllllllllllIllIlIlllIIlIIIlIIII.length]));
            "".length();
            ++llllllllllllIllIlIlllIIlIIIIllll;
            ++llllllllllllIllIlIlllIIlIIIIIlll;
            "".length();
            if (" ".length() == "   ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlllIIlIIIlIIIl);
    }
}
