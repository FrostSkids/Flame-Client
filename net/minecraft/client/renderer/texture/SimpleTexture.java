// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.util.Arrays;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import org.apache.logging.log4j.LogManager;
import java.io.IOException;
import java.awt.image.BufferedImage;
import net.minecraft.client.resources.IResource;
import java.io.InputStream;
import net.minecraft.client.resources.data.TextureMetadataSection;
import net.minecraft.client.resources.IResourceManager;
import org.apache.logging.log4j.Logger;
import net.minecraft.util.ResourceLocation;

public class SimpleTexture extends AbstractTexture
{
    private static final /* synthetic */ int[] lIIlIIlllllIIl;
    private static final /* synthetic */ String[] lIIlIIlllllIII;
    protected final /* synthetic */ ResourceLocation textureLocation;
    private static final /* synthetic */ Logger logger;
    
    private static boolean llIIllllIIlIllI(final int lllllllllllllIIllIlIlIIIllIIlllI, final int lllllllllllllIIllIlIlIIIllIIllIl) {
        return lllllllllllllIIllIlIlIIIllIIlllI < lllllllllllllIIllIlIlIIIllIIllIl;
    }
    
    @Override
    public void loadTexture(final IResourceManager lllllllllllllIIllIlIlIIlIIIIIllI) throws IOException {
        this.deleteGlTexture();
        InputStream lllllllllllllIIllIlIlIIlIIIIIlIl = null;
        try {
            final IResource lllllllllllllIIllIlIlIIlIIIIIlII = lllllllllllllIIllIlIlIIlIIIIIllI.getResource(this.textureLocation);
            lllllllllllllIIllIlIlIIlIIIIIlIl = lllllllllllllIIllIlIlIIlIIIIIlII.getInputStream();
            final BufferedImage lllllllllllllIIllIlIlIIlIIIIIIll = TextureUtil.readBufferedImage(lllllllllllllIIllIlIlIIlIIIIIlIl);
            boolean lllllllllllllIIllIlIlIIlIIIIIIlI = SimpleTexture.lIIlIIlllllIIl[0] != 0;
            boolean lllllllllllllIIllIlIlIIlIIIIIIIl = SimpleTexture.lIIlIIlllllIIl[0] != 0;
            if (llIIllllIIlIlII(lllllllllllllIIllIlIlIIlIIIIIlII.hasMetadata() ? 1 : 0)) {
                try {
                    final TextureMetadataSection lllllllllllllIIllIlIlIIlIIIIIIII = lllllllllllllIIllIlIlIIlIIIIIlII.getMetadata(SimpleTexture.lIIlIIlllllIII[SimpleTexture.lIIlIIlllllIIl[0]]);
                    if (llIIllllIIlIlIl(lllllllllllllIIllIlIlIIlIIIIIIII)) {
                        lllllllllllllIIllIlIlIIlIIIIIIlI = lllllllllllllIIllIlIlIIlIIIIIIII.getTextureBlur();
                        lllllllllllllIIllIlIlIIlIIIIIIIl = lllllllllllllIIllIlIlIIlIIIIIIII.getTextureClamp();
                        "".length();
                        if (((0xA6 ^ 0x8E ^ (0x28 ^ 0x45)) & (0x7F ^ 0x28 ^ (0x7C ^ 0x6E) ^ -" ".length())) > 0) {
                            return;
                        }
                    }
                }
                catch (RuntimeException lllllllllllllIIllIlIlIIIllllllll) {
                    SimpleTexture.logger.warn(String.valueOf(new StringBuilder(SimpleTexture.lIIlIIlllllIII[SimpleTexture.lIIlIIlllllIIl[1]]).append(this.textureLocation)), (Throwable)lllllllllllllIIllIlIlIIIllllllll);
                }
            }
            TextureUtil.uploadTextureImageAllocate(this.getGlTextureId(), lllllllllllllIIllIlIlIIlIIIIIIll, lllllllllllllIIllIlIlIIlIIIIIIlI, lllllllllllllIIllIlIlIIlIIIIIIIl);
            "".length();
            "".length();
            if ((140 + 169 - 208 + 75 ^ 21 + 159 - 45 + 46) == 0x0) {
                return;
            }
        }
        finally {
            if (llIIllllIIlIlIl(lllllllllllllIIllIlIlIIlIIIIIlIl)) {
                lllllllllllllIIllIlIlIIlIIIIIlIl.close();
            }
        }
        if (llIIllllIIlIlIl(lllllllllllllIIllIlIlIIlIIIIIlIl)) {
            lllllllllllllIIllIlIlIIlIIIIIlIl.close();
        }
    }
    
    private static void llIIllllIIIllIl() {
        (lIIlIIlllllIII = new String[SimpleTexture.lIIlIIlllllIIl[2]])[SimpleTexture.lIIlIIlllllIIl[0]] = llIIlllIllllllI("Fx8tBgwRHw==", "czUry");
        SimpleTexture.lIIlIIlllllIII[SimpleTexture.lIIlIIlllllIIl[1]] = llIIllllIIIIIII("8ENKsYt1y/x2s+oWduQQhHabBi7VtwY12Zxa6O3gF9c=", "cVncL");
    }
    
