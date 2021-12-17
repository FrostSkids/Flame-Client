// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.imageout;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.SlickException;
import javax.imageio.ImageIO;
import java.util.HashMap;

public class ImageWriterFactory
{
    private static final /* synthetic */ String[] llIllIlIIIIllI;
    private static /* synthetic */ HashMap writers;
    private static final /* synthetic */ int[] llIllIlIIIIlll;
    
    static {
        lIIlIllllIIIIllI();
        lIIlIllllIIIIlIl();
        ImageWriterFactory.writers = new HashMap();
        final String[] llllllllllllIllIIlllIIIlIlIIlIII = ImageIO.getWriterFormatNames();
        final ImageIOWriter llllllllllllIllIIlllIIIlIlIIIlll = new ImageIOWriter();
        int llllllllllllIllIIlllIIIlIlIIlIIl = ImageWriterFactory.llIllIlIIIIlll[0];
        while (lIIlIllllIIIlIII(llllllllllllIllIIlllIIIlIlIIlIIl, llllllllllllIllIIlllIIIlIlIIlIII.length)) {
            registerWriter(llllllllllllIllIIlllIIIlIlIIlIII[llllllllllllIllIIlllIIIlIlIIlIIl], llllllllllllIllIIlllIIIlIlIIIlll);
            ++llllllllllllIllIIlllIIIlIlIIlIIl;
            "".length();
            if (-" ".length() > "   ".length()) {
                return;
            }
        }
        final TGAWriter llllllllllllIllIIlllIIIlIlIIIllI = new TGAWriter();
        registerWriter(ImageWriterFactory.llIllIlIIIIllI[ImageWriterFactory.llIllIlIIIIlll[1]], llllllllllllIllIIlllIIIlIlIIIllI);
    }
    
    public static ImageWriter getWriterForFormat(final String llllllllllllIllIIlllIIIlIlIlIIII) throws SlickException {
        ImageWriter llllllllllllIllIIlllIIIlIlIIllll = ImageWriterFactory.writers.get(llllllllllllIllIIlllIIIlIlIlIIII);
        if (lIIlIllllIIIIlll(llllllllllllIllIIlllIIIlIlIIllll)) {
            return llllllllllllIllIIlllIIIlIlIIllll;
        }
        llllllllllllIllIIlllIIIlIlIIllll = ImageWriterFactory.writers.get(llllllllllllIllIIlllIIIlIlIlIIII.toLowerCase());
        if (lIIlIllllIIIIlll(llllllllllllIllIIlllIIIlIlIIllll)) {
            return llllllllllllIllIIlllIIIlIlIIllll;
        }
        llllllllllllIllIIlllIIIlIlIIllll = ImageWriterFactory.writers.get(llllllllllllIllIIlllIIIlIlIlIIII.toUpperCase());
        if (lIIlIllllIIIIlll(llllllllllllIllIIlllIIIlIlIIllll)) {
            return llllllllllllIllIIlllIIIlIlIIllll;
        }
        throw new SlickException(String.valueOf(new StringBuilder().append(ImageWriterFactory.llIllIlIIIIllI[ImageWriterFactory.llIllIlIIIIlll[0]]).append(llllllllllllIllIIlllIIIlIlIlIIII)));
    }
    
    public static void registerWriter(final String llllllllllllIllIIlllIIIlIlIlIlII, final ImageWriter llllllllllllIllIIlllIIIlIlIlIlIl) {
        ImageWriterFactory.writers.put(llllllllllllIllIIlllIIIlIlIlIlII, llllllllllllIllIIlllIIIlIlIlIlIl);
        "".length();
    }
    
    public static String[] getSupportedFormats() {
        return (String[])ImageWriterFactory.writers.keySet().toArray(new String[ImageWriterFactory.llIllIlIIIIlll[0]]);
    }
    
    private static void lIIlIllllIIIIllI() {
        (llIllIlIIIIlll = new int[4])[0] = ((0x61 ^ 0x26 ^ (0x65 ^ 0xB)) & (102 + 49 - 137 + 120 ^ 149 + 50 - 103 + 79 ^ -" ".length()));
        ImageWriterFactory.llIllIlIIIIlll[1] = " ".length();
        ImageWriterFactory.llIllIlIIIIlll[2] = "  ".length();
        ImageWriterFactory.llIllIlIIIIlll[3] = (0xCC ^ 0xC4);
    }
    
    private static void lIIlIllllIIIIlIl() {
        (llIllIlIIIIllI = new String[ImageWriterFactory.llIllIlIIIIlll[2]])[ImageWriterFactory.llIllIlIIIIlll[0]] = lIIlIllllIIIIlII("+fEaqkSghi5UBL32UQid0C/b+MU4ZOxjRDeRdd19Q0A=", "gxQbj");
        ImageWriterFactory.llIllIlIIIIllI[ImageWriterFactory.llIllIlIIIIlll[1]] = lIIlIllllIIIIlII("OMX6KU47uJ4=", "SUhup");
    }
    
    private static String lIIlIllllIIIIlII(final String llllllllllllIllIIlllIIIlIIlllIll, final String llllllllllllIllIIlllIIIlIIlllIlI) {
        try {
            final SecretKeySpec llllllllllllIllIIlllIIIlIIlllllI = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIlllIIIlIIlllIlI.getBytes(StandardCharsets.UTF_8)), ImageWriterFactory.llIllIlIIIIlll[3]), "DES");
            final Cipher llllllllllllIllIIlllIIIlIIllllIl = Cipher.getInstance("DES");
            llllllllllllIllIIlllIIIlIIllllIl.init(ImageWriterFactory.llIllIlIIIIlll[2], llllllllllllIllIIlllIIIlIIlllllI);
            return new String(llllllllllllIllIIlllIIIlIIllllIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIlllIIIlIIlllIll.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIlllIIIlIIllllII) {
            llllllllllllIllIIlllIIIlIIllllII.printStackTrace();
            return null;
        }
    }
    
    private static boolean lIIlIllllIIIlIII(final int llllllllllllIllIIlllIIIlIIllIIll, final int llllllllllllIllIIlllIIIlIIllIIlI) {
        return llllllllllllIllIIlllIIIlIIllIIll < llllllllllllIllIIlllIIIlIIllIIlI;
    }
    
    private static boolean lIIlIllllIIIIlll(final Object llllllllllllIllIIlllIIIlIIllIIII) {
        return llllllllllllIllIIlllIIIlIIllIIII != null;
    }
}
