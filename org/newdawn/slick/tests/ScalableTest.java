// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import org.newdawn.slick.Game;
import org.newdawn.slick.ScalableGame;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.BasicGame;

public class ScalableTest extends BasicGame
{
    private static final /* synthetic */ int[] lIIIllIlIIllll;
    private static final /* synthetic */ String[] lIIIllIlIIlllI;
    
    private static void llIIIlIIIllIlII() {
        (lIIIllIlIIllll = new int[8])[0] = ((0xA8 ^ 0x8D) & ~(0x65 ^ 0x40));
        ScalableTest.lIIIllIlIIllll[1] = " ".length();
        ScalableTest.lIIIllIlIIllll[2] = (0x28 ^ 0x4D ^ (0x6B ^ 0x4));
        ScalableTest.lIIIllIlIIllll[3] = (-(0xFFFFB77D & 0x59FF) & (0xFFFFDD7D & 0x37FE));
        ScalableTest.lIIIllIlIIllll[4] = (0xFFFF92FD & 0x6F3A);
        ScalableTest.lIIIllIlIIllll[5] = (0xFFFFD325 & 0x2FFA);
        ScalableTest.lIIIllIlIIllll[6] = (-(0xFFFFA9A3 & 0x7F7F) & (0xFFFFEB7E & 0x3FFB));
        ScalableTest.lIIIllIlIIllll[7] = "  ".length();
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIIIIIIIlIIIllIlII) throws SlickException {
    }
    
    private static void llIIIlIIIlIllll() {
        (lIIIllIlIIlllI = new String[ScalableTest.lIIIllIlIIllll[7]])[ScalableTest.lIIIllIlIIllll[0]] = llIIIlIIIlIlllI("JSQLDzUUKw9DABM0HkMSGTVKND0SIhkAJhMiBA==", "vGjcT");
        ScalableTest.lIIIllIlIIlllI[ScalableTest.lIIIllIlIIllll[1]] = llIIIlIIIlIlllI("RA==", "hSWYq");
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIIIIIIIlIIIllIIlI, final int lllllllllllllIlIIIIIIIlIIIllIIIl) throws SlickException {
    }
    
