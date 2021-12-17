// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.imageout;

import java.util.Arrays;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.Image;

public class ImageOut
{
    public static /* synthetic */ String PNG;
    private static final /* synthetic */ String[] lllllIIlIlIlI;
    private static final /* synthetic */ int[] lllllIIlIllIl;
    public static /* synthetic */ String TGA;
    public static /* synthetic */ String JPG;
    
    private static void lIlIllIlllIIIIl() {
        (lllllIIlIlIlI = new String[ImageOut.lllllIIlIllIl[8]])[ImageOut.lllllIIlIllIl[0]] = lIlIllIllIllIIl("IDgbIBsQdg4tVwIkEzYSVTkPNlcBPh9iHhg3HSdXHDhaJBgHOxs2TVU=", "uVzBw");
        ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[2]] = lIlIllIllIllIlI("2bRRELx5NU6pqVrgCEP9l3+reRPx08jkJKlzxQhC4wNydnhQ7OXpOg==", "IfdOY");
        ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[3]] = lIlIllIllIllIIl("JjsGOicWdRM3awQnDiwuUyEIeD8bMEc8LgAhDjYqBzwINnFT", "sUgXK");
        ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[4]] = lIlIllIllIllIlI("NqNsxv2E3kcpahwCY6KdQ11ZRCZqKNvF0XRV37+Is9VnrZA66v4SBg==", "rTcrC");
        ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[5]] = lIlIllIllIlllII("aPd72wHgFrI=", "dmyAm");
        ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[6]] = lIlIllIllIlllII("2+d/LVrkbc4=", "OMgTo");
        ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[7]] = lIlIllIllIllIIl("PRoE", "WjcWi");
    }
    
    public static void write(final Image lllllllllllllIlIlIlllIlllIIlIIlI, final String lllllllllllllIlIlIlllIlllIIIllll) throws SlickException {
        write(lllllllllllllIlIlIlllIlllIIlIIlI, lllllllllllllIlIlIlllIlllIIIllll, (boolean)(ImageOut.lllllIIlIllIl[0] != 0));
    }
    
    private static String lIlIllIllIlllII(final String lllllllllllllIlIlIlllIllIlIIIlIl, final String lllllllllllllIlIlIlllIllIlIIIlII) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIllIlIIlIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIllIlIIIlII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher lllllllllllllIlIlIlllIllIlIIlIIl = Cipher.getInstance("Blowfish");
            lllllllllllllIlIlIlllIllIlIIlIIl.init(ImageOut.lllllIIlIllIl[3], lllllllllllllIlIlIlllIllIlIIlIlI);
            return new String(lllllllllllllIlIlIlllIllIlIIlIIl.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIllIlIIIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIllIlIIlIII) {
            lllllllllllllIlIlIlllIllIlIIlIII.printStackTrace();
            return null;
        }
    }
    
    static {
        lIlIllIlllllIII();
        lIlIllIlllIIIIl();
        DEFAULT_ALPHA_WRITE = (ImageOut.lllllIIlIllIl[0] != 0);
        ImageOut.TGA = ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[5]];
        ImageOut.PNG = ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[6]];
        ImageOut.JPG = ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[7]];
    }
    
    private static String lIlIllIllIllIIl(String lllllllllllllIlIlIlllIllIlIlIlll, final String lllllllllllllIlIlIlllIllIlIllIll) {
        lllllllllllllIlIlIlllIllIlIlIlll = new String(Base64.getDecoder().decode(lllllllllllllIlIlIlllIllIlIlIlll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIlIlIlllIllIlIllIlI = new StringBuilder();
        final char[] lllllllllllllIlIlIlllIllIlIllIIl = lllllllllllllIlIlIlllIllIlIllIll.toCharArray();
        int lllllllllllllIlIlIlllIllIlIllIII = ImageOut.lllllIIlIllIl[0];
        final float lllllllllllllIlIlIlllIllIlIlIIlI = (Object)lllllllllllllIlIlIlllIllIlIlIlll.toCharArray();
        final Exception lllllllllllllIlIlIlllIllIlIlIIIl = (Exception)lllllllllllllIlIlIlllIllIlIlIIlI.length;
        boolean lllllllllllllIlIlIlllIllIlIlIIII = ImageOut.lllllIIlIllIl[0] != 0;
        while (lIlIllIlllllIlI(lllllllllllllIlIlIlllIllIlIlIIII ? 1 : 0, (int)lllllllllllllIlIlIlllIllIlIlIIIl)) {
            final char lllllllllllllIlIlIlllIllIlIlllIl = lllllllllllllIlIlIlllIllIlIlIIlI[lllllllllllllIlIlIlllIllIlIlIIII];
            lllllllllllllIlIlIlllIllIlIllIlI.append((char)(lllllllllllllIlIlIlllIllIlIlllIl ^ lllllllllllllIlIlIlllIllIlIllIIl[lllllllllllllIlIlIlllIllIlIllIII % lllllllllllllIlIlIlllIllIlIllIIl.length]));
            "".length();
            ++lllllllllllllIlIlIlllIllIlIllIII;
            ++lllllllllllllIlIlIlllIllIlIlIIII;
            "".length();
            if ("   ".length() <= " ".length()) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIlIlIlllIllIlIllIlI);
    }
    
    private static void lIlIllIlllllIII() {
        (lllllIIlIllIl = new int[10])[0] = ((0xE1 ^ 0xBC) & ~(0x5 ^ 0x58));
        ImageOut.lllllIIlIllIl[1] = (0x35 ^ 0x1B);
        ImageOut.lllllIIlIllIl[2] = " ".length();
        ImageOut.lllllIIlIllIl[3] = "  ".length();
        ImageOut.lllllIIlIllIl[4] = "   ".length();
        ImageOut.lllllIIlIllIl[5] = (0x2 ^ 0x6);
        ImageOut.lllllIIlIllIl[6] = (0x73 ^ 0x76);
        ImageOut.lllllIIlIllIl[7] = (0x42 ^ 0x17 ^ (0x5F ^ 0xC));
        ImageOut.lllllIIlIllIl[8] = (0xA7 ^ 0xA0);
        ImageOut.lllllIIlIllIl[9] = (0x1 ^ 0x9);
    }
    
    public static void write(final Image lllllllllllllIlIlIlllIlllIIllIIl, final String lllllllllllllIlIlIlllIlllIIlllII, final OutputStream lllllllllllllIlIlIlllIlllIIllIll, final boolean lllllllllllllIlIlIlllIlllIIllIlI) throws SlickException {
        try {
            final ImageWriter lllllllllllllIlIlIlllIlllIIlllll = ImageWriterFactory.getWriterForFormat(lllllllllllllIlIlIlllIlllIIlllII);
            lllllllllllllIlIlIlllIlllIIlllll.saveImage(lllllllllllllIlIlIlllIlllIIllIIl, lllllllllllllIlIlIlllIlllIIlllII, lllllllllllllIlIlIlllIlllIIllIll, lllllllllllllIlIlIlllIlllIIllIlI);
            "".length();
            if (-(0x27 ^ 0x22) >= 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIlllIlllIIllllI) {
            throw new SlickException(String.valueOf(new StringBuilder().append(ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[0]]).append(lllllllllllllIlIlIlllIlllIIlllII)), lllllllllllllIlIlIlllIlllIIllllI);
        }
    }
    
    public static void write(final Image lllllllllllllIlIlIlllIllIllIllll, final String lllllllllllllIlIlIlllIllIllIlllI, final String lllllllllllllIlIlIlllIllIllIllIl, final boolean lllllllllllllIlIlIlllIllIllIlIII) throws SlickException {
        try {
            write(lllllllllllllIlIlIlllIllIllIllll, lllllllllllllIlIlIlllIllIllIlllI, new FileOutputStream(lllllllllllllIlIlIlllIllIllIllIl), lllllllllllllIlIlIlllIllIllIlIII);
            "".length();
            if ("   ".length() <= 0) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIlllIllIlllIIII) {
            throw new SlickException(String.valueOf(new StringBuilder().append(ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[4]]).append(lllllllllllllIlIlIlllIllIllIllIl)), lllllllllllllIlIlIlllIllIlllIIII);
        }
    }
    
    public static void write(final Image lllllllllllllIlIlIlllIlllIIIIIll, final String lllllllllllllIlIlIlllIlllIIIIIlI, final boolean lllllllllllllIlIlIlllIlllIIIIIIl) throws SlickException {
        try {
            final int lllllllllllllIlIlIlllIlllIIIlIIl = lllllllllllllIlIlIlllIlllIIIIIlI.lastIndexOf(ImageOut.lllllIIlIllIl[1]);
            if (lIlIllIlllllIIl(lllllllllllllIlIlIlllIlllIIIlIIl)) {
                throw new SlickException(String.valueOf(new StringBuilder().append(ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[2]]).append(lllllllllllllIlIlIlllIlllIIIIIlI)));
            }
            final String lllllllllllllIlIlIlllIlllIIIlIII = lllllllllllllIlIlIlllIlllIIIIIlI.substring(lllllllllllllIlIlIlllIlllIIIlIIl + ImageOut.lllllIIlIllIl[2]);
            write(lllllllllllllIlIlIlllIlllIIIIIll, lllllllllllllIlIlIlllIlllIIIlIII, new FileOutputStream(lllllllllllllIlIlIlllIlllIIIIIlI), lllllllllllllIlIlIlllIlllIIIIIIl);
            "".length();
            if ((0x47 ^ 0x43) == ((0x67 ^ 0x22) & ~(0x1D ^ 0x58))) {
                return;
            }
        }
        catch (IOException lllllllllllllIlIlIlllIlllIIIIlll) {
            throw new SlickException(String.valueOf(new StringBuilder().append(ImageOut.lllllIIlIlIlI[ImageOut.lllllIIlIllIl[3]]).append(lllllllllllllIlIlIlllIlllIIIIIlI)), lllllllllllllIlIlIlllIlllIIIIlll);
        }
    }
    
    public static void write(final Image lllllllllllllIlIlIlllIllIllllIll, final String lllllllllllllIlIlIlllIllIllllIlI, final String lllllllllllllIlIlIlllIllIllllIIl) throws SlickException {
        write(lllllllllllllIlIlIlllIllIllllIll, lllllllllllllIlIlIlllIllIllllIlI, lllllllllllllIlIlIlllIllIllllIIl, (boolean)(ImageOut.lllllIIlIllIl[0] != 0));
    }
    
    private static boolean lIlIllIlllllIlI(final int lllllllllllllIlIlIlllIllIIllIIlI, final int lllllllllllllIlIlIlllIllIIllIIIl) {
        return lllllllllllllIlIlIlllIllIIllIIlI < lllllllllllllIlIlIlllIllIIllIIIl;
    }
    
    public static void write(final Image lllllllllllllIlIlIlllIlllIlIIlll, final String lllllllllllllIlIlIlllIlllIlIlIIl, final OutputStream lllllllllllllIlIlIlllIlllIlIlIII) throws SlickException {
        write(lllllllllllllIlIlIlllIlllIlIIlll, lllllllllllllIlIlIlllIlllIlIlIIl, lllllllllllllIlIlIlllIlllIlIlIII, (boolean)(ImageOut.lllllIIlIllIl[0] != 0));
    }
    
    private static String lIlIllIllIllIlI(final String lllllllllllllIlIlIlllIllIIlllIII, final String lllllllllllllIlIlIlllIllIIlllIIl) {
        try {
            final SecretKeySpec lllllllllllllIlIlIlllIllIIllllIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIlIlllIllIIlllIIl.getBytes(StandardCharsets.UTF_8)), ImageOut.lllllIIlIllIl[9]), "DES");
            final Cipher lllllllllllllIlIlIlllIllIIllllII = Cipher.getInstance("DES");
            lllllllllllllIlIlIlllIllIIllllII.init(ImageOut.lllllIIlIllIl[3], lllllllllllllIlIlIlllIllIIllllIl);
            return new String(lllllllllllllIlIlIlllIllIIllllII.doFinal(Base64.getDecoder().decode(lllllllllllllIlIlIlllIllIIlllIII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIlIlllIllIIlllIll) {
            lllllllllllllIlIlIlllIllIIlllIll.printStackTrace();
            return null;
        }
    }
    
    public static String[] getSupportedFormats() {
        return ImageWriterFactory.getSupportedFormats();
    }
    
    private static boolean lIlIllIlllllIIl(final int lllllllllllllIlIlIlllIllIIlIllll) {
        return lllllllllllllIlIlIlllIllIIlIllll < 0;
    }
}
