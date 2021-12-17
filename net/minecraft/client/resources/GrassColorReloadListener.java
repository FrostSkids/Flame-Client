// 
// Decompiled by Procyon v0.5.36
// 

package net.minecraft.client.resources;

import java.io.IOException;
import net.minecraft.world.ColorizerGrass;
import net.minecraft.client.renderer.texture.TextureUtil;
import java.util.Base64;
import java.security.Key;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import net.minecraft.util.ResourceLocation;

public class GrassColorReloadListener implements IResourceManagerReloadListener
{
    private static final /* synthetic */ String[] lllIIIlIIIIIIl;
    private static final /* synthetic */ ResourceLocation LOC_GRASS_PNG;
    private static final /* synthetic */ int[] lllIIIlIIIllII;
    
    private static void lIIlllIlIIllIIII() {
        (lllIIIlIIIllII = new int[3])[0] = ((0x8A ^ 0x9B) & ~(0x2F ^ 0x3E));
        GrassColorReloadListener.lllIIIlIIIllII[1] = " ".length();
        GrassColorReloadListener.lllIIIlIIIllII[2] = "  ".length();
    }
    
    private static String lIIlllIlIIIIllll(final String llllllllllllIllIIIIIllIIllIlIlIl, final String llllllllllllIllIIIIIllIIllIlIllI) {
        try {
            final SecretKeySpec llllllllllllIllIIIIIllIIllIllIlI = new SecretKeySpec(MessageDigest.getInstance("MD5").digest(llllllllllllIllIIIIIllIIllIlIllI.getBytes(StandardCharsets.UTF_8)), "Blowfish");
            final Cipher llllllllllllIllIIIIIllIIllIllIIl = Cipher.getInstance("Blowfish");
            llllllllllllIllIIIIIllIIllIllIIl.init(GrassColorReloadListener.lllIIIlIIIllII[2], llllllllllllIllIIIIIllIIllIllIlI);
            return new String(llllllllllllIllIIIIIllIIllIllIIl.doFinal(Base64.getDecoder().decode(llllllllllllIllIIIIIllIIllIlIlIl.getBytes(StandardCharsets.UTF_8))), StandardCharsets.UTF_8);
        }
        catch (Exception llllllllllllIllIIIIIllIIllIllIII) {
            llllllllllllIllIIIIIllIIllIllIII.printStackTrace();
            return null;
        }
    }
    
    @Override
    public void onResourceManagerReload(final IResourceManager llllllllllllIllIIIIIllIIlllIIIII) {
        try {
            ColorizerGrass.setGrassBiomeColorizer(TextureUtil.readImageData(llllllllllllIllIIIIIllIIlllIIIII, GrassColorReloadListener.LOC_GRASS_PNG));
            "".length();
            if ("  ".length() > "   ".length()) {
                return;
            }
        }
        catch (IOException ex) {}
    }
    
    static {
        lIIlllIlIIllIIII();
        lIIlllIlIIIlllII();
        LOC_GRASS_PNG = new ResourceLocation(GrassColorReloadListener.lllIIIlIIIIIIl[GrassColorReloadListener.lllIIIlIIIllII[0]]);
    }
    
    private static void lIIlllIlIIIlllII() {
        (lllIIIlIIIIIIl = new String[GrassColorReloadListener.lllIIIlIIIllII[1]])[GrassColorReloadListener.lllIIIlIIIllII[0]] = lIIlllIlIIIIllll("Tfx6Qu1TIT8lh440C1z1TaGN+sNPyPiFYe+eiwicwM0=", "Xljqg");
    }
}
