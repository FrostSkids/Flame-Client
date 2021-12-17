// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Input;
import org.newdawn.slick.BasicGame;

public class KeyRepeatTest extends BasicGame
{
    private /* synthetic */ Input input;
    private /* synthetic */ int count;
    private static final /* synthetic */ String[] lIllIlllIlIlII;
    private static final /* synthetic */ int[] lIllIlllIlIllI;
    
    private static String lIIIIIIIIIllIllI(final String llllllllllllIllllllIIllIllIIlllI, final String llllllllllllIllllllIIllIllIIllIl) {
        try {
            final SecretKeySpec llllllllllllIllllllIIllIllIlIIll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIllIllIIllIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllllIIllIllIlIIlI = Cipher.getInstance("Blowfish");
            llllllllllllIllllllIIllIllIlIIlI.init(KeyRepeatTest.lIllIlllIlIllI[4], llllllllllllIllllllIIllIllIlIIll);
            return new String(llllllllllllIllllllIIllIllIlIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIllIllIIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIllIllIlIIII) {
            llllllllllllIllllllIIllIllIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIIIIIIIllIlII(String llllllllllllIllllllIIllIlllIllII, final String llllllllllllIllllllIIllIllllIIlI) {
        llllllllllllIllllllIIllIlllIllII = (long)new String(Base64.getDecoder().decode(((String)llllllllllllIllllllIIllIlllIllII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllllIIllIllllIIIl = new StringBuilder();
        final char[] llllllllllllIllllllIIllIllllIIII = llllllllllllIllllllIIllIllllIIlI.toCharArray();
        int llllllllllllIllllllIIllIlllIlllI = KeyRepeatTest.lIllIlllIlIllI[0];
        final int llllllllllllIllllllIIllIlllIIlII = (Object)((String)llllllllllllIllllllIIllIlllIllII).toCharArray();
        final String llllllllllllIllllllIIllIlllIIIlI = (String)llllllllllllIllllllIIllIlllIIlII.length;
        String llllllllllllIllllllIIllIlllIIIIl = (String)KeyRepeatTest.lIllIlllIlIllI[0];
        while (lIIIIIIIIlIIIlII((int)llllllllllllIllllllIIllIlllIIIIl, (int)llllllllllllIllllllIIllIlllIIIlI)) {
            final char llllllllllllIllllllIIllIllllIlIl = llllllllllllIllllllIIllIlllIIlII[llllllllllllIllllllIIllIlllIIIIl];
            llllllllllllIllllllIIllIllllIIIl.append((char)(llllllllllllIllllllIIllIllllIlIl ^ llllllllllllIllllllIIllIllllIIII[llllllllllllIllllllIIllIlllIlllI % llllllllllllIllllllIIllIllllIIII.length]));
            "".length();
            ++llllllllllllIllllllIIllIlllIlllI;
            ++llllllllllllIllllllIIllIlllIIIIl;
            "".length();
            if ("   ".length() <= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllllIIllIllllIIIl);
    }
    
    private static String lIIIIIIIIIllIlIl(final String llllllllllllIllllllIIllIlIllIlII, final String llllllllllllIllllllIIllIlIllIIll) {
        try {
            final SecretKeySpec llllllllllllIllllllIIllIlIlllIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllllIIllIlIllIIll.getBytes(StandardCharsets.UTF_8)), KeyRepeatTest.lIllIlllIlIllI[10]), "DES");
            final Cipher llllllllllllIllllllIIllIlIlllIII = Cipher.getInstance("DES");
            llllllllllllIllllllIIllIlIlllIII.init(KeyRepeatTest.lIllIlllIlIllI[4], llllllllllllIllllllIIllIlIlllIlI);
            return new String(llllllllllllIllllllIIllIlIlllIII.doFinal(Base64.getDecoder().decode(llllllllllllIllllllIIllIlIllIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllllIIllIlIllIlll) {
            llllllllllllIllllllIIllIlIllIlll.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIIIIIlIIIIIl() {
        (lIllIlllIlIllI = new int[11])[0] = ((0x86 ^ 0xA9 ^ (0x4F ^ 0x26)) & (0x32 ^ 0x34 ^ (0x19 ^ 0x59) ^ -" ".length()));
        KeyRepeatTest.lIllIlllIlIllI[1] = (-(0xFFFFDFEB & 0x30D7) & (0xFFFF91FE & 0x7FEF));
        KeyRepeatTest.lIllIlllIlIllI[2] = (0xE3 ^ 0x87);
        KeyRepeatTest.lIllIlllIlIllI[3] = " ".length();
        KeyRepeatTest.lIllIlllIlIllI[4] = "  ".length();
        KeyRepeatTest.lIllIlllIlIllI[5] = "   ".length();
        KeyRepeatTest.lIllIlllIlIllI[6] = (0xFFFF8FFF & 0x7320);
        KeyRepeatTest.lIllIlllIlIllI[7] = (-(0xFFFFF55B & 0x3BAC) & (0xFFFFBB7F & 0x77DF));
        KeyRepeatTest.lIllIlllIlIllI[8] = (0x3D ^ 0x4);
        KeyRepeatTest.lIllIlllIlIllI[9] = (58 + 10 + 47 + 47 ^ 26 + 129 - 98 + 109);
        KeyRepeatTest.lIllIlllIlIllI[10] = (0x60 ^ 0x68);
    }
    
    private static boolean lIIIIIIIIlIIIlII(final int llllllllllllIllllllIIllIlIlIIIIl, final int llllllllllllIllllllIIllIlIIlllll) {
        return llllllllllllIllllllIIllIlIlIIIIl < llllllllllllIllllllIIllIlIIlllll;
    }
    
    static {
        lIIIIIIIIlIIIIIl();
        lIIIIIIIIIllIlll();
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllllllIIlllIIllIIlI) throws SlickException {
        this.input = llllllllllllIllllllIIlllIIllIIlI.getInput();
        this.input.enableKeyRepeat(KeyRepeatTest.lIllIlllIlIllI[1], KeyRepeatTest.lIllIlllIlIllI[2]);
    }
    
    private static void lIIIIIIIIIllIlll() {
        (lIllIlllIlIlII = new String[KeyRepeatTest.lIllIlllIlIllI[9]])[KeyRepeatTest.lIllIlllIlIllI[0]] = lIIIIIIIIIllIlII("HTMIFhAmMxAwITMlBQ==", "VVqDu");
        KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[3]] = lIIIIIIIIIllIlII("MzMAdzIKMwokQjs5DDkWQnY=", "xVyWb");
        KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[4]] = lIIIIIIIIIllIlIl("S5Ca0IKqEffRIo9l2gIJgJKU8PEVOO6DXaYI8jOHFGtgbm69kCDHww==", "lUhCT");
        KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[5]] = lIIIIIIIIIllIllI("vEOECXQySwh4M5V2fJF5InSsZ+G3V+v+", "WZMdI");
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllllllIIlllIIIIlIlI, final char llllllllllllIllllllIIlllIIIIlIII) {
        this.count += KeyRepeatTest.lIllIlllIlIllI[3];
        if (lIIIIIIIIlIIIIlI(llllllllllllIllllllIIlllIIIIlIlI, KeyRepeatTest.lIllIlllIlIllI[8])) {
            if (lIIIIIIIIlIIIIll(this.input.isKeyRepeatEnabled() ? 1 : 0)) {
                this.input.disableKeyRepeat();
                "".length();
                if ((0x7F ^ 0x7B) != (0x71 ^ 0x75)) {
                    return;
                }
            }
            else {
                this.input.enableKeyRepeat(KeyRepeatTest.lIllIlllIlIllI[1], KeyRepeatTest.lIllIlllIlIllI[2]);
            }
        }
    }
    
    public void render(final GameContainer llllllllllllIllllllIIlllIIlIllII, final Graphics llllllllllllIllllllIIlllIIlIlIII) {
        llllllllllllIllllllIIlllIIlIlIII.drawString(String.valueOf(new StringBuilder().append(KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[3]]).append(this.count)), 100.0f, 100.0f);
        llllllllllllIllllllIIlllIIlIlIII.drawString(KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[4]], 100.0f, 150.0f);
        llllllllllllIllllllIIlllIIlIlIII.drawString(String.valueOf(new StringBuilder().append(KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[5]]).append(this.input.isKeyRepeatEnabled())), 100.0f, 200.0f);
    }
    
    public static void main(final String[] llllllllllllIllllllIIlllIIIlIlll) {
        try {
            final AppGameContainer llllllllllllIllllllIIlllIIIllIll = new AppGameContainer(new KeyRepeatTest());
            llllllllllllIllllllIIlllIIIllIll.setDisplayMode(KeyRepeatTest.lIllIlllIlIllI[6], KeyRepeatTest.lIllIlllIlIllI[7], (boolean)(KeyRepeatTest.lIllIlllIlIllI[0] != 0));
            llllllllllllIllllllIIlllIIIllIll.start();
            "".length();
            if (((0x6D ^ 0x2D) & ~(0x40 ^ 0x0)) >= (0x77 ^ 0x73)) {
                return;
            }
        }
        catch (SlickException llllllllllllIllllllIIlllIIIllIIl) {
            llllllllllllIllllllIIlllIIIllIIl.printStackTrace();
        }
    }
    
    private static boolean lIIIIIIIIlIIIIlI(final int llllllllllllIllllllIIllIlIlIlIII, final int llllllllllllIllllllIIllIlIlIIlll) {
        return llllllllllllIllllllIIllIlIlIlIII == llllllllllllIllllllIIllIlIlIIlll;
    }
    
    private static boolean lIIIIIIIIlIIIIll(final int llllllllllllIllllllIIllIlIIllIlI) {
        return llllllllllllIllllllIIllIlIIllIlI != 0;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllllllIIlllIIlIIlII, final int llllllllllllIllllllIIlllIIlIIIlI) {
    }
    
    public KeyRepeatTest() {
        super(KeyRepeatTest.lIllIlllIlIlII[KeyRepeatTest.lIllIlllIlIllI[0]]);
    }
}
