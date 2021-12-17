// 
// Decompiled by Procyon v0.5.36
// 

package org.newdawn.slick.opengl;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.IOException;
import java.io.InputStream;

public class TextureLoader
{
    private static final /* synthetic */ int[] lllIlIIIIIIIII;
    private static final /* synthetic */ String[] lllIIlllllllll;
    
    public static Texture getTexture(final String llllllllllllIlIlllIlIIIIIIllIllI, final InputStream llllllllllllIlIlllIlIIIIIIllIIlI, final int llllllllllllIlIlllIlIIIIIIllIIIl) throws IOException {
        return getTexture(llllllllllllIlIlllIlIIIIIIllIllI, llllllllllllIlIlllIlIIIIIIllIIlI, (boolean)(TextureLoader.lllIlIIIIIIIII[0] != 0), llllllllllllIlIlllIlIIIIIIllIIIl);
    }
    
    private static void lIlIIIIlIIllllII() {
        (lllIlIIIIIIIII = new int[4])[0] = ((0x35 ^ 0x54) & ~(0xF1 ^ 0x90));
        TextureLoader.lllIlIIIIIIIII[1] = (0xFFFFA63D & 0x7FC3);
        TextureLoader.lllIlIIIIIIIII[2] = " ".length();
        TextureLoader.lllIlIIIIIIIII[3] = "  ".length();
    }
    
    public static Texture getTexture(final String llllllllllllIlIlllIlIIIIIIlIllII, final InputStream llllllllllllIlIlllIlIIIIIIlIIlll, final boolean llllllllllllIlIlllIlIIIIIIlIlIlI, final int llllllllllllIlIlllIlIIIIIIlIlIIl) throws IOException {
        return InternalTextureLoader.get().getTexture(llllllllllllIlIlllIlIIIIIIlIIlll, String.valueOf(new StringBuilder().append(llllllllllllIlIlllIlIIIIIIlIIlll.toString()).append(TextureLoader.lllIIlllllllll[TextureLoader.lllIlIIIIIIIII[0]]).append(llllllllllllIlIlllIlIIIIIIlIllII)), llllllllllllIlIlllIlIIIIIIlIlIlI, llllllllllllIlIlllIlIIIIIIlIlIIl);
    }
    
    private static String lIlIIIIlIIlllIlI(final String llllllllllllIlIlllIlIIIIIIIlllIl, final String llllllllllllIlIlllIlIIIIIIIlllII) {
        try {
            final SecretKeySpec llllllllllllIlIlllIlIIIIIIlIIIII = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIlIlllIlIIIIIIIlllII.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIlIlllIlIIIIIIIlllll = Cipher.getInstance("Blowfish");
            llllllllllllIlIlllIlIIIIIIIlllll.init(TextureLoader.lllIlIIIIIIIII[3], llllllllllllIlIlllIlIIIIIIlIIIII);
            return new String(llllllllllllIlIlllIlIIIIIIIlllll.doFinal(Base64.getDecoder().decode(llllllllllllIlIlllIlIIIIIIIlllIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIlIlllIlIIIIIIIllllI) {
            llllllllllllIlIlllIlIIIIIIIllllI.printStackTrace();
            return null;
        }
    }
    
    public static Texture getTexture(final String llllllllllllIlIlllIlIIIIIlIIIllI, final InputStream llllllllllllIlIlllIlIIIIIlIIIIll) throws IOException {
        return getTexture(llllllllllllIlIlllIlIIIIIlIIIllI, llllllllllllIlIlllIlIIIIIlIIIIll, (boolean)(TextureLoader.lllIlIIIIIIIII[0] != 0), TextureLoader.lllIlIIIIIIIII[1]);
    }
    
    static {
        lIlIIIIlIIllllII();
        lIlIIIIlIIlllIll();
    }
    
    private static void lIlIIIIlIIlllIll() {
        (lllIIlllllllll = new String[TextureLoader.lllIlIIIIIIIII[2]])[TextureLoader.lllIlIIIIIIIII[0]] = lIlIIIIlIIlllIlI("FXqxo/+fai0=", "TsiYf");
    }
    
    public static Texture getTexture(final String llllllllllllIlIlllIlIIIIIIllllII, final InputStream llllllllllllIlIlllIlIIIIIIlllllI, final boolean llllllllllllIlIlllIlIIIIIIllllIl) throws IOException {
        return getTexture(llllllllllllIlIlllIlIIIIIIllllII, llllllllllllIlIlllIlIIIIIIlllllI, llllllllllllIlIlllIlIIIIIIllllIl, TextureLoader.lllIlIIIIIIIII[1]);
    }
}