    private static String llIIIlIIIlIlllI(String lllllllllllllIlIIIIIIIlIIIIlIIlI, final String lllllllllllllIlIIIIIIIlIIIIlIllI) {
        lllllllllllllIlIIIIIIIlIIIIlIIlI = new String(Base64.getDecoder().decode(lllllllllllllIlIIIIIIIlIIIIlIIlI.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIIIIIIIlIIIIlIlIl = new StringBuilder();
        final char[] lllllllllllllIlIIIIIIIlIIIIlIlII = lllllllllllllIlIIIIIIIlIIIIlIllI.toCharArray();
        int lllllllllllllIlIIIIIIIlIIIIlIIll = ScalableTest.lIIIllIlIIllll[0];
        final byte lllllllllllllIlIIIIIIIlIIIIIllIl = (Object)lllllllllllllIlIIIIIIIlIIIIlIIlI.toCharArray();
        final Exception lllllllllllllIlIIIIIIIlIIIIIllII = (Exception)lllllllllllllIlIIIIIIIlIIIIIllIl.length;
        short lllllllllllllIlIIIIIIIlIIIIIlIll = (short)ScalableTest.lIIIllIlIIllll[0];
        while (llIIIlIIIllIlIl(lllllllllllllIlIIIIIIIlIIIIIlIll, (int)lllllllllllllIlIIIIIIIlIIIIIllII)) {
            final char lllllllllllllIlIIIIIIIlIIIIllIII = lllllllllllllIlIIIIIIIlIIIIIllIl[lllllllllllllIlIIIIIIIlIIIIIlIll];
            lllllllllllllIlIIIIIIIlIIIIlIlIl.append((char)(lllllllllllllIlIIIIIIIlIIIIllIII ^ lllllllllllllIlIIIIIIIlIIIIlIlII[lllllllllllllIlIIIIIIIlIIIIlIIll % lllllllllllllIlIIIIIIIlIIIIlIlII.length]));
            "".length();
            ++lllllllllllllIlIIIIIIIlIIIIlIIll;
            ++lllllllllllllIlIIIIIIIlIIIIIlIll;
            "".length();
            if (((0x69 ^ 0x49) & ~(0x4C ^ 0x6C)) != ((0x1D ^ 0x4B) & ~(0x70 ^ 0x26))) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIIIIIIIlIIIIlIlIl);
    }
    
    public static void main(final String[] lllllllllllllIlIIIIIIIlIIIlIIlII) {
        try {
            final ScalableGame lllllllllllllIlIIIIIIIlIIIlIIlll = new ScalableGame(new ScalableTest(), ScalableTest.lIIIllIlIIllll[3], ScalableTest.lIIIllIlIIllll[4], ScalableTest.lIIIllIlIIllll[1]) {
                private static final /* synthetic */ int[] lIlllllIIIllll;
                private static final /* synthetic */ String[] lIlllllIIIlllI;
                
                private static String lIIIIlIlIIlIIIll(String llllllllllllIllllIIlllIllIlIIlII, final String llllllllllllIllllIIlllIllIlIIIll) {
                    llllllllllllIllllIIlllIllIlIIlII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIlllIllIlIIlII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
                    final StringBuilder llllllllllllIllllIIlllIllIlIIlll = new StringBuilder();
                    final char[] llllllllllllIllllIIlllIllIlIIllI = llllllllllllIllllIIlllIllIlIIIll.toCharArray();
                    int llllllllllllIllllIIlllIllIlIIlIl = ScalableTest$1.lIlllllIIIllll[0];
                    final float llllllllllllIllllIIlllIllIIlllll = (Object)((String)llllllllllllIllllIIlllIllIlIIlII).toCharArray();
                    final String llllllllllllIllllIIlllIllIIllllI = (String)llllllllllllIllllIIlllIllIIlllll.length;
                    long llllllllllllIllllIIlllIllIIlllIl = ScalableTest$1.lIlllllIIIllll[0];
                    while (lIIIIlIlIIlIlIII((int)llllllllllllIllllIIlllIllIIlllIl, (int)llllllllllllIllllIIlllIllIIllllI)) {
                        final char llllllllllllIllllIIlllIllIlIlIlI = llllllllllllIllllIIlllIllIIlllll[llllllllllllIllllIIlllIllIIlllIl];
                        llllllllllllIllllIIlllIllIlIIlll.append((char)(llllllllllllIllllIIlllIllIlIlIlI ^ llllllllllllIllllIIlllIllIlIIllI[llllllllllllIllllIIlllIllIlIIlIl % llllllllllllIllllIIlllIllIlIIllI.length]));
                        "".length();
                        ++llllllllllllIllllIIlllIllIlIIlIl;
                        ++llllllllllllIllllIIlllIllIIlllIl;
                        "".length();
                        if (" ".length() > " ".length()) {
                            return null;
                        }
                    }
                    return String.valueOf(llllllllllllIllllIIlllIllIlIIlll);
                }
                
                private static void lIIIIlIlIIlIIlIl() {
                    (lIlllllIIIlllI = new String[ScalableTest$1.lIlllllIIIllll[2]])[ScalableTest$1.lIlllllIIIllll[0]] = lIIIIlIlIIlIIIll("PxklEhMUCXE1EhVMFgAXFQ==", "plQaz");
                    ScalableTest$1.lIlllllIIIlllI[ScalableTest$1.lIlllllIIIllll[1]] = lIIIIlIlIIlIIlII("6maZ7aTsjGE=", "shCSn");
                }
                
                private static String lIIIIlIlIIlIIlII(final String llllllllllllIllllIIlllIllIllIlll, final String llllllllllllIllllIIlllIllIlllIII) {
                    try {
                        final SecretKeySpec llllllllllllIllllIIlllIllIllllII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIlllIllIlllIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
                        final Cipher llllllllllllIllllIIlllIllIlllIll = Cipher.getInstance("Blowfish");
                        llllllllllllIllllIIlllIllIlllIll.init(ScalableTest$1.lIlllllIIIllll[2], llllllllllllIllllIIlllIllIllllII);
                        return new String(llllllllllllIllllIIlllIllIlllIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIlllIllIllIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                    }
                    catch (Exception llllllllllllIllllIIlllIllIlllIlI) {
                        llllllllllllIllllIIlllIllIlllIlI.printStackTrace();
                        return null;
                    }
                }
                
                @Override
                protected void renderOverlay(final GameContainer llllllllllllIllllIIlllIlllIIIIlI, final Graphics llllllllllllIllllIIlllIlllIIIIIl) {
                    llllllllllllIllllIIlllIlllIIIIIl.setColor(Color.white);
                    llllllllllllIllllIIlllIlllIIIIIl.drawString(ScalableTest$1.lIlllllIIIlllI[ScalableTest$1.lIlllllIIIllll[0]], 350.0f, 10.0f);
                    llllllllllllIllllIIlllIlllIIIIIl.drawString(String.valueOf(new StringBuilder().append(llllllllllllIllllIIlllIlllIIIIlI.getInput().getMouseX()).append(ScalableTest$1.lIlllllIIIlllI[ScalableTest$1.lIlllllIIIllll[1]]).append(llllllllllllIllllIIlllIlllIIIIlI.getInput().getMouseY())), 400.0f, 20.0f);
                }
                
                static {
                    lIIIIlIlIIlIIlll();
                    lIIIIlIlIIlIIlIl();
                }
                
                private static boolean lIIIIlIlIIlIlIII(final int llllllllllllIllllIIlllIllIIllIIl, final int llllllllllllIllllIIlllIllIIllIII) {
                    return llllllllllllIllllIIlllIllIIllIIl < llllllllllllIllllIIlllIllIIllIII;
                }
                
                private static void lIIIIlIlIIlIIlll() {
                    (lIlllllIIIllll = new int[3])[0] = ((0x78 ^ 0x28) & ~(0x77 ^ 0x27));
                    ScalableTest$1.lIlllllIIIllll[1] = " ".length();
                    ScalableTest$1.lIlllllIIIllll[2] = "  ".length();
                }
            };
            final AppGameContainer lllllllllllllIlIIIIIIIlIIIlIIllI = new AppGameContainer(lllllllllllllIlIIIIIIIlIIIlIIlll);
            lllllllllllllIlIIIIIIIlIIIlIIllI.setDisplayMode(ScalableTest.lIIIllIlIIllll[5], ScalableTest.lIIIllIlIIllll[6], (boolean)(ScalableTest.lIIIllIlIIllll[0] != 0));
            lllllllllllllIlIIIIIIIlIIIlIIllI.start();
            "".length();
            if ("   ".length() < ((0x36 ^ 0x7A) & ~(0x4 ^ 0x48))) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIIIIIIIlIIIlIIlIl) {
            lllllllllllllIlIIIIIIIlIIIlIIlIl.printStackTrace();
        }
    }
    
    private static boolean llIIIlIIIllIlIl(final int lllllllllllllIlIIIIIIIlIIIIIIlll, final int lllllllllllllIlIIIIIIIlIIIIIIllI) {
        return lllllllllllllIlIIIIIIIlIIIIIIlll < lllllllllllllIlIIIIIIIlIIIIIIllI;
    }
    
    static {
        llIIIlIIIllIlII();
        llIIIlIIIlIllll();
    }
    
    public ScalableTest() {
        super(ScalableTest.lIIIllIlIIlllI[ScalableTest.lIIIllIlIIllll[0]]);
    }
    
    public void render(final GameContainer lllllllllllllIlIIIIIIIlIIIlIlIll, final Graphics lllllllllllllIlIIIIIIIlIIIlIllII) throws SlickException {
        lllllllllllllIlIIIIIIIlIIIlIllII.setColor(new Color(0.4f, 0.6f, 0.8f));
        lllllllllllllIlIIIIIIIlIIIlIllII.fillRect(0.0f, 0.0f, 1024.0f, 568.0f);
        lllllllllllllIlIIIIIIIlIIIlIllII.setColor(Color.white);
        lllllllllllllIlIIIIIIIlIIIlIllII.drawRect(5.0f, 5.0f, 1014.0f, 558.0f);
        lllllllllllllIlIIIIIIIlIIIlIllII.setColor(Color.white);
        lllllllllllllIlIIIIIIIlIIIlIllII.drawString(String.valueOf(new StringBuilder().append(lllllllllllllIlIIIIIIIlIIIlIlIll.getInput().getMouseX()).append(ScalableTest.lIIIllIlIIlllI[ScalableTest.lIIIllIlIIllll[1]]).append(lllllllllllllIlIIIIIIIlIIIlIlIll.getInput().getMouseY())), 10.0f, 400.0f);
        lllllllllllllIlIIIIIIIlIIIlIllII.setColor(Color.red);
        lllllllllllllIlIIIIIIIlIIIlIllII.fillOval((float)(lllllllllllllIlIIIIIIIlIIIlIlIll.getInput().getMouseX() - ScalableTest.lIIIllIlIIllll[2]), (float)(lllllllllllllIlIIIIIIIlIIIlIlIll.getInput().getMouseY() - ScalableTest.lIIIllIlIIllll[2]), 20.0f, 20.0f);
    }
}
