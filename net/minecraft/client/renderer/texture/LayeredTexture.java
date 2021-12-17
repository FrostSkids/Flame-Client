// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.renderer.texture;

import java.util.Iterator;
import com.google.common.collect.Lists;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.io.InputStream;
import java.io.IOException;
import java.awt.image.ImageObserver;
import java.awt.Image;
import java.awt.image.BufferedImage;
import net.minecraft.util.ResourceLocation;
import net.minecraft.client.resources.IResourceManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import java.util.List;

public class LayeredTexture extends AbstractTexture
{
    public final /* synthetic */ List<String> layeredTextureNames;
    private static final /* synthetic */ int[] lIllllIlllIllI;
    private static final /* synthetic */ Logger logger;
    private static final /* synthetic */ String[] lIllllIlllIlIl;
    
    private static boolean lIIIIlIIlllIllIl(final Object llllllllllllIllllIlIIIIIIlIIlIll) {
        return llllllllllllIllllIlIIIIIIlIIlIll == null;
    }
    
    private static boolean lIIIIlIIlllIllII(final Object llllllllllllIllllIlIIIIIIlIIllIl) {
        return llllllllllllIllllIlIIIIIIlIIllIl != null;
    }
    
    static {
        lIIIIlIIlllIlIll();
        lIIIIlIIlllIlIlI();
        logger = LogManager.getLogger();
    }
    
    private static void lIIIIlIIlllIlIll() {
        (lIllllIlllIllI = new int[3])[0] = "  ".length();
        LayeredTexture.lIllllIlllIllI[1] = ((0xF6 ^ 0x9D ^ (0xFB ^ 0x9C)) & (0x66 ^ 0x38 ^ (0xDA ^ 0x88) ^ -" ".length()));
        LayeredTexture.lIllllIlllIllI[2] = " ".length();
    }
    
    @Override
    public void loadTexture(final IResourceManager llllllllllllIllllIlIIIIIIllIlIII) throws IOException {
        this.deleteGlTexture();
        BufferedImage llllllllllllIllllIlIIIIIIllIIlll = null;
        try {
            final long llllllllllllIllllIlIIIIIIlIllllI = (long)this.layeredTextureNames.iterator();
            "".length();
            if (((0xE4 ^ 0x89 ^ (0x77 ^ 0x79)) & (0xBE ^ 0x9F ^ (0xF1 ^ 0xB3) ^ -" ".length())) != 0x0) {
                return;
            }
            while (!lIIIIlIIlllIlllI(((Iterator)llllllllllllIllllIlIIIIIIlIllllI).hasNext() ? 1 : 0)) {
                final String llllllllllllIllllIlIIIIIIllIIllI = ((Iterator<String>)llllllllllllIllllIlIIIIIIlIllllI).next();
                if (lIIIIlIIlllIllII(llllllllllllIllllIlIIIIIIllIIllI)) {
                    final InputStream llllllllllllIllllIlIIIIIIllIIlIl = llllllllllllIllllIlIIIIIIllIlIII.getResource(new ResourceLocation(llllllllllllIllllIlIIIIIIllIIllI)).getInputStream();
                    final BufferedImage llllllllllllIllllIlIIIIIIllIIlII = TextureUtil.readBufferedImage(llllllllllllIllllIlIIIIIIllIIlIl);
                    if (lIIIIlIIlllIllIl(llllllllllllIllllIlIIIIIIllIIlll)) {
                        llllllllllllIllllIlIIIIIIllIIlll = new BufferedImage(llllllllllllIllllIlIIIIIIllIIlII.getWidth(), llllllllllllIllllIlIIIIIIllIIlII.getHeight(), LayeredTexture.lIllllIlllIllI[0]);
                    }
                    llllllllllllIllllIlIIIIIIllIIlll.getGraphics().drawImage(llllllllllllIllllIlIIIIIIllIIlII, LayeredTexture.lIllllIlllIllI[1], LayeredTexture.lIllllIlllIllI[1], null);
                    "".length();
                }
            }
            "".length();
            if ((0x6E ^ 0x0 ^ (0x3F ^ 0x55)) > (0x7E ^ 0x34 ^ (0x54 ^ 0x1A))) {
                return;
            }
        }
        catch (IOException llllllllllllIllllIlIIIIIIllIIIll) {
            LayeredTexture.logger.error(LayeredTexture.lIllllIlllIlIl[LayeredTexture.lIllllIlllIllI[1]], (Throwable)llllllllllllIllllIlIIIIIIllIIIll);
            return;
        }
        TextureUtil.uploadTextureImage(this.getGlTextureId(), llllllllllllIllllIlIIIIIIllIIlll);
        "".length();
    }
    
    private static void lIIIIlIIlllIlIlI() {
        (lIllllIlllIlIl = new String[LayeredTexture.lIllllIlllIllI[2]])[LayeredTexture.lIllllIlllIllI[1]] = lIIIIlIIlllIlIIl("KasqscbM2JBJhlmomtPPoDGrowns0Eog8OhA801prjU=", "ljXIp");
    }
    
    private static boolean lIIIIlIIlllIlllI(final int llllllllllllIllllIlIIIIIIlIIlIIl) {
        return llllllllllllIllllIlIIIIIIlIIlIIl == 0;
    }
    
    private static String lIIIIlIIlllIlIIl(final String llllllllllllIllllIlIIIIIIlIlIlII, final String llllllllllllIllllIlIIIIIIlIlIIll) {
        try {
            final SecretKeySpec llllllllllllIllllIlIIIIIIlIlIlll = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllllIlIIIIIIlIlIIll.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllllIlIIIIIIlIlIllI = Cipher.getInstance("Blowfish");
            llllllllllllIllllIlIIIIIIlIlIllI.init(LayeredTexture.lIllllIlllIllI[0], llllllllllllIllllIlIIIIIIlIlIlll);
            return new String(llllllllllllIllllIlIIIIIIlIlIllI.doFinal(Base64.getDecoder().decode(llllllllllllIllllIlIIIIIIlIlIlII.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllllIlIIIIIIlIlIlIl) {
            llllllllllllIllllIlIIIIIIlIlIlIl.printStackTrace();
            return null;
        }
    }
    
    public LayeredTexture(final String... llllllllllllIllllIlIIIIIIlllIIIl) {
        this.layeredTextureNames = (List<String>)Lists.newArrayList((Object[])llllllllllllIllllIlIIIIIIlllIIIl);
    }
}
