// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.security.AccessController;
import org.newdawn.slick.util.Log;
import java.util.Arrays;
import java.security.PrivilegedAction;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.security.MessageDigest;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class ImageDataFactory
{
    private static /* synthetic */ boolean usePngLoader;
    private static /* synthetic */ boolean pngLoaderPropertyChecked;
    private static final /* synthetic */ int[] llIlllllIllIll;
    private static final /* synthetic */ String[] llIlllllIllIlI;
    
    public static LoadableImageData getImageDataFor(String llllllllllllIllIIIlIlllIIIlllllI) {
        checkProperty();
        llllllllllllIllIIIlIlllIIIlllllI = (float)((String)llllllllllllIllIIIlIlllIIIlllllI).toLowerCase();
        if (lIIllIllIlIlIIlI(((String)llllllllllllIllIIIlIlllIIIlllllI).endsWith(ImageDataFactory.llIlllllIllIlI[ImageDataFactory.llIlllllIllIll[1]]) ? 1 : 0)) {
            return new TGAImageData();
        }
        if (lIIllIllIlIlIIlI(((String)llllllllllllIllIIIlIlllIIIlllllI).endsWith(ImageDataFactory.llIlllllIllIlI[ImageDataFactory.llIlllllIllIll[0]]) ? 1 : 0)) {
            final CompositeImageData llllllllllllIllIIIlIlllIIlIIIIII = new CompositeImageData();
            if (lIIllIllIlIlIIlI(ImageDataFactory.usePngLoader ? 1 : 0)) {
                llllllllllllIllIIIlIlllIIlIIIIII.add(new PNGImageData());
            }
            llllllllllllIllIIIlIlllIIlIIIIII.add(new ImageIOImageData());
            return llllllllllllIllIIIlIlllIIlIIIIII;
        }
        return new ImageIOImageData();
    }
    
    private static void lIIllIllIlIIllll() {
        (llIlllllIllIlI = new String[ImageDataFactory.llIlllllIllIll[3]])[ImageDataFactory.llIlllllIllIll[1]] = lIIllIllIlIIllIl("eTgNLw==", "WLjNs");
        ImageDataFactory.llIlllllIllIlI[ImageDataFactory.llIlllllIllIll[0]] = lIIllIllIlIIllIl("ST4UDg==", "gNzig");
        ImageDataFactory.llIlllllIllIlI[ImageDataFactory.llIlllllIllIll[2]] = lIIllIllIlIIlllI("eMH1jJdZUg2YgX89BcOf4s6dafk5ni3dAKALp7KrWV4=", "YmORs");
    }
    
    private static boolean lIIllIllIlIlIIlI(final int llllllllllllIllIIIlIlllIIIIIllll) {
        return llllllllllllIllIIIlIlllIIIIIllll != 0;
    }
    
    static {
        lIIllIllIlIlIIII();
        lIIllIllIlIIllll();
        PNG_LOADER = ImageDataFactory.llIlllllIllIlI[ImageDataFactory.llIlllllIllIll[2]];
        ImageDataFactory.usePngLoader = (ImageDataFactory.llIlllllIllIll[0] != 0);
        ImageDataFactory.pngLoaderPropertyChecked = (ImageDataFactory.llIlllllIllIll[1] != 0);
    }
    
    private static String lIIllIllIlIIllIl(String llllllllllllIllIIIlIlllIIIIlllIl, final String llllllllllllIllIIIlIlllIIIlIIIIl) {
        llllllllllllIllIIIlIlllIIIIlllIl = new String(Base64.getDecoder().decode(llllllllllllIllIIIlIlllIIIIlllIl.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder llllllllllllIllIIIlIlllIIIlIIIII = new StringBuilder();
        final char[] llllllllllllIllIIIlIlllIIIIlllll = llllllllllllIllIIIlIlllIIIlIIIIl.toCharArray();
        int llllllllllllIllIIIlIlllIIIIllllI = ImageDataFactory.llIlllllIllIll[1];
        final short llllllllllllIllIIIlIlllIIIIllIII = (Object)llllllllllllIllIIIlIlllIIIIlllIl.toCharArray();
        final char llllllllllllIllIIIlIlllIIIIlIlll = (char)llllllllllllIllIIIlIlllIIIIllIII.length;
        String llllllllllllIllIIIlIlllIIIIlIllI = (String)ImageDataFactory.llIlllllIllIll[1];
        while (lIIllIllIlIlIIll((int)llllllllllllIllIIIlIlllIIIIlIllI, llllllllllllIllIIIlIlllIIIIlIlll)) {
            final char llllllllllllIllIIIlIlllIIIlIIIll = llllllllllllIllIIIlIlllIIIIllIII[llllllllllllIllIIIlIlllIIIIlIllI];
            llllllllllllIllIIIlIlllIIIlIIIII.append((char)(llllllllllllIllIIIlIlllIIIlIIIll ^ llllllllllllIllIIIlIlllIIIIlllll[llllllllllllIllIIIlIlllIIIIllllI % llllllllllllIllIIIlIlllIIIIlllll.length]));
            "".length();
            ++llllllllllllIllIIIlIlllIIIIllllI;
            ++llllllllllllIllIIIlIlllIIIIlIllI;
            "".length();
            if ((0x9E ^ 0x9A) <= ((0xAC ^ 0x95) & ~(0x19 ^ 0x20))) {
                return null;
            }
        }
        return String.valueOf(llllllllllllIllIIIlIlllIIIlIIIII);
    }
    
    private static boolean lIIllIllIlIlIIIl(final int llllllllllllIllIIIlIlllIIIIIllIl) {
        return llllllllllllIllIIIlIlllIIIIIllIl == 0;
    }
    
    private static void lIIllIllIlIlIIII() {
        (llIlllllIllIll = new int[4])[0] = " ".length();
        ImageDataFactory.llIlllllIllIll[1] = ((0x77 ^ 0x58 ^ (0x9F ^ 0xB7)) & (0xA4 ^ 0xB9 ^ (0xA9 ^ 0xB3) ^ -" ".length()));
        ImageDataFactory.llIlllllIllIll[2] = "  ".length();
        ImageDataFactory.llIlllllIllIll[3] = "   ".length();
    }
    
    private static String lIIllIllIlIIlllI(final String llllllllllllIllIIIlIlllIIIllIIlI, final String llllllllllllIllIIIlIlllIIIllIIIl) {
        try {
            final SecretKeySpec llllllllllllIllIIIlIlllIIIllIlIl = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIlIlllIIIllIIIl.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIlIlllIIIllIlII = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIlIlllIIIllIlII.init(ImageDataFactory.llIlllllIllIll[2], llllllllllllIllIIIlIlllIIIllIlIl);
            return new String(llllllllllllIllIIIlIlllIIIllIlII.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIlIlllIIIllIIlI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIlIlllIIIllIIll) {
            llllllllllllIllIIIlIlllIIIllIIll.printStackTrace();
            return null;
        }
    }
    
    private static void checkProperty() {
        if (lIIllIllIlIlIIIl(ImageDataFactory.pngLoaderPropertyChecked ? 1 : 0)) {
            ImageDataFactory.pngLoaderPropertyChecked = (ImageDataFactory.llIlllllIllIll[0] != 0);
            try {
                AccessController.doPrivileged((PrivilegedAction<Object>)new PrivilegedAction() {
                    private static final /* synthetic */ String[] llIIlIlllIIIIl;
                    private static final /* synthetic */ int[] llIIlIlllIIIlI;
                    
                    private static void lIIIllIlllIllllI() {
                        (llIIlIlllIIIIl = new String[ImageDataFactory$1.llIIlIlllIIIlI[3]])[ImageDataFactory$1.llIIlIlllIIIlI[0]] = lIIIllIlllIlllIl("15kpzYr8O70eZ1OzAmVTY1M09Qahdfpx625Mn9/jIkA=", "FskUg");
                        ImageDataFactory$1.llIIlIlllIIIIl[ImageDataFactory$1.llIIlIlllIIIlI[1]] = lIIIllIlllIlllIl("p6rNnJPw2iQ=", "dVPoe");
                        ImageDataFactory$1.llIIlIlllIIIIl[ImageDataFactory$1.llIIlIlllIIIlI[2]] = lIIIllIlllIlllIl("XXber1jsdYMSgNv2ghUxkSS5uSrP5TmD", "HQokx");
                    }
                    
                    static {
                        lIIIllIlllIlllll();
                        lIIIllIlllIllllI();
                    }
                    
                    private static String lIIIllIlllIlllIl(final String llllllllllllIlllIIIlIIlIIlIlIlII, final String llllllllllllIlllIIIlIIlIIlIlIIIl) {
                        try {
                            final SecretKeySpec llllllllllllIlllIIIlIIlIIlIlIlll = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIlllIIIlIIlIIlIlIIIl.getBytes(StandardCharsets.UTF_8)), ImageDataFactory$1.llIIlIlllIIIlI[4]), "DES");
                            final Cipher llllllllllllIlllIIIlIIlIIlIlIllI = Cipher.getInstance("DES");
                            llllllllllllIlllIIIlIIlIIlIlIllI.init(ImageDataFactory$1.llIIlIlllIIIlI[2], llllllllllllIlllIIIlIIlIIlIlIlll);
                            return new String(llllllllllllIlllIIIlIIlIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIlllIIIlIIlIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
                        }
                        catch (Exception llllllllllllIlllIIIlIIlIIlIlIlIl) {
                            llllllllllllIlllIIIlIIlIIlIlIlIl.printStackTrace();
                            return null;
                        }
                    }
                    
                    public Object run() {
                        final String llllllllllllIlllIIIlIIlIIlIlllIl = System.getProperty(ImageDataFactory$1.llIIlIlllIIIIl[ImageDataFactory$1.llIIlIlllIIIlI[0]]);
                        if (lIIIllIllllIIIII(ImageDataFactory$1.llIIlIlllIIIIl[ImageDataFactory$1.llIIlIlllIIIlI[1]].equalsIgnoreCase(llllllllllllIlllIIIlIIlIIlIlllIl) ? 1 : 0)) {
                            ImageDataFactory.usePngLoader = (boolean)(ImageDataFactory$1.llIIlIlllIIIlI[0] != 0);
                            "".length();
                        }
                        Log.info(String.valueOf(new StringBuilder().append(ImageDataFactory$1.llIIlIlllIIIIl[ImageDataFactory$1.llIIlIlllIIIlI[2]]).append(ImageDataFactory.usePngLoader)));
                        return null;
                    }
                    
                    private static void lIIIllIlllIlllll() {
                        (llIIlIlllIIIlI = new int[5])[0] = ((0xD6 ^ 0x82 ^ (0x12 ^ 0x6A)) & (61 + 39 + 80 + 5 ^ 116 + 143 - 164 + 54 ^ -" ".length()));
                        ImageDataFactory$1.llIIlIlllIIIlI[1] = " ".length();
                        ImageDataFactory$1.llIIlIlllIIIlI[2] = "  ".length();
                        ImageDataFactory$1.llIIlIlllIIIlI[3] = "   ".length();
                        ImageDataFactory$1.llIIlIlllIIIlI[4] = (0x71 ^ 0x79);
                    }
                    
                    private static boolean lIIIllIllllIIIII(final int llllllllllllIlllIIIlIIlIIlIIllIl) {
                        return llllllllllllIlllIIIlIIlIIlIIllIl != 0;
                    }
                });
                "".length();
                "".length();
                if (null != null) {
                    return;
                }
            }
            catch (Throwable t) {}
        }
    }
    
    private static boolean lIIllIllIlIlIIll(final int llllllllllllIllIIIlIlllIIIIlIIlI, final int llllllllllllIllIIIlIlllIIIIlIIIl) {
        return llllllllllllIllIIIlIlllIIIIlIIlI < llllllllllllIllIIIlIlllIIIIlIIIl;
    }
}
