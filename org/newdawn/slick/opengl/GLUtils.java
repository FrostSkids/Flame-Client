// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.newdawn.slick.opengl.renderer.Renderer;

public final class GLUtils
{
    private static final /* synthetic */ String[] lIIIlIIIIIIlIl;
    private static final /* synthetic */ int[] lIIIlIIIIIIllI;
    
    private static void lIllllIllIIllII() {
        (lIIIlIIIIIIllI = new int[4])[0] = ((3 + 52 - 52 + 135 ^ 113 + 137 - 121 + 18) & (0x13 ^ 0x44 ^ (0x57 ^ 0x19) ^ -" ".length()));
        GLUtils.lIIIlIIIIIIllI[1] = " ".length();
        GLUtils.lIIIlIIIIIIllI[2] = (0x93 ^ 0x9B);
        GLUtils.lIIIlIIIIIIllI[3] = "  ".length();
    }
    
    public static void checkGLContext() {
        try {
            Renderer.get().glGetError();
            "".length();
            if (-" ".length() != -" ".length()) {
                return;
            }
        }
        catch (NullPointerException lllllllllllllIlIIIllIllIlIIllllI) {
            throw new RuntimeException(GLUtils.lIIIlIIIIIIlIl[GLUtils.lIIIlIIIIIIllI[0]]);
        }
    }
    
    private static String lIllllIllIIlIlI(final String lllllllllllllIlIIIllIllIlIIlIlIl, final String lllllllllllllIlIIIllIllIlIIlIIlI) {
        try {
            final SecretKeySpec lllllllllllllIlIIIllIllIlIIllIII = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIlIIIllIllIlIIlIIlI.getBytes(StandardCharsets.UTF_8)), GLUtils.lIIIlIIIIIIllI[2]), "DES");
            final Cipher lllllllllllllIlIIIllIllIlIIlIlll = Cipher.getInstance("DES");
            lllllllllllllIlIIIllIllIlIIlIlll.init(GLUtils.lIIIlIIIIIIllI[3], lllllllllllllIlIIIllIllIlIIllIII);
            return new String(lllllllllllllIlIIIllIllIlIIlIlll.doFinal(Base64.getDecoder().decode(lllllllllllllIlIIIllIllIlIIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIlIIIllIllIlIIlIllI) {
            lllllllllllllIlIIIllIllIlIIlIllI.printStackTrace();
            return null;
        }
    }
    
    private static void lIllllIllIIlIll() {
        (lIIIlIIIIIIlIl = new String[GLUtils.lIIIlIIIIIIllI[1]])[GLUtils.lIIIlIIIIIIllI[0]] = lIllllIllIIlIlI("agUn+I8TYXhmFvpEwg1ERm0r9IKLVDDtlfdSdm865tn+SCkdpoeTLS3oJxtMvhxFEM+aPGYOLTbAFOXjNE49c9qrK9P0j8fbryaTPA8Wdje4hryf2llei70vaelgNJAN+vHgM6ARySCrK7YoWnJy8pS97Pq0jzst62nkJVRb0L2NUR0AmW0iYGjpSl2S7P5HQDWKo0Bv8g4=", "FzeGq");
    }
    
    static {
        lIllllIllIIllII();
        lIllllIllIIlIll();
    }
}
