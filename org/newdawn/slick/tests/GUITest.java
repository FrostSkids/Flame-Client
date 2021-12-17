// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.util.Log;
import org.newdawn.slick.Game;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.gui.GUIContext;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.gui.AbstractComponent;
import org.newdawn.slick.Font;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.gui.MouseOverArea;
import org.newdawn.slick.Image;
import org.newdawn.slick.gui.TextField;
import org.newdawn.slick.gui.ComponentListener;
import org.newdawn.slick.BasicGame;

public class GUITest extends BasicGame implements ComponentListener
{
    private /* synthetic */ TextField field;
    private static final /* synthetic */ int[] lllllIllllIlI;
    private /* synthetic */ Image image;
    private /* synthetic */ MouseOverArea[] areas;
    private static final /* synthetic */ String[] lllllIllIllIl;
    private /* synthetic */ String message;
    private /* synthetic */ Image background;
    private /* synthetic */ GameContainer container;
    private /* synthetic */ AppGameContainer app;
    private /* synthetic */ TextField field2;
    private /* synthetic */ Font font;
    
    private static boolean lIlIllllIllIIlI(final Object lllllllllllllIlIlIllIIIIllllIlIl, final Object lllllllllllllIlIlIllIIIIllllIlII) {
        return lllllllllllllIlIlIllIIIIllllIlIl == lllllllllllllIlIlIllIIIIllllIlII;
    }
    
