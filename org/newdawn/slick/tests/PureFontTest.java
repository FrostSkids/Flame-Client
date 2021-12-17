// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import java.util.Arrays;
import org.newdawn.slick.Game;
import org.newdawn.slick.Graphics;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.AngelCodeFont;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Font;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.BasicGame;

public class PureFontTest extends BasicGame
{
    private /* synthetic */ Image image;
    private static /* synthetic */ AppGameContainer container;
    private static final /* synthetic */ String[] llIIIIIIIIIlII;
    private /* synthetic */ Font font;
    private static final /* synthetic */ int[] llIIIIIIIllIIl;
    
    private static void lIIIIllIlIIIlIII() {
        (llIIIIIIIIIlII = new String[PureFontTest.llIIIIIIIllIIl[8]])[PureFontTest.llIIIIIIIllIIl[0]] = lIIIIllIlIIIIlIl("+5h8qNISQ9kxzMpMKSslYg==", "VbRcl");
        PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[1]] = lIIIIllIlIIIIllI("eTl68ctQA/ZlsW82qTHdgEPH/pZXRNwc", "KJWRS");
        PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[2]] = lIIIIllIlIIIIlll("PRcgBzQoBjJcOCAXIRx+Lxwn", "IrSsP");
        PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[3]] = lIIIIllIlIIIIllI("L2yrK7rkVJHZ2EBQp6y1B0bmxsJq8IBP", "OTlfm");
        PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[4]] = lIIIIllIlIIIIlll("AwdrAQk8SSQTRiMFL1UVIQYgEB9gSSoZCg==", "LiKuf");
        PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[5]] = lIIIIllIlIIIIlll("AiEyFDYEKmQGLRUmZAIlDypqXw==", "aNDqD");
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllllIIIIlIlIIlIIIll) throws SlickException {
        this.image = new Image(PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[1]]);
        this.font = new AngelCodeFont(PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[2]], PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[3]]);
    }
    
    private static String lIIIIllIlIIIIllI(final String llllllllllllIllllIIIIlIIlllllIlI, final String llllllllllllIllllIIIIlIIlllllIIl) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIlIIllllllll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIIlllllIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIIIIlIIlllllllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIIIIlIIlllllllI.init(PureFontTest.llIIIIIIIllIIl[2], llllllllllllIllllIIIIlIIllllllll);
            return new String(llllllllllllIllllIIIIlIIlllllllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIIlllllIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIlIIllllllIl) {
            llllllllllllIllllIIIIlIIllllllIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIIIllIlIlIIIII() {
        (llIIIIIIIllIIl = new int[10])[0] = ((177 + 163 - 172 + 26 ^ 15 + 103 + 17 + 14) & (21 + 187 - 175 + 189 ^ 16 + 24 - 0 + 97 ^ -" ".length()));
        PureFontTest.llIIIIIIIllIIl[1] = " ".length();
        PureFontTest.llIIIIIIIllIIl[2] = "  ".length();
        PureFontTest.llIIIIIIIllIIl[3] = "   ".length();
        PureFontTest.llIIIIIIIllIIl[4] = (0x4E ^ 0x4A);
        PureFontTest.llIIIIIIIllIIl[5] = (95 + 63 - 42 + 62 ^ 77 + 169 - 194 + 131);
        PureFontTest.llIIIIIIIllIIl[6] = (-(0xFFFFFDDD & 0x7AFE) & (0xFFFFFFFB & 0x7BFF));
        PureFontTest.llIIIIIIIllIIl[7] = (-(0xFFFFF9EF & 0x7F15) & (0xFFFFFF5E & 0x7BFD));
        PureFontTest.llIIIIIIIllIIl[8] = (0x30 ^ 0x36);
        PureFontTest.llIIIIIIIllIIl[9] = (0x42 ^ 0x7E ^ (0x5F ^ 0x6B));
    }
    
    public void render(final GameContainer llllllllllllIllllIIIIlIlIIIlllll, final Graphics llllllllllllIllllIIIIlIlIIIllllI) {
        this.image.draw(0.0f, 0.0f, 800.0f, 600.0f);
        this.font.drawString(100.0f, 32.0f, PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[4]]);
        this.font.drawString(100.0f, 80.0f, PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[5]]);
    }
    
    @Override
    public void update(final GameContainer llllllllllllIllllIIIIlIlIIIllIll, final int llllllllllllIllllIIIIlIlIIIllIlI) throws SlickException {
    }
    
    static {
        lIIIIllIlIlIIIII();
        lIIIIllIlIIIlIII();
    }
    
    private static String lIIIIllIlIIIIlll(String llllllllllllIllllIIIIlIIlllIIlll, final String llllllllllllIllllIIIIlIIlllIIllI) {
        llllllllllllIllllIIIIlIIlllIIlll = (byte)new String(Base64.getDecoder().decode(((String)llllllllllllIllllIIIIlIIlllIIlll).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllllIIIIlIIlllIlIlI = new StringBuilder();
        final char[] llllllllllllIllllIIIIlIIlllIlIIl = llllllllllllIllllIIIIlIIlllIIllI.toCharArray();
        int llllllllllllIllllIIIIlIIlllIlIII = PureFontTest.llIIIIIIIllIIl[0];
        final double llllllllllllIllllIIIIlIIlllIIIlI = (Object)((String)llllllllllllIllllIIIIlIIlllIIlll).toCharArray();
        final boolean llllllllllllIllllIIIIlIIlllIIIIl = llllllllllllIllllIIIIlIIlllIIIlI.length != 0;
        byte llllllllllllIllllIIIIlIIlllIIIII = (byte)PureFontTest.llIIIIIIIllIIl[0];
        while (lIIIIllIlIlIIIlI(llllllllllllIllllIIIIlIIlllIIIII, llllllllllllIllllIIIIlIIlllIIIIl ? 1 : 0)) {
            final char llllllllllllIllllIIIIlIIlllIllIl = llllllllllllIllllIIIIlIIlllIIIlI[llllllllllllIllllIIIIlIIlllIIIII];
            llllllllllllIllllIIIIlIIlllIlIlI.append((char)(llllllllllllIllllIIIIlIIlllIllIl ^ llllllllllllIllllIIIIlIIlllIlIIl[llllllllllllIllllIIIIlIIlllIlIII % llllllllllllIllllIIIIlIIlllIlIIl.length]));
            "".length();
            ++llllllllllllIllllIIIIlIIlllIlIII;
            ++llllllllllllIllllIIIIlIIlllIIIII;
            "".length();
            if (((7 + 62 + 67 + 24 ^ 49 + 169 - 81 + 51) & (158 + 28 - 114 + 108 ^ 69 + 48 - 75 + 126 ^ -" ".length())) != ((163 + 96 - 165 + 82 ^ 158 + 79 - 115 + 65) & (0x99 ^ 0x92 ^ ((0x4F ^ 0x5B) & ~(0x52 ^ 0x46)) ^ -" ".length()))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllllIIIIlIIlllIlIlI);
    }
    
    public PureFontTest() {
        super(PureFontTest.llIIIIIIIIIlII[PureFontTest.llIIIIIIIllIIl[0]]);
    }
    
    public static void main(final String[] llllllllllllIllllIIIIlIlIIIlIIlI) {
        try {
            (PureFontTest.container = new AppGameContainer(new PureFontTest())).setDisplayMode(PureFontTest.llIIIIIIIllIIl[6], PureFontTest.llIIIIIIIllIIl[7], (boolean)(PureFontTest.llIIIIIIIllIIl[0] != 0));
            PureFontTest.container.start();
            "".length();
            if (" ".length() >= (0x44 ^ 0x40)) {
                return;
            }
        }
        catch (SlickException llllllllllllIllllIIIIlIlIIIlIIll) {
            llllllllllllIllllIIIIlIlIIIlIIll.printStackTrace();
        }
    }
    
    private static boolean lIIIIllIlIlIIIIl(final int llllllllllllIllllIIIIlIIllIlllII, final int llllllllllllIllllIIIIlIIllIllIll) {
        return llllllllllllIllllIIIIlIIllIlllII == llllllllllllIllllIIIIlIIllIllIll;
    }
    
    private static String lIIIIllIlIIIIlIl(final String llllllllllllIllllIIIIlIlIIIIIlll, final String llllllllllllIllllIIIIlIlIIIIIllI) {
        try {
            final SecretKeySpec llllllllllllIllllIIIIlIlIIIIllII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIIIIlIlIIIIIllI.getBytes(StandardCharsets.UTF_8)), PureFontTest.llIIIIIIIllIIl[9]), "DES");
            final Cipher llllllllllllIllllIIIIlIlIIIIlIll = Cipher.getInstance("DES");
            llllllllllllIllllIIIIlIlIIIIlIll.init(PureFontTest.llIIIIIIIllIIl[2], llllllllllllIllllIIIIlIlIIIIllII);
            return new String(llllllllllllIllllIIIIlIlIIIIlIll.doFinal(Base64.getDecoder().decode(llllllllllllIllllIIIIlIlIIIIIlll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIIIIlIlIIIIlIlI) {
            llllllllllllIllllIIIIlIlIIIIlIlI.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void keyPressed(final int llllllllllllIllllIIIIlIlIIIlIlll, final char llllllllllllIllllIIIIlIlIIIlIllI) {
        if (lIIIIllIlIlIIIIl(llllllllllllIllllIIIIlIlIIIlIlll, PureFontTest.llIIIIIIIllIIl[1])) {
            System.exit(PureFontTest.llIIIIIIIllIIl[0]);
        }
    }
    
    private static boolean lIIIIllIlIlIIIlI(final int llllllllllllIllllIIIIlIIllIllIII, final int llllllllllllIllllIIIIlIIllIlIlll) {
        return llllllllllllIllllIIIIlIIllIllIII < llllllllllllIllllIIIIlIIllIlIlll;
    }
}
