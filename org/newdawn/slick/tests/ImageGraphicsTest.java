// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.opengl.pbuffer.GraphicsFactory;
import org.newdawn.slick.AngelCodeFont;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Image;
import org.newdawn.slick.Font;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.BasicGame;

public class ImageGraphicsTest extends BasicGame
{
    private /* synthetic */ Graphics offscreenPreload;
    private static final /* synthetic */ int[] lllIIIIllIIllI;
    private /* synthetic */ Font testFont;
    private /* synthetic */ Graphics gTarget;
    private /* synthetic */ Image preloaded;
    private /* synthetic */ Image testImage;
    private static final /* synthetic */ String[] lllIIIIllIIIll;
    private /* synthetic */ String using;
    private /* synthetic */ Image target;
    private /* synthetic */ Image cut;
    private /* synthetic */ float ang;
    
    @Override
    public void update(final GameContainer llllllllllllIllIIIIlIIllllIIlIII, final int llllllllllllIllIIIIlIIllllIIIlll) {
        this.ang += llllllllllllIllIIIIlIIllllIIIlll * 0.1f;
    }
    
    private static boolean lIIlllIIllIlIIlI(final int llllllllllllIllIIIIlIIlllIIIlIll, final int llllllllllllIllIIIIlIIlllIIIlIlI) {
        return llllllllllllIllIIIIlIIlllIIIlIll < llllllllllllIllIIIIlIIlllIIIlIlI;
    }
    