    public void componentActivated(final AbstractComponent lllllllllllllIlIlIllIIIlIlIIIIIl) {
        System.out.println(String.valueOf(new StringBuilder().append(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[23]]).append(lllllllllllllIlIlIllIIIlIlIIIIIl)));
        int lllllllllllllIlIlIllIIIlIlIIIlIl = GUITest.lllllIllllIlI[0];
        while (lIlIllllIlIllll(lllllllllllllIlIlIllIIIlIlIIIlIl, GUITest.lllllIllllIlI[1])) {
            if (lIlIllllIllIIlI(lllllllllllllIlIlIllIIIlIlIIIIIl, this.areas[lllllllllllllIlIlIllIIIlIlIIIlIl])) {
                this.message = String.valueOf(new StringBuilder().append(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[24]]).append(lllllllllllllIlIlIllIIIlIlIIIlIl + GUITest.lllllIllllIlI[2]).append(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[25]]));
            }
            ++lllllllllllllIlIlIllIIIlIlIIIlIl;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
        if (lIlIllllIllIIlI(lllllllllllllIlIlIllIIIlIlIIIIIl, this.field2)) {}
    }
    
    @Override
    public void init(final GameContainer lllllllllllllIlIlIllIIIlIllIlIlI) throws SlickException {
        if (lIlIllllIlIlllI((lllllllllllllIlIlIllIIIlIllIlIlI instanceof AppGameContainer) ? 1 : 0)) {
            this.app = (AppGameContainer)lllllllllllllIlIlIllIIIlIllIlIlI;
            this.app.setIcon(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[3]]);
        }
        this.font = new AngelCodeFont(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[4]], GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[1]]);
        this.field = new TextField(lllllllllllllIlIlIllIIIlIllIlIlI, this.font, GUITest.lllllIllllIlI[5], GUITest.lllllIllllIlI[6], GUITest.lllllIllllIlI[7], GUITest.lllllIllllIlI[8], new ComponentListener() {
            private static final /* synthetic */ String[] lllIlIIlllllII;
            private static final /* synthetic */ int[] lllIlIIlllllll;
            
            private static void lIlIIIlIlIIllIII() {
                (lllIlIIlllllll = new int[4])[0] = ((0x6B ^ 0x63) & ~(0x1 ^ 0x9));
                GUITest$1.lllIlIIlllllll[1] = " ".length();
                GUITest$1.lllIlIIlllllll[2] = (0x61 ^ 0x74 ^ (0x79 ^ 0x64));
                GUITest$1.lllIlIIlllllll[3] = "  ".length();
            }
            
            private static String lIlIIIlIlIIlIllI(final String llllllllllllIlIllIlllIIIlIlIlIlI, final String llllllllllllIlIllIlllIIIlIlIlIIl) {
                try {
                    final SecretKeySpec llllllllllllIlIllIlllIIIlIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlIllIlllIIIlIlIlIIl.getBytes(StandardCharsets.UTF_8)), GUITest$1.lllIlIIlllllll[2]), "DES");
                    final Cipher llllllllllllIlIllIlllIIIlIlIlllI = Cipher.getInstance("DES");
                    llllllllllllIlIllIlllIIIlIlIlllI.init(GUITest$1.lllIlIIlllllll[3], llllllllllllIlIllIlllIIIlIlIllll);
                    return new String(llllllllllllIlIllIlllIIIlIlIlllI.doFinal(Base64.getDecoder().decode(llllllllllllIlIllIlllIIIlIlIlIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception llllllllllllIlIllIlllIIIlIlIllIl) {
                    llllllllllllIlIllIlllIIIlIlIllIl.printStackTrace();
                    return null;
                }
            }
            
            private static void lIlIIIlIlIIlIlll() {
                (lllIlIIlllllII = new String[GUITest$1.lllIlIIlllllll[1]])[GUITest$1.lllIlIIlllllll[0]] = lIlIIIlIlIIlIllI("ixrPI/vQksc7pxF9paxDgA==", "yhBAr");
            }
            
            public void componentActivated(final AbstractComponent llllllllllllIlIllIlllIIIlIllIlIl) {
                GUITest.this.message = String.valueOf(new StringBuilder().append(GUITest$1.lllIlIIlllllII[GUITest$1.lllIlIIlllllll[0]]).append(GUITest.this.field.getText()));
                "".length();
                GUITest.this.field2.setFocus((boolean)(GUITest$1.lllIlIIlllllll[1] != 0));
            }
            
            static {
                lIlIIIlIlIIllIII();
                lIlIIIlIlIIlIlll();
            }
        });
        this.field2 = new TextField(lllllllllllllIlIlIllIIIlIllIlIlI, this.font, GUITest.lllllIllllIlI[5], GUITest.lllllIllllIlI[9], GUITest.lllllIllllIlI[7], GUITest.lllllIllllIlI[8], new ComponentListener() {
            private static final /* synthetic */ String[] lIlIlIIIIIIIII;
            private static final /* synthetic */ int[] lIlIlIIIIIIIIl;
            
            private static String lllIlIlIIlIllll(final String lllllllllllllIIIlIllIIlllllIIIIl, final String lllllllllllllIIIlIllIIlllllIIIII) {
                try {
                    final SecretKeySpec lllllllllllllIIIlIllIIlllllIIllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIIlIllIIlllllIIIII.getBytes(StandardCharsets.UTF_8)), GUITest$2.lIlIlIIIIIIIIl[2]), "DES");
                    final Cipher lllllllllllllIIIlIllIIlllllIIlIl = Cipher.getInstance("DES");
                    lllllllllllllIIIlIllIIlllllIIlIl.init(GUITest$2.lIlIlIIIIIIIIl[3], lllllllllllllIIIlIllIIlllllIIllI);
                    return new String(lllllllllllllIIIlIllIIlllllIIlIl.doFinal(Base64.getDecoder().decode(lllllllllllllIIIlIllIIlllllIIIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                }
                catch (Exception lllllllllllllIIIlIllIIlllllIIlII) {
                    lllllllllllllIIIlIllIIlllllIIlII.printStackTrace();
                    return null;
                }
            }
            
            private static void lllIlIlIIlllIIl() {
                (lIlIlIIIIIIIIl = new int[4])[0] = ((0x5A ^ 0x8) & ~(0x11 ^ 0x43));
                GUITest$2.lIlIlIIIIIIIIl[1] = " ".length();
                GUITest$2.lIlIlIIIIIIIIl[2] = (0x7F ^ 0x26 ^ (0x54 ^ 0x5));
                GUITest$2.lIlIlIIIIIIIIl[3] = "  ".length();
            }
            
            private static void lllIlIlIIllIlIl() {
                (lIlIlIIIIIIIII = new String[GUITest$2.lIlIlIIIIIIIIl[1]])[GUITest$2.lIlIlIIIIIIIIl[0]] = lllIlIlIIlIllll("WqepOaiRLtC3cQU1L+X/7Q==", "gJaPP");
            }
            
            static {
                lllIlIlIIlllIIl();
                lllIlIlIIllIlIl();
            }
            
            public void componentActivated(final AbstractComponent lllllllllllllIIIlIllIIlllllIllII) {
                GUITest.this.message = String.valueOf(new StringBuilder().append(GUITest$2.lIlIlIIIIIIIII[GUITest$2.lIlIlIIIIIIIIl[0]]).append(GUITest.this.field2.getText()));
                "".length();
                GUITest.this.field.setFocus((boolean)(GUITest$2.lIlIlIIIIIIIIl[1] != 0));
            }
        });
        this.field2.setBorderColor(Color.red);
        this.container = lllllllllllllIlIlIllIIIlIllIlIlI;
        this.image = new Image(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[10]]);
        this.background = new Image(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[11]]);
        lllllllllllllIlIlIllIIIlIllIlIlI.setMouseCursor(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[12]], GUITest.lllllIllllIlI[0], GUITest.lllllIllllIlI[0]);
        int lllllllllllllIlIlIllIIIlIllIllII = GUITest.lllllIllllIlI[0];
        while (lIlIllllIlIllll(lllllllllllllIlIlIllIIIlIllIllII, GUITest.lllllIllllIlI[1])) {
            (this.areas[lllllllllllllIlIlIllIIIlIllIllII] = new MouseOverArea(lllllllllllllIlIlIllIIIlIllIlIlI, this.image, GUITest.lllllIllllIlI[13], GUITest.lllllIllllIlI[14] + lllllllllllllIlIlIllIIIlIllIllII * GUITest.lllllIllllIlI[14], GUITest.lllllIllllIlI[15], GUITest.lllllIllllIlI[16], this)).setNormalColor(new Color(1.0f, 1.0f, 1.0f, 0.8f));
            this.areas[lllllllllllllIlIlIllIIIlIllIllII].setMouseOverColor(new Color(1.0f, 1.0f, 1.0f, 0.9f));
            ++lllllllllllllIlIlIllIIIlIllIllII;
            "".length();
            if (((0xEB ^ 0xA8) & ~(0xCE ^ 0x8D)) == (0xBF ^ 0xBB)) {
                return;
            }
        }
    }
    
    public void render(final GameContainer lllllllllllllIlIlIllIIIlIlIlllIl, final Graphics lllllllllllllIlIlIllIIIlIlIlllII) {
        this.background.draw(0.0f, 0.0f, 800.0f, 500.0f);
        int lllllllllllllIlIlIllIIIlIllIIIlI = GUITest.lllllIllllIlI[0];
        while (lIlIllllIlIllll(lllllllllllllIlIlIllIIIlIllIIIlI, GUITest.lllllIllllIlI[1])) {
            this.areas[lllllllllllllIlIlIllIIIlIllIIIlI].render(lllllllllllllIlIlIllIIIlIlIlllIl, lllllllllllllIlIlIllIIIlIlIlllII);
            ++lllllllllllllIlIlIllIIIlIllIIIlI;
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        this.field.render(lllllllllllllIlIlIllIIIlIlIlllIl, lllllllllllllIlIlIllIIIlIlIlllII);
        this.field2.render(lllllllllllllIlIlIllIIIlIlIlllIl, lllllllllllllIlIlIllIIIlIlIlllII);
        lllllllllllllIlIlIllIIIlIlIlllII.setFont(this.font);
        lllllllllllllIlIlIllIIIlIlIlllII.drawString(this.message, 200.0f, 550.0f);
    }
    
    public static void main(final String[] lllllllllllllIlIlIllIIIlIlIIlIlI) {
        try {
            final AppGameContainer lllllllllllllIlIlIllIIIlIlIIllII = new AppGameContainer(new GUITest());
            lllllllllllllIlIlIllIIIlIlIIllII.setDisplayMode(GUITest.lllllIllllIlI[21], GUITest.lllllIllllIlI[22], (boolean)(GUITest.lllllIllllIlI[0] != 0));
            lllllllllllllIlIlIllIIIlIlIIllII.start();
            "".length();
            if ((0x28 ^ 0x7 ^ (0x53 ^ 0x78)) <= 0) {
                return;
            }
        }
        catch (SlickException lllllllllllllIlIlIllIIIlIlIIlIll) {
            lllllllllllllIlIlIllIIIlIlIIlIll.printStackTrace();
        }
    }
    
    @Override
    public void keyPressed(final int lllllllllllllIlIlIllIIIlIlIlIIlI, final char lllllllllllllIlIlIllIIIlIlIlIIIl) {
        if (lIlIllllIllIIII(lllllllllllllIlIlIllIIIlIlIlIIlI, GUITest.lllllIllllIlI[2])) {
            System.exit(GUITest.lllllIllllIlI[0]);
        }
        if (lIlIllllIllIIII(lllllllllllllIlIlIllIIIlIlIlIIlI, GUITest.lllllIllllIlI[17])) {
            this.app.setDefaultMouseCursor();
        }
        if (lIlIllllIllIIII(lllllllllllllIlIlIllIIIlIlIlIIlI, GUITest.lllllIllllIlI[18]) && lIlIllllIllIIIl(this.app)) {
            try {
                this.app.setDisplayMode(GUITest.lllllIllllIlI[19], GUITest.lllllIllllIlI[20], (boolean)(GUITest.lllllIllllIlI[0] != 0));
                "".length();
                if (((0x45 ^ 0x7C) & ~(0x51 ^ 0x68)) != 0x0) {
                    return;
                }
            }
            catch (SlickException lllllllllllllIlIlIllIIIlIlIlIlII) {
                Log.error(lllllllllllllIlIlIllIIIlIlIlIlII);
            }
        }
    }
    
    private static void lIlIllllIlIllIl() {
        (lllllIllllIlI = new int[27])[0] = ((0x2E ^ 0x1A ^ (0xBD ^ 0x9F)) & (0x1C ^ 0x57 ^ (0x19 ^ 0x44) ^ -" ".length()));
        GUITest.lllllIllllIlI[1] = (0x74 ^ 0x7C ^ (0x3F ^ 0x33));
        GUITest.lllllIllllIlI[2] = " ".length();
        GUITest.lllllIllllIlI[3] = "  ".length();
        GUITest.lllllIllllIlI[4] = "   ".length();
        GUITest.lllllIllllIlI[5] = 57 + 34 + 48 + 11;
        GUITest.lllllIllllIlI[6] = (0x62 ^ 0x71 ^ (0x2F ^ 0x28));
        GUITest.lllllIllllIlI[7] = (0xFFFFDDF4 & 0x23FF);
        GUITest.lllllIllllIlI[8] = (0xB8 ^ 0x9B);
        GUITest.lllllIllllIlI[9] = ("   ".length() ^ (0xC4 ^ 0x81));
        GUITest.lllllIllllIlI[10] = (0x48 ^ 0x4D);
        GUITest.lllllIllllIlI[11] = (171 + 170 - 205 + 63 ^ 181 + 188 - 276 + 100);
        GUITest.lllllIllllIlI[12] = (0x9C ^ 0x9B);
        GUITest.lllllIllllIlI[13] = (0xFFFFE72D & 0x19FE);
        GUITest.lllllIllllIlI[14] = (75 + 190 - 33 + 16 ^ 16 + 129 - 131 + 142);
        GUITest.lllllIllllIlI[15] = (0x6E ^ 0xC) + (0x5D ^ 0x7E) - (0xF ^ 0x46) + (114 + 105 - 186 + 107);
        GUITest.lllllIllllIlI[16] = (0x11 ^ 0x57 ^ (0x32 ^ 0x2E));
        GUITest.lllllIllllIlI[17] = (77 + 55 - 123 + 121 ^ 6 + 128 - 103 + 159);
        GUITest.lllllIllllIlI[18] = (116 + 21 - 50 + 87 ^ 113 + 99 - 124 + 61);
        GUITest.lllllIllllIlI[19] = (-(0xFFFFFDF9 & 0x2B0E) & (0xFFFFFBCF & 0x2FB7));
        GUITest.lllllIllllIlI[20] = (-(0xFFFFB67B & 0x7F9C) & (0xFFFFFFF7 & 0x37FF));
        GUITest.lllllIllllIlI[21] = (-(0xFFFFEDFF & 0x72CA) & (0xFFFFEBFB & 0x77ED));
        GUITest.lllllIllllIlI[22] = (0xFFFFF659 & 0xBFE);
        GUITest.lllllIllllIlI[23] = (0x22 ^ 0x1C ^ (0xF2 ^ 0xC4));
        GUITest.lllllIllllIlI[24] = (0xAF ^ 0xA6);
        GUITest.lllllIllllIlI[25] = (0xA4 ^ 0xAE);
        GUITest.lllllIllllIlI[26] = (0xD ^ 0x6);
    }
    
    private static boolean lIlIllllIllIIIl(final Object lllllllllllllIlIlIllIIIIlllllIII) {
        return lllllllllllllIlIlIllIIIIlllllIII != null;
    }
    
    static {
        lIlIllllIlIllIl();
        lIlIllllIIlIlIl();
    }
    
    private static boolean lIlIllllIllIIII(final int lllllllllllllIlIlIllIIIIllllllll, final int lllllllllllllIlIlIllIIIIlllllllI) {
        return lllllllllllllIlIlIllIIIIllllllll == lllllllllllllIlIlIllIIIIlllllllI;
    }
    
    private static boolean lIlIllllIlIllll(final int lllllllllllllIlIlIllIIIIlllllIll, final int lllllllllllllIlIlIllIIIIlllllIlI) {
        return lllllllllllllIlIlIllIIIIlllllIll < lllllllllllllIlIlIllIIIIlllllIlI;
    }
    
    @Override
    public void update(final GameContainer lllllllllllllIlIlIllIIIlIlIllIIl, final int lllllllllllllIlIlIllIIIlIlIllIII) {
    }
    
    private static String lIlIllllIIIlIIl(final String lllllllllllllIlIlIllIIIlIIlIllII, final String lllllllllllllIlIlIllIIIlIIlIlIll) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIIIlIIlIllll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIIlIIlIlIll.getBytes(StandardCharsets.UTF_8)), GUITest.lllllIllllIlI[23]), "DES");
            final Cipher lllllllllllllIlIlIllIIIlIIlIlllI = Cipher.getInstance("DES");
            lllllllllllllIlIlIllIIIlIIlIlllI.init(GUITest.lllllIllllIlI[3], lllllllllllllIlIlIllIIIlIIlIllll);
            return new String(lllllllllllllIlIlIllIIIlIIlIlllI.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIIlIIlIllII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIIIlIIlIllIl) {
            lllllllllllllIlIlIllIIIlIIlIllIl.printStackTrace();
            return null;
        }
    }
    
    public GUITest() {
        super(GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[0]]);
        this.areas = new MouseOverArea[GUITest.lllllIllllIlI[1]];
        this.message = GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[2]];
    }
    
    private static String lIlIllllIIIlIII(final String lllllllllllllIlIlIllIIIlIIIIIlIl, final String lllllllllllllIlIlIllIIIlIIIIIllI) {
        try {
            final SecretKeySpec lllllllllllllIlIlIllIIIlIIIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIllIIIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIllIIIlIIIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIllIIIlIIIIlIIl.init(GUITest.lllllIllllIlI[3], lllllllllllllIlIlIllIIIlIIIIlIlI);
            return new String(lllllllllllllIlIlIllIIIlIIIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIllIIIlIIIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIllIIIlIIIIlIII) {
            lllllllllllllIlIlIllIIIlIIIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static void lIlIllllIIlIlIl() {
        (lllllIllIllIl = new String[GUITest.lllllIllllIlI[26]])[GUITest.lllllIllllIlI[0]] = lIlIllllIIIIlll("LBcIbBkOMTU=", "kBALM");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[2]] = lIlIllllIIIlIII("NoDs9QpQfUkHsC122BctRB+t2vwEb0i8Z9gYmAo9uoqirxg6I0t7QQ==", "mDrQQ");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[3]] = lIlIllllIIIlIII("lZuh1f+8AhOlMhm8sV7/ElGVV6gLDQVV", "fykeH");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[4]] = lIlIllllIIIlIIl("Q0pBm/uVQ2T92c5x/Zb9LPu+qPNOqhWl", "ZTiDU");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[1]] = lIlIllllIIIlIII("70vj5wVSrcM8Lf+0Zr1bM47atm+4sQiQ", "jJsem");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[10]] = lIlIllllIIIIlll("IC0+MQI1PCxqCjsvImsSMyk=", "THMEf");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[11]] = lIlIllllIIIIlll("AQ41LgUUHyd1BQAFIT8OGx8vNgQGRSEzBw==", "ukFZa");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[12]] = lIlIllllIIIIlll("JQc9ECcwFi9LICQQPQsxfxYpBQ==", "QbNdC");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[23]] = lIlIllllIIIlIII("NuU5XhVEY29ibxPxzscNQQ==", "pFkBM");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[24]] = lIlIllllIIIlIIl("cvv9OT67imE=", "jZljN");
        GUITest.lllllIllIllIl[GUITest.lllllIllllIlI[25]] = lIlIllllIIIlIIl("AhiIK/wOPFh9tcMbv8ypLw==", "WhKGS");
    }
    
    private static String lIlIllllIIIIlll(String lllllllllllllIlIlIllIIIlIIIlIlll, final String lllllllllllllIlIlIllIIIlIIIllIll) {
        lllllllllllllIlIlIllIIIlIIIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIllIIIlIIIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIllIIIlIIIllIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIllIIIlIIIllIIl = lllllllllllllIlIlIllIIIlIIIllIll.toCharArray();
        int lllllllllllllIlIlIllIIIlIIIllIII = GUITest.lllllIllllIlI[0];
        final short lllllllllllllIlIlIllIIIlIIIlIIlI = (Object)lllllllllllllIlIlIllIIIlIIIlIlll.toCharArray();
        final String lllllllllllllIlIlIllIIIlIIIlIIIl = (String)lllllllllllllIlIlIllIIIlIIIlIIlI.length;
        char lllllllllllllIlIlIllIIIlIIIlIIII = (char)GUITest.lllllIllllIlI[0];
        while (lIlIllllIlIllll(lllllllllllllIlIlIllIIIlIIIlIIII, (int)lllllllllllllIlIlIllIIIlIIIlIIIl)) {
            final char lllllllllllllIlIlIllIIIlIIIlllIl = lllllllllllllIlIlIllIIIlIIIlIIlI[lllllllllllllIlIlIllIIIlIIIlIIII];
            lllllllllllllIlIlIllIIIlIIIllIlI.append((char)(lllllllllllllIlIlIllIIIlIIIlllIl ^ lllllllllllllIlIlIllIIIlIIIllIIl[lllllllllllllIlIlIllIIIlIIIllIII % lllllllllllllIlIlIllIIIlIIIllIIl.length]));
            "".length();
            ++lllllllllllllIlIlIllIIIlIIIllIII;
            ++lllllllllllllIlIlIllIIIlIIIlIIII;
            "".length();
            if ("  ".length() != "  ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIllIIIlIIIllIlI);
    }
    
    private static boolean lIlIllllIlIlllI(final int lllllllllllllIlIlIllIIIIllllIIlI) {
        return lllllllllllllIlIlIllIIIIllllIIlI != 0;
    }
}
