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
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class AlphaMapTest extends BasicGame
{
    private /* synthetic */ Image alphaMap;
    private /* synthetic */ Image textureMap;
    private static final /* synthetic */ String[] llIlllllIlIIlI;
    private static final /* synthetic */ int[] llIlllllllIIlI;
    
    public static void main(final String[] llllllllllllIllIIIlIlIIllllIIlll) {
        try {
            final AppGameContainer llllllllllllIllIIIlIlIIllllIlIIl = new AppGameContainer(new AlphaMapTest());
            llllllllllllIllIIIlIlIIllllIlIIl.setDisplayMode(AlphaMapTest.llIlllllllIIlI[3], AlphaMapTest.llIlllllllIIlI[4], (boolean)(AlphaMapTest.llIlllllllIIlI[0] != 0));
            llllllllllllIllIIIlIlIIllllIlIIl.start();
            "".length();
            if (((67 + 26 + 7 + 123 ^ 144 + 84 - 84 + 48) & (117 + 174 - 286 + 174 ^ 46 + 129 - 150 + 147 ^ -" ".length())) != 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIlIlIIllllIlIII) {
            llllllllllllIllIIIlIlIIllllIlIII.printStackTrace();
        }
    }
    
    private static void lIIllIllIIlIllll() {
        (llIlllllIlIIlI = new String[AlphaMapTest.llIlllllllIIlI[5]])[AlphaMapTest.llIlllllllIIlI[0]] = lIIllIllIIlIllIl("cPKXEruRNcD0n/RirWNzew==", "JXQPx");
        AlphaMapTest.llIlllllIlIIlI[AlphaMapTest.llIlllllllIIlI[1]] = lIIllIllIIlIllIl("1PwccFRurQimePbQq/9kP+8TmleUirin", "rQUXe");
        AlphaMapTest.llIlllllIlIIlI[AlphaMapTest.llIlllllllIIlI[2]] = lIIllIllIIlIlllI("DCoJFSYZOxtOJQouCRJsCCEd", "xOzaB");
    }
    
    public void render(final GameContainer llllllllllllIllIIIlIlIIlllllIIIl, final Graphics llllllllllllIllIIIlIlIIllllIlllI) throws SlickException {
        llllllllllllIllIIIlIlIIllllIlllI.clearAlphaMap();
        llllllllllllIllIIIlIlIIllllIlllI.setDrawMode(Graphics.MODE_NORMAL);
        this.textureMap.draw(10.0f, 50.0f);
        llllllllllllIllIIIlIlIIllllIlllI.setColor(Color.red);
        llllllllllllIllIIIlIlIIllllIlllI.fillRect(290.0f, 40.0f, 200.0f, 200.0f);
        llllllllllllIllIIIlIlIIllllIlllI.setColor(Color.white);
        llllllllllllIllIIIlIlIIllllIlllI.setDrawMode(Graphics.MODE_ALPHA_MAP);
        this.alphaMap.draw(300.0f, 50.0f);
        llllllllllllIllIIIlIlIIllllIlllI.setDrawMode(Graphics.MODE_ALPHA_BLEND);
        this.textureMap.draw(300.0f, 50.0f);
        llllllllllllIllIIIlIlIIllllIlllI.setDrawMode(Graphics.MODE_NORMAL);
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIIIlIlIIllllIllII, final char llllllllllllIllIIIlIlIIllllIlIll) {
    }
    
    private static boolean lIIllIlllIIlIIII(final int llllllllllllIllIIIlIlIIllIlllllI, final int llllllllllllIllIIIlIlIIllIllllIl) {
        return llllllllllllIllIIIlIlIIllIlllllI < llllllllllllIllIIIlIlIIllIllllIl;
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIIIlIlIIllllllIlI) throws SlickException {
        this.alphaMap = new Image(AlphaMapTest.llIlllllIlIIlI[AlphaMapTest.llIlllllllIIlI[1]]);
        this.textureMap = new Image(AlphaMapTest.llIlllllIlIIlI[AlphaMapTest.llIlllllllIIlI[2]]);
        llllllllllllIllIIIlIlIIllllllIlI.getGraphics().setBackground(Color.black);
    }
    
    private static String lIIllIllIIlIllIl(final String llllllllllllIllIIIlIlIIlllIllllI, final String llllllllllllIllIIIlIlIIlllIllIll) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlIIllllIIIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlIIlllIllIll.getBytes(StandardCharsets.UTF_8)), AlphaMapTest.llIlllllllIIlI[6]), "DES");
            final Cipher llllllllllllIllIIIlIlIIllllIIIII = Cipher.getInstance("DES");
            llllllllllllIllIIIlIlIIllllIIIII.init(AlphaMapTest.llIlllllllIIlI[2], llllllllllllIllIIIlIlIIllllIIIIl);
            return new String(llllllllllllIllIIIlIlIIllllIIIII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlIIlllIllllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlIIlllIlllll) {
            llllllllllllIllIIIlIlIIlllIlllll.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIIIlIlIIlllllIllI, final int llllllllllllIllIIIlIlIIlllllIlIl) throws SlickException {
    }
    
    static {
        lIIllIlllIIIllll();
        lIIllIllIIlIllll();
    }
    
    public AlphaMapTest() {
        super(AlphaMapTest.llIlllllIlIIlI[AlphaMapTest.llIlllllllIIlI[0]]);
    }
    
    private static void lIIllIlllIIIllll() {
        (llIlllllllIIlI = new int[7])[0] = ((0xFD ^ 0xB6 ^ (0x6E ^ 0x74)) & (0x44 ^ 0x12 ^ (0xBC ^ 0xBB) ^ -" ".length()));
        AlphaMapTest.llIlllllllIIlI[1] = " ".length();
        AlphaMapTest.llIlllllllIIlI[2] = "  ".length();
        AlphaMapTest.llIlllllllIIlI[3] = (0xFFFFDFA9 & 0x2376);
        AlphaMapTest.llIlllllllIIlI[4] = (0xFFFFE3DC & 0x1E7B);
        AlphaMapTest.llIlllllllIIlI[5] = "   ".length();
        AlphaMapTest.llIlllllllIIlI[6] = (0x11 ^ 0x19);
    }
    
    private static String lIIllIllIIlIlllI(String llllllllllllIllIIIlIlIIlllIIlIIl, final String llllllllllllIllIIIlIlIIlllIIllIl) {
        llllllllllllIllIIIlIlIIlllIIlIIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIlIlIIlllIIlIIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIlIIlllIIllII = new StringBuilder();
        final char[] llllllllllllIllIIIlIlIIlllIIlIll = llllllllllllIllIIIlIlIIlllIIllIl.toCharArray();
        int llllllllllllIllIIIlIlIIlllIIlIlI = AlphaMapTest.llIlllllllIIlI[0];
        final short llllllllllllIllIIIlIlIIlllIIIlII = (Object)llllllllllllIllIIIlIlIIlllIIlIIl.toCharArray();
        final short llllllllllllIllIIIlIlIIlllIIIIll = (short)llllllllllllIllIIIlIlIIlllIIIlII.length;
        short llllllllllllIllIIIlIlIIlllIIIIlI = (short)AlphaMapTest.llIlllllllIIlI[0];
        while (lIIllIlllIIlIIII(llllllllllllIllIIIlIlIIlllIIIIlI, llllllllllllIllIIIlIlIIlllIIIIll)) {
            final char llllllllllllIllIIIlIlIIlllIIllll = llllllllllllIllIIIlIlIIlllIIIlII[llllllllllllIllIIIlIlIIlllIIIIlI];
            llllllllllllIllIIIlIlIIlllIIllII.append((char)(llllllllllllIllIIIlIlIIlllIIllll ^ llllllllllllIllIIIlIlIIlllIIlIll[llllllllllllIllIIIlIlIIlllIIlIlI % llllllllllllIllIIIlIlIIlllIIlIll.length]));
            "".length();
            ++llllllllllllIllIIIlIlIIlllIIlIlI;
            ++llllllllllllIllIIIlIlIIlllIIIIlI;
            "".length();
            if ((51 + 54 + 1 + 26 ^ 66 + 115 - 160 + 108) == 0x0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIlIIlllIIllII);
    }
}