    public void render(final GameContainer llllllllllllIllIIIIlIIllllIlIIIl, final Graphics llllllllllllIllIIIIlIIllllIIllIl) throws SlickException {
        this.gTarget.setBackground(new Color(ImageGraphicsTest.lllIIIIllIIllI[0], ImageGraphicsTest.lllIIIIllIIllI[0], ImageGraphicsTest.lllIIIIllIIllI[0], ImageGraphicsTest.lllIIIIllIIllI[0]));
        this.gTarget.clear();
        this.gTarget.rotate(200.0f, 160.0f, this.ang);
        this.gTarget.setFont(this.testFont);
        this.gTarget.fillRect(10.0f, 10.0f, 50.0f, 50.0f);
        this.gTarget.drawString(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[13]], 10.0f, 10.0f);
        this.gTarget.drawImage(this.testImage, 100.0f, 150.0f);
        this.gTarget.drawImage(this.testImage, 100.0f, 50.0f);
        this.gTarget.drawImage(this.testImage, 50.0f, 75.0f);
        this.gTarget.flush();
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.red);
        llllllllllllIllIIIIlIIllllIIllIl.fillRect(250.0f, 50.0f, 200.0f, 200.0f);
        this.target.draw(300.0f, 100.0f);
        this.target.draw(300.0f, 410.0f, 200.0f, 150.0f);
        this.target.draw(505.0f, 410.0f, 100.0f, 75.0f);
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.white);
        llllllllllllIllIIIIlIIllllIIllIl.drawString(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[14]], 300.0f, 80.0f);
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.green);
        llllllllllllIllIIIIlIIllllIIllIl.drawRect(300.0f, 100.0f, (float)this.target.getWidth(), (float)this.target.getHeight());
        llllllllllllIllIIIIlIIllllIIllIl.drawRect(300.0f, 410.0f, (float)(this.target.getWidth() / ImageGraphicsTest.lllIIIIllIIllI[2]), (float)(this.target.getHeight() / ImageGraphicsTest.lllIIIIllIIllI[2]));
        llllllllllllIllIIIIlIIllllIIllIl.drawRect(505.0f, 410.0f, (float)(this.target.getWidth() / ImageGraphicsTest.lllIIIIllIIllI[4]), (float)(this.target.getHeight() / ImageGraphicsTest.lllIIIIllIIllI[4]));
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.white);
        llllllllllllIllIIIIlIIllllIIllIl.drawString(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[15]], 10.0f, 100.0f);
        llllllllllllIllIIIIlIIllllIIllIl.drawString(String.valueOf(new StringBuilder().append(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[16]]).append(this.using)), 10.0f, 580.0f);
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.red);
        llllllllllllIllIIIIlIIllllIIllIl.fillRect(10.0f, 120.0f, 200.0f, 5.0f);
        final int llllllllllllIllIIIIlIIllllIIllll = (int)(60.0 + Math.sin(this.ang / 60.0f) * 50.0);
        llllllllllllIllIIIIlIIllllIIllIl.copyArea(this.cut, llllllllllllIllIIIIlIIllllIIllll, ImageGraphicsTest.lllIIIIllIIllI[12]);
        this.cut.draw(30.0f, 250.0f);
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.white);
        llllllllllllIllIIIIlIIllllIIllIl.drawRect(30.0f, 250.0f, (float)this.cut.getWidth(), (float)this.cut.getHeight());
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.gray);
        llllllllllllIllIIIIlIIllllIIllIl.drawRect((float)llllllllllllIllIIIIlIIllllIIllll, 50.0f, (float)this.cut.getWidth(), (float)this.cut.getHeight());
        this.preloaded.draw(2.0f, 400.0f);
        llllllllllllIllIIIIlIIllllIIllIl.setColor(Color.blue);
        llllllllllllIllIIIIlIIllllIIllIl.drawRect(2.0f, 400.0f, (float)this.preloaded.getWidth(), (float)this.preloaded.getHeight());
    }
    
    private static String lIIlllIIllIIIlIl(final String llllllllllllIllIIIIlIIlllIlIlIIl, final String llllllllllllIllIIIIlIIlllIlIlIII) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIlllIlIlllI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIlllIlIlIII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIlIIlllIlIllIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIlIIlllIlIllIl.init(ImageGraphicsTest.lllIIIIllIIllI[2], llllllllllllIllIIIIlIIlllIlIlllI);
            return new String(llllllllllllIllIIIIlIIlllIlIllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIlllIlIlIIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIlllIlIllII) {
            llllllllllllIllIIIIlIIlllIlIllII.printStackTrace();
            return null;
        }
    }
    
    public ImageGraphicsTest() {
        super(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[0]]);
        this.using = ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[1]];
    }
    
    private static String lIIlllIIllIIIlII(final String llllllllllllIllIIIIlIIlllIlllIII, final String llllllllllllIllIIIIlIIlllIllIlIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIIlIIlllIlllIll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIlIIlllIllIlIl.getBytes(StandardCharsets.UTF_8)), ImageGraphicsTest.lllIIIIllIIllI[11]), "DES");
            final Cipher llllllllllllIllIIIIlIIlllIlllIlI = Cipher.getInstance("DES");
            llllllllllllIllIIIIlIIlllIlllIlI.init(ImageGraphicsTest.lllIIIIllIIllI[2], llllllllllllIllIIIIlIIlllIlllIll);
            return new String(llllllllllllIllIIIIlIIlllIlllIlI.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIlIIlllIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIlIIlllIlllIIl) {
            llllllllllllIllIIIIlIIlllIlllIIl.printStackTrace();
            return null;
        }
    }
    
    private static void lIIlllIIllIIllII() {
        (lllIIIIllIIIll = new String[ImageGraphicsTest.lllIIIIllIIllI[19]])[ImageGraphicsTest.lllIIIIllIIllI[0]] = lIIlllIIllIIIIll("IiQ4NjRLDiswIQMgOiJxPywqJQ==", "kIYQQ");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[1]] = lIIlllIIllIIIlII("9cuCR5dXZeQ=", "LOUIe");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[2]] = lIIlllIIllIIIIll("LDY+Bzc5JyxcPzc0Il0jNjQ=", "XSMsS");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[3]] = lIIlllIIllIIIlII("q+ofmIAHCsD4WkOIjHmYOmmcDVxgjwNL", "kAFsN");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[4]] = lIIlllIIllIIIlIl("v/Hgwum24Iv4N8w6NU2K1UBkFTXhNsQZ", "WHryp");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[5]] = lIIlllIIllIIIlIl("yqWV9f9DxHoHbF/Q4auv0dDaB71qX2IM", "ZTjpq");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[9]] = lIIlllIIllIIIIll("KxwmJQsBCWc9FAocZzNCAwEmNgcLTi4/AwgL", "onGRb");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[10]] = lIIlllIIllIIIlII("nDrDr9sdeQKsOTR7SiTX4cDpNM6WLdoTzL6W+IEUq+Q=", "WctmJ");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[11]] = lIIlllIIllIIIIll("OSs5ECsMO2xeHQAxKRptKzwqECgbOmU=", "iILvM");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[13]] = lIIlllIIllIIIlII("gQgAchZGPprDN2au6U+CsA==", "hJiba");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[14]] = lIIlllIIllIIIlIl("sS73KDAxydHingiUIP+7Si20Xv6Nc+gCuSkex9T+G6k=", "pBXsM");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[15]] = lIIlllIIllIIIlII("IrDWExEMXi/nVc4U6WHKo/KuHDiQpUu1vYBH2ehsPJg=", "eQmyQ");
        ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[16]] = lIIlllIIllIIIlII("2dbiZ99aIDQ=", "KNcvH");
    }
    
    private static void lIIlllIIllIlIIII() {
        (lllIIIIllIIllI = new int[20])[0] = ((0xA5 ^ 0x89) & ~(0x36 ^ 0x1A));
        ImageGraphicsTest.lllIIIIllIIllI[1] = " ".length();
        ImageGraphicsTest.lllIIIIllIIllI[2] = "  ".length();
        ImageGraphicsTest.lllIIIIllIIllI[3] = "   ".length();
        ImageGraphicsTest.lllIIIIllIIllI[4] = (0x3C ^ 0x57 ^ (0xC4 ^ 0xAB));
        ImageGraphicsTest.lllIIIIllIIllI[5] = (0x75 ^ 0x70);
        ImageGraphicsTest.lllIIIIllIIllI[6] = (-(0xFFFFB3EE & 0x6E7D) & (0xFFFFEFFB & 0x33FF));
        ImageGraphicsTest.lllIIIIllIIllI[7] = (0xFFFFE13C & 0x1FEF);
        ImageGraphicsTest.lllIIIIllIIllI[8] = (60 + 77 - 57 + 129 ^ 89 + 73 - 83 + 102);
        ImageGraphicsTest.lllIIIIllIIllI[9] = (196 + 22 - 30 + 10 ^ 165 + 146 - 176 + 57);
        ImageGraphicsTest.lllIIIIllIIllI[10] = (0x9A ^ 0x9D);
        ImageGraphicsTest.lllIIIIllIIllI[11] = (0x3D ^ 0x66 ^ (0x95 ^ 0xC6));
        ImageGraphicsTest.lllIIIIllIIllI[12] = (((0x3F ^ 0x21) & ~(0xB9 ^ 0xA7)) ^ (0xC ^ 0x3E));
        ImageGraphicsTest.lllIIIIllIIllI[13] = (0xE1 ^ 0xB5 ^ (0x56 ^ 0xB));
        ImageGraphicsTest.lllIIIIllIIllI[14] = (156 + 37 - 30 + 44 ^ 44 + 147 - 95 + 101);
        ImageGraphicsTest.lllIIIIllIIllI[15] = (0x31 ^ 0x63 ^ (0x49 ^ 0x10));
        ImageGraphicsTest.lllIIIIllIIllI[16] = (0x61 ^ 0x6D);
        ImageGraphicsTest.lllIIIIllIIllI[17] = (0xFFFFD765 & 0x2BBA);
        ImageGraphicsTest.lllIIIIllIIllI[18] = (0xFFFFA35D & 0x5EFA);
        ImageGraphicsTest.lllIIIIllIIllI[19] = (0x17 ^ 0x1A);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIllIIIIlIIllllIlIlll) throws SlickException {
        this.testImage = new Image(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[2]]);
        this.preloaded = new Image(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[3]]);
        this.testFont = new AngelCodeFont(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[4]], ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[5]]);
        this.target = new Image(ImageGraphicsTest.lllIIIIllIIllI[6], ImageGraphicsTest.lllIIIIllIIllI[7]);
        this.cut = new Image(ImageGraphicsTest.lllIIIIllIIllI[8], ImageGraphicsTest.lllIIIIllIIllI[8]);
        this.gTarget = this.target.getGraphics();
        this.offscreenPreload = this.preloaded.getGraphics();
        this.offscreenPreload.drawString(ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[9]], 5.0f, 15.0f);
        this.offscreenPreload.setLineWidth(5.0f);
        this.offscreenPreload.setAntiAlias((boolean)(ImageGraphicsTest.lllIIIIllIIllI[1] != 0));
        this.offscreenPreload.setColor(Color.blue.brighter());
        this.offscreenPreload.drawOval(200.0f, 30.0f, 50.0f, 50.0f);
        this.offscreenPreload.setColor(Color.white);
        this.offscreenPreload.drawRect(190.0f, 20.0f, 70.0f, 70.0f);
        this.offscreenPreload.flush();
        if (lIIlllIIllIlIIIl(GraphicsFactory.usingFBO() ? 1 : 0)) {
            this.using = ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[10]];
            "".length();
            if ((0xA2 ^ 0xA7) <= 0) {
                return;
            }
        }
        else if (lIIlllIIllIlIIIl(GraphicsFactory.usingPBuffer() ? 1 : 0)) {
            this.using = ImageGraphicsTest.lllIIIIllIIIll[ImageGraphicsTest.lllIIIIllIIllI[11]];
        }
        System.out.println(this.preloaded.getColor(ImageGraphicsTest.lllIIIIllIIllI[12], ImageGraphicsTest.lllIIIIllIIllI[12]));
    }
    
    static {
        lIIlllIIllIlIIII();
        lIIlllIIllIIllII();
    }
    
    private static boolean lIIlllIIllIlIIIl(final int llllllllllllIllIIIIlIIlllIIIlIII) {
        return llllllllllllIllIIIIlIIlllIIIlIII != 0;
    }
    
    public static void main(final String[] llllllllllllIllIIIIlIIllllIIIIIl) {
        try {
            GraphicsFactory.setUseFBO((boolean)(ImageGraphicsTest.lllIIIIllIIllI[0] != 0));
            final AppGameContainer llllllllllllIllIIIIlIIllllIIIIll = new AppGameContainer(new ImageGraphicsTest());
            llllllllllllIllIIIIlIIllllIIIIll.setDisplayMode(ImageGraphicsTest.lllIIIIllIIllI[17], ImageGraphicsTest.lllIIIIllIIllI[18], (boolean)(ImageGraphicsTest.lllIIIIllIIllI[0] != 0));
            llllllllllllIllIIIIlIIllllIIIIll.start();
            "".length();
            if ((0x32 ^ 0x13 ^ (0x54 ^ 0x71)) < ((0xBA ^ 0xB0 ^ (0x2B ^ 0x79)) & (0x92 ^ 0x9A ^ (0xC6 ^ 0x96) ^ -" ".length()))) {
                return;
            }
        }
        catch (SlickException llllllllllllIllIIIIlIIllllIIIIlI) {
            llllllllllllIllIIIIlIIllllIIIIlI.printStackTrace();
        }
    }
    
    private static String lIIlllIIllIIIIll(String llllllllllllIllIIIIlIIlllIIllIll, final String llllllllllllIllIIIIlIIlllIIllIlI) {
        llllllllllllIllIIIIlIIlllIIllIll = new String(Base64.getDecoder().decode(llllllllllllIllIIIIlIIlllIIllIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIIlIIlllIIllIIl = new StringBuilder();
        final char[] llllllllllllIllIIIIlIIlllIIllIII = llllllllllllIllIIIIlIIlllIIllIlI.toCharArray();
        int llllllllllllIllIIIIlIIlllIIlIlll = ImageGraphicsTest.lllIIIIllIIllI[0];
        final String llllllllllllIllIIIIlIIlllIIlIIIl = (Object)llllllllllllIllIIIIlIIlllIIllIll.toCharArray();
        final boolean llllllllllllIllIIIIlIIlllIIlIIII = llllllllllllIllIIIIlIIlllIIlIIIl.length != 0;
        long llllllllllllIllIIIIlIIlllIIIllll = ImageGraphicsTest.lllIIIIllIIllI[0];
        while (lIIlllIIllIlIIlI((int)llllllllllllIllIIIIlIIlllIIIllll, llllllllllllIllIIIIlIIlllIIlIIII ? 1 : 0)) {
            final char llllllllllllIllIIIIlIIlllIIlllII = llllllllllllIllIIIIlIIlllIIlIIIl[llllllllllllIllIIIIlIIlllIIIllll];
            llllllllllllIllIIIIlIIlllIIllIIl.append((char)(llllllllllllIllIIIIlIIlllIIlllII ^ llllllllllllIllIIIIlIIlllIIllIII[llllllllllllIllIIIIlIIlllIIlIlll % llllllllllllIllIIIIlIIlllIIllIII.length]));
            "".length();
            ++llllllllllllIllIIIIlIIlllIIlIlll;
            ++llllllllllllIllIIIIlIIlllIIIllll;
            "".length();
            if ("   ".length() < -" ".length()) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIIlIIlllIIllIIl);
    }
}
