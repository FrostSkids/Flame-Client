// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Color;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Game;
import java.util.Arrays;
import org.newdawn.slick.util.Log;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.GameContainer;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.Image;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.BasicGame;

public class FontTest extends BasicGame
{
    private static final /* synthetic */ int[] llIIIIllllllII;
    private /* synthetic */ AngelCodeFont font;
    private static final /* synthetic */ String[] llIIIIlllllIll;
    private /* synthetic */ AngelCodeFont font2;
    private static /* synthetic */ AppGameContainer container;
    private /* synthetic */ Image image;
    
    private static boolean lIIIlIIIlIIlIIll(final int llllllllllllIlllIllIIlIllIIlIllI, final int llllllllllllIlllIllIIlIllIIlIlIl) {
        return llllllllllllIlllIllIIlIllIIlIllI < llllllllllllIlllIllIIlIllIIlIlIl;
    }
    
    private static String lIIIlIIIlIIIlllI(final String llllllllllllIlllIllIIlIllIlllIlI, final String llllllllllllIlllIllIIlIllIlllIIl) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIllIllllIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIllIlllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIllIIlIllIllllII = Cipher.getInstance("Blowfish");
            llllllllllllIlllIllIIlIllIllllII.init(FontTest.llIIIIllllllII[2], llllllllllllIlllIllIIlIllIllllIl);
            return new String(llllllllllllIlllIllIIlIllIllllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIllIlllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIllIlllIll) {
            llllllllllllIlllIllIIlIllIlllIll.printStackTrace();
            return null;
        }
    }
    
    public FontTest() {
        super(FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[0]]);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIllIIlIllllIlIIl) throws SlickException {
        this.font = new AngelCodeFont(FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[1]], FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[2]]);
        this.font2 = new AngelCodeFont(FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[3]], FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[4]]);
        this.image = new Image(FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[5]], (boolean)(FontTest.llIIIIllllllII[0] != 0));
    }
    
    @Override
    public void keyPressed(final int llllllllllllIlllIllIIlIlllIlIlII, final char llllllllllllIlllIllIIlIlllIlIlIl) {
        if (lIIIlIIIlIIlIIIl(llllllllllllIlllIllIIlIlllIlIlII, FontTest.llIIIIllllllII[1])) {
            System.exit(FontTest.llIIIIllllllII[0]);
        }
        if (lIIIlIIIlIIlIIIl(llllllllllllIlllIllIIlIlllIlIlII, FontTest.llIIIIllllllII[18])) {
            try {
                FontTest.container.setDisplayMode(FontTest.llIIIIllllllII[19], FontTest.llIIIIllllllII[20], (boolean)(FontTest.llIIIIllllllII[0] != 0));
                "".length();
                if (((0x54 ^ 0x48) & ~(0x9D ^ 0x81)) != ((0xA5 ^ 0xAF) & ~(0x31 ^ 0x3B))) {
                    return;
                }
            }
            catch (SlickException llllllllllllIlllIllIIlIlllIllIII) {
                Log.error(llllllllllllIlllIllIIlIlllIllIII);
            }
        }
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIllIIlIlllIlllII, final int llllllllllllIlllIllIIlIlllIllIll) throws SlickException {
    }
    
    private static void lIIIlIIIlIIlIIII() {
        (llIIIIllllllII = new int[24])[0] = ((0xE3 ^ 0xC6) & ~(0x4D ^ 0x68));
        FontTest.llIIIIllllllII[1] = " ".length();
        FontTest.llIIIIllllllII[2] = "  ".length();
        FontTest.llIIIIllllllII[3] = "   ".length();
        FontTest.llIIIIllllllII[4] = (0x62 ^ 0x66);
        FontTest.llIIIIllllllII[5] = (55 + 38 - 62 + 104 ^ 125 + 85 - 121 + 41);
        FontTest.llIIIIllllllII[6] = (0xA9 ^ 0xAF);
        FontTest.llIIIIllllllII[7] = (0x35 ^ 0x32);
        FontTest.llIIIIllllllII[8] = (144 + 136 - 175 + 62 ^ 104 + 103 - 80 + 4);
        FontTest.llIIIIllllllII[9] = (0x6A ^ 0x62);
        FontTest.llIIIIllllllII[10] = (0x31 ^ 0x34 ^ (0x19 ^ 0x15));
        FontTest.llIIIIllllllII[11] = (0xF ^ 0x5);
        FontTest.llIIIIllllllII[12] = (0x19 ^ 0x12);
        FontTest.llIIIIllllllII[13] = 18 + 108 - 19 + 29;
        FontTest.llIIIIllllllII[14] = (0x3C ^ 0x2A ^ (0x57 ^ 0x4D));
        FontTest.llIIIIllllllII[15] = (0xE ^ 0x3);
        FontTest.llIIIIllllllII[16] = (0x83 ^ 0x8D);
        FontTest.llIIIIllllllII[17] = (-(0xFFFFF47E & 0x6F95) & (0xFFFFF5FF & 0x6F3F));
        FontTest.llIIIIllllllII[18] = (0xAC ^ 0x95);
        FontTest.llIIIIllllllII[19] = (0xFFFFDF8A & 0x22F5);
        FontTest.llIIIIllllllII[20] = (0xFFFFBDE7 & 0x43F8);
        FontTest.llIIIIllllllII[21] = (-(0xFFFFFD9B & 0x3EFE) & (0xFFFFBFBB & 0x7FFD));
        FontTest.llIIIIllllllII[22] = (-(0xFFFFF1DF & 0x7FA6) & (0xFFFFF3FF & 0x7FDD));
        FontTest.llIIIIllllllII[23] = (0x53 ^ 0x5C);
    }
    
    private static void lIIIlIIIlIIIllll() {
        (llIIIIlllllIll = new String[FontTest.llIIIIllllllII[23]])[FontTest.llIIIIllllllII[0]] = lIIIlIIIlIIIllII("BQUnJGYXDzok", "CjIPF");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[1]] = lIIIlIIIlIIIllII("MRccIhIkBg55EiAfAGRYIxwb", "EroVv");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[2]] = lIIIlIIIlIIIllII("MyMQJQwmMgJ+DCIrDGM3d3ZNJQ8m", "GFcQh");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[3]] = lIIIlIIIlIIIllIl("PFwDJ3kJsVM53t4k24lIZ7Yk8W5vA4VT", "cWuzB");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[4]] = lIIIlIIIlIIIlllI("3PpdEU9nfm64gIITbMngPqzFhoSkNS+6", "fvtAz");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[5]] = lIIIlIIIlIIIllIl("QS45XfoDeEvZroJE0tgrrIVeXwoCbISG", "ZVQfX");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[6]] = lIIIlIIIlIIIllII("E3IJKwkmcgo8Bj8iIyE=", "RRODg");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[7]] = lIIIlIIIlIIIlllI("Mgq+XDZdzCE0kR0bFvl3DvQZJzMgFqvz1hM/dXlrbbBT6gbRRdnvudozRJewEwLYTBi4A6cm+hM=", "bKyCw");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[9]] = lIIIlIIIlIIIllII("MBN4BCoVE3glPEcXeCEgFRN4LyAKBjQpOwJWNCUhAlYsJC4TVjAjPwIQLSAjHg==", "gvXLO");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[10]] = lIIIlIIIlIIIlllI("eN3v9cc7Uo3d29Artx5PcWOw9lb2Z25U", "cpLCW");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[11]] = lIIIlIIIlIIIlllI("Jc4Zw6IaaSJ8WvMKRmWimQ==", "jwdne");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[12]] = lIIIlIIIlIIIlllI("OUTr/7PhJXGjt+Az0yR22AfIo/rNnRuRg1W6Yi0rfHzfq+os2MYF64ibyTg4nWtZ6mBQvLgHCRk=", "YznYX");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[14]] = lIIIlIIIlIIIllII("BydTQWQYJwEJZDkxUw1kPS0BCWQzLR4cKDU2FkwoOSwWTDA4IwdMLD8yFgoxPC4K", "PBslD");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[15]] = lIIIlIIIlIIIllII("JjMvNkkiMiwtSSI1Lj9JOj8xNAA/PW0=", "QZCZi");
        FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[16]] = lIIIlIIIlIIIlllI("wHfMwoFoZu9qX/aSWDVofA==", "vkOIg");
    }
    
    private static String lIIIlIIIlIIIllII(String llllllllllllIlllIllIIlIllIlIIlIl, final String llllllllllllIlllIllIIlIllIlIlIIl) {
        llllllllllllIlllIllIIlIllIlIIlIl = (char)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIllIIlIllIlIIlIl).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIllIIlIllIlIlIII = new StringBuilder();
        final char[] llllllllllllIlllIllIIlIllIlIIlll = llllllllllllIlllIllIIlIllIlIlIIl.toCharArray();
        int llllllllllllIlllIllIIlIllIlIIllI = FontTest.llIIIIllllllII[0];
        final long llllllllllllIlllIllIIlIllIlIIIII = (Object)((String)llllllllllllIlllIllIIlIllIlIIlIl).toCharArray();
        final int llllllllllllIlllIllIIlIllIIlllll = llllllllllllIlllIllIIlIllIlIIIII.length;
        double llllllllllllIlllIllIIlIllIIllllI = FontTest.llIIIIllllllII[0];
        while (lIIIlIIIlIIlIIll((int)llllllllllllIlllIllIIlIllIIllllI, llllllllllllIlllIllIIlIllIIlllll)) {
            final char llllllllllllIlllIllIIlIllIlIlIll = llllllllllllIlllIllIIlIllIlIIIII[llllllllllllIlllIllIIlIllIIllllI];
            llllllllllllIlllIllIIlIllIlIlIII.append((char)(llllllllllllIlllIllIIlIllIlIlIll ^ llllllllllllIlllIllIIlIllIlIIlll[llllllllllllIlllIllIIlIllIlIIllI % llllllllllllIlllIllIIlIllIlIIlll.length]));
            "".length();
            ++llllllllllllIlllIllIIlIllIlIIllI;
            ++llllllllllllIlllIllIIlIllIIllllI;
            "".length();
            if ("   ".length() == ((18 + 74 + 22 + 72 ^ 48 + 113 - 154 + 139) & ("   ".length() ^ (0x8B ^ 0xA0) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIllIIlIllIlIlIII);
    }
    
    static {
        lIIIlIIIlIIlIIII();
        lIIIlIIIlIIIllll();
    }
    
    private static String lIIIlIIIlIIIllIl(final String llllllllllllIlllIllIIlIlllIIIlll, final String llllllllllllIlllIllIIlIlllIIIlII) {
        try {
            final SecretKeySpec llllllllllllIlllIllIIlIlllIIlIlI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIllIIlIlllIIIlII.getBytes(StandardCharsets.UTF_8)), FontTest.llIIIIllllllII[9]), "DES");
            final Cipher llllllllllllIlllIllIIlIlllIIlIIl = Cipher.getInstance("DES");
            llllllllllllIlllIllIIlIlllIIlIIl.init(FontTest.llIIIIllllllII[2], llllllllllllIlllIllIIlIlllIIlIlI);
            return new String(llllllllllllIlllIllIIlIlllIIlIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIllIIlIlllIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIllIIlIlllIIlIII) {
            llllllllllllIlllIllIIlIlllIIlIII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIIlIIIlIIlIIIl(final int llllllllllllIlllIllIIlIllIIllIlI, final int llllllllllllIlllIllIIlIllIIllIIl) {
        return llllllllllllIlllIllIIlIllIIllIlI == llllllllllllIlllIllIIlIllIIllIIl;
    }
    
    public static void main(final String[] llllllllllllIlllIllIIlIlllIlIIII) {
        try {
            (FontTest.container = new AppGameContainer(new FontTest())).setDisplayMode(FontTest.llIIIIllllllII[21], FontTest.llIIIIllllllII[22], (boolean)(FontTest.llIIIIllllllII[0] != 0));
            FontTest.container.start();
            "".length();
            if (-" ".length() > "  ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllIllIIlIlllIlIIIl) {
            llllllllllllIlllIllIIlIlllIlIIIl.printStackTrace();
        }
    }
    
    public void render(final GameContainer llllllllllllIlllIllIIlIllllIIIll, final Graphics llllllllllllIlllIllIIlIlllIlllll) {
        this.font.drawString(80.0f, 5.0f, FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[6]], Color.red);
        this.font.drawString(100.0f, 32.0f, FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[7]]);
        this.font.drawString(100.0f, (float)(FontTest.llIIIIllllllII[8] + this.font.getHeight(FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[9]])), FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[10]]);
        this.font2.drawString(80.0f, 85.0f, FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[11]], Color.red);
        this.font2.drawString(100.0f, 132.0f, FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[12]]);
        this.font2.drawString(100.0f, (float)(FontTest.llIIIIllllllII[13] + this.font2.getHeight(FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[14]])), FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[15]]);
        this.image.draw(100.0f, 400.0f);
        final String llllllllllllIlllIllIIlIllllIIIIl = FontTest.llIIIIlllllIll[FontTest.llIIIIllllllII[16]];
        this.font2.drawString(100.0f, 300.0f, llllllllllllIlllIllIIlIllllIIIIl);
        llllllllllllIlllIllIIlIlllIlllll.setColor(Color.white);
        llllllllllllIlllIllIIlIlllIlllll.drawRect(100.0f, (float)(FontTest.llIIIIllllllII[17] + this.font2.getYOffset(llllllllllllIlllIllIIlIllllIIIIl)), (float)this.font2.getWidth(llllllllllllIlllIllIIlIllllIIIIl), (float)(this.font2.getHeight(llllllllllllIlllIllIIlIllllIIIIl) - this.font2.getYOffset(llllllllllllIlllIllIIlIllllIIIIl)));
        this.font.drawString(500.0f, 300.0f, llllllllllllIlllIllIIlIllllIIIIl);
        llllllllllllIlllIllIIlIlllIlllll.setColor(Color.white);
        llllllllllllIlllIllIIlIlllIlllll.drawRect(500.0f, (float)(FontTest.llIIIIllllllII[17] + this.font.getYOffset(llllllllllllIlllIllIIlIllllIIIIl)), (float)this.font.getWidth(llllllllllllIlllIllIIlIllllIIIIl), (float)(this.font.getHeight(llllllllllllIlllIllIIlIllllIIIIl) - this.font.getYOffset(llllllllllllIlllIllIIlIllllIIIIl)));
    }
}
