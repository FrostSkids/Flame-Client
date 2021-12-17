// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.tests;

import org.newdawn.slick.Game;
import org.newdawn.slick.AppGameContainer;
import java.io.IOException;
import org.newdawn.slick.particles.ParticleIO;
import java.util.Arrays;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.particles.ParticleSystem;
import org.newdawn.slick.BasicGame;

public class ImageOutTest extends BasicGame
{
    private /* synthetic */ ParticleSystem fire;
    private /* synthetic */ String message;
    private /* synthetic */ GameContainer container;
    private static final /* synthetic */ String[] llIIIllIIlIIlI;
    private /* synthetic */ Image copy;
    private /* synthetic */ Graphics g;
    private static final /* synthetic */ int[] llIIIllIIlIlII;
    
    @Override
    public void keyPressed(final int llllllllllllIlllIlIIllIIlIIlIlll, final char llllllllllllIlllIlIIllIIlIIllIIl) {
        if (lIIIlIlIIIlllIll(llllllllllllIlllIlIIllIIlIIlIlll, ImageOutTest.llIIIllIIlIlII[1])) {
            this.container.exit();
        }
    }
    
    public void render(final GameContainer llllllllllllIlllIlIIllIIlIllIlIl, final Graphics llllllllllllIlllIlIIllIIlIllIIlI) {
        llllllllllllIlllIlIIllIIlIllIIlI.drawString(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[7]], 10.0f, 50.0f);
        llllllllllllIlllIlIIllIIlIllIIlI.drawString(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[8]], 10.0f, 70.0f);
        llllllllllllIlllIlIIllIIlIllIIlI.drawString(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[9]], 10.0f, 90.0f);
        llllllllllllIlllIlIIllIIlIllIIlI.setDrawMode(Graphics.MODE_ADD);
        llllllllllllIlllIlIIllIIlIllIIlI.drawImage(this.copy, 200.0f, 300.0f);
        llllllllllllIlllIlIIllIIlIllIIlI.setDrawMode(Graphics.MODE_NORMAL);
        llllllllllllIlllIlIIllIIlIllIIlI.drawString(this.message, 10.0f, 400.0f);
        llllllllllllIlllIlIIllIIlIllIIlI.drawRect(200.0f, 0.0f, 400.0f, 300.0f);
        llllllllllllIlllIlIIllIIlIllIIlI.translate(400.0f, 250.0f);
        this.fire.render();
        this.g = llllllllllllIlllIlIIllIIlIllIIlI;
    }
    
    private void writeTo(final String llllllllllllIlllIlIIllIIlIlIllII) throws SlickException {
        this.g.copyArea(this.copy, ImageOutTest.llIIIllIIlIlII[10], ImageOutTest.llIIIllIIlIlII[0]);
        ImageOut.write(this.copy, llllllllllllIlllIlIIllIIlIlIllII);
        this.message = String.valueOf(new StringBuilder().append(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[11]]).append(llllllllllllIlllIlIIllIIlIlIllII));
    }
    
    private static void lIIIlIlIIIllIlll() {
        (llIIIllIIlIIlI = new String[ImageOutTest.llIIIllIIlIlII[20]])[ImageOutTest.llIIIllIIlIlII[0]] = lIIIlIlIIIllIIIl("EwQrFjF6Jj8FdA4MOQU=", "ZiJqT");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[1]] = lIIIlIlIIIllIIIl("PQcWDQ4oFgRWGTARERwHZxoIFQ==", "Ibeyj");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[2]] = lIIIlIlIIIllIIIl("HiUlCiQ8ZDgJYTQrLQJhKCU+Eig7KClGMiE3OAMsKw==", "XDLfA");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[5]] = lIIIlIlIIIllIIlI("nrw137XWIZGyUIujEFEeCj08Iq7IpZmJ", "wCZjJ");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[6]] = lIIIlIlIIIllIIIl("Sg==", "fWjPO");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[7]] = lIIIlIlIIIllIIll("Aqin+KE9xU+RxnXKKmaaUo5I5yXe/fHz", "KXuvG");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[8]] = lIIIlIlIIIllIIlI("1VJkbLhDej03EOZdCC4PGsNR5u2AVu2o", "GvpdX");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[9]] = lIIIlIlIIIllIIlI("Y97tXsI92qk14u23IGA1KkjutP+qhRUY", "Ruhpz");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[11]] = lIIIlIlIIIllIIIl("HT8vLSwvI2Y=", "JMFYX");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[13]] = lIIIlIlIIIllIIlI("LTYyyUcag3+d0F7DinebkQ58JjW3cUOZ", "QbIRB");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[15]] = lIIIlIlIIIllIIlI("UhFM3KyYeifcbNcfV28bIA6BoIUuLkyw", "rWpJm");
        ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[17]] = lIIIlIlIIIllIIlI("3LOnlO/tUFmbvZQDxpFqpqkyQ/qCEVxl", "AGAkw");
    }
    
    private static String lIIIlIlIIIllIIll(final String llllllllllllIlllIlIIllIIlIIIllll, final String llllllllllllIlllIlIIllIIlIIIlllI) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIllIIlIIlIIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIIlIIIlllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlllIlIIllIIlIIlIIIl = Cipher.getInstance("Blowfish");
            llllllllllllIlllIlIIllIIlIIlIIIl.init(ImageOutTest.llIIIllIIlIlII[2], llllllllllllIlllIlIIllIIlIIlIIlI);
            return new String(llllllllllllIlllIlIIllIIlIIlIIIl.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIIlIIIllll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIllIIlIIlIIII) {
            llllllllllllIlllIlIIllIIlIIlIIII.printStackTrace();
            return null;
        }
    }
    
    private static String lIIIlIlIIIllIIlI(final String llllllllllllIlllIlIIllIIIllIlIII, final String llllllllllllIlllIlIIllIIIllIIlll) {
        try {
            final SecretKeySpec llllllllllllIlllIlIIllIIIllIllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIlIIllIIIllIIlll.getBytes(StandardCharsets.UTF_8)), ImageOutTest.llIIIllIIlIlII[11]), "DES");
            final Cipher llllllllllllIlllIlIIllIIIllIllII = Cipher.getInstance("DES");
            llllllllllllIlllIlIIllIIIllIllII.init(ImageOutTest.llIIIllIIlIlII[2], llllllllllllIlllIlIIllIIIllIllIl);
            return new String(llllllllllllIlllIlIIllIIIllIllII.doFinal(Base64.getDecoder().decode(llllllllllllIlllIlIIllIIIllIlIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlllIlIIllIIIllIlIll) {
            llllllllllllIlllIlIIllIIIllIlIll.printStackTrace();
            return null;
        }
    }
    
    public ImageOutTest() {
        super(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[0]]);
    }
    
    @Override
    public void init(final GameContainer llllllllllllIlllIlIIllIIlIlllIll) throws SlickException {
        this.container = llllllllllllIlllIlIIllIIlIlllIll;
        try {
            this.fire = ParticleIO.loadConfiguredSystem(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[1]]);
            "".length();
            if (-"   ".length() > 0) {
                return;
            }
        }
        catch (IOException llllllllllllIlllIlIIllIIllIIIIIl) {
            throw new SlickException(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[2]], llllllllllllIlllIlIIllIIllIIIIIl);
        }
        this.copy = new Image(ImageOutTest.llIIIllIIlIlII[3], ImageOutTest.llIIIllIIlIlII[4]);
        final String[] llllllllllllIlllIlIIllIIlIllllIl = ImageOut.getSupportedFormats();
        this.message = ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[5]];
        int llllllllllllIlllIlIIllIIllIIIIII = ImageOutTest.llIIIllIIlIlII[0];
        while (lIIIlIlIIIlllIIl(llllllllllllIlllIlIIllIIllIIIIII, llllllllllllIlllIlIIllIIlIllllIl.length)) {
            this.message = String.valueOf(new StringBuilder().append(this.message).append(llllllllllllIlllIlIIllIIlIllllIl[llllllllllllIlllIlIIllIIllIIIIII]));
            if (lIIIlIlIIIlllIIl(llllllllllllIlllIlIIllIIllIIIIII, llllllllllllIlllIlIIllIIlIllllIl.length - ImageOutTest.llIIIllIIlIlII[1])) {
                this.message = String.valueOf(new StringBuilder().append(this.message).append(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[6]]));
            }
            ++llllllllllllIlllIlIIllIIllIIIIII;
            "".length();
            if ("   ".length() == 0) {
                return;
            }
        }
    }
    
    private static boolean lIIIlIlIIIlllIll(final int llllllllllllIlllIlIIllIIIllIIIlI, final int llllllllllllIlllIlIIllIIIllIIIIl) {
        return llllllllllllIlllIlIIllIIIllIIIlI == llllllllllllIlllIlIIllIIIllIIIIl;
    }
    
    @Override
    public void update(final GameContainer llllllllllllIlllIlIIllIIlIlIIlII, final int llllllllllllIlllIlIIllIIlIlIIIll) throws SlickException {
        this.fire.update(llllllllllllIlllIlIIllIIlIlIIIll);
        if (lIIIlIlIIIlllIlI(llllllllllllIlllIlIIllIIlIlIIlII.getInput().isKeyPressed(ImageOutTest.llIIIllIIlIlII[12]) ? 1 : 0)) {
            this.writeTo(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[13]]);
        }
        if (lIIIlIlIIIlllIlI(llllllllllllIlllIlIIllIIlIlIIlII.getInput().isKeyPressed(ImageOutTest.llIIIllIIlIlII[14]) ? 1 : 0)) {
            this.writeTo(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[15]]);
        }
        if (lIIIlIlIIIlllIlI(llllllllllllIlllIlIIllIIlIlIIlII.getInput().isKeyPressed(ImageOutTest.llIIIllIIlIlII[16]) ? 1 : 0)) {
            this.writeTo(ImageOutTest.llIIIllIIlIIlI[ImageOutTest.llIIIllIIlIlII[17]]);
        }
    }
    
    public static void main(final String[] llllllllllllIlllIlIIllIIlIIlllll) {
        try {
            final AppGameContainer llllllllllllIlllIlIIllIIlIlIIIIl = new AppGameContainer(new ImageOutTest());
            llllllllllllIlllIlIIllIIlIlIIIIl.setDisplayMode(ImageOutTest.llIIIllIIlIlII[18], ImageOutTest.llIIIllIIlIlII[19], (boolean)(ImageOutTest.llIIIllIIlIlII[0] != 0));
            llllllllllllIlllIlIIllIIlIlIIIIl.start();
            "".length();
            if ("   ".length() == -" ".length()) {
                return;
            }
        }
        catch (SlickException llllllllllllIlllIlIIllIIlIlIIIII) {
            llllllllllllIlllIlIIllIIlIlIIIII.printStackTrace();
        }
    }
    
    private static void lIIIlIlIIIlllIII() {
        (llIIIllIIlIlII = new int[21])[0] = ((0x35 ^ 0x7E) & ~(0xC3 ^ 0x88));
        ImageOutTest.llIIIllIIlIlII[1] = " ".length();
        ImageOutTest.llIIIllIIlIlII[2] = "  ".length();
        ImageOutTest.llIIIllIIlIlII[3] = (0xFFFFAD9D & 0x53F2);
        ImageOutTest.llIIIllIIlIlII[4] = (-(0xFFFFF3C3 & 0x4C7D) & (0xFFFFD5FE & 0x6B6D));
        ImageOutTest.llIIIllIIlIlII[5] = "   ".length();
        ImageOutTest.llIIIllIIlIlII[6] = (0x13 ^ 0x65 ^ (0xC7 ^ 0xB5));
        ImageOutTest.llIIIllIIlIlII[7] = (0x30 ^ 0x35);
        ImageOutTest.llIIIllIIlIlII[8] = (86 + 34 - 99 + 122 ^ 100 + 100 - 135 + 72);
        ImageOutTest.llIIIllIIlIlII[9] = (0x97 ^ 0xC3 ^ (0x3A ^ 0x69));
        ImageOutTest.llIIIllIIlIlII[10] = 47 + 98 - 127 + 138 + (112 + 75 - 49 + 4) - (0xFFFFED1F & 0x13FA) + (47 + 150 - 88 + 75);
        ImageOutTest.llIIIllIIlIlII[11] = (135 + 29 - 103 + 75 ^ 85 + 21 - 14 + 36);
        ImageOutTest.llIIIllIIlIlII[12] = (0x55 ^ 0x4C);
        ImageOutTest.llIIIllIIlIlII[13] = (0xC1 ^ 0x83 ^ (0xD ^ 0x46));
        ImageOutTest.llIIIllIIlIlII[14] = (12 + 105 + 50 + 16 ^ 33 + 32 + 17 + 65);
        ImageOutTest.llIIIllIIlIlII[15] = (0x6F ^ 0x65);
        ImageOutTest.llIIIllIIlIlII[16] = (146 + 69 - 143 + 77 ^ 30 + 113 - 55 + 41);
        ImageOutTest.llIIIllIIlIlII[17] = (0x90 ^ 0x9B);
        ImageOutTest.llIIIllIIlIlII[18] = (0xFFFF97E8 & 0x6B37);
        ImageOutTest.llIIIllIIlIlII[19] = (-(0xFFFFBBDD & 0x6DA6) & (0xFFFFABDF & 0x7FFB));
        ImageOutTest.llIIIllIIlIlII[20] = (1 + 73 + 63 + 65 ^ 87 + 73 - 0 + 38);
    }
    
    private static boolean lIIIlIlIIIlllIIl(final int llllllllllllIlllIlIIllIIIlIllllI, final int llllllllllllIlllIlIIllIIIlIlllIl) {
        return llllllllllllIlllIlIIllIIIlIllllI < llllllllllllIlllIlIIllIIIlIlllIl;
    }
    
    private static boolean lIIIlIlIIIlllIlI(final int llllllllllllIlllIlIIllIIIlIllIll) {
        return llllllllllllIlllIlIIllIIIlIllIll != 0;
    }
    
    private static String lIIIlIlIIIllIIIl(String llllllllllllIlllIlIIllIIIllllIlI, final String llllllllllllIlllIlIIllIIIllllllI) {
        llllllllllllIlllIlIIllIIIllllIlI = (boolean)new String(Base64.getDecoder().decode(((String)llllllllllllIlllIlIIllIIIllllIlI).getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIlllIlIIllIIIlllllIl = new StringBuilder();
        final char[] llllllllllllIlllIlIIllIIIlllllII = llllllllllllIlllIlIIllIIIllllllI.toCharArray();
        int llllllllllllIlllIlIIllIIIllllIll = ImageOutTest.llIIIllIIlIlII[0];
        final int llllllllllllIlllIlIIllIIIlllIlIl = (Object)((String)llllllllllllIlllIlIIllIIIllllIlI).toCharArray();
        final int llllllllllllIlllIlIIllIIIlllIlII = llllllllllllIlllIlIIllIIIlllIlIl.length;
        byte llllllllllllIlllIlIIllIIIlllIIll = (byte)ImageOutTest.llIIIllIIlIlII[0];
        while (lIIIlIlIIIlllIIl(llllllllllllIlllIlIIllIIIlllIIll, llllllllllllIlllIlIIllIIIlllIlII)) {
            final char llllllllllllIlllIlIIllIIlIIIIIII = llllllllllllIlllIlIIllIIIlllIlIl[llllllllllllIlllIlIIllIIIlllIIll];
            llllllllllllIlllIlIIllIIIlllllIl.append((char)(llllllllllllIlllIlIIllIIlIIIIIII ^ llllllllllllIlllIlIIllIIIlllllII[llllllllllllIlllIlIIllIIIllllIll % llllllllllllIlllIlIIllIIIlllllII.length]));
            "".length();
            ++llllllllllllIlllIlIIllIIIllllIll;
            ++llllllllllllIlllIlIIllIIIlllIIll;
            "".length();
            if ((0xCC ^ 0xA9 ^ (0x6F ^ 0xE)) > (0x23 ^ 0x62 ^ (0x7 ^ 0x42))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIlllIlIIllIIIlllllIl);
    }
    
    static {
        lIIIlIlIIIlllIII();
        lIIIlIlIIIllIlll();
    }
}