    public SimpleTexture(final ResourceLocation lllllllllllllIIllIlIlIIlIIIlIIll) {
        this.textureLocation = lllllllllllllIIllIlIlIIlIIIlIIll;
    }
    
    private static void llIIllllIIlIIll() {
        (lIIlIIlllllIIl = new int[4])[0] = ((0xA0 ^ 0x99 ^ (0xB3 ^ 0xA3)) & (0x46 ^ 0x3E ^ (0xE5 ^ 0xB4) ^ -" ".length()));
        SimpleTexture.lIIlIIlllllIIl[1] = " ".length();
        SimpleTexture.lIIlIIlllllIIl[2] = "  ".length();
        SimpleTexture.lIIlIIlllllIIl[3] = (36 + 0 + 37 + 80 ^ 92 + 39 - 20 + 34);
    }
    
    static {
        llIIllllIIlIIll();
        llIIllllIIIllIl();
        logger = LogManager.getLogger();
    }
    
    private static String llIIllllIIIIIII(final String lllllllllllllIIllIlIlIIIllIlIllI, final String lllllllllllllIIllIlIlIIIllIlIIll) {
        try {
            final SecretKeySpec lllllllllllllIIllIlIlIIIllIllIIl = new SecretKeySpec(Arrays.copyOf(MessageDigest.getInstance("MD5").digest(lllllllllllllIIllIlIlIIIllIlIIll.getBytes(StandardCharsets.UTF_8)), SimpleTexture.lIIlIIlllllIIl[3]), "DES");
            final Cipher lllllllllllllIIllIlIlIIIllIllIII = Cipher.getInstance("DES");
            lllllllllllllIIllIlIlIIIllIllIII.init(SimpleTexture.lIIlIIlllllIIl[2], lllllllllllllIIllIlIlIIIllIllIIl);
            return new String(lllllllllllllIIllIlIlIIIllIllIII.doFinal(Base64.getDecoder().decode(lllllllllllllIIllIlIlIIIllIlIllI.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception lllllllllllllIIllIlIlIIIllIlIlll) {
            lllllllllllllIIllIlIlIIIllIlIlll.printStackTrace();
            return null;
        }
    }
    
    private static String llIIlllIllllllI(String lllllllllllllIIllIlIlIIIlllIlIll, final String lllllllllllllIIllIlIlIIIlllIIlIl) {
        lllllllllllllIIllIlIlIIIlllIlIll = new String(Base64.getDecoder().decode(lllllllllllllIIllIlIlIIIlllIlIll.getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8);
        final StringBuilder lllllllllllllIIllIlIlIIIlllIlIIl = new StringBuilder();
        final char[] lllllllllllllIIllIlIlIIIlllIlIII = lllllllllllllIIllIlIlIIIlllIIlIl.toCharArray();
        int lllllllllllllIIllIlIlIIIlllIIlll = SimpleTexture.lIIlIIlllllIIl[0];
        final short lllllllllllllIIllIlIlIIIlllIIIIl = (Object)lllllllllllllIIllIlIlIIIlllIlIll.toCharArray();
        final boolean lllllllllllllIIllIlIlIIIlllIIIII = lllllllllllllIIllIlIlIIIlllIIIIl.length != 0;
        Exception lllllllllllllIIllIlIlIIIllIlllll = (Exception)SimpleTexture.lIIlIIlllllIIl[0];
        while (llIIllllIIlIllI((int)lllllllllllllIIllIlIlIIIllIlllll, lllllllllllllIIllIlIlIIIlllIIIII ? 1 : 0)) {
            final char lllllllllllllIIllIlIlIIIlllIllII = lllllllllllllIIllIlIlIIIlllIIIIl[lllllllllllllIIllIlIlIIIllIlllll];
            lllllllllllllIIllIlIlIIIlllIlIIl.append((char)(lllllllllllllIIllIlIlIIIlllIllII ^ lllllllllllllIIllIlIlIIIlllIlIII[lllllllllllllIIllIlIlIIIlllIIlll % lllllllllllllIIllIlIlIIIlllIlIII.length]));
            "".length();
            ++lllllllllllllIIllIlIlIIIlllIIlll;
            ++lllllllllllllIIllIlIlIIIllIlllll;
            "".length();
            if (" ".length() == 0) {
                return null;
            }
        }
        return String.valueOf(lllllllllllllIIllIlIlIIIlllIlIIl);
    }
    
    private static boolean llIIllllIIlIlII(final int lllllllllllllIIllIlIlIIIllIIlIIl) {
        return lllllllllllllIIllIlIlIIIllIIlIIl != 0;
    }
    
    private static boolean llIIllllIIlIlIl(final Object lllllllllllllIIllIlIlIIIllIIlIll) {
        return lllllllllllllIIllIlIlIIIllIIlIll != null;
    }
}
