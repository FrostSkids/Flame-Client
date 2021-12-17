// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.SpriteSheetFont;
import org.newdawn.slick.SpriteSheet;
import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.util.Log;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Font;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.BasicGame;

public class SpriteSheetFontTest extends BasicGame
{
    private static final /* synthetic */ String[] llIlIlIIllIlll;
    private static /* synthetic */ AppGameContainer container;
    private static final /* synthetic */ int[] llIlIlIIlllllI;
    private /* synthetic */ Font font;
    
    static {
        lIIlIlIIIIIllllI();
        lIIlIlIIIIIllIII();
    }
    
    private static String lIIlIlIIIIIlIlll(final String llllllllllllIllIlIlIlIIlIllIlllI, final String llllllllllllIllIlIlIlIIlIllIllll) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIIlIlllIIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIIlIllIllll.getBytes(StandardCharsets.UTF_8)), SpriteSheetFontTest.llIlIlIIlllllI[11]), "DES");
            final Cipher llllllllllllIllIlIlIlIIlIlllIIlI = Cipher.getInstance("DES");
            llllllllllllIllIlIlIlIIlIlllIIlI.init(SpriteSheetFontTest.llIlIlIIlllllI[3], llllllllllllIllIlIlIlIIlIlllIIll);
            return new String(llllllllllllIllIlIlIlIIlIlllIIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIIlIllIlllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIIlIlllIIIl) {
            llllllllllllIllIlIlIlIIlIlllIIIl.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllIlIlIlIIllIlIIlII, final char llllllllllllIllIlIlIlIIllIlIIIll) {
        if (lIIlIlIIIIIlllll(llllllllllllIllIlIlIlIIllIlIIlII, SpriteSheetFontTest.llIlIlIIlllllI[1])) {
            System.exit(SpriteSheetFontTest.llIlIlIIlllllI[0]);
        }
        if (lIIlIlIIIIIlllll(llllllllllllIllIlIlIlIIllIlIIlII, SpriteSheetFontTest.llIlIlIIlllllI[5])) {
            try {
                SpriteSheetFontTest.container.setDisplayMode(SpriteSheetFontTest.llIlIlIIlllllI[6], SpriteSheetFontTest.llIlIlIIlllllI[7], (boolean)(SpriteSheetFontTest.llIlIlIIlllllI[0] != 0));
                "".length();
                if (((0x40 ^ 0x6 ^ (0x78 ^ 0xB)) & (0xE1 ^ 0x94 ^ (0x77 ^ 0x37) ^ -" ".length())) != 0x0) {
                    return;
                }
            }
            catch (SlickException llllllllllllIllIlIlIlIIllIlIIllI) {
                Log.error(llllllllllllIllIlIlIlIIllIlIIllI);
            }
        }
    }
    
    private static void lIIlIlIIIIIllllI() {
        (llIlIlIIlllllI = new int[12])[0] = ((0x5C ^ 0x79) & ~(0xB1 ^ 0x94));
        SpriteSheetFontTest.llIlIlIIlllllI[1] = " ".length();
        SpriteSheetFontTest.llIlIlIIlllllI[2] = (1 + 51 + 35 + 53 ^ 43 + 48 + 28 + 53);
        SpriteSheetFontTest.llIlIlIIlllllI[3] = "  ".length();
        SpriteSheetFontTest.llIlIlIIlllllI[4] = "   ".length();
        SpriteSheetFontTest.llIlIlIIlllllI[5] = (0xF ^ 0x36);
        SpriteSheetFontTest.llIlIlIIlllllI[6] = (-(0xFFFFBBFF & 0x7D0A) & (0xFFFFBFE9 & 0x7B9F));
        SpriteSheetFontTest.llIlIlIIlllllI[7] = (-(0xFFFF9EE8 & 0x7F37) & (0xFFFF9FFF & 0x7FFF));
        SpriteSheetFontTest.llIlIlIIlllllI[8] = (0xFFFF8FA9 & 0x7376);
        SpriteSheetFontTest.llIlIlIIlllllI[9] = (0xFFFFB7DF & 0x4A78);
        SpriteSheetFontTest.llIlIlIIlllllI[10] = (0x5 ^ 0x1);
        SpriteSheetFontTest.llIlIlIIlllllI[11] = (0x1D ^ 0x15);
    }
    
    private static String lIIlIlIIIIIlIlIl(String llllllllllllIllIlIlIlIIllIIIIIII, final String llllllllllllIllIlIlIlIIlIlllllll) {
        llllllllllllIllIlIlIlIIllIIIIIII = (int)new String(Base64.getDecoder().decode(((String)llllllllllllIllIlIlIlIIllIIIIIII).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIlIlIlIIllIIIIIll = new StringBuilder();
        final char[] llllllllllllIllIlIlIlIIllIIIIIlI = llllllllllllIllIlIlIlIIlIlllllll.toCharArray();
        int llllllllllllIllIlIlIlIIllIIIIIIl = SpriteSheetFontTest.llIlIlIIlllllI[0];
        final char llllllllllllIllIlIlIlIIlIllllIll = (Object)((String)llllllllllllIllIlIlIlIIllIIIIIII).toCharArray();
        final float llllllllllllIllIlIlIlIIlIllllIlI = llllllllllllIllIlIlIlIIlIllllIll.length;
        double llllllllllllIllIlIlIlIIlIllllIIl = SpriteSheetFontTest.llIlIlIIlllllI[0];
        while (lIIlIlIIIIlIIIII((int)llllllllllllIllIlIlIlIIlIllllIIl, (int)llllllllllllIllIlIlIlIIlIllllIlI)) {
            final char llllllllllllIllIlIlIlIIllIIIIllI = llllllllllllIllIlIlIlIIlIllllIll[llllllllllllIllIlIlIlIIlIllllIIl];
            llllllllllllIllIlIlIlIIllIIIIIll.append((char)(llllllllllllIllIlIlIlIIllIIIIllI ^ llllllllllllIllIlIlIlIIllIIIIIlI[llllllllllllIllIlIlIlIIllIIIIIIl % llllllllllllIllIlIlIlIIllIIIIIlI.length]));
            "".length();
            ++llllllllllllIllIlIlIlIIllIIIIIIl;
            ++llllllllllllIllIlIlIlIIlIllllIIl;
            "".length();
            if (-"   ".length() >= 0) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIlIlIlIIllIIIIIll);
    }
    
    public SpriteSheetFontTest() {
        super(SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[0]]);
    }
    
    public void render(final GameContainer llllllllllllIllIlIlIlIIllIlIllll, final Graphics llllllllllllIllIlIlIlIIllIlIllII) {
        llllllllllllIllIlIlIlIIllIlIllII.setBackground(Color.gray);
        this.font.drawString(80.0f, 5.0f, SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[3]], Color.red);
        this.font.drawString(100.0f, 50.0f, SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[4]]);
    }
    
    private static boolean lIIlIlIIIIlIIIII(final int llllllllllllIllIlIlIlIIlIllIIlII, final int llllllllllllIllIlIlIlIIlIllIIIll) {
        return llllllllllllIllIlIlIlIIlIllIIlII < llllllllllllIllIlIlIlIIlIllIIIll;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllIlIlIlIIllIlIlIlI, final int llllllllllllIllIlIlIlIIllIlIlIIl) throws SlickException {
    }
    
    private static String lIIlIlIIIIIlIllI(final String llllllllllllIllIlIlIlIIllIIlIIll, final String llllllllllllIllIlIlIlIIllIIlIlII) {
        try {
            final SecretKeySpec llllllllllllIllIlIlIlIIllIIllIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIlIlIlIIllIIlIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIlIlIlIIllIIlIlll = Cipher.getInstance("Blowfish");
            llllllllllllIllIlIlIlIIllIIlIlll.init(SpriteSheetFontTest.llIlIlIIlllllI[3], llllllllllllIllIlIlIlIIllIIllIII);
            return new String(llllllllllllIllIlIlIlIIllIIlIlll.doFinal(Base64.getDecoder().decode(llllllllllllIllIlIlIlIIllIIlIIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIlIlIlIIllIIlIllI) {
            llllllllllllIllIlIlIlIIllIIlIllI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIlIlIlIIllIllIllI) throws SlickException {
        final SpriteSheet llllllllllllIllIlIlIlIIllIllIlIl = new SpriteSheet(SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[1]], SpriteSheetFontTest.llIlIlIIlllllI[2], SpriteSheetFontTest.llIlIlIIlllllI[2]);
        this.font = new SpriteSheetFont(llllllllllllIllIlIlIlIIllIllIlIl, (char)SpriteSheetFontTest.llIlIlIIlllllI[2]);
    }
    
    private static void lIIlIlIIIIIllIII() {
        (llIlIlIIllIlll = new String[SpriteSheetFontTest.llIlIlIIlllllI[10]])[SpriteSheetFontTest.llIlIlIIlllllI[0]] = lIIlIlIIIIIlIlIl("OD41HR4OHS8RDx8IKBoeSxoiBx4=", "kNGtj");
        SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[1]] = lIIlIlIIIIIlIllI("A89PMhD9hFeAQIeTpwWiVKKWAy9yzcNI8kG50ISgNSM=", "UftcE");
        SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[3]] = lIIlIlIIIIIlIlll("4K1T5zXhvOFLdDAUGu2VLg==", "CZROB");
        SpriteSheetFontTest.llIlIlIIllIlll[SpriteSheetFontTest.llIlIlIIlllllI[4]] = lIIlIlIIIIIlIllI("GH4sQd1CijBdJroyVLOxTd47ORA8k/Uo", "xcnDh");
    }
    
    private static boolean lIIlIlIIIIIlllll(final int llllllllllllIllIlIlIlIIlIllIlIII, final int llllllllllllIllIlIlIlIIlIllIIlll) {
        return llllllllllllIllIlIlIlIIlIllIlIII == llllllllllllIllIlIlIlIIlIllIIlll;
    }
    
    public static void main(final String[] llllllllllllIllIlIlIlIIllIIllllI) {
        try {
            (SpriteSheetFontTest.container = new AppGameContainer(new SpriteSheetFontTest())).setDisplayMode(SpriteSheetFontTest.llIlIlIIlllllI[8], SpriteSheetFontTest.llIlIlIIlllllI[9], (boolean)(SpriteSheetFontTest.llIlIlIIlllllI[0] != 0));
            SpriteSheetFontTest.container.start();
            "".length();
            if ((0xBE ^ 0x91 ^ (0x41 ^ 0x6B)) == 0x0) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIlIlIlIIllIIlllll) {
            llllllllllllIllIlIlIlIIllIIlllll.printStackTrace();
        }
    }
}
